package de.kp.works;

/*
 * Copyright (c) 2019 Dr. Krusche & Partner PartG. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @author Stefan Krusche, Dr. Krusche & Partner PartG
 * 
 */

import org.janusgraph.diskstorage.BackendException;

public class BackendRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 6184087040805925812L;

    BackendRuntimeException(final String str) {
        super(str);
    }
    public BackendRuntimeException(final BackendException e) {
        super(e);
    }

    public BackendException getBackendException() {
        final Throwable throwable = super.getCause();
        if (throwable instanceof BackendException) {
            return (BackendException) throwable;
        }
        return null;
    }

}
