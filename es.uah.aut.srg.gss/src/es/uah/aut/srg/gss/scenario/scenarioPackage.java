/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.scenario;

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
 * @see es.uah.aut.srg.gss.scenario.scenarioFactory
 * @model kind="package"
 * @generated
 */
public interface scenarioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scenario";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/scenario";

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
	scenarioPackage eINSTANCE = es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl <em>GSS Scenario Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioScenario()
	 * @generated
	 */
	int GSS_SCENARIO_SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__NAME = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO__NAME;

	/**
	 * The feature id for the '<em><b>Scenario Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__SCENARIO_INTERFACES = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO__SCENARIO_INTERFACES;

	/**
	 * The feature id for the '<em><b>Scenario Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__SCENARIO_VARIABLES = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO__SCENARIO_VARIABLES;

	/**
	 * The feature id for the '<em><b>Scenario Packet Configs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__SCENARIO_PACKET_CONFIGS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO__SCENARIO_PACKET_CONFIGS;

	/**
	 * The feature id for the '<em><b>Gss options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__GSS_OPTIONS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__PROTOCOLS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__INTERFACES = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Periodic TCs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__PERIODIC_TCS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Global Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__GLOBAL_VARS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO__MONITORS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>GSS Scenario Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO_FEATURE_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>GSS Scenario Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SCENARIO_OPERATION_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioOptionsImpl <em>GSS Scenario Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioOptionsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioOptions()
	 * @generated
	 */
	int GSS_SCENARIO_OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Gss info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_OPTIONS__GSS_INFO = 0;

	/**
	 * The feature id for the '<em><b>Gss info print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_OPTIONS__GSS_INFO_PRINT = 1;

	/**
	 * The feature id for the '<em><b>Phy header print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_OPTIONS__PHY_HEADER_PRINT = 2;

	/**
	 * The feature id for the '<em><b>Discard Error Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_OPTIONS__DISCARD_ERROR_FLAGS = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_OPTIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoImpl <em>GSS Scenario Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInfo()
	 * @generated
	 */
	int GSS_SCENARIO_INFO = 2;

	/**
	 * The feature id for the '<em><b>Test campaign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO__TEST_CAMPAIGN = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO__DATE = 2;

	/**
	 * The feature id for the '<em><b>Version control url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO__VERSION_CONTROL_URL = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoPrintImpl <em>GSS Scenario Info Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoPrintImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInfoPrint()
	 * @generated
	 */
	int GSS_SCENARIO_INFO_PRINT = 3;

	/**
	 * The feature id for the '<em><b>Main Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO_PRINT__MAIN_LOG = 0;

	/**
	 * The feature id for the '<em><b>Port Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO_PRINT__PORT_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Raw Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO_PRINT__RAW_LOG = 2;

	/**
	 * The number of structural features of the '<em>GSS Scenario Info Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO_PRINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Scenario Info Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INFO_PRINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl <em>GSS Scenario Phy Header Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPhyHeaderPrint()
	 * @generated
	 */
	int GSS_SCENARIO_PHY_HEADER_PRINT = 4;

	/**
	 * The feature id for the '<em><b>Main Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG = 0;

	/**
	 * The feature id for the '<em><b>Port Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Raw Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG = 2;

	/**
	 * The feature id for the '<em><b>Gss Tabs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Phy Header Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PHY_HEADER_PRINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Phy Header Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PHY_HEADER_PRINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl <em>GSS Scenario Discard Error Flags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioDiscardErrorFlags()
	 * @generated
	 */
	int GSS_SCENARIO_DISCARD_ERROR_FLAGS = 5;

	/**
	 * The feature id for the '<em><b>Tx Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS = 0;

	/**
	 * The feature id for the '<em><b>Not Expected Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS = 1;

	/**
	 * The feature id for the '<em><b>Filters Ko</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO = 2;

	/**
	 * The feature id for the '<em><b>Valid Times Ko</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Discard Error Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_DISCARD_ERROR_FLAGS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Discard Error Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_DISCARD_ERROR_FLAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolsImpl <em>GSS Scenario Protocols</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioProtocols()
	 * @generated
	 */
	int GSS_SCENARIO_PROTOCOLS = 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOLS__PROTOCOL = 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOLS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolImpl <em>GSS Scenario Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioProtocol()
	 * @generated
	 */
	int GSS_SCENARIO_PROTOCOL = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL__TYPE_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL__SUBTYPE = 4;

	/**
	 * The number of structural features of the '<em>GSS Scenario Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Scenario Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolTypeImpl <em>GSS Scenario Protocol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolTypeImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioProtocolType()
	 * @generated
	 */
	int GSS_SCENARIO_PROTOCOL_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL_TYPE__OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PROTOCOL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfacesImpl <em>GSS Scenario Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfacesImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterfaces()
	 * @generated
	 */
	int GSS_SCENARIO_INTERFACES = 9;

	/**
	 * The feature id for the '<em><b>Protocol Packets File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Main Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACES__MAIN_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACES__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>GSS Scenario Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Scenario Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl <em>GSS Scenario Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterface()
	 * @generated
	 */
	int GSS_SCENARIO_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__NAME = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__ID = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__IF_TYPE = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__IF_CONFIG = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__IO_TYPE = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__PROTOCOL_ID = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level In Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Level In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__LEVEL_IN = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Level Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE__LEVEL_OUT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>GSS Scenario Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE_FEATURE_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>GSS Scenario Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERFACE_OPERATION_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMainInterfaceImpl <em>GSS Scenario Main Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioMainInterfaceImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioMainInterface()
	 * @generated
	 */
	int GSS_SCENARIO_MAIN_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__NAME = GSS_SCENARIO_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__ID = GSS_SCENARIO_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>If Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__IF_TYPE = GSS_SCENARIO_INTERFACE__IF_TYPE;

	/**
	 * The feature id for the '<em><b>If Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__IF_CONFIG = GSS_SCENARIO_INTERFACE__IF_CONFIG;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__IO_TYPE = GSS_SCENARIO_INTERFACE__IO_TYPE;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__PROTOCOL_ID = GSS_SCENARIO_INTERFACE__PROTOCOL_ID;

	/**
	 * The feature id for the '<em><b>Level In Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__LEVEL_IN_OUT = GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT;

	/**
	 * The feature id for the '<em><b>Level In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__LEVEL_IN = GSS_SCENARIO_INTERFACE__LEVEL_IN;

	/**
	 * The feature id for the '<em><b>Level Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE__LEVEL_OUT = GSS_SCENARIO_INTERFACE__LEVEL_OUT;

	/**
	 * The number of structural features of the '<em>GSS Scenario Main Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE_FEATURE_COUNT = GSS_SCENARIO_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSS Scenario Main Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MAIN_INTERFACE_OPERATION_COUNT = GSS_SCENARIO_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl <em>GSS Scenario Level In Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioLevelInOut()
	 * @generated
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT = 2;

	/**
	 * The feature id for the '<em><b>TCformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT = 3;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Export to prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL = 6;

	/**
	 * The number of structural features of the '<em>GSS Scenario Level In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Scenario Level In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInImpl <em>GSS Scenario Level In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioLevelIn()
	 * @generated
	 */
	int GSS_SCENARIO_LEVEL_IN = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN__NAME = 1;

	/**
	 * The feature id for the '<em><b>TCformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN__TCFORMAT = 2;

	/**
	 * The feature id for the '<em><b>Export to prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN__EXPORT_TO_PREV_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Level In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Level In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_IN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelOutImpl <em>GSS Scenario Level Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelOutImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioLevelOut()
	 * @generated
	 */
	int GSS_SCENARIO_LEVEL_OUT = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_OUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_OUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_OUT__TMFORMAT = 2;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_OUT__INPUT_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL = 4;

	/**
	 * The number of structural features of the '<em>GSS Scenario Level Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_OUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Scenario Level Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_LEVEL_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketsImpl <em>GSS Scenario Special Packets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioSpecialPackets()
	 * @generated
	 */
	int GSS_SCENARIO_SPECIAL_PACKETS = 15;

	/**
	 * The feature id for the '<em><b>Special Packet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKETS__SPECIAL_PACKET = 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl <em>GSS Scenario Special Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioSpecialPacket()
	 * @generated
	 */
	int GSS_SCENARIO_SPECIAL_PACKET = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__NAME = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__STATUS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__ID = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__IF_REF = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__LEVELS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Upper Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Printing Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__PERIOD = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Interval Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>GSS Scenario Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET_FEATURE_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>GSS Scenario Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_SPECIAL_PACKET_OPERATION_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_PACKET_CONFIG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelsImpl <em>GSS Scenario Upper Levels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUpperLevels()
	 * @generated
	 */
	int GSS_SCENARIO_UPPER_LEVELS = 17;

	/**
	 * The feature id for the '<em><b>Upper Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVELS__UPPER_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Upper Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Upper Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl <em>GSS Scenario Upper Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUpperLevel()
	 * @generated
	 */
	int GSS_SCENARIO_UPPER_LEVEL = 18;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVEL__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVEL__TMFORMAT = 1;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Upper Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Upper Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_UPPER_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPrintingDataImpl <em>GSS Scenario Printing Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPrintingDataImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPrintingData()
	 * @generated
	 */
	int GSS_SCENARIO_PRINTING_DATA = 19;

	/**
	 * The feature id for the '<em><b>Print Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PRINTING_DATA__PRINT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Structured Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PRINTING_DATA__STRUCTURED_DATA = 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Printing Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PRINTING_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Printing Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PRINTING_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioStructuredDataImpl <em>GSS Scenario Structured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioStructuredDataImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioStructuredData()
	 * @generated
	 */
	int GSS_SCENARIO_STRUCTURED_DATA = 20;

	/**
	 * The feature id for the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF = 0;

	/**
	 * The feature id for the '<em><b>First Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD = 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_STRUCTURED_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_STRUCTURED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl <em>GSS Scenario Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriod()
	 * @generated
	 */
	int GSS_SCENARIO_PERIOD = 21;

	/**
	 * The feature id for the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIOD__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Min unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIOD__MIN_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIOD__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIOD__MAX_UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIOD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioIntervalRangeImpl <em>GSS Scenario Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioIntervalRangeImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioIntervalRange()
	 * @generated
	 */
	int GSS_SCENARIO_INTERVAL_RANGE = 22;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERVAL_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERVAL_RANGE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Interval unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERVAL_RANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_INTERVAL_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCsImpl <em>GSS Scenario Periodic TCs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCs()
	 * @generated
	 */
	int GSS_SCENARIO_PERIODIC_TCS = 23;

	/**
	 * The feature id for the '<em><b>Periodic TC</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC = 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Periodic TCs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TCS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Periodic TCs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TCS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl <em>GSS Scenario Periodic TC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTC()
	 * @generated
	 */
	int GSS_SCENARIO_PERIODIC_TC = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC__ID = 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC__IF_REF = 2;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT = 4;

	/**
	 * The number of structural features of the '<em>GSS Scenario Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Scenario Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl <em>GSS Scenario Periodic TC Level2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCLevel2()
	 * @generated
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2 = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__NAME = GSS_SCENARIO_PERIODIC_TC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__ID = GSS_SCENARIO_PERIODIC_TC__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__IF_REF = GSS_SCENARIO_PERIODIC_TC__IF_REF;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__PERIOD_VALUE = GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__PERIOD_UNIT = GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Scenario Periodic TC Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2_FEATURE_COUNT = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Scenario Periodic TC Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL2_OPERATION_COUNT = GSS_SCENARIO_PERIODIC_TC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel1Impl <em>GSS Scenario Periodic TC Level1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel1Impl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCLevel1()
	 * @generated
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1 = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__NAME = GSS_SCENARIO_PERIODIC_TC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__ID = GSS_SCENARIO_PERIODIC_TC__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__IF_REF = GSS_SCENARIO_PERIODIC_TC__IF_REF;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__PERIOD_VALUE = GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__PERIOD_UNIT = GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL1 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL0 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Periodic TC Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1_FEATURE_COUNT = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Periodic TC Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL1_OPERATION_COUNT = GSS_SCENARIO_PERIODIC_TC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel0Impl <em>GSS Scenario Periodic TC Level0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel0Impl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCLevel0()
	 * @generated
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0 = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0__NAME = GSS_SCENARIO_PERIODIC_TC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0__ID = GSS_SCENARIO_PERIODIC_TC__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0__IF_REF = GSS_SCENARIO_PERIODIC_TC__IF_REF;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0__PERIOD_VALUE = GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0__PERIOD_UNIT = GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0__LEVEL0 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0 = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Periodic TC Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0_FEATURE_COUNT = GSS_SCENARIO_PERIODIC_TC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Periodic TC Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PERIODIC_TC_LEVEL0_OPERATION_COUNT = GSS_SCENARIO_PERIODIC_TC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarsImpl <em>GSS Scenario Global Vars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGlobalVars()
	 * @generated
	 */
	int GSS_SCENARIO_GLOBAL_VARS = 28;

	/**
	 * The feature id for the '<em><b>Global Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VARS__GLOBAL_VAR = 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Global Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Global Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarImpl <em>GSS Scenario Global Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGlobalVar()
	 * @generated
	 */
	int GSS_SCENARIO_GLOBAL_VAR = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VAR__NAME = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VAR__ID = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VAR__TYPE = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VAR__INITIAL_VALUE = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VAR__REFERENCE = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_VARIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VAR_FEATURE_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_VARIABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GLOBAL_VAR_OPERATION_COUNT = es.uah.aut.srg.tmtcif.scenario.scenarioPackage.TMTCIF_SCENARIO_VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceImpl <em>GSS Scenario Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReference()
	 * @generated
	 */
	int GSS_SCENARIO_REFERENCE = 30;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE__FIELD_REF = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE__SIZE = 3;

	/**
	 * The number of structural features of the '<em>GSS Scenario Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Scenario Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceFieldImpl <em>GSS Scenario Reference Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceFieldImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferenceField()
	 * @generated
	 */
	int GSS_SCENARIO_REFERENCE_FIELD = 31;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD__LEVEL = GSS_SCENARIO_REFERENCE__LEVEL;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD__FIELD_REF = GSS_SCENARIO_REFERENCE__FIELD_REF;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD__OFFSET = GSS_SCENARIO_REFERENCE__OFFSET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD__SIZE = GSS_SCENARIO_REFERENCE__SIZE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD__TYPE = GSS_SCENARIO_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD__IF_REF = GSS_SCENARIO_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD_FEATURE_COUNT = GSS_SCENARIO_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_FIELD_OPERATION_COUNT = GSS_SCENARIO_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferencePeriodicTCImpl <em>GSS Scenario Reference Periodic TC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferencePeriodicTCImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferencePeriodicTC()
	 * @generated
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC = 32;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC__LEVEL = GSS_SCENARIO_REFERENCE__LEVEL;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC__FIELD_REF = GSS_SCENARIO_REFERENCE__FIELD_REF;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC__OFFSET = GSS_SCENARIO_REFERENCE__OFFSET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC__SIZE = GSS_SCENARIO_REFERENCE__SIZE;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC__ID_REF = GSS_SCENARIO_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Reference Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC_FEATURE_COUNT = GSS_SCENARIO_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Reference Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_PERIODIC_TC_OPERATION_COUNT = GSS_SCENARIO_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceSpecialPacketImpl <em>GSS Scenario Reference Special Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceSpecialPacketImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferenceSpecialPacket()
	 * @generated
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET = 33;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__LEVEL = GSS_SCENARIO_REFERENCE__LEVEL;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__FIELD_REF = GSS_SCENARIO_REFERENCE__FIELD_REF;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__OFFSET = GSS_SCENARIO_REFERENCE__OFFSET;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__SIZE = GSS_SCENARIO_REFERENCE__SIZE;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__ID_REF = GSS_SCENARIO_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Reference Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET_FEATURE_COUNT = GSS_SCENARIO_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Reference Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_REFERENCE_SPECIAL_PACKET_OPERATION_COUNT = GSS_SCENARIO_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl <em>GSS Scenario Monitors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioMonitors()
	 * @generated
	 */
	int GSS_SCENARIO_MONITORS = 34;

	/**
	 * The feature id for the '<em><b>Charts File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITORS__CHARTS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Monitor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITORS__MONITOR = 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITORS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorImpl <em>GSS Scenario Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioMonitor()
	 * @generated
	 */
	int GSS_SCENARIO_MONITOR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>GV Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITOR__GV_REF = 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MONITOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPlotImpl <em>GSS Scenario Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPlotImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPlot()
	 * @generated
	 */
	int GSS_SCENARIO_PLOT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PLOT__NAME = GSS_SCENARIO_MONITOR__NAME;

	/**
	 * The feature id for the '<em><b>GV Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PLOT__GV_REF = GSS_SCENARIO_MONITOR__GV_REF;

	/**
	 * The feature id for the '<em><b>Chart Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PLOT__CHART_REF = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PLOT_FEATURE_COUNT = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_PLOT_OPERATION_COUNT = GSS_SCENARIO_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmMsgImpl <em>GSS Scenario Alarm Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmMsgImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmMsg()
	 * @generated
	 */
	int GSS_SCENARIO_ALARM_MSG = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_MSG__NAME = GSS_SCENARIO_MONITOR__NAME;

	/**
	 * The feature id for the '<em><b>GV Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_MSG__GV_REF = GSS_SCENARIO_MONITOR__GV_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_MSG__TYPE = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_MSG__TEXT = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Alarm Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_MSG_FEATURE_COUNT = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Alarm Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_MSG_OPERATION_COUNT = GSS_SCENARIO_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioModifyImpl <em>GSS Scenario Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioModifyImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioModify()
	 * @generated
	 */
	int GSS_SCENARIO_MODIFY = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MODIFY__NAME = GSS_SCENARIO_MONITOR__NAME;

	/**
	 * The feature id for the '<em><b>GV Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MODIFY__GV_REF = GSS_SCENARIO_MONITOR__GV_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MODIFY__TYPE = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MODIFY__VALUE = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MODIFY_FEATURE_COUNT = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Scenario Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_MODIFY_OPERATION_COUNT = GSS_SCENARIO_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmValImpl <em>GSS Scenario Alarm Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmValImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmVal()
	 * @generated
	 */
	int GSS_SCENARIO_ALARM_VAL = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_VAL__NAME = GSS_SCENARIO_MONITOR__NAME;

	/**
	 * The feature id for the '<em><b>GV Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_VAL__GV_REF = GSS_SCENARIO_MONITOR__GV_REF;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_VAL__TYPE = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario Alarm Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_VAL_FEATURE_COUNT = GSS_SCENARIO_MONITOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Scenario Alarm Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_ALARM_VAL_OPERATION_COUNT = GSS_SCENARIO_MONITOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVRefImpl <em>GSS Scenario GV Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVRefImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGVRef()
	 * @generated
	 */
	int GSS_SCENARIO_GV_REF = 40;

	/**
	 * The feature id for the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF = 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario GV Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Scenario GV Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVFilteredImpl <em>GSS Scenario GV Filtered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVFilteredImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGVFiltered()
	 * @generated
	 */
	int GSS_SCENARIO_GV_FILTERED = 41;

	/**
	 * The feature id for the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_FILTERED__GLOBAL_VAR_REF = GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_FILTERED__FILTER = GSS_SCENARIO_GV_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Scenario GV Filtered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_FILTERED_FEATURE_COUNT = GSS_SCENARIO_GV_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Scenario GV Filtered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_FILTERED_OPERATION_COUNT = GSS_SCENARIO_GV_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVPeriodicImpl <em>GSS Scenario GV Periodic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVPeriodicImpl
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGVPeriodic()
	 * @generated
	 */
	int GSS_SCENARIO_GV_PERIODIC = 42;

	/**
	 * The feature id for the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_PERIODIC__GLOBAL_VAR_REF = GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE = GSS_SCENARIO_GV_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT = GSS_SCENARIO_GV_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Scenario GV Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_PERIODIC_FEATURE_COUNT = GSS_SCENARIO_GV_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Scenario GV Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_SCENARIO_GV_PERIODIC_OPERATION_COUNT = GSS_SCENARIO_GV_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable <em>GSS Scenario Enable Disable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioEnableDisable()
	 * @generated
	 */
	int GSS_SCENARIO_ENABLE_DISABLE = 43;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType <em>GSS Scenario Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterfaceType()
	 * @generated
	 */
	int GSS_SCENARIO_INTERFACE_TYPE = 44;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType <em>GSS Scenario Interface IO Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterfaceIOType()
	 * @generated
	 */
	int GSS_SCENARIO_INTERFACE_IO_TYPE = 45;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel <em>GSS Scenario Upper Level Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUpperLevelLevel()
	 * @generated
	 */
	int GSS_SCENARIO_UPPER_LEVEL_LEVEL = 46;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUnit <em>GSS Scenario Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUnit()
	 * @generated
	 */
	int GSS_SCENARIO_UNIT = 47;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType <em>GSS Scenario Global Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGlobalVarType()
	 * @generated
	 */
	int GSS_SCENARIO_GLOBAL_VAR_TYPE = 48;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceFieldType <em>GSS Scenario Reference Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceFieldType
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferenceFieldType()
	 * @generated
	 */
	int GSS_SCENARIO_REFERENCE_FIELD_TYPE = 49;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsgType <em>GSS Scenario Alarm Msg Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsgType
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmMsgType()
	 * @generated
	 */
	int GSS_SCENARIO_ALARM_MSG_TYPE = 50;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioModifyType <em>GSS Scenario Modify Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioModifyType
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioModifyType()
	 * @generated
	 */
	int GSS_SCENARIO_MODIFY_TYPE = 51;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmValType <em>GSS Scenario Alarm Val Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmValType
	 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmValType()
	 * @generated
	 */
	int GSS_SCENARIO_ALARM_VAL_TYPE = 52;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario <em>GSS Scenario Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Scenario</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario
	 * @generated
	 */
	EClass getGSSScenarioScenario();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGss_options <em>Gss options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss options</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGss_options()
	 * @see #getGSSScenarioScenario()
	 * @generated
	 */
	EReference getGSSScenarioScenario_Gss_options();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocols</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getProtocols()
	 * @see #getGSSScenarioScenario()
	 * @generated
	 */
	EReference getGSSScenarioScenario_Protocols();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getInterfaces()
	 * @see #getGSSScenarioScenario()
	 * @generated
	 */
	EReference getGSSScenarioScenario_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getSpecialPackets <em>Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getSpecialPackets()
	 * @see #getGSSScenarioScenario()
	 * @generated
	 */
	EReference getGSSScenarioScenario_SpecialPackets();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getPeriodicTCs <em>Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodic TCs</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getPeriodicTCs()
	 * @see #getGSSScenarioScenario()
	 * @generated
	 */
	EReference getGSSScenarioScenario_PeriodicTCs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Vars</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGlobalVars()
	 * @see #getGSSScenarioScenario()
	 * @generated
	 */
	EReference getGSSScenarioScenario_GlobalVars();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitors</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getMonitors()
	 * @see #getGSSScenarioScenario()
	 * @generated
	 */
	EReference getGSSScenarioScenario_Monitors();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioOptions <em>GSS Scenario Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Options</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioOptions
	 * @generated
	 */
	EClass getGSSScenarioOptions();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getGss_info <em>Gss info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss info</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getGss_info()
	 * @see #getGSSScenarioOptions()
	 * @generated
	 */
	EReference getGSSScenarioOptions_Gss_info();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getGss_info_print <em>Gss info print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss info print</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getGss_info_print()
	 * @see #getGSSScenarioOptions()
	 * @generated
	 */
	EReference getGSSScenarioOptions_Gss_info_print();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getPhy_header_print <em>Phy header print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phy header print</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getPhy_header_print()
	 * @see #getGSSScenarioOptions()
	 * @generated
	 */
	EReference getGSSScenarioOptions_Phy_header_print();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getDiscardErrorFlags <em>Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discard Error Flags</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioOptions#getDiscardErrorFlags()
	 * @see #getGSSScenarioOptions()
	 * @generated
	 */
	EReference getGSSScenarioOptions_DiscardErrorFlags();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo <em>GSS Scenario Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Info</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfo
	 * @generated
	 */
	EClass getGSSScenarioInfo();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getTest_campaign <em>Test campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test campaign</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getTest_campaign()
	 * @see #getGSSScenarioInfo()
	 * @generated
	 */
	EAttribute getGSSScenarioInfo_Test_campaign();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion()
	 * @see #getGSSScenarioInfo()
	 * @generated
	 */
	EAttribute getGSSScenarioInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getDate()
	 * @see #getGSSScenarioInfo()
	 * @generated
	 */
	EAttribute getGSSScenarioInfo_Date();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion_control_url <em>Version control url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version control url</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfo#getVersion_control_url()
	 * @see #getGSSScenarioInfo()
	 * @generated
	 */
	EAttribute getGSSScenarioInfo_Version_control_url();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint <em>GSS Scenario Info Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Info Print</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint
	 * @generated
	 */
	EClass getGSSScenarioInfoPrint();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint#getMainLog <em>Main Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Log</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint#getMainLog()
	 * @see #getGSSScenarioInfoPrint()
	 * @generated
	 */
	EAttribute getGSSScenarioInfoPrint_MainLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint#getPortLogs <em>Port Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Logs</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint#getPortLogs()
	 * @see #getGSSScenarioInfoPrint()
	 * @generated
	 */
	EAttribute getGSSScenarioInfoPrint_PortLogs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint#getRawLog <em>Raw Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Log</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint#getRawLog()
	 * @see #getGSSScenarioInfoPrint()
	 * @generated
	 */
	EAttribute getGSSScenarioInfoPrint_RawLog();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint <em>GSS Scenario Phy Header Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Phy Header Print</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint
	 * @generated
	 */
	EClass getGSSScenarioPhyHeaderPrint();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getMainLog <em>Main Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Log</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getMainLog()
	 * @see #getGSSScenarioPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSScenarioPhyHeaderPrint_MainLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getPortLogs <em>Port Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Logs</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getPortLogs()
	 * @see #getGSSScenarioPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSScenarioPhyHeaderPrint_PortLogs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getRawLog <em>Raw Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Log</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getRawLog()
	 * @see #getGSSScenarioPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSScenarioPhyHeaderPrint_RawLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gss Tabs</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint#getGssTabs()
	 * @see #getGSSScenarioPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSScenarioPhyHeaderPrint_GssTabs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags <em>GSS Scenario Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Discard Error Flags</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags
	 * @generated
	 */
	EClass getGSSScenarioDiscardErrorFlags();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx Errors</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getTxErrors()
	 * @see #getGSSScenarioDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSScenarioDiscardErrorFlags_TxErrors();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Expected Packets</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getNotExpectedPackets()
	 * @see #getGSSScenarioDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSScenarioDiscardErrorFlags_NotExpectedPackets();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filters Ko</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getFiltersKo()
	 * @see #getGSSScenarioDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSScenarioDiscardErrorFlags_FiltersKo();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Times Ko</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags#getValidTimesKo()
	 * @see #getGSSScenarioDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSScenarioDiscardErrorFlags_ValidTimesKo();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocols <em>GSS Scenario Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Protocols</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocols
	 * @generated
	 */
	EClass getGSSScenarioProtocols();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocols#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocols#getProtocol()
	 * @see #getGSSScenarioProtocols()
	 * @generated
	 */
	EReference getGSSScenarioProtocols_Protocol();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocol <em>GSS Scenario Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Protocol</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocol
	 * @generated
	 */
	EClass getGSSScenarioProtocol();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getId()
	 * @see #getGSSScenarioProtocol()
	 * @generated
	 */
	EAttribute getGSSScenarioProtocol_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getName()
	 * @see #getGSSScenarioProtocol()
	 * @generated
	 */
	EAttribute getGSSScenarioProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getTypeLevel <em>Type Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getTypeLevel()
	 * @see #getGSSScenarioProtocol()
	 * @generated
	 */
	EAttribute getGSSScenarioProtocol_TypeLevel();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getType()
	 * @see #getGSSScenarioProtocol()
	 * @generated
	 */
	EReference getGSSScenarioProtocol_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtype</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocol#getSubtype()
	 * @see #getGSSScenarioProtocol()
	 * @generated
	 */
	EReference getGSSScenarioProtocol_Subtype();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType <em>GSS Scenario Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Protocol Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType
	 * @generated
	 */
	EClass getGSSScenarioProtocolType();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType#getOffset()
	 * @see #getGSSScenarioProtocolType()
	 * @generated
	 */
	EAttribute getGSSScenarioProtocolType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType#getName()
	 * @see #getGSSScenarioProtocolType()
	 * @generated
	 */
	EAttribute getGSSScenarioProtocolType_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces <em>GSS Scenario Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Interfaces</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces
	 * @generated
	 */
	EClass getGSSScenarioInterfaces();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getProtocolPacketsFile <em>Protocol Packets File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol Packets File</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getProtocolPacketsFile()
	 * @see #getGSSScenarioInterfaces()
	 * @generated
	 */
	EReference getGSSScenarioInterfaces_ProtocolPacketsFile();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getMainInterface <em>Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Interface</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getMainInterface()
	 * @see #getGSSScenarioInterfaces()
	 * @generated
	 */
	EReference getGSSScenarioInterfaces_MainInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getInterface()
	 * @see #getGSSScenarioInterfaces()
	 * @generated
	 */
	EReference getGSSScenarioInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMainInterface <em>GSS Scenario Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Main Interface</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMainInterface
	 * @generated
	 */
	EClass getGSSScenarioMainInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface <em>GSS Scenario Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Interface</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface
	 * @generated
	 */
	EClass getGSSScenarioInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getId()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EAttribute getGSSScenarioInterface_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfType <em>If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfType()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EAttribute getGSSScenarioInterface_IfType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfConfig <em>If Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Config</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfConfig()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EReference getGSSScenarioInterface_IfConfig();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIoType <em>Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIoType()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EAttribute getGSSScenarioInterface_IoType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getProtocolID <em>Protocol ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol ID</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getProtocolID()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EReference getGSSScenarioInterface_ProtocolID();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelInOut <em>Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level In Out</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelInOut()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EReference getGSSScenarioInterface_LevelInOut();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelIn <em>Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level In</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelIn()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EReference getGSSScenarioInterface_LevelIn();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelOut <em>Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Out</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelOut()
	 * @see #getGSSScenarioInterface()
	 * @generated
	 */
	EReference getGSSScenarioInterface_LevelOut();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut <em>GSS Scenario Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Level In Out</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut
	 * @generated
	 */
	EClass getGSSScenarioLevelInOut();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getId()
	 * @see #getGSSScenarioLevelInOut()
	 * @generated
	 */
	EAttribute getGSSScenarioLevelInOut_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getName()
	 * @see #getGSSScenarioLevelInOut()
	 * @generated
	 */
	EAttribute getGSSScenarioLevelInOut_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getTMformat()
	 * @see #getGSSScenarioLevelInOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelInOut_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getTCformat <em>TCformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TCformat</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getTCformat()
	 * @see #getGSSScenarioLevelInOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelInOut_TCformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getInputFilter()
	 * @see #getGSSScenarioLevelInOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelInOut_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getExport_to_prev_Level <em>Export to prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export to prev Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getExport_to_prev_Level()
	 * @see #getGSSScenarioLevelInOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelInOut_Export_to_prev_Level();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut#getImport_from_prev_Level()
	 * @see #getGSSScenarioLevelInOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelInOut_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn <em>GSS Scenario Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Level In</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn
	 * @generated
	 */
	EClass getGSSScenarioLevelIn();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getId()
	 * @see #getGSSScenarioLevelIn()
	 * @generated
	 */
	EAttribute getGSSScenarioLevelIn_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getName()
	 * @see #getGSSScenarioLevelIn()
	 * @generated
	 */
	EAttribute getGSSScenarioLevelIn_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getTCformat <em>TCformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TCformat</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getTCformat()
	 * @see #getGSSScenarioLevelIn()
	 * @generated
	 */
	EReference getGSSScenarioLevelIn_TCformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getExport_to_prev_Level <em>Export to prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export to prev Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn#getExport_to_prev_Level()
	 * @see #getGSSScenarioLevelIn()
	 * @generated
	 */
	EReference getGSSScenarioLevelIn_Export_to_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut <em>GSS Scenario Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Level Out</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut
	 * @generated
	 */
	EClass getGSSScenarioLevelOut();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getId()
	 * @see #getGSSScenarioLevelOut()
	 * @generated
	 */
	EAttribute getGSSScenarioLevelOut_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getName()
	 * @see #getGSSScenarioLevelOut()
	 * @generated
	 */
	EAttribute getGSSScenarioLevelOut_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getTMformat()
	 * @see #getGSSScenarioLevelOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelOut_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getInputFilter()
	 * @see #getGSSScenarioLevelOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelOut_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut#getImport_from_prev_Level()
	 * @see #getGSSScenarioLevelOut()
	 * @generated
	 */
	EReference getGSSScenarioLevelOut_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets <em>GSS Scenario Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets
	 * @generated
	 */
	EClass getGSSScenarioSpecialPackets();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets#getSpecialPacket <em>Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets#getSpecialPacket()
	 * @see #getGSSScenarioSpecialPackets()
	 * @generated
	 */
	EReference getGSSScenarioSpecialPackets_SpecialPacket();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket <em>GSS Scenario Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket
	 * @generated
	 */
	EClass getGSSScenarioSpecialPacket();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getStatus()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSScenarioSpecialPacket_Status();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getId()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSScenarioSpecialPacket_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIfRef()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSScenarioSpecialPacket_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Levels</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevels()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSScenarioSpecialPacket_Levels();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevelRef <em>Level Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getLevelRef()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSScenarioSpecialPacket_LevelRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getInputFilter()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EReference getGSSScenarioSpecialPacket_InputFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getUpperLevels <em>Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Levels</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getUpperLevels()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EReference getGSSScenarioSpecialPacket_UpperLevels();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPrintingData <em>Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Printing Data</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPrintingData()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EReference getGSSScenarioSpecialPacket_PrintingData();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getPeriod()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EReference getGSSScenarioSpecialPacket_Period();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIntervalRange <em>Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval Range</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket#getIntervalRange()
	 * @see #getGSSScenarioSpecialPacket()
	 * @generated
	 */
	EReference getGSSScenarioSpecialPacket_IntervalRange();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels <em>GSS Scenario Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Upper Levels</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels
	 * @generated
	 */
	EClass getGSSScenarioUpperLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels#getUpperLevel <em>Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels#getUpperLevel()
	 * @see #getGSSScenarioUpperLevels()
	 * @generated
	 */
	EReference getGSSScenarioUpperLevels_UpperLevel();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel <em>GSS Scenario Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Upper Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel
	 * @generated
	 */
	EClass getGSSScenarioUpperLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getLevel()
	 * @see #getGSSScenarioUpperLevel()
	 * @generated
	 */
	EAttribute getGSSScenarioUpperLevel_Level();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getTMformat()
	 * @see #getGSSScenarioUpperLevel()
	 * @generated
	 */
	EReference getGSSScenarioUpperLevel_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getInputFilter()
	 * @see #getGSSScenarioUpperLevel()
	 * @generated
	 */
	EReference getGSSScenarioUpperLevel_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getImport_from_prev_Level()
	 * @see #getGSSScenarioUpperLevel()
	 * @generated
	 */
	EReference getGSSScenarioUpperLevel_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData <em>GSS Scenario Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Printing Data</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData
	 * @generated
	 */
	EClass getGSSScenarioPrintingData();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData#getPrintStatus <em>Print Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Status</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData#getPrintStatus()
	 * @see #getGSSScenarioPrintingData()
	 * @generated
	 */
	EAttribute getGSSScenarioPrintingData_PrintStatus();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData#getStructuredData <em>Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Data</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData#getStructuredData()
	 * @see #getGSSScenarioPrintingData()
	 * @generated
	 */
	EReference getGSSScenarioPrintingData_StructuredData();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData <em>GSS Scenario Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Structured Data</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData
	 * @generated
	 */
	EClass getGSSScenarioStructuredData();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData#getLevelRef <em>Level Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData#getLevelRef()
	 * @see #getGSSScenarioStructuredData()
	 * @generated
	 */
	EAttribute getGSSScenarioStructuredData_LevelRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData#getFirstField <em>First Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Field</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData#getFirstField()
	 * @see #getGSSScenarioStructuredData()
	 * @generated
	 */
	EAttribute getGSSScenarioStructuredData_FirstField();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod <em>GSS Scenario Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Period</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriod
	 * @generated
	 */
	EClass getGSSScenarioPeriod();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_value <em>Min value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_value()
	 * @see #getGSSScenarioPeriod()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriod_Min_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_unit <em>Min unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min unit</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMin_unit()
	 * @see #getGSSScenarioPeriod()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriod_Min_unit();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_value <em>Max value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_value()
	 * @see #getGSSScenarioPeriod()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriod_Max_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_unit <em>Max unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max unit</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriod#getMax_unit()
	 * @see #getGSSScenarioPeriod()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriod_Max_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange <em>GSS Scenario Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Interval Range</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange
	 * @generated
	 */
	EClass getGSSScenarioIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMin()
	 * @see #getGSSScenarioIntervalRange()
	 * @generated
	 */
	EAttribute getGSSScenarioIntervalRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getMax()
	 * @see #getGSSScenarioIntervalRange()
	 * @generated
	 */
	EAttribute getGSSScenarioIntervalRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_value <em>Interval value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval value</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_value()
	 * @see #getGSSScenarioIntervalRange()
	 * @generated
	 */
	EAttribute getGSSScenarioIntervalRange_Interval_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_unit <em>Interval unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval unit</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange#getInterval_unit()
	 * @see #getGSSScenarioIntervalRange()
	 * @generated
	 */
	EAttribute getGSSScenarioIntervalRange_Interval_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs <em>GSS Scenario Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Periodic TCs</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs
	 * @generated
	 */
	EClass getGSSScenarioPeriodicTCs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs#getPeriodicTC <em>Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs#getPeriodicTC()
	 * @see #getGSSScenarioPeriodicTCs()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCs_PeriodicTC();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC <em>GSS Scenario Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC
	 * @generated
	 */
	EClass getGSSScenarioPeriodicTC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getName()
	 * @see #getGSSScenarioPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriodicTC_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getId()
	 * @see #getGSSScenarioPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriodicTC_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getIfRef()
	 * @see #getGSSScenarioPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriodicTC_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getPeriod_value()
	 * @see #getGSSScenarioPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriodicTC_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC#getPeriod_unit()
	 * @see #getGSSScenarioPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSScenarioPeriodicTC_Period_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2 <em>GSS Scenario Periodic TC Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Periodic TC Level2</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2
	 * @generated
	 */
	EClass getGSSScenarioPeriodicTCLevel2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel2()
	 * @see #getGSSScenarioPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel2_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getApp_to_level2 <em>App to level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level2</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getApp_to_level2()
	 * @see #getGSSScenarioPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel2_App_to_level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel1()
	 * @see #getGSSScenarioPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel2_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel2_to_level1 <em>Level2 to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 to level1</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel2_to_level1()
	 * @see #getGSSScenarioPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel2_Level2_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel0()
	 * @see #getGSSScenarioPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel2_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2#getLevel1_to_level0()
	 * @see #getGSSScenarioPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel2_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1 <em>GSS Scenario Periodic TC Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Periodic TC Level1</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1
	 * @generated
	 */
	EClass getGSSScenarioPeriodicTCLevel1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getLevel1()
	 * @see #getGSSScenarioPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel1_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getApp_to_level1 <em>App to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level1</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getApp_to_level1()
	 * @see #getGSSScenarioPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel1_App_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getLevel0()
	 * @see #getGSSScenarioPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel1_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1#getLevel1_to_level0()
	 * @see #getGSSScenarioPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel1_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0 <em>GSS Scenario Periodic TC Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Periodic TC Level0</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0
	 * @generated
	 */
	EClass getGSSScenarioPeriodicTCLevel0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0#getLevel0()
	 * @see #getGSSScenarioPeriodicTCLevel0()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel0_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0#getApp_to_level0 <em>App to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level0</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0#getApp_to_level0()
	 * @see #getGSSScenarioPeriodicTCLevel0()
	 * @generated
	 */
	EReference getGSSScenarioPeriodicTCLevel0_App_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars <em>GSS Scenario Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Global Vars</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars
	 * @generated
	 */
	EClass getGSSScenarioGlobalVars();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars#getGlobalVar <em>Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Var</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars#getGlobalVar()
	 * @see #getGSSScenarioGlobalVars()
	 * @generated
	 */
	EReference getGSSScenarioGlobalVars_GlobalVar();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar <em>GSS Scenario Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Global Var</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar
	 * @generated
	 */
	EClass getGSSScenarioGlobalVar();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getId()
	 * @see #getGSSScenarioGlobalVar()
	 * @generated
	 */
	EAttribute getGSSScenarioGlobalVar_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getType()
	 * @see #getGSSScenarioGlobalVar()
	 * @generated
	 */
	EAttribute getGSSScenarioGlobalVar_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getInitial_value <em>Initial value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial value</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getInitial_value()
	 * @see #getGSSScenarioGlobalVar()
	 * @generated
	 */
	EAttribute getGSSScenarioGlobalVar_Initial_value();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar#getReference()
	 * @see #getGSSScenarioGlobalVar()
	 * @generated
	 */
	EReference getGSSScenarioGlobalVar_Reference();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReference <em>GSS Scenario Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Reference</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReference
	 * @generated
	 */
	EClass getGSSScenarioReference();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReference#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReference#getLevel()
	 * @see #getGSSScenarioReference()
	 * @generated
	 */
	EAttribute getGSSScenarioReference_Level();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReference#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReference#getFieldRef()
	 * @see #getGSSScenarioReference()
	 * @generated
	 */
	EAttribute getGSSScenarioReference_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReference#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReference#getOffset()
	 * @see #getGSSScenarioReference()
	 * @generated
	 */
	EAttribute getGSSScenarioReference_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReference#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReference#getSize()
	 * @see #getGSSScenarioReference()
	 * @generated
	 */
	EAttribute getGSSScenarioReference_Size();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField <em>GSS Scenario Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Reference Field</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField
	 * @generated
	 */
	EClass getGSSScenarioReferenceField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField#getType()
	 * @see #getGSSScenarioReferenceField()
	 * @generated
	 */
	EAttribute getGSSScenarioReferenceField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField#getIfRef()
	 * @see #getGSSScenarioReferenceField()
	 * @generated
	 */
	EAttribute getGSSScenarioReferenceField_IfRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC <em>GSS Scenario Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Reference Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC
	 * @generated
	 */
	EClass getGSSScenarioReferencePeriodicTC();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC#getIdRef()
	 * @see #getGSSScenarioReferencePeriodicTC()
	 * @generated
	 */
	EReference getGSSScenarioReferencePeriodicTC_IdRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket <em>GSS Scenario Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Reference Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket
	 * @generated
	 */
	EClass getGSSScenarioReferenceSpecialPacket();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket#getIdRef()
	 * @see #getGSSScenarioReferenceSpecialPacket()
	 * @generated
	 */
	EReference getGSSScenarioReferenceSpecialPacket_IdRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors <em>GSS Scenario Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Monitors</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitors
	 * @generated
	 */
	EClass getGSSScenarioMonitors();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getChartsFile <em>Charts File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charts File</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getChartsFile()
	 * @see #getGSSScenarioMonitors()
	 * @generated
	 */
	EReference getGSSScenarioMonitors_ChartsFile();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Monitor</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitors#getMonitor()
	 * @see #getGSSScenarioMonitors()
	 * @generated
	 */
	EReference getGSSScenarioMonitors_Monitor();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor <em>GSS Scenario Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Monitor</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitor
	 * @generated
	 */
	EClass getGSSScenarioMonitor();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getName()
	 * @see #getGSSScenarioMonitor()
	 * @generated
	 */
	EAttribute getGSSScenarioMonitor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getGVRef <em>GV Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioMonitor#getGVRef()
	 * @see #getGSSScenarioMonitor()
	 * @generated
	 */
	EReference getGSSScenarioMonitor_GVRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPlot <em>GSS Scenario Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Plot</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPlot
	 * @generated
	 */
	EClass getGSSScenarioPlot();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioPlot#getChartRef <em>Chart Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chart Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioPlot#getChartRef()
	 * @see #getGSSScenarioPlot()
	 * @generated
	 */
	EReference getGSSScenarioPlot_ChartRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg <em>GSS Scenario Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Alarm Msg</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg
	 * @generated
	 */
	EClass getGSSScenarioAlarmMsg();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg#getType()
	 * @see #getGSSScenarioAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSScenarioAlarmMsg_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg#getText()
	 * @see #getGSSScenarioAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSScenarioAlarmMsg_Text();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioModify <em>GSS Scenario Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Modify</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioModify
	 * @generated
	 */
	EClass getGSSScenarioModify();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioModify#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioModify#getType()
	 * @see #getGSSScenarioModify()
	 * @generated
	 */
	EAttribute getGSSScenarioModify_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioModify#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioModify#getValue()
	 * @see #getGSSScenarioModify()
	 * @generated
	 */
	EAttribute getGSSScenarioModify_Value();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal <em>GSS Scenario Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario Alarm Val</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal
	 * @generated
	 */
	EClass getGSSScenarioAlarmVal();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal#getType()
	 * @see #getGSSScenarioAlarmVal()
	 * @generated
	 */
	EAttribute getGSSScenarioAlarmVal_Type();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVRef <em>GSS Scenario GV Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario GV Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVRef
	 * @generated
	 */
	EClass getGSSScenarioGVRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVRef#getGlobalVarRef <em>Global Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVRef#getGlobalVarRef()
	 * @see #getGSSScenarioGVRef()
	 * @generated
	 */
	EReference getGSSScenarioGVRef_GlobalVarRef();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered <em>GSS Scenario GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered
	 * @generated
	 */
	EClass getGSSScenarioGVFiltered();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered#getFilter()
	 * @see #getGSSScenarioGVFiltered()
	 * @generated
	 */
	EReference getGSSScenarioGVFiltered_Filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic <em>GSS Scenario GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Scenario GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic
	 * @generated
	 */
	EClass getGSSScenarioGVPeriodic();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_value()
	 * @see #getGSSScenarioGVPeriodic()
	 * @generated
	 */
	EAttribute getGSSScenarioGVPeriodic_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic#getPeriod_unit()
	 * @see #getGSSScenarioGVPeriodic()
	 * @generated
	 */
	EAttribute getGSSScenarioGVPeriodic_Period_unit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable <em>GSS Scenario Enable Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Enable Disable</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
	 * @generated
	 */
	EEnum getGSSScenarioEnableDisable();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType <em>GSS Scenario Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Interface Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType
	 * @generated
	 */
	EEnum getGSSScenarioInterfaceType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType <em>GSS Scenario Interface IO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Interface IO Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType
	 * @generated
	 */
	EEnum getGSSScenarioInterfaceIOType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel <em>GSS Scenario Upper Level Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Upper Level Level</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel
	 * @generated
	 */
	EEnum getGSSScenarioUpperLevelLevel();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUnit <em>GSS Scenario Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Unit</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
	 * @generated
	 */
	EEnum getGSSScenarioUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType <em>GSS Scenario Global Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Global Var Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType
	 * @generated
	 */
	EEnum getGSSScenarioGlobalVarType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceFieldType <em>GSS Scenario Reference Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Reference Field Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceFieldType
	 * @generated
	 */
	EEnum getGSSScenarioReferenceFieldType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsgType <em>GSS Scenario Alarm Msg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Alarm Msg Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsgType
	 * @generated
	 */
	EEnum getGSSScenarioAlarmMsgType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioModifyType <em>GSS Scenario Modify Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Modify Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioModifyType
	 * @generated
	 */
	EEnum getGSSScenarioModifyType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmValType <em>GSS Scenario Alarm Val Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Scenario Alarm Val Type</em>'.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmValType
	 * @generated
	 */
	EEnum getGSSScenarioAlarmValType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	scenarioFactory getscenarioFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl <em>GSS Scenario Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioScenarioImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioScenario()
		 * @generated
		 */
		EClass GSS_SCENARIO_SCENARIO = eINSTANCE.getGSSScenarioScenario();

		/**
		 * The meta object literal for the '<em><b>Gss options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SCENARIO__GSS_OPTIONS = eINSTANCE.getGSSScenarioScenario_Gss_options();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SCENARIO__PROTOCOLS = eINSTANCE.getGSSScenarioScenario_Protocols();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SCENARIO__INTERFACES = eINSTANCE.getGSSScenarioScenario_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Special Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS = eINSTANCE.getGSSScenarioScenario_SpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Periodic TCs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SCENARIO__PERIODIC_TCS = eINSTANCE.getGSSScenarioScenario_PeriodicTCs();

		/**
		 * The meta object literal for the '<em><b>Global Vars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SCENARIO__GLOBAL_VARS = eINSTANCE.getGSSScenarioScenario_GlobalVars();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SCENARIO__MONITORS = eINSTANCE.getGSSScenarioScenario_Monitors();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioOptionsImpl <em>GSS Scenario Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioOptionsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioOptions()
		 * @generated
		 */
		EClass GSS_SCENARIO_OPTIONS = eINSTANCE.getGSSScenarioOptions();

		/**
		 * The meta object literal for the '<em><b>Gss info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_OPTIONS__GSS_INFO = eINSTANCE.getGSSScenarioOptions_Gss_info();

		/**
		 * The meta object literal for the '<em><b>Gss info print</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_OPTIONS__GSS_INFO_PRINT = eINSTANCE.getGSSScenarioOptions_Gss_info_print();

		/**
		 * The meta object literal for the '<em><b>Phy header print</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_OPTIONS__PHY_HEADER_PRINT = eINSTANCE.getGSSScenarioOptions_Phy_header_print();

		/**
		 * The meta object literal for the '<em><b>Discard Error Flags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_OPTIONS__DISCARD_ERROR_FLAGS = eINSTANCE.getGSSScenarioOptions_DiscardErrorFlags();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoImpl <em>GSS Scenario Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInfo()
		 * @generated
		 */
		EClass GSS_SCENARIO_INFO = eINSTANCE.getGSSScenarioInfo();

		/**
		 * The meta object literal for the '<em><b>Test campaign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INFO__TEST_CAMPAIGN = eINSTANCE.getGSSScenarioInfo_Test_campaign();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INFO__VERSION = eINSTANCE.getGSSScenarioInfo_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INFO__DATE = eINSTANCE.getGSSScenarioInfo_Date();

		/**
		 * The meta object literal for the '<em><b>Version control url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INFO__VERSION_CONTROL_URL = eINSTANCE.getGSSScenarioInfo_Version_control_url();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoPrintImpl <em>GSS Scenario Info Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInfoPrintImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInfoPrint()
		 * @generated
		 */
		EClass GSS_SCENARIO_INFO_PRINT = eINSTANCE.getGSSScenarioInfoPrint();

		/**
		 * The meta object literal for the '<em><b>Main Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INFO_PRINT__MAIN_LOG = eINSTANCE.getGSSScenarioInfoPrint_MainLog();

		/**
		 * The meta object literal for the '<em><b>Port Logs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INFO_PRINT__PORT_LOGS = eINSTANCE.getGSSScenarioInfoPrint_PortLogs();

		/**
		 * The meta object literal for the '<em><b>Raw Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INFO_PRINT__RAW_LOG = eINSTANCE.getGSSScenarioInfoPrint_RawLog();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl <em>GSS Scenario Phy Header Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPhyHeaderPrintImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPhyHeaderPrint()
		 * @generated
		 */
		EClass GSS_SCENARIO_PHY_HEADER_PRINT = eINSTANCE.getGSSScenarioPhyHeaderPrint();

		/**
		 * The meta object literal for the '<em><b>Main Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG = eINSTANCE.getGSSScenarioPhyHeaderPrint_MainLog();

		/**
		 * The meta object literal for the '<em><b>Port Logs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS = eINSTANCE.getGSSScenarioPhyHeaderPrint_PortLogs();

		/**
		 * The meta object literal for the '<em><b>Raw Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG = eINSTANCE.getGSSScenarioPhyHeaderPrint_RawLog();

		/**
		 * The meta object literal for the '<em><b>Gss Tabs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS = eINSTANCE.getGSSScenarioPhyHeaderPrint_GssTabs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl <em>GSS Scenario Discard Error Flags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioDiscardErrorFlagsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioDiscardErrorFlags()
		 * @generated
		 */
		EClass GSS_SCENARIO_DISCARD_ERROR_FLAGS = eINSTANCE.getGSSScenarioDiscardErrorFlags();

		/**
		 * The meta object literal for the '<em><b>Tx Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS = eINSTANCE.getGSSScenarioDiscardErrorFlags_TxErrors();

		/**
		 * The meta object literal for the '<em><b>Not Expected Packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS = eINSTANCE.getGSSScenarioDiscardErrorFlags_NotExpectedPackets();

		/**
		 * The meta object literal for the '<em><b>Filters Ko</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO = eINSTANCE.getGSSScenarioDiscardErrorFlags_FiltersKo();

		/**
		 * The meta object literal for the '<em><b>Valid Times Ko</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO = eINSTANCE.getGSSScenarioDiscardErrorFlags_ValidTimesKo();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolsImpl <em>GSS Scenario Protocols</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioProtocols()
		 * @generated
		 */
		EClass GSS_SCENARIO_PROTOCOLS = eINSTANCE.getGSSScenarioProtocols();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PROTOCOLS__PROTOCOL = eINSTANCE.getGSSScenarioProtocols_Protocol();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolImpl <em>GSS Scenario Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioProtocol()
		 * @generated
		 */
		EClass GSS_SCENARIO_PROTOCOL = eINSTANCE.getGSSScenarioProtocol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PROTOCOL__ID = eINSTANCE.getGSSScenarioProtocol_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PROTOCOL__NAME = eINSTANCE.getGSSScenarioProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Type Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PROTOCOL__TYPE_LEVEL = eINSTANCE.getGSSScenarioProtocol_TypeLevel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PROTOCOL__TYPE = eINSTANCE.getGSSScenarioProtocol_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PROTOCOL__SUBTYPE = eINSTANCE.getGSSScenarioProtocol_Subtype();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolTypeImpl <em>GSS Scenario Protocol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioProtocolTypeImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioProtocolType()
		 * @generated
		 */
		EClass GSS_SCENARIO_PROTOCOL_TYPE = eINSTANCE.getGSSScenarioProtocolType();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PROTOCOL_TYPE__OFFSET = eINSTANCE.getGSSScenarioProtocolType_Offset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PROTOCOL_TYPE__NAME = eINSTANCE.getGSSScenarioProtocolType_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfacesImpl <em>GSS Scenario Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfacesImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterfaces()
		 * @generated
		 */
		EClass GSS_SCENARIO_INTERFACES = eINSTANCE.getGSSScenarioInterfaces();

		/**
		 * The meta object literal for the '<em><b>Protocol Packets File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE = eINSTANCE.getGSSScenarioInterfaces_ProtocolPacketsFile();

		/**
		 * The meta object literal for the '<em><b>Main Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACES__MAIN_INTERFACE = eINSTANCE.getGSSScenarioInterfaces_MainInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACES__INTERFACE = eINSTANCE.getGSSScenarioInterfaces_Interface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMainInterfaceImpl <em>GSS Scenario Main Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioMainInterfaceImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioMainInterface()
		 * @generated
		 */
		EClass GSS_SCENARIO_MAIN_INTERFACE = eINSTANCE.getGSSScenarioMainInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl <em>GSS Scenario Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioInterfaceImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterface()
		 * @generated
		 */
		EClass GSS_SCENARIO_INTERFACE = eINSTANCE.getGSSScenarioInterface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INTERFACE__ID = eINSTANCE.getGSSScenarioInterface_Id();

		/**
		 * The meta object literal for the '<em><b>If Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INTERFACE__IF_TYPE = eINSTANCE.getGSSScenarioInterface_IfType();

		/**
		 * The meta object literal for the '<em><b>If Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACE__IF_CONFIG = eINSTANCE.getGSSScenarioInterface_IfConfig();

		/**
		 * The meta object literal for the '<em><b>Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INTERFACE__IO_TYPE = eINSTANCE.getGSSScenarioInterface_IoType();

		/**
		 * The meta object literal for the '<em><b>Protocol ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACE__PROTOCOL_ID = eINSTANCE.getGSSScenarioInterface_ProtocolID();

		/**
		 * The meta object literal for the '<em><b>Level In Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT = eINSTANCE.getGSSScenarioInterface_LevelInOut();

		/**
		 * The meta object literal for the '<em><b>Level In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACE__LEVEL_IN = eINSTANCE.getGSSScenarioInterface_LevelIn();

		/**
		 * The meta object literal for the '<em><b>Level Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_INTERFACE__LEVEL_OUT = eINSTANCE.getGSSScenarioInterface_LevelOut();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl <em>GSS Scenario Level In Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInOutImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioLevelInOut()
		 * @generated
		 */
		EClass GSS_SCENARIO_LEVEL_IN_OUT = eINSTANCE.getGSSScenarioLevelInOut();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_LEVEL_IN_OUT__ID = eINSTANCE.getGSSScenarioLevelInOut_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_LEVEL_IN_OUT__NAME = eINSTANCE.getGSSScenarioLevelInOut_Name();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT = eINSTANCE.getGSSScenarioLevelInOut_TMformat();

		/**
		 * The meta object literal for the '<em><b>TCformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT = eINSTANCE.getGSSScenarioLevelInOut_TCformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER = eINSTANCE.getGSSScenarioLevelInOut_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Export to prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL = eINSTANCE.getGSSScenarioLevelInOut_Export_to_prev_Level();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSScenarioLevelInOut_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInImpl <em>GSS Scenario Level In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelInImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioLevelIn()
		 * @generated
		 */
		EClass GSS_SCENARIO_LEVEL_IN = eINSTANCE.getGSSScenarioLevelIn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_LEVEL_IN__ID = eINSTANCE.getGSSScenarioLevelIn_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_LEVEL_IN__NAME = eINSTANCE.getGSSScenarioLevelIn_Name();

		/**
		 * The meta object literal for the '<em><b>TCformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_IN__TCFORMAT = eINSTANCE.getGSSScenarioLevelIn_TCformat();

		/**
		 * The meta object literal for the '<em><b>Export to prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_IN__EXPORT_TO_PREV_LEVEL = eINSTANCE.getGSSScenarioLevelIn_Export_to_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelOutImpl <em>GSS Scenario Level Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioLevelOutImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioLevelOut()
		 * @generated
		 */
		EClass GSS_SCENARIO_LEVEL_OUT = eINSTANCE.getGSSScenarioLevelOut();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_LEVEL_OUT__ID = eINSTANCE.getGSSScenarioLevelOut_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_LEVEL_OUT__NAME = eINSTANCE.getGSSScenarioLevelOut_Name();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_OUT__TMFORMAT = eINSTANCE.getGSSScenarioLevelOut_TMformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_OUT__INPUT_FILTER = eINSTANCE.getGSSScenarioLevelOut_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSScenarioLevelOut_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketsImpl <em>GSS Scenario Special Packets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioSpecialPackets()
		 * @generated
		 */
		EClass GSS_SCENARIO_SPECIAL_PACKETS = eINSTANCE.getGSSScenarioSpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Special Packet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SPECIAL_PACKETS__SPECIAL_PACKET = eINSTANCE.getGSSScenarioSpecialPackets_SpecialPacket();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl <em>GSS Scenario Special Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioSpecialPacketImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioSpecialPacket()
		 * @generated
		 */
		EClass GSS_SCENARIO_SPECIAL_PACKET = eINSTANCE.getGSSScenarioSpecialPacket();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_SPECIAL_PACKET__STATUS = eINSTANCE.getGSSScenarioSpecialPacket_Status();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_SPECIAL_PACKET__ID = eINSTANCE.getGSSScenarioSpecialPacket_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_SPECIAL_PACKET__IF_REF = eINSTANCE.getGSSScenarioSpecialPacket_IfRef();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_SPECIAL_PACKET__LEVELS = eINSTANCE.getGSSScenarioSpecialPacket_Levels();

		/**
		 * The meta object literal for the '<em><b>Level Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF = eINSTANCE.getGSSScenarioSpecialPacket_LevelRef();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER = eINSTANCE.getGSSScenarioSpecialPacket_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Upper Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS = eINSTANCE.getGSSScenarioSpecialPacket_UpperLevels();

		/**
		 * The meta object literal for the '<em><b>Printing Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA = eINSTANCE.getGSSScenarioSpecialPacket_PrintingData();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SPECIAL_PACKET__PERIOD = eINSTANCE.getGSSScenarioSpecialPacket_Period();

		/**
		 * The meta object literal for the '<em><b>Interval Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE = eINSTANCE.getGSSScenarioSpecialPacket_IntervalRange();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelsImpl <em>GSS Scenario Upper Levels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUpperLevels()
		 * @generated
		 */
		EClass GSS_SCENARIO_UPPER_LEVELS = eINSTANCE.getGSSScenarioUpperLevels();

		/**
		 * The meta object literal for the '<em><b>Upper Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_UPPER_LEVELS__UPPER_LEVEL = eINSTANCE.getGSSScenarioUpperLevels_UpperLevel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl <em>GSS Scenario Upper Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioUpperLevelImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUpperLevel()
		 * @generated
		 */
		EClass GSS_SCENARIO_UPPER_LEVEL = eINSTANCE.getGSSScenarioUpperLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_UPPER_LEVEL__LEVEL = eINSTANCE.getGSSScenarioUpperLevel_Level();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_UPPER_LEVEL__TMFORMAT = eINSTANCE.getGSSScenarioUpperLevel_TMformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER = eINSTANCE.getGSSScenarioUpperLevel_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSScenarioUpperLevel_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPrintingDataImpl <em>GSS Scenario Printing Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPrintingDataImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPrintingData()
		 * @generated
		 */
		EClass GSS_SCENARIO_PRINTING_DATA = eINSTANCE.getGSSScenarioPrintingData();

		/**
		 * The meta object literal for the '<em><b>Print Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PRINTING_DATA__PRINT_STATUS = eINSTANCE.getGSSScenarioPrintingData_PrintStatus();

		/**
		 * The meta object literal for the '<em><b>Structured Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PRINTING_DATA__STRUCTURED_DATA = eINSTANCE.getGSSScenarioPrintingData_StructuredData();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioStructuredDataImpl <em>GSS Scenario Structured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioStructuredDataImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioStructuredData()
		 * @generated
		 */
		EClass GSS_SCENARIO_STRUCTURED_DATA = eINSTANCE.getGSSScenarioStructuredData();

		/**
		 * The meta object literal for the '<em><b>Level Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF = eINSTANCE.getGSSScenarioStructuredData_LevelRef();

		/**
		 * The meta object literal for the '<em><b>First Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD = eINSTANCE.getGSSScenarioStructuredData_FirstField();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl <em>GSS Scenario Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriod()
		 * @generated
		 */
		EClass GSS_SCENARIO_PERIOD = eINSTANCE.getGSSScenarioPeriod();

		/**
		 * The meta object literal for the '<em><b>Min value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIOD__MIN_VALUE = eINSTANCE.getGSSScenarioPeriod_Min_value();

		/**
		 * The meta object literal for the '<em><b>Min unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIOD__MIN_UNIT = eINSTANCE.getGSSScenarioPeriod_Min_unit();

		/**
		 * The meta object literal for the '<em><b>Max value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIOD__MAX_VALUE = eINSTANCE.getGSSScenarioPeriod_Max_value();

		/**
		 * The meta object literal for the '<em><b>Max unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIOD__MAX_UNIT = eINSTANCE.getGSSScenarioPeriod_Max_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioIntervalRangeImpl <em>GSS Scenario Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioIntervalRangeImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioIntervalRange()
		 * @generated
		 */
		EClass GSS_SCENARIO_INTERVAL_RANGE = eINSTANCE.getGSSScenarioIntervalRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INTERVAL_RANGE__MIN = eINSTANCE.getGSSScenarioIntervalRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INTERVAL_RANGE__MAX = eINSTANCE.getGSSScenarioIntervalRange_Max();

		/**
		 * The meta object literal for the '<em><b>Interval value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_VALUE = eINSTANCE.getGSSScenarioIntervalRange_Interval_value();

		/**
		 * The meta object literal for the '<em><b>Interval unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_UNIT = eINSTANCE.getGSSScenarioIntervalRange_Interval_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCsImpl <em>GSS Scenario Periodic TCs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCs()
		 * @generated
		 */
		EClass GSS_SCENARIO_PERIODIC_TCS = eINSTANCE.getGSSScenarioPeriodicTCs();

		/**
		 * The meta object literal for the '<em><b>Periodic TC</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC = eINSTANCE.getGSSScenarioPeriodicTCs_PeriodicTC();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl <em>GSS Scenario Periodic TC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTC()
		 * @generated
		 */
		EClass GSS_SCENARIO_PERIODIC_TC = eINSTANCE.getGSSScenarioPeriodicTC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIODIC_TC__NAME = eINSTANCE.getGSSScenarioPeriodicTC_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIODIC_TC__ID = eINSTANCE.getGSSScenarioPeriodicTC_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIODIC_TC__IF_REF = eINSTANCE.getGSSScenarioPeriodicTC_IfRef();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE = eINSTANCE.getGSSScenarioPeriodicTC_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT = eINSTANCE.getGSSScenarioPeriodicTC_Period_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl <em>GSS Scenario Periodic TC Level2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel2Impl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCLevel2()
		 * @generated
		 */
		EClass GSS_SCENARIO_PERIODIC_TC_LEVEL2 = eINSTANCE.getGSSScenarioPeriodicTCLevel2();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2 = eINSTANCE.getGSSScenarioPeriodicTCLevel2_Level2();

		/**
		 * The meta object literal for the '<em><b>App to level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2 = eINSTANCE.getGSSScenarioPeriodicTCLevel2_App_to_level2();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1 = eINSTANCE.getGSSScenarioPeriodicTCLevel2_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1 = eINSTANCE.getGSSScenarioPeriodicTCLevel2_Level2_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0 = eINSTANCE.getGSSScenarioPeriodicTCLevel2_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSScenarioPeriodicTCLevel2_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel1Impl <em>GSS Scenario Periodic TC Level1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel1Impl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCLevel1()
		 * @generated
		 */
		EClass GSS_SCENARIO_PERIODIC_TC_LEVEL1 = eINSTANCE.getGSSScenarioPeriodicTCLevel1();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL1 = eINSTANCE.getGSSScenarioPeriodicTCLevel1_Level1();

		/**
		 * The meta object literal for the '<em><b>App to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1 = eINSTANCE.getGSSScenarioPeriodicTCLevel1_App_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL0 = eINSTANCE.getGSSScenarioPeriodicTCLevel1_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSScenarioPeriodicTCLevel1_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel0Impl <em>GSS Scenario Periodic TC Level0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPeriodicTCLevel0Impl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPeriodicTCLevel0()
		 * @generated
		 */
		EClass GSS_SCENARIO_PERIODIC_TC_LEVEL0 = eINSTANCE.getGSSScenarioPeriodicTCLevel0();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL0__LEVEL0 = eINSTANCE.getGSSScenarioPeriodicTCLevel0_Level0();

		/**
		 * The meta object literal for the '<em><b>App to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0 = eINSTANCE.getGSSScenarioPeriodicTCLevel0_App_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarsImpl <em>GSS Scenario Global Vars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGlobalVars()
		 * @generated
		 */
		EClass GSS_SCENARIO_GLOBAL_VARS = eINSTANCE.getGSSScenarioGlobalVars();

		/**
		 * The meta object literal for the '<em><b>Global Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_GLOBAL_VARS__GLOBAL_VAR = eINSTANCE.getGSSScenarioGlobalVars_GlobalVar();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarImpl <em>GSS Scenario Global Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGlobalVarImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGlobalVar()
		 * @generated
		 */
		EClass GSS_SCENARIO_GLOBAL_VAR = eINSTANCE.getGSSScenarioGlobalVar();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_GLOBAL_VAR__ID = eINSTANCE.getGSSScenarioGlobalVar_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_GLOBAL_VAR__TYPE = eINSTANCE.getGSSScenarioGlobalVar_Type();

		/**
		 * The meta object literal for the '<em><b>Initial value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_GLOBAL_VAR__INITIAL_VALUE = eINSTANCE.getGSSScenarioGlobalVar_Initial_value();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_GLOBAL_VAR__REFERENCE = eINSTANCE.getGSSScenarioGlobalVar_Reference();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceImpl <em>GSS Scenario Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReference()
		 * @generated
		 */
		EClass GSS_SCENARIO_REFERENCE = eINSTANCE.getGSSScenarioReference();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_REFERENCE__LEVEL = eINSTANCE.getGSSScenarioReference_Level();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_REFERENCE__FIELD_REF = eINSTANCE.getGSSScenarioReference_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_REFERENCE__OFFSET = eINSTANCE.getGSSScenarioReference_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_REFERENCE__SIZE = eINSTANCE.getGSSScenarioReference_Size();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceFieldImpl <em>GSS Scenario Reference Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceFieldImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferenceField()
		 * @generated
		 */
		EClass GSS_SCENARIO_REFERENCE_FIELD = eINSTANCE.getGSSScenarioReferenceField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_REFERENCE_FIELD__TYPE = eINSTANCE.getGSSScenarioReferenceField_Type();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_REFERENCE_FIELD__IF_REF = eINSTANCE.getGSSScenarioReferenceField_IfRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferencePeriodicTCImpl <em>GSS Scenario Reference Periodic TC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferencePeriodicTCImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferencePeriodicTC()
		 * @generated
		 */
		EClass GSS_SCENARIO_REFERENCE_PERIODIC_TC = eINSTANCE.getGSSScenarioReferencePeriodicTC();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_REFERENCE_PERIODIC_TC__ID_REF = eINSTANCE.getGSSScenarioReferencePeriodicTC_IdRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceSpecialPacketImpl <em>GSS Scenario Reference Special Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioReferenceSpecialPacketImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferenceSpecialPacket()
		 * @generated
		 */
		EClass GSS_SCENARIO_REFERENCE_SPECIAL_PACKET = eINSTANCE.getGSSScenarioReferenceSpecialPacket();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__ID_REF = eINSTANCE.getGSSScenarioReferenceSpecialPacket_IdRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl <em>GSS Scenario Monitors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorsImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioMonitors()
		 * @generated
		 */
		EClass GSS_SCENARIO_MONITORS = eINSTANCE.getGSSScenarioMonitors();

		/**
		 * The meta object literal for the '<em><b>Charts File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_MONITORS__CHARTS_FILE = eINSTANCE.getGSSScenarioMonitors_ChartsFile();

		/**
		 * The meta object literal for the '<em><b>Monitor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_MONITORS__MONITOR = eINSTANCE.getGSSScenarioMonitors_Monitor();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorImpl <em>GSS Scenario Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioMonitorImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioMonitor()
		 * @generated
		 */
		EClass GSS_SCENARIO_MONITOR = eINSTANCE.getGSSScenarioMonitor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_MONITOR__NAME = eINSTANCE.getGSSScenarioMonitor_Name();

		/**
		 * The meta object literal for the '<em><b>GV Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_MONITOR__GV_REF = eINSTANCE.getGSSScenarioMonitor_GVRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioPlotImpl <em>GSS Scenario Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioPlotImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioPlot()
		 * @generated
		 */
		EClass GSS_SCENARIO_PLOT = eINSTANCE.getGSSScenarioPlot();

		/**
		 * The meta object literal for the '<em><b>Chart Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_PLOT__CHART_REF = eINSTANCE.getGSSScenarioPlot_ChartRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmMsgImpl <em>GSS Scenario Alarm Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmMsgImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmMsg()
		 * @generated
		 */
		EClass GSS_SCENARIO_ALARM_MSG = eINSTANCE.getGSSScenarioAlarmMsg();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_ALARM_MSG__TYPE = eINSTANCE.getGSSScenarioAlarmMsg_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_ALARM_MSG__TEXT = eINSTANCE.getGSSScenarioAlarmMsg_Text();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioModifyImpl <em>GSS Scenario Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioModifyImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioModify()
		 * @generated
		 */
		EClass GSS_SCENARIO_MODIFY = eINSTANCE.getGSSScenarioModify();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_MODIFY__TYPE = eINSTANCE.getGSSScenarioModify_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_MODIFY__VALUE = eINSTANCE.getGSSScenarioModify_Value();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmValImpl <em>GSS Scenario Alarm Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioAlarmValImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmVal()
		 * @generated
		 */
		EClass GSS_SCENARIO_ALARM_VAL = eINSTANCE.getGSSScenarioAlarmVal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_ALARM_VAL__TYPE = eINSTANCE.getGSSScenarioAlarmVal_Type();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVRefImpl <em>GSS Scenario GV Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVRefImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGVRef()
		 * @generated
		 */
		EClass GSS_SCENARIO_GV_REF = eINSTANCE.getGSSScenarioGVRef();

		/**
		 * The meta object literal for the '<em><b>Global Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF = eINSTANCE.getGSSScenarioGVRef_GlobalVarRef();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVFilteredImpl <em>GSS Scenario GV Filtered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVFilteredImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGVFiltered()
		 * @generated
		 */
		EClass GSS_SCENARIO_GV_FILTERED = eINSTANCE.getGSSScenarioGVFiltered();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_SCENARIO_GV_FILTERED__FILTER = eINSTANCE.getGSSScenarioGVFiltered_Filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVPeriodicImpl <em>GSS Scenario GV Periodic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.impl.GSSScenarioGVPeriodicImpl
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGVPeriodic()
		 * @generated
		 */
		EClass GSS_SCENARIO_GV_PERIODIC = eINSTANCE.getGSSScenarioGVPeriodic();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE = eINSTANCE.getGSSScenarioGVPeriodic_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT = eINSTANCE.getGSSScenarioGVPeriodic_Period_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable <em>GSS Scenario Enable Disable</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioEnableDisable()
		 * @generated
		 */
		EEnum GSS_SCENARIO_ENABLE_DISABLE = eINSTANCE.getGSSScenarioEnableDisable();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType <em>GSS Scenario Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterfaceType()
		 * @generated
		 */
		EEnum GSS_SCENARIO_INTERFACE_TYPE = eINSTANCE.getGSSScenarioInterfaceType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType <em>GSS Scenario Interface IO Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioInterfaceIOType()
		 * @generated
		 */
		EEnum GSS_SCENARIO_INTERFACE_IO_TYPE = eINSTANCE.getGSSScenarioInterfaceIOType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel <em>GSS Scenario Upper Level Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUpperLevelLevel()
		 * @generated
		 */
		EEnum GSS_SCENARIO_UPPER_LEVEL_LEVEL = eINSTANCE.getGSSScenarioUpperLevelLevel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUnit <em>GSS Scenario Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUnit
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioUnit()
		 * @generated
		 */
		EEnum GSS_SCENARIO_UNIT = eINSTANCE.getGSSScenarioUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType <em>GSS Scenario Global Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioGlobalVarType()
		 * @generated
		 */
		EEnum GSS_SCENARIO_GLOBAL_VAR_TYPE = eINSTANCE.getGSSScenarioGlobalVarType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioReferenceFieldType <em>GSS Scenario Reference Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioReferenceFieldType
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioReferenceFieldType()
		 * @generated
		 */
		EEnum GSS_SCENARIO_REFERENCE_FIELD_TYPE = eINSTANCE.getGSSScenarioReferenceFieldType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsgType <em>GSS Scenario Alarm Msg Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsgType
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmMsgType()
		 * @generated
		 */
		EEnum GSS_SCENARIO_ALARM_MSG_TYPE = eINSTANCE.getGSSScenarioAlarmMsgType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioModifyType <em>GSS Scenario Modify Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioModifyType
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioModifyType()
		 * @generated
		 */
		EEnum GSS_SCENARIO_MODIFY_TYPE = eINSTANCE.getGSSScenarioModifyType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioAlarmValType <em>GSS Scenario Alarm Val Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.scenario.GSSScenarioAlarmValType
		 * @see es.uah.aut.srg.gss.scenario.impl.scenarioPackageImpl#getGSSScenarioAlarmValType()
		 * @generated
		 */
		EEnum GSS_SCENARIO_ALARM_VAL_TYPE = eINSTANCE.getGSSScenarioAlarmValType();

	}

} //scenarioPackage
