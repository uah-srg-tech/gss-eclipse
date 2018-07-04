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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Tests</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigTests#getProtocolPacketsFile <em>Protocol Packets File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigTests#getTestCase <em>Test Case</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTests()
 * @model
 * @generated
 */
public interface GSSConfigTests extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol Packets File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Packets File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Packets File</em>' attribute.
	 * @see #setProtocolPacketsFile(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTests_ProtocolPacketsFile()
	 * @model
	 * @generated
	 */
	String getProtocolPacketsFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigTests#getProtocolPacketsFile <em>Protocol Packets File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Packets File</em>' attribute.
	 * @see #getProtocolPacketsFile()
	 * @generated
	 */
	void setProtocolPacketsFile(String value);

	/**
	 * Returns the value of the '<em><b>Test Case</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigTestCase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Case</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTests_TestCase()
	 * @model containment="true" required="true" upper="150"
	 * @generated
	 */
	EList<GSSConfigTestCase> getTestCase();

} // GSSConfigTests
