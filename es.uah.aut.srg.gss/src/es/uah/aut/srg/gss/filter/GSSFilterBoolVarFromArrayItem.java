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

import es.uah.aut.srg.gss.format.GSSFormatAIField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var From Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem()
 * @model
 * @generated
 */
public interface GSSFilterBoolVarFromArrayItem extends GSSFilterAbstractBoolVar {
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_ConstantType()
	 * @model required="true"
	 * @generated
	 */
	GSSFilterConstantType getConstantType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstantType
	 * @see #getConstantType()
	 * @generated
	 */
	void setConstantType(GSSFilterConstantType value);

	/**
	 * Returns the value of the '<em><b>AI Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AI Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AI Field Ref</em>' reference.
	 * @see #setAIFieldRef(GSSFormatAIField)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_AIFieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatAIField getAIFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AI Field Ref</em>' reference.
	 * @see #getAIFieldRef()
	 * @generated
	 */
	void setAIFieldRef(GSSFormatAIField value);

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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_Value()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterValue getValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(GSSFilterValue value);

} // GSSFilterBoolVarFromArrayItem
