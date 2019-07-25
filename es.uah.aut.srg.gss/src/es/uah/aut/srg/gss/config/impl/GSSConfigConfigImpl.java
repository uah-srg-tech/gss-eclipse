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

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.config.GSSConfigConfig;
import es.uah.aut.srg.gss.config.GSSConfigTests;
import es.uah.aut.srg.gss.config.configPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Config Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigConfigImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.impl.GSSConfigConfigImpl#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSConfigConfigImpl extends GSSModelElementImpl implements GSSConfigConfig {
	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected es.uah.aut.srg.gss.environment.GSSEnvironmentScenario scenario;

	/**
	 * The cached value of the '{@link #getTests() <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTests()
	 * @generated
	 * @ordered
	 */
	protected GSSConfigTests tests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSConfigConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return configPackage.Literals.GSS_CONFIG_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.uah.aut.srg.gss.environment.GSSEnvironmentScenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (es.uah.aut.srg.gss.environment.GSSEnvironmentScenario)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, configPackage.GSS_CONFIG_CONFIG__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public es.uah.aut.srg.gss.environment.GSSEnvironmentScenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(es.uah.aut.srg.gss.environment.GSSEnvironmentScenario newScenario) {
		es.uah.aut.srg.gss.environment.GSSEnvironmentScenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_CONFIG__SCENARIO, oldScenario, scenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigTests getTests() {
		return tests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTests(GSSConfigTests newTests, NotificationChain msgs) {
		GSSConfigTests oldTests = tests;
		tests = newTests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_CONFIG__TESTS, oldTests, newTests);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTests(GSSConfigTests newTests) {
		if (newTests != tests) {
			NotificationChain msgs = null;
			if (tests != null)
				msgs = ((InternalEObject)tests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_CONFIG__TESTS, null, msgs);
			if (newTests != null)
				msgs = ((InternalEObject)newTests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - configPackage.GSS_CONFIG_CONFIG__TESTS, null, msgs);
			msgs = basicSetTests(newTests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, configPackage.GSS_CONFIG_CONFIG__TESTS, newTests, newTests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case configPackage.GSS_CONFIG_CONFIG__TESTS:
				return basicSetTests(null, msgs);
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
			case configPackage.GSS_CONFIG_CONFIG__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
			case configPackage.GSS_CONFIG_CONFIG__TESTS:
				return getTests();
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
			case configPackage.GSS_CONFIG_CONFIG__SCENARIO:
				setScenario((es.uah.aut.srg.gss.environment.GSSEnvironmentScenario)newValue);
				return;
			case configPackage.GSS_CONFIG_CONFIG__TESTS:
				setTests((GSSConfigTests)newValue);
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
			case configPackage.GSS_CONFIG_CONFIG__SCENARIO:
				setScenario((es.uah.aut.srg.gss.environment.GSSEnvironmentScenario)null);
				return;
			case configPackage.GSS_CONFIG_CONFIG__TESTS:
				setTests((GSSConfigTests)null);
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
			case configPackage.GSS_CONFIG_CONFIG__SCENARIO:
				return scenario != null;
			case configPackage.GSS_CONFIG_CONFIG__TESTS:
				return tests != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSConfigConfigImpl
