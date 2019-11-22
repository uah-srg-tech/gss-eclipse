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
package es.uah.aut.srg.gss.filter;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Select Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getFromFile <em>From File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLine <em>Line</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLeftTrim <em>Left Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getRightTrim <em>Right Trim</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getMask <em>Mask</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelectLine()
 * @model
 * @generated
 */
public interface GSSFilterSelectLine extends EObject {
	/**
	 * Returns the value of the '<em><b>From File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From File</em>' attribute.
	 * @see #setFromFile(String)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelectLine_FromFile()
	 * @model required="true"
	 * @generated
	 */
	String getFromFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getFromFile <em>From File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From File</em>' attribute.
	 * @see #getFromFile()
	 * @generated
	 */
	void setFromFile(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(String)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelectLine_Line()
	 * @model required="true"
	 * @generated
	 */
	String getLine();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(String value);

	/**
	 * Returns the value of the '<em><b>Left Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Trim</em>' attribute.
	 * @see #setLeftTrim(String)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelectLine_LeftTrim()
	 * @model
	 * @generated
	 */
	String getLeftTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getLeftTrim <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Trim</em>' attribute.
	 * @see #getLeftTrim()
	 * @generated
	 */
	void setLeftTrim(String value);

	/**
	 * Returns the value of the '<em><b>Right Trim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Trim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Trim</em>' attribute.
	 * @see #setRightTrim(String)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelectLine_RightTrim()
	 * @model
	 * @generated
	 */
	String getRightTrim();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getRightTrim <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Trim</em>' attribute.
	 * @see #getRightTrim()
	 * @generated
	 */
	void setRightTrim(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterSelectLine_Mask()
	 * @model
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterSelectLine#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

} // GSSFilterSelectLine
