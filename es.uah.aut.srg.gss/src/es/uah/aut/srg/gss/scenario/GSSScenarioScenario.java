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

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGss_options <em>Gss options</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getPeriodicTCs <em>Periodic TCs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario()
 * @model
 * @generated
 */
public interface GSSScenarioScenario extends TMTCIFScenario {
	/**
	 * Returns the value of the '<em><b>Gss options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss options</em>' containment reference.
	 * @see #setGss_options(GSSScenarioOptions)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario_Gss_options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSScenarioOptions getGss_options();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGss_options <em>Gss options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss options</em>' containment reference.
	 * @see #getGss_options()
	 * @generated
	 */
	void setGss_options(GSSScenarioOptions value);

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference.
	 * @see #setProtocols(GSSScenarioProtocols)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario_Protocols()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSScenarioProtocols getProtocols();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getProtocols <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocols</em>' containment reference.
	 * @see #getProtocols()
	 * @generated
	 */
	void setProtocols(GSSScenarioProtocols value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(GSSScenarioInterfaces)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSScenarioInterfaces getInterfaces();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(GSSScenarioInterfaces value);

	/**
	 * Returns the value of the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packets</em>' containment reference.
	 * @see #setSpecialPackets(GSSScenarioSpecialPackets)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario_SpecialPackets()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioSpecialPackets getSpecialPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getSpecialPackets <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Packets</em>' containment reference.
	 * @see #getSpecialPackets()
	 * @generated
	 */
	void setSpecialPackets(GSSScenarioSpecialPackets value);

	/**
	 * Returns the value of the '<em><b>Periodic TCs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic TCs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic TCs</em>' containment reference.
	 * @see #setPeriodicTCs(GSSScenarioPeriodicTCs)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario_PeriodicTCs()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioPeriodicTCs getPeriodicTCs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getPeriodicTCs <em>Periodic TCs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic TCs</em>' containment reference.
	 * @see #getPeriodicTCs()
	 * @generated
	 */
	void setPeriodicTCs(GSSScenarioPeriodicTCs value);

	/**
	 * Returns the value of the '<em><b>Global Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Vars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Vars</em>' containment reference.
	 * @see #setGlobalVars(GSSScenarioGlobalVars)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario_GlobalVars()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioGlobalVars getGlobalVars();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getGlobalVars <em>Global Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Vars</em>' containment reference.
	 * @see #getGlobalVars()
	 * @generated
	 */
	void setGlobalVars(GSSScenarioGlobalVars value);

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' containment reference.
	 * @see #setMonitors(GSSScenarioMonitors)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioScenario_Monitors()
	 * @model containment="true"
	 * @generated
	 */
	GSSScenarioMonitors getMonitors();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioScenario#getMonitors <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitors</em>' containment reference.
	 * @see #getMonitors()
	 * @generated
	 */
	void setMonitors(GSSScenarioMonitors value);

} // GSSScenarioScenario
