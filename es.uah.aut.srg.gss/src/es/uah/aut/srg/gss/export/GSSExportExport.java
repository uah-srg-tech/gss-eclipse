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
package es.uah.aut.srg.gss.export;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Export</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportExport#getFrom <em>From</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportExport#getTo <em>To</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportExport#getSizes <em>Sizes</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportExport#getSettings <em>Settings</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportExport#getActivateDICs <em>Activate DI Cs</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportExport()
 * @model
 * @generated
 */
public interface GSSExportExport extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportExport_From()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getFrom();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportExport#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportExport_To()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatFormat getTo();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportExport#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Sizes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sizes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizes</em>' containment reference.
	 * @see #setSizes(GSSExportSizes)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportExport_Sizes()
	 * @model containment="true"
	 * @generated
	 */
	GSSExportSizes getSizes();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportExport#getSizes <em>Sizes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizes</em>' containment reference.
	 * @see #getSizes()
	 * @generated
	 */
	void setSizes(GSSExportSizes value);

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(GSSExportSettings)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportExport_Settings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSExportSettings getSettings();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportExport#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(GSSExportSettings value);

	/**
	 * Returns the value of the '<em><b>Activate DI Cs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activate DI Cs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activate DI Cs</em>' containment reference.
	 * @see #setActivateDICs(GSSExportActivateDICs)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportExport_ActivateDICs()
	 * @model containment="true"
	 * @generated
	 */
	GSSExportActivateDICs getActivateDICs();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportExport#getActivateDICs <em>Activate DI Cs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activate DI Cs</em>' containment reference.
	 * @see #getActivateDICs()
	 * @generated
	 */
	void setActivateDICs(GSSExportActivateDICs value);

} // GSSExportExport
