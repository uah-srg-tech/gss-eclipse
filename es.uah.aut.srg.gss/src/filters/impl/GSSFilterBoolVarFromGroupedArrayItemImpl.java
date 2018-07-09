/**
 */
package filters.impl;

import filters.FiltersPackage;
import filters.GSSFilterAIFieldRefs;
import filters.GSSFilterBoolVarFromGroupedArrayItem;
import filters.GSSFilterConstant;
import filters.GSSFilterConstantType;
import filters.GSSFilterFieldOp;
import filters.GSSFilterSelect;
import filters.GSSFilterSelectLine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Bool Var From Grouped Array Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getConstantType <em>Constant Type</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getAIFieldRefs <em>AI Field Refs</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getOp <em>Op</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link filters.impl.GSSFilterBoolVarFromGroupedArrayItemImpl#getSelectLine <em>Select Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSFilterBoolVarFromGroupedArrayItemImpl extends MinimalEObjectImpl.Container implements GSSFilterBoolVarFromGroupedArrayItem {
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
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAIFieldRefs() <em>AI Field Refs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIFieldRefs()
	 * @generated
	 * @ordered
	 */
	protected GSSFilterAIFieldRefs aiFieldRefs;

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
	protected GSSFilterBoolVarFromGroupedArrayItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE, oldConstantType, constantType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterAIFieldRefs getAIFieldRefs() {
		if (aiFieldRefs != null && aiFieldRefs.eIsProxy()) {
			InternalEObject oldAIFieldRefs = (InternalEObject)aiFieldRefs;
			aiFieldRefs = (GSSFilterAIFieldRefs)eResolveProxy(oldAIFieldRefs);
			if (aiFieldRefs != oldAIFieldRefs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS, oldAIFieldRefs, aiFieldRefs));
			}
		}
		return aiFieldRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSSFilterAIFieldRefs basicGetAIFieldRefs() {
		return aiFieldRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIFieldRefs(GSSFilterAIFieldRefs newAIFieldRefs) {
		GSSFilterAIFieldRefs oldAIFieldRefs = aiFieldRefs;
		aiFieldRefs = newAIFieldRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS, oldAIFieldRefs, aiFieldRefs));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP, oldOp, op));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP, oldOp, op));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT, oldConstant, constant));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT, oldConstant, constant));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT, oldSelect, select));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT, oldSelect, select));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE, oldSelectLine, selectLine));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE, oldSelectLine, selectLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				return getId();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				return getName();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				return getConstantType();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				return getGroup();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				if (resolve) return getAIFieldRefs();
				return basicGetAIFieldRefs();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				if (resolve) return getOp();
				return basicGetOp();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				if (resolve) return getConstant();
				return basicGetConstant();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				if (resolve) return getSelect();
				return basicGetSelect();
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				setId((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				setName((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType((GSSFilterConstantType)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				setGroup((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				setAIFieldRefs((GSSFilterAIFieldRefs)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				setOp((GSSFilterFieldOp)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				setConstant((GSSFilterConstant)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				setSelect((GSSFilterSelect)newValue);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				setConstantType(CONSTANT_TYPE_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				setAIFieldRefs((GSSFilterAIFieldRefs)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				setOp((GSSFilterFieldOp)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				setConstant((GSSFilterConstant)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				setSelect((GSSFilterSelect)null);
				return;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT_TYPE:
				return constantType != CONSTANT_TYPE_EDEFAULT;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__AI_FIELD_REFS:
				return aiFieldRefs != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__OP:
				return op != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__CONSTANT:
				return constant != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT:
				return select != null;
			case FiltersPackage.GSS_FILTER_BOOL_VAR_FROM_GROUPED_ARRAY_ITEM__SELECT_LINE:
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
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //GSSFilterBoolVarFromGroupedArrayItemImpl