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

import es.uah.aut.srg.gss.test_proc.GSSTestProcPrevAction;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Campaign Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevMsg <em>Prev Msg</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevAction <em>Prev Action</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevActionParam <em>Prev Action Param</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTest()
 * @model
 * @generated
 */
public interface GSSTestCampaignTest extends EObject {
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
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTest_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(GSSTestProcTestProc)
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTest_Procedure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcTestProc getProcedure();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(GSSTestProcTestProc value);

	/**
	 * Returns the value of the '<em><b>Prev Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Msg</em>' attribute.
	 * @see #setPrevMsg(String)
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTest_PrevMsg()
	 * @model
	 * @generated
	 */
	String getPrevMsg();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevMsg <em>Prev Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Msg</em>' attribute.
	 * @see #getPrevMsg()
	 * @generated
	 */
	void setPrevMsg(String value);

	/**
	 * Returns the value of the '<em><b>Prev Action</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcPrevAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Action</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcPrevAction
	 * @see #setPrevAction(GSSTestProcPrevAction)
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTest_PrevAction()
	 * @model
	 * @generated
	 */
	GSSTestProcPrevAction getPrevAction();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevAction <em>Prev Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Action</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcPrevAction
	 * @see #getPrevAction()
	 * @generated
	 */
	void setPrevAction(GSSTestProcPrevAction value);

	/**
	 * Returns the value of the '<em><b>Prev Action Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev Action Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev Action Param</em>' attribute.
	 * @see #setPrevActionParam(String)
	 * @see es.uah.aut.srg.gss.test_campaign.test_campaignPackage#getGSSTestCampaignTest_PrevActionParam()
	 * @model
	 * @generated
	 */
	String getPrevActionParam();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_campaign.GSSTestCampaignTest#getPrevActionParam <em>Prev Action Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev Action Param</em>' attribute.
	 * @see #getPrevActionParam()
	 * @generated
	 */
	void setPrevActionParam(String value);

} // GSSTestCampaignTest
