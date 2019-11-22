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
 * A representation of the model object '<em><b>GSS Format AField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatAField#getType <em>Type</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatAField#getByteOrder <em>Byte Order</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatAField#getFirstBit <em>First Bit</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatAField#getArrayDimension <em>Array Dimension</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatAField#getSize <em>Size</em>}</li>
 *   <li>{@link es.uah.aut.srg.gss.format.GSSFormatAField#getGlobalOffset <em>Global Offset</em>}</li>
 * </ul>
 *
 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatAField()
 * @model
 * @generated
 */
public interface GSSFormatAField extends GSSFormatField {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.uah.aut.srg.gss.format.GSSFormatFieldType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(GSSFormatFieldType)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatAField_Type()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFormatFieldType getType();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.uah.aut.srg.gss.format.GSSFormatFieldType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(GSSFormatFieldType value);

	/**
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(GSSFormatFieldType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(GSSFormatFieldType)
	 * @generated
	 */
	boolean isSetType();

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
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatAField_ByteOrder()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFormatFieldByteOrder getByteOrder();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getByteOrder <em>Byte Order</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getByteOrder <em>Byte Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetByteOrder()
	 * @see #getByteOrder()
	 * @see #setByteOrder(GSSFormatFieldByteOrder)
	 * @generated
	 */
	void unsetByteOrder();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getByteOrder <em>Byte Order</em>}' attribute is set.
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
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatAField_FirstBit()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	GSSFormatSFieldFirstBit getFirstBit();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getFirstBit <em>First Bit</em>}' attribute.
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
	 * Unsets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getFirstBit <em>First Bit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFirstBit()
	 * @see #getFirstBit()
	 * @see #setFirstBit(GSSFormatSFieldFirstBit)
	 * @generated
	 */
	void unsetFirstBit();

	/**
	 * Returns whether the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getFirstBit <em>First Bit</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Array Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Dimension</em>' containment reference.
	 * @see #setArrayDimension(GSSFormatArrayDimension)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatAField_ArrayDimension()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFormatArrayDimension getArrayDimension();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getArrayDimension <em>Array Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Dimension</em>' containment reference.
	 * @see #getArrayDimension()
	 * @generated
	 */
	void setArrayDimension(GSSFormatArrayDimension value);

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
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatAField_Size()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFormatBytesBits getSize();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(GSSFormatBytesBits value);

	/**
	 * Returns the value of the '<em><b>Global Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Offset</em>' containment reference.
	 * @see #setGlobalOffset(GSSFormatBytesBits)
	 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatAField_GlobalOffset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GSSFormatBytesBits getGlobalOffset();

	/**
	 * Sets the value of the '{@link es.uah.aut.srg.gss.format.GSSFormatAField#getGlobalOffset <em>Global Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Offset</em>' containment reference.
	 * @see #getGlobalOffset()
	 * @generated
	 */
	void setGlobalOffset(GSSFormatBytesBits value);

} // GSSFormatAField
