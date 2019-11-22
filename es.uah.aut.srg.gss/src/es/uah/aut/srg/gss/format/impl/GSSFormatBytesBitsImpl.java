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
import es.uah.aut.srg.gss.format.formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Format Bytes Bits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatBytesBitsImpl#getBytes <em>Bytes</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.impl.GSSFormatBytesBitsImpl#getBits <em>Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFormatBytesBitsImpl extends MinimalEObjectImpl.Container implements GSSFormatBytesBits {
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
	protected GSSFormatBytesBitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return formatPackage.Literals.GSS_FORMAT_BYTES_BITS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_BYTES_BITS__BYTES, oldBytes, bytes));
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
			eNotify(new ENotificationImpl(this, Notification.SET, formatPackage.GSS_FORMAT_BYTES_BITS__BITS, oldBits, bits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case formatPackage.GSS_FORMAT_BYTES_BITS__BYTES:
				return getBytes();
			case formatPackage.GSS_FORMAT_BYTES_BITS__BITS:
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
			case formatPackage.GSS_FORMAT_BYTES_BITS__BYTES:
				setBytes((String)newValue);
				return;
			case formatPackage.GSS_FORMAT_BYTES_BITS__BITS:
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
			case formatPackage.GSS_FORMAT_BYTES_BITS__BYTES:
				setBytes(BYTES_EDEFAULT);
				return;
			case formatPackage.GSS_FORMAT_BYTES_BITS__BITS:
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
			case formatPackage.GSS_FORMAT_BYTES_BITS__BYTES:
				return BYTES_EDEFAULT == null ? bytes != null : !BYTES_EDEFAULT.equals(bytes);
			case formatPackage.GSS_FORMAT_BYTES_BITS__BITS:
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

} //GSSFormatBytesBitsImpl
