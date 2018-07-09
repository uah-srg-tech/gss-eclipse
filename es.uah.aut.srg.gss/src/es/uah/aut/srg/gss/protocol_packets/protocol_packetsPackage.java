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

import es.uah.aut.srg.gss.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsFactory
 * @model kind="package"
 * @generated
 */
public interface protocol_packetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "protocol_packets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/protocol_packets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gss";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protocol_packetsPackage eINSTANCE = es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketsImpl <em>GSS Protocol Packets Protocol Packets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketsImpl
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsProtocolPackets()
	 * @generated
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Protocol Packet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Protocol Packets Protocol Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Protocol Packets Protocol Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl <em>GSS Protocol Packets Protocol Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsProtocolPacket()
	 * @generated
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME = 0;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF = 1;

	/**
	 * The feature id for the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF = 2;

	/**
	 * The feature id for the '<em><b>Export</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT = 3;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT = 4;

	/**
	 * The number of structural features of the '<em>GSS Protocol Packets Protocol Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Protocol Packets Protocol Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsExportImpl <em>GSS Protocol Packets Export</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsExportImpl
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsExport()
	 * @generated
	 */
	int GSS_PROTOCOL_PACKETS_EXPORT = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_EXPORT__FILE = 0;

	/**
	 * The number of structural features of the '<em>GSS Protocol Packets Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_EXPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Protocol Packets Export</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_EXPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsFormatImpl <em>GSS Protocol Packets Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsFormatImpl
	 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsFormat()
	 * @generated
	 */
	int GSS_PROTOCOL_PACKETS_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_FORMAT__FILE = 0;

	/**
	 * The number of structural features of the '<em>GSS Protocol Packets Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_FORMAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Protocol Packets Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_PROTOCOL_PACKETS_FORMAT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets <em>GSS Protocol Packets Protocol Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Protocol Packets Protocol Packets</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets
	 * @generated
	 */
	EClass getGSSProtocolPacketsProtocolPackets();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets#getProtocolPacket <em>Protocol Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol Packet</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets#getProtocolPacket()
	 * @see #getGSSProtocolPacketsProtocolPackets()
	 * @generated
	 */
	EReference getGSSProtocolPacketsProtocolPackets_ProtocolPacket();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket <em>GSS Protocol Packets Protocol Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Protocol Packets Protocol Packet</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket
	 * @generated
	 */
	EClass getGSSProtocolPacketsProtocolPacket();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getName()
	 * @see #getGSSProtocolPacketsProtocolPacket()
	 * @generated
	 */
	EAttribute getGSSProtocolPacketsProtocolPacket_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getIfRef()
	 * @see #getGSSProtocolPacketsProtocolPacket()
	 * @generated
	 */
	EAttribute getGSSProtocolPacketsProtocolPacket_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getLevelRef <em>Level Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Ref</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getLevelRef()
	 * @see #getGSSProtocolPacketsProtocolPacket()
	 * @generated
	 */
	EAttribute getGSSProtocolPacketsProtocolPacket_LevelRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getExport <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Export</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getExport()
	 * @see #getGSSProtocolPacketsProtocolPacket()
	 * @generated
	 */
	EReference getGSSProtocolPacketsProtocolPacket_Export();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getFormat()
	 * @see #getGSSProtocolPacketsProtocolPacket()
	 * @generated
	 */
	EReference getGSSProtocolPacketsProtocolPacket_Format();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsExport <em>GSS Protocol Packets Export</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Protocol Packets Export</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsExport
	 * @generated
	 */
	EClass getGSSProtocolPacketsExport();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsExport#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsExport#getFile()
	 * @see #getGSSProtocolPacketsExport()
	 * @generated
	 */
	EAttribute getGSSProtocolPacketsExport_File();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat <em>GSS Protocol Packets Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Protocol Packets Format</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat
	 * @generated
	 */
	EClass getGSSProtocolPacketsFormat();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat#getFile()
	 * @see #getGSSProtocolPacketsFormat()
	 * @generated
	 */
	EAttribute getGSSProtocolPacketsFormat_File();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	protocol_packetsFactory getprotocol_packetsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketsImpl <em>GSS Protocol Packets Protocol Packets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketsImpl
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsProtocolPackets()
		 * @generated
		 */
		EClass GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS = eINSTANCE.getGSSProtocolPacketsProtocolPackets();

		/**
		 * The meta object literal for the '<em><b>Protocol Packet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET = eINSTANCE.getGSSProtocolPacketsProtocolPackets_ProtocolPacket();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl <em>GSS Protocol Packets Protocol Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsProtocolPacket()
		 * @generated
		 */
		EClass GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET = eINSTANCE.getGSSProtocolPacketsProtocolPacket();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME = eINSTANCE.getGSSProtocolPacketsProtocolPacket_Name();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF = eINSTANCE.getGSSProtocolPacketsProtocolPacket_IfRef();

		/**
		 * The meta object literal for the '<em><b>Level Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF = eINSTANCE.getGSSProtocolPacketsProtocolPacket_LevelRef();

		/**
		 * The meta object literal for the '<em><b>Export</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT = eINSTANCE.getGSSProtocolPacketsProtocolPacket_Export();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT = eINSTANCE.getGSSProtocolPacketsProtocolPacket_Format();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsExportImpl <em>GSS Protocol Packets Export</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsExportImpl
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsExport()
		 * @generated
		 */
		EClass GSS_PROTOCOL_PACKETS_EXPORT = eINSTANCE.getGSSProtocolPacketsExport();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_PROTOCOL_PACKETS_EXPORT__FILE = eINSTANCE.getGSSProtocolPacketsExport_File();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsFormatImpl <em>GSS Protocol Packets Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsFormatImpl
		 * @see es.uah.aut.srg.gss.protocol_packets.impl.protocol_packetsPackageImpl#getGSSProtocolPacketsFormat()
		 * @generated
		 */
		EClass GSS_PROTOCOL_PACKETS_FORMAT = eINSTANCE.getGSSProtocolPacketsFormat();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_PROTOCOL_PACKETS_FORMAT__FILE = eINSTANCE.getGSSProtocolPacketsFormat_File();

	}

} //protocol_packetsPackage