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

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.tmtcif.tmheader.TMTCIFTMHeader;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSSTM Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tmheader.GSSTMHeader#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tmheader.tmheaderPackage#getGSSTMHeader()
 * @model
 * @generated
 */
public interface GSSTMHeader extends TMTCIFTMHeader {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' reference.
	 * @see #setFormat(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.tmheader.tmheaderPackage#getGSSTMHeader_Format()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatFormat getFormat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tmheader.GSSTMHeader#getFormat <em>Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(GSSFormatFormat value);

} // GSSTMHeader
