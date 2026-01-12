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
 * Factory class for creating FileResource instances for testing.
 * This factory provides properly initialized FileResource objects
 * that can be used by Diffblue Cover for test generation.
 */
public class FileResourceFactory {

    /**
     * Creates a FileResource with a valid file URI.
     * The resource is initialized with a file:// scheme URI pointing to a test file,
     * which prevents NullPointerException when calling getParent().
     *
     * @return a properly initialized FileResource instance
     */
    @InterestingTestFactory
    public static FileResource createFileResource() {
        return new FileResource()
                .id("file:///test/directory/file.txt");
    }
}
