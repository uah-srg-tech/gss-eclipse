/**
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     SRG Team - Initial API and implementation
 */
package es.uah.aut.srg.gss.tm_tc_format;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSS Tm Tc Format Field Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.tm_tc_format.tm_tc_formatPackage#getGSSTmTcFormatFieldType()
 * @model
 * @generated
 */
public enum GSSTmTcFormatFieldType implements Enumerator {
	/**
	 * The '<em><b>Structured</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURED_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURED(0, "structured", "structured"),

	/**
	 * The '<em><b>Uint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UINT_VALUE
	 * @generated
	 * @ordered
	 */
	UINT(1, "uint", "uint"),

	/**
	 * The '<em><b>Flag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG(2, "flag", "flag"),

	/**
	 * The '<em><b>Enumerated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMERATED_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMERATED(3, "enumerated", "enumerated"),

	/**
	 * The '<em><b>Bit vector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIT_VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	BIT_VECTOR(4, "bit_vector", "bit_vector"),

	/**
	 * The '<em><b>Byte vector</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE_VECTOR(5, "byte_vector", "byte_vector"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(6, "float", "float"),

	/**
	 * The '<em><b>Deduced</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEDUCED_VALUE
	 * @generated
	 * @ordered
	 */
	DEDUCED(7, "deduced", "deduced");

	/**
	 * The '<em><b>Structured</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Structured</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURED
	 * @model name="structured"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURED_VALUE = 0;

	/**
	 * The '<em><b>Uint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UINT
	 * @model name="uint"
	 * @generated
	 * @ordered
	 */
	public static final int UINT_VALUE = 1;

	/**
	 * The '<em><b>Flag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flag</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAG
	 * @model name="flag"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG_VALUE = 2;

	/**
	 * The '<em><b>Enumerated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enumerated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUMERATED
	 * @model name="enumerated"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATED_VALUE = 3;

	/**
	 * The '<em><b>Bit vector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bit vector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIT_VECTOR
	 * @model name="bit_vector"
	 * @generated
	 * @ordered
	 */
	public static final int BIT_VECTOR_VALUE = 4;

	/**
	 * The '<em><b>Byte vector</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Byte vector</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE_VECTOR
	 * @model name="byte_vector"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VECTOR_VALUE = 5;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Float</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 6;

	/**
	 * The '<em><b>Deduced</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deduced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEDUCED
	 * @model name="deduced"
	 * @generated
	 * @ordered
	 */
	public static final int DEDUCED_VALUE = 7;

	/**
	 * An array of all the '<em><b>GSS Tm Tc Format Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSSTmTcFormatFieldType[] VALUES_ARRAY =
		new GSSTmTcFormatFieldType[] {
			STRUCTURED,
			UINT,
			FLAG,
			ENUMERATED,
			BIT_VECTOR,
			BYTE_VECTOR,
			FLOAT,
			DEDUCED,
		};

	/**
	 * A public read-only list of all the '<em><b>GSS Tm Tc Format Field Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSSTmTcFormatFieldType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSS Tm Tc Format Field Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSTmTcFormatFieldType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSTmTcFormatFieldType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Tm Tc Format Field Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSTmTcFormatFieldType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSTmTcFormatFieldType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Tm Tc Format Field Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSTmTcFormatFieldType get(int value) {
		switch (value) {
			case STRUCTURED_VALUE: return STRUCTURED;
			case UINT_VALUE: return UINT;
			case FLAG_VALUE: return FLAG;
			case ENUMERATED_VALUE: return ENUMERATED;
			case BIT_VECTOR_VALUE: return BIT_VECTOR;
			case BYTE_VECTOR_VALUE: return BYTE_VECTOR;
			case FLOAT_VALUE: return FLOAT;
			case DEDUCED_VALUE: return DEDUCED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GSSTmTcFormatFieldType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GSSTmTcFormatFieldType
