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

import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC;
import es.uah.aut.srg.gss.scenario.GSSScenarioUnit;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Periodic TC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl#getPeriod_value <em>Period value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl#getPeriod_unit <em>Period unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioPeriodicTCImpl extends MinimalEObjectImpl.Container implements GSSScenarioPeriodicTC {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected String ifRef = IF_REF_EDEFAULT;

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
	 * This is true if the Period unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean period_unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioPeriodicTCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_PERIODIC_TC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfRef() {
		return ifRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfRef(String newIfRef) {
		String oldIfRef = ifRef;
		ifRef = newIfRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC__IF_REF, oldIfRef, ifRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE, oldPeriod_value, period_value));
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
		boolean oldPeriod_unitESet = period_unitESet;
		period_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT, oldPeriod_unit, period_unit, !oldPeriod_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod_unit() {
		GSSScenarioUnit oldPeriod_unit = period_unit;
		boolean oldPeriod_unitESet = period_unitESet;
		period_unit = PERIOD_UNIT_EDEFAULT;
		period_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT, oldPeriod_unit, PERIOD_UNIT_EDEFAULT, oldPeriod_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod_unit() {
		return period_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__NAME:
				return getName();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__ID:
				return getId();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__IF_REF:
				return getIfRef();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE:
				return getPeriod_value();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT:
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__NAME:
				setName((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__ID:
				setId((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__IF_REF:
				setIfRef((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE:
				setPeriod_value((String)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT:
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__ID:
				setId(ID_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE:
				setPeriod_value(PERIOD_VALUE_EDEFAULT);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT:
				unsetPeriod_unit();
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE:
				return PERIOD_VALUE_EDEFAULT == null ? period_value != null : !PERIOD_VALUE_EDEFAULT.equals(period_value);
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT:
				return isSetPeriod_unit();
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
		result.append(", id: ");
		result.append(id);
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", period_value: ");
		result.append(period_value);
		result.append(", period_unit: ");
		if (period_unitESet) result.append(period_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSScenarioPeriodicTCImpl
