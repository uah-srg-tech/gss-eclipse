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
package es.uah.aut.srg.gss.scenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage
 * @generated
 */
public interface scenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	scenarioFactory eINSTANCE = es.uah.aut.srg.gss.scenario.impl.scenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Scenario Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Scenario</em>'.
	 * @generated
	 */
	GSSScenarioScenario createGSSScenarioScenario();

	/**
	 * Returns a new object of class '<em>GSS Scenario Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Options</em>'.
	 * @generated
	 */
	GSSScenarioOptions createGSSScenarioOptions();

	/**
	 * Returns a new object of class '<em>GSS Scenario Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Info</em>'.
	 * @generated
	 */
	GSSScenarioInfo createGSSScenarioInfo();

	/**
	 * Returns a new object of class '<em>GSS Scenario Info Print</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Info Print</em>'.
	 * @generated
	 */
	GSSScenarioInfoPrint createGSSScenarioInfoPrint();

	/**
	 * Returns a new object of class '<em>GSS Scenario Phy Header Print</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Phy Header Print</em>'.
	 * @generated
	 */
	GSSScenarioPhyHeaderPrint createGSSScenarioPhyHeaderPrint();

	/**
	 * Returns a new object of class '<em>GSS Scenario Discard Error Flags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Discard Error Flags</em>'.
	 * @generated
	 */
	GSSScenarioDiscardErrorFlags createGSSScenarioDiscardErrorFlags();

	/**
	 * Returns a new object of class '<em>GSS Scenario Protocols</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Protocols</em>'.
	 * @generated
	 */
	GSSScenarioProtocols createGSSScenarioProtocols();

	/**
	 * Returns a new object of class '<em>GSS Scenario Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Protocol</em>'.
	 * @generated
	 */
	GSSScenarioProtocol createGSSScenarioProtocol();

	/**
	 * Returns a new object of class '<em>GSS Scenario Protocol Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Protocol Type</em>'.
	 * @generated
	 */
	GSSScenarioProtocolType createGSSScenarioProtocolType();

	/**
	 * Returns a new object of class '<em>GSS Scenario Interfaces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Interfaces</em>'.
	 * @generated
	 */
	GSSScenarioInterfaces createGSSScenarioInterfaces();

	/**
	 * Returns a new object of class '<em>GSS Scenario Main Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Main Interface</em>'.
	 * @generated
	 */
	GSSScenarioMainInterface createGSSScenarioMainInterface();

	/**
	 * Returns a new object of class '<em>GSS Scenario Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Interface</em>'.
	 * @generated
	 */
	GSSScenarioInterface createGSSScenarioInterface();

	/**
	 * Returns a new object of class '<em>GSS Scenario Level In Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Level In Out</em>'.
	 * @generated
	 */
	GSSScenarioLevelInOut createGSSScenarioLevelInOut();

	/**
	 * Returns a new object of class '<em>GSS Scenario Level In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Level In</em>'.
	 * @generated
	 */
	GSSScenarioLevelIn createGSSScenarioLevelIn();

	/**
	 * Returns a new object of class '<em>GSS Scenario Level Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Level Out</em>'.
	 * @generated
	 */
	GSSScenarioLevelOut createGSSScenarioLevelOut();

	/**
	 * Returns a new object of class '<em>GSS Scenario Special Packets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Special Packets</em>'.
	 * @generated
	 */
	GSSScenarioSpecialPackets createGSSScenarioSpecialPackets();

	/**
	 * Returns a new object of class '<em>GSS Scenario Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Special Packet</em>'.
	 * @generated
	 */
	GSSScenarioSpecialPacket createGSSScenarioSpecialPacket();

	/**
	 * Returns a new object of class '<em>GSS Scenario Upper Levels</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Upper Levels</em>'.
	 * @generated
	 */
	GSSScenarioUpperLevels createGSSScenarioUpperLevels();

	/**
	 * Returns a new object of class '<em>GSS Scenario Upper Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Upper Level</em>'.
	 * @generated
	 */
	GSSScenarioUpperLevel createGSSScenarioUpperLevel();

	/**
	 * Returns a new object of class '<em>GSS Scenario Printing Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Printing Data</em>'.
	 * @generated
	 */
	GSSScenarioPrintingData createGSSScenarioPrintingData();

	/**
	 * Returns a new object of class '<em>GSS Scenario Structured Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Structured Data</em>'.
	 * @generated
	 */
	GSSScenarioStructuredData createGSSScenarioStructuredData();

	/**
	 * Returns a new object of class '<em>GSS Scenario Period</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Period</em>'.
	 * @generated
	 */
	GSSScenarioPeriod createGSSScenarioPeriod();

	/**
	 * Returns a new object of class '<em>GSS Scenario Interval Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Interval Range</em>'.
	 * @generated
	 */
	GSSScenarioIntervalRange createGSSScenarioIntervalRange();

	/**
	 * Returns a new object of class '<em>GSS Scenario Periodic TCs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Periodic TCs</em>'.
	 * @generated
	 */
	GSSScenarioPeriodicTCs createGSSScenarioPeriodicTCs();

	/**
	 * Returns a new object of class '<em>GSS Scenario Periodic TC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Periodic TC</em>'.
	 * @generated
	 */
	GSSScenarioPeriodicTC createGSSScenarioPeriodicTC();

	/**
	 * Returns a new object of class '<em>GSS Scenario Periodic TC Level2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Periodic TC Level2</em>'.
	 * @generated
	 */
	GSSScenarioPeriodicTCLevel2 createGSSScenarioPeriodicTCLevel2();

	/**
	 * Returns a new object of class '<em>GSS Scenario Periodic TC Level1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Periodic TC Level1</em>'.
	 * @generated
	 */
	GSSScenarioPeriodicTCLevel1 createGSSScenarioPeriodicTCLevel1();

	/**
	 * Returns a new object of class '<em>GSS Scenario Periodic TC Level0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Periodic TC Level0</em>'.
	 * @generated
	 */
	GSSScenarioPeriodicTCLevel0 createGSSScenarioPeriodicTCLevel0();

	/**
	 * Returns a new object of class '<em>GSS Scenario Global Vars</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Global Vars</em>'.
	 * @generated
	 */
	GSSScenarioGlobalVars createGSSScenarioGlobalVars();

	/**
	 * Returns a new object of class '<em>GSS Scenario Global Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Global Var</em>'.
	 * @generated
	 */
	GSSScenarioGlobalVar createGSSScenarioGlobalVar();

	/**
	 * Returns a new object of class '<em>GSS Scenario Reference Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Reference Field</em>'.
	 * @generated
	 */
	GSSScenarioReferenceField createGSSScenarioReferenceField();

	/**
	 * Returns a new object of class '<em>GSS Scenario Reference Periodic TC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Reference Periodic TC</em>'.
	 * @generated
	 */
	GSSScenarioReferencePeriodicTC createGSSScenarioReferencePeriodicTC();

	/**
	 * Returns a new object of class '<em>GSS Scenario Reference Special Packet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Reference Special Packet</em>'.
	 * @generated
	 */
	GSSScenarioReferenceSpecialPacket createGSSScenarioReferenceSpecialPacket();

	/**
	 * Returns a new object of class '<em>GSS Scenario Monitors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Monitors</em>'.
	 * @generated
	 */
	GSSScenarioMonitors createGSSScenarioMonitors();

	/**
	 * Returns a new object of class '<em>GSS Scenario Plot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Plot</em>'.
	 * @generated
	 */
	GSSScenarioPlot createGSSScenarioPlot();

	/**
	 * Returns a new object of class '<em>GSS Scenario Alarm Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Alarm Msg</em>'.
	 * @generated
	 */
	GSSScenarioAlarmMsg createGSSScenarioAlarmMsg();

	/**
	 * Returns a new object of class '<em>GSS Scenario Modify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Modify</em>'.
	 * @generated
	 */
	GSSScenarioModify createGSSScenarioModify();

	/**
	 * Returns a new object of class '<em>GSS Scenario Alarm Val</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario Alarm Val</em>'.
	 * @generated
	 */
	GSSScenarioAlarmVal createGSSScenarioAlarmVal();

	/**
	 * Returns a new object of class '<em>GSS Scenario GV Filtered</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario GV Filtered</em>'.
	 * @generated
	 */
	GSSScenarioGVFiltered createGSSScenarioGVFiltered();

	/**
	 * Returns a new object of class '<em>GSS Scenario GV Periodic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Scenario GV Periodic</em>'.
	 * @generated
	 */
	GSSScenarioGVPeriodic createGSSScenarioGVPeriodic();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	scenarioPackage getscenarioPackage();

} //scenarioFactory
