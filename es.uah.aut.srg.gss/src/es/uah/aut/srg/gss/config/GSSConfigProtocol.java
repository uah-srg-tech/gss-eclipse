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
package es.uah.aut.srg.gss.config;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeLevel <em>Type Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeOffset <em>Type Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getSubtypeOffset <em>Subtype Offset</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigProtocol()
 * @model
 * @generated
 */
public interface GSSConfigProtocol extends EObject {
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigProtocol_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigProtocol_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Level</em>' attribute.
	 * @see #setTypeLevel(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigProtocol_TypeLevel()
	 * @model required="true"
	 * @generated
	 */
	String getTypeLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeLevel <em>Type Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Level</em>' attribute.
	 * @see #getTypeLevel()
	 * @generated
	 */
	void setTypeLevel(String value);

	/**
	 * Returns the value of the '<em><b>Type Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Offset</em>' attribute.
	 * @see #setTypeOffset(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigProtocol_TypeOffset()
	 * @model required="true"
	 * @generated
	 */
	String getTypeOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getTypeOffset <em>Type Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Offset</em>' attribute.
	 * @see #getTypeOffset()
	 * @generated
	 */
	void setTypeOffset(String value);

	/**
	 * Returns the value of the '<em><b>Subtype Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Offset</em>' attribute.
	 * @see #setSubtypeOffset(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigProtocol_SubtypeOffset()
	 * @model
	 * @generated
	 */
	String getSubtypeOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigProtocol#getSubtypeOffset <em>Subtype Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype Offset</em>' attribute.
	 * @see #getSubtypeOffset()
	 * @generated
	 */
	void setSubtypeOffset(String value);

} // GSSConfigProtocol
