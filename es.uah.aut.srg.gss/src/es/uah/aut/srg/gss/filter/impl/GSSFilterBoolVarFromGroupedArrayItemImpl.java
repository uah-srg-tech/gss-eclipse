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
import es.uah.aut.srg.gss.filter.GSSFilterConstant;
import es.uah.aut.srg.gss.filter.GSSFilterConstantType;
import es.uah.aut.srg.gss.filter.GSSFilterFieldOp;
import es.uah.aut.srg.gss.filter.GSSFilterSelect;
import es.uah.aut.srg.gss.filter.GSSFilterSelectLine;
import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.GSSFormatAField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var From Grouped Array Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getAIFieldRefs <em>AI Field Refs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getOp <em>Op</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarFromGroupedArrayItemImpl extends MinimalEObjectImpl.Container implements GSSFilterBoolVarFromGroupedArrayItem {
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
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFieldOp op;

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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME, oldName, name));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP, oldOp, newOp);
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
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP, newOp, newOp));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT, oldConstant, newConstant);
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
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT, newConstant, newConstant));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT, oldSelect, newSelect);
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
				msgs = ((InternalEObject)select).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT, null, msgs);
			if (newSelect != null)
				msgs = ((InternalEObject)newSelect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT, null, msgs);
			msgs = basicSetSelect(newSelect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT, newSelect, newSelect));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE, oldSelectLine, newSelectLine);
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
				msgs = ((InternalEObject)selectLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE, null, msgs);
			if (newSelectLine != null)
				msgs = ((InternalEObject)newSelectLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE, null, msgs);
			msgs = basicSetSelectLine(newSelectLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE, newSelectLine, newSelectLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				return basicSetOp(null, msgs);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				return basicSetConstant(null, msgs);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				return basicSetSelect(null, msgs);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				return getId();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				return getName();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				return getConstantType();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				return getGroup();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				if (resolve) return getAIFieldRefs();
				return basicGetAIFieldRefs();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				return getOp();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				return getConstant();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				return getSelect();
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				setId((String)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				setName((String)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType((GSSFilterConstantType)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				setGroup((String)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				setAIFieldRefs((GSSFormatAField)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				setOp((GSSFilterFieldOp)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				setConstant((GSSFilterConstant)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				setSelect((GSSFilterSelect)newValue);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType(CONSTANT_TYPE_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				setAIFieldRefs((GSSFormatAField)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				setOp((GSSFilterFieldOp)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				setConstant((GSSFilterConstant)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				setSelect((GSSFilterSelect)null);
				return;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				return constantType != CONSTANT_TYPE_EDEFAULT;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				return aiFieldRefs != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				return op != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				return constant != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				return select != null;
			case filterPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", constantType: ");
		result.append(constantType);
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarFromGroupedArrayItemImpl
