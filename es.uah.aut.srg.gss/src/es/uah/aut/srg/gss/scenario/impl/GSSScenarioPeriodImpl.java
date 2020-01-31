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

import es.uah.aut.srg.gss.scenario.GSSScenarioPeriod;
import es.uah.aut.srg.gss.scenario.GSSScenarioUnit;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Period</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl#getMin_value <em>Min value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl#getMin_unit <em>Min unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl#getMax_value <em>Max value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl#getMax_unit <em>Max unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioPeriodImpl extends MinimalEObjectImpl.Container implements GSSScenarioPeriod {
	/**
	 * The default value of the '{@link #getMin_value() <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMin_value() <em>Min value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_value()
	 * @generated
	 * @ordered
	 */
	protected String min_value = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_unit() <em>Min unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioUnit MIN_UNIT_EDEFAULT = GSSScenarioUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getMin_unit() <em>Min unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioUnit min_unit = MIN_UNIT_EDEFAULT;

	/**
	 * This is true if the Min unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean min_unitESet;

	/**
	 * The default value of the '{@link #getMax_value() <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMax_value() <em>Max value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_value()
	 * @generated
	 * @ordered
	 */
	protected String max_value = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_unit() <em>Max unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSScenarioUnit MAX_UNIT_EDEFAULT = GSSScenarioUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getMax_unit() <em>Max unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSScenarioUnit max_unit = MAX_UNIT_EDEFAULT;

	/**
	 * This is true if the Max unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean max_unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_PERIOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMin_value() {
		return min_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_value(String newMin_value) {
		String oldMin_value = min_value;
		min_value = newMin_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIOD__MIN_VALUE, oldMin_value, min_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUnit getMin_unit() {
		return min_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin_unit(GSSScenarioUnit newMin_unit) {
		GSSScenarioUnit oldMin_unit = min_unit;
		min_unit = newMin_unit == null ? MIN_UNIT_EDEFAULT : newMin_unit;
		boolean oldMin_unitESet = min_unitESet;
		min_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIOD__MIN_UNIT, oldMin_unit, min_unit, !oldMin_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMin_unit() {
		GSSScenarioUnit oldMin_unit = min_unit;
		boolean oldMin_unitESet = min_unitESet;
		min_unit = MIN_UNIT_EDEFAULT;
		min_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_PERIOD__MIN_UNIT, oldMin_unit, MIN_UNIT_EDEFAULT, oldMin_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMin_unit() {
		return min_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMax_value() {
		return max_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_value(String newMax_value) {
		String oldMax_value = max_value;
		max_value = newMax_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIOD__MAX_VALUE, oldMax_value, max_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUnit getMax_unit() {
		return max_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_unit(GSSScenarioUnit newMax_unit) {
		GSSScenarioUnit oldMax_unit = max_unit;
		max_unit = newMax_unit == null ? MAX_UNIT_EDEFAULT : newMax_unit;
		boolean oldMax_unitESet = max_unitESet;
		max_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIOD__MAX_UNIT, oldMax_unit, max_unit, !oldMax_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMax_unit() {
		GSSScenarioUnit oldMax_unit = max_unit;
		boolean oldMax_unitESet = max_unitESet;
		max_unit = MAX_UNIT_EDEFAULT;
		max_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_PERIOD__MAX_UNIT, oldMax_unit, MAX_UNIT_EDEFAULT, oldMax_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMax_unit() {
		return max_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_VALUE:
				return getMin_value();
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_UNIT:
				return getMin_unit();
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_VALUE:
				return getMax_value();
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_UNIT:
				return getMax_unit();
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
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_VALUE:
				setMin_value((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_UNIT:
				setMin_unit((GSSScenarioUnit)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_VALUE:
				setMax_value((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_UNIT:
				setMax_unit((GSSScenarioUnit)newValue);
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
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_VALUE:
				setMin_value(MIN_VALUE_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_UNIT:
				unsetMin_unit();
				return;
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_VALUE:
				setMax_value(MAX_VALUE_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_UNIT:
				unsetMax_unit();
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
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_VALUE:
				return MIN_VALUE_EDEFAULT == null ? min_value != null : !MIN_VALUE_EDEFAULT.equals(min_value);
			case scenarioPackage.GSS_SCENARIO_PERIOD__MIN_UNIT:
				return isSetMin_unit();
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_VALUE:
				return MAX_VALUE_EDEFAULT == null ? max_value != null : !MAX_VALUE_EDEFAULT.equals(max_value);
			case scenarioPackage.GSS_SCENARIO_PERIOD__MAX_UNIT:
				return isSetMax_unit();
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
		result.append(" (min_value: ");
		result.append(min_value);
		result.append(", min_unit: ");
		if (min_unitESet) result.append(min_unit); else result.append("<unset>");
		result.append(", max_value: ");
		result.append(max_value);
		result.append(", max_unit: ");
		if (max_unitESet) result.append(max_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSScenarioPeriodImpl
