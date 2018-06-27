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

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCheckType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFDICField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFloatingOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSortedFieldsToCheck;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format FDIC Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getFid <em>Fid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getPfid <em>Pfid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getCheckType <em>Check Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getFloatingOffset <em>Floating Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatFDICFieldImpl#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatFDICFieldImpl extends MinimalEObjectImpl.Container implements GSSTmTcFormatFDICField {
	/**
	 * The default value of the '{@link #getFid() <em>Fid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFid()
	 * @generated
	 * @ordered
	 */
	protected static final String FID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFid() <em>Fid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFid()
	 * @generated
	 * @ordered
	 */
	protected String fid = FID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPfid() <em>Pfid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfid()
	 * @generated
	 * @ordered
	 */
	protected static final String PFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPfid() <em>Pfid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfid()
	 * @generated
	 * @ordered
	 */
	protected String pfid = PFID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckType() <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTmTcFormatCheckType CHECK_TYPE_EDEFAULT = GSSTmTcFormatCheckType.CRC16;

	/**
	 * The cached value of the '{@link #getCheckType() <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckType()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatCheckType checkType = CHECK_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatSize size;

	/**
	 * The cached value of the '{@link #getFloatingOffset() <em>Floating Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingOffset()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatFloatingOffset floatingOffset;

	/**
	 * The cached value of the '{@link #getSortedFieldsToCheck() <em>Sorted Fields To Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortedFieldsToCheck()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatSortedFieldsToCheck sortedFieldsToCheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatFDICFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_FDIC_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFid() {
		return fid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFid(String newFid) {
		String oldFid = fid;
		fid = newFid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FID, oldFid, fid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPfid() {
		return pfid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPfid(String newPfid) {
		String oldPfid = pfid;
		pfid = newPfid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__PFID, oldPfid, pfid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatCheckType getCheckType() {
		return checkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckType(GSSTmTcFormatCheckType newCheckType) {
		GSSTmTcFormatCheckType oldCheckType = checkType;
		checkType = newCheckType == null ? CHECK_TYPE_EDEFAULT : newCheckType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE, oldCheckType, checkType));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER, oldByteOrder, byteOrder));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT, oldFirstBit, firstBit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatSize getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(GSSTmTcFormatSize newSize, NotificationChain msgs) {
		GSSTmTcFormatSize oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(GSSTmTcFormatSize newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatFloatingOffset getFloatingOffset() {
		return floatingOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatingOffset(GSSTmTcFormatFloatingOffset newFloatingOffset, NotificationChain msgs) {
		GSSTmTcFormatFloatingOffset oldFloatingOffset = floatingOffset;
		floatingOffset = newFloatingOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET, oldFloatingOffset, newFloatingOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingOffset(GSSTmTcFormatFloatingOffset newFloatingOffset) {
		if (newFloatingOffset != floatingOffset) {
			NotificationChain msgs = null;
			if (floatingOffset != null)
				msgs = ((InternalEObject)floatingOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET, null, msgs);
			if (newFloatingOffset != null)
				msgs = ((InternalEObject)newFloatingOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET, null, msgs);
			msgs = basicSetFloatingOffset(newFloatingOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET, newFloatingOffset, newFloatingOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatSortedFieldsToCheck getSortedFieldsToCheck() {
		return sortedFieldsToCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortedFieldsToCheck(GSSTmTcFormatSortedFieldsToCheck newSortedFieldsToCheck, NotificationChain msgs) {
		GSSTmTcFormatSortedFieldsToCheck oldSortedFieldsToCheck = sortedFieldsToCheck;
		sortedFieldsToCheck = newSortedFieldsToCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, oldSortedFieldsToCheck, newSortedFieldsToCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortedFieldsToCheck(GSSTmTcFormatSortedFieldsToCheck newSortedFieldsToCheck) {
		if (newSortedFieldsToCheck != sortedFieldsToCheck) {
			NotificationChain msgs = null;
			if (sortedFieldsToCheck != null)
				msgs = ((InternalEObject)sortedFieldsToCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, null, msgs);
			if (newSortedFieldsToCheck != null)
				msgs = ((InternalEObject)newSortedFieldsToCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, null, msgs);
			msgs = basicSetSortedFieldsToCheck(newSortedFieldsToCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK, newSortedFieldsToCheck, newSortedFieldsToCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE:
				return basicSetSize(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				return basicSetFloatingOffset(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				return basicSetSortedFieldsToCheck(null, msgs);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FID:
				return getFid();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__PFID:
				return getPfid();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__NAME:
				return getName();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION:
				return getDescription();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE:
				return getCheckType();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER:
				return getByteOrder();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT:
				return getFirstBit();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE:
				return getSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				return getFloatingOffset();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				return getSortedFieldsToCheck();
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FID:
				setFid((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__PFID:
				setPfid((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__NAME:
				setName((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE:
				setCheckType((GSSTmTcFormatCheckType)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER:
				setByteOrder((GSSTmTcFormatFieldByteOrder)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT:
				setFirstBit((GSSTmTcFormatSFieldFirstBit)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE:
				setSize((GSSTmTcFormatSize)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				setFloatingOffset((GSSTmTcFormatFloatingOffset)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				setSortedFieldsToCheck((GSSTmTcFormatSortedFieldsToCheck)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FID:
				setFid(FID_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__PFID:
				setPfid(PFID_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE:
				setCheckType(CHECK_TYPE_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER:
				setByteOrder(BYTE_ORDER_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT:
				setFirstBit(FIRST_BIT_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE:
				setSize((GSSTmTcFormatSize)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				setFloatingOffset((GSSTmTcFormatFloatingOffset)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				setSortedFieldsToCheck((GSSTmTcFormatSortedFieldsToCheck)null);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FID:
				return FID_EDEFAULT == null ? fid != null : !FID_EDEFAULT.equals(fid);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__PFID:
				return PFID_EDEFAULT == null ? pfid != null : !PFID_EDEFAULT.equals(pfid);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__CHECK_TYPE:
				return checkType != CHECK_TYPE_EDEFAULT;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__BYTE_ORDER:
				return byteOrder != BYTE_ORDER_EDEFAULT;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FIRST_BIT:
				return firstBit != FIRST_BIT_EDEFAULT;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SIZE:
				return size != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__FLOATING_OFFSET:
				return floatingOffset != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_FDIC_FIELD__SORTED_FIELDS_TO_CHECK:
				return sortedFieldsToCheck != null;
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
		result.append(" (fid: ");
		result.append(fid);
		result.append(", pfid: ");
		result.append(pfid);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", checkType: ");
		result.append(checkType);
		result.append(", byteOrder: ");
		result.append(byteOrder);
		result.append(", firstBit: ");
		result.append(firstBit);
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatFDICFieldImpl
