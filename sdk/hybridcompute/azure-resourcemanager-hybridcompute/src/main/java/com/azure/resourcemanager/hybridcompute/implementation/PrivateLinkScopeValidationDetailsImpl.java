// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.resourcemanager.hybridcompute.fluent.models.PrivateLinkScopeValidationDetailsInner;
import com.azure.resourcemanager.hybridcompute.models.ConnectionDetail;
import com.azure.resourcemanager.hybridcompute.models.PrivateLinkScopeValidationDetails;
import com.azure.resourcemanager.hybridcompute.models.PublicNetworkAccessType;
import java.util.Collections;
import java.util.List;

public final class PrivateLinkScopeValidationDetailsImpl implements PrivateLinkScopeValidationDetails {
    private PrivateLinkScopeValidationDetailsInner innerObject;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    PrivateLinkScopeValidationDetailsImpl(
        PrivateLinkScopeValidationDetailsInner innerObject,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public PublicNetworkAccessType publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public List<ConnectionDetail> connectionDetails() {
        List<ConnectionDetail> inner = this.innerModel().connectionDetails();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkScopeValidationDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
