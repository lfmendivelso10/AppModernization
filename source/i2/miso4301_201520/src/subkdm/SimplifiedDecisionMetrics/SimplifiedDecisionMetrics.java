/**
 */
package subkdm.SimplifiedDecisionMetrics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simplified Decision Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetrics#getObservations <em>Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getSimplifiedDecisionMetrics()
 * @model
 * @generated
 */
public interface SimplifiedDecisionMetrics extends EObject {
	/**
	 * Returns the value of the '<em><b>Observations</b></em>' containment reference list.
	 * The list contents are of type {@link subkdm.SimplifiedDecisionMetrics.Observation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' containment reference list.
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getSimplifiedDecisionMetrics_Observations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Observation> getObservations();

} // SimplifiedDecisionMetrics
