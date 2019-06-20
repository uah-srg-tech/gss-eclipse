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
package es.uah.aut.srg.gss.tm_tc_format.impl;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatArrayRef;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatBytesBits;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format AI Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl#getArrayRef <em>Array Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatAIFieldImpl#getLocalOffset <em>Local Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatAIFieldImpl extends GSSTmTcFormatFieldImpl implements GSSTmTcFormatAIField {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTmTcFormatFieldType TYPE_EDEFAULT = GSSTmTcFormatFieldType.STRUCTURED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatFieldType type = TYPE_EDEFAULT;

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
	protected static final GSSTmTcFormatFieldByteOrder BYTE_ORDER_EDEFAULT = GSSTmTcFormatFieldByteOrder.BIG_ENDIAN;

	/**
	 * The cached value of the '{@link #getByteOrder() <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteOrder()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatFieldByteOrder byteOrder = BYTE_ORDER_EDEFAULT;

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
	protected static final GSSTmTcFormatSFieldFirstBit FIRST_BIT_EDEFAULT = GSSTmTcFormatSFieldFirstBit.MSB;

	/**
	 * The cached value of the '{@link #getFirstBit() <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstBit()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatSFieldFirstBit firstBit = FIRST_BIT_EDEFAULT;

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
	protected GSSTmTcFormatArrayRef arrayRef;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatBytesBits size;

	/**
	 * The cached value of the '{@link #getLocalOffset() <em>Local Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOffset()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatBytesBits localOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatAIFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_AI_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFieldType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSTmTcFormatFieldType newType) {
		GSSTmTcFormatFieldType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		GSSTmTcFormatFieldType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public GSSTmTcFormatFieldByteOrder getByteOrder() {
		return byteOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteOrder(GSSTmTcFormatFieldByteOrder newByteOrder) {
		GSSTmTcFormatFieldByteOrder oldByteOrder = byteOrder;
		byteOrder = newByteOrder == null ? BYTE_ORDER_EDEFAULT : newByteOrder;
		boolean oldByteOrderESet = byteOrderESet;
		byteOrderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER, oldByteOrder, byteOrder, !oldByteOrderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetByteOrder() {
		GSSTmTcFormatFieldByteOrder oldByteOrder = byteOrder;
		boolean oldByteOrderESet = byteOrderESet;
		byteOrder = BYTE_ORDER_EDEFAULT;
		byteOrderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER, oldByteOrder, BYTE_ORDER_EDEFAULT, oldByteOrderESet));
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
	public GSSTmTcFormatSFieldFirstBit getFirstBit() {
		return firstBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstBit(GSSTmTcFormatSFieldFirstBit newFirstBit) {
		GSSTmTcFormatSFieldFirstBit oldFirstBit = firstBit;
		firstBit = newFirstBit == null ? FIRST_BIT_EDEFAULT : newFirstBit;
		boolean oldFirstBitESet = firstBitESet;
		firstBitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT, oldFirstBit, firstBit, !oldFirstBitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFirstBit() {
		GSSTmTcFormatSFieldFirstBit oldFirstBit = firstBit;
		boolean oldFirstBitESet = firstBitESet;
		firstBit = FIRST_BIT_EDEFAULT;
		firstBitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT, oldFirstBit, FIRST_BIT_EDEFAULT, oldFirstBitESet));
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
	public GSSTmTcFormatArrayRef getArrayRef() {
		return arrayRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayRef(GSSTmTcFormatArrayRef newArrayRef, NotificationChain msgs) {
		GSSTmTcFormatArrayRef oldArrayRef = arrayRef;
		arrayRef = newArrayRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF, oldArrayRef, newArrayRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayRef(GSSTmTcFormatArrayRef newArrayRef) {
		if (newArrayRef != arrayRef) {
			NotificationChain msgs = null;
			if (arrayRef != null)
				msgs = ((InternalEObject)arrayRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF, null, msgs);
			if (newArrayRef != null)
				msgs = ((InternalEObject)newArrayRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF, null, msgs);
			msgs = basicSetArrayRef(newArrayRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF, newArrayRef, newArrayRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatBytesBits getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(GSSTmTcFormatBytesBits newSize, NotificationChain msgs) {
		GSSTmTcFormatBytesBits oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(GSSTmTcFormatBytesBits newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatBytesBits getLocalOffset() {
		return localOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalOffset(GSSTmTcFormatBytesBits newLocalOffset, NotificationChain msgs) {
		GSSTmTcFormatBytesBits oldLocalOffset = localOffset;
		localOffset = newLocalOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET, oldLocalOffset, newLocalOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOffset(GSSTmTcFormatBytesBits newLocalOffset) {
		if (newLocalOffset != localOffset) {
			NotificationChain msgs = null;
			if (localOffset != null)
				msgs = ((InternalEObject)localOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET, null, msgs);
			if (newLocalOffset != null)
				msgs = ((InternalEObject)newLocalOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET, null, msgs);
			msgs = basicSetLocalOffset(newLocalOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET, newLocalOffset, newLocalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF:
				return basicSetArrayRef(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE:
				return basicSetSize(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET:
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__TYPE:
				return getType();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER:
				return getByteOrder();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT:
				return getFirstBit();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF:
				return getArrayRef();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE:
				return getSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET:
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__TYPE:
				setType((GSSTmTcFormatFieldType)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER:
				setByteOrder((GSSTmTcFormatFieldByteOrder)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT:
				setFirstBit((GSSTmTcFormatSFieldFirstBit)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF:
				setArrayRef((GSSTmTcFormatArrayRef)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE:
				setSize((GSSTmTcFormatBytesBits)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET:
				setLocalOffset((GSSTmTcFormatBytesBits)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__TYPE:
				unsetType();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER:
				unsetByteOrder();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT:
				unsetFirstBit();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF:
				setArrayRef((GSSTmTcFormatArrayRef)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE:
				setSize((GSSTmTcFormatBytesBits)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET:
				setLocalOffset((GSSTmTcFormatBytesBits)null);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__TYPE:
				return isSetType();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__BYTE_ORDER:
				return isSetByteOrder();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__FIRST_BIT:
				return isSetFirstBit();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__ARRAY_REF:
				return arrayRef != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__SIZE:
				return size != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_AI_FIELD__LOCAL_OFFSET:
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

} //GSSTmTcFormatAIFieldImpl
