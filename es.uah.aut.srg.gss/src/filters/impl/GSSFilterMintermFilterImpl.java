/**
 */
package filters.impl;

import filters.FiltersPackage;
import filters.GSSFilterBoolVar;
import filters.GSSFilterBoolVarFDIC;
import filters.GSSFilterBoolVarFromArrayItem;
import filters.GSSFilterBoolVarFromGroupedArrayItem;
import filters.GSSFilterMinterm;
import filters.GSSFilterMintermFilter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSS Filter Minterm Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link filters.impl.GSSFilterMintermFilterImpl#getFormatFile <em>Format File</em>}</li>
 *   <li>{@link filters.impl.GSSFilterMintermFilterImpl#getBoolVar <em>Bool Var</em>}</li>
 *   <li>{@link filters.impl.GSSFilterMintermFilterImpl#getBoolVarFromArrayItem <em>Bool Var From Array Item</em>}</li>
 *   <li>{@link filters.impl.GSSFilterMintermFilterImpl#getBoolVarFromGroupedArrayItem <em>Bool Var From Grouped Array Item</em>}</li>
 *   <li>{@link filters.impl.GSSFilterMintermFilterImpl#getBoolVarFDIC <em>Bool Var FDIC</em>}</li>
 *   <li>{@link filters.impl.GSSFilterMintermFilterImpl#getMinterm <em>Minterm</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GSSFilterMintermFilterImpl extends GSSFilterFilterImpl implements GSSFilterMintermFilter {
	/**
	 * The default value of the '{@link #getFormatFile() <em>Format File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatFile() <em>Format File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatFile()
	 * @generated
	 * @ordered
	 */
	protected String formatFile = FORMAT_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoolVar() <em>Bool Var</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVar()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVar> boolVar;

	/**
	 * The cached value of the '{@link #getBoolVarFromArrayItem() <em>Bool Var From Array Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFromArrayItem()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVarFromArrayItem> boolVarFromArrayItem;

	/**
	 * The cached value of the '{@link #getBoolVarFromGroupedArrayItem() <em>Bool Var From Grouped Array Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFromGroupedArrayItem()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVarFromGroupedArrayItem> boolVarFromGroupedArrayItem;

	/**
	 * The cached value of the '{@link #getBoolVarFDIC() <em>Bool Var FDIC</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolVarFDIC()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterBoolVarFDIC> boolVarFDIC;

	/**
	 * The cached value of the '{@link #getMinterm() <em>Minterm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinterm()
	 * @generated
	 * @ordered
	 */
	protected EList<GSSFilterMinterm> minterm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSSFilterMintermFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FiltersPackage.Literals.GSS_FILTER_MINTERM_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatFile() {
		return formatFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatFile(String newFormatFile) {
		String oldFormatFile = formatFile;
		formatFile = newFormatFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FiltersPackage.GSS_FILTER_MINTERM_FILTER__FORMAT_FILE, oldFormatFile, formatFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVar> getBoolVar() {
		if (boolVar == null) {
			boolVar = new EObjectResolvingEList<GSSFilterBoolVar>(GSSFilterBoolVar.class, this, FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR);
		}
		return boolVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVarFromArrayItem> getBoolVarFromArrayItem() {
		if (boolVarFromArrayItem == null) {
			boolVarFromArrayItem = new EObjectResolvingEList<GSSFilterBoolVarFromArrayItem>(GSSFilterBoolVarFromArrayItem.class, this, FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM);
		}
		return boolVarFromArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVarFromGroupedArrayItem> getBoolVarFromGroupedArrayItem() {
		if (boolVarFromGroupedArrayItem == null) {
			boolVarFromGroupedArrayItem = new EObjectResolvingEList<GSSFilterBoolVarFromGroupedArrayItem>(GSSFilterBoolVarFromGroupedArrayItem.class, this, FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM);
		}
		return boolVarFromGroupedArrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterBoolVarFDIC> getBoolVarFDIC() {
		if (boolVarFDIC == null) {
			boolVarFDIC = new EObjectResolvingEList<GSSFilterBoolVarFDIC>(GSSFilterBoolVarFDIC.class, this, FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC);
		}
		return boolVarFDIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSSFilterMinterm> getMinterm() {
		if (minterm == null) {
			minterm = new EObjectResolvingEList<GSSFilterMinterm>(GSSFilterMinterm.class, this, FiltersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM);
		}
		return minterm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__FORMAT_FILE:
				return getFormatFile();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR:
				return getBoolVar();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return getBoolVarFromArrayItem();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return getBoolVarFromGroupedArrayItem();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC:
				return getBoolVarFDIC();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				return getMinterm();
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
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__FORMAT_FILE:
				setFormatFile((String)newValue);
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR:
				getBoolVar().clear();
				getBoolVar().addAll((Collection<? extends GSSFilterBoolVar>)newValue);
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				getBoolVarFromArrayItem().addAll((Collection<? extends GSSFilterBoolVarFromArrayItem>)newValue);
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				getBoolVarFromGroupedArrayItem().addAll((Collection<? extends GSSFilterBoolVarFromGroupedArrayItem>)newValue);
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
				getBoolVarFDIC().addAll((Collection<? extends GSSFilterBoolVarFDIC>)newValue);
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				getMinterm().clear();
				getMinterm().addAll((Collection<? extends GSSFilterMinterm>)newValue);
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
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__FORMAT_FILE:
				setFormatFile(FORMAT_FILE_EDEFAULT);
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR:
				getBoolVar().clear();
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				getBoolVarFromArrayItem().clear();
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				getBoolVarFromGroupedArrayItem().clear();
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC:
				getBoolVarFDIC().clear();
				return;
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				getMinterm().clear();
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
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__FORMAT_FILE:
				return FORMAT_FILE_EDEFAULT == null ? formatFile != null : !FORMAT_FILE_EDEFAULT.equals(formatFile);
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR:
				return boolVar != null && !boolVar.isEmpty();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_ARRAY_ITEM:
				return boolVarFromArrayItem != null && !boolVarFromArrayItem.isEmpty();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FROM_GROUPED_ARRAY_ITEM:
				return boolVarFromGroupedArrayItem != null && !boolVarFromGroupedArrayItem.isEmpty();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__BOOL_VAR_FDIC:
				return boolVarFDIC != null && !boolVarFDIC.isEmpty();
			case FiltersPackage.GSS_FILTER_MINTERM_FILTER__MINTERM:
				return minterm != null && !minterm.isEmpty();
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
		result.append(" (formatFile: ");
		result.append(formatFile);
		result.append(')');
		return result.toString();
	}

} //GSSFilterMintermFilterImpl
