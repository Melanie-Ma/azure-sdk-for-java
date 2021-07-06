// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateClouds. */
public interface PrivateClouds {
    /**
     * Returns list of private clouds in particular region.
     *
     * @param regionId The region Id (westus, eastus).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private clouds.
     */
    PagedIterable<PrivateCloud> list(String regionId);

    /**
     * Returns list of private clouds in particular region.
     *
     * @param regionId The region Id (westus, eastus).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private clouds.
     */
    PagedIterable<PrivateCloud> list(String regionId, Context context);

    /**
     * Returns private cloud by its name.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private cloud model.
     */
    PrivateCloud get(String pcName, String regionId);

    /**
     * Returns private cloud by its name.
     *
     * @param pcName The private cloud name.
     * @param regionId The region Id (westus, eastus).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private cloud model.
     */
    Response<PrivateCloud> getWithResponse(String pcName, String regionId, Context context);
}
