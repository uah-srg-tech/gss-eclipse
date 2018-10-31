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
package es.uah.aut.srg.gss.config;

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
 * @see es.uah.aut.srg.gss.config.configFactory
 * @model kind="package"
 * @generated
 */
public interface configPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "config";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/config";

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
	configPackage eINSTANCE = es.uah.aut.srg.gss.config.impl.configPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl <em>GSS Config GSS Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSConfig()
	 * @generated
	 */
	int GSS_CONFIG_GSS_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Gss options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__PROTOCOLS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__INTERFACES = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Periodic TCs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Global Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__MONITORS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG__TESTS = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>GSS Config GSS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>GSS Config GSS Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_CONFIG_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl <em>GSS Config GSS Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSOptions()
	 * @generated
	 */
	int GSS_CONFIG_GSS_OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Gss info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_OPTIONS__GSS_INFO = 0;

	/**
	 * The feature id for the '<em><b>Gss info print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT = 1;

	/**
	 * The feature id for the '<em><b>Phy header print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT = 2;

	/**
	 * The feature id for the '<em><b>Discard Error Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS = 3;

	/**
	 * The number of structural features of the '<em>GSS Config GSS Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_OPTIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config GSS Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl <em>GSS Config GSS Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSInfo()
	 * @generated
	 */
	int GSS_CONFIG_GSS_INFO = 2;

	/**
	 * The feature id for the '<em><b>Test campaign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO__DATE = 2;

	/**
	 * The feature id for the '<em><b>Version control url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL = 3;

	/**
	 * The number of structural features of the '<em>GSS Config GSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config GSS Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoPrintImpl <em>GSS Config GSS Info Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoPrintImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSInfoPrint()
	 * @generated
	 */
	int GSS_CONFIG_GSS_INFO_PRINT = 3;

	/**
	 * The feature id for the '<em><b>Main Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG = 0;

	/**
	 * The feature id for the '<em><b>Port Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Raw Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO_PRINT__RAW_LOG = 2;

	/**
	 * The number of structural features of the '<em>GSS Config GSS Info Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO_PRINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Config GSS Info Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_INFO_PRINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl <em>GSS Config Phy Header Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPhyHeaderPrint()
	 * @generated
	 */
	int GSS_CONFIG_PHY_HEADER_PRINT = 4;

	/**
	 * The feature id for the '<em><b>Main Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG = 0;

	/**
	 * The feature id for the '<em><b>Port Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Raw Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PHY_HEADER_PRINT__RAW_LOG = 2;

	/**
	 * The feature id for the '<em><b>Gss Tabs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Phy Header Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PHY_HEADER_PRINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Phy Header Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PHY_HEADER_PRINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl <em>GSS Config GSS Discard Error Flags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSDiscardErrorFlags()
	 * @generated
	 */
	int GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS = 5;

	/**
	 * The feature id for the '<em><b>Tx Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS = 0;

	/**
	 * The feature id for the '<em><b>Not Expected Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS = 1;

	/**
	 * The feature id for the '<em><b>Filters Ko</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO = 2;

	/**
	 * The feature id for the '<em><b>Valid Times Ko</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO = 3;

	/**
	 * The number of structural features of the '<em>GSS Config GSS Discard Error Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config GSS Discard Error Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigProtocolsImpl <em>GSS Config Protocols</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigProtocolsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigProtocols()
	 * @generated
	 */
	int GSS_CONFIG_PROTOCOLS = 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOLS__PROTOCOL = 0;

	/**
	 * The number of structural features of the '<em>GSS Config Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOLS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Config Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigProtocolImpl <em>GSS Config Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigProtocolImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigProtocol()
	 * @generated
	 */
	int GSS_CONFIG_PROTOCOL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOL__TYPE_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Type Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOL__TYPE_OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Subtype Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOL__SUBTYPE_OFFSET = 4;

	/**
	 * The number of structural features of the '<em>GSS Config Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Config Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfacesImpl <em>GSS Config Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigInterfacesImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterfaces()
	 * @generated
	 */
	int GSS_CONFIG_INTERFACES = 8;

	/**
	 * The feature id for the '<em><b>Main Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACES__MAIN_INTERFACE = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACES__INTERFACE = 1;

	/**
	 * The number of structural features of the '<em>GSS Config Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Config Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl <em>GSS Config Main Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMainInterface()
	 * @generated
	 */
	int GSS_CONFIG_MAIN_INTERFACE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>If Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE__IF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>If Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE__IO_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID = 5;

	/**
	 * The feature id for the '<em><b>Level In Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT = 6;

	/**
	 * The number of structural features of the '<em>GSS Config Main Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Config Main Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MAIN_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl <em>GSS Config Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterface()
	 * @generated
	 */
	int GSS_CONFIG_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>If Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__IF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>If Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__IF_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__IO_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__PROTOCOL_ID = 5;

	/**
	 * The feature id for the '<em><b>Level In Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__LEVEL_IN_OUT = 6;

	/**
	 * The feature id for the '<em><b>Level In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__LEVEL_IN = 7;

	/**
	 * The feature id for the '<em><b>Level Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE__LEVEL_OUT = 8;

	/**
	 * The number of structural features of the '<em>GSS Config Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>GSS Config Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInOutImpl <em>GSS Config Level In Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigLevelInOutImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigLevelInOut()
	 * @generated
	 */
	int GSS_CONFIG_LEVEL_IN_OUT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT__TMFORMAT = 2;

	/**
	 * The feature id for the '<em><b>TCformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT__TCFORMAT = 3;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT__INPUT_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Export to prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL = 6;

	/**
	 * The number of structural features of the '<em>GSS Config Level In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Config Level In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl <em>GSS Config Level In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigLevelIn()
	 * @generated
	 */
	int GSS_CONFIG_LEVEL_IN = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN__NAME = 1;

	/**
	 * The feature id for the '<em><b>TCformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN__TCFORMAT = 2;

	/**
	 * The feature id for the '<em><b>Export to prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Level In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Level In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_IN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelOutImpl <em>GSS Config Level Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigLevelOutImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigLevelOut()
	 * @generated
	 */
	int GSS_CONFIG_LEVEL_OUT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_OUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_OUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_OUT__TMFORMAT = 2;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_OUT__INPUT_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL = 4;

	/**
	 * The number of structural features of the '<em>GSS Config Level Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_OUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Config Level Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_LEVEL_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketsImpl <em>GSS Config Special Packets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigSpecialPackets()
	 * @generated
	 */
	int GSS_CONFIG_SPECIAL_PACKETS = 14;

	/**
	 * The feature id for the '<em><b>Special Packet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET = 0;

	/**
	 * The number of structural features of the '<em>GSS Config Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Config Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketImpl <em>GSS Config Special Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigSpecialPacket()
	 * @generated
	 */
	int GSS_CONFIG_SPECIAL_PACKET = 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__ID = 2;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__IF_REF = 3;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__LEVELS = 4;

	/**
	 * The feature id for the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__LEVEL_REF = 5;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__INPUT_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Upper Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__UPPER_LEVELS = 7;

	/**
	 * The feature id for the '<em><b>Printing Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__PRINTING_DATA = 8;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__PERIOD = 9;

	/**
	 * The feature id for the '<em><b>Interval Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET__INTERVAL_RANGE = 10;

	/**
	 * The number of structural features of the '<em>GSS Config Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>GSS Config Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_SPECIAL_PACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelsImpl <em>GSS Config Upper Levels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUpperLevels()
	 * @generated
	 */
	int GSS_CONFIG_UPPER_LEVELS = 16;

	/**
	 * The feature id for the '<em><b>Upper Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>GSS Config Upper Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Config Upper Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl <em>GSS Config Upper Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUpperLevel()
	 * @generated
	 */
	int GSS_CONFIG_UPPER_LEVEL = 17;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVEL__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVEL__TMFORMAT = 1;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Upper Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Upper Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_UPPER_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPrintingDataImpl <em>GSS Config Printing Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPrintingDataImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPrintingData()
	 * @generated
	 */
	int GSS_CONFIG_PRINTING_DATA = 18;

	/**
	 * The feature id for the '<em><b>Print Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PRINTING_DATA__PRINT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Structured Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA = 1;

	/**
	 * The number of structural features of the '<em>GSS Config Printing Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PRINTING_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Config Printing Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PRINTING_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigStructuredDataImpl <em>GSS Config Structured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigStructuredDataImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigStructuredData()
	 * @generated
	 */
	int GSS_CONFIG_STRUCTURED_DATA = 19;

	/**
	 * The feature id for the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_STRUCTURED_DATA__LEVEL_REF = 0;

	/**
	 * The feature id for the '<em><b>First Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_STRUCTURED_DATA__FIRST_FIELD = 1;

	/**
	 * The number of structural features of the '<em>GSS Config Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_STRUCTURED_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Config Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_STRUCTURED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodImpl <em>GSS Config Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriod()
	 * @generated
	 */
	int GSS_CONFIG_PERIOD = 20;

	/**
	 * The feature id for the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIOD__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Min unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIOD__MIN_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIOD__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIOD__MAX_UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIOD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigIntervalRangeImpl <em>GSS Config Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigIntervalRangeImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigIntervalRange()
	 * @generated
	 */
	int GSS_CONFIG_INTERVAL_RANGE = 21;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERVAL_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERVAL_RANGE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERVAL_RANGE__INTERVAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Interval unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERVAL_RANGE__INTERVAL_UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERVAL_RANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_INTERVAL_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCsImpl <em>GSS Config Periodic TCs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCs()
	 * @generated
	 */
	int GSS_CONFIG_PERIODIC_TCS = 22;

	/**
	 * The feature id for the '<em><b>Periodic TC level 2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2 = 0;

	/**
	 * The feature id for the '<em><b>Periodic TC level 1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1 = 1;

	/**
	 * The feature id for the '<em><b>Periodic TC level 0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0 = 2;

	/**
	 * The number of structural features of the '<em>GSS Config Periodic TCs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TCS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Config Periodic TCs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TCS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl <em>GSS Config Periodic TC Level2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2 = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__ID = 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF = 2;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2 = 5;

	/**
	 * The feature id for the '<em><b>App to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2 = 6;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1 = 7;

	/**
	 * The feature id for the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1 = 8;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0 = 9;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0 = 10;

	/**
	 * The number of structural features of the '<em>GSS Config Periodic TC Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>GSS Config Periodic TC Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl <em>GSS Config Periodic TC Level1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1 = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__ID = 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF = 2;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1 = 5;

	/**
	 * The feature id for the '<em><b>App to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1 = 6;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0 = 7;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0 = 8;

	/**
	 * The number of structural features of the '<em>GSS Config Periodic TC Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>GSS Config Periodic TC Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl <em>GSS Config Periodic TC Level0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0 = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0__ID = 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF = 2;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0 = 5;

	/**
	 * The feature id for the '<em><b>App to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0 = 6;

	/**
	 * The number of structural features of the '<em>GSS Config Periodic TC Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Config Periodic TC Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PERIODIC_TC_LEVEL0_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarsImpl <em>GSS Config Global Vars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGlobalVars()
	 * @generated
	 */
	int GSS_CONFIG_GLOBAL_VARS = 26;

	/**
	 * The feature id for the '<em><b>Global Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VARS__GLOBAL_VAR = 0;

	/**
	 * The number of structural features of the '<em>GSS Config Global Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Config Global Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarImpl <em>GSS Config Global Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGlobalVar()
	 * @generated
	 */
	int GSS_CONFIG_GLOBAL_VAR = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Initial value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR__INITIAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Reference Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR__REFERENCE_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Reference Periodic TC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR__REFERENCE_PERIODIC_TC = 5;

	/**
	 * The feature id for the '<em><b>Reference Special Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET = 6;

	/**
	 * The number of structural features of the '<em>GSS Config Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Config Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GLOBAL_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigReferenceFieldImpl <em>GSS Config Reference Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigReferenceFieldImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferenceField()
	 * @generated
	 */
	int GSS_CONFIG_REFERENCE_FIELD = 28;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD__IF_REF = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD__FIELD_REF = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD__OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD__SIZE = 5;

	/**
	 * The number of structural features of the '<em>GSS Config Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GSS Config Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigReferencePeriodicTCImpl <em>GSS Config Reference Periodic TC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigReferencePeriodicTCImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferencePeriodicTC()
	 * @generated
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC = 29;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC__ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC__FIELD_REF = 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC__OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC__SIZE = 4;

	/**
	 * The number of structural features of the '<em>GSS Config Reference Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Config Reference Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_PERIODIC_TC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigReferenceSpecialPacketImpl <em>GSS Config Reference Special Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigReferenceSpecialPacketImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferenceSpecialPacket()
	 * @generated
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET = 30;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET__ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET__FIELD_REF = 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET__OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET__SIZE = 4;

	/**
	 * The number of structural features of the '<em>GSS Config Reference Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Config Reference Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_REFERENCE_SPECIAL_PACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl <em>GSS Config Monitors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMonitors()
	 * @generated
	 */
	int GSS_CONFIG_MONITORS = 31;

	/**
	 * The feature id for the '<em><b>Charts File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MONITORS__CHARTS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Plot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MONITORS__PLOT = 1;

	/**
	 * The feature id for the '<em><b>Alarm Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MONITORS__ALARM_MSG = 2;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MONITORS__MODIFY = 3;

	/**
	 * The feature id for the '<em><b>Alarm Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MONITORS__ALARM_VAL = 4;

	/**
	 * The number of structural features of the '<em>GSS Config Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MONITORS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Config Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MONITORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPlotImpl <em>GSS Config Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPlotImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPlot()
	 * @generated
	 */
	int GSS_CONFIG_PLOT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PLOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PLOT__GV_FILTERED = 1;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PLOT__GV_PERIODIC = 2;

	/**
	 * The number of structural features of the '<em>GSS Config Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PLOT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Config Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_PLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigAlarmMsgImpl <em>GSS Config Alarm Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigAlarmMsgImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmMsg()
	 * @generated
	 */
	int GSS_CONFIG_ALARM_MSG = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_MSG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_MSG__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_MSG__TEXT = 2;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_MSG__GV_FILTERED = 3;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_MSG__GV_PERIODIC = 4;

	/**
	 * The number of structural features of the '<em>GSS Config Alarm Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_MSG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Config Alarm Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_MSG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigModifyImpl <em>GSS Config Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigModifyImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigModify()
	 * @generated
	 */
	int GSS_CONFIG_MODIFY = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MODIFY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MODIFY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MODIFY__VALUE = 2;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MODIFY__GV_FILTERED = 3;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MODIFY__GV_PERIODIC = 4;

	/**
	 * The number of structural features of the '<em>GSS Config Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MODIFY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Config Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_MODIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigAlarmValImpl <em>GSS Config Alarm Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigAlarmValImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmVal()
	 * @generated
	 */
	int GSS_CONFIG_ALARM_VAL = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_VAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_VAL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_VAL__GV_FILTERED = 2;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_VAL__GV_PERIODIC = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Alarm Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_VAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Alarm Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_ALARM_VAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGVFilteredImpl <em>GSS Config GV Filtered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGVFilteredImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGVFiltered()
	 * @generated
	 */
	int GSS_CONFIG_GV_FILTERED = 36;

	/**
	 * The feature id for the '<em><b>Global Var Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_FILTERED__FILTER = 1;

	/**
	 * The number of structural features of the '<em>GSS Config GV Filtered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_FILTERED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Config GV Filtered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_FILTERED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGVPeriodicImpl <em>GSS Config GV Periodic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGVPeriodicImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGVPeriodic()
	 * @generated
	 */
	int GSS_CONFIG_GV_PERIODIC = 37;

	/**
	 * The feature id for the '<em><b>Global Var Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_PERIODIC__GLOBAL_VAR_REF = 0;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_PERIODIC__PERIOD_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_PERIODIC__PERIOD_UNIT = 2;

	/**
	 * The number of structural features of the '<em>GSS Config GV Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_PERIODIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Config GV Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_GV_PERIODIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl <em>GSS Config Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTests()
	 * @generated
	 */
	int GSS_CONFIG_TESTS = 38;

	/**
	 * The feature id for the '<em><b>Protocol Packets File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Test Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TESTS__TEST_CASE = 1;

	/**
	 * The number of structural features of the '<em>GSS Config Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TESTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Config Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TESTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl <em>GSS Config Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTestCase()
	 * @generated
	 */
	int GSS_CONFIG_TEST_CASE = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__PROCEDURE = 1;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__REQ = 2;

	/**
	 * The feature id for the '<em><b>Req Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE__REQ_ACTION = 3;

	/**
	 * The number of structural features of the '<em>GSS Config Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Config Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_CONFIG_TEST_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable <em>GSS Config Enable Disable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigEnableDisable()
	 * @generated
	 */
	int GSS_CONFIG_ENABLE_DISABLE = 40;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType <em>GSS Config Main Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMainInterfaceType()
	 * @generated
	 */
	int GSS_CONFIG_MAIN_INTERFACE_TYPE = 41;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType <em>GSS Config Main Interface IO Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMainInterfaceIOType()
	 * @generated
	 */
	int GSS_CONFIG_MAIN_INTERFACE_IO_TYPE = 42;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaceType <em>GSS Config Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaceType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterfaceType()
	 * @generated
	 */
	int GSS_CONFIG_INTERFACE_TYPE = 43;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType <em>GSS Config Interface IO Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterfaceIOType()
	 * @generated
	 */
	int GSS_CONFIG_INTERFACE_IO_TYPE = 44;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel <em>GSS Config Upper Level Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUpperLevelLevel()
	 * @generated
	 */
	int GSS_CONFIG_UPPER_LEVEL_LEVEL = 45;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigUnit <em>GSS Config Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUnit()
	 * @generated
	 */
	int GSS_CONFIG_UNIT = 46;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVarType <em>GSS Config Global Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVarType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGlobalVarType()
	 * @generated
	 */
	int GSS_CONFIG_GLOBAL_VAR_TYPE = 47;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceFieldType <em>GSS Config Reference Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceFieldType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferenceFieldType()
	 * @generated
	 */
	int GSS_CONFIG_REFERENCE_FIELD_TYPE = 48;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsgType <em>GSS Config Alarm Msg Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsgType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmMsgType()
	 * @generated
	 */
	int GSS_CONFIG_ALARM_MSG_TYPE = 49;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigModifyType <em>GSS Config Modify Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigModifyType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigModifyType()
	 * @generated
	 */
	int GSS_CONFIG_MODIFY_TYPE = 50;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmValType <em>GSS Config Alarm Val Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmValType
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmValType()
	 * @generated
	 */
	int GSS_CONFIG_ALARM_VAL_TYPE = 51;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.config.GSSConfigReqAction <em>GSS Config Req Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
	 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReqAction()
	 * @generated
	 */
	int GSS_CONFIG_REQ_ACTION = 52;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig <em>GSS Config GSS Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GSS Config</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig
	 * @generated
	 */
	EClass getGSSConfigGSSConfig();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGss_options <em>Gss options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss options</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGss_options()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_Gss_options();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocols</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getProtocols()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_Protocols();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getInterfaces()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getSpecialPackets <em>Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getSpecialPackets()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_SpecialPackets();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getPeriodicTCs <em>Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodic TCs</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getPeriodicTCs()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_PeriodicTCs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Vars</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGlobalVars()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_GlobalVars();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitors</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getMonitors()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_Monitors();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tests</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests()
	 * @see #getGSSConfigGSSConfig()
	 * @generated
	 */
	EReference getGSSConfigGSSConfig_Tests();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions <em>GSS Config GSS Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GSS Options</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSOptions
	 * @generated
	 */
	EClass getGSSConfigGSSOptions();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info <em>Gss info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss info</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info()
	 * @see #getGSSConfigGSSOptions()
	 * @generated
	 */
	EReference getGSSConfigGSSOptions_Gss_info();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info_print <em>Gss info print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss info print</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info_print()
	 * @see #getGSSConfigGSSOptions()
	 * @generated
	 */
	EReference getGSSConfigGSSOptions_Gss_info_print();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getPhy_header_print <em>Phy header print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phy header print</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getPhy_header_print()
	 * @see #getGSSConfigGSSOptions()
	 * @generated
	 */
	EReference getGSSConfigGSSOptions_Phy_header_print();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getDiscardErrorFlags <em>Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discard Error Flags</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getDiscardErrorFlags()
	 * @see #getGSSConfigGSSOptions()
	 * @generated
	 */
	EReference getGSSConfigGSSOptions_DiscardErrorFlags();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfo <em>GSS Config GSS Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GSS Info</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfo
	 * @generated
	 */
	EClass getGSSConfigGSSInfo();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getTest_campaign <em>Test campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test campaign</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getTest_campaign()
	 * @see #getGSSConfigGSSInfo()
	 * @generated
	 */
	EAttribute getGSSConfigGSSInfo_Test_campaign();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getVersion()
	 * @see #getGSSConfigGSSInfo()
	 * @generated
	 */
	EAttribute getGSSConfigGSSInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getDate()
	 * @see #getGSSConfigGSSInfo()
	 * @generated
	 */
	EAttribute getGSSConfigGSSInfo_Date();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getVersion_control_url <em>Version control url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version control url</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfo#getVersion_control_url()
	 * @see #getGSSConfigGSSInfo()
	 * @generated
	 */
	EAttribute getGSSConfigGSSInfo_Version_control_url();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint <em>GSS Config GSS Info Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GSS Info Print</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint
	 * @generated
	 */
	EClass getGSSConfigGSSInfoPrint();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint#getMainLog <em>Main Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Log</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint#getMainLog()
	 * @see #getGSSConfigGSSInfoPrint()
	 * @generated
	 */
	EAttribute getGSSConfigGSSInfoPrint_MainLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint#getPortLogs <em>Port Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Logs</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint#getPortLogs()
	 * @see #getGSSConfigGSSInfoPrint()
	 * @generated
	 */
	EAttribute getGSSConfigGSSInfoPrint_PortLogs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint#getRawLog <em>Raw Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Log</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint#getRawLog()
	 * @see #getGSSConfigGSSInfoPrint()
	 * @generated
	 */
	EAttribute getGSSConfigGSSInfoPrint_RawLog();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint <em>GSS Config Phy Header Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Phy Header Print</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint
	 * @generated
	 */
	EClass getGSSConfigPhyHeaderPrint();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getMainLog <em>Main Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Log</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getMainLog()
	 * @see #getGSSConfigPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSConfigPhyHeaderPrint_MainLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getPortLogs <em>Port Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Logs</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getPortLogs()
	 * @see #getGSSConfigPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSConfigPhyHeaderPrint_PortLogs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getRawLog <em>Raw Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Log</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getRawLog()
	 * @see #getGSSConfigPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSConfigPhyHeaderPrint_RawLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gss Tabs</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint#getGssTabs()
	 * @see #getGSSConfigPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSConfigPhyHeaderPrint_GssTabs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags <em>GSS Config GSS Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GSS Discard Error Flags</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags
	 * @generated
	 */
	EClass getGSSConfigGSSDiscardErrorFlags();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx Errors</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getTxErrors()
	 * @see #getGSSConfigGSSDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSConfigGSSDiscardErrorFlags_TxErrors();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Expected Packets</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getNotExpectedPackets()
	 * @see #getGSSConfigGSSDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSConfigGSSDiscardErrorFlags_NotExpectedPackets();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filters Ko</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getFiltersKo()
	 * @see #getGSSConfigGSSDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSConfigGSSDiscardErrorFlags_FiltersKo();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Times Ko</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags#getValidTimesKo()
	 * @see #getGSSConfigGSSDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSConfigGSSDiscardErrorFlags_ValidTimesKo();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigProtocols <em>GSS Config Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Protocols</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocols
	 * @generated
	 */
	EClass getGSSConfigProtocols();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigProtocols#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocols#getProtocol()
	 * @see #getGSSConfigProtocols()
	 * @generated
	 */
	EReference getGSSConfigProtocols_Protocol();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol <em>GSS Config Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Protocol</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocol
	 * @generated
	 */
	EClass getGSSConfigProtocol();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocol#getId()
	 * @see #getGSSConfigProtocol()
	 * @generated
	 */
	EAttribute getGSSConfigProtocol_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocol#getName()
	 * @see #getGSSConfigProtocol()
	 * @generated
	 */
	EAttribute getGSSConfigProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeLevel <em>Type Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeLevel()
	 * @see #getGSSConfigProtocol()
	 * @generated
	 */
	EAttribute getGSSConfigProtocol_TypeLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeOffset <em>Type Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Offset</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeOffset()
	 * @see #getGSSConfigProtocol()
	 * @generated
	 */
	EAttribute getGSSConfigProtocol_TypeOffset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getSubtypeOffset <em>Subtype Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype Offset</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigProtocol#getSubtypeOffset()
	 * @see #getGSSConfigProtocol()
	 * @generated
	 */
	EAttribute getGSSConfigProtocol_SubtypeOffset();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaces <em>GSS Config Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Interfaces</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaces
	 * @generated
	 */
	EClass getGSSConfigInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaces#getMainInterface <em>Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Interface</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaces#getMainInterface()
	 * @see #getGSSConfigInterfaces()
	 * @generated
	 */
	EReference getGSSConfigInterfaces_MainInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaces#getInterface()
	 * @see #getGSSConfigInterfaces()
	 * @generated
	 */
	EReference getGSSConfigInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface <em>GSS Config Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Main Interface</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface
	 * @generated
	 */
	EClass getGSSConfigMainInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface#getId()
	 * @see #getGSSConfigMainInterface()
	 * @generated
	 */
	EAttribute getGSSConfigMainInterface_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface#getName()
	 * @see #getGSSConfigMainInterface()
	 * @generated
	 */
	EAttribute getGSSConfigMainInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfType <em>If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfType()
	 * @see #getGSSConfigMainInterface()
	 * @generated
	 */
	EAttribute getGSSConfigMainInterface_IfType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfConfig <em>If Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Config</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfConfig()
	 * @see #getGSSConfigMainInterface()
	 * @generated
	 */
	EReference getGSSConfigMainInterface_IfConfig();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIoType <em>Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIoType()
	 * @see #getGSSConfigMainInterface()
	 * @generated
	 */
	EAttribute getGSSConfigMainInterface_IoType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getProtocolID <em>Protocol ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol ID</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface#getProtocolID()
	 * @see #getGSSConfigMainInterface()
	 * @generated
	 */
	EReference getGSSConfigMainInterface_ProtocolID();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getLevelInOut <em>Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level In Out</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterface#getLevelInOut()
	 * @see #getGSSConfigMainInterface()
	 * @generated
	 */
	EReference getGSSConfigMainInterface_LevelInOut();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigInterface <em>GSS Config Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Interface</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface
	 * @generated
	 */
	EClass getGSSConfigInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getId()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EAttribute getGSSConfigInterface_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getName()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EAttribute getGSSConfigInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getIfType <em>If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getIfType()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EAttribute getGSSConfigInterface_IfType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getIfConfig <em>If Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Config</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getIfConfig()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EReference getGSSConfigInterface_IfConfig();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getIoType <em>Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getIoType()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EAttribute getGSSConfigInterface_IoType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getProtocolID <em>Protocol ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol ID</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getProtocolID()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EReference getGSSConfigInterface_ProtocolID();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getLevelInOut <em>Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level In Out</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getLevelInOut()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EReference getGSSConfigInterface_LevelInOut();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getLevelIn <em>Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level In</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getLevelIn()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EReference getGSSConfigInterface_LevelIn();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigInterface#getLevelOut <em>Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Out</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterface#getLevelOut()
	 * @see #getGSSConfigInterface()
	 * @generated
	 */
	EReference getGSSConfigInterface_LevelOut();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut <em>GSS Config Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Level In Out</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut
	 * @generated
	 */
	EClass getGSSConfigLevelInOut();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getId()
	 * @see #getGSSConfigLevelInOut()
	 * @generated
	 */
	EAttribute getGSSConfigLevelInOut_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getName()
	 * @see #getGSSConfigLevelInOut()
	 * @generated
	 */
	EAttribute getGSSConfigLevelInOut_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTMformat()
	 * @see #getGSSConfigLevelInOut()
	 * @generated
	 */
	EReference getGSSConfigLevelInOut_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTCformat <em>TCformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TCformat</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTCformat()
	 * @see #getGSSConfigLevelInOut()
	 * @generated
	 */
	EReference getGSSConfigLevelInOut_TCformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getInputFilter()
	 * @see #getGSSConfigLevelInOut()
	 * @generated
	 */
	EReference getGSSConfigLevelInOut_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getExport_to_prev_Level <em>Export to prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export to prev Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getExport_to_prev_Level()
	 * @see #getGSSConfigLevelInOut()
	 * @generated
	 */
	EReference getGSSConfigLevelInOut_Export_to_prev_Level();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getImport_from_prev_Level()
	 * @see #getGSSConfigLevelInOut()
	 * @generated
	 */
	EReference getGSSConfigLevelInOut_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigLevelIn <em>GSS Config Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Level In</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelIn
	 * @generated
	 */
	EClass getGSSConfigLevelIn();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigLevelIn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelIn#getId()
	 * @see #getGSSConfigLevelIn()
	 * @generated
	 */
	EAttribute getGSSConfigLevelIn_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigLevelIn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelIn#getName()
	 * @see #getGSSConfigLevelIn()
	 * @generated
	 */
	EAttribute getGSSConfigLevelIn_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelIn#getTCformat <em>TCformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TCformat</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelIn#getTCformat()
	 * @see #getGSSConfigLevelIn()
	 * @generated
	 */
	EReference getGSSConfigLevelIn_TCformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelIn#getExport_to_prev_Level <em>Export to prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export to prev Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelIn#getExport_to_prev_Level()
	 * @see #getGSSConfigLevelIn()
	 * @generated
	 */
	EReference getGSSConfigLevelIn_Export_to_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut <em>GSS Config Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Level Out</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelOut
	 * @generated
	 */
	EClass getGSSConfigLevelOut();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelOut#getId()
	 * @see #getGSSConfigLevelOut()
	 * @generated
	 */
	EAttribute getGSSConfigLevelOut_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelOut#getName()
	 * @see #getGSSConfigLevelOut()
	 * @generated
	 */
	EAttribute getGSSConfigLevelOut_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelOut#getTMformat()
	 * @see #getGSSConfigLevelOut()
	 * @generated
	 */
	EReference getGSSConfigLevelOut_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelOut#getInputFilter()
	 * @see #getGSSConfigLevelOut()
	 * @generated
	 */
	EReference getGSSConfigLevelOut_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigLevelOut#getImport_from_prev_Level()
	 * @see #getGSSConfigLevelOut()
	 * @generated
	 */
	EReference getGSSConfigLevelOut_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPackets <em>GSS Config Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPackets
	 * @generated
	 */
	EClass getGSSConfigSpecialPackets();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPackets#getSpecialPacket <em>Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPackets#getSpecialPacket()
	 * @see #getGSSConfigSpecialPackets()
	 * @generated
	 */
	EReference getGSSConfigSpecialPackets_SpecialPacket();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket <em>GSS Config Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket
	 * @generated
	 */
	EClass getGSSConfigSpecialPacket();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getStatus()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigSpecialPacket_Status();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getName()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigSpecialPacket_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getId()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigSpecialPacket_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIfRef()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigSpecialPacket_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Levels</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevels()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigSpecialPacket_Levels();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevelRef <em>Level Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getLevelRef()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigSpecialPacket_LevelRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getInputFilter()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EReference getGSSConfigSpecialPacket_InputFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getUpperLevels <em>Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Levels</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getUpperLevels()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EReference getGSSConfigSpecialPacket_UpperLevels();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPrintingData <em>Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Printing Data</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPrintingData()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EReference getGSSConfigSpecialPacket_PrintingData();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getPeriod()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EReference getGSSConfigSpecialPacket_Period();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIntervalRange <em>Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval Range</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigSpecialPacket#getIntervalRange()
	 * @see #getGSSConfigSpecialPacket()
	 * @generated
	 */
	EReference getGSSConfigSpecialPacket_IntervalRange();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevels <em>GSS Config Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Upper Levels</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevels
	 * @generated
	 */
	EClass getGSSConfigUpperLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevels#getUpperLevel <em>Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevels#getUpperLevel()
	 * @see #getGSSConfigUpperLevels()
	 * @generated
	 */
	EReference getGSSConfigUpperLevels_UpperLevel();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel <em>GSS Config Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Upper Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevel
	 * @generated
	 */
	EClass getGSSConfigUpperLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getLevel()
	 * @see #getGSSConfigUpperLevel()
	 * @generated
	 */
	EAttribute getGSSConfigUpperLevel_Level();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getTMformat()
	 * @see #getGSSConfigUpperLevel()
	 * @generated
	 */
	EReference getGSSConfigUpperLevel_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getInputFilter()
	 * @see #getGSSConfigUpperLevel()
	 * @generated
	 */
	EReference getGSSConfigUpperLevel_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getImport_from_prev_Level()
	 * @see #getGSSConfigUpperLevel()
	 * @generated
	 */
	EReference getGSSConfigUpperLevel_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPrintingData <em>GSS Config Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Printing Data</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPrintingData
	 * @generated
	 */
	EClass getGSSConfigPrintingData();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPrintingData#getPrintStatus <em>Print Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Status</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPrintingData#getPrintStatus()
	 * @see #getGSSConfigPrintingData()
	 * @generated
	 */
	EAttribute getGSSConfigPrintingData_PrintStatus();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigPrintingData#getStructuredData <em>Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Data</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPrintingData#getStructuredData()
	 * @see #getGSSConfigPrintingData()
	 * @generated
	 */
	EReference getGSSConfigPrintingData_StructuredData();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData <em>GSS Config Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Structured Data</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigStructuredData
	 * @generated
	 */
	EClass getGSSConfigStructuredData();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData#getLevelRef <em>Level Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigStructuredData#getLevelRef()
	 * @see #getGSSConfigStructuredData()
	 * @generated
	 */
	EAttribute getGSSConfigStructuredData_LevelRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigStructuredData#getFirstField <em>First Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Field</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigStructuredData#getFirstField()
	 * @see #getGSSConfigStructuredData()
	 * @generated
	 */
	EAttribute getGSSConfigStructuredData_FirstField();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod <em>GSS Config Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Period</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriod
	 * @generated
	 */
	EClass getGSSConfigPeriod();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_value <em>Min value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_value()
	 * @see #getGSSConfigPeriod()
	 * @generated
	 */
	EAttribute getGSSConfigPeriod_Min_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_unit <em>Min unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriod#getMin_unit()
	 * @see #getGSSConfigPeriod()
	 * @generated
	 */
	EAttribute getGSSConfigPeriod_Min_unit();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_value <em>Max value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_value()
	 * @see #getGSSConfigPeriod()
	 * @generated
	 */
	EAttribute getGSSConfigPeriod_Max_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_unit <em>Max unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriod#getMax_unit()
	 * @see #getGSSConfigPeriod()
	 * @generated
	 */
	EAttribute getGSSConfigPeriod_Max_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigIntervalRange <em>GSS Config Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Interval Range</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigIntervalRange
	 * @generated
	 */
	EClass getGSSConfigIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getMin()
	 * @see #getGSSConfigIntervalRange()
	 * @generated
	 */
	EAttribute getGSSConfigIntervalRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getMax()
	 * @see #getGSSConfigIntervalRange()
	 * @generated
	 */
	EAttribute getGSSConfigIntervalRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getInterval_value <em>Interval value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getInterval_value()
	 * @see #getGSSConfigIntervalRange()
	 * @generated
	 */
	EAttribute getGSSConfigIntervalRange_Interval_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getInterval_unit <em>Interval unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigIntervalRange#getInterval_unit()
	 * @see #getGSSConfigIntervalRange()
	 * @generated
	 */
	EAttribute getGSSConfigIntervalRange_Interval_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs <em>GSS Config Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Periodic TCs</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs
	 * @generated
	 */
	EClass getGSSConfigPeriodicTCs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs#getPeriodicTC_level_2 <em>Periodic TC level 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic TC level 2</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs#getPeriodicTC_level_2()
	 * @see #getGSSConfigPeriodicTCs()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCs_PeriodicTC_level_2();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs#getPeriodicTC_level_1 <em>Periodic TC level 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic TC level 1</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs#getPeriodicTC_level_1()
	 * @see #getGSSConfigPeriodicTCs()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCs_PeriodicTC_level_1();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs#getPeriodicTC_level_0 <em>Periodic TC level 0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic TC level 0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs#getPeriodicTC_level_0()
	 * @see #getGSSConfigPeriodicTCs()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCs_PeriodicTC_level_0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2 <em>GSS Config Periodic TC Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Periodic TC Level2</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2
	 * @generated
	 */
	EClass getGSSConfigPeriodicTCLevel2();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getName()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel2_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getId()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel2_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getIfRef()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel2_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getPeriod_value()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel2_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getPeriod_unit()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel2_Period_unit();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel2()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel2_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getApp_to_level2 <em>App to level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level2</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getApp_to_level2()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel2_App_to_level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel1()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel2_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel2_to_level1 <em>Level2 to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 to level1</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel2_to_level1()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel2_Level2_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel0()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel2_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2#getLevel1_to_level0()
	 * @see #getGSSConfigPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel2_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1 <em>GSS Config Periodic TC Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Periodic TC Level1</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1
	 * @generated
	 */
	EClass getGSSConfigPeriodicTCLevel1();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getName()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel1_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getId()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel1_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getIfRef()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel1_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getPeriod_value()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel1_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getPeriod_unit()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel1_Period_unit();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getLevel1()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel1_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getApp_to_level1 <em>App to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level1</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getApp_to_level1()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel1_App_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getLevel0()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel1_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1#getLevel1_to_level0()
	 * @see #getGSSConfigPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel1_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0 <em>GSS Config Periodic TC Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Periodic TC Level0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0
	 * @generated
	 */
	EClass getGSSConfigPeriodicTCLevel0();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getName()
	 * @see #getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel0_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getId()
	 * @see #getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel0_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getIfRef()
	 * @see #getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel0_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_value()
	 * @see #getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel0_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getPeriod_unit()
	 * @see #getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	EAttribute getGSSConfigPeriodicTCLevel0_Period_unit();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getLevel0()
	 * @see #getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel0_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getApp_to_level0 <em>App to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level0</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0#getApp_to_level0()
	 * @see #getGSSConfigPeriodicTCLevel0()
	 * @generated
	 */
	EReference getGSSConfigPeriodicTCLevel0_App_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVars <em>GSS Config Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Global Vars</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVars
	 * @generated
	 */
	EClass getGSSConfigGlobalVars();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVars#getGlobalVar <em>Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Var</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVars#getGlobalVar()
	 * @see #getGSSConfigGlobalVars()
	 * @generated
	 */
	EReference getGSSConfigGlobalVars_GlobalVar();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar <em>GSS Config Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Global Var</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar
	 * @generated
	 */
	EClass getGSSConfigGlobalVar();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getName()
	 * @see #getGSSConfigGlobalVar()
	 * @generated
	 */
	EAttribute getGSSConfigGlobalVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getId()
	 * @see #getGSSConfigGlobalVar()
	 * @generated
	 */
	EAttribute getGSSConfigGlobalVar_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getType()
	 * @see #getGSSConfigGlobalVar()
	 * @generated
	 */
	EAttribute getGSSConfigGlobalVar_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getInitial_value <em>Initial value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getInitial_value()
	 * @see #getGSSConfigGlobalVar()
	 * @generated
	 */
	EAttribute getGSSConfigGlobalVar_Initial_value();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getReferenceField <em>Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Field</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getReferenceField()
	 * @see #getGSSConfigGlobalVar()
	 * @generated
	 */
	EReference getGSSConfigGlobalVar_ReferenceField();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getReferencePeriodicTC <em>Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getReferencePeriodicTC()
	 * @see #getGSSConfigGlobalVar()
	 * @generated
	 */
	EReference getGSSConfigGlobalVar_ReferencePeriodicTC();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getReferenceSpecialPacket <em>Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVar#getReferenceSpecialPacket()
	 * @see #getGSSConfigGlobalVar()
	 * @generated
	 */
	EReference getGSSConfigGlobalVar_ReferenceSpecialPacket();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField <em>GSS Config Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Reference Field</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField
	 * @generated
	 */
	EClass getGSSConfigReferenceField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField#getType()
	 * @see #getGSSConfigReferenceField()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField#getIfRef()
	 * @see #getGSSConfigReferenceField()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceField_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField#getLevel()
	 * @see #getGSSConfigReferenceField()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceField_Level();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField#getFieldRef()
	 * @see #getGSSConfigReferenceField()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceField_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField#getOffset()
	 * @see #getGSSConfigReferenceField()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceField_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceField#getSize()
	 * @see #getGSSConfigReferenceField()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceField_Size();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC <em>GSS Config Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Reference Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC
	 * @generated
	 */
	EClass getGSSConfigReferencePeriodicTC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getIdRef()
	 * @see #getGSSConfigReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSConfigReferencePeriodicTC_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getLevel()
	 * @see #getGSSConfigReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSConfigReferencePeriodicTC_Level();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getFieldRef()
	 * @see #getGSSConfigReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSConfigReferencePeriodicTC_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getOffset()
	 * @see #getGSSConfigReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSConfigReferencePeriodicTC_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC#getSize()
	 * @see #getGSSConfigReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSConfigReferencePeriodicTC_Size();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket <em>GSS Config Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Reference Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket
	 * @generated
	 */
	EClass getGSSConfigReferenceSpecialPacket();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getIdRef()
	 * @see #getGSSConfigReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceSpecialPacket_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getLevel()
	 * @see #getGSSConfigReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceSpecialPacket_Level();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getFieldRef()
	 * @see #getGSSConfigReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceSpecialPacket_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getOffset()
	 * @see #getGSSConfigReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceSpecialPacket_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket#getSize()
	 * @see #getGSSConfigReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSConfigReferenceSpecialPacket_Size();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors <em>GSS Config Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Monitors</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMonitors
	 * @generated
	 */
	EClass getGSSConfigMonitors();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getPlot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plot</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMonitors#getPlot()
	 * @see #getGSSConfigMonitors()
	 * @generated
	 */
	EReference getGSSConfigMonitors_Plot();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getAlarmMsg <em>Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm Msg</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMonitors#getAlarmMsg()
	 * @see #getGSSConfigMonitors()
	 * @generated
	 */
	EReference getGSSConfigMonitors_AlarmMsg();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getModify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMonitors#getModify()
	 * @see #getGSSConfigMonitors()
	 * @generated
	 */
	EReference getGSSConfigMonitors_Modify();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getAlarmVal <em>Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm Val</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMonitors#getAlarmVal()
	 * @see #getGSSConfigMonitors()
	 * @generated
	 */
	EReference getGSSConfigMonitors_AlarmVal();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigMonitors#getChartsFile <em>Charts File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charts File</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMonitors#getChartsFile()
	 * @see #getGSSConfigMonitors()
	 * @generated
	 */
	EReference getGSSConfigMonitors_ChartsFile();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigPlot <em>GSS Config Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Plot</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPlot
	 * @generated
	 */
	EClass getGSSConfigPlot();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigPlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPlot#getName()
	 * @see #getGSSConfigPlot()
	 * @generated
	 */
	EAttribute getGSSConfigPlot_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigPlot#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPlot#getGVFiltered()
	 * @see #getGSSConfigPlot()
	 * @generated
	 */
	EReference getGSSConfigPlot_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigPlot#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigPlot#getGVPeriodic()
	 * @see #getGSSConfigPlot()
	 * @generated
	 */
	EReference getGSSConfigPlot_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg <em>GSS Config Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Alarm Msg</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsg
	 * @generated
	 */
	EClass getGSSConfigAlarmMsg();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getName()
	 * @see #getGSSConfigAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSConfigAlarmMsg_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getType()
	 * @see #getGSSConfigAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSConfigAlarmMsg_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getText()
	 * @see #getGSSConfigAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSConfigAlarmMsg_Text();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getGVFiltered()
	 * @see #getGSSConfigAlarmMsg()
	 * @generated
	 */
	EReference getGSSConfigAlarmMsg_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsg#getGVPeriodic()
	 * @see #getGSSConfigAlarmMsg()
	 * @generated
	 */
	EReference getGSSConfigAlarmMsg_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigModify <em>GSS Config Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Modify</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModify
	 * @generated
	 */
	EClass getGSSConfigModify();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigModify#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModify#getName()
	 * @see #getGSSConfigModify()
	 * @generated
	 */
	EAttribute getGSSConfigModify_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigModify#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModify#getType()
	 * @see #getGSSConfigModify()
	 * @generated
	 */
	EAttribute getGSSConfigModify_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigModify#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModify#getValue()
	 * @see #getGSSConfigModify()
	 * @generated
	 */
	EAttribute getGSSConfigModify_Value();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigModify#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModify#getGVFiltered()
	 * @see #getGSSConfigModify()
	 * @generated
	 */
	EReference getGSSConfigModify_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigModify#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModify#getGVPeriodic()
	 * @see #getGSSConfigModify()
	 * @generated
	 */
	EReference getGSSConfigModify_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmVal <em>GSS Config Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Alarm Val</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmVal
	 * @generated
	 */
	EClass getGSSConfigAlarmVal();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getName()
	 * @see #getGSSConfigAlarmVal()
	 * @generated
	 */
	EAttribute getGSSConfigAlarmVal_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getType()
	 * @see #getGSSConfigAlarmVal()
	 * @generated
	 */
	EAttribute getGSSConfigAlarmVal_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getGVFiltered()
	 * @see #getGSSConfigAlarmVal()
	 * @generated
	 */
	EReference getGSSConfigAlarmVal_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmVal#getGVPeriodic()
	 * @see #getGSSConfigAlarmVal()
	 * @generated
	 */
	EReference getGSSConfigAlarmVal_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered <em>GSS Config GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVFiltered
	 * @generated
	 */
	EClass getGSSConfigGVFiltered();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getGlobalVarRef <em>Global Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getGlobalVarRef()
	 * @see #getGSSConfigGVFiltered()
	 * @generated
	 */
	EAttribute getGSSConfigGVFiltered_GlobalVarRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVFiltered#getFilter()
	 * @see #getGSSConfigGVFiltered()
	 * @generated
	 */
	EReference getGSSConfigGVFiltered_Filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigGVPeriodic <em>GSS Config GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVPeriodic
	 * @generated
	 */
	EClass getGSSConfigGVPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGVPeriodic#getGlobalVarRef <em>Global Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVPeriodic#getGlobalVarRef()
	 * @see #getGSSConfigGVPeriodic()
	 * @generated
	 */
	EAttribute getGSSConfigGVPeriodic_GlobalVarRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGVPeriodic#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVPeriodic#getPeriod_value()
	 * @see #getGSSConfigGVPeriodic()
	 * @generated
	 */
	EAttribute getGSSConfigGVPeriodic_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigGVPeriodic#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGVPeriodic#getPeriod_unit()
	 * @see #getGSSConfigGVPeriodic()
	 * @generated
	 */
	EAttribute getGSSConfigGVPeriodic_Period_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigTests <em>GSS Config Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Tests</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTests
	 * @generated
	 */
	EClass getGSSConfigTests();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigTests#getProtocolPacketsFile <em>Protocol Packets File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol Packets File</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTests#getProtocolPacketsFile()
	 * @see #getGSSConfigTests()
	 * @generated
	 */
	EReference getGSSConfigTests_ProtocolPacketsFile();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.config.GSSConfigTests#getTestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Case</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTests#getTestCase()
	 * @see #getGSSConfigTests()
	 * @generated
	 */
	EReference getGSSConfigTests_TestCase();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase <em>GSS Config Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Config Test Case</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase
	 * @generated
	 */
	EClass getGSSConfigTestCase();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getName()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EAttribute getGSSConfigTestCase_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getProcedure <em>Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Procedure</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getProcedure()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EReference getGSSConfigTestCase_Procedure();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getReq()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EAttribute getGSSConfigTestCase_Req();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction <em>Req Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req Action</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction()
	 * @see #getGSSConfigTestCase()
	 * @generated
	 */
	EAttribute getGSSConfigTestCase_ReqAction();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable <em>GSS Config Enable Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Enable Disable</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
	 * @generated
	 */
	EEnum getGSSConfigEnableDisable();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType <em>GSS Config Main Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Main Interface Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType
	 * @generated
	 */
	EEnum getGSSConfigMainInterfaceType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType <em>GSS Config Main Interface IO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Main Interface IO Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType
	 * @generated
	 */
	EEnum getGSSConfigMainInterfaceIOType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaceType <em>GSS Config Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Interface Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaceType
	 * @generated
	 */
	EEnum getGSSConfigInterfaceType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType <em>GSS Config Interface IO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Interface IO Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType
	 * @generated
	 */
	EEnum getGSSConfigInterfaceIOType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel <em>GSS Config Upper Level Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Upper Level Level</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel
	 * @generated
	 */
	EEnum getGSSConfigUpperLevelLevel();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigUnit <em>GSS Config Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Unit</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
	 * @generated
	 */
	EEnum getGSSConfigUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVarType <em>GSS Config Global Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Global Var Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVarType
	 * @generated
	 */
	EEnum getGSSConfigGlobalVarType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceFieldType <em>GSS Config Reference Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Reference Field Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceFieldType
	 * @generated
	 */
	EEnum getGSSConfigReferenceFieldType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsgType <em>GSS Config Alarm Msg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Alarm Msg Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsgType
	 * @generated
	 */
	EEnum getGSSConfigAlarmMsgType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigModifyType <em>GSS Config Modify Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Modify Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigModifyType
	 * @generated
	 */
	EEnum getGSSConfigModifyType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmValType <em>GSS Config Alarm Val Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Alarm Val Type</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmValType
	 * @generated
	 */
	EEnum getGSSConfigAlarmValType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.config.GSSConfigReqAction <em>GSS Config Req Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Config Req Action</em>'.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
	 * @generated
	 */
	EEnum getGSSConfigReqAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	configFactory getconfigFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl <em>GSS Config GSS Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSConfigImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSConfig()
		 * @generated
		 */
		EClass GSS_CONFIG_GSS_CONFIG = eINSTANCE.getGSSConfigGSSConfig();

		/**
		 * The meta object literal for the '<em><b>Gss options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS = eINSTANCE.getGSSConfigGSSConfig_Gss_options();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__PROTOCOLS = eINSTANCE.getGSSConfigGSSConfig_Protocols();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__INTERFACES = eINSTANCE.getGSSConfigGSSConfig_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Special Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS = eINSTANCE.getGSSConfigGSSConfig_SpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Periodic TCs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS = eINSTANCE.getGSSConfigGSSConfig_PeriodicTCs();

		/**
		 * The meta object literal for the '<em><b>Global Vars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS = eINSTANCE.getGSSConfigGSSConfig_GlobalVars();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__MONITORS = eINSTANCE.getGSSConfigGSSConfig_Monitors();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_CONFIG__TESTS = eINSTANCE.getGSSConfigGSSConfig_Tests();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl <em>GSS Config GSS Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSOptionsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSOptions()
		 * @generated
		 */
		EClass GSS_CONFIG_GSS_OPTIONS = eINSTANCE.getGSSConfigGSSOptions();

		/**
		 * The meta object literal for the '<em><b>Gss info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_OPTIONS__GSS_INFO = eINSTANCE.getGSSConfigGSSOptions_Gss_info();

		/**
		 * The meta object literal for the '<em><b>Gss info print</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT = eINSTANCE.getGSSConfigGSSOptions_Gss_info_print();

		/**
		 * The meta object literal for the '<em><b>Phy header print</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT = eINSTANCE.getGSSConfigGSSOptions_Phy_header_print();

		/**
		 * The meta object literal for the '<em><b>Discard Error Flags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS = eINSTANCE.getGSSConfigGSSOptions_DiscardErrorFlags();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl <em>GSS Config GSS Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSInfo()
		 * @generated
		 */
		EClass GSS_CONFIG_GSS_INFO = eINSTANCE.getGSSConfigGSSInfo();

		/**
		 * The meta object literal for the '<em><b>Test campaign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN = eINSTANCE.getGSSConfigGSSInfo_Test_campaign();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_INFO__VERSION = eINSTANCE.getGSSConfigGSSInfo_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_INFO__DATE = eINSTANCE.getGSSConfigGSSInfo_Date();

		/**
		 * The meta object literal for the '<em><b>Version control url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL = eINSTANCE.getGSSConfigGSSInfo_Version_control_url();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoPrintImpl <em>GSS Config GSS Info Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSInfoPrintImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSInfoPrint()
		 * @generated
		 */
		EClass GSS_CONFIG_GSS_INFO_PRINT = eINSTANCE.getGSSConfigGSSInfoPrint();

		/**
		 * The meta object literal for the '<em><b>Main Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG = eINSTANCE.getGSSConfigGSSInfoPrint_MainLog();

		/**
		 * The meta object literal for the '<em><b>Port Logs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS = eINSTANCE.getGSSConfigGSSInfoPrint_PortLogs();

		/**
		 * The meta object literal for the '<em><b>Raw Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_INFO_PRINT__RAW_LOG = eINSTANCE.getGSSConfigGSSInfoPrint_RawLog();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl <em>GSS Config Phy Header Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPhyHeaderPrintImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPhyHeaderPrint()
		 * @generated
		 */
		EClass GSS_CONFIG_PHY_HEADER_PRINT = eINSTANCE.getGSSConfigPhyHeaderPrint();

		/**
		 * The meta object literal for the '<em><b>Main Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG = eINSTANCE.getGSSConfigPhyHeaderPrint_MainLog();

		/**
		 * The meta object literal for the '<em><b>Port Logs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS = eINSTANCE.getGSSConfigPhyHeaderPrint_PortLogs();

		/**
		 * The meta object literal for the '<em><b>Raw Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PHY_HEADER_PRINT__RAW_LOG = eINSTANCE.getGSSConfigPhyHeaderPrint_RawLog();

		/**
		 * The meta object literal for the '<em><b>Gss Tabs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS = eINSTANCE.getGSSConfigPhyHeaderPrint_GssTabs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl <em>GSS Config GSS Discard Error Flags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGSSDiscardErrorFlagsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGSSDiscardErrorFlags()
		 * @generated
		 */
		EClass GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS = eINSTANCE.getGSSConfigGSSDiscardErrorFlags();

		/**
		 * The meta object literal for the '<em><b>Tx Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS = eINSTANCE.getGSSConfigGSSDiscardErrorFlags_TxErrors();

		/**
		 * The meta object literal for the '<em><b>Not Expected Packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS = eINSTANCE.getGSSConfigGSSDiscardErrorFlags_NotExpectedPackets();

		/**
		 * The meta object literal for the '<em><b>Filters Ko</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO = eINSTANCE.getGSSConfigGSSDiscardErrorFlags_FiltersKo();

		/**
		 * The meta object literal for the '<em><b>Valid Times Ko</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO = eINSTANCE.getGSSConfigGSSDiscardErrorFlags_ValidTimesKo();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigProtocolsImpl <em>GSS Config Protocols</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigProtocolsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigProtocols()
		 * @generated
		 */
		EClass GSS_CONFIG_PROTOCOLS = eINSTANCE.getGSSConfigProtocols();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PROTOCOLS__PROTOCOL = eINSTANCE.getGSSConfigProtocols_Protocol();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigProtocolImpl <em>GSS Config Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigProtocolImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigProtocol()
		 * @generated
		 */
		EClass GSS_CONFIG_PROTOCOL = eINSTANCE.getGSSConfigProtocol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PROTOCOL__ID = eINSTANCE.getGSSConfigProtocol_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PROTOCOL__NAME = eINSTANCE.getGSSConfigProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Type Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PROTOCOL__TYPE_LEVEL = eINSTANCE.getGSSConfigProtocol_TypeLevel();

		/**
		 * The meta object literal for the '<em><b>Type Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PROTOCOL__TYPE_OFFSET = eINSTANCE.getGSSConfigProtocol_TypeOffset();

		/**
		 * The meta object literal for the '<em><b>Subtype Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PROTOCOL__SUBTYPE_OFFSET = eINSTANCE.getGSSConfigProtocol_SubtypeOffset();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfacesImpl <em>GSS Config Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigInterfacesImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterfaces()
		 * @generated
		 */
		EClass GSS_CONFIG_INTERFACES = eINSTANCE.getGSSConfigInterfaces();

		/**
		 * The meta object literal for the '<em><b>Main Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_INTERFACES__MAIN_INTERFACE = eINSTANCE.getGSSConfigInterfaces_MainInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_INTERFACES__INTERFACE = eINSTANCE.getGSSConfigInterfaces_Interface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl <em>GSS Config Main Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigMainInterfaceImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMainInterface()
		 * @generated
		 */
		EClass GSS_CONFIG_MAIN_INTERFACE = eINSTANCE.getGSSConfigMainInterface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_MAIN_INTERFACE__ID = eINSTANCE.getGSSConfigMainInterface_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_MAIN_INTERFACE__NAME = eINSTANCE.getGSSConfigMainInterface_Name();

		/**
		 * The meta object literal for the '<em><b>If Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_MAIN_INTERFACE__IF_TYPE = eINSTANCE.getGSSConfigMainInterface_IfType();

		/**
		 * The meta object literal for the '<em><b>If Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG = eINSTANCE.getGSSConfigMainInterface_IfConfig();

		/**
		 * The meta object literal for the '<em><b>Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_MAIN_INTERFACE__IO_TYPE = eINSTANCE.getGSSConfigMainInterface_IoType();

		/**
		 * The meta object literal for the '<em><b>Protocol ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID = eINSTANCE.getGSSConfigMainInterface_ProtocolID();

		/**
		 * The meta object literal for the '<em><b>Level In Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT = eINSTANCE.getGSSConfigMainInterface_LevelInOut();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl <em>GSS Config Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigInterfaceImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterface()
		 * @generated
		 */
		EClass GSS_CONFIG_INTERFACE = eINSTANCE.getGSSConfigInterface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERFACE__ID = eINSTANCE.getGSSConfigInterface_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERFACE__NAME = eINSTANCE.getGSSConfigInterface_Name();

		/**
		 * The meta object literal for the '<em><b>If Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERFACE__IF_TYPE = eINSTANCE.getGSSConfigInterface_IfType();

		/**
		 * The meta object literal for the '<em><b>If Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_INTERFACE__IF_CONFIG = eINSTANCE.getGSSConfigInterface_IfConfig();

		/**
		 * The meta object literal for the '<em><b>Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERFACE__IO_TYPE = eINSTANCE.getGSSConfigInterface_IoType();

		/**
		 * The meta object literal for the '<em><b>Protocol ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_INTERFACE__PROTOCOL_ID = eINSTANCE.getGSSConfigInterface_ProtocolID();

		/**
		 * The meta object literal for the '<em><b>Level In Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_INTERFACE__LEVEL_IN_OUT = eINSTANCE.getGSSConfigInterface_LevelInOut();

		/**
		 * The meta object literal for the '<em><b>Level In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_INTERFACE__LEVEL_IN = eINSTANCE.getGSSConfigInterface_LevelIn();

		/**
		 * The meta object literal for the '<em><b>Level Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_INTERFACE__LEVEL_OUT = eINSTANCE.getGSSConfigInterface_LevelOut();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInOutImpl <em>GSS Config Level In Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigLevelInOutImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigLevelInOut()
		 * @generated
		 */
		EClass GSS_CONFIG_LEVEL_IN_OUT = eINSTANCE.getGSSConfigLevelInOut();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_LEVEL_IN_OUT__ID = eINSTANCE.getGSSConfigLevelInOut_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_LEVEL_IN_OUT__NAME = eINSTANCE.getGSSConfigLevelInOut_Name();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_IN_OUT__TMFORMAT = eINSTANCE.getGSSConfigLevelInOut_TMformat();

		/**
		 * The meta object literal for the '<em><b>TCformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_IN_OUT__TCFORMAT = eINSTANCE.getGSSConfigLevelInOut_TCformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_IN_OUT__INPUT_FILTER = eINSTANCE.getGSSConfigLevelInOut_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Export to prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL = eINSTANCE.getGSSConfigLevelInOut_Export_to_prev_Level();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSConfigLevelInOut_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl <em>GSS Config Level In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigLevelInImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigLevelIn()
		 * @generated
		 */
		EClass GSS_CONFIG_LEVEL_IN = eINSTANCE.getGSSConfigLevelIn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_LEVEL_IN__ID = eINSTANCE.getGSSConfigLevelIn_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_LEVEL_IN__NAME = eINSTANCE.getGSSConfigLevelIn_Name();

		/**
		 * The meta object literal for the '<em><b>TCformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_IN__TCFORMAT = eINSTANCE.getGSSConfigLevelIn_TCformat();

		/**
		 * The meta object literal for the '<em><b>Export to prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL = eINSTANCE.getGSSConfigLevelIn_Export_to_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigLevelOutImpl <em>GSS Config Level Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigLevelOutImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigLevelOut()
		 * @generated
		 */
		EClass GSS_CONFIG_LEVEL_OUT = eINSTANCE.getGSSConfigLevelOut();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_LEVEL_OUT__ID = eINSTANCE.getGSSConfigLevelOut_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_LEVEL_OUT__NAME = eINSTANCE.getGSSConfigLevelOut_Name();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_OUT__TMFORMAT = eINSTANCE.getGSSConfigLevelOut_TMformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_OUT__INPUT_FILTER = eINSTANCE.getGSSConfigLevelOut_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSConfigLevelOut_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketsImpl <em>GSS Config Special Packets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigSpecialPackets()
		 * @generated
		 */
		EClass GSS_CONFIG_SPECIAL_PACKETS = eINSTANCE.getGSSConfigSpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Special Packet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET = eINSTANCE.getGSSConfigSpecialPackets_SpecialPacket();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketImpl <em>GSS Config Special Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigSpecialPacketImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigSpecialPacket()
		 * @generated
		 */
		EClass GSS_CONFIG_SPECIAL_PACKET = eINSTANCE.getGSSConfigSpecialPacket();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_SPECIAL_PACKET__STATUS = eINSTANCE.getGSSConfigSpecialPacket_Status();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_SPECIAL_PACKET__NAME = eINSTANCE.getGSSConfigSpecialPacket_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_SPECIAL_PACKET__ID = eINSTANCE.getGSSConfigSpecialPacket_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_SPECIAL_PACKET__IF_REF = eINSTANCE.getGSSConfigSpecialPacket_IfRef();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_SPECIAL_PACKET__LEVELS = eINSTANCE.getGSSConfigSpecialPacket_Levels();

		/**
		 * The meta object literal for the '<em><b>Level Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_SPECIAL_PACKET__LEVEL_REF = eINSTANCE.getGSSConfigSpecialPacket_LevelRef();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_SPECIAL_PACKET__INPUT_FILTER = eINSTANCE.getGSSConfigSpecialPacket_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Upper Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_SPECIAL_PACKET__UPPER_LEVELS = eINSTANCE.getGSSConfigSpecialPacket_UpperLevels();

		/**
		 * The meta object literal for the '<em><b>Printing Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_SPECIAL_PACKET__PRINTING_DATA = eINSTANCE.getGSSConfigSpecialPacket_PrintingData();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_SPECIAL_PACKET__PERIOD = eINSTANCE.getGSSConfigSpecialPacket_Period();

		/**
		 * The meta object literal for the '<em><b>Interval Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_SPECIAL_PACKET__INTERVAL_RANGE = eINSTANCE.getGSSConfigSpecialPacket_IntervalRange();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelsImpl <em>GSS Config Upper Levels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUpperLevels()
		 * @generated
		 */
		EClass GSS_CONFIG_UPPER_LEVELS = eINSTANCE.getGSSConfigUpperLevels();

		/**
		 * The meta object literal for the '<em><b>Upper Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL = eINSTANCE.getGSSConfigUpperLevels_UpperLevel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl <em>GSS Config Upper Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigUpperLevelImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUpperLevel()
		 * @generated
		 */
		EClass GSS_CONFIG_UPPER_LEVEL = eINSTANCE.getGSSConfigUpperLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_UPPER_LEVEL__LEVEL = eINSTANCE.getGSSConfigUpperLevel_Level();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_UPPER_LEVEL__TMFORMAT = eINSTANCE.getGSSConfigUpperLevel_TMformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER = eINSTANCE.getGSSConfigUpperLevel_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSConfigUpperLevel_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPrintingDataImpl <em>GSS Config Printing Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPrintingDataImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPrintingData()
		 * @generated
		 */
		EClass GSS_CONFIG_PRINTING_DATA = eINSTANCE.getGSSConfigPrintingData();

		/**
		 * The meta object literal for the '<em><b>Print Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PRINTING_DATA__PRINT_STATUS = eINSTANCE.getGSSConfigPrintingData_PrintStatus();

		/**
		 * The meta object literal for the '<em><b>Structured Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA = eINSTANCE.getGSSConfigPrintingData_StructuredData();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigStructuredDataImpl <em>GSS Config Structured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigStructuredDataImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigStructuredData()
		 * @generated
		 */
		EClass GSS_CONFIG_STRUCTURED_DATA = eINSTANCE.getGSSConfigStructuredData();

		/**
		 * The meta object literal for the '<em><b>Level Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_STRUCTURED_DATA__LEVEL_REF = eINSTANCE.getGSSConfigStructuredData_LevelRef();

		/**
		 * The meta object literal for the '<em><b>First Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_STRUCTURED_DATA__FIRST_FIELD = eINSTANCE.getGSSConfigStructuredData_FirstField();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodImpl <em>GSS Config Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriod()
		 * @generated
		 */
		EClass GSS_CONFIG_PERIOD = eINSTANCE.getGSSConfigPeriod();

		/**
		 * The meta object literal for the '<em><b>Min value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIOD__MIN_VALUE = eINSTANCE.getGSSConfigPeriod_Min_value();

		/**
		 * The meta object literal for the '<em><b>Min unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIOD__MIN_UNIT = eINSTANCE.getGSSConfigPeriod_Min_unit();

		/**
		 * The meta object literal for the '<em><b>Max value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIOD__MAX_VALUE = eINSTANCE.getGSSConfigPeriod_Max_value();

		/**
		 * The meta object literal for the '<em><b>Max unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIOD__MAX_UNIT = eINSTANCE.getGSSConfigPeriod_Max_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigIntervalRangeImpl <em>GSS Config Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigIntervalRangeImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigIntervalRange()
		 * @generated
		 */
		EClass GSS_CONFIG_INTERVAL_RANGE = eINSTANCE.getGSSConfigIntervalRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERVAL_RANGE__MIN = eINSTANCE.getGSSConfigIntervalRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERVAL_RANGE__MAX = eINSTANCE.getGSSConfigIntervalRange_Max();

		/**
		 * The meta object literal for the '<em><b>Interval value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERVAL_RANGE__INTERVAL_VALUE = eINSTANCE.getGSSConfigIntervalRange_Interval_value();

		/**
		 * The meta object literal for the '<em><b>Interval unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_INTERVAL_RANGE__INTERVAL_UNIT = eINSTANCE.getGSSConfigIntervalRange_Interval_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCsImpl <em>GSS Config Periodic TCs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCs()
		 * @generated
		 */
		EClass GSS_CONFIG_PERIODIC_TCS = eINSTANCE.getGSSConfigPeriodicTCs();

		/**
		 * The meta object literal for the '<em><b>Periodic TC level 2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2 = eINSTANCE.getGSSConfigPeriodicTCs_PeriodicTC_level_2();

		/**
		 * The meta object literal for the '<em><b>Periodic TC level 1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1 = eINSTANCE.getGSSConfigPeriodicTCs_PeriodicTC_level_1();

		/**
		 * The meta object literal for the '<em><b>Periodic TC level 0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0 = eINSTANCE.getGSSConfigPeriodicTCs_PeriodicTC_level_0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl <em>GSS Config Periodic TC Level2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel2Impl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCLevel2()
		 * @generated
		 */
		EClass GSS_CONFIG_PERIODIC_TC_LEVEL2 = eINSTANCE.getGSSConfigPeriodicTCLevel2();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME = eINSTANCE.getGSSConfigPeriodicTCLevel2_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL2__ID = eINSTANCE.getGSSConfigPeriodicTCLevel2_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF = eINSTANCE.getGSSConfigPeriodicTCLevel2_IfRef();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE = eINSTANCE.getGSSConfigPeriodicTCLevel2_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT = eINSTANCE.getGSSConfigPeriodicTCLevel2_Period_unit();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2 = eINSTANCE.getGSSConfigPeriodicTCLevel2_Level2();

		/**
		 * The meta object literal for the '<em><b>App to level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2 = eINSTANCE.getGSSConfigPeriodicTCLevel2_App_to_level2();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1 = eINSTANCE.getGSSConfigPeriodicTCLevel2_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1 = eINSTANCE.getGSSConfigPeriodicTCLevel2_Level2_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0 = eINSTANCE.getGSSConfigPeriodicTCLevel2_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSConfigPeriodicTCLevel2_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl <em>GSS Config Periodic TC Level1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel1Impl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCLevel1()
		 * @generated
		 */
		EClass GSS_CONFIG_PERIODIC_TC_LEVEL1 = eINSTANCE.getGSSConfigPeriodicTCLevel1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME = eINSTANCE.getGSSConfigPeriodicTCLevel1_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL1__ID = eINSTANCE.getGSSConfigPeriodicTCLevel1_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF = eINSTANCE.getGSSConfigPeriodicTCLevel1_IfRef();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE = eINSTANCE.getGSSConfigPeriodicTCLevel1_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT = eINSTANCE.getGSSConfigPeriodicTCLevel1_Period_unit();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1 = eINSTANCE.getGSSConfigPeriodicTCLevel1_Level1();

		/**
		 * The meta object literal for the '<em><b>App to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1 = eINSTANCE.getGSSConfigPeriodicTCLevel1_App_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0 = eINSTANCE.getGSSConfigPeriodicTCLevel1_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSConfigPeriodicTCLevel1_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl <em>GSS Config Periodic TC Level0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPeriodicTCLevel0Impl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPeriodicTCLevel0()
		 * @generated
		 */
		EClass GSS_CONFIG_PERIODIC_TC_LEVEL0 = eINSTANCE.getGSSConfigPeriodicTCLevel0();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME = eINSTANCE.getGSSConfigPeriodicTCLevel0_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL0__ID = eINSTANCE.getGSSConfigPeriodicTCLevel0_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF = eINSTANCE.getGSSConfigPeriodicTCLevel0_IfRef();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE = eINSTANCE.getGSSConfigPeriodicTCLevel0_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT = eINSTANCE.getGSSConfigPeriodicTCLevel0_Period_unit();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0 = eINSTANCE.getGSSConfigPeriodicTCLevel0_Level0();

		/**
		 * The meta object literal for the '<em><b>App to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0 = eINSTANCE.getGSSConfigPeriodicTCLevel0_App_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarsImpl <em>GSS Config Global Vars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGlobalVars()
		 * @generated
		 */
		EClass GSS_CONFIG_GLOBAL_VARS = eINSTANCE.getGSSConfigGlobalVars();

		/**
		 * The meta object literal for the '<em><b>Global Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GLOBAL_VARS__GLOBAL_VAR = eINSTANCE.getGSSConfigGlobalVars_GlobalVar();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarImpl <em>GSS Config Global Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGlobalVarImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGlobalVar()
		 * @generated
		 */
		EClass GSS_CONFIG_GLOBAL_VAR = eINSTANCE.getGSSConfigGlobalVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GLOBAL_VAR__NAME = eINSTANCE.getGSSConfigGlobalVar_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GLOBAL_VAR__ID = eINSTANCE.getGSSConfigGlobalVar_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GLOBAL_VAR__TYPE = eINSTANCE.getGSSConfigGlobalVar_Type();

		/**
		 * The meta object literal for the '<em><b>Initial value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GLOBAL_VAR__INITIAL_VALUE = eINSTANCE.getGSSConfigGlobalVar_Initial_value();

		/**
		 * The meta object literal for the '<em><b>Reference Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GLOBAL_VAR__REFERENCE_FIELD = eINSTANCE.getGSSConfigGlobalVar_ReferenceField();

		/**
		 * The meta object literal for the '<em><b>Reference Periodic TC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GLOBAL_VAR__REFERENCE_PERIODIC_TC = eINSTANCE.getGSSConfigGlobalVar_ReferencePeriodicTC();

		/**
		 * The meta object literal for the '<em><b>Reference Special Packet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET = eINSTANCE.getGSSConfigGlobalVar_ReferenceSpecialPacket();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigReferenceFieldImpl <em>GSS Config Reference Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigReferenceFieldImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferenceField()
		 * @generated
		 */
		EClass GSS_CONFIG_REFERENCE_FIELD = eINSTANCE.getGSSConfigReferenceField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_FIELD__TYPE = eINSTANCE.getGSSConfigReferenceField_Type();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_FIELD__IF_REF = eINSTANCE.getGSSConfigReferenceField_IfRef();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_FIELD__LEVEL = eINSTANCE.getGSSConfigReferenceField_Level();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_FIELD__FIELD_REF = eINSTANCE.getGSSConfigReferenceField_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_FIELD__OFFSET = eINSTANCE.getGSSConfigReferenceField_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_FIELD__SIZE = eINSTANCE.getGSSConfigReferenceField_Size();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigReferencePeriodicTCImpl <em>GSS Config Reference Periodic TC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigReferencePeriodicTCImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferencePeriodicTC()
		 * @generated
		 */
		EClass GSS_CONFIG_REFERENCE_PERIODIC_TC = eINSTANCE.getGSSConfigReferencePeriodicTC();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_PERIODIC_TC__ID_REF = eINSTANCE.getGSSConfigReferencePeriodicTC_IdRef();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_PERIODIC_TC__LEVEL = eINSTANCE.getGSSConfigReferencePeriodicTC_Level();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_PERIODIC_TC__FIELD_REF = eINSTANCE.getGSSConfigReferencePeriodicTC_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_PERIODIC_TC__OFFSET = eINSTANCE.getGSSConfigReferencePeriodicTC_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_PERIODIC_TC__SIZE = eINSTANCE.getGSSConfigReferencePeriodicTC_Size();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigReferenceSpecialPacketImpl <em>GSS Config Reference Special Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigReferenceSpecialPacketImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferenceSpecialPacket()
		 * @generated
		 */
		EClass GSS_CONFIG_REFERENCE_SPECIAL_PACKET = eINSTANCE.getGSSConfigReferenceSpecialPacket();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_SPECIAL_PACKET__ID_REF = eINSTANCE.getGSSConfigReferenceSpecialPacket_IdRef();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_SPECIAL_PACKET__LEVEL = eINSTANCE.getGSSConfigReferenceSpecialPacket_Level();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_SPECIAL_PACKET__FIELD_REF = eINSTANCE.getGSSConfigReferenceSpecialPacket_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_SPECIAL_PACKET__OFFSET = eINSTANCE.getGSSConfigReferenceSpecialPacket_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_REFERENCE_SPECIAL_PACKET__SIZE = eINSTANCE.getGSSConfigReferenceSpecialPacket_Size();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl <em>GSS Config Monitors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigMonitorsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMonitors()
		 * @generated
		 */
		EClass GSS_CONFIG_MONITORS = eINSTANCE.getGSSConfigMonitors();

		/**
		 * The meta object literal for the '<em><b>Plot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MONITORS__PLOT = eINSTANCE.getGSSConfigMonitors_Plot();

		/**
		 * The meta object literal for the '<em><b>Alarm Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MONITORS__ALARM_MSG = eINSTANCE.getGSSConfigMonitors_AlarmMsg();

		/**
		 * The meta object literal for the '<em><b>Modify</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MONITORS__MODIFY = eINSTANCE.getGSSConfigMonitors_Modify();

		/**
		 * The meta object literal for the '<em><b>Alarm Val</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MONITORS__ALARM_VAL = eINSTANCE.getGSSConfigMonitors_AlarmVal();

		/**
		 * The meta object literal for the '<em><b>Charts File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MONITORS__CHARTS_FILE = eINSTANCE.getGSSConfigMonitors_ChartsFile();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigPlotImpl <em>GSS Config Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigPlotImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigPlot()
		 * @generated
		 */
		EClass GSS_CONFIG_PLOT = eINSTANCE.getGSSConfigPlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_PLOT__NAME = eINSTANCE.getGSSConfigPlot_Name();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PLOT__GV_FILTERED = eINSTANCE.getGSSConfigPlot_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_PLOT__GV_PERIODIC = eINSTANCE.getGSSConfigPlot_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigAlarmMsgImpl <em>GSS Config Alarm Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigAlarmMsgImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmMsg()
		 * @generated
		 */
		EClass GSS_CONFIG_ALARM_MSG = eINSTANCE.getGSSConfigAlarmMsg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_ALARM_MSG__NAME = eINSTANCE.getGSSConfigAlarmMsg_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_ALARM_MSG__TYPE = eINSTANCE.getGSSConfigAlarmMsg_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_ALARM_MSG__TEXT = eINSTANCE.getGSSConfigAlarmMsg_Text();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_ALARM_MSG__GV_FILTERED = eINSTANCE.getGSSConfigAlarmMsg_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_ALARM_MSG__GV_PERIODIC = eINSTANCE.getGSSConfigAlarmMsg_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigModifyImpl <em>GSS Config Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigModifyImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigModify()
		 * @generated
		 */
		EClass GSS_CONFIG_MODIFY = eINSTANCE.getGSSConfigModify();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_MODIFY__NAME = eINSTANCE.getGSSConfigModify_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_MODIFY__TYPE = eINSTANCE.getGSSConfigModify_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_MODIFY__VALUE = eINSTANCE.getGSSConfigModify_Value();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MODIFY__GV_FILTERED = eINSTANCE.getGSSConfigModify_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_MODIFY__GV_PERIODIC = eINSTANCE.getGSSConfigModify_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigAlarmValImpl <em>GSS Config Alarm Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigAlarmValImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmVal()
		 * @generated
		 */
		EClass GSS_CONFIG_ALARM_VAL = eINSTANCE.getGSSConfigAlarmVal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_ALARM_VAL__NAME = eINSTANCE.getGSSConfigAlarmVal_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_ALARM_VAL__TYPE = eINSTANCE.getGSSConfigAlarmVal_Type();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_ALARM_VAL__GV_FILTERED = eINSTANCE.getGSSConfigAlarmVal_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_ALARM_VAL__GV_PERIODIC = eINSTANCE.getGSSConfigAlarmVal_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGVFilteredImpl <em>GSS Config GV Filtered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGVFilteredImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGVFiltered()
		 * @generated
		 */
		EClass GSS_CONFIG_GV_FILTERED = eINSTANCE.getGSSConfigGVFiltered();

		/**
		 * The meta object literal for the '<em><b>Global Var Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF = eINSTANCE.getGSSConfigGVFiltered_GlobalVarRef();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_GV_FILTERED__FILTER = eINSTANCE.getGSSConfigGVFiltered_Filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigGVPeriodicImpl <em>GSS Config GV Periodic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigGVPeriodicImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGVPeriodic()
		 * @generated
		 */
		EClass GSS_CONFIG_GV_PERIODIC = eINSTANCE.getGSSConfigGVPeriodic();

		/**
		 * The meta object literal for the '<em><b>Global Var Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GV_PERIODIC__GLOBAL_VAR_REF = eINSTANCE.getGSSConfigGVPeriodic_GlobalVarRef();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GV_PERIODIC__PERIOD_VALUE = eINSTANCE.getGSSConfigGVPeriodic_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_GV_PERIODIC__PERIOD_UNIT = eINSTANCE.getGSSConfigGVPeriodic_Period_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl <em>GSS Config Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestsImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTests()
		 * @generated
		 */
		EClass GSS_CONFIG_TESTS = eINSTANCE.getGSSConfigTests();

		/**
		 * The meta object literal for the '<em><b>Protocol Packets File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE = eINSTANCE.getGSSConfigTests_ProtocolPacketsFile();

		/**
		 * The meta object literal for the '<em><b>Test Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_TESTS__TEST_CASE = eINSTANCE.getGSSConfigTests_TestCase();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl <em>GSS Config Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.impl.GSSConfigTestCaseImpl
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigTestCase()
		 * @generated
		 */
		EClass GSS_CONFIG_TEST_CASE = eINSTANCE.getGSSConfigTestCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_TEST_CASE__NAME = eINSTANCE.getGSSConfigTestCase_Name();

		/**
		 * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_CONFIG_TEST_CASE__PROCEDURE = eINSTANCE.getGSSConfigTestCase_Procedure();

		/**
		 * The meta object literal for the '<em><b>Req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_TEST_CASE__REQ = eINSTANCE.getGSSConfigTestCase_Req();

		/**
		 * The meta object literal for the '<em><b>Req Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_CONFIG_TEST_CASE__REQ_ACTION = eINSTANCE.getGSSConfigTestCase_ReqAction();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigEnableDisable <em>GSS Config Enable Disable</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigEnableDisable
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigEnableDisable()
		 * @generated
		 */
		EEnum GSS_CONFIG_ENABLE_DISABLE = eINSTANCE.getGSSConfigEnableDisable();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType <em>GSS Config Main Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMainInterfaceType()
		 * @generated
		 */
		EEnum GSS_CONFIG_MAIN_INTERFACE_TYPE = eINSTANCE.getGSSConfigMainInterfaceType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType <em>GSS Config Main Interface IO Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigMainInterfaceIOType()
		 * @generated
		 */
		EEnum GSS_CONFIG_MAIN_INTERFACE_IO_TYPE = eINSTANCE.getGSSConfigMainInterfaceIOType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaceType <em>GSS Config Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaceType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterfaceType()
		 * @generated
		 */
		EEnum GSS_CONFIG_INTERFACE_TYPE = eINSTANCE.getGSSConfigInterfaceType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType <em>GSS Config Interface IO Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigInterfaceIOType()
		 * @generated
		 */
		EEnum GSS_CONFIG_INTERFACE_IO_TYPE = eINSTANCE.getGSSConfigInterfaceIOType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel <em>GSS Config Upper Level Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUpperLevelLevel()
		 * @generated
		 */
		EEnum GSS_CONFIG_UPPER_LEVEL_LEVEL = eINSTANCE.getGSSConfigUpperLevelLevel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigUnit <em>GSS Config Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigUnit
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigUnit()
		 * @generated
		 */
		EEnum GSS_CONFIG_UNIT = eINSTANCE.getGSSConfigUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigGlobalVarType <em>GSS Config Global Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigGlobalVarType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigGlobalVarType()
		 * @generated
		 */
		EEnum GSS_CONFIG_GLOBAL_VAR_TYPE = eINSTANCE.getGSSConfigGlobalVarType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigReferenceFieldType <em>GSS Config Reference Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigReferenceFieldType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReferenceFieldType()
		 * @generated
		 */
		EEnum GSS_CONFIG_REFERENCE_FIELD_TYPE = eINSTANCE.getGSSConfigReferenceFieldType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmMsgType <em>GSS Config Alarm Msg Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmMsgType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmMsgType()
		 * @generated
		 */
		EEnum GSS_CONFIG_ALARM_MSG_TYPE = eINSTANCE.getGSSConfigAlarmMsgType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigModifyType <em>GSS Config Modify Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigModifyType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigModifyType()
		 * @generated
		 */
		EEnum GSS_CONFIG_MODIFY_TYPE = eINSTANCE.getGSSConfigModifyType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigAlarmValType <em>GSS Config Alarm Val Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigAlarmValType
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigAlarmValType()
		 * @generated
		 */
		EEnum GSS_CONFIG_ALARM_VAL_TYPE = eINSTANCE.getGSSConfigAlarmValType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.config.GSSConfigReqAction <em>GSS Config Req Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
		 * @see es.uah.aut.srg.gss.config.impl.configPackageImpl#getGSSConfigReqAction()
		 * @generated
		 */
		EEnum GSS_CONFIG_REQ_ACTION = eINSTANCE.getGSSConfigReqAction();

	}

} //configPackage
