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
import es.uah.aut.srg.gss.filter.GSSFilterConstant;
import es.uah.aut.srg.gss.filter.GSSFilterConstantType;
import es.uah.aut.srg.gss.filter.GSSFilterSelect;
import es.uah.aut.srg.gss.filter.GSSFilterSelectLine;
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
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromArrayItemImpl#getSelectLine <em>Select Line</em>}</li>
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
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterConstant constant;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterSelect select;

	/**
	 * The cached value of the '{@link #getSelectLine() <em>Select Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectLine()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterSelectLine selectLine;

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
	public GSSFilterConstant getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(GSSFilterConstant newConstant, NotificationChain msgs) {
		GSSFilterConstant oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, oldConstant, newConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(GSSFilterConstant newConstant) {
		if (newConstant != constant) {
			NotificationChain msgs = null;
			if (constant != null)
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT, newConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelect getSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(GSSFilterSelect newSelect, NotificationChain msgs) {
		GSSFilterSelect oldSelect = select;
		select = newSelect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, oldSelect, newSelect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(GSSFilterSelect newSelect) {
		if (newSelect != select) {
			NotificationChain msgs = null;
			if (select != null)
				msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT, newSelect, newSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelectLine getSelectLine() {
		return selectLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectLine(GSSFilterSelectLine newSelectLine, NotificationChain msgs) {
		GSSFilterSelectLine oldSelectLine = selectLine;
		selectLine = newSelectLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, oldSelectLine, newSelectLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectLine(GSSFilterSelectLine newSelectLine) {
		if (newSelectLine != selectLine) {
			NotificationChain msgs = null;
			if (selectLine != null)
				msgs = ((InternalEObject)selectLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, null, msgs);
			if (newSelectLine != null)
				msgs = ((InternalEObject)newSelectLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, null, msgs);
			msgs = basicSetSelectLine(newSelectLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE, newSelectLine, newSelectLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				return basicSetConstant(null, msgs);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				return basicSetSelect(null, msgs);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				return basicSetSelectLine(null, msgs);
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				return getConstant();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				return getSelect();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				return getSelectLine();
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				setConstant((GSSFilterConstant)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				setSelect((GSSFilterSelect)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				setSelectLine((GSSFilterSelectLine)newValue);
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				setConstant((GSSFilterConstant)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				setSelect((GSSFilterSelect)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				setSelectLine((GSSFilterSelectLine)null);
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__CONSTANT:
				return constant != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT:
				return select != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_ARRAY_ITEM__SELECT_LINE:
				return selectLine != null;
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
