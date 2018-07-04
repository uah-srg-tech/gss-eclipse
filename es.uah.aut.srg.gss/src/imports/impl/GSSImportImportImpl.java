/**
 */
package imports.impl;

import es.uah.aut.srg.gss.common.impl.GSSModelElementImpl;

import imports.GSSImportDataSource;
import imports.GSSImportImport;
import imports.GSSImportVirtualSize;
import imports.ImportsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Import Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imports.impl.GSSImportImportImpl#getFrom <em>From</em>}</li>
 *   <li>{@link imports.impl.GSSImportImportImpl#getTo <em>To</em>}</li>
 *   <li>{@link imports.impl.GSSImportImportImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link imports.impl.GSSImportImportImpl#getVirtualSize <em>Virtual Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSImportImportImpl extends GSSModelElementImpl implements GSSImportImport {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected GSSImportDataSource dataSource;

	/**
	 * The cached value of the '{@link #getVirtualSize() <em>Virtual Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSize()
	 * @generated
	 * @ordered
	 */
	protected GSSImportVirtualSize virtualSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSImportImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportsPackage.Literals.GSS_IMPORT_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_IMPORT__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_IMPORT__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportDataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(GSSImportDataSource newDataSource, NotificationChain msgs) {
		GSSImportDataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(GSSImportDataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSImportVirtualSize getVirtualSize() {
		return virtualSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualSize(GSSImportVirtualSize newVirtualSize, NotificationChain msgs) {
		GSSImportVirtualSize oldVirtualSize = virtualSize;
		virtualSize = newVirtualSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, oldVirtualSize, newVirtualSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualSize(GSSImportVirtualSize newVirtualSize) {
		if (newVirtualSize != virtualSize) {
			NotificationChain msgs = null;
			if (virtualSize != null)
				msgs = ((InternalEObject)virtualSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, null, msgs);
			if (newVirtualSize != null)
				msgs = ((InternalEObject)newVirtualSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, null, msgs);
			msgs = basicSetVirtualSize(newVirtualSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE, newVirtualSize, newVirtualSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				return basicSetVirtualSize(null, msgs);
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
			case ImportsPackage.GSS_IMPORT_IMPORT__FROM:
				return getFrom();
			case ImportsPackage.GSS_IMPORT_IMPORT__TO:
				return getTo();
			case ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return getDataSource();
			case ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				return getVirtualSize();
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
			case ImportsPackage.GSS_IMPORT_IMPORT__FROM:
				setFrom((String)newValue);
				return;
			case ImportsPackage.GSS_IMPORT_IMPORT__TO:
				setTo((String)newValue);
				return;
			case ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				setDataSource((GSSImportDataSource)newValue);
				return;
			case ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				setVirtualSize((GSSImportVirtualSize)newValue);
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
			case ImportsPackage.GSS_IMPORT_IMPORT__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case ImportsPackage.GSS_IMPORT_IMPORT__TO:
				setTo(TO_EDEFAULT);
				return;
			case ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				setDataSource((GSSImportDataSource)null);
				return;
			case ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				setVirtualSize((GSSImportVirtualSize)null);
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
			case ImportsPackage.GSS_IMPORT_IMPORT__FROM:
				return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
			case ImportsPackage.GSS_IMPORT_IMPORT__TO:
				return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
			case ImportsPackage.GSS_IMPORT_IMPORT__DATA_SOURCE:
				return dataSource != null;
			case ImportsPackage.GSS_IMPORT_IMPORT__VIRTUAL_SIZE:
				return virtualSize != null;
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
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(')');
		return result.toString();
	}

} //GSSImportImportImpl
