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

import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol;
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Environment Protocols</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolsImpl#getProtocolPacketsFile <em>Protocol Packets File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolsImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSEnvironmentProtocolsImpl extends MinimalEObjectImpl.Container implements GSSEnvironmentProtocols {
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
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSEnvironmentProtocol> protocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSEnvironmentProtocolsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return environmentPackage.Literals.GSS_ENVIRONMENT_PROTOCOLS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL_PACKETS_FILE, oldProtocolPacketsFile, protocolPacketsFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSEnvironmentProtocol> getProtocol() {
		if (protocol == null) {
			protocol = new EObjectContainmentEList<GSSEnvironmentProtocol>(GSSEnvironmentProtocol.class, this, environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL);
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL:
				return ((InternalEList<?>)getProtocol()).basicRemove(otherEnd, msgs);
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL_PACKETS_FILE:
				if (resolve) return getProtocolPacketsFile();
				return basicGetProtocolPacketsFile();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL:
				return getProtocol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)newValue);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL:
				getProtocol().clear();
				getProtocol().addAll((Collection<? extends GSSEnvironmentProtocol>)newValue);
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL_PACKETS_FILE:
				setProtocolPacketsFile((GSSProtocolPacketsProtocolPackets)null);
				return;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL:
				getProtocol().clear();
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
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL_PACKETS_FILE:
				return protocolPacketsFile != null;
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL:
				return protocol != null && !protocol.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSEnvironmentProtocolsImpl
