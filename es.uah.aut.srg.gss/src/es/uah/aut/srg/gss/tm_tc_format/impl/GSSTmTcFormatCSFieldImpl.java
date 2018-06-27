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

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatCSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSize;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format CS Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getFid <em>Fid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getPfid <em>Pfid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatCSFieldImpl#getGlobalOffset <em>Global Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatCSFieldImpl extends MinimalEObjectImpl.Container implements GSSTmTcFormatCSField {
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
	 * The cached value of the '{@link #getGlobalOffset() <em>Global Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalOffset()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatGlobalOffset globalOffset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatCSFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_CS_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FID, oldFid, fid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__PFID, oldPfid, pfid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION, oldDescription, description));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER, oldByteOrder, byteOrder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT, oldFirstBit, firstBit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE, oldSize, newSize);
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
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatGlobalOffset getGlobalOffset() {
		return globalOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalOffset(GSSTmTcFormatGlobalOffset newGlobalOffset, NotificationChain msgs) {
		GSSTmTcFormatGlobalOffset oldGlobalOffset = globalOffset;
		globalOffset = newGlobalOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET, oldGlobalOffset, newGlobalOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalOffset(GSSTmTcFormatGlobalOffset newGlobalOffset) {
		if (newGlobalOffset != globalOffset) {
			NotificationChain msgs = null;
			if (globalOffset != null)
				msgs = ((InternalEObject)globalOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET, null, msgs);
			if (newGlobalOffset != null)
				msgs = ((InternalEObject)newGlobalOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET, null, msgs);
			msgs = basicSetGlobalOffset(newGlobalOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET, newGlobalOffset, newGlobalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE:
				return basicSetSize(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET:
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FID:
				return getFid();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__PFID:
				return getPfid();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__NAME:
				return getName();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION:
				return getDescription();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__TYPE:
				return getType();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER:
				return getByteOrder();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT:
				return getFirstBit();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE:
				return getSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET:
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FID:
				setFid((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__PFID:
				setPfid((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__NAME:
				setName((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__TYPE:
				setType((GSSTmTcFormatFieldType)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER:
				setByteOrder((GSSTmTcFormatFieldByteOrder)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT:
				setFirstBit((GSSTmTcFormatSFieldFirstBit)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE:
				setSize((GSSTmTcFormatSize)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((GSSTmTcFormatGlobalOffset)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FID:
				setFid(FID_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__PFID:
				setPfid(PFID_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER:
				setByteOrder(BYTE_ORDER_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT:
				setFirstBit(FIRST_BIT_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE:
				setSize((GSSTmTcFormatSize)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((GSSTmTcFormatGlobalOffset)null);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FID:
				return FID_EDEFAULT == null ? fid != null : !FID_EDEFAULT.equals(fid);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__PFID:
				return PFID_EDEFAULT == null ? pfid != null : !PFID_EDEFAULT.equals(pfid);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__BYTE_ORDER:
				return byteOrder != BYTE_ORDER_EDEFAULT;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__FIRST_BIT:
				return firstBit != FIRST_BIT_EDEFAULT;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__SIZE:
				return size != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_CS_FIELD__GLOBAL_OFFSET:
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
		result.append(" (fid: ");
		result.append(fid);
		result.append(", pfid: ");
		result.append(pfid);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", byteOrder: ");
		result.append(byteOrder);
		result.append(", firstBit: ");
		result.append(firstBit);
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatCSFieldImpl
