package org.talend.policy.resolver.definitions.provider;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.talend.policy.resolver.definitions.PolicyDefinitionDescription;

/**
 * Interface for policy definition retrieving components.
 *
 */
public interface PolicyDefinitionProvider {

	/**
	 * Retrieve the Policies for a service provider.
	 *
	 * @param serviceProviderName the provider WSDL service name.
	 * @return assigned policies, an empty Collection if there are none.
	 */
	Collection<PolicyDefinitionDescription> getPolicyDefinitions(QName serviceProviderName);
}