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

import es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar;
import es.uah.aut.srg.gss.scenario.GSSScenarioUnit;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario GV Periodic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVPeriodicImpl#getGlobalVarRef <em>Global Var Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVPeriodicImpl#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVPeriodicImpl#getPeriod_unit <em>Period unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioGVPeriodicImpl extends MinimalEObjectImpl.Container implements GSSScenarioGVPeriodic {
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
	 * The default value of the '{@link #getPeriod_value() <em>Period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_value()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIOD_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPeriod_value() <em>Period value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_value()
	 * @generated
	 * @ordered
	 */
	protected String period_value = PERIOD_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod_unit() <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioUnit PERIOD_UNIT_EDEFAULT = GSSScenarioUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getPeriod_unit() <em>Period unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioUnit period_unit = PERIOD_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioGVPeriodicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_GV_PERIODIC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_GV_PERIODIC__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_GV_PERIODIC__GLOBAL_VAR_REF, oldGlobalVarRef, globalVarRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPeriod_value() {
		return period_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod_value(String newPeriod_value) {
		String oldPeriod_value = period_value;
		period_value = newPeriod_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE, oldPeriod_value, period_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUnit getPeriod_unit() {
		return period_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod_unit(GSSScenarioUnit newPeriod_unit) {
		GSSScenarioUnit oldPeriod_unit = period_unit;
		period_unit = newPeriod_unit == null ? PERIOD_UNIT_EDEFAULT : newPeriod_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT, oldPeriod_unit, period_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__GLOBAL_VAR_REF:
				if (resolve) return getGlobalVarRef();
				return basicGetGlobalVarRef();
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE:
				return getPeriod_value();
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT:
				return getPeriod_unit();
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
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSScenarioGlobalVar)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE:
				setPeriod_value((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT:
				setPeriod_unit((GSSScenarioUnit)newValue);
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
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__GLOBAL_VAR_REF:
				setGlobalVarRef((GSSScenarioGlobalVar)null);
				return;
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE:
				setPeriod_value(PERIOD_VALUE_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT:
				setPeriod_unit(PERIOD_UNIT_EDEFAULT);
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
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__GLOBAL_VAR_REF:
				return globalVarRef != null;
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE:
				return PERIOD_VALUE_EDEFAULT == null ? period_value != null : !PERIOD_VALUE_EDEFAULT.equals(period_value);
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT:
				return period_unit != PERIOD_UNIT_EDEFAULT;
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
		result.append(" (period_value: ");
		result.append(period_value);
		result.append(", period_unit: ");
		result.append(period_unit);
		result.append(')');
		return result.toString();
	}

} //GSSScenarioGVPeriodicImpl
