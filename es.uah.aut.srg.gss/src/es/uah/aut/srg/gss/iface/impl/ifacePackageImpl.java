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
import es.uah.aut.srg.gss.iface.GSSIfaceDummyPort;
import es.uah.aut.srg.gss.iface.GSSIfacePort;
import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;
import es.uah.aut.srg.gss.iface.GSSIfacePortProtocol;
import es.uah.aut.srg.gss.iface.GSSIfacePortProtocolPower;
import es.uah.aut.srg.gss.iface.GSSIfacePortProtocolUnit;
import es.uah.aut.srg.gss.iface.GSSIfaceReadingPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSize;
import es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSocketPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSocketSrvPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType;
import es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort;
import es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPort;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits;
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
	private EClass gssIfaceSocketPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceSocketSrvPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfaceSocketCliPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssIfacePortProtocolEClass = null;

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
	private EClass gssIfaceSizeEClass = null;

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
	private EEnum gssIfaceUartPortFlowControlEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfacePortProtocolUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssIfacePortProtocolPowerEEnum = null;

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
	public EAttribute getGSSIfaceUartPort_FlowControl() {
		return (EAttribute)gssIfaceUartPortEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceUartPort_PortProtocol() {
		return (EReference)gssIfaceUartPortEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSocketPort() {
		return gssIfaceSocketPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSocketPort_PortNumber() {
		return (EAttribute)gssIfaceSocketPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfaceSocketPort_PortProtocol() {
		return (EReference)gssIfaceSocketPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSocketSrvPort() {
		return gssIfaceSocketSrvPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfaceSocketCliPort() {
		return gssIfaceSocketCliPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSocketCliPort_IpAddress() {
		return (EAttribute)gssIfaceSocketCliPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSIfacePortProtocol() {
		return gssIfacePortProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfacePortProtocol_Unit() {
		return (EAttribute)gssIfacePortProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfacePortProtocol_Power() {
		return (EAttribute)gssIfacePortProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfacePortProtocol_ConstSize() {
		return (EReference)gssIfacePortProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfacePortProtocol_SizeFieldOffset() {
		return (EReference)gssIfacePortProtocolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfacePortProtocol_SizeFieldTrim() {
		return (EReference)gssIfacePortProtocolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSIfacePortProtocol_SyncPattern() {
		return (EReference)gssIfacePortProtocolEClass.getEStructuralFeatures().get(5);
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
	public EClass getGSSIfaceSize() {
		return gssIfaceSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSize_Bytes() {
		return (EAttribute)gssIfaceSizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSIfaceSize_Bits() {
		return (EAttribute)gssIfaceSizeEClass.getEStructuralFeatures().get(1);
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
	public EEnum getGSSIfaceUartPortFlowControl() {
		return gssIfaceUartPortFlowControlEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfacePortProtocolUnit() {
		return gssIfacePortProtocolUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSIfacePortProtocolPower() {
		return gssIfacePortProtocolPowerEEnum;
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
		createEAttribute(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__FLOW_CONTROL);
		createEReference(gssIfaceUartPortEClass, GSS_IFACE_UART_PORT__PORT_PROTOCOL);

		gssIfaceSocketPortEClass = createEClass(GSS_IFACE_SOCKET_PORT);
		createEAttribute(gssIfaceSocketPortEClass, GSS_IFACE_SOCKET_PORT__PORT_NUMBER);
		createEReference(gssIfaceSocketPortEClass, GSS_IFACE_SOCKET_PORT__PORT_PROTOCOL);

		gssIfaceSocketSrvPortEClass = createEClass(GSS_IFACE_SOCKET_SRV_PORT);

		gssIfaceSocketCliPortEClass = createEClass(GSS_IFACE_SOCKET_CLI_PORT);
		createEAttribute(gssIfaceSocketCliPortEClass, GSS_IFACE_SOCKET_CLI_PORT__IP_ADDRESS);

		gssIfacePortProtocolEClass = createEClass(GSS_IFACE_PORT_PROTOCOL);
		createEAttribute(gssIfacePortProtocolEClass, GSS_IFACE_PORT_PROTOCOL__UNIT);
		createEAttribute(gssIfacePortProtocolEClass, GSS_IFACE_PORT_PROTOCOL__POWER);
		createEReference(gssIfacePortProtocolEClass, GSS_IFACE_PORT_PROTOCOL__CONST_SIZE);
		createEReference(gssIfacePortProtocolEClass, GSS_IFACE_PORT_PROTOCOL__SIZE_FIELD_OFFSET);
		createEReference(gssIfacePortProtocolEClass, GSS_IFACE_PORT_PROTOCOL__SIZE_FIELD_TRIM);
		createEReference(gssIfacePortProtocolEClass, GSS_IFACE_PORT_PROTOCOL__SYNC_PATTERN);

		gssIfaceSizeEClass = createEClass(GSS_IFACE_SIZE);
		createEAttribute(gssIfaceSizeEClass, GSS_IFACE_SIZE__BYTES);
		createEAttribute(gssIfaceSizeEClass, GSS_IFACE_SIZE__BITS);

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
		gssIfaceUartPortFlowControlEEnum = createEEnum(GSS_IFACE_UART_PORT_FLOW_CONTROL);
		gssIfacePortProtocolUnitEEnum = createEEnum(GSS_IFACE_PORT_PROTOCOL_UNIT);
		gssIfacePortProtocolPowerEEnum = createEEnum(GSS_IFACE_PORT_PROTOCOL_POWER);
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
		gssIfaceSocketPortEClass.getESuperTypes().add(this.getGSSIfacePort());
		gssIfaceSocketSrvPortEClass.getESuperTypes().add(this.getGSSIfaceSocketPort());
		gssIfaceSocketCliPortEClass.getESuperTypes().add(this.getGSSIfaceSocketPort());
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
		initEAttribute(getGSSIfaceUartPort_FlowControl(), this.getGSSIfaceUartPortFlowControl(), "flowControl", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceUartPort_PortProtocol(), this.getGSSIfacePortProtocol(), null, "portProtocol", null, 1, 1, GSSIfaceUartPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceSocketPortEClass, GSSIfaceSocketPort.class, "GSSIfaceSocketPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSocketPort_PortNumber(), ecorePackage.getEString(), "portNumber", null, 1, 1, GSSIfaceSocketPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfaceSocketPort_PortProtocol(), this.getGSSIfacePortProtocol(), null, "portProtocol", null, 1, 1, GSSIfaceSocketPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceSocketSrvPortEClass, GSSIfaceSocketSrvPort.class, "GSSIfaceSocketSrvPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssIfaceSocketCliPortEClass, GSSIfaceSocketCliPort.class, "GSSIfaceSocketCliPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSocketCliPort_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 1, 1, GSSIfaceSocketCliPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfacePortProtocolEClass, GSSIfacePortProtocol.class, "GSSIfacePortProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfacePortProtocol_Unit(), this.getGSSIfacePortProtocolUnit(), "unit", null, 1, 1, GSSIfacePortProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfacePortProtocol_Power(), this.getGSSIfacePortProtocolPower(), "power", null, 1, 1, GSSIfacePortProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfacePortProtocol_ConstSize(), this.getGSSIfaceSize(), null, "constSize", null, 1, 1, GSSIfacePortProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfacePortProtocol_SizeFieldOffset(), this.getGSSIfaceSize(), null, "sizeFieldOffset", null, 1, 1, GSSIfacePortProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfacePortProtocol_SizeFieldTrim(), this.getGSSIfaceSize(), null, "sizeFieldTrim", null, 1, 1, GSSIfacePortProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSIfacePortProtocol_SyncPattern(), this.getGSSIfaceSyncPattern(), null, "syncPattern", null, 0, 1, GSSIfacePortProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssIfaceSizeEClass, GSSIfaceSize.class, "GSSIfaceSize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSIfaceSize_Bytes(), ecorePackage.getEString(), "bytes", null, 1, 1, GSSIfaceSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSIfaceSize_Bits(), ecorePackage.getEString(), "bits", null, 1, 1, GSSIfaceSize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(gssIfaceUartPortFlowControlEEnum, GSSIfaceUartPortFlowControl.class, "GSSIfaceUartPortFlowControl");
		addEEnumLiteral(gssIfaceUartPortFlowControlEEnum, GSSIfaceUartPortFlowControl.RTS_CTS);
		addEEnumLiteral(gssIfaceUartPortFlowControlEEnum, GSSIfaceUartPortFlowControl.XON_XOFF);

		initEEnum(gssIfacePortProtocolUnitEEnum, GSSIfacePortProtocolUnit.class, "GSSIfacePortProtocolUnit");
		addEEnumLiteral(gssIfacePortProtocolUnitEEnum, GSSIfacePortProtocolUnit.BYTES);
		addEEnumLiteral(gssIfacePortProtocolUnitEEnum, GSSIfacePortProtocolUnit.BITS);

		initEEnum(gssIfacePortProtocolPowerEEnum, GSSIfacePortProtocolPower.class, "GSSIfacePortProtocolPower");
		addEEnumLiteral(gssIfacePortProtocolPowerEEnum, GSSIfacePortProtocolPower.NO);
		addEEnumLiteral(gssIfacePortProtocolPowerEEnum, GSSIfacePortProtocolPower._2);
		addEEnumLiteral(gssIfacePortProtocolPowerEEnum, GSSIfacePortProtocolPower._2WITH_0);

		// Create resource
		createResource(eNS_URI);
	}

} //ifacePackageImpl
