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

import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Setting From Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSettingFromField#getFieldRef <em>Field Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingFromField()
 * @model
 * @generated
 */
public interface GSSExportSettingFromField extends GSSExportSetting {
	/**
	 * Returns the value of the '<em><b>Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Ref</em>' reference.
	 * @see #setFieldRef(GSSTmTcFormatField)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSettingFromField_FieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSTmTcFormatField getFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSettingFromField#getFieldRef <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Ref</em>' reference.
	 * @see #getFieldRef()
	 * @generated
	 */
	void setFieldRef(GSSTmTcFormatField value);

} // GSSExportSettingFromField
