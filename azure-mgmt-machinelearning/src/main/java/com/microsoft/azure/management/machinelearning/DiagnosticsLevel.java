/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearning;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DiagnosticsLevel.
 */
public final class DiagnosticsLevel {
    /** Static value None for DiagnosticsLevel. */
    public static final DiagnosticsLevel NONE = new DiagnosticsLevel("None");

    /** Static value Error for DiagnosticsLevel. */
    public static final DiagnosticsLevel ERROR = new DiagnosticsLevel("Error");

    /** Static value All for DiagnosticsLevel. */
    public static final DiagnosticsLevel ALL = new DiagnosticsLevel("All");

    private String value;

    /**
     * Creates a custom value for DiagnosticsLevel.
     * @param value the custom value
     */
    public DiagnosticsLevel(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DiagnosticsLevel)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        DiagnosticsLevel rhs = (DiagnosticsLevel) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
