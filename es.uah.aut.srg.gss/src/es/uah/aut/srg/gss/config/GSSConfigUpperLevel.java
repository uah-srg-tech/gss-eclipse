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
 * A representation of the model object '<em><b>GSS Config Upper Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel()
 * @model
 * @generated
 */
public interface GSSConfigUpperLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel
	 * @see #setLevel(GSSConfigUpperLevelLevel)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_Level()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigUpperLevelLevel getLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(GSSConfigUpperLevelLevel value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_TMformat()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigTMFormat getTMformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getTMformat <em>TMformat</em>}' containment reference.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_InputFilter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSConfigInputFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getInputFilter <em>Input Filter</em>}' containment reference.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_Import_from_prev_Level()
	 * @model containment="true"
	 * @generated
	 */
	GSSConfigImportFromPrevLevel getImport_from_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import from prev Level</em>' containment reference.
	 * @see #getImport_from_prev_Level()
	 * @generated
	 */
	void setImport_from_prev_Level(GSSConfigImportFromPrevLevel value);

} // GSSConfigUpperLevel
