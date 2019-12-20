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
package es.uah.aut.srg.gss.tcheaderinput;

import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.tmtcif.tcheader.TMTCIFTCHeader;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSSTC Header Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput#getFormat <em>Format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput#getGssHeaderFields <em>Gss Header Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage#getGSSTCHeaderInput()
 * @model
 * @generated
 */
public interface GSSTCHeaderInput extends TMTCIFTCHeader {
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
	 * @see es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage#getGSSTCHeaderInput_Format()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatFormat getFormat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInput#getFormat <em>Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Gss Header Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tcheaderinput.GSSTCHeaderInputField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Header Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Header Fields</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tcheaderinput.tcheaderinputPackage#getGSSTCHeaderInput_GssHeaderFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTCHeaderInputField> getGssHeaderFields();

} // GSSTCHeaderInput
