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
package es.uah.aut.srg.gss.export;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Setting From File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getFile <em>File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingFromFile()
 * @model
 * @generated
 */
public interface GSSExportSettingFromFile extends GSSExportSetting {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingFromFile_File()
	 * @model required="true"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingFromFile_Offset()
	 * @model
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingFromFile_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingFromFile_Line()
	 * @model
	 * @generated
	 */
	String getLine();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromFile#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(String value);

} // GSSExportSettingFromFile
