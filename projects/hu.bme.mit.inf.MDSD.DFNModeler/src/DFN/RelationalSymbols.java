/**
 */
package DFN;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relational Symbols</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see DFN.DFNPackage#getRelationalSymbols()
 * @model
 * @generated
 */
public enum RelationalSymbols implements Enumerator {
	/**
	 * The '<em><b>More Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORE_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	MORE_THAN(0, "MoreThan", "MoreThan"),

	/**
	 * The '<em><b>More Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MORE_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	MORE_OR_EQUALS(1, "MoreOrEquals", "MoreOrEquals"),

	/**
	 * The '<em><b>Lesser Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESSER_THAN(2, "LesserThan", "LesserThan"),

	/**
	 * The '<em><b>Lesser Or Equals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESSER_OR_EQUALS_VALUE
	 * @generated
	 * @ordered
	 */
	LESSER_OR_EQUALS(3, "LesserOrEquals", "LesserOrEquals");

	/**
	 * The '<em><b>More Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>More Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MORE_THAN
	 * @model name="MoreThan"
	 * @generated
	 * @ordered
	 */
	public static final int MORE_THAN_VALUE = 0;

	/**
	 * The '<em><b>More Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>More Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MORE_OR_EQUALS
	 * @model name="MoreOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int MORE_OR_EQUALS_VALUE = 1;

	/**
	 * The '<em><b>Lesser Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lesser Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSER_THAN
	 * @model name="LesserThan"
	 * @generated
	 * @ordered
	 */
	public static final int LESSER_THAN_VALUE = 2;

	/**
	 * The '<em><b>Lesser Or Equals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lesser Or Equals</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESSER_OR_EQUALS
	 * @model name="LesserOrEquals"
	 * @generated
	 * @ordered
	 */
	public static final int LESSER_OR_EQUALS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Relational Symbols</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationalSymbols[] VALUES_ARRAY =
		new RelationalSymbols[] {
			MORE_THAN,
			MORE_OR_EQUALS,
			LESSER_THAN,
			LESSER_OR_EQUALS,
		};

	/**
	 * A public read-only list of all the '<em><b>Relational Symbols</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationalSymbols> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relational Symbols</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalSymbols get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationalSymbols result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relational Symbols</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalSymbols getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationalSymbols result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relational Symbols</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalSymbols get(int value) {
		switch (value) {
			case MORE_THAN_VALUE: return MORE_THAN;
			case MORE_OR_EQUALS_VALUE: return MORE_OR_EQUALS;
			case LESSER_THAN_VALUE: return LESSER_THAN;
			case LESSER_OR_EQUALS_VALUE: return LESSER_OR_EQUALS;
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
	private RelationalSymbols(int value, String name, String literal) {
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
	
} //RelationalSymbols
