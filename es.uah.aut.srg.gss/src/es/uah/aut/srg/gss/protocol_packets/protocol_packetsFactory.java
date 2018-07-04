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
package es.uah.aut.srg.gss.protocol_packets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage
 * @generated
 */
public interface protocol_packetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protocol_packetsFactory eINSTANCE = es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Protocol Packets Protocol Packets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Protocol Packets Protocol Packets</em>'.
	 * @generated
	 */
	GSSProtocolPacketsProtocolPackets createGSSProtocolPacketsProtocolPackets();

	/**
	 * Returns a new object of class '<em>GSS Protocol Packets Protocol Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Protocol Packets Protocol Packet</em>'.
	 * @generated
	 */
	GSSProtocolPacketsProtocolPacket createGSSProtocolPacketsProtocolPacket();

	/**
	 * Returns a new object of class '<em>GSS Protocol Packets Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Protocol Packets Export</em>'.
	 * @generated
	 */
	GSSProtocolPacketsExport createGSSProtocolPacketsExport();

	/**
	 * Returns a new object of class '<em>GSS Protocol Packets Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Protocol Packets Format</em>'.
	 * @generated
	 */
	GSSProtocolPacketsFormat createGSSProtocolPacketsFormat();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	protocol_packetsPackage getprotocol_packetsPackage();

} //protocol_packetsFactory
