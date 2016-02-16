/**
 */
package subkdm.SimplifiedDecisionMetrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.Measure#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.Measure#getName <em>Name</em>}</li>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.Measure#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMeasure()
 * @model
 * @generated
 */
public interface Measure extends EObject {
	/**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
	 * The list contents are of type {@link subkdm.SimplifiedDecisionMetrics.Measurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference list.
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMeasure_Measurements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Measurement> getMeasurements();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMeasure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link subkdm.SimplifiedDecisionMetrics.Measure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getMeasure_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link subkdm.SimplifiedDecisionMetrics.Measure#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Measure
