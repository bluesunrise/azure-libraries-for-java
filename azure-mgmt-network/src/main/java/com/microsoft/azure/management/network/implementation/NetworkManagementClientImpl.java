/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the NetworkManagementClientImpl class.
 */
public class NetworkManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private NetworkManagementClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call. */
    private String subscriptionId;

    /**
     * Gets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription credentials which uniquely identify the Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public NetworkManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public NetworkManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public NetworkManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public NetworkManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ApplicationGatewaysInner object to access its operations.
     */
    private ApplicationGatewaysInner applicationGateways;

    /**
     * Gets the ApplicationGatewaysInner object to access its operations.
     * @return the ApplicationGatewaysInner object.
     */
    public ApplicationGatewaysInner applicationGateways() {
        return this.applicationGateways;
    }

    /**
     * The ApplicationSecurityGroupsInner object to access its operations.
     */
    private ApplicationSecurityGroupsInner applicationSecurityGroups;

    /**
     * Gets the ApplicationSecurityGroupsInner object to access its operations.
     * @return the ApplicationSecurityGroupsInner object.
     */
    public ApplicationSecurityGroupsInner applicationSecurityGroups() {
        return this.applicationSecurityGroups;
    }

    /**
     * The DdosProtectionPlansInner object to access its operations.
     */
    private DdosProtectionPlansInner ddosProtectionPlans;

    /**
     * Gets the DdosProtectionPlansInner object to access its operations.
     * @return the DdosProtectionPlansInner object.
     */
    public DdosProtectionPlansInner ddosProtectionPlans() {
        return this.ddosProtectionPlans;
    }

    /**
     * The AvailableEndpointServicesInner object to access its operations.
     */
    private AvailableEndpointServicesInner availableEndpointServices;

    /**
     * Gets the AvailableEndpointServicesInner object to access its operations.
     * @return the AvailableEndpointServicesInner object.
     */
    public AvailableEndpointServicesInner availableEndpointServices() {
        return this.availableEndpointServices;
    }

    /**
     * The ExpressRouteCircuitAuthorizationsInner object to access its operations.
     */
    private ExpressRouteCircuitAuthorizationsInner expressRouteCircuitAuthorizations;

    /**
     * Gets the ExpressRouteCircuitAuthorizationsInner object to access its operations.
     * @return the ExpressRouteCircuitAuthorizationsInner object.
     */
    public ExpressRouteCircuitAuthorizationsInner expressRouteCircuitAuthorizations() {
        return this.expressRouteCircuitAuthorizations;
    }

    /**
     * The ExpressRouteCircuitPeeringsInner object to access its operations.
     */
    private ExpressRouteCircuitPeeringsInner expressRouteCircuitPeerings;

    /**
     * Gets the ExpressRouteCircuitPeeringsInner object to access its operations.
     * @return the ExpressRouteCircuitPeeringsInner object.
     */
    public ExpressRouteCircuitPeeringsInner expressRouteCircuitPeerings() {
        return this.expressRouteCircuitPeerings;
    }

    /**
     * The ExpressRouteCircuitConnectionsInner object to access its operations.
     */
    private ExpressRouteCircuitConnectionsInner expressRouteCircuitConnections;

    /**
     * Gets the ExpressRouteCircuitConnectionsInner object to access its operations.
     * @return the ExpressRouteCircuitConnectionsInner object.
     */
    public ExpressRouteCircuitConnectionsInner expressRouteCircuitConnections() {
        return this.expressRouteCircuitConnections;
    }

    /**
     * The ExpressRouteCircuitsInner object to access its operations.
     */
    private ExpressRouteCircuitsInner expressRouteCircuits;

    /**
     * Gets the ExpressRouteCircuitsInner object to access its operations.
     * @return the ExpressRouteCircuitsInner object.
     */
    public ExpressRouteCircuitsInner expressRouteCircuits() {
        return this.expressRouteCircuits;
    }

    /**
     * The ExpressRouteServiceProvidersInner object to access its operations.
     */
    private ExpressRouteServiceProvidersInner expressRouteServiceProviders;

    /**
     * Gets the ExpressRouteServiceProvidersInner object to access its operations.
     * @return the ExpressRouteServiceProvidersInner object.
     */
    public ExpressRouteServiceProvidersInner expressRouteServiceProviders() {
        return this.expressRouteServiceProviders;
    }

    /**
     * The ExpressRouteCrossConnectionsInner object to access its operations.
     */
    private ExpressRouteCrossConnectionsInner expressRouteCrossConnections;

    /**
     * Gets the ExpressRouteCrossConnectionsInner object to access its operations.
     * @return the ExpressRouteCrossConnectionsInner object.
     */
    public ExpressRouteCrossConnectionsInner expressRouteCrossConnections() {
        return this.expressRouteCrossConnections;
    }

    /**
     * The ExpressRouteCrossConnectionPeeringsInner object to access its operations.
     */
    private ExpressRouteCrossConnectionPeeringsInner expressRouteCrossConnectionPeerings;

    /**
     * Gets the ExpressRouteCrossConnectionPeeringsInner object to access its operations.
     * @return the ExpressRouteCrossConnectionPeeringsInner object.
     */
    public ExpressRouteCrossConnectionPeeringsInner expressRouteCrossConnectionPeerings() {
        return this.expressRouteCrossConnectionPeerings;
    }

    /**
     * The LoadBalancersInner object to access its operations.
     */
    private LoadBalancersInner loadBalancers;

    /**
     * Gets the LoadBalancersInner object to access its operations.
     * @return the LoadBalancersInner object.
     */
    public LoadBalancersInner loadBalancers() {
        return this.loadBalancers;
    }

    /**
     * The LoadBalancerBackendAddressPoolsInner object to access its operations.
     */
    private LoadBalancerBackendAddressPoolsInner loadBalancerBackendAddressPools;

    /**
     * Gets the LoadBalancerBackendAddressPoolsInner object to access its operations.
     * @return the LoadBalancerBackendAddressPoolsInner object.
     */
    public LoadBalancerBackendAddressPoolsInner loadBalancerBackendAddressPools() {
        return this.loadBalancerBackendAddressPools;
    }

    /**
     * The LoadBalancerFrontendIPConfigurationsInner object to access its operations.
     */
    private LoadBalancerFrontendIPConfigurationsInner loadBalancerFrontendIPConfigurations;

    /**
     * Gets the LoadBalancerFrontendIPConfigurationsInner object to access its operations.
     * @return the LoadBalancerFrontendIPConfigurationsInner object.
     */
    public LoadBalancerFrontendIPConfigurationsInner loadBalancerFrontendIPConfigurations() {
        return this.loadBalancerFrontendIPConfigurations;
    }

    /**
     * The InboundNatRulesInner object to access its operations.
     */
    private InboundNatRulesInner inboundNatRules;

    /**
     * Gets the InboundNatRulesInner object to access its operations.
     * @return the InboundNatRulesInner object.
     */
    public InboundNatRulesInner inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * The LoadBalancerLoadBalancingRulesInner object to access its operations.
     */
    private LoadBalancerLoadBalancingRulesInner loadBalancerLoadBalancingRules;

    /**
     * Gets the LoadBalancerLoadBalancingRulesInner object to access its operations.
     * @return the LoadBalancerLoadBalancingRulesInner object.
     */
    public LoadBalancerLoadBalancingRulesInner loadBalancerLoadBalancingRules() {
        return this.loadBalancerLoadBalancingRules;
    }

    /**
     * The LoadBalancerNetworkInterfacesInner object to access its operations.
     */
    private LoadBalancerNetworkInterfacesInner loadBalancerNetworkInterfaces;

    /**
     * Gets the LoadBalancerNetworkInterfacesInner object to access its operations.
     * @return the LoadBalancerNetworkInterfacesInner object.
     */
    public LoadBalancerNetworkInterfacesInner loadBalancerNetworkInterfaces() {
        return this.loadBalancerNetworkInterfaces;
    }

    /**
     * The LoadBalancerProbesInner object to access its operations.
     */
    private LoadBalancerProbesInner loadBalancerProbes;

    /**
     * Gets the LoadBalancerProbesInner object to access its operations.
     * @return the LoadBalancerProbesInner object.
     */
    public LoadBalancerProbesInner loadBalancerProbes() {
        return this.loadBalancerProbes;
    }

    /**
     * The NetworkInterfacesInner object to access its operations.
     */
    private NetworkInterfacesInner networkInterfaces;

    /**
     * Gets the NetworkInterfacesInner object to access its operations.
     * @return the NetworkInterfacesInner object.
     */
    public NetworkInterfacesInner networkInterfaces() {
        return this.networkInterfaces;
    }

    /**
     * The NetworkInterfaceIPConfigurationsInner object to access its operations.
     */
    private NetworkInterfaceIPConfigurationsInner networkInterfaceIPConfigurations;

    /**
     * Gets the NetworkInterfaceIPConfigurationsInner object to access its operations.
     * @return the NetworkInterfaceIPConfigurationsInner object.
     */
    public NetworkInterfaceIPConfigurationsInner networkInterfaceIPConfigurations() {
        return this.networkInterfaceIPConfigurations;
    }

    /**
     * The NetworkInterfaceLoadBalancersInner object to access its operations.
     */
    private NetworkInterfaceLoadBalancersInner networkInterfaceLoadBalancers;

    /**
     * Gets the NetworkInterfaceLoadBalancersInner object to access its operations.
     * @return the NetworkInterfaceLoadBalancersInner object.
     */
    public NetworkInterfaceLoadBalancersInner networkInterfaceLoadBalancers() {
        return this.networkInterfaceLoadBalancers;
    }

    /**
     * The NetworkSecurityGroupsInner object to access its operations.
     */
    private NetworkSecurityGroupsInner networkSecurityGroups;

    /**
     * Gets the NetworkSecurityGroupsInner object to access its operations.
     * @return the NetworkSecurityGroupsInner object.
     */
    public NetworkSecurityGroupsInner networkSecurityGroups() {
        return this.networkSecurityGroups;
    }

    /**
     * The SecurityRulesInner object to access its operations.
     */
    private SecurityRulesInner securityRules;

    /**
     * Gets the SecurityRulesInner object to access its operations.
     * @return the SecurityRulesInner object.
     */
    public SecurityRulesInner securityRules() {
        return this.securityRules;
    }

    /**
     * The DefaultSecurityRulesInner object to access its operations.
     */
    private DefaultSecurityRulesInner defaultSecurityRules;

    /**
     * Gets the DefaultSecurityRulesInner object to access its operations.
     * @return the DefaultSecurityRulesInner object.
     */
    public DefaultSecurityRulesInner defaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * The NetworkWatchersInner object to access its operations.
     */
    private NetworkWatchersInner networkWatchers;

    /**
     * Gets the NetworkWatchersInner object to access its operations.
     * @return the NetworkWatchersInner object.
     */
    public NetworkWatchersInner networkWatchers() {
        return this.networkWatchers;
    }

    /**
     * The PacketCapturesInner object to access its operations.
     */
    private PacketCapturesInner packetCaptures;

    /**
     * Gets the PacketCapturesInner object to access its operations.
     * @return the PacketCapturesInner object.
     */
    public PacketCapturesInner packetCaptures() {
        return this.packetCaptures;
    }

    /**
     * The ConnectionMonitorsInner object to access its operations.
     */
    private ConnectionMonitorsInner connectionMonitors;

    /**
     * Gets the ConnectionMonitorsInner object to access its operations.
     * @return the ConnectionMonitorsInner object.
     */
    public ConnectionMonitorsInner connectionMonitors() {
        return this.connectionMonitors;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The PublicIPAddressesInner object to access its operations.
     */
    private PublicIPAddressesInner publicIPAddresses;

    /**
     * Gets the PublicIPAddressesInner object to access its operations.
     * @return the PublicIPAddressesInner object.
     */
    public PublicIPAddressesInner publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * The RouteFiltersInner object to access its operations.
     */
    private RouteFiltersInner routeFilters;

    /**
     * Gets the RouteFiltersInner object to access its operations.
     * @return the RouteFiltersInner object.
     */
    public RouteFiltersInner routeFilters() {
        return this.routeFilters;
    }

    /**
     * The RouteFilterRulesInner object to access its operations.
     */
    private RouteFilterRulesInner routeFilterRules;

    /**
     * Gets the RouteFilterRulesInner object to access its operations.
     * @return the RouteFilterRulesInner object.
     */
    public RouteFilterRulesInner routeFilterRules() {
        return this.routeFilterRules;
    }

    /**
     * The RouteTablesInner object to access its operations.
     */
    private RouteTablesInner routeTables;

    /**
     * Gets the RouteTablesInner object to access its operations.
     * @return the RouteTablesInner object.
     */
    public RouteTablesInner routeTables() {
        return this.routeTables;
    }

    /**
     * The RoutesInner object to access its operations.
     */
    private RoutesInner routes;

    /**
     * Gets the RoutesInner object to access its operations.
     * @return the RoutesInner object.
     */
    public RoutesInner routes() {
        return this.routes;
    }

    /**
     * The BgpServiceCommunitiesInner object to access its operations.
     */
    private BgpServiceCommunitiesInner bgpServiceCommunities;

    /**
     * Gets the BgpServiceCommunitiesInner object to access its operations.
     * @return the BgpServiceCommunitiesInner object.
     */
    public BgpServiceCommunitiesInner bgpServiceCommunities() {
        return this.bgpServiceCommunities;
    }

    /**
     * The UsagesInner object to access its operations.
     */
    private UsagesInner usages;

    /**
     * Gets the UsagesInner object to access its operations.
     * @return the UsagesInner object.
     */
    public UsagesInner usages() {
        return this.usages;
    }

    /**
     * The VirtualNetworksInner object to access its operations.
     */
    private VirtualNetworksInner virtualNetworks;

    /**
     * Gets the VirtualNetworksInner object to access its operations.
     * @return the VirtualNetworksInner object.
     */
    public VirtualNetworksInner virtualNetworks() {
        return this.virtualNetworks;
    }

    /**
     * The SubnetsInner object to access its operations.
     */
    private SubnetsInner subnets;

    /**
     * Gets the SubnetsInner object to access its operations.
     * @return the SubnetsInner object.
     */
    public SubnetsInner subnets() {
        return this.subnets;
    }

    /**
     * The VirtualNetworkPeeringsInner object to access its operations.
     */
    private VirtualNetworkPeeringsInner virtualNetworkPeerings;

    /**
     * Gets the VirtualNetworkPeeringsInner object to access its operations.
     * @return the VirtualNetworkPeeringsInner object.
     */
    public VirtualNetworkPeeringsInner virtualNetworkPeerings() {
        return this.virtualNetworkPeerings;
    }

    /**
     * The VirtualNetworkGatewaysInner object to access its operations.
     */
    private VirtualNetworkGatewaysInner virtualNetworkGateways;

    /**
     * Gets the VirtualNetworkGatewaysInner object to access its operations.
     * @return the VirtualNetworkGatewaysInner object.
     */
    public VirtualNetworkGatewaysInner virtualNetworkGateways() {
        return this.virtualNetworkGateways;
    }

    /**
     * The VirtualNetworkGatewayConnectionsInner object to access its operations.
     */
    private VirtualNetworkGatewayConnectionsInner virtualNetworkGatewayConnections;

    /**
     * Gets the VirtualNetworkGatewayConnectionsInner object to access its operations.
     * @return the VirtualNetworkGatewayConnectionsInner object.
     */
    public VirtualNetworkGatewayConnectionsInner virtualNetworkGatewayConnections() {
        return this.virtualNetworkGatewayConnections;
    }

    /**
     * The LocalNetworkGatewaysInner object to access its operations.
     */
    private LocalNetworkGatewaysInner localNetworkGateways;

    /**
     * Gets the LocalNetworkGatewaysInner object to access its operations.
     * @return the LocalNetworkGatewaysInner object.
     */
    public LocalNetworkGatewaysInner localNetworkGateways() {
        return this.localNetworkGateways;
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public NetworkManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public NetworkManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of NetworkManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public NetworkManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.applicationGateways = new ApplicationGatewaysInner(restClient().retrofit(), this);
        this.applicationSecurityGroups = new ApplicationSecurityGroupsInner(restClient().retrofit(), this);
        this.ddosProtectionPlans = new DdosProtectionPlansInner(restClient().retrofit(), this);
        this.availableEndpointServices = new AvailableEndpointServicesInner(restClient().retrofit(), this);
        this.expressRouteCircuitAuthorizations = new ExpressRouteCircuitAuthorizationsInner(restClient().retrofit(), this);
        this.expressRouteCircuitPeerings = new ExpressRouteCircuitPeeringsInner(restClient().retrofit(), this);
        this.expressRouteCircuitConnections = new ExpressRouteCircuitConnectionsInner(restClient().retrofit(), this);
        this.expressRouteCircuits = new ExpressRouteCircuitsInner(restClient().retrofit(), this);
        this.expressRouteServiceProviders = new ExpressRouteServiceProvidersInner(restClient().retrofit(), this);
        this.expressRouteCrossConnections = new ExpressRouteCrossConnectionsInner(restClient().retrofit(), this);
        this.expressRouteCrossConnectionPeerings = new ExpressRouteCrossConnectionPeeringsInner(restClient().retrofit(), this);
        this.loadBalancers = new LoadBalancersInner(restClient().retrofit(), this);
        this.loadBalancerBackendAddressPools = new LoadBalancerBackendAddressPoolsInner(restClient().retrofit(), this);
        this.loadBalancerFrontendIPConfigurations = new LoadBalancerFrontendIPConfigurationsInner(restClient().retrofit(), this);
        this.inboundNatRules = new InboundNatRulesInner(restClient().retrofit(), this);
        this.loadBalancerLoadBalancingRules = new LoadBalancerLoadBalancingRulesInner(restClient().retrofit(), this);
        this.loadBalancerNetworkInterfaces = new LoadBalancerNetworkInterfacesInner(restClient().retrofit(), this);
        this.loadBalancerProbes = new LoadBalancerProbesInner(restClient().retrofit(), this);
        this.networkInterfaces = new NetworkInterfacesInner(restClient().retrofit(), this);
        this.networkInterfaceIPConfigurations = new NetworkInterfaceIPConfigurationsInner(restClient().retrofit(), this);
        this.networkInterfaceLoadBalancers = new NetworkInterfaceLoadBalancersInner(restClient().retrofit(), this);
        this.networkSecurityGroups = new NetworkSecurityGroupsInner(restClient().retrofit(), this);
        this.securityRules = new SecurityRulesInner(restClient().retrofit(), this);
        this.defaultSecurityRules = new DefaultSecurityRulesInner(restClient().retrofit(), this);
        this.networkWatchers = new NetworkWatchersInner(restClient().retrofit(), this);
        this.packetCaptures = new PacketCapturesInner(restClient().retrofit(), this);
        this.connectionMonitors = new ConnectionMonitorsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.publicIPAddresses = new PublicIPAddressesInner(restClient().retrofit(), this);
        this.routeFilters = new RouteFiltersInner(restClient().retrofit(), this);
        this.routeFilterRules = new RouteFilterRulesInner(restClient().retrofit(), this);
        this.routeTables = new RouteTablesInner(restClient().retrofit(), this);
        this.routes = new RoutesInner(restClient().retrofit(), this);
        this.bgpServiceCommunities = new BgpServiceCommunitiesInner(restClient().retrofit(), this);
        this.usages = new UsagesInner(restClient().retrofit(), this);
        this.virtualNetworks = new VirtualNetworksInner(restClient().retrofit(), this);
        this.subnets = new SubnetsInner(restClient().retrofit(), this);
        this.virtualNetworkPeerings = new VirtualNetworkPeeringsInner(restClient().retrofit(), this);
        this.virtualNetworkGateways = new VirtualNetworkGatewaysInner(restClient().retrofit(), this);
        this.virtualNetworkGatewayConnections = new VirtualNetworkGatewayConnectionsInner(restClient().retrofit(), this);
        this.localNetworkGateways = new LocalNetworkGatewaysInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s)", super.userAgent(), "NetworkManagementClient");
    }

    private void initializeService() {
        service = restClient().retrofit().create(NetworkManagementClientService.class);
    }

    /**
     * The interface defining all the services for NetworkManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NetworkManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.NetworkManagementClient checkDnsNameAvailability" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Network/locations/{location}/CheckDnsNameAvailability")
        Observable<Response<ResponseBody>> checkDnsNameAvailability(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("domainNameLabel") String domainNameLabel, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DnsNameAvailabilityResultInner object if successful.
     */
    public DnsNameAvailabilityResultInner checkDnsNameAvailability(String location, String domainNameLabel) {
        return checkDnsNameAvailabilityWithServiceResponseAsync(location, domainNameLabel).toBlocking().single().body();
    }

    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DnsNameAvailabilityResultInner> checkDnsNameAvailabilityAsync(String location, String domainNameLabel, final ServiceCallback<DnsNameAvailabilityResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkDnsNameAvailabilityWithServiceResponseAsync(location, domainNameLabel), serviceCallback);
    }

    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DnsNameAvailabilityResultInner object
     */
    public Observable<DnsNameAvailabilityResultInner> checkDnsNameAvailabilityAsync(String location, String domainNameLabel) {
        return checkDnsNameAvailabilityWithServiceResponseAsync(location, domainNameLabel).map(new Func1<ServiceResponse<DnsNameAvailabilityResultInner>, DnsNameAvailabilityResultInner>() {
            @Override
            public DnsNameAvailabilityResultInner call(ServiceResponse<DnsNameAvailabilityResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Checks whether a domain name in the cloudapp.azure.com zone is available for use.
     *
     * @param location The location of the domain name.
     * @param domainNameLabel The domain name to be verified. It must conform to the following regular expression: ^[a-z][a-z0-9-]{1,61}[a-z0-9]$.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DnsNameAvailabilityResultInner object
     */
    public Observable<ServiceResponse<DnsNameAvailabilityResultInner>> checkDnsNameAvailabilityWithServiceResponseAsync(String location, String domainNameLabel) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (domainNameLabel == null) {
            throw new IllegalArgumentException("Parameter domainNameLabel is required and cannot be null.");
        }
        final String apiVersion = "2018-02-01";
        return service.checkDnsNameAvailability(location, this.subscriptionId(), domainNameLabel, apiVersion, this.acceptLanguage(), this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DnsNameAvailabilityResultInner>>>() {
                @Override
                public Observable<ServiceResponse<DnsNameAvailabilityResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DnsNameAvailabilityResultInner> clientResponse = checkDnsNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DnsNameAvailabilityResultInner> checkDnsNameAvailabilityDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<DnsNameAvailabilityResultInner, CloudException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<DnsNameAvailabilityResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
