/**
 * Copyright (c) 2020 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tmheader;

import es.uah.aut.srg.gss.format.GSSFormatField;

import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeaderField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSSTM Header Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tmheader.GSSTMHeaderField#getGssHeaderField <em>Gss Header Field</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tmheader.tmheaderPackage#getGSSTMHeaderField()
 * @model
 * @generated
 */
public interface GSSTMHeaderField extends TMTCIFTMHeaderField {
	/**
	 * Returns the value of the '<em><b>Gss Header Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Header Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Header Field</em>' reference.
	 * @see #setGssHeaderField(GSSFormatField)
	 * @see es.uah.aut.srg.gss.tmheader.tmheaderPackage#getGSSTMHeaderField_GssHeaderField()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatField getGssHeaderField();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tmheader.GSSTMHeaderField#getGssHeaderField <em>Gss Header Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss Header Field</em>' reference.
	 * @see #getGssHeaderField()
	 * @generated
	 */
	void setGssHeaderField(GSSFormatField value);

} // GSSTMHeaderField
