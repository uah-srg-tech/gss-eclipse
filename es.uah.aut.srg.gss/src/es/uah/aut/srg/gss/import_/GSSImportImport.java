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
package es.uah.aut.srg.gss.import_;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Import Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportImport#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportImport#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportImport#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.import_.GSSImportImport#getVirtualSize <em>Virtual Size</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportImport()
 * @model
 * @generated
 */
public interface GSSImportImport extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportImport_From()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatFormat getFrom();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportImport#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportImport_To()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getTo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportImport#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.import_.GSSImportDataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportImport_DataSource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GSSImportDataSource> getDataSource();

	/**
	 * Returns the value of the '<em><b>Virtual Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Size</em>' containment reference.
	 * @see #setVirtualSize(GSSImportVirtualSize)
	 * @see es.uah.aut.srg.gss.import_.importPackage#getGSSImportImport_VirtualSize()
	 * @model containment="true"
	 * @generated
	 */
	GSSImportVirtualSize getVirtualSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.import_.GSSImportImport#getVirtualSize <em>Virtual Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Size</em>' containment reference.
	 * @see #getVirtualSize()
	 * @generated
	 */
	void setVirtualSize(GSSImportVirtualSize value);

} // GSSImportImport
