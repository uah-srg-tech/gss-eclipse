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

import es.uah.aut.srg.gss.test_proc.GSSTestProcOutput;
import es.uah.aut.srg.gss.test_proc.test_procPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Test Proc Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.impl.GSSTestProcOutputImpl#getOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GSSTestProcOutputImpl extends MinimalEObjectImpl.Container implements GSSTestProcOutput {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptional()
	 * @generated
	 * @ordered
	 */
	protected String optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTestProcOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return test_procPackage.Literals.GSS_TEST_PROC_OUTPUT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT__IF_REF, oldIfRef, ifRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(String newOptional) {
		String oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, test_procPackage.GSS_TEST_PROC_OUTPUT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case test_procPackage.GSS_TEST_PROC_OUTPUT__NAME:
				return getName();
			case test_procPackage.GSS_TEST_PROC_OUTPUT__ID:
				return getId();
			case test_procPackage.GSS_TEST_PROC_OUTPUT__IF_REF:
				return getIfRef();
			case test_procPackage.GSS_TEST_PROC_OUTPUT__OPTIONAL:
				return getOptional();
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT__NAME:
				setName((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT__ID:
				setId((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT__IF_REF:
				setIfRef((String)newValue);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT__OPTIONAL:
				setOptional((String)newValue);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT__ID:
				setId(ID_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case test_procPackage.GSS_TEST_PROC_OUTPUT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case test_procPackage.GSS_TEST_PROC_OUTPUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case test_procPackage.GSS_TEST_PROC_OUTPUT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case test_procPackage.GSS_TEST_PROC_OUTPUT__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case test_procPackage.GSS_TEST_PROC_OUTPUT__OPTIONAL:
				return OPTIONAL_EDEFAULT == null ? optional != null : !OPTIONAL_EDEFAULT.equals(optional);
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
		result.append(", id: ");
		result.append(id);
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //GSSTestProcOutputImpl
