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

import es.uah.aut.srg.gss.scenario.*;

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
public class scenarioFactoryImpl extends EFactoryImpl implements scenarioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static scenarioFactory init() {
		try {
			scenarioFactory thescenarioFactory = (scenarioFactory)EPackage.Registry.INSTANCE.getEFactory(scenarioPackage.eNS_URI);
			if (thescenarioFactory != null) {
				return thescenarioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new scenarioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenarioFactoryImpl() {
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
			case scenarioPackage.GSS_SCENARIO_SCENARIO: return createGSSScenarioScenario();
			case scenarioPackage.GSS_SCENARIO_OPTIONS: return createGSSScenarioOptions();
			case scenarioPackage.GSS_SCENARIO_INFO: return createGSSScenarioInfo();
			case scenarioPackage.GSS_SCENARIO_INFO_PRINT: return createGSSScenarioInfoPrint();
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT: return createGSSScenarioPhyHeaderPrint();
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS: return createGSSScenarioDiscardErrorFlags();
			case scenarioPackage.GSS_SCENARIO_PROTOCOLS: return createGSSScenarioProtocols();
			case scenarioPackage.GSS_SCENARIO_PROTOCOL: return createGSSScenarioProtocol();
			case scenarioPackage.GSS_SCENARIO_PROTOCOL_TYPE: return createGSSScenarioProtocolType();
			case scenarioPackage.GSS_SCENARIO_INTERFACES: return createGSSScenarioInterfaces();
			case scenarioPackage.GSS_SCENARIO_MAIN_INTERFACE: return createGSSScenarioMainInterface();
			case scenarioPackage.GSS_SCENARIO_INTERFACE: return createGSSScenarioInterface();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT: return createGSSScenarioLevelInOut();
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN: return createGSSScenarioLevelIn();
			case scenarioPackage.GSS_SCENARIO_LEVEL_OUT: return createGSSScenarioLevelOut();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKETS: return createGSSScenarioSpecialPackets();
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET: return createGSSScenarioSpecialPacket();
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVELS: return createGSSScenarioUpperLevels();
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL: return createGSSScenarioUpperLevel();
			case scenarioPackage.GSS_SCENARIO_PRINTING_DATA: return createGSSScenarioPrintingData();
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA: return createGSSScenarioStructuredData();
			case scenarioPackage.GSS_SCENARIO_PERIOD: return createGSSScenarioPeriod();
			case scenarioPackage.GSS_SCENARIO_INTERVAL_RANGE: return createGSSScenarioIntervalRange();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS: return createGSSScenarioPeriodicTCs();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2: return createGSSScenarioPeriodicTCLevel2();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL1: return createGSSScenarioPeriodicTCLevel1();
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL0: return createGSSScenarioPeriodicTCLevel0();
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VARS: return createGSSScenarioGlobalVars();
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VAR: return createGSSScenarioGlobalVar();
			case scenarioPackage.GSS_SCENARIO_REFERENCE_FIELD: return createGSSScenarioReferenceField();
			case scenarioPackage.GSS_SCENARIO_REFERENCE_PERIODIC_TC: return createGSSScenarioReferencePeriodicTC();
			case scenarioPackage.GSS_SCENARIO_REFERENCE_SPECIAL_PACKET: return createGSSScenarioReferenceSpecialPacket();
			case scenarioPackage.GSS_SCENARIO_MONITORS: return createGSSScenarioMonitors();
			case scenarioPackage.GSS_SCENARIO_PLOT: return createGSSScenarioPlot();
			case scenarioPackage.GSS_SCENARIO_ALARM_MSG: return createGSSScenarioAlarmMsg();
			case scenarioPackage.GSS_SCENARIO_MODIFY: return createGSSScenarioModify();
			case scenarioPackage.GSS_SCENARIO_ALARM_VAL: return createGSSScenarioAlarmVal();
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED: return createGSSScenarioGVFiltered();
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC: return createGSSScenarioGVPeriodic();
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
			case scenarioPackage.GSS_SCENARIO_ENABLE_DISABLE:
				return createGSSScenarioEnableDisableFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_INTERFACE_TYPE:
				return createGSSScenarioInterfaceTypeFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_INTERFACE_IO_TYPE:
				return createGSSScenarioInterfaceIOTypeFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL_LEVEL:
				return createGSSScenarioUpperLevelLevelFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_UNIT:
				return createGSSScenarioUnitFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VAR_TYPE:
				return createGSSScenarioGlobalVarTypeFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_REFERENCE_FIELD_TYPE:
				return createGSSScenarioReferenceFieldTypeFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_ALARM_MSG_TYPE:
				return createGSSScenarioAlarmMsgTypeFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_MODIFY_TYPE:
				return createGSSScenarioModifyTypeFromString(eDataType, initialValue);
			case scenarioPackage.GSS_SCENARIO_ALARM_VAL_TYPE:
				return createGSSScenarioAlarmValTypeFromString(eDataType, initialValue);
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
			case scenarioPackage.GSS_SCENARIO_ENABLE_DISABLE:
				return convertGSSScenarioEnableDisableToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_INTERFACE_TYPE:
				return convertGSSScenarioInterfaceTypeToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_INTERFACE_IO_TYPE:
				return convertGSSScenarioInterfaceIOTypeToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL_LEVEL:
				return convertGSSScenarioUpperLevelLevelToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_UNIT:
				return convertGSSScenarioUnitToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VAR_TYPE:
				return convertGSSScenarioGlobalVarTypeToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_REFERENCE_FIELD_TYPE:
				return convertGSSScenarioReferenceFieldTypeToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_ALARM_MSG_TYPE:
				return convertGSSScenarioAlarmMsgTypeToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_MODIFY_TYPE:
				return convertGSSScenarioModifyTypeToString(eDataType, instanceValue);
			case scenarioPackage.GSS_SCENARIO_ALARM_VAL_TYPE:
				return convertGSSScenarioAlarmValTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioScenario createGSSScenarioScenario() {
		GSSScenarioScenarioImpl gssScenarioScenario = new GSSScenarioScenarioImpl();
		return gssScenarioScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioOptions createGSSScenarioOptions() {
		GSSScenarioOptionsImpl gssScenarioOptions = new GSSScenarioOptionsImpl();
		return gssScenarioOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInfo createGSSScenarioInfo() {
		GSSScenarioInfoImpl gssScenarioInfo = new GSSScenarioInfoImpl();
		return gssScenarioInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInfoPrint createGSSScenarioInfoPrint() {
		GSSScenarioInfoPrintImpl gssScenarioInfoPrint = new GSSScenarioInfoPrintImpl();
		return gssScenarioInfoPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPhyHeaderPrint createGSSScenarioPhyHeaderPrint() {
		GSSScenarioPhyHeaderPrintImpl gssScenarioPhyHeaderPrint = new GSSScenarioPhyHeaderPrintImpl();
		return gssScenarioPhyHeaderPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioDiscardErrorFlags createGSSScenarioDiscardErrorFlags() {
		GSSScenarioDiscardErrorFlagsImpl gssScenarioDiscardErrorFlags = new GSSScenarioDiscardErrorFlagsImpl();
		return gssScenarioDiscardErrorFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioProtocols createGSSScenarioProtocols() {
		GSSScenarioProtocolsImpl gssScenarioProtocols = new GSSScenarioProtocolsImpl();
		return gssScenarioProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioProtocol createGSSScenarioProtocol() {
		GSSScenarioProtocolImpl gssScenarioProtocol = new GSSScenarioProtocolImpl();
		return gssScenarioProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioProtocolType createGSSScenarioProtocolType() {
		GSSScenarioProtocolTypeImpl gssScenarioProtocolType = new GSSScenarioProtocolTypeImpl();
		return gssScenarioProtocolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterfaces createGSSScenarioInterfaces() {
		GSSScenarioInterfacesImpl gssScenarioInterfaces = new GSSScenarioInterfacesImpl();
		return gssScenarioInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioMainInterface createGSSScenarioMainInterface() {
		GSSScenarioMainInterfaceImpl gssScenarioMainInterface = new GSSScenarioMainInterfaceImpl();
		return gssScenarioMainInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterface createGSSScenarioInterface() {
		GSSScenarioInterfaceImpl gssScenarioInterface = new GSSScenarioInterfaceImpl();
		return gssScenarioInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioLevelInOut createGSSScenarioLevelInOut() {
		GSSScenarioLevelInOutImpl gssScenarioLevelInOut = new GSSScenarioLevelInOutImpl();
		return gssScenarioLevelInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioLevelIn createGSSScenarioLevelIn() {
		GSSScenarioLevelInImpl gssScenarioLevelIn = new GSSScenarioLevelInImpl();
		return gssScenarioLevelIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioLevelOut createGSSScenarioLevelOut() {
		GSSScenarioLevelOutImpl gssScenarioLevelOut = new GSSScenarioLevelOutImpl();
		return gssScenarioLevelOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioSpecialPackets createGSSScenarioSpecialPackets() {
		GSSScenarioSpecialPacketsImpl gssScenarioSpecialPackets = new GSSScenarioSpecialPacketsImpl();
		return gssScenarioSpecialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioSpecialPacket createGSSScenarioSpecialPacket() {
		GSSScenarioSpecialPacketImpl gssScenarioSpecialPacket = new GSSScenarioSpecialPacketImpl();
		return gssScenarioSpecialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUpperLevels createGSSScenarioUpperLevels() {
		GSSScenarioUpperLevelsImpl gssScenarioUpperLevels = new GSSScenarioUpperLevelsImpl();
		return gssScenarioUpperLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUpperLevel createGSSScenarioUpperLevel() {
		GSSScenarioUpperLevelImpl gssScenarioUpperLevel = new GSSScenarioUpperLevelImpl();
		return gssScenarioUpperLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPrintingData createGSSScenarioPrintingData() {
		GSSScenarioPrintingDataImpl gssScenarioPrintingData = new GSSScenarioPrintingDataImpl();
		return gssScenarioPrintingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioStructuredData createGSSScenarioStructuredData() {
		GSSScenarioStructuredDataImpl gssScenarioStructuredData = new GSSScenarioStructuredDataImpl();
		return gssScenarioStructuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPeriod createGSSScenarioPeriod() {
		GSSScenarioPeriodImpl gssScenarioPeriod = new GSSScenarioPeriodImpl();
		return gssScenarioPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioIntervalRange createGSSScenarioIntervalRange() {
		GSSScenarioIntervalRangeImpl gssScenarioIntervalRange = new GSSScenarioIntervalRangeImpl();
		return gssScenarioIntervalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPeriodicTCs createGSSScenarioPeriodicTCs() {
		GSSScenarioPeriodicTCsImpl gssScenarioPeriodicTCs = new GSSScenarioPeriodicTCsImpl();
		return gssScenarioPeriodicTCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPeriodicTCLevel2 createGSSScenarioPeriodicTCLevel2() {
		GSSScenarioPeriodicTCLevel2Impl gssScenarioPeriodicTCLevel2 = new GSSScenarioPeriodicTCLevel2Impl();
		return gssScenarioPeriodicTCLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPeriodicTCLevel1 createGSSScenarioPeriodicTCLevel1() {
		GSSScenarioPeriodicTCLevel1Impl gssScenarioPeriodicTCLevel1 = new GSSScenarioPeriodicTCLevel1Impl();
		return gssScenarioPeriodicTCLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPeriodicTCLevel0 createGSSScenarioPeriodicTCLevel0() {
		GSSScenarioPeriodicTCLevel0Impl gssScenarioPeriodicTCLevel0 = new GSSScenarioPeriodicTCLevel0Impl();
		return gssScenarioPeriodicTCLevel0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGlobalVars createGSSScenarioGlobalVars() {
		GSSScenarioGlobalVarsImpl gssScenarioGlobalVars = new GSSScenarioGlobalVarsImpl();
		return gssScenarioGlobalVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGlobalVar createGSSScenarioGlobalVar() {
		GSSScenarioGlobalVarImpl gssScenarioGlobalVar = new GSSScenarioGlobalVarImpl();
		return gssScenarioGlobalVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioReferenceField createGSSScenarioReferenceField() {
		GSSScenarioReferenceFieldImpl gssScenarioReferenceField = new GSSScenarioReferenceFieldImpl();
		return gssScenarioReferenceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioReferencePeriodicTC createGSSScenarioReferencePeriodicTC() {
		GSSScenarioReferencePeriodicTCImpl gssScenarioReferencePeriodicTC = new GSSScenarioReferencePeriodicTCImpl();
		return gssScenarioReferencePeriodicTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioReferenceSpecialPacket createGSSScenarioReferenceSpecialPacket() {
		GSSScenarioReferenceSpecialPacketImpl gssScenarioReferenceSpecialPacket = new GSSScenarioReferenceSpecialPacketImpl();
		return gssScenarioReferenceSpecialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioMonitors createGSSScenarioMonitors() {
		GSSScenarioMonitorsImpl gssScenarioMonitors = new GSSScenarioMonitorsImpl();
		return gssScenarioMonitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioPlot createGSSScenarioPlot() {
		GSSScenarioPlotImpl gssScenarioPlot = new GSSScenarioPlotImpl();
		return gssScenarioPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioAlarmMsg createGSSScenarioAlarmMsg() {
		GSSScenarioAlarmMsgImpl gssScenarioAlarmMsg = new GSSScenarioAlarmMsgImpl();
		return gssScenarioAlarmMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioModify createGSSScenarioModify() {
		GSSScenarioModifyImpl gssScenarioModify = new GSSScenarioModifyImpl();
		return gssScenarioModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioAlarmVal createGSSScenarioAlarmVal() {
		GSSScenarioAlarmValImpl gssScenarioAlarmVal = new GSSScenarioAlarmValImpl();
		return gssScenarioAlarmVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGVFiltered createGSSScenarioGVFiltered() {
		GSSScenarioGVFilteredImpl gssScenarioGVFiltered = new GSSScenarioGVFilteredImpl();
		return gssScenarioGVFiltered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGVPeriodic createGSSScenarioGVPeriodic() {
		GSSScenarioGVPeriodicImpl gssScenarioGVPeriodic = new GSSScenarioGVPeriodicImpl();
		return gssScenarioGVPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioEnableDisable createGSSScenarioEnableDisableFromString(EDataType eDataType, String initialValue) {
		GSSScenarioEnableDisable result = GSSScenarioEnableDisable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioEnableDisableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterfaceType createGSSScenarioInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		GSSScenarioInterfaceType result = GSSScenarioInterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioInterfaceIOType createGSSScenarioInterfaceIOTypeFromString(EDataType eDataType, String initialValue) {
		GSSScenarioInterfaceIOType result = GSSScenarioInterfaceIOType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioInterfaceIOTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUpperLevelLevel createGSSScenarioUpperLevelLevelFromString(EDataType eDataType, String initialValue) {
		GSSScenarioUpperLevelLevel result = GSSScenarioUpperLevelLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioUpperLevelLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioUnit createGSSScenarioUnitFromString(EDataType eDataType, String initialValue) {
		GSSScenarioUnit result = GSSScenarioUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioGlobalVarType createGSSScenarioGlobalVarTypeFromString(EDataType eDataType, String initialValue) {
		GSSScenarioGlobalVarType result = GSSScenarioGlobalVarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioGlobalVarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioReferenceFieldType createGSSScenarioReferenceFieldTypeFromString(EDataType eDataType, String initialValue) {
		GSSScenarioReferenceFieldType result = GSSScenarioReferenceFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioReferenceFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioAlarmMsgType createGSSScenarioAlarmMsgTypeFromString(EDataType eDataType, String initialValue) {
		GSSScenarioAlarmMsgType result = GSSScenarioAlarmMsgType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioAlarmMsgTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioModifyType createGSSScenarioModifyTypeFromString(EDataType eDataType, String initialValue) {
		GSSScenarioModifyType result = GSSScenarioModifyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioModifyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSScenarioAlarmValType createGSSScenarioAlarmValTypeFromString(EDataType eDataType, String initialValue) {
		GSSScenarioAlarmValType result = GSSScenarioAlarmValType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSScenarioAlarmValTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenarioPackage getscenarioPackage() {
		return (scenarioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static scenarioPackage getPackage() {
		return scenarioPackage.eINSTANCE;
	}

} //scenarioFactoryImpl
