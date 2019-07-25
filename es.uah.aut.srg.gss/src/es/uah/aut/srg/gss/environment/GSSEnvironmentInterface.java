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
package es.uah.aut.srg.gss.environment;

import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfType <em>If Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfConfig <em>If Config</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIoType <em>Io Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelInOut <em>Level In Out</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelIn <em>Level In</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getLevelOut <em>Level Out</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface()
 * @model
 * @generated
 */
public interface GSSEnvironmentInterface extends EObject {
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getId <em>Id</em>}' attribute.
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
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>If Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType
	 * @see #isSetIfType()
	 * @see #unsetIfType()
	 * @see #setIfType(GSSEnvironmentInterfaceType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_IfType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentInterfaceType getIfType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfType <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceType
	 * @see #isSetIfType()
	 * @see #unsetIfType()
	 * @see #getIfType()
	 * @generated
	 */
	void setIfType(GSSEnvironmentInterfaceType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfType <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfType()
	 * @see #getIfType()
	 * @see #setIfType(GSSEnvironmentInterfaceType)
	 * @generated
	 */
	void unsetIfType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfType <em>If Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>If Type</em>' attribute is set.
	 * @see #unsetIfType()
	 * @see #getIfType()
	 * @see #setIfType(GSSEnvironmentInterfaceType)
	 * @generated
	 */
	boolean isSetIfType();

	/**
	 * Returns the value of the '<em><b>If Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Config</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Config</em>' reference.
	 * @see #setIfConfig(GSSIfacePortConfig)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_IfConfig()
	 * @model required="true"
	 * @generated
	 */
	GSSIfacePortConfig getIfConfig();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIfConfig <em>If Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Config</em>' reference.
	 * @see #getIfConfig()
	 * @generated
	 */
	void setIfConfig(GSSIfacePortConfig value);

	/**
	 * Returns the value of the '<em><b>Io Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType
	 * @see #isSetIoType()
	 * @see #unsetIoType()
	 * @see #setIoType(GSSEnvironmentInterfaceIOType)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_IoType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSEnvironmentInterfaceIOType getIoType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIoType <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.environment.GSSEnvironmentInterfaceIOType
	 * @see #isSetIoType()
	 * @see #unsetIoType()
	 * @see #getIoType()
	 * @generated
	 */
	void setIoType(GSSEnvironmentInterfaceIOType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIoType <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIoType()
	 * @see #getIoType()
	 * @see #setIoType(GSSEnvironmentInterfaceIOType)
	 * @generated
	 */
	void unsetIoType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getIoType <em>Io Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Io Type</em>' attribute is set.
	 * @see #unsetIoType()
	 * @see #getIoType()
	 * @see #setIoType(GSSEnvironmentInterfaceIOType)
	 * @generated
	 */
	boolean isSetIoType();

	/**
	 * Returns the value of the '<em><b>Protocol ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol ID</em>' reference.
	 * @see #setProtocolID(GSSEnvironmentProtocol)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_ProtocolID()
	 * @model
	 * @generated
	 */
	GSSEnvironmentProtocol getProtocolID();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentInterface#getProtocolID <em>Protocol ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol ID</em>' reference.
	 * @see #getProtocolID()
	 * @generated
	 */
	void setProtocolID(GSSEnvironmentProtocol value);

	/**
	 * Returns the value of the '<em><b>Level In Out</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelInOut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level In Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level In Out</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_LevelInOut()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSEnvironmentLevelInOut> getLevelInOut();

	/**
	 * Returns the value of the '<em><b>Level In</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelIn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level In</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level In</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_LevelIn()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSEnvironmentLevelIn> getLevelIn();

	/**
	 * Returns the value of the '<em><b>Level Out</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.environment.GSSEnvironmentLevelOut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Out</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentInterface_LevelOut()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSEnvironmentLevelOut> getLevelOut();

} // GSSEnvironmentInterface
