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
 * A representation of the model object '<em><b>GSS Iface Port Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getPower <em>Power</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getConstSize <em>Const Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getSizeFieldOffset <em>Size Field Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getSizeFieldTrim <em>Size Field Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getSyncPattern <em>Sync Pattern</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortProtocol()
 * @model
 * @generated
 */
public interface GSSIfacePortProtocol extends EObject {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocolUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePortProtocolUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(GSSIfacePortProtocolUnit)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortProtocol_Unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfacePortProtocolUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePortProtocolUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GSSIfacePortProtocolUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(GSSIfacePortProtocolUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(GSSIfacePortProtocolUnit)
	 * @generated
	 */
	boolean isSetUnit();

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocolPower}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePortProtocolPower
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #setPower(GSSIfacePortProtocolPower)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortProtocol_Power()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfacePortProtocolPower getPower();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfacePortProtocolPower
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #getPower()
	 * @generated
	 */
	void setPower(GSSIfacePortProtocolPower value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPower()
	 * @see #getPower()
	 * @see #setPower(GSSIfacePortProtocolPower)
	 * @generated
	 */
	void unsetPower();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getPower <em>Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power</em>' attribute is set.
	 * @see #unsetPower()
	 * @see #getPower()
	 * @see #setPower(GSSIfacePortProtocolPower)
	 * @generated
	 */
	boolean isSetPower();

	/**
	 * Returns the value of the '<em><b>Const Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Const Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Const Size</em>' containment reference.
	 * @see #setConstSize(GSSIfaceSize)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortProtocol_ConstSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfaceSize getConstSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getConstSize <em>Const Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Const Size</em>' containment reference.
	 * @see #getConstSize()
	 * @generated
	 */
	void setConstSize(GSSIfaceSize value);

	/**
	 * Returns the value of the '<em><b>Size Field Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Field Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Field Offset</em>' containment reference.
	 * @see #setSizeFieldOffset(GSSIfaceSize)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortProtocol_SizeFieldOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfaceSize getSizeFieldOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getSizeFieldOffset <em>Size Field Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Field Offset</em>' containment reference.
	 * @see #getSizeFieldOffset()
	 * @generated
	 */
	void setSizeFieldOffset(GSSIfaceSize value);

	/**
	 * Returns the value of the '<em><b>Size Field Trim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Field Trim</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Field Trim</em>' containment reference.
	 * @see #setSizeFieldTrim(GSSIfaceSize)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortProtocol_SizeFieldTrim()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfaceSize getSizeFieldTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getSizeFieldTrim <em>Size Field Trim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Field Trim</em>' containment reference.
	 * @see #getSizeFieldTrim()
	 * @generated
	 */
	void setSizeFieldTrim(GSSIfaceSize value);

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
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfacePortProtocol_SyncPattern()
	 * @model containment="true"
	 * @generated
	 */
	GSSIfaceSyncPattern getSyncPattern();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfacePortProtocol#getSyncPattern <em>Sync Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Pattern</em>' containment reference.
	 * @see #getSyncPattern()
	 * @generated
	 */
	void setSyncPattern(GSSIfaceSyncPattern value);

} // GSSIfacePortProtocol
