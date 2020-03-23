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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Iface Sp WTC Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort#getSpwPortRef <em>Spw Port Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSpWTCPort()
 * @model
 * @generated
 */
public interface GSSIfaceSpWTCPort extends GSSIfacePort {
	/**
	 * Returns the value of the '<em><b>Spw Port Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spw Port Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spw Port Ref</em>' attribute.
	 * @see #setSpwPortRef(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSpWTCPort_SpwPortRef()
	 * @model required="true"
	 * @generated
	 */
	String getSpwPortRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSpWTCPort#getSpwPortRef <em>Spw Port Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spw Port Ref</em>' attribute.
	 * @see #getSpwPortRef()
	 * @generated
	 */
	void setSpwPortRef(String value);

} // GSSIfaceSpWTCPort
