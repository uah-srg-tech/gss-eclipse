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

import es.uah.aut.srg.gss.filters.GSSFilterFilter;

import es.uah.aut.srg.gss.imports.GSSImportImport;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;

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
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #setLevel(GSSConfigUpperLevelLevel)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_Level()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSConfigUpperLevelLevel getLevel();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigUpperLevelLevel
	 * @see #isSetLevel()
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(GSSConfigUpperLevelLevel value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLevel()
	 * @see #getLevel()
	 * @see #setLevel(GSSConfigUpperLevelLevel)
	 * @generated
	 */
	void unsetLevel();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getLevel <em>Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Level</em>' attribute is set.
	 * @see #unsetLevel()
	 * @see #getLevel()
	 * @see #setLevel(GSSConfigUpperLevelLevel)
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
	 * @see #setTMformat(GSSTmTcFormatTmTCFormat)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_TMformat()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTCFormat getTMformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getTMformat <em>TMformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMformat</em>' reference.
	 * @see #getTMformat()
	 * @generated
	 */
	void setTMformat(GSSTmTcFormatTmTCFormat value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_InputFilter()
	 * @model
	 * @generated
	 */
	GSSFilterFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getInputFilter <em>Input Filter</em>}' reference.
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigUpperLevel_Import_from_prev_Level()
	 * @model
	 * @generated
	 */
	GSSImportImport getImport_from_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigUpperLevel#getImport_from_prev_Level <em>Import from prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import from prev Level</em>' reference.
	 * @see #getImport_from_prev_Level()
	 * @generated
	 */
	void setImport_from_prev_Level(GSSImportImport value);

} // GSSConfigUpperLevel
