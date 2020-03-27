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
package es.uah.aut.srg.gss.scenario.util;

import es.uah.aut.srg.gss.scenario.*;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface;
import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioVariable;
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
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage
 * @generated
 */
public class scenarioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static scenarioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public scenarioSwitch() {
		if (modelPackage == null) {
			modelPackage = scenarioPackage.eINSTANCE;
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
			case scenarioPackage.GSS_SCENARIO_SCENARIO: {
				GSSScenarioScenario gssScenarioScenario = (GSSScenarioScenario)theEObject;
				T result = caseGSSScenarioScenario(gssScenarioScenario);
				if (result == null) result = caseTMTCIFScenario(gssScenarioScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_OPTIONS: {
				GSSScenarioOptions gssScenarioOptions = (GSSScenarioOptions)theEObject;
				T result = caseGSSScenarioOptions(gssScenarioOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_INFO: {
				GSSScenarioInfo gssScenarioInfo = (GSSScenarioInfo)theEObject;
				T result = caseGSSScenarioInfo(gssScenarioInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_INFO_PRINT: {
				GSSScenarioInfoPrint gssScenarioInfoPrint = (GSSScenarioInfoPrint)theEObject;
				T result = caseGSSScenarioInfoPrint(gssScenarioInfoPrint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PHY_HEADER_PRINT: {
				GSSScenarioPhyHeaderPrint gssScenarioPhyHeaderPrint = (GSSScenarioPhyHeaderPrint)theEObject;
				T result = caseGSSScenarioPhyHeaderPrint(gssScenarioPhyHeaderPrint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_DISCARD_ERROR_FLAGS: {
				GSSScenarioDiscardErrorFlags gssScenarioDiscardErrorFlags = (GSSScenarioDiscardErrorFlags)theEObject;
				T result = caseGSSScenarioDiscardErrorFlags(gssScenarioDiscardErrorFlags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PROTOCOLS: {
				GSSScenarioProtocols gssScenarioProtocols = (GSSScenarioProtocols)theEObject;
				T result = caseGSSScenarioProtocols(gssScenarioProtocols);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PROTOCOL: {
				GSSScenarioProtocol gssScenarioProtocol = (GSSScenarioProtocol)theEObject;
				T result = caseGSSScenarioProtocol(gssScenarioProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PROTOCOL_TYPE: {
				GSSScenarioProtocolType gssScenarioProtocolType = (GSSScenarioProtocolType)theEObject;
				T result = caseGSSScenarioProtocolType(gssScenarioProtocolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_INTERFACES: {
				GSSScenarioInterfaces gssScenarioInterfaces = (GSSScenarioInterfaces)theEObject;
				T result = caseGSSScenarioInterfaces(gssScenarioInterfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_MAIN_INTERFACE: {
				GSSScenarioMainInterface gssScenarioMainInterface = (GSSScenarioMainInterface)theEObject;
				T result = caseGSSScenarioMainInterface(gssScenarioMainInterface);
				if (result == null) result = caseGSSScenarioInterface(gssScenarioMainInterface);
				if (result == null) result = caseTMTCIFScenarioInterface(gssScenarioMainInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_INTERFACE: {
				GSSScenarioInterface gssScenarioInterface = (GSSScenarioInterface)theEObject;
				T result = caseGSSScenarioInterface(gssScenarioInterface);
				if (result == null) result = caseTMTCIFScenarioInterface(gssScenarioInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN_OUT: {
				GSSScenarioLevelInOut gssScenarioLevelInOut = (GSSScenarioLevelInOut)theEObject;
				T result = caseGSSScenarioLevelInOut(gssScenarioLevelInOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_LEVEL_IN: {
				GSSScenarioLevelIn gssScenarioLevelIn = (GSSScenarioLevelIn)theEObject;
				T result = caseGSSScenarioLevelIn(gssScenarioLevelIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_LEVEL_OUT: {
				GSSScenarioLevelOut gssScenarioLevelOut = (GSSScenarioLevelOut)theEObject;
				T result = caseGSSScenarioLevelOut(gssScenarioLevelOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKETS: {
				GSSScenarioSpecialPackets gssScenarioSpecialPackets = (GSSScenarioSpecialPackets)theEObject;
				T result = caseGSSScenarioSpecialPackets(gssScenarioSpecialPackets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_SPECIAL_PACKET: {
				GSSScenarioSpecialPacket gssScenarioSpecialPacket = (GSSScenarioSpecialPacket)theEObject;
				T result = caseGSSScenarioSpecialPacket(gssScenarioSpecialPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVELS: {
				GSSScenarioUpperLevels gssScenarioUpperLevels = (GSSScenarioUpperLevels)theEObject;
				T result = caseGSSScenarioUpperLevels(gssScenarioUpperLevels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_UPPER_LEVEL: {
				GSSScenarioUpperLevel gssScenarioUpperLevel = (GSSScenarioUpperLevel)theEObject;
				T result = caseGSSScenarioUpperLevel(gssScenarioUpperLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PRINTING_DATA: {
				GSSScenarioPrintingData gssScenarioPrintingData = (GSSScenarioPrintingData)theEObject;
				T result = caseGSSScenarioPrintingData(gssScenarioPrintingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_STRUCTURED_DATA: {
				GSSScenarioStructuredData gssScenarioStructuredData = (GSSScenarioStructuredData)theEObject;
				T result = caseGSSScenarioStructuredData(gssScenarioStructuredData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PERIOD: {
				GSSScenarioPeriod gssScenarioPeriod = (GSSScenarioPeriod)theEObject;
				T result = caseGSSScenarioPeriod(gssScenarioPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_INTERVAL_RANGE: {
				GSSScenarioIntervalRange gssScenarioIntervalRange = (GSSScenarioIntervalRange)theEObject;
				T result = caseGSSScenarioIntervalRange(gssScenarioIntervalRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TCS: {
				GSSScenarioPeriodicTCs gssScenarioPeriodicTCs = (GSSScenarioPeriodicTCs)theEObject;
				T result = caseGSSScenarioPeriodicTCs(gssScenarioPeriodicTCs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC: {
				GSSScenarioPeriodicTC gssScenarioPeriodicTC = (GSSScenarioPeriodicTC)theEObject;
				T result = caseGSSScenarioPeriodicTC(gssScenarioPeriodicTC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL2: {
				GSSScenarioPeriodicTCLevel2 gssScenarioPeriodicTCLevel2 = (GSSScenarioPeriodicTCLevel2)theEObject;
				T result = caseGSSScenarioPeriodicTCLevel2(gssScenarioPeriodicTCLevel2);
				if (result == null) result = caseGSSScenarioPeriodicTC(gssScenarioPeriodicTCLevel2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL1: {
				GSSScenarioPeriodicTCLevel1 gssScenarioPeriodicTCLevel1 = (GSSScenarioPeriodicTCLevel1)theEObject;
				T result = caseGSSScenarioPeriodicTCLevel1(gssScenarioPeriodicTCLevel1);
				if (result == null) result = caseGSSScenarioPeriodicTC(gssScenarioPeriodicTCLevel1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PERIODIC_TC_LEVEL0: {
				GSSScenarioPeriodicTCLevel0 gssScenarioPeriodicTCLevel0 = (GSSScenarioPeriodicTCLevel0)theEObject;
				T result = caseGSSScenarioPeriodicTCLevel0(gssScenarioPeriodicTCLevel0);
				if (result == null) result = caseGSSScenarioPeriodicTC(gssScenarioPeriodicTCLevel0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VARS: {
				GSSScenarioGlobalVars gssScenarioGlobalVars = (GSSScenarioGlobalVars)theEObject;
				T result = caseGSSScenarioGlobalVars(gssScenarioGlobalVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_GLOBAL_VAR: {
				GSSScenarioGlobalVar gssScenarioGlobalVar = (GSSScenarioGlobalVar)theEObject;
				T result = caseGSSScenarioGlobalVar(gssScenarioGlobalVar);
				if (result == null) result = caseTMTCIFScenarioVariable(gssScenarioGlobalVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_REFERENCE: {
				GSSScenarioReference gssScenarioReference = (GSSScenarioReference)theEObject;
				T result = caseGSSScenarioReference(gssScenarioReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_REFERENCE_FIELD: {
				GSSScenarioReferenceField gssScenarioReferenceField = (GSSScenarioReferenceField)theEObject;
				T result = caseGSSScenarioReferenceField(gssScenarioReferenceField);
				if (result == null) result = caseGSSScenarioReference(gssScenarioReferenceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_REFERENCE_PERIODIC_TC: {
				GSSScenarioReferencePeriodicTC gssScenarioReferencePeriodicTC = (GSSScenarioReferencePeriodicTC)theEObject;
				T result = caseGSSScenarioReferencePeriodicTC(gssScenarioReferencePeriodicTC);
				if (result == null) result = caseGSSScenarioReference(gssScenarioReferencePeriodicTC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_REFERENCE_SPECIAL_PACKET: {
				GSSScenarioReferenceSpecialPacket gssScenarioReferenceSpecialPacket = (GSSScenarioReferenceSpecialPacket)theEObject;
				T result = caseGSSScenarioReferenceSpecialPacket(gssScenarioReferenceSpecialPacket);
				if (result == null) result = caseGSSScenarioReference(gssScenarioReferenceSpecialPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_MONITORS: {
				GSSScenarioMonitors gssScenarioMonitors = (GSSScenarioMonitors)theEObject;
				T result = caseGSSScenarioMonitors(gssScenarioMonitors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_MONITOR: {
				GSSScenarioMonitor gssScenarioMonitor = (GSSScenarioMonitor)theEObject;
				T result = caseGSSScenarioMonitor(gssScenarioMonitor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_PLOT: {
				GSSScenarioPlot gssScenarioPlot = (GSSScenarioPlot)theEObject;
				T result = caseGSSScenarioPlot(gssScenarioPlot);
				if (result == null) result = caseGSSScenarioMonitor(gssScenarioPlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_ALARM_MSG: {
				GSSScenarioAlarmMsg gssScenarioAlarmMsg = (GSSScenarioAlarmMsg)theEObject;
				T result = caseGSSScenarioAlarmMsg(gssScenarioAlarmMsg);
				if (result == null) result = caseGSSScenarioMonitor(gssScenarioAlarmMsg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_MODIFY: {
				GSSScenarioModify gssScenarioModify = (GSSScenarioModify)theEObject;
				T result = caseGSSScenarioModify(gssScenarioModify);
				if (result == null) result = caseGSSScenarioMonitor(gssScenarioModify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_ALARM_VAL: {
				GSSScenarioAlarmVal gssScenarioAlarmVal = (GSSScenarioAlarmVal)theEObject;
				T result = caseGSSScenarioAlarmVal(gssScenarioAlarmVal);
				if (result == null) result = caseGSSScenarioMonitor(gssScenarioAlarmVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_GV: {
				GSSScenarioGV gssScenarioGV = (GSSScenarioGV)theEObject;
				T result = caseGSSScenarioGV(gssScenarioGV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_GV_FILTERED: {
				GSSScenarioGVFiltered gssScenarioGVFiltered = (GSSScenarioGVFiltered)theEObject;
				T result = caseGSSScenarioGVFiltered(gssScenarioGVFiltered);
				if (result == null) result = caseGSSScenarioGV(gssScenarioGVFiltered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case scenarioPackage.GSS_SCENARIO_GV_PERIODIC: {
				GSSScenarioGVPeriodic gssScenarioGVPeriodic = (GSSScenarioGVPeriodic)theEObject;
				T result = caseGSSScenarioGVPeriodic(gssScenarioGVPeriodic);
				if (result == null) result = caseGSSScenarioGV(gssScenarioGVPeriodic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioScenario(GSSScenarioScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioOptions(GSSScenarioOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioInfo(GSSScenarioInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Info Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Info Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioInfoPrint(GSSScenarioInfoPrint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Phy Header Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Phy Header Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPhyHeaderPrint(GSSScenarioPhyHeaderPrint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Discard Error Flags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Discard Error Flags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioDiscardErrorFlags(GSSScenarioDiscardErrorFlags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Protocols</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Protocols</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioProtocols(GSSScenarioProtocols object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioProtocol(GSSScenarioProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Protocol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioProtocolType(GSSScenarioProtocolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioInterfaces(GSSScenarioInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Main Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Main Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioMainInterface(GSSScenarioMainInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioInterface(GSSScenarioInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Level In Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Level In Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioLevelInOut(GSSScenarioLevelInOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Level In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Level In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioLevelIn(GSSScenarioLevelIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Level Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Level Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioLevelOut(GSSScenarioLevelOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Special Packets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Special Packets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioSpecialPackets(GSSScenarioSpecialPackets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Special Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioSpecialPacket(GSSScenarioSpecialPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Upper Levels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Upper Levels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioUpperLevels(GSSScenarioUpperLevels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Upper Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Upper Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioUpperLevel(GSSScenarioUpperLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Printing Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Printing Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPrintingData(GSSScenarioPrintingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioStructuredData(GSSScenarioStructuredData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPeriod(GSSScenarioPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Interval Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Interval Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioIntervalRange(GSSScenarioIntervalRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TCs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TCs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPeriodicTCs(GSSScenarioPeriodicTCs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPeriodicTC(GSSScenarioPeriodicTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC Level2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC Level2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPeriodicTCLevel2(GSSScenarioPeriodicTCLevel2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC Level1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC Level1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPeriodicTCLevel1(GSSScenarioPeriodicTCLevel1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC Level0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Periodic TC Level0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPeriodicTCLevel0(GSSScenarioPeriodicTCLevel0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Global Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Global Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioGlobalVars(GSSScenarioGlobalVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Global Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioGlobalVar(GSSScenarioGlobalVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioReference(GSSScenarioReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Reference Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioReferenceField(GSSScenarioReferenceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Reference Periodic TC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Reference Periodic TC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioReferencePeriodicTC(GSSScenarioReferencePeriodicTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Reference Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Reference Special Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioReferenceSpecialPacket(GSSScenarioReferenceSpecialPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Monitors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Monitors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioMonitors(GSSScenarioMonitors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Monitor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Monitor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioMonitor(GSSScenarioMonitor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioPlot(GSSScenarioPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Alarm Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Alarm Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioAlarmMsg(GSSScenarioAlarmMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Modify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Modify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioModify(GSSScenarioModify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario Alarm Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario Alarm Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioAlarmVal(GSSScenarioAlarmVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario GV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario GV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioGV(GSSScenarioGV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario GV Filtered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario GV Filtered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioGVFiltered(GSSScenarioGVFiltered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Scenario GV Periodic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Scenario GV Periodic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSScenarioGVPeriodic(GSSScenarioGVPeriodic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFScenario(TMTCIFScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Scenario Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Scenario Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFScenarioInterface(TMTCIFScenarioInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMTCIF Scenario Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMTCIF Scenario Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMTCIFScenarioVariable(TMTCIFScenarioVariable object) {
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

} //scenarioSwitch
