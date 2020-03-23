/**
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.format;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSS Format FDIC Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getCheckType <em>Check Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFloatingOffset <em>Floating Offset</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFDICField()
 * @model
 * @generated
 */
public interface GSSFormatFDICField extends GSSFormatField {
	/**
	 * Returns the value of the '<em><b>Check Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.format.GSSFormatCheckType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCheckType
	 * @see #isSetCheckType()
	 * @see #unsetCheckType()
	 * @see #setCheckType(GSSFormatCheckType)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFDICField_CheckType()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFormatCheckType getCheckType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getCheckType <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatCheckType
	 * @see #isSetCheckType()
	 * @see #unsetCheckType()
	 * @see #getCheckType()
	 * @generated
	 */
	void setCheckType(GSSFormatCheckType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getCheckType <em>Check Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCheckType()
	 * @see #getCheckType()
	 * @see #setCheckType(GSSFormatCheckType)
	 * @generated
	 */
	void unsetCheckType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getCheckType <em>Check Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Check Type</em>' attribute is set.
	 * @see #unsetCheckType()
	 * @see #getCheckType()
	 * @see #setCheckType(GSSFormatCheckType)
	 * @generated
	 */
	boolean isSetCheckType();

	/**
	 * Returns the value of the '<em><b>Byte Order</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Order</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder
	 * @see #isSetByteOrder()
	 * @see #unsetByteOrder()
	 * @see #setByteOrder(GSSFormatFieldByteOrder)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFDICField_ByteOrder()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFormatFieldByteOrder getByteOrder();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Order</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldByteOrder
	 * @see #isSetByteOrder()
	 * @see #unsetByteOrder()
	 * @see #getByteOrder()
	 * @generated
	 */
	void setByteOrder(GSSFormatFieldByteOrder value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(GSSFormatFieldByteOrder)
	 * @generated
	 */
	void unsetByteOrder();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getByteOrder <em>Byte Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Byte Order</em>' attribute is set.
	 * @see #unsetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(GSSFormatFieldByteOrder)
	 * @generated
	 */
	boolean isSetByteOrder();

	/**
	 * Returns the value of the '<em><b>First Bit</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Bit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Bit</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit
	 * @see #isSetFirstBit()
	 * @see #unsetFirstBit()
	 * @see #setFirstBit(GSSFormatSFieldFirstBit)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFDICField_FirstBit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFormatSFieldFirstBit getFirstBit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Bit</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatSFieldFirstBit
	 * @see #isSetFirstBit()
	 * @see #unsetFirstBit()
	 * @see #getFirstBit()
	 * @generated
	 */
	void setFirstBit(GSSFormatSFieldFirstBit value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(GSSFormatSFieldFirstBit)
	 * @generated
	 */
	void unsetFirstBit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFirstBit <em>First Bit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>First Bit</em>' attribute is set.
	 * @see #unsetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(GSSFormatSFieldFirstBit)
	 * @generated
	 */
	boolean isSetFirstBit();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(GSSFormatBytesBits)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFDICField_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFormatBytesBits getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(GSSFormatBytesBits value);

	/**
	 * Returns the value of the '<em><b>Floating Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Floating Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Offset</em>' containment reference.
	 * @see #setFloatingOffset(GSSFormatFloatingOffset)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFDICField_FloatingOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFormatFloatingOffset getFloatingOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getFloatingOffset <em>Floating Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Floating Offset</em>' containment reference.
	 * @see #getFloatingOffset()
	 * @generated
	 */
	void setFloatingOffset(GSSFormatFloatingOffset value);

	/**
	 * Returns the value of the '<em><b>Sorted Fields To Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorted Fields To Check</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorted Fields To Check</em>' containment reference.
	 * @see #setSortedFieldsToCheck(GSSFormatSortedFieldsToCheck)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatFDICField_SortedFieldsToCheck()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFormatSortedFieldsToCheck getSortedFieldsToCheck();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatFDICField#getSortedFieldsToCheck <em>Sorted Fields To Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorted Fields To Check</em>' containment reference.
	 * @see #getSortedFieldsToCheck()
	 * @generated
	 */
	void setSortedFieldsToCheck(GSSFormatSortedFieldsToCheck value);

} // GSSFormatFDICField
