/**
 */
package visualizacionMetricas3.visualizacion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Estilo Linea</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.visualizacion.VisualizacionPackage#getEstiloLinea()
 * @model
 * @generated
 */
public enum EstiloLinea implements Enumerator {
	/**
	 * The '<em><b>SOLIDA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLIDA_VALUE
	 * @generated
	 * @ordered
	 */
	SOLIDA(0, "SOLIDA", "SOLIDA"),

	/**
	 * The '<em><b>TRAZOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAZOS_VALUE
	 * @generated
	 * @ordered
	 */
	TRAZOS(1, "TRAZOS", "TRAZOS"),

	/**
	 * The '<em><b>PUNTOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUNTOS_VALUE
	 * @generated
	 * @ordered
	 */
	PUNTOS(2, "PUNTOS", "PUNTOS"),

	/**
	 * The '<em><b>MIXTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXTA_VALUE
	 * @generated
	 * @ordered
	 */
	MIXTA(3, "MIXTA", "MIXTA");

	/**
	 * The '<em><b>SOLIDA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOLIDA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLIDA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLIDA_VALUE = 0;

	/**
	 * The '<em><b>TRAZOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAZOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAZOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAZOS_VALUE = 1;

	/**
	 * The '<em><b>PUNTOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUNTOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUNTOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUNTOS_VALUE = 2;

	/**
	 * The '<em><b>MIXTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIXTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIXTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIXTA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Estilo Linea</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EstiloLinea[] VALUES_ARRAY =
		new EstiloLinea[] {
			SOLIDA,
			TRAZOS,
			PUNTOS,
			MIXTA,
		};

	/**
	 * A public read-only list of all the '<em><b>Estilo Linea</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EstiloLinea> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Estilo Linea</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstiloLinea get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstiloLinea result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estilo Linea</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstiloLinea getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EstiloLinea result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Estilo Linea</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EstiloLinea get(int value) {
		switch (value) {
			case SOLIDA_VALUE: return SOLIDA;
			case TRAZOS_VALUE: return TRAZOS;
			case PUNTOS_VALUE: return PUNTOS;
			case MIXTA_VALUE: return MIXTA;
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
	private EstiloLinea(int value, String name, String literal) {
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
	
} //EstiloLinea
