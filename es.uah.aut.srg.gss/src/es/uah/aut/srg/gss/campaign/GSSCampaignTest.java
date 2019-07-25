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

import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Campaign Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getReq <em>Req</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getReqAction <em>Req Action</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignTest()
 * @model
 * @generated
 */
public interface GSSCampaignTest extends EObject {
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
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignTest_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference.
	 * @see #setProcedure(GSSTestProcTestProc)
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignTest_Procedure()
	 * @model required="true"
	 * @generated
	 */
	GSSTestProcTestProc getProcedure();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getProcedure <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(GSSTestProcTestProc value);

	/**
	 * Returns the value of the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req</em>' attribute.
	 * @see #setReq(String)
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignTest_Req()
	 * @model
	 * @generated
	 */
	String getReq();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getReq <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req</em>' attribute.
	 * @see #getReq()
	 * @generated
	 */
	void setReq(String value);

	/**
	 * Returns the value of the '<em><b>Req Action</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.campaign.GSSCampaignTestReqAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Action</em>' attribute.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestReqAction
	 * @see #isSetReqAction()
	 * @see #unsetReqAction()
	 * @see #setReqAction(GSSCampaignTestReqAction)
	 * @see es.uah.aut.srg.gss.campaign.campaignPackage#getGSSCampaignTest_ReqAction()
	 * @model unsettable="true"
	 * @generated
	 */
	GSSCampaignTestReqAction getReqAction();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getReqAction <em>Req Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Action</em>' attribute.
	 * @see es.uah.aut.srg.gss.campaign.GSSCampaignTestReqAction
	 * @see #isSetReqAction()
	 * @see #unsetReqAction()
	 * @see #getReqAction()
	 * @generated
	 */
	void setReqAction(GSSCampaignTestReqAction value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getReqAction <em>Req Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReqAction()
	 * @see #getReqAction()
	 * @see #setReqAction(GSSCampaignTestReqAction)
	 * @generated
	 */
	void unsetReqAction();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.campaign.GSSCampaignTest#getReqAction <em>Req Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Req Action</em>' attribute is set.
	 * @see #unsetReqAction()
	 * @see #getReqAction()
	 * @see #setReqAction(GSSCampaignTestReqAction)
	 * @generated
	 */
	boolean isSetReqAction();

} // GSSCampaignTest
