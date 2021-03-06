/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearning;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameter definition for a module asset.
 */
public class ModuleAssetParameter {
    /**
     * Parameter name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Parameter type.
     */
    @JsonProperty(value = "parameterType")
    private String parameterType;

    /**
     * Definitions for nested interface parameters if this is a complex module
     * parameter.
     */
    @JsonProperty(value = "modeValuesInfo")
    private Map<String, ModeValueInfo> modeValuesInfo;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ModuleAssetParameter object itself.
     */
    public ModuleAssetParameter withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parameterType value.
     *
     * @return the parameterType value
     */
    public String parameterType() {
        return this.parameterType;
    }

    /**
     * Set the parameterType value.
     *
     * @param parameterType the parameterType value to set
     * @return the ModuleAssetParameter object itself.
     */
    public ModuleAssetParameter withParameterType(String parameterType) {
        this.parameterType = parameterType;
        return this;
    }

    /**
     * Get the modeValuesInfo value.
     *
     * @return the modeValuesInfo value
     */
    public Map<String, ModeValueInfo> modeValuesInfo() {
        return this.modeValuesInfo;
    }

    /**
     * Set the modeValuesInfo value.
     *
     * @param modeValuesInfo the modeValuesInfo value to set
     * @return the ModuleAssetParameter object itself.
     */
    public ModuleAssetParameter withModeValuesInfo(Map<String, ModeValueInfo> modeValuesInfo) {
        this.modeValuesInfo = modeValuesInfo;
        return this;
    }

}
