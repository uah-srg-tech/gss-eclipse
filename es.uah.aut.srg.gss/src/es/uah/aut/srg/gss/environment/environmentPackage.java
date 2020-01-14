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
package es.uah.aut.srg.gss.environment;

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
 * @see es.uah.aut.srg.gss.environment.environmentFactory
 * @model kind="package"
 * @generated
 */
public interface environmentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "environment";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://srg.aut.uah.es/gss/environment";

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
	environmentPackage eINSTANCE = es.uah.aut.srg.gss.environment.impl.environmentPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentEnvironmentImpl <em>GSS Environment Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentEnvironmentImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentEnvironment()
	 * @generated
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT__NAME = commonPackage.GSS_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT__URI = commonPackage.GSS_MODEL_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT__VERSION = commonPackage.GSS_MODEL_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT__DESCRIPTION = commonPackage.GSS_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT__SCENARIO = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>GSS Environment Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT_FEATURE_COUNT = commonPackage.GSS_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>GSS Environment Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ENVIRONMENT_OPERATION_COUNT = commonPackage.GSS_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl <em>GSS Environment Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentScenario()
	 * @generated
	 */
	int GSS_ENVIRONMENT_SCENARIO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Gss options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS = 1;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__PROTOCOLS = 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__INTERFACES = 3;

	/**
	 * The feature id for the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS = 4;

	/**
	 * The feature id for the '<em><b>Periodic TCs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS = 5;

	/**
	 * The feature id for the '<em><b>Global Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS = 6;

	/**
	 * The feature id for the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO__MONITORS = 7;

	/**
	 * The number of structural features of the '<em>GSS Environment Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>GSS Environment Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentOptionsImpl <em>GSS Environment Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentOptionsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentOptions()
	 * @generated
	 */
	int GSS_ENVIRONMENT_OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Gss info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_OPTIONS__GSS_INFO = 0;

	/**
	 * The feature id for the '<em><b>Gss info print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_OPTIONS__GSS_INFO_PRINT = 1;

	/**
	 * The feature id for the '<em><b>Phy header print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_OPTIONS__PHY_HEADER_PRINT = 2;

	/**
	 * The feature id for the '<em><b>Discard Error Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_OPTIONS__DISCARD_ERROR_FLAGS = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_OPTIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_OPTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoImpl <em>GSS Environment Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInfo()
	 * @generated
	 */
	int GSS_ENVIRONMENT_INFO = 3;

	/**
	 * The feature id for the '<em><b>Test campaign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO__TEST_CAMPAIGN = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO__DATE = 2;

	/**
	 * The feature id for the '<em><b>Version control url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO__VERSION_CONTROL_URL = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoPrintImpl <em>GSS Environment Info Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoPrintImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInfoPrint()
	 * @generated
	 */
	int GSS_ENVIRONMENT_INFO_PRINT = 4;

	/**
	 * The feature id for the '<em><b>Main Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO_PRINT__MAIN_LOG = 0;

	/**
	 * The feature id for the '<em><b>Port Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO_PRINT__PORT_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Raw Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO_PRINT__RAW_LOG = 2;

	/**
	 * The number of structural features of the '<em>GSS Environment Info Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO_PRINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Environment Info Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INFO_PRINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl <em>GSS Environment Phy Header Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPhyHeaderPrint()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PHY_HEADER_PRINT = 5;

	/**
	 * The feature id for the '<em><b>Main Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG = 0;

	/**
	 * The feature id for the '<em><b>Port Logs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS = 1;

	/**
	 * The feature id for the '<em><b>Raw Log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG = 2;

	/**
	 * The feature id for the '<em><b>Gss Tabs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Phy Header Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PHY_HEADER_PRINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Phy Header Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PHY_HEADER_PRINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl <em>GSS Environment Discard Error Flags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentDiscardErrorFlags()
	 * @generated
	 */
	int GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS = 6;

	/**
	 * The feature id for the '<em><b>Tx Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS = 0;

	/**
	 * The feature id for the '<em><b>Not Expected Packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS = 1;

	/**
	 * The feature id for the '<em><b>Filters Ko</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO = 2;

	/**
	 * The feature id for the '<em><b>Valid Times Ko</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Discard Error Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Discard Error Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolsImpl <em>GSS Environment Protocols</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentProtocols()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PROTOCOLS = 7;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL = 0;

	/**
	 * The number of structural features of the '<em>GSS Environment Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOLS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Environment Protocols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl <em>GSS Environment Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentProtocol()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PROTOCOL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL__SUBTYPE = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolTypeImpl <em>GSS Environment Protocol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolTypeImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentProtocolType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PROTOCOL_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL_TYPE__OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>GSS Environment Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Environment Protocol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PROTOCOL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfacesImpl <em>GSS Environment Interfaces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfacesImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterfaces()
	 * @generated
	 */
	int GSS_ENVIRONMENT_INTERFACES = 10;

	/**
	 * The feature id for the '<em><b>Protocol Packets File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACES__PROTOCOL_PACKETS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Main Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACES__MAIN_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACES__INTERFACE = 2;

	/**
	 * The number of structural features of the '<em>GSS Environment Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Environment Interfaces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl <em>GSS Environment Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterface()
	 * @generated
	 */
	int GSS_ENVIRONMENT_INTERFACE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>If Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__IF_TYPE = 2;

	/**
	 * The feature id for the '<em><b>If Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__IF_CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__IO_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID = 5;

	/**
	 * The feature id for the '<em><b>Level In Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT = 6;

	/**
	 * The feature id for the '<em><b>Level In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__LEVEL_IN = 7;

	/**
	 * The feature id for the '<em><b>Level Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT = 8;

	/**
	 * The number of structural features of the '<em>GSS Environment Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>GSS Environment Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMainInterfaceImpl <em>GSS Environment Main Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMainInterfaceImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentMainInterface()
	 * @generated
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__ID = GSS_ENVIRONMENT_INTERFACE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__NAME = GSS_ENVIRONMENT_INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>If Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__IF_TYPE = GSS_ENVIRONMENT_INTERFACE__IF_TYPE;

	/**
	 * The feature id for the '<em><b>If Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__IF_CONFIG = GSS_ENVIRONMENT_INTERFACE__IF_CONFIG;

	/**
	 * The feature id for the '<em><b>Io Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__IO_TYPE = GSS_ENVIRONMENT_INTERFACE__IO_TYPE;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__PROTOCOL_ID = GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID;

	/**
	 * The feature id for the '<em><b>Level In Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__LEVEL_IN_OUT = GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT;

	/**
	 * The feature id for the '<em><b>Level In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__LEVEL_IN = GSS_ENVIRONMENT_INTERFACE__LEVEL_IN;

	/**
	 * The feature id for the '<em><b>Level Out</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE__LEVEL_OUT = GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT;

	/**
	 * The number of structural features of the '<em>GSS Environment Main Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE_FEATURE_COUNT = GSS_ENVIRONMENT_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>GSS Environment Main Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MAIN_INTERFACE_OPERATION_COUNT = GSS_ENVIRONMENT_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInOutImpl <em>GSS Environment Level In Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInOutImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT__TMFORMAT = 2;

	/**
	 * The feature id for the '<em><b>TCformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT__TCFORMAT = 3;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT__INPUT_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Export to prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL = 6;

	/**
	 * The number of structural features of the '<em>GSS Environment Level In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Environment Level In Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInImpl <em>GSS Environment Level In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentLevelIn()
	 * @generated
	 */
	int GSS_ENVIRONMENT_LEVEL_IN = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN__NAME = 1;

	/**
	 * The feature id for the '<em><b>TCformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN__TCFORMAT = 2;

	/**
	 * The feature id for the '<em><b>Export to prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN__EXPORT_TO_PREV_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Level In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Level In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_IN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelOutImpl <em>GSS Environment Level Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelOutImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentLevelOut()
	 * @generated
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT__NAME = 1;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT__TMFORMAT = 2;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT__INPUT_FILTER = 3;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Level Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Level Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_LEVEL_OUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketsImpl <em>GSS Environment Special Packets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentSpecialPackets()
	 * @generated
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKETS = 16;

	/**
	 * The feature id for the '<em><b>Special Packet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET = 0;

	/**
	 * The number of structural features of the '<em>GSS Environment Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Environment Special Packets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl <em>GSS Environment Special Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET = 17;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__ID = 2;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF = 3;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS = 4;

	/**
	 * The feature id for the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF = 5;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Upper Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS = 7;

	/**
	 * The feature id for the '<em><b>Printing Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA = 8;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD = 9;

	/**
	 * The feature id for the '<em><b>Interval Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE = 10;

	/**
	 * The number of structural features of the '<em>GSS Environment Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>GSS Environment Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_SPECIAL_PACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelsImpl <em>GSS Environment Upper Levels</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUpperLevels()
	 * @generated
	 */
	int GSS_ENVIRONMENT_UPPER_LEVELS = 18;

	/**
	 * The feature id for the '<em><b>Upper Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVELS__UPPER_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>GSS Environment Upper Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVELS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Environment Upper Levels</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVELS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl <em>GSS Environment Upper Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUpperLevel()
	 * @generated
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL = 19;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT = 1;

	/**
	 * The feature id for the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Upper Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Upper Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPrintingDataImpl <em>GSS Environment Printing Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPrintingDataImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPrintingData()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PRINTING_DATA = 20;

	/**
	 * The feature id for the '<em><b>Print Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS = 0;

	/**
	 * The feature id for the '<em><b>Structured Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA = 1;

	/**
	 * The number of structural features of the '<em>GSS Environment Printing Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PRINTING_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Environment Printing Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PRINTING_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentStructuredDataImpl <em>GSS Environment Structured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentStructuredDataImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentStructuredData()
	 * @generated
	 */
	int GSS_ENVIRONMENT_STRUCTURED_DATA = 21;

	/**
	 * The feature id for the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_STRUCTURED_DATA__LEVEL_REF = 0;

	/**
	 * The feature id for the '<em><b>First Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_STRUCTURED_DATA__FIRST_FIELD = 1;

	/**
	 * The number of structural features of the '<em>GSS Environment Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_STRUCTURED_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Environment Structured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_STRUCTURED_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodImpl <em>GSS Environment Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriod()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PERIOD = 22;

	/**
	 * The feature id for the '<em><b>Min value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIOD__MIN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Min unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIOD__MIN_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Max value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIOD__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Max unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIOD__MAX_UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIOD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl <em>GSS Environment Interval Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentIntervalRange()
	 * @generated
	 */
	int GSS_ENVIRONMENT_INTERVAL_RANGE = 23;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERVAL_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERVAL_RANGE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Interval value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Interval unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERVAL_RANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Interval Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_INTERVAL_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCsImpl <em>GSS Environment Periodic TCs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCs()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PERIODIC_TCS = 24;

	/**
	 * The feature id for the '<em><b>Periodic TC level 2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2 = 0;

	/**
	 * The feature id for the '<em><b>Periodic TC level 1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1 = 1;

	/**
	 * The feature id for the '<em><b>Periodic TC level 0</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0 = 2;

	/**
	 * The number of structural features of the '<em>GSS Environment Periodic TCs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TCS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Environment Periodic TCs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TCS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCImpl <em>GSS Environment Periodic TC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTC()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC__ID = 1;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC__IF_REF = 2;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_UNIT = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl <em>GSS Environment Periodic TC Level2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCLevel2()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2 = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__NAME = GSS_ENVIRONMENT_PERIODIC_TC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__ID = GSS_ENVIRONMENT_PERIODIC_TC__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__IF_REF = GSS_ENVIRONMENT_PERIODIC_TC__IF_REF;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__PERIOD_VALUE = GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_VALUE;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__PERIOD_UNIT = GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_UNIT;

	/**
	 * The feature id for the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>GSS Environment Periodic TC Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2_FEATURE_COUNT = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>GSS Environment Periodic TC Level2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2_OPERATION_COUNT = GSS_ENVIRONMENT_PERIODIC_TC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel1Impl <em>GSS Environment Periodic TC Level1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel1Impl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCLevel1()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1 = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__NAME = GSS_ENVIRONMENT_PERIODIC_TC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__ID = GSS_ENVIRONMENT_PERIODIC_TC__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__IF_REF = GSS_ENVIRONMENT_PERIODIC_TC__IF_REF;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__PERIOD_VALUE = GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_VALUE;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__PERIOD_UNIT = GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_UNIT;

	/**
	 * The feature id for the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL1 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL0 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Periodic TC Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1_FEATURE_COUNT = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>GSS Environment Periodic TC Level1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1_OPERATION_COUNT = GSS_ENVIRONMENT_PERIODIC_TC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel0Impl <em>GSS Environment Periodic TC Level0</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel0Impl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCLevel0()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0 = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__NAME = GSS_ENVIRONMENT_PERIODIC_TC__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__ID = GSS_ENVIRONMENT_PERIODIC_TC__ID;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__IF_REF = GSS_ENVIRONMENT_PERIODIC_TC__IF_REF;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__PERIOD_VALUE = GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_VALUE;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__PERIOD_UNIT = GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_UNIT;

	/**
	 * The feature id for the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>App to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0 = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>GSS Environment Periodic TC Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0_FEATURE_COUNT = GSS_ENVIRONMENT_PERIODIC_TC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>GSS Environment Periodic TC Level0</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0_OPERATION_COUNT = GSS_ENVIRONMENT_PERIODIC_TC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarsImpl <em>GSS Environment Global Vars</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGlobalVars()
	 * @generated
	 */
	int GSS_ENVIRONMENT_GLOBAL_VARS = 29;

	/**
	 * The feature id for the '<em><b>Global Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR = 0;

	/**
	 * The number of structural features of the '<em>GSS Environment Global Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VARS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GSS Environment Global Vars</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VARS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl <em>GSS Environment Global Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR__ID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Initial value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Reference Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Reference Periodic TC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC = 5;

	/**
	 * The feature id for the '<em><b>Reference Special Packet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET = 6;

	/**
	 * The number of structural features of the '<em>GSS Environment Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>GSS Environment Global Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceFieldImpl <em>GSS Environment Reference Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceFieldImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferenceField()
	 * @generated
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD = 31;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD__IF_REF = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD__FIELD_REF = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD__OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD__SIZE = 5;

	/**
	 * The number of structural features of the '<em>GSS Environment Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>GSS Environment Reference Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferencePeriodicTCImpl <em>GSS Environment Reference Periodic TC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferencePeriodicTCImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferencePeriodicTC()
	 * @generated
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC = 32;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__FIELD_REF = 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__SIZE = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Reference Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Reference Periodic TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl <em>GSS Environment Reference Special Packet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferenceSpecialPacket()
	 * @generated
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET = 33;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF = 2;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Reference Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Reference Special Packet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMonitorsImpl <em>GSS Environment Monitors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMonitorsImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentMonitors()
	 * @generated
	 */
	int GSS_ENVIRONMENT_MONITORS = 34;

	/**
	 * The feature id for the '<em><b>Charts File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MONITORS__CHARTS_FILE = 0;

	/**
	 * The feature id for the '<em><b>Plot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MONITORS__PLOT = 1;

	/**
	 * The feature id for the '<em><b>Alarm Msg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MONITORS__ALARM_MSG = 2;

	/**
	 * The feature id for the '<em><b>Modify</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MONITORS__MODIFY = 3;

	/**
	 * The feature id for the '<em><b>Alarm Val</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MONITORS__ALARM_VAL = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MONITORS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Monitors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MONITORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl <em>GSS Environment Plot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPlot()
	 * @generated
	 */
	int GSS_ENVIRONMENT_PLOT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PLOT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Chart Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PLOT__CHART_REF = 1;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PLOT__GV_FILTERED = 2;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PLOT__GV_PERIODIC = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PLOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Plot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_PLOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmMsgImpl <em>GSS Environment Alarm Msg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmMsgImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmMsg()
	 * @generated
	 */
	int GSS_ENVIRONMENT_ALARM_MSG = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_MSG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_MSG__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_MSG__TEXT = 2;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_MSG__GV_FILTERED = 3;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_MSG__GV_PERIODIC = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Alarm Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_MSG_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Alarm Msg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_MSG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentModifyImpl <em>GSS Environment Modify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentModifyImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentModify()
	 * @generated
	 */
	int GSS_ENVIRONMENT_MODIFY = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MODIFY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MODIFY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MODIFY__VALUE = 2;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MODIFY__GV_FILTERED = 3;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MODIFY__GV_PERIODIC = 4;

	/**
	 * The number of structural features of the '<em>GSS Environment Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MODIFY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GSS Environment Modify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_MODIFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmValImpl <em>GSS Environment Alarm Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmValImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmVal()
	 * @generated
	 */
	int GSS_ENVIRONMENT_ALARM_VAL = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_VAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_VAL__TYPE = 1;

	/**
	 * The feature id for the '<em><b>GV Filtered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_VAL__GV_FILTERED = 2;

	/**
	 * The feature id for the '<em><b>GV Periodic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_VAL__GV_PERIODIC = 3;

	/**
	 * The number of structural features of the '<em>GSS Environment Alarm Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_VAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>GSS Environment Alarm Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_ALARM_VAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVFilteredImpl <em>GSS Environment GV Filtered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVFilteredImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGVFiltered()
	 * @generated
	 */
	int GSS_ENVIRONMENT_GV_FILTERED = 39;

	/**
	 * The feature id for the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_FILTERED__FILTER = 1;

	/**
	 * The number of structural features of the '<em>GSS Environment GV Filtered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_FILTERED_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>GSS Environment GV Filtered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_FILTERED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVPeriodicImpl <em>GSS Environment GV Periodic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVPeriodicImpl
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGVPeriodic()
	 * @generated
	 */
	int GSS_ENVIRONMENT_GV_PERIODIC = 40;

	/**
	 * The feature id for the '<em><b>Global Var Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_PERIODIC__GLOBAL_VAR_REF = 0;

	/**
	 * The feature id for the '<em><b>Period value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Period unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_UNIT = 2;

	/**
	 * The number of structural features of the '<em>GSS Environment GV Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_PERIODIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>GSS Environment GV Periodic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSS_ENVIRONMENT_GV_PERIODIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable <em>GSS Environment Enable Disable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentEnableDisable()
	 * @generated
	 */
	int GSS_ENVIRONMENT_ENABLE_DISABLE = 41;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType <em>GSS Environment Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterfaceType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_INTERFACE_TYPE = 42;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType <em>GSS Environment Interface IO Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterfaceIOType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_INTERFACE_IO_TYPE = 43;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel <em>GSS Environment Upper Level Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUpperLevelLevel()
	 * @generated
	 */
	int GSS_ENVIRONMENT_UPPER_LEVEL_LEVEL = 44;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUnit <em>GSS Environment Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUnit
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUnit()
	 * @generated
	 */
	int GSS_ENVIRONMENT_UNIT = 45;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType <em>GSS Environment Global Var Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGlobalVarType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_GLOBAL_VAR_TYPE = 46;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType <em>GSS Environment Reference Field Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferenceFieldType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_REFERENCE_FIELD_TYPE = 47;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsgType <em>GSS Environment Alarm Msg Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsgType
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmMsgType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_ALARM_MSG_TYPE = 48;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType <em>GSS Environment Modify Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentModifyType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_MODIFY_TYPE = 49;

	/**
	 * The meta object id for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType <em>GSS Environment Alarm Val Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType
	 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmValType()
	 * @generated
	 */
	int GSS_ENVIRONMENT_ALARM_VAL_TYPE = 50;


	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment <em>GSS Environment Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Environment</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment
	 * @generated
	 */
	EClass getGSSEnvironmentEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment#getScenario()
	 * @see #getGSSEnvironmentEnvironment()
	 * @generated
	 */
	EReference getGSSEnvironmentEnvironment_Scenario();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario <em>GSS Environment Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Scenario</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario
	 * @generated
	 */
	EClass getGSSEnvironmentScenario();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getName()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EAttribute getGSSEnvironmentScenario_Name();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGss_options <em>Gss options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss options</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGss_options()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EReference getGSSEnvironmentScenario_Gss_options();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocols</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getProtocols()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EReference getGSSEnvironmentScenario_Protocols();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getInterfaces()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EReference getGSSEnvironmentScenario_Interfaces();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getSpecialPackets <em>Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getSpecialPackets()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EReference getGSSEnvironmentScenario_SpecialPackets();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getPeriodicTCs <em>Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Periodic TCs</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getPeriodicTCs()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EReference getGSSEnvironmentScenario_PeriodicTCs();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGlobalVars <em>Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Vars</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGlobalVars()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EReference getGSSEnvironmentScenario_GlobalVars();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getMonitors <em>Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitors</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getMonitors()
	 * @see #getGSSEnvironmentScenario()
	 * @generated
	 */
	EReference getGSSEnvironmentScenario_Monitors();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions <em>GSS Environment Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Options</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentOptions
	 * @generated
	 */
	EClass getGSSEnvironmentOptions();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info <em>Gss info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss info</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info()
	 * @see #getGSSEnvironmentOptions()
	 * @generated
	 */
	EReference getGSSEnvironmentOptions_Gss_info();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info_print <em>Gss info print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gss info print</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info_print()
	 * @see #getGSSEnvironmentOptions()
	 * @generated
	 */
	EReference getGSSEnvironmentOptions_Gss_info_print();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getPhy_header_print <em>Phy header print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phy header print</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getPhy_header_print()
	 * @see #getGSSEnvironmentOptions()
	 * @generated
	 */
	EReference getGSSEnvironmentOptions_Phy_header_print();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getDiscardErrorFlags <em>Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discard Error Flags</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getDiscardErrorFlags()
	 * @see #getGSSEnvironmentOptions()
	 * @generated
	 */
	EReference getGSSEnvironmentOptions_DiscardErrorFlags();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfo <em>GSS Environment Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Info</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfo
	 * @generated
	 */
	EClass getGSSEnvironmentInfo();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getTest_campaign <em>Test campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test campaign</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getTest_campaign()
	 * @see #getGSSEnvironmentInfo()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInfo_Test_campaign();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getVersion()
	 * @see #getGSSEnvironmentInfo()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getDate()
	 * @see #getGSSEnvironmentInfo()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInfo_Date();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getVersion_control_url <em>Version control url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version control url</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfo#getVersion_control_url()
	 * @see #getGSSEnvironmentInfo()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInfo_Version_control_url();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint <em>GSS Environment Info Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Info Print</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint
	 * @generated
	 */
	EClass getGSSEnvironmentInfoPrint();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getMainLog <em>Main Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Log</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getMainLog()
	 * @see #getGSSEnvironmentInfoPrint()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInfoPrint_MainLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getPortLogs <em>Port Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Logs</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getPortLogs()
	 * @see #getGSSEnvironmentInfoPrint()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInfoPrint_PortLogs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getRawLog <em>Raw Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Log</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint#getRawLog()
	 * @see #getGSSEnvironmentInfoPrint()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInfoPrint_RawLog();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint <em>GSS Environment Phy Header Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Phy Header Print</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint
	 * @generated
	 */
	EClass getGSSEnvironmentPhyHeaderPrint();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getMainLog <em>Main Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Log</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getMainLog()
	 * @see #getGSSEnvironmentPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPhyHeaderPrint_MainLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getPortLogs <em>Port Logs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Logs</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getPortLogs()
	 * @see #getGSSEnvironmentPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPhyHeaderPrint_PortLogs();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getRawLog <em>Raw Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raw Log</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getRawLog()
	 * @see #getGSSEnvironmentPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPhyHeaderPrint_RawLog();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getGssTabs <em>Gss Tabs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gss Tabs</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint#getGssTabs()
	 * @see #getGSSEnvironmentPhyHeaderPrint()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPhyHeaderPrint_GssTabs();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags <em>GSS Environment Discard Error Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Discard Error Flags</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags
	 * @generated
	 */
	EClass getGSSEnvironmentDiscardErrorFlags();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getTxErrors <em>Tx Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx Errors</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getTxErrors()
	 * @see #getGSSEnvironmentDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSEnvironmentDiscardErrorFlags_TxErrors();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getNotExpectedPackets <em>Not Expected Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Expected Packets</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getNotExpectedPackets()
	 * @see #getGSSEnvironmentDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSEnvironmentDiscardErrorFlags_NotExpectedPackets();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getFiltersKo <em>Filters Ko</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filters Ko</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getFiltersKo()
	 * @see #getGSSEnvironmentDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSEnvironmentDiscardErrorFlags_FiltersKo();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getValidTimesKo <em>Valid Times Ko</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Times Ko</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags#getValidTimesKo()
	 * @see #getGSSEnvironmentDiscardErrorFlags()
	 * @generated
	 */
	EAttribute getGSSEnvironmentDiscardErrorFlags_ValidTimesKo();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols <em>GSS Environment Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Protocols</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols
	 * @generated
	 */
	EClass getGSSEnvironmentProtocols();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols#getProtocol()
	 * @see #getGSSEnvironmentProtocols()
	 * @generated
	 */
	EReference getGSSEnvironmentProtocols_Protocol();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol <em>GSS Environment Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Protocol</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol
	 * @generated
	 */
	EClass getGSSEnvironmentProtocol();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getId()
	 * @see #getGSSEnvironmentProtocol()
	 * @generated
	 */
	EAttribute getGSSEnvironmentProtocol_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getName()
	 * @see #getGSSEnvironmentProtocol()
	 * @generated
	 */
	EAttribute getGSSEnvironmentProtocol_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getTypeLevel <em>Type Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getTypeLevel()
	 * @see #getGSSEnvironmentProtocol()
	 * @generated
	 */
	EAttribute getGSSEnvironmentProtocol_TypeLevel();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getType()
	 * @see #getGSSEnvironmentProtocol()
	 * @generated
	 */
	EReference getGSSEnvironmentProtocol_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtype</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getSubtype()
	 * @see #getGSSEnvironmentProtocol()
	 * @generated
	 */
	EReference getGSSEnvironmentProtocol_Subtype();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType <em>GSS Environment Protocol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Protocol Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType
	 * @generated
	 */
	EClass getGSSEnvironmentProtocolType();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType#getOffset()
	 * @see #getGSSEnvironmentProtocolType()
	 * @generated
	 */
	EAttribute getGSSEnvironmentProtocolType_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentProtocolType#getName()
	 * @see #getGSSEnvironmentProtocolType()
	 * @generated
	 */
	EAttribute getGSSEnvironmentProtocolType_Name();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces <em>GSS Environment Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Interfaces</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces
	 * @generated
	 */
	EClass getGSSEnvironmentInterfaces();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces#getProtocolPacketsFile <em>Protocol Packets File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol Packets File</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces#getProtocolPacketsFile()
	 * @see #getGSSEnvironmentInterfaces()
	 * @generated
	 */
	EReference getGSSEnvironmentInterfaces_ProtocolPacketsFile();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces#getMainInterface <em>Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Interface</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces#getMainInterface()
	 * @see #getGSSEnvironmentInterfaces()
	 * @generated
	 */
	EReference getGSSEnvironmentInterfaces_MainInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces#getInterface()
	 * @see #getGSSEnvironmentInterfaces()
	 * @generated
	 */
	EReference getGSSEnvironmentInterfaces_Interface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface <em>GSS Environment Main Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Main Interface</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface
	 * @generated
	 */
	EClass getGSSEnvironmentMainInterface();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface <em>GSS Environment Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Interface</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface
	 * @generated
	 */
	EClass getGSSEnvironmentInterface();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getId()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInterface_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getName()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInterface_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfType <em>If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfType()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInterface_IfType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfConfig <em>If Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Config</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfConfig()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EReference getGSSEnvironmentInterface_IfConfig();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIoType <em>Io Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Io Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIoType()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EAttribute getGSSEnvironmentInterface_IoType();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getProtocolID <em>Protocol ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Protocol ID</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getProtocolID()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EReference getGSSEnvironmentInterface_ProtocolID();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelInOut <em>Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level In Out</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelInOut()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EReference getGSSEnvironmentInterface_LevelInOut();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelIn <em>Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level In</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelIn()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EReference getGSSEnvironmentInterface_LevelIn();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelOut <em>Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Level Out</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelOut()
	 * @see #getGSSEnvironmentInterface()
	 * @generated
	 */
	EReference getGSSEnvironmentInterface_LevelOut();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut <em>GSS Environment Level In Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Level In Out</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut
	 * @generated
	 */
	EClass getGSSEnvironmentLevelInOut();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getId()
	 * @see #getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	EAttribute getGSSEnvironmentLevelInOut_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getName()
	 * @see #getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	EAttribute getGSSEnvironmentLevelInOut_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTMformat()
	 * @see #getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelInOut_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTCformat <em>TCformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TCformat</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTCformat()
	 * @see #getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelInOut_TCformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getInputFilter()
	 * @see #getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelInOut_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getExport_to_prev_Level <em>Export to prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export to prev Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getExport_to_prev_Level()
	 * @see #getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelInOut_Export_to_prev_Level();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getImport_from_prev_Level()
	 * @see #getGSSEnvironmentLevelInOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelInOut_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn <em>GSS Environment Level In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Level In</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn
	 * @generated
	 */
	EClass getGSSEnvironmentLevelIn();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getId()
	 * @see #getGSSEnvironmentLevelIn()
	 * @generated
	 */
	EAttribute getGSSEnvironmentLevelIn_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getName()
	 * @see #getGSSEnvironmentLevelIn()
	 * @generated
	 */
	EAttribute getGSSEnvironmentLevelIn_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getTCformat <em>TCformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TCformat</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getTCformat()
	 * @see #getGSSEnvironmentLevelIn()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelIn_TCformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getExport_to_prev_Level <em>Export to prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Export to prev Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn#getExport_to_prev_Level()
	 * @see #getGSSEnvironmentLevelIn()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelIn_Export_to_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut <em>GSS Environment Level Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Level Out</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut
	 * @generated
	 */
	EClass getGSSEnvironmentLevelOut();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getId()
	 * @see #getGSSEnvironmentLevelOut()
	 * @generated
	 */
	EAttribute getGSSEnvironmentLevelOut_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getName()
	 * @see #getGSSEnvironmentLevelOut()
	 * @generated
	 */
	EAttribute getGSSEnvironmentLevelOut_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getTMformat()
	 * @see #getGSSEnvironmentLevelOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelOut_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getInputFilter()
	 * @see #getGSSEnvironmentLevelOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelOut_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut#getImport_from_prev_Level()
	 * @see #getGSSEnvironmentLevelOut()
	 * @generated
	 */
	EReference getGSSEnvironmentLevelOut_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets <em>GSS Environment Special Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Special Packets</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets
	 * @generated
	 */
	EClass getGSSEnvironmentSpecialPackets();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets#getSpecialPacket <em>Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets#getSpecialPacket()
	 * @see #getGSSEnvironmentSpecialPackets()
	 * @generated
	 */
	EReference getGSSEnvironmentSpecialPackets_SpecialPacket();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket <em>GSS Environment Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket
	 * @generated
	 */
	EClass getGSSEnvironmentSpecialPacket();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getStatus()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentSpecialPacket_Status();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getName()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentSpecialPacket_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getId()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentSpecialPacket_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getIfRef()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentSpecialPacket_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Levels</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getLevels()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentSpecialPacket_Levels();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getLevelRef <em>Level Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getLevelRef()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentSpecialPacket_LevelRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getInputFilter()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EReference getGSSEnvironmentSpecialPacket_InputFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getUpperLevels <em>Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Levels</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getUpperLevels()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EReference getGSSEnvironmentSpecialPacket_UpperLevels();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getPrintingData <em>Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Printing Data</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getPrintingData()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EReference getGSSEnvironmentSpecialPacket_PrintingData();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getPeriod()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EReference getGSSEnvironmentSpecialPacket_Period();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getIntervalRange <em>Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval Range</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket#getIntervalRange()
	 * @see #getGSSEnvironmentSpecialPacket()
	 * @generated
	 */
	EReference getGSSEnvironmentSpecialPacket_IntervalRange();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels <em>GSS Environment Upper Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Upper Levels</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels
	 * @generated
	 */
	EClass getGSSEnvironmentUpperLevels();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels#getUpperLevel <em>Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels#getUpperLevel()
	 * @see #getGSSEnvironmentUpperLevels()
	 * @generated
	 */
	EReference getGSSEnvironmentUpperLevels_UpperLevel();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel <em>GSS Environment Upper Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Upper Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel
	 * @generated
	 */
	EClass getGSSEnvironmentUpperLevel();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getLevel()
	 * @see #getGSSEnvironmentUpperLevel()
	 * @generated
	 */
	EAttribute getGSSEnvironmentUpperLevel_Level();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getTMformat <em>TMformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>TMformat</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getTMformat()
	 * @see #getGSSEnvironmentUpperLevel()
	 * @generated
	 */
	EReference getGSSEnvironmentUpperLevel_TMformat();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getInputFilter <em>Input Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Filter</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getInputFilter()
	 * @see #getGSSEnvironmentUpperLevel()
	 * @generated
	 */
	EReference getGSSEnvironmentUpperLevel_InputFilter();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import from prev Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel#getImport_from_prev_Level()
	 * @see #getGSSEnvironmentUpperLevel()
	 * @generated
	 */
	EReference getGSSEnvironmentUpperLevel_Import_from_prev_Level();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData <em>GSS Environment Printing Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Printing Data</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData
	 * @generated
	 */
	EClass getGSSEnvironmentPrintingData();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getPrintStatus <em>Print Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Print Status</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getPrintStatus()
	 * @see #getGSSEnvironmentPrintingData()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPrintingData_PrintStatus();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getStructuredData <em>Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structured Data</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData#getStructuredData()
	 * @see #getGSSEnvironmentPrintingData()
	 * @generated
	 */
	EReference getGSSEnvironmentPrintingData_StructuredData();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData <em>GSS Environment Structured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Structured Data</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData
	 * @generated
	 */
	EClass getGSSEnvironmentStructuredData();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData#getLevelRef <em>Level Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData#getLevelRef()
	 * @see #getGSSEnvironmentStructuredData()
	 * @generated
	 */
	EAttribute getGSSEnvironmentStructuredData_LevelRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData#getFirstField <em>First Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Field</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData#getFirstField()
	 * @see #getGSSEnvironmentStructuredData()
	 * @generated
	 */
	EAttribute getGSSEnvironmentStructuredData_FirstField();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod <em>GSS Environment Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Period</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod
	 * @generated
	 */
	EClass getGSSEnvironmentPeriod();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMin_value <em>Min value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min value</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMin_value()
	 * @see #getGSSEnvironmentPeriod()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriod_Min_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMin_unit <em>Min unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min unit</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMin_unit()
	 * @see #getGSSEnvironmentPeriod()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriod_Min_unit();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMax_value <em>Max value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max value</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMax_value()
	 * @see #getGSSEnvironmentPeriod()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriod_Max_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMax_unit <em>Max unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max unit</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod#getMax_unit()
	 * @see #getGSSEnvironmentPeriod()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriod_Max_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange <em>GSS Environment Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Interval Range</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange
	 * @generated
	 */
	EClass getGSSEnvironmentIntervalRange();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getMin()
	 * @see #getGSSEnvironmentIntervalRange()
	 * @generated
	 */
	EAttribute getGSSEnvironmentIntervalRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getMax()
	 * @see #getGSSEnvironmentIntervalRange()
	 * @generated
	 */
	EAttribute getGSSEnvironmentIntervalRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getInterval_value <em>Interval value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval value</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getInterval_value()
	 * @see #getGSSEnvironmentIntervalRange()
	 * @generated
	 */
	EAttribute getGSSEnvironmentIntervalRange_Interval_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getInterval_unit <em>Interval unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval unit</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange#getInterval_unit()
	 * @see #getGSSEnvironmentIntervalRange()
	 * @generated
	 */
	EAttribute getGSSEnvironmentIntervalRange_Interval_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs <em>GSS Environment Periodic TCs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Periodic TCs</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs
	 * @generated
	 */
	EClass getGSSEnvironmentPeriodicTCs();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs#getPeriodicTC_level_2 <em>Periodic TC level 2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic TC level 2</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs#getPeriodicTC_level_2()
	 * @see #getGSSEnvironmentPeriodicTCs()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCs_PeriodicTC_level_2();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs#getPeriodicTC_level_1 <em>Periodic TC level 1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic TC level 1</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs#getPeriodicTC_level_1()
	 * @see #getGSSEnvironmentPeriodicTCs()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCs_PeriodicTC_level_1();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs#getPeriodicTC_level_0 <em>Periodic TC level 0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Periodic TC level 0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs#getPeriodicTC_level_0()
	 * @see #getGSSEnvironmentPeriodicTCs()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCs_PeriodicTC_level_0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC <em>GSS Environment Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC
	 * @generated
	 */
	EClass getGSSEnvironmentPeriodicTC();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getName()
	 * @see #getGSSEnvironmentPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriodicTC_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getId()
	 * @see #getGSSEnvironmentPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriodicTC_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getIfRef()
	 * @see #getGSSEnvironmentPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriodicTC_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getPeriod_value()
	 * @see #getGSSEnvironmentPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriodicTC_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC#getPeriod_unit()
	 * @see #getGSSEnvironmentPeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPeriodicTC_Period_unit();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2 <em>GSS Environment Periodic TC Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Periodic TC Level2</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2
	 * @generated
	 */
	EClass getGSSEnvironmentPeriodicTCLevel2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel2 <em>Level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel2()
	 * @see #getGSSEnvironmentPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel2_Level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getApp_to_level2 <em>App to level2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level2</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getApp_to_level2()
	 * @see #getGSSEnvironmentPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel2_App_to_level2();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel1()
	 * @see #getGSSEnvironmentPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel2_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel2_to_level1 <em>Level2 to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level2 to level1</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel2_to_level1()
	 * @see #getGSSEnvironmentPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel2_Level2_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel0()
	 * @see #getGSSEnvironmentPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel2_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2#getLevel1_to_level0()
	 * @see #getGSSEnvironmentPeriodicTCLevel2()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel2_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1 <em>GSS Environment Periodic TC Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Periodic TC Level1</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1
	 * @generated
	 */
	EClass getGSSEnvironmentPeriodicTCLevel1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getLevel1 <em>Level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getLevel1()
	 * @see #getGSSEnvironmentPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel1_Level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getApp_to_level1 <em>App to level1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level1</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getApp_to_level1()
	 * @see #getGSSEnvironmentPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel1_App_to_level1();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getLevel0()
	 * @see #getGSSEnvironmentPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel1_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getLevel1_to_level0 <em>Level1 to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level1 to level0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1#getLevel1_to_level0()
	 * @see #getGSSEnvironmentPeriodicTCLevel1()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel1_Level1_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0 <em>GSS Environment Periodic TC Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Periodic TC Level0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0
	 * @generated
	 */
	EClass getGSSEnvironmentPeriodicTCLevel0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0#getLevel0 <em>Level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Level0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0#getLevel0()
	 * @see #getGSSEnvironmentPeriodicTCLevel0()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel0_Level0();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0#getApp_to_level0 <em>App to level0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>App to level0</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0#getApp_to_level0()
	 * @see #getGSSEnvironmentPeriodicTCLevel0()
	 * @generated
	 */
	EReference getGSSEnvironmentPeriodicTCLevel0_App_to_level0();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars <em>GSS Environment Global Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Global Vars</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars
	 * @generated
	 */
	EClass getGSSEnvironmentGlobalVars();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars#getGlobalVar <em>Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Var</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars#getGlobalVar()
	 * @see #getGSSEnvironmentGlobalVars()
	 * @generated
	 */
	EReference getGSSEnvironmentGlobalVars_GlobalVar();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar <em>GSS Environment Global Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Global Var</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar
	 * @generated
	 */
	EClass getGSSEnvironmentGlobalVar();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getName()
	 * @see #getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	EAttribute getGSSEnvironmentGlobalVar_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getId()
	 * @see #getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	EAttribute getGSSEnvironmentGlobalVar_Id();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getType()
	 * @see #getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	EAttribute getGSSEnvironmentGlobalVar_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getInitial_value <em>Initial value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial value</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getInitial_value()
	 * @see #getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	EAttribute getGSSEnvironmentGlobalVar_Initial_value();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceField <em>Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Field</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceField()
	 * @see #getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	EReference getGSSEnvironmentGlobalVar_ReferenceField();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferencePeriodicTC <em>Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferencePeriodicTC()
	 * @see #getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	EReference getGSSEnvironmentGlobalVar_ReferencePeriodicTC();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceSpecialPacket <em>Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar#getReferenceSpecialPacket()
	 * @see #getGSSEnvironmentGlobalVar()
	 * @generated
	 */
	EReference getGSSEnvironmentGlobalVar_ReferenceSpecialPacket();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField <em>GSS Environment Reference Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Reference Field</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField
	 * @generated
	 */
	EClass getGSSEnvironmentReferenceField();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getType()
	 * @see #getGSSEnvironmentReferenceField()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceField_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getIfRef <em>If Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getIfRef()
	 * @see #getGSSEnvironmentReferenceField()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceField_IfRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getLevel()
	 * @see #getGSSEnvironmentReferenceField()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceField_Level();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getFieldRef()
	 * @see #getGSSEnvironmentReferenceField()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceField_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getOffset()
	 * @see #getGSSEnvironmentReferenceField()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceField_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getSize()
	 * @see #getGSSEnvironmentReferenceField()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceField_Size();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC <em>GSS Environment Reference Periodic TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Reference Periodic TC</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC
	 * @generated
	 */
	EClass getGSSEnvironmentReferencePeriodicTC();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getIdRef()
	 * @see #getGSSEnvironmentReferencePeriodicTC()
	 * @generated
	 */
	EReference getGSSEnvironmentReferencePeriodicTC_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getLevel()
	 * @see #getGSSEnvironmentReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferencePeriodicTC_Level();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getFieldRef()
	 * @see #getGSSEnvironmentReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferencePeriodicTC_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getOffset()
	 * @see #getGSSEnvironmentReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferencePeriodicTC_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getSize()
	 * @see #getGSSEnvironmentReferencePeriodicTC()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferencePeriodicTC_Size();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket <em>GSS Environment Reference Special Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Reference Special Packet</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket
	 * @generated
	 */
	EClass getGSSEnvironmentReferenceSpecialPacket();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Id Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getIdRef()
	 * @see #getGSSEnvironmentReferenceSpecialPacket()
	 * @generated
	 */
	EReference getGSSEnvironmentReferenceSpecialPacket_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getLevel()
	 * @see #getGSSEnvironmentReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceSpecialPacket_Level();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getFieldRef <em>Field Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getFieldRef()
	 * @see #getGSSEnvironmentReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceSpecialPacket_FieldRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getOffset()
	 * @see #getGSSEnvironmentReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceSpecialPacket_Offset();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket#getSize()
	 * @see #getGSSEnvironmentReferenceSpecialPacket()
	 * @generated
	 */
	EAttribute getGSSEnvironmentReferenceSpecialPacket_Size();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors <em>GSS Environment Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Monitors</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors
	 * @generated
	 */
	EClass getGSSEnvironmentMonitors();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getChartsFile <em>Charts File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Charts File</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getChartsFile()
	 * @see #getGSSEnvironmentMonitors()
	 * @generated
	 */
	EReference getGSSEnvironmentMonitors_ChartsFile();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getPlot <em>Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plot</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getPlot()
	 * @see #getGSSEnvironmentMonitors()
	 * @generated
	 */
	EReference getGSSEnvironmentMonitors_Plot();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getAlarmMsg <em>Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm Msg</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getAlarmMsg()
	 * @see #getGSSEnvironmentMonitors()
	 * @generated
	 */
	EReference getGSSEnvironmentMonitors_AlarmMsg();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getModify <em>Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modify</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getModify()
	 * @see #getGSSEnvironmentMonitors()
	 * @generated
	 */
	EReference getGSSEnvironmentMonitors_Modify();

	/**
	 * Returns the meta object for the containment reference list '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getAlarmVal <em>Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm Val</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors#getAlarmVal()
	 * @see #getGSSEnvironmentMonitors()
	 * @generated
	 */
	EReference getGSSEnvironmentMonitors_AlarmVal();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot <em>GSS Environment Plot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Plot</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPlot
	 * @generated
	 */
	EClass getGSSEnvironmentPlot();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getName()
	 * @see #getGSSEnvironmentPlot()
	 * @generated
	 */
	EAttribute getGSSEnvironmentPlot_Name();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getChartRef <em>Chart Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chart Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getChartRef()
	 * @see #getGSSEnvironmentPlot()
	 * @generated
	 */
	EReference getGSSEnvironmentPlot_ChartRef();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVFiltered()
	 * @see #getGSSEnvironmentPlot()
	 * @generated
	 */
	EReference getGSSEnvironmentPlot_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentPlot#getGVPeriodic()
	 * @see #getGSSEnvironmentPlot()
	 * @generated
	 */
	EReference getGSSEnvironmentPlot_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg <em>GSS Environment Alarm Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Alarm Msg</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg
	 * @generated
	 */
	EClass getGSSEnvironmentAlarmMsg();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getName()
	 * @see #getGSSEnvironmentAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSEnvironmentAlarmMsg_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getType()
	 * @see #getGSSEnvironmentAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSEnvironmentAlarmMsg_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getText()
	 * @see #getGSSEnvironmentAlarmMsg()
	 * @generated
	 */
	EAttribute getGSSEnvironmentAlarmMsg_Text();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getGVFiltered()
	 * @see #getGSSEnvironmentAlarmMsg()
	 * @generated
	 */
	EReference getGSSEnvironmentAlarmMsg_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg#getGVPeriodic()
	 * @see #getGSSEnvironmentAlarmMsg()
	 * @generated
	 */
	EReference getGSSEnvironmentAlarmMsg_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify <em>GSS Environment Modify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Modify</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModify
	 * @generated
	 */
	EClass getGSSEnvironmentModify();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getName()
	 * @see #getGSSEnvironmentModify()
	 * @generated
	 */
	EAttribute getGSSEnvironmentModify_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getType()
	 * @see #getGSSEnvironmentModify()
	 * @generated
	 */
	EAttribute getGSSEnvironmentModify_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getValue()
	 * @see #getGSSEnvironmentModify()
	 * @generated
	 */
	EAttribute getGSSEnvironmentModify_Value();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVFiltered()
	 * @see #getGSSEnvironmentModify()
	 * @generated
	 */
	EReference getGSSEnvironmentModify_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModify#getGVPeriodic()
	 * @see #getGSSEnvironmentModify()
	 * @generated
	 */
	EReference getGSSEnvironmentModify_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal <em>GSS Environment Alarm Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment Alarm Val</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal
	 * @generated
	 */
	EClass getGSSEnvironmentAlarmVal();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getName()
	 * @see #getGSSEnvironmentAlarmVal()
	 * @generated
	 */
	EAttribute getGSSEnvironmentAlarmVal_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getType()
	 * @see #getGSSEnvironmentAlarmVal()
	 * @generated
	 */
	EAttribute getGSSEnvironmentAlarmVal_Type();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVFiltered <em>GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVFiltered()
	 * @see #getGSSEnvironmentAlarmVal()
	 * @generated
	 */
	EReference getGSSEnvironmentAlarmVal_GVFiltered();

	/**
	 * Returns the meta object for the containment reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVPeriodic <em>GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal#getGVPeriodic()
	 * @see #getGSSEnvironmentAlarmVal()
	 * @generated
	 */
	EReference getGSSEnvironmentAlarmVal_GVPeriodic();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered <em>GSS Environment GV Filtered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment GV Filtered</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered
	 * @generated
	 */
	EClass getGSSEnvironmentGVFiltered();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getGlobalVarRef <em>Global Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getGlobalVarRef()
	 * @see #getGSSEnvironmentGVFiltered()
	 * @generated
	 */
	EReference getGSSEnvironmentGVFiltered_GlobalVarRef();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered#getFilter()
	 * @see #getGSSEnvironmentGVFiltered()
	 * @generated
	 */
	EReference getGSSEnvironmentGVFiltered_Filter();

	/**
	 * Returns the meta object for class '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic <em>GSS Environment GV Periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSS Environment GV Periodic</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic
	 * @generated
	 */
	EClass getGSSEnvironmentGVPeriodic();

	/**
	 * Returns the meta object for the reference '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getGlobalVarRef <em>Global Var Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global Var Ref</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getGlobalVarRef()
	 * @see #getGSSEnvironmentGVPeriodic()
	 * @generated
	 */
	EReference getGSSEnvironmentGVPeriodic_GlobalVarRef();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_value <em>Period value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period value</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_value()
	 * @see #getGSSEnvironmentGVPeriodic()
	 * @generated
	 */
	EAttribute getGSSEnvironmentGVPeriodic_Period_value();

	/**
	 * Returns the meta object for the attribute '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_unit <em>Period unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period unit</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic#getPeriod_unit()
	 * @see #getGSSEnvironmentGVPeriodic()
	 * @generated
	 */
	EAttribute getGSSEnvironmentGVPeriodic_Period_unit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable <em>GSS Environment Enable Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Enable Disable</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
	 * @generated
	 */
	EEnum getGSSEnvironmentEnableDisable();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType <em>GSS Environment Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Interface Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType
	 * @generated
	 */
	EEnum getGSSEnvironmentInterfaceType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType <em>GSS Environment Interface IO Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Interface IO Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType
	 * @generated
	 */
	EEnum getGSSEnvironmentInterfaceIOType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel <em>GSS Environment Upper Level Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Upper Level Level</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel
	 * @generated
	 */
	EEnum getGSSEnvironmentUpperLevelLevel();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUnit <em>GSS Environment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Unit</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUnit
	 * @generated
	 */
	EEnum getGSSEnvironmentUnit();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType <em>GSS Environment Global Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Global Var Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType
	 * @generated
	 */
	EEnum getGSSEnvironmentGlobalVarType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType <em>GSS Environment Reference Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Reference Field Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType
	 * @generated
	 */
	EEnum getGSSEnvironmentReferenceFieldType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsgType <em>GSS Environment Alarm Msg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Alarm Msg Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsgType
	 * @generated
	 */
	EEnum getGSSEnvironmentAlarmMsgType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType <em>GSS Environment Modify Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Modify Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType
	 * @generated
	 */
	EEnum getGSSEnvironmentModifyType();

	/**
	 * Returns the meta object for enum '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType <em>GSS Environment Alarm Val Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>GSS Environment Alarm Val Type</em>'.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType
	 * @generated
	 */
	EEnum getGSSEnvironmentAlarmValType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	environmentFactory getenvironmentFactory();

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
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentEnvironmentImpl <em>GSS Environment Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentEnvironmentImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentEnvironment()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_ENVIRONMENT = eINSTANCE.getGSSEnvironmentEnvironment();

		/**
		 * The meta object literal for the '<em><b>Scenario</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_ENVIRONMENT__SCENARIO = eINSTANCE.getGSSEnvironmentEnvironment_Scenario();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl <em>GSS Environment Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentScenarioImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentScenario()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_SCENARIO = eINSTANCE.getGSSEnvironmentScenario();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_SCENARIO__NAME = eINSTANCE.getGSSEnvironmentScenario_Name();

		/**
		 * The meta object literal for the '<em><b>Gss options</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS = eINSTANCE.getGSSEnvironmentScenario_Gss_options();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SCENARIO__PROTOCOLS = eINSTANCE.getGSSEnvironmentScenario_Protocols();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SCENARIO__INTERFACES = eINSTANCE.getGSSEnvironmentScenario_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Special Packets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS = eINSTANCE.getGSSEnvironmentScenario_SpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Periodic TCs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS = eINSTANCE.getGSSEnvironmentScenario_PeriodicTCs();

		/**
		 * The meta object literal for the '<em><b>Global Vars</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS = eINSTANCE.getGSSEnvironmentScenario_GlobalVars();

		/**
		 * The meta object literal for the '<em><b>Monitors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SCENARIO__MONITORS = eINSTANCE.getGSSEnvironmentScenario_Monitors();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentOptionsImpl <em>GSS Environment Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentOptionsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentOptions()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_OPTIONS = eINSTANCE.getGSSEnvironmentOptions();

		/**
		 * The meta object literal for the '<em><b>Gss info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_OPTIONS__GSS_INFO = eINSTANCE.getGSSEnvironmentOptions_Gss_info();

		/**
		 * The meta object literal for the '<em><b>Gss info print</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_OPTIONS__GSS_INFO_PRINT = eINSTANCE.getGSSEnvironmentOptions_Gss_info_print();

		/**
		 * The meta object literal for the '<em><b>Phy header print</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_OPTIONS__PHY_HEADER_PRINT = eINSTANCE.getGSSEnvironmentOptions_Phy_header_print();

		/**
		 * The meta object literal for the '<em><b>Discard Error Flags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_OPTIONS__DISCARD_ERROR_FLAGS = eINSTANCE.getGSSEnvironmentOptions_DiscardErrorFlags();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoImpl <em>GSS Environment Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInfo()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_INFO = eINSTANCE.getGSSEnvironmentInfo();

		/**
		 * The meta object literal for the '<em><b>Test campaign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INFO__TEST_CAMPAIGN = eINSTANCE.getGSSEnvironmentInfo_Test_campaign();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INFO__VERSION = eINSTANCE.getGSSEnvironmentInfo_Version();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INFO__DATE = eINSTANCE.getGSSEnvironmentInfo_Date();

		/**
		 * The meta object literal for the '<em><b>Version control url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INFO__VERSION_CONTROL_URL = eINSTANCE.getGSSEnvironmentInfo_Version_control_url();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoPrintImpl <em>GSS Environment Info Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInfoPrintImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInfoPrint()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_INFO_PRINT = eINSTANCE.getGSSEnvironmentInfoPrint();

		/**
		 * The meta object literal for the '<em><b>Main Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INFO_PRINT__MAIN_LOG = eINSTANCE.getGSSEnvironmentInfoPrint_MainLog();

		/**
		 * The meta object literal for the '<em><b>Port Logs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INFO_PRINT__PORT_LOGS = eINSTANCE.getGSSEnvironmentInfoPrint_PortLogs();

		/**
		 * The meta object literal for the '<em><b>Raw Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INFO_PRINT__RAW_LOG = eINSTANCE.getGSSEnvironmentInfoPrint_RawLog();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl <em>GSS Environment Phy Header Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPhyHeaderPrintImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPhyHeaderPrint()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PHY_HEADER_PRINT = eINSTANCE.getGSSEnvironmentPhyHeaderPrint();

		/**
		 * The meta object literal for the '<em><b>Main Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG = eINSTANCE.getGSSEnvironmentPhyHeaderPrint_MainLog();

		/**
		 * The meta object literal for the '<em><b>Port Logs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS = eINSTANCE.getGSSEnvironmentPhyHeaderPrint_PortLogs();

		/**
		 * The meta object literal for the '<em><b>Raw Log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG = eINSTANCE.getGSSEnvironmentPhyHeaderPrint_RawLog();

		/**
		 * The meta object literal for the '<em><b>Gss Tabs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS = eINSTANCE.getGSSEnvironmentPhyHeaderPrint_GssTabs();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl <em>GSS Environment Discard Error Flags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentDiscardErrorFlagsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentDiscardErrorFlags()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS = eINSTANCE.getGSSEnvironmentDiscardErrorFlags();

		/**
		 * The meta object literal for the '<em><b>Tx Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS = eINSTANCE.getGSSEnvironmentDiscardErrorFlags_TxErrors();

		/**
		 * The meta object literal for the '<em><b>Not Expected Packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS = eINSTANCE.getGSSEnvironmentDiscardErrorFlags_NotExpectedPackets();

		/**
		 * The meta object literal for the '<em><b>Filters Ko</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO = eINSTANCE.getGSSEnvironmentDiscardErrorFlags_FiltersKo();

		/**
		 * The meta object literal for the '<em><b>Valid Times Ko</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO = eINSTANCE.getGSSEnvironmentDiscardErrorFlags_ValidTimesKo();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolsImpl <em>GSS Environment Protocols</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentProtocols()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PROTOCOLS = eINSTANCE.getGSSEnvironmentProtocols();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL = eINSTANCE.getGSSEnvironmentProtocols_Protocol();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl <em>GSS Environment Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentProtocol()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PROTOCOL = eINSTANCE.getGSSEnvironmentProtocol();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PROTOCOL__ID = eINSTANCE.getGSSEnvironmentProtocol_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PROTOCOL__NAME = eINSTANCE.getGSSEnvironmentProtocol_Name();

		/**
		 * The meta object literal for the '<em><b>Type Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL = eINSTANCE.getGSSEnvironmentProtocol_TypeLevel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PROTOCOL__TYPE = eINSTANCE.getGSSEnvironmentProtocol_Type();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PROTOCOL__SUBTYPE = eINSTANCE.getGSSEnvironmentProtocol_Subtype();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolTypeImpl <em>GSS Environment Protocol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentProtocolTypeImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentProtocolType()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PROTOCOL_TYPE = eINSTANCE.getGSSEnvironmentProtocolType();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PROTOCOL_TYPE__OFFSET = eINSTANCE.getGSSEnvironmentProtocolType_Offset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PROTOCOL_TYPE__NAME = eINSTANCE.getGSSEnvironmentProtocolType_Name();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfacesImpl <em>GSS Environment Interfaces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfacesImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterfaces()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_INTERFACES = eINSTANCE.getGSSEnvironmentInterfaces();

		/**
		 * The meta object literal for the '<em><b>Protocol Packets File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACES__PROTOCOL_PACKETS_FILE = eINSTANCE.getGSSEnvironmentInterfaces_ProtocolPacketsFile();

		/**
		 * The meta object literal for the '<em><b>Main Interface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACES__MAIN_INTERFACE = eINSTANCE.getGSSEnvironmentInterfaces_MainInterface();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACES__INTERFACE = eINSTANCE.getGSSEnvironmentInterfaces_Interface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMainInterfaceImpl <em>GSS Environment Main Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMainInterfaceImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentMainInterface()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_MAIN_INTERFACE = eINSTANCE.getGSSEnvironmentMainInterface();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl <em>GSS Environment Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentInterfaceImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterface()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_INTERFACE = eINSTANCE.getGSSEnvironmentInterface();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERFACE__ID = eINSTANCE.getGSSEnvironmentInterface_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERFACE__NAME = eINSTANCE.getGSSEnvironmentInterface_Name();

		/**
		 * The meta object literal for the '<em><b>If Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERFACE__IF_TYPE = eINSTANCE.getGSSEnvironmentInterface_IfType();

		/**
		 * The meta object literal for the '<em><b>If Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACE__IF_CONFIG = eINSTANCE.getGSSEnvironmentInterface_IfConfig();

		/**
		 * The meta object literal for the '<em><b>Io Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERFACE__IO_TYPE = eINSTANCE.getGSSEnvironmentInterface_IoType();

		/**
		 * The meta object literal for the '<em><b>Protocol ID</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID = eINSTANCE.getGSSEnvironmentInterface_ProtocolID();

		/**
		 * The meta object literal for the '<em><b>Level In Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT = eINSTANCE.getGSSEnvironmentInterface_LevelInOut();

		/**
		 * The meta object literal for the '<em><b>Level In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACE__LEVEL_IN = eINSTANCE.getGSSEnvironmentInterface_LevelIn();

		/**
		 * The meta object literal for the '<em><b>Level Out</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT = eINSTANCE.getGSSEnvironmentInterface_LevelOut();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInOutImpl <em>GSS Environment Level In Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInOutImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentLevelInOut()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_LEVEL_IN_OUT = eINSTANCE.getGSSEnvironmentLevelInOut();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_LEVEL_IN_OUT__ID = eINSTANCE.getGSSEnvironmentLevelInOut_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_LEVEL_IN_OUT__NAME = eINSTANCE.getGSSEnvironmentLevelInOut_Name();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_IN_OUT__TMFORMAT = eINSTANCE.getGSSEnvironmentLevelInOut_TMformat();

		/**
		 * The meta object literal for the '<em><b>TCformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_IN_OUT__TCFORMAT = eINSTANCE.getGSSEnvironmentLevelInOut_TCformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_IN_OUT__INPUT_FILTER = eINSTANCE.getGSSEnvironmentLevelInOut_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Export to prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL = eINSTANCE.getGSSEnvironmentLevelInOut_Export_to_prev_Level();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSEnvironmentLevelInOut_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInImpl <em>GSS Environment Level In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelInImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentLevelIn()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_LEVEL_IN = eINSTANCE.getGSSEnvironmentLevelIn();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_LEVEL_IN__ID = eINSTANCE.getGSSEnvironmentLevelIn_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_LEVEL_IN__NAME = eINSTANCE.getGSSEnvironmentLevelIn_Name();

		/**
		 * The meta object literal for the '<em><b>TCformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_IN__TCFORMAT = eINSTANCE.getGSSEnvironmentLevelIn_TCformat();

		/**
		 * The meta object literal for the '<em><b>Export to prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_IN__EXPORT_TO_PREV_LEVEL = eINSTANCE.getGSSEnvironmentLevelIn_Export_to_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelOutImpl <em>GSS Environment Level Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentLevelOutImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentLevelOut()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_LEVEL_OUT = eINSTANCE.getGSSEnvironmentLevelOut();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_LEVEL_OUT__ID = eINSTANCE.getGSSEnvironmentLevelOut_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_LEVEL_OUT__NAME = eINSTANCE.getGSSEnvironmentLevelOut_Name();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_OUT__TMFORMAT = eINSTANCE.getGSSEnvironmentLevelOut_TMformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_OUT__INPUT_FILTER = eINSTANCE.getGSSEnvironmentLevelOut_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSEnvironmentLevelOut_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketsImpl <em>GSS Environment Special Packets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentSpecialPackets()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_SPECIAL_PACKETS = eINSTANCE.getGSSEnvironmentSpecialPackets();

		/**
		 * The meta object literal for the '<em><b>Special Packet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET = eINSTANCE.getGSSEnvironmentSpecialPackets_SpecialPacket();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl <em>GSS Environment Special Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentSpecialPacketImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentSpecialPacket()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_SPECIAL_PACKET = eINSTANCE.getGSSEnvironmentSpecialPacket();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS = eINSTANCE.getGSSEnvironmentSpecialPacket_Status();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_SPECIAL_PACKET__NAME = eINSTANCE.getGSSEnvironmentSpecialPacket_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_SPECIAL_PACKET__ID = eINSTANCE.getGSSEnvironmentSpecialPacket_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF = eINSTANCE.getGSSEnvironmentSpecialPacket_IfRef();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS = eINSTANCE.getGSSEnvironmentSpecialPacket_Levels();

		/**
		 * The meta object literal for the '<em><b>Level Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF = eINSTANCE.getGSSEnvironmentSpecialPacket_LevelRef();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER = eINSTANCE.getGSSEnvironmentSpecialPacket_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Upper Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS = eINSTANCE.getGSSEnvironmentSpecialPacket_UpperLevels();

		/**
		 * The meta object literal for the '<em><b>Printing Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA = eINSTANCE.getGSSEnvironmentSpecialPacket_PrintingData();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD = eINSTANCE.getGSSEnvironmentSpecialPacket_Period();

		/**
		 * The meta object literal for the '<em><b>Interval Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE = eINSTANCE.getGSSEnvironmentSpecialPacket_IntervalRange();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelsImpl <em>GSS Environment Upper Levels</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUpperLevels()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_UPPER_LEVELS = eINSTANCE.getGSSEnvironmentUpperLevels();

		/**
		 * The meta object literal for the '<em><b>Upper Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_UPPER_LEVELS__UPPER_LEVEL = eINSTANCE.getGSSEnvironmentUpperLevels_UpperLevel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl <em>GSS Environment Upper Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentUpperLevelImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUpperLevel()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_UPPER_LEVEL = eINSTANCE.getGSSEnvironmentUpperLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL = eINSTANCE.getGSSEnvironmentUpperLevel_Level();

		/**
		 * The meta object literal for the '<em><b>TMformat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT = eINSTANCE.getGSSEnvironmentUpperLevel_TMformat();

		/**
		 * The meta object literal for the '<em><b>Input Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER = eINSTANCE.getGSSEnvironmentUpperLevel_InputFilter();

		/**
		 * The meta object literal for the '<em><b>Import from prev Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL = eINSTANCE.getGSSEnvironmentUpperLevel_Import_from_prev_Level();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPrintingDataImpl <em>GSS Environment Printing Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPrintingDataImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPrintingData()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PRINTING_DATA = eINSTANCE.getGSSEnvironmentPrintingData();

		/**
		 * The meta object literal for the '<em><b>Print Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS = eINSTANCE.getGSSEnvironmentPrintingData_PrintStatus();

		/**
		 * The meta object literal for the '<em><b>Structured Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA = eINSTANCE.getGSSEnvironmentPrintingData_StructuredData();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentStructuredDataImpl <em>GSS Environment Structured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentStructuredDataImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentStructuredData()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_STRUCTURED_DATA = eINSTANCE.getGSSEnvironmentStructuredData();

		/**
		 * The meta object literal for the '<em><b>Level Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_STRUCTURED_DATA__LEVEL_REF = eINSTANCE.getGSSEnvironmentStructuredData_LevelRef();

		/**
		 * The meta object literal for the '<em><b>First Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_STRUCTURED_DATA__FIRST_FIELD = eINSTANCE.getGSSEnvironmentStructuredData_FirstField();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodImpl <em>GSS Environment Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriod()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PERIOD = eINSTANCE.getGSSEnvironmentPeriod();

		/**
		 * The meta object literal for the '<em><b>Min value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIOD__MIN_VALUE = eINSTANCE.getGSSEnvironmentPeriod_Min_value();

		/**
		 * The meta object literal for the '<em><b>Min unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIOD__MIN_UNIT = eINSTANCE.getGSSEnvironmentPeriod_Min_unit();

		/**
		 * The meta object literal for the '<em><b>Max value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIOD__MAX_VALUE = eINSTANCE.getGSSEnvironmentPeriod_Max_value();

		/**
		 * The meta object literal for the '<em><b>Max unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIOD__MAX_UNIT = eINSTANCE.getGSSEnvironmentPeriod_Max_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl <em>GSS Environment Interval Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentIntervalRangeImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentIntervalRange()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_INTERVAL_RANGE = eINSTANCE.getGSSEnvironmentIntervalRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERVAL_RANGE__MIN = eINSTANCE.getGSSEnvironmentIntervalRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERVAL_RANGE__MAX = eINSTANCE.getGSSEnvironmentIntervalRange_Max();

		/**
		 * The meta object literal for the '<em><b>Interval value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE = eINSTANCE.getGSSEnvironmentIntervalRange_Interval_value();

		/**
		 * The meta object literal for the '<em><b>Interval unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT = eINSTANCE.getGSSEnvironmentIntervalRange_Interval_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCsImpl <em>GSS Environment Periodic TCs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCs()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PERIODIC_TCS = eINSTANCE.getGSSEnvironmentPeriodicTCs();

		/**
		 * The meta object literal for the '<em><b>Periodic TC level 2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2 = eINSTANCE.getGSSEnvironmentPeriodicTCs_PeriodicTC_level_2();

		/**
		 * The meta object literal for the '<em><b>Periodic TC level 1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1 = eINSTANCE.getGSSEnvironmentPeriodicTCs_PeriodicTC_level_1();

		/**
		 * The meta object literal for the '<em><b>Periodic TC level 0</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0 = eINSTANCE.getGSSEnvironmentPeriodicTCs_PeriodicTC_level_0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCImpl <em>GSS Environment Periodic TC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTC()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PERIODIC_TC = eINSTANCE.getGSSEnvironmentPeriodicTC();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIODIC_TC__NAME = eINSTANCE.getGSSEnvironmentPeriodicTC_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIODIC_TC__ID = eINSTANCE.getGSSEnvironmentPeriodicTC_Id();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIODIC_TC__IF_REF = eINSTANCE.getGSSEnvironmentPeriodicTC_IfRef();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_VALUE = eINSTANCE.getGSSEnvironmentPeriodicTC_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_UNIT = eINSTANCE.getGSSEnvironmentPeriodicTC_Period_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl <em>GSS Environment Periodic TC Level2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel2Impl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCLevel2()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel2();

		/**
		 * The meta object literal for the '<em><b>Level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel2_Level2();

		/**
		 * The meta object literal for the '<em><b>App to level2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel2_App_to_level2();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel2_Level1();

		/**
		 * The meta object literal for the '<em><b>Level2 to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel2_Level2_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel2_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel2_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel1Impl <em>GSS Environment Periodic TC Level1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel1Impl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCLevel1()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel1();

		/**
		 * The meta object literal for the '<em><b>Level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL1 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel1_Level1();

		/**
		 * The meta object literal for the '<em><b>App to level1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel1_App_to_level1();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL0 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel1_Level0();

		/**
		 * The meta object literal for the '<em><b>Level1 to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel1_Level1_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel0Impl <em>GSS Environment Periodic TC Level0</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPeriodicTCLevel0Impl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPeriodicTCLevel0()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel0();

		/**
		 * The meta object literal for the '<em><b>Level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel0_Level0();

		/**
		 * The meta object literal for the '<em><b>App to level0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0 = eINSTANCE.getGSSEnvironmentPeriodicTCLevel0_App_to_level0();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarsImpl <em>GSS Environment Global Vars</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGlobalVars()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_GLOBAL_VARS = eINSTANCE.getGSSEnvironmentGlobalVars();

		/**
		 * The meta object literal for the '<em><b>Global Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR = eINSTANCE.getGSSEnvironmentGlobalVars_GlobalVar();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl <em>GSS Environment Global Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGlobalVarImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGlobalVar()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_GLOBAL_VAR = eINSTANCE.getGSSEnvironmentGlobalVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_GLOBAL_VAR__NAME = eINSTANCE.getGSSEnvironmentGlobalVar_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_GLOBAL_VAR__ID = eINSTANCE.getGSSEnvironmentGlobalVar_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_GLOBAL_VAR__TYPE = eINSTANCE.getGSSEnvironmentGlobalVar_Type();

		/**
		 * The meta object literal for the '<em><b>Initial value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE = eINSTANCE.getGSSEnvironmentGlobalVar_Initial_value();

		/**
		 * The meta object literal for the '<em><b>Reference Field</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD = eINSTANCE.getGSSEnvironmentGlobalVar_ReferenceField();

		/**
		 * The meta object literal for the '<em><b>Reference Periodic TC</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC = eINSTANCE.getGSSEnvironmentGlobalVar_ReferencePeriodicTC();

		/**
		 * The meta object literal for the '<em><b>Reference Special Packet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET = eINSTANCE.getGSSEnvironmentGlobalVar_ReferenceSpecialPacket();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceFieldImpl <em>GSS Environment Reference Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceFieldImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferenceField()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_REFERENCE_FIELD = eINSTANCE.getGSSEnvironmentReferenceField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_FIELD__TYPE = eINSTANCE.getGSSEnvironmentReferenceField_Type();

		/**
		 * The meta object literal for the '<em><b>If Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_FIELD__IF_REF = eINSTANCE.getGSSEnvironmentReferenceField_IfRef();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_FIELD__LEVEL = eINSTANCE.getGSSEnvironmentReferenceField_Level();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_FIELD__FIELD_REF = eINSTANCE.getGSSEnvironmentReferenceField_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_FIELD__OFFSET = eINSTANCE.getGSSEnvironmentReferenceField_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_FIELD__SIZE = eINSTANCE.getGSSEnvironmentReferenceField_Size();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferencePeriodicTCImpl <em>GSS Environment Reference Periodic TC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferencePeriodicTCImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferencePeriodicTC()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC = eINSTANCE.getGSSEnvironmentReferencePeriodicTC();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__ID_REF = eINSTANCE.getGSSEnvironmentReferencePeriodicTC_IdRef();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__LEVEL = eINSTANCE.getGSSEnvironmentReferencePeriodicTC_Level();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__FIELD_REF = eINSTANCE.getGSSEnvironmentReferencePeriodicTC_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__OFFSET = eINSTANCE.getGSSEnvironmentReferencePeriodicTC_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__SIZE = eINSTANCE.getGSSEnvironmentReferencePeriodicTC_Size();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl <em>GSS Environment Reference Special Packet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentReferenceSpecialPacketImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferenceSpecialPacket()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET = eINSTANCE.getGSSEnvironmentReferenceSpecialPacket();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF = eINSTANCE.getGSSEnvironmentReferenceSpecialPacket_IdRef();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL = eINSTANCE.getGSSEnvironmentReferenceSpecialPacket_Level();

		/**
		 * The meta object literal for the '<em><b>Field Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF = eINSTANCE.getGSSEnvironmentReferenceSpecialPacket_FieldRef();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET = eINSTANCE.getGSSEnvironmentReferenceSpecialPacket_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE = eINSTANCE.getGSSEnvironmentReferenceSpecialPacket_Size();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMonitorsImpl <em>GSS Environment Monitors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentMonitorsImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentMonitors()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_MONITORS = eINSTANCE.getGSSEnvironmentMonitors();

		/**
		 * The meta object literal for the '<em><b>Charts File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_MONITORS__CHARTS_FILE = eINSTANCE.getGSSEnvironmentMonitors_ChartsFile();

		/**
		 * The meta object literal for the '<em><b>Plot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_MONITORS__PLOT = eINSTANCE.getGSSEnvironmentMonitors_Plot();

		/**
		 * The meta object literal for the '<em><b>Alarm Msg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_MONITORS__ALARM_MSG = eINSTANCE.getGSSEnvironmentMonitors_AlarmMsg();

		/**
		 * The meta object literal for the '<em><b>Modify</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_MONITORS__MODIFY = eINSTANCE.getGSSEnvironmentMonitors_Modify();

		/**
		 * The meta object literal for the '<em><b>Alarm Val</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_MONITORS__ALARM_VAL = eINSTANCE.getGSSEnvironmentMonitors_AlarmVal();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl <em>GSS Environment Plot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentPlotImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentPlot()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_PLOT = eINSTANCE.getGSSEnvironmentPlot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_PLOT__NAME = eINSTANCE.getGSSEnvironmentPlot_Name();

		/**
		 * The meta object literal for the '<em><b>Chart Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PLOT__CHART_REF = eINSTANCE.getGSSEnvironmentPlot_ChartRef();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PLOT__GV_FILTERED = eINSTANCE.getGSSEnvironmentPlot_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_PLOT__GV_PERIODIC = eINSTANCE.getGSSEnvironmentPlot_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmMsgImpl <em>GSS Environment Alarm Msg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmMsgImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmMsg()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_ALARM_MSG = eINSTANCE.getGSSEnvironmentAlarmMsg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_ALARM_MSG__NAME = eINSTANCE.getGSSEnvironmentAlarmMsg_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_ALARM_MSG__TYPE = eINSTANCE.getGSSEnvironmentAlarmMsg_Type();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_ALARM_MSG__TEXT = eINSTANCE.getGSSEnvironmentAlarmMsg_Text();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_ALARM_MSG__GV_FILTERED = eINSTANCE.getGSSEnvironmentAlarmMsg_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_ALARM_MSG__GV_PERIODIC = eINSTANCE.getGSSEnvironmentAlarmMsg_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentModifyImpl <em>GSS Environment Modify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentModifyImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentModify()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_MODIFY = eINSTANCE.getGSSEnvironmentModify();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_MODIFY__NAME = eINSTANCE.getGSSEnvironmentModify_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_MODIFY__TYPE = eINSTANCE.getGSSEnvironmentModify_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_MODIFY__VALUE = eINSTANCE.getGSSEnvironmentModify_Value();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_MODIFY__GV_FILTERED = eINSTANCE.getGSSEnvironmentModify_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_MODIFY__GV_PERIODIC = eINSTANCE.getGSSEnvironmentModify_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmValImpl <em>GSS Environment Alarm Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentAlarmValImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmVal()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_ALARM_VAL = eINSTANCE.getGSSEnvironmentAlarmVal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_ALARM_VAL__NAME = eINSTANCE.getGSSEnvironmentAlarmVal_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_ALARM_VAL__TYPE = eINSTANCE.getGSSEnvironmentAlarmVal_Type();

		/**
		 * The meta object literal for the '<em><b>GV Filtered</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_ALARM_VAL__GV_FILTERED = eINSTANCE.getGSSEnvironmentAlarmVal_GVFiltered();

		/**
		 * The meta object literal for the '<em><b>GV Periodic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_ALARM_VAL__GV_PERIODIC = eINSTANCE.getGSSEnvironmentAlarmVal_GVPeriodic();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVFilteredImpl <em>GSS Environment GV Filtered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVFilteredImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGVFiltered()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_GV_FILTERED = eINSTANCE.getGSSEnvironmentGVFiltered();

		/**
		 * The meta object literal for the '<em><b>Global Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF = eINSTANCE.getGSSEnvironmentGVFiltered_GlobalVarRef();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_GV_FILTERED__FILTER = eINSTANCE.getGSSEnvironmentGVFiltered_Filter();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVPeriodicImpl <em>GSS Environment GV Periodic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.impl.GSSEnvironmentGVPeriodicImpl
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGVPeriodic()
		 * @generated
		 */
		EClass GSS_ENVIRONMENT_GV_PERIODIC = eINSTANCE.getGSSEnvironmentGVPeriodic();

		/**
		 * The meta object literal for the '<em><b>Global Var Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GSS_ENVIRONMENT_GV_PERIODIC__GLOBAL_VAR_REF = eINSTANCE.getGSSEnvironmentGVPeriodic_GlobalVarRef();

		/**
		 * The meta object literal for the '<em><b>Period value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_VALUE = eINSTANCE.getGSSEnvironmentGVPeriodic_Period_value();

		/**
		 * The meta object literal for the '<em><b>Period unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_UNIT = eINSTANCE.getGSSEnvironmentGVPeriodic_Period_unit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable <em>GSS Environment Enable Disable</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentEnableDisable()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_ENABLE_DISABLE = eINSTANCE.getGSSEnvironmentEnableDisable();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType <em>GSS Environment Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterfaceType()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_INTERFACE_TYPE = eINSTANCE.getGSSEnvironmentInterfaceType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType <em>GSS Environment Interface IO Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentInterfaceIOType()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_INTERFACE_IO_TYPE = eINSTANCE.getGSSEnvironmentInterfaceIOType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel <em>GSS Environment Upper Level Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUpperLevelLevel()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_UPPER_LEVEL_LEVEL = eINSTANCE.getGSSEnvironmentUpperLevelLevel();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentUnit <em>GSS Environment Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentUnit
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentUnit()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_UNIT = eINSTANCE.getGSSEnvironmentUnit();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType <em>GSS Environment Global Var Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentGlobalVarType()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_GLOBAL_VAR_TYPE = eINSTANCE.getGSSEnvironmentGlobalVarType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType <em>GSS Environment Reference Field Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentReferenceFieldType()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_REFERENCE_FIELD_TYPE = eINSTANCE.getGSSEnvironmentReferenceFieldType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsgType <em>GSS Environment Alarm Msg Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsgType
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmMsgType()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_ALARM_MSG_TYPE = eINSTANCE.getGSSEnvironmentAlarmMsgType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType <em>GSS Environment Modify Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentModifyType()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_MODIFY_TYPE = eINSTANCE.getGSSEnvironmentModifyType();

		/**
		 * The meta object literal for the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType <em>GSS Environment Alarm Val Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType
		 * @see es.uah.aut.srg.gss.environment.impl.environmentPackageImpl#getGSSEnvironmentAlarmValType()
		 * @generated
		 */
		EEnum GSS_ENVIRONMENT_ALARM_VAL_TYPE = eINSTANCE.getGSSEnvironmentAlarmValType();

	}

} //environmentPackage
