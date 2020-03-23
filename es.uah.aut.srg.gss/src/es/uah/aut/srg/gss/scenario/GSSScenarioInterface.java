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
package es.uah.aut.srg.gss.scenario;

import es.uah.aut.srg.gss.iface.GSSIfacePortConfig;

import es.uah.aut.srg.tmtcif.scenario.TMTCIFScenarioInterface;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Scenario Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getId <em>Id</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfType <em>If Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfConfig <em>If Config</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIoType <em>Io Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelInOut <em>Level In Out</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelIn <em>Level In</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getLevelOut <em>Level Out</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface()
 * @model
 * @generated
 */
public interface GSSScenarioInterface extends TMTCIFScenarioInterface {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_Id()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>If Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType
	 * @see #isSetIfType()
	 * @see #unsetIfType()
	 * @see #setIfType(GSSScenarioInterfaceType)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_IfType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioInterfaceType getIfType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfType <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceType
	 * @see #isSetIfType()
	 * @see #unsetIfType()
	 * @see #getIfType()
	 * @generated
	 */
	void setIfType(GSSScenarioInterfaceType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfType <em>If Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIfType()
	 * @see #getIfType()
	 * @see #setIfType(GSSScenarioInterfaceType)
	 * @generated
	 */
	void unsetIfType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfType <em>If Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>If Type</em>' attribute is set.
	 * @see #unsetIfType()
	 * @see #getIfType()
	 * @see #setIfType(GSSScenarioInterfaceType)
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
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_IfConfig()
	 * @model required="true"
	 * @generated
	 */
	GSSIfacePortConfig getIfConfig();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIfConfig <em>If Config</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Config</em>' reference.
	 * @see #getIfConfig()
	 * @generated
	 */
	void setIfConfig(GSSIfacePortConfig value);

	/**
	 * Returns the value of the '<em><b>Io Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType
	 * @see #isSetIoType()
	 * @see #unsetIoType()
	 * @see #setIoType(GSSScenarioInterfaceIOType)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_IoType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSScenarioInterfaceIOType getIoType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIoType <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Io Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.scenario.GSSScenarioInterfaceIOType
	 * @see #isSetIoType()
	 * @see #unsetIoType()
	 * @see #getIoType()
	 * @generated
	 */
	void setIoType(GSSScenarioInterfaceIOType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIoType <em>Io Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIoType()
	 * @see #getIoType()
	 * @see #setIoType(GSSScenarioInterfaceIOType)
	 * @generated
	 */
	void unsetIoType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getIoType <em>Io Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Io Type</em>' attribute is set.
	 * @see #unsetIoType()
	 * @see #getIoType()
	 * @see #setIoType(GSSScenarioInterfaceIOType)
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
	 * @see #setProtocolID(GSSScenarioProtocol)
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_ProtocolID()
	 * @model
	 * @generated
	 */
	GSSScenarioProtocol getProtocolID();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.scenario.GSSScenarioInterface#getProtocolID <em>Protocol ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol ID</em>' reference.
	 * @see #getProtocolID()
	 * @generated
	 */
	void setProtocolID(GSSScenarioProtocol value);

	/**
	 * Returns the value of the '<em><b>Level In Out</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelInOut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level In Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level In Out</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_LevelInOut()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSScenarioLevelInOut> getLevelInOut();

	/**
	 * Returns the value of the '<em><b>Level In</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelIn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level In</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level In</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_LevelIn()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSScenarioLevelIn> getLevelIn();

	/**
	 * Returns the value of the '<em><b>Level Out</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.scenario.GSSScenarioLevelOut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Out</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.scenario.scenarioPackage#getGSSScenarioInterface_LevelOut()
	 * @model containment="true" upper="3"
	 * @generated
	 */
	EList<GSSScenarioLevelOut> getLevelOut();

} // GSSScenarioInterface
