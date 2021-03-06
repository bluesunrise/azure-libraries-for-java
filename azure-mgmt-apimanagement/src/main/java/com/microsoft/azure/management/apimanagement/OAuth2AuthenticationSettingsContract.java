/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * API OAuth2 Authentication settings details.
 */
public class OAuth2AuthenticationSettingsContract {
    /**
     * OAuth authorization server identifier.
     */
    @JsonProperty(value = "authorizationServerId")
    private String authorizationServerId;

    /**
     * operations scope.
     */
    @JsonProperty(value = "scope")
    private String scope;

    /**
     * Get the authorizationServerId value.
     *
     * @return the authorizationServerId value
     */
    public String authorizationServerId() {
        return this.authorizationServerId;
    }

    /**
     * Set the authorizationServerId value.
     *
     * @param authorizationServerId the authorizationServerId value to set
     * @return the OAuth2AuthenticationSettingsContract object itself.
     */
    public OAuth2AuthenticationSettingsContract withAuthorizationServerId(String authorizationServerId) {
        this.authorizationServerId = authorizationServerId;
        return this;
    }

    /**
     * Get the scope value.
     *
     * @return the scope value
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope value.
     *
     * @param scope the scope value to set
     * @return the OAuth2AuthenticationSettingsContract object itself.
     */
    public OAuth2AuthenticationSettingsContract withScope(String scope) {
        this.scope = scope;
        return this;
    }

}
