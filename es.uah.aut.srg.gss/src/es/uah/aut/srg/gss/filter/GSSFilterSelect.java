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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getFromFile <em>From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelect()
 * @model
 * @generated
 */
public interface GSSFilterSelect extends GSSFilterValue {
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelect_FromFile()
	 * @model required="true"
	 * @generated
	 */
	String getFromFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getFromFile <em>From File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From File</em>' attribute.
	 * @see #getFromFile()
	 * @generated
	 */
	void setFromFile(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.filter.GSSFilterSelectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSFilterSelectType)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelect_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFilterSelectType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterSelectType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSFilterSelectType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSFilterSelectType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSFilterSelectType)
	 * @generated
	 */
	boolean isSetType();

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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelect_Offset()
	 * @model
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getOffset <em>Offset</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelect_Size()
	 * @model
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelect#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // GSSFilterSelect
