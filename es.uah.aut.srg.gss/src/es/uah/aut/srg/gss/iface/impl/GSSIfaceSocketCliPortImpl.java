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

import es.uah.aut.srg.gss.iface.GSSIfacePortProtocol;
import es.uah.aut.srg.gss.iface.GSSIfaceSocketCliPort;
import es.uah.aut.srg.gss.iface.ifacePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Iface Socket Cli Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSocketCliPortImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSocketCliPortImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.iface.impl.GSSIfaceSocketCliPortImpl#getPortProtocol <em>Port Protocol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSIfaceSocketCliPortImpl extends GSSIfacePortImpl implements GSSIfaceSocketCliPort {
	/**
	 * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected String ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PORT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected String portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortProtocol() <em>Port Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProtocol()
	 * @generated
	 * @ordered
	 */
	protected GSSIfacePortProtocol portProtocol;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSIfaceSocketCliPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ifacePackage.Literals.GSS_IFACE_SOCKET_CLI_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(String newIpAddress) {
		String oldIpAddress = ipAddress;
		ipAddress = newIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__IP_ADDRESS, oldIpAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(String newPortNumber) {
		String oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePortProtocol getPortProtocol() {
		return portProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortProtocol(GSSIfacePortProtocol newPortProtocol, NotificationChain msgs) {
		GSSIfacePortProtocol oldPortProtocol = portProtocol;
		portProtocol = newPortProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL, oldPortProtocol, newPortProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortProtocol(GSSIfacePortProtocol newPortProtocol) {
		if (newPortProtocol != portProtocol) {
			NotificationChain msgs = null;
			if (portProtocol != null)
				msgs = ((InternalEObject)portProtocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL, null, msgs);
			if (newPortProtocol != null)
				msgs = ((InternalEObject)newPortProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL, null, msgs);
			msgs = basicSetPortProtocol(newPortProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL, newPortProtocol, newPortProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL:
				return basicSetPortProtocol(null, msgs);
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
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__IP_ADDRESS:
				return getIpAddress();
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_NUMBER:
				return getPortNumber();
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL:
				return getPortProtocol();
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
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__IP_ADDRESS:
				setIpAddress((String)newValue);
				return;
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_NUMBER:
				setPortNumber((String)newValue);
				return;
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL:
				setPortProtocol((GSSIfacePortProtocol)newValue);
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
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__IP_ADDRESS:
				setIpAddress(IP_ADDRESS_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
				return;
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL:
				setPortProtocol((GSSIfacePortProtocol)null);
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
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__IP_ADDRESS:
				return IP_ADDRESS_EDEFAULT == null ? ipAddress != null : !IP_ADDRESS_EDEFAULT.equals(ipAddress);
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_NUMBER:
				return PORT_NUMBER_EDEFAULT == null ? portNumber != null : !PORT_NUMBER_EDEFAULT.equals(portNumber);
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT__PORT_PROTOCOL:
				return portProtocol != null;
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
		result.append(" (ipAddress: ");
		result.append(ipAddress);
		result.append(", portNumber: ");
		result.append(portNumber);
		result.append(')');
		return result.toString();
	}

} //GSSIfaceSocketCliPortImpl
