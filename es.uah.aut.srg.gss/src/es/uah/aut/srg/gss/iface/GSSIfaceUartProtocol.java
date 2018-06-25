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
 * A representation of the model object '<em><b>GSS Iface Uart Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getPower <em>Power</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getConstSize <em>Const Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldOffset <em>Size Field Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldTrim <em>Size Field Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSyncPattern <em>Sync Pattern</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartProtocol()
 * @model
 * @generated
 */
public interface GSSIfaceUartProtocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit
	 * @see #setUnit(GSSIfaceUartProtocolUnit)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartProtocol_Unit()
	 * @model required="true"
	 * @generated
	 */
	GSSIfaceUartProtocolUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GSSIfaceUartProtocolUnit value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower
	 * @see #setPower(GSSIfaceUartProtocolPower)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartProtocol_Power()
	 * @model required="true"
	 * @generated
	 */
	GSSIfaceUartProtocolPower getPower();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartProtocolPower
	 * @see #getPower()
	 * @generated
	 */
	void setPower(GSSIfaceUartProtocolPower value);

	/**
	 * Returns the value of the '<em><b>Const Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Size</em>' containment reference.
	 * @see #setConstSize(GSSIfaceConstSize)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartProtocol_ConstSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfaceConstSize getConstSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getConstSize <em>Const Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const Size</em>' containment reference.
	 * @see #getConstSize()
	 * @generated
	 */
	void setConstSize(GSSIfaceConstSize value);

	/**
	 * Returns the value of the '<em><b>Size Field Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Field Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Field Offset</em>' containment reference.
	 * @see #setSizeFieldOffset(GSSIfaceSizeFieldOffset)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartProtocol_SizeFieldOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfaceSizeFieldOffset getSizeFieldOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldOffset <em>Size Field Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Field Offset</em>' containment reference.
	 * @see #getSizeFieldOffset()
	 * @generated
	 */
	void setSizeFieldOffset(GSSIfaceSizeFieldOffset value);

	/**
	 * Returns the value of the '<em><b>Size Field Trim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Field Trim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Field Trim</em>' containment reference.
	 * @see #setSizeFieldTrim(GSSIfaceSizeFieldTrim)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartProtocol_SizeFieldTrim()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfaceSizeFieldTrim getSizeFieldTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSizeFieldTrim <em>Size Field Trim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Field Trim</em>' containment reference.
	 * @see #getSizeFieldTrim()
	 * @generated
	 */
	void setSizeFieldTrim(GSSIfaceSizeFieldTrim value);

	/**
	 * Returns the value of the '<em><b>Sync Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Pattern</em>' containment reference.
	 * @see #setSyncPattern(GSSIfaceSyncPattern)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartProtocol_SyncPattern()
	 * @model containment="true"
	 * @generated
	 */
	GSSIfaceSyncPattern getSyncPattern();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol#getSyncPattern <em>Sync Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Pattern</em>' containment reference.
	 * @see #getSyncPattern()
	 * @generated
	 */
	void setSyncPattern(GSSIfaceSyncPattern value);

} // GSSIfaceUartProtocol
