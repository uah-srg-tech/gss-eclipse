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

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getBoolVar <em>Bool Var</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterFilter()
 * @model abstract="true"
 * @generated
 */
public interface GSSFilterFilter extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format File</em>' reference.
	 * @see #setFormatFile(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterFilter_FormatFile()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatFormat getFormatFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filter.GSSFilterFilter#getFormatFile <em>Format File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format File</em>' reference.
	 * @see #getFormatFile()
	 * @generated
	 */
	void setFormatFile(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Bool Var</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.filter.GSSFilterAbstractBoolVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.filter.filterPackage#getGSSFilterFilter_BoolVar()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFilterAbstractBoolVar> getBoolVar();

} // GSSFilterFilter
