/**
 */
package subkdm.kdmObjects;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metho Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see subkdm.kdmObjects.KdmObjectsPackage#getMethoKind()
 * @model
 * @generated
 */
public enum MethoKind implements Enumerator {
	/**
	 * The '<em><b>Method</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD(0, "method", "method"),

	/**
	 * The '<em><b>Constructos</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTOS_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRUCTOS(1, "constructos", "constructos"),

	/**
	 * The '<em><b>Destructor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESTRUCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	DESTRUCTOR(2, "destructor", "destructor"),

	/**
	 * The '<em><b>Operator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATOR(3, "operator", "operator"),

	/**
	 * The '<em><b>Virtual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL(4, "virtual", "virtual"),

	/**
	 * The '<em><b>Abstract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	ABSTRACT(5, "abstract", "abstract"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(6, "unknown", "unknown");

	/**
	 * The '<em><b>Method</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD
	 * @model name="method"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_VALUE = 0;

	/**
	 * The '<em><b>Constructos</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constructos</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRUCTOS
	 * @model name="constructos"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRUCTOS_VALUE = 1;

	/**
	 * The '<em><b>Destructor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Destructor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESTRUCTOR
	 * @model name="destructor"
	 * @generated
	 * @ordered
	 */
	public static final int DESTRUCTOR_VALUE = 2;

	/**
	 * The '<em><b>Operator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operator</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATOR
	 * @model name="operator"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATOR_VALUE = 3;

	/**
	 * The '<em><b>Virtual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Virtual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL
	 * @model name="virtual"
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_VALUE = 4;

	/**
	 * The '<em><b>Abstract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abstract</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT
	 * @model name="abstract"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_VALUE = 5;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Metho Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MethoKind[] VALUES_ARRAY =
		new MethoKind[] {
			METHOD,
			CONSTRUCTOS,
			DESTRUCTOR,
			OPERATOR,
			VIRTUAL,
			ABSTRACT,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Metho Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MethoKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metho Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethoKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethoKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metho Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethoKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethoKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metho Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethoKind get(int value) {
		switch (value) {
			case METHOD_VALUE: return METHOD;
			case CONSTRUCTOS_VALUE: return CONSTRUCTOS;
			case DESTRUCTOR_VALUE: return DESTRUCTOR;
			case OPERATOR_VALUE: return OPERATOR;
			case VIRTUAL_VALUE: return VIRTUAL;
			case ABSTRACT_VALUE: return ABSTRACT;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private MethoKind(int value, String name, String literal) {
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
	
} //MethoKind
