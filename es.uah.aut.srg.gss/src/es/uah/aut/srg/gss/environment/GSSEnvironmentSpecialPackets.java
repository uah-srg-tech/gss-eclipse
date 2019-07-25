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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Special Packets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPackets#getSpecialPacket <em>Special Packet</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentSpecialPackets()
 * @model
 * @generated
 */
public interface GSSEnvironmentSpecialPackets extends EObject {
	/**
	 * Returns the value of the '<em><b>Special Packet</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.environment.GSSEnvironmentSpecialPacket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packet</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentSpecialPackets_SpecialPacket()
	 * @model containment="true" required="true" upper="17"
	 * @generated
	 */
	EList<GSSEnvironmentSpecialPacket> getSpecialPacket();

} // GSSEnvironmentSpecialPackets
