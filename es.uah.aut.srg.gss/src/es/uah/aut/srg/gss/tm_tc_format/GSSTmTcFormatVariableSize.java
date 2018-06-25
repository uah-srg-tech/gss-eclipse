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
package es.uah.aut.srg.gss.tm_tc_format;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Tm Tc Format Variable Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getFidRef <em>Fid Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getUnit <em>Unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getPower <em>Power</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVariableSize()
 * @model
 * @generated
 */
public interface GSSTmTcFormatVariableSize extends EObject {
	/**
	 * Returns the value of the '<em><b>Fid Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fid Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fid Ref</em>' attribute.
	 * @see #setFidRef(String)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVariableSize_FidRef()
	 * @model required="true"
	 * @generated
	 */
	String getFidRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getFidRef <em>Fid Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fid Ref</em>' attribute.
	 * @see #getFidRef()
	 * @generated
	 */
	void setFidRef(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit
	 * @see #setUnit(GSSTmTcFormatUnit)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVariableSize_Unit()
	 * @model required="true"
	 * @generated
	 */
	GSSTmTcFormatUnit getUnit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(GSSTmTcFormatUnit value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower
	 * @see #setPower(GSSTmTcFormatPower)
	 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatVariableSize_Power()
	 * @model required="true"
	 * @generated
	 */
	GSSTmTcFormatPower getPower();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatVariableSize#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatPower
	 * @see #getPower()
	 * @generated
	 */
	void setPower(GSSTmTcFormatPower value);

} // GSSTmTcFormatVariableSize
