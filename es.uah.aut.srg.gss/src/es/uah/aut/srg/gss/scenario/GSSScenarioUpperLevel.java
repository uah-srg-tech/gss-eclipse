/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.scenario;

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.import_.GSSImportImport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Upper Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getLevel <em>Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioUpperLevel()
 * @model
 * @generated
 */
public interface GSSScenarioUpperLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #setLevel(GSSScenarioUpperLevelLevel)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioUpperLevel_Level()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioUpperLevelLevel getLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevelLevel
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(GSSScenarioUpperLevelLevel value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevel()
	 * @see #getLevel()
	 * @see #setLevel(GSSScenarioUpperLevelLevel)
	 * @generated
	 */
	void unsetLevel();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getLevel <em>Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level</em>' attribute is set.
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @see #setLevel(GSSScenarioUpperLevelLevel)
	 * @generated
	 */
	boolean isSetLevel();

	/**
	 * Returns the value of the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMformat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMformat</em>' reference.
	 * @see #setTMformat(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioUpperLevel_TMformat()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatFormat getTMformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getTMformat <em>TMformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMformat</em>' reference.
	 * @see #getTMformat()
	 * @generated
	 */
	void setTMformat(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Filter</em>' reference.
	 * @see #setInputFilter(GSSFilterFilter)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioUpperLevel_InputFilter()
	 * @model
	 * @generated
	 */
	GSSFilterFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getInputFilter <em>Input Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Filter</em>' reference.
	 * @see #getInputFilter()
	 * @generated
	 */
	void setInputFilter(GSSFilterFilter value);

	/**
	 * Returns the value of the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import from prev Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import from prev Level</em>' reference.
	 * @see #setImport_from_prev_Level(GSSImportImport)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioUpperLevel_Import_from_prev_Level()
	 * @model
	 * @generated
	 */
	GSSImportImport getImport_from_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import from prev Level</em>' reference.
	 * @see #getImport_from_prev_Level()
	 * @generated
	 */
	void setImport_from_prev_Level(GSSImportImport value);

} // GSSScenarioUpperLevel
