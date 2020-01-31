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
package es.uah.aut.srg.gss.tm;

import es.uah.aut.srg.gss.filter.GSSFilterFilter;

import es.uah.aut.srg.gss.format.GSSFormatFormat;

import es.uah.aut.srg.gss.import_.GSSImportImport;

import es.uah.aut.srg.tmtcif.tm.TMTCIFTM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSSTM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevels <em>Levels</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel3_filter <em>Level3 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel3_format <em>Level3 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level2_import <em>From level2 import</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel2_filter <em>Level2 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel2_format <em>Level2 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level1_import <em>From level1 import</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel1_filter <em>Level1 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel1_format <em>Level1 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level0_import <em>From level0 import</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel0_filter <em>Level0 filter</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel0_format <em>Level0 format</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getGssPi1 <em>Gss Pi1</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.tm.GSSTM#getGssFields <em>Gss Fields</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM()
 * @model
 * @generated
 */
public interface GSSTM extends TMTCIFTM {
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
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Levels()
	 * @model required="true"
	 * @generated
	 */
	String getLevels();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevels <em>Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Levels</em>' attribute.
	 * @see #getLevels()
	 * @generated
	 */
	void setLevels(String value);

	/**
	 * Returns the value of the '<em><b>Level3 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level3 filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level3 filter</em>' reference.
	 * @see #setLevel3_filter(GSSFilterFilter)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level3_filter()
	 * @model
	 * @generated
	 */
	GSSFilterFilter getLevel3_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel3_filter <em>Level3 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3 filter</em>' reference.
	 * @see #getLevel3_filter()
	 * @generated
	 */
	void setLevel3_filter(GSSFilterFilter value);

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
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level3_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel3_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel3_format <em>Level3 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level3 format</em>' reference.
	 * @see #getLevel3_format()
	 * @generated
	 */
	void setLevel3_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>From level2 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From level2 import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From level2 import</em>' reference.
	 * @see #setFrom_level2_import(GSSImportImport)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_From_level2_import()
	 * @model
	 * @generated
	 */
	GSSImportImport getFrom_level2_import();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level2_import <em>From level2 import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From level2 import</em>' reference.
	 * @see #getFrom_level2_import()
	 * @generated
	 */
	void setFrom_level2_import(GSSImportImport value);

	/**
	 * Returns the value of the '<em><b>Level2 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level2 filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level2 filter</em>' reference.
	 * @see #setLevel2_filter(GSSFilterFilter)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level2_filter()
	 * @model
	 * @generated
	 */
	GSSFilterFilter getLevel2_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel2_filter <em>Level2 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2 filter</em>' reference.
	 * @see #getLevel2_filter()
	 * @generated
	 */
	void setLevel2_filter(GSSFilterFilter value);

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
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level2_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel2_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel2_format <em>Level2 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level2 format</em>' reference.
	 * @see #getLevel2_format()
	 * @generated
	 */
	void setLevel2_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>From level1 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From level1 import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From level1 import</em>' reference.
	 * @see #setFrom_level1_import(GSSImportImport)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_From_level1_import()
	 * @model
	 * @generated
	 */
	GSSImportImport getFrom_level1_import();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level1_import <em>From level1 import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From level1 import</em>' reference.
	 * @see #getFrom_level1_import()
	 * @generated
	 */
	void setFrom_level1_import(GSSImportImport value);

	/**
	 * Returns the value of the '<em><b>Level1 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level1 filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level1 filter</em>' reference.
	 * @see #setLevel1_filter(GSSFilterFilter)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level1_filter()
	 * @model
	 * @generated
	 */
	GSSFilterFilter getLevel1_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel1_filter <em>Level1 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 filter</em>' reference.
	 * @see #getLevel1_filter()
	 * @generated
	 */
	void setLevel1_filter(GSSFilterFilter value);

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
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level1_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel1_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel1_format <em>Level1 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level1 format</em>' reference.
	 * @see #getLevel1_format()
	 * @generated
	 */
	void setLevel1_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>From level0 import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From level0 import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From level0 import</em>' reference.
	 * @see #setFrom_level0_import(GSSImportImport)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_From_level0_import()
	 * @model
	 * @generated
	 */
	GSSImportImport getFrom_level0_import();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getFrom_level0_import <em>From level0 import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From level0 import</em>' reference.
	 * @see #getFrom_level0_import()
	 * @generated
	 */
	void setFrom_level0_import(GSSImportImport value);

	/**
	 * Returns the value of the '<em><b>Level0 filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level0 filter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level0 filter</em>' reference.
	 * @see #setLevel0_filter(GSSFilterFilter)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level0_filter()
	 * @model
	 * @generated
	 */
	GSSFilterFilter getLevel0_filter();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel0_filter <em>Level0 filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0 filter</em>' reference.
	 * @see #getLevel0_filter()
	 * @generated
	 */
	void setLevel0_filter(GSSFilterFilter value);

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
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_Level0_format()
	 * @model
	 * @generated
	 */
	GSSFormatFormat getLevel0_format();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getLevel0_format <em>Level0 format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level0 format</em>' reference.
	 * @see #getLevel0_format()
	 * @generated
	 */
	void setLevel0_format(GSSFormatFormat value);

	/**
	 * Returns the value of the '<em><b>Gss Pi1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Pi1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Pi1</em>' containment reference.
	 * @see #setGssPi1(GSSTMPi1)
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_GssPi1()
	 * @model containment="true"
	 * @generated
	 */
	GSSTMPi1 getGssPi1();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.tm.GSSTM#getGssPi1 <em>Gss Pi1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gss Pi1</em>' containment reference.
	 * @see #getGssPi1()
	 * @generated
	 */
	void setGssPi1(GSSTMPi1 value);

	/**
	 * Returns the value of the '<em><b>Gss Fields</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.tm.GSSTMField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gss Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gss Fields</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.tm.tmPackage#getGSSTM_GssFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSTMField> getGssFields();

} // GSSTM
