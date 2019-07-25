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
package es.uah.aut.srg.gss.environment.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.environment.*;

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
 * @see es.uah.aut.srg.gss.environment.environmentPackage
 * @generated
 */
public class environmentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static environmentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public environmentSwitch() {
		if (modelPackage == null) {
			modelPackage = environmentPackage.eINSTANCE;
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
			case environmentPackage.GSS_ENVIRONMENT_ENVIRONMENT: {
				GSSEnvironmentEnvironment gssEnvironmentEnvironment = (GSSEnvironmentEnvironment)theEObject;
				T result = caseGSSEnvironmentEnvironment(gssEnvironmentEnvironment);
				if (result == null) result = caseGSSModelElement(gssEnvironmentEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_SCENARIO: {
				GSSEnvironmentScenario gssEnvironmentScenario = (GSSEnvironmentScenario)theEObject;
				T result = caseGSSEnvironmentScenario(gssEnvironmentScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_OPTIONS: {
				GSSEnvironmentOptions gssEnvironmentOptions = (GSSEnvironmentOptions)theEObject;
				T result = caseGSSEnvironmentOptions(gssEnvironmentOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_INFO: {
				GSSEnvironmentInfo gssEnvironmentInfo = (GSSEnvironmentInfo)theEObject;
				T result = caseGSSEnvironmentInfo(gssEnvironmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_INFO_PRINT: {
				GSSEnvironmentInfoPrint gssEnvironmentInfoPrint = (GSSEnvironmentInfoPrint)theEObject;
				T result = caseGSSEnvironmentInfoPrint(gssEnvironmentInfoPrint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PHY_HEADER_PRINT: {
				GSSEnvironmentPhyHeaderPrint gssEnvironmentPhyHeaderPrint = (GSSEnvironmentPhyHeaderPrint)theEObject;
				T result = caseGSSEnvironmentPhyHeaderPrint(gssEnvironmentPhyHeaderPrint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_DISCARD_ERROR_FLAGS: {
				GSSEnvironmentDiscardErrorFlags gssEnvironmentDiscardErrorFlags = (GSSEnvironmentDiscardErrorFlags)theEObject;
				T result = caseGSSEnvironmentDiscardErrorFlags(gssEnvironmentDiscardErrorFlags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOLS: {
				GSSEnvironmentProtocols gssEnvironmentProtocols = (GSSEnvironmentProtocols)theEObject;
				T result = caseGSSEnvironmentProtocols(gssEnvironmentProtocols);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PROTOCOL: {
				GSSEnvironmentProtocol gssEnvironmentProtocol = (GSSEnvironmentProtocol)theEObject;
				T result = caseGSSEnvironmentProtocol(gssEnvironmentProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_INTERFACES: {
				GSSEnvironmentInterfaces gssEnvironmentInterfaces = (GSSEnvironmentInterfaces)theEObject;
				T result = caseGSSEnvironmentInterfaces(gssEnvironmentInterfaces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_MAIN_INTERFACE: {
				GSSEnvironmentMainInterface gssEnvironmentMainInterface = (GSSEnvironmentMainInterface)theEObject;
				T result = caseGSSEnvironmentMainInterface(gssEnvironmentMainInterface);
				if (result == null) result = caseGSSEnvironmentInterface(gssEnvironmentMainInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_INTERFACE: {
				GSSEnvironmentInterface gssEnvironmentInterface = (GSSEnvironmentInterface)theEObject;
				T result = caseGSSEnvironmentInterface(gssEnvironmentInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_IN_OUT: {
				GSSEnvironmentLevelInOut gssEnvironmentLevelInOut = (GSSEnvironmentLevelInOut)theEObject;
				T result = caseGSSEnvironmentLevelInOut(gssEnvironmentLevelInOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_IN: {
				GSSEnvironmentLevelIn gssEnvironmentLevelIn = (GSSEnvironmentLevelIn)theEObject;
				T result = caseGSSEnvironmentLevelIn(gssEnvironmentLevelIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_LEVEL_OUT: {
				GSSEnvironmentLevelOut gssEnvironmentLevelOut = (GSSEnvironmentLevelOut)theEObject;
				T result = caseGSSEnvironmentLevelOut(gssEnvironmentLevelOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKETS: {
				GSSEnvironmentSpecialPackets gssEnvironmentSpecialPackets = (GSSEnvironmentSpecialPackets)theEObject;
				T result = caseGSSEnvironmentSpecialPackets(gssEnvironmentSpecialPackets);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_SPECIAL_PACKET: {
				GSSEnvironmentSpecialPacket gssEnvironmentSpecialPacket = (GSSEnvironmentSpecialPacket)theEObject;
				T result = caseGSSEnvironmentSpecialPacket(gssEnvironmentSpecialPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVELS: {
				GSSEnvironmentUpperLevels gssEnvironmentUpperLevels = (GSSEnvironmentUpperLevels)theEObject;
				T result = caseGSSEnvironmentUpperLevels(gssEnvironmentUpperLevels);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_UPPER_LEVEL: {
				GSSEnvironmentUpperLevel gssEnvironmentUpperLevel = (GSSEnvironmentUpperLevel)theEObject;
				T result = caseGSSEnvironmentUpperLevel(gssEnvironmentUpperLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PRINTING_DATA: {
				GSSEnvironmentPrintingData gssEnvironmentPrintingData = (GSSEnvironmentPrintingData)theEObject;
				T result = caseGSSEnvironmentPrintingData(gssEnvironmentPrintingData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_STRUCTURED_DATA: {
				GSSEnvironmentStructuredData gssEnvironmentStructuredData = (GSSEnvironmentStructuredData)theEObject;
				T result = caseGSSEnvironmentStructuredData(gssEnvironmentStructuredData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PERIOD: {
				GSSEnvironmentPeriod gssEnvironmentPeriod = (GSSEnvironmentPeriod)theEObject;
				T result = caseGSSEnvironmentPeriod(gssEnvironmentPeriod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_INTERVAL_RANGE: {
				GSSEnvironmentIntervalRange gssEnvironmentIntervalRange = (GSSEnvironmentIntervalRange)theEObject;
				T result = caseGSSEnvironmentIntervalRange(gssEnvironmentIntervalRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TCS: {
				GSSEnvironmentPeriodicTCs gssEnvironmentPeriodicTCs = (GSSEnvironmentPeriodicTCs)theEObject;
				T result = caseGSSEnvironmentPeriodicTCs(gssEnvironmentPeriodicTCs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC: {
				GSSEnvironmentPeriodicTC gssEnvironmentPeriodicTC = (GSSEnvironmentPeriodicTC)theEObject;
				T result = caseGSSEnvironmentPeriodicTC(gssEnvironmentPeriodicTC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL2: {
				GSSEnvironmentPeriodicTCLevel2 gssEnvironmentPeriodicTCLevel2 = (GSSEnvironmentPeriodicTCLevel2)theEObject;
				T result = caseGSSEnvironmentPeriodicTCLevel2(gssEnvironmentPeriodicTCLevel2);
				if (result == null) result = caseGSSEnvironmentPeriodicTC(gssEnvironmentPeriodicTCLevel2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL1: {
				GSSEnvironmentPeriodicTCLevel1 gssEnvironmentPeriodicTCLevel1 = (GSSEnvironmentPeriodicTCLevel1)theEObject;
				T result = caseGSSEnvironmentPeriodicTCLevel1(gssEnvironmentPeriodicTCLevel1);
				if (result == null) result = caseGSSEnvironmentPeriodicTC(gssEnvironmentPeriodicTCLevel1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PERIODIC_TC_LEVEL0: {
				GSSEnvironmentPeriodicTCLevel0 gssEnvironmentPeriodicTCLevel0 = (GSSEnvironmentPeriodicTCLevel0)theEObject;
				T result = caseGSSEnvironmentPeriodicTCLevel0(gssEnvironmentPeriodicTCLevel0);
				if (result == null) result = caseGSSEnvironmentPeriodicTC(gssEnvironmentPeriodicTCLevel0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VARS: {
				GSSEnvironmentGlobalVars gssEnvironmentGlobalVars = (GSSEnvironmentGlobalVars)theEObject;
				T result = caseGSSEnvironmentGlobalVars(gssEnvironmentGlobalVars);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_GLOBAL_VAR: {
				GSSEnvironmentGlobalVar gssEnvironmentGlobalVar = (GSSEnvironmentGlobalVar)theEObject;
				T result = caseGSSEnvironmentGlobalVar(gssEnvironmentGlobalVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_FIELD: {
				GSSEnvironmentReferenceField gssEnvironmentReferenceField = (GSSEnvironmentReferenceField)theEObject;
				T result = caseGSSEnvironmentReferenceField(gssEnvironmentReferenceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_PERIODIC_TC: {
				GSSEnvironmentReferencePeriodicTC gssEnvironmentReferencePeriodicTC = (GSSEnvironmentReferencePeriodicTC)theEObject;
				T result = caseGSSEnvironmentReferencePeriodicTC(gssEnvironmentReferencePeriodicTC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_REFERENCE_SPECIAL_PACKET: {
				GSSEnvironmentReferenceSpecialPacket gssEnvironmentReferenceSpecialPacket = (GSSEnvironmentReferenceSpecialPacket)theEObject;
				T result = caseGSSEnvironmentReferenceSpecialPacket(gssEnvironmentReferenceSpecialPacket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_MONITORS: {
				GSSEnvironmentMonitors gssEnvironmentMonitors = (GSSEnvironmentMonitors)theEObject;
				T result = caseGSSEnvironmentMonitors(gssEnvironmentMonitors);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_PLOT: {
				GSSEnvironmentPlot gssEnvironmentPlot = (GSSEnvironmentPlot)theEObject;
				T result = caseGSSEnvironmentPlot(gssEnvironmentPlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_ALARM_MSG: {
				GSSEnvironmentAlarmMsg gssEnvironmentAlarmMsg = (GSSEnvironmentAlarmMsg)theEObject;
				T result = caseGSSEnvironmentAlarmMsg(gssEnvironmentAlarmMsg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_MODIFY: {
				GSSEnvironmentModify gssEnvironmentModify = (GSSEnvironmentModify)theEObject;
				T result = caseGSSEnvironmentModify(gssEnvironmentModify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_ALARM_VAL: {
				GSSEnvironmentAlarmVal gssEnvironmentAlarmVal = (GSSEnvironmentAlarmVal)theEObject;
				T result = caseGSSEnvironmentAlarmVal(gssEnvironmentAlarmVal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_GV_FILTERED: {
				GSSEnvironmentGVFiltered gssEnvironmentGVFiltered = (GSSEnvironmentGVFiltered)theEObject;
				T result = caseGSSEnvironmentGVFiltered(gssEnvironmentGVFiltered);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case environmentPackage.GSS_ENVIRONMENT_GV_PERIODIC: {
				GSSEnvironmentGVPeriodic gssEnvironmentGVPeriodic = (GSSEnvironmentGVPeriodic)theEObject;
				T result = caseGSSEnvironmentGVPeriodic(gssEnvironmentGVPeriodic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentEnvironment(GSSEnvironmentEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentScenario(GSSEnvironmentScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentOptions(GSSEnvironmentOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentInfo(GSSEnvironmentInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Info Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Info Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentInfoPrint(GSSEnvironmentInfoPrint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Phy Header Print</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Phy Header Print</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPhyHeaderPrint(GSSEnvironmentPhyHeaderPrint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Discard Error Flags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Discard Error Flags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentDiscardErrorFlags(GSSEnvironmentDiscardErrorFlags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Protocols</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Protocols</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentProtocols(GSSEnvironmentProtocols object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentProtocol(GSSEnvironmentProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Interfaces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentInterfaces(GSSEnvironmentInterfaces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Main Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Main Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentMainInterface(GSSEnvironmentMainInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentInterface(GSSEnvironmentInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Level In Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Level In Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentLevelInOut(GSSEnvironmentLevelInOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Level In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Level In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentLevelIn(GSSEnvironmentLevelIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Level Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Level Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentLevelOut(GSSEnvironmentLevelOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Special Packets</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Special Packets</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentSpecialPackets(GSSEnvironmentSpecialPackets object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Special Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentSpecialPacket(GSSEnvironmentSpecialPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Upper Levels</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Upper Levels</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentUpperLevels(GSSEnvironmentUpperLevels object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Upper Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Upper Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentUpperLevel(GSSEnvironmentUpperLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Printing Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Printing Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPrintingData(GSSEnvironmentPrintingData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Structured Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentStructuredData(GSSEnvironmentStructuredData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Period</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Period</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPeriod(GSSEnvironmentPeriod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Interval Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Interval Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentIntervalRange(GSSEnvironmentIntervalRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Periodic TCs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Periodic TCs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPeriodicTCs(GSSEnvironmentPeriodicTCs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPeriodicTC(GSSEnvironmentPeriodicTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC Level2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC Level2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPeriodicTCLevel2(GSSEnvironmentPeriodicTCLevel2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC Level1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC Level1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPeriodicTCLevel1(GSSEnvironmentPeriodicTCLevel1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC Level0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Periodic TC Level0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPeriodicTCLevel0(GSSEnvironmentPeriodicTCLevel0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Global Vars</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Global Vars</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentGlobalVars(GSSEnvironmentGlobalVars object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Global Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentGlobalVar(GSSEnvironmentGlobalVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Reference Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentReferenceField(GSSEnvironmentReferenceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Reference Periodic TC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Reference Periodic TC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentReferencePeriodicTC(GSSEnvironmentReferencePeriodicTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Reference Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Reference Special Packet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentReferenceSpecialPacket(GSSEnvironmentReferenceSpecialPacket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Monitors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Monitors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentMonitors(GSSEnvironmentMonitors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Plot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Plot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentPlot(GSSEnvironmentPlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Alarm Msg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Alarm Msg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentAlarmMsg(GSSEnvironmentAlarmMsg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Modify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Modify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentModify(GSSEnvironmentModify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment Alarm Val</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment Alarm Val</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentAlarmVal(GSSEnvironmentAlarmVal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment GV Filtered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment GV Filtered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentGVFiltered(GSSEnvironmentGVFiltered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Environment GV Periodic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Environment GV Periodic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSEnvironmentGVPeriodic(GSSEnvironmentGVPeriodic object) {
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

} //environmentSwitch
