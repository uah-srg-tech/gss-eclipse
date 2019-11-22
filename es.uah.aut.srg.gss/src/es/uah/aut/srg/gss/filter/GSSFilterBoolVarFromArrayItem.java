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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var From Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getAIFieldRef <em>AI Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getOp <em>Op</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelect <em>Select</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem()
 * @model
 * @generated
 */
public interface GSSFilterBoolVarFromArrayItem extends EObject {
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(GSSFilterFieldOp)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFilterFieldOp getOp();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(GSSFilterFieldOp value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(GSSFilterConstant)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_Constant()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterConstant getConstant();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(GSSFilterConstant value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(GSSFilterSelect)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_Select()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterSelect getSelect();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(GSSFilterSelect value);

	/**
	 * Returns the value of the '<em><b>Select Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Line</em>' containment reference.
	 * @see #setSelectLine(GSSFilterSelectLine)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFromArrayItem_SelectLine()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterSelectLine getSelectLine();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFromArrayItem#getSelectLine <em>Select Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Line</em>' containment reference.
	 * @see #getSelectLine()
	 * @generated
	 */
	void setSelectLine(GSSFilterSelectLine value);

} // GSSFilterBoolVarFromArrayItem
