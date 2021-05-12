// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.security.keyvault.administration.implementation.models.FullBackupOperation;
import com.azure.security.keyvault.administration.implementation.models.FullBackupResponse;
import com.azure.security.keyvault.administration.implementation.models.FullRestoreOperationResponse;
import com.azure.security.keyvault.administration.implementation.models.KeyVaultErrorException;
import com.azure.security.keyvault.administration.implementation.models.RestoreOperation;
import com.azure.security.keyvault.administration.implementation.models.RestoreOperationParameters;
import com.azure.security.keyvault.administration.implementation.models.SASTokenParameter;
import com.azure.security.keyvault.administration.implementation.models.SelectiveKeyRestoreOperationParameters;
import com.azure.security.keyvault.administration.implementation.models.SelectiveKeyRestoreOperationResponse;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the KeyVaultBackupClient type. */
public final class KeyVaultBackupClientImpl {
    /** The proxy service used to perform REST calls. */
    private final KeyVaultBackupClientService service;

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of KeyVaultBackupClient client.
     *
     * @param apiVersion Api Version.
     */
    KeyVaultBackupClientImpl(String apiVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                apiVersion);
    }

    /**
     * Initializes an instance of KeyVaultBackupClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param apiVersion Api Version.
     */
    KeyVaultBackupClientImpl(HttpPipeline httpPipeline, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), apiVersion);
    }

    /**
     * Initializes an instance of KeyVaultBackupClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param apiVersion Api Version.
     */
    KeyVaultBackupClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.apiVersion = apiVersion;
        this.service =
                RestProxy.create(KeyVaultBackupClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for KeyVaultBackupClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{vaultBaseUrl}")
    @ServiceInterface(name = "KeyVaultBackupClient")
    private interface KeyVaultBackupClientService {
        @Post("/backup")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<FullBackupResponse> fullBackup(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") SASTokenParameter azureStorageBlobContainerUri,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/backup/{jobId}/pending")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<FullBackupOperation>> fullBackupStatus(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam("jobId") String jobId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/restore")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<FullRestoreOperationResponse> fullRestoreOperation(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") RestoreOperationParameters restoreBlobDetails,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/restore/{jobId}/pending")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<RestoreOperation>> restoreStatus(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam("jobId") String jobId,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Put("/keys/{keyName}/restore")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<SelectiveKeyRestoreOperationResponse> selectiveKeyRestoreOperation(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam("keyName") String keyName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") SelectiveKeyRestoreOperationParameters restoreBlobDetails,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Creates a full backup using a user-provided SAS token to an Azure blob storage container.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param azureStorageBlobContainerUri Azure blob shared access signature token pointing to a valid Azure blob
     *     container where full backup needs to be stored. This token needs to be valid for at least next 24 hours from
     *     the time of making this call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return full backup operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FullBackupResponse> fullBackupWithResponseAsync(
            String vaultBaseUrl, SASTokenParameter azureStorageBlobContainerUri, Context context) {
        final String accept = "application/json";
        return service.fullBackup(vaultBaseUrl, this.getApiVersion(), azureStorageBlobContainerUri, accept, context);
    }

    /**
     * Returns the status of full backup operation.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param jobId The id returned as part of the backup request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return full backup operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<FullBackupOperation>> fullBackupStatusWithResponseAsync(
            String vaultBaseUrl, String jobId, Context context) {
        final String accept = "application/json";
        return service.fullBackupStatus(vaultBaseUrl, jobId, this.getApiVersion(), accept, context);
    }

    /**
     * Restores all key materials using the SAS token pointing to a previously stored Azure Blob storage backup folder.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param restoreBlobDetails The Azure blob SAS token pointing to a folder where the previous successful full backup
     *     was stored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<FullRestoreOperationResponse> fullRestoreOperationWithResponseAsync(
            String vaultBaseUrl, RestoreOperationParameters restoreBlobDetails, Context context) {
        final String accept = "application/json";
        return service.fullRestoreOperation(vaultBaseUrl, this.getApiVersion(), restoreBlobDetails, accept, context);
    }

    /**
     * Returns the status of restore operation.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param jobId The Job Id returned part of the restore operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return restore operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RestoreOperation>> restoreStatusWithResponseAsync(
            String vaultBaseUrl, String jobId, Context context) {
        final String accept = "application/json";
        return service.restoreStatus(vaultBaseUrl, jobId, this.getApiVersion(), accept, context);
    }

    /**
     * Restores all key versions of a given key using user supplied SAS token pointing to a previously stored Azure Blob
     * storage backup folder.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param keyName The name of the key to be restored from the user supplied backup.
     * @param restoreBlobDetails The Azure blob SAS token pointing to a folder where the previous successful full backup
     *     was stored.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return selective Key Restore operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SelectiveKeyRestoreOperationResponse> selectiveKeyRestoreOperationWithResponseAsync(
            String vaultBaseUrl,
            String keyName,
            SelectiveKeyRestoreOperationParameters restoreBlobDetails,
            Context context) {
        final String accept = "application/json";
        return service.selectiveKeyRestoreOperation(
                vaultBaseUrl, keyName, this.getApiVersion(), restoreBlobDetails, accept, context);
    }
}
