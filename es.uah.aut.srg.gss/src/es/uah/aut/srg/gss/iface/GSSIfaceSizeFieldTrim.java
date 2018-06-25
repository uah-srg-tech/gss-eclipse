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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Iface Size Field Trim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim#getBytes <em>Bytes</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim#getBits <em>Bits</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSizeFieldTrim()
 * @model
 * @generated
 */
public interface GSSIfaceSizeFieldTrim extends EObject {
	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #setBytes(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSizeFieldTrim_Bytes()
	 * @model required="true"
	 * @generated
	 */
	String getBytes();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(String value);

	/**
	 * Returns the value of the '<em><b>Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits</em>' attribute.
	 * @see #setBits(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSizeFieldTrim_Bits()
	 * @model required="true"
	 * @generated
	 */
	String getBits();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSizeFieldTrim#getBits <em>Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits</em>' attribute.
	 * @see #getBits()
	 * @generated
	 */
	void setBits(String value);

} // GSSIfaceSizeFieldTrim
