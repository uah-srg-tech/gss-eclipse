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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Format CS Formula Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatCSFormulaField#getFormula <em>Formula</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatCSFormulaField()
 * @model
 * @generated
 */
public interface GSSFormatCSFormulaField extends GSSFormatCSField {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' containment reference.
	 * @see #setFormula(GSSFormatFormula)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatCSFormulaField_Formula()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFormatFormula getFormula();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatCSFormulaField#getFormula <em>Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' containment reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(GSSFormatFormula value);

} // GSSFormatCSFormulaField
