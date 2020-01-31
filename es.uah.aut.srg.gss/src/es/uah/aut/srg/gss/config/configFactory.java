/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.config;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.config.configPackage
 * @generated
 */
public interface configFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	configFactory eINSTANCE = es.uah.aut.srg.gss.config.impl.configFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Config GSS Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Config GSS Config</em>'.
	 * @generated
	 */
	GSSConfigGSSConfig createGSSConfigGSSConfig();

	/**
	 * Returns a new object of class '<em>GSS Config Tests</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Config Tests</em>'.
	 * @generated
	 */
	GSSConfigTests createGSSConfigTests();

	/**
	 * Returns a new object of class '<em>GSS Config Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Config Test Case</em>'.
	 * @generated
	 */
	GSSConfigTestCase createGSSConfigTestCase();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	configPackage getconfigPackage();

} //configFactory
