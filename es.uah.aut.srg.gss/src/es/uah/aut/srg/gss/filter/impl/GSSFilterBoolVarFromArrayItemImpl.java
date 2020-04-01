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

import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem;
import es.uah.aut.srg.gss.filter.GSSFilterConstantType;
import es.uah.aut.srg.gss.filter.GSSFilterValue;
import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.GSSFormatAIField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var From Array Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl#getAIFieldRef <em>AI Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarFromArrayItemImpl extends GSSFilterAbstractBoolVarImpl implements GSSFilterBoolVarFromArrayItem {
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
	 * The cached value of the '{@link #getAIFieldRef() <em>AI Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatAIField aiFieldRef;

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
	protected GSSFilterBoolVarFromArrayItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE, oldConstantType, constantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatAIField getAIFieldRef() {
		if (aiFieldRef != null && aiFieldRef.eIsProxy()) {
			InternalEObject oldAIFieldRef = (InternalEObject)aiFieldRef;
			aiFieldRef = (GSSFormatAIField)eResolveProxy(oldAIFieldRef);
			if (aiFieldRef != oldAIFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF, oldAIFieldRef, aiFieldRef));
			}
		}
		return aiFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatAIField basicGetAIFieldRef() {
		return aiFieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIFieldRef(GSSFormatAIField newAIFieldRef) {
		GSSFormatAIField oldAIFieldRef = aiFieldRef;
		aiFieldRef = newAIFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF, oldAIFieldRef, aiFieldRef));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				return getConstantType();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				if (resolve) return getAIFieldRef();
				return basicGetAIFieldRef();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType((GSSFilterConstantType)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				setAIFieldRef((GSSFormatAIField)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType(CONSTANT_TYPE_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				setAIFieldRef((GSSFormatAIField)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT_TYPE:
				return constantType != CONSTANT_TYPE_EDEFAULT;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__AI_FIELD_REF:
				return aiFieldRef != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__VALUE:
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
		result.append(" (constantType: ");
		result.append(constantType);
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarFromArrayItemImpl
