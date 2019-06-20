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
 * A representation of the model object '<em><b>GSS Export Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSize#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSize#getAddSize <em>Add Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSize#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSize()
 * @model
 * @generated
 */
public interface GSSExportSize extends EObject {
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
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSize_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSize#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSize_AddSize()
	 * @model
	 * @generated
	 */
	String getAddSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSize#getAddSize <em>Add Size</em>}' attribute.
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
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(GSSExportUnit)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSize_Unit()
	 * @model unsettable="true"
	 * @generated
	 */
	GSSExportUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.export.GSSExportUnit
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GSSExportUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(GSSExportUnit)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSize#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(GSSExportUnit)
	 * @generated
	 */
	boolean isSetUnit();

} // GSSExportSize
