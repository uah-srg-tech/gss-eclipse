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
package es.uah.aut.srg.gss.export;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.export.exportPackage
 * @generated
 */
public interface exportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	exportFactory eINSTANCE = es.uah.aut.srg.gss.export.impl.exportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GSS Export Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Export</em>'.
	 * @generated
	 */
	GSSExportExport createGSSExportExport();

	/**
	 * Returns a new object of class '<em>GSS Export Sizes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Sizes</em>'.
	 * @generated
	 */
	GSSExportSizes createGSSExportSizes();

	/**
	 * Returns a new object of class '<em>GSS Export Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Size</em>'.
	 * @generated
	 */
	GSSExportSize createGSSExportSize();

	/**
	 * Returns a new object of class '<em>GSS Export Size From File Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Size From File Length</em>'.
	 * @generated
	 */
	GSSExportSizeFromFileLength createGSSExportSizeFromFileLength();

	/**
	 * Returns a new object of class '<em>GSS Export Size From File Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Size From File Line</em>'.
	 * @generated
	 */
	GSSExportSizeFromFileLine createGSSExportSizeFromFileLine();

	/**
	 * Returns a new object of class '<em>GSS Export Size In Bits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Size In Bits</em>'.
	 * @generated
	 */
	GSSExportSizeInBits createGSSExportSizeInBits();

	/**
	 * Returns a new object of class '<em>GSS Export Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Settings</em>'.
	 * @generated
	 */
	GSSExportSettings createGSSExportSettings();

	/**
	 * Returns a new object of class '<em>GSS Export Setting</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Setting</em>'.
	 * @generated
	 */
	GSSExportSetting createGSSExportSetting();

	/**
	 * Returns a new object of class '<em>GSS Export Setting From Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Setting From Const</em>'.
	 * @generated
	 */
	GSSExportSettingFromConst createGSSExportSettingFromConst();

	/**
	 * Returns a new object of class '<em>GSS Export Setting From Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Setting From Size</em>'.
	 * @generated
	 */
	GSSExportSettingFromSize createGSSExportSettingFromSize();

	/**
	 * Returns a new object of class '<em>GSS Export Setting From File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Setting From File</em>'.
	 * @generated
	 */
	GSSExportSettingFromFile createGSSExportSettingFromFile();

	/**
	 * Returns a new object of class '<em>GSS Export Setting From Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Setting From Field</em>'.
	 * @generated
	 */
	GSSExportSettingFromField createGSSExportSettingFromField();

	/**
	 * Returns a new object of class '<em>GSS Export Setting AI From File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Setting AI From File</em>'.
	 * @generated
	 */
	GSSExportSettingAIFromFile createGSSExportSettingAIFromFile();

	/**
	 * Returns a new object of class '<em>GSS Export Setting AI From Const</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Setting AI From Const</em>'.
	 * @generated
	 */
	GSSExportSettingAIFromConst createGSSExportSettingAIFromConst();

	/**
	 * Returns a new object of class '<em>GSS Export Activate DI Cs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export Activate DI Cs</em>'.
	 * @generated
	 */
	GSSExportActivateDICs createGSSExportActivateDICs();

	/**
	 * Returns a new object of class '<em>GSS Export DIC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GSS Export DIC</em>'.
	 * @generated
	 */
	GSSExportDIC createGSSExportDIC();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	exportPackage getexportPackage();

} //exportFactory
