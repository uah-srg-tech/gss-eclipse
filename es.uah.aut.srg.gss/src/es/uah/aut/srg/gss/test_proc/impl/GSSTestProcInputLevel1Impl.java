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

import es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel1;
import es.uah.aut.srg.gss.test_proc.GSSTestProcUnit;
import es.uah.aut.srg.gss.test_proc.test_procPackage;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Input Level1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getDelay_unit <em>Delay unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getApp_to_level1 <em>App to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputLevel1Impl#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcInputLevel1Impl extends MinimalEObjectImpl.Container implements GSSTestProcInputLevel1 {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected String ifRef = IF_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected static final String DELAY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelay_value() <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_value()
	 * @generated
	 * @ordered
	 */
	protected String delay_value = DELAY_VALUE_EDEFAULT;

	/**
	 * This is true if the Delay value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delay_valueESet;

	/**
	 * The default value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTestProcUnit DELAY_UNIT_EDEFAULT = GSSTestProcUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcUnit delay_unit = DELAY_UNIT_EDEFAULT;

	/**
	 * This is true if the Delay unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delay_unitESet;

	/**
	 * The cached value of the '{@link #getLevel1() <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel1()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat level1;

	/**
	 * The cached value of the '{@link #getApp_to_level1() <em>App to level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApp_to_level1()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport app_to_level1;

	/**
	 * The cached value of the '{@link #getLevel0() <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel0()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat level0;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfRef() {
		return ifRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfRef(String newIfRef) {
		String oldIfRef = ifRef;
		ifRef = newIfRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__IF_REF, oldIfRef, ifRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelay_value() {
		return delay_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_value(String newDelay_value) {
		String oldDelay_value = delay_value;
		delay_value = newDelay_value;
		boolean oldDelay_valueESet = delay_valueESet;
		delay_valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE, oldDelay_value, delay_value, !oldDelay_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay_value() {
		String oldDelay_value = delay_value;
		boolean oldDelay_valueESet = delay_valueESet;
		delay_value = DELAY_VALUE_EDEFAULT;
		delay_valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE, oldDelay_value, DELAY_VALUE_EDEFAULT, oldDelay_valueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay_value() {
		return delay_valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcUnit getDelay_unit() {
		return delay_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_unit(GSSTestProcUnit newDelay_unit) {
		GSSTestProcUnit oldDelay_unit = delay_unit;
		delay_unit = newDelay_unit == null ? DELAY_UNIT_EDEFAULT : newDelay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT, oldDelay_unit, delay_unit, !oldDelay_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay_unit() {
		GSSTestProcUnit oldDelay_unit = delay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unit = DELAY_UNIT_EDEFAULT;
		delay_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT, oldDelay_unit, DELAY_UNIT_EDEFAULT, oldDelay_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelay_unit() {
		return delay_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getLevel1() {
		if (level1 != null && level1.eIsProxy()) {
			InternalEObject oldLevel1 = (InternalEObject)level1;
			level1 = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldLevel1);
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
	public GSSTmTcFormatTmTcFormat basicGetLevel1() {
		return level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel1(GSSTmTcFormatTmTcFormat newLevel1) {
		GSSTmTcFormatTmTcFormat oldLevel1 = level1;
		level1 = newLevel1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1, oldLevel1, level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getApp_to_level1() {
		if (app_to_level1 != null && app_to_level1.eIsProxy()) {
			InternalEObject oldApp_to_level1 = (InternalEObject)app_to_level1;
			app_to_level1 = (GSSExportExport)eResolveProxy(oldApp_to_level1);
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
	public GSSExportExport basicGetApp_to_level1() {
		return app_to_level1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp_to_level1(GSSExportExport newApp_to_level1) {
		GSSExportExport oldApp_to_level1 = app_to_level1;
		app_to_level1 = newApp_to_level1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1, oldApp_to_level1, app_to_level1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getLevel0() {
		if (level0 != null && level0.eIsProxy()) {
			InternalEObject oldLevel0 = (InternalEObject)level0;
			level0 = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldLevel0);
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
	public GSSTmTcFormatTmTcFormat basicGetLevel0() {
		return level0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel0(GSSTmTcFormatTmTcFormat newLevel0) {
		GSSTmTcFormatTmTcFormat oldLevel0 = level0;
		level0 = newLevel0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0, oldLevel0, level0));
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__NAME:
				return getName();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__IF_REF:
				return getIfRef();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE:
				return getDelay_value();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT:
				return getDelay_unit();
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__NAME:
				setName((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__IF_REF:
				setIfRef((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE:
				setDelay_value((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT:
				setDelay_unit((GSSTestProcUnit)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1:
				setLevel1((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1:
				setApp_to_level1((GSSExportExport)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0:
				setLevel0((GSSTmTcFormatTmTcFormat)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0:
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE:
				unsetDelay_value();
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT:
				unsetDelay_unit();
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1:
				setLevel1((GSSTmTcFormatTmTcFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__APP_TO_LEVEL1:
				setApp_to_level1((GSSExportExport)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL0:
				setLevel0((GSSTmTcFormatTmTcFormat)null);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__LEVEL1_TO_LEVEL0:
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
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_VALUE:
				return isSetDelay_value();
			case test_procPackage.GSS_TEST_PROC_INPUT_LEVEL1__DELAY_UNIT:
				return isSetDelay_unit();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", delay_value: ");
		if (delay_valueESet) result.append(delay_value); else result.append("<unset>");
		result.append(", delay_unit: ");
		if (delay_unitESet) result.append(delay_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSTestProcInputLevel1Impl
