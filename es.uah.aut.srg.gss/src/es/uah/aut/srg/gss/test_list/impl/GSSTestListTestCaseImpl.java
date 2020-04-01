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
package es.uah.aut.srg.gss.test_list.impl;

import es.uah.aut.srg.gss.test_list.GSSTestListPrevAction;
import es.uah.aut.srg.gss.test_list.GSSTestListTestCase;
import es.uah.aut.srg.gss.test_list.test_listPackage;

import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test List Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl#getPrevMsg <em>Prev Msg</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl#getPrevAction <em>Prev Action</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestCaseImpl#getPrevActionParam <em>Prev Action Param</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestListTestCaseImpl extends MinimalEObjectImpl.Container implements GSSTestListTestCase {
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
	protected static final GSSTestListPrevAction PREV_ACTION_EDEFAULT = GSSTestListPrevAction.NONE;

	/**
	 * The cached value of the '{@link #getPrevAction() <em>Prev Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevAction()
	 * @generated
	 * @ordered
	 */
	protected GSSTestListPrevAction prevAction = PREV_ACTION_EDEFAULT;

	/**
	 * This is true if the Prev Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prevActionESet;

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
	protected GSSTestListTestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_listPackage.Literals.GSS_TEST_LIST_TEST_CASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_listPackage.GSS_TEST_LIST_TEST_CASE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_listPackage.GSS_TEST_LIST_TEST_CASE__PROCEDURE, oldProcedure, procedure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_listPackage.GSS_TEST_LIST_TEST_CASE__PROCEDURE, oldProcedure, procedure));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_MSG, oldPrevMsg, prevMsg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestListPrevAction getPrevAction() {
		return prevAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevAction(GSSTestListPrevAction newPrevAction) {
		GSSTestListPrevAction oldPrevAction = prevAction;
		prevAction = newPrevAction == null ? PREV_ACTION_EDEFAULT : newPrevAction;
		boolean oldPrevActionESet = prevActionESet;
		prevActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION, oldPrevAction, prevAction, !oldPrevActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrevAction() {
		GSSTestListPrevAction oldPrevAction = prevAction;
		boolean oldPrevActionESet = prevActionESet;
		prevAction = PREV_ACTION_EDEFAULT;
		prevActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION, oldPrevAction, PREV_ACTION_EDEFAULT, oldPrevActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrevAction() {
		return prevActionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM, oldPrevActionParam, prevActionParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__NAME:
				return getName();
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PROCEDURE:
				if (resolve) return getProcedure();
				return basicGetProcedure();
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_MSG:
				return getPrevMsg();
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION:
				return getPrevAction();
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM:
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
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__NAME:
				setName((String)newValue);
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PROCEDURE:
				setProcedure((GSSTestProcTestProc)newValue);
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_MSG:
				setPrevMsg((String)newValue);
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION:
				setPrevAction((GSSTestListPrevAction)newValue);
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM:
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
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PROCEDURE:
				setProcedure((GSSTestProcTestProc)null);
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_MSG:
				setPrevMsg(PREV_MSG_EDEFAULT);
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION:
				unsetPrevAction();
				return;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM:
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
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PROCEDURE:
				return procedure != null;
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_MSG:
				return PREV_MSG_EDEFAULT == null ? prevMsg != null : !PREV_MSG_EDEFAULT.equals(prevMsg);
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION:
				return isSetPrevAction();
			case test_listPackage.GSS_TEST_LIST_TEST_CASE__PREV_ACTION_PARAM:
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
		if (prevActionESet) result.append(prevAction); else result.append("<unset>");
		result.append(", prevActionParam: ");
		result.append(prevActionParam);
		result.append(')');
		return result.toString();
	}

} //GSSTestListTestCaseImpl
