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
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getInputQueueSize <em>Input Queue Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getOutputQueueSize <em>Output Queue Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getUartProtocol <em>Uart Protocol</em>}</li>
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
	 * @see #setBaudRate(GSSIfaceUartPortBaudRate)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_BaudRate()
	 * @model required="true"
	 * @generated
	 */
	GSSIfaceUartPortBaudRate getBaudRate();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getBaudRate <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baud Rate</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate
	 * @see #getBaudRate()
	 * @generated
	 */
	void setBaudRate(GSSIfaceUartPortBaudRate value);

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
	 * @see #setParity(GSSIfaceUartPortParity)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_Parity()
	 * @model required="true"
	 * @generated
	 */
	GSSIfaceUartPortParity getParity();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getParity <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parity</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity
	 * @see #getParity()
	 * @generated
	 */
	void setParity(GSSIfaceUartPortParity value);

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
	 * @see #setDataBits(GSSIfaceUartPortDataBits)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_DataBits()
	 * @model required="true"
	 * @generated
	 */
	GSSIfaceUartPortDataBits getDataBits();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getDataBits <em>Data Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Bits</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits
	 * @see #getDataBits()
	 * @generated
	 */
	void setDataBits(GSSIfaceUartPortDataBits value);

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
	 * @see #setStopBits(GSSIfaceUartPortStopBits)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_StopBits()
	 * @model required="true"
	 * @generated
	 */
	GSSIfaceUartPortStopBits getStopBits();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getStopBits <em>Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Bits</em>' attribute.
	 * @see es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits
	 * @see #getStopBits()
	 * @generated
	 */
	void setStopBits(GSSIfaceUartPortStopBits value);

	/**
	 * Returns the value of the '<em><b>Input Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Queue Size</em>' attribute.
	 * @see #setInputQueueSize(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_InputQueueSize()
	 * @model required="true"
	 * @generated
	 */
	String getInputQueueSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getInputQueueSize <em>Input Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Queue Size</em>' attribute.
	 * @see #getInputQueueSize()
	 * @generated
	 */
	void setInputQueueSize(String value);

	/**
	 * Returns the value of the '<em><b>Output Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Queue Size</em>' attribute.
	 * @see #setOutputQueueSize(String)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_OutputQueueSize()
	 * @model required="true"
	 * @generated
	 */
	String getOutputQueueSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getOutputQueueSize <em>Output Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Queue Size</em>' attribute.
	 * @see #getOutputQueueSize()
	 * @generated
	 */
	void setOutputQueueSize(String value);

	/**
	 * Returns the value of the '<em><b>Uart Protocol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uart Protocol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uart Protocol</em>' containment reference.
	 * @see #setUartProtocol(GSSIfaceUartProtocol)
	 * @see es.uah.aut.srg.gss.iface.ifacePackage#getGSSIfaceUartPort_UartProtocol()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSIfaceUartProtocol getUartProtocol();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.iface.GSSIfaceUartPort#getUartProtocol <em>Uart Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uart Protocol</em>' containment reference.
	 * @see #getUartProtocol()
	 * @generated
	 */
	void setUartProtocol(GSSIfaceUartProtocol value);

} // GSSIfaceUartPort
