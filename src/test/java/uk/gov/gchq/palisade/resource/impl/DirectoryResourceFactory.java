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

package uk.gov.gchq.palisade.resource.impl;

import com.diffblue.cover.annotations.InterestingTestFactory;

/**
 * Factory class for creating DirectoryResource instances for Diffblue Cover testing.
 * This factory provides properly initialized DirectoryResource objects that avoid
 * NullPointerException when calling getParent() by ensuring the resource has a valid
 * URI with a scheme.
 */
public class DirectoryResourceFactory {

    /**
     * Creates a DirectoryResource with a valid file URI to avoid NPE when calling getParent().
     * The resource is initialized with a file:// URI pointing to a test directory path.
     *
     * @return a properly initialized DirectoryResource instance
     */
    @InterestingTestFactory
    public static DirectoryResource createDirectoryResource() {
        DirectoryResource resource = new DirectoryResource();
        // Initialize with a valid file URI that has a scheme to avoid NPE in getParent()
        // The id needs to be set with a proper URI scheme (file:// or hdfs://)
        // so that FileResourceBuilder.accepts() doesn't encounter null scheme
        resource.id("file:///test/directory/");
        return resource;
    }
}
