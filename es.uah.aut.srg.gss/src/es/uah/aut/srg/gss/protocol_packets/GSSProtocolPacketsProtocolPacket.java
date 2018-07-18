/**
 */
package es.uah.aut.srg.gss.protocol_packets;

import es.uah.aut.srg.gss.export.GSSExportExport;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Protocol Packets Protocol Packet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getExport <em>Export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPacket()
 * @model
 * @generated
 */
public interface GSSProtocolPacketsProtocolPacket extends EObject {
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
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPacket_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>If Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Ref</em>' attribute.
	 * @see #setIfRef(String)
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPacket_IfRef()
	 * @model required="true"
	 * @generated
	 */
	String getIfRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getIfRef <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Ref</em>' attribute.
	 * @see #getIfRef()
	 * @generated
	 */
	void setIfRef(String value);

	/**
	 * Returns the value of the '<em><b>Level Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Ref</em>' attribute.
	 * @see #setLevelRef(String)
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPacket_LevelRef()
	 * @model required="true"
	 * @generated
	 */
	String getLevelRef();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getLevelRef <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Ref</em>' attribute.
	 * @see #getLevelRef()
	 * @generated
	 */
	void setLevelRef(String value);

	/**
	 * Returns the value of the '<em><b>Export</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' reference.
	 * @see #setExport(GSSExportExport)
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPacket_Export()
	 * @model required="true"
	 * @generated
	 */
	GSSExportExport getExport();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getExport <em>Export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export</em>' reference.
	 * @see #getExport()
	 * @generated
	 */
	void setExport(GSSExportExport value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' containment reference.
	 * @see #setFormat(GSSProtocolPacketsFormat)
	 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage#getGSSProtocolPacketsProtocolPacket_Format()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSProtocolPacketsFormat getFormat();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket#getFormat <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' containment reference.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(GSSProtocolPacketsFormat value);

} // GSSProtocolPacketsProtocolPacket
