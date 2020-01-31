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

import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Periodic TCs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCsImpl#getPeriodicTC_level_2 <em>Periodic TC level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCsImpl#getPeriodicTC_level_1 <em>Periodic TC level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCsImpl#getPeriodicTC_level_0 <em>Periodic TC level 0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioPeriodicTCsImpl extends MinimalEObjectImpl.Container implements GSSScenarioPeriodicTCs {
	/**
	 * The cached value of the '{@link #getPeriodicTC_level_2() <em>Periodic TC level 2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_2()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioPeriodicTCLevel2> periodicTC_level_2;

	/**
	 * The cached value of the '{@link #getPeriodicTC_level_1() <em>Periodic TC level 1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_1()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioPeriodicTCLevel1> periodicTC_level_1;

	/**
	 * The cached value of the '{@link #getPeriodicTC_level_0() <em>Periodic TC level 0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_0()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSScenarioPeriodicTCLevel0> periodicTC_level_0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioPeriodicTCsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_PERIODIC_TCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioPeriodicTCLevel2> getPeriodicTC_level_2() {
		if (periodicTC_level_2 == null) {
			periodicTC_level_2 = new EObjectContainmentEList<GSSScenarioPeriodicTCLevel2>(GSSScenarioPeriodicTCLevel2.class, this, scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_2);
		}
		return periodicTC_level_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioPeriodicTCLevel1> getPeriodicTC_level_1() {
		if (periodicTC_level_1 == null) {
			periodicTC_level_1 = new EObjectContainmentEList<GSSScenarioPeriodicTCLevel1>(GSSScenarioPeriodicTCLevel1.class, this, scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_1);
		}
		return periodicTC_level_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSScenarioPeriodicTCLevel0> getPeriodicTC_level_0() {
		if (periodicTC_level_0 == null) {
			periodicTC_level_0 = new EObjectContainmentEList<GSSScenarioPeriodicTCLevel0>(GSSScenarioPeriodicTCLevel0.class, this, scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_0);
		}
		return periodicTC_level_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return ((InternalEList<?>)getPeriodicTC_level_2()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return ((InternalEList<?>)getPeriodicTC_level_1()).basicRemove(otherEnd, msgs);
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				return ((InternalEList<?>)getPeriodicTC_level_0()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return getPeriodicTC_level_2();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return getPeriodicTC_level_1();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				return getPeriodicTC_level_0();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				getPeriodicTC_level_2().clear();
				getPeriodicTC_level_2().addAll((Collection<? extends GSSScenarioPeriodicTCLevel2>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				getPeriodicTC_level_1().clear();
				getPeriodicTC_level_1().addAll((Collection<? extends GSSScenarioPeriodicTCLevel1>)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				getPeriodicTC_level_0().clear();
				getPeriodicTC_level_0().addAll((Collection<? extends GSSScenarioPeriodicTCLevel0>)newValue);
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				getPeriodicTC_level_2().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				getPeriodicTC_level_1().clear();
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				getPeriodicTC_level_0().clear();
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return periodicTC_level_2 != null && !periodicTC_level_2.isEmpty();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return periodicTC_level_1 != null && !periodicTC_level_1.isEmpty();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				return periodicTC_level_0 != null && !periodicTC_level_0.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSScenarioPeriodicTCsImpl
