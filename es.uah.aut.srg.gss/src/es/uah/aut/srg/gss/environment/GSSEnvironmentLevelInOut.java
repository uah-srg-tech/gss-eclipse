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

import es.uah.aut.srg.tmtcif.export.TMTCIFExportExport;

import es.uah.aut.srg.tmtcif.filter.TMTCIFFilterFilter;

import es.uah.aut.srg.tmtcif.format.TMTCIFFormatFormat;

import es.uah.aut.srg.tmtcif.import_.TMTCIFImportImport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Level In Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTMformat <em>TMformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTCformat <em>TCformat</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getInputFilter <em>Input Filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getExport_to_prev_Level <em>Export to prev Level</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getImport_from_prev_Level <em>Import from prev Level</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut()
 * @model
 * @generated
 */
public interface GSSEnvironmentLevelInOut extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut_Id()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>TMformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TMformat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TMformat</em>' reference.
	 * @see #setTMformat(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut_TMformat()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatFormat getTMformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTMformat <em>TMformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TMformat</em>' reference.
	 * @see #getTMformat()
	 * @generated
	 */
	void setTMformat(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>TCformat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TCformat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TCformat</em>' reference.
	 * @see #setTCformat(TMTCIFFormatFormat)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut_TCformat()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFormatFormat getTCformat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getTCformat <em>TCformat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TCformat</em>' reference.
	 * @see #getTCformat()
	 * @generated
	 */
	void setTCformat(TMTCIFFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Input Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Filter</em>' reference.
	 * @see #setInputFilter(TMTCIFFilterFilter)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut_InputFilter()
	 * @model required="true"
	 * @generated
	 */
	TMTCIFFilterFilter getInputFilter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getInputFilter <em>Input Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Filter</em>' reference.
	 * @see #getInputFilter()
	 * @generated
	 */
	void setInputFilter(TMTCIFFilterFilter value);

	/**
	 * Returns the value of the '<em><b>Export to prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export to prev Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export to prev Level</em>' reference.
	 * @see #setExport_to_prev_Level(TMTCIFExportExport)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut_Export_to_prev_Level()
	 * @model
	 * @generated
	 */
	TMTCIFExportExport getExport_to_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getExport_to_prev_Level <em>Export to prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export to prev Level</em>' reference.
	 * @see #getExport_to_prev_Level()
	 * @generated
	 */
	void setExport_to_prev_Level(TMTCIFExportExport value);

	/**
	 * Returns the value of the '<em><b>Import from prev Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import from prev Level</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import from prev Level</em>' reference.
	 * @see #setImport_from_prev_Level(TMTCIFImportImport)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentLevelInOut_Import_from_prev_Level()
	 * @model
	 * @generated
	 */
	TMTCIFImportImport getImport_from_prev_Level();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut#getImport_from_prev_Level <em>Import from prev Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import from prev Level</em>' reference.
	 * @see #getImport_from_prev_Level()
	 * @generated
	 */
	void setImport_from_prev_Level(TMTCIFImportImport value);

} // GSSEnvironmentLevelInOut