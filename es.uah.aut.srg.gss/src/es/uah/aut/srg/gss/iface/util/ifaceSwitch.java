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
package es.uah.aut.srg.gss.iface.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.iface.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.iface.ifacePackage
 * @generated
 */
public class ifaceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ifacePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ifaceSwitch() {
		if (modelPackage == null) {
			modelPackage = ifacePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ifacePackage.GSS_IFACE_PORT_CONFIG: {
				GSSIfacePortConfig gssIfacePortConfig = (GSSIfacePortConfig)theEObject;
				T result = caseGSSIfacePortConfig(gssIfacePortConfig);
				if (result == null) result = caseGSSModelElement(gssIfacePortConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_PORT: {
				GSSIfacePort gssIfacePort = (GSSIfacePort)theEObject;
				T result = caseGSSIfacePort(gssIfacePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_SP_WPORT: {
				GSSIfaceSpWPort gssIfaceSpWPort = (GSSIfaceSpWPort)theEObject;
				T result = caseGSSIfaceSpWPort(gssIfaceSpWPort);
				if (result == null) result = caseGSSIfacePort(gssIfaceSpWPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_READING_PORT: {
				GSSIfaceReadingPort gssIfaceReadingPort = (GSSIfaceReadingPort)theEObject;
				T result = caseGSSIfaceReadingPort(gssIfaceReadingPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_UART_PORT: {
				GSSIfaceUartPort gssIfaceUartPort = (GSSIfaceUartPort)theEObject;
				T result = caseGSSIfaceUartPort(gssIfaceUartPort);
				if (result == null) result = caseGSSIfacePort(gssIfaceUartPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_UART_PROTOCOL: {
				GSSIfaceUartProtocol gssIfaceUartProtocol = (GSSIfaceUartProtocol)theEObject;
				T result = caseGSSIfaceUartProtocol(gssIfaceUartProtocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_CONST_SIZE: {
				GSSIfaceConstSize gssIfaceConstSize = (GSSIfaceConstSize)theEObject;
				T result = caseGSSIfaceConstSize(gssIfaceConstSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_SIZE_FIELD_OFFSET: {
				GSSIfaceSizeFieldOffset gssIfaceSizeFieldOffset = (GSSIfaceSizeFieldOffset)theEObject;
				T result = caseGSSIfaceSizeFieldOffset(gssIfaceSizeFieldOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_SIZE_FIELD_TRIM: {
				GSSIfaceSizeFieldTrim gssIfaceSizeFieldTrim = (GSSIfaceSizeFieldTrim)theEObject;
				T result = caseGSSIfaceSizeFieldTrim(gssIfaceSizeFieldTrim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_SYNC_PATTERN: {
				GSSIfaceSyncPattern gssIfaceSyncPattern = (GSSIfaceSyncPattern)theEObject;
				T result = caseGSSIfaceSyncPattern(gssIfaceSyncPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_SP_WTC_PORT: {
				GSSIfaceSpWTCPort gssIfaceSpWTCPort = (GSSIfaceSpWTCPort)theEObject;
				T result = caseGSSIfaceSpWTCPort(gssIfaceSpWTCPort);
				if (result == null) result = caseGSSIfacePort(gssIfaceSpWTCPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ifacePackage.GSS_IFACE_DUMMY_PORT: {
				GSSIfaceDummyPort gssIfaceDummyPort = (GSSIfaceDummyPort)theEObject;
				T result = caseGSSIfaceDummyPort(gssIfaceDummyPort);
				if (result == null) result = caseGSSIfacePort(gssIfaceDummyPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Port Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Port Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfacePortConfig(GSSIfacePortConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfacePort(GSSIfacePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Sp WPort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Sp WPort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceSpWPort(GSSIfaceSpWPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Uart Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Uart Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceUartPort(GSSIfaceUartPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Sp WTC Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Sp WTC Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceSpWTCPort(GSSIfaceSpWTCPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Dummy Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Dummy Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceDummyPort(GSSIfaceDummyPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Reading Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Reading Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceReadingPort(GSSIfaceReadingPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Uart Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Uart Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceUartProtocol(GSSIfaceUartProtocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Const Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Const Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceConstSize(GSSIfaceConstSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Size Field Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Size Field Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceSizeFieldOffset(GSSIfaceSizeFieldOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Size Field Trim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Size Field Trim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceSizeFieldTrim(GSSIfaceSizeFieldTrim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Iface Sync Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Iface Sync Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSIfaceSyncPattern(GSSIfaceSyncPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GSS Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGSSModelElement(GSSModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ifaceSwitch
