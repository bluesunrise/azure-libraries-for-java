/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.apimanagement.AccessInformationUpdateParameters;
import com.microsoft.azure.management.apimanagement.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in TenantAccess.
 */
public class TenantAccessInner {
    /** The Retrofit service to perform REST calls. */
    private TenantAccessService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of TenantAccessInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TenantAccessInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(TenantAccessService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TenantAccess to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TenantAccessService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.TenantAccess get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/tenant/{accessName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Path("accessName") String accessName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.TenantAccess update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/tenant/{accessName}")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("accessName") String accessName, @Path("subscriptionId") String subscriptionId, @Header("If-Match") String ifMatch, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body AccessInformationUpdateParameters parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.TenantAccess regeneratePrimaryKey" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/tenant/{accessName}/regeneratePrimaryKey")
        Observable<Response<ResponseBody>> regeneratePrimaryKey(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Path("accessName") String accessName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.TenantAccess regenerateSecondaryKey" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/tenant/{accessName}/regenerateSecondaryKey")
        Observable<Response<ResponseBody>> regenerateSecondaryKey(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Path("accessName") String accessName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessInformationContractInner object if successful.
     */
    public AccessInformationContractInner get(String resourceGroupName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Get tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessInformationContractInner> getAsync(String resourceGroupName, String serviceName, final ServiceCallback<AccessInformationContractInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(getWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Get tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessInformationContractInner object
     */
    public Observable<AccessInformationContractInner> getAsync(String resourceGroupName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGetHeadersInner>, AccessInformationContractInner>() {
            @Override
            public AccessInformationContractInner call(ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGetHeadersInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessInformationContractInner object
     */
    public Observable<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGetHeadersInner>> getWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String accessName = "access";
        return service.get(resourceGroupName, serviceName, this.client.subscriptionId(), accessName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGetHeadersInner>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGetHeadersInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGetHeadersInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGetHeadersInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessInformationContractInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessInformationContractInner>() { }.getType())
                .registerError(CloudException.class)
                .buildWithHeaders(response, TenantAccessGetHeadersInner.class);
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(String resourceGroupName, String serviceName, String ifMatch) {
        updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch).toBlocking().single().body();
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch), serviceCallback);
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch) {
        return updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String resourceGroupName, String serviceName, String ifMatch) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (ifMatch == null) {
            throw new IllegalArgumentException("Parameter ifMatch is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String accessName = "access";
        final Boolean enabled = null;
        AccessInformationUpdateParameters parameters = new AccessInformationUpdateParameters();
        parameters.withEnabled(null);
        return service.update(resourceGroupName, serviceName, accessName, this.client.subscriptionId(), ifMatch, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Tenant access information of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void update(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled).toBlocking().single().body();
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Tenant access information of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled), serviceCallback);
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Tenant access information of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> updateAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        return updateWithServiceResponseAsync(resourceGroupName, serviceName, ifMatch, enabled).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Update tenant access information details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @param enabled Tenant access information of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> updateWithServiceResponseAsync(String resourceGroupName, String serviceName, String ifMatch, Boolean enabled) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (ifMatch == null) {
            throw new IllegalArgumentException("Parameter ifMatch is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String accessName = "access";
        AccessInformationUpdateParameters parameters = new AccessInformationUpdateParameters();
        parameters.withEnabled(enabled);
        return service.update(resourceGroupName, serviceName, accessName, this.client.subscriptionId(), ifMatch, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> updateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Regenerate primary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void regeneratePrimaryKey(String resourceGroupName, String serviceName) {
        regeneratePrimaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Regenerate primary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(regeneratePrimaryKeyWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Regenerate primary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName) {
        return regeneratePrimaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Regenerate primary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> regeneratePrimaryKeyWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String accessName = "access";
        return service.regeneratePrimaryKey(resourceGroupName, serviceName, this.client.subscriptionId(), accessName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = regeneratePrimaryKeyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> regeneratePrimaryKeyDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Regenerate secondary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void regenerateSecondaryKey(String resourceGroupName, String serviceName) {
        regenerateSecondaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Regenerate secondary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(regenerateSecondaryKeyWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Regenerate secondary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName) {
        return regenerateSecondaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Regenerate secondary access key.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> regenerateSecondaryKeyWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String accessName = "access";
        return service.regenerateSecondaryKey(resourceGroupName, serviceName, this.client.subscriptionId(), accessName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = regenerateSecondaryKeyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> regenerateSecondaryKeyDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
