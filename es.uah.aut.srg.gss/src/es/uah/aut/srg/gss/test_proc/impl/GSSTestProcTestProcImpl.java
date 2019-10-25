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
package es.uah.aut.srg.gss.test_proc.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.test_proc.GSSTestProcStep;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Test Proc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcTestProcImpl#getStep <em>Step</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcTestProcImpl#getScenarioId <em>Scenario Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcTestProcImpl extends GSSModelElementImpl implements GSSTestProcTestProc {
	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestProcStep> step;

	/**
	 * The default value of the '{@link #getScenarioId() <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioId()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENARIO_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScenarioId() <em>Scenario Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioId()
	 * @generated
	 * @ordered
	 */
	protected String scenarioId = SCENARIO_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcTestProcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_TEST_PROC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestProcStep> getStep() {
		if (step == null) {
			step = new EObjectContainmentEList<GSSTestProcStep>(GSSTestProcStep.class, this, test_procPackage.GSS_TEST_PROC_TEST_PROC__STEP);
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScenarioId() {
		return scenarioId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenarioId(String newScenarioId) {
		String oldScenarioId = scenarioId;
		scenarioId = newScenarioId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_TEST_PROC__SCENARIO_ID, oldScenarioId, scenarioId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__STEP:
				return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__STEP:
				return getStep();
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__SCENARIO_ID:
				return getScenarioId();
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
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends GSSTestProcStep>)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__SCENARIO_ID:
				setScenarioId((String)newValue);
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
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__STEP:
				getStep().clear();
				return;
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__SCENARIO_ID:
				setScenarioId(SCENARIO_ID_EDEFAULT);
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
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__STEP:
				return step != null && !step.isEmpty();
			case test_procPackage.GSS_TEST_PROC_TEST_PROC__SCENARIO_ID:
				return SCENARIO_ID_EDEFAULT == null ? scenarioId != null : !SCENARIO_ID_EDEFAULT.equals(scenarioId);
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
		result.append(" (scenarioId: ");
		result.append(scenarioId);
		result.append(')');
		return result.toString();
	}

} //GSSTestProcTestProcImpl
