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
package es.uah.aut.srg.gss.config;

import es.uah.aut.srg.gss.test_proc.GSSTestProcTestProc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReq <em>Req</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction <em>Req Action</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTestCase()
 * @model
 * @generated
 */
public interface GSSConfigTestCase extends EObject {
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTestCase_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' reference.
	 * @see #setProcedure(GSSTestProcTestProc)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTestCase_Procedure()
	 * @model required="true"
	 * @generated
	 */
	GSSTestProcTestProc getProcedure();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getProcedure <em>Procedure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(GSSTestProcTestProc value);

	/**
	 * Returns the value of the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req</em>' attribute.
	 * @see #setReq(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTestCase_Req()
	 * @model
	 * @generated
	 */
	String getReq();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReq <em>Req</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req</em>' attribute.
	 * @see #getReq()
	 * @generated
	 */
	void setReq(String value);

	/**
	 * Returns the value of the '<em><b>Req Action</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigReqAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Action</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
	 * @see #isSetReqAction()
	 * @see #unsetReqAction()
	 * @see #setReqAction(GSSConfigReqAction)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigTestCase_ReqAction()
	 * @model unsettable="true"
	 * @generated
	 */
	GSSConfigReqAction getReqAction();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction <em>Req Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req Action</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigReqAction
	 * @see #isSetReqAction()
	 * @see #unsetReqAction()
	 * @see #getReqAction()
	 * @generated
	 */
	void setReqAction(GSSConfigReqAction value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction <em>Req Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReqAction()
	 * @see #getReqAction()
	 * @see #setReqAction(GSSConfigReqAction)
	 * @generated
	 */
	void unsetReqAction();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigTestCase#getReqAction <em>Req Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Req Action</em>' attribute is set.
	 * @see #unsetReqAction()
	 * @see #getReqAction()
	 * @see #setReqAction(GSSConfigReqAction)
	 * @generated
	 */
	boolean isSetReqAction();

} // GSSConfigTestCase
