/*
 * Copyright 2019 AraguaneyBits.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.araguaneybits.commons.http;

/**
 * The Enum ApiHttpMediaType.
 *
 * @author jestevez
 */
public enum ApiHttpMediaType {

    /** The application form urlencoded. */
    APPLICATION_FORM_URLENCODED("application/x-www-form-urlencoded"),

    /** The application json. */
    APPLICATION_JSON("application/json"),

    /** The application xml. */
    APPLICATION_XML("application/xml"),

    /** The wildcard. */
    WILDCARD("*/*");

    /** The media type. */
    private final String mediaType;

    /**
     * Instantiates a new api http media type.
     *
     * @param mediaType the media type
     */
    ApiHttpMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Gets the media type.
     *
     * @return the media type
     */
    public String getMediaType() {
        return mediaType;
    }

}
