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

import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1;
import es.uah.aut.srg.gss.test_proc.test_procPackage;
import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;
import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Input Level1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getApp_to_level1 <em>App to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcInputLevel1Impl extends GSSTestProcInputImpl implements GSSTestProcInputLevel1 {
	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFFormatFormat level1;

	/**
	 * The cached value of the '{@link #getApp_to_level1() <em>App to level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level1()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport app_to_level1;

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
	 * The cached value of the '{@link #getLevel1_to_level0() <em>Level1 to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1_to_level0()
	 * @generated
	 * @ordered
	 */
	protected TMTCIFExportExport level1_to_level0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcInputLevel1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat getLevel1() {
		if (level1 != null && level1.eIsProxy()) {
			InternalEObject oldLevel1 = (InternalEObject)level1;
			level1 = (TMTCIFFormatFormat)eResolveProxy(oldLevel1);
			if (level1 != oldLevel1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1, oldLevel1, level1));
			}
		}
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFFormatFormat basicGetLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(TMTCIFFormatFormat newLevel1) {
		TMTCIFFormatFormat oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1, oldLevel1, level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getApp_to_level1() {
		if (app_to_level1 != null && app_to_level1.eIsProxy()) {
			InternalEObject oldApp_to_level1 = (InternalEObject)app_to_level1;
			app_to_level1 = (TMTCIFExportExport)eResolveProxy(oldApp_to_level1);
			if (app_to_level1 != oldApp_to_level1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1, oldApp_to_level1, app_to_level1));
			}
		}
		return app_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetApp_to_level1() {
		return app_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level1(TMTCIFExportExport newApp_to_level1) {
		TMTCIFExportExport oldApp_to_level1 = app_to_level1;
		app_to_level1 = newApp_to_level1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1, oldApp_to_level1, app_to_level1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0, oldLevel0, level0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0, oldLevel0, level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport getLevel1_to_level0() {
		if (level1_to_level0 != null && level1_to_level0.eIsProxy()) {
			InternalEObject oldLevel1_to_level0 = (InternalEObject)level1_to_level0;
			level1_to_level0 = (TMTCIFExportExport)eResolveProxy(oldLevel1_to_level0);
			if (level1_to_level0 != oldLevel1_to_level0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
			}
		}
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TMTCIFExportExport basicGetLevel1_to_level0() {
		return level1_to_level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1_to_level0(TMTCIFExportExport newLevel1_to_level0) {
		TMTCIFExportExport oldLevel1_to_level0 = level1_to_level0;
		level1_to_level0 = newLevel1_to_level0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1:
				if (resolve) return getLevel1();
				return basicGetLevel1();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1:
				if (resolve) return getApp_to_level1();
				return basicGetApp_to_level1();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0:
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1:
				setLevel1((TMTCIFFormatFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1:
				setApp_to_level1((TMTCIFExportExport)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0:
				setLevel0((TMTCIFFormatFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((TMTCIFExportExport)newValue);
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1:
				setLevel1((TMTCIFFormatFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1:
				setApp_to_level1((TMTCIFExportExport)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0:
				setLevel0((TMTCIFFormatFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0:
				setLevel1_to_level0((TMTCIFExportExport)null);
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1:
				return level1 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1:
				return app_to_level1 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0:
				return level0 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0:
				return level1_to_level0 != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSTestProcInputLevel1Impl
