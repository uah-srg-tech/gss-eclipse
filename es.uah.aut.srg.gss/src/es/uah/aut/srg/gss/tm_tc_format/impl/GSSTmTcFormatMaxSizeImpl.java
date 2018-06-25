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

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatMaxSize;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format Max Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatMaxSizeImpl#getBytes <em>Bytes</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatMaxSizeImpl#getBits <em>Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatMaxSizeImpl extends MinimalEObjectImpl.Container implements GSSTmTcFormatMaxSize {
	/**
	 * The default value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected static final String BYTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBytes() <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBytes()
	 * @generated
	 * @ordered
	 */
	protected String bytes = BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getBits() <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBits()
	 * @generated
	 * @ordered
	 */
	protected static final String BITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBits() <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBits()
	 * @generated
	 * @ordered
	 */
	protected String bits = BITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatMaxSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_MAX_SIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBytes() {
		return bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBytes(String newBytes) {
		String oldBytes = bytes;
		bytes = newBytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BYTES, oldBytes, bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBits() {
		return bits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBits(String newBits) {
		String oldBits = bits;
		bits = newBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BITS, oldBits, bits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BYTES:
				return getBytes();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BITS:
				return getBits();
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BYTES:
				setBytes((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BITS:
				setBits((String)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BYTES:
				setBytes(BYTES_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BITS:
				setBits(BITS_EDEFAULT);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BYTES:
				return BYTES_EDEFAULT == null ? bytes != null : !BYTES_EDEFAULT.equals(bytes);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_MAX_SIZE__BITS:
				return BITS_EDEFAULT == null ? bits != null : !BITS_EDEFAULT.equals(bits);
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
		result.append(" (bytes: ");
		result.append(bytes);
		result.append(", bits: ");
		result.append(bits);
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatMaxSizeImpl
