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
package es.uah.aut.srg.gss.tc;

import es.uah.aut.srg.gss.export.GSSExportExport;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.tmtcif.tc.TMTCIFTC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSSTC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level3_export <em>To level3 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel3_format <em>Level3 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level2_export <em>To level2 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel2_format <em>Level2 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level1_export <em>To level1 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel1_format <em>Level1 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level0_export <em>To level0 export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel0_format <em>Level0 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tc.GSSTC#getGssFields <em>Gss Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC()
 * @model
 * @generated
 */
public interface GSSTC extends TMTCIFTC {
	/**
	 * Returns the value of the '<em><b>Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' attribute.
	 * @see #setLevels(String)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_Levels()
	 * @model required="true"
	 * @generated
	 */
	String getLevels();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevels <em>Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Levels</em>' attribute.
	 * @see #getLevels()
	 * @generated
	 */
	void setLevels(String value);

	/**
	 * Returns the value of the '<em><b>To level3 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To level3 export</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To level3 export</em>' reference.
	 * @see #setTo_level3_export(GSSExportExport)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_To_level3_export()
	 * @model
	 * @generated
	 */
	GSSExportExport getTo_level3_export();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level3_export <em>To level3 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To level3 export</em>' reference.
	 * @see #getTo_level3_export()
	 * @generated
	 */
	void setTo_level3_export(GSSExportExport value);

	/**
	 * Returns the value of the '<em><b>Level3 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level3 format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level3 format</em>' reference.
	 * @see #setLevel3_format(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_Level3_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel3_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel3_format <em>Level3 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3 format</em>' reference.
	 * @see #getLevel3_format()
	 * @generated
	 */
	void setLevel3_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>To level2 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To level2 export</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To level2 export</em>' reference.
	 * @see #setTo_level2_export(GSSExportExport)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_To_level2_export()
	 * @model
	 * @generated
	 */
	GSSExportExport getTo_level2_export();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level2_export <em>To level2 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To level2 export</em>' reference.
	 * @see #getTo_level2_export()
	 * @generated
	 */
	void setTo_level2_export(GSSExportExport value);

	/**
	 * Returns the value of the '<em><b>Level2 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2 format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2 format</em>' reference.
	 * @see #setLevel2_format(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_Level2_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel2_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel2_format <em>Level2 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2 format</em>' reference.
	 * @see #getLevel2_format()
	 * @generated
	 */
	void setLevel2_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>To level1 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To level1 export</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To level1 export</em>' reference.
	 * @see #setTo_level1_export(GSSExportExport)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_To_level1_export()
	 * @model
	 * @generated
	 */
	GSSExportExport getTo_level1_export();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level1_export <em>To level1 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To level1 export</em>' reference.
	 * @see #getTo_level1_export()
	 * @generated
	 */
	void setTo_level1_export(GSSExportExport value);

	/**
	 * Returns the value of the '<em><b>Level1 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1 format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1 format</em>' reference.
	 * @see #setLevel1_format(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_Level1_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel1_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel1_format <em>Level1 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 format</em>' reference.
	 * @see #getLevel1_format()
	 * @generated
	 */
	void setLevel1_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>To level0 export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To level0 export</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To level0 export</em>' reference.
	 * @see #setTo_level0_export(GSSExportExport)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_To_level0_export()
	 * @model
	 * @generated
	 */
	GSSExportExport getTo_level0_export();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getTo_level0_export <em>To level0 export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To level0 export</em>' reference.
	 * @see #getTo_level0_export()
	 * @generated
	 */
	void setTo_level0_export(GSSExportExport value);

	/**
	 * Returns the value of the '<em><b>Level0 format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level0 format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level0 format</em>' reference.
	 * @see #setLevel0_format(GSSFormatFormat)
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_Level0_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel0_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tc.GSSTC#getLevel0_format <em>Level0 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0 format</em>' reference.
	 * @see #getLevel0_format()
	 * @generated
	 */
	void setLevel0_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Gss Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tc.GSSTCField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Fields</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tc.tcPackage#getGSSTC_GssFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTCField> getGssFields();

} // GSSTC
