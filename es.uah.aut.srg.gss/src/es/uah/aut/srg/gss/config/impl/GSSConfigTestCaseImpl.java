/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigReqAction;
import es.uah.aut.srg.gss.config.GSSConfigTestCase;
import es.uah.aut.srg.gss.config.configPackage;

import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl#getReq <em>Req</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl#getReqAction <em>Req Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigTestCaseImpl extends MinimalEObjectImpl.Container implements GSSConfigTestCase {
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
	protected static final GSSConfigReqAction REQ_ACTION_EDEFAULT = GSSConfigReqAction._1;

	/**
	 * The cached value of the '{@link #getReqAction() <em>Req Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqAction()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigReqAction reqAction = REQ_ACTION_EDEFAULT;

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
	protected GSSConfigTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_TEST_CASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_TEST_CASE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_TEST_CASE__PROCEDURE, oldProcedure, procedure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_TEST_CASE__PROCEDURE, oldProcedure, procedure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_TEST_CASE__REQ, oldReq, req));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigReqAction getReqAction() {
		return reqAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqAction(GSSConfigReqAction newReqAction) {
		GSSConfigReqAction oldReqAction = reqAction;
		reqAction = newReqAction == null ? REQ_ACTION_EDEFAULT : newReqAction;
		boolean oldReqActionESet = reqActionESet;
		reqActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_TEST_CASE__REQ_ACTION, oldReqAction, reqAction, !oldReqActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReqAction() {
		GSSConfigReqAction oldReqAction = reqAction;
		boolean oldReqActionESet = reqActionESet;
		reqAction = REQ_ACTION_EDEFAULT;
		reqActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, configPackage.GSS_CONFIG_TEST_CASE__REQ_ACTION, oldReqAction, REQ_ACTION_EDEFAULT, oldReqActionESet));
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
			case configPackage.GSS_CONFIG_TEST_CASE__NAME:
				return getName();
			case configPackage.GSS_CONFIG_TEST_CASE__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case configPackage.GSS_CONFIG_TEST_CASE__REQ:
				return getReq();
			case configPackage.GSS_CONFIG_TEST_CASE__REQ_ACTION:
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
			case configPackage.GSS_CONFIG_TEST_CASE__NAME:
				setName((String)newValue);
				return;
			case configPackage.GSS_CONFIG_TEST_CASE__PROCEDURE:
				setProcedure((GSSTestProcTestProc)newValue);
				return;
			case configPackage.GSS_CONFIG_TEST_CASE__REQ:
				setReq((String)newValue);
				return;
			case configPackage.GSS_CONFIG_TEST_CASE__REQ_ACTION:
				setReqAction((GSSConfigReqAction)newValue);
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
			case configPackage.GSS_CONFIG_TEST_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_TEST_CASE__PROCEDURE:
				setProcedure((GSSTestProcTestProc)null);
				return;
			case configPackage.GSS_CONFIG_TEST_CASE__REQ:
				setReq(REQ_EDEFAULT);
				return;
			case configPackage.GSS_CONFIG_TEST_CASE__REQ_ACTION:
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
			case configPackage.GSS_CONFIG_TEST_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case configPackage.GSS_CONFIG_TEST_CASE__PROCEDURE:
				return procedure != null;
			case configPackage.GSS_CONFIG_TEST_CASE__REQ:
				return REQ_EDEFAULT == null ? req != null : !REQ_EDEFAULT.equals(req);
			case configPackage.GSS_CONFIG_TEST_CASE__REQ_ACTION:
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

} //GSSConfigTestCaseImpl
