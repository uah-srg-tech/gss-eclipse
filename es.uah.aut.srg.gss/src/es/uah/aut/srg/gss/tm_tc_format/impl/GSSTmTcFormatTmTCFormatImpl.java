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

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormatType;
import es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Tm Tc Format Tm TC Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.impl.GSSTmTcFormatTmTCFormatImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSTmTcFormatTmTCFormatImpl extends GSSModelElementImpl implements GSSTmTcFormatTmTCFormat {
	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSTmTcFormatTmTCFormatType TYPE_EDEFAULT = GSSTmTcFormatTmTCFormatType.TM;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTCFormatType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSTmTcFormatTmTCFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tm_tc_formatPackage.Literals.GSS_TM_TC_FORMAT_TM_TC_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTCFormatType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(GSSTmTcFormatTmTCFormatType newType) {
		GSSTmTcFormatTmTCFormatType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				return getProtocol();
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				return getType();
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				setType((GSSTmTcFormatTmTCFormatType)newValue);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case tm_tc_formatPackage.GSS_TM_TC_FORMAT_TM_TC_FORMAT__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //GSSTmTcFormatTmTCFormatImpl
