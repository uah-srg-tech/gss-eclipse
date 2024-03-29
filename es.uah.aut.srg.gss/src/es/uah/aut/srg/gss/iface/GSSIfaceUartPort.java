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
 * A representation of the model object '<em><b>GSS Iface Uart Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getNumber <em>Number</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getParity <em>Parity</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getDataBits <em>Data Bits</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getStopBits <em>Stop Bits</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getFlowControl <em>Flow Control</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getPortProtocol <em>Port Protocol</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort()
 * @model
 * @generated
 */
public interface GSSIfaceUartPort extends GSSIfacePort {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_Number()
	 * @model required="true"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Baud Rate</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baud Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baud Rate</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate
	 * @see #isSetBaudRate()
	 * @see #unsetBaudRate()
	 * @see #setBaudRate(GSSIfaceUartPortBaudRate)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_BaudRate()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfaceUartPortBaudRate getBaudRate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate
	 * @see #isSetBaudRate()
	 * @see #unsetBaudRate()
	 * @see #getBaudRate()
	 * @generated
	 */
	void setBaudRate(GSSIfaceUartPortBaudRate value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBaudRate()
	 * @see #getBaudRate()
	 * @see #setBaudRate(GSSIfaceUartPortBaudRate)
	 * @generated
	 */
	void unsetBaudRate();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getBaudRate <em>Baud Rate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Baud Rate</em>' attribute is set.
	 * @see #unsetBaudRate()
	 * @see #getBaudRate()
	 * @see #setBaudRate(GSSIfaceUartPortBaudRate)
	 * @generated
	 */
	boolean isSetBaudRate();

	/**
	 * Returns the value of the '<em><b>Parity</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parity</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity
	 * @see #isSetParity()
	 * @see #unsetParity()
	 * @see #setParity(GSSIfaceUartPortParity)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_Parity()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfaceUartPortParity getParity();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getParity <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity
	 * @see #isSetParity()
	 * @see #unsetParity()
	 * @see #getParity()
	 * @generated
	 */
	void setParity(GSSIfaceUartPortParity value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getParity <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetParity()
	 * @see #getParity()
	 * @see #setParity(GSSIfaceUartPortParity)
	 * @generated
	 */
	void unsetParity();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getParity <em>Parity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parity</em>' attribute is set.
	 * @see #unsetParity()
	 * @see #getParity()
	 * @see #setParity(GSSIfaceUartPortParity)
	 * @generated
	 */
	boolean isSetParity();

	/**
	 * Returns the value of the '<em><b>Data Bits</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Bits</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits
	 * @see #isSetDataBits()
	 * @see #unsetDataBits()
	 * @see #setDataBits(GSSIfaceUartPortDataBits)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_DataBits()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfaceUartPortDataBits getDataBits();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getDataBits <em>Data Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Bits</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits
	 * @see #isSetDataBits()
	 * @see #unsetDataBits()
	 * @see #getDataBits()
	 * @generated
	 */
	void setDataBits(GSSIfaceUartPortDataBits value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getDataBits <em>Data Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataBits()
	 * @see #getDataBits()
	 * @see #setDataBits(GSSIfaceUartPortDataBits)
	 * @generated
	 */
	void unsetDataBits();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getDataBits <em>Data Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Bits</em>' attribute is set.
	 * @see #unsetDataBits()
	 * @see #getDataBits()
	 * @see #setDataBits(GSSIfaceUartPortDataBits)
	 * @generated
	 */
	boolean isSetDataBits();

	/**
	 * Returns the value of the '<em><b>Stop Bits</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Bits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Bits</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits
	 * @see #isSetStopBits()
	 * @see #unsetStopBits()
	 * @see #setStopBits(GSSIfaceUartPortStopBits)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_StopBits()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfaceUartPortStopBits getStopBits();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getStopBits <em>Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Bits</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits
	 * @see #isSetStopBits()
	 * @see #unsetStopBits()
	 * @see #getStopBits()
	 * @generated
	 */
	void setStopBits(GSSIfaceUartPortStopBits value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getStopBits <em>Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStopBits()
	 * @see #getStopBits()
	 * @see #setStopBits(GSSIfaceUartPortStopBits)
	 * @generated
	 */
	void unsetStopBits();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getStopBits <em>Stop Bits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Stop Bits</em>' attribute is set.
	 * @see #unsetStopBits()
	 * @see #getStopBits()
	 * @see #setStopBits(GSSIfaceUartPortStopBits)
	 * @generated
	 */
	boolean isSetStopBits();

	/**
	 * Returns the value of the '<em><b>Flow Control</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Control</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl
	 * @see #isSetFlowControl()
	 * @see #unsetFlowControl()
	 * @see #setFlowControl(GSSIfaceUartPortFlowControl)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_FlowControl()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSIfaceUartPortFlowControl getFlowControl();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getFlowControl <em>Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Control</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortFlowControl
	 * @see #isSetFlowControl()
	 * @see #unsetFlowControl()
	 * @see #getFlowControl()
	 * @generated
	 */
	void setFlowControl(GSSIfaceUartPortFlowControl value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getFlowControl <em>Flow Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlowControl()
	 * @see #getFlowControl()
	 * @see #setFlowControl(GSSIfaceUartPortFlowControl)
	 * @generated
	 */
	void unsetFlowControl();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getFlowControl <em>Flow Control</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Flow Control</em>' attribute is set.
	 * @see #unsetFlowControl()
	 * @see #getFlowControl()
	 * @see #setFlowControl(GSSIfaceUartPortFlowControl)
	 * @generated
	 */
	boolean isSetFlowControl();

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
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_PortProtocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfacePortProtocol getPortProtocol();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getPortProtocol <em>Port Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Protocol</em>' containment reference.
	 * @see #getPortProtocol()
	 * @generated
	 */
	void setPortProtocol(GSSIfacePortProtocol value);

} // GSSIfaceUartPort
