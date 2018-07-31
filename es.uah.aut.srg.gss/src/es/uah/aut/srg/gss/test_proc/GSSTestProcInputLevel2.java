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

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTCFormat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Input Level2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getDelay_unit <em>Delay unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getApp_to_level2 <em>App to level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2_to_level1 <em>Level2 to level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1_to_level0 <em>Level1 to level0</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2()
 * @model
 * @generated
 */
public interface GSSTestProcInputLevel2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Ref</em>' attribute.
	 * @see #setIfRef(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getIfRef <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Ref</em>' attribute.
	 * @see #getIfRef()
	 * @generated
	 */
	void setIfRef(String value);

	/**
	 * Returns the value of the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay value</em>' attribute.
	 * @see #setDelay_value(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Delay_value()
	 * @model required="true"
	 * @generated
	 */
	String getDelay_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getDelay_value <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay value</em>' attribute.
	 * @see #getDelay_value()
	 * @generated
	 */
	void setDelay_value(String value);

	/**
	 * Returns the value of the '<em><b>Delay unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #setDelay_unit(GSSTestProcUnit)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Delay_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTestProcUnit getDelay_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @generated
	 */
	void setDelay_unit(GSSTestProcUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(GSSTestProcUnit)
	 * @generated
	 */
	void unsetDelay_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getDelay_unit <em>Delay unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay unit</em>' attribute is set.
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(GSSTestProcUnit)
	 * @generated
	 */
	boolean isSetDelay_unit();

	/**
	 * Returns the value of the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2</em>' reference.
	 * @see #setLevel2(GSSTmTcFormatTmTCFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Level2()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTCFormat getLevel2();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2 <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2</em>' reference.
	 * @see #getLevel2()
	 * @generated
	 */
	void setLevel2(GSSTmTcFormatTmTCFormat value);

	/**
	 * Returns the value of the '<em><b>App to level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>App to level2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>App to level2</em>' reference.
	 * @see #setApp_to_level2(GSSExportExport)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_App_to_level2()
	 * @model
	 * @generated
	 */
	GSSExportExport getApp_to_level2();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getApp_to_level2 <em>App to level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>App to level2</em>' reference.
	 * @see #getApp_to_level2()
	 * @generated
	 */
	void setApp_to_level2(GSSExportExport value);

	/**
	 * Returns the value of the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1</em>' reference.
	 * @see #setLevel1(GSSTmTcFormatTmTCFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Level1()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTCFormat getLevel1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1 <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1</em>' reference.
	 * @see #getLevel1()
	 * @generated
	 */
	void setLevel1(GSSTmTcFormatTmTCFormat value);

	/**
	 * Returns the value of the '<em><b>Level2 to level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2 to level1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2 to level1</em>' reference.
	 * @see #setLevel2_to_level1(GSSExportExport)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Level2_to_level1()
	 * @model
	 * @generated
	 */
	GSSExportExport getLevel2_to_level1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel2_to_level1 <em>Level2 to level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2 to level1</em>' reference.
	 * @see #getLevel2_to_level1()
	 * @generated
	 */
	void setLevel2_to_level1(GSSExportExport value);

	/**
	 * Returns the value of the '<em><b>Level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level0</em>' reference.
	 * @see #setLevel0(GSSTmTcFormatTmTCFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Level0()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTCFormat getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel0 <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0</em>' reference.
	 * @see #getLevel0()
	 * @generated
	 */
	void setLevel0(GSSTmTcFormatTmTCFormat value);

	/**
	 * Returns the value of the '<em><b>Level1 to level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1 to level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1 to level0</em>' reference.
	 * @see #setLevel1_to_level0(GSSExportExport)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcInputLevel2_Level1_to_level0()
	 * @model
	 * @generated
	 */
	GSSExportExport getLevel1_to_level0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcInputLevel2#getLevel1_to_level0 <em>Level1 to level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 to level0</em>' reference.
	 * @see #getLevel1_to_level0()
	 * @generated
	 */
	void setLevel1_to_level0(GSSExportExport value);

} // GSSTestProcInputLevel2
