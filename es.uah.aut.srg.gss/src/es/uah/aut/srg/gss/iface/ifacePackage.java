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
package es.uah.aut.srg.gss.iface;

import es.uah.aut.srg.gss.common.commonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see es.uah.aut.srg.gss.iface.ifaceFactory
 * @model kind="package"
 * @generated
 */
public interface ifacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/iface";

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
	ifacePackage eINSTANCE = es.uah.aut.srg.gss.iface.impl.ifacePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfacePortConfigImpl <em>GSS Iface Port Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfacePortConfigImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfacePortConfig()
	 * @generated
	 */
	int GSS_IFACE_PORT_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_CONFIG__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_CONFIG__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_CONFIG__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_CONFIG__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Port Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_CONFIG__PORT_CONFIG = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Iface Port Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_CONFIG_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Iface Port Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_CONFIG_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfacePortImpl <em>GSS Iface Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfacePortImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfacePort()
	 * @generated
	 */
	int GSS_IFACE_PORT = 1;

	/**
	 * The number of structural features of the '<em>GSS Iface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>GSS Iface Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl <em>GSS Iface Sp WPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSpWPort()
	 * @generated
	 */
	int GSS_IFACE_SP_WPORT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WPORT__TYPE = GSS_IFACE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WPORT__LINK = GSS_IFACE_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Writing Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WPORT__WRITING_PORT = GSS_IFACE_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reading Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WPORT__READING_PORT = GSS_IFACE_PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GSS Iface Sp WPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WPORT_FEATURE_COUNT = GSS_IFACE_PORT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GSS Iface Sp WPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WPORT_OPERATION_COUNT = GSS_IFACE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl <em>GSS Iface Uart Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPort()
	 * @generated
	 */
	int GSS_IFACE_UART_PORT = 4;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWTCPortImpl <em>GSS Iface Sp WTC Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWTCPortImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSpWTCPort()
	 * @generated
	 */
	int GSS_IFACE_SP_WTC_PORT = 8;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceDummyPortImpl <em>GSS Iface Dummy Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceDummyPortImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceDummyPort()
	 * @generated
	 */
	int GSS_IFACE_DUMMY_PORT = 9;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceReadingPortImpl <em>GSS Iface Reading Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceReadingPortImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceReadingPort()
	 * @generated
	 */
	int GSS_IFACE_READING_PORT = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_READING_PORT__PORT = 0;

	/**
	 * The number of structural features of the '<em>GSS Iface Reading Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_READING_PORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Iface Reading Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_READING_PORT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT__NUMBER = GSS_IFACE_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Baud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT__BAUD_RATE = GSS_IFACE_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT__PARITY = GSS_IFACE_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT__DATA_BITS = GSS_IFACE_PORT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stop Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT__STOP_BITS = GSS_IFACE_PORT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flow Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT__FLOW_CONTROL = GSS_IFACE_PORT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Uart Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT__UART_PROTOCOL = GSS_IFACE_PORT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>GSS Iface Uart Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT_FEATURE_COUNT = GSS_IFACE_PORT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>GSS Iface Uart Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PORT_OPERATION_COUNT = GSS_IFACE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl <em>GSS Iface Uart Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartProtocol()
	 * @generated
	 */
	int GSS_IFACE_UART_PROTOCOL = 5;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL__UNIT = 0;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL__POWER = 1;

	/**
	 * The feature id for the '<em><b>Const Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL__CONST_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Size Field Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Size Field Trim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM = 4;

	/**
	 * The feature id for the '<em><b>Sync Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN = 5;

	/**
	 * The number of structural features of the '<em>GSS Iface Uart Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GSS Iface Uart Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_UART_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSizeImpl <em>GSS Iface Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSizeImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSize()
	 * @generated
	 */
	int GSS_IFACE_SIZE = 6;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SIZE__BYTES = 0;

	/**
	 * The feature id for the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SIZE__BITS = 1;

	/**
	 * The number of structural features of the '<em>GSS Iface Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SIZE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Iface Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SIZE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSyncPatternImpl <em>GSS Iface Sync Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSyncPatternImpl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSyncPattern()
	 * @generated
	 */
	int GSS_IFACE_SYNC_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Hex Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SYNC_PATTERN__HEX_VALUE = 0;

	/**
	 * The number of structural features of the '<em>GSS Iface Sync Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SYNC_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Iface Sync Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SYNC_PATTERN_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Spw Port Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WTC_PORT__SPW_PORT_REF = GSS_IFACE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Iface Sp WTC Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WTC_PORT_FEATURE_COUNT = GSS_IFACE_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Iface Sp WTC Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_SP_WTC_PORT_OPERATION_COUNT = GSS_IFACE_PORT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Iface Dummy Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_DUMMY_PORT_FEATURE_COUNT = GSS_IFACE_PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSS Iface Dummy Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_IFACE_DUMMY_PORT_OPERATION_COUNT = GSS_IFACE_PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType <em>GSS Iface Sp WPort Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSpWPortType()
	 * @generated
	 */
	int GSS_IFACE_SP_WPORT_TYPE = 10;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate <em>GSS Iface Uart Port Baud Rate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortBaudRate()
	 * @generated
	 */
	int GSS_IFACE_UART_PORT_BAUD_RATE = 11;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity <em>GSS Iface Uart Port Parity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortParity()
	 * @generated
	 */
	int GSS_IFACE_UART_PORT_PARITY = 12;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits <em>GSS Iface Uart Port Data Bits</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortDataBits()
	 * @generated
	 */
	int GSS_IFACE_UART_PORT_DATA_BITS = 13;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits <em>GSS Iface Uart Port Stop Bits</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortStopBits()
	 * @generated
	 */
	int GSS_IFACE_UART_PORT_STOP_BITS = 14;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl <em>GSS Iface Uart Port Flow Control</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortFlowControl()
	 * @generated
	 */
	int GSS_IFACE_UART_PORT_FLOW_CONTROL = 15;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit <em>GSS Iface Uart Protocol Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartProtocolUnit()
	 * @generated
	 */
	int GSS_IFACE_UART_PROTOCOL_UNIT = 16;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower <em>GSS Iface Uart Protocol Power</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower
	 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartProtocolPower()
	 * @generated
	 */
	int GSS_IFACE_UART_PROTOCOL_POWER = 17;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfacePortConfig <em>GSS Iface Port Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Port Config</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePortConfig
	 * @generated
	 */
	EClass getGSSIfacePortConfig();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.iface.GSSIfacePortConfig#getPortConfig <em>Port Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Config</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePortConfig#getPortConfig()
	 * @see #getGSSIfacePortConfig()
	 * @generated
	 */
	EReference getGSSIfacePortConfig_PortConfig();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfacePort <em>GSS Iface Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePort
	 * @generated
	 */
	EClass getGSSIfacePort();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort <em>GSS Iface Sp WPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Sp WPort</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPort
	 * @generated
	 */
	EClass getGSSIfaceSpWPort();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getType()
	 * @see #getGSSIfaceSpWPort()
	 * @generated
	 */
	EAttribute getGSSIfaceSpWPort_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getLink()
	 * @see #getGSSIfaceSpWPort()
	 * @generated
	 */
	EAttribute getGSSIfaceSpWPort_Link();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getWritingPort <em>Writing Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writing Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getWritingPort()
	 * @see #getGSSIfaceSpWPort()
	 * @generated
	 */
	EAttribute getGSSIfaceSpWPort_WritingPort();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getReadingPort <em>Reading Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reading Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getReadingPort()
	 * @see #getGSSIfaceSpWPort()
	 * @generated
	 */
	EReference getGSSIfaceSpWPort_ReadingPort();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort <em>GSS Iface Uart Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Uart Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort
	 * @generated
	 */
	EClass getGSSIfaceUartPort();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getNumber()
	 * @see #getGSSIfaceUartPort()
	 * @generated
	 */
	EAttribute getGSSIfaceUartPort_Number();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getBaudRate <em>Baud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baud Rate</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getBaudRate()
	 * @see #getGSSIfaceUartPort()
	 * @generated
	 */
	EAttribute getGSSIfaceUartPort_BaudRate();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getParity <em>Parity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parity</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getParity()
	 * @see #getGSSIfaceUartPort()
	 * @generated
	 */
	EAttribute getGSSIfaceUartPort_Parity();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getDataBits <em>Data Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Bits</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getDataBits()
	 * @see #getGSSIfaceUartPort()
	 * @generated
	 */
	EAttribute getGSSIfaceUartPort_DataBits();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getStopBits <em>Stop Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Bits</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getStopBits()
	 * @see #getGSSIfaceUartPort()
	 * @generated
	 */
	EAttribute getGSSIfaceUartPort_StopBits();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getFlowControl <em>Flow Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow Control</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getFlowControl()
	 * @see #getGSSIfaceUartPort()
	 * @generated
	 */
	EAttribute getGSSIfaceUartPort_FlowControl();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getUartProtocol <em>Uart Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Uart Protocol</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getUartProtocol()
	 * @see #getGSSIfaceUartPort()
	 * @generated
	 */
	EReference getGSSIfaceUartPort_UartProtocol();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort <em>GSS Iface Sp WTC Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Sp WTC Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort
	 * @generated
	 */
	EClass getGSSIfaceSpWTCPort();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort#getSpwPortRef <em>Spw Port Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spw Port Ref</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort#getSpwPortRef()
	 * @see #getGSSIfaceSpWTCPort()
	 * @generated
	 */
	EAttribute getGSSIfaceSpWTCPort_SpwPortRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceDummyPort <em>GSS Iface Dummy Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Dummy Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceDummyPort
	 * @generated
	 */
	EClass getGSSIfaceDummyPort();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceReadingPort <em>GSS Iface Reading Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Reading Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceReadingPort
	 * @generated
	 */
	EClass getGSSIfaceReadingPort();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceReadingPort#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceReadingPort#getPort()
	 * @see #getGSSIfaceReadingPort()
	 * @generated
	 */
	EAttribute getGSSIfaceReadingPort_Port();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol <em>GSS Iface Uart Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Uart Protocol</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol
	 * @generated
	 */
	EClass getGSSIfaceUartProtocol();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getUnit()
	 * @see #getGSSIfaceUartProtocol()
	 * @generated
	 */
	EAttribute getGSSIfaceUartProtocol_Unit();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getPower()
	 * @see #getGSSIfaceUartProtocol()
	 * @generated
	 */
	EAttribute getGSSIfaceUartProtocol_Power();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getConstSize <em>Const Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Const Size</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getConstSize()
	 * @see #getGSSIfaceUartProtocol()
	 * @generated
	 */
	EReference getGSSIfaceUartProtocol_ConstSize();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldOffset <em>Size Field Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Field Offset</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldOffset()
	 * @see #getGSSIfaceUartProtocol()
	 * @generated
	 */
	EReference getGSSIfaceUartProtocol_SizeFieldOffset();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldTrim <em>Size Field Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size Field Trim</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldTrim()
	 * @see #getGSSIfaceUartProtocol()
	 * @generated
	 */
	EReference getGSSIfaceUartProtocol_SizeFieldTrim();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSyncPattern <em>Sync Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sync Pattern</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSyncPattern()
	 * @see #getGSSIfaceUartProtocol()
	 * @generated
	 */
	EReference getGSSIfaceUartProtocol_SyncPattern();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSize <em>GSS Iface Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Size</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSize
	 * @generated
	 */
	EClass getGSSIfaceSize();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceSize#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSize#getBytes()
	 * @see #getGSSIfaceSize()
	 * @generated
	 */
	EAttribute getGSSIfaceSize_Bytes();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceSize#getBits <em>Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bits</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSize#getBits()
	 * @see #getGSSIfaceSize()
	 * @generated
	 */
	EAttribute getGSSIfaceSize_Bits();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern <em>GSS Iface Sync Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Iface Sync Pattern</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern
	 * @generated
	 */
	EClass getGSSIfaceSyncPattern();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern#getHexValue <em>Hex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hex Value</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSyncPattern#getHexValue()
	 * @see #getGSSIfaceSyncPattern()
	 * @generated
	 */
	EAttribute getGSSIfaceSyncPattern_HexValue();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType <em>GSS Iface Sp WPort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Sp WPort Type</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType
	 * @generated
	 */
	EEnum getGSSIfaceSpWPortType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate <em>GSS Iface Uart Port Baud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Uart Port Baud Rate</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate
	 * @generated
	 */
	EEnum getGSSIfaceUartPortBaudRate();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity <em>GSS Iface Uart Port Parity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Uart Port Parity</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity
	 * @generated
	 */
	EEnum getGSSIfaceUartPortParity();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits <em>GSS Iface Uart Port Data Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Uart Port Data Bits</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits
	 * @generated
	 */
	EEnum getGSSIfaceUartPortDataBits();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits <em>GSS Iface Uart Port Stop Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Uart Port Stop Bits</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits
	 * @generated
	 */
	EEnum getGSSIfaceUartPortStopBits();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl <em>GSS Iface Uart Port Flow Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Uart Port Flow Control</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl
	 * @generated
	 */
	EEnum getGSSIfaceUartPortFlowControl();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit <em>GSS Iface Uart Protocol Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Uart Protocol Unit</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit
	 * @generated
	 */
	EEnum getGSSIfaceUartProtocolUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower <em>GSS Iface Uart Protocol Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Iface Uart Protocol Power</em>'.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower
	 * @generated
	 */
	EEnum getGSSIfaceUartProtocolPower();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ifaceFactory getifaceFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfacePortConfigImpl <em>GSS Iface Port Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfacePortConfigImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfacePortConfig()
		 * @generated
		 */
		EClass GSS_IFACE_PORT_CONFIG = eINSTANCE.getGSSIfacePortConfig();

		/**
		 * The meta object literal for the '<em><b>Port Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IFACE_PORT_CONFIG__PORT_CONFIG = eINSTANCE.getGSSIfacePortConfig_PortConfig();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfacePortImpl <em>GSS Iface Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfacePortImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfacePort()
		 * @generated
		 */
		EClass GSS_IFACE_PORT = eINSTANCE.getGSSIfacePort();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl <em>GSS Iface Sp WPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWPortImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSpWPort()
		 * @generated
		 */
		EClass GSS_IFACE_SP_WPORT = eINSTANCE.getGSSIfaceSpWPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_SP_WPORT__TYPE = eINSTANCE.getGSSIfaceSpWPort_Type();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_SP_WPORT__LINK = eINSTANCE.getGSSIfaceSpWPort_Link();

		/**
		 * The meta object literal for the '<em><b>Writing Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_SP_WPORT__WRITING_PORT = eINSTANCE.getGSSIfaceSpWPort_WritingPort();

		/**
		 * The meta object literal for the '<em><b>Reading Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IFACE_SP_WPORT__READING_PORT = eINSTANCE.getGSSIfaceSpWPort_ReadingPort();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl <em>GSS Iface Uart Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPort()
		 * @generated
		 */
		EClass GSS_IFACE_UART_PORT = eINSTANCE.getGSSIfaceUartPort();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PORT__NUMBER = eINSTANCE.getGSSIfaceUartPort_Number();

		/**
		 * The meta object literal for the '<em><b>Baud Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PORT__BAUD_RATE = eINSTANCE.getGSSIfaceUartPort_BaudRate();

		/**
		 * The meta object literal for the '<em><b>Parity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PORT__PARITY = eINSTANCE.getGSSIfaceUartPort_Parity();

		/**
		 * The meta object literal for the '<em><b>Data Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PORT__DATA_BITS = eINSTANCE.getGSSIfaceUartPort_DataBits();

		/**
		 * The meta object literal for the '<em><b>Stop Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PORT__STOP_BITS = eINSTANCE.getGSSIfaceUartPort_StopBits();

		/**
		 * The meta object literal for the '<em><b>Flow Control</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PORT__FLOW_CONTROL = eINSTANCE.getGSSIfaceUartPort_FlowControl();

		/**
		 * The meta object literal for the '<em><b>Uart Protocol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IFACE_UART_PORT__UART_PROTOCOL = eINSTANCE.getGSSIfaceUartPort_UartProtocol();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWTCPortImpl <em>GSS Iface Sp WTC Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSpWTCPortImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSpWTCPort()
		 * @generated
		 */
		EClass GSS_IFACE_SP_WTC_PORT = eINSTANCE.getGSSIfaceSpWTCPort();

		/**
		 * The meta object literal for the '<em><b>Spw Port Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_SP_WTC_PORT__SPW_PORT_REF = eINSTANCE.getGSSIfaceSpWTCPort_SpwPortRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceDummyPortImpl <em>GSS Iface Dummy Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceDummyPortImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceDummyPort()
		 * @generated
		 */
		EClass GSS_IFACE_DUMMY_PORT = eINSTANCE.getGSSIfaceDummyPort();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceReadingPortImpl <em>GSS Iface Reading Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceReadingPortImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceReadingPort()
		 * @generated
		 */
		EClass GSS_IFACE_READING_PORT = eINSTANCE.getGSSIfaceReadingPort();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_READING_PORT__PORT = eINSTANCE.getGSSIfaceReadingPort_Port();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl <em>GSS Iface Uart Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceUartProtocolImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartProtocol()
		 * @generated
		 */
		EClass GSS_IFACE_UART_PROTOCOL = eINSTANCE.getGSSIfaceUartProtocol();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PROTOCOL__UNIT = eINSTANCE.getGSSIfaceUartProtocol_Unit();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_UART_PROTOCOL__POWER = eINSTANCE.getGSSIfaceUartProtocol_Power();

		/**
		 * The meta object literal for the '<em><b>Const Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IFACE_UART_PROTOCOL__CONST_SIZE = eINSTANCE.getGSSIfaceUartProtocol_ConstSize();

		/**
		 * The meta object literal for the '<em><b>Size Field Offset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_OFFSET = eINSTANCE.getGSSIfaceUartProtocol_SizeFieldOffset();

		/**
		 * The meta object literal for the '<em><b>Size Field Trim</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IFACE_UART_PROTOCOL__SIZE_FIELD_TRIM = eINSTANCE.getGSSIfaceUartProtocol_SizeFieldTrim();

		/**
		 * The meta object literal for the '<em><b>Sync Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_IFACE_UART_PROTOCOL__SYNC_PATTERN = eINSTANCE.getGSSIfaceUartProtocol_SyncPattern();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSizeImpl <em>GSS Iface Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSizeImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSize()
		 * @generated
		 */
		EClass GSS_IFACE_SIZE = eINSTANCE.getGSSIfaceSize();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_SIZE__BYTES = eINSTANCE.getGSSIfaceSize_Bytes();

		/**
		 * The meta object literal for the '<em><b>Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_SIZE__BITS = eINSTANCE.getGSSIfaceSize_Bits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSyncPatternImpl <em>GSS Iface Sync Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.impl.GSSIfaceSyncPatternImpl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSyncPattern()
		 * @generated
		 */
		EClass GSS_IFACE_SYNC_PATTERN = eINSTANCE.getGSSIfaceSyncPattern();

		/**
		 * The meta object literal for the '<em><b>Hex Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_IFACE_SYNC_PATTERN__HEX_VALUE = eINSTANCE.getGSSIfaceSyncPattern_HexValue();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType <em>GSS Iface Sp WPort Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceSpWPortType()
		 * @generated
		 */
		EEnum GSS_IFACE_SP_WPORT_TYPE = eINSTANCE.getGSSIfaceSpWPortType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate <em>GSS Iface Uart Port Baud Rate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortBaudRate()
		 * @generated
		 */
		EEnum GSS_IFACE_UART_PORT_BAUD_RATE = eINSTANCE.getGSSIfaceUartPortBaudRate();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity <em>GSS Iface Uart Port Parity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortParity()
		 * @generated
		 */
		EEnum GSS_IFACE_UART_PORT_PARITY = eINSTANCE.getGSSIfaceUartPortParity();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits <em>GSS Iface Uart Port Data Bits</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortDataBits()
		 * @generated
		 */
		EEnum GSS_IFACE_UART_PORT_DATA_BITS = eINSTANCE.getGSSIfaceUartPortDataBits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits <em>GSS Iface Uart Port Stop Bits</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortStopBits()
		 * @generated
		 */
		EEnum GSS_IFACE_UART_PORT_STOP_BITS = eINSTANCE.getGSSIfaceUartPortStopBits();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl <em>GSS Iface Uart Port Flow Control</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartPortFlowControl()
		 * @generated
		 */
		EEnum GSS_IFACE_UART_PORT_FLOW_CONTROL = eINSTANCE.getGSSIfaceUartPortFlowControl();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit <em>GSS Iface Uart Protocol Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartProtocolUnit()
		 * @generated
		 */
		EEnum GSS_IFACE_UART_PROTOCOL_UNIT = eINSTANCE.getGSSIfaceUartProtocolUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower <em>GSS Iface Uart Protocol Power</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower
		 * @see es.uah.aut.srg.gss.iface.impl.ifacePackageImpl#getGSSIfaceUartProtocolPower()
		 * @generated
		 */
		EEnum GSS_IFACE_UART_PROTOCOL_POWER = eINSTANCE.getGSSIfaceUartProtocolPower();

	}

} //ifacePackage
