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
package es.uah.aut.srg.gss.test_proc;

import es.uah.aut.srg.gss.export.GSSExportExport;

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Input Level0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getApp_to_level0 <em>App to level0</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel0()
 * @model
 * @generated
 */
public interface GSSTestProcInputLevel0 extends GSSTestProcInput {
	/**
	 * Returns the value of the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level0</em>' reference.
	 * @see #setLevel0(GSSTmTcFormatTmTcFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel0_Level0()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getLevel0 <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0</em>' reference.
	 * @see #getLevel0()
	 * @generated
	 */
	void setLevel0(GSSTmTcFormatTmTcFormat value);

	/**
	 * Returns the value of the '<em><b>App to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App to level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App to level0</em>' reference.
	 * @see #setApp_to_level0(GSSExportExport)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel0_App_to_level0()
	 * @model
	 * @generated
	 */
	GSSExportExport getApp_to_level0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel0#getApp_to_level0 <em>App to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App to level0</em>' reference.
	 * @see #getApp_to_level0()
	 * @generated
	 */
	void setApp_to_level0(GSSExportExport value);

} // GSSTestProcInputLevel0
