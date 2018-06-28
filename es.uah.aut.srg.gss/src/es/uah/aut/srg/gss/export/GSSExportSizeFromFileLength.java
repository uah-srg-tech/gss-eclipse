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
 * A representation of the model object '<em><b>GSS Export Size From File Length</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getFromFile <em>From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getSettingFromConst <em>Setting From Const</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeFromFileLength()
 * @model
 * @generated
 */
public interface GSSExportSizeFromFileLength extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeFromFileLength_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From File</em>' attribute.
	 * @see #setFromFile(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeFromFileLength_FromFile()
	 * @model required="true"
	 * @generated
	 */
	String getFromFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getFromFile <em>From File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From File</em>' attribute.
	 * @see #getFromFile()
	 * @generated
	 */
	void setFromFile(String value);

	/**
	 * Returns the value of the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Size</em>' attribute.
	 * @see #setAddSize(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeFromFileLength_AddSize()
	 * @model
	 * @generated
	 */
	String getAddSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getAddSize <em>Add Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Size</em>' attribute.
	 * @see #getAddSize()
	 * @generated
	 */
	void setAddSize(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.export.GSSExportUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.export.GSSExportUnit
	 * @see #setUnit(GSSExportUnit)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeFromFileLength_Unit()
	 * @model
	 * @generated
	 */
	GSSExportUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.export.GSSExportUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GSSExportUnit value);

	/**
	 * Returns the value of the '<em><b>Setting From Const</b></em>' reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSettingFromConst}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Setting From Const</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setting From Const</em>' reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeFromFileLength_SettingFromConst()
	 * @model
	 * @generated
	 */
	EList<GSSExportSettingFromConst> getSettingFromConst();

} // GSSExportSizeFromFileLength
