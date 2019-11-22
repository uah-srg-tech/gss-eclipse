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

import es.uah.aut.srg.gss.format.GSSFormatField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getOp <em>Op</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstant <em>Constant</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelect <em>Select</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar()
 * @model
 * @generated
 */
public interface GSSFilterBoolVar extends EObject {
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getName <em>Name</em>}' attribute.
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
	 * @see #isSetConstantType()
	 * @see #unsetConstantType()
	 * @see #setConstantType(GSSFilterConstantType)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_ConstantType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFilterConstantType getConstantType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.filter.GSSFilterConstantType
	 * @see #isSetConstantType()
	 * @see #unsetConstantType()
	 * @see #getConstantType()
	 * @generated
	 */
	void setConstantType(GSSFilterConstantType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstantType <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstantType()
	 * @see #getConstantType()
	 * @see #setConstantType(GSSFilterConstantType)
	 * @generated
	 */
	void unsetConstantType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstantType <em>Constant Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constant Type</em>' attribute is set.
	 * @see #unsetConstantType()
	 * @see #getConstantType()
	 * @see #setConstantType(GSSFilterConstantType)
	 * @generated
	 */
	boolean isSetConstantType();

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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(GSSFormatField value);

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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_Op()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFilterFieldOp getOp();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getOp <em>Op</em>}' containment reference.
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_Constant()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterConstant getConstant();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getConstant <em>Constant</em>}' containment reference.
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_Select()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterSelect getSelect();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelect <em>Select</em>}' containment reference.
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
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVar_SelectLine()
	 * @model containment="true"
	 * @generated
	 */
	GSSFilterSelectLine getSelectLine();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVar#getSelectLine <em>Select Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Line</em>' containment reference.
	 * @see #getSelectLine()
	 * @generated
	 */
	void setSelectLine(GSSFilterSelectLine value);

} // GSSFilterBoolVar
