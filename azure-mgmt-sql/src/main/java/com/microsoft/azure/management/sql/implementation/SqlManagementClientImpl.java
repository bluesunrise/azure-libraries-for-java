/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the SqlManagementClientImpl class.
 */
public class SqlManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription ID that identifies an Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID that identifies an Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withSubscriptionId(String subscriptionId) {
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
    public SqlManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public SqlManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public SqlManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The BackupLongTermRetentionPoliciesInner object to access its operations.
     */
    private BackupLongTermRetentionPoliciesInner backupLongTermRetentionPolicies;

    /**
     * Gets the BackupLongTermRetentionPoliciesInner object to access its operations.
     * @return the BackupLongTermRetentionPoliciesInner object.
     */
    public BackupLongTermRetentionPoliciesInner backupLongTermRetentionPolicies() {
        return this.backupLongTermRetentionPolicies;
    }

    /**
     * The BackupLongTermRetentionVaultsInner object to access its operations.
     */
    private BackupLongTermRetentionVaultsInner backupLongTermRetentionVaults;

    /**
     * Gets the BackupLongTermRetentionVaultsInner object to access its operations.
     * @return the BackupLongTermRetentionVaultsInner object.
     */
    public BackupLongTermRetentionVaultsInner backupLongTermRetentionVaults() {
        return this.backupLongTermRetentionVaults;
    }

    /**
     * The RecoverableDatabasesInner object to access its operations.
     */
    private RecoverableDatabasesInner recoverableDatabases;

    /**
     * Gets the RecoverableDatabasesInner object to access its operations.
     * @return the RecoverableDatabasesInner object.
     */
    public RecoverableDatabasesInner recoverableDatabases() {
        return this.recoverableDatabases;
    }

    /**
     * The RestorableDroppedDatabasesInner object to access its operations.
     */
    private RestorableDroppedDatabasesInner restorableDroppedDatabases;

    /**
     * Gets the RestorableDroppedDatabasesInner object to access its operations.
     * @return the RestorableDroppedDatabasesInner object.
     */
    public RestorableDroppedDatabasesInner restorableDroppedDatabases() {
        return this.restorableDroppedDatabases;
    }

    /**
     * The CapabilitiesInner object to access its operations.
     */
    private CapabilitiesInner capabilities;

    /**
     * Gets the CapabilitiesInner object to access its operations.
     * @return the CapabilitiesInner object.
     */
    public CapabilitiesInner capabilities() {
        return this.capabilities;
    }

    /**
     * The ServersInner object to access its operations.
     */
    private ServersInner servers;

    /**
     * Gets the ServersInner object to access its operations.
     * @return the ServersInner object.
     */
    public ServersInner servers() {
        return this.servers;
    }

    /**
     * The ServerConnectionPoliciesInner object to access its operations.
     */
    private ServerConnectionPoliciesInner serverConnectionPolicies;

    /**
     * Gets the ServerConnectionPoliciesInner object to access its operations.
     * @return the ServerConnectionPoliciesInner object.
     */
    public ServerConnectionPoliciesInner serverConnectionPolicies() {
        return this.serverConnectionPolicies;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The DatabaseThreatDetectionPoliciesInner object to access its operations.
     */
    private DatabaseThreatDetectionPoliciesInner databaseThreatDetectionPolicies;

    /**
     * Gets the DatabaseThreatDetectionPoliciesInner object to access its operations.
     * @return the DatabaseThreatDetectionPoliciesInner object.
     */
    public DatabaseThreatDetectionPoliciesInner databaseThreatDetectionPolicies() {
        return this.databaseThreatDetectionPolicies;
    }

    /**
     * The DataMaskingPoliciesInner object to access its operations.
     */
    private DataMaskingPoliciesInner dataMaskingPolicies;

    /**
     * Gets the DataMaskingPoliciesInner object to access its operations.
     * @return the DataMaskingPoliciesInner object.
     */
    public DataMaskingPoliciesInner dataMaskingPolicies() {
        return this.dataMaskingPolicies;
    }

    /**
     * The DataMaskingRulesInner object to access its operations.
     */
    private DataMaskingRulesInner dataMaskingRules;

    /**
     * Gets the DataMaskingRulesInner object to access its operations.
     * @return the DataMaskingRulesInner object.
     */
    public DataMaskingRulesInner dataMaskingRules() {
        return this.dataMaskingRules;
    }

    /**
     * The ElasticPoolsInner object to access its operations.
     */
    private ElasticPoolsInner elasticPools;

    /**
     * Gets the ElasticPoolsInner object to access its operations.
     * @return the ElasticPoolsInner object.
     */
    public ElasticPoolsInner elasticPools() {
        return this.elasticPools;
    }

    /**
     * The FirewallRulesInner object to access its operations.
     */
    private FirewallRulesInner firewallRules;

    /**
     * Gets the FirewallRulesInner object to access its operations.
     * @return the FirewallRulesInner object.
     */
    public FirewallRulesInner firewallRules() {
        return this.firewallRules;
    }

    /**
     * The GeoBackupPoliciesInner object to access its operations.
     */
    private GeoBackupPoliciesInner geoBackupPolicies;

    /**
     * Gets the GeoBackupPoliciesInner object to access its operations.
     * @return the GeoBackupPoliciesInner object.
     */
    public GeoBackupPoliciesInner geoBackupPolicies() {
        return this.geoBackupPolicies;
    }

    /**
     * The ReplicationLinksInner object to access its operations.
     */
    private ReplicationLinksInner replicationLinks;

    /**
     * Gets the ReplicationLinksInner object to access its operations.
     * @return the ReplicationLinksInner object.
     */
    public ReplicationLinksInner replicationLinks() {
        return this.replicationLinks;
    }

    /**
     * The ServerAzureADAdministratorsInner object to access its operations.
     */
    private ServerAzureADAdministratorsInner serverAzureADAdministrators;

    /**
     * Gets the ServerAzureADAdministratorsInner object to access its operations.
     * @return the ServerAzureADAdministratorsInner object.
     */
    public ServerAzureADAdministratorsInner serverAzureADAdministrators() {
        return this.serverAzureADAdministrators;
    }

    /**
     * The ServerCommunicationLinksInner object to access its operations.
     */
    private ServerCommunicationLinksInner serverCommunicationLinks;

    /**
     * Gets the ServerCommunicationLinksInner object to access its operations.
     * @return the ServerCommunicationLinksInner object.
     */
    public ServerCommunicationLinksInner serverCommunicationLinks() {
        return this.serverCommunicationLinks;
    }

    /**
     * The ServiceObjectivesInner object to access its operations.
     */
    private ServiceObjectivesInner serviceObjectives;

    /**
     * Gets the ServiceObjectivesInner object to access its operations.
     * @return the ServiceObjectivesInner object.
     */
    public ServiceObjectivesInner serviceObjectives() {
        return this.serviceObjectives;
    }

    /**
     * The ElasticPoolActivitiesInner object to access its operations.
     */
    private ElasticPoolActivitiesInner elasticPoolActivities;

    /**
     * Gets the ElasticPoolActivitiesInner object to access its operations.
     * @return the ElasticPoolActivitiesInner object.
     */
    public ElasticPoolActivitiesInner elasticPoolActivities() {
        return this.elasticPoolActivities;
    }

    /**
     * The ElasticPoolDatabaseActivitiesInner object to access its operations.
     */
    private ElasticPoolDatabaseActivitiesInner elasticPoolDatabaseActivities;

    /**
     * Gets the ElasticPoolDatabaseActivitiesInner object to access its operations.
     * @return the ElasticPoolDatabaseActivitiesInner object.
     */
    public ElasticPoolDatabaseActivitiesInner elasticPoolDatabaseActivities() {
        return this.elasticPoolDatabaseActivities;
    }

    /**
     * The RecommendedElasticPoolsInner object to access its operations.
     */
    private RecommendedElasticPoolsInner recommendedElasticPools;

    /**
     * Gets the RecommendedElasticPoolsInner object to access its operations.
     * @return the RecommendedElasticPoolsInner object.
     */
    public RecommendedElasticPoolsInner recommendedElasticPools() {
        return this.recommendedElasticPools;
    }

    /**
     * The ServiceTierAdvisorsInner object to access its operations.
     */
    private ServiceTierAdvisorsInner serviceTierAdvisors;

    /**
     * Gets the ServiceTierAdvisorsInner object to access its operations.
     * @return the ServiceTierAdvisorsInner object.
     */
    public ServiceTierAdvisorsInner serviceTierAdvisors() {
        return this.serviceTierAdvisors;
    }

    /**
     * The TransparentDataEncryptionsInner object to access its operations.
     */
    private TransparentDataEncryptionsInner transparentDataEncryptions;

    /**
     * Gets the TransparentDataEncryptionsInner object to access its operations.
     * @return the TransparentDataEncryptionsInner object.
     */
    public TransparentDataEncryptionsInner transparentDataEncryptions() {
        return this.transparentDataEncryptions;
    }

    /**
     * The TransparentDataEncryptionActivitiesInner object to access its operations.
     */
    private TransparentDataEncryptionActivitiesInner transparentDataEncryptionActivities;

    /**
     * Gets the TransparentDataEncryptionActivitiesInner object to access its operations.
     * @return the TransparentDataEncryptionActivitiesInner object.
     */
    public TransparentDataEncryptionActivitiesInner transparentDataEncryptionActivities() {
        return this.transparentDataEncryptionActivities;
    }

    /**
     * The ServerUsagesInner object to access its operations.
     */
    private ServerUsagesInner serverUsages;

    /**
     * Gets the ServerUsagesInner object to access its operations.
     * @return the ServerUsagesInner object.
     */
    public ServerUsagesInner serverUsages() {
        return this.serverUsages;
    }

    /**
     * The DatabaseUsagesInner object to access its operations.
     */
    private DatabaseUsagesInner databaseUsages;

    /**
     * Gets the DatabaseUsagesInner object to access its operations.
     * @return the DatabaseUsagesInner object.
     */
    public DatabaseUsagesInner databaseUsages() {
        return this.databaseUsages;
    }

    /**
     * The DatabaseBlobAuditingPoliciesInner object to access its operations.
     */
    private DatabaseBlobAuditingPoliciesInner databaseBlobAuditingPolicies;

    /**
     * Gets the DatabaseBlobAuditingPoliciesInner object to access its operations.
     * @return the DatabaseBlobAuditingPoliciesInner object.
     */
    public DatabaseBlobAuditingPoliciesInner databaseBlobAuditingPolicies() {
        return this.databaseBlobAuditingPolicies;
    }

    /**
     * The DatabaseAutomaticTuningsInner object to access its operations.
     */
    private DatabaseAutomaticTuningsInner databaseAutomaticTunings;

    /**
     * Gets the DatabaseAutomaticTuningsInner object to access its operations.
     * @return the DatabaseAutomaticTuningsInner object.
     */
    public DatabaseAutomaticTuningsInner databaseAutomaticTunings() {
        return this.databaseAutomaticTunings;
    }

    /**
     * The EncryptionProtectorsInner object to access its operations.
     */
    private EncryptionProtectorsInner encryptionProtectors;

    /**
     * Gets the EncryptionProtectorsInner object to access its operations.
     * @return the EncryptionProtectorsInner object.
     */
    public EncryptionProtectorsInner encryptionProtectors() {
        return this.encryptionProtectors;
    }

    /**
     * The FailoverGroupsInner object to access its operations.
     */
    private FailoverGroupsInner failoverGroups;

    /**
     * Gets the FailoverGroupsInner object to access its operations.
     * @return the FailoverGroupsInner object.
     */
    public FailoverGroupsInner failoverGroups() {
        return this.failoverGroups;
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
     * The ServerKeysInner object to access its operations.
     */
    private ServerKeysInner serverKeys;

    /**
     * Gets the ServerKeysInner object to access its operations.
     * @return the ServerKeysInner object.
     */
    public ServerKeysInner serverKeys() {
        return this.serverKeys;
    }

    /**
     * The SyncAgentsInner object to access its operations.
     */
    private SyncAgentsInner syncAgents;

    /**
     * Gets the SyncAgentsInner object to access its operations.
     * @return the SyncAgentsInner object.
     */
    public SyncAgentsInner syncAgents() {
        return this.syncAgents;
    }

    /**
     * The SyncGroupsInner object to access its operations.
     */
    private SyncGroupsInner syncGroups;

    /**
     * Gets the SyncGroupsInner object to access its operations.
     * @return the SyncGroupsInner object.
     */
    public SyncGroupsInner syncGroups() {
        return this.syncGroups;
    }

    /**
     * The SyncMembersInner object to access its operations.
     */
    private SyncMembersInner syncMembers;

    /**
     * Gets the SyncMembersInner object to access its operations.
     * @return the SyncMembersInner object.
     */
    public SyncMembersInner syncMembers() {
        return this.syncMembers;
    }

    /**
     * The SubscriptionUsagesInner object to access its operations.
     */
    private SubscriptionUsagesInner subscriptionUsages;

    /**
     * Gets the SubscriptionUsagesInner object to access its operations.
     * @return the SubscriptionUsagesInner object.
     */
    public SubscriptionUsagesInner subscriptionUsages() {
        return this.subscriptionUsages;
    }

    /**
     * The VirtualNetworkRulesInner object to access its operations.
     */
    private VirtualNetworkRulesInner virtualNetworkRules;

    /**
     * Gets the VirtualNetworkRulesInner object to access its operations.
     * @return the VirtualNetworkRulesInner object.
     */
    public VirtualNetworkRulesInner virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * The DatabaseOperationsInner object to access its operations.
     */
    private DatabaseOperationsInner databaseOperations;

    /**
     * Gets the DatabaseOperationsInner object to access its operations.
     * @return the DatabaseOperationsInner object.
     */
    public DatabaseOperationsInner databaseOperations() {
        return this.databaseOperations;
    }

    /**
     * The ServerAutomaticTuningsInner object to access its operations.
     */
    private ServerAutomaticTuningsInner serverAutomaticTunings;

    /**
     * Gets the ServerAutomaticTuningsInner object to access its operations.
     * @return the ServerAutomaticTuningsInner object.
     */
    public ServerAutomaticTuningsInner serverAutomaticTunings() {
        return this.serverAutomaticTunings;
    }

    /**
     * The ServerDnsAliasesInner object to access its operations.
     */
    private ServerDnsAliasesInner serverDnsAliases;

    /**
     * Gets the ServerDnsAliasesInner object to access its operations.
     * @return the ServerDnsAliasesInner object.
     */
    public ServerDnsAliasesInner serverDnsAliases() {
        return this.serverDnsAliases;
    }

    /**
     * The RestorePointsInner object to access its operations.
     */
    private RestorePointsInner restorePoints;

    /**
     * Gets the RestorePointsInner object to access its operations.
     * @return the RestorePointsInner object.
     */
    public RestorePointsInner restorePoints() {
        return this.restorePoints;
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SqlManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.backupLongTermRetentionPolicies = new BackupLongTermRetentionPoliciesInner(restClient().retrofit(), this);
        this.backupLongTermRetentionVaults = new BackupLongTermRetentionVaultsInner(restClient().retrofit(), this);
        this.recoverableDatabases = new RecoverableDatabasesInner(restClient().retrofit(), this);
        this.restorableDroppedDatabases = new RestorableDroppedDatabasesInner(restClient().retrofit(), this);
        this.capabilities = new CapabilitiesInner(restClient().retrofit(), this);
        this.servers = new ServersInner(restClient().retrofit(), this);
        this.serverConnectionPolicies = new ServerConnectionPoliciesInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.databaseThreatDetectionPolicies = new DatabaseThreatDetectionPoliciesInner(restClient().retrofit(), this);
        this.dataMaskingPolicies = new DataMaskingPoliciesInner(restClient().retrofit(), this);
        this.dataMaskingRules = new DataMaskingRulesInner(restClient().retrofit(), this);
        this.elasticPools = new ElasticPoolsInner(restClient().retrofit(), this);
        this.firewallRules = new FirewallRulesInner(restClient().retrofit(), this);
        this.geoBackupPolicies = new GeoBackupPoliciesInner(restClient().retrofit(), this);
        this.replicationLinks = new ReplicationLinksInner(restClient().retrofit(), this);
        this.serverAzureADAdministrators = new ServerAzureADAdministratorsInner(restClient().retrofit(), this);
        this.serverCommunicationLinks = new ServerCommunicationLinksInner(restClient().retrofit(), this);
        this.serviceObjectives = new ServiceObjectivesInner(restClient().retrofit(), this);
        this.elasticPoolActivities = new ElasticPoolActivitiesInner(restClient().retrofit(), this);
        this.elasticPoolDatabaseActivities = new ElasticPoolDatabaseActivitiesInner(restClient().retrofit(), this);
        this.recommendedElasticPools = new RecommendedElasticPoolsInner(restClient().retrofit(), this);
        this.serviceTierAdvisors = new ServiceTierAdvisorsInner(restClient().retrofit(), this);
        this.transparentDataEncryptions = new TransparentDataEncryptionsInner(restClient().retrofit(), this);
        this.transparentDataEncryptionActivities = new TransparentDataEncryptionActivitiesInner(restClient().retrofit(), this);
        this.serverUsages = new ServerUsagesInner(restClient().retrofit(), this);
        this.databaseUsages = new DatabaseUsagesInner(restClient().retrofit(), this);
        this.databaseBlobAuditingPolicies = new DatabaseBlobAuditingPoliciesInner(restClient().retrofit(), this);
        this.databaseAutomaticTunings = new DatabaseAutomaticTuningsInner(restClient().retrofit(), this);
        this.encryptionProtectors = new EncryptionProtectorsInner(restClient().retrofit(), this);
        this.failoverGroups = new FailoverGroupsInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.serverKeys = new ServerKeysInner(restClient().retrofit(), this);
        this.syncAgents = new SyncAgentsInner(restClient().retrofit(), this);
        this.syncGroups = new SyncGroupsInner(restClient().retrofit(), this);
        this.syncMembers = new SyncMembersInner(restClient().retrofit(), this);
        this.subscriptionUsages = new SubscriptionUsagesInner(restClient().retrofit(), this);
        this.virtualNetworkRules = new VirtualNetworkRulesInner(restClient().retrofit(), this);
        this.databaseOperations = new DatabaseOperationsInner(restClient().retrofit(), this);
        this.serverAutomaticTunings = new ServerAutomaticTuningsInner(restClient().retrofit(), this);
        this.serverDnsAliases = new ServerDnsAliasesInner(restClient().retrofit(), this);
        this.restorePoints = new RestorePointsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s)", super.userAgent(), "SqlManagementClient");
    }
}
