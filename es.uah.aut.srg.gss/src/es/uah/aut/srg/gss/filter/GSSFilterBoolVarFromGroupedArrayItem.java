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

import es.uah.aut.srg.gss.format.GSSFormatAField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var From Grouped Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromGroupedArrayItem()
 * @model
 * @generated
 */
public interface GSSFilterBoolVarFromGroupedArrayItem extends GSSFilterAbstractBoolVar {
	/**
	 * Returns the value of the '<em><b>Constant Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.filter.GSSFilterConstantType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstantType
	 * @see #setConstantType(GSSFilterConstantType)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromGroupedArrayItem_ConstantType()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterConstantType getConstantType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstantType
	 * @see #getConstantType()
	 * @generated
	 */
	void setConstantType(GSSFilterConstantType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromGroupedArrayItem_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>AI Field Refs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field Refs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field Refs</em>' reference.
	 * @see #setAIFieldRefs(GSSFormatAField)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromGroupedArrayItem_AIFieldRefs()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatAField getAIFieldRefs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getAIFieldRefs <em>AI Field Refs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AI Field Refs</em>' reference.
	 * @see #getAIFieldRefs()
	 * @generated
	 */
	void setAIFieldRefs(GSSFormatAField value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(GSSFilterValue)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromGroupedArrayItem_Value()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterValue getValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromGroupedArrayItem#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(GSSFilterValue value);

} // GSSFilterBoolVarFromGroupedArrayItem
