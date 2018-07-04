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
package es.uah.aut.srg.gss.config;

import es.uah.aut.srg.gss.common.GSSModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config GSS Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGss_options <em>Gss options</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getSpecialPackets <em>Special Packets</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getPeriodicTCs <em>Periodic TCs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGlobalVars <em>Global Vars</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getMonitors <em>Monitors</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests <em>Tests</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig()
 * @model
 * @generated
 */
public interface GSSConfigGSSConfig extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Gss options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss options</em>' containment reference.
	 * @see #setGss_options(GSSConfigGSSOptions)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_Gss_options()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigGSSOptions getGss_options();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGss_options <em>Gss options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss options</em>' containment reference.
	 * @see #getGss_options()
	 * @generated
	 */
	void setGss_options(GSSConfigGSSOptions value);

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference.
	 * @see #setProtocols(GSSConfigProtocols)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_Protocols()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigProtocols getProtocols();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getProtocols <em>Protocols</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocols</em>' containment reference.
	 * @see #getProtocols()
	 * @generated
	 */
	void setProtocols(GSSConfigProtocols value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(GSSConfigInterfaces)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_Interfaces()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigInterfaces getInterfaces();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(GSSConfigInterfaces value);

	/**
	 * Returns the value of the '<em><b>Special Packets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packets</em>' containment reference.
	 * @see #setSpecialPackets(GSSConfigSpecialPackets)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_SpecialPackets()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigSpecialPackets getSpecialPackets();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getSpecialPackets <em>Special Packets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Packets</em>' containment reference.
	 * @see #getSpecialPackets()
	 * @generated
	 */
	void setSpecialPackets(GSSConfigSpecialPackets value);

	/**
	 * Returns the value of the '<em><b>Periodic TCs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodic TCs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic TCs</em>' containment reference.
	 * @see #setPeriodicTCs(GSSConfigPeriodicTCs)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_PeriodicTCs()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigPeriodicTCs getPeriodicTCs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getPeriodicTCs <em>Periodic TCs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic TCs</em>' containment reference.
	 * @see #getPeriodicTCs()
	 * @generated
	 */
	void setPeriodicTCs(GSSConfigPeriodicTCs value);

	/**
	 * Returns the value of the '<em><b>Global Vars</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Vars</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Vars</em>' containment reference.
	 * @see #setGlobalVars(GSSConfigGlobalVars)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_GlobalVars()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigGlobalVars getGlobalVars();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getGlobalVars <em>Global Vars</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Vars</em>' containment reference.
	 * @see #getGlobalVars()
	 * @generated
	 */
	void setGlobalVars(GSSConfigGlobalVars value);

	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' containment reference.
	 * @see #setMonitors(GSSConfigMonitors)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_Monitors()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigMonitors getMonitors();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getMonitors <em>Monitors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitors</em>' containment reference.
	 * @see #getMonitors()
	 * @generated
	 */
	void setMonitors(GSSConfigMonitors value);

	/**
	 * Returns the value of the '<em><b>Tests</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tests</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tests</em>' containment reference.
	 * @see #setTests(GSSConfigTests)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSConfig_Tests()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigTests getTests();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSConfig#getTests <em>Tests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tests</em>' containment reference.
	 * @see #getTests()
	 * @generated
	 */
	void setTests(GSSConfigTests value);

} // GSSConfigGSSConfig
