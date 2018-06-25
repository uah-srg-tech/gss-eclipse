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
			case ifacePackage.GSS_IFACE_UART_PORT: return createGSSIfaceUartPort();
			case ifacePackage.GSS_IFACE_SP_WTC_PORT: return createGSSIfaceSpWTCPort();
			case ifacePackage.GSS_IFACE_DUMMY_PORT: return createGSSIfaceDummyPort();
			case ifacePackage.GSS_IFACE_READING_PORT: return createGSSIfaceReadingPort();
			case ifacePackage.GSS_IFACE_UART_PROTOCOL: return createGSSIfaceUartProtocol();
			case ifacePackage.GSS_IFACE_CONST_SIZE: return createGSSIfaceConstSize();
			case ifacePackage.GSS_IFACE_SIZE_FIELD_OFFSET: return createGSSIfaceSizeFieldOffset();
			case ifacePackage.GSS_IFACE_SIZE_FIELD_TRIM: return createGSSIfaceSizeFieldTrim();
			case ifacePackage.GSS_IFACE_SYNC_PATTERN: return createGSSIfaceSyncPattern();
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
			case ifacePackage.GSS_IFACE_UART_PROTOCOL_UNIT:
				return createGSSIfaceUartProtocolUnitFromString(eDataType, initialValue);
			case ifacePackage.GSS_IFACE_UART_PROTOCOL_POWER:
				return createGSSIfaceUartProtocolPowerFromString(eDataType, initialValue);
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
			case ifacePackage.GSS_IFACE_UART_PROTOCOL_UNIT:
				return convertGSSIfaceUartProtocolUnitToString(eDataType, instanceValue);
			case ifacePackage.GSS_IFACE_UART_PROTOCOL_POWER:
				return convertGSSIfaceUartProtocolPowerToString(eDataType, instanceValue);
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
	public GSSIfaceUartProtocol createGSSIfaceUartProtocol() {
		GSSIfaceUartProtocolImpl gssIfaceUartProtocol = new GSSIfaceUartProtocolImpl();
		return gssIfaceUartProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceConstSize createGSSIfaceConstSize() {
		GSSIfaceConstSizeImpl gssIfaceConstSize = new GSSIfaceConstSizeImpl();
		return gssIfaceConstSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSizeFieldOffset createGSSIfaceSizeFieldOffset() {
		GSSIfaceSizeFieldOffsetImpl gssIfaceSizeFieldOffset = new GSSIfaceSizeFieldOffsetImpl();
		return gssIfaceSizeFieldOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceSizeFieldTrim createGSSIfaceSizeFieldTrim() {
		GSSIfaceSizeFieldTrimImpl gssIfaceSizeFieldTrim = new GSSIfaceSizeFieldTrimImpl();
		return gssIfaceSizeFieldTrim;
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
	public GSSIfaceUartProtocolUnit createGSSIfaceUartProtocolUnitFromString(EDataType eDataType, String initialValue) {
		GSSIfaceUartProtocolUnit result = GSSIfaceUartProtocolUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceUartProtocolUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSIfaceUartProtocolPower createGSSIfaceUartProtocolPowerFromString(EDataType eDataType, String initialValue) {
		GSSIfaceUartProtocolPower result = GSSIfaceUartProtocolPower.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSSIfaceUartProtocolPowerToString(EDataType eDataType, Object instanceValue) {
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
