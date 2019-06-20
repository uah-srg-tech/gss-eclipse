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

import es.uah.aut.srg.gss.config.*;

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
public class configFactoryImpl extends EFactoryImpl implements configFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static configFactory init() {
		try {
			configFactory theconfigFactory = (configFactory)EPackage.Registry.INSTANCE.getEFactory(configPackage.eNS_URI);
			if (theconfigFactory != null) {
				return theconfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new configFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configFactoryImpl() {
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
			case configPackage.GSS_CONFIG_GSS_CONFIG: return createGSSConfigGSSConfig();
			case configPackage.GSS_CONFIG_GSS_OPTIONS: return createGSSConfigGSSOptions();
			case configPackage.GSS_CONFIG_GSS_INFO: return createGSSConfigGSSInfo();
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT: return createGSSConfigGSSInfoPrint();
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT: return createGSSConfigPhyHeaderPrint();
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS: return createGSSConfigGSSDiscardErrorFlags();
			case configPackage.GSS_CONFIG_PROTOCOLS: return createGSSConfigProtocols();
			case configPackage.GSS_CONFIG_PROTOCOL: return createGSSConfigProtocol();
			case configPackage.GSS_CONFIG_INTERFACES: return createGSSConfigInterfaces();
			case configPackage.GSS_CONFIG_MAIN_INTERFACE: return createGSSConfigMainInterface();
			case configPackage.GSS_CONFIG_INTERFACE: return createGSSConfigInterface();
			case configPackage.GSS_CONFIG_LEVEL_IN_OUT: return createGSSConfigLevelInOut();
			case configPackage.GSS_CONFIG_LEVEL_IN: return createGSSConfigLevelIn();
			case configPackage.GSS_CONFIG_LEVEL_OUT: return createGSSConfigLevelOut();
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS: return createGSSConfigSpecialPackets();
			case configPackage.GSS_CONFIG_SPECIAL_PACKET: return createGSSConfigSpecialPacket();
			case configPackage.GSS_CONFIG_UPPER_LEVELS: return createGSSConfigUpperLevels();
			case configPackage.GSS_CONFIG_UPPER_LEVEL: return createGSSConfigUpperLevel();
			case configPackage.GSS_CONFIG_PRINTING_DATA: return createGSSConfigPrintingData();
			case configPackage.GSS_CONFIG_STRUCTURED_DATA: return createGSSConfigStructuredData();
			case configPackage.GSS_CONFIG_PERIOD: return createGSSConfigPeriod();
			case configPackage.GSS_CONFIG_INTERVAL_RANGE: return createGSSConfigIntervalRange();
			case configPackage.GSS_CONFIG_PERIODIC_TCS: return createGSSConfigPeriodicTCs();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2: return createGSSConfigPeriodicTCLevel2();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1: return createGSSConfigPeriodicTCLevel1();
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0: return createGSSConfigPeriodicTCLevel0();
			case configPackage.GSS_CONFIG_GLOBAL_VARS: return createGSSConfigGlobalVars();
			case configPackage.GSS_CONFIG_GLOBAL_VAR: return createGSSConfigGlobalVar();
			case configPackage.GSS_CONFIG_REFERENCE_FIELD: return createGSSConfigReferenceField();
			case configPackage.GSS_CONFIG_REFERENCE_PERIODIC_TC: return createGSSConfigReferencePeriodicTC();
			case configPackage.GSS_CONFIG_REFERENCE_SPECIAL_PACKET: return createGSSConfigReferenceSpecialPacket();
			case configPackage.GSS_CONFIG_MONITORS: return createGSSConfigMonitors();
			case configPackage.GSS_CONFIG_PLOT: return createGSSConfigPlot();
			case configPackage.GSS_CONFIG_ALARM_MSG: return createGSSConfigAlarmMsg();
			case configPackage.GSS_CONFIG_MODIFY: return createGSSConfigModify();
			case configPackage.GSS_CONFIG_ALARM_VAL: return createGSSConfigAlarmVal();
			case configPackage.GSS_CONFIG_GV_FILTERED: return createGSSConfigGVFiltered();
			case configPackage.GSS_CONFIG_GV_PERIODIC: return createGSSConfigGVPeriodic();
			case configPackage.GSS_CONFIG_TESTS: return createGSSConfigTests();
			case configPackage.GSS_CONFIG_TEST_CASE: return createGSSConfigTestCase();
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
			case configPackage.GSS_CONFIG_ENABLE_DISABLE:
				return createGSSConfigEnableDisableFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE_TYPE:
				return createGSSConfigMainInterfaceTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE_IO_TYPE:
				return createGSSConfigMainInterfaceIOTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_INTERFACE_TYPE:
				return createGSSConfigInterfaceTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_INTERFACE_IO_TYPE:
				return createGSSConfigInterfaceIOTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_UPPER_LEVEL_LEVEL:
				return createGSSConfigUpperLevelLevelFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_UNIT:
				return createGSSConfigUnitFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_GLOBAL_VAR_TYPE:
				return createGSSConfigGlobalVarTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_REFERENCE_FIELD_TYPE:
				return createGSSConfigReferenceFieldTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_ALARM_MSG_TYPE:
				return createGSSConfigAlarmMsgTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_MODIFY_TYPE:
				return createGSSConfigModifyTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_ALARM_VAL_TYPE:
				return createGSSConfigAlarmValTypeFromString(eDataType, initialValue);
			case configPackage.GSS_CONFIG_REQ_ACTION:
				return createGSSConfigReqActionFromString(eDataType, initialValue);
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
			case configPackage.GSS_CONFIG_ENABLE_DISABLE:
				return convertGSSConfigEnableDisableToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE_TYPE:
				return convertGSSConfigMainInterfaceTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_MAIN_INTERFACE_IO_TYPE:
				return convertGSSConfigMainInterfaceIOTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_INTERFACE_TYPE:
				return convertGSSConfigInterfaceTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_INTERFACE_IO_TYPE:
				return convertGSSConfigInterfaceIOTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_UPPER_LEVEL_LEVEL:
				return convertGSSConfigUpperLevelLevelToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_UNIT:
				return convertGSSConfigUnitToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_GLOBAL_VAR_TYPE:
				return convertGSSConfigGlobalVarTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_REFERENCE_FIELD_TYPE:
				return convertGSSConfigReferenceFieldTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_ALARM_MSG_TYPE:
				return convertGSSConfigAlarmMsgTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_MODIFY_TYPE:
				return convertGSSConfigModifyTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_ALARM_VAL_TYPE:
				return convertGSSConfigAlarmValTypeToString(eDataType, instanceValue);
			case configPackage.GSS_CONFIG_REQ_ACTION:
				return convertGSSConfigReqActionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSConfig createGSSConfigGSSConfig() {
		GSSConfigGSSConfigImpl gssConfigGSSConfig = new GSSConfigGSSConfigImpl();
		return gssConfigGSSConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSOptions createGSSConfigGSSOptions() {
		GSSConfigGSSOptionsImpl gssConfigGSSOptions = new GSSConfigGSSOptionsImpl();
		return gssConfigGSSOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSInfo createGSSConfigGSSInfo() {
		GSSConfigGSSInfoImpl gssConfigGSSInfo = new GSSConfigGSSInfoImpl();
		return gssConfigGSSInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSInfoPrint createGSSConfigGSSInfoPrint() {
		GSSConfigGSSInfoPrintImpl gssConfigGSSInfoPrint = new GSSConfigGSSInfoPrintImpl();
		return gssConfigGSSInfoPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPhyHeaderPrint createGSSConfigPhyHeaderPrint() {
		GSSConfigPhyHeaderPrintImpl gssConfigPhyHeaderPrint = new GSSConfigPhyHeaderPrintImpl();
		return gssConfigPhyHeaderPrint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGSSDiscardErrorFlags createGSSConfigGSSDiscardErrorFlags() {
		GSSConfigGSSDiscardErrorFlagsImpl gssConfigGSSDiscardErrorFlags = new GSSConfigGSSDiscardErrorFlagsImpl();
		return gssConfigGSSDiscardErrorFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigProtocols createGSSConfigProtocols() {
		GSSConfigProtocolsImpl gssConfigProtocols = new GSSConfigProtocolsImpl();
		return gssConfigProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigProtocol createGSSConfigProtocol() {
		GSSConfigProtocolImpl gssConfigProtocol = new GSSConfigProtocolImpl();
		return gssConfigProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInterfaces createGSSConfigInterfaces() {
		GSSConfigInterfacesImpl gssConfigInterfaces = new GSSConfigInterfacesImpl();
		return gssConfigInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMainInterface createGSSConfigMainInterface() {
		GSSConfigMainInterfaceImpl gssConfigMainInterface = new GSSConfigMainInterfaceImpl();
		return gssConfigMainInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInterface createGSSConfigInterface() {
		GSSConfigInterfaceImpl gssConfigInterface = new GSSConfigInterfaceImpl();
		return gssConfigInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigLevelInOut createGSSConfigLevelInOut() {
		GSSConfigLevelInOutImpl gssConfigLevelInOut = new GSSConfigLevelInOutImpl();
		return gssConfigLevelInOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigLevelIn createGSSConfigLevelIn() {
		GSSConfigLevelInImpl gssConfigLevelIn = new GSSConfigLevelInImpl();
		return gssConfigLevelIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigLevelOut createGSSConfigLevelOut() {
		GSSConfigLevelOutImpl gssConfigLevelOut = new GSSConfigLevelOutImpl();
		return gssConfigLevelOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigSpecialPackets createGSSConfigSpecialPackets() {
		GSSConfigSpecialPacketsImpl gssConfigSpecialPackets = new GSSConfigSpecialPacketsImpl();
		return gssConfigSpecialPackets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigSpecialPacket createGSSConfigSpecialPacket() {
		GSSConfigSpecialPacketImpl gssConfigSpecialPacket = new GSSConfigSpecialPacketImpl();
		return gssConfigSpecialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigUpperLevels createGSSConfigUpperLevels() {
		GSSConfigUpperLevelsImpl gssConfigUpperLevels = new GSSConfigUpperLevelsImpl();
		return gssConfigUpperLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigUpperLevel createGSSConfigUpperLevel() {
		GSSConfigUpperLevelImpl gssConfigUpperLevel = new GSSConfigUpperLevelImpl();
		return gssConfigUpperLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPrintingData createGSSConfigPrintingData() {
		GSSConfigPrintingDataImpl gssConfigPrintingData = new GSSConfigPrintingDataImpl();
		return gssConfigPrintingData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigStructuredData createGSSConfigStructuredData() {
		GSSConfigStructuredDataImpl gssConfigStructuredData = new GSSConfigStructuredDataImpl();
		return gssConfigStructuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPeriod createGSSConfigPeriod() {
		GSSConfigPeriodImpl gssConfigPeriod = new GSSConfigPeriodImpl();
		return gssConfigPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigIntervalRange createGSSConfigIntervalRange() {
		GSSConfigIntervalRangeImpl gssConfigIntervalRange = new GSSConfigIntervalRangeImpl();
		return gssConfigIntervalRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPeriodicTCs createGSSConfigPeriodicTCs() {
		GSSConfigPeriodicTCsImpl gssConfigPeriodicTCs = new GSSConfigPeriodicTCsImpl();
		return gssConfigPeriodicTCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPeriodicTCLevel2 createGSSConfigPeriodicTCLevel2() {
		GSSConfigPeriodicTCLevel2Impl gssConfigPeriodicTCLevel2 = new GSSConfigPeriodicTCLevel2Impl();
		return gssConfigPeriodicTCLevel2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPeriodicTCLevel1 createGSSConfigPeriodicTCLevel1() {
		GSSConfigPeriodicTCLevel1Impl gssConfigPeriodicTCLevel1 = new GSSConfigPeriodicTCLevel1Impl();
		return gssConfigPeriodicTCLevel1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPeriodicTCLevel0 createGSSConfigPeriodicTCLevel0() {
		GSSConfigPeriodicTCLevel0Impl gssConfigPeriodicTCLevel0 = new GSSConfigPeriodicTCLevel0Impl();
		return gssConfigPeriodicTCLevel0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGlobalVars createGSSConfigGlobalVars() {
		GSSConfigGlobalVarsImpl gssConfigGlobalVars = new GSSConfigGlobalVarsImpl();
		return gssConfigGlobalVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGlobalVar createGSSConfigGlobalVar() {
		GSSConfigGlobalVarImpl gssConfigGlobalVar = new GSSConfigGlobalVarImpl();
		return gssConfigGlobalVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigReferenceField createGSSConfigReferenceField() {
		GSSConfigReferenceFieldImpl gssConfigReferenceField = new GSSConfigReferenceFieldImpl();
		return gssConfigReferenceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigReferencePeriodicTC createGSSConfigReferencePeriodicTC() {
		GSSConfigReferencePeriodicTCImpl gssConfigReferencePeriodicTC = new GSSConfigReferencePeriodicTCImpl();
		return gssConfigReferencePeriodicTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigReferenceSpecialPacket createGSSConfigReferenceSpecialPacket() {
		GSSConfigReferenceSpecialPacketImpl gssConfigReferenceSpecialPacket = new GSSConfigReferenceSpecialPacketImpl();
		return gssConfigReferenceSpecialPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMonitors createGSSConfigMonitors() {
		GSSConfigMonitorsImpl gssConfigMonitors = new GSSConfigMonitorsImpl();
		return gssConfigMonitors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigPlot createGSSConfigPlot() {
		GSSConfigPlotImpl gssConfigPlot = new GSSConfigPlotImpl();
		return gssConfigPlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigAlarmMsg createGSSConfigAlarmMsg() {
		GSSConfigAlarmMsgImpl gssConfigAlarmMsg = new GSSConfigAlarmMsgImpl();
		return gssConfigAlarmMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigModify createGSSConfigModify() {
		GSSConfigModifyImpl gssConfigModify = new GSSConfigModifyImpl();
		return gssConfigModify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigAlarmVal createGSSConfigAlarmVal() {
		GSSConfigAlarmValImpl gssConfigAlarmVal = new GSSConfigAlarmValImpl();
		return gssConfigAlarmVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGVFiltered createGSSConfigGVFiltered() {
		GSSConfigGVFilteredImpl gssConfigGVFiltered = new GSSConfigGVFilteredImpl();
		return gssConfigGVFiltered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGVPeriodic createGSSConfigGVPeriodic() {
		GSSConfigGVPeriodicImpl gssConfigGVPeriodic = new GSSConfigGVPeriodicImpl();
		return gssConfigGVPeriodic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigTests createGSSConfigTests() {
		GSSConfigTestsImpl gssConfigTests = new GSSConfigTestsImpl();
		return gssConfigTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigTestCase createGSSConfigTestCase() {
		GSSConfigTestCaseImpl gssConfigTestCase = new GSSConfigTestCaseImpl();
		return gssConfigTestCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigEnableDisable createGSSConfigEnableDisableFromString(EDataType eDataType, String initialValue) {
		GSSConfigEnableDisable result = GSSConfigEnableDisable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigEnableDisableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMainInterfaceType createGSSConfigMainInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigMainInterfaceType result = GSSConfigMainInterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigMainInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigMainInterfaceIOType createGSSConfigMainInterfaceIOTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigMainInterfaceIOType result = GSSConfigMainInterfaceIOType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigMainInterfaceIOTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInterfaceType createGSSConfigInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigInterfaceType result = GSSConfigInterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigInterfaceIOType createGSSConfigInterfaceIOTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigInterfaceIOType result = GSSConfigInterfaceIOType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigInterfaceIOTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigUpperLevelLevel createGSSConfigUpperLevelLevelFromString(EDataType eDataType, String initialValue) {
		GSSConfigUpperLevelLevel result = GSSConfigUpperLevelLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigUpperLevelLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigUnit createGSSConfigUnitFromString(EDataType eDataType, String initialValue) {
		GSSConfigUnit result = GSSConfigUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigGlobalVarType createGSSConfigGlobalVarTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigGlobalVarType result = GSSConfigGlobalVarType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigGlobalVarTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigReferenceFieldType createGSSConfigReferenceFieldTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigReferenceFieldType result = GSSConfigReferenceFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigReferenceFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigAlarmMsgType createGSSConfigAlarmMsgTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigAlarmMsgType result = GSSConfigAlarmMsgType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigAlarmMsgTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigModifyType createGSSConfigModifyTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigModifyType result = GSSConfigModifyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigModifyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigAlarmValType createGSSConfigAlarmValTypeFromString(EDataType eDataType, String initialValue) {
		GSSConfigAlarmValType result = GSSConfigAlarmValType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigAlarmValTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSConfigReqAction createGSSConfigReqActionFromString(EDataType eDataType, String initialValue) {
		GSSConfigReqAction result = GSSConfigReqAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSConfigReqActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configPackage getconfigPackage() {
		return (configPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static configPackage getPackage() {
		return configPackage.eINSTANCE;
	}

} //configFactoryImpl
