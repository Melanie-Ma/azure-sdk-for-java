/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Schemas.
 */
public class SchemasInner {
    /** The Retrofit service to perform REST calls. */
    private SchemasService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of SchemasInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SchemasInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(SchemasService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Schemas to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SchemasService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2020_08_01.Schemas get" })
        @POST("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/schema")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the schema for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SearchGetSchemaResponseInner object if successful.
     */
    public SearchGetSchemaResponseInner get(String resourceGroupName, String workspaceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Gets the schema for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SearchGetSchemaResponseInner> getAsync(String resourceGroupName, String workspaceName, final ServiceCallback<SearchGetSchemaResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Gets the schema for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchGetSchemaResponseInner object
     */
    public Observable<SearchGetSchemaResponseInner> getAsync(String resourceGroupName, String workspaceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<SearchGetSchemaResponseInner>, SearchGetSchemaResponseInner>() {
            @Override
            public SearchGetSchemaResponseInner call(ServiceResponse<SearchGetSchemaResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the schema for a given workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SearchGetSchemaResponseInner object
     */
    public Observable<ServiceResponse<SearchGetSchemaResponseInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, workspaceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SearchGetSchemaResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<SearchGetSchemaResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SearchGetSchemaResponseInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SearchGetSchemaResponseInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SearchGetSchemaResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SearchGetSchemaResponseInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}