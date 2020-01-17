/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.filter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.filter.filterPackage
 * @generated
 */
public interface filterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	filterFactory eINSTANCE = es.uah.aut.srg.gss.filter.impl.filterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Filter Maxterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Maxterm Filter</em>'.
	 * @generated
	 */
	GSSFilterMaxtermFilter createGSSFilterMaxtermFilter();

	/**
	 * Returns a new object of class '<em>GSS Filter Minterm Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Minterm Filter</em>'.
	 * @generated
	 */
	GSSFilterMintermFilter createGSSFilterMintermFilter();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var</em>'.
	 * @generated
	 */
	GSSFilterBoolVar createGSSFilterBoolVar();

	/**
	 * Returns a new object of class '<em>GSS Filter Field Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Field Op</em>'.
	 * @generated
	 */
	GSSFilterFieldOp createGSSFilterFieldOp();

	/**
	 * Returns a new object of class '<em>GSS Filter Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Value</em>'.
	 * @generated
	 */
	GSSFilterValue createGSSFilterValue();

	/**
	 * Returns a new object of class '<em>GSS Filter Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Constant</em>'.
	 * @generated
	 */
	GSSFilterConstant createGSSFilterConstant();

	/**
	 * Returns a new object of class '<em>GSS Filter Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Select</em>'.
	 * @generated
	 */
	GSSFilterSelect createGSSFilterSelect();

	/**
	 * Returns a new object of class '<em>GSS Filter Select Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Select Line</em>'.
	 * @generated
	 */
	GSSFilterSelectLine createGSSFilterSelectLine();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var From Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var From Array Item</em>'.
	 * @generated
	 */
	GSSFilterBoolVarFromArrayItem createGSSFilterBoolVarFromArrayItem();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var From Grouped Array Item</em>'.
	 * @generated
	 */
	GSSFilterBoolVarFromGroupedArrayItem createGSSFilterBoolVarFromGroupedArrayItem();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var FDIC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var FDIC</em>'.
	 * @generated
	 */
	GSSFilterBoolVarFDIC createGSSFilterBoolVarFDIC();

	/**
	 * Returns a new object of class '<em>GSS Filter Maxterm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Maxterm</em>'.
	 * @generated
	 */
	GSSFilterMaxterm createGSSFilterMaxterm();

	/**
	 * Returns a new object of class '<em>GSS Filter Minterm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Minterm</em>'.
	 * @generated
	 */
	GSSFilterMinterm createGSSFilterMinterm();

	/**
	 * Returns a new object of class '<em>GSS Filter Bool Var Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Filter Bool Var Ref</em>'.
	 * @generated
	 */
	GSSFilterBoolVarRef createGSSFilterBoolVarRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	filterPackage getfilterPackage();

} //filterFactory
