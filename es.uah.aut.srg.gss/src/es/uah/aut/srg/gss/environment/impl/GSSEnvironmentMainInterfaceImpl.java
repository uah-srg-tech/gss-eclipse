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
package es.uah.aut.srg.gss.environment.impl;

import es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Main Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMainInterfaceImpl#getProtocolPacketsFile <em>Protocol Packets File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentMainInterfaceImpl extends GSSEnvironmentInterfaceImpl implements GSSEnvironmentMainInterface {
	/**
	 * The cached value of the '{@link #getProtocolPacketsFile() <em>Protocol Packets File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolPacketsFile()
	 * @generated
	 * @ordered
	 */
	protected GSSProtocolPacketsProtocolPackets protocolPacketsFile;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentMainInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_MAIN_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPackets getProtocolPacketsFile() {
		if (protocolPacketsFile != null && protocolPacketsFile.eIsProxy()) {
			InternalEObject oldProtocolPacketsFile = (InternalEObject)protocolPacketsFile;
			protocolPacketsFile = (GSSProtocolPacketsProtocolPackets)eResolveProxy(oldProtocolPacketsFile);
			if (protocolPacketsFile != oldProtocolPacketsFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
			}
		}
		return protocolPacketsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPackets basicGetProtocolPacketsFile() {
		return protocolPacketsFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolPacketsFile(GSSProtocolPacketsProtocolPackets newProtocolPacketsFile) {
		GSSProtocolPacketsProtocolPackets oldProtocolPacketsFile = protocolPacketsFile;
		protocolPacketsFile = newProtocolPacketsFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE__PROTOCOL_PACKETS_FILE:
				if (resolve) return getProtocolPacketsFile();
				return basicGetProtocolPacketsFile();
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
			case environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)null);
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
			case environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE__PROTOCOL_PACKETS_FILE:
				return protocolPacketsFile != null;
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentMainInterfaceImpl
