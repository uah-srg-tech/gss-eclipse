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
package es.uah.aut.srg.gss.test_campaign;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Campaign Test Campaign</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign#getTest <em>Test</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTestCampaign()
 * @model
 * @generated
 */
public interface GSSTestCampaignTestCampaign extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTestCampaign_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTestCampaign#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTestCampaign_Test()
	 * @model containment="true" required="true" upper="150"
	 * @generated
	 */
	EList<GSSTestCampaignTest> getTest();

} // GSSTestCampaignTestCampaign
