/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.campaign;

import es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment;
import es.uah.aut.srg.gss.scenario.GSSScenarioScenario;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Campaign Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getScenario <em>Scenario</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignScenario()
 * @model
 * @generated
 */
public interface GSSCampaignScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(GSSEnvironmentEnvironment)
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignScenario_Environment()
	 * @model required="true"
	 * @generated
	 */
	GSSEnvironmentEnvironment getEnvironment();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(GSSEnvironmentEnvironment value);

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(GSSScenarioScenario)
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignScenario_Scenario()
	 * @model required="true"
	 * @generated
	 */
	GSSScenarioScenario getScenario();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignScenario#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(GSSScenarioScenario value);

} // GSSCampaignScenario
