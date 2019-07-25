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
package es.uah.aut.srg.gss.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Reference Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferenceField()
 * @model
 * @generated
 */
public interface GSSEnvironmentReferenceField extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSEnvironmentReferenceFieldType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferenceField_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentReferenceFieldType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSEnvironmentReferenceFieldType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentReferenceFieldType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSEnvironmentReferenceFieldType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Ref</em>' attribute.
	 * @see #setIfRef(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferenceField_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getIfRef <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Ref</em>' attribute.
	 * @see #getIfRef()
	 * @generated
	 */
	void setIfRef(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferenceField_Level()
	 * @model required="true"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' attribute.
	 * @see #setFieldRef(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferenceField_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	String getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getFieldRef <em>Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' attribute.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(String value);

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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferenceField_Offset()
	 * @model required="true"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getOffset <em>Offset</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferenceField_Size()
	 * @model required="true"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferenceField#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // GSSEnvironmentReferenceField
