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
package es.uah.aut.srg.gss.filters;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Filter Maxterm Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getBoolVar <em>Bool Var</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getBoolVarFDIC <em>Bool Var FDIC</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getMaxterm <em>Maxterm</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter()
 * @model
 * @generated
 */
public interface GSSFilterMaxtermFilter extends GSSFilterFilter {
	/**
	 * Returns the value of the '<em><b>Format File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format File</em>' reference.
	 * @see #setFormatFile(GSSTmTcFormatTmTcFormat)
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter_FormatFile()
	 * @model required="true"
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getFormatFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getFormatFile <em>Format File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format File</em>' reference.
	 * @see #getFormatFile()
	 * @generated
	 */
	void setFormatFile(GSSTmTcFormatTmTcFormat value);

	/**
	 * Returns the value of the '<em><b>Bool Var</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.filters.GSSFilterBoolVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter_BoolVar()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFilterBoolVar> getBoolVar();

	/**
	 * Returns the value of the '<em><b>Bool Var From Array Item</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.filters.GSSFilterBoolVarFromArrayItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var From Array Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var From Array Item</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter_BoolVarFromArrayItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFilterBoolVarFromArrayItem> getBoolVarFromArrayItem();

	/**
	 * Returns the value of the '<em><b>Bool Var From Grouped Array Item</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.filters.GSSFilterBoolVarFromGroupedArrayItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var From Grouped Array Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var From Grouped Array Item</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter_BoolVarFromGroupedArrayItem()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFilterBoolVarFromGroupedArrayItem> getBoolVarFromGroupedArrayItem();

	/**
	 * Returns the value of the '<em><b>Bool Var FDIC</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.filters.GSSFilterBoolVarFDIC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool Var FDIC</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool Var FDIC</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter_BoolVarFDIC()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSFilterBoolVarFDIC> getBoolVarFDIC();

	/**
	 * Returns the value of the '<em><b>Maxterm</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.filters.GSSFilterMaxterm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maxterm</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maxterm</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter_Maxterm()
	 * @model containment="true" required="true" upper="10"
	 * @generated
	 */
	EList<GSSFilterMaxterm> getMaxterm();

} // GSSFilterMaxtermFilter
