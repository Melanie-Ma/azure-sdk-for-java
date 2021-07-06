// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storageimportexport.fluent.models.DriveBitLockerKeyInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** GetBitLockerKeys response. */
@Fluent
public final class GetBitLockerKeysResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GetBitLockerKeysResponse.class);

    /*
     * drive status
     */
    @JsonProperty(value = "value")
    private List<DriveBitLockerKeyInner> value;

    /**
     * Get the value property: drive status.
     *
     * @return the value value.
     */
    public List<DriveBitLockerKeyInner> value() {
        return this.value;
    }

    /**
     * Set the value property: drive status.
     *
     * @param value the value value to set.
     * @return the GetBitLockerKeysResponse object itself.
     */
    public GetBitLockerKeysResponse withValue(List<DriveBitLockerKeyInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
