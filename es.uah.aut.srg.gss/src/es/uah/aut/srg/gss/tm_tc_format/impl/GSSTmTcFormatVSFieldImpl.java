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

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatConstSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldByteOrder;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatFieldType;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatGlobalOffset;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatSFieldFirstBit;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVSField;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format VS Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getFid <em>Fid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getPfid <em>Pfid</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getConstSize <em>Const Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getGlobalOffset <em>Global Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatVSFieldImpl#getVariableSize <em>Variable Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatVSFieldImpl extends GSSTmTcFormatFieldImpl implements GSSTmTcFormatVSField {
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
	 * The cached value of the '{@link #getConstSize() <em>Const Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstSize()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatConstSize constSize;

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
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatMaxSize maxSize;

	/**
	 * The cached value of the '{@link #getVariableSize() <em>Variable Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSize()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatVariableSize variableSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatVSFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_VS_FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FID, oldFid, fid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__PFID, oldPfid, pfid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__TYPE, oldType, type, !oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER, oldByteOrder, byteOrder, !oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER, oldByteOrder, BYTE_ORDER_EDEFAULT, oldByteOrderESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT, oldFirstBit, firstBit, !oldFirstBitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT, oldFirstBit, FIRST_BIT_EDEFAULT, oldFirstBitESet));
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
	public GSSTmTcFormatConstSize getConstSize() {
		return constSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstSize(GSSTmTcFormatConstSize newConstSize, NotificationChain msgs) {
		GSSTmTcFormatConstSize oldConstSize = constSize;
		constSize = newConstSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE, oldConstSize, newConstSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstSize(GSSTmTcFormatConstSize newConstSize) {
		if (newConstSize != constSize) {
			NotificationChain msgs = null;
			if (constSize != null)
				msgs = ((InternalEObject)constSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE, null, msgs);
			if (newConstSize != null)
				msgs = ((InternalEObject)newConstSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE, null, msgs);
			msgs = basicSetConstSize(newConstSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE, newConstSize, newConstSize));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET, oldGlobalOffset, newGlobalOffset);
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
				msgs = ((InternalEObject)globalOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET, null, msgs);
			if (newGlobalOffset != null)
				msgs = ((InternalEObject)newGlobalOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET, null, msgs);
			msgs = basicSetGlobalOffset(newGlobalOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET, newGlobalOffset, newGlobalOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatMaxSize getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxSize(GSSTmTcFormatMaxSize newMaxSize, NotificationChain msgs) {
		GSSTmTcFormatMaxSize oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE, oldMaxSize, newMaxSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxSize(GSSTmTcFormatMaxSize newMaxSize) {
		if (newMaxSize != maxSize) {
			NotificationChain msgs = null;
			if (maxSize != null)
				msgs = ((InternalEObject)maxSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE, null, msgs);
			if (newMaxSize != null)
				msgs = ((InternalEObject)newMaxSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE, null, msgs);
			msgs = basicSetMaxSize(newMaxSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE, newMaxSize, newMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatVariableSize getVariableSize() {
		return variableSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSize(GSSTmTcFormatVariableSize newVariableSize, NotificationChain msgs) {
		GSSTmTcFormatVariableSize oldVariableSize = variableSize;
		variableSize = newVariableSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE, oldVariableSize, newVariableSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableSize(GSSTmTcFormatVariableSize newVariableSize) {
		if (newVariableSize != variableSize) {
			NotificationChain msgs = null;
			if (variableSize != null)
				msgs = ((InternalEObject)variableSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE, null, msgs);
			if (newVariableSize != null)
				msgs = ((InternalEObject)newVariableSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE, null, msgs);
			msgs = basicSetVariableSize(newVariableSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE, newVariableSize, newVariableSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE:
				return basicSetConstSize(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return basicSetGlobalOffset(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE:
				return basicSetMaxSize(null, msgs);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return basicSetVariableSize(null, msgs);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FID:
				return getFid();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__PFID:
				return getPfid();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__NAME:
				return getName();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION:
				return getDescription();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__TYPE:
				return getType();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER:
				return getByteOrder();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT:
				return getFirstBit();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE:
				return getConstSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return getGlobalOffset();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE:
				return getMaxSize();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return getVariableSize();
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FID:
				setFid((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__PFID:
				setPfid((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__NAME:
				setName((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__TYPE:
				setType((GSSTmTcFormatFieldType)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER:
				setByteOrder((GSSTmTcFormatFieldByteOrder)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT:
				setFirstBit((GSSTmTcFormatSFieldFirstBit)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE:
				setConstSize((GSSTmTcFormatConstSize)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((GSSTmTcFormatGlobalOffset)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE:
				setMaxSize((GSSTmTcFormatMaxSize)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE:
				setVariableSize((GSSTmTcFormatVariableSize)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FID:
				setFid(FID_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__PFID:
				setPfid(PFID_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__TYPE:
				unsetType();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER:
				unsetByteOrder();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT:
				unsetFirstBit();
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE:
				setConstSize((GSSTmTcFormatConstSize)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				setGlobalOffset((GSSTmTcFormatGlobalOffset)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE:
				setMaxSize((GSSTmTcFormatMaxSize)null);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE:
				setVariableSize((GSSTmTcFormatVariableSize)null);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FID:
				return FID_EDEFAULT == null ? fid != null : !FID_EDEFAULT.equals(fid);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__PFID:
				return PFID_EDEFAULT == null ? pfid != null : !PFID_EDEFAULT.equals(pfid);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__TYPE:
				return isSetType();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__BYTE_ORDER:
				return isSetByteOrder();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__FIRST_BIT:
				return isSetFirstBit();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__CONST_SIZE:
				return constSize != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__GLOBAL_OFFSET:
				return globalOffset != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__MAX_SIZE:
				return maxSize != null;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_VS_FIELD__VARIABLE_SIZE:
				return variableSize != null;
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
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", byteOrder: ");
		if (byteOrderESet) result.append(byteOrder); else result.append("<unset>");
		result.append(", firstBit: ");
		if (firstBitESet) result.append(firstBit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatVSFieldImpl
