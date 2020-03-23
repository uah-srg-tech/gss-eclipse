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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Test Proc Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getMessage <em>Message</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getActionType <em>Action Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_value <em>Delay value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_unit <em>Delay unit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_value <em>Span value</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_unit <em>Span unit</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcAction()
 * @model
 * @generated
 */
public interface GSSTestProcAction extends GSSTestProcAbstractInputs {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcAction_Message()
	 * @model required="true"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Action Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcActionType
	 * @see #isSetActionType()
	 * @see #unsetActionType()
	 * @see #setActionType(GSSTestProcActionType)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcAction_ActionType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTestProcActionType getActionType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcActionType
	 * @see #isSetActionType()
	 * @see #unsetActionType()
	 * @see #getActionType()
	 * @generated
	 */
	void setActionType(GSSTestProcActionType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getActionType <em>Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionType()
	 * @see #getActionType()
	 * @see #setActionType(GSSTestProcActionType)
	 * @generated
	 */
	void unsetActionType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getActionType <em>Action Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Type</em>' attribute is set.
	 * @see #unsetActionType()
	 * @see #getActionType()
	 * @see #setActionType(GSSTestProcActionType)
	 * @generated
	 */
	boolean isSetActionType();

	/**
	 * Returns the value of the '<em><b>Delay value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay value</em>' attribute.
	 * @see #isSetDelay_value()
	 * @see #unsetDelay_value()
	 * @see #setDelay_value(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcAction_Delay_value()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getDelay_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_value <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay value</em>' attribute.
	 * @see #isSetDelay_value()
	 * @see #unsetDelay_value()
	 * @see #getDelay_value()
	 * @generated
	 */
	void setDelay_value(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_value <em>Delay value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay_value()
	 * @see #getDelay_value()
	 * @see #setDelay_value(String)
	 * @generated
	 */
	void unsetDelay_value();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_value <em>Delay value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay value</em>' attribute is set.
	 * @see #unsetDelay_value()
	 * @see #getDelay_value()
	 * @see #setDelay_value(String)
	 * @generated
	 */
	boolean isSetDelay_value();

	/**
	 * Returns the value of the '<em><b>Delay unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #setDelay_unit(GSSTestProcTimeUnit)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcAction_Delay_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTestProcTimeUnit getDelay_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit
	 * @see #isSetDelay_unit()
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @generated
	 */
	void setDelay_unit(GSSTestProcTimeUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_unit <em>Delay unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(GSSTestProcTimeUnit)
	 * @generated
	 */
	void unsetDelay_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getDelay_unit <em>Delay unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delay unit</em>' attribute is set.
	 * @see #unsetDelay_unit()
	 * @see #getDelay_unit()
	 * @see #setDelay_unit(GSSTestProcTimeUnit)
	 * @generated
	 */
	boolean isSetDelay_unit();

	/**
	 * Returns the value of the '<em><b>Span value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span value</em>' attribute.
	 * @see #isSetSpan_value()
	 * @see #unsetSpan_value()
	 * @see #setSpan_value(String)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcAction_Span_value()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getSpan_value();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_value <em>Span value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span value</em>' attribute.
	 * @see #isSetSpan_value()
	 * @see #unsetSpan_value()
	 * @see #getSpan_value()
	 * @generated
	 */
	void setSpan_value(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_value <em>Span value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpan_value()
	 * @see #getSpan_value()
	 * @see #setSpan_value(String)
	 * @generated
	 */
	void unsetSpan_value();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_value <em>Span value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span value</em>' attribute is set.
	 * @see #unsetSpan_value()
	 * @see #getSpan_value()
	 * @see #setSpan_value(String)
	 * @generated
	 */
	boolean isSetSpan_value();

	/**
	 * Returns the value of the '<em><b>Span unit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit
	 * @see #isSetSpan_unit()
	 * @see #unsetSpan_unit()
	 * @see #setSpan_unit(GSSTestProcTimeUnit)
	 * @see es.uah.aut.srg.gss.test_proc.test_procPackage#getGSSTestProcAction_Span_unit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSTestProcTimeUnit getSpan_unit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_unit <em>Span unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span unit</em>' attribute.
	 * @see es.uah.aut.srg.gss.test_proc.GSSTestProcTimeUnit
	 * @see #isSetSpan_unit()
	 * @see #unsetSpan_unit()
	 * @see #getSpan_unit()
	 * @generated
	 */
	void setSpan_unit(GSSTestProcTimeUnit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_unit <em>Span unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpan_unit()
	 * @see #getSpan_unit()
	 * @see #setSpan_unit(GSSTestProcTimeUnit)
	 * @generated
	 */
	void unsetSpan_unit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.test_proc.GSSTestProcAction#getSpan_unit <em>Span unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Span unit</em>' attribute is set.
	 * @see #unsetSpan_unit()
	 * @see #getSpan_unit()
	 * @see #setSpan_unit(GSSTestProcTimeUnit)
	 * @generated
	 */
	boolean isSetSpan_unit();

} // GSSTestProcAction
