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
 * A representation of the model object '<em><b>GSS Import Virtual Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportVirtualSize()
 * @model
 * @generated
 */
public interface GSSImportVirtualSize extends EObject {
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
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportVirtualSize_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(GSSFormatField value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(GSSFormatField)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportVirtualSize_To()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatField getTo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(GSSFormatField value);

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
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportVirtualSize_AddSize()
	 * @model
	 * @generated
	 */
	String getAddSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getAddSize <em>Add Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Size</em>' attribute.
	 * @see #getAddSize()
	 * @generated
	 */
	void setAddSize(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.import_.GSSImportUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.import_.GSSImportUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(GSSImportUnit)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportVirtualSize_Unit()
	 * @model unsettable="true"
	 * @generated
	 */
	GSSImportUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.import_.GSSImportUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GSSImportUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(GSSImportUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportVirtualSize#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(GSSImportUnit)
	 * @generated
	 */
	boolean isSetUnit();

} // GSSImportVirtualSize
