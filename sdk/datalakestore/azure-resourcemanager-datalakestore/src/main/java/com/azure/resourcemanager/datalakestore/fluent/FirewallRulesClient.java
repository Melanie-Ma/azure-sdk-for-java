// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datalakestore.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.datalakestore.models.CreateOrUpdateFirewallRuleParameters;
import com.azure.resourcemanager.datalakestore.models.UpdateFirewallRuleParameters;

/** An instance of this class provides access to all the operations defined in FirewallRulesClient. */
public interface FirewallRulesClient {
    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store firewall rule list information.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallRuleInner> listByAccount(String resourceGroupName, String accountName);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store firewall rule list information.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallRuleInner> listByAccount(String resourceGroupName, String accountName, Context context);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be
     * replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param parameters Parameters supplied to create or update the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store firewall rule information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner createOrUpdate(
        String resourceGroupName,
        String accountName,
        String firewallRuleName,
        CreateOrUpdateFirewallRuleParameters parameters);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be
     * replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param parameters Parameters supplied to create or update the firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store firewall rule information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallRuleInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String accountName,
        String firewallRuleName,
        CreateOrUpdateFirewallRuleParameters parameters,
        Context context);

    /**
     * Gets the specified Data Lake Store firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner get(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Gets the specified Data Lake Store firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Data Lake Store firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallRuleInner> getWithResponse(
        String resourceGroupName, String accountName, String firewallRuleName, Context context);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store firewall rule information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner update(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Updates the specified firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to update.
     * @param parameters Parameters supplied to update the firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data Lake Store firewall rule information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallRuleInner> updateWithResponse(
        String resourceGroupName,
        String accountName,
        String firewallRuleName,
        UpdateFirewallRuleParameters parameters,
        Context context);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String firewallRuleName, Context context);
}
