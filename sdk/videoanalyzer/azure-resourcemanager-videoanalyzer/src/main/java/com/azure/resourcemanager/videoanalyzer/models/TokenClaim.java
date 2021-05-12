// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for expected token claims. */
@Fluent
public final class TokenClaim {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TokenClaim.class);

    /*
     * Name of the claim which must be present on the token.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Expected value of the claim to be present on the token.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the name property: Name of the claim which must be present on the token.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the claim which must be present on the token.
     *
     * @param name the name value to set.
     * @return the TokenClaim object itself.
     */
    public TokenClaim withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Expected value of the claim to be present on the token.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Expected value of the claim to be present on the token.
     *
     * @param value the value value to set.
     * @return the TokenClaim object itself.
     */
    public TokenClaim withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model TokenClaim"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model TokenClaim"));
        }
    }
}
