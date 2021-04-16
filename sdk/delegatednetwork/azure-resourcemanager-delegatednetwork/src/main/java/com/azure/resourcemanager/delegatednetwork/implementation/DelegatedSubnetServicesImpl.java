// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.delegatednetwork.fluent.DelegatedSubnetServicesClient;
import com.azure.resourcemanager.delegatednetwork.fluent.models.DelegatedSubnetInner;
import com.azure.resourcemanager.delegatednetwork.models.DelegatedSubnet;
import com.azure.resourcemanager.delegatednetwork.models.DelegatedSubnetServices;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DelegatedSubnetServicesImpl implements DelegatedSubnetServices {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DelegatedSubnetServicesImpl.class);

    private final DelegatedSubnetServicesClient innerClient;

    private final com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager;

    public DelegatedSubnetServicesImpl(
        DelegatedSubnetServicesClient innerClient,
        com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DelegatedSubnet getByResourceGroup(String resourceGroupName, String resourceName) {
        DelegatedSubnetInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, resourceName);
        if (inner != null) {
            return new DelegatedSubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DelegatedSubnet> getByResourceGroupWithResponse(
        String resourceGroupName, String resourceName, Context context) {
        Response<DelegatedSubnetInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DelegatedSubnetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourceName, Boolean forceDelete) {
        this.serviceClient().delete(resourceGroupName, resourceName, forceDelete);
    }

    public void delete(String resourceGroupName, String resourceName) {
        this.serviceClient().delete(resourceGroupName, resourceName);
    }

    public void delete(String resourceGroupName, String resourceName, Boolean forceDelete, Context context) {
        this.serviceClient().delete(resourceGroupName, resourceName, forceDelete, context);
    }

    public PagedIterable<DelegatedSubnet> list() {
        PagedIterable<DelegatedSubnetInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DelegatedSubnetImpl(inner1, this.manager()));
    }

    public PagedIterable<DelegatedSubnet> list(Context context) {
        PagedIterable<DelegatedSubnetInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DelegatedSubnetImpl(inner1, this.manager()));
    }

    public PagedIterable<DelegatedSubnet> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DelegatedSubnetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DelegatedSubnetImpl(inner1, this.manager()));
    }

    public PagedIterable<DelegatedSubnet> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DelegatedSubnetInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DelegatedSubnetImpl(inner1, this.manager()));
    }

    public DelegatedSubnet getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "delegatedSubnets");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'delegatedSubnets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, Context.NONE).getValue();
    }

    public Response<DelegatedSubnet> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "delegatedSubnets");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'delegatedSubnets'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, resourceName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "delegatedSubnets");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'delegatedSubnets'.", id)));
        }
        Boolean localForceDelete = null;
        this.delete(resourceGroupName, resourceName, localForceDelete, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean forceDelete, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "delegatedSubnets");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'delegatedSubnets'.", id)));
        }
        this.delete(resourceGroupName, resourceName, forceDelete, context);
    }

    private DelegatedSubnetServicesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.delegatednetwork.DelegatedNetworkManager manager() {
        return this.serviceManager;
    }

    public DelegatedSubnetImpl define(String name) {
        return new DelegatedSubnetImpl(name, this.manager());
    }
}
