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
 * A representation of the model object '<em><b>GSS Environment Reference Periodic TC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getIdRef <em>Id Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getOffset <em>Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferencePeriodicTC()
 * @model
 * @generated
 */
public interface GSSEnvironmentReferencePeriodicTC extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Ref</em>' reference.
	 * @see #setIdRef(GSSEnvironmentPeriodicTC)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferencePeriodicTC_IdRef()
	 * @model required="true"
	 * @generated
	 */
	GSSEnvironmentPeriodicTC getIdRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getIdRef <em>Id Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Ref</em>' reference.
	 * @see #getIdRef()
	 * @generated
	 */
	void setIdRef(GSSEnvironmentPeriodicTC value);

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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferencePeriodicTC_Level()
	 * @model required="true"
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getLevel <em>Level</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferencePeriodicTC_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	String getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getFieldRef <em>Field Ref</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferencePeriodicTC_Offset()
	 * @model required="true"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getOffset <em>Offset</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentReferencePeriodicTC_Size()
	 * @model required="true"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentReferencePeriodicTC#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // GSSEnvironmentReferencePeriodicTC
