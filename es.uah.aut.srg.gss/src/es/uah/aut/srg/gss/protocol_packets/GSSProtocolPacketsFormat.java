/**
 */
package es.uah.aut.srg.gss.protocol_packets;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Protocol Packets Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsFormat()
 * @model
 * @generated
 */
public interface GSSProtocolPacketsFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(String)
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsFormat_File()
	 * @model required="true"
	 * @generated
	 */
	String getFile();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(String value);

} // GSSProtocolPacketsFormat
