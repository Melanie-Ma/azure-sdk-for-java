// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ServiceTierAdvisorInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServiceTierAdvisorsClient. */
public interface ServiceTierAdvisorsClient {
    /**
     * Gets a service tier advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @param serviceTierAdvisorName The name of service tier advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a service tier advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ServiceTierAdvisorInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName, String serviceTierAdvisorName);

    /**
     * Gets a service tier advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @param serviceTierAdvisorName The name of service tier advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a service tier advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ServiceTierAdvisorInner> getAsync(
        String resourceGroupName, String serverName, String databaseName, String serviceTierAdvisorName);

    /**
     * Gets a service tier advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @param serviceTierAdvisorName The name of service tier advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a service tier advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ServiceTierAdvisorInner get(
        String resourceGroupName, String serverName, String databaseName, String serviceTierAdvisorName);

    /**
     * Gets a service tier advisor.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @param serviceTierAdvisorName The name of service tier advisor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a service tier advisor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ServiceTierAdvisorInner> getWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String serviceTierAdvisorName,
        Context context);

    /**
     * Returns service tier advisors for specified database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list service tier advisor request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ServiceTierAdvisorInner> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Returns service tier advisors for specified database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list service tier advisor request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceTierAdvisorInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Returns service tier advisors for specified database.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents the response to a list service tier advisor request.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ServiceTierAdvisorInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
