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

import es.uah.aut.srg.gss.export.GSSExportExport;
import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel3;
import es.uah.aut.srg.gss.test_proc.test_procPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Input Level3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel3 <em>Level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getApp_to_level3 <em>App to level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel3_to_level2 <em>Level3 to level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel2_to_level1 <em>Level2 to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel3Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcInputLevel3Impl extends GSSTestProcInputImpl implements GSSTestProcInputLevel3 {
	/**
	 * The cached value of the '{@link #getLevel3() <em>Level3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFormat level3;

	/**
	 * The cached value of the '{@link #getApp_to_level3() <em>App to level3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level3()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport app_to_level3;

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
	 * The cached value of the '{@link #getLevel3_to_level2() <em>Level3 to level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel3_to_level2()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport level3_to_level2;

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
	protected GSSTestProcInputLevel3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_INPUT_LEVEL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat getLevel3() {
		if (level3 != null && level3.eIsProxy()) {
			InternalEObject oldLevel3 = (InternalEObject)level3;
			level3 = (GSSFormatFormat)eResolveProxy(oldLevel3);
			if (level3 != oldLevel3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3, oldLevel3, level3));
			}
		}
		return level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFormat basicGetLevel3() {
		return level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3(GSSFormatFormat newLevel3) {
		GSSFormatFormat oldLevel3 = level3;
		level3 = newLevel3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3, oldLevel3, level3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getApp_to_level3() {
		if (app_to_level3 != null && app_to_level3.eIsProxy()) {
			InternalEObject oldApp_to_level3 = (InternalEObject)app_to_level3;
			app_to_level3 = (GSSExportExport)eResolveProxy(oldApp_to_level3);
			if (app_to_level3 != oldApp_to_level3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3, oldApp_to_level3, app_to_level3));
			}
		}
		return app_to_level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetApp_to_level3() {
		return app_to_level3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level3(GSSExportExport newApp_to_level3) {
		GSSExportExport oldApp_to_level3 = app_to_level3;
		app_to_level3 = newApp_to_level3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3, oldApp_to_level3, app_to_level3));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2, oldLevel2, level2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2, oldLevel2, level2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getLevel3_to_level2() {
		if (level3_to_level2 != null && level3_to_level2.eIsProxy()) {
			InternalEObject oldLevel3_to_level2 = (InternalEObject)level3_to_level2;
			level3_to_level2 = (GSSExportExport)eResolveProxy(oldLevel3_to_level2);
			if (level3_to_level2 != oldLevel3_to_level2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2, oldLevel3_to_level2, level3_to_level2));
			}
		}
		return level3_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetLevel3_to_level2() {
		return level3_to_level2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel3_to_level2(GSSExportExport newLevel3_to_level2) {
		GSSExportExport oldLevel3_to_level2 = level3_to_level2;
		level3_to_level2 = newLevel3_to_level2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2, oldLevel3_to_level2, level3_to_level2));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1, oldLevel1, level1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1, oldLevel1, level1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1, oldLevel2_to_level1, level2_to_level1));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0, oldLevel0, level0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0, oldLevel0, level0));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0, oldLevel1_to_level0, level1_to_level0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				if (resolve) return getLevel3();
				return basicGetLevel3();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				if (resolve) return getApp_to_level3();
				return basicGetApp_to_level3();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				if (resolve) return getLevel2();
				return basicGetLevel2();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				if (resolve) return getLevel3_to_level2();
				return basicGetLevel3_to_level2();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				if (resolve) return getLevel1();
				return basicGetLevel1();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				if (resolve) return getLevel2_to_level1();
				return basicGetLevel2_to_level1();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				if (resolve) return getLevel0();
				return basicGetLevel0();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				setLevel3((GSSFormatFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				setApp_to_level3((GSSExportExport)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				setLevel2((GSSFormatFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				setLevel3_to_level2((GSSExportExport)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				setLevel1((GSSFormatFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((GSSExportExport)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				setLevel0((GSSFormatFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				setLevel3((GSSFormatFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				setApp_to_level3((GSSExportExport)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				setLevel2((GSSFormatFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				setLevel3_to_level2((GSSExportExport)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				setLevel1((GSSFormatFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				setLevel2_to_level1((GSSExportExport)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				setLevel0((GSSFormatFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3:
				return level3 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__APP_TO_LEVEL3:
				return app_to_level3 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2:
				return level2 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL3_TO_LEVEL2:
				return level3_to_level2 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1:
				return level1 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL2_TO_LEVEL1:
				return level2_to_level1 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL0:
				return level0 != null;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL3__LEVEL1_TO_LEVEL0:
				return level1_to_level0 != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSTestProcInputLevel3Impl
