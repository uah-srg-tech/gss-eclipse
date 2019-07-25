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

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Environment Main Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface#getProtocolPacketsFile <em>Protocol Packets File</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentMainInterface()
 * @model
 * @generated
 */
public interface GSSEnvironmentMainInterface extends GSSEnvironmentInterface {
	/**
	 * Returns the value of the '<em><b>Protocol Packets File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Packets File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Packets File</em>' reference.
	 * @see #setProtocolPacketsFile(GSSProtocolPacketsProtocolPackets)
	 * @see es.uah.aut.srg.gss.environment.environmentPackage#getGSSEnvironmentMainInterface_ProtocolPacketsFile()
	 * @model
	 * @generated
	 */
	GSSProtocolPacketsProtocolPackets getProtocolPacketsFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.environment.GSSEnvironmentMainInterface#getProtocolPacketsFile <em>Protocol Packets File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Packets File</em>' reference.
	 * @see #getProtocolPacketsFile()
	 * @generated
	 */
	void setProtocolPacketsFile(GSSProtocolPacketsProtocolPackets value);

} // GSSEnvironmentMainInterface
