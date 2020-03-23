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

import es.uah.aut.srg.gss.format.GSSFormatAIField;
import es.uah.aut.srg.gss.format.GSSFormatArrayRef;
import es.uah.aut.srg.gss.format.GSSFormatBytesBits;
import es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder;
import es.uah.aut.srg.gss.format.GSSFormatFieldType;
import es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit;
import es.uah.aut.srg.gss.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Format AI Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl#getArrayRef <em>Array Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatAIFieldImpl#getLocalOffset <em>Local Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFormatAIFieldImpl extends GSSFormatFieldImpl implements GSSFormatAIField {
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
	 * The cached value of the '{@link #getArrayRef() <em>Array Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayRef()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatArrayRef arrayRef;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatBytesBits size;

	/**
	 * The cached value of the '{@link #getLocalOffset() <em>Local Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOffset()
	 * @generated
	 * @ordered
	 */
	protected GSSFormatBytesBits localOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFormatAIFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.GSS_FORMAT_AI_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_AI_FIELD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__BYTE_ORDER, oldByteOrder, byteOrder, !oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_AI_FIELD__BYTE_ORDER, oldByteOrder, BYTE_ORDER_EDEFAULT, oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__FIRST_BIT, oldFirstBit, firstBit, !oldFirstBitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, formatPackage.GSS_FORMAT_AI_FIELD__FIRST_BIT, oldFirstBit, FIRST_BIT_EDEFAULT, oldFirstBitESet));
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
	public GSSFormatArrayRef getArrayRef() {
		return arrayRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayRef(GSSFormatArrayRef newArrayRef, NotificationChain msgs) {
		GSSFormatArrayRef oldArrayRef = arrayRef;
		arrayRef = newArrayRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF, oldArrayRef, newArrayRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayRef(GSSFormatArrayRef newArrayRef) {
		if (newArrayRef != arrayRef) {
			NotificationChain msgs = null;
			if (arrayRef != null)
				msgs = ((InternalEObject)arrayRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF, null, msgs);
			if (newArrayRef != null)
				msgs = ((InternalEObject)newArrayRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF, null, msgs);
			msgs = basicSetArrayRef(newArrayRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF, newArrayRef, newArrayRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatBytesBits getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(GSSFormatBytesBits newSize, NotificationChain msgs) {
		GSSFormatBytesBits oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(GSSFormatBytesBits newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_AI_FIELD__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_AI_FIELD__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFormatBytesBits getLocalOffset() {
		return localOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalOffset(GSSFormatBytesBits newLocalOffset, NotificationChain msgs) {
		GSSFormatBytesBits oldLocalOffset = localOffset;
		localOffset = newLocalOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET, oldLocalOffset, newLocalOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOffset(GSSFormatBytesBits newLocalOffset) {
		if (newLocalOffset != localOffset) {
			NotificationChain msgs = null;
			if (localOffset != null)
				msgs = ((InternalEObject)localOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET, null, msgs);
			if (newLocalOffset != null)
				msgs = ((InternalEObject)newLocalOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET, null, msgs);
			msgs = basicSetLocalOffset(newLocalOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET, newLocalOffset, newLocalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF:
				return basicSetArrayRef(null, msgs);
			case formatPackage.GSS_FORMAT_AI_FIELD__SIZE:
				return basicSetSize(null, msgs);
			case formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET:
				return basicSetLocalOffset(null, msgs);
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
			case formatPackage.GSS_FORMAT_AI_FIELD__TYPE:
				return getType();
			case formatPackage.GSS_FORMAT_AI_FIELD__BYTE_ORDER:
				return getByteOrder();
			case formatPackage.GSS_FORMAT_AI_FIELD__FIRST_BIT:
				return getFirstBit();
			case formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF:
				return getArrayRef();
			case formatPackage.GSS_FORMAT_AI_FIELD__SIZE:
				return getSize();
			case formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET:
				return getLocalOffset();
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
			case formatPackage.GSS_FORMAT_AI_FIELD__TYPE:
				setType((GSSFormatFieldType)newValue);
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__BYTE_ORDER:
				setByteOrder((GSSFormatFieldByteOrder)newValue);
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__FIRST_BIT:
				setFirstBit((GSSFormatSFieldFirstBit)newValue);
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF:
				setArrayRef((GSSFormatArrayRef)newValue);
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__SIZE:
				setSize((GSSFormatBytesBits)newValue);
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET:
				setLocalOffset((GSSFormatBytesBits)newValue);
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
			case formatPackage.GSS_FORMAT_AI_FIELD__TYPE:
				unsetType();
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__BYTE_ORDER:
				unsetByteOrder();
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__FIRST_BIT:
				unsetFirstBit();
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF:
				setArrayRef((GSSFormatArrayRef)null);
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__SIZE:
				setSize((GSSFormatBytesBits)null);
				return;
			case formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET:
				setLocalOffset((GSSFormatBytesBits)null);
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
			case formatPackage.GSS_FORMAT_AI_FIELD__TYPE:
				return isSetType();
			case formatPackage.GSS_FORMAT_AI_FIELD__BYTE_ORDER:
				return isSetByteOrder();
			case formatPackage.GSS_FORMAT_AI_FIELD__FIRST_BIT:
				return isSetFirstBit();
			case formatPackage.GSS_FORMAT_AI_FIELD__ARRAY_REF:
				return arrayRef != null;
			case formatPackage.GSS_FORMAT_AI_FIELD__SIZE:
				return size != null;
			case formatPackage.GSS_FORMAT_AI_FIELD__LOCAL_OFFSET:
				return localOffset != null;
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

} //GSSFormatAIFieldImpl
