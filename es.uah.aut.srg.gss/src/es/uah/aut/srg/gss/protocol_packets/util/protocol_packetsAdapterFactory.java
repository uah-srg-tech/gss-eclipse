/**
 */
package es.uah.aut.srg.gss.protocol_packets.util;

import es.uah.aut.srg.gss.common.GSSModelElement;

import es.uah.aut.srg.gss.protocol_packets.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage
 * @generated
 */
public class protocol_packetsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static protocol_packetsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public protocol_packetsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = protocol_packetsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected protocol_packetsSwitch<Adapter> modelSwitch =
		new protocol_packetsSwitch<Adapter>() {
			@Override
			public Adapter caseGSSProtocolPacketsProtocolPackets(GSSProtocolPacketsProtocolPackets object) {
				return createGSSProtocolPacketsProtocolPacketsAdapter();
			}
			@Override
			public Adapter caseGSSProtocolPacketsProtocolPacket(GSSProtocolPacketsProtocolPacket object) {
				return createGSSProtocolPacketsProtocolPacketAdapter();
			}
			@Override
			public Adapter caseGSSProtocolPacketsFormat(GSSProtocolPacketsFormat object) {
				return createGSSProtocolPacketsFormatAdapter();
			}
			@Override
			public Adapter caseGSSModelElement(GSSModelElement object) {
				return createGSSModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets <em>GSS Protocol Packets Protocol Packets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPackets
	 * @generated
	 */
	public Adapter createGSSProtocolPacketsProtocolPacketsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket <em>GSS Protocol Packets Protocol Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket
	 * @generated
	 */
	public Adapter createGSSProtocolPacketsProtocolPacketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat <em>GSS Protocol Packets Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsFormat
	 * @generated
	 */
	public Adapter createGSSProtocolPacketsFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.uah.aut.srg.gss.common.GSSModelElement <em>GSS Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.uah.aut.srg.gss.common.GSSModelElement
	 * @generated
	 */
	public Adapter createGSSModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //protocol_packetsAdapterFactory
