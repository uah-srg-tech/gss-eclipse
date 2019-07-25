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

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.environment.GSSEnvironmentScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Campaign Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignCampaign()
 * @model
 * @generated
 */
public interface GSSCampaignCampaign extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(GSSEnvironmentScenario)
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignCampaign_Scenario()
	 * @model required="true"
	 * @generated
	 */
	GSSEnvironmentScenario getScenario();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(GSSEnvironmentScenario value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference.
	 * @see #setTests(GSSCampaignTests)
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignCampaign_Tests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSCampaignTests getTests();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignCampaign#getTests <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests</em>' containment reference.
	 * @see #getTests()
	 * @generated
	 */
	void setTests(GSSCampaignTests value);

} // GSSCampaignCampaign
