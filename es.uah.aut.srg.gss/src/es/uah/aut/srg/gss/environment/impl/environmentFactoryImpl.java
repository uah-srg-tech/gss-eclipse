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

import es.uah.aut.srg.gss.environment.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class environmentFactoryImpl extends EFactoryImpl implements environmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static environmentFactory init() {
		try {
			environmentFactory theenvironmentFactory = (environmentFactory)EPackage.Registry.INSTANCE.getEFactory(environmentPackage.eNS_URI);
			if (theenvironmentFactory != null) {
				return theenvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new environmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case environmentPackage.GSS_ENVIRONMENT_ENVIRONMENT: return createGSSEnvironmentEnvironment();
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO: return createGSSEnvironmentScenario();
			case environmentPackage.GSS_ENVIRONMENT_OPTIONS: return createGSSEnvironmentOptions();
			case environmentPackage.GSS_ENVIRONMENT_INFO: return createGSSEnvironmentInfo();
			case environmentPackage.GSS_ENVIRONMENT_INFO_PRINT: return createGSSEnvironmentInfoPrint();
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT: return createGSSEnvironmentPhyHeaderPrint();
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS: return createGSSEnvironmentDiscardErrorFlags();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS: return createGSSEnvironmentProtocols();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL: return createGSSEnvironmentProtocol();
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL_TYPE: return createGSSEnvironmentProtocolType();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACES: return createGSSEnvironmentInterfaces();
			case environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE: return createGSSEnvironmentMainInterface();
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE: return createGSSEnvironmentInterface();
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_IN_OUT: return createGSSEnvironmentLevelInOut();
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_IN: return createGSSEnvironmentLevelIn();
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_OUT: return createGSSEnvironmentLevelOut();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS: return createGSSEnvironmentSpecialPackets();
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET: return createGSSEnvironmentSpecialPacket();
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVELS: return createGSSEnvironmentUpperLevels();
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL: return createGSSEnvironmentUpperLevel();
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA: return createGSSEnvironmentPrintingData();
			case environmentPackage.GSS_ENVIRONMENT_STRUCTURED_DATA: return createGSSEnvironmentStructuredData();
			case environmentPackage.GSS_ENVIRONMENT_PERIOD: return createGSSEnvironmentPeriod();
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE: return createGSSEnvironmentIntervalRange();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS: return createGSSEnvironmentPeriodicTCs();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC: return createGSSEnvironmentPeriodicTC();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2: return createGSSEnvironmentPeriodicTCLevel2();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1: return createGSSEnvironmentPeriodicTCLevel1();
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0: return createGSSEnvironmentPeriodicTCLevel0();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS: return createGSSEnvironmentGlobalVars();
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR: return createGSSEnvironmentGlobalVar();
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_FIELD: return createGSSEnvironmentReferenceField();
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC: return createGSSEnvironmentReferencePeriodicTC();
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET: return createGSSEnvironmentReferenceSpecialPacket();
			case environmentPackage.GSS_ENVIRONMENT_MONITORS: return createGSSEnvironmentMonitors();
			case environmentPackage.GSS_ENVIRONMENT_PLOT: return createGSSEnvironmentPlot();
			case environmentPackage.GSS_ENVIRONMENT_ALARM_MSG: return createGSSEnvironmentAlarmMsg();
			case environmentPackage.GSS_ENVIRONMENT_MODIFY: return createGSSEnvironmentModify();
			case environmentPackage.GSS_ENVIRONMENT_ALARM_VAL: return createGSSEnvironmentAlarmVal();
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED: return createGSSEnvironmentGVFiltered();
			case environmentPackage.GSS_ENVIRONMENT_GV_PERIODIC: return createGSSEnvironmentGVPeriodic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case environmentPackage.GSS_ENVIRONMENT_ENABLE_DISABLE:
				return createGSSEnvironmentEnableDisableFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE_TYPE:
				return createGSSEnvironmentInterfaceTypeFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE_IO_TYPE:
				return createGSSEnvironmentInterfaceIOTypeFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL_LEVEL:
				return createGSSEnvironmentUpperLevelLevelFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_UNIT:
				return createGSSEnvironmentUnitFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR_TYPE:
				return createGSSEnvironmentGlobalVarTypeFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_FIELD_TYPE:
				return createGSSEnvironmentReferenceFieldTypeFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_ALARM_MSG_TYPE:
				return createGSSEnvironmentAlarmMsgTypeFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_MODIFY_TYPE:
				return createGSSEnvironmentModifyTypeFromString(eDataType, initialValue);
			case environmentPackage.GSS_ENVIRONMENT_ALARM_VAL_TYPE:
				return createGSSEnvironmentAlarmValTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case environmentPackage.GSS_ENVIRONMENT_ENABLE_DISABLE:
				return convertGSSEnvironmentEnableDisableToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE_TYPE:
				return convertGSSEnvironmentInterfaceTypeToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE_IO_TYPE:
				return convertGSSEnvironmentInterfaceIOTypeToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL_LEVEL:
				return convertGSSEnvironmentUpperLevelLevelToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_UNIT:
				return convertGSSEnvironmentUnitToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR_TYPE:
				return convertGSSEnvironmentGlobalVarTypeToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_FIELD_TYPE:
				return convertGSSEnvironmentReferenceFieldTypeToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_ALARM_MSG_TYPE:
				return convertGSSEnvironmentAlarmMsgTypeToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_MODIFY_TYPE:
				return convertGSSEnvironmentModifyTypeToString(eDataType, instanceValue);
			case environmentPackage.GSS_ENVIRONMENT_ALARM_VAL_TYPE:
				return convertGSSEnvironmentAlarmValTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnvironment createGSSEnvironmentEnvironment() {
		GSSEnvironmentEnvironmentImpl gssEnvironmentEnvironment = new GSSEnvironmentEnvironmentImpl();
		return gssEnvironmentEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentScenario createGSSEnvironmentScenario() {
		GSSEnvironmentScenarioImpl gssEnvironmentScenario = new GSSEnvironmentScenarioImpl();
		return gssEnvironmentScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentOptions createGSSEnvironmentOptions() {
		GSSEnvironmentOptionsImpl gssEnvironmentOptions = new GSSEnvironmentOptionsImpl();
		return gssEnvironmentOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInfo createGSSEnvironmentInfo() {
		GSSEnvironmentInfoImpl gssEnvironmentInfo = new GSSEnvironmentInfoImpl();
		return gssEnvironmentInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInfoPrint createGSSEnvironmentInfoPrint() {
		GSSEnvironmentInfoPrintImpl gssEnvironmentInfoPrint = new GSSEnvironmentInfoPrintImpl();
		return gssEnvironmentInfoPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPhyHeaderPrint createGSSEnvironmentPhyHeaderPrint() {
		GSSEnvironmentPhyHeaderPrintImpl gssEnvironmentPhyHeaderPrint = new GSSEnvironmentPhyHeaderPrintImpl();
		return gssEnvironmentPhyHeaderPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentDiscardErrorFlags createGSSEnvironmentDiscardErrorFlags() {
		GSSEnvironmentDiscardErrorFlagsImpl gssEnvironmentDiscardErrorFlags = new GSSEnvironmentDiscardErrorFlagsImpl();
		return gssEnvironmentDiscardErrorFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentProtocols createGSSEnvironmentProtocols() {
		GSSEnvironmentProtocolsImpl gssEnvironmentProtocols = new GSSEnvironmentProtocolsImpl();
		return gssEnvironmentProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentProtocol createGSSEnvironmentProtocol() {
		GSSEnvironmentProtocolImpl gssEnvironmentProtocol = new GSSEnvironmentProtocolImpl();
		return gssEnvironmentProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentProtocolType createGSSEnvironmentProtocolType() {
		GSSEnvironmentProtocolTypeImpl gssEnvironmentProtocolType = new GSSEnvironmentProtocolTypeImpl();
		return gssEnvironmentProtocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInterfaces createGSSEnvironmentInterfaces() {
		GSSEnvironmentInterfacesImpl gssEnvironmentInterfaces = new GSSEnvironmentInterfacesImpl();
		return gssEnvironmentInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentMainInterface createGSSEnvironmentMainInterface() {
		GSSEnvironmentMainInterfaceImpl gssEnvironmentMainInterface = new GSSEnvironmentMainInterfaceImpl();
		return gssEnvironmentMainInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInterface createGSSEnvironmentInterface() {
		GSSEnvironmentInterfaceImpl gssEnvironmentInterface = new GSSEnvironmentInterfaceImpl();
		return gssEnvironmentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentLevelInOut createGSSEnvironmentLevelInOut() {
		GSSEnvironmentLevelInOutImpl gssEnvironmentLevelInOut = new GSSEnvironmentLevelInOutImpl();
		return gssEnvironmentLevelInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentLevelIn createGSSEnvironmentLevelIn() {
		GSSEnvironmentLevelInImpl gssEnvironmentLevelIn = new GSSEnvironmentLevelInImpl();
		return gssEnvironmentLevelIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentLevelOut createGSSEnvironmentLevelOut() {
		GSSEnvironmentLevelOutImpl gssEnvironmentLevelOut = new GSSEnvironmentLevelOutImpl();
		return gssEnvironmentLevelOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentSpecialPackets createGSSEnvironmentSpecialPackets() {
		GSSEnvironmentSpecialPacketsImpl gssEnvironmentSpecialPackets = new GSSEnvironmentSpecialPacketsImpl();
		return gssEnvironmentSpecialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentSpecialPacket createGSSEnvironmentSpecialPacket() {
		GSSEnvironmentSpecialPacketImpl gssEnvironmentSpecialPacket = new GSSEnvironmentSpecialPacketImpl();
		return gssEnvironmentSpecialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentUpperLevels createGSSEnvironmentUpperLevels() {
		GSSEnvironmentUpperLevelsImpl gssEnvironmentUpperLevels = new GSSEnvironmentUpperLevelsImpl();
		return gssEnvironmentUpperLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentUpperLevel createGSSEnvironmentUpperLevel() {
		GSSEnvironmentUpperLevelImpl gssEnvironmentUpperLevel = new GSSEnvironmentUpperLevelImpl();
		return gssEnvironmentUpperLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPrintingData createGSSEnvironmentPrintingData() {
		GSSEnvironmentPrintingDataImpl gssEnvironmentPrintingData = new GSSEnvironmentPrintingDataImpl();
		return gssEnvironmentPrintingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentStructuredData createGSSEnvironmentStructuredData() {
		GSSEnvironmentStructuredDataImpl gssEnvironmentStructuredData = new GSSEnvironmentStructuredDataImpl();
		return gssEnvironmentStructuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriod createGSSEnvironmentPeriod() {
		GSSEnvironmentPeriodImpl gssEnvironmentPeriod = new GSSEnvironmentPeriodImpl();
		return gssEnvironmentPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentIntervalRange createGSSEnvironmentIntervalRange() {
		GSSEnvironmentIntervalRangeImpl gssEnvironmentIntervalRange = new GSSEnvironmentIntervalRangeImpl();
		return gssEnvironmentIntervalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriodicTCs createGSSEnvironmentPeriodicTCs() {
		GSSEnvironmentPeriodicTCsImpl gssEnvironmentPeriodicTCs = new GSSEnvironmentPeriodicTCsImpl();
		return gssEnvironmentPeriodicTCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriodicTC createGSSEnvironmentPeriodicTC() {
		GSSEnvironmentPeriodicTCImpl gssEnvironmentPeriodicTC = new GSSEnvironmentPeriodicTCImpl();
		return gssEnvironmentPeriodicTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriodicTCLevel2 createGSSEnvironmentPeriodicTCLevel2() {
		GSSEnvironmentPeriodicTCLevel2Impl gssEnvironmentPeriodicTCLevel2 = new GSSEnvironmentPeriodicTCLevel2Impl();
		return gssEnvironmentPeriodicTCLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriodicTCLevel1 createGSSEnvironmentPeriodicTCLevel1() {
		GSSEnvironmentPeriodicTCLevel1Impl gssEnvironmentPeriodicTCLevel1 = new GSSEnvironmentPeriodicTCLevel1Impl();
		return gssEnvironmentPeriodicTCLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPeriodicTCLevel0 createGSSEnvironmentPeriodicTCLevel0() {
		GSSEnvironmentPeriodicTCLevel0Impl gssEnvironmentPeriodicTCLevel0 = new GSSEnvironmentPeriodicTCLevel0Impl();
		return gssEnvironmentPeriodicTCLevel0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGlobalVars createGSSEnvironmentGlobalVars() {
		GSSEnvironmentGlobalVarsImpl gssEnvironmentGlobalVars = new GSSEnvironmentGlobalVarsImpl();
		return gssEnvironmentGlobalVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGlobalVar createGSSEnvironmentGlobalVar() {
		GSSEnvironmentGlobalVarImpl gssEnvironmentGlobalVar = new GSSEnvironmentGlobalVarImpl();
		return gssEnvironmentGlobalVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentReferenceField createGSSEnvironmentReferenceField() {
		GSSEnvironmentReferenceFieldImpl gssEnvironmentReferenceField = new GSSEnvironmentReferenceFieldImpl();
		return gssEnvironmentReferenceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentReferencePeriodicTC createGSSEnvironmentReferencePeriodicTC() {
		GSSEnvironmentReferencePeriodicTCImpl gssEnvironmentReferencePeriodicTC = new GSSEnvironmentReferencePeriodicTCImpl();
		return gssEnvironmentReferencePeriodicTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentReferenceSpecialPacket createGSSEnvironmentReferenceSpecialPacket() {
		GSSEnvironmentReferenceSpecialPacketImpl gssEnvironmentReferenceSpecialPacket = new GSSEnvironmentReferenceSpecialPacketImpl();
		return gssEnvironmentReferenceSpecialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentMonitors createGSSEnvironmentMonitors() {
		GSSEnvironmentMonitorsImpl gssEnvironmentMonitors = new GSSEnvironmentMonitorsImpl();
		return gssEnvironmentMonitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentPlot createGSSEnvironmentPlot() {
		GSSEnvironmentPlotImpl gssEnvironmentPlot = new GSSEnvironmentPlotImpl();
		return gssEnvironmentPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentAlarmMsg createGSSEnvironmentAlarmMsg() {
		GSSEnvironmentAlarmMsgImpl gssEnvironmentAlarmMsg = new GSSEnvironmentAlarmMsgImpl();
		return gssEnvironmentAlarmMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentModify createGSSEnvironmentModify() {
		GSSEnvironmentModifyImpl gssEnvironmentModify = new GSSEnvironmentModifyImpl();
		return gssEnvironmentModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentAlarmVal createGSSEnvironmentAlarmVal() {
		GSSEnvironmentAlarmValImpl gssEnvironmentAlarmVal = new GSSEnvironmentAlarmValImpl();
		return gssEnvironmentAlarmVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGVFiltered createGSSEnvironmentGVFiltered() {
		GSSEnvironmentGVFilteredImpl gssEnvironmentGVFiltered = new GSSEnvironmentGVFilteredImpl();
		return gssEnvironmentGVFiltered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGVPeriodic createGSSEnvironmentGVPeriodic() {
		GSSEnvironmentGVPeriodicImpl gssEnvironmentGVPeriodic = new GSSEnvironmentGVPeriodicImpl();
		return gssEnvironmentGVPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentEnableDisable createGSSEnvironmentEnableDisableFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentEnableDisable result = GSSEnvironmentEnableDisable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentEnableDisableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInterfaceType createGSSEnvironmentInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentInterfaceType result = GSSEnvironmentInterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentInterfaceIOType createGSSEnvironmentInterfaceIOTypeFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentInterfaceIOType result = GSSEnvironmentInterfaceIOType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentInterfaceIOTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentUpperLevelLevel createGSSEnvironmentUpperLevelLevelFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentUpperLevelLevel result = GSSEnvironmentUpperLevelLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentUpperLevelLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentUnit createGSSEnvironmentUnitFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentUnit result = GSSEnvironmentUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentGlobalVarType createGSSEnvironmentGlobalVarTypeFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentGlobalVarType result = GSSEnvironmentGlobalVarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentGlobalVarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentReferenceFieldType createGSSEnvironmentReferenceFieldTypeFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentReferenceFieldType result = GSSEnvironmentReferenceFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentReferenceFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentAlarmMsgType createGSSEnvironmentAlarmMsgTypeFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentAlarmMsgType result = GSSEnvironmentAlarmMsgType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentAlarmMsgTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentModifyType createGSSEnvironmentModifyTypeFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentModifyType result = GSSEnvironmentModifyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentModifyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSEnvironmentAlarmValType createGSSEnvironmentAlarmValTypeFromString(EDataType eDataType, String initialValue) {
		GSSEnvironmentAlarmValType result = GSSEnvironmentAlarmValType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSEnvironmentAlarmValTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environmentPackage getenvironmentPackage() {
		return (environmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static environmentPackage getPackage() {
		return environmentPackage.eINSTANCE;
	}

} //environmentFactoryImpl
