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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSS Format Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.uah.aut.srg.gss.format.formatPackage#getGSSFormatUnit()
 * @model
 * @generated
 */
public enum GSSFormatUnit implements Enumerator {
	/**
	 * The '<em><b>Bytes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES(0, "bytes", "bytes"),

	/**
	 * The '<em><b>Bits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITS_VALUE
	 * @generated
	 * @ordered
	 */
	BITS(1, "bits", "bits"),

	/**
	 * The '<em><b>Halfword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALFWORD_VALUE
	 * @generated
	 * @ordered
	 */
	HALFWORD(2, "halfword", "halfword"),

	/**
	 * The '<em><b>String10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING10_VALUE
	 * @generated
	 * @ordered
	 */
	STRING10(3, "string10", "string10"),

	/**
	 * The '<em><b>String17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING17_VALUE
	 * @generated
	 * @ordered
	 */
	STRING17(4, "string17", "string17"),

	/**
	 * The '<em><b>String69</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING69_VALUE
	 * @generated
	 * @ordered
	 */
	STRING69(5, "string69", "string69");

	/**
	 * The '<em><b>Bytes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bytes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTES
	 * @model name="bytes"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES_VALUE = 0;

	/**
	 * The '<em><b>Bits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITS
	 * @model name="bits"
	 * @generated
	 * @ordered
	 */
	public static final int BITS_VALUE = 1;

	/**
	 * The '<em><b>Halfword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Halfword</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALFWORD
	 * @model name="halfword"
	 * @generated
	 * @ordered
	 */
	public static final int HALFWORD_VALUE = 2;

	/**
	 * The '<em><b>String10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING10
	 * @model name="string10"
	 * @generated
	 * @ordered
	 */
	public static final int STRING10_VALUE = 3;

	/**
	 * The '<em><b>String17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING17
	 * @model name="string17"
	 * @generated
	 * @ordered
	 */
	public static final int STRING17_VALUE = 4;

	/**
	 * The '<em><b>String69</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String69</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING69
	 * @model name="string69"
	 * @generated
	 * @ordered
	 */
	public static final int STRING69_VALUE = 5;

	/**
	 * An array of all the '<em><b>GSS Format Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSSFormatUnit[] VALUES_ARRAY =
		new GSSFormatUnit[] {
			BYTES,
			BITS,
			HALFWORD,
			STRING10,
			STRING17,
			STRING69,
		};

	/**
	 * A public read-only list of all the '<em><b>GSS Format Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSSFormatUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSS Format Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSFormatUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSFormatUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Format Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSFormatUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSSFormatUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSS Format Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSSFormatUnit get(int value) {
		switch (value) {
			case BYTES_VALUE: return BYTES;
			case BITS_VALUE: return BITS;
			case HALFWORD_VALUE: return HALFWORD;
			case STRING10_VALUE: return STRING10;
			case STRING17_VALUE: return STRING17;
			case STRING69_VALUE: return STRING69;
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
	private GSSFormatUnit(int value, String name, String literal) {
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
	
} //GSSFormatUnit
