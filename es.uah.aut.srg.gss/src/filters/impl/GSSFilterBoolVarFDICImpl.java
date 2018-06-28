/**
 */
package filters.impl;

import filters.FiltersPackage;
import filters.GSSFilterBoolVarFDIC;
import filters.GSSFilterFieldOp;
import filters.GSSFilterFieldRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var FDIC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filters.impl.GSSFilterBoolVarFDICImpl#getId <em>Id</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFDICImpl#getName <em>Name</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFDICImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFDICImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarFDICImpl extends MinimalEObjectImpl.Container implements GSSFilterBoolVarFDIC {
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
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFieldRef fieldRef;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterFieldOp op;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterBoolVarFDICImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.GSS_FILTER_BOOL_VAR_FDIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFieldRef getFieldRef() {
		if (fieldRef != null && fieldRef.eIsProxy()) {
			InternalEObject oldFieldRef = (InternalEObject)fieldRef;
			fieldRef = (GSSFilterFieldRef)eResolveProxy(oldFieldRef);
			if (fieldRef != oldFieldRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF, oldFieldRef, fieldRef));
			}
		}
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFieldRef basicGetFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(GSSFilterFieldRef newFieldRef) {
		GSSFilterFieldRef oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFieldOp getOp() {
		if (op != null && op.eIsProxy()) {
			InternalEObject oldOp = (InternalEObject)op;
			op = (GSSFilterFieldOp)eResolveProxy(oldOp);
			if (op != oldOp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP, oldOp, op));
			}
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterFieldOp basicGetOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(GSSFilterFieldOp newOp) {
		GSSFilterFieldOp oldOp = op;
		op = newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				return getId();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				return getName();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				if (resolve) return getOp();
				return basicGetOp();
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				setId((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				setName((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				setFieldRef((GSSFilterFieldRef)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				setOp((GSSFilterFieldOp)newValue);
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				setId(ID_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				setFieldRef((GSSFilterFieldRef)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				setOp((GSSFilterFieldOp)null);
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__FIELD_REF:
				return fieldRef != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FDIC__OP:
				return op != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarFDICImpl
