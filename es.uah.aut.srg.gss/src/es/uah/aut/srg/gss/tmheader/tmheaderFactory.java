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
package es.uah.aut.srg.gss.tmheader;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.tmheader.tmheaderPackage
 * @generated
 */
public interface tmheaderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	tmheaderFactory eINSTANCE = es.uah.aut.srg.gss.tmheader.impl.tmheaderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSSTM Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSSTM Header</em>'.
	 * @generated
	 */
	GSSTMHeader createGSSTMHeader();

	/**
	 * Returns a new object of class '<em>GSSTM Header Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSSTM Header Field</em>'.
	 * @generated
	 */
	GSSTMHeaderField createGSSTMHeaderField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	tmheaderPackage gettmheaderPackage();

} //tmheaderFactory
