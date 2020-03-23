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
package es.uah.aut.srg.gss.iface.impl;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.iface.GSSIfaceConstSize;
import es.uah.aut.srg.gss.iface.GSSIfaceDummyPort;
import es.uah.aut.srg.gss.iface.GSSIfacePort;
import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;
import es.uah.aut.srg.gss.iface.GSSIfaceReadingPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldOffset;
import es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPort;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit;
import es.uah.aut.srg.gss.iface.ifaceFactory;
import es.uah.aut.srg.gss.iface.ifacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ifacePackageImpl extends EPackageImpl implements ifacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfacePortConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfacePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceSpWPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceUartPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceSpWTCPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceDummyPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceReadingPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceUartProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceConstSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceSizeFieldOffsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceSizeFieldTrimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceSyncPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfaceSpWPortTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfaceUartPortBaudRateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfaceUartPortParityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfaceUartPortDataBitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfaceUartPortStopBitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfaceUartProtocolUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfaceUartProtocolPowerEEnum = null;

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
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ifacePackageImpl() {
		super(eNS_URI, ifaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ifacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ifacePackage init() {
		if (isInited) return (ifacePackage)EPackage.Registry.INSTANCE.getEPackage(ifacePackage.eNS_URI);

		// Obtain or create and register package
		ifacePackageImpl theifacePackage = (ifacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ifacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ifacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		commonPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theifacePackage.createPackageContents();

		// Initialize created meta-data
		theifacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theifacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ifacePackage.eNS_URI, theifacePackage);
		return theifacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfacePortConfig() {
		return gssIfacePortConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfacePortConfig_PortConfig() {
		return (EReference)gssIfacePortConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfacePort() {
		return gssIfacePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSpWPort() {
		return gssIfaceSpWPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSpWPort_Type() {
		return (EAttribute)gssIfaceSpWPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSpWPort_Link() {
		return (EAttribute)gssIfaceSpWPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSpWPort_WritingPort() {
		return (EAttribute)gssIfaceSpWPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceSpWPort_ReadingPort() {
		return (EReference)gssIfaceSpWPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceUartPort() {
		return gssIfaceUartPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartPort_Number() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartPort_BaudRate() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartPort_Parity() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartPort_DataBits() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartPort_StopBits() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartPort_InputQueueSize() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartPort_OutputQueueSize() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceUartPort_UartProtocol() {
		return (EReference)gssIfaceUartPortEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSpWTCPort() {
		return gssIfaceSpWTCPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSpWTCPort_SpwPortRef() {
		return (EAttribute)gssIfaceSpWTCPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceDummyPort() {
		return gssIfaceDummyPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceReadingPort() {
		return gssIfaceReadingPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceReadingPort_Port() {
		return (EAttribute)gssIfaceReadingPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceUartProtocol() {
		return gssIfaceUartProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartProtocol_Unit() {
		return (EAttribute)gssIfaceUartProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceUartProtocol_Power() {
		return (EAttribute)gssIfaceUartProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceUartProtocol_ConstSize() {
		return (EReference)gssIfaceUartProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceUartProtocol_SizeFieldOffset() {
		return (EReference)gssIfaceUartProtocolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceUartProtocol_SizeFieldTrim() {
		return (EReference)gssIfaceUartProtocolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceUartProtocol_SyncPattern() {
		return (EReference)gssIfaceUartProtocolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceConstSize() {
		return gssIfaceConstSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceConstSize_Bytes() {
		return (EAttribute)gssIfaceConstSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceConstSize_Bits() {
		return (EAttribute)gssIfaceConstSizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSizeFieldOffset() {
		return gssIfaceSizeFieldOffsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSizeFieldOffset_Bytes() {
		return (EAttribute)gssIfaceSizeFieldOffsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSizeFieldOffset_Bits() {
		return (EAttribute)gssIfaceSizeFieldOffsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSizeFieldTrim() {
		return gssIfaceSizeFieldTrimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSizeFieldTrim_Bytes() {
		return (EAttribute)gssIfaceSizeFieldTrimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSizeFieldTrim_Bits() {
		return (EAttribute)gssIfaceSizeFieldTrimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSyncPattern() {
		return gssIfaceSyncPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSyncPattern_HexValue() {
		return (EAttribute)gssIfaceSyncPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfaceSpWPortType() {
		return gssIfaceSpWPortTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfaceUartPortBaudRate() {
		return gssIfaceUartPortBaudRateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfaceUartPortParity() {
		return gssIfaceUartPortParityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfaceUartPortDataBits() {
		return gssIfaceUartPortDataBitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfaceUartPortStopBits() {
		return gssIfaceUartPortStopBitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfaceUartProtocolUnit() {
		return gssIfaceUartProtocolUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfaceUartProtocolPower() {
		return gssIfaceUartProtocolPowerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ifaceFactory getifaceFactory() {
		return (ifaceFactory)getEFactoryInstance();
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
		gssIfacePortConfigEClass = createEClass(GSS_IFACE_PORT_CONFIG);
		createEReference(gssIfacePortConfigEClass, GSS_IFACE_PORT_CONFIG__PORT_CONFIG);

		gssIfacePortEClass = createEClass(GSS_IFACE_PORT);

		gssIfaceSpWPortEClass = createEClass(GSS_IFACE_SP_WPORT);
		createEAttribute(gssIfaceSpWPortEClass, GSS_IFACE_SP_WPORT__TYPE);
		createEAttribute(gssIfaceSpWPortEClass, GSS_IFACE_SP_WPORT__LINK);
		createEAttribute(gssIfaceSpWPortEClass, GSS_IFACE_SP_WPORT__WRITING_PORT);
		createEReference(gssIfaceSpWPortEClass, GSS_IFACE_SP_WPORT__READING_PORT);

		gssIfaceReadingPortEClass = createEClass(GSS_IFACE_READING_PORT);
		createEAttribute(gssIfaceReadingPortEClass, GSS_IFACE_READING_PORT__PORT);

		gssIfaceUartPortEClass = createEClass(GSS_IFACE_UART_PORT);
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__NUMBER);
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__BAUD_RATE);
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__PARITY);
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__DATA_BITS);
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__STOP_BITS);
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__INPUT_QUEUE_SIZE);
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__OUTPUT_QUEUE_SIZE);
		createEReference(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__UART_PROTOCOL);

		gssIfaceUartProtocolEClass = createEClass(GSS_IFACE_UART_PROTOCOL);
		createEAttribute(gssIfaceUartProtocolEClass, GSS_IFACE_UART_PROTOCOL__UNIT);
		createEAttribute(gssIfaceUartProtocolEClass, GSS_IFACE_UART_PROTOCOL__POWER);
		createEReference(gssIfaceUartProtocolEClass, GSS_IFACE_UART_PROTOCOL__CONST_SIZE);
		createEReference(gssIfaceUartProtocolEClass, GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET);
		createEReference(gssIfaceUartProtocolEClass, GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM);
		createEReference(gssIfaceUartProtocolEClass, GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN);

		gssIfaceConstSizeEClass = createEClass(GSS_IFACE_CONST_SIZE);
		createEAttribute(gssIfaceConstSizeEClass, GSS_IFACE_CONST_SIZE__BYTES);
		createEAttribute(gssIfaceConstSizeEClass, GSS_IFACE_CONST_SIZE__BITS);

		gssIfaceSizeFieldOffsetEClass = createEClass(GSS_IFACE_SIZE_FIELD_OFFSET);
		createEAttribute(gssIfaceSizeFieldOffsetEClass, GSS_IFACE_SIZE_FIELD_OFFSET__BYTES);
		createEAttribute(gssIfaceSizeFieldOffsetEClass, GSS_IFACE_SIZE_FIELD_OFFSET__BITS);

		gssIfaceSizeFieldTrimEClass = createEClass(GSS_IFACE_SIZE_FIELD_TRIM);
		createEAttribute(gssIfaceSizeFieldTrimEClass, GSS_IFACE_SIZE_FIELD_TRIM__BYTES);
		createEAttribute(gssIfaceSizeFieldTrimEClass, GSS_IFACE_SIZE_FIELD_TRIM__BITS);

		gssIfaceSyncPatternEClass = createEClass(GSS_IFACE_SYNC_PATTERN);
		createEAttribute(gssIfaceSyncPatternEClass, GSS_IFACE_SYNC_PATTERN__HEX_VALUE);

		gssIfaceSpWTCPortEClass = createEClass(GSS_IFACE_SP_WTC_PORT);
		createEAttribute(gssIfaceSpWTCPortEClass, GSS_IFACE_SP_WTC_PORT__SPW_PORT_REF);

		gssIfaceDummyPortEClass = createEClass(GSS_IFACE_DUMMY_PORT);

		// Create enums
		gssIfaceSpWPortTypeEEnum = createEEnum(GSS_IFACE_SP_WPORT_TYPE);
		gssIfaceUartPortBaudRateEEnum = createEEnum(GSS_IFACE_UART_PORT_BAUD_RATE);
		gssIfaceUartPortParityEEnum = createEEnum(GSS_IFACE_UART_PORT_PARITY);
		gssIfaceUartPortDataBitsEEnum = createEEnum(GSS_IFACE_UART_PORT_DATA_BITS);
		gssIfaceUartPortStopBitsEEnum = createEEnum(GSS_IFACE_UART_PORT_STOP_BITS);
		gssIfaceUartProtocolUnitEEnum = createEEnum(GSS_IFACE_UART_PROTOCOL_UNIT);
		gssIfaceUartProtocolPowerEEnum = createEEnum(GSS_IFACE_UART_PROTOCOL_POWER);
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
		gssIfacePortConfigEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());
		gssIfaceSpWPortEClass.getESuperTypes().add(this.getGSSIfacePort());
		gssIfaceUartPortEClass.getESuperTypes().add(this.getGSSIfacePort());
		gssIfaceSpWTCPortEClass.getESuperTypes().add(this.getGSSIfacePort());
		gssIfaceDummyPortEClass.getESuperTypes().add(this.getGSSIfacePort());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssIfacePortConfigEClass, GSSIfacePortConfig.class, "GSSIfacePortConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSIfacePortConfig_PortConfig(), this.getGSSIfacePort(), null, "portConfig", null, 1, 1, GSSIfacePortConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfacePortEClass, GSSIfacePort.class, "GSSIfacePort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssIfaceSpWPortEClass, GSSIfaceSpWPort.class, "GSSIfaceSpWPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSpWPort_Type(), this.getGSSIfaceSpWPortType(), "type", null, 1, 1, GSSIfaceSpWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceSpWPort_Link(), ecorePackage.getEString(), "link", null, 1, 1, GSSIfaceSpWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceSpWPort_WritingPort(), ecorePackage.getEString(), "writingPort", null, 1, 1, GSSIfaceSpWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceSpWPort_ReadingPort(), this.getGSSIfaceReadingPort(), null, "readingPort", null, 1, 2, GSSIfaceSpWPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceReadingPortEClass, GSSIfaceReadingPort.class, "GSSIfaceReadingPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceReadingPort_Port(), ecorePackage.getEString(), "port", null, 1, 1, GSSIfaceReadingPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceUartPortEClass, GSSIfaceUartPort.class, "GSSIfaceUartPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceUartPort_Number(), ecorePackage.getEString(), "number", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceUartPort_BaudRate(), this.getGSSIfaceUartPortBaudRate(), "baudRate", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceUartPort_Parity(), this.getGSSIfaceUartPortParity(), "parity", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceUartPort_DataBits(), this.getGSSIfaceUartPortDataBits(), "dataBits", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceUartPort_StopBits(), this.getGSSIfaceUartPortStopBits(), "stopBits", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceUartPort_InputQueueSize(), ecorePackage.getEString(), "inputQueueSize", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceUartPort_OutputQueueSize(), ecorePackage.getEString(), "outputQueueSize", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceUartPort_UartProtocol(), this.getGSSIfaceUartProtocol(), null, "uartProtocol", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceUartProtocolEClass, GSSIfaceUartProtocol.class, "GSSIfaceUartProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceUartProtocol_Unit(), this.getGSSIfaceUartProtocolUnit(), "unit", null, 1, 1, GSSIfaceUartProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceUartProtocol_Power(), this.getGSSIfaceUartProtocolPower(), "power", null, 1, 1, GSSIfaceUartProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceUartProtocol_ConstSize(), this.getGSSIfaceConstSize(), null, "constSize", null, 1, 1, GSSIfaceUartProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceUartProtocol_SizeFieldOffset(), this.getGSSIfaceSizeFieldOffset(), null, "sizeFieldOffset", null, 1, 1, GSSIfaceUartProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceUartProtocol_SizeFieldTrim(), this.getGSSIfaceSizeFieldTrim(), null, "sizeFieldTrim", null, 1, 1, GSSIfaceUartProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceUartProtocol_SyncPattern(), this.getGSSIfaceSyncPattern(), null, "syncPattern", null, 0, 1, GSSIfaceUartProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceConstSizeEClass, GSSIfaceConstSize.class, "GSSIfaceConstSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceConstSize_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSIfaceConstSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceConstSize_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSIfaceConstSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceSizeFieldOffsetEClass, GSSIfaceSizeFieldOffset.class, "GSSIfaceSizeFieldOffset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSizeFieldOffset_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSIfaceSizeFieldOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceSizeFieldOffset_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSIfaceSizeFieldOffset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceSizeFieldTrimEClass, GSSIfaceSizeFieldTrim.class, "GSSIfaceSizeFieldTrim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSizeFieldTrim_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSIfaceSizeFieldTrim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceSizeFieldTrim_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSIfaceSizeFieldTrim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceSyncPatternEClass, GSSIfaceSyncPattern.class, "GSSIfaceSyncPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSyncPattern_HexValue(), ecorePackage.getEString(), "hexValue", null, 1, 1, GSSIfaceSyncPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceSpWTCPortEClass, GSSIfaceSpWTCPort.class, "GSSIfaceSpWTCPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSpWTCPort_SpwPortRef(), ecorePackage.getEString(), "spwPortRef", null, 1, 1, GSSIfaceSpWTCPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceDummyPortEClass, GSSIfaceDummyPort.class, "GSSIfaceDummyPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(gssIfaceSpWPortTypeEEnum, GSSIfaceSpWPortType.class, "GSSIfaceSpWPortType");
		addEEnumLiteral(gssIfaceSpWPortTypeEEnum, GSSIfaceSpWPortType.USB);
		addEEnumLiteral(gssIfaceSpWPortTypeEEnum, GSSIfaceSpWPortType.MK2);
		addEEnumLiteral(gssIfaceSpWPortTypeEEnum, GSSIfaceSpWPortType.PCI);

		initEEnum(gssIfaceUartPortBaudRateEEnum, GSSIfaceUartPortBaudRate.class, "GSSIfaceUartPortBaudRate");
		addEEnumLiteral(gssIfaceUartPortBaudRateEEnum, GSSIfaceUartPortBaudRate._38400);
		addEEnumLiteral(gssIfaceUartPortBaudRateEEnum, GSSIfaceUartPortBaudRate._115200);

		initEEnum(gssIfaceUartPortParityEEnum, GSSIfaceUartPortParity.class, "GSSIfaceUartPortParity");
		addEEnumLiteral(gssIfaceUartPortParityEEnum, GSSIfaceUartPortParity.NO);
		addEEnumLiteral(gssIfaceUartPortParityEEnum, GSSIfaceUartPortParity.ODD);
		addEEnumLiteral(gssIfaceUartPortParityEEnum, GSSIfaceUartPortParity.EVEN);
		addEEnumLiteral(gssIfaceUartPortParityEEnum, GSSIfaceUartPortParity.MARK);
		addEEnumLiteral(gssIfaceUartPortParityEEnum, GSSIfaceUartPortParity.SPACE);

		initEEnum(gssIfaceUartPortDataBitsEEnum, GSSIfaceUartPortDataBits.class, "GSSIfaceUartPortDataBits");
		addEEnumLiteral(gssIfaceUartPortDataBitsEEnum, GSSIfaceUartPortDataBits._5);
		addEEnumLiteral(gssIfaceUartPortDataBitsEEnum, GSSIfaceUartPortDataBits._6);
		addEEnumLiteral(gssIfaceUartPortDataBitsEEnum, GSSIfaceUartPortDataBits._7);
		addEEnumLiteral(gssIfaceUartPortDataBitsEEnum, GSSIfaceUartPortDataBits._8);

		initEEnum(gssIfaceUartPortStopBitsEEnum, GSSIfaceUartPortStopBits.class, "GSSIfaceUartPortStopBits");
		addEEnumLiteral(gssIfaceUartPortStopBitsEEnum, GSSIfaceUartPortStopBits._1);
		addEEnumLiteral(gssIfaceUartPortStopBitsEEnum, GSSIfaceUartPortStopBits._2);

		initEEnum(gssIfaceUartProtocolUnitEEnum, GSSIfaceUartProtocolUnit.class, "GSSIfaceUartProtocolUnit");
		addEEnumLiteral(gssIfaceUartProtocolUnitEEnum, GSSIfaceUartProtocolUnit.BYTES);
		addEEnumLiteral(gssIfaceUartProtocolUnitEEnum, GSSIfaceUartProtocolUnit.BITS);

		initEEnum(gssIfaceUartProtocolPowerEEnum, GSSIfaceUartProtocolPower.class, "GSSIfaceUartProtocolPower");
		addEEnumLiteral(gssIfaceUartProtocolPowerEEnum, GSSIfaceUartProtocolPower.NO);
		addEEnumLiteral(gssIfaceUartProtocolPowerEEnum, GSSIfaceUartProtocolPower._2);
		addEEnumLiteral(gssIfaceUartProtocolPowerEEnum, GSSIfaceUartProtocolPower._2WITH_0);

		// Create resource
		createResource(eNS_URI);
	}

} //ifacePackageImpl
