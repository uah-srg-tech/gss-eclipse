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
package es.uah.aut.srg.gss.test_list.impl;

import es.uah.aut.srg.gss.test_list.GSSTestListTestCase;
import es.uah.aut.srg.gss.test_list.GSSTestListTestList;
import es.uah.aut.srg.gss.test_list.test_listPackage;

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
 * An implementation of the model object '<em><b>GSS Test List Test List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_list.impl.GSSTestListTestListImpl#getTestCase <em>Test Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestListTestListImpl extends MinimalEObjectImpl.Container implements GSSTestListTestList {
	/**
	 * The cached value of the '{@link #getTestCase() <em>Test Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestCase()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestListTestCase> testCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestListTestListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_listPackage.Literals.GSS_TEST_LIST_TEST_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestListTestCase> getTestCase() {
		if (testCase == null) {
			testCase = new EObjectContainmentEList<GSSTestListTestCase>(GSSTestListTestCase.class, this, test_listPackage.GSS_TEST_LIST_TEST_LIST__TEST_CASE);
		}
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_listPackage.GSS_TEST_LIST_TEST_LIST__TEST_CASE:
				return ((InternalEList<?>)getTestCase()).basicRemove(otherEnd, msgs);
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
			case test_listPackage.GSS_TEST_LIST_TEST_LIST__TEST_CASE:
				return getTestCase();
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
			case test_listPackage.GSS_TEST_LIST_TEST_LIST__TEST_CASE:
				getTestCase().clear();
				getTestCase().addAll((Collection<? extends GSSTestListTestCase>)newValue);
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
			case test_listPackage.GSS_TEST_LIST_TEST_LIST__TEST_CASE:
				getTestCase().clear();
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
			case test_listPackage.GSS_TEST_LIST_TEST_LIST__TEST_CASE:
				return testCase != null && !testCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSTestListTestListImpl
