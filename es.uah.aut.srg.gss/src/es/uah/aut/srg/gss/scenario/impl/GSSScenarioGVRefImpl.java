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
package es.uah.aut.srg.gss.scenario.impl;

import es.uah.aut.srg.gss.scenario.GSSScenarioGVRef;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario GV Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVRefImpl#getGlobalVarRef <em>Global Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GSSScenarioGVRefImpl extends MinimalEObjectImpl.Container implements GSSScenarioGVRef {
	/**
	 * The cached value of the '{@link #getGlobalVarRef() <em>Global Var Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalVarRef()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioGlobalVar globalVarRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioGVRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_GV_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGlobalVar getGlobalVarRef() {
		if (globalVarRef != null && globalVarRef.eIsProxy()) {
			InternalEObject oldGlobalVarRef = (InternalEObject)globalVarRef;
			globalVarRef = (GSSScenarioGlobalVar)eResolveProxy(oldGlobalVarRef);
			if (globalVarRef != oldGlobalVarRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
			}
		}
		return globalVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGlobalVar basicGetGlobalVarRef() {
		return globalVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalVarRef(GSSScenarioGlobalVar newGlobalVarRef) {
		GSSScenarioGlobalVar oldGlobalVarRef = globalVarRef;
		globalVarRef = newGlobalVarRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF:
				if (resolve) return getGlobalVarRef();
				return basicGetGlobalVarRef();
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
			case scenarioPackage.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSScenarioGlobalVar)newValue);
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
			case scenarioPackage.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSScenarioGlobalVar)null);
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
			case scenarioPackage.GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF:
				return globalVarRef != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSScenarioGVRefImpl
