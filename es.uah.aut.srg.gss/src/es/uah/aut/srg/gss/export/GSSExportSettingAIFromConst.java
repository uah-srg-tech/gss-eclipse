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

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatAIField;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Setting AI From Const</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getValue <em>Value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToFieldRef <em>To Field Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToArrayIndex <em>To Array Index</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingAIFromConst()
 * @model
 * @generated
 */
public interface GSSExportSettingAIFromConst extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingAIFromConst_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Field Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Field Ref</em>' reference.
	 * @see #setToFieldRef(GSSTmTcFormatAIField)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingAIFromConst_ToFieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSTmTcFormatAIField getToFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToFieldRef <em>To Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Field Ref</em>' reference.
	 * @see #getToFieldRef()
	 * @generated
	 */
	void setToFieldRef(GSSTmTcFormatAIField value);

	/**
	 * Returns the value of the '<em><b>To Array Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Array Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Array Index</em>' attribute.
	 * @see #setToArrayIndex(String)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingAIFromConst_ToArrayIndex()
	 * @model required="true"
	 * @generated
	 */
	String getToArrayIndex();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingAIFromConst#getToArrayIndex <em>To Array Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Array Index</em>' attribute.
	 * @see #getToArrayIndex()
	 * @generated
	 */
	void setToArrayIndex(String value);

} // GSSExportSettingAIFromConst
