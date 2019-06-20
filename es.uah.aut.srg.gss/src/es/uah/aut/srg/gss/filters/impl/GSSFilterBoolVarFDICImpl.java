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
package es.uah.aut.srg.gss.filters.impl;

import es.uah.aut.srg.gss.filters.GSSFilterBoolVarFDIC;
import es.uah.aut.srg.gss.filters.GSSFilterFieldOp;
import es.uah.aut.srg.gss.filters.filtersPackage;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var FDIC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterBoolVarFDICImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterBoolVarFDICImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterBoolVarFDICImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.impl.GSSFilterBoolVarFDICImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarFDICImpl extends MinimalEObjectImpl.Container implements GSSFilterBoolVarFDIC {
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
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatFDICField fieldRef;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFieldOp op;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterBoolVarFDICImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filtersPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFDICField getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (GSSTmTcFormatFDICField)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFDICField basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(GSSTmTcFormatFDICField newFieldRef) {
		GSSTmTcFormatFDICField oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFieldOp getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(GSSFilterFieldOp newOp, NotificationChain msgs) {
		GSSFilterFieldOp oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(GSSFilterFieldOp newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				return basicSetOp(null, msgs);
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
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				return getId();
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				return getName();
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				return getOp();
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
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				setId((String)newValue);
				return;
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				setName((String)newValue);
				return;
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				setFieldRef((GSSTmTcFormatFDICField)newValue);
				return;
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				setOp((GSSFilterFieldOp)newValue);
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
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				setId(ID_EDEFAULT);
				return;
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				setFieldRef((GSSTmTcFormatFDICField)null);
				return;
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				setOp((GSSFilterFieldOp)null);
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
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				return fieldRef != null;
			case filtersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				return op != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarFDICImpl
