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
 * A representation of the model object '<em><b>GSS Config Special Packets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.config.GSSConfigSpecialPackets#getSpecialPacket <em>Special Packet</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPackets()
 * @model
 * @generated
 */
public interface GSSConfigSpecialPackets extends EObject {
	/**
	 * Returns the value of the '<em><b>Special Packet</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.config.GSSConfigSpecialPacket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packet</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.config.configPackage#getGSSConfigSpecialPackets_SpecialPacket()
	 * @model containment="true" required="true" upper="17"
	 * @generated
	 */
	EList<GSSConfigSpecialPacket> getSpecialPacket();

} // GSSConfigSpecialPackets
