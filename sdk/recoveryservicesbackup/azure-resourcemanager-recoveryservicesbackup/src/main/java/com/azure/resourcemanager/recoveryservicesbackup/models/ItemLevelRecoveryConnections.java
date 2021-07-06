// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ItemLevelRecoveryConnections. */
public interface ItemLevelRecoveryConnections {
    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
     * explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status
     * of provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
     *     for this backed up data.
     * @param parameters resource ILR request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void provision(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters);

    /**
     * Provisions a script which invokes an iSCSI connection to the backup data. Executing this script opens a file
     * explorer displaying all the recoverable files and folders. This is an asynchronous operation. To know the status
     * of provisioning, call GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be provisioned
     *     for this backed up data.
     * @param parameters resource ILR request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> provisionWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        IlrRequestResource parameters,
        Context context);

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
     * displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
     *     this backed up data.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void revoke(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId);

    /**
     * Revokes an iSCSI connection which can be used to download a script. Executing this script opens a file explorer
     * displaying all recoverable files and folders. This is an asynchronous operation.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item name whose files/folders are to be restored.
     * @param recoveryPointId Recovery point ID which represents backed up data. iSCSI connection will be revoked for
     *     this backed up data.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> revokeWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String recoveryPointId,
        Context context);
}
