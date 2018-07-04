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

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsExport;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;
import es.uah.aut.srg.gss.protocol_packets.protocol_packetsFactory;
import es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class protocol_packetsPackageImpl extends EPackageImpl implements protocol_packetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssProtocolPacketsProtocolPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssProtocolPacketsProtocolPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssProtocolPacketsExportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssProtocolPacketsFormatEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private protocol_packetsPackageImpl() {
		super(eNS_URI, protocol_packetsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link protocol_packetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static protocol_packetsPackage init() {
		if (isInited) return (protocol_packetsPackage)EPackage.Registry.INSTANCE.getEPackage(protocol_packetsPackage.eNS_URI);

		// Obtain or create and register package
		protocol_packetsPackageImpl theprotocol_packetsPackage = (protocol_packetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof protocol_packetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new protocol_packetsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theprotocol_packetsPackage.createPackageContents();

		// Initialize created meta-data
		theprotocol_packetsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theprotocol_packetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(protocol_packetsPackage.eNS_URI, theprotocol_packetsPackage);
		return theprotocol_packetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSProtocolPacketsProtocolPackets() {
		return gssProtocolPacketsProtocolPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSProtocolPacketsProtocolPackets_ProtocolPacket() {
		return (EReference)gssProtocolPacketsProtocolPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSProtocolPacketsProtocolPacket() {
		return gssProtocolPacketsProtocolPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSProtocolPacketsProtocolPacket_Name() {
		return (EAttribute)gssProtocolPacketsProtocolPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSProtocolPacketsProtocolPacket_IfRef() {
		return (EAttribute)gssProtocolPacketsProtocolPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSProtocolPacketsProtocolPacket_LevelRef() {
		return (EAttribute)gssProtocolPacketsProtocolPacketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSProtocolPacketsProtocolPacket_Export() {
		return (EReference)gssProtocolPacketsProtocolPacketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSProtocolPacketsProtocolPacket_Format() {
		return (EReference)gssProtocolPacketsProtocolPacketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSProtocolPacketsExport() {
		return gssProtocolPacketsExportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSProtocolPacketsExport_File() {
		return (EAttribute)gssProtocolPacketsExportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSProtocolPacketsFormat() {
		return gssProtocolPacketsFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSProtocolPacketsFormat_File() {
		return (EAttribute)gssProtocolPacketsFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public protocol_packetsFactory getprotocol_packetsFactory() {
		return (protocol_packetsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gssProtocolPacketsProtocolPacketsEClass = createEClass(GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS);
		createEReference(gssProtocolPacketsProtocolPacketsEClass, GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET);

		gssProtocolPacketsProtocolPacketEClass = createEClass(GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET);
		createEAttribute(gssProtocolPacketsProtocolPacketEClass, GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME);
		createEAttribute(gssProtocolPacketsProtocolPacketEClass, GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF);
		createEAttribute(gssProtocolPacketsProtocolPacketEClass, GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF);
		createEReference(gssProtocolPacketsProtocolPacketEClass, GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT);
		createEReference(gssProtocolPacketsProtocolPacketEClass, GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT);

		gssProtocolPacketsExportEClass = createEClass(GSS_PROTOCOL_PACKETS_EXPORT);
		createEAttribute(gssProtocolPacketsExportEClass, GSS_PROTOCOL_PACKETS_EXPORT__FILE);

		gssProtocolPacketsFormatEClass = createEClass(GSS_PROTOCOL_PACKETS_FORMAT);
		createEAttribute(gssProtocolPacketsFormatEClass, GSS_PROTOCOL_PACKETS_FORMAT__FILE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		commonPackage thecommonPackage = (commonPackage)EPackage.Registry.INSTANCE.getEPackage(commonPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssProtocolPacketsProtocolPacketsEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssProtocolPacketsProtocolPacketsEClass, GSSProtocolPacketsProtocolPackets.class, "GSSProtocolPacketsProtocolPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSProtocolPacketsProtocolPackets_ProtocolPacket(), this.getGSSProtocolPacketsProtocolPacket(), null, "ProtocolPacket", null, 1, 15, GSSProtocolPacketsProtocolPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssProtocolPacketsProtocolPacketEClass, GSSProtocolPacketsProtocolPacket.class, "GSSProtocolPacketsProtocolPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSProtocolPacketsProtocolPacket_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSProtocolPacketsProtocolPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSProtocolPacketsProtocolPacket_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSProtocolPacketsProtocolPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSProtocolPacketsProtocolPacket_LevelRef(), ecorePackage.getEString(), "levelRef", null, 1, 1, GSSProtocolPacketsProtocolPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSProtocolPacketsProtocolPacket_Export(), this.getGSSProtocolPacketsExport(), null, "export", null, 1, 1, GSSProtocolPacketsProtocolPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSProtocolPacketsProtocolPacket_Format(), this.getGSSProtocolPacketsFormat(), null, "format", null, 1, 1, GSSProtocolPacketsProtocolPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssProtocolPacketsExportEClass, GSSProtocolPacketsExport.class, "GSSProtocolPacketsExport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSProtocolPacketsExport_File(), ecorePackage.getEString(), "file", null, 1, 1, GSSProtocolPacketsExport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssProtocolPacketsFormatEClass, GSSProtocolPacketsFormat.class, "GSSProtocolPacketsFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSProtocolPacketsFormat_File(), ecorePackage.getEString(), "file", null, 1, 1, GSSProtocolPacketsFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //protocol_packetsPackageImpl
