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
 * The response of the GetSsoToken operation.
 */
public class ApiManagementServiceGetSsoTokenResultInner {
    /**
     * Redirect URL to the Publisher Portal containing the SSO token.
     */
    @JsonProperty(value = "redirectUri")
    private String redirectUri;

    /**
     * Get the redirectUri value.
     *
     * @return the redirectUri value
     */
    public String redirectUri() {
        return this.redirectUri;
    }

    /**
     * Set the redirectUri value.
     *
     * @param redirectUri the redirectUri value to set
     * @return the ApiManagementServiceGetSsoTokenResultInner object itself.
     */
    public ApiManagementServiceGetSsoTokenResultInner withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

}
