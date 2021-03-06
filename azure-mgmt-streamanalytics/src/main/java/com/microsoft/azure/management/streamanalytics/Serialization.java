/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes how data from an input is serialized or how data is serialized
 * when written to an output.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Serialization")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Csv", value = CsvSerialization.class),
    @JsonSubTypes.Type(name = "Json", value = JsonSerialization.class),
    @JsonSubTypes.Type(name = "Avro", value = AvroSerialization.class)
})
public class Serialization {
}
