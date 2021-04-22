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

import es.uah.aut.srg.gss.iface.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ifaceFactoryImpl extends EFactoryImpl implements ifaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ifaceFactory init() {
		try {
			ifaceFactory theifaceFactory = (ifaceFactory)EPackage.Registry.INSTANCE.getEFactory(ifacePackage.eNS_URI);
			if (theifaceFactory != null) {
				return theifaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ifaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ifaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ifacePackage.GSS_IFACE_PORT_CONFIG: return createGSSIfacePortConfig();
			case ifacePackage.GSS_IFACE_SP_WPORT: return createGSSIfaceSpWPort();
			case ifacePackage.GSS_IFACE_READING_PORT: return createGSSIfaceReadingPort();
			case ifacePackage.GSS_IFACE_UART_PORT: return createGSSIfaceUartPort();
			case ifacePackage.GSS_IFACE_SOCKET_SRV_PORT: return createGSSIfaceSocketSrvPort();
			case ifacePackage.GSS_IFACE_SOCKET_CLI_PORT: return createGSSIfaceSocketCliPort();
			case ifacePackage.GSS_IFACE_PORT_PROTOCOL: return createGSSIfacePortProtocol();
			case ifacePackage.GSS_IFACE_SIZE: return createGSSIfaceSize();
			case ifacePackage.GSS_IFACE_SYNC_PATTERN: return createGSSIfaceSyncPattern();
			case ifacePackage.GSS_IFACE_SP_WTC_PORT: return createGSSIfaceSpWTCPort();
			case ifacePackage.GSS_IFACE_DUMMY_PORT: return createGSSIfaceDummyPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ifacePackage.GSS_IFACE_SP_WPORT_TYPE:
				return createGSSIfaceSpWPortTypeFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_UART_PORT_BAUD_RATE:
				return createGSSIfaceUartPortBaudRateFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_UART_PORT_PARITY:
				return createGSSIfaceUartPortParityFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_UART_PORT_DATA_BITS:
				return createGSSIfaceUartPortDataBitsFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_UART_PORT_STOP_BITS:
				return createGSSIfaceUartPortStopBitsFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_UART_PORT_FLOW_CONTROL:
				return createGSSIfaceUartPortFlowControlFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_PORT_PROTOCOL_UNIT:
				return createGSSIfacePortProtocolUnitFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_PORT_PROTOCOL_POWER:
				return createGSSIfacePortProtocolPowerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ifacePackage.GSS_IFACE_SP_WPORT_TYPE:
				return convertGSSIfaceSpWPortTypeToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_UART_PORT_BAUD_RATE:
				return convertGSSIfaceUartPortBaudRateToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_UART_PORT_PARITY:
				return convertGSSIfaceUartPortParityToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_UART_PORT_DATA_BITS:
				return convertGSSIfaceUartPortDataBitsToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_UART_PORT_STOP_BITS:
				return convertGSSIfaceUartPortStopBitsToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_UART_PORT_FLOW_CONTROL:
				return convertGSSIfaceUartPortFlowControlToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_PORT_PROTOCOL_UNIT:
				return convertGSSIfacePortProtocolUnitToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_PORT_PROTOCOL_POWER:
				return convertGSSIfacePortProtocolPowerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePortConfig createGSSIfacePortConfig() {
		GSSIfacePortConfigImpl gssIfacePortConfig = new GSSIfacePortConfigImpl();
		return gssIfacePortConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSpWPort createGSSIfaceSpWPort() {
		GSSIfaceSpWPortImpl gssIfaceSpWPort = new GSSIfaceSpWPortImpl();
		return gssIfaceSpWPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPort createGSSIfaceUartPort() {
		GSSIfaceUartPortImpl gssIfaceUartPort = new GSSIfaceUartPortImpl();
		return gssIfaceUartPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSocketSrvPort createGSSIfaceSocketSrvPort() {
		GSSIfaceSocketSrvPortImpl gssIfaceSocketSrvPort = new GSSIfaceSocketSrvPortImpl();
		return gssIfaceSocketSrvPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSocketCliPort createGSSIfaceSocketCliPort() {
		GSSIfaceSocketCliPortImpl gssIfaceSocketCliPort = new GSSIfaceSocketCliPortImpl();
		return gssIfaceSocketCliPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePortProtocol createGSSIfacePortProtocol() {
		GSSIfacePortProtocolImpl gssIfacePortProtocol = new GSSIfacePortProtocolImpl();
		return gssIfacePortProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSpWTCPort createGSSIfaceSpWTCPort() {
		GSSIfaceSpWTCPortImpl gssIfaceSpWTCPort = new GSSIfaceSpWTCPortImpl();
		return gssIfaceSpWTCPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceDummyPort createGSSIfaceDummyPort() {
		GSSIfaceDummyPortImpl gssIfaceDummyPort = new GSSIfaceDummyPortImpl();
		return gssIfaceDummyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceReadingPort createGSSIfaceReadingPort() {
		GSSIfaceReadingPortImpl gssIfaceReadingPort = new GSSIfaceReadingPortImpl();
		return gssIfaceReadingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSize createGSSIfaceSize() {
		GSSIfaceSizeImpl gssIfaceSize = new GSSIfaceSizeImpl();
		return gssIfaceSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSyncPattern createGSSIfaceSyncPattern() {
		GSSIfaceSyncPatternImpl gssIfaceSyncPattern = new GSSIfaceSyncPatternImpl();
		return gssIfaceSyncPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSpWPortType createGSSIfaceSpWPortTypeFromString(EDataType eDataType, String initialValue) {
		GSSIfaceSpWPortType result = GSSIfaceSpWPortType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceSpWPortTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortBaudRate createGSSIfaceUartPortBaudRateFromString(EDataType eDataType, String initialValue) {
		GSSIfaceUartPortBaudRate result = GSSIfaceUartPortBaudRate.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceUartPortBaudRateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortParity createGSSIfaceUartPortParityFromString(EDataType eDataType, String initialValue) {
		GSSIfaceUartPortParity result = GSSIfaceUartPortParity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceUartPortParityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortDataBits createGSSIfaceUartPortDataBitsFromString(EDataType eDataType, String initialValue) {
		GSSIfaceUartPortDataBits result = GSSIfaceUartPortDataBits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceUartPortDataBitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortStopBits createGSSIfaceUartPortStopBitsFromString(EDataType eDataType, String initialValue) {
		GSSIfaceUartPortStopBits result = GSSIfaceUartPortStopBits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceUartPortStopBitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartPortFlowControl createGSSIfaceUartPortFlowControlFromString(EDataType eDataType, String initialValue) {
		GSSIfaceUartPortFlowControl result = GSSIfaceUartPortFlowControl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceUartPortFlowControlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePortProtocolUnit createGSSIfacePortProtocolUnitFromString(EDataType eDataType, String initialValue) {
		GSSIfacePortProtocolUnit result = GSSIfacePortProtocolUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfacePortProtocolUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfacePortProtocolPower createGSSIfacePortProtocolPowerFromString(EDataType eDataType, String initialValue) {
		GSSIfacePortProtocolPower result = GSSIfacePortProtocolPower.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfacePortProtocolPowerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ifacePackage getifacePackage() {
		return (ifacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ifacePackage getPackage() {
		return ifacePackage.eINSTANCE;
	}

} //ifaceFactoryImpl
