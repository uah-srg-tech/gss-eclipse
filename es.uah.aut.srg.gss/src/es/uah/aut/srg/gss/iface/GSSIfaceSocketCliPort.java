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
 * A representation of the model object '<em><b>GSS Iface Socket Cli Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort#getPortProtocol <em>Port Protocol</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSocketCliPort()
 * @model
 * @generated
 */
public interface GSSIfaceSocketCliPort extends GSSIfacePort {
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSocketCliPort_IpAddress()
	 * @model required="true"
	 * @generated
	 */
	String getIpAddress();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(String value);

	/**
	 * Returns the value of the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Number</em>' attribute.
	 * @see #setPortNumber(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSocketCliPort_PortNumber()
	 * @model required="true"
	 * @generated
	 */
	String getPortNumber();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort#getPortNumber <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Number</em>' attribute.
	 * @see #getPortNumber()
	 * @generated
	 */
	void setPortNumber(String value);

	/**
	 * Returns the value of the '<em><b>Port Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Protocol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Protocol</em>' containment reference.
	 * @see #setPortProtocol(GSSIfacePortProtocol)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceSocketCliPort_PortProtocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfacePortProtocol getPortProtocol();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort#getPortProtocol <em>Port Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Protocol</em>' containment reference.
	 * @see #getPortProtocol()
	 * @generated
	 */
	void setPortProtocol(GSSIfacePortProtocol value);

} // GSSIfaceSocketCliPort
