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
package es.uah.aut.srg.gss.campaign.impl;

import es.uah.aut.srg.gss.campaign.GSSCampaignTestCase;
import es.uah.aut.srg.gss.campaign.campaignPackage;

import es.uah.aut.srg.gss.test_proc.GSSTestProcPrevAction;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Campaign Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl#getPrevMsg <em>Prev Msg</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl#getPrevAction <em>Prev Action</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestCaseImpl#getPrevActionParam <em>Prev Action Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSCampaignTestCaseImpl extends MinimalEObjectImpl.Container implements GSSCampaignTestCase {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcTestProc procedure;

	/**
	 * The default value of the '{@link #getPrevMsg() <em>Prev Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevMsg()
	 * @generated
	 * @ordered
	 */
	protected static final String PREV_MSG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevMsg() <em>Prev Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevMsg()
	 * @generated
	 * @ordered
	 */
	protected String prevMsg = PREV_MSG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevAction() <em>Prev Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevAction()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTestProcPrevAction PREV_ACTION_EDEFAULT = GSSTestProcPrevAction.RESET;

	/**
	 * The cached value of the '{@link #getPrevAction() <em>Prev Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevAction()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcPrevAction prevAction = PREV_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrevActionParam() <em>Prev Action Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevActionParam()
	 * @generated
	 * @ordered
	 */
	protected static final String PREV_ACTION_PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrevActionParam() <em>Prev Action Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevActionParam()
	 * @generated
	 * @ordered
	 */
	protected String prevActionParam = PREV_ACTION_PARAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSCampaignTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return campaignPackage.Literals.GSS_CAMPAIGN_TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcTestProc getProcedure() {
		if (procedure != null && procedure.eIsProxy()) {
			InternalEObject oldProcedure = (InternalEObject)procedure;
			procedure = (GSSTestProcTestProc)eResolveProxy(oldProcedure);
			if (procedure != oldProcedure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, campaignPackage.GSS_CAMPAIGN_TEST_CASE__PROCEDURE, oldProcedure, procedure));
			}
		}
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcTestProc basicGetProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(GSSTestProcTestProc newProcedure) {
		GSSTestProcTestProc oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST_CASE__PROCEDURE, oldProcedure, procedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrevMsg() {
		return prevMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevMsg(String newPrevMsg) {
		String oldPrevMsg = prevMsg;
		prevMsg = newPrevMsg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_MSG, oldPrevMsg, prevMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcPrevAction getPrevAction() {
		return prevAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevAction(GSSTestProcPrevAction newPrevAction) {
		GSSTestProcPrevAction oldPrevAction = prevAction;
		prevAction = newPrevAction == null ? PREV_ACTION_EDEFAULT : newPrevAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION, oldPrevAction, prevAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrevActionParam() {
		return prevActionParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevActionParam(String newPrevActionParam) {
		String oldPrevActionParam = prevActionParam;
		prevActionParam = newPrevActionParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION_PARAM, oldPrevActionParam, prevActionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__NAME:
				return getName();
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_MSG:
				return getPrevMsg();
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION:
				return getPrevAction();
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION_PARAM:
				return getPrevActionParam();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__NAME:
				setName((String)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PROCEDURE:
				setProcedure((GSSTestProcTestProc)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_MSG:
				setPrevMsg((String)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION:
				setPrevAction((GSSTestProcPrevAction)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION_PARAM:
				setPrevActionParam((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PROCEDURE:
				setProcedure((GSSTestProcTestProc)null);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_MSG:
				setPrevMsg(PREV_MSG_EDEFAULT);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION:
				setPrevAction(PREV_ACTION_EDEFAULT);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION_PARAM:
				setPrevActionParam(PREV_ACTION_PARAM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PROCEDURE:
				return procedure != null;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_MSG:
				return PREV_MSG_EDEFAULT == null ? prevMsg != null : !PREV_MSG_EDEFAULT.equals(prevMsg);
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION:
				return prevAction != PREV_ACTION_EDEFAULT;
			case campaignPackage.GSS_CAMPAIGN_TEST_CASE__PREV_ACTION_PARAM:
				return PREV_ACTION_PARAM_EDEFAULT == null ? prevActionParam != null : !PREV_ACTION_PARAM_EDEFAULT.equals(prevActionParam);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", prevMsg: ");
		result.append(prevMsg);
		result.append(", prevAction: ");
		result.append(prevAction);
		result.append(", prevActionParam: ");
		result.append(prevActionParam);
		result.append(')');
		return result.toString();
	}

} //GSSCampaignTestCaseImpl
