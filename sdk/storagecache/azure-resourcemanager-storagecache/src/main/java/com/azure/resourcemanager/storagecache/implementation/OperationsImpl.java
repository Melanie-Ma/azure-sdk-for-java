// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.fluent.OperationsClient;
import com.azure.resourcemanager.storagecache.fluent.models.ApiOperationInner;
import com.azure.resourcemanager.storagecache.models.ApiOperation;
import com.azure.resourcemanager.storagecache.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient, com.azure.resourcemanager.storagecache.StorageCacheManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApiOperation> list() {
        PagedIterable<ApiOperationInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ApiOperationImpl(inner1, this.manager()));
    }

    public PagedIterable<ApiOperation> list(Context context) {
        PagedIterable<ApiOperationInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ApiOperationImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storagecache.StorageCacheManager manager() {
        return this.serviceManager;
    }
}
