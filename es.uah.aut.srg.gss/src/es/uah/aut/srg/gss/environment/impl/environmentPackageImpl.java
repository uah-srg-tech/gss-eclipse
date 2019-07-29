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
package es.uah.aut.srg.gss.environment.impl;

import es.uah.aut.srg.gss.charts.chartsPackage;

import es.uah.aut.srg.gss.common.commonPackage;

import es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsg;
import es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmMsgType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmVal;
import es.uah.aut.srg.gss.environment.GSSEnvironmentAlarmValType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentDiscardErrorFlags;
import es.uah.aut.srg.gss.environment.GSSEnvironmentEnableDisable;
import es.uah.aut.srg.gss.environment.GSSEnvironmentEnvironment;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGVFiltered;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGVPeriodic;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVar;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVarType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentGlobalVars;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInfo;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInfoPrint;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterface;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaces;
import es.uah.aut.srg.gss.environment.GSSEnvironmentIntervalRange;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut;
import es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut;
import es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface;
import es.uah.aut.srg.gss.environment.GSSEnvironmentModify;
import es.uah.aut.srg.gss.environment.GSSEnvironmentModifyType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentMonitors;
import es.uah.aut.srg.gss.environment.GSSEnvironmentOptions;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriod;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTC;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel0;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel1;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCLevel2;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPeriodicTCs;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPhyHeaderPrint;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPlot;
import es.uah.aut.srg.gss.environment.GSSEnvironmentPrintingData;
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol;
import es.uah.aut.srg.gss.environment.GSSEnvironmentProtocols;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC;
import es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceSpecialPacket;
import es.uah.aut.srg.gss.environment.GSSEnvironmentScenario;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket;
import es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets;
import es.uah.aut.srg.gss.environment.GSSEnvironmentStructuredData;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUnit;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevel;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevelLevel;
import es.uah.aut.srg.gss.environment.GSSEnvironmentUpperLevels;
import es.uah.aut.srg.gss.environment.environmentFactory;
import es.uah.aut.srg.gss.environment.environmentPackage;

import es.uah.aut.srg.gss.iface.ifacePackage;

import es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage;

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
public class environmentPackageImpl extends EPackageImpl implements environmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentInfoPrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPhyHeaderPrintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentDiscardErrorFlagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentProtocolsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentInterfacesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentMainInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentLevelInOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentLevelInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentLevelOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentSpecialPacketsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentSpecialPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentUpperLevelsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentUpperLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPrintingDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentStructuredDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPeriodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentIntervalRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPeriodicTCsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPeriodicTCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPeriodicTCLevel2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPeriodicTCLevel1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPeriodicTCLevel0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentGlobalVarsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentGlobalVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentReferenceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentReferencePeriodicTCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentReferenceSpecialPacketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentMonitorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentPlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentAlarmMsgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentModifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentAlarmValEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentGVFilteredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gssEnvironmentGVPeriodicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentEnableDisableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentInterfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentInterfaceIOTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentUpperLevelLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentGlobalVarTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentReferenceFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentAlarmMsgTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentModifyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gssEnvironmentAlarmValTypeEEnum = null;

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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private environmentPackageImpl() {
		super(eNS_URI, environmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link environmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static environmentPackage init() {
		if (isInited) return (environmentPackage)EPackage.Registry.INSTANCE.getEPackage(environmentPackage.eNS_URI);

		// Obtain or create and register package
		environmentPackageImpl theenvironmentPackage = (environmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof environmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new environmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		chartsPackage.eINSTANCE.eClass();
		filterPackage.eINSTANCE.eClass();
		ifacePackage.eINSTANCE.eClass();
		importPackage.eINSTANCE.eClass();
		protocol_packetsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theenvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theenvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theenvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(environmentPackage.eNS_URI, theenvironmentPackage);
		return theenvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentEnvironment() {
		return gssEnvironmentEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentEnvironment_Scenario() {
		return (EReference)gssEnvironmentEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentScenario() {
		return gssEnvironmentScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentScenario_Name() {
		return (EAttribute)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentScenario_Gss_options() {
		return (EReference)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentScenario_Protocols() {
		return (EReference)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentScenario_Interfaces() {
		return (EReference)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentScenario_SpecialPackets() {
		return (EReference)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentScenario_PeriodicTCs() {
		return (EReference)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentScenario_GlobalVars() {
		return (EReference)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentScenario_Monitors() {
		return (EReference)gssEnvironmentScenarioEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentOptions() {
		return gssEnvironmentOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentOptions_Gss_info() {
		return (EReference)gssEnvironmentOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentOptions_Gss_info_print() {
		return (EReference)gssEnvironmentOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentOptions_Phy_header_print() {
		return (EReference)gssEnvironmentOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentOptions_DiscardErrorFlags() {
		return (EReference)gssEnvironmentOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentInfo() {
		return gssEnvironmentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInfo_Test_campaign() {
		return (EAttribute)gssEnvironmentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInfo_Version() {
		return (EAttribute)gssEnvironmentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInfo_Date() {
		return (EAttribute)gssEnvironmentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInfo_Version_control_url() {
		return (EAttribute)gssEnvironmentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentInfoPrint() {
		return gssEnvironmentInfoPrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInfoPrint_MainLog() {
		return (EAttribute)gssEnvironmentInfoPrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInfoPrint_PortLogs() {
		return (EAttribute)gssEnvironmentInfoPrintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInfoPrint_RawLog() {
		return (EAttribute)gssEnvironmentInfoPrintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPhyHeaderPrint() {
		return gssEnvironmentPhyHeaderPrintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPhyHeaderPrint_MainLog() {
		return (EAttribute)gssEnvironmentPhyHeaderPrintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPhyHeaderPrint_PortLogs() {
		return (EAttribute)gssEnvironmentPhyHeaderPrintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPhyHeaderPrint_RawLog() {
		return (EAttribute)gssEnvironmentPhyHeaderPrintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPhyHeaderPrint_GssTabs() {
		return (EAttribute)gssEnvironmentPhyHeaderPrintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentDiscardErrorFlags() {
		return gssEnvironmentDiscardErrorFlagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentDiscardErrorFlags_TxErrors() {
		return (EAttribute)gssEnvironmentDiscardErrorFlagsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentDiscardErrorFlags_NotExpectedPackets() {
		return (EAttribute)gssEnvironmentDiscardErrorFlagsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentDiscardErrorFlags_FiltersKo() {
		return (EAttribute)gssEnvironmentDiscardErrorFlagsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentDiscardErrorFlags_ValidTimesKo() {
		return (EAttribute)gssEnvironmentDiscardErrorFlagsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentProtocols() {
		return gssEnvironmentProtocolsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentProtocols_Protocol() {
		return (EReference)gssEnvironmentProtocolsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentProtocol() {
		return gssEnvironmentProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentProtocol_Id() {
		return (EAttribute)gssEnvironmentProtocolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentProtocol_Name() {
		return (EAttribute)gssEnvironmentProtocolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentProtocol_TypeLevel() {
		return (EAttribute)gssEnvironmentProtocolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentProtocol_TypeOffset() {
		return (EAttribute)gssEnvironmentProtocolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentProtocol_SubtypeOffset() {
		return (EAttribute)gssEnvironmentProtocolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentInterfaces() {
		return gssEnvironmentInterfacesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterfaces_ProtocolPacketsFile() {
		return (EReference)gssEnvironmentInterfacesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterfaces_MainInterface() {
		return (EReference)gssEnvironmentInterfacesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterfaces_Interface() {
		return (EReference)gssEnvironmentInterfacesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentMainInterface() {
		return gssEnvironmentMainInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentInterface() {
		return gssEnvironmentInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInterface_Id() {
		return (EAttribute)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInterface_Name() {
		return (EAttribute)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInterface_IfType() {
		return (EAttribute)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterface_IfConfig() {
		return (EReference)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentInterface_IoType() {
		return (EAttribute)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterface_ProtocolID() {
		return (EReference)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterface_LevelInOut() {
		return (EReference)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterface_LevelIn() {
		return (EReference)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentInterface_LevelOut() {
		return (EReference)gssEnvironmentInterfaceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentLevelInOut() {
		return gssEnvironmentLevelInOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentLevelInOut_Id() {
		return (EAttribute)gssEnvironmentLevelInOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentLevelInOut_Name() {
		return (EAttribute)gssEnvironmentLevelInOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelInOut_TMformat() {
		return (EReference)gssEnvironmentLevelInOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelInOut_TCformat() {
		return (EReference)gssEnvironmentLevelInOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelInOut_InputFilter() {
		return (EReference)gssEnvironmentLevelInOutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelInOut_Export_to_prev_Level() {
		return (EReference)gssEnvironmentLevelInOutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelInOut_Import_from_prev_Level() {
		return (EReference)gssEnvironmentLevelInOutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentLevelIn() {
		return gssEnvironmentLevelInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentLevelIn_Id() {
		return (EAttribute)gssEnvironmentLevelInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentLevelIn_Name() {
		return (EAttribute)gssEnvironmentLevelInEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelIn_TCformat() {
		return (EReference)gssEnvironmentLevelInEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelIn_Export_to_prev_Level() {
		return (EReference)gssEnvironmentLevelInEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentLevelOut() {
		return gssEnvironmentLevelOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentLevelOut_Id() {
		return (EAttribute)gssEnvironmentLevelOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentLevelOut_Name() {
		return (EAttribute)gssEnvironmentLevelOutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelOut_TMformat() {
		return (EReference)gssEnvironmentLevelOutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelOut_InputFilter() {
		return (EReference)gssEnvironmentLevelOutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentLevelOut_Import_from_prev_Level() {
		return (EReference)gssEnvironmentLevelOutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentSpecialPackets() {
		return gssEnvironmentSpecialPacketsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentSpecialPackets_SpecialPacket() {
		return (EReference)gssEnvironmentSpecialPacketsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentSpecialPacket() {
		return gssEnvironmentSpecialPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentSpecialPacket_Status() {
		return (EAttribute)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentSpecialPacket_Name() {
		return (EAttribute)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentSpecialPacket_Id() {
		return (EAttribute)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentSpecialPacket_IfRef() {
		return (EAttribute)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentSpecialPacket_Levels() {
		return (EAttribute)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentSpecialPacket_LevelRef() {
		return (EAttribute)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentSpecialPacket_InputFilter() {
		return (EReference)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentSpecialPacket_UpperLevels() {
		return (EReference)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentSpecialPacket_PrintingData() {
		return (EReference)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentSpecialPacket_Period() {
		return (EReference)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentSpecialPacket_IntervalRange() {
		return (EReference)gssEnvironmentSpecialPacketEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentUpperLevels() {
		return gssEnvironmentUpperLevelsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentUpperLevels_UpperLevel() {
		return (EReference)gssEnvironmentUpperLevelsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentUpperLevel() {
		return gssEnvironmentUpperLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentUpperLevel_Level() {
		return (EAttribute)gssEnvironmentUpperLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentUpperLevel_TMformat() {
		return (EReference)gssEnvironmentUpperLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentUpperLevel_InputFilter() {
		return (EReference)gssEnvironmentUpperLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentUpperLevel_Import_from_prev_Level() {
		return (EReference)gssEnvironmentUpperLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPrintingData() {
		return gssEnvironmentPrintingDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPrintingData_PrintStatus() {
		return (EAttribute)gssEnvironmentPrintingDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPrintingData_StructuredData() {
		return (EReference)gssEnvironmentPrintingDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentStructuredData() {
		return gssEnvironmentStructuredDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentStructuredData_LevelRef() {
		return (EAttribute)gssEnvironmentStructuredDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentStructuredData_FirstField() {
		return (EAttribute)gssEnvironmentStructuredDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPeriod() {
		return gssEnvironmentPeriodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriod_Min_value() {
		return (EAttribute)gssEnvironmentPeriodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriod_Min_unit() {
		return (EAttribute)gssEnvironmentPeriodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriod_Max_value() {
		return (EAttribute)gssEnvironmentPeriodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriod_Max_unit() {
		return (EAttribute)gssEnvironmentPeriodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentIntervalRange() {
		return gssEnvironmentIntervalRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentIntervalRange_Min() {
		return (EAttribute)gssEnvironmentIntervalRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentIntervalRange_Max() {
		return (EAttribute)gssEnvironmentIntervalRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentIntervalRange_Interval_value() {
		return (EAttribute)gssEnvironmentIntervalRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentIntervalRange_Interval_unit() {
		return (EAttribute)gssEnvironmentIntervalRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPeriodicTCs() {
		return gssEnvironmentPeriodicTCsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCs_PeriodicTC_level_2() {
		return (EReference)gssEnvironmentPeriodicTCsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCs_PeriodicTC_level_1() {
		return (EReference)gssEnvironmentPeriodicTCsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCs_PeriodicTC_level_0() {
		return (EReference)gssEnvironmentPeriodicTCsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPeriodicTC() {
		return gssEnvironmentPeriodicTCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriodicTC_Name() {
		return (EAttribute)gssEnvironmentPeriodicTCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriodicTC_Id() {
		return (EAttribute)gssEnvironmentPeriodicTCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriodicTC_IfRef() {
		return (EAttribute)gssEnvironmentPeriodicTCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriodicTC_Period_value() {
		return (EAttribute)gssEnvironmentPeriodicTCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPeriodicTC_Period_unit() {
		return (EAttribute)gssEnvironmentPeriodicTCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPeriodicTCLevel2() {
		return gssEnvironmentPeriodicTCLevel2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel2_Level2() {
		return (EReference)gssEnvironmentPeriodicTCLevel2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel2_App_to_level2() {
		return (EReference)gssEnvironmentPeriodicTCLevel2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel2_Level1() {
		return (EReference)gssEnvironmentPeriodicTCLevel2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel2_Level2_to_level1() {
		return (EReference)gssEnvironmentPeriodicTCLevel2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel2_Level0() {
		return (EReference)gssEnvironmentPeriodicTCLevel2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel2_Level1_to_level0() {
		return (EReference)gssEnvironmentPeriodicTCLevel2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPeriodicTCLevel1() {
		return gssEnvironmentPeriodicTCLevel1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel1_Level1() {
		return (EReference)gssEnvironmentPeriodicTCLevel1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel1_App_to_level1() {
		return (EReference)gssEnvironmentPeriodicTCLevel1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel1_Level0() {
		return (EReference)gssEnvironmentPeriodicTCLevel1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel1_Level1_to_level0() {
		return (EReference)gssEnvironmentPeriodicTCLevel1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPeriodicTCLevel0() {
		return gssEnvironmentPeriodicTCLevel0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel0_Level0() {
		return (EReference)gssEnvironmentPeriodicTCLevel0EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPeriodicTCLevel0_App_to_level0() {
		return (EReference)gssEnvironmentPeriodicTCLevel0EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentGlobalVars() {
		return gssEnvironmentGlobalVarsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentGlobalVars_GlobalVar() {
		return (EReference)gssEnvironmentGlobalVarsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentGlobalVar() {
		return gssEnvironmentGlobalVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentGlobalVar_Name() {
		return (EAttribute)gssEnvironmentGlobalVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentGlobalVar_Id() {
		return (EAttribute)gssEnvironmentGlobalVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentGlobalVar_Type() {
		return (EAttribute)gssEnvironmentGlobalVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentGlobalVar_Initial_value() {
		return (EAttribute)gssEnvironmentGlobalVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentGlobalVar_ReferenceField() {
		return (EReference)gssEnvironmentGlobalVarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentGlobalVar_ReferencePeriodicTC() {
		return (EReference)gssEnvironmentGlobalVarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentGlobalVar_ReferenceSpecialPacket() {
		return (EReference)gssEnvironmentGlobalVarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentReferenceField() {
		return gssEnvironmentReferenceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceField_Type() {
		return (EAttribute)gssEnvironmentReferenceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceField_IfRef() {
		return (EAttribute)gssEnvironmentReferenceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceField_Level() {
		return (EAttribute)gssEnvironmentReferenceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceField_FieldRef() {
		return (EAttribute)gssEnvironmentReferenceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceField_Offset() {
		return (EAttribute)gssEnvironmentReferenceFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceField_Size() {
		return (EAttribute)gssEnvironmentReferenceFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentReferencePeriodicTC() {
		return gssEnvironmentReferencePeriodicTCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentReferencePeriodicTC_IdRef() {
		return (EReference)gssEnvironmentReferencePeriodicTCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferencePeriodicTC_Level() {
		return (EAttribute)gssEnvironmentReferencePeriodicTCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferencePeriodicTC_FieldRef() {
		return (EAttribute)gssEnvironmentReferencePeriodicTCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferencePeriodicTC_Offset() {
		return (EAttribute)gssEnvironmentReferencePeriodicTCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferencePeriodicTC_Size() {
		return (EAttribute)gssEnvironmentReferencePeriodicTCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentReferenceSpecialPacket() {
		return gssEnvironmentReferenceSpecialPacketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentReferenceSpecialPacket_IdRef() {
		return (EReference)gssEnvironmentReferenceSpecialPacketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceSpecialPacket_Level() {
		return (EAttribute)gssEnvironmentReferenceSpecialPacketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceSpecialPacket_FieldRef() {
		return (EAttribute)gssEnvironmentReferenceSpecialPacketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceSpecialPacket_Offset() {
		return (EAttribute)gssEnvironmentReferenceSpecialPacketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentReferenceSpecialPacket_Size() {
		return (EAttribute)gssEnvironmentReferenceSpecialPacketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentMonitors() {
		return gssEnvironmentMonitorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentMonitors_ChartsFile() {
		return (EReference)gssEnvironmentMonitorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentMonitors_Plot() {
		return (EReference)gssEnvironmentMonitorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentMonitors_AlarmMsg() {
		return (EReference)gssEnvironmentMonitorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentMonitors_Modify() {
		return (EReference)gssEnvironmentMonitorsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentMonitors_AlarmVal() {
		return (EReference)gssEnvironmentMonitorsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentPlot() {
		return gssEnvironmentPlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentPlot_Name() {
		return (EAttribute)gssEnvironmentPlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPlot_ChartRef() {
		return (EReference)gssEnvironmentPlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPlot_GVFiltered() {
		return (EReference)gssEnvironmentPlotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentPlot_GVPeriodic() {
		return (EReference)gssEnvironmentPlotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentAlarmMsg() {
		return gssEnvironmentAlarmMsgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentAlarmMsg_Name() {
		return (EAttribute)gssEnvironmentAlarmMsgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentAlarmMsg_Type() {
		return (EAttribute)gssEnvironmentAlarmMsgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentAlarmMsg_Text() {
		return (EAttribute)gssEnvironmentAlarmMsgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentAlarmMsg_GVFiltered() {
		return (EReference)gssEnvironmentAlarmMsgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentAlarmMsg_GVPeriodic() {
		return (EReference)gssEnvironmentAlarmMsgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentModify() {
		return gssEnvironmentModifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentModify_Name() {
		return (EAttribute)gssEnvironmentModifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentModify_Type() {
		return (EAttribute)gssEnvironmentModifyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentModify_Value() {
		return (EAttribute)gssEnvironmentModifyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentModify_GVFiltered() {
		return (EReference)gssEnvironmentModifyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentModify_GVPeriodic() {
		return (EReference)gssEnvironmentModifyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentAlarmVal() {
		return gssEnvironmentAlarmValEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentAlarmVal_Name() {
		return (EAttribute)gssEnvironmentAlarmValEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentAlarmVal_Type() {
		return (EAttribute)gssEnvironmentAlarmValEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentAlarmVal_GVFiltered() {
		return (EReference)gssEnvironmentAlarmValEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentAlarmVal_GVPeriodic() {
		return (EReference)gssEnvironmentAlarmValEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentGVFiltered() {
		return gssEnvironmentGVFilteredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentGVFiltered_GlobalVarRef() {
		return (EReference)gssEnvironmentGVFilteredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentGVFiltered_Filter() {
		return (EReference)gssEnvironmentGVFilteredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSSEnvironmentGVPeriodic() {
		return gssEnvironmentGVPeriodicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGSSEnvironmentGVPeriodic_GlobalVarRef() {
		return (EReference)gssEnvironmentGVPeriodicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentGVPeriodic_Period_value() {
		return (EAttribute)gssEnvironmentGVPeriodicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGSSEnvironmentGVPeriodic_Period_unit() {
		return (EAttribute)gssEnvironmentGVPeriodicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentEnableDisable() {
		return gssEnvironmentEnableDisableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentInterfaceType() {
		return gssEnvironmentInterfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentInterfaceIOType() {
		return gssEnvironmentInterfaceIOTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentUpperLevelLevel() {
		return gssEnvironmentUpperLevelLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentUnit() {
		return gssEnvironmentUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentGlobalVarType() {
		return gssEnvironmentGlobalVarTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentReferenceFieldType() {
		return gssEnvironmentReferenceFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentAlarmMsgType() {
		return gssEnvironmentAlarmMsgTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentModifyType() {
		return gssEnvironmentModifyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGSSEnvironmentAlarmValType() {
		return gssEnvironmentAlarmValTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environmentFactory getenvironmentFactory() {
		return (environmentFactory)getEFactoryInstance();
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
		gssEnvironmentEnvironmentEClass = createEClass(GSS_ENVIRONMENT_ENVIRONMENT);
		createEReference(gssEnvironmentEnvironmentEClass, GSS_ENVIRONMENT_ENVIRONMENT__SCENARIO);

		gssEnvironmentScenarioEClass = createEClass(GSS_ENVIRONMENT_SCENARIO);
		createEAttribute(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__NAME);
		createEReference(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__GSS_OPTIONS);
		createEReference(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__PROTOCOLS);
		createEReference(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__INTERFACES);
		createEReference(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__SPECIAL_PACKETS);
		createEReference(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__PERIODIC_TCS);
		createEReference(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__GLOBAL_VARS);
		createEReference(gssEnvironmentScenarioEClass, GSS_ENVIRONMENT_SCENARIO__MONITORS);

		gssEnvironmentOptionsEClass = createEClass(GSS_ENVIRONMENT_OPTIONS);
		createEReference(gssEnvironmentOptionsEClass, GSS_ENVIRONMENT_OPTIONS__GSS_INFO);
		createEReference(gssEnvironmentOptionsEClass, GSS_ENVIRONMENT_OPTIONS__GSS_INFO_PRINT);
		createEReference(gssEnvironmentOptionsEClass, GSS_ENVIRONMENT_OPTIONS__PHY_HEADER_PRINT);
		createEReference(gssEnvironmentOptionsEClass, GSS_ENVIRONMENT_OPTIONS__DISCARD_ERROR_FLAGS);

		gssEnvironmentInfoEClass = createEClass(GSS_ENVIRONMENT_INFO);
		createEAttribute(gssEnvironmentInfoEClass, GSS_ENVIRONMENT_INFO__TEST_CAMPAIGN);
		createEAttribute(gssEnvironmentInfoEClass, GSS_ENVIRONMENT_INFO__VERSION);
		createEAttribute(gssEnvironmentInfoEClass, GSS_ENVIRONMENT_INFO__DATE);
		createEAttribute(gssEnvironmentInfoEClass, GSS_ENVIRONMENT_INFO__VERSION_CONTROL_URL);

		gssEnvironmentInfoPrintEClass = createEClass(GSS_ENVIRONMENT_INFO_PRINT);
		createEAttribute(gssEnvironmentInfoPrintEClass, GSS_ENVIRONMENT_INFO_PRINT__MAIN_LOG);
		createEAttribute(gssEnvironmentInfoPrintEClass, GSS_ENVIRONMENT_INFO_PRINT__PORT_LOGS);
		createEAttribute(gssEnvironmentInfoPrintEClass, GSS_ENVIRONMENT_INFO_PRINT__RAW_LOG);

		gssEnvironmentPhyHeaderPrintEClass = createEClass(GSS_ENVIRONMENT_PHY_HEADER_PRINT);
		createEAttribute(gssEnvironmentPhyHeaderPrintEClass, GSS_ENVIRONMENT_PHY_HEADER_PRINT__MAIN_LOG);
		createEAttribute(gssEnvironmentPhyHeaderPrintEClass, GSS_ENVIRONMENT_PHY_HEADER_PRINT__PORT_LOGS);
		createEAttribute(gssEnvironmentPhyHeaderPrintEClass, GSS_ENVIRONMENT_PHY_HEADER_PRINT__RAW_LOG);
		createEAttribute(gssEnvironmentPhyHeaderPrintEClass, GSS_ENVIRONMENT_PHY_HEADER_PRINT__GSS_TABS);

		gssEnvironmentDiscardErrorFlagsEClass = createEClass(GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS);
		createEAttribute(gssEnvironmentDiscardErrorFlagsEClass, GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__TX_ERRORS);
		createEAttribute(gssEnvironmentDiscardErrorFlagsEClass, GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__NOT_EXPECTED_PACKETS);
		createEAttribute(gssEnvironmentDiscardErrorFlagsEClass, GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__FILTERS_KO);
		createEAttribute(gssEnvironmentDiscardErrorFlagsEClass, GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS__VALID_TIMES_KO);

		gssEnvironmentProtocolsEClass = createEClass(GSS_ENVIRONMENT_PROTOCOLS);
		createEReference(gssEnvironmentProtocolsEClass, GSS_ENVIRONMENT_PROTOCOLS__PROTOCOL);

		gssEnvironmentProtocolEClass = createEClass(GSS_ENVIRONMENT_PROTOCOL);
		createEAttribute(gssEnvironmentProtocolEClass, GSS_ENVIRONMENT_PROTOCOL__ID);
		createEAttribute(gssEnvironmentProtocolEClass, GSS_ENVIRONMENT_PROTOCOL__NAME);
		createEAttribute(gssEnvironmentProtocolEClass, GSS_ENVIRONMENT_PROTOCOL__TYPE_LEVEL);
		createEAttribute(gssEnvironmentProtocolEClass, GSS_ENVIRONMENT_PROTOCOL__TYPE_OFFSET);
		createEAttribute(gssEnvironmentProtocolEClass, GSS_ENVIRONMENT_PROTOCOL__SUBTYPE_OFFSET);

		gssEnvironmentInterfacesEClass = createEClass(GSS_ENVIRONMENT_INTERFACES);
		createEReference(gssEnvironmentInterfacesEClass, GSS_ENVIRONMENT_INTERFACES__PROTOCOL_PACKETS_FILE);
		createEReference(gssEnvironmentInterfacesEClass, GSS_ENVIRONMENT_INTERFACES__MAIN_INTERFACE);
		createEReference(gssEnvironmentInterfacesEClass, GSS_ENVIRONMENT_INTERFACES__INTERFACE);

		gssEnvironmentMainInterfaceEClass = createEClass(GSS_ENVIRONMENT_MAIN_INTERFACE);

		gssEnvironmentInterfaceEClass = createEClass(GSS_ENVIRONMENT_INTERFACE);
		createEAttribute(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__ID);
		createEAttribute(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__NAME);
		createEAttribute(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__IF_TYPE);
		createEReference(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__IF_CONFIG);
		createEAttribute(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__IO_TYPE);
		createEReference(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__PROTOCOL_ID);
		createEReference(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__LEVEL_IN_OUT);
		createEReference(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__LEVEL_IN);
		createEReference(gssEnvironmentInterfaceEClass, GSS_ENVIRONMENT_INTERFACE__LEVEL_OUT);

		gssEnvironmentLevelInOutEClass = createEClass(GSS_ENVIRONMENT_LEVEL_IN_OUT);
		createEAttribute(gssEnvironmentLevelInOutEClass, GSS_ENVIRONMENT_LEVEL_IN_OUT__ID);
		createEAttribute(gssEnvironmentLevelInOutEClass, GSS_ENVIRONMENT_LEVEL_IN_OUT__NAME);
		createEReference(gssEnvironmentLevelInOutEClass, GSS_ENVIRONMENT_LEVEL_IN_OUT__TMFORMAT);
		createEReference(gssEnvironmentLevelInOutEClass, GSS_ENVIRONMENT_LEVEL_IN_OUT__TCFORMAT);
		createEReference(gssEnvironmentLevelInOutEClass, GSS_ENVIRONMENT_LEVEL_IN_OUT__INPUT_FILTER);
		createEReference(gssEnvironmentLevelInOutEClass, GSS_ENVIRONMENT_LEVEL_IN_OUT__EXPORT_TO_PREV_LEVEL);
		createEReference(gssEnvironmentLevelInOutEClass, GSS_ENVIRONMENT_LEVEL_IN_OUT__IMPORT_FROM_PREV_LEVEL);

		gssEnvironmentLevelInEClass = createEClass(GSS_ENVIRONMENT_LEVEL_IN);
		createEAttribute(gssEnvironmentLevelInEClass, GSS_ENVIRONMENT_LEVEL_IN__ID);
		createEAttribute(gssEnvironmentLevelInEClass, GSS_ENVIRONMENT_LEVEL_IN__NAME);
		createEReference(gssEnvironmentLevelInEClass, GSS_ENVIRONMENT_LEVEL_IN__TCFORMAT);
		createEReference(gssEnvironmentLevelInEClass, GSS_ENVIRONMENT_LEVEL_IN__EXPORT_TO_PREV_LEVEL);

		gssEnvironmentLevelOutEClass = createEClass(GSS_ENVIRONMENT_LEVEL_OUT);
		createEAttribute(gssEnvironmentLevelOutEClass, GSS_ENVIRONMENT_LEVEL_OUT__ID);
		createEAttribute(gssEnvironmentLevelOutEClass, GSS_ENVIRONMENT_LEVEL_OUT__NAME);
		createEReference(gssEnvironmentLevelOutEClass, GSS_ENVIRONMENT_LEVEL_OUT__TMFORMAT);
		createEReference(gssEnvironmentLevelOutEClass, GSS_ENVIRONMENT_LEVEL_OUT__INPUT_FILTER);
		createEReference(gssEnvironmentLevelOutEClass, GSS_ENVIRONMENT_LEVEL_OUT__IMPORT_FROM_PREV_LEVEL);

		gssEnvironmentSpecialPacketsEClass = createEClass(GSS_ENVIRONMENT_SPECIAL_PACKETS);
		createEReference(gssEnvironmentSpecialPacketsEClass, GSS_ENVIRONMENT_SPECIAL_PACKETS__SPECIAL_PACKET);

		gssEnvironmentSpecialPacketEClass = createEClass(GSS_ENVIRONMENT_SPECIAL_PACKET);
		createEAttribute(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__STATUS);
		createEAttribute(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__NAME);
		createEAttribute(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__ID);
		createEAttribute(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__IF_REF);
		createEAttribute(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__LEVELS);
		createEAttribute(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__LEVEL_REF);
		createEReference(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__INPUT_FILTER);
		createEReference(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__UPPER_LEVELS);
		createEReference(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__PRINTING_DATA);
		createEReference(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__PERIOD);
		createEReference(gssEnvironmentSpecialPacketEClass, GSS_ENVIRONMENT_SPECIAL_PACKET__INTERVAL_RANGE);

		gssEnvironmentUpperLevelsEClass = createEClass(GSS_ENVIRONMENT_UPPER_LEVELS);
		createEReference(gssEnvironmentUpperLevelsEClass, GSS_ENVIRONMENT_UPPER_LEVELS__UPPER_LEVEL);

		gssEnvironmentUpperLevelEClass = createEClass(GSS_ENVIRONMENT_UPPER_LEVEL);
		createEAttribute(gssEnvironmentUpperLevelEClass, GSS_ENVIRONMENT_UPPER_LEVEL__LEVEL);
		createEReference(gssEnvironmentUpperLevelEClass, GSS_ENVIRONMENT_UPPER_LEVEL__TMFORMAT);
		createEReference(gssEnvironmentUpperLevelEClass, GSS_ENVIRONMENT_UPPER_LEVEL__INPUT_FILTER);
		createEReference(gssEnvironmentUpperLevelEClass, GSS_ENVIRONMENT_UPPER_LEVEL__IMPORT_FROM_PREV_LEVEL);

		gssEnvironmentPrintingDataEClass = createEClass(GSS_ENVIRONMENT_PRINTING_DATA);
		createEAttribute(gssEnvironmentPrintingDataEClass, GSS_ENVIRONMENT_PRINTING_DATA__PRINT_STATUS);
		createEReference(gssEnvironmentPrintingDataEClass, GSS_ENVIRONMENT_PRINTING_DATA__STRUCTURED_DATA);

		gssEnvironmentStructuredDataEClass = createEClass(GSS_ENVIRONMENT_STRUCTURED_DATA);
		createEAttribute(gssEnvironmentStructuredDataEClass, GSS_ENVIRONMENT_STRUCTURED_DATA__LEVEL_REF);
		createEAttribute(gssEnvironmentStructuredDataEClass, GSS_ENVIRONMENT_STRUCTURED_DATA__FIRST_FIELD);

		gssEnvironmentPeriodEClass = createEClass(GSS_ENVIRONMENT_PERIOD);
		createEAttribute(gssEnvironmentPeriodEClass, GSS_ENVIRONMENT_PERIOD__MIN_VALUE);
		createEAttribute(gssEnvironmentPeriodEClass, GSS_ENVIRONMENT_PERIOD__MIN_UNIT);
		createEAttribute(gssEnvironmentPeriodEClass, GSS_ENVIRONMENT_PERIOD__MAX_VALUE);
		createEAttribute(gssEnvironmentPeriodEClass, GSS_ENVIRONMENT_PERIOD__MAX_UNIT);

		gssEnvironmentIntervalRangeEClass = createEClass(GSS_ENVIRONMENT_INTERVAL_RANGE);
		createEAttribute(gssEnvironmentIntervalRangeEClass, GSS_ENVIRONMENT_INTERVAL_RANGE__MIN);
		createEAttribute(gssEnvironmentIntervalRangeEClass, GSS_ENVIRONMENT_INTERVAL_RANGE__MAX);
		createEAttribute(gssEnvironmentIntervalRangeEClass, GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_VALUE);
		createEAttribute(gssEnvironmentIntervalRangeEClass, GSS_ENVIRONMENT_INTERVAL_RANGE__INTERVAL_UNIT);

		gssEnvironmentPeriodicTCsEClass = createEClass(GSS_ENVIRONMENT_PERIODIC_TCS);
		createEReference(gssEnvironmentPeriodicTCsEClass, GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_2);
		createEReference(gssEnvironmentPeriodicTCsEClass, GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_1);
		createEReference(gssEnvironmentPeriodicTCsEClass, GSS_ENVIRONMENT_PERIODIC_TCS__PERIODIC_TC_LEVEL_0);

		gssEnvironmentPeriodicTCEClass = createEClass(GSS_ENVIRONMENT_PERIODIC_TC);
		createEAttribute(gssEnvironmentPeriodicTCEClass, GSS_ENVIRONMENT_PERIODIC_TC__NAME);
		createEAttribute(gssEnvironmentPeriodicTCEClass, GSS_ENVIRONMENT_PERIODIC_TC__ID);
		createEAttribute(gssEnvironmentPeriodicTCEClass, GSS_ENVIRONMENT_PERIODIC_TC__IF_REF);
		createEAttribute(gssEnvironmentPeriodicTCEClass, GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_VALUE);
		createEAttribute(gssEnvironmentPeriodicTCEClass, GSS_ENVIRONMENT_PERIODIC_TC__PERIOD_UNIT);

		gssEnvironmentPeriodicTCLevel2EClass = createEClass(GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2);
		createEReference(gssEnvironmentPeriodicTCLevel2EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2);
		createEReference(gssEnvironmentPeriodicTCLevel2EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__APP_TO_LEVEL2);
		createEReference(gssEnvironmentPeriodicTCLevel2EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1);
		createEReference(gssEnvironmentPeriodicTCLevel2EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL2_TO_LEVEL1);
		createEReference(gssEnvironmentPeriodicTCLevel2EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL0);
		createEReference(gssEnvironmentPeriodicTCLevel2EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2__LEVEL1_TO_LEVEL0);

		gssEnvironmentPeriodicTCLevel1EClass = createEClass(GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1);
		createEReference(gssEnvironmentPeriodicTCLevel1EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL1);
		createEReference(gssEnvironmentPeriodicTCLevel1EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__APP_TO_LEVEL1);
		createEReference(gssEnvironmentPeriodicTCLevel1EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL0);
		createEReference(gssEnvironmentPeriodicTCLevel1EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1__LEVEL1_TO_LEVEL0);

		gssEnvironmentPeriodicTCLevel0EClass = createEClass(GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0);
		createEReference(gssEnvironmentPeriodicTCLevel0EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__LEVEL0);
		createEReference(gssEnvironmentPeriodicTCLevel0EClass, GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0__APP_TO_LEVEL0);

		gssEnvironmentGlobalVarsEClass = createEClass(GSS_ENVIRONMENT_GLOBAL_VARS);
		createEReference(gssEnvironmentGlobalVarsEClass, GSS_ENVIRONMENT_GLOBAL_VARS__GLOBAL_VAR);

		gssEnvironmentGlobalVarEClass = createEClass(GSS_ENVIRONMENT_GLOBAL_VAR);
		createEAttribute(gssEnvironmentGlobalVarEClass, GSS_ENVIRONMENT_GLOBAL_VAR__NAME);
		createEAttribute(gssEnvironmentGlobalVarEClass, GSS_ENVIRONMENT_GLOBAL_VAR__ID);
		createEAttribute(gssEnvironmentGlobalVarEClass, GSS_ENVIRONMENT_GLOBAL_VAR__TYPE);
		createEAttribute(gssEnvironmentGlobalVarEClass, GSS_ENVIRONMENT_GLOBAL_VAR__INITIAL_VALUE);
		createEReference(gssEnvironmentGlobalVarEClass, GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_FIELD);
		createEReference(gssEnvironmentGlobalVarEClass, GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_PERIODIC_TC);
		createEReference(gssEnvironmentGlobalVarEClass, GSS_ENVIRONMENT_GLOBAL_VAR__REFERENCE_SPECIAL_PACKET);

		gssEnvironmentReferenceFieldEClass = createEClass(GSS_ENVIRONMENT_REFERENCE_FIELD);
		createEAttribute(gssEnvironmentReferenceFieldEClass, GSS_ENVIRONMENT_REFERENCE_FIELD__TYPE);
		createEAttribute(gssEnvironmentReferenceFieldEClass, GSS_ENVIRONMENT_REFERENCE_FIELD__IF_REF);
		createEAttribute(gssEnvironmentReferenceFieldEClass, GSS_ENVIRONMENT_REFERENCE_FIELD__LEVEL);
		createEAttribute(gssEnvironmentReferenceFieldEClass, GSS_ENVIRONMENT_REFERENCE_FIELD__FIELD_REF);
		createEAttribute(gssEnvironmentReferenceFieldEClass, GSS_ENVIRONMENT_REFERENCE_FIELD__OFFSET);
		createEAttribute(gssEnvironmentReferenceFieldEClass, GSS_ENVIRONMENT_REFERENCE_FIELD__SIZE);

		gssEnvironmentReferencePeriodicTCEClass = createEClass(GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC);
		createEReference(gssEnvironmentReferencePeriodicTCEClass, GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__ID_REF);
		createEAttribute(gssEnvironmentReferencePeriodicTCEClass, GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__LEVEL);
		createEAttribute(gssEnvironmentReferencePeriodicTCEClass, GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__FIELD_REF);
		createEAttribute(gssEnvironmentReferencePeriodicTCEClass, GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__OFFSET);
		createEAttribute(gssEnvironmentReferencePeriodicTCEClass, GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC__SIZE);

		gssEnvironmentReferenceSpecialPacketEClass = createEClass(GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET);
		createEReference(gssEnvironmentReferenceSpecialPacketEClass, GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__ID_REF);
		createEAttribute(gssEnvironmentReferenceSpecialPacketEClass, GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__LEVEL);
		createEAttribute(gssEnvironmentReferenceSpecialPacketEClass, GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__FIELD_REF);
		createEAttribute(gssEnvironmentReferenceSpecialPacketEClass, GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__OFFSET);
		createEAttribute(gssEnvironmentReferenceSpecialPacketEClass, GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET__SIZE);

		gssEnvironmentMonitorsEClass = createEClass(GSS_ENVIRONMENT_MONITORS);
		createEReference(gssEnvironmentMonitorsEClass, GSS_ENVIRONMENT_MONITORS__CHARTS_FILE);
		createEReference(gssEnvironmentMonitorsEClass, GSS_ENVIRONMENT_MONITORS__PLOT);
		createEReference(gssEnvironmentMonitorsEClass, GSS_ENVIRONMENT_MONITORS__ALARM_MSG);
		createEReference(gssEnvironmentMonitorsEClass, GSS_ENVIRONMENT_MONITORS__MODIFY);
		createEReference(gssEnvironmentMonitorsEClass, GSS_ENVIRONMENT_MONITORS__ALARM_VAL);

		gssEnvironmentPlotEClass = createEClass(GSS_ENVIRONMENT_PLOT);
		createEAttribute(gssEnvironmentPlotEClass, GSS_ENVIRONMENT_PLOT__NAME);
		createEReference(gssEnvironmentPlotEClass, GSS_ENVIRONMENT_PLOT__CHART_REF);
		createEReference(gssEnvironmentPlotEClass, GSS_ENVIRONMENT_PLOT__GV_FILTERED);
		createEReference(gssEnvironmentPlotEClass, GSS_ENVIRONMENT_PLOT__GV_PERIODIC);

		gssEnvironmentAlarmMsgEClass = createEClass(GSS_ENVIRONMENT_ALARM_MSG);
		createEAttribute(gssEnvironmentAlarmMsgEClass, GSS_ENVIRONMENT_ALARM_MSG__NAME);
		createEAttribute(gssEnvironmentAlarmMsgEClass, GSS_ENVIRONMENT_ALARM_MSG__TYPE);
		createEAttribute(gssEnvironmentAlarmMsgEClass, GSS_ENVIRONMENT_ALARM_MSG__TEXT);
		createEReference(gssEnvironmentAlarmMsgEClass, GSS_ENVIRONMENT_ALARM_MSG__GV_FILTERED);
		createEReference(gssEnvironmentAlarmMsgEClass, GSS_ENVIRONMENT_ALARM_MSG__GV_PERIODIC);

		gssEnvironmentModifyEClass = createEClass(GSS_ENVIRONMENT_MODIFY);
		createEAttribute(gssEnvironmentModifyEClass, GSS_ENVIRONMENT_MODIFY__NAME);
		createEAttribute(gssEnvironmentModifyEClass, GSS_ENVIRONMENT_MODIFY__TYPE);
		createEAttribute(gssEnvironmentModifyEClass, GSS_ENVIRONMENT_MODIFY__VALUE);
		createEReference(gssEnvironmentModifyEClass, GSS_ENVIRONMENT_MODIFY__GV_FILTERED);
		createEReference(gssEnvironmentModifyEClass, GSS_ENVIRONMENT_MODIFY__GV_PERIODIC);

		gssEnvironmentAlarmValEClass = createEClass(GSS_ENVIRONMENT_ALARM_VAL);
		createEAttribute(gssEnvironmentAlarmValEClass, GSS_ENVIRONMENT_ALARM_VAL__NAME);
		createEAttribute(gssEnvironmentAlarmValEClass, GSS_ENVIRONMENT_ALARM_VAL__TYPE);
		createEReference(gssEnvironmentAlarmValEClass, GSS_ENVIRONMENT_ALARM_VAL__GV_FILTERED);
		createEReference(gssEnvironmentAlarmValEClass, GSS_ENVIRONMENT_ALARM_VAL__GV_PERIODIC);

		gssEnvironmentGVFilteredEClass = createEClass(GSS_ENVIRONMENT_GV_FILTERED);
		createEReference(gssEnvironmentGVFilteredEClass, GSS_ENVIRONMENT_GV_FILTERED__GLOBAL_VAR_REF);
		createEReference(gssEnvironmentGVFilteredEClass, GSS_ENVIRONMENT_GV_FILTERED__FILTER);

		gssEnvironmentGVPeriodicEClass = createEClass(GSS_ENVIRONMENT_GV_PERIODIC);
		createEReference(gssEnvironmentGVPeriodicEClass, GSS_ENVIRONMENT_GV_PERIODIC__GLOBAL_VAR_REF);
		createEAttribute(gssEnvironmentGVPeriodicEClass, GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_VALUE);
		createEAttribute(gssEnvironmentGVPeriodicEClass, GSS_ENVIRONMENT_GV_PERIODIC__PERIOD_UNIT);

		// Create enums
		gssEnvironmentEnableDisableEEnum = createEEnum(GSS_ENVIRONMENT_ENABLE_DISABLE);
		gssEnvironmentInterfaceTypeEEnum = createEEnum(GSS_ENVIRONMENT_INTERFACE_TYPE);
		gssEnvironmentInterfaceIOTypeEEnum = createEEnum(GSS_ENVIRONMENT_INTERFACE_IO_TYPE);
		gssEnvironmentUpperLevelLevelEEnum = createEEnum(GSS_ENVIRONMENT_UPPER_LEVEL_LEVEL);
		gssEnvironmentUnitEEnum = createEEnum(GSS_ENVIRONMENT_UNIT);
		gssEnvironmentGlobalVarTypeEEnum = createEEnum(GSS_ENVIRONMENT_GLOBAL_VAR_TYPE);
		gssEnvironmentReferenceFieldTypeEEnum = createEEnum(GSS_ENVIRONMENT_REFERENCE_FIELD_TYPE);
		gssEnvironmentAlarmMsgTypeEEnum = createEEnum(GSS_ENVIRONMENT_ALARM_MSG_TYPE);
		gssEnvironmentModifyTypeEEnum = createEEnum(GSS_ENVIRONMENT_MODIFY_TYPE);
		gssEnvironmentAlarmValTypeEEnum = createEEnum(GSS_ENVIRONMENT_ALARM_VAL_TYPE);
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
		gssEnvironmentEnvironmentEClass.getESuperTypes().add(thecommonPackage.getGSSModelElement());
		gssEnvironmentMainInterfaceEClass.getESuperTypes().add(this.getGSSEnvironmentInterface());
		gssEnvironmentPeriodicTCLevel2EClass.getESuperTypes().add(this.getGSSEnvironmentPeriodicTC());
		gssEnvironmentPeriodicTCLevel1EClass.getESuperTypes().add(this.getGSSEnvironmentPeriodicTC());
		gssEnvironmentPeriodicTCLevel0EClass.getESuperTypes().add(this.getGSSEnvironmentPeriodicTC());

		// Initialize classes, features, and operations; add parameters
		initEClass(gssEnvironmentEnvironmentEClass, GSSEnvironmentEnvironment.class, "GSSEnvironmentEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentEnvironment_Scenario(), this.getGSSEnvironmentScenario(), null, "scenario", null, 1, -1, GSSEnvironmentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentScenarioEClass, GSSEnvironmentScenario.class, "GSSEnvironmentScenario", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentScenario_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentScenario_Gss_options(), this.getGSSEnvironmentOptions(), null, "gss_options", null, 1, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentScenario_Protocols(), this.getGSSEnvironmentProtocols(), null, "Protocols", null, 1, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentScenario_Interfaces(), this.getGSSEnvironmentInterfaces(), null, "Interfaces", null, 1, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentScenario_SpecialPackets(), this.getGSSEnvironmentSpecialPackets(), null, "SpecialPackets", null, 0, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentScenario_PeriodicTCs(), this.getGSSEnvironmentPeriodicTCs(), null, "PeriodicTCs", null, 0, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentScenario_GlobalVars(), this.getGSSEnvironmentGlobalVars(), null, "GlobalVars", null, 0, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentScenario_Monitors(), this.getGSSEnvironmentMonitors(), null, "Monitors", null, 0, 1, GSSEnvironmentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentOptionsEClass, GSSEnvironmentOptions.class, "GSSEnvironmentOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentOptions_Gss_info(), this.getGSSEnvironmentInfo(), null, "gss_info", null, 1, 1, GSSEnvironmentOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentOptions_Gss_info_print(), this.getGSSEnvironmentInfoPrint(), null, "gss_info_print", null, 1, 1, GSSEnvironmentOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentOptions_Phy_header_print(), this.getGSSEnvironmentPhyHeaderPrint(), null, "phy_header_print", null, 1, 1, GSSEnvironmentOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentOptions_DiscardErrorFlags(), this.getGSSEnvironmentDiscardErrorFlags(), null, "discardErrorFlags", null, 1, 1, GSSEnvironmentOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentInfoEClass, GSSEnvironmentInfo.class, "GSSEnvironmentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentInfo_Test_campaign(), ecorePackage.getEString(), "test_campaign", null, 1, 1, GSSEnvironmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInfo_Version(), ecorePackage.getEString(), "version", null, 1, 1, GSSEnvironmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInfo_Date(), ecorePackage.getEString(), "date", null, 1, 1, GSSEnvironmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInfo_Version_control_url(), ecorePackage.getEString(), "version_control_url", null, 0, 1, GSSEnvironmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentInfoPrintEClass, GSSEnvironmentInfoPrint.class, "GSSEnvironmentInfoPrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentInfoPrint_MainLog(), this.getGSSEnvironmentEnableDisable(), "mainLog", null, 1, 1, GSSEnvironmentInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInfoPrint_PortLogs(), this.getGSSEnvironmentEnableDisable(), "portLogs", null, 1, 1, GSSEnvironmentInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInfoPrint_RawLog(), this.getGSSEnvironmentEnableDisable(), "rawLog", null, 1, 1, GSSEnvironmentInfoPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPhyHeaderPrintEClass, GSSEnvironmentPhyHeaderPrint.class, "GSSEnvironmentPhyHeaderPrint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentPhyHeaderPrint_MainLog(), this.getGSSEnvironmentEnableDisable(), "mainLog", null, 1, 1, GSSEnvironmentPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPhyHeaderPrint_PortLogs(), this.getGSSEnvironmentEnableDisable(), "portLogs", null, 1, 1, GSSEnvironmentPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPhyHeaderPrint_RawLog(), this.getGSSEnvironmentEnableDisable(), "rawLog", null, 1, 1, GSSEnvironmentPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPhyHeaderPrint_GssTabs(), this.getGSSEnvironmentEnableDisable(), "gssTabs", null, 1, 1, GSSEnvironmentPhyHeaderPrint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentDiscardErrorFlagsEClass, GSSEnvironmentDiscardErrorFlags.class, "GSSEnvironmentDiscardErrorFlags", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentDiscardErrorFlags_TxErrors(), this.getGSSEnvironmentEnableDisable(), "txErrors", null, 1, 1, GSSEnvironmentDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentDiscardErrorFlags_NotExpectedPackets(), this.getGSSEnvironmentEnableDisable(), "notExpectedPackets", null, 1, 1, GSSEnvironmentDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentDiscardErrorFlags_FiltersKo(), this.getGSSEnvironmentEnableDisable(), "filtersKo", null, 1, 1, GSSEnvironmentDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentDiscardErrorFlags_ValidTimesKo(), this.getGSSEnvironmentEnableDisable(), "validTimesKo", null, 1, 1, GSSEnvironmentDiscardErrorFlags.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentProtocolsEClass, GSSEnvironmentProtocols.class, "GSSEnvironmentProtocols", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentProtocols_Protocol(), this.getGSSEnvironmentProtocol(), null, "Protocol", null, 1, 2, GSSEnvironmentProtocols.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentProtocolEClass, GSSEnvironmentProtocol.class, "GSSEnvironmentProtocol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentProtocol_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentProtocol_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentProtocol_TypeLevel(), ecorePackage.getEString(), "typeLevel", null, 1, 1, GSSEnvironmentProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentProtocol_TypeOffset(), ecorePackage.getEString(), "typeOffset", null, 1, 1, GSSEnvironmentProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentProtocol_SubtypeOffset(), ecorePackage.getEString(), "subtypeOffset", null, 0, 1, GSSEnvironmentProtocol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentInterfacesEClass, GSSEnvironmentInterfaces.class, "GSSEnvironmentInterfaces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentInterfaces_ProtocolPacketsFile(), theprotocol_packetsPackage.getGSSProtocolPacketsProtocolPackets(), null, "ProtocolPacketsFile", null, 0, 1, GSSEnvironmentInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentInterfaces_MainInterface(), this.getGSSEnvironmentMainInterface(), null, "MainInterface", null, 1, 1, GSSEnvironmentInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentInterfaces_Interface(), this.getGSSEnvironmentInterface(), null, "Interface", null, 0, 7, GSSEnvironmentInterfaces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentMainInterfaceEClass, GSSEnvironmentMainInterface.class, "GSSEnvironmentMainInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gssEnvironmentInterfaceEClass, GSSEnvironmentInterface.class, "GSSEnvironmentInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentInterface_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInterface_IfType(), this.getGSSEnvironmentInterfaceType(), "ifType", null, 1, 1, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentInterface_IfConfig(), theifacePackage.getGSSIfacePortConfig(), null, "ifConfig", null, 1, 1, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentInterface_IoType(), this.getGSSEnvironmentInterfaceIOType(), "ioType", null, 1, 1, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentInterface_ProtocolID(), this.getGSSEnvironmentProtocol(), null, "protocolID", null, 0, 1, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentInterface_LevelInOut(), this.getGSSEnvironmentLevelInOut(), null, "LevelInOut", null, 0, 3, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentInterface_LevelIn(), this.getGSSEnvironmentLevelIn(), null, "LevelIn", null, 0, 3, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentInterface_LevelOut(), this.getGSSEnvironmentLevelOut(), null, "LevelOut", null, 0, 3, GSSEnvironmentInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentLevelInOutEClass, GSSEnvironmentLevelInOut.class, "GSSEnvironmentLevelInOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentLevelInOut_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentLevelInOut_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelInOut_TMformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TMformat", null, 1, 1, GSSEnvironmentLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelInOut_TCformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TCformat", null, 1, 1, GSSEnvironmentLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelInOut_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 1, 1, GSSEnvironmentLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelInOut_Export_to_prev_Level(), theexportPackage.getTMTCIFExportExport(), null, "export_to_prev_Level", null, 0, 1, GSSEnvironmentLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelInOut_Import_from_prev_Level(), theimportPackage.getTMTCIFImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSEnvironmentLevelInOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentLevelInEClass, GSSEnvironmentLevelIn.class, "GSSEnvironmentLevelIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentLevelIn_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentLevelIn_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelIn_TCformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TCformat", null, 1, 1, GSSEnvironmentLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelIn_Export_to_prev_Level(), theexportPackage.getTMTCIFExportExport(), null, "export_to_prev_Level", null, 0, 1, GSSEnvironmentLevelIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentLevelOutEClass, GSSEnvironmentLevelOut.class, "GSSEnvironmentLevelOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentLevelOut_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentLevelOut_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelOut_TMformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TMformat", null, 1, 1, GSSEnvironmentLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelOut_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 1, 1, GSSEnvironmentLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentLevelOut_Import_from_prev_Level(), theimportPackage.getTMTCIFImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSEnvironmentLevelOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentSpecialPacketsEClass, GSSEnvironmentSpecialPackets.class, "GSSEnvironmentSpecialPackets", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentSpecialPackets_SpecialPacket(), this.getGSSEnvironmentSpecialPacket(), null, "SpecialPacket", null, 1, 17, GSSEnvironmentSpecialPackets.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentSpecialPacketEClass, GSSEnvironmentSpecialPacket.class, "GSSEnvironmentSpecialPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentSpecialPacket_Status(), this.getGSSEnvironmentEnableDisable(), "status", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentSpecialPacket_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentSpecialPacket_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentSpecialPacket_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentSpecialPacket_Levels(), ecorePackage.getEString(), "levels", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentSpecialPacket_LevelRef(), ecorePackage.getEString(), "levelRef", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentSpecialPacket_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentSpecialPacket_UpperLevels(), this.getGSSEnvironmentUpperLevels(), null, "UpperLevels", null, 0, 3, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentSpecialPacket_PrintingData(), this.getGSSEnvironmentPrintingData(), null, "printingData", null, 1, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentSpecialPacket_Period(), this.getGSSEnvironmentPeriod(), null, "period", null, 0, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentSpecialPacket_IntervalRange(), this.getGSSEnvironmentIntervalRange(), null, "intervalRange", null, 0, 1, GSSEnvironmentSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentUpperLevelsEClass, GSSEnvironmentUpperLevels.class, "GSSEnvironmentUpperLevels", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentUpperLevels_UpperLevel(), this.getGSSEnvironmentUpperLevel(), null, "UpperLevel", null, 1, -1, GSSEnvironmentUpperLevels.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentUpperLevelEClass, GSSEnvironmentUpperLevel.class, "GSSEnvironmentUpperLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentUpperLevel_Level(), this.getGSSEnvironmentUpperLevelLevel(), "level", null, 1, 1, GSSEnvironmentUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentUpperLevel_TMformat(), theformatPackage.getTMTCIFFormatFormat(), null, "TMformat", null, 1, 1, GSSEnvironmentUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentUpperLevel_InputFilter(), thefilterPackage.getTMTCIFFilterFilter(), null, "inputFilter", null, 0, 1, GSSEnvironmentUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentUpperLevel_Import_from_prev_Level(), theimportPackage.getTMTCIFImportImport(), null, "import_from_prev_Level", null, 0, 1, GSSEnvironmentUpperLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPrintingDataEClass, GSSEnvironmentPrintingData.class, "GSSEnvironmentPrintingData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentPrintingData_PrintStatus(), this.getGSSEnvironmentEnableDisable(), "printStatus", null, 1, 1, GSSEnvironmentPrintingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPrintingData_StructuredData(), this.getGSSEnvironmentStructuredData(), null, "structuredData", null, 0, 1, GSSEnvironmentPrintingData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentStructuredDataEClass, GSSEnvironmentStructuredData.class, "GSSEnvironmentStructuredData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentStructuredData_LevelRef(), ecorePackage.getEString(), "levelRef", null, 1, 1, GSSEnvironmentStructuredData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentStructuredData_FirstField(), ecorePackage.getEString(), "firstField", null, 1, 1, GSSEnvironmentStructuredData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPeriodEClass, GSSEnvironmentPeriod.class, "GSSEnvironmentPeriod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentPeriod_Min_value(), ecorePackage.getEString(), "min_value", null, 1, 1, GSSEnvironmentPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPeriod_Min_unit(), this.getGSSEnvironmentUnit(), "min_unit", null, 1, 1, GSSEnvironmentPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPeriod_Max_value(), ecorePackage.getEString(), "max_value", null, 1, 1, GSSEnvironmentPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPeriod_Max_unit(), this.getGSSEnvironmentUnit(), "max_unit", null, 1, 1, GSSEnvironmentPeriod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentIntervalRangeEClass, GSSEnvironmentIntervalRange.class, "GSSEnvironmentIntervalRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentIntervalRange_Min(), ecorePackage.getEString(), "min", null, 1, 1, GSSEnvironmentIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentIntervalRange_Max(), ecorePackage.getEString(), "max", null, 1, 1, GSSEnvironmentIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentIntervalRange_Interval_value(), ecorePackage.getEString(), "interval_value", null, 1, 1, GSSEnvironmentIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentIntervalRange_Interval_unit(), this.getGSSEnvironmentUnit(), "interval_unit", null, 1, 1, GSSEnvironmentIntervalRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPeriodicTCsEClass, GSSEnvironmentPeriodicTCs.class, "GSSEnvironmentPeriodicTCs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentPeriodicTCs_PeriodicTC_level_2(), this.getGSSEnvironmentPeriodicTCLevel2(), null, "PeriodicTC_level_2", null, 0, -1, GSSEnvironmentPeriodicTCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCs_PeriodicTC_level_1(), this.getGSSEnvironmentPeriodicTCLevel1(), null, "PeriodicTC_level_1", null, 0, -1, GSSEnvironmentPeriodicTCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCs_PeriodicTC_level_0(), this.getGSSEnvironmentPeriodicTCLevel0(), null, "PeriodicTC_level_0", null, 0, -1, GSSEnvironmentPeriodicTCs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPeriodicTCEClass, GSSEnvironmentPeriodicTC.class, "GSSEnvironmentPeriodicTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentPeriodicTC_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPeriodicTC_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPeriodicTC_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSEnvironmentPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPeriodicTC_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSEnvironmentPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentPeriodicTC_Period_unit(), this.getGSSEnvironmentUnit(), "period_unit", null, 1, 1, GSSEnvironmentPeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPeriodicTCLevel2EClass, GSSEnvironmentPeriodicTCLevel2.class, "GSSEnvironmentPeriodicTCLevel2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentPeriodicTCLevel2_Level2(), theformatPackage.getTMTCIFFormatFormat(), null, "level2", null, 0, 1, GSSEnvironmentPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel2_App_to_level2(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level2", null, 1, 1, GSSEnvironmentPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel2_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSEnvironmentPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel2_Level2_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "level2_to_level1", null, 0, 1, GSSEnvironmentPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel2_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSEnvironmentPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel2_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, GSSEnvironmentPeriodicTCLevel2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPeriodicTCLevel1EClass, GSSEnvironmentPeriodicTCLevel1.class, "GSSEnvironmentPeriodicTCLevel1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentPeriodicTCLevel1_Level1(), theformatPackage.getTMTCIFFormatFormat(), null, "level1", null, 0, 1, GSSEnvironmentPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel1_App_to_level1(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level1", null, 1, 1, GSSEnvironmentPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel1_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSEnvironmentPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel1_Level1_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "level1_to_level0", null, 0, 1, GSSEnvironmentPeriodicTCLevel1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPeriodicTCLevel0EClass, GSSEnvironmentPeriodicTCLevel0.class, "GSSEnvironmentPeriodicTCLevel0", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentPeriodicTCLevel0_Level0(), theformatPackage.getTMTCIFFormatFormat(), null, "level0", null, 0, 1, GSSEnvironmentPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPeriodicTCLevel0_App_to_level0(), theexportPackage.getTMTCIFExportExport(), null, "app_to_level0", null, 1, 1, GSSEnvironmentPeriodicTCLevel0.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentGlobalVarsEClass, GSSEnvironmentGlobalVars.class, "GSSEnvironmentGlobalVars", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentGlobalVars_GlobalVar(), this.getGSSEnvironmentGlobalVar(), null, "GlobalVar", null, 1, 10, GSSEnvironmentGlobalVars.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentGlobalVarEClass, GSSEnvironmentGlobalVar.class, "GSSEnvironmentGlobalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentGlobalVar_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentGlobalVar_Id(), ecorePackage.getEString(), "id", null, 1, 1, GSSEnvironmentGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentGlobalVar_Type(), this.getGSSEnvironmentGlobalVarType(), "type", null, 1, 1, GSSEnvironmentGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentGlobalVar_Initial_value(), ecorePackage.getEString(), "initial_value", null, 1, 1, GSSEnvironmentGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentGlobalVar_ReferenceField(), this.getGSSEnvironmentReferenceField(), null, "referenceField", null, 0, 1, GSSEnvironmentGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentGlobalVar_ReferencePeriodicTC(), this.getGSSEnvironmentReferencePeriodicTC(), null, "referencePeriodicTC", null, 0, 1, GSSEnvironmentGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentGlobalVar_ReferenceSpecialPacket(), this.getGSSEnvironmentReferenceSpecialPacket(), null, "referenceSpecialPacket", null, 0, 1, GSSEnvironmentGlobalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentReferenceFieldEClass, GSSEnvironmentReferenceField.class, "GSSEnvironmentReferenceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentReferenceField_Type(), this.getGSSEnvironmentReferenceFieldType(), "type", null, 1, 1, GSSEnvironmentReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceField_IfRef(), ecorePackage.getEString(), "ifRef", null, 1, 1, GSSEnvironmentReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceField_Level(), ecorePackage.getEString(), "level", null, 1, 1, GSSEnvironmentReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceField_FieldRef(), ecorePackage.getEString(), "fieldRef", null, 1, 1, GSSEnvironmentReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceField_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSEnvironmentReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceField_Size(), ecorePackage.getEString(), "size", null, 1, 1, GSSEnvironmentReferenceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentReferencePeriodicTCEClass, GSSEnvironmentReferencePeriodicTC.class, "GSSEnvironmentReferencePeriodicTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentReferencePeriodicTC_IdRef(), this.getGSSEnvironmentPeriodicTC(), null, "idRef", null, 1, 1, GSSEnvironmentReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferencePeriodicTC_Level(), ecorePackage.getEString(), "level", null, 1, 1, GSSEnvironmentReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferencePeriodicTC_FieldRef(), ecorePackage.getEString(), "fieldRef", null, 1, 1, GSSEnvironmentReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferencePeriodicTC_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSEnvironmentReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferencePeriodicTC_Size(), ecorePackage.getEString(), "size", null, 1, 1, GSSEnvironmentReferencePeriodicTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentReferenceSpecialPacketEClass, GSSEnvironmentReferenceSpecialPacket.class, "GSSEnvironmentReferenceSpecialPacket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentReferenceSpecialPacket_IdRef(), this.getGSSEnvironmentSpecialPacket(), null, "idRef", null, 1, 1, GSSEnvironmentReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceSpecialPacket_Level(), ecorePackage.getEString(), "level", null, 1, 1, GSSEnvironmentReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceSpecialPacket_FieldRef(), ecorePackage.getEString(), "fieldRef", null, 1, 1, GSSEnvironmentReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceSpecialPacket_Offset(), ecorePackage.getEString(), "offset", null, 1, 1, GSSEnvironmentReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentReferenceSpecialPacket_Size(), ecorePackage.getEString(), "size", null, 1, 1, GSSEnvironmentReferenceSpecialPacket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentMonitorsEClass, GSSEnvironmentMonitors.class, "GSSEnvironmentMonitors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentMonitors_ChartsFile(), thechartsPackage.getGSSChartsCharts(), null, "ChartsFile", null, 0, 1, GSSEnvironmentMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentMonitors_Plot(), this.getGSSEnvironmentPlot(), null, "plot", null, 0, -1, GSSEnvironmentMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentMonitors_AlarmMsg(), this.getGSSEnvironmentAlarmMsg(), null, "alarmMsg", null, 0, -1, GSSEnvironmentMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentMonitors_Modify(), this.getGSSEnvironmentModify(), null, "modify", null, 0, -1, GSSEnvironmentMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentMonitors_AlarmVal(), this.getGSSEnvironmentAlarmVal(), null, "alarmVal", null, 0, 3, GSSEnvironmentMonitors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentPlotEClass, GSSEnvironmentPlot.class, "GSSEnvironmentPlot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentPlot_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPlot_ChartRef(), thechartsPackage.getGSSChartsChart(), null, "chartRef", null, 1, 1, GSSEnvironmentPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPlot_GVFiltered(), this.getGSSEnvironmentGVFiltered(), null, "GVFiltered", null, 0, 1, GSSEnvironmentPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentPlot_GVPeriodic(), this.getGSSEnvironmentGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSEnvironmentPlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentAlarmMsgEClass, GSSEnvironmentAlarmMsg.class, "GSSEnvironmentAlarmMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentAlarmMsg_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentAlarmMsg_Type(), this.getGSSEnvironmentAlarmMsgType(), "type", null, 1, 1, GSSEnvironmentAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentAlarmMsg_Text(), ecorePackage.getEString(), "text", null, 1, 1, GSSEnvironmentAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentAlarmMsg_GVFiltered(), this.getGSSEnvironmentGVFiltered(), null, "GVFiltered", null, 0, 1, GSSEnvironmentAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentAlarmMsg_GVPeriodic(), this.getGSSEnvironmentGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSEnvironmentAlarmMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentModifyEClass, GSSEnvironmentModify.class, "GSSEnvironmentModify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentModify_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentModify_Type(), this.getGSSEnvironmentModifyType(), "type", null, 1, 1, GSSEnvironmentModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentModify_Value(), ecorePackage.getEString(), "value", null, 1, 1, GSSEnvironmentModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentModify_GVFiltered(), this.getGSSEnvironmentGVFiltered(), null, "GVFiltered", null, 0, 1, GSSEnvironmentModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentModify_GVPeriodic(), this.getGSSEnvironmentGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSEnvironmentModify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentAlarmValEClass, GSSEnvironmentAlarmVal.class, "GSSEnvironmentAlarmVal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSSEnvironmentAlarmVal_Name(), ecorePackage.getEString(), "name", null, 1, 1, GSSEnvironmentAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentAlarmVal_Type(), this.getGSSEnvironmentAlarmValType(), "type", null, 1, 1, GSSEnvironmentAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentAlarmVal_GVFiltered(), this.getGSSEnvironmentGVFiltered(), null, "GVFiltered", null, 0, 1, GSSEnvironmentAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentAlarmVal_GVPeriodic(), this.getGSSEnvironmentGVPeriodic(), null, "GVPeriodic", null, 0, 1, GSSEnvironmentAlarmVal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentGVFilteredEClass, GSSEnvironmentGVFiltered.class, "GSSEnvironmentGVFiltered", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentGVFiltered_GlobalVarRef(), this.getGSSEnvironmentGlobalVar(), null, "GlobalVarRef", null, 1, 1, GSSEnvironmentGVFiltered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSSEnvironmentGVFiltered_Filter(), thefilterPackage.getTMTCIFFilterFilter(), null, "filter", null, 0, 1, GSSEnvironmentGVFiltered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gssEnvironmentGVPeriodicEClass, GSSEnvironmentGVPeriodic.class, "GSSEnvironmentGVPeriodic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSSEnvironmentGVPeriodic_GlobalVarRef(), this.getGSSEnvironmentGlobalVar(), null, "GlobalVarRef", null, 1, 1, GSSEnvironmentGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentGVPeriodic_Period_value(), ecorePackage.getEString(), "period_value", null, 1, 1, GSSEnvironmentGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGSSEnvironmentGVPeriodic_Period_unit(), this.getGSSEnvironmentUnit(), "period_unit", null, 1, 1, GSSEnvironmentGVPeriodic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(gssEnvironmentEnableDisableEEnum, GSSEnvironmentEnableDisable.class, "GSSEnvironmentEnableDisable");
		addEEnumLiteral(gssEnvironmentEnableDisableEEnum, GSSEnvironmentEnableDisable.DISABLED);
		addEEnumLiteral(gssEnvironmentEnableDisableEEnum, GSSEnvironmentEnableDisable.ENABLED);

		initEEnum(gssEnvironmentInterfaceTypeEEnum, GSSEnvironmentInterfaceType.class, "GSSEnvironmentInterfaceType");
		addEEnumLiteral(gssEnvironmentInterfaceTypeEEnum, GSSEnvironmentInterfaceType.SP_W);
		addEEnumLiteral(gssEnvironmentInterfaceTypeEEnum, GSSEnvironmentInterfaceType.SP_WTC);
		addEEnumLiteral(gssEnvironmentInterfaceTypeEEnum, GSSEnvironmentInterfaceType.SP_WERROR);
		addEEnumLiteral(gssEnvironmentInterfaceTypeEEnum, GSSEnvironmentInterfaceType.UART);
		addEEnumLiteral(gssEnvironmentInterfaceTypeEEnum, GSSEnvironmentInterfaceType.DUMMY);

		initEEnum(gssEnvironmentInterfaceIOTypeEEnum, GSSEnvironmentInterfaceIOType.class, "GSSEnvironmentInterfaceIOType");
		addEEnumLiteral(gssEnvironmentInterfaceIOTypeEEnum, GSSEnvironmentInterfaceIOType.IN_OUT);
		addEEnumLiteral(gssEnvironmentInterfaceIOTypeEEnum, GSSEnvironmentInterfaceIOType.IN);
		addEEnumLiteral(gssEnvironmentInterfaceIOTypeEEnum, GSSEnvironmentInterfaceIOType.OUT);

		initEEnum(gssEnvironmentUpperLevelLevelEEnum, GSSEnvironmentUpperLevelLevel.class, "GSSEnvironmentUpperLevelLevel");
		addEEnumLiteral(gssEnvironmentUpperLevelLevelEEnum, GSSEnvironmentUpperLevelLevel._1);
		addEEnumLiteral(gssEnvironmentUpperLevelLevelEEnum, GSSEnvironmentUpperLevelLevel._2);
		addEEnumLiteral(gssEnvironmentUpperLevelLevelEEnum, GSSEnvironmentUpperLevelLevel._3);

		initEEnum(gssEnvironmentUnitEEnum, GSSEnvironmentUnit.class, "GSSEnvironmentUnit");
		addEEnumLiteral(gssEnvironmentUnitEEnum, GSSEnvironmentUnit.MILISECONDS);
		addEEnumLiteral(gssEnvironmentUnitEEnum, GSSEnvironmentUnit.SECONDS);

		initEEnum(gssEnvironmentGlobalVarTypeEEnum, GSSEnvironmentGlobalVarType.class, "GSSEnvironmentGlobalVarType");
		addEEnumLiteral(gssEnvironmentGlobalVarTypeEEnum, GSSEnvironmentGlobalVarType.UINT);
		addEEnumLiteral(gssEnvironmentGlobalVarTypeEEnum, GSSEnvironmentGlobalVarType.FORMULA);

		initEEnum(gssEnvironmentReferenceFieldTypeEEnum, GSSEnvironmentReferenceFieldType.class, "GSSEnvironmentReferenceFieldType");
		addEEnumLiteral(gssEnvironmentReferenceFieldTypeEEnum, GSSEnvironmentReferenceFieldType.TM);
		addEEnumLiteral(gssEnvironmentReferenceFieldTypeEEnum, GSSEnvironmentReferenceFieldType.TC);

		initEEnum(gssEnvironmentAlarmMsgTypeEEnum, GSSEnvironmentAlarmMsgType.class, "GSSEnvironmentAlarmMsgType");
		addEEnumLiteral(gssEnvironmentAlarmMsgTypeEEnum, GSSEnvironmentAlarmMsgType.ALARM1);
		addEEnumLiteral(gssEnvironmentAlarmMsgTypeEEnum, GSSEnvironmentAlarmMsgType.ALARM2);
		addEEnumLiteral(gssEnvironmentAlarmMsgTypeEEnum, GSSEnvironmentAlarmMsgType.ALARM3);

		initEEnum(gssEnvironmentModifyTypeEEnum, GSSEnvironmentModifyType.class, "GSSEnvironmentModifyType");
		addEEnumLiteral(gssEnvironmentModifyTypeEEnum, GSSEnvironmentModifyType.INCREMENT);
		addEEnumLiteral(gssEnvironmentModifyTypeEEnum, GSSEnvironmentModifyType.INCREMENT1WRAP);

		initEEnum(gssEnvironmentAlarmValTypeEEnum, GSSEnvironmentAlarmValType.class, "GSSEnvironmentAlarmValType");
		addEEnumLiteral(gssEnvironmentAlarmValTypeEEnum, GSSEnvironmentAlarmValType.ALARM1);

		// Create resource
		createResource(eNS_URI);
	}

} //environmentPackageImpl
