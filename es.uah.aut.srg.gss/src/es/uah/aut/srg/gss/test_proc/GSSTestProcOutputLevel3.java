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

import es.uah.aut.srg.gss.imports.GSSImportImport;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Output Level3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3 <em>Level3</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_filter <em>Level3 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2 <em>Level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_from_level2 <em>Level3 from level2</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_filter <em>Level2 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_from_level1 <em>Level2 from level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_filter <em>Level1 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_from_level0 <em>Level1 from level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0_filter <em>Level0 filter</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3()
 * @model
 * @generated
 */
public interface GSSTestProcOutputLevel3 extends GSSTestProcOutput {
	/**
	 * Returns the value of the '<em><b>Level3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level3</em>' reference.
	 * @see #setLevel3(GSSTmTcFormatTmTcFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level3()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getLevel3();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3 <em>Level3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3</em>' reference.
	 * @see #getLevel3()
	 * @generated
	 */
	void setLevel3(GSSTmTcFormatTmTcFormat value);

	/**
	 * Returns the value of the '<em><b>Level3 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level3 filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level3 filter</em>' containment reference.
	 * @see #setLevel3_filter(GSSTestProcFilter)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level3_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcFilter getLevel3_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_filter <em>Level3 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3 filter</em>' containment reference.
	 * @see #getLevel3_filter()
	 * @generated
	 */
	void setLevel3_filter(GSSTestProcFilter value);

	/**
	 * Returns the value of the '<em><b>Level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2</em>' reference.
	 * @see #setLevel2(GSSTmTcFormatTmTcFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level2()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getLevel2();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2 <em>Level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2</em>' reference.
	 * @see #getLevel2()
	 * @generated
	 */
	void setLevel2(GSSTmTcFormatTmTcFormat value);

	/**
	 * Returns the value of the '<em><b>Level3 from level2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level3 from level2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level3 from level2</em>' reference.
	 * @see #setLevel3_from_level2(GSSImportImport)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level3_from_level2()
	 * @model
	 * @generated
	 */
	GSSImportImport getLevel3_from_level2();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel3_from_level2 <em>Level3 from level2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3 from level2</em>' reference.
	 * @see #getLevel3_from_level2()
	 * @generated
	 */
	void setLevel3_from_level2(GSSImportImport value);

	/**
	 * Returns the value of the '<em><b>Level2 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2 filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2 filter</em>' containment reference.
	 * @see #setLevel2_filter(GSSTestProcFilter)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level2_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcFilter getLevel2_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_filter <em>Level2 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2 filter</em>' containment reference.
	 * @see #getLevel2_filter()
	 * @generated
	 */
	void setLevel2_filter(GSSTestProcFilter value);

	/**
	 * Returns the value of the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1</em>' reference.
	 * @see #setLevel1(GSSTmTcFormatTmTcFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level1()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getLevel1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1 <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1</em>' reference.
	 * @see #getLevel1()
	 * @generated
	 */
	void setLevel1(GSSTmTcFormatTmTcFormat value);

	/**
	 * Returns the value of the '<em><b>Level2 from level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2 from level1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2 from level1</em>' reference.
	 * @see #setLevel2_from_level1(GSSImportImport)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level2_from_level1()
	 * @model
	 * @generated
	 */
	GSSImportImport getLevel2_from_level1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel2_from_level1 <em>Level2 from level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2 from level1</em>' reference.
	 * @see #getLevel2_from_level1()
	 * @generated
	 */
	void setLevel2_from_level1(GSSImportImport value);

	/**
	 * Returns the value of the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1 filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1 filter</em>' containment reference.
	 * @see #setLevel1_filter(GSSTestProcFilter)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level1_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcFilter getLevel1_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_filter <em>Level1 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 filter</em>' containment reference.
	 * @see #getLevel1_filter()
	 * @generated
	 */
	void setLevel1_filter(GSSTestProcFilter value);

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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level0()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0 <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0</em>' reference.
	 * @see #getLevel0()
	 * @generated
	 */
	void setLevel0(GSSTmTcFormatTmTcFormat value);

	/**
	 * Returns the value of the '<em><b>Level1 from level0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1 from level0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1 from level0</em>' reference.
	 * @see #setLevel1_from_level0(GSSImportImport)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level1_from_level0()
	 * @model
	 * @generated
	 */
	GSSImportImport getLevel1_from_level0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel1_from_level0 <em>Level1 from level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 from level0</em>' reference.
	 * @see #getLevel1_from_level0()
	 * @generated
	 */
	void setLevel1_from_level0(GSSImportImport value);

	/**
	 * Returns the value of the '<em><b>Level0 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level0 filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level0 filter</em>' containment reference.
	 * @see #setLevel0_filter(GSSTestProcFilter)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel3_Level0_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcFilter getLevel0_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel3#getLevel0_filter <em>Level0 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0 filter</em>' containment reference.
	 * @see #getLevel0_filter()
	 * @generated
	 */
	void setLevel0_filter(GSSTestProcFilter value);

} // GSSTestProcOutputLevel3
