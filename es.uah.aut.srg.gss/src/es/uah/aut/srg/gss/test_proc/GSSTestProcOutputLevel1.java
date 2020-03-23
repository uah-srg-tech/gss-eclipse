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

import es.uah.aut.srg.gss.format.GSSFormatFormat;
import es.uah.aut.srg.gss.import_.GSSImportImport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Output Level1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
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
	 * Returns the value of the '<em><b>Level1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1</em>' reference.
	 * @see #setLevel1(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level1()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1 <em>Level1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1</em>' reference.
	 * @see #getLevel1()
	 * @generated
	 */
	void setLevel1(GSSFormatFormat value);

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
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level1_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcFilter getLevel1_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel1_filter <em>Level1 filter</em>}' containment reference.
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
	 * @see #setLevel0(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level0()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel0();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0 <em>Level0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0</em>' reference.
	 * @see #getLevel0()
	 * @generated
	 */
	void setLevel0(GSSFormatFormat value);

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
	 * @see #setLevel0_filter(GSSTestProcFilter)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcOutputLevel1_Level0_filter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSTestProcFilter getLevel0_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcOutputLevel1#getLevel0_filter <em>Level0 filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0 filter</em>' containment reference.
	 * @see #getLevel0_filter()
	 * @generated
	 */
	void setLevel0_filter(GSSTestProcFilter value);

} // GSSTestProcOutputLevel1
