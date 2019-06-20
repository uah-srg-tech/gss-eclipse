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
package es.uah.aut.srg.gss.config.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.config.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.config.configPackage
 * @generated
 */
public class configSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static configPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public configSwitch() {
		if (modelPackage == null) {
			modelPackage = configPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case configPackage.GSS_CONFIG_GSS_CONFIG: {
				GSSConfigGSSConfig gssConfigGSSConfig = (GSSConfigGSSConfig)theEObject;
				T result = caseGSSConfigGSSConfig(gssConfigGSSConfig);
				if (result == null) result = caseGSSModelElement(gssConfigGSSConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GSS_OPTIONS: {
				GSSConfigGSSOptions gssConfigGSSOptions = (GSSConfigGSSOptions)theEObject;
				T result = caseGSSConfigGSSOptions(gssConfigGSSOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GSS_INFO: {
				GSSConfigGSSInfo gssConfigGSSInfo = (GSSConfigGSSInfo)theEObject;
				T result = caseGSSConfigGSSInfo(gssConfigGSSInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GSS_INFO_PRINT: {
				GSSConfigGSSInfoPrint gssConfigGSSInfoPrint = (GSSConfigGSSInfoPrint)theEObject;
				T result = caseGSSConfigGSSInfoPrint(gssConfigGSSInfoPrint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PHY_HEADER_PRINT: {
				GSSConfigPhyHeaderPrint gssConfigPhyHeaderPrint = (GSSConfigPhyHeaderPrint)theEObject;
				T result = caseGSSConfigPhyHeaderPrint(gssConfigPhyHeaderPrint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GSS_DISCARD_ERROR_FLAGS: {
				GSSConfigGSSDiscardErrorFlags gssConfigGSSDiscardErrorFlags = (GSSConfigGSSDiscardErrorFlags)theEObject;
				T result = caseGSSConfigGSSDiscardErrorFlags(gssConfigGSSDiscardErrorFlags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PROTOCOLS: {
				GSSConfigProtocols gssConfigProtocols = (GSSConfigProtocols)theEObject;
				T result = caseGSSConfigProtocols(gssConfigProtocols);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PROTOCOL: {
				GSSConfigProtocol gssConfigProtocol = (GSSConfigProtocol)theEObject;
				T result = caseGSSConfigProtocol(gssConfigProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_INTERFACES: {
				GSSConfigInterfaces gssConfigInterfaces = (GSSConfigInterfaces)theEObject;
				T result = caseGSSConfigInterfaces(gssConfigInterfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_MAIN_INTERFACE: {
				GSSConfigMainInterface gssConfigMainInterface = (GSSConfigMainInterface)theEObject;
				T result = caseGSSConfigMainInterface(gssConfigMainInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_INTERFACE: {
				GSSConfigInterface gssConfigInterface = (GSSConfigInterface)theEObject;
				T result = caseGSSConfigInterface(gssConfigInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_LEVEL_IN_OUT: {
				GSSConfigLevelInOut gssConfigLevelInOut = (GSSConfigLevelInOut)theEObject;
				T result = caseGSSConfigLevelInOut(gssConfigLevelInOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_LEVEL_IN: {
				GSSConfigLevelIn gssConfigLevelIn = (GSSConfigLevelIn)theEObject;
				T result = caseGSSConfigLevelIn(gssConfigLevelIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_LEVEL_OUT: {
				GSSConfigLevelOut gssConfigLevelOut = (GSSConfigLevelOut)theEObject;
				T result = caseGSSConfigLevelOut(gssConfigLevelOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_SPECIAL_PACKETS: {
				GSSConfigSpecialPackets gssConfigSpecialPackets = (GSSConfigSpecialPackets)theEObject;
				T result = caseGSSConfigSpecialPackets(gssConfigSpecialPackets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_SPECIAL_PACKET: {
				GSSConfigSpecialPacket gssConfigSpecialPacket = (GSSConfigSpecialPacket)theEObject;
				T result = caseGSSConfigSpecialPacket(gssConfigSpecialPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_UPPER_LEVELS: {
				GSSConfigUpperLevels gssConfigUpperLevels = (GSSConfigUpperLevels)theEObject;
				T result = caseGSSConfigUpperLevels(gssConfigUpperLevels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_UPPER_LEVEL: {
				GSSConfigUpperLevel gssConfigUpperLevel = (GSSConfigUpperLevel)theEObject;
				T result = caseGSSConfigUpperLevel(gssConfigUpperLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PRINTING_DATA: {
				GSSConfigPrintingData gssConfigPrintingData = (GSSConfigPrintingData)theEObject;
				T result = caseGSSConfigPrintingData(gssConfigPrintingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_STRUCTURED_DATA: {
				GSSConfigStructuredData gssConfigStructuredData = (GSSConfigStructuredData)theEObject;
				T result = caseGSSConfigStructuredData(gssConfigStructuredData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PERIOD: {
				GSSConfigPeriod gssConfigPeriod = (GSSConfigPeriod)theEObject;
				T result = caseGSSConfigPeriod(gssConfigPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_INTERVAL_RANGE: {
				GSSConfigIntervalRange gssConfigIntervalRange = (GSSConfigIntervalRange)theEObject;
				T result = caseGSSConfigIntervalRange(gssConfigIntervalRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PERIODIC_TCS: {
				GSSConfigPeriodicTCs gssConfigPeriodicTCs = (GSSConfigPeriodicTCs)theEObject;
				T result = caseGSSConfigPeriodicTCs(gssConfigPeriodicTCs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL2: {
				GSSConfigPeriodicTCLevel2 gssConfigPeriodicTCLevel2 = (GSSConfigPeriodicTCLevel2)theEObject;
				T result = caseGSSConfigPeriodicTCLevel2(gssConfigPeriodicTCLevel2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL1: {
				GSSConfigPeriodicTCLevel1 gssConfigPeriodicTCLevel1 = (GSSConfigPeriodicTCLevel1)theEObject;
				T result = caseGSSConfigPeriodicTCLevel1(gssConfigPeriodicTCLevel1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PERIODIC_TC_LEVEL0: {
				GSSConfigPeriodicTCLevel0 gssConfigPeriodicTCLevel0 = (GSSConfigPeriodicTCLevel0)theEObject;
				T result = caseGSSConfigPeriodicTCLevel0(gssConfigPeriodicTCLevel0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GLOBAL_VARS: {
				GSSConfigGlobalVars gssConfigGlobalVars = (GSSConfigGlobalVars)theEObject;
				T result = caseGSSConfigGlobalVars(gssConfigGlobalVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GLOBAL_VAR: {
				GSSConfigGlobalVar gssConfigGlobalVar = (GSSConfigGlobalVar)theEObject;
				T result = caseGSSConfigGlobalVar(gssConfigGlobalVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_REFERENCE_FIELD: {
				GSSConfigReferenceField gssConfigReferenceField = (GSSConfigReferenceField)theEObject;
				T result = caseGSSConfigReferenceField(gssConfigReferenceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_REFERENCE_PERIODIC_TC: {
				GSSConfigReferencePeriodicTC gssConfigReferencePeriodicTC = (GSSConfigReferencePeriodicTC)theEObject;
				T result = caseGSSConfigReferencePeriodicTC(gssConfigReferencePeriodicTC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_REFERENCE_SPECIAL_PACKET: {
				GSSConfigReferenceSpecialPacket gssConfigReferenceSpecialPacket = (GSSConfigReferenceSpecialPacket)theEObject;
				T result = caseGSSConfigReferenceSpecialPacket(gssConfigReferenceSpecialPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_MONITORS: {
				GSSConfigMonitors gssConfigMonitors = (GSSConfigMonitors)theEObject;
				T result = caseGSSConfigMonitors(gssConfigMonitors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_PLOT: {
				GSSConfigPlot gssConfigPlot = (GSSConfigPlot)theEObject;
				T result = caseGSSConfigPlot(gssConfigPlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_ALARM_MSG: {
				GSSConfigAlarmMsg gssConfigAlarmMsg = (GSSConfigAlarmMsg)theEObject;
				T result = caseGSSConfigAlarmMsg(gssConfigAlarmMsg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_MODIFY: {
				GSSConfigModify gssConfigModify = (GSSConfigModify)theEObject;
				T result = caseGSSConfigModify(gssConfigModify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_ALARM_VAL: {
				GSSConfigAlarmVal gssConfigAlarmVal = (GSSConfigAlarmVal)theEObject;
				T result = caseGSSConfigAlarmVal(gssConfigAlarmVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GV_FILTERED: {
				GSSConfigGVFiltered gssConfigGVFiltered = (GSSConfigGVFiltered)theEObject;
				T result = caseGSSConfigGVFiltered(gssConfigGVFiltered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_GV_PERIODIC: {
				GSSConfigGVPeriodic gssConfigGVPeriodic = (GSSConfigGVPeriodic)theEObject;
				T result = caseGSSConfigGVPeriodic(gssConfigGVPeriodic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_TESTS: {
				GSSConfigTests gssConfigTests = (GSSConfigTests)theEObject;
				T result = caseGSSConfigTests(gssConfigTests);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case configPackage.GSS_CONFIG_TEST_CASE: {
				GSSConfigTestCase gssConfigTestCase = (GSSConfigTestCase)theEObject;
				T result = caseGSSConfigTestCase(gssConfigTestCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config GSS Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config GSS Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGSSConfig(GSSConfigGSSConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config GSS Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config GSS Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGSSOptions(GSSConfigGSSOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config GSS Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config GSS Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGSSInfo(GSSConfigGSSInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config GSS Info Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config GSS Info Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGSSInfoPrint(GSSConfigGSSInfoPrint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Phy Header Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Phy Header Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPhyHeaderPrint(GSSConfigPhyHeaderPrint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config GSS Discard Error Flags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config GSS Discard Error Flags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGSSDiscardErrorFlags(GSSConfigGSSDiscardErrorFlags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Protocols</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Protocols</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigProtocols(GSSConfigProtocols object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigProtocol(GSSConfigProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigInterfaces(GSSConfigInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Main Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Main Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigMainInterface(GSSConfigMainInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigInterface(GSSConfigInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Level In Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Level In Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigLevelInOut(GSSConfigLevelInOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Level In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Level In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigLevelIn(GSSConfigLevelIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Level Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Level Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigLevelOut(GSSConfigLevelOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Special Packets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Special Packets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigSpecialPackets(GSSConfigSpecialPackets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Special Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigSpecialPacket(GSSConfigSpecialPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Upper Levels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Upper Levels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigUpperLevels(GSSConfigUpperLevels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Upper Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Upper Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigUpperLevel(GSSConfigUpperLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Printing Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Printing Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPrintingData(GSSConfigPrintingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigStructuredData(GSSConfigStructuredData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPeriod(GSSConfigPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Interval Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Interval Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigIntervalRange(GSSConfigIntervalRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Periodic TCs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Periodic TCs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPeriodicTCs(GSSConfigPeriodicTCs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Periodic TC Level2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Periodic TC Level2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPeriodicTCLevel2(GSSConfigPeriodicTCLevel2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Periodic TC Level1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Periodic TC Level1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPeriodicTCLevel1(GSSConfigPeriodicTCLevel1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Periodic TC Level0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Periodic TC Level0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPeriodicTCLevel0(GSSConfigPeriodicTCLevel0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Global Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Global Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGlobalVars(GSSConfigGlobalVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Global Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGlobalVar(GSSConfigGlobalVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Reference Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigReferenceField(GSSConfigReferenceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Reference Periodic TC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Reference Periodic TC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigReferencePeriodicTC(GSSConfigReferencePeriodicTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Reference Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Reference Special Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigReferenceSpecialPacket(GSSConfigReferenceSpecialPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Monitors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Monitors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigMonitors(GSSConfigMonitors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigPlot(GSSConfigPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Alarm Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Alarm Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigAlarmMsg(GSSConfigAlarmMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Modify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Modify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigModify(GSSConfigModify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Alarm Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Alarm Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigAlarmVal(GSSConfigAlarmVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config GV Filtered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config GV Filtered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGVFiltered(GSSConfigGVFiltered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config GV Periodic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config GV Periodic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigGVPeriodic(GSSConfigGVPeriodic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Tests</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Tests</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigTests(GSSConfigTests object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Config Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Config Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSConfigTestCase(GSSConfigTestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSModelElement(GSSModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //configSwitch
