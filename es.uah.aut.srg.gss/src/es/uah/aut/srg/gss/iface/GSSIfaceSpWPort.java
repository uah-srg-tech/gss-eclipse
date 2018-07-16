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
package es.uah.aut.srg.gss.iface;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Iface Sp WPort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getLink <em>Link</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getWritingPort <em>Writing Port</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getReadingPort <em>Reading Port</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSpWPort()
 * @model
 * @generated
 */
public interface GSSIfaceSpWPort extends GSSIfacePort {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSIfaceSpWPortType)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSpWPort_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfaceSpWPortType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceSpWPortType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSIfaceSpWPortType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSIfaceSpWPortType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSIfaceSpWPortType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' attribute.
	 * @see #setLink(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSpWPort_Link()
	 * @model required="true"
	 * @generated
	 */
	String getLink();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getLink <em>Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' attribute.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(String value);

	/**
	 * Returns the value of the '<em><b>Writing Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writing Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writing Port</em>' attribute.
	 * @see #setWritingPort(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSpWPort_WritingPort()
	 * @model required="true"
	 * @generated
	 */
	String getWritingPort();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWPort#getWritingPort <em>Writing Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writing Port</em>' attribute.
	 * @see #getWritingPort()
	 * @generated
	 */
	void setWritingPort(String value);

	/**
	 * Returns the value of the '<em><b>Reading Port</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.iface.GSSIfaceReadingPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reading Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Port</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSpWPort_ReadingPort()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<GSSIfaceReadingPort> getReadingPort();

} // GSSIfaceSpWPort
