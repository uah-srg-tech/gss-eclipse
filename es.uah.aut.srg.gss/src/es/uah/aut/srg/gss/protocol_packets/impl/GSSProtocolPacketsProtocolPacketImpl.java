/**
 */
package es.uah.aut.srg.gss.protocol_packets.impl;

import es.uah.aut.srg.gss.export.GSSExportExport;

import es.uah.aut.srg.gss.protocol_packets.GSSProtocolPacketsProtocolPacket;
import es.uah.aut.srg.gss.protocol_packets.protocol_packetsPackage;
import es.uah.aut.srg.gss.tm_tc_format.GSSTmTcFormatTmTcFormat;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Protocol Packets Protocol Packet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl#getIfRef <em>If Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl#getLevelRef <em>Level Ref</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl#getExport <em>Export</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.protocol_packets.impl.GSSProtocolPacketsProtocolPacketImpl#getFormat <em>Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSProtocolPacketsProtocolPacketImpl extends MinimalEObjectImpl.Container implements GSSProtocolPacketsProtocolPacket {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIfRef() <em>If Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfRef()
	 * @generated
	 * @ordered
	 */
	protected String ifRef = IF_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelRef() <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelRef() <em>Level Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelRef()
	 * @generated
	 * @ordered
	 */
	protected String levelRef = LEVEL_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExport() <em>Export</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport()
	 * @generated
	 * @ordered
	 */
	protected GSSExportExport export;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected GSSTmTcFormatTmTcFormat format;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSProtocolPacketsProtocolPacketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return protocol_packetsPackage.Literals.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIfRef() {
		return ifRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfRef(String newIfRef) {
		String oldIfRef = ifRef;
		ifRef = newIfRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF, oldIfRef, ifRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelRef() {
		return levelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelRef(String newLevelRef) {
		String oldLevelRef = levelRef;
		levelRef = newLevelRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF, oldLevelRef, levelRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport getExport() {
		if (export != null && export.eIsProxy()) {
			InternalEObject oldExport = (InternalEObject)export;
			export = (GSSExportExport)eResolveProxy(oldExport);
			if (export != oldExport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT, oldExport, export));
			}
		}
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSExportExport basicGetExport() {
		return export;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport(GSSExportExport newExport) {
		GSSExportExport oldExport = export;
		export = newExport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT, oldExport, export));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat getFormat() {
		if (format != null && format.eIsProxy()) {
			InternalEObject oldFormat = (InternalEObject)format;
			format = (GSSTmTcFormatTmTcFormat)eResolveProxy(oldFormat);
			if (format != oldFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT, oldFormat, format));
			}
		}
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSTmTcFormatTmTcFormat basicGetFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(GSSTmTcFormatTmTcFormat newFormat) {
		GSSTmTcFormatTmTcFormat oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME:
				return getName();
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF:
				return getIfRef();
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF:
				return getLevelRef();
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT:
				if (resolve) return getExport();
				return basicGetExport();
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT:
				if (resolve) return getFormat();
				return basicGetFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME:
				setName((String)newValue);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF:
				setIfRef((String)newValue);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF:
				setLevelRef((String)newValue);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT:
				setExport((GSSExportExport)newValue);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT:
				setFormat((GSSTmTcFormatTmTcFormat)newValue);
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
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF:
				setIfRef(IF_REF_EDEFAULT);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF:
				setLevelRef(LEVEL_REF_EDEFAULT);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT:
				setExport((GSSExportExport)null);
				return;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT:
				setFormat((GSSTmTcFormatTmTcFormat)null);
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
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__IF_REF:
				return IF_REF_EDEFAULT == null ? ifRef != null : !IF_REF_EDEFAULT.equals(ifRef);
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__LEVEL_REF:
				return LEVEL_REF_EDEFAULT == null ? levelRef != null : !LEVEL_REF_EDEFAULT.equals(levelRef);
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__EXPORT:
				return export != null;
			case protocol_packetsPackage.GSS_PROTOCOL_PACKETS_PROTOCOL_PACKET__FORMAT:
				return format != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ifRef: ");
		result.append(ifRef);
		result.append(", levelRef: ");
		result.append(levelRef);
		result.append(')');
		return result.toString();
	}

} //GSSProtocolPacketsProtocolPacketImpl
