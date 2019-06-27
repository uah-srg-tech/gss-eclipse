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

import es.uah.aut.srg.gss.test_proc.GSSTestProcFilter;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel0;
import es.uah.aut.srg.gss.test_proc.test_procPackage;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Output Level0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel0Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputLevel0Impl#getLevel0_filter <em>Level0 filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcOutputLevel0Impl extends GSSTestProcOutputImpl implements GSSTestProcOutputLevel0 {
	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level0;

	/**
	 * The cached value of the '{@link #getLevel0_filter() <em>Level0 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0_filter()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcFilter level0_filter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcOutputLevel0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_OUTPUT_LEVEL0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (TMTCIFFormatFormat)eResolveProxy(oldLevel0);
			if (level0 != oldLevel0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0, oldLevel0, level0));
			}
		}
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(TMTCIFFormatFormat newLevel0) {
		TMTCIFFormatFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcFilter getLevel0_filter() {
		return level0_filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel0_filter(GSSTestProcFilter newLevel0_filter, NotificationChain msgs) {
		GSSTestProcFilter oldLevel0_filter = level0_filter;
		level0_filter = newLevel0_filter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER, oldLevel0_filter, newLevel0_filter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0_filter(GSSTestProcFilter newLevel0_filter) {
		if (newLevel0_filter != level0_filter) {
			NotificationChain msgs = null;
			if (level0_filter != null)
				msgs = ((InternalEObject)level0_filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER, null, msgs);
			if (newLevel0_filter != null)
				msgs = ((InternalEObject)newLevel0_filter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER, null, msgs);
			msgs = basicSetLevel0_filter(newLevel0_filter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER, newLevel0_filter, newLevel0_filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER:
				return basicSetLevel0_filter(null, msgs);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER:
				return getLevel0_filter();
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0:
				setLevel0((TMTCIFFormatFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER:
				setLevel0_filter((GSSTestProcFilter)newValue);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0:
				setLevel0((TMTCIFFormatFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER:
				setLevel0_filter((GSSTestProcFilter)null);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0:
				return level0 != null;
			case test_procPackage.GSS_TEST_PROC_OUTPUT_LEVEL0__LEVEL0_FILTER:
				return level0_filter != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSTestProcOutputLevel0Impl
