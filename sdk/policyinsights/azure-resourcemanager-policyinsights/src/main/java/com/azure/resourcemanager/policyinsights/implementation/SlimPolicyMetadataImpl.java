// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.implementation;

import com.azure.resourcemanager.policyinsights.fluent.models.SlimPolicyMetadataInner;
import com.azure.resourcemanager.policyinsights.models.SlimPolicyMetadata;

public final class SlimPolicyMetadataImpl implements SlimPolicyMetadata {
    private SlimPolicyMetadataInner innerObject;

    private final com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager;

    SlimPolicyMetadataImpl(
        SlimPolicyMetadataInner innerObject,
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String metadataId() {
        return this.innerModel().metadataId();
    }

    public String category() {
        return this.innerModel().category();
    }

    public String title() {
        return this.innerModel().title();
    }

    public String owner() {
        return this.innerModel().owner();
    }

    public String additionalContentUrl() {
        return this.innerModel().additionalContentUrl();
    }

    public Object metadata() {
        return this.innerModel().metadata();
    }

    public SlimPolicyMetadataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager() {
        return this.serviceManager;
    }
}
