// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.fluent.RelationshipsClient;
import com.azure.resourcemanager.customerinsights.fluent.models.RelationshipResourceFormatInner;
import com.azure.resourcemanager.customerinsights.models.RelationshipResourceFormat;
import com.azure.resourcemanager.customerinsights.models.Relationships;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RelationshipsImpl implements Relationships {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RelationshipsImpl.class);

    private final RelationshipsClient innerClient;

    private final com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager;

    public RelationshipsImpl(
        RelationshipsClient innerClient,
        com.azure.resourcemanager.customerinsights.CustomerInsightsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public RelationshipResourceFormat get(String resourceGroupName, String hubName, String relationshipName) {
        RelationshipResourceFormatInner inner = this.serviceClient().get(resourceGroupName, hubName, relationshipName);
        if (inner != null) {
            return new RelationshipResourceFormatImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RelationshipResourceFormat> getWithResponse(
        String resourceGroupName, String hubName, String relationshipName, Context context) {
        Response<RelationshipResourceFormatInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, hubName, relationshipName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RelationshipResourceFormatImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String hubName, String relationshipName) {
        this.serviceClient().delete(resourceGroupName, hubName, relationshipName);
    }

    public void delete(String resourceGroupName, String hubName, String relationshipName, Context context) {
        this.serviceClient().delete(resourceGroupName, hubName, relationshipName, context);
    }

    public PagedIterable<RelationshipResourceFormat> listByHub(String resourceGroupName, String hubName) {
        PagedIterable<RelationshipResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName);
        return Utils.mapPage(inner, inner1 -> new RelationshipResourceFormatImpl(inner1, this.manager()));
    }

    public PagedIterable<RelationshipResourceFormat> listByHub(
        String resourceGroupName, String hubName, Context context) {
        PagedIterable<RelationshipResourceFormatInner> inner =
            this.serviceClient().listByHub(resourceGroupName, hubName, context);
        return Utils.mapPage(inner, inner1 -> new RelationshipResourceFormatImpl(inner1, this.manager()));
    }

    public RelationshipResourceFormat getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipName = Utils.getValueFromIdByName(id, "relationships");
        if (relationshipName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relationships'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, relationshipName, Context.NONE).getValue();
    }

    public Response<RelationshipResourceFormat> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipName = Utils.getValueFromIdByName(id, "relationships");
        if (relationshipName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relationships'.", id)));
        }
        return this.getWithResponse(resourceGroupName, hubName, relationshipName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipName = Utils.getValueFromIdByName(id, "relationships");
        if (relationshipName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relationships'.", id)));
        }
        this.delete(resourceGroupName, hubName, relationshipName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String hubName = Utils.getValueFromIdByName(id, "hubs");
        if (hubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'hubs'.", id)));
        }
        String relationshipName = Utils.getValueFromIdByName(id, "relationships");
        if (relationshipName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'relationships'.", id)));
        }
        this.delete(resourceGroupName, hubName, relationshipName, context);
    }

    private RelationshipsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.customerinsights.CustomerInsightsManager manager() {
        return this.serviceManager;
    }

    public RelationshipResourceFormatImpl define(String name) {
        return new RelationshipResourceFormatImpl(name, this.manager());
    }
}
