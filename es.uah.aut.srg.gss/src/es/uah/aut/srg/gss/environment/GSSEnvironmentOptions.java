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
 * A representation of the model object '<em><b>GSS Environment Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info <em>Gss info</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info_print <em>Gss info print</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getPhy_header_print <em>Phy header print</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getDiscardErrorFlags <em>Discard Error Flags</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentOptions()
 * @model
 * @generated
 */
public interface GSSEnvironmentOptions extends EObject {
	/**
	 * Returns the value of the '<em><b>Gss info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss info</em>' containment reference.
	 * @see #setGss_info(GSSEnvironmentInfo)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentOptions_Gss_info()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentInfo getGss_info();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info <em>Gss info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss info</em>' containment reference.
	 * @see #getGss_info()
	 * @generated
	 */
	void setGss_info(GSSEnvironmentInfo value);

	/**
	 * Returns the value of the '<em><b>Gss info print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss info print</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss info print</em>' containment reference.
	 * @see #setGss_info_print(GSSEnvironmentInfoPrint)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentOptions_Gss_info_print()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentInfoPrint getGss_info_print();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getGss_info_print <em>Gss info print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss info print</em>' containment reference.
	 * @see #getGss_info_print()
	 * @generated
	 */
	void setGss_info_print(GSSEnvironmentInfoPrint value);

	/**
	 * Returns the value of the '<em><b>Phy header print</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phy header print</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phy header print</em>' containment reference.
	 * @see #setPhy_header_print(GSSEnvironmentPhyHeaderPrint)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentOptions_Phy_header_print()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentPhyHeaderPrint getPhy_header_print();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getPhy_header_print <em>Phy header print</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phy header print</em>' containment reference.
	 * @see #getPhy_header_print()
	 * @generated
	 */
	void setPhy_header_print(GSSEnvironmentPhyHeaderPrint value);

	/**
	 * Returns the value of the '<em><b>Discard Error Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discard Error Flags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discard Error Flags</em>' containment reference.
	 * @see #setDiscardErrorFlags(GSSEnvironmentDiscardErrorFlags)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentOptions_DiscardErrorFlags()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentDiscardErrorFlags getDiscardErrorFlags();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentOptions#getDiscardErrorFlags <em>Discard Error Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discard Error Flags</em>' containment reference.
	 * @see #getDiscardErrorFlags()
	 * @generated
	 */
	void setDiscardErrorFlags(GSSEnvironmentDiscardErrorFlags value);

} // GSSEnvironmentOptions
