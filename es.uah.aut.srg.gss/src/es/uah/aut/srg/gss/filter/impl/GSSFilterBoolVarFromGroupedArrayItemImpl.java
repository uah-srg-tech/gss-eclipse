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

import es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem;
import es.uah.aut.srg.gss.filter.GSSFilterConstantType;
import es.uah.aut.srg.gss.filter.GSSFilterValue;
import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.GSSFormatAField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var From Grouped Array Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getAIFieldRefs <em>AI Field Refs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarFromGroupedArrayItemImpl extends GSSFilterAbstractBoolVarImpl implements GSSFilterBoolVarFromGroupedArrayItem {
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
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAIFieldRefs() <em>AI Field Refs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIFieldRefs()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatAField aiFieldRefs;

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
	protected GSSFilterBoolVarFromGroupedArrayItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return filterPackage.Literals.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE, oldConstantType, constantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatAField getAIFieldRefs() {
		if (aiFieldRefs != null && aiFieldRefs.eIsProxy()) {
			InternalEObject oldAIFieldRefs = (InternalEObject)aiFieldRefs;
			aiFieldRefs = (GSSFormatAField)eResolveProxy(oldAIFieldRefs);
			if (aiFieldRefs != oldAIFieldRefs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS, oldAIFieldRefs, aiFieldRefs));
			}
		}
		return aiFieldRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatAField basicGetAIFieldRefs() {
		return aiFieldRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIFieldRefs(GSSFormatAField newAIFieldRefs) {
		GSSFormatAField oldAIFieldRefs = aiFieldRefs;
		aiFieldRefs = newAIFieldRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS, oldAIFieldRefs, aiFieldRefs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				return getConstantType();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				return getGroup();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				if (resolve) return getAIFieldRefs();
				return basicGetAIFieldRefs();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType((GSSFilterConstantType)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				setGroup((String)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				setAIFieldRefs((GSSFormatAField)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType(CONSTANT_TYPE_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				setAIFieldRefs((GSSFormatAField)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				return constantType != CONSTANT_TYPE_EDEFAULT;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				return aiFieldRefs != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__VALUE:
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
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarFromGroupedArrayItemImpl
