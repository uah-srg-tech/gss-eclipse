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
 * A representation of the model object '<em><b>GSS Environment Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getTypeLevel <em>Type Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getSubtype <em>Subtype</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentProtocol()
 * @model
 * @generated
 */
public interface GSSEnvironmentProtocol extends EObject {
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentProtocol_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentProtocol_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getName <em>Name</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentProtocol_TypeLevel()
	 * @model required="true"
	 * @generated
	 */
	String getTypeLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getTypeLevel <em>Type Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Level</em>' attribute.
	 * @see #getTypeLevel()
	 * @generated
	 */
	void setTypeLevel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(GSSEnvironmentProtocolType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentProtocol_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSEnvironmentProtocolType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSEnvironmentProtocolType value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' containment reference.
	 * @see #setSubtype(GSSEnvironmentProtocolType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentProtocol_Subtype()
	 * @model containment="true"
	 * @generated
	 */
	GSSEnvironmentProtocolType getSubtype();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentProtocol#getSubtype <em>Subtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' containment reference.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(GSSEnvironmentProtocolType value);

} // GSSEnvironmentProtocol
