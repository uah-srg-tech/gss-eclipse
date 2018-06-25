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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.iface.ifacePackage
 * @generated
 */
public interface ifaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ifaceFactory eINSTANCE = es.uah.aut.srg.gss.iface.impl.ifaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Iface Port Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Port Config</em>'.
	 * @generated
	 */
	GSSIfacePortConfig createGSSIfacePortConfig();

	/**
	 * Returns a new object of class '<em>GSS Iface Sp WPort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Sp WPort</em>'.
	 * @generated
	 */
	GSSIfaceSpWPort createGSSIfaceSpWPort();

	/**
	 * Returns a new object of class '<em>GSS Iface Uart Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Uart Port</em>'.
	 * @generated
	 */
	GSSIfaceUartPort createGSSIfaceUartPort();

	/**
	 * Returns a new object of class '<em>GSS Iface Sp WTC Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Sp WTC Port</em>'.
	 * @generated
	 */
	GSSIfaceSpWTCPort createGSSIfaceSpWTCPort();

	/**
	 * Returns a new object of class '<em>GSS Iface Dummy Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Dummy Port</em>'.
	 * @generated
	 */
	GSSIfaceDummyPort createGSSIfaceDummyPort();

	/**
	 * Returns a new object of class '<em>GSS Iface Reading Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Reading Port</em>'.
	 * @generated
	 */
	GSSIfaceReadingPort createGSSIfaceReadingPort();

	/**
	 * Returns a new object of class '<em>GSS Iface Uart Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Uart Protocol</em>'.
	 * @generated
	 */
	GSSIfaceUartProtocol createGSSIfaceUartProtocol();

	/**
	 * Returns a new object of class '<em>GSS Iface Const Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Const Size</em>'.
	 * @generated
	 */
	GSSIfaceConstSize createGSSIfaceConstSize();

	/**
	 * Returns a new object of class '<em>GSS Iface Size Field Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Size Field Offset</em>'.
	 * @generated
	 */
	GSSIfaceSizeFieldOffset createGSSIfaceSizeFieldOffset();

	/**
	 * Returns a new object of class '<em>GSS Iface Size Field Trim</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Size Field Trim</em>'.
	 * @generated
	 */
	GSSIfaceSizeFieldTrim createGSSIfaceSizeFieldTrim();

	/**
	 * Returns a new object of class '<em>GSS Iface Sync Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Iface Sync Pattern</em>'.
	 * @generated
	 */
	GSSIfaceSyncPattern createGSSIfaceSyncPattern();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ifacePackage getifacePackage();

} //ifaceFactory
