/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Single item in List or Get Consumer group operation.
 */
@JsonFlatten
public class ConsumerGroupInner extends NestedResourceInner {
    /**
     * Exact time the message was created.
     */
    @JsonProperty(value = "properties.createdAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdAt;

    /**
     * The exact time the message was updated.
     */
    @JsonProperty(value = "properties.updatedAt", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime updatedAt;

    /**
     * Usermetadata is a placeholder to store user-defined string data with
     * maximum length 1024. e.g. it can be used to store descriptive data, such
     * as list of teams and their contact information also user-defined
     * configuration settings can be stored.
     */
    @JsonProperty(value = "properties.userMetadata")
    private String userMetadata;

    /**
     * Get the createdAt value.
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt value.
     *
     * @return the updatedAt value
     */
    public DateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the userMetadata value.
     *
     * @return the userMetadata value
     */
    public String userMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata value.
     *
     * @param userMetadata the userMetadata value to set
     * @return the ConsumerGroupInner object itself.
     */
    public ConsumerGroupInner withUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

}
