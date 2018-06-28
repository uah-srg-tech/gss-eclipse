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
package es.uah.aut.srg.gss.export;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Sizes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizes#getSizeFromFileLength <em>Size From File Length</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizes#getSizeFromFileLine <em>Size From File Line</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSizes#getSizeInBits <em>Size In Bits</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizes()
 * @model
 * @generated
 */
public interface GSSExportSizes extends EObject {
	/**
	 * Returns the value of the '<em><b>Size From File Length</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLength}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size From File Length</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size From File Length</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizes_SizeFromFileLength()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSizeFromFileLength> getSizeFromFileLength();

	/**
	 * Returns the value of the '<em><b>Size From File Line</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSizeFromFileLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size From File Line</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size From File Line</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizes_SizeFromFileLine()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSizeFromFileLine> getSizeFromFileLine();

	/**
	 * Returns the value of the '<em><b>Size In Bits</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.export.GSSExportSizeInBits}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size In Bits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size In Bits</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSizes_SizeInBits()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSSExportSizeInBits> getSizeInBits();

} // GSSExportSizes
