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

import es.uah.aut.srg.gss.test_proc.GSSTestProcInput;
import es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcInputImpl#getDelay_unit <em>Delay unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GSSTestProcInputImpl extends MinimalEObjectImpl.Container implements GSSTestProcInput {
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
	protected static final GSSTestProcTimeUnit DELAY_UNIT_EDEFAULT = GSSTestProcTimeUnit.MILISECONDS;

	/**
	 * The cached value of the '{@link #getDelay_unit() <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelay_unit()
	 * @generated
	 * @ordered
	 */
	protected GSSTestProcTimeUnit delay_unit = DELAY_UNIT_EDEFAULT;

	/**
	 * This is true if the Delay unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean delay_unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_INPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT__IF_REF, oldIfRef, ifRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT__DELAY_VALUE, oldDelay_value, delay_value, !oldDelay_valueESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_INPUT__DELAY_VALUE, oldDelay_value, DELAY_VALUE_EDEFAULT, oldDelay_valueESet));
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
	public GSSTestProcTimeUnit getDelay_unit() {
		return delay_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay_unit(GSSTestProcTimeUnit newDelay_unit) {
		GSSTestProcTimeUnit oldDelay_unit = delay_unit;
		delay_unit = newDelay_unit == null ? DELAY_UNIT_EDEFAULT : newDelay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_INPUT__DELAY_UNIT, oldDelay_unit, delay_unit, !oldDelay_unitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelay_unit() {
		GSSTestProcTimeUnit oldDelay_unit = delay_unit;
		boolean oldDelay_unitESet = delay_unitESet;
		delay_unit = DELAY_UNIT_EDEFAULT;
		delay_unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, test_procPackage.GSS_TEST_PROC_INPUT__DELAY_UNIT, oldDelay_unit, DELAY_UNIT_EDEFAULT, oldDelay_unitESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_INPUT__NAME:
				return getName();
			case test_procPackage.GSS_TEST_PROC_INPUT__IF_REF:
				return getIfRef();
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_VALUE:
				return getDelay_value();
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_UNIT:
				return getDelay_unit();
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
			case test_procPackage.GSS_TEST_PROC_INPUT__NAME:
				setName((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT__IF_REF:
				setIfRef((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_VALUE:
				setDelay_value((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_UNIT:
				setDelay_unit((GSSTestProcTimeUnit)newValue);
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
			case test_procPackage.GSS_TEST_PROC_INPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_VALUE:
				unsetDelay_value();
				return;
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_UNIT:
				unsetDelay_unit();
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
			case test_procPackage.GSS_TEST_PROC_INPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case test_procPackage.GSS_TEST_PROC_INPUT__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_VALUE:
				return isSetDelay_value();
			case test_procPackage.GSS_TEST_PROC_INPUT__DELAY_UNIT:
				return isSetDelay_unit();
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

} //GSSTestProcInputImpl
