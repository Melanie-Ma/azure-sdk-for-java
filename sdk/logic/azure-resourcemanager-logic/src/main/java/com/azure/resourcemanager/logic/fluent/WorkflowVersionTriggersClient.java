// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.WorkflowTriggerCallbackUrlInner;
import com.azure.resourcemanager.logic.models.GetCallbackUrlParameters;

/** An instance of this class provides access to all the operations defined in WorkflowVersionTriggersClient. */
public interface WorkflowVersionTriggersClient {
    /**
     * Get the callback url for a trigger of a workflow version.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param triggerName The workflow trigger name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the callback url for a trigger of a workflow version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    WorkflowTriggerCallbackUrlInner listCallbackUrl(
        String resourceGroupName, String workflowName, String versionId, String triggerName);

    /**
     * Get the callback url for a trigger of a workflow version.
     *
     * @param resourceGroupName The resource group name.
     * @param workflowName The workflow name.
     * @param versionId The workflow versionId.
     * @param triggerName The workflow trigger name.
     * @param parameters The callback URL parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the callback url for a trigger of a workflow version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<WorkflowTriggerCallbackUrlInner> listCallbackUrlWithResponse(
        String resourceGroupName,
        String workflowName,
        String versionId,
        String triggerName,
        GetCallbackUrlParameters parameters,
        Context context);
}
