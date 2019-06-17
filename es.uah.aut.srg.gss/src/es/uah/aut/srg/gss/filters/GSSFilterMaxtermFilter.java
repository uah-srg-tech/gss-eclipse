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
 *   <li>{@link es.uah.aut.srg.gss.filters.GSSFilterMaxtermFilter#getMaxterm <em>Maxterm</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.filters.filtersPackage#getGSSFilterMaxtermFilter()
 * @model
 * @generated
 */
public interface GSSFilterMaxtermFilter extends GSSFilterFilter {
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
