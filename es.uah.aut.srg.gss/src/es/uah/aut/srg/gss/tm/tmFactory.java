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
package es.uah.aut.srg.gss.tm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.tm.tmPackage
 * @generated
 */
public interface tmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tmFactory eINSTANCE = es.uah.aut.srg.gss.tm.impl.tmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSSTM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSSTM</em>'.
	 * @generated
	 */
	GSSTM createGSSTM();

	/**
	 * Returns a new object of class '<em>GSSTM Pi1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSSTM Pi1</em>'.
	 * @generated
	 */
	GSSTMPi1 createGSSTMPi1();

	/**
	 * Returns a new object of class '<em>GSSTM Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSSTM Field</em>'.
	 * @generated
	 */
	GSSTMField createGSSTMField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	tmPackage gettmPackage();

} //tmFactory
