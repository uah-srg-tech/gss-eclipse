/**
 */
package filters.impl;

import filters.FiltersPackage;
import filters.GSSFilterBoolVarRef;
import filters.GSSFilterMaxterm;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Maxterm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filters.impl.GSSFilterMaxtermImpl#getId <em>Id</em>}</li>
 *   <li>{@link filters.impl.GSSFilterMaxtermImpl#getBoolVarRef <em>Bool Var Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterMaxtermImpl extends MinimalEObjectImpl.Container implements GSSFilterMaxterm {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoolVarRef() <em>Bool Var Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarRef()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVarRef> boolVarRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterMaxtermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.GSS_FILTER_MAXTERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_MAXTERM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVarRef> getBoolVarRef() {
		if (boolVarRef == null) {
			boolVarRef = new EObjectResolvingEList<GSSFilterBoolVarRef>(GSSFilterBoolVarRef.class, this, FiltersPackage.GSS_FILTER_MAXTERM__BOOL_VAR_REF);
		}
		return boolVarRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FiltersPackage.GSS_FILTER_MAXTERM__ID:
				return getId();
			case FiltersPackage.GSS_FILTER_MAXTERM__BOOL_VAR_REF:
				return getBoolVarRef();
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
			case FiltersPackage.GSS_FILTER_MAXTERM__ID:
				setId((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_MAXTERM__BOOL_VAR_REF:
				getBoolVarRef().clear();
				getBoolVarRef().addAll((Collection<? extends GSSFilterBoolVarRef>)newValue);
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
			case FiltersPackage.GSS_FILTER_MAXTERM__ID:
				setId(ID_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_MAXTERM__BOOL_VAR_REF:
				getBoolVarRef().clear();
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
			case FiltersPackage.GSS_FILTER_MAXTERM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FiltersPackage.GSS_FILTER_MAXTERM__BOOL_VAR_REF:
				return boolVarRef != null && !boolVarRef.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GSSFilterMaxtermImpl
