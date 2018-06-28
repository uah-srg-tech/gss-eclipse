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
package es.uah.aut.srg.gss.export;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Size In Bits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeInBits()
 * @model
 * @generated
 */
public interface GSSExportSizeInBits extends EObject {
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
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeInBits_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeInBits_From()
	 * @model required="true"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>Add Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Add Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add Size</em>' attribute.
	 * @see #setAddSize(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeInBits_AddSize()
	 * @model
	 * @generated
	 */
	String getAddSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getAddSize <em>Add Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Size</em>' attribute.
	 * @see #getAddSize()
	 * @generated
	 */
	void setAddSize(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.export.GSSExportUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.export.GSSExportUnit
	 * @see #setUnit(GSSExportUnit)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizeInBits_Unit()
	 * @model
	 * @generated
	 */
	GSSExportUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSizeInBits#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.export.GSSExportUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GSSExportUnit value);

} // GSSExportSizeInBits
