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

import es.uah.aut.srg.gss.filters.GSSFilterFilter;

import es.uah.aut.srg.gss.test_proc.GSSTestProcLevel0Filter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcYesNo;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Level0 Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel0FilterImpl#getApply_def_filter <em>Apply def filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcLevel0FilterImpl#getExtra_filter <em>Extra filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcLevel0FilterImpl extends MinimalEObjectImpl.Container implements GSSTestProcLevel0Filter {
	/**
	 * The default value of the '{@link #getApply_def_filter() <em>Apply def filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply_def_filter()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTestProcYesNo APPLY_DEF_FILTER_EDEFAULT = GSSTestProcYesNo.YES;

	/**
	 * The cached value of the '{@link #getApply_def_filter() <em>Apply def filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApply_def_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcYesNo apply_def_filter = APPLY_DEF_FILTER_EDEFAULT;

	/**
	 * This is true if the Apply def filter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean apply_def_filterESet;

	/**
	 * The cached value of the '{@link #getExtra_filter() <em>Extra filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFilter extra_filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcLevel0FilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_LEVEL0_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcYesNo getApply_def_filter() {
		return apply_def_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApply_def_filter(GSSTestProcYesNo newApply_def_filter) {
		GSSTestProcYesNo oldApply_def_filter = apply_def_filter;
		apply_def_filter = newApply_def_filter == null ? APPLY_DEF_FILTER_EDEFAULT : newApply_def_filter;
		boolean oldApply_def_filterESet = apply_def_filterESet;
		apply_def_filterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER, oldApply_def_filter, apply_def_filter, !oldApply_def_filterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApply_def_filter() {
		GSSTestProcYesNo oldApply_def_filter = apply_def_filter;
		boolean oldApply_def_filterESet = apply_def_filterESet;
		apply_def_filter = APPLY_DEF_FILTER_EDEFAULT;
		apply_def_filterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER, oldApply_def_filter, APPLY_DEF_FILTER_EDEFAULT, oldApply_def_filterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApply_def_filter() {
		return apply_def_filterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter getExtra_filter() {
		if (extra_filter != null && extra_filter.eIsProxy()) {
			InternalEObject oldExtra_filter = (InternalEObject)extra_filter;
			extra_filter = (GSSFilterFilter)eResolveProxy(oldExtra_filter);
			if (extra_filter != oldExtra_filter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER, oldExtra_filter, extra_filter));
			}
		}
		return extra_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFilter basicGetExtra_filter() {
		return extra_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtra_filter(GSSFilterFilter newExtra_filter) {
		GSSFilterFilter oldExtra_filter = extra_filter;
		extra_filter = newExtra_filter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER, oldExtra_filter, extra_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER:
				return getApply_def_filter();
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER:
				if (resolve) return getExtra_filter();
				return basicGetExtra_filter();
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
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER:
				setApply_def_filter((GSSTestProcYesNo)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER:
				setExtra_filter((GSSFilterFilter)newValue);
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
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER:
				unsetApply_def_filter();
				return;
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER:
				setExtra_filter((GSSFilterFilter)null);
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
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__APPLY_DEF_FILTER:
				return isSetApply_def_filter();
			case test_procPackage.GSS_TEST_PROC_LEVEL0_FILTER__EXTRA_FILTER:
				return extra_filter != null;
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
		result.append(" (apply_def_filter: ");
		if (apply_def_filterESet) result.append(apply_def_filter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSTestProcLevel0FilterImpl
