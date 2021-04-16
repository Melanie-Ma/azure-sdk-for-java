// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.models.AaddsResourceDetails;
import com.azure.resourcemanager.hdinsight.models.ValidationErrorInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** The response of cluster create request validation. */
@Fluent
public final class ClusterCreateValidationResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ClusterCreateValidationResultInner.class);

    /*
     * The validation errors.
     */
    @JsonProperty(value = "validationErrors")
    private List<ValidationErrorInfo> validationErrors;

    /*
     * The validation warnings.
     */
    @JsonProperty(value = "validationWarnings")
    private List<ValidationErrorInfo> validationWarnings;

    /*
     * The estimated creation duration.
     */
    @JsonProperty(value = "estimatedCreationDuration")
    private Duration estimatedCreationDuration;

    /*
     * The Azure active directory domain service resource details.
     */
    @JsonProperty(value = "aaddsResourcesDetails")
    private List<AaddsResourceDetails> aaddsResourcesDetails;

    /**
     * Get the validationErrors property: The validation errors.
     *
     * @return the validationErrors value.
     */
    public List<ValidationErrorInfo> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Set the validationErrors property: The validation errors.
     *
     * @param validationErrors the validationErrors value to set.
     * @return the ClusterCreateValidationResultInner object itself.
     */
    public ClusterCreateValidationResultInner withValidationErrors(List<ValidationErrorInfo> validationErrors) {
        this.validationErrors = validationErrors;
        return this;
    }

    /**
     * Get the validationWarnings property: The validation warnings.
     *
     * @return the validationWarnings value.
     */
    public List<ValidationErrorInfo> validationWarnings() {
        return this.validationWarnings;
    }

    /**
     * Set the validationWarnings property: The validation warnings.
     *
     * @param validationWarnings the validationWarnings value to set.
     * @return the ClusterCreateValidationResultInner object itself.
     */
    public ClusterCreateValidationResultInner withValidationWarnings(List<ValidationErrorInfo> validationWarnings) {
        this.validationWarnings = validationWarnings;
        return this;
    }

    /**
     * Get the estimatedCreationDuration property: The estimated creation duration.
     *
     * @return the estimatedCreationDuration value.
     */
    public Duration estimatedCreationDuration() {
        return this.estimatedCreationDuration;
    }

    /**
     * Set the estimatedCreationDuration property: The estimated creation duration.
     *
     * @param estimatedCreationDuration the estimatedCreationDuration value to set.
     * @return the ClusterCreateValidationResultInner object itself.
     */
    public ClusterCreateValidationResultInner withEstimatedCreationDuration(Duration estimatedCreationDuration) {
        this.estimatedCreationDuration = estimatedCreationDuration;
        return this;
    }

    /**
     * Get the aaddsResourcesDetails property: The Azure active directory domain service resource details.
     *
     * @return the aaddsResourcesDetails value.
     */
    public List<AaddsResourceDetails> aaddsResourcesDetails() {
        return this.aaddsResourcesDetails;
    }

    /**
     * Set the aaddsResourcesDetails property: The Azure active directory domain service resource details.
     *
     * @param aaddsResourcesDetails the aaddsResourcesDetails value to set.
     * @return the ClusterCreateValidationResultInner object itself.
     */
    public ClusterCreateValidationResultInner withAaddsResourcesDetails(
        List<AaddsResourceDetails> aaddsResourcesDetails) {
        this.aaddsResourcesDetails = aaddsResourcesDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
        if (validationWarnings() != null) {
            validationWarnings().forEach(e -> e.validate());
        }
        if (aaddsResourcesDetails() != null) {
            aaddsResourcesDetails().forEach(e -> e.validate());
        }
    }
}
