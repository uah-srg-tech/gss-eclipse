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
 * A representation of the model object '<em><b>GSS Test Proc Output Level1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getOptional <em>Optional</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1 <em>Level1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_filter <em>Level1 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0 <em>Level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_from_level0 <em>Level1 from level0</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0_filter <em>Level0 filter</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1()
 * @model
 * @generated
 */
public interface GSSTestProcOutputLevel1 extends GSSTestProcOutput {
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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getIfRef <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Ref</em>' attribute.
	 * @see #getIfRef()
	 * @generated
	 */
	void setIfRef(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Optional()
	 * @model
	 * @generated
	 */
	String getOptional();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #getOptional()
	 * @generated
	 */
	void setOptional(String value);

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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level1()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getLevel1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1 <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1</em>' reference.
	 * @see #getLevel1()
	 * @generated
	 */
	void setLevel1(GSSTmTcFormatTmTcFormat value);

	/**
	 * Returns the value of the '<em><b>Level1 filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1 filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1 filter</em>' containment reference.
	 * @see #setLevel1_filter(GSSTestProcLevel1Filter)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level1_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcLevel1Filter getLevel1_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_filter <em>Level1 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 filter</em>' containment reference.
	 * @see #getLevel1_filter()
	 * @generated
	 */
	void setLevel1_filter(GSSTestProcLevel1Filter value);

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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level0()
	 * @model
	 * @generated
	 */
	GSSTmTcFormatTmTcFormat getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0 <em>Level0</em>}' reference.
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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level1_from_level0()
	 * @model
	 * @generated
	 */
	GSSImportImport getLevel1_from_level0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_from_level0 <em>Level1 from level0</em>}' reference.
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
	 * @see #setLevel0_filter(GSSTestProcLevel0Filter)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level0_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcLevel0Filter getLevel0_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0_filter <em>Level0 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0 filter</em>' containment reference.
	 * @see #getLevel0_filter()
	 * @generated
	 */
	void setLevel0_filter(GSSTestProcLevel0Filter value);

} // GSSTestProcOutputLevel1
