/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs;
import es.uah.aut.srg.gss.config.configPackage;

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
 * An implementation of the model object '<em><b>GSS Config Periodic TCs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCsImpl#getPeriodicTC_level_2 <em>Periodic TC level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCsImpl#getPeriodicTC_level_1 <em>Periodic TC level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCsImpl#getPeriodicTC_level_0 <em>Periodic TC level 0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigPeriodicTCsImpl extends MinimalEObjectImpl.Container implements GSSConfigPeriodicTCs {
	/**
	 * The cached value of the '{@link #getPeriodicTC_level_2() <em>Periodic TC level 2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_2()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigPeriodicTCLevel2> periodicTC_level_2;

	/**
	 * The cached value of the '{@link #getPeriodicTC_level_1() <em>Periodic TC level 1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_1()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigPeriodicTCLevel1> periodicTC_level_1;

	/**
	 * The cached value of the '{@link #getPeriodicTC_level_0() <em>Periodic TC level 0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_0()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSConfigPeriodicTCLevel0> periodicTC_level_0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigPeriodicTCsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_PERIODIC_TCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigPeriodicTCLevel2> getPeriodicTC_level_2() {
		if (periodicTC_level_2 == null) {
			periodicTC_level_2 = new EObjectContainmentEList<GSSConfigPeriodicTCLevel2>(GSSConfigPeriodicTCLevel2.class, this, configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2);
		}
		return periodicTC_level_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigPeriodicTCLevel1> getPeriodicTC_level_1() {
		if (periodicTC_level_1 == null) {
			periodicTC_level_1 = new EObjectContainmentEList<GSSConfigPeriodicTCLevel1>(GSSConfigPeriodicTCLevel1.class, this, configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1);
		}
		return periodicTC_level_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSConfigPeriodicTCLevel0> getPeriodicTC_level_0() {
		if (periodicTC_level_0 == null) {
			periodicTC_level_0 = new EObjectContainmentEList<GSSConfigPeriodicTCLevel0>(GSSConfigPeriodicTCLevel0.class, this, configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0);
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
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return ((InternalEList<?>)getPeriodicTC_level_2()).basicRemove(otherEnd, msgs);
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return ((InternalEList<?>)getPeriodicTC_level_1()).basicRemove(otherEnd, msgs);
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
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
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return getPeriodicTC_level_2();
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return getPeriodicTC_level_1();
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
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
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				getPeriodicTC_level_2().clear();
				getPeriodicTC_level_2().addAll((Collection<? extends GSSConfigPeriodicTCLevel2>)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				getPeriodicTC_level_1().clear();
				getPeriodicTC_level_1().addAll((Collection<? extends GSSConfigPeriodicTCLevel1>)newValue);
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				getPeriodicTC_level_0().clear();
				getPeriodicTC_level_0().addAll((Collection<? extends GSSConfigPeriodicTCLevel0>)newValue);
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
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				getPeriodicTC_level_2().clear();
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				getPeriodicTC_level_1().clear();
				return;
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
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
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return periodicTC_level_2 != null && !periodicTC_level_2.isEmpty();
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return periodicTC_level_1 != null && !periodicTC_level_1.isEmpty();
			case configPackage.GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				return periodicTC_level_0 != null && !periodicTC_level_0.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigPeriodicTCsImpl
