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

import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputs;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

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
 * An implementation of the model object '<em><b>GSS Test Proc Inputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl#getInput_level_3 <em>Input level 3</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl#getInput_level_2 <em>Input level 2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl#getInput_level_1 <em>Input level 1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputsImpl#getInput_level_0 <em>Input level 0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcInputsImpl extends MinimalEObjectImpl.Container implements GSSTestProcInputs {
	/**
	 * The cached value of the '{@link #getInput_level_3() <em>Input level 3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_level_3()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestProcInputLevel3> input_level_3;

	/**
	 * The cached value of the '{@link #getInput_level_2() <em>Input level 2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_level_2()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestProcInputLevel2> input_level_2;

	/**
	 * The cached value of the '{@link #getInput_level_1() <em>Input level 1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_level_1()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestProcInputLevel1> input_level_1;

	/**
	 * The cached value of the '{@link #getInput_level_0() <em>Input level 0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_level_0()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestProcInputLevel0> input_level_0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcInputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_INPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestProcInputLevel3> getInput_level_3() {
		if (input_level_3 == null) {
			input_level_3 = new EObjectContainmentEList<GSSTestProcInputLevel3>(GSSTestProcInputLevel3.class, this, test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3);
		}
		return input_level_3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestProcInputLevel2> getInput_level_2() {
		if (input_level_2 == null) {
			input_level_2 = new EObjectContainmentEList<GSSTestProcInputLevel2>(GSSTestProcInputLevel2.class, this, test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2);
		}
		return input_level_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestProcInputLevel1> getInput_level_1() {
		if (input_level_1 == null) {
			input_level_1 = new EObjectContainmentEList<GSSTestProcInputLevel1>(GSSTestProcInputLevel1.class, this, test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1);
		}
		return input_level_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestProcInputLevel0> getInput_level_0() {
		if (input_level_0 == null) {
			input_level_0 = new EObjectContainmentEList<GSSTestProcInputLevel0>(GSSTestProcInputLevel0.class, this, test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0);
		}
		return input_level_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3:
				return ((InternalEList<?>)getInput_level_3()).basicRemove(otherEnd, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2:
				return ((InternalEList<?>)getInput_level_2()).basicRemove(otherEnd, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1:
				return ((InternalEList<?>)getInput_level_1()).basicRemove(otherEnd, msgs);
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0:
				return ((InternalEList<?>)getInput_level_0()).basicRemove(otherEnd, msgs);
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
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3:
				return getInput_level_3();
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2:
				return getInput_level_2();
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1:
				return getInput_level_1();
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0:
				return getInput_level_0();
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
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3:
				getInput_level_3().clear();
				getInput_level_3().addAll((Collection<? extends GSSTestProcInputLevel3>)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2:
				getInput_level_2().clear();
				getInput_level_2().addAll((Collection<? extends GSSTestProcInputLevel2>)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1:
				getInput_level_1().clear();
				getInput_level_1().addAll((Collection<? extends GSSTestProcInputLevel1>)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0:
				getInput_level_0().clear();
				getInput_level_0().addAll((Collection<? extends GSSTestProcInputLevel0>)newValue);
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
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3:
				getInput_level_3().clear();
				return;
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2:
				getInput_level_2().clear();
				return;
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1:
				getInput_level_1().clear();
				return;
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0:
				getInput_level_0().clear();
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
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_3:
				return input_level_3 != null && !input_level_3.isEmpty();
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_2:
				return input_level_2 != null && !input_level_2.isEmpty();
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_1:
				return input_level_1 != null && !input_level_1.isEmpty();
			case test_procPackage.GSS_TEST_PROC_INPUTS__INPUT_LEVEL_0:
				return input_level_0 != null && !input_level_0.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSTestProcInputsImpl
