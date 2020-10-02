// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The source control OAuth token. */
@JsonFlatten
@Fluent
public class SourceControlInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlInner.class);

    /*
     * OAuth access token.
     */
    @JsonProperty(value = "properties.token")
    private String token;

    /*
     * OAuth access token secret.
     */
    @JsonProperty(value = "properties.tokenSecret")
    private String tokenSecret;

    /*
     * OAuth refresh token.
     */
    @JsonProperty(value = "properties.refreshToken")
    private String refreshToken;

    /*
     * OAuth token expiration.
     */
    @JsonProperty(value = "properties.expirationTime")
    private OffsetDateTime expirationTime;

    /**
     * Get the token property: OAuth access token.
     *
     * @return the token value.
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token property: OAuth access token.
     *
     * @param token the token value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get the tokenSecret property: OAuth access token secret.
     *
     * @return the tokenSecret value.
     */
    public String tokenSecret() {
        return this.tokenSecret;
    }

    /**
     * Set the tokenSecret property: OAuth access token secret.
     *
     * @param tokenSecret the tokenSecret value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
        return this;
    }

    /**
     * Get the refreshToken property: OAuth refresh token.
     *
     * @return the refreshToken value.
     */
    public String refreshToken() {
        return this.refreshToken;
    }

    /**
     * Set the refreshToken property: OAuth refresh token.
     *
     * @param refreshToken the refreshToken value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get the expirationTime property: OAuth token expiration.
     *
     * @return the expirationTime value.
     */
    public OffsetDateTime expirationTime() {
        return this.expirationTime;
    }

    /**
     * Set the expirationTime property: OAuth token expiration.
     *
     * @param expirationTime the expirationTime value to set.
     * @return the SourceControlInner object itself.
     */
    public SourceControlInner withExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
