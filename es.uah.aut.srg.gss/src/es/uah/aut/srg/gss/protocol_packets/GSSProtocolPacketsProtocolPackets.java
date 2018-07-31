/**
 */
package es.uah.aut.srg.gss.protocol_packets;

import es.uah.aut.srg.gss.common.GSSModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Protocol Packets Protocol Packets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets#getProtocolPacket <em>Protocol Packet</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPackets()
 * @model
 * @generated
 */
public interface GSSProtocolPacketsProtocolPackets extends GSSModelElement {
	/**
	 * Returns the value of the '<em><b>Protocol Packet</b></em>' containment reference list.
	 * The list contents are of type {@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol Packet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Packet</em>' containment reference list.
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPackets_ProtocolPacket()
	 * @model containment="true" required="true" upper="15"
	 * @generated
	 */
	EList<GSSProtocolPacketsProtocolPacket> getProtocolPacket();

} // GSSProtocolPacketsProtocolPackets
