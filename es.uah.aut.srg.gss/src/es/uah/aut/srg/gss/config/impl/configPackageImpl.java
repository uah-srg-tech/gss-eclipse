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
package es.uah.aut.srg.gss.config.impl;

import es.uah.aut.srg.gss.charts.chartsPackage;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.config.GSSConfigAlarmMsg;
import es.uah.aut.srg.gss.config.GSSConfigAlarmMsgType;
import es.uah.aut.srg.gss.config.GSSConfigAlarmVal;
import es.uah.aut.srg.gss.config.GSSConfigAlarmValType;
import es.uah.aut.srg.gss.config.GSSConfigEnableDisable;
import es.uah.aut.srg.gss.config.GSSConfigGSSConfig;
import es.uah.aut.srg.gss.config.GSSConfigGSSDiscardErrorFlags;
import es.uah.aut.srg.gss.config.GSSConfigGSSInfo;
import es.uah.aut.srg.gss.config.GSSConfigGSSInfoPrint;
import es.uah.aut.srg.gss.config.GSSConfigGSSOptions;
import es.uah.aut.srg.gss.config.GSSConfigGVFiltered;
import es.uah.aut.srg.gss.config.GSSConfigGVPeriodic;
import es.uah.aut.srg.gss.config.GSSConfigGlobalVar;
import es.uah.aut.srg.gss.config.GSSConfigGlobalVarType;
import es.uah.aut.srg.gss.config.GSSConfigGlobalVars;
import es.uah.aut.srg.gss.config.GSSConfigInterface;
import es.uah.aut.srg.gss.config.GSSConfigInterfaceIOType;
import es.uah.aut.srg.gss.config.GSSConfigInterfaceType;
import es.uah.aut.srg.gss.config.GSSConfigInterfaces;
import es.uah.aut.srg.gss.config.GSSConfigIntervalRange;
import es.uah.aut.srg.gss.config.GSSConfigLevelIn;
import es.uah.aut.srg.gss.config.GSSConfigLevelInOut;
import es.uah.aut.srg.gss.config.GSSConfigLevelOut;
import es.uah.aut.srg.gss.config.GSSConfigMainInterface;
import es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType;
import es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType;
import es.uah.aut.srg.gss.config.GSSConfigModify;
import es.uah.aut.srg.gss.config.GSSConfigModifyType;
import es.uah.aut.srg.gss.config.GSSConfigMonitors;
import es.uah.aut.srg.gss.config.GSSConfigPeriod;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel0;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel1;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCLevel2;
import es.uah.aut.srg.gss.config.GSSConfigPeriodicTCs;
import es.uah.aut.srg.gss.config.GSSConfigPhyHeaderPrint;
import es.uah.aut.srg.gss.config.GSSConfigPlot;
import es.uah.aut.srg.gss.config.GSSConfigPrintingData;
import es.uah.aut.srg.gss.config.GSSConfigProtocol;
import es.uah.aut.srg.gss.config.GSSConfigProtocols;
import es.uah.aut.srg.gss.config.GSSConfigReferenceField;
import es.uah.aut.srg.gss.config.GSSConfigReferenceFieldType;
import es.uah.aut.srg.gss.config.GSSConfigReferencePeriodicTC;
import es.uah.aut.srg.gss.config.GSSConfigReferenceSpecialPacket;
import es.uah.aut.srg.gss.config.GSSConfigReqAction;
import es.uah.aut.srg.gss.config.GSSConfigSpecialPacket;
import es.uah.aut.srg.gss.config.GSSConfigSpecialPackets;
import es.uah.aut.srg.gss.config.GSSConfigStructuredData;
import es.uah.aut.srg.gss.config.GSSConfigTestCase;
import es.uah.aut.srg.gss.config.GSSConfigTests;
import es.uah.aut.srg.gss.config.GSSConfigUnit;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevel;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel;
import es.uah.aut.srg.gss.config.GSSConfigUpperLevels;
import es.uah.aut.srg.gss.config.configFactory;
import es.uah.aut.srg.gss.config.configPackage;
import es.uah.aut.srg.gss.iface.ifacePackage;
import es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage;

import es.uah.aut.srg.gss.test_proc.test_procPackage;
import es.uah.aut.srg.tmtcif.export.exportPackage;
import es.uah.aut.srg.tmtcif.filter.filterPackage;
import es.uah.aut.srg.tmtcif.format.formatPackage;
import es.uah.aut.srg.tmtcif.import_.importPackage;
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
public class configPackageImpl extends EPackageImpl implements configPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGSSConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGSSOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGSSInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGSSInfoPrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPhyHeaderPrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGSSDiscardErrorFlagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigProtocolsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigMainInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigLevelInOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigLevelInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigLevelOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigSpecialPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigSpecialPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigUpperLevelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigUpperLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPrintingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigStructuredDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigIntervalRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPeriodicTCsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPeriodicTCLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPeriodicTCLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPeriodicTCLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGlobalVarsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGlobalVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigReferenceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigReferencePeriodicTCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigReferenceSpecialPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigMonitorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigAlarmMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigModifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigAlarmValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGVFilteredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigGVPeriodicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigTestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssConfigTestCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigEnableDisableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigMainInterfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigMainInterfaceIOTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigInterfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigInterfaceIOTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigUpperLevelLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigGlobalVarTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigReferenceFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigAlarmMsgTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigModifyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigAlarmValTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssConfigReqActionEEnum = null;

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
	 * @see es.uah.aut.srg.gss.config.configPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private configPackageImpl() {
		super(eNS_URI, configFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link configPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static configPackage init() {
		if (isInited) return (configPackage)EPackage.Registry.INSTANCE.getEPackage(configPackage.eNS_URI);

		// Obtain or create and register package
		configPackageImpl theconfigPackage = (configPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof configPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new configPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		chartsPackage.eINSTANCE.eClass();
		ifacePackage.eINSTANCE.eClass();
		protocol_packetsPackage.eINSTANCE.eClass();
		test_procPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theconfigPackage.createPackageContents();

		// Initialize created meta-data
		theconfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theconfigPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(configPackage.eNS_URI, theconfigPackage);
		return theconfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGSSConfig() {
		return gssConfigGSSConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_Gss_options() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_Protocols() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_Interfaces() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_SpecialPackets() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_PeriodicTCs() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_GlobalVars() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_Monitors() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSConfig_Tests() {
		return (EReference)gssConfigGSSConfigEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGSSOptions() {
		return gssConfigGSSOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSOptions_Gss_info() {
		return (EReference)gssConfigGSSOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSOptions_Gss_info_print() {
		return (EReference)gssConfigGSSOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSOptions_Phy_header_print() {
		return (EReference)gssConfigGSSOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGSSOptions_DiscardErrorFlags() {
		return (EReference)gssConfigGSSOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGSSInfo() {
		return gssConfigGSSInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSInfo_Test_campaign() {
		return (EAttribute)gssConfigGSSInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSInfo_Version() {
		return (EAttribute)gssConfigGSSInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSInfo_Date() {
		return (EAttribute)gssConfigGSSInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSInfo_Version_control_url() {
		return (EAttribute)gssConfigGSSInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGSSInfoPrint() {
		return gssConfigGSSInfoPrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSInfoPrint_MainLog() {
		return (EAttribute)gssConfigGSSInfoPrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSInfoPrint_PortLogs() {
		return (EAttribute)gssConfigGSSInfoPrintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSInfoPrint_RawLog() {
		return (EAttribute)gssConfigGSSInfoPrintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPhyHeaderPrint() {
		return gssConfigPhyHeaderPrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPhyHeaderPrint_MainLog() {
		return (EAttribute)gssConfigPhyHeaderPrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPhyHeaderPrint_PortLogs() {
		return (EAttribute)gssConfigPhyHeaderPrintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPhyHeaderPrint_RawLog() {
		return (EAttribute)gssConfigPhyHeaderPrintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPhyHeaderPrint_GssTabs() {
		return (EAttribute)gssConfigPhyHeaderPrintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGSSDiscardErrorFlags() {
		return gssConfigGSSDiscardErrorFlagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSDiscardErrorFlags_TxErrors() {
		return (EAttribute)gssConfigGSSDiscardErrorFlagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSDiscardErrorFlags_NotExpectedPackets() {
		return (EAttribute)gssConfigGSSDiscardErrorFlagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSDiscardErrorFlags_FiltersKo() {
		return (EAttribute)gssConfigGSSDiscardErrorFlagsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGSSDiscardErrorFlags_ValidTimesKo() {
		return (EAttribute)gssConfigGSSDiscardErrorFlagsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigProtocols() {
		return gssConfigProtocolsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigProtocols_Protocol() {
		return (EReference)gssConfigProtocolsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigProtocol() {
		return gssConfigProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigProtocol_Id() {
		return (EAttribute)gssConfigProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigProtocol_Name() {
		return (EAttribute)gssConfigProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigProtocol_TypeLevel() {
		return (EAttribute)gssConfigProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigProtocol_TypeOffset() {
		return (EAttribute)gssConfigProtocolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigProtocol_SubtypeOffset() {
		return (EAttribute)gssConfigProtocolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigInterfaces() {
		return gssConfigInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigInterfaces_MainInterface() {
		return (EReference)gssConfigInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigInterfaces_Interface() {
		return (EReference)gssConfigInterfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigMainInterface() {
		return gssConfigMainInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigMainInterface_Id() {
		return (EAttribute)gssConfigMainInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigMainInterface_Name() {
		return (EAttribute)gssConfigMainInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigMainInterface_IfType() {
		return (EAttribute)gssConfigMainInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMainInterface_IfConfig() {
		return (EReference)gssConfigMainInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigMainInterface_IoType() {
		return (EAttribute)gssConfigMainInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMainInterface_ProtocolID() {
		return (EReference)gssConfigMainInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMainInterface_LevelInOut() {
		return (EReference)gssConfigMainInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigInterface() {
		return gssConfigInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigInterface_Id() {
		return (EAttribute)gssConfigInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigInterface_Name() {
		return (EAttribute)gssConfigInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigInterface_IfType() {
		return (EAttribute)gssConfigInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigInterface_IfConfig() {
		return (EReference)gssConfigInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigInterface_IoType() {
		return (EAttribute)gssConfigInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigInterface_ProtocolID() {
		return (EReference)gssConfigInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigInterface_LevelInOut() {
		return (EReference)gssConfigInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigInterface_LevelIn() {
		return (EReference)gssConfigInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigInterface_LevelOut() {
		return (EReference)gssConfigInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigLevelInOut() {
		return gssConfigLevelInOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigLevelInOut_Id() {
		return (EAttribute)gssConfigLevelInOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigLevelInOut_Name() {
		return (EAttribute)gssConfigLevelInOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelInOut_TMformat() {
		return (EReference)gssConfigLevelInOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelInOut_TCformat() {
		return (EReference)gssConfigLevelInOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelInOut_InputFilter() {
		return (EReference)gssConfigLevelInOutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelInOut_Export_to_prev_Level() {
		return (EReference)gssConfigLevelInOutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelInOut_Import_from_prev_Level() {
		return (EReference)gssConfigLevelInOutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigLevelIn() {
		return gssConfigLevelInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigLevelIn_Id() {
		return (EAttribute)gssConfigLevelInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigLevelIn_Name() {
		return (EAttribute)gssConfigLevelInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelIn_TCformat() {
		return (EReference)gssConfigLevelInEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelIn_Export_to_prev_Level() {
		return (EReference)gssConfigLevelInEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigLevelOut() {
		return gssConfigLevelOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigLevelOut_Id() {
		return (EAttribute)gssConfigLevelOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigLevelOut_Name() {
		return (EAttribute)gssConfigLevelOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelOut_TMformat() {
		return (EReference)gssConfigLevelOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelOut_InputFilter() {
		return (EReference)gssConfigLevelOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigLevelOut_Import_from_prev_Level() {
		return (EReference)gssConfigLevelOutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigSpecialPackets() {
		return gssConfigSpecialPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigSpecialPackets_SpecialPacket() {
		return (EReference)gssConfigSpecialPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigSpecialPacket() {
		return gssConfigSpecialPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigSpecialPacket_Status() {
		return (EAttribute)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigSpecialPacket_Name() {
		return (EAttribute)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigSpecialPacket_Id() {
		return (EAttribute)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigSpecialPacket_IfRef() {
		return (EAttribute)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigSpecialPacket_Levels() {
		return (EAttribute)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigSpecialPacket_LevelRef() {
		return (EAttribute)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigSpecialPacket_InputFilter() {
		return (EReference)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigSpecialPacket_UpperLevels() {
		return (EReference)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigSpecialPacket_PrintingData() {
		return (EReference)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigSpecialPacket_Period() {
		return (EReference)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigSpecialPacket_IntervalRange() {
		return (EReference)gssConfigSpecialPacketEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigUpperLevels() {
		return gssConfigUpperLevelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigUpperLevels_UpperLevel() {
		return (EReference)gssConfigUpperLevelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigUpperLevel() {
		return gssConfigUpperLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigUpperLevel_Level() {
		return (EAttribute)gssConfigUpperLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigUpperLevel_TMformat() {
		return (EReference)gssConfigUpperLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigUpperLevel_InputFilter() {
		return (EReference)gssConfigUpperLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigUpperLevel_Import_from_prev_Level() {
		return (EReference)gssConfigUpperLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPrintingData() {
		return gssConfigPrintingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPrintingData_PrintStatus() {
		return (EAttribute)gssConfigPrintingDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPrintingData_StructuredData() {
		return (EReference)gssConfigPrintingDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigStructuredData() {
		return gssConfigStructuredDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigStructuredData_LevelRef() {
		return (EAttribute)gssConfigStructuredDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigStructuredData_FirstField() {
		return (EAttribute)gssConfigStructuredDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPeriod() {
		return gssConfigPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriod_Min_value() {
		return (EAttribute)gssConfigPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriod_Min_unit() {
		return (EAttribute)gssConfigPeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriod_Max_value() {
		return (EAttribute)gssConfigPeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriod_Max_unit() {
		return (EAttribute)gssConfigPeriodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigIntervalRange() {
		return gssConfigIntervalRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigIntervalRange_Min() {
		return (EAttribute)gssConfigIntervalRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigIntervalRange_Max() {
		return (EAttribute)gssConfigIntervalRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigIntervalRange_Interval_value() {
		return (EAttribute)gssConfigIntervalRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigIntervalRange_Interval_unit() {
		return (EAttribute)gssConfigIntervalRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPeriodicTCs() {
		return gssConfigPeriodicTCsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCs_PeriodicTC_level_2() {
		return (EReference)gssConfigPeriodicTCsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCs_PeriodicTC_level_1() {
		return (EReference)gssConfigPeriodicTCsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCs_PeriodicTC_level_0() {
		return (EReference)gssConfigPeriodicTCsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPeriodicTCLevel2() {
		return gssConfigPeriodicTCLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel2_Name() {
		return (EAttribute)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel2_Id() {
		return (EAttribute)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel2_IfRef() {
		return (EAttribute)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel2_Period_value() {
		return (EAttribute)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel2_Period_unit() {
		return (EAttribute)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel2_Level2() {
		return (EReference)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel2_App_to_level2() {
		return (EReference)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel2_Level1() {
		return (EReference)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel2_Level2_to_level1() {
		return (EReference)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel2_Level0() {
		return (EReference)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel2_Level1_to_level0() {
		return (EReference)gssConfigPeriodicTCLevel2EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPeriodicTCLevel1() {
		return gssConfigPeriodicTCLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel1_Name() {
		return (EAttribute)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel1_Id() {
		return (EAttribute)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel1_IfRef() {
		return (EAttribute)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel1_Period_value() {
		return (EAttribute)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel1_Period_unit() {
		return (EAttribute)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel1_Level1() {
		return (EReference)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel1_App_to_level1() {
		return (EReference)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel1_Level0() {
		return (EReference)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel1_Level1_to_level0() {
		return (EReference)gssConfigPeriodicTCLevel1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPeriodicTCLevel0() {
		return gssConfigPeriodicTCLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel0_Name() {
		return (EAttribute)gssConfigPeriodicTCLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel0_Id() {
		return (EAttribute)gssConfigPeriodicTCLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel0_IfRef() {
		return (EAttribute)gssConfigPeriodicTCLevel0EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel0_Period_value() {
		return (EAttribute)gssConfigPeriodicTCLevel0EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPeriodicTCLevel0_Period_unit() {
		return (EAttribute)gssConfigPeriodicTCLevel0EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel0_Level0() {
		return (EReference)gssConfigPeriodicTCLevel0EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPeriodicTCLevel0_App_to_level0() {
		return (EReference)gssConfigPeriodicTCLevel0EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGlobalVars() {
		return gssConfigGlobalVarsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGlobalVars_GlobalVar() {
		return (EReference)gssConfigGlobalVarsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGlobalVar() {
		return gssConfigGlobalVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGlobalVar_Name() {
		return (EAttribute)gssConfigGlobalVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGlobalVar_Id() {
		return (EAttribute)gssConfigGlobalVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGlobalVar_Type() {
		return (EAttribute)gssConfigGlobalVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGlobalVar_Initial_value() {
		return (EAttribute)gssConfigGlobalVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGlobalVar_ReferenceField() {
		return (EReference)gssConfigGlobalVarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGlobalVar_ReferencePeriodicTC() {
		return (EReference)gssConfigGlobalVarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGlobalVar_ReferenceSpecialPacket() {
		return (EReference)gssConfigGlobalVarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigReferenceField() {
		return gssConfigReferenceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceField_Type() {
		return (EAttribute)gssConfigReferenceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceField_IfRef() {
		return (EAttribute)gssConfigReferenceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceField_Level() {
		return (EAttribute)gssConfigReferenceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceField_FieldRef() {
		return (EAttribute)gssConfigReferenceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceField_Offset() {
		return (EAttribute)gssConfigReferenceFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceField_Size() {
		return (EAttribute)gssConfigReferenceFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigReferencePeriodicTC() {
		return gssConfigReferencePeriodicTCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferencePeriodicTC_IdRef() {
		return (EAttribute)gssConfigReferencePeriodicTCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferencePeriodicTC_Level() {
		return (EAttribute)gssConfigReferencePeriodicTCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferencePeriodicTC_FieldRef() {
		return (EAttribute)gssConfigReferencePeriodicTCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferencePeriodicTC_Offset() {
		return (EAttribute)gssConfigReferencePeriodicTCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferencePeriodicTC_Size() {
		return (EAttribute)gssConfigReferencePeriodicTCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigReferenceSpecialPacket() {
		return gssConfigReferenceSpecialPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceSpecialPacket_IdRef() {
		return (EAttribute)gssConfigReferenceSpecialPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceSpecialPacket_Level() {
		return (EAttribute)gssConfigReferenceSpecialPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceSpecialPacket_FieldRef() {
		return (EAttribute)gssConfigReferenceSpecialPacketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceSpecialPacket_Offset() {
		return (EAttribute)gssConfigReferenceSpecialPacketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigReferenceSpecialPacket_Size() {
		return (EAttribute)gssConfigReferenceSpecialPacketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigMonitors() {
		return gssConfigMonitorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMonitors_ChartsFile() {
		return (EReference)gssConfigMonitorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMonitors_Plot() {
		return (EReference)gssConfigMonitorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMonitors_AlarmMsg() {
		return (EReference)gssConfigMonitorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMonitors_Modify() {
		return (EReference)gssConfigMonitorsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigMonitors_AlarmVal() {
		return (EReference)gssConfigMonitorsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigPlot() {
		return gssConfigPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigPlot_Name() {
		return (EAttribute)gssConfigPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPlot_ChartRef() {
		return (EReference)gssConfigPlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPlot_GVFiltered() {
		return (EReference)gssConfigPlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigPlot_GVPeriodic() {
		return (EReference)gssConfigPlotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigAlarmMsg() {
		return gssConfigAlarmMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigAlarmMsg_Name() {
		return (EAttribute)gssConfigAlarmMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigAlarmMsg_Type() {
		return (EAttribute)gssConfigAlarmMsgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigAlarmMsg_Text() {
		return (EAttribute)gssConfigAlarmMsgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigAlarmMsg_GVFiltered() {
		return (EReference)gssConfigAlarmMsgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigAlarmMsg_GVPeriodic() {
		return (EReference)gssConfigAlarmMsgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigModify() {
		return gssConfigModifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigModify_Name() {
		return (EAttribute)gssConfigModifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigModify_Type() {
		return (EAttribute)gssConfigModifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigModify_Value() {
		return (EAttribute)gssConfigModifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigModify_GVFiltered() {
		return (EReference)gssConfigModifyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigModify_GVPeriodic() {
		return (EReference)gssConfigModifyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigAlarmVal() {
		return gssConfigAlarmValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigAlarmVal_Name() {
		return (EAttribute)gssConfigAlarmValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigAlarmVal_Type() {
		return (EAttribute)gssConfigAlarmValEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigAlarmVal_GVFiltered() {
		return (EReference)gssConfigAlarmValEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigAlarmVal_GVPeriodic() {
		return (EReference)gssConfigAlarmValEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGVFiltered() {
		return gssConfigGVFilteredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGVFiltered_GlobalVarRef() {
		return (EReference)gssConfigGVFilteredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGVFiltered_Filter() {
		return (EReference)gssConfigGVFilteredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigGVPeriodic() {
		return gssConfigGVPeriodicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigGVPeriodic_GlobalVarRef() {
		return (EReference)gssConfigGVPeriodicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGVPeriodic_Period_value() {
		return (EAttribute)gssConfigGVPeriodicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigGVPeriodic_Period_unit() {
		return (EAttribute)gssConfigGVPeriodicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigTests() {
		return gssConfigTestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigTests_ProtocolPacketsFile() {
		return (EReference)gssConfigTestsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigTests_TestCase() {
		return (EReference)gssConfigTestsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSConfigTestCase() {
		return gssConfigTestCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigTestCase_Name() {
		return (EAttribute)gssConfigTestCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSConfigTestCase_Procedure() {
		return (EReference)gssConfigTestCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigTestCase_Req() {
		return (EAttribute)gssConfigTestCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSConfigTestCase_ReqAction() {
		return (EAttribute)gssConfigTestCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigEnableDisable() {
		return gssConfigEnableDisableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigMainInterfaceType() {
		return gssConfigMainInterfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigMainInterfaceIOType() {
		return gssConfigMainInterfaceIOTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigInterfaceType() {
		return gssConfigInterfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigInterfaceIOType() {
		return gssConfigInterfaceIOTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigUpperLevelLevel() {
		return gssConfigUpperLevelLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigUnit() {
		return gssConfigUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigGlobalVarType() {
		return gssConfigGlobalVarTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigReferenceFieldType() {
		return gssConfigReferenceFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigAlarmMsgType() {
		return gssConfigAlarmMsgTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigModifyType() {
		return gssConfigModifyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigAlarmValType() {
		return gssConfigAlarmValTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSConfigReqAction() {
		return gssConfigReqActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configFactory getconfigFactory() {
		return (configFactory)getEFactoryInstance();
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
		gssConfigGSSConfigEClass = createEClass(GSS_CONFIG_GSS_CONFIG);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__GSS_OPTIONS);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__PROTOCOLS);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__INTERFACES);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__SPECIAL_PACKETS);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__PERIODIC_TCS);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__GLOBAL_VARS);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__MONITORS);
		createEReference(gssConfigGSSConfigEClass, GSS_CONFIG_GSS_CONFIG__TESTS);

		gssConfigGSSOptionsEClass = createEClass(GSS_CONFIG_GSS_OPTIONS);
		createEReference(gssConfigGSSOptionsEClass, GSS_CONFIG_GSS_OPTIONS__GSS_INFO);
		createEReference(gssConfigGSSOptionsEClass, GSS_CONFIG_GSS_OPTIONS__GSS_INFO_PRINT);
		createEReference(gssConfigGSSOptionsEClass, GSS_CONFIG_GSS_OPTIONS__PHY_HEADER_PRINT);
		createEReference(gssConfigGSSOptionsEClass, GSS_CONFIG_GSS_OPTIONS__DISCARD_ERROR_FLAGS);

		gssConfigGSSInfoEClass = createEClass(GSS_CONFIG_GSS_INFO);
		createEAttribute(gssConfigGSSInfoEClass, GSS_CONFIG_GSS_INFO__TEST_CAMPAIGN);
		createEAttribute(gssConfigGSSInfoEClass, GSS_CONFIG_GSS_INFO__VERSION);
		createEAttribute(gssConfigGSSInfoEClass, GSS_CONFIG_GSS_INFO__DATE);
		createEAttribute(gssConfigGSSInfoEClass, GSS_CONFIG_GSS_INFO__VERSION_CONTROL_URL);

		gssConfigGSSInfoPrintEClass = createEClass(GSS_CONFIG_GSS_INFO_PRINT);
		createEAttribute(gssConfigGSSInfoPrintEClass, GSS_CONFIG_GSS_INFO_PRINT__MAIN_LOG);
		createEAttribute(gssConfigGSSInfoPrintEClass, GSS_CONFIG_GSS_INFO_PRINT__PORT_LOGS);
		createEAttribute(gssConfigGSSInfoPrintEClass, GSS_CONFIG_GSS_INFO_PRINT__RAW_LOG);

		gssConfigPhyHeaderPrintEClass = createEClass(GSS_CONFIG_PHY_HEADER_PRINT);
		createEAttribute(gssConfigPhyHeaderPrintEClass, GSS_CONFIG_PHY_HEADER_PRINT__MAIN_LOG);
		createEAttribute(gssConfigPhyHeaderPrintEClass, GSS_CONFIG_PHY_HEADER_PRINT__PORT_LOGS);
		createEAttribute(gssConfigPhyHeaderPrintEClass, GSS_CONFIG_PHY_HEADER_PRINT__RAW_LOG);
		createEAttribute(gssConfigPhyHeaderPrintEClass, GSS_CONFIG_PHY_HEADER_PRINT__GSS_TABS);

		gssConfigGSSDiscardErrorFlagsEClass = createEClass(GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS);
		createEAttribute(gssConfigGSSDiscardErrorFlagsEClass, GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__TX_ERRORS);
		createEAttribute(gssConfigGSSDiscardErrorFlagsEClass, GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS);
		createEAttribute(gssConfigGSSDiscardErrorFlagsEClass, GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__FILTERS_KO);
		createEAttribute(gssConfigGSSDiscardErrorFlagsEClass, GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS__VALID_TIMES_KO);

		gssConfigProtocolsEClass = createEClass(GSS_CONFIG_PROTOCOLS);
		createEReference(gssConfigProtocolsEClass, GSS_CONFIG_PROTOCOLS__PROTOCOL);

		gssConfigProtocolEClass = createEClass(GSS_CONFIG_PROTOCOL);
		createEAttribute(gssConfigProtocolEClass, GSS_CONFIG_PROTOCOL__ID);
		createEAttribute(gssConfigProtocolEClass, GSS_CONFIG_PROTOCOL__NAME);
		createEAttribute(gssConfigProtocolEClass, GSS_CONFIG_PROTOCOL__TYPE_LEVEL);
		createEAttribute(gssConfigProtocolEClass, GSS_CONFIG_PROTOCOL__TYPE_OFFSET);
		createEAttribute(gssConfigProtocolEClass, GSS_CONFIG_PROTOCOL__SUBTYPE_OFFSET);

		gssConfigInterfacesEClass = createEClass(GSS_CONFIG_INTERFACES);
		createEReference(gssConfigInterfacesEClass, GSS_CONFIG_INTERFACES__MAIN_INTERFACE);
		createEReference(gssConfigInterfacesEClass, GSS_CONFIG_INTERFACES__INTERFACE);

		gssConfigMainInterfaceEClass = createEClass(GSS_CONFIG_MAIN_INTERFACE);
		createEAttribute(gssConfigMainInterfaceEClass, GSS_CONFIG_MAIN_INTERFACE__ID);
		createEAttribute(gssConfigMainInterfaceEClass, GSS_CONFIG_MAIN_INTERFACE__NAME);
		createEAttribute(gssConfigMainInterfaceEClass, GSS_CONFIG_MAIN_INTERFACE__IF_TYPE);
		createEReference(gssConfigMainInterfaceEClass, GSS_CONFIG_MAIN_INTERFACE__IF_CONFIG);
		createEAttribute(gssConfigMainInterfaceEClass, GSS_CONFIG_MAIN_INTERFACE__IO_TYPE);
		createEReference(gssConfigMainInterfaceEClass, GSS_CONFIG_MAIN_INTERFACE__PROTOCOL_ID);
		createEReference(gssConfigMainInterfaceEClass, GSS_CONFIG_MAIN_INTERFACE__LEVEL_IN_OUT);

		gssConfigInterfaceEClass = createEClass(GSS_CONFIG_INTERFACE);
		createEAttribute(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__ID);
		createEAttribute(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__NAME);
		createEAttribute(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__IF_TYPE);
		createEReference(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__IF_CONFIG);
		createEAttribute(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__IO_TYPE);
		createEReference(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__PROTOCOL_ID);
		createEReference(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__LEVEL_IN_OUT);
		createEReference(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__LEVEL_IN);
		createEReference(gssConfigInterfaceEClass, GSS_CONFIG_INTERFACE__LEVEL_OUT);

		gssConfigLevelInOutEClass = createEClass(GSS_CONFIG_LEVEL_IN_OUT);
		createEAttribute(gssConfigLevelInOutEClass, GSS_CONFIG_LEVEL_IN_OUT__ID);
		createEAttribute(gssConfigLevelInOutEClass, GSS_CONFIG_LEVEL_IN_OUT__NAME);
		createEReference(gssConfigLevelInOutEClass, GSS_CONFIG_LEVEL_IN_OUT__TMFORMAT);
		createEReference(gssConfigLevelInOutEClass, GSS_CONFIG_LEVEL_IN_OUT__TCFORMAT);
		createEReference(gssConfigLevelInOutEClass, GSS_CONFIG_LEVEL_IN_OUT__INPUT_FILTER);
		createEReference(gssConfigLevelInOutEClass, GSS_CONFIG_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL);
		createEReference(gssConfigLevelInOutEClass, GSS_CONFIG_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL);

		gssConfigLevelInEClass = createEClass(GSS_CONFIG_LEVEL_IN);
		createEAttribute(gssConfigLevelInEClass, GSS_CONFIG_LEVEL_IN__ID);
		createEAttribute(gssConfigLevelInEClass, GSS_CONFIG_LEVEL_IN__NAME);
		createEReference(gssConfigLevelInEClass, GSS_CONFIG_LEVEL_IN__TCFORMAT);
		createEReference(gssConfigLevelInEClass, GSS_CONFIG_LEVEL_IN__EXPORT_TO_PREV_LEVEL);

		gssConfigLevelOutEClass = createEClass(GSS_CONFIG_LEVEL_OUT);
		createEAttribute(gssConfigLevelOutEClass, GSS_CONFIG_LEVEL_OUT__ID);
		createEAttribute(gssConfigLevelOutEClass, GSS_CONFIG_LEVEL_OUT__NAME);
		createEReference(gssConfigLevelOutEClass, GSS_CONFIG_LEVEL_OUT__TMFORMAT);
		createEReference(gssConfigLevelOutEClass, GSS_CONFIG_LEVEL_OUT__INPUT_FILTER);
		createEReference(gssConfigLevelOutEClass, GSS_CONFIG_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL);

		gssConfigSpecialPacketsEClass = createEClass(GSS_CONFIG_SPECIAL_PACKETS);
		createEReference(gssConfigSpecialPacketsEClass, GSS_CONFIG_SPECIAL_PACKETS__SPECIAL_PACKET);

		gssConfigSpecialPacketEClass = createEClass(GSS_CONFIG_SPECIAL_PACKET);
		createEAttribute(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__STATUS);
		createEAttribute(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__NAME);
		createEAttribute(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__ID);
		createEAttribute(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__IF_REF);
		createEAttribute(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__LEVELS);
		createEAttribute(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__LEVEL_REF);
		createEReference(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__INPUT_FILTER);
		createEReference(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__UPPER_LEVELS);
		createEReference(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__PRINTING_DATA);
		createEReference(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__PERIOD);
		createEReference(gssConfigSpecialPacketEClass, GSS_CONFIG_SPECIAL_PACKET__INTERVAL_RANGE);

		gssConfigUpperLevelsEClass = createEClass(GSS_CONFIG_UPPER_LEVELS);
		createEReference(gssConfigUpperLevelsEClass, GSS_CONFIG_UPPER_LEVELS__UPPER_LEVEL);

		gssConfigUpperLevelEClass = createEClass(GSS_CONFIG_UPPER_LEVEL);
		createEAttribute(gssConfigUpperLevelEClass, GSS_CONFIG_UPPER_LEVEL__LEVEL);
		createEReference(gssConfigUpperLevelEClass, GSS_CONFIG_UPPER_LEVEL__TMFORMAT);
		createEReference(gssConfigUpperLevelEClass, GSS_CONFIG_UPPER_LEVEL__INPUT_FILTER);
		createEReference(gssConfigUpperLevelEClass, GSS_CONFIG_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL);

		gssConfigPrintingDataEClass = createEClass(GSS_CONFIG_PRINTING_DATA);
		createEAttribute(gssConfigPrintingDataEClass, GSS_CONFIG_PRINTING_DATA__PRINT_STATUS);
		createEReference(gssConfigPrintingDataEClass, GSS_CONFIG_PRINTING_DATA__STRUCTURED_DATA);

		gssConfigStructuredDataEClass = createEClass(GSS_CONFIG_STRUCTURED_DATA);
		createEAttribute(gssConfigStructuredDataEClass, GSS_CONFIG_STRUCTURED_DATA__LEVEL_REF);
		createEAttribute(gssConfigStructuredDataEClass, GSS_CONFIG_STRUCTURED_DATA__FIRST_FIELD);

		gssConfigPeriodEClass = createEClass(GSS_CONFIG_PERIOD);
		createEAttribute(gssConfigPeriodEClass, GSS_CONFIG_PERIOD__MIN_VALUE);
		createEAttribute(gssConfigPeriodEClass, GSS_CONFIG_PERIOD__MIN_UNIT);
		createEAttribute(gssConfigPeriodEClass, GSS_CONFIG_PERIOD__MAX_VALUE);
		createEAttribute(gssConfigPeriodEClass, GSS_CONFIG_PERIOD__MAX_UNIT);

		gssConfigIntervalRangeEClass = createEClass(GSS_CONFIG_INTERVAL_RANGE);
		createEAttribute(gssConfigIntervalRangeEClass, GSS_CONFIG_INTERVAL_RANGE__MIN);
		createEAttribute(gssConfigIntervalRangeEClass, GSS_CONFIG_INTERVAL_RANGE__MAX);
		createEAttribute(gssConfigIntervalRangeEClass, GSS_CONFIG_INTERVAL_RANGE__INTERVAL_VALUE);
		createEAttribute(gssConfigIntervalRangeEClass, GSS_CONFIG_INTERVAL_RANGE__INTERVAL_UNIT);

		gssConfigPeriodicTCsEClass = createEClass(GSS_CONFIG_PERIODIC_TCS);
		createEReference(gssConfigPeriodicTCsEClass, GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_2);
		createEReference(gssConfigPeriodicTCsEClass, GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_1);
		createEReference(gssConfigPeriodicTCsEClass, GSS_CONFIG_PERIODIC_TCS__PERIODIC_TC_LEVEL_0);

		gssConfigPeriodicTCLevel2EClass = createEClass(GSS_CONFIG_PERIODIC_TC_LEVEL2);
		createEAttribute(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__NAME);
		createEAttribute(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__ID);
		createEAttribute(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__IF_REF);
		createEAttribute(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_VALUE);
		createEAttribute(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__PERIOD_UNIT);
		createEReference(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2);
		createEReference(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2);
		createEReference(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1);
		createEReference(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1);
		createEReference(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL0);
		createEReference(gssConfigPeriodicTCLevel2EClass, GSS_CONFIG_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0);

		gssConfigPeriodicTCLevel1EClass = createEClass(GSS_CONFIG_PERIODIC_TC_LEVEL1);
		createEAttribute(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__NAME);
		createEAttribute(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__ID);
		createEAttribute(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__IF_REF);
		createEAttribute(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_VALUE);
		createEAttribute(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__PERIOD_UNIT);
		createEReference(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1);
		createEReference(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1);
		createEReference(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL0);
		createEReference(gssConfigPeriodicTCLevel1EClass, GSS_CONFIG_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0);

		gssConfigPeriodicTCLevel0EClass = createEClass(GSS_CONFIG_PERIODIC_TC_LEVEL0);
		createEAttribute(gssConfigPeriodicTCLevel0EClass, GSS_CONFIG_PERIODIC_TC_LEVEL0__NAME);
		createEAttribute(gssConfigPeriodicTCLevel0EClass, GSS_CONFIG_PERIODIC_TC_LEVEL0__ID);
		createEAttribute(gssConfigPeriodicTCLevel0EClass, GSS_CONFIG_PERIODIC_TC_LEVEL0__IF_REF);
		createEAttribute(gssConfigPeriodicTCLevel0EClass, GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_VALUE);
		createEAttribute(gssConfigPeriodicTCLevel0EClass, GSS_CONFIG_PERIODIC_TC_LEVEL0__PERIOD_UNIT);
		createEReference(gssConfigPeriodicTCLevel0EClass, GSS_CONFIG_PERIODIC_TC_LEVEL0__LEVEL0);
		createEReference(gssConfigPeriodicTCLevel0EClass, GSS_CONFIG_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0);

		gssConfigGlobalVarsEClass = createEClass(GSS_CONFIG_GLOBAL_VARS);
		createEReference(gssConfigGlobalVarsEClass, GSS_CONFIG_GLOBAL_VARS__GLOBAL_VAR);

		gssConfigGlobalVarEClass = createEClass(GSS_CONFIG_GLOBAL_VAR);
		createEAttribute(gssConfigGlobalVarEClass, GSS_CONFIG_GLOBAL_VAR__NAME);
		createEAttribute(gssConfigGlobalVarEClass, GSS_CONFIG_GLOBAL_VAR__ID);
		createEAttribute(gssConfigGlobalVarEClass, GSS_CONFIG_GLOBAL_VAR__TYPE);
		createEAttribute(gssConfigGlobalVarEClass, GSS_CONFIG_GLOBAL_VAR__INITIAL_VALUE);
		createEReference(gssConfigGlobalVarEClass, GSS_CONFIG_GLOBAL_VAR__REFERENCE_FIELD);
		createEReference(gssConfigGlobalVarEClass, GSS_CONFIG_GLOBAL_VAR__REFERENCE_PERIODIC_TC);
		createEReference(gssConfigGlobalVarEClass, GSS_CONFIG_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET);

		gssConfigReferenceFieldEClass = createEClass(GSS_CONFIG_REFERENCE_FIELD);
		createEAttribute(gssConfigReferenceFieldEClass, GSS_CONFIG_REFERENCE_FIELD__TYPE);
		createEAttribute(gssConfigReferenceFieldEClass, GSS_CONFIG_REFERENCE_FIELD__IF_REF);
		createEAttribute(gssConfigReferenceFieldEClass, GSS_CONFIG_REFERENCE_FIELD__LEVEL);
		createEAttribute(gssConfigReferenceFieldEClass, GSS_CONFIG_REFERENCE_FIELD__FIELD_REF);
		createEAttribute(gssConfigReferenceFieldEClass, GSS_CONFIG_REFERENCE_FIELD__OFFSET);
		createEAttribute(gssConfigReferenceFieldEClass, GSS_CONFIG_REFERENCE_FIELD__SIZE);

		gssConfigReferencePeriodicTCEClass = createEClass(GSS_CONFIG_REFERENCE_PERIODIC_TC);
		createEAttribute(gssConfigReferencePeriodicTCEClass, GSS_CONFIG_REFERENCE_PERIODIC_TC__ID_REF);
		createEAttribute(gssConfigReferencePeriodicTCEClass, GSS_CONFIG_REFERENCE_PERIODIC_TC__LEVEL);
		createEAttribute(gssConfigReferencePeriodicTCEClass, GSS_CONFIG_REFERENCE_PERIODIC_TC__FIELD_REF);
		createEAttribute(gssConfigReferencePeriodicTCEClass, GSS_CONFIG_REFERENCE_PERIODIC_TC__OFFSET);
		createEAttribute(gssConfigReferencePeriodicTCEClass, GSS_CONFIG_REFERENCE_PERIODIC_TC__SIZE);

		gssConfigReferenceSpecialPacketEClass = createEClass(GSS_CONFIG_REFERENCE_SPECIAL_PACKET);
		createEAttribute(gssConfigReferenceSpecialPacketEClass, GSS_CONFIG_REFERENCE_SPECIAL_PACKET__ID_REF);
		createEAttribute(gssConfigReferenceSpecialPacketEClass, GSS_CONFIG_REFERENCE_SPECIAL_PACKET__LEVEL);
		createEAttribute(gssConfigReferenceSpecialPacketEClass, GSS_CONFIG_REFERENCE_SPECIAL_PACKET__FIELD_REF);
		createEAttribute(gssConfigReferenceSpecialPacketEClass, GSS_CONFIG_REFERENCE_SPECIAL_PACKET__OFFSET);
		createEAttribute(gssConfigReferenceSpecialPacketEClass, GSS_CONFIG_REFERENCE_SPECIAL_PACKET__SIZE);

		gssConfigMonitorsEClass = createEClass(GSS_CONFIG_MONITORS);
		createEReference(gssConfigMonitorsEClass, GSS_CONFIG_MONITORS__CHARTS_FILE);
		createEReference(gssConfigMonitorsEClass, GSS_CONFIG_MONITORS__PLOT);
		createEReference(gssConfigMonitorsEClass, GSS_CONFIG_MONITORS__ALARM_MSG);
		createEReference(gssConfigMonitorsEClass, GSS_CONFIG_MONITORS__MODIFY);
		createEReference(gssConfigMonitorsEClass, GSS_CONFIG_MONITORS__ALARM_VAL);

		gssConfigPlotEClass = createEClass(GSS_CONFIG_PLOT);
		createEAttribute(gssConfigPlotEClass, GSS_CONFIG_PLOT__NAME);
		createEReference(gssConfigPlotEClass, GSS_CONFIG_PLOT__CHART_REF);
		createEReference(gssConfigPlotEClass, GSS_CONFIG_PLOT__GV_FILTERED);
		createEReference(gssConfigPlotEClass, GSS_CONFIG_PLOT__GV_PERIODIC);

		gssConfigAlarmMsgEClass = createEClass(GSS_CONFIG_ALARM_MSG);
		createEAttribute(gssConfigAlarmMsgEClass, GSS_CONFIG_ALARM_MSG__NAME);
		createEAttribute(gssConfigAlarmMsgEClass, GSS_CONFIG_ALARM_MSG__TYPE);
		createEAttribute(gssConfigAlarmMsgEClass, GSS_CONFIG_ALARM_MSG__TEXT);
		createEReference(gssConfigAlarmMsgEClass, GSS_CONFIG_ALARM_MSG__GV_FILTERED);
		createEReference(gssConfigAlarmMsgEClass, GSS_CONFIG_ALARM_MSG__GV_PERIODIC);

		gssConfigModifyEClass = createEClass(GSS_CONFIG_MODIFY);
		createEAttribute(gssConfigModifyEClass, GSS_CONFIG_MODIFY__NAME);
		createEAttribute(gssConfigModifyEClass, GSS_CONFIG_MODIFY__TYPE);
		createEAttribute(gssConfigModifyEClass, GSS_CONFIG_MODIFY__VALUE);
		createEReference(gssConfigModifyEClass, GSS_CONFIG_MODIFY__GV_FILTERED);
		createEReference(gssConfigModifyEClass, GSS_CONFIG_MODIFY__GV_PERIODIC);

		gssConfigAlarmValEClass = createEClass(GSS_CONFIG_ALARM_VAL);
		createEAttribute(gssConfigAlarmValEClass, GSS_CONFIG_ALARM_VAL__NAME);
		createEAttribute(gssConfigAlarmValEClass, GSS_CONFIG_ALARM_VAL__TYPE);
		createEReference(gssConfigAlarmValEClass, GSS_CONFIG_ALARM_VAL__GV_FILTERED);
		createEReference(gssConfigAlarmValEClass, GSS_CONFIG_ALARM_VAL__GV_PERIODIC);

		gssConfigGVFilteredEClass = createEClass(GSS_CONFIG_GV_FILTERED);
		createEReference(gssConfigGVFilteredEClass, GSS_CONFIG_GV_FILTERED__GLOBAL_VAR_REF);
		createEReference(gssConfigGVFilteredEClass, GSS_CONFIG_GV_FILTERED__FILTER);

		gssConfigGVPeriodicEClass = createEClass(GSS_CONFIG_GV_PERIODIC);
		createEReference(gssConfigGVPeriodicEClass, GSS_CONFIG_GV_PERIODIC__GLOBAL_VAR_REF);
		createEAttribute(gssConfigGVPeriodicEClass, GSS_CONFIG_GV_PERIODIC__PERIOD_VALUE);
		createEAttribute(gssConfigGVPeriodicEClass, GSS_CONFIG_GV_PERIODIC__PERIOD_UNIT);

		gssConfigTestsEClass = createEClass(GSS_CONFIG_TESTS);
		createEReference(gssConfigTestsEClass, GSS_CONFIG_TESTS__PROTOCOL_PACKETS_FILE);
		createEReference(gssConfigTestsEClass, GSS_CONFIG_TESTS__TEST_CASE);

		gssConfigTestCaseEClass = createEClass(GSS_CONFIG_TEST_CASE);
		createEAttribute(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__NAME);
		createEReference(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__PROCEDURE);
		createEAttribute(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__REQ);
		createEAttribute(gssConfigTestCaseEClass, GSS_CONFIG_TEST_CASE__REQ_ACTION);

		// Create enums
		gssConfigEnableDisableEEnum = createEEnum(GSS_CONFIG_ENABLE_DISABLE);
		gssConfigMainInterfaceTypeEEnum = createEEnum(GSS_CONFIG_MAIN_INTERFACE_TYPE);
		gssConfigMainInterfaceIOTypeEEnum = createEEnum(GSS_CONFIG_MAIN_INTERFACE_IO_TYPE);
		gssConfigInterfaceTypeEEnum = createEEnum(GSS_CONFIG_INTERFACE_TYPE);
		gssConfigInterfaceIOTypeEEnum = createEEnum(GSS_CONFIG_INTERFACE_IO_TYPE);
		gssConfigUpperLevelLevelEEnum = createEEnum(GSS_CONFIG_UPPER_LEVEL_LEVEL);
		gssConfigUnitEEnum = createEEnum(GSS_CONFIG_UNIT);
		gssConfigGlobalVarTypeEEnum = createEEnum(GSS_CONFIG_GLOBAL_VAR_TYPE);
		gssConfigReferenceFieldTypeEEnum = createEEnum(GSS_CONFIG_REFERENCE_FIELD_TYPE);
		gssConfigAlarmMsgTypeEEnum = createEEnum(GSS_CONFIG_ALARM_MSG_TYPE);
		gssConfigModifyTypeEEnum = createEEnum(GSS_CONFIG_MODIFY_TYPE);
		gssConfigAlarmValTypeEEnum = createEEnum(GSS_CONFIG_ALARM_VAL_TYPE);
		gssConfigReqActionEEnum = createEEnum(GSS_CONFIG_REQ_ACTION);
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
		ifacePackage theifacePackage = (ifacePackage)EPackage.Registry.INSTANCE.getEPackage(ifacePackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);
		filterPackage thefilterPackage = (filterPackage)EPackage.Registry.INSTANCE.getEPackage(filterPackage.eNS_URI);
		exportPackage theexportPackage = (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);
		importPackage theimportPackage = (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);
		chartsPackage thechartsPackage = (chartsPackage)EPackage.Registry.INSTANCE.getEPackage(chartsPackage.eNS_URI);
		protocol_packetsPackage theprotocol_packetsPackage = (protocol_packetsPackage)EPackage.Registry.INSTANCE.getEPackage(protocol_packetsPackage.eNS_URI);
		test_procPackage thetest_procPackage = (test_procPackage)EPackage.Registry.INSTANCE.getEPackage(test_procPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssConfigGSSConfigEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssConfigGSSConfigEClass, GSSConfigGSSConfig.class, "GSSConfigGSSConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigGSSConfig_Gss_options(), this.getGSSConfigGSSOptions(), null, "gss_options", null, 1, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_Protocols(), this.getGSSConfigProtocols(), null, "Protocols", null, 1, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_Interfaces(), this.getGSSConfigInterfaces(), null, "Interfaces", null, 1, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_SpecialPackets(), this.getGSSConfigSpecialPackets(), null, "SpecialPackets", null, 0, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_PeriodicTCs(), this.getGSSConfigPeriodicTCs(), null, "PeriodicTCs", null, 0, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_GlobalVars(), this.getGSSConfigGlobalVars(), null, "GlobalVars", null, 0, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_Monitors(), this.getGSSConfigMonitors(), null, "Monitors", null, 0, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSConfig_Tests(), this.getGSSConfigTests(), null, "Tests", null, 1, 1, GSSConfigGSSConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGSSOptionsEClass, GSSConfigGSSOptions.class, "GSSConfigGSSOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigGSSOptions_Gss_info(), this.getGSSConfigGSSInfo(), null, "gss_info", null, 1, 1, GSSConfigGSSOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSOptions_Gss_info_print(), this.getGSSConfigGSSInfoPrint(), null, "gss_info_print", null, 1, 1, GSSConfigGSSOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSOptions_Phy_header_print(), this.getGSSConfigPhyHeaderPrint(), null, "phy_header_print", null, 1, 1, GSSConfigGSSOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGSSOptions_DiscardErrorFlags(), this.getGSSConfigGSSDiscardErrorFlags(), null, "discardErrorFlags", null, 1, 1, GSSConfigGSSOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGSSInfoEClass, GSSConfigGSSInfo.class, "GSSConfigGSSInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigGSSInfo_Test_campaign(), ecorePackage.getEString(), "test_campaign", null, 1, 1, GSSConfigGSSInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSInfo_Version(), ecorePackage.getEString(), "version", null, 1, 1, GSSConfigGSSInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSInfo_Date(), ecorePackage.getEString(), "date", null, 1, 1, GSSConfigGSSInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSInfo_Version_control_url(), ecorePackage.getEString(), "version_control_url", null, 0, 1, GSSConfigGSSInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGSSInfoPrintEClass, GSSConfigGSSInfoPrint.class, "GSSConfigGSSInfoPrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigGSSInfoPrint_MainLog(), this.getGSSConfigEnableDisable(), "mainLog", null, 1, 1, GSSConfigGSSInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSInfoPrint_PortLogs(), this.getGSSConfigEnableDisable(), "portLogs", null, 1, 1, GSSConfigGSSInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSInfoPrint_RawLog(), this.getGSSConfigEnableDisable(), "rawLog", null, 1, 1, GSSConfigGSSInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPhyHeaderPrintEClass, GSSConfigPhyHeaderPrint.class, "GSSConfigPhyHeaderPrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigPhyHeaderPrint_MainLog(), this.getGSSConfigEnableDisable(), "mainLog", null, 1, 1, GSSConfigPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPhyHeaderPrint_PortLogs(), this.getGSSConfigEnableDisable(), "portLogs", null, 1, 1, GSSConfigPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPhyHeaderPrint_RawLog(), this.getGSSConfigEnableDisable(), "rawLog", null, 1, 1, GSSConfigPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPhyHeaderPrint_GssTabs(), this.getGSSConfigEnableDisable(), "gssTabs", null, 1, 1, GSSConfigPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGSSDiscardErrorFlagsEClass, GSSConfigGSSDiscardErrorFlags.class, "GSSConfigGSSDiscardErrorFlags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigGSSDiscardErrorFlags_TxErrors(), this.getGSSConfigEnableDisable(), "txErrors", null, 1, 1, GSSConfigGSSDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSDiscardErrorFlags_NotExpectedPackets(), this.getGSSConfigEnableDisable(), "notExpectedPackets", null, 1, 1, GSSConfigGSSDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSDiscardErrorFlags_FiltersKo(), this.getGSSConfigEnableDisable(), "filtersKo", null, 1, 1, GSSConfigGSSDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGSSDiscardErrorFlags_ValidTimesKo(), this.getGSSConfigEnableDisable(), "validTimesKo", null, 1, 1, GSSConfigGSSDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigProtocolsEClass, GSSConfigProtocols.class, "GSSConfigProtocols", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigProtocols_Protocol(), this.getGSSConfigProtocol(), null, "Protocol", null, 1, 2, GSSConfigProtocols.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigProtocolEClass, GSSConfigProtocol.class, "GSSConfigProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigProtocol_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigProtocol_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigProtocol_TypeLevel(), ecorePackage.getEString(), "typeLevel", null, 1, 1, GSSConfigProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigProtocol_TypeOffset(), ecorePackage.getEString(), "typeOffset", null, 1, 1, GSSConfigProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigProtocol_SubtypeOffset(), ecorePackage.getEString(), "subtypeOffset", null, 0, 1, GSSConfigProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigInterfacesEClass, GSSConfigInterfaces.class, "GSSConfigInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigInterfaces_MainInterface(), this.getGSSConfigMainInterface(), null, "MainInterface", null, 1, 1, GSSConfigInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigInterfaces_Interface(), this.getGSSConfigInterface(), null, "Interface", null, 0, 7, GSSConfigInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigMainInterfaceEClass, GSSConfigMainInterface.class, "GSSConfigMainInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigMainInterface_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigMainInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigMainInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigMainInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigMainInterface_IfType(), this.getGSSConfigMainInterfaceType(), "ifType", null, 1, 1, GSSConfigMainInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigMainInterface_IfConfig(), theifacePackage.getGSSIfacePortConfig(), null, "ifConfig", null, 1, 1, GSSConfigMainInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigMainInterface_IoType(), this.getGSSConfigMainInterfaceIOType(), "ioType", null, 1, 1, GSSConfigMainInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigMainInterface_ProtocolID(), this.getGSSConfigProtocol(), null, "protocolID", null, 0, 1, GSSConfigMainInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigMainInterface_LevelInOut(), this.getGSSConfigLevelInOut(), null, "LevelInOut", null, 1, 3, GSSConfigMainInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigInterfaceEClass, GSSConfigInterface.class, "GSSConfigInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigInterface_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigInterface_IfType(), this.getGSSConfigInterfaceType(), "ifType", null, 1, 1, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigInterface_IfConfig(), theifacePackage.getGSSIfacePortConfig(), null, "ifConfig", null, 1, 1, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigInterface_IoType(), this.getGSSConfigInterfaceIOType(), "ioType", null, 1, 1, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigInterface_ProtocolID(), this.getGSSConfigProtocol(), null, "protocolID", null, 0, 1, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigInterface_LevelInOut(), this.getGSSConfigLevelInOut(), null, "LevelInOut", null, 0, 3, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigInterface_LevelIn(), this.getGSSConfigLevelIn(), null, "LevelIn", null, 0, 3, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigInterface_LevelOut(), this.getGSSConfigLevelOut(), null, "LevelOut", null, 0, 3, GSSConfigInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigLevelInOutEClass, GSSConfigLevelInOut.class, "GSSConfigLevelInOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigLevelInOut_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigLevelInOut_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelInOut_TMformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TMformat", null, 1, 1, GSSConfigLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelInOut_TCformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TCformat", null, 1, 1, GSSConfigLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelInOut_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 1, 1, GSSConfigLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelInOut_Export_to_prev_Level(), theexportPackage.getTMTCIFExportExport(), null, "export_to_prev_Level", null, 0, 1, GSSConfigLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelInOut_Import_from_prev_Level(), theimportPackage.getTMTCIFImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSConfigLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigLevelInEClass, GSSConfigLevelIn.class, "GSSConfigLevelIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigLevelIn_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigLevelIn_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelIn_TCformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TCformat", null, 1, 1, GSSConfigLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelIn_Export_to_prev_Level(), theexportPackage.getTMTCIFExportExport(), null, "export_to_prev_Level", null, 0, 1, GSSConfigLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigLevelOutEClass, GSSConfigLevelOut.class, "GSSConfigLevelOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigLevelOut_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigLevelOut_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelOut_TMformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TMformat", null, 1, 1, GSSConfigLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelOut_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 1, 1, GSSConfigLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigLevelOut_Import_from_prev_Level(), theimportPackage.getTMTCIFImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSConfigLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigSpecialPacketsEClass, GSSConfigSpecialPackets.class, "GSSConfigSpecialPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigSpecialPackets_SpecialPacket(), this.getGSSConfigSpecialPacket(), null, "SpecialPacket", null, 1, 17, GSSConfigSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigSpecialPacketEClass, GSSConfigSpecialPacket.class, "GSSConfigSpecialPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigSpecialPacket_Status(), this.getGSSConfigEnableDisable(), "status", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigSpecialPacket_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigSpecialPacket_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigSpecialPacket_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigSpecialPacket_Levels(), ecorePackage.getEString(), "levels", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigSpecialPacket_LevelRef(), ecorePackage.getEString(), "levelRef", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigSpecialPacket_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigSpecialPacket_UpperLevels(), this.getGSSConfigUpperLevels(), null, "UpperLevels", null, 0, 3, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigSpecialPacket_PrintingData(), this.getGSSConfigPrintingData(), null, "printingData", null, 1, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigSpecialPacket_Period(), this.getGSSConfigPeriod(), null, "period", null, 0, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigSpecialPacket_IntervalRange(), this.getGSSConfigIntervalRange(), null, "intervalRange", null, 0, 1, GSSConfigSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigUpperLevelsEClass, GSSConfigUpperLevels.class, "GSSConfigUpperLevels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigUpperLevels_UpperLevel(), this.getGSSConfigUpperLevel(), null, "UpperLevel", null, 1, -1, GSSConfigUpperLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigUpperLevelEClass, GSSConfigUpperLevel.class, "GSSConfigUpperLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigUpperLevel_Level(), this.getGSSConfigUpperLevelLevel(), "level", null, 1, 1, GSSConfigUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigUpperLevel_TMformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TMformat", null, 1, 1, GSSConfigUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigUpperLevel_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 0, 1, GSSConfigUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigUpperLevel_Import_from_prev_Level(), theimportPackage.getTMTCIFImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSConfigUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPrintingDataEClass, GSSConfigPrintingData.class, "GSSConfigPrintingData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigPrintingData_PrintStatus(), this.getGSSConfigEnableDisable(), "printStatus", null, 1, 1, GSSConfigPrintingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPrintingData_StructuredData(), this.getGSSConfigStructuredData(), null, "structuredData", null, 0, 1, GSSConfigPrintingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigStructuredDataEClass, GSSConfigStructuredData.class, "GSSConfigStructuredData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigStructuredData_LevelRef(), ecorePackage.getEString(), "levelRef", null, 1, 1, GSSConfigStructuredData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigStructuredData_FirstField(), ecorePackage.getEString(), "firstField", null, 1, 1, GSSConfigStructuredData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPeriodEClass, GSSConfigPeriod.class, "GSSConfigPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigPeriod_Min_value(), ecorePackage.getEString(), "min_value", null, 1, 1, GSSConfigPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriod_Min_unit(), this.getGSSConfigUnit(), "min_unit", null, 1, 1, GSSConfigPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriod_Max_value(), ecorePackage.getEString(), "max_value", null, 1, 1, GSSConfigPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriod_Max_unit(), this.getGSSConfigUnit(), "max_unit", null, 1, 1, GSSConfigPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigIntervalRangeEClass, GSSConfigIntervalRange.class, "GSSConfigIntervalRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigIntervalRange_Min(), ecorePackage.getEString(), "min", null, 1, 1, GSSConfigIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigIntervalRange_Max(), ecorePackage.getEString(), "max", null, 1, 1, GSSConfigIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigIntervalRange_Interval_value(), ecorePackage.getEString(), "interval_value", null, 1, 1, GSSConfigIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigIntervalRange_Interval_unit(), this.getGSSConfigUnit(), "interval_unit", null, 1, 1, GSSConfigIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPeriodicTCsEClass, GSSConfigPeriodicTCs.class, "GSSConfigPeriodicTCs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigPeriodicTCs_PeriodicTC_level_2(), this.getGSSConfigPeriodicTCLevel2(), null, "PeriodicTC_level_2", null, 0, -1, GSSConfigPeriodicTCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCs_PeriodicTC_level_1(), this.getGSSConfigPeriodicTCLevel1(), null, "PeriodicTC_level_1", null, 0, -1, GSSConfigPeriodicTCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCs_PeriodicTC_level_0(), this.getGSSConfigPeriodicTCLevel0(), null, "PeriodicTC_level_0", null, 0, -1, GSSConfigPeriodicTCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPeriodicTCLevel2EClass, GSSConfigPeriodicTCLevel2.class, "GSSConfigPeriodicTCLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigPeriodicTCLevel2_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel2_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel2_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel2_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel2_Period_unit(), this.getGSSConfigUnit(), "period_unit", null, 1, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel2_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel2_App_to_level2(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level2", null, 1, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel2_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel2_Level2_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "level2_to_level1", null, 0, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel2_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel2_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, GSSConfigPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPeriodicTCLevel1EClass, GSSConfigPeriodicTCLevel1.class, "GSSConfigPeriodicTCLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigPeriodicTCLevel1_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel1_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel1_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel1_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel1_Period_unit(), this.getGSSConfigUnit(), "period_unit", null, 1, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel1_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel1_App_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level1", null, 1, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel1_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel1_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, GSSConfigPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPeriodicTCLevel0EClass, GSSConfigPeriodicTCLevel0.class, "GSSConfigPeriodicTCLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigPeriodicTCLevel0_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel0_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel0_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSConfigPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel0_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSConfigPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigPeriodicTCLevel0_Period_unit(), this.getGSSConfigUnit(), "period_unit", null, 1, 1, GSSConfigPeriodicTCLevel0.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel0_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSConfigPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPeriodicTCLevel0_App_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level0", null, 1, 1, GSSConfigPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGlobalVarsEClass, GSSConfigGlobalVars.class, "GSSConfigGlobalVars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigGlobalVars_GlobalVar(), this.getGSSConfigGlobalVar(), null, "GlobalVar", null, 1, 10, GSSConfigGlobalVars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGlobalVarEClass, GSSConfigGlobalVar.class, "GSSConfigGlobalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigGlobalVar_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGlobalVar_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSConfigGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGlobalVar_Type(), this.getGSSConfigGlobalVarType(), "type", null, 1, 1, GSSConfigGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGlobalVar_Initial_value(), ecorePackage.getEString(), "initial_value", null, 1, 1, GSSConfigGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGlobalVar_ReferenceField(), this.getGSSConfigReferenceField(), null, "referenceField", null, 0, 1, GSSConfigGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGlobalVar_ReferencePeriodicTC(), this.getGSSConfigReferencePeriodicTC(), null, "referencePeriodicTC", null, 0, 1, GSSConfigGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGlobalVar_ReferenceSpecialPacket(), this.getGSSConfigReferenceSpecialPacket(), null, "referenceSpecialPacket", null, 0, 1, GSSConfigGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigReferenceFieldEClass, GSSConfigReferenceField.class, "GSSConfigReferenceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigReferenceField_Type(), this.getGSSConfigReferenceFieldType(), "type", null, 1, 1, GSSConfigReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceField_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSConfigReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceField_Level(), ecorePackage.getEString(), "level", null, 1, 1, GSSConfigReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceField_FieldRef(), ecorePackage.getEString(), "fieldRef", null, 1, 1, GSSConfigReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceField_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSConfigReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceField_Size(), ecorePackage.getEString(), "size", null, 1, 1, GSSConfigReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigReferencePeriodicTCEClass, GSSConfigReferencePeriodicTC.class, "GSSConfigReferencePeriodicTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigReferencePeriodicTC_IdRef(), ecorePackage.getEString(), "idRef", null, 1, 1, GSSConfigReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferencePeriodicTC_Level(), ecorePackage.getEString(), "level", null, 1, 1, GSSConfigReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferencePeriodicTC_FieldRef(), ecorePackage.getEString(), "fieldRef", null, 1, 1, GSSConfigReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferencePeriodicTC_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSConfigReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferencePeriodicTC_Size(), ecorePackage.getEString(), "size", null, 1, 1, GSSConfigReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigReferenceSpecialPacketEClass, GSSConfigReferenceSpecialPacket.class, "GSSConfigReferenceSpecialPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigReferenceSpecialPacket_IdRef(), ecorePackage.getEString(), "idRef", null, 1, 1, GSSConfigReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceSpecialPacket_Level(), ecorePackage.getEString(), "level", null, 1, 1, GSSConfigReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceSpecialPacket_FieldRef(), ecorePackage.getEString(), "fieldRef", null, 1, 1, GSSConfigReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceSpecialPacket_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSConfigReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigReferenceSpecialPacket_Size(), ecorePackage.getEString(), "size", null, 1, 1, GSSConfigReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigMonitorsEClass, GSSConfigMonitors.class, "GSSConfigMonitors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigMonitors_ChartsFile(), thechartsPackage.getGSSChartsCharts(), null, "ChartsFile", null, 0, 1, GSSConfigMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigMonitors_Plot(), this.getGSSConfigPlot(), null, "plot", null, 0, -1, GSSConfigMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigMonitors_AlarmMsg(), this.getGSSConfigAlarmMsg(), null, "alarmMsg", null, 0, -1, GSSConfigMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigMonitors_Modify(), this.getGSSConfigModify(), null, "modify", null, 0, -1, GSSConfigMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigMonitors_AlarmVal(), this.getGSSConfigAlarmVal(), null, "alarmVal", null, 0, 3, GSSConfigMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigPlotEClass, GSSConfigPlot.class, "GSSConfigPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigPlot_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPlot_ChartRef(), thechartsPackage.getGSSChartsChart(), null, "chartRef", null, 1, 1, GSSConfigPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPlot_GVFiltered(), this.getGSSConfigGVFiltered(), null, "GVFiltered", null, 0, 1, GSSConfigPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigPlot_GVPeriodic(), this.getGSSConfigGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSConfigPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigAlarmMsgEClass, GSSConfigAlarmMsg.class, "GSSConfigAlarmMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigAlarmMsg_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigAlarmMsg_Type(), this.getGSSConfigAlarmMsgType(), "type", null, 1, 1, GSSConfigAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigAlarmMsg_Text(), ecorePackage.getEString(), "text", null, 1, 1, GSSConfigAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigAlarmMsg_GVFiltered(), this.getGSSConfigGVFiltered(), null, "GVFiltered", null, 0, 1, GSSConfigAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigAlarmMsg_GVPeriodic(), this.getGSSConfigGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSConfigAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigModifyEClass, GSSConfigModify.class, "GSSConfigModify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigModify_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigModify_Type(), this.getGSSConfigModifyType(), "type", null, 1, 1, GSSConfigModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigModify_Value(), ecorePackage.getEString(), "value", null, 1, 1, GSSConfigModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigModify_GVFiltered(), this.getGSSConfigGVFiltered(), null, "GVFiltered", null, 0, 1, GSSConfigModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigModify_GVPeriodic(), this.getGSSConfigGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSConfigModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigAlarmValEClass, GSSConfigAlarmVal.class, "GSSConfigAlarmVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigAlarmVal_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigAlarmVal_Type(), this.getGSSConfigAlarmValType(), "type", null, 1, 1, GSSConfigAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigAlarmVal_GVFiltered(), this.getGSSConfigGVFiltered(), null, "GVFiltered", null, 0, 1, GSSConfigAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigAlarmVal_GVPeriodic(), this.getGSSConfigGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSConfigAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGVFilteredEClass, GSSConfigGVFiltered.class, "GSSConfigGVFiltered", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigGVFiltered_GlobalVarRef(), this.getGSSConfigGlobalVar(), null, "GlobalVarRef", null, 1, 1, GSSConfigGVFiltered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigGVFiltered_Filter(), thefilterPackage.getTMTCIFFilterFilter(), null, "filter", null, 0, 1, GSSConfigGVFiltered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigGVPeriodicEClass, GSSConfigGVPeriodic.class, "GSSConfigGVPeriodic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigGVPeriodic_GlobalVarRef(), this.getGSSConfigGlobalVar(), null, "GlobalVarRef", null, 1, 1, GSSConfigGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGVPeriodic_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSConfigGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigGVPeriodic_Period_unit(), this.getGSSConfigUnit(), "period_unit", null, 1, 1, GSSConfigGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigTestsEClass, GSSConfigTests.class, "GSSConfigTests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSConfigTests_ProtocolPacketsFile(), theprotocol_packetsPackage.getGSSProtocolPacketsProtocolPackets(), null, "ProtocolPacketsFile", null, 0, 1, GSSConfigTests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigTests_TestCase(), this.getGSSConfigTestCase(), null, "TestCase", null, 1, 150, GSSConfigTests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssConfigTestCaseEClass, GSSConfigTestCase.class, "GSSConfigTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSConfigTestCase_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSConfigTestCase_Procedure(), thetest_procPackage.getGSSTestProcTestProc(), null, "procedure", null, 1, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigTestCase_Req(), ecorePackage.getEString(), "req", null, 0, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSConfigTestCase_ReqAction(), this.getGSSConfigReqAction(), "reqAction", null, 0, 1, GSSConfigTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssConfigEnableDisableEEnum, GSSConfigEnableDisable.class, "GSSConfigEnableDisable");
		addEEnumLiteral(gssConfigEnableDisableEEnum, GSSConfigEnableDisable.DISABLED);
		addEEnumLiteral(gssConfigEnableDisableEEnum, GSSConfigEnableDisable.ENABLED);

		initEEnum(gssConfigMainInterfaceTypeEEnum, GSSConfigMainInterfaceType.class, "GSSConfigMainInterfaceType");
		addEEnumLiteral(gssConfigMainInterfaceTypeEEnum, GSSConfigMainInterfaceType.SP_W);
		addEEnumLiteral(gssConfigMainInterfaceTypeEEnum, GSSConfigMainInterfaceType.UART);
		addEEnumLiteral(gssConfigMainInterfaceTypeEEnum, GSSConfigMainInterfaceType.DUMMY);

		initEEnum(gssConfigMainInterfaceIOTypeEEnum, GSSConfigMainInterfaceIOType.class, "GSSConfigMainInterfaceIOType");
		addEEnumLiteral(gssConfigMainInterfaceIOTypeEEnum, GSSConfigMainInterfaceIOType.IN_OUT);

		initEEnum(gssConfigInterfaceTypeEEnum, GSSConfigInterfaceType.class, "GSSConfigInterfaceType");
		addEEnumLiteral(gssConfigInterfaceTypeEEnum, GSSConfigInterfaceType.SP_W);
		addEEnumLiteral(gssConfigInterfaceTypeEEnum, GSSConfigInterfaceType.SP_WTC);
		addEEnumLiteral(gssConfigInterfaceTypeEEnum, GSSConfigInterfaceType.SP_WERROR);
		addEEnumLiteral(gssConfigInterfaceTypeEEnum, GSSConfigInterfaceType.UART);
		addEEnumLiteral(gssConfigInterfaceTypeEEnum, GSSConfigInterfaceType.DUMMY);

		initEEnum(gssConfigInterfaceIOTypeEEnum, GSSConfigInterfaceIOType.class, "GSSConfigInterfaceIOType");
		addEEnumLiteral(gssConfigInterfaceIOTypeEEnum, GSSConfigInterfaceIOType.IN_OUT);
		addEEnumLiteral(gssConfigInterfaceIOTypeEEnum, GSSConfigInterfaceIOType.IN);
		addEEnumLiteral(gssConfigInterfaceIOTypeEEnum, GSSConfigInterfaceIOType.OUT);

		initEEnum(gssConfigUpperLevelLevelEEnum, GSSConfigUpperLevelLevel.class, "GSSConfigUpperLevelLevel");
		addEEnumLiteral(gssConfigUpperLevelLevelEEnum, GSSConfigUpperLevelLevel._1);
		addEEnumLiteral(gssConfigUpperLevelLevelEEnum, GSSConfigUpperLevelLevel._2);
		addEEnumLiteral(gssConfigUpperLevelLevelEEnum, GSSConfigUpperLevelLevel._3);

		initEEnum(gssConfigUnitEEnum, GSSConfigUnit.class, "GSSConfigUnit");
		addEEnumLiteral(gssConfigUnitEEnum, GSSConfigUnit.MILISECONDS);
		addEEnumLiteral(gssConfigUnitEEnum, GSSConfigUnit.SECONDS);

		initEEnum(gssConfigGlobalVarTypeEEnum, GSSConfigGlobalVarType.class, "GSSConfigGlobalVarType");
		addEEnumLiteral(gssConfigGlobalVarTypeEEnum, GSSConfigGlobalVarType.UINT);
		addEEnumLiteral(gssConfigGlobalVarTypeEEnum, GSSConfigGlobalVarType.FORMULA);

		initEEnum(gssConfigReferenceFieldTypeEEnum, GSSConfigReferenceFieldType.class, "GSSConfigReferenceFieldType");
		addEEnumLiteral(gssConfigReferenceFieldTypeEEnum, GSSConfigReferenceFieldType.TM);
		addEEnumLiteral(gssConfigReferenceFieldTypeEEnum, GSSConfigReferenceFieldType.TC);

		initEEnum(gssConfigAlarmMsgTypeEEnum, GSSConfigAlarmMsgType.class, "GSSConfigAlarmMsgType");
		addEEnumLiteral(gssConfigAlarmMsgTypeEEnum, GSSConfigAlarmMsgType.ALARM1);
		addEEnumLiteral(gssConfigAlarmMsgTypeEEnum, GSSConfigAlarmMsgType.ALARM2);
		addEEnumLiteral(gssConfigAlarmMsgTypeEEnum, GSSConfigAlarmMsgType.ALARM3);

		initEEnum(gssConfigModifyTypeEEnum, GSSConfigModifyType.class, "GSSConfigModifyType");
		addEEnumLiteral(gssConfigModifyTypeEEnum, GSSConfigModifyType.INCREMENT);
		addEEnumLiteral(gssConfigModifyTypeEEnum, GSSConfigModifyType.INCREMENT1WRAP);

		initEEnum(gssConfigAlarmValTypeEEnum, GSSConfigAlarmValType.class, "GSSConfigAlarmValType");
		addEEnumLiteral(gssConfigAlarmValTypeEEnum, GSSConfigAlarmValType.ALARM1);

		initEEnum(gssConfigReqActionEEnum, GSSConfigReqAction.class, "GSSConfigReqAction");
		addEEnumLiteral(gssConfigReqActionEEnum, GSSConfigReqAction._1);

		// Create resource
		createResource(eNS_URI);
	}

} //configPackageImpl
