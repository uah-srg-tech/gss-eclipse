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

import es.uah.aut.srg.gss.export.GSSExportExport;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2;
import es.uah.aut.srg.gss.scenario.scenarioPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Scenario Periodic TC Level2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl#getApp_to_level2 <em>App to level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl#getLevel2_to_level1 <em>Level2 to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSScenarioPeriodicTCLevel2Impl extends GSSScenarioPeriodicTCImpl implements GSSScenarioPeriodicTCLevel2 {
	/**
	 * The cached value of the '{@link #getLevel2() <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level2;

	/**
	 * The cached value of the '{@link #getApp_to_level2() <em>App to level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level2()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport app_to_level2;

	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level1;

	/**
	 * The cached value of the '{@link #getLevel2_to_level1() <em>Level2 to level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel2_to_level1()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport level2_to_level1;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level0;

	/**
	 * The cached value of the '{@link #getLevel1_to_level0() <em>Level1 to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_to_level0()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport level1_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSScenarioPeriodicTCLevel2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scenarioPackage.Literals.GSS_SCENARIO_PERIODIC_TC_LEVEL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel2() {
		if (level2 != null && level2.eIsProxy()) {
			InternalEObject oldLevel2 = (InternalEObject)level2;
			level2 = (GSSFormatFormat)eResolveProxy(oldLevel2);
			if (level2 != oldLevel2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2, oldLevel2, level2));
			}
		}
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel2() {
		return level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2(GSSFormatFormat newLevel2) {
		GSSFormatFormat oldLevel2 = level2;
		level2 = newLevel2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2, oldLevel2, level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getApp_to_level2() {
		if (app_to_level2 != null && app_to_level2.eIsProxy()) {
			InternalEObject oldApp_to_level2 = (InternalEObject)app_to_level2;
			app_to_level2 = (GSSExportExport)eResolveProxy(oldApp_to_level2);
			if (app_to_level2 != oldApp_to_level2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2, oldApp_to_level2, app_to_level2));
			}
		}
		return app_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetApp_to_level2() {
		return app_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level2(GSSExportExport newApp_to_level2) {
		GSSExportExport oldApp_to_level2 = app_to_level2;
		app_to_level2 = newApp_to_level2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2, oldApp_to_level2, app_to_level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel1() {
		if (level1 != null && level1.eIsProxy()) {
			InternalEObject oldLevel1 = (InternalEObject)level1;
			level1 = (GSSFormatFormat)eResolveProxy(oldLevel1);
			if (level1 != oldLevel1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1, oldLevel1, level1));
			}
		}
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(GSSFormatFormat newLevel1) {
		GSSFormatFormat oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1, oldLevel1, level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getLevel2_to_level1() {
		if (level2_to_level1 != null && level2_to_level1.eIsProxy()) {
			InternalEObject oldLevel2_to_level1 = (InternalEObject)level2_to_level1;
			level2_to_level1 = (GSSExportExport)eResolveProxy(oldLevel2_to_level1);
			if (level2_to_level1 != oldLevel2_to_level1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
			}
		}
		return level2_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetLevel2_to_level1() {
		return level2_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel2_to_level1(GSSExportExport newLevel2_to_level1) {
		GSSExportExport oldLevel2_to_level1 = level2_to_level1;
		level2_to_level1 = newLevel2_to_level1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (GSSFormatFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(GSSFormatFormat newLevel0) {
		GSSFormatFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getLevel1_to_level0() {
		if (level1_to_level0 != null && level1_to_level0.eIsProxy()) {
			InternalEObject oldLevel1_to_level0 = (InternalEObject)level1_to_level0;
			level1_to_level0 = (GSSExportExport)eResolveProxy(oldLevel1_to_level0);
			if (level1_to_level0 != oldLevel1_to_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
			}
		}
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetLevel1_to_level0() {
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_to_level0(GSSExportExport newLevel1_to_level0) {
		GSSExportExport oldLevel1_to_level0 = level1_to_level0;
		level1_to_level0 = newLevel1_to_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2:
				if (resolve) return getLevel2();
				return basicGetLevel2();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				if (resolve) return getApp_to_level2();
				return basicGetApp_to_level2();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1:
				if (resolve) return getLevel1();
				return basicGetLevel1();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				if (resolve) return getLevel2_to_level1();
				return basicGetLevel2_to_level1();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				if (resolve) return getLevel1_to_level0();
				return basicGetLevel1_to_level0();
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2:
				setLevel2((GSSFormatFormat)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				setApp_to_level2((GSSExportExport)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1:
				setLevel1((GSSFormatFormat)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((GSSExportExport)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0:
				setLevel0((GSSFormatFormat)newValue);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((GSSExportExport)newValue);
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2:
				setLevel2((GSSFormatFormat)null);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				setApp_to_level2((GSSExportExport)null);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1:
				setLevel1((GSSFormatFormat)null);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((GSSExportExport)null);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0:
				setLevel0((GSSFormatFormat)null);
				return;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((GSSExportExport)null);
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
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2:
				return level2 != null;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2:
				return app_to_level2 != null;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1:
				return level1 != null;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1:
				return level2_to_level1 != null;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0:
				return level0 != null;
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0:
				return level1_to_level0 != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSScenarioPeriodicTCLevel2Impl
