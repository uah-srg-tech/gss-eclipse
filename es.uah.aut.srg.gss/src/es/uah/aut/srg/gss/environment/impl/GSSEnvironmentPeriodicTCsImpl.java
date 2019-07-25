/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.environment.impl;

import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs;
import es.uah.aut.srg.gss.environment.environmentPackage;

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
 * An implementation of the model object '<em><b>GSS Environment Periodic TCs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCsImpl#getPeriodicTC_level_2 <em>Periodic TC level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCsImpl#getPeriodicTC_level_1 <em>Periodic TC level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCsImpl#getPeriodicTC_level_0 <em>Periodic TC level 0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentPeriodicTCsImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentPeriodicTCs {
	/**
	 * The cached value of the '{@link #getPeriodicTC_level_2() <em>Periodic TC level 2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_2()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentPeriodicTCLevel2> periodicTC_level_2;

	/**
	 * The cached value of the '{@link #getPeriodicTC_level_1() <em>Periodic TC level 1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_1()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentPeriodicTCLevel1> periodicTC_level_1;

	/**
	 * The cached value of the '{@link #getPeriodicTC_level_0() <em>Periodic TC level 0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicTC_level_0()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentPeriodicTCLevel0> periodicTC_level_0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentPeriodicTCsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PERIODIC_TCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentPeriodicTCLevel2> getPeriodicTC_level_2() {
		if (periodicTC_level_2 == null) {
			periodicTC_level_2 = new EObjectContainmentEList<GSSEnvironmentPeriodicTCLevel2>(GSSEnvironmentPeriodicTCLevel2.class, this, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2);
		}
		return periodicTC_level_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentPeriodicTCLevel1> getPeriodicTC_level_1() {
		if (periodicTC_level_1 == null) {
			periodicTC_level_1 = new EObjectContainmentEList<GSSEnvironmentPeriodicTCLevel1>(GSSEnvironmentPeriodicTCLevel1.class, this, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1);
		}
		return periodicTC_level_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentPeriodicTCLevel0> getPeriodicTC_level_0() {
		if (periodicTC_level_0 == null) {
			periodicTC_level_0 = new EObjectContainmentEList<GSSEnvironmentPeriodicTCLevel0>(GSSEnvironmentPeriodicTCLevel0.class, this, environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0);
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return ((InternalEList<?>)getPeriodicTC_level_2()).basicRemove(otherEnd, msgs);
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return ((InternalEList<?>)getPeriodicTC_level_1()).basicRemove(otherEnd, msgs);
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return getPeriodicTC_level_2();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return getPeriodicTC_level_1();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				getPeriodicTC_level_2().clear();
				getPeriodicTC_level_2().addAll((Collection<? extends GSSEnvironmentPeriodicTCLevel2>)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				getPeriodicTC_level_1().clear();
				getPeriodicTC_level_1().addAll((Collection<? extends GSSEnvironmentPeriodicTCLevel1>)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				getPeriodicTC_level_0().clear();
				getPeriodicTC_level_0().addAll((Collection<? extends GSSEnvironmentPeriodicTCLevel0>)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				getPeriodicTC_level_2().clear();
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				getPeriodicTC_level_1().clear();
				return;
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
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
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2:
				return periodicTC_level_2 != null && !periodicTC_level_2.isEmpty();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1:
				return periodicTC_level_1 != null && !periodicTC_level_1.isEmpty();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0:
				return periodicTC_level_0 != null && !periodicTC_level_0.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentPeriodicTCsImpl
