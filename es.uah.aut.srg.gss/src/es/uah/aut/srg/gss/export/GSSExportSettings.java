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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromConst <em>Setting From Const</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromSize <em>Setting From Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromFile <em>Setting From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingFromField <em>Setting From Field</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingAIFromConst <em>Setting AI From Const</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettings#getSettingAIFromFile <em>Setting AI From File</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettings()
 * @model
 * @generated
 */
public interface GSSExportSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Setting From Const</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSettingFromConst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From Const</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From Const</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettings_SettingFromConst()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSettingFromConst> getSettingFromConst();

	/**
	 * Returns the value of the '<em><b>Setting From Size</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSettingFromSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From Size</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From Size</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettings_SettingFromSize()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSettingFromSize> getSettingFromSize();

	/**
	 * Returns the value of the '<em><b>Setting From File</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From File</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettings_SettingFromFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSettingFromFile> getSettingFromFile();

	/**
	 * Returns the value of the '<em><b>Setting From Field</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSettingFromField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From Field</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettings_SettingFromField()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSettingFromField> getSettingFromField();

	/**
	 * Returns the value of the '<em><b>Setting AI From Const</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting AI From Const</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting AI From Const</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettings_SettingAIFromConst()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSettingAIFromConst> getSettingAIFromConst();

	/**
	 * Returns the value of the '<em><b>Setting AI From File</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting AI From File</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting AI From File</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettings_SettingAIFromFile()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSettingAIFromFile> getSettingAIFromFile();

} // GSSExportSettings
