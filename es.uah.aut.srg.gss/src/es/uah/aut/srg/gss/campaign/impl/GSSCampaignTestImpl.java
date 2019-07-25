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

import es.uah.aut.srg.gss.campaign.GSSCampaignTest;
import es.uah.aut.srg.gss.campaign.GSSCampaignTestReqAction;
import es.uah.aut.srg.gss.campaign.campaignPackage;

import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Campaign Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestImpl#getReq <em>Req</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.campaign.impl.GSSCampaignTestImpl#getReqAction <em>Req Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSCampaignTestImpl extends MinimalEObjectImpl.Container implements GSSCampaignTest {
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
	 * The default value of the '{@link #getReq() <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReq() <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReq()
	 * @generated
	 * @ordered
	 */
	protected String req = REQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqAction() <em>Req Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqAction()
	 * @generated
	 * @ordered
	 */
	protected static final GSSCampaignTestReqAction REQ_ACTION_EDEFAULT = GSSCampaignTestReqAction._1;

	/**
	 * The cached value of the '{@link #getReqAction() <em>Req Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqAction()
	 * @generated
	 * @ordered
	 */
	protected GSSCampaignTestReqAction reqAction = REQ_ACTION_EDEFAULT;

	/**
	 * This is true if the Req Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reqActionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSCampaignTestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return campaignPackage.Literals.GSS_CAMPAIGN_TEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, campaignPackage.GSS_CAMPAIGN_TEST__PROCEDURE, oldProcedure, procedure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST__PROCEDURE, oldProcedure, procedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReq() {
		return req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReq(String newReq) {
		String oldReq = req;
		req = newReq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST__REQ, oldReq, req));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSCampaignTestReqAction getReqAction() {
		return reqAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqAction(GSSCampaignTestReqAction newReqAction) {
		GSSCampaignTestReqAction oldReqAction = reqAction;
		reqAction = newReqAction == null ? REQ_ACTION_EDEFAULT : newReqAction;
		boolean oldReqActionESet = reqActionESet;
		reqActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, campaignPackage.GSS_CAMPAIGN_TEST__REQ_ACTION, oldReqAction, reqAction, !oldReqActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReqAction() {
		GSSCampaignTestReqAction oldReqAction = reqAction;
		boolean oldReqActionESet = reqActionESet;
		reqAction = REQ_ACTION_EDEFAULT;
		reqActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, campaignPackage.GSS_CAMPAIGN_TEST__REQ_ACTION, oldReqAction, REQ_ACTION_EDEFAULT, oldReqActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReqAction() {
		return reqActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case campaignPackage.GSS_CAMPAIGN_TEST__NAME:
				return getName();
			case campaignPackage.GSS_CAMPAIGN_TEST__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ:
				return getReq();
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ_ACTION:
				return getReqAction();
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
			case campaignPackage.GSS_CAMPAIGN_TEST__NAME:
				setName((String)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST__PROCEDURE:
				setProcedure((GSSTestProcTestProc)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ:
				setReq((String)newValue);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ_ACTION:
				setReqAction((GSSCampaignTestReqAction)newValue);
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
			case campaignPackage.GSS_CAMPAIGN_TEST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST__PROCEDURE:
				setProcedure((GSSTestProcTestProc)null);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ:
				setReq(REQ_EDEFAULT);
				return;
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ_ACTION:
				unsetReqAction();
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
			case campaignPackage.GSS_CAMPAIGN_TEST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case campaignPackage.GSS_CAMPAIGN_TEST__PROCEDURE:
				return procedure != null;
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ:
				return REQ_EDEFAULT == null ? req != null : !REQ_EDEFAULT.equals(req);
			case campaignPackage.GSS_CAMPAIGN_TEST__REQ_ACTION:
				return isSetReqAction();
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
		result.append(", req: ");
		result.append(req);
		result.append(", reqAction: ");
		if (reqActionESet) result.append(reqAction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSCampaignTestImpl