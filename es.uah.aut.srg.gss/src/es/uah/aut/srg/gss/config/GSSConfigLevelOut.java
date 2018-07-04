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
 * A representation of the model object '<em><b>GSS Config Level Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelOut()
 * @model
 * @generated
 */
public interface GSSConfigLevelOut extends EObject {
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelOut_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelOut_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>TMformat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMformat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMformat</em>' containment reference.
	 * @see #setTMformat(GSSConfigTMFormat)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelOut_TMformat()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigTMFormat getTMformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getTMformat <em>TMformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMformat</em>' containment reference.
	 * @see #getTMformat()
	 * @generated
	 */
	void setTMformat(GSSConfigTMFormat value);

	/**
	 * Returns the value of the '<em><b>Input Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Filter</em>' containment reference.
	 * @see #setInputFilter(GSSConfigInputFilter)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelOut_InputFilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigInputFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getInputFilter <em>Input Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Filter</em>' containment reference.
	 * @see #getInputFilter()
	 * @generated
	 */
	void setInputFilter(GSSConfigInputFilter value);

	/**
	 * Returns the value of the '<em><b>Import from prev Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import from prev Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import from prev Level</em>' containment reference.
	 * @see #setImport_from_prev_Level(GSSConfigImportFromPrevLevel)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelOut_Import_from_prev_Level()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigImportFromPrevLevel getImport_from_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelOut#getImport_from_prev_Level <em>Import from prev Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import from prev Level</em>' containment reference.
	 * @see #getImport_from_prev_Level()
	 * @generated
	 */
	void setImport_from_prev_Level(GSSConfigImportFromPrevLevel value);

} // GSSConfigLevelOut
