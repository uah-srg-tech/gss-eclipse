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
package es.uah.aut.srg.gss.scenario.impl;

import es.uah.aut.srg.gss.charts.chartsPackage;

import es.uah.aut.srg.gss.export.exportPackage;

import es.uah.aut.srg.gss.filter.filterPackage;

import es.uah.aut.srg.gss.format.formatPackage;

import es.uah.aut.srg.gss.iface.ifacePackage;

import es.uah.aut.srg.gss.import_.importPackage;

import es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage;

import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsg;
import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmMsgType;
import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmVal;
import es.uah.aut.srg.gss.scenario.GSSScenarioAlarmValType;
import es.uah.aut.srg.gss.scenario.GSSScenarioDiscardErrorFlags;
import es.uah.aut.srg.gss.scenario.GSSScenarioEnableDisable;
import es.uah.aut.srg.gss.scenario.GSSScenarioGVFiltered;
import es.uah.aut.srg.gss.scenario.GSSScenarioGVPeriodic;
import es.uah.aut.srg.gss.scenario.GSSScenarioGVRef;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVar;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVarType;
import es.uah.aut.srg.gss.scenario.GSSScenarioGlobalVars;
import es.uah.aut.srg.gss.scenario.GSSScenarioInfo;
import es.uah.aut.srg.gss.scenario.GSSScenarioInfoPrint;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterface;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType;
import es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces;
import es.uah.aut.srg.gss.scenario.GSSScenarioIntervalRange;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut;
import es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut;
import es.uah.aut.srg.gss.scenario.GSSScenarioModify;
import es.uah.aut.srg.gss.scenario.GSSScenarioModifyType;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitor;
import es.uah.aut.srg.gss.scenario.GSSScenarioMonitors;
import es.uah.aut.srg.gss.scenario.GSSScenarioOptions;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriod;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTC;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel0;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel1;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCLevel2;
import es.uah.aut.srg.gss.scenario.GSSScenarioPeriodicTCs;
import es.uah.aut.srg.gss.scenario.GSSScenarioPhyHeaderPrint;
import es.uah.aut.srg.gss.scenario.GSSScenarioPlot;
import es.uah.aut.srg.gss.scenario.GSSScenarioPrintingData;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocol;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocolType;
import es.uah.aut.srg.gss.scenario.GSSScenarioProtocols;
import es.uah.aut.srg.gss.scenario.GSSScenarioReference;
import es.uah.aut.srg.gss.scenario.GSSScenarioReferenceField;
import es.uah.aut.srg.gss.scenario.GSSScenarioReferenceFieldType;
import es.uah.aut.srg.gss.scenario.GSSScenarioReferencePeriodicTC;
import es.uah.aut.srg.gss.scenario.GSSScenarioReferenceSpecialPacket;
import es.uah.aut.srg.gss.scenario.GSSScenarioScenario;
import es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPacket;
import es.uah.aut.srg.gss.scenario.GSSScenarioSpecialPackets;
import es.uah.aut.srg.gss.scenario.GSSScenarioStructuredData;
import es.uah.aut.srg.gss.scenario.GSSScenarioUnit;
import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel;
import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel;
import es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevels;
import es.uah.aut.srg.gss.scenario.scenarioFactory;
import es.uah.aut.srg.gss.scenario.scenarioPackage;
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
public class scenarioPackageImpl extends EPackageImpl implements scenarioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioInfoPrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPhyHeaderPrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioDiscardErrorFlagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioProtocolsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioProtocolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioLevelInOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioLevelInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioLevelOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioSpecialPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioSpecialPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioUpperLevelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioUpperLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPrintingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioStructuredDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioIntervalRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPeriodicTCsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPeriodicTCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPeriodicTCLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPeriodicTCLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPeriodicTCLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioGlobalVarsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioGlobalVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioReferenceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioReferencePeriodicTCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioReferenceSpecialPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioMonitorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioMonitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioAlarmMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioModifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioAlarmValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioGVRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioGVFilteredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssScenarioGVPeriodicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioEnableDisableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioInterfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioInterfaceIOTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioUpperLevelLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioGlobalVarTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioReferenceFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioAlarmMsgTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioModifyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssScenarioAlarmValTypeEEnum = null;

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
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private scenarioPackageImpl() {
		super(eNS_URI, scenarioFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link scenarioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static scenarioPackage init() {
		if (isInited) return (scenarioPackage)EPackage.Registry.INSTANCE.getEPackage(scenarioPackage.eNS_URI);

		// Obtain or create and register package
		scenarioPackageImpl thescenarioPackage = (scenarioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof scenarioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new scenarioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		chartsPackage.eINSTANCE.eClass();
		filterPackage.eINSTANCE.eClass();
		ifacePackage.eINSTANCE.eClass();
		importPackage.eINSTANCE.eClass();
		protocol_packetsPackage.eINSTANCE.eClass();
		es.uah.aut.srg.tmtcif.scenario.scenarioPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thescenarioPackage.createPackageContents();

		// Initialize created meta-data
		thescenarioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thescenarioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(scenarioPackage.eNS_URI, thescenarioPackage);
		return thescenarioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioScenario() {
		return gssScenarioScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioScenario_Gss_options() {
		return (EReference)gssScenarioScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioScenario_Protocols() {
		return (EReference)gssScenarioScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioScenario_Interfaces() {
		return (EReference)gssScenarioScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioScenario_SpecialPackets() {
		return (EReference)gssScenarioScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioScenario_PeriodicTCs() {
		return (EReference)gssScenarioScenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioScenario_GlobalVars() {
		return (EReference)gssScenarioScenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioScenario_Monitors() {
		return (EReference)gssScenarioScenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioOptions() {
		return gssScenarioOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioOptions_Gss_info() {
		return (EReference)gssScenarioOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioOptions_Gss_info_print() {
		return (EReference)gssScenarioOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioOptions_Phy_header_print() {
		return (EReference)gssScenarioOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioOptions_DiscardErrorFlags() {
		return (EReference)gssScenarioOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioInfo() {
		return gssScenarioInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInfo_Test_campaign() {
		return (EAttribute)gssScenarioInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInfo_Version() {
		return (EAttribute)gssScenarioInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInfo_Date() {
		return (EAttribute)gssScenarioInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInfo_Version_control_url() {
		return (EAttribute)gssScenarioInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioInfoPrint() {
		return gssScenarioInfoPrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInfoPrint_MainLog() {
		return (EAttribute)gssScenarioInfoPrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInfoPrint_PortLogs() {
		return (EAttribute)gssScenarioInfoPrintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInfoPrint_RawLog() {
		return (EAttribute)gssScenarioInfoPrintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPhyHeaderPrint() {
		return gssScenarioPhyHeaderPrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPhyHeaderPrint_MainLog() {
		return (EAttribute)gssScenarioPhyHeaderPrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPhyHeaderPrint_PortLogs() {
		return (EAttribute)gssScenarioPhyHeaderPrintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPhyHeaderPrint_RawLog() {
		return (EAttribute)gssScenarioPhyHeaderPrintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPhyHeaderPrint_GssTabs() {
		return (EAttribute)gssScenarioPhyHeaderPrintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioDiscardErrorFlags() {
		return gssScenarioDiscardErrorFlagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioDiscardErrorFlags_TxErrors() {
		return (EAttribute)gssScenarioDiscardErrorFlagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioDiscardErrorFlags_NotExpectedPackets() {
		return (EAttribute)gssScenarioDiscardErrorFlagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioDiscardErrorFlags_FiltersKo() {
		return (EAttribute)gssScenarioDiscardErrorFlagsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioDiscardErrorFlags_ValidTimesKo() {
		return (EAttribute)gssScenarioDiscardErrorFlagsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioProtocols() {
		return gssScenarioProtocolsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioProtocols_Protocol() {
		return (EReference)gssScenarioProtocolsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioProtocol() {
		return gssScenarioProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioProtocol_Id() {
		return (EAttribute)gssScenarioProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioProtocol_Name() {
		return (EAttribute)gssScenarioProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioProtocol_TypeLevel() {
		return (EAttribute)gssScenarioProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioProtocol_Type() {
		return (EReference)gssScenarioProtocolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioProtocol_Subtype() {
		return (EReference)gssScenarioProtocolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioProtocolType() {
		return gssScenarioProtocolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioProtocolType_Offset() {
		return (EAttribute)gssScenarioProtocolTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioProtocolType_Name() {
		return (EAttribute)gssScenarioProtocolTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioInterfaces() {
		return gssScenarioInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterfaces_ProtocolPacketsFile() {
		return (EReference)gssScenarioInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterfaces_MainInterface() {
		return (EReference)gssScenarioInterfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterfaces_Interface() {
		return (EReference)gssScenarioInterfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioInterface() {
		return gssScenarioInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInterface_Id() {
		return (EAttribute)gssScenarioInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInterface_IfType() {
		return (EAttribute)gssScenarioInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterface_IfConfig() {
		return (EReference)gssScenarioInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioInterface_IoType() {
		return (EAttribute)gssScenarioInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterface_ProtocolID() {
		return (EReference)gssScenarioInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterface_LevelInOut() {
		return (EReference)gssScenarioInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterface_LevelIn() {
		return (EReference)gssScenarioInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioInterface_LevelOut() {
		return (EReference)gssScenarioInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioLevelInOut() {
		return gssScenarioLevelInOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioLevelInOut_Id() {
		return (EAttribute)gssScenarioLevelInOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioLevelInOut_Name() {
		return (EAttribute)gssScenarioLevelInOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelInOut_TMformat() {
		return (EReference)gssScenarioLevelInOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelInOut_TCformat() {
		return (EReference)gssScenarioLevelInOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelInOut_InputFilter() {
		return (EReference)gssScenarioLevelInOutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelInOut_Export_to_prev_Level() {
		return (EReference)gssScenarioLevelInOutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelInOut_Import_from_prev_Level() {
		return (EReference)gssScenarioLevelInOutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioLevelIn() {
		return gssScenarioLevelInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioLevelIn_Id() {
		return (EAttribute)gssScenarioLevelInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioLevelIn_Name() {
		return (EAttribute)gssScenarioLevelInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelIn_TCformat() {
		return (EReference)gssScenarioLevelInEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelIn_Export_to_prev_Level() {
		return (EReference)gssScenarioLevelInEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioLevelOut() {
		return gssScenarioLevelOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioLevelOut_Id() {
		return (EAttribute)gssScenarioLevelOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioLevelOut_Name() {
		return (EAttribute)gssScenarioLevelOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelOut_TMformat() {
		return (EReference)gssScenarioLevelOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelOut_InputFilter() {
		return (EReference)gssScenarioLevelOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioLevelOut_Import_from_prev_Level() {
		return (EReference)gssScenarioLevelOutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioSpecialPackets() {
		return gssScenarioSpecialPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioSpecialPackets_SpecialPacket() {
		return (EReference)gssScenarioSpecialPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioSpecialPacket() {
		return gssScenarioSpecialPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioSpecialPacket_Status() {
		return (EAttribute)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioSpecialPacket_Id() {
		return (EAttribute)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioSpecialPacket_IfRef() {
		return (EAttribute)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioSpecialPacket_Levels() {
		return (EAttribute)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioSpecialPacket_LevelRef() {
		return (EAttribute)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioSpecialPacket_InputFilter() {
		return (EReference)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioSpecialPacket_UpperLevels() {
		return (EReference)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioSpecialPacket_PrintingData() {
		return (EReference)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioSpecialPacket_Period() {
		return (EReference)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioSpecialPacket_IntervalRange() {
		return (EReference)gssScenarioSpecialPacketEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioUpperLevels() {
		return gssScenarioUpperLevelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioUpperLevels_UpperLevel() {
		return (EReference)gssScenarioUpperLevelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioUpperLevel() {
		return gssScenarioUpperLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioUpperLevel_Level() {
		return (EAttribute)gssScenarioUpperLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioUpperLevel_TMformat() {
		return (EReference)gssScenarioUpperLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioUpperLevel_InputFilter() {
		return (EReference)gssScenarioUpperLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioUpperLevel_Import_from_prev_Level() {
		return (EReference)gssScenarioUpperLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPrintingData() {
		return gssScenarioPrintingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPrintingData_PrintStatus() {
		return (EAttribute)gssScenarioPrintingDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPrintingData_StructuredData() {
		return (EReference)gssScenarioPrintingDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioStructuredData() {
		return gssScenarioStructuredDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioStructuredData_LevelRef() {
		return (EAttribute)gssScenarioStructuredDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioStructuredData_FirstField() {
		return (EAttribute)gssScenarioStructuredDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPeriod() {
		return gssScenarioPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriod_Min_value() {
		return (EAttribute)gssScenarioPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriod_Min_unit() {
		return (EAttribute)gssScenarioPeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriod_Max_value() {
		return (EAttribute)gssScenarioPeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriod_Max_unit() {
		return (EAttribute)gssScenarioPeriodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioIntervalRange() {
		return gssScenarioIntervalRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioIntervalRange_Min() {
		return (EAttribute)gssScenarioIntervalRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioIntervalRange_Max() {
		return (EAttribute)gssScenarioIntervalRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioIntervalRange_Interval_value() {
		return (EAttribute)gssScenarioIntervalRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioIntervalRange_Interval_unit() {
		return (EAttribute)gssScenarioIntervalRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPeriodicTCs() {
		return gssScenarioPeriodicTCsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCs_PeriodicTC() {
		return (EReference)gssScenarioPeriodicTCsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPeriodicTC() {
		return gssScenarioPeriodicTCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriodicTC_Name() {
		return (EAttribute)gssScenarioPeriodicTCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriodicTC_Id() {
		return (EAttribute)gssScenarioPeriodicTCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriodicTC_IfRef() {
		return (EAttribute)gssScenarioPeriodicTCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriodicTC_Period_value() {
		return (EAttribute)gssScenarioPeriodicTCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioPeriodicTC_Period_unit() {
		return (EAttribute)gssScenarioPeriodicTCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPeriodicTCLevel2() {
		return gssScenarioPeriodicTCLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel2_Level2() {
		return (EReference)gssScenarioPeriodicTCLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel2_App_to_level2() {
		return (EReference)gssScenarioPeriodicTCLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel2_Level1() {
		return (EReference)gssScenarioPeriodicTCLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel2_Level2_to_level1() {
		return (EReference)gssScenarioPeriodicTCLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel2_Level0() {
		return (EReference)gssScenarioPeriodicTCLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel2_Level1_to_level0() {
		return (EReference)gssScenarioPeriodicTCLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPeriodicTCLevel1() {
		return gssScenarioPeriodicTCLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel1_Level1() {
		return (EReference)gssScenarioPeriodicTCLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel1_App_to_level1() {
		return (EReference)gssScenarioPeriodicTCLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel1_Level0() {
		return (EReference)gssScenarioPeriodicTCLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel1_Level1_to_level0() {
		return (EReference)gssScenarioPeriodicTCLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPeriodicTCLevel0() {
		return gssScenarioPeriodicTCLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel0_Level0() {
		return (EReference)gssScenarioPeriodicTCLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPeriodicTCLevel0_App_to_level0() {
		return (EReference)gssScenarioPeriodicTCLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioGlobalVars() {
		return gssScenarioGlobalVarsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioGlobalVars_GlobalVar() {
		return (EReference)gssScenarioGlobalVarsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioGlobalVar() {
		return gssScenarioGlobalVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioGlobalVar_Id() {
		return (EAttribute)gssScenarioGlobalVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioGlobalVar_Type() {
		return (EAttribute)gssScenarioGlobalVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioGlobalVar_Initial_value() {
		return (EAttribute)gssScenarioGlobalVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioGlobalVar_Reference() {
		return (EReference)gssScenarioGlobalVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioReference() {
		return gssScenarioReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioReference_Level() {
		return (EAttribute)gssScenarioReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioReference_FieldRef() {
		return (EAttribute)gssScenarioReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioReference_Offset() {
		return (EAttribute)gssScenarioReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioReference_Size() {
		return (EAttribute)gssScenarioReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioReferenceField() {
		return gssScenarioReferenceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioReferenceField_Type() {
		return (EAttribute)gssScenarioReferenceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioReferenceField_IfRef() {
		return (EAttribute)gssScenarioReferenceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioReferencePeriodicTC() {
		return gssScenarioReferencePeriodicTCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioReferencePeriodicTC_IdRef() {
		return (EReference)gssScenarioReferencePeriodicTCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioReferenceSpecialPacket() {
		return gssScenarioReferenceSpecialPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioReferenceSpecialPacket_IdRef() {
		return (EReference)gssScenarioReferenceSpecialPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioMonitors() {
		return gssScenarioMonitorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioMonitors_ChartsFile() {
		return (EReference)gssScenarioMonitorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioMonitors_Monitor() {
		return (EReference)gssScenarioMonitorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioMonitor() {
		return gssScenarioMonitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioMonitor_Name() {
		return (EAttribute)gssScenarioMonitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioMonitor_GVRef() {
		return (EReference)gssScenarioMonitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioPlot() {
		return gssScenarioPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioPlot_ChartRef() {
		return (EReference)gssScenarioPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioAlarmMsg() {
		return gssScenarioAlarmMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioAlarmMsg_Type() {
		return (EAttribute)gssScenarioAlarmMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioAlarmMsg_Text() {
		return (EAttribute)gssScenarioAlarmMsgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioModify() {
		return gssScenarioModifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioModify_Type() {
		return (EAttribute)gssScenarioModifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioModify_Value() {
		return (EAttribute)gssScenarioModifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioAlarmVal() {
		return gssScenarioAlarmValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioAlarmVal_Type() {
		return (EAttribute)gssScenarioAlarmValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioGVRef() {
		return gssScenarioGVRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioGVRef_GlobalVarRef() {
		return (EReference)gssScenarioGVRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioGVFiltered() {
		return gssScenarioGVFilteredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSScenarioGVFiltered_Filter() {
		return (EReference)gssScenarioGVFilteredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSScenarioGVPeriodic() {
		return gssScenarioGVPeriodicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioGVPeriodic_Period_value() {
		return (EAttribute)gssScenarioGVPeriodicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSScenarioGVPeriodic_Period_unit() {
		return (EAttribute)gssScenarioGVPeriodicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioEnableDisable() {
		return gssScenarioEnableDisableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioInterfaceType() {
		return gssScenarioInterfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioInterfaceIOType() {
		return gssScenarioInterfaceIOTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioUpperLevelLevel() {
		return gssScenarioUpperLevelLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioUnit() {
		return gssScenarioUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioGlobalVarType() {
		return gssScenarioGlobalVarTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioReferenceFieldType() {
		return gssScenarioReferenceFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioAlarmMsgType() {
		return gssScenarioAlarmMsgTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioModifyType() {
		return gssScenarioModifyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSScenarioAlarmValType() {
		return gssScenarioAlarmValTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenarioFactory getscenarioFactory() {
		return (scenarioFactory)getEFactoryInstance();
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
		gssScenarioScenarioEClass = createEClass(GSS_SCENARIO_SCENARIO);
		createEReference(gssScenarioScenarioEClass, GSS_SCENARIO_SCENARIO__GSS_OPTIONS);
		createEReference(gssScenarioScenarioEClass, GSS_SCENARIO_SCENARIO__PROTOCOLS);
		createEReference(gssScenarioScenarioEClass, GSS_SCENARIO_SCENARIO__INTERFACES);
		createEReference(gssScenarioScenarioEClass, GSS_SCENARIO_SCENARIO__SPECIAL_PACKETS);
		createEReference(gssScenarioScenarioEClass, GSS_SCENARIO_SCENARIO__PERIODIC_TCS);
		createEReference(gssScenarioScenarioEClass, GSS_SCENARIO_SCENARIO__GLOBAL_VARS);
		createEReference(gssScenarioScenarioEClass, GSS_SCENARIO_SCENARIO__MONITORS);

		gssScenarioOptionsEClass = createEClass(GSS_SCENARIO_OPTIONS);
		createEReference(gssScenarioOptionsEClass, GSS_SCENARIO_OPTIONS__GSS_INFO);
		createEReference(gssScenarioOptionsEClass, GSS_SCENARIO_OPTIONS__GSS_INFO_PRINT);
		createEReference(gssScenarioOptionsEClass, GSS_SCENARIO_OPTIONS__PHY_HEADER_PRINT);
		createEReference(gssScenarioOptionsEClass, GSS_SCENARIO_OPTIONS__DISCARD_ERROR_FLAGS);

		gssScenarioInfoEClass = createEClass(GSS_SCENARIO_INFO);
		createEAttribute(gssScenarioInfoEClass, GSS_SCENARIO_INFO__TEST_CAMPAIGN);
		createEAttribute(gssScenarioInfoEClass, GSS_SCENARIO_INFO__VERSION);
		createEAttribute(gssScenarioInfoEClass, GSS_SCENARIO_INFO__DATE);
		createEAttribute(gssScenarioInfoEClass, GSS_SCENARIO_INFO__VERSION_CONTROL_URL);

		gssScenarioInfoPrintEClass = createEClass(GSS_SCENARIO_INFO_PRINT);
		createEAttribute(gssScenarioInfoPrintEClass, GSS_SCENARIO_INFO_PRINT__MAIN_LOG);
		createEAttribute(gssScenarioInfoPrintEClass, GSS_SCENARIO_INFO_PRINT__PORT_LOGS);
		createEAttribute(gssScenarioInfoPrintEClass, GSS_SCENARIO_INFO_PRINT__RAW_LOG);

		gssScenarioPhyHeaderPrintEClass = createEClass(GSS_SCENARIO_PHY_HEADER_PRINT);
		createEAttribute(gssScenarioPhyHeaderPrintEClass, GSS_SCENARIO_PHY_HEADER_PRINT__MAIN_LOG);
		createEAttribute(gssScenarioPhyHeaderPrintEClass, GSS_SCENARIO_PHY_HEADER_PRINT__PORT_LOGS);
		createEAttribute(gssScenarioPhyHeaderPrintEClass, GSS_SCENARIO_PHY_HEADER_PRINT__RAW_LOG);
		createEAttribute(gssScenarioPhyHeaderPrintEClass, GSS_SCENARIO_PHY_HEADER_PRINT__GSS_TABS);

		gssScenarioDiscardErrorFlagsEClass = createEClass(GSS_SCENARIO_DISCARD_ERROR_FLAGS);
		createEAttribute(gssScenarioDiscardErrorFlagsEClass, GSS_SCENARIO_DISCARD_ERROR_FLAGS__TX_ERRORS);
		createEAttribute(gssScenarioDiscardErrorFlagsEClass, GSS_SCENARIO_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS);
		createEAttribute(gssScenarioDiscardErrorFlagsEClass, GSS_SCENARIO_DISCARD_ERROR_FLAGS__FILTERS_KO);
		createEAttribute(gssScenarioDiscardErrorFlagsEClass, GSS_SCENARIO_DISCARD_ERROR_FLAGS__VALID_TIMES_KO);

		gssScenarioProtocolsEClass = createEClass(GSS_SCENARIO_PROTOCOLS);
		createEReference(gssScenarioProtocolsEClass, GSS_SCENARIO_PROTOCOLS__PROTOCOL);

		gssScenarioProtocolEClass = createEClass(GSS_SCENARIO_PROTOCOL);
		createEAttribute(gssScenarioProtocolEClass, GSS_SCENARIO_PROTOCOL__ID);
		createEAttribute(gssScenarioProtocolEClass, GSS_SCENARIO_PROTOCOL__NAME);
		createEAttribute(gssScenarioProtocolEClass, GSS_SCENARIO_PROTOCOL__TYPE_LEVEL);
		createEReference(gssScenarioProtocolEClass, GSS_SCENARIO_PROTOCOL__TYPE);
		createEReference(gssScenarioProtocolEClass, GSS_SCENARIO_PROTOCOL__SUBTYPE);

		gssScenarioProtocolTypeEClass = createEClass(GSS_SCENARIO_PROTOCOL_TYPE);
		createEAttribute(gssScenarioProtocolTypeEClass, GSS_SCENARIO_PROTOCOL_TYPE__OFFSET);
		createEAttribute(gssScenarioProtocolTypeEClass, GSS_SCENARIO_PROTOCOL_TYPE__NAME);

		gssScenarioInterfacesEClass = createEClass(GSS_SCENARIO_INTERFACES);
		createEReference(gssScenarioInterfacesEClass, GSS_SCENARIO_INTERFACES__PROTOCOL_PACKETS_FILE);
		createEReference(gssScenarioInterfacesEClass, GSS_SCENARIO_INTERFACES__MAIN_INTERFACE);
		createEReference(gssScenarioInterfacesEClass, GSS_SCENARIO_INTERFACES__INTERFACE);

		gssScenarioInterfaceEClass = createEClass(GSS_SCENARIO_INTERFACE);
		createEAttribute(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__ID);
		createEAttribute(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__IF_TYPE);
		createEReference(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__IF_CONFIG);
		createEAttribute(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__IO_TYPE);
		createEReference(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__PROTOCOL_ID);
		createEReference(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__LEVEL_IN_OUT);
		createEReference(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__LEVEL_IN);
		createEReference(gssScenarioInterfaceEClass, GSS_SCENARIO_INTERFACE__LEVEL_OUT);

		gssScenarioLevelInOutEClass = createEClass(GSS_SCENARIO_LEVEL_IN_OUT);
		createEAttribute(gssScenarioLevelInOutEClass, GSS_SCENARIO_LEVEL_IN_OUT__ID);
		createEAttribute(gssScenarioLevelInOutEClass, GSS_SCENARIO_LEVEL_IN_OUT__NAME);
		createEReference(gssScenarioLevelInOutEClass, GSS_SCENARIO_LEVEL_IN_OUT__TMFORMAT);
		createEReference(gssScenarioLevelInOutEClass, GSS_SCENARIO_LEVEL_IN_OUT__TCFORMAT);
		createEReference(gssScenarioLevelInOutEClass, GSS_SCENARIO_LEVEL_IN_OUT__INPUT_FILTER);
		createEReference(gssScenarioLevelInOutEClass, GSS_SCENARIO_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL);
		createEReference(gssScenarioLevelInOutEClass, GSS_SCENARIO_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL);

		gssScenarioLevelInEClass = createEClass(GSS_SCENARIO_LEVEL_IN);
		createEAttribute(gssScenarioLevelInEClass, GSS_SCENARIO_LEVEL_IN__ID);
		createEAttribute(gssScenarioLevelInEClass, GSS_SCENARIO_LEVEL_IN__NAME);
		createEReference(gssScenarioLevelInEClass, GSS_SCENARIO_LEVEL_IN__TCFORMAT);
		createEReference(gssScenarioLevelInEClass, GSS_SCENARIO_LEVEL_IN__EXPORT_TO_PREV_LEVEL);

		gssScenarioLevelOutEClass = createEClass(GSS_SCENARIO_LEVEL_OUT);
		createEAttribute(gssScenarioLevelOutEClass, GSS_SCENARIO_LEVEL_OUT__ID);
		createEAttribute(gssScenarioLevelOutEClass, GSS_SCENARIO_LEVEL_OUT__NAME);
		createEReference(gssScenarioLevelOutEClass, GSS_SCENARIO_LEVEL_OUT__TMFORMAT);
		createEReference(gssScenarioLevelOutEClass, GSS_SCENARIO_LEVEL_OUT__INPUT_FILTER);
		createEReference(gssScenarioLevelOutEClass, GSS_SCENARIO_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL);

		gssScenarioSpecialPacketsEClass = createEClass(GSS_SCENARIO_SPECIAL_PACKETS);
		createEReference(gssScenarioSpecialPacketsEClass, GSS_SCENARIO_SPECIAL_PACKETS__SPECIAL_PACKET);

		gssScenarioSpecialPacketEClass = createEClass(GSS_SCENARIO_SPECIAL_PACKET);
		createEAttribute(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__STATUS);
		createEAttribute(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__ID);
		createEAttribute(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__IF_REF);
		createEAttribute(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__LEVELS);
		createEAttribute(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__LEVEL_REF);
		createEReference(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__INPUT_FILTER);
		createEReference(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__UPPER_LEVELS);
		createEReference(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__PRINTING_DATA);
		createEReference(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__PERIOD);
		createEReference(gssScenarioSpecialPacketEClass, GSS_SCENARIO_SPECIAL_PACKET__INTERVAL_RANGE);

		gssScenarioUpperLevelsEClass = createEClass(GSS_SCENARIO_UPPER_LEVELS);
		createEReference(gssScenarioUpperLevelsEClass, GSS_SCENARIO_UPPER_LEVELS__UPPER_LEVEL);

		gssScenarioUpperLevelEClass = createEClass(GSS_SCENARIO_UPPER_LEVEL);
		createEAttribute(gssScenarioUpperLevelEClass, GSS_SCENARIO_UPPER_LEVEL__LEVEL);
		createEReference(gssScenarioUpperLevelEClass, GSS_SCENARIO_UPPER_LEVEL__TMFORMAT);
		createEReference(gssScenarioUpperLevelEClass, GSS_SCENARIO_UPPER_LEVEL__INPUT_FILTER);
		createEReference(gssScenarioUpperLevelEClass, GSS_SCENARIO_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL);

		gssScenarioPrintingDataEClass = createEClass(GSS_SCENARIO_PRINTING_DATA);
		createEAttribute(gssScenarioPrintingDataEClass, GSS_SCENARIO_PRINTING_DATA__PRINT_STATUS);
		createEReference(gssScenarioPrintingDataEClass, GSS_SCENARIO_PRINTING_DATA__STRUCTURED_DATA);

		gssScenarioStructuredDataEClass = createEClass(GSS_SCENARIO_STRUCTURED_DATA);
		createEAttribute(gssScenarioStructuredDataEClass, GSS_SCENARIO_STRUCTURED_DATA__LEVEL_REF);
		createEAttribute(gssScenarioStructuredDataEClass, GSS_SCENARIO_STRUCTURED_DATA__FIRST_FIELD);

		gssScenarioPeriodEClass = createEClass(GSS_SCENARIO_PERIOD);
		createEAttribute(gssScenarioPeriodEClass, GSS_SCENARIO_PERIOD__MIN_VALUE);
		createEAttribute(gssScenarioPeriodEClass, GSS_SCENARIO_PERIOD__MIN_UNIT);
		createEAttribute(gssScenarioPeriodEClass, GSS_SCENARIO_PERIOD__MAX_VALUE);
		createEAttribute(gssScenarioPeriodEClass, GSS_SCENARIO_PERIOD__MAX_UNIT);

		gssScenarioIntervalRangeEClass = createEClass(GSS_SCENARIO_INTERVAL_RANGE);
		createEAttribute(gssScenarioIntervalRangeEClass, GSS_SCENARIO_INTERVAL_RANGE__MIN);
		createEAttribute(gssScenarioIntervalRangeEClass, GSS_SCENARIO_INTERVAL_RANGE__MAX);
		createEAttribute(gssScenarioIntervalRangeEClass, GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_VALUE);
		createEAttribute(gssScenarioIntervalRangeEClass, GSS_SCENARIO_INTERVAL_RANGE__INTERVAL_UNIT);

		gssScenarioPeriodicTCsEClass = createEClass(GSS_SCENARIO_PERIODIC_TCS);
		createEReference(gssScenarioPeriodicTCsEClass, GSS_SCENARIO_PERIODIC_TCS__PERIODIC_TC);

		gssScenarioPeriodicTCEClass = createEClass(GSS_SCENARIO_PERIODIC_TC);
		createEAttribute(gssScenarioPeriodicTCEClass, GSS_SCENARIO_PERIODIC_TC__NAME);
		createEAttribute(gssScenarioPeriodicTCEClass, GSS_SCENARIO_PERIODIC_TC__ID);
		createEAttribute(gssScenarioPeriodicTCEClass, GSS_SCENARIO_PERIODIC_TC__IF_REF);
		createEAttribute(gssScenarioPeriodicTCEClass, GSS_SCENARIO_PERIODIC_TC__PERIOD_VALUE);
		createEAttribute(gssScenarioPeriodicTCEClass, GSS_SCENARIO_PERIODIC_TC__PERIOD_UNIT);

		gssScenarioPeriodicTCLevel2EClass = createEClass(GSS_SCENARIO_PERIODIC_TC_LEVEL2);
		createEReference(gssScenarioPeriodicTCLevel2EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2);
		createEReference(gssScenarioPeriodicTCLevel2EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2);
		createEReference(gssScenarioPeriodicTCLevel2EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1);
		createEReference(gssScenarioPeriodicTCLevel2EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1);
		createEReference(gssScenarioPeriodicTCLevel2EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL0);
		createEReference(gssScenarioPeriodicTCLevel2EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0);

		gssScenarioPeriodicTCLevel1EClass = createEClass(GSS_SCENARIO_PERIODIC_TC_LEVEL1);
		createEReference(gssScenarioPeriodicTCLevel1EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL1);
		createEReference(gssScenarioPeriodicTCLevel1EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1);
		createEReference(gssScenarioPeriodicTCLevel1EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL0);
		createEReference(gssScenarioPeriodicTCLevel1EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0);

		gssScenarioPeriodicTCLevel0EClass = createEClass(GSS_SCENARIO_PERIODIC_TC_LEVEL0);
		createEReference(gssScenarioPeriodicTCLevel0EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL0__LEVEL0);
		createEReference(gssScenarioPeriodicTCLevel0EClass, GSS_SCENARIO_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0);

		gssScenarioGlobalVarsEClass = createEClass(GSS_SCENARIO_GLOBAL_VARS);
		createEReference(gssScenarioGlobalVarsEClass, GSS_SCENARIO_GLOBAL_VARS__GLOBAL_VAR);

		gssScenarioGlobalVarEClass = createEClass(GSS_SCENARIO_GLOBAL_VAR);
		createEAttribute(gssScenarioGlobalVarEClass, GSS_SCENARIO_GLOBAL_VAR__ID);
		createEAttribute(gssScenarioGlobalVarEClass, GSS_SCENARIO_GLOBAL_VAR__TYPE);
		createEAttribute(gssScenarioGlobalVarEClass, GSS_SCENARIO_GLOBAL_VAR__INITIAL_VALUE);
		createEReference(gssScenarioGlobalVarEClass, GSS_SCENARIO_GLOBAL_VAR__REFERENCE);

		gssScenarioReferenceEClass = createEClass(GSS_SCENARIO_REFERENCE);
		createEAttribute(gssScenarioReferenceEClass, GSS_SCENARIO_REFERENCE__LEVEL);
		createEAttribute(gssScenarioReferenceEClass, GSS_SCENARIO_REFERENCE__FIELD_REF);
		createEAttribute(gssScenarioReferenceEClass, GSS_SCENARIO_REFERENCE__OFFSET);
		createEAttribute(gssScenarioReferenceEClass, GSS_SCENARIO_REFERENCE__SIZE);

		gssScenarioReferenceFieldEClass = createEClass(GSS_SCENARIO_REFERENCE_FIELD);
		createEAttribute(gssScenarioReferenceFieldEClass, GSS_SCENARIO_REFERENCE_FIELD__TYPE);
		createEAttribute(gssScenarioReferenceFieldEClass, GSS_SCENARIO_REFERENCE_FIELD__IF_REF);

		gssScenarioReferencePeriodicTCEClass = createEClass(GSS_SCENARIO_REFERENCE_PERIODIC_TC);
		createEReference(gssScenarioReferencePeriodicTCEClass, GSS_SCENARIO_REFERENCE_PERIODIC_TC__ID_REF);

		gssScenarioReferenceSpecialPacketEClass = createEClass(GSS_SCENARIO_REFERENCE_SPECIAL_PACKET);
		createEReference(gssScenarioReferenceSpecialPacketEClass, GSS_SCENARIO_REFERENCE_SPECIAL_PACKET__ID_REF);

		gssScenarioMonitorsEClass = createEClass(GSS_SCENARIO_MONITORS);
		createEReference(gssScenarioMonitorsEClass, GSS_SCENARIO_MONITORS__CHARTS_FILE);
		createEReference(gssScenarioMonitorsEClass, GSS_SCENARIO_MONITORS__MONITOR);

		gssScenarioMonitorEClass = createEClass(GSS_SCENARIO_MONITOR);
		createEAttribute(gssScenarioMonitorEClass, GSS_SCENARIO_MONITOR__NAME);
		createEReference(gssScenarioMonitorEClass, GSS_SCENARIO_MONITOR__GV_REF);

		gssScenarioPlotEClass = createEClass(GSS_SCENARIO_PLOT);
		createEReference(gssScenarioPlotEClass, GSS_SCENARIO_PLOT__CHART_REF);

		gssScenarioAlarmMsgEClass = createEClass(GSS_SCENARIO_ALARM_MSG);
		createEAttribute(gssScenarioAlarmMsgEClass, GSS_SCENARIO_ALARM_MSG__TYPE);
		createEAttribute(gssScenarioAlarmMsgEClass, GSS_SCENARIO_ALARM_MSG__TEXT);

		gssScenarioModifyEClass = createEClass(GSS_SCENARIO_MODIFY);
		createEAttribute(gssScenarioModifyEClass, GSS_SCENARIO_MODIFY__TYPE);
		createEAttribute(gssScenarioModifyEClass, GSS_SCENARIO_MODIFY__VALUE);

		gssScenarioAlarmValEClass = createEClass(GSS_SCENARIO_ALARM_VAL);
		createEAttribute(gssScenarioAlarmValEClass, GSS_SCENARIO_ALARM_VAL__TYPE);

		gssScenarioGVRefEClass = createEClass(GSS_SCENARIO_GV_REF);
		createEReference(gssScenarioGVRefEClass, GSS_SCENARIO_GV_REF__GLOBAL_VAR_REF);

		gssScenarioGVFilteredEClass = createEClass(GSS_SCENARIO_GV_FILTERED);
		createEReference(gssScenarioGVFilteredEClass, GSS_SCENARIO_GV_FILTERED__FILTER);

		gssScenarioGVPeriodicEClass = createEClass(GSS_SCENARIO_GV_PERIODIC);
		createEAttribute(gssScenarioGVPeriodicEClass, GSS_SCENARIO_GV_PERIODIC__PERIOD_VALUE);
		createEAttribute(gssScenarioGVPeriodicEClass, GSS_SCENARIO_GV_PERIODIC__PERIOD_UNIT);

		// Create enums
		gssScenarioEnableDisableEEnum = createEEnum(GSS_SCENARIO_ENABLE_DISABLE);
		gssScenarioInterfaceTypeEEnum = createEEnum(GSS_SCENARIO_INTERFACE_TYPE);
		gssScenarioInterfaceIOTypeEEnum = createEEnum(GSS_SCENARIO_INTERFACE_IO_TYPE);
		gssScenarioUpperLevelLevelEEnum = createEEnum(GSS_SCENARIO_UPPER_LEVEL_LEVEL);
		gssScenarioUnitEEnum = createEEnum(GSS_SCENARIO_UNIT);
		gssScenarioGlobalVarTypeEEnum = createEEnum(GSS_SCENARIO_GLOBAL_VAR_TYPE);
		gssScenarioReferenceFieldTypeEEnum = createEEnum(GSS_SCENARIO_REFERENCE_FIELD_TYPE);
		gssScenarioAlarmMsgTypeEEnum = createEEnum(GSS_SCENARIO_ALARM_MSG_TYPE);
		gssScenarioModifyTypeEEnum = createEEnum(GSS_SCENARIO_MODIFY_TYPE);
		gssScenarioAlarmValTypeEEnum = createEEnum(GSS_SCENARIO_ALARM_VAL_TYPE);
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
		es.uah.aut.srg.tmtcif.scenario.scenarioPackage thescenarioPackage_1 = (es.uah.aut.srg.tmtcif.scenario.scenarioPackage)EPackage.Registry.INSTANCE.getEPackage(es.uah.aut.srg.tmtcif.scenario.scenarioPackage.eNS_URI);
		protocol_packetsPackage theprotocol_packetsPackage = (protocol_packetsPackage)EPackage.Registry.INSTANCE.getEPackage(protocol_packetsPackage.eNS_URI);
		ifacePackage theifacePackage = (ifacePackage)EPackage.Registry.INSTANCE.getEPackage(ifacePackage.eNS_URI);
		formatPackage theformatPackage = (formatPackage)EPackage.Registry.INSTANCE.getEPackage(formatPackage.eNS_URI);
		filterPackage thefilterPackage = (filterPackage)EPackage.Registry.INSTANCE.getEPackage(filterPackage.eNS_URI);
		exportPackage theexportPackage = (exportPackage)EPackage.Registry.INSTANCE.getEPackage(exportPackage.eNS_URI);
		importPackage theimportPackage = (importPackage)EPackage.Registry.INSTANCE.getEPackage(importPackage.eNS_URI);
		chartsPackage thechartsPackage = (chartsPackage)EPackage.Registry.INSTANCE.getEPackage(chartsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gssScenarioScenarioEClass.getESuperTypes().add(thescenarioPackage_1.getTMTCIFScenario());
		gssScenarioInterfaceEClass.getESuperTypes().add(thescenarioPackage_1.getTMTCIFScenarioInterface());
		gssScenarioSpecialPacketEClass.getESuperTypes().add(thescenarioPackage_1.getTMTCIFScenarioPacketConfig());
		gssScenarioPeriodicTCLevel2EClass.getESuperTypes().add(this.getGSSScenarioPeriodicTC());
		gssScenarioPeriodicTCLevel1EClass.getESuperTypes().add(this.getGSSScenarioPeriodicTC());
		gssScenarioPeriodicTCLevel0EClass.getESuperTypes().add(this.getGSSScenarioPeriodicTC());
		gssScenarioGlobalVarEClass.getESuperTypes().add(thescenarioPackage_1.getTMTCIFScenarioVariable());
		gssScenarioReferenceFieldEClass.getESuperTypes().add(this.getGSSScenarioReference());
		gssScenarioReferencePeriodicTCEClass.getESuperTypes().add(this.getGSSScenarioReference());
		gssScenarioReferenceSpecialPacketEClass.getESuperTypes().add(this.getGSSScenarioReference());
		gssScenarioPlotEClass.getESuperTypes().add(this.getGSSScenarioMonitor());
		gssScenarioAlarmMsgEClass.getESuperTypes().add(this.getGSSScenarioMonitor());
		gssScenarioModifyEClass.getESuperTypes().add(this.getGSSScenarioMonitor());
		gssScenarioAlarmValEClass.getESuperTypes().add(this.getGSSScenarioMonitor());
		gssScenarioGVFilteredEClass.getESuperTypes().add(this.getGSSScenarioGVRef());
		gssScenarioGVPeriodicEClass.getESuperTypes().add(this.getGSSScenarioGVRef());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssScenarioScenarioEClass, GSSScenarioScenario.class, "GSSScenarioScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioScenario_Gss_options(), this.getGSSScenarioOptions(), null, "gss_options", null, 1, 1, GSSScenarioScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioScenario_Protocols(), this.getGSSScenarioProtocols(), null, "Protocols", null, 1, 1, GSSScenarioScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioScenario_Interfaces(), this.getGSSScenarioInterfaces(), null, "Interfaces", null, 1, 1, GSSScenarioScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioScenario_SpecialPackets(), this.getGSSScenarioSpecialPackets(), null, "SpecialPackets", null, 0, 1, GSSScenarioScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioScenario_PeriodicTCs(), this.getGSSScenarioPeriodicTCs(), null, "PeriodicTCs", null, 0, 1, GSSScenarioScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioScenario_GlobalVars(), this.getGSSScenarioGlobalVars(), null, "GlobalVars", null, 0, 1, GSSScenarioScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioScenario_Monitors(), this.getGSSScenarioMonitors(), null, "Monitors", null, 0, 1, GSSScenarioScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioOptionsEClass, GSSScenarioOptions.class, "GSSScenarioOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioOptions_Gss_info(), this.getGSSScenarioInfo(), null, "gss_info", null, 1, 1, GSSScenarioOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioOptions_Gss_info_print(), this.getGSSScenarioInfoPrint(), null, "gss_info_print", null, 1, 1, GSSScenarioOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioOptions_Phy_header_print(), this.getGSSScenarioPhyHeaderPrint(), null, "phy_header_print", null, 1, 1, GSSScenarioOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioOptions_DiscardErrorFlags(), this.getGSSScenarioDiscardErrorFlags(), null, "discardErrorFlags", null, 1, 1, GSSScenarioOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioInfoEClass, GSSScenarioInfo.class, "GSSScenarioInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioInfo_Test_campaign(), ecorePackage.getEString(), "test_campaign", null, 1, 1, GSSScenarioInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioInfo_Version(), ecorePackage.getEString(), "version", null, 1, 1, GSSScenarioInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioInfo_Date(), ecorePackage.getEString(), "date", null, 1, 1, GSSScenarioInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioInfo_Version_control_url(), ecorePackage.getEString(), "version_control_url", null, 0, 1, GSSScenarioInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioInfoPrintEClass, GSSScenarioInfoPrint.class, "GSSScenarioInfoPrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioInfoPrint_MainLog(), this.getGSSScenarioEnableDisable(), "mainLog", null, 1, 1, GSSScenarioInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioInfoPrint_PortLogs(), this.getGSSScenarioEnableDisable(), "portLogs", null, 1, 1, GSSScenarioInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioInfoPrint_RawLog(), this.getGSSScenarioEnableDisable(), "rawLog", null, 1, 1, GSSScenarioInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPhyHeaderPrintEClass, GSSScenarioPhyHeaderPrint.class, "GSSScenarioPhyHeaderPrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioPhyHeaderPrint_MainLog(), this.getGSSScenarioEnableDisable(), "mainLog", null, 1, 1, GSSScenarioPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPhyHeaderPrint_PortLogs(), this.getGSSScenarioEnableDisable(), "portLogs", null, 1, 1, GSSScenarioPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPhyHeaderPrint_RawLog(), this.getGSSScenarioEnableDisable(), "rawLog", null, 1, 1, GSSScenarioPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPhyHeaderPrint_GssTabs(), this.getGSSScenarioEnableDisable(), "gssTabs", null, 1, 1, GSSScenarioPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioDiscardErrorFlagsEClass, GSSScenarioDiscardErrorFlags.class, "GSSScenarioDiscardErrorFlags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioDiscardErrorFlags_TxErrors(), this.getGSSScenarioEnableDisable(), "txErrors", null, 1, 1, GSSScenarioDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioDiscardErrorFlags_NotExpectedPackets(), this.getGSSScenarioEnableDisable(), "notExpectedPackets", null, 1, 1, GSSScenarioDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioDiscardErrorFlags_FiltersKo(), this.getGSSScenarioEnableDisable(), "filtersKo", null, 1, 1, GSSScenarioDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioDiscardErrorFlags_ValidTimesKo(), this.getGSSScenarioEnableDisable(), "validTimesKo", null, 1, 1, GSSScenarioDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioProtocolsEClass, GSSScenarioProtocols.class, "GSSScenarioProtocols", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioProtocols_Protocol(), this.getGSSScenarioProtocol(), null, "Protocol", null, 0, 2, GSSScenarioProtocols.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioProtocolEClass, GSSScenarioProtocol.class, "GSSScenarioProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioProtocol_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioProtocol_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSScenarioProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioProtocol_TypeLevel(), ecorePackage.getEString(), "typeLevel", null, 1, 1, GSSScenarioProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioProtocol_Type(), this.getGSSScenarioProtocolType(), null, "type", null, 1, 1, GSSScenarioProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioProtocol_Subtype(), this.getGSSScenarioProtocolType(), null, "subtype", null, 0, 1, GSSScenarioProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioProtocolTypeEClass, GSSScenarioProtocolType.class, "GSSScenarioProtocolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioProtocolType_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSScenarioProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioProtocolType_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSScenarioProtocolType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioInterfacesEClass, GSSScenarioInterfaces.class, "GSSScenarioInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioInterfaces_ProtocolPacketsFile(), theprotocol_packetsPackage.getGSSProtocolPacketsProtocolPackets(), null, "ProtocolPacketsFile", null, 0, 1, GSSScenarioInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioInterfaces_MainInterface(), this.getGSSScenarioInterface(), null, "MainInterface", null, 1, 1, GSSScenarioInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioInterfaces_Interface(), this.getGSSScenarioInterface(), null, "Interface", null, 0, 7, GSSScenarioInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioInterfaceEClass, GSSScenarioInterface.class, "GSSScenarioInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioInterface_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioInterface_IfType(), this.getGSSScenarioInterfaceType(), "ifType", null, 1, 1, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioInterface_IfConfig(), theifacePackage.getGSSIfacePortConfig(), null, "ifConfig", null, 1, 1, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioInterface_IoType(), this.getGSSScenarioInterfaceIOType(), "ioType", null, 1, 1, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioInterface_ProtocolID(), this.getGSSScenarioProtocol(), null, "protocolID", null, 0, 1, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioInterface_LevelInOut(), this.getGSSScenarioLevelInOut(), null, "LevelInOut", null, 0, 3, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioInterface_LevelIn(), this.getGSSScenarioLevelIn(), null, "LevelIn", null, 0, 3, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioInterface_LevelOut(), this.getGSSScenarioLevelOut(), null, "LevelOut", null, 0, 3, GSSScenarioInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioLevelInOutEClass, GSSScenarioLevelInOut.class, "GSSScenarioLevelInOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioLevelInOut_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioLevelInOut_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSScenarioLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelInOut_TMformat(), theformatPackage.getGSSFormatFormat(), null, "TMformat", null, 1, 1, GSSScenarioLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelInOut_TCformat(), theformatPackage.getGSSFormatFormat(), null, "TCformat", null, 1, 1, GSSScenarioLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelInOut_InputFilter(), thefilterPackage.getGSSFilterFilter(), null, "inputFilter", null, 1, 1, GSSScenarioLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelInOut_Export_to_prev_Level(), theexportPackage.getGSSExportExport(), null, "export_to_prev_Level", null, 0, 1, GSSScenarioLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelInOut_Import_from_prev_Level(), theimportPackage.getGSSImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSScenarioLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioLevelInEClass, GSSScenarioLevelIn.class, "GSSScenarioLevelIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioLevelIn_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioLevelIn_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSScenarioLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelIn_TCformat(), theformatPackage.getGSSFormatFormat(), null, "TCformat", null, 1, 1, GSSScenarioLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelIn_Export_to_prev_Level(), theexportPackage.getGSSExportExport(), null, "export_to_prev_Level", null, 0, 1, GSSScenarioLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioLevelOutEClass, GSSScenarioLevelOut.class, "GSSScenarioLevelOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioLevelOut_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioLevelOut_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSScenarioLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelOut_TMformat(), theformatPackage.getGSSFormatFormat(), null, "TMformat", null, 1, 1, GSSScenarioLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelOut_InputFilter(), thefilterPackage.getGSSFilterFilter(), null, "inputFilter", null, 1, 1, GSSScenarioLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioLevelOut_Import_from_prev_Level(), theimportPackage.getGSSImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSScenarioLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioSpecialPacketsEClass, GSSScenarioSpecialPackets.class, "GSSScenarioSpecialPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioSpecialPackets_SpecialPacket(), this.getGSSScenarioSpecialPacket(), null, "SpecialPacket", null, 1, 17, GSSScenarioSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioSpecialPacketEClass, GSSScenarioSpecialPacket.class, "GSSScenarioSpecialPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioSpecialPacket_Status(), this.getGSSScenarioEnableDisable(), "status", null, 1, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioSpecialPacket_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioSpecialPacket_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioSpecialPacket_Levels(), ecorePackage.getEString(), "levels", null, 1, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioSpecialPacket_LevelRef(), ecorePackage.getEString(), "levelRef", null, 1, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioSpecialPacket_InputFilter(), thefilterPackage.getGSSFilterFilter(), null, "inputFilter", null, 1, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioSpecialPacket_UpperLevels(), this.getGSSScenarioUpperLevels(), null, "UpperLevels", null, 0, 3, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioSpecialPacket_PrintingData(), this.getGSSScenarioPrintingData(), null, "printingData", null, 1, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioSpecialPacket_Period(), this.getGSSScenarioPeriod(), null, "period", null, 0, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioSpecialPacket_IntervalRange(), this.getGSSScenarioIntervalRange(), null, "intervalRange", null, 0, 1, GSSScenarioSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioUpperLevelsEClass, GSSScenarioUpperLevels.class, "GSSScenarioUpperLevels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioUpperLevels_UpperLevel(), this.getGSSScenarioUpperLevel(), null, "UpperLevel", null, 1, -1, GSSScenarioUpperLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioUpperLevelEClass, GSSScenarioUpperLevel.class, "GSSScenarioUpperLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioUpperLevel_Level(), this.getGSSScenarioUpperLevelLevel(), "level", null, 1, 1, GSSScenarioUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioUpperLevel_TMformat(), theformatPackage.getGSSFormatFormat(), null, "TMformat", null, 1, 1, GSSScenarioUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioUpperLevel_InputFilter(), thefilterPackage.getGSSFilterFilter(), null, "inputFilter", null, 0, 1, GSSScenarioUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioUpperLevel_Import_from_prev_Level(), theimportPackage.getGSSImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSScenarioUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPrintingDataEClass, GSSScenarioPrintingData.class, "GSSScenarioPrintingData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioPrintingData_PrintStatus(), this.getGSSScenarioEnableDisable(), "printStatus", null, 1, 1, GSSScenarioPrintingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPrintingData_StructuredData(), this.getGSSScenarioStructuredData(), null, "structuredData", null, 0, 1, GSSScenarioPrintingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioStructuredDataEClass, GSSScenarioStructuredData.class, "GSSScenarioStructuredData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioStructuredData_LevelRef(), ecorePackage.getEString(), "levelRef", null, 1, 1, GSSScenarioStructuredData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioStructuredData_FirstField(), ecorePackage.getEString(), "firstField", null, 1, 1, GSSScenarioStructuredData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPeriodEClass, GSSScenarioPeriod.class, "GSSScenarioPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioPeriod_Min_value(), ecorePackage.getEString(), "min_value", null, 1, 1, GSSScenarioPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPeriod_Min_unit(), this.getGSSScenarioUnit(), "min_unit", null, 1, 1, GSSScenarioPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPeriod_Max_value(), ecorePackage.getEString(), "max_value", null, 1, 1, GSSScenarioPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPeriod_Max_unit(), this.getGSSScenarioUnit(), "max_unit", null, 1, 1, GSSScenarioPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioIntervalRangeEClass, GSSScenarioIntervalRange.class, "GSSScenarioIntervalRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioIntervalRange_Min(), ecorePackage.getEString(), "min", null, 1, 1, GSSScenarioIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioIntervalRange_Max(), ecorePackage.getEString(), "max", null, 1, 1, GSSScenarioIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioIntervalRange_Interval_value(), ecorePackage.getEString(), "interval_value", null, 1, 1, GSSScenarioIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioIntervalRange_Interval_unit(), this.getGSSScenarioUnit(), "interval_unit", null, 1, 1, GSSScenarioIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPeriodicTCsEClass, GSSScenarioPeriodicTCs.class, "GSSScenarioPeriodicTCs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioPeriodicTCs_PeriodicTC(), this.getGSSScenarioPeriodicTC(), null, "PeriodicTC", null, 0, -1, GSSScenarioPeriodicTCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPeriodicTCEClass, GSSScenarioPeriodicTC.class, "GSSScenarioPeriodicTC", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioPeriodicTC_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSScenarioPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPeriodicTC_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPeriodicTC_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSScenarioPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPeriodicTC_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSScenarioPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioPeriodicTC_Period_unit(), this.getGSSScenarioUnit(), "period_unit", null, 1, 1, GSSScenarioPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPeriodicTCLevel2EClass, GSSScenarioPeriodicTCLevel2.class, "GSSScenarioPeriodicTCLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioPeriodicTCLevel2_Level2(), theformatPackage.getGSSFormatFormat(), null, "level2", null, 0, 1, GSSScenarioPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel2_App_to_level2(), theexportPackage.getGSSExportExport(), null, "app_to_level2", null, 1, 1, GSSScenarioPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel2_Level1(), theformatPackage.getGSSFormatFormat(), null, "level1", null, 0, 1, GSSScenarioPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel2_Level2_to_level1(), theexportPackage.getGSSExportExport(), null, "level2_to_level1", null, 0, 1, GSSScenarioPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel2_Level0(), theformatPackage.getGSSFormatFormat(), null, "level0", null, 0, 1, GSSScenarioPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel2_Level1_to_level0(), theexportPackage.getGSSExportExport(), null, "level1_to_level0", null, 0, 1, GSSScenarioPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPeriodicTCLevel1EClass, GSSScenarioPeriodicTCLevel1.class, "GSSScenarioPeriodicTCLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioPeriodicTCLevel1_Level1(), theformatPackage.getGSSFormatFormat(), null, "level1", null, 0, 1, GSSScenarioPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel1_App_to_level1(), theexportPackage.getGSSExportExport(), null, "app_to_level1", null, 1, 1, GSSScenarioPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel1_Level0(), theformatPackage.getGSSFormatFormat(), null, "level0", null, 0, 1, GSSScenarioPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel1_Level1_to_level0(), theexportPackage.getGSSExportExport(), null, "level1_to_level0", null, 0, 1, GSSScenarioPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPeriodicTCLevel0EClass, GSSScenarioPeriodicTCLevel0.class, "GSSScenarioPeriodicTCLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioPeriodicTCLevel0_Level0(), theformatPackage.getGSSFormatFormat(), null, "level0", null, 0, 1, GSSScenarioPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioPeriodicTCLevel0_App_to_level0(), theexportPackage.getGSSExportExport(), null, "app_to_level0", null, 1, 1, GSSScenarioPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioGlobalVarsEClass, GSSScenarioGlobalVars.class, "GSSScenarioGlobalVars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioGlobalVars_GlobalVar(), this.getGSSScenarioGlobalVar(), null, "GlobalVar", null, 1, 10, GSSScenarioGlobalVars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioGlobalVarEClass, GSSScenarioGlobalVar.class, "GSSScenarioGlobalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioGlobalVar_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSScenarioGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioGlobalVar_Type(), this.getGSSScenarioGlobalVarType(), "type", null, 1, 1, GSSScenarioGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioGlobalVar_Initial_value(), ecorePackage.getEString(), "initial_value", null, 1, 1, GSSScenarioGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioGlobalVar_Reference(), this.getGSSScenarioReference(), null, "reference", null, 1, 1, GSSScenarioGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioReferenceEClass, GSSScenarioReference.class, "GSSScenarioReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioReference_Level(), ecorePackage.getEString(), "level", null, 1, 1, GSSScenarioReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioReference_FieldRef(), ecorePackage.getEString(), "fieldRef", null, 1, 1, GSSScenarioReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioReference_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSScenarioReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioReference_Size(), ecorePackage.getEString(), "size", null, 1, 1, GSSScenarioReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioReferenceFieldEClass, GSSScenarioReferenceField.class, "GSSScenarioReferenceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioReferenceField_Type(), this.getGSSScenarioReferenceFieldType(), "type", null, 1, 1, GSSScenarioReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioReferenceField_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSScenarioReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioReferencePeriodicTCEClass, GSSScenarioReferencePeriodicTC.class, "GSSScenarioReferencePeriodicTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioReferencePeriodicTC_IdRef(), this.getGSSScenarioPeriodicTC(), null, "idRef", null, 1, 1, GSSScenarioReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioReferenceSpecialPacketEClass, GSSScenarioReferenceSpecialPacket.class, "GSSScenarioReferenceSpecialPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioReferenceSpecialPacket_IdRef(), this.getGSSScenarioSpecialPacket(), null, "idRef", null, 1, 1, GSSScenarioReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioMonitorsEClass, GSSScenarioMonitors.class, "GSSScenarioMonitors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioMonitors_ChartsFile(), thechartsPackage.getGSSChartsCharts(), null, "ChartsFile", null, 0, 1, GSSScenarioMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioMonitors_Monitor(), this.getGSSScenarioMonitor(), null, "monitor", null, 0, -1, GSSScenarioMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioMonitorEClass, GSSScenarioMonitor.class, "GSSScenarioMonitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioMonitor_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSScenarioMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSScenarioMonitor_GVRef(), this.getGSSScenarioGVRef(), null, "GVRef", null, 1, 1, GSSScenarioMonitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioPlotEClass, GSSScenarioPlot.class, "GSSScenarioPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioPlot_ChartRef(), thechartsPackage.getGSSChartsChart(), null, "chartRef", null, 1, 1, GSSScenarioPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioAlarmMsgEClass, GSSScenarioAlarmMsg.class, "GSSScenarioAlarmMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioAlarmMsg_Type(), this.getGSSScenarioAlarmMsgType(), "type", null, 1, 1, GSSScenarioAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioAlarmMsg_Text(), ecorePackage.getEString(), "text", null, 1, 1, GSSScenarioAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioModifyEClass, GSSScenarioModify.class, "GSSScenarioModify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioModify_Type(), this.getGSSScenarioModifyType(), "type", null, 1, 1, GSSScenarioModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioModify_Value(), ecorePackage.getEString(), "value", null, 1, 1, GSSScenarioModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioAlarmValEClass, GSSScenarioAlarmVal.class, "GSSScenarioAlarmVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioAlarmVal_Type(), this.getGSSScenarioAlarmValType(), "type", null, 1, 1, GSSScenarioAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioGVRefEClass, GSSScenarioGVRef.class, "GSSScenarioGVRef", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioGVRef_GlobalVarRef(), this.getGSSScenarioGlobalVar(), null, "GlobalVarRef", null, 1, 1, GSSScenarioGVRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioGVFilteredEClass, GSSScenarioGVFiltered.class, "GSSScenarioGVFiltered", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSScenarioGVFiltered_Filter(), thefilterPackage.getGSSFilterFilter(), null, "filter", null, 0, 1, GSSScenarioGVFiltered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssScenarioGVPeriodicEClass, GSSScenarioGVPeriodic.class, "GSSScenarioGVPeriodic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSScenarioGVPeriodic_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSScenarioGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSScenarioGVPeriodic_Period_unit(), this.getGSSScenarioUnit(), "period_unit", null, 1, 1, GSSScenarioGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssScenarioEnableDisableEEnum, GSSScenarioEnableDisable.class, "GSSScenarioEnableDisable");
		addEEnumLiteral(gssScenarioEnableDisableEEnum, GSSScenarioEnableDisable.DISABLED);
		addEEnumLiteral(gssScenarioEnableDisableEEnum, GSSScenarioEnableDisable.ENABLED);

		initEEnum(gssScenarioInterfaceTypeEEnum, GSSScenarioInterfaceType.class, "GSSScenarioInterfaceType");
		addEEnumLiteral(gssScenarioInterfaceTypeEEnum, GSSScenarioInterfaceType.SP_W);
		addEEnumLiteral(gssScenarioInterfaceTypeEEnum, GSSScenarioInterfaceType.SP_WTC);
		addEEnumLiteral(gssScenarioInterfaceTypeEEnum, GSSScenarioInterfaceType.SP_WERROR);
		addEEnumLiteral(gssScenarioInterfaceTypeEEnum, GSSScenarioInterfaceType.UART);
		addEEnumLiteral(gssScenarioInterfaceTypeEEnum, GSSScenarioInterfaceType.DUMMY);

		initEEnum(gssScenarioInterfaceIOTypeEEnum, GSSScenarioInterfaceIOType.class, "GSSScenarioInterfaceIOType");
		addEEnumLiteral(gssScenarioInterfaceIOTypeEEnum, GSSScenarioInterfaceIOType.IN_OUT);
		addEEnumLiteral(gssScenarioInterfaceIOTypeEEnum, GSSScenarioInterfaceIOType.IN);
		addEEnumLiteral(gssScenarioInterfaceIOTypeEEnum, GSSScenarioInterfaceIOType.OUT);

		initEEnum(gssScenarioUpperLevelLevelEEnum, GSSScenarioUpperLevelLevel.class, "GSSScenarioUpperLevelLevel");
		addEEnumLiteral(gssScenarioUpperLevelLevelEEnum, GSSScenarioUpperLevelLevel._1);
		addEEnumLiteral(gssScenarioUpperLevelLevelEEnum, GSSScenarioUpperLevelLevel._2);
		addEEnumLiteral(gssScenarioUpperLevelLevelEEnum, GSSScenarioUpperLevelLevel._3);

		initEEnum(gssScenarioUnitEEnum, GSSScenarioUnit.class, "GSSScenarioUnit");
		addEEnumLiteral(gssScenarioUnitEEnum, GSSScenarioUnit.MILISECONDS);
		addEEnumLiteral(gssScenarioUnitEEnum, GSSScenarioUnit.SECONDS);

		initEEnum(gssScenarioGlobalVarTypeEEnum, GSSScenarioGlobalVarType.class, "GSSScenarioGlobalVarType");
		addEEnumLiteral(gssScenarioGlobalVarTypeEEnum, GSSScenarioGlobalVarType.UINT);
		addEEnumLiteral(gssScenarioGlobalVarTypeEEnum, GSSScenarioGlobalVarType.FORMULA);

		initEEnum(gssScenarioReferenceFieldTypeEEnum, GSSScenarioReferenceFieldType.class, "GSSScenarioReferenceFieldType");
		addEEnumLiteral(gssScenarioReferenceFieldTypeEEnum, GSSScenarioReferenceFieldType.TM);
		addEEnumLiteral(gssScenarioReferenceFieldTypeEEnum, GSSScenarioReferenceFieldType.TC);

		initEEnum(gssScenarioAlarmMsgTypeEEnum, GSSScenarioAlarmMsgType.class, "GSSScenarioAlarmMsgType");
		addEEnumLiteral(gssScenarioAlarmMsgTypeEEnum, GSSScenarioAlarmMsgType.ALARM1);
		addEEnumLiteral(gssScenarioAlarmMsgTypeEEnum, GSSScenarioAlarmMsgType.ALARM2);
		addEEnumLiteral(gssScenarioAlarmMsgTypeEEnum, GSSScenarioAlarmMsgType.ALARM3);

		initEEnum(gssScenarioModifyTypeEEnum, GSSScenarioModifyType.class, "GSSScenarioModifyType");
		addEEnumLiteral(gssScenarioModifyTypeEEnum, GSSScenarioModifyType.INCREMENT);
		addEEnumLiteral(gssScenarioModifyTypeEEnum, GSSScenarioModifyType.INCREMENT1WRAP);

		initEEnum(gssScenarioAlarmValTypeEEnum, GSSScenarioAlarmValType.class, "GSSScenarioAlarmValType");
		addEEnumLiteral(gssScenarioAlarmValTypeEEnum, GSSScenarioAlarmValType.ALARM1);

		// Create resource
		createResource(eNS_URI);
	}

} //scenarioPackageImpl
