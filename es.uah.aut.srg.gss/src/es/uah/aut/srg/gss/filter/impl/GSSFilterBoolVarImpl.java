/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.filter.impl;

import es.uah.aut.srg.gss.filter.GSSFilterBoolVar;
import es.uah.aut.srg.gss.filter.GSSFilterConstantType;
import es.uah.aut.srg.gss.filter.GSSFilterFieldOp;
import es.uah.aut.srg.gss.filter.GSSFilterValue;
import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.GSSFormatField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl#getOp <em>Op</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarImpl extends MinimalEObjectImpl.Container implements GSSFilterBoolVar {
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
	 * The default value of the '{@link #getConstantType() <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFilterConstantType CONSTANT_TYPE_EDEFAULT = GSSFilterConstantType.DECIMAL;

	/**
	 * The cached value of the '{@link #getConstantType() <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantType()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterConstantType constantType = CONSTANT_TYPE_EDEFAULT;

	/**
	 * This is true if the Constant Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constantTypeESet;

	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatField fieldRef;

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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterValue value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterBoolVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.GSS_FILTER_BOOL_VAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterConstantType getConstantType() {
		return constantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantType(GSSFilterConstantType newConstantType) {
		GSSFilterConstantType oldConstantType = constantType;
		constantType = newConstantType == null ? CONSTANT_TYPE_EDEFAULT : newConstantType;
		boolean oldConstantTypeESet = constantTypeESet;
		constantTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE, oldConstantType, constantType, !oldConstantTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstantType() {
		GSSFilterConstantType oldConstantType = constantType;
		boolean oldConstantTypeESet = constantTypeESet;
		constantType = CONSTANT_TYPE_EDEFAULT;
		constantTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, filterPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE, oldConstantType, CONSTANT_TYPE_EDEFAULT, oldConstantTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstantType() {
		return constantTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (GSSFormatField)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filterPackage.GSS_FILTER_BOOL_VAR__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatField basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(GSSFormatField newFieldRef) {
		GSSFormatField oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__FIELD_REF, oldFieldRef, fieldRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__OP, oldOp, newOp);
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
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterValue getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(GSSFilterValue newValue, NotificationChain msgs) {
		GSSFilterValue oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(GSSFilterValue newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.GSS_FILTER_BOOL_VAR__OP:
				return basicSetOp(null, msgs);
			case filterPackage.GSS_FILTER_BOOL_VAR__VALUE:
				return basicSetValue(null, msgs);
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
			case filterPackage.GSS_FILTER_BOOL_VAR__ID:
				return getId();
			case filterPackage.GSS_FILTER_BOOL_VAR__NAME:
				return getName();
			case filterPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				return getConstantType();
			case filterPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case filterPackage.GSS_FILTER_BOOL_VAR__OP:
				return getOp();
			case filterPackage.GSS_FILTER_BOOL_VAR__VALUE:
				return getValue();
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
			case filterPackage.GSS_FILTER_BOOL_VAR__ID:
				setId((String)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__NAME:
				setName((String)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				setConstantType((GSSFilterConstantType)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				setFieldRef((GSSFormatField)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__OP:
				setOp((GSSFilterFieldOp)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__VALUE:
				setValue((GSSFilterValue)newValue);
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
			case filterPackage.GSS_FILTER_BOOL_VAR__ID:
				setId(ID_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				unsetConstantType();
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				setFieldRef((GSSFormatField)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__OP:
				setOp((GSSFilterFieldOp)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR__VALUE:
				setValue((GSSFilterValue)null);
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
			case filterPackage.GSS_FILTER_BOOL_VAR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case filterPackage.GSS_FILTER_BOOL_VAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case filterPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				return isSetConstantType();
			case filterPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				return fieldRef != null;
			case filterPackage.GSS_FILTER_BOOL_VAR__OP:
				return op != null;
			case filterPackage.GSS_FILTER_BOOL_VAR__VALUE:
				return value != null;
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
		result.append(", constantType: ");
		if (constantTypeESet) result.append(constantType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarImpl
