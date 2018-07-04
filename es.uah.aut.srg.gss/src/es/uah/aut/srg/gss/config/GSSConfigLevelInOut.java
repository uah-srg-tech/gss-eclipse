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
 * A representation of the model object '<em><b>GSS Config Level In Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTCformat <em>TCformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getExport_to_prev_Level <em>Export to prev Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut()
 * @model
 * @generated
 */
public interface GSSConfigLevelInOut extends EObject {
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getName <em>Name</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut_TMformat()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigTMFormat getTMformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTMformat <em>TMformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMformat</em>' containment reference.
	 * @see #getTMformat()
	 * @generated
	 */
	void setTMformat(GSSConfigTMFormat value);

	/**
	 * Returns the value of the '<em><b>TCformat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TCformat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TCformat</em>' containment reference.
	 * @see #setTCformat(GSSConfigTCFormat)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut_TCformat()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigTCFormat getTCformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getTCformat <em>TCformat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TCformat</em>' containment reference.
	 * @see #getTCformat()
	 * @generated
	 */
	void setTCformat(GSSConfigTCFormat value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut_InputFilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigInputFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getInputFilter <em>Input Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Filter</em>' containment reference.
	 * @see #getInputFilter()
	 * @generated
	 */
	void setInputFilter(GSSConfigInputFilter value);

	/**
	 * Returns the value of the '<em><b>Export to prev Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export to prev Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export to prev Level</em>' containment reference.
	 * @see #setExport_to_prev_Level(GSSConfigExportToPrevLevel)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut_Export_to_prev_Level()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigExportToPrevLevel getExport_to_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getExport_to_prev_Level <em>Export to prev Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export to prev Level</em>' containment reference.
	 * @see #getExport_to_prev_Level()
	 * @generated
	 */
	void setExport_to_prev_Level(GSSConfigExportToPrevLevel value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigLevelInOut_Import_from_prev_Level()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigImportFromPrevLevel getImport_from_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut#getImport_from_prev_Level <em>Import from prev Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import from prev Level</em>' containment reference.
	 * @see #getImport_from_prev_Level()
	 * @generated
	 */
	void setImport_from_prev_Level(GSSConfigImportFromPrevLevel value);

} // GSSConfigLevelInOut
