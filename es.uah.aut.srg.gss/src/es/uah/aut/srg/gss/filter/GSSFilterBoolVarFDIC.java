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

import es.uah.aut.srg.gss.format.GSSFormatFDICField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Bool Var FDIC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFDIC()
 * @model
 * @generated
 */
public interface GSSFilterBoolVarFDIC extends GSSFilterAbstractBoolVar {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' reference.
	 * @see #setFieldRef(GSSFormatFDICField)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterBoolVarFDIC_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatFDICField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterBoolVarFDIC#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(GSSFormatFDICField value);

} // GSSFilterBoolVarFDIC
