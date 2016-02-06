/**
 */
package visualizacionMetricas3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Metrica</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see visualizacionMetricas3.VisualizacionMetricas3Package#getTipoMetrica()
 * @model
 * @generated
 */
public enum TipoMetrica implements Enumerator {
	/**
	 * The '<em><b>Calculated Coupling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATED_COUPLING_VALUE
	 * @generated
	 * @ordered
	 */
	CALCULATED_COUPLING(0, "CalculatedCoupling", "CalculatedCoupling"),

	/**
	 * The '<em><b>Weighted Methods Per Class</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEIGHTED_METHODS_PER_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	WEIGHTED_METHODS_PER_CLASS(1, "WeightedMethodsPerClass", "WeightedMethodsPerClass"),

	/**
	 * The '<em><b>Number Of Uses</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_USES_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER_OF_USES(2, "NumberOfUses", "NumberOfUses"),

	/**
	 * The '<em><b>Number Of Containments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_CONTAINMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER_OF_CONTAINMENTS(3, "NumberOfContainments", "NumberOfContainments"),

	/**
	 * The '<em><b>Coupling Between Objects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPLING_BETWEEN_OBJECTS_VALUE
	 * @generated
	 * @ordered
	 */
	COUPLING_BETWEEN_OBJECTS(4, "CouplingBetweenObjects", "CouplingBetweenObjects"),

	/**
	 * The '<em><b>Number Of Classes Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_CLASSES_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER_OF_CLASSES_MEASURE(5, "NumberOfClassesMeasure", "NumberOfClassesMeasure"),

	/**
	 * The '<em><b>Number Of Lines Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_LINES_MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER_OF_LINES_MEASURE(6, "NumberOfLinesMeasure", "NumberOfLinesMeasure"),

	/**
	 * The '<em><b>Cluster Relation Conflict Percentage Measure Target</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET(7, "ClusterRelationConflictPercentageMeasureTarget", "ClusterRelationConflictPercentageMeasureTarget"),

	/**
	 * The '<em><b>Cluster Relation Conflict Percentage Measure Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE(8, "ClusterRelationConflictPercentageMeasureSource", "ClusterRelationConflictPercentageMeasureSource");

	/**
	 * The '<em><b>Calculated Coupling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Calculated Coupling</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALCULATED_COUPLING
	 * @model name="CalculatedCoupling"
	 * @generated
	 * @ordered
	 */
	public static final int CALCULATED_COUPLING_VALUE = 0;

	/**
	 * The '<em><b>Weighted Methods Per Class</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Weighted Methods Per Class</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEIGHTED_METHODS_PER_CLASS
	 * @model name="WeightedMethodsPerClass"
	 * @generated
	 * @ordered
	 */
	public static final int WEIGHTED_METHODS_PER_CLASS_VALUE = 1;

	/**
	 * The '<em><b>Number Of Uses</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Number Of Uses</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_USES
	 * @model name="NumberOfUses"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_OF_USES_VALUE = 2;

	/**
	 * The '<em><b>Number Of Containments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Number Of Containments</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_CONTAINMENTS
	 * @model name="NumberOfContainments"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_OF_CONTAINMENTS_VALUE = 3;

	/**
	 * The '<em><b>Coupling Between Objects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coupling Between Objects</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUPLING_BETWEEN_OBJECTS
	 * @model name="CouplingBetweenObjects"
	 * @generated
	 * @ordered
	 */
	public static final int COUPLING_BETWEEN_OBJECTS_VALUE = 4;

	/**
	 * The '<em><b>Number Of Classes Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Number Of Classes Measure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_CLASSES_MEASURE
	 * @model name="NumberOfClassesMeasure"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_OF_CLASSES_MEASURE_VALUE = 5;

	/**
	 * The '<em><b>Number Of Lines Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Number Of Lines Measure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER_OF_LINES_MEASURE
	 * @model name="NumberOfLinesMeasure"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_OF_LINES_MEASURE_VALUE = 6;

	/**
	 * The '<em><b>Cluster Relation Conflict Percentage Measure Target</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cluster Relation Conflict Percentage Measure Target</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET
	 * @model name="ClusterRelationConflictPercentageMeasureTarget"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET_VALUE = 7;

	/**
	 * The '<em><b>Cluster Relation Conflict Percentage Measure Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cluster Relation Conflict Percentage Measure Source</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE
	 * @model name="ClusterRelationConflictPercentageMeasureSource"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Tipo Metrica</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoMetrica[] VALUES_ARRAY =
		new TipoMetrica[] {
			CALCULATED_COUPLING,
			WEIGHTED_METHODS_PER_CLASS,
			NUMBER_OF_USES,
			NUMBER_OF_CONTAINMENTS,
			COUPLING_BETWEEN_OBJECTS,
			NUMBER_OF_CLASSES_MEASURE,
			NUMBER_OF_LINES_MEASURE,
			CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET,
			CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Metrica</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoMetrica> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Metrica</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoMetrica get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoMetrica result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Metrica</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoMetrica getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoMetrica result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Metrica</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TipoMetrica get(int value) {
		switch (value) {
			case CALCULATED_COUPLING_VALUE: return CALCULATED_COUPLING;
			case WEIGHTED_METHODS_PER_CLASS_VALUE: return WEIGHTED_METHODS_PER_CLASS;
			case NUMBER_OF_USES_VALUE: return NUMBER_OF_USES;
			case NUMBER_OF_CONTAINMENTS_VALUE: return NUMBER_OF_CONTAINMENTS;
			case COUPLING_BETWEEN_OBJECTS_VALUE: return COUPLING_BETWEEN_OBJECTS;
			case NUMBER_OF_CLASSES_MEASURE_VALUE: return NUMBER_OF_CLASSES_MEASURE;
			case NUMBER_OF_LINES_MEASURE_VALUE: return NUMBER_OF_LINES_MEASURE;
			case CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET_VALUE: return CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_TARGET;
			case CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE_VALUE: return CLUSTER_RELATION_CONFLICT_PERCENTAGE_MEASURE_SOURCE;
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
	private TipoMetrica(int value, String name, String literal) {
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
	
} //TipoMetrica
