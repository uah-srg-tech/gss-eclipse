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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config GSS Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info <em>Gss info</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info_print <em>Gss info print</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getPhy_header_print <em>Phy header print</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getDiscardErrorFlags <em>Discard Error Flags</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSOptions()
 * @model
 * @generated
 */
public interface GSSConfigGSSOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Gss info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss info</em>' containment reference.
	 * @see #setGss_info(GSSConfigGSSInfo)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSOptions_Gss_info()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigGSSInfo getGss_info();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info <em>Gss info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss info</em>' containment reference.
	 * @see #getGss_info()
	 * @generated
	 */
	void setGss_info(GSSConfigGSSInfo value);

	/**
	 * Returns the value of the '<em><b>Gss info print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss info print</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss info print</em>' containment reference.
	 * @see #setGss_info_print(GSSConfigGSSInfoPrint)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSOptions_Gss_info_print()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigGSSInfoPrint getGss_info_print();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getGss_info_print <em>Gss info print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss info print</em>' containment reference.
	 * @see #getGss_info_print()
	 * @generated
	 */
	void setGss_info_print(GSSConfigGSSInfoPrint value);

	/**
	 * Returns the value of the '<em><b>Phy header print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phy header print</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phy header print</em>' containment reference.
	 * @see #setPhy_header_print(GSSConfigPhyHeaderPrint)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSOptions_Phy_header_print()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigPhyHeaderPrint getPhy_header_print();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getPhy_header_print <em>Phy header print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phy header print</em>' containment reference.
	 * @see #getPhy_header_print()
	 * @generated
	 */
	void setPhy_header_print(GSSConfigPhyHeaderPrint value);

	/**
	 * Returns the value of the '<em><b>Discard Error Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discard Error Flags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discard Error Flags</em>' containment reference.
	 * @see #setDiscardErrorFlags(GSSConfigGSSDiscardErrorFlags)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigGSSOptions_DiscardErrorFlags()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigGSSDiscardErrorFlags getDiscardErrorFlags();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigGSSOptions#getDiscardErrorFlags <em>Discard Error Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discard Error Flags</em>' containment reference.
	 * @see #getDiscardErrorFlags()
	 * @generated
	 */
	void setDiscardErrorFlags(GSSConfigGSSDiscardErrorFlags value);

} // GSSConfigGSSOptions
