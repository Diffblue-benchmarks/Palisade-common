/*
 * Copyright 2018-2021 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.gchq.palisade.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.gov.gchq.palisade.resource.Resource;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

/**
 * The AbstractResourceBuilder is an abstract factory for building {@link Resource}s. Given a URI,
 * it will identify the appropriate implementation and use it to produce a {@link Resource}.
 * This is done using Java's {@link ServiceLoader} mechanism.
 */
public abstract class AbstractResourceBuilder {
    private static final ServiceLoader<AbstractResourceBuilder> LOADER = ServiceLoader.load(AbstractResourceBuilder.class);
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractResourceBuilder.class);
    private static final String URI_PATH_SEPARATOR = "/";

    /**
     * Clears this loader's provider cache so that all providers will be reloaded.
     */
    public static void refreshProviders() {
        LOADER.reload();
    }

    /**
     * Public accessor for the ServiceLoader instance.
     * This method is primarily intended for testing purposes to verify provider state.
     * Note: Named 'loader()' instead of 'getLoader()' to avoid confusion with builder pattern.
     * Made public to allow Diffblue Cover to create assertions after refreshProviders() is called.
     *
     * @return the ServiceLoader instance used for loading AbstractResourceBuilder providers
     */
    public static ServiceLoader<AbstractResourceBuilder> loader() {
        return LOADER;
    }

    /**
     * Taking a resourceUri, create a {@link Resource} using the appropriate implementation of the {@link AbstractResourceBuilder} provided in the LOADER,
     * or throw an exception if the resource scheme is not supported, or no builder exists to build that scheme
     *
     * @param resourceUri the Uri of the resource you want to build.
     * @return a newly created resource
     */
    public static Resource create(final URI resourceUri) {
        AbstractResourceBuilder resourceBuilder = findBuilder(resourceUri);
        return resourceBuilder.buildNormal(resourceUri);
    }

    /**
     * Finds an appropriate builder for the given URI.
     * This method is extracted to improve testability by allowing test code
     * to control the builder selection if needed.
     *
     * @param resourceUri the URI to find a builder for
     * @return an AbstractResourceBuilder that accepts the URI
     * @throws IllegalArgumentException if no builder is found
     */
    protected static AbstractResourceBuilder findBuilder(final URI resourceUri) {
        return LOADER.stream()
                .map(Provider::get)
                .filter(builder -> builder.accepts(resourceUri))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("No ResourceBuilder found that accepts " + resourceUri));
    }

    /**
     * Create a {@link Resource} from a uri string
     * Throw IllegalArgumentException if invalid uri string or unsupported scheme
     *
     * @param uriString a string value of a url used to create a new resource
     * @return a newly created resource using these parameters.
     */
    public static Resource create(final String uriString) {
        try {
            return create(new URI(uriString));
        } catch (URISyntaxException ex) {
            throw new IllegalArgumentException("URISyntaxException converting string '" + uriString + "' to uri", ex);
        }
    }

    /**
     * Build a {@link Resource}, using the uri provided by calling {@link UriBuilder}
     *
     * @param uri the uri of the resource you want built
     * @return a newly created resource with the id of the uri.
     */
    @SuppressWarnings("java:S1075") //Suppress hardcoded path separator code smell
    public Resource buildNormal(final URI uri) {
        URI absoluteResourceId;

        if (!uri.getSchemeSpecificPart().startsWith(URI_PATH_SEPARATOR)) {
            var localResource = createFile(uri.getSchemeSpecificPart());
            String path;
            try {
                path = getCanonicalPath(localResource);
            } catch (IOException e) {
                LOGGER.warn("Unable to get the Canonical path value", e);
                path = getAbsolutePath(localResource);
            }

            if (!path.startsWith(URI_PATH_SEPARATOR)) {
                path = URI_PATH_SEPARATOR + path;
            }

            // Check if the resource is a directory and the path does not end with a "/"
            if (isDirectory(localResource) && !path.endsWith(URI_PATH_SEPARATOR)) {
                path += URI_PATH_SEPARATOR;
            }
            absoluteResourceId = UriBuilder.create(uri)
                    .withoutScheme()
                    .withoutAuthority()
                    .withPath(path)
                    .withoutQuery()
                    .withoutFragment();
        } else {
            absoluteResourceId = UriBuilder.create(uri)
                    .withoutScheme()
                    .withoutAuthority()
                    .withoutPath()
                    .withoutQuery()
                    .withoutFragment();
        }

        try {
            return build(absoluteResourceId);
        } catch (RuntimeException e) {
            LOGGER.error("Unable to build a normal URI", e);
            return build(uri);
        }
    }

    /**
     * Creates a File object from the given path.
     * This method is extracted to improve testability by allowing test code
     * to override the file system interaction if needed.
     *
     * @param path the file path
     * @return a File object
     */
    protected File createFile(final String path) {
        return new File(path);
    }

    /**
     * Gets the canonical path of a file.
     * This method is extracted to improve testability by allowing test code
     * to control the path resolution if needed.
     *
     * @param file the file to get the canonical path from
     * @return the canonical path
     * @throws IOException if an I/O error occurs
     */
    protected String getCanonicalPath(final File file) throws IOException {
        return file.getCanonicalPath();
    }

    /**
     * Gets the absolute path of a file.
     * This method is extracted to improve testability by allowing test code
     * to control the path resolution if needed.
     *
     * @param file the file to get the absolute path from
     * @return the absolute path
     */
    protected String getAbsolutePath(final File file) {
        return file.getAbsolutePath();
    }

    /**
     * Checks if a file is a directory.
     * This method is extracted to improve testability by allowing test code
     * to control the directory check if needed.
     *
     * @param file the file to check
     * @return true if the file is a directory, false otherwise
     */
    protected boolean isDirectory(final File file) {
        return file.isDirectory();
    }

    /**
     * An abstract method used in building a {@link Resource}
     *
     * @param resourceUri the uri of the resource you want built
     * @return a newly created Resource with the id of the the resourceUri.
     */
    protected abstract Resource build(URI resourceUri);

    /**
     * A abstract method used in building a {@link Resource}, to check if the Builders provided can accept the resourceUri scheme
     *
     * @param resourceUri the uri of the resource you want built
     * @return a true/false value if a builder exists that supports the uri scheme.
     */
    public abstract boolean accepts(URI resourceUri);
}
