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

package uk.gov.gchq.palisade.resource;

import com.diffblue.cover.annotations.InterestingTestFactory;
import uk.gov.gchq.palisade.resource.impl.FileResource;
import uk.gov.gchq.palisade.resource.impl.SimpleConnectionDetail;

import java.util.HashMap;

/**
 * Factory for creating AbstractLeafResource instances for Diffblue Cover testing.
 * This factory creates properly initialized leaf resource objects that avoid
 * StackOverflowError by ensuring all required fields are set with valid values.
 */
public class AbstractLeafResourceFactory {

    /**
     * Creates a properly initialized AbstractLeafResource instance for testing.
     * Uses FileResource as a concrete implementation with all required fields set
     * to ensure methods like getSuperToString() can execute without StackOverflowError.
     *
     * @return a fully initialized AbstractLeafResource instance
     */
    @InterestingTestFactory
    public static AbstractLeafResource createAbstractLeafResource() {
        FileResource resource = new FileResource();

        // Set the ID with a valid file URI
        resource.id("file:///test/path/testfile.txt");

        // Set the type (required field)
        resource.setType("text/plain");

        // Set the serialised format (required field)
        resource.setSerialisedFormat("avro");

        // Set the connection detail (required field)
        SimpleConnectionDetail connectionDetail = new SimpleConnectionDetail();
        connectionDetail.setServiceName("test-service");
        resource.setConnectionDetail(connectionDetail);

        // Set attributes (optional, but initialize to avoid null issues)
        resource.setAttributes(new HashMap<>());

        return resource;
    }
}
