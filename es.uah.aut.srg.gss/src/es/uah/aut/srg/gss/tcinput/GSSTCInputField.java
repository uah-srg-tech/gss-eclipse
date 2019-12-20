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
package es.uah.aut.srg.gss.tcinput;

import es.uah.aut.srg.gss.format.GSSFormatField;
import es.uah.aut.srg.tmtcif.tc.TMTCIFTCField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSSTC Input Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tcinput.GSSTCInputField#getGssField <em>Gss Field</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tcinput.tcinputPackage#getGSSTCInputField()
 * @model
 * @generated
 */
public interface GSSTCInputField extends TMTCIFTCField {
	/**
	 * Returns the value of the '<em><b>Gss Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Field</em>' reference.
	 * @see #setGssField(GSSFormatField)
	 * @see es.uah.aut.srg.gss.tcinput.tcinputPackage#getGSSTCInputField_GssField()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatField getGssField();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tcinput.GSSTCInputField#getGssField <em>Gss Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss Field</em>' reference.
	 * @see #getGssField()
	 * @generated
	 */
	void setGssField(GSSFormatField value);

} // GSSTCInputField
