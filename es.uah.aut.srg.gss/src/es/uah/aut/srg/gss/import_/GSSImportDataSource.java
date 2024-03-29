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
package es.uah.aut.srg.gss.import_;

import es.uah.aut.srg.gss.format.GSSFormatField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Import Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportDataSource#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportDataSource#getLeftTrim <em>Left Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportDataSource#getRightTrim <em>Right Trim</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportDataSource()
 * @model
 * @generated
 */
public interface GSSImportDataSource extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' reference.
	 * @see #setFieldRef(GSSFormatField)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportDataSource_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportDataSource#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(GSSFormatField value);

	/**
	 * Returns the value of the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Trim</em>' attribute.
	 * @see #setLeftTrim(String)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportDataSource_LeftTrim()
	 * @model required="true"
	 * @generated
	 */
	String getLeftTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportDataSource#getLeftTrim <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Trim</em>' attribute.
	 * @see #getLeftTrim()
	 * @generated
	 */
	void setLeftTrim(String value);

	/**
	 * Returns the value of the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Trim</em>' attribute.
	 * @see #setRightTrim(String)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportDataSource_RightTrim()
	 * @model required="true"
	 * @generated
	 */
	String getRightTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportDataSource#getRightTrim <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Trim</em>' attribute.
	 * @see #getRightTrim()
	 * @generated
	 */
	void setRightTrim(String value);

} // GSSImportDataSource
