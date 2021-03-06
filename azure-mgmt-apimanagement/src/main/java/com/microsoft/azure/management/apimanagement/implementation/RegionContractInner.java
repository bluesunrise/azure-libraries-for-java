/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Region profile.
 */
public class RegionContractInner {
    /**
     * Region name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * whether Region is the master region.
     */
    @JsonProperty(value = "isMasterRegion")
    private Boolean isMasterRegion;

    /**
     * whether Region is deleted.
     */
    @JsonProperty(value = "isDeleted")
    private Boolean isDeleted;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the isMasterRegion value.
     *
     * @return the isMasterRegion value
     */
    public Boolean isMasterRegion() {
        return this.isMasterRegion;
    }

    /**
     * Set the isMasterRegion value.
     *
     * @param isMasterRegion the isMasterRegion value to set
     * @return the RegionContractInner object itself.
     */
    public RegionContractInner withIsMasterRegion(Boolean isMasterRegion) {
        this.isMasterRegion = isMasterRegion;
        return this;
    }

    /**
     * Get the isDeleted value.
     *
     * @return the isDeleted value
     */
    public Boolean isDeleted() {
        return this.isDeleted;
    }

    /**
     * Set the isDeleted value.
     *
     * @param isDeleted the isDeleted value to set
     * @return the RegionContractInner object itself.
     */
    public RegionContractInner withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

}
