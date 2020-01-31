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

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario GV Filtered</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVFilteredImpl#getGlobalVarRef <em>Global Var Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVFilteredImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioGVFilteredImpl extends MinimalEObjectImpl.Container implements GSSScenarioGVFiltered {
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
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioGVFilteredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_GV_FILTERED;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_GV_FILTERED__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_GV_FILTERED__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getFilter() {
		if (filter != null && filter.eIsProxy()) {
			InternalEObject oldFilter = (InternalEObject)filter;
			filter = (GSSFilterFilter)eResolveProxy(oldFilter);
			if (filter != oldFilter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_GV_FILTERED__FILTER, oldFilter, filter));
			}
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(GSSFilterFilter newFilter) {
		GSSFilterFilter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_GV_FILTERED__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__GLOBAL_VAR_REF:
				if (resolve) return getGlobalVarRef();
				return basicGetGlobalVarRef();
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__FILTER:
				if (resolve) return getFilter();
				return basicGetFilter();
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
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSScenarioGlobalVar)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__FILTER:
				setFilter((GSSFilterFilter)newValue);
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
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSScenarioGlobalVar)null);
				return;
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__FILTER:
				setFilter((GSSFilterFilter)null);
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
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__GLOBAL_VAR_REF:
				return globalVarRef != null;
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED__FILTER:
				return filter != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSScenarioGVFilteredImpl
