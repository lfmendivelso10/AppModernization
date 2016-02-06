/**
 */
package subkdm.SimplifiedDecisionMetrics;

import subkdm.kdmObjects.AbstractCodeElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensional To Object Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement#getObject <em>Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getDimensionalToObjectMeasurement()
 * @model
 * @generated
 */
public interface DimensionalToObjectMeasurement extends DimensionalMeasurement {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(AbstractCodeElement)
	 * @see subkdm.SimplifiedDecisionMetrics.SimplifiedDecisionMetricsPackage#getDimensionalToObjectMeasurement_Object()
	 * @model required="true"
	 * @generated
	 */
	AbstractCodeElement getObject();

	/**
	 * Sets the value of the '{@link subkdm.SimplifiedDecisionMetrics.DimensionalToObjectMeasurement#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(AbstractCodeElement value);

} // DimensionalToObjectMeasurement
