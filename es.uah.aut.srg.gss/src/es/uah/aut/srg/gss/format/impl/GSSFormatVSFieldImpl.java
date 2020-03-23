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
package es.uah.aut.srg.gss.format.impl;

import es.uah.aut.srg.gss.format.GSSFormatBytesBits;
import es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder;
import es.uah.aut.srg.gss.format.GSSFormatFieldType;
import es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit;
import es.uah.aut.srg.gss.format.GSSFormatVSField;
import es.uah.aut.srg.gss.format.GSSFormatVariableSize;
import es.uah.aut.srg.gss.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Format VS Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl#getConstSize <em>Const Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl#getVariableSize <em>Variable Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatVSFieldImpl#getGlobalOffset <em>Global Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFormatVSFieldImpl extends GSSFormatFieldImpl implements GSSFormatVSField {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFormatFieldType TYPE_EDEFAULT = GSSFormatFieldType.STRUCTURED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFieldType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getByteOrder() <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrder()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFormatFieldByteOrder BYTE_ORDER_EDEFAULT = GSSFormatFieldByteOrder.BIG_ENDIAN;

	/**
	 * The cached value of the '{@link #getByteOrder() <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrder()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatFieldByteOrder byteOrder = BYTE_ORDER_EDEFAULT;

	/**
	 * This is true if the Byte Order attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean byteOrderESet;

	/**
	 * The default value of the '{@link #getFirstBit() <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBit()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFormatSFieldFirstBit FIRST_BIT_EDEFAULT = GSSFormatSFieldFirstBit.MSB;

	/**
	 * The cached value of the '{@link #getFirstBit() <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBit()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatSFieldFirstBit firstBit = FIRST_BIT_EDEFAULT;

	/**
	 * This is true if the First Bit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firstBitESet;

	/**
	 * The cached value of the '{@link #getConstSize() <em>Const Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstSize()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatBytesBits constSize;

	/**
	 * The cached value of the '{@link #getVariableSize() <em>Variable Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSize()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatVariableSize variableSize;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatBytesBits maxSize;

	/**
	 * The cached value of the '{@link #getGlobalOffset() <em>Global Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOffset()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatBytesBits globalOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFormatVSFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.GSS_FORMAT_VS_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFieldType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSFormatFieldType newType) {
		GSSFormatFieldType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		GSSFormatFieldType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_VS_FIELD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatFieldByteOrder getByteOrder() {
		return byteOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteOrder(GSSFormatFieldByteOrder newByteOrder) {
		GSSFormatFieldByteOrder oldByteOrder = byteOrder;
		byteOrder = newByteOrder == null ? BYTE_ORDER_EDEFAULT : newByteOrder;
		boolean oldByteOrderESet = byteOrderESet;
		byteOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__BYTE_ORDER, oldByteOrder, byteOrder, !oldByteOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetByteOrder() {
		GSSFormatFieldByteOrder oldByteOrder = byteOrder;
		boolean oldByteOrderESet = byteOrderESet;
		byteOrder = BYTE_ORDER_EDEFAULT;
		byteOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_VS_FIELD__BYTE_ORDER, oldByteOrder, BYTE_ORDER_EDEFAULT, oldByteOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetByteOrder() {
		return byteOrderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatSFieldFirstBit getFirstBit() {
		return firstBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBit(GSSFormatSFieldFirstBit newFirstBit) {
		GSSFormatSFieldFirstBit oldFirstBit = firstBit;
		firstBit = newFirstBit == null ? FIRST_BIT_EDEFAULT : newFirstBit;
		boolean oldFirstBitESet = firstBitESet;
		firstBitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__FIRST_BIT, oldFirstBit, firstBit, !oldFirstBitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstBit() {
		GSSFormatSFieldFirstBit oldFirstBit = firstBit;
		boolean oldFirstBitESet = firstBitESet;
		firstBit = FIRST_BIT_EDEFAULT;
		firstBitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_VS_FIELD__FIRST_BIT, oldFirstBit, FIRST_BIT_EDEFAULT, oldFirstBitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFirstBit() {
		return firstBitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatBytesBits getConstSize() {
		return constSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstSize(GSSFormatBytesBits newConstSize, NotificationChain msgs) {
		GSSFormatBytesBits oldConstSize = constSize;
		constSize = newConstSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE, oldConstSize, newConstSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstSize(GSSFormatBytesBits newConstSize) {
		if (newConstSize != constSize) {
			NotificationChain msgs = null;
			if (constSize != null)
				msgs = ((InternalEObject)constSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE, null, msgs);
			if (newConstSize != null)
				msgs = ((InternalEObject)newConstSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE, null, msgs);
			msgs = basicSetConstSize(newConstSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE, newConstSize, newConstSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatVariableSize getVariableSize() {
		return variableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSize(GSSFormatVariableSize newVariableSize, NotificationChain msgs) {
		GSSFormatVariableSize oldVariableSize = variableSize;
		variableSize = newVariableSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE, oldVariableSize, newVariableSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableSize(GSSFormatVariableSize newVariableSize) {
		if (newVariableSize != variableSize) {
			NotificationChain msgs = null;
			if (variableSize != null)
				msgs = ((InternalEObject)variableSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE, null, msgs);
			if (newVariableSize != null)
				msgs = ((InternalEObject)newVariableSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE, null, msgs);
			msgs = basicSetVariableSize(newVariableSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE, newVariableSize, newVariableSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatBytesBits getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSize(GSSFormatBytesBits newMaxSize, NotificationChain msgs) {
		GSSFormatBytesBits oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE, oldMaxSize, newMaxSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(GSSFormatBytesBits newMaxSize) {
		if (newMaxSize != maxSize) {
			NotificationChain msgs = null;
			if (maxSize != null)
				msgs = ((InternalEObject)maxSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE, null, msgs);
			if (newMaxSize != null)
				msgs = ((InternalEObject)newMaxSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE, null, msgs);
			msgs = basicSetMaxSize(newMaxSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE, newMaxSize, newMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatBytesBits getGlobalOffset() {
		return globalOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalOffset(GSSFormatBytesBits newGlobalOffset, NotificationChain msgs) {
		GSSFormatBytesBits oldGlobalOffset = globalOffset;
		globalOffset = newGlobalOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET, oldGlobalOffset, newGlobalOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOffset(GSSFormatBytesBits newGlobalOffset) {
		if (newGlobalOffset != globalOffset) {
			NotificationChain msgs = null;
			if (globalOffset != null)
				msgs = ((InternalEObject)globalOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET, null, msgs);
			if (newGlobalOffset != null)
				msgs = ((InternalEObject)newGlobalOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET, null, msgs);
			msgs = basicSetGlobalOffset(newGlobalOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET, newGlobalOffset, newGlobalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE:
				return basicSetConstSize(null, msgs);
			case formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return basicSetVariableSize(null, msgs);
			case formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE:
				return basicSetMaxSize(null, msgs);
			case formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return basicSetGlobalOffset(null, msgs);
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
			case formatPackage.GSS_FORMAT_VS_FIELD__TYPE:
				return getType();
			case formatPackage.GSS_FORMAT_VS_FIELD__BYTE_ORDER:
				return getByteOrder();
			case formatPackage.GSS_FORMAT_VS_FIELD__FIRST_BIT:
				return getFirstBit();
			case formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE:
				return getConstSize();
			case formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return getVariableSize();
			case formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE:
				return getMaxSize();
			case formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return getGlobalOffset();
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
			case formatPackage.GSS_FORMAT_VS_FIELD__TYPE:
				setType((GSSFormatFieldType)newValue);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__BYTE_ORDER:
				setByteOrder((GSSFormatFieldByteOrder)newValue);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__FIRST_BIT:
				setFirstBit((GSSFormatSFieldFirstBit)newValue);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE:
				setConstSize((GSSFormatBytesBits)newValue);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE:
				setVariableSize((GSSFormatVariableSize)newValue);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE:
				setMaxSize((GSSFormatBytesBits)newValue);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((GSSFormatBytesBits)newValue);
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
			case formatPackage.GSS_FORMAT_VS_FIELD__TYPE:
				unsetType();
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__BYTE_ORDER:
				unsetByteOrder();
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__FIRST_BIT:
				unsetFirstBit();
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE:
				setConstSize((GSSFormatBytesBits)null);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE:
				setVariableSize((GSSFormatVariableSize)null);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE:
				setMaxSize((GSSFormatBytesBits)null);
				return;
			case formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((GSSFormatBytesBits)null);
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
			case formatPackage.GSS_FORMAT_VS_FIELD__TYPE:
				return isSetType();
			case formatPackage.GSS_FORMAT_VS_FIELD__BYTE_ORDER:
				return isSetByteOrder();
			case formatPackage.GSS_FORMAT_VS_FIELD__FIRST_BIT:
				return isSetFirstBit();
			case formatPackage.GSS_FORMAT_VS_FIELD__CONST_SIZE:
				return constSize != null;
			case formatPackage.GSS_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return variableSize != null;
			case formatPackage.GSS_FORMAT_VS_FIELD__MAX_SIZE:
				return maxSize != null;
			case formatPackage.GSS_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return globalOffset != null;
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", byteOrder: ");
		if (byteOrderESet) result.append(byteOrder); else result.append("<unset>");
		result.append(", firstBit: ");
		if (firstBitESet) result.append(firstBit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSFormatVSFieldImpl
