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
package es.uah.aut.srg.gss.iface.impl;

import es.uah.aut.srg.gss.iface.GSSIfaceUartPort;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortBaudRate;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortDataBits;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortParity;
import es.uah.aut.srg.gss.iface.GSSIfaceUartPortStopBits;
import es.uah.aut.srg.gss.iface.GSSIfaceUartProtocol;
import es.uah.aut.srg.gss.iface.ifacePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Iface Uart Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getBaudRate <em>Baud Rate</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getParity <em>Parity</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getDataBits <em>Data Bits</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getStopBits <em>Stop Bits</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getInputQueueSize <em>Input Queue Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getOutputQueueSize <em>Output Queue Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceUartPortImpl#getUartProtocol <em>Uart Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSIfaceUartPortImpl extends GSSIfacePortImpl implements GSSIfaceUartPort {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected static final GSSIfaceUartPortBaudRate BAUD_RATE_EDEFAULT = GSSIfaceUartPortBaudRate._38400;

	/**
	 * The cached value of the '{@link #getBaudRate() <em>Baud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaudRate()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceUartPortBaudRate baudRate = BAUD_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParity() <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParity()
	 * @generated
	 * @ordered
	 */
	protected static final GSSIfaceUartPortParity PARITY_EDEFAULT = GSSIfaceUartPortParity.NO;

	/**
	 * The cached value of the '{@link #getParity() <em>Parity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParity()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceUartPortParity parity = PARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataBits() <em>Data Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBits()
	 * @generated
	 * @ordered
	 */
	protected static final GSSIfaceUartPortDataBits DATA_BITS_EDEFAULT = GSSIfaceUartPortDataBits._5;

	/**
	 * The cached value of the '{@link #getDataBits() <em>Data Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataBits()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceUartPortDataBits dataBits = DATA_BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopBits() <em>Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBits()
	 * @generated
	 * @ordered
	 */
	protected static final GSSIfaceUartPortStopBits STOP_BITS_EDEFAULT = GSSIfaceUartPortStopBits._1;

	/**
	 * The cached value of the '{@link #getStopBits() <em>Stop Bits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopBits()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceUartPortStopBits stopBits = STOP_BITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputQueueSize() <em>Input Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_QUEUE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputQueueSize() <em>Input Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputQueueSize()
	 * @generated
	 * @ordered
	 */
	protected String inputQueueSize = INPUT_QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputQueueSize() <em>Output Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_QUEUE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputQueueSize() <em>Output Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputQueueSize()
	 * @generated
	 * @ordered
	 */
	protected String outputQueueSize = OUTPUT_QUEUE_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUartProtocol() <em>Uart Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUartProtocol()
	 * @generated
	 * @ordered
	 */
	protected GSSIfaceUartProtocol uartProtocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSIfaceUartPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ifacePackage.Literals.GSS_IFACE_UART_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortBaudRate getBaudRate() {
		return baudRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaudRate(GSSIfaceUartPortBaudRate newBaudRate) {
		GSSIfaceUartPortBaudRate oldBaudRate = baudRate;
		baudRate = newBaudRate == null ? BAUD_RATE_EDEFAULT : newBaudRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__BAUD_RATE, oldBaudRate, baudRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortParity getParity() {
		return parity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParity(GSSIfaceUartPortParity newParity) {
		GSSIfaceUartPortParity oldParity = parity;
		parity = newParity == null ? PARITY_EDEFAULT : newParity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__PARITY, oldParity, parity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortDataBits getDataBits() {
		return dataBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataBits(GSSIfaceUartPortDataBits newDataBits) {
		GSSIfaceUartPortDataBits oldDataBits = dataBits;
		dataBits = newDataBits == null ? DATA_BITS_EDEFAULT : newDataBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__DATA_BITS, oldDataBits, dataBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortStopBits getStopBits() {
		return stopBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopBits(GSSIfaceUartPortStopBits newStopBits) {
		GSSIfaceUartPortStopBits oldStopBits = stopBits;
		stopBits = newStopBits == null ? STOP_BITS_EDEFAULT : newStopBits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__STOP_BITS, oldStopBits, stopBits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputQueueSize() {
		return inputQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputQueueSize(String newInputQueueSize) {
		String oldInputQueueSize = inputQueueSize;
		inputQueueSize = newInputQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__INPUT_QUEUE_SIZE, oldInputQueueSize, inputQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputQueueSize() {
		return outputQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputQueueSize(String newOutputQueueSize) {
		String oldOutputQueueSize = outputQueueSize;
		outputQueueSize = newOutputQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__OUTPUT_QUEUE_SIZE, oldOutputQueueSize, outputQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartProtocol getUartProtocol() {
		return uartProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUartProtocol(GSSIfaceUartProtocol newUartProtocol, NotificationChain msgs) {
		GSSIfaceUartProtocol oldUartProtocol = uartProtocol;
		uartProtocol = newUartProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL, oldUartProtocol, newUartProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUartProtocol(GSSIfaceUartProtocol newUartProtocol) {
		if (newUartProtocol != uartProtocol) {
			NotificationChain msgs = null;
			if (uartProtocol != null)
				msgs = ((InternalEObject)uartProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL, null, msgs);
			if (newUartProtocol != null)
				msgs = ((InternalEObject)newUartProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL, null, msgs);
			msgs = basicSetUartProtocol(newUartProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL, newUartProtocol, newUartProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL:
				return basicSetUartProtocol(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_UART_PORT__NUMBER:
				return getNumber();
			case ifacePackage.GSS_IFACE_UART_PORT__BAUD_RATE:
				return getBaudRate();
			case ifacePackage.GSS_IFACE_UART_PORT__PARITY:
				return getParity();
			case ifacePackage.GSS_IFACE_UART_PORT__DATA_BITS:
				return getDataBits();
			case ifacePackage.GSS_IFACE_UART_PORT__STOP_BITS:
				return getStopBits();
			case ifacePackage.GSS_IFACE_UART_PORT__INPUT_QUEUE_SIZE:
				return getInputQueueSize();
			case ifacePackage.GSS_IFACE_UART_PORT__OUTPUT_QUEUE_SIZE:
				return getOutputQueueSize();
			case ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL:
				return getUartProtocol();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_UART_PORT__NUMBER:
				setNumber((String)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__BAUD_RATE:
				setBaudRate((GSSIfaceUartPortBaudRate)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__PARITY:
				setParity((GSSIfaceUartPortParity)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__DATA_BITS:
				setDataBits((GSSIfaceUartPortDataBits)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__STOP_BITS:
				setStopBits((GSSIfaceUartPortStopBits)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__INPUT_QUEUE_SIZE:
				setInputQueueSize((String)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__OUTPUT_QUEUE_SIZE:
				setOutputQueueSize((String)newValue);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL:
				setUartProtocol((GSSIfaceUartProtocol)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_UART_PORT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__BAUD_RATE:
				setBaudRate(BAUD_RATE_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__PARITY:
				setParity(PARITY_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__DATA_BITS:
				setDataBits(DATA_BITS_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__STOP_BITS:
				setStopBits(STOP_BITS_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__INPUT_QUEUE_SIZE:
				setInputQueueSize(INPUT_QUEUE_SIZE_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__OUTPUT_QUEUE_SIZE:
				setOutputQueueSize(OUTPUT_QUEUE_SIZE_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL:
				setUartProtocol((GSSIfaceUartProtocol)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_UART_PORT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case ifacePackage.GSS_IFACE_UART_PORT__BAUD_RATE:
				return baudRate != BAUD_RATE_EDEFAULT;
			case ifacePackage.GSS_IFACE_UART_PORT__PARITY:
				return parity != PARITY_EDEFAULT;
			case ifacePackage.GSS_IFACE_UART_PORT__DATA_BITS:
				return dataBits != DATA_BITS_EDEFAULT;
			case ifacePackage.GSS_IFACE_UART_PORT__STOP_BITS:
				return stopBits != STOP_BITS_EDEFAULT;
			case ifacePackage.GSS_IFACE_UART_PORT__INPUT_QUEUE_SIZE:
				return INPUT_QUEUE_SIZE_EDEFAULT == null ? inputQueueSize != null : !INPUT_QUEUE_SIZE_EDEFAULT.equals(inputQueueSize);
			case ifacePackage.GSS_IFACE_UART_PORT__OUTPUT_QUEUE_SIZE:
				return OUTPUT_QUEUE_SIZE_EDEFAULT == null ? outputQueueSize != null : !OUTPUT_QUEUE_SIZE_EDEFAULT.equals(outputQueueSize);
			case ifacePackage.GSS_IFACE_UART_PORT__UART_PROTOCOL:
				return uartProtocol != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(", baudRate: ");
		result.append(baudRate);
		result.append(", parity: ");
		result.append(parity);
		result.append(", dataBits: ");
		result.append(dataBits);
		result.append(", stopBits: ");
		result.append(stopBits);
		result.append(", inputQueueSize: ");
		result.append(inputQueueSize);
		result.append(", outputQueueSize: ");
		result.append(outputQueueSize);
		result.append(')');
		return result.toString();
	}

} //GSSIfaceUartPortImpl
