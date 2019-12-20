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

import es.uah.aut.srg.gss.test_proc.GSSTestProcCheckmode;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutput;
import es.uah.aut.srg.gss.test_proc.GSSTestProcOutputs;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Outputs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl#getCheckmode <em>Checkmode</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl#getValid_time_interval_value <em>Valid time interval value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl#getValid_time_interval_unit <em>Valid time interval unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputsImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTestProcOutputsImpl extends MinimalEObjectImpl.Container implements GSSTestProcOutputs {
	/**
	 * The default value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTestProcCheckmode CHECKMODE_EDEFAULT = GSSTestProcCheckmode.ALL;

	/**
	 * The cached value of the '{@link #getCheckmode() <em>Checkmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckmode()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcCheckmode checkmode = CHECKMODE_EDEFAULT;

	/**
	 * This is true if the Checkmode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean checkmodeESet;

	/**
	 * The default value of the '{@link #getValid_time_interval_value() <em>Valid time interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_value()
	 * @generated
	 * @ordered
	 */
	protected static final String VALID_TIME_INTERVAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValid_time_interval_value() <em>Valid time interval value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_value()
	 * @generated
	 * @ordered
	 */
	protected String valid_time_interval_value = VALID_TIME_INTERVAL_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid_time_interval_unit() <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_unit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTestProcTimeUnit VALID_TIME_INTERVAL_UNIT_EDEFAULT = GSSTestProcTimeUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getValid_time_interval_unit() <em>Valid time interval unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_time_interval_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcTimeUnit valid_time_interval_unit = VALID_TIME_INTERVAL_UNIT_EDEFAULT;

	/**
	 * This is true if the Valid time interval unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valid_time_interval_unitESet;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSTestProcOutput> output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcOutputsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_OUTPUTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcCheckmode getCheckmode() {
		return checkmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckmode(GSSTestProcCheckmode newCheckmode) {
		GSSTestProcCheckmode oldCheckmode = checkmode;
		checkmode = newCheckmode == null ? CHECKMODE_EDEFAULT : newCheckmode;
		boolean oldCheckmodeESet = checkmodeESet;
		checkmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUTS__CHECKMODE, oldCheckmode, checkmode, !oldCheckmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCheckmode() {
		GSSTestProcCheckmode oldCheckmode = checkmode;
		boolean oldCheckmodeESet = checkmodeESet;
		checkmode = CHECKMODE_EDEFAULT;
		checkmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_OUTPUTS__CHECKMODE, oldCheckmode, CHECKMODE_EDEFAULT, oldCheckmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCheckmode() {
		return checkmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValid_time_interval_value() {
		return valid_time_interval_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid_time_interval_value(String newValid_time_interval_value) {
		String oldValid_time_interval_value = valid_time_interval_value;
		valid_time_interval_value = newValid_time_interval_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE, oldValid_time_interval_value, valid_time_interval_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTestProcTimeUnit getValid_time_interval_unit() {
		return valid_time_interval_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValid_time_interval_unit(GSSTestProcTimeUnit newValid_time_interval_unit) {
		GSSTestProcTimeUnit oldValid_time_interval_unit = valid_time_interval_unit;
		valid_time_interval_unit = newValid_time_interval_unit == null ? VALID_TIME_INTERVAL_UNIT_EDEFAULT : newValid_time_interval_unit;
		boolean oldValid_time_interval_unitESet = valid_time_interval_unitESet;
		valid_time_interval_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT, oldValid_time_interval_unit, valid_time_interval_unit, !oldValid_time_interval_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValid_time_interval_unit() {
		GSSTestProcTimeUnit oldValid_time_interval_unit = valid_time_interval_unit;
		boolean oldValid_time_interval_unitESet = valid_time_interval_unitESet;
		valid_time_interval_unit = VALID_TIME_INTERVAL_UNIT_EDEFAULT;
		valid_time_interval_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT, oldValid_time_interval_unit, VALID_TIME_INTERVAL_UNIT_EDEFAULT, oldValid_time_interval_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValid_time_interval_unit() {
		return valid_time_interval_unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSTestProcOutput> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<GSSTestProcOutput>(GSSTestProcOutput.class, this, test_procPackage.GSS_TEST_PROC_OUTPUTS__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__CHECKMODE:
				return getCheckmode();
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				return getValid_time_interval_value();
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				return getValid_time_interval_unit();
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__OUTPUT:
				return getOutput();
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
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__CHECKMODE:
				setCheckmode((GSSTestProcCheckmode)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				setValid_time_interval_value((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				setValid_time_interval_unit((GSSTestProcTimeUnit)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends GSSTestProcOutput>)newValue);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__CHECKMODE:
				unsetCheckmode();
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				setValid_time_interval_value(VALID_TIME_INTERVAL_VALUE_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				unsetValid_time_interval_unit();
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__OUTPUT:
				getOutput().clear();
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
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__CHECKMODE:
				return isSetCheckmode();
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_VALUE:
				return VALID_TIME_INTERVAL_VALUE_EDEFAULT == null ? valid_time_interval_value != null : !VALID_TIME_INTERVAL_VALUE_EDEFAULT.equals(valid_time_interval_value);
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__VALID_TIME_INTERVAL_UNIT:
				return isSetValid_time_interval_unit();
			case test_procPackage.GSS_TEST_PROC_OUTPUTS__OUTPUT:
				return output != null && !output.isEmpty();
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
		result.append(" (checkmode: ");
		if (checkmodeESet) result.append(checkmode); else result.append("<unset>");
		result.append(", valid_time_interval_value: ");
		result.append(valid_time_interval_value);
		result.append(", valid_time_interval_unit: ");
		if (valid_time_interval_unitESet) result.append(valid_time_interval_unit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSTestProcOutputsImpl
