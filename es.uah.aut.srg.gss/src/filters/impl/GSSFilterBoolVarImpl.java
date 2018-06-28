/**
 */
package filters.impl;

import filters.FiltersPackage;
import filters.GSSFilterBoolVar;
import filters.GSSFilterConstant;
import filters.GSSFilterConstantType;
import filters.GSSFilterFieldOp;
import filters.GSSFilterFieldRef;
import filters.GSSFilterSelect;
import filters.GSSFilterSelectLine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getId <em>Id</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getName <em>Name</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getOp <em>Op</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarImpl#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarImpl extends MinimalEObjectImpl.Container implements GSSFilterBoolVar {
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
	 * The default value of the '{@link #getConstantType() <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantType()
	 * @generated
	 * @ordered
	 */
	protected static final GSSFilterConstantType CONSTANT_TYPE_EDEFAULT = GSSFilterConstantType.DECIMAL;

	/**
	 * The cached value of the '{@link #getConstantType() <em>Constant Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantType()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterConstantType constantType = CONSTANT_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterConstant constant;

	/**
	 * The cached value of the '{@link #getSelect() <em>Select</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelect()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterSelect select;

	/**
	 * The cached value of the '{@link #getSelectLine() <em>Select Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectLine()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterSelectLine selectLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterBoolVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.GSS_FILTER_BOOL_VAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterConstantType getConstantType() {
		return constantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantType(GSSFilterConstantType newConstantType) {
		GSSFilterConstantType oldConstantType = constantType;
		constantType = newConstantType == null ? CONSTANT_TYPE_EDEFAULT : newConstantType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE, oldConstantType, constantType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR__FIELD_REF, oldFieldRef, fieldRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__FIELD_REF, oldFieldRef, fieldRef));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterConstant getConstant() {
		if (constant != null && constant.eIsProxy()) {
			InternalEObject oldConstant = (InternalEObject)constant;
			constant = (GSSFilterConstant)eResolveProxy(oldConstant);
			if (constant != oldConstant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT, oldConstant, constant));
			}
		}
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterConstant basicGetConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(GSSFilterConstant newConstant) {
		GSSFilterConstant oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT, oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelect getSelect() {
		if (select != null && select.eIsProxy()) {
			InternalEObject oldSelect = (InternalEObject)select;
			select = (GSSFilterSelect)eResolveProxy(oldSelect);
			if (select != oldSelect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT, oldSelect, select));
			}
		}
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelect basicGetSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelect(GSSFilterSelect newSelect) {
		GSSFilterSelect oldSelect = select;
		select = newSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelectLine getSelectLine() {
		if (selectLine != null && selectLine.eIsProxy()) {
			InternalEObject oldSelectLine = (InternalEObject)selectLine;
			selectLine = (GSSFilterSelectLine)eResolveProxy(oldSelectLine);
			if (selectLine != oldSelectLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT_LINE, oldSelectLine, selectLine));
			}
		}
		return selectLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterSelectLine basicGetSelectLine() {
		return selectLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectLine(GSSFilterSelectLine newSelectLine) {
		GSSFilterSelectLine oldSelectLine = selectLine;
		selectLine = newSelectLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT_LINE, oldSelectLine, selectLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FiltersPackage.GSS_FILTER_BOOL_VAR__ID:
				return getId();
			case FiltersPackage.GSS_FILTER_BOOL_VAR__NAME:
				return getName();
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				return getConstantType();
			case FiltersPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				if (resolve) return getFieldRef();
				return basicGetFieldRef();
			case FiltersPackage.GSS_FILTER_BOOL_VAR__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT:
				if (resolve) return getConstant();
				return basicGetConstant();
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT:
				if (resolve) return getSelect();
				return basicGetSelect();
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT_LINE:
				if (resolve) return getSelectLine();
				return basicGetSelectLine();
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR__ID:
				setId((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__NAME:
				setName((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				setConstantType((GSSFilterConstantType)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				setFieldRef((GSSFilterFieldRef)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__OP:
				setOp((GSSFilterFieldOp)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT:
				setConstant((GSSFilterConstant)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT:
				setSelect((GSSFilterSelect)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT_LINE:
				setSelectLine((GSSFilterSelectLine)newValue);
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR__ID:
				setId(ID_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				setConstantType(CONSTANT_TYPE_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				setFieldRef((GSSFilterFieldRef)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__OP:
				setOp((GSSFilterFieldOp)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT:
				setConstant((GSSFilterConstant)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT:
				setSelect((GSSFilterSelect)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT_LINE:
				setSelectLine((GSSFilterSelectLine)null);
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FiltersPackage.GSS_FILTER_BOOL_VAR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT_TYPE:
				return constantType != CONSTANT_TYPE_EDEFAULT;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__FIELD_REF:
				return fieldRef != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__OP:
				return op != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__CONSTANT:
				return constant != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT:
				return select != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR__SELECT_LINE:
				return selectLine != null;
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
		result.append(", constantType: ");
		result.append(constantType);
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarImpl
