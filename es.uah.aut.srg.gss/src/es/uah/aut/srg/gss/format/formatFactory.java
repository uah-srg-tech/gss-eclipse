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
package es.uah.aut.srg.gss.format;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.format.formatPackage
 * @generated
 */
public interface formatFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	formatFactory eINSTANCE = es.uah.aut.srg.gss.format.impl.formatFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Format Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Format</em>'.
	 * @generated
	 */
	GSSFormatFormat createGSSFormatFormat();

	/**
	 * Returns a new object of class '<em>GSS Format CS Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format CS Field</em>'.
	 * @generated
	 */
	GSSFormatCSField createGSSFormatCSField();

	/**
	 * Returns a new object of class '<em>GSS Format CS Formula Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format CS Formula Field</em>'.
	 * @generated
	 */
	GSSFormatCSFormulaField createGSSFormatCSFormulaField();

	/**
	 * Returns a new object of class '<em>GSS Format VS Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format VS Field</em>'.
	 * @generated
	 */
	GSSFormatVSField createGSSFormatVSField();

	/**
	 * Returns a new object of class '<em>GSS Format VR Field Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format VR Field Size</em>'.
	 * @generated
	 */
	GSSFormatVRFieldSize createGSSFormatVRFieldSize();

	/**
	 * Returns a new object of class '<em>GSS Format FDIC Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format FDIC Field</em>'.
	 * @generated
	 */
	GSSFormatFDICField createGSSFormatFDICField();

	/**
	 * Returns a new object of class '<em>GSS Format AField</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format AField</em>'.
	 * @generated
	 */
	GSSFormatAField createGSSFormatAField();

	/**
	 * Returns a new object of class '<em>GSS Format AI Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format AI Field</em>'.
	 * @generated
	 */
	GSSFormatAIField createGSSFormatAIField();

	/**
	 * Returns a new object of class '<em>GSS Format Bytes Bits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Bytes Bits</em>'.
	 * @generated
	 */
	GSSFormatBytesBits createGSSFormatBytesBits();

	/**
	 * Returns a new object of class '<em>GSS Format Formula</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Formula</em>'.
	 * @generated
	 */
	GSSFormatFormula createGSSFormatFormula();

	/**
	 * Returns a new object of class '<em>GSS Format Variable Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Variable Size</em>'.
	 * @generated
	 */
	GSSFormatVariableSize createGSSFormatVariableSize();

	/**
	 * Returns a new object of class '<em>GSS Format Floating Offset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Floating Offset</em>'.
	 * @generated
	 */
	GSSFormatFloatingOffset createGSSFormatFloatingOffset();

	/**
	 * Returns a new object of class '<em>GSS Format Sorted Fields To Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Sorted Fields To Check</em>'.
	 * @generated
	 */
	GSSFormatSortedFieldsToCheck createGSSFormatSortedFieldsToCheck();

	/**
	 * Returns a new object of class '<em>GSS Format Field To Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Field To Check</em>'.
	 * @generated
	 */
	GSSFormatFieldToCheck createGSSFormatFieldToCheck();

	/**
	 * Returns a new object of class '<em>GSS Format Array Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Array Dimension</em>'.
	 * @generated
	 */
	GSSFormatArrayDimension createGSSFormatArrayDimension();

	/**
	 * Returns a new object of class '<em>GSS Format Array Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Format Array Ref</em>'.
	 * @generated
	 */
	GSSFormatArrayRef createGSSFormatArrayRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	formatPackage getformatPackage();

} //formatFactory
