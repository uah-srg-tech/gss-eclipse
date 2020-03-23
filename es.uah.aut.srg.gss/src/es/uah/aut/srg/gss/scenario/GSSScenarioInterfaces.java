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

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Interfaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getProtocolPacketsFile <em>Protocol Packets File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getMainInterface <em>Main Interface</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterfaces()
 * @model
 * @generated
 */
public interface GSSScenarioInterfaces extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol Packets File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Packets File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Packets File</em>' reference.
	 * @see #setProtocolPacketsFile(GSSProtocolPacketsProtocolPackets)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterfaces_ProtocolPacketsFile()
	 * @model
	 * @generated
	 */
	GSSProtocolPacketsProtocolPackets getProtocolPacketsFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getProtocolPacketsFile <em>Protocol Packets File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Packets File</em>' reference.
	 * @see #getProtocolPacketsFile()
	 * @generated
	 */
	void setProtocolPacketsFile(GSSProtocolPacketsProtocolPackets value);

	/**
	 * Returns the value of the '<em><b>Main Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Interface</em>' containment reference.
	 * @see #setMainInterface(GSSScenarioMainInterface)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterfaces_MainInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSScenarioMainInterface getMainInterface();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaces#getMainInterface <em>Main Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Interface</em>' containment reference.
	 * @see #getMainInterface()
	 * @generated
	 */
	void setMainInterface(GSSScenarioMainInterface value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterfaces_Interface()
	 * @model containment="true" upper="7"
	 * @generated
	 */
	EList<GSSScenarioInterface> getInterface();

} // GSSScenarioInterfaces
