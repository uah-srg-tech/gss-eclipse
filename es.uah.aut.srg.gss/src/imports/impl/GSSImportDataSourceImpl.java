/**
 */
package imports.impl;

import imports.GSSImportDataSource;
import imports.ImportsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Import Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link imports.impl.GSSImportDataSourceImpl#getFieldRef <em>Field Ref</em>}</li>
 *   <li>{@link imports.impl.GSSImportDataSourceImpl#getLeftTrim <em>Left Trim</em>}</li>
 *   <li>{@link imports.impl.GSSImportDataSourceImpl#getRightTrim <em>Right Trim</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSSImportDataSourceImpl extends MinimalEObjectImpl.Container implements GSSImportDataSource {
	/**
	 * The default value of the '{@link #getFieldRef() <em>Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldRef() <em>Field Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldRef()
	 * @generated
	 * @ordered
	 */
	protected String fieldRef = FIELD_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLeftTrim() <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTrim()
	 * @generated
	 * @ordered
	 */
	protected static final String LEFT_TRIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLeftTrim() <em>Left Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftTrim()
	 * @generated
	 * @ordered
	 */
	protected String leftTrim = LEFT_TRIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRightTrim() <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTrim()
	 * @generated
	 * @ordered
	 */
	protected static final String RIGHT_TRIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRightTrim() <em>Right Trim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightTrim()
	 * @generated
	 * @ordered
	 */
	protected String rightTrim = RIGHT_TRIM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSImportDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImportsPackage.Literals.GSS_IMPORT_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldRef() {
		return fieldRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldRef(String newFieldRef) {
		String oldFieldRef = fieldRef;
		fieldRef = newFieldRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_DATA_SOURCE__FIELD_REF, oldFieldRef, fieldRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLeftTrim() {
		return leftTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftTrim(String newLeftTrim) {
		String oldLeftTrim = leftTrim;
		leftTrim = newLeftTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_DATA_SOURCE__LEFT_TRIM, oldLeftTrim, leftTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRightTrim() {
		return rightTrim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightTrim(String newRightTrim) {
		String oldRightTrim = rightTrim;
		rightTrim = newRightTrim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImportsPackage.GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM, oldRightTrim, rightTrim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__FIELD_REF:
				return getFieldRef();
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__LEFT_TRIM:
				return getLeftTrim();
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				return getRightTrim();
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
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__FIELD_REF:
				setFieldRef((String)newValue);
				return;
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__LEFT_TRIM:
				setLeftTrim((String)newValue);
				return;
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				setRightTrim((String)newValue);
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
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__FIELD_REF:
				setFieldRef(FIELD_REF_EDEFAULT);
				return;
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__LEFT_TRIM:
				setLeftTrim(LEFT_TRIM_EDEFAULT);
				return;
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				setRightTrim(RIGHT_TRIM_EDEFAULT);
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
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__FIELD_REF:
				return FIELD_REF_EDEFAULT == null ? fieldRef != null : !FIELD_REF_EDEFAULT.equals(fieldRef);
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__LEFT_TRIM:
				return LEFT_TRIM_EDEFAULT == null ? leftTrim != null : !LEFT_TRIM_EDEFAULT.equals(leftTrim);
			case ImportsPackage.GSS_IMPORT_DATA_SOURCE__RIGHT_TRIM:
				return RIGHT_TRIM_EDEFAULT == null ? rightTrim != null : !RIGHT_TRIM_EDEFAULT.equals(rightTrim);
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
		result.append(" (FieldRef: ");
		result.append(fieldRef);
		result.append(", leftTrim: ");
		result.append(leftTrim);
		result.append(", rightTrim: ");
		result.append(rightTrim);
		result.append(')');
		return result.toString();
	}

} //GSSImportDataSourceImpl
