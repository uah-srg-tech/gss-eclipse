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
package es.uah.aut.srg.gss.config;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Config Main Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfType <em>If Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfConfig <em>If Config</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIoType <em>Io Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getLevelInOut <em>Level In Out</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface()
 * @model
 * @generated
 */
public interface GSSConfigMainInterface extends EObject {
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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>If Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType
	 * @see #setIfType(GSSConfigMainInterfaceType)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface_IfType()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigMainInterfaceType getIfType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfType <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceType
	 * @see #getIfType()
	 * @generated
	 */
	void setIfType(GSSConfigMainInterfaceType value);

	/**
	 * Returns the value of the '<em><b>If Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Config</em>' attribute.
	 * @see #setIfConfig(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface_IfConfig()
	 * @model required="true"
	 * @generated
	 */
	String getIfConfig();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIfConfig <em>If Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Config</em>' attribute.
	 * @see #getIfConfig()
	 * @generated
	 */
	void setIfConfig(String value);

	/**
	 * Returns the value of the '<em><b>Io Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType
	 * @see #setIoType(GSSConfigMainInterfaceIOType)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface_IoType()
	 * @model required="true"
	 * @generated
	 */
	GSSConfigMainInterfaceIOType getIoType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getIoType <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.config.GSSConfigMainInterfaceIOType
	 * @see #getIoType()
	 * @generated
	 */
	void setIoType(GSSConfigMainInterfaceIOType value);

	/**
	 * Returns the value of the '<em><b>Protocol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol ID</em>' attribute.
	 * @see #setProtocolID(String)
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface_ProtocolID()
	 * @model
	 * @generated
	 */
	String getProtocolID();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.config.GSSConfigMainInterface#getProtocolID <em>Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol ID</em>' attribute.
	 * @see #getProtocolID()
	 * @generated
	 */
	void setProtocolID(String value);

	/**
	 * Returns the value of the '<em><b>Level In Out</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigLevelInOut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level In Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level In Out</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigMainInterface_LevelInOut()
	 * @model containment="true" required="true" upper="3"
	 * @generated
	 */
	EList<GSSConfigLevelInOut> getLevelInOut();

} // GSSConfigMainInterface
