/**
 */
package es.uah.aut.srg.gss.protocol_packets.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket;
import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets;
import es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Protocol Packets Protocol Packets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketsImpl#getProtocolPacket <em>Protocol Packet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSProtocolPacketsProtocolPacketsImpl extends GSSModelElementImpl implements GSSProtocolPacketsProtocolPackets {
	/**
	 * The cached value of the '{@link #getProtocolPacket() <em>Protocol Packet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolPacket()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSProtocolPacketsProtocolPacket> protocolPacket;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSProtocolPacketsProtocolPacketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSProtocolPacketsProtocolPacket> getProtocolPacket() {
		if (protocolPacket == null) {
			protocolPacket = new EObjectContainmentEList<GSSProtocolPacketsProtocolPacket>(GSSProtocolPacketsProtocolPacket.class, this, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET);
		}
		return protocolPacket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET:
				return ((InternalEList<?>)getProtocolPacket()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET:
				return getProtocolPacket();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET:
				getProtocolPacket().clear();
				getProtocolPacket().addAll((Collection<? extends GSSProtocolPacketsProtocolPacket>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET:
				getProtocolPacket().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKETS__PROTOCOL_PACKET:
				return protocolPacket != null && !protocolPacket.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GSSProtocolPacketsProtocolPacketsImpl
