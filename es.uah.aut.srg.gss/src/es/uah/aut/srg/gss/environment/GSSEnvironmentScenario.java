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
package es.uah.aut.srg.gss.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGss_options <em>Gss options</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getPeriodicTCs <em>Periodic TCs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario()
 * @model
 * @generated
 */
public interface GSSEnvironmentScenario extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Gss options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss options</em>' containment reference.
	 * @see #setGss_options(GSSEnvironmentOptions)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_Gss_options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentOptions getGss_options();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGss_options <em>Gss options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss options</em>' containment reference.
	 * @see #getGss_options()
	 * @generated
	 */
	void setGss_options(GSSEnvironmentOptions value);

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference.
	 * @see #setProtocols(GSSEnvironmentProtocols)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_Protocols()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentProtocols getProtocols();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getProtocols <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocols</em>' containment reference.
	 * @see #getProtocols()
	 * @generated
	 */
	void setProtocols(GSSEnvironmentProtocols value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(GSSEnvironmentInterfaces)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentInterfaces getInterfaces();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(GSSEnvironmentInterfaces value);

	/**
	 * Returns the value of the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packets</em>' containment reference.
	 * @see #setSpecialPackets(GSSEnvironmentSpecialPackets)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_SpecialPackets()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentSpecialPackets getSpecialPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getSpecialPackets <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Packets</em>' containment reference.
	 * @see #getSpecialPackets()
	 * @generated
	 */
	void setSpecialPackets(GSSEnvironmentSpecialPackets value);

	/**
	 * Returns the value of the '<em><b>Periodic TCs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic TCs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic TCs</em>' containment reference.
	 * @see #setPeriodicTCs(GSSEnvironmentPeriodicTCs)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_PeriodicTCs()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentPeriodicTCs getPeriodicTCs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getPeriodicTCs <em>Periodic TCs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic TCs</em>' containment reference.
	 * @see #getPeriodicTCs()
	 * @generated
	 */
	void setPeriodicTCs(GSSEnvironmentPeriodicTCs value);

	/**
	 * Returns the value of the '<em><b>Global Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Vars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Vars</em>' containment reference.
	 * @see #setGlobalVars(GSSEnvironmentGlobalVars)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_GlobalVars()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentGlobalVars getGlobalVars();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getGlobalVars <em>Global Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Vars</em>' containment reference.
	 * @see #getGlobalVars()
	 * @generated
	 */
	void setGlobalVars(GSSEnvironmentGlobalVars value);

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' containment reference.
	 * @see #setMonitors(GSSEnvironmentMonitors)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentScenario_Monitors()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentMonitors getMonitors();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentScenario#getMonitors <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitors</em>' containment reference.
	 * @see #getMonitors()
	 * @generated
	 */
	void setMonitors(GSSEnvironmentMonitors value);

} // GSSEnvironmentScenario
