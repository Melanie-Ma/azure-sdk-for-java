// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Dynamics linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Dynamics")
@JsonFlatten
@Fluent
public class DynamicsLinkedService extends LinkedService {
    /*
     * The deployment type of the Dynamics instance. 'Online' for Dynamics
     * Online and 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.deploymentType", required = true)
    private DynamicsDeploymentType deploymentType;

    /*
     * The host name of the on-premises Dynamics server. The property is
     * required for on-prem and not allowed for online. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.hostName")
    private Object hostName;

    /*
     * The port of on-premises Dynamics server. The property is required for
     * on-prem and not allowed for online. Default is 443. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The URL to the Microsoft Dynamics server. The property is required for
     * on-line and not allowed for on-prem. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.serviceUri")
    private Object serviceUri;

    /*
     * The organization name of the Dynamics instance. The property is required
     * for on-prem and required for online when there are more than one
     * Dynamics instances associated with the user. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.organizationName")
    private Object organizationName;

    /*
     * The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario,
     * 'AADServicePrincipal' for Server-To-Server authentication in online
     * scenario. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private DynamicsAuthenticationType authenticationType;

    /*
     * User name to access the Dynamics instance. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * Password to access the Dynamics instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret,
     * 'ServicePrincipalCert' for certificate. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalCredentialType")
    private DynamicsServicePrincipalCredentialType servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey',
     * servicePrincipalCredential can be SecureString or
     * AzureKeyVaultSecretReference. If servicePrincipalCredentialType is
     * 'ServicePrincipalCert', servicePrincipalCredential can only be
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalCredential")
    private SecretBase servicePrincipalCredential;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     *
     * @return the deploymentType value.
     */
    public DynamicsDeploymentType getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deploymentType property: The deployment type of the Dynamics instance. 'Online' for Dynamics Online and
     * 'OnPremisesWithIfd' for Dynamics on-premises with Ifd. Type: string (or Expression with resultType string).
     *
     * @param deploymentType the deploymentType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setDeploymentType(DynamicsDeploymentType deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the hostName property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @return the hostName value.
     */
    public Object getHostName() {
        return this.hostName;
    }

    /**
     * Set the hostName property: The host name of the on-premises Dynamics server. The property is required for on-prem
     * and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @param hostName the hostName value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setHostName(Object hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The port of on-premises Dynamics server. The property is required for on-prem and not
     * allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @return the serviceUri value.
     */
    public Object getServiceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The URL to the Microsoft Dynamics server. The property is required for on-line and
     * not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @param serviceUri the serviceUri value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServiceUri(Object serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     *
     * @return the organizationName value.
     */
    public Object getOrganizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organization name of the Dynamics instance. The property is required for
     * on-prem and required for online when there are more than one Dynamics instances associated with the user. Type:
     * string (or Expression with resultType string).
     *
     * @param organizationName the organizationName value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setOrganizationName(Object organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @return the authenticationType value.
     */
    public DynamicsAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to connect to Dynamics server. 'Office365' for
     * online scenario, 'Ifd' for on-premises with Ifd scenario, 'AADServicePrincipal' for Server-To-Server
     * authentication in online scenario. Type: string (or Expression with resultType string).
     *
     * @param authenticationType the authenticationType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setAuthenticationType(DynamicsAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     *
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: User name to access the Dynamics instance. Type: string (or Expression with resultType
     * string).
     *
     * @param username the username value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to access the Dynamics instance.
     *
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to access the Dynamics instance.
     *
     * @param password the password value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The client ID of the application in Azure Active Directory used for
     * Server-To-Server authentication. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @return the servicePrincipalCredentialType value.
     */
    public DynamicsServicePrincipalCredentialType getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     *
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServicePrincipalCredentialType(
            DynamicsServicePrincipalCredentialType servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @return the servicePrincipalCredential value.
     */
    public SecretBase getServicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     *
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the DynamicsLinkedService object itself.
     */
    public DynamicsLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }
}
