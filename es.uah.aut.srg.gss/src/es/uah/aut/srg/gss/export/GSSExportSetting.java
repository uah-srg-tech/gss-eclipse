/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.export;

import es.uah.aut.srg.gss.format.GSSFormatField;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Export Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.export.GSSExportSetting#getToFieldRef <em>To Field Ref</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSetting()
 * @model
 * @generated
 */
public interface GSSExportSetting extends EObject {
	/**
	 * Returns the value of the '<em><b>To Field Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Field Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Field Ref</em>' reference.
	 * @see #setToFieldRef(GSSFormatField)
	 * @see es.uah.aut.srg.gss.export.exportPackage#getGSSExportSetting_ToFieldRef()
	 * @model required="true"
	 * @generated
	 */
	GSSFormatField getToFieldRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.export.GSSExportSetting#getToFieldRef <em>To Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Field Ref</em>' reference.
	 * @see #getToFieldRef()
	 * @generated
	 */
	void setToFieldRef(GSSFormatField value);

} // GSSExportSetting
