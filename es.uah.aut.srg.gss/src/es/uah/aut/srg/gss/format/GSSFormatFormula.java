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
package es.uah.aut.srg.gss.format;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Format Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormula#getSlope <em>Slope</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFormula#getIntercept <em>Intercept</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormula()
 * @model
 * @generated
 */
public interface GSSFormatFormula extends EObject {
	/**
	 * Returns the value of the '<em><b>Slope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slope</em>' attribute.
	 * @see #setSlope(String)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormula_Slope()
	 * @model required="true"
	 * @generated
	 */
	String getSlope();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFormula#getSlope <em>Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope</em>' attribute.
	 * @see #getSlope()
	 * @generated
	 */
	void setSlope(String value);

	/**
	 * Returns the value of the '<em><b>Intercept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intercept</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intercept</em>' attribute.
	 * @see #setIntercept(String)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFormula_Intercept()
	 * @model required="true"
	 * @generated
	 */
	String getIntercept();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFormula#getIntercept <em>Intercept</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intercept</em>' attribute.
	 * @see #getIntercept()
	 * @generated
	 */
	void setIntercept(String value);

} // GSSFormatFormula
