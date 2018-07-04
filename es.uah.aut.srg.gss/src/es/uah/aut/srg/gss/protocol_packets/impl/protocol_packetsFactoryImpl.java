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
package es.uah.aut.srg.gss.protocol_packets.impl;

import es.uah.aut.srg.gss.protocol_packets.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class protocol_packetsFactoryImpl extends EFactoryImpl implements protocol_packetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static protocol_packetsFactory init() {
		try {
			protocol_packetsFactory theprotocol_packetsFactory = (protocol_packetsFactory)EPackage.Registry.INSTANCE.getEFactory(protocol_packetsPackage.eNS_URI);
			if (theprotocol_packetsFactory != null) {
				return theprotocol_packetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new protocol_packetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public protocol_packetsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS: return createGSSProtocolPacketsProtocolPackets();
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET: return createGSSProtocolPacketsProtocolPacket();
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_EXPORT: return createGSSProtocolPacketsExport();
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_FORMAT: return createGSSProtocolPacketsFormat();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPackets createGSSProtocolPacketsProtocolPackets() {
		GSSProtocolPacketsProtocolPacketsImpl gssProtocolPacketsProtocolPackets = new GSSProtocolPacketsProtocolPacketsImpl();
		return gssProtocolPacketsProtocolPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsProtocolPacket createGSSProtocolPacketsProtocolPacket() {
		GSSProtocolPacketsProtocolPacketImpl gssProtocolPacketsProtocolPacket = new GSSProtocolPacketsProtocolPacketImpl();
		return gssProtocolPacketsProtocolPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsExport createGSSProtocolPacketsExport() {
		GSSProtocolPacketsExportImpl gssProtocolPacketsExport = new GSSProtocolPacketsExportImpl();
		return gssProtocolPacketsExport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSProtocolPacketsFormat createGSSProtocolPacketsFormat() {
		GSSProtocolPacketsFormatImpl gssProtocolPacketsFormat = new GSSProtocolPacketsFormatImpl();
		return gssProtocolPacketsFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public protocol_packetsPackage getprotocol_packetsPackage() {
		return (protocol_packetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static protocol_packetsPackage getPackage() {
		return protocol_packetsPackage.eINSTANCE;
	}

} //protocol_packetsFactoryImpl
