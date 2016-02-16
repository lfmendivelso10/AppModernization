/**
 */
package subkdm.kdmObjects;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.Signature#getParameterUnit <em>Parameter Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmObjects.KdmObjectsPackage#getSignature()
 * @model
 * @generated
 */
public interface Signature extends DataType {
	/**
	 * Returns the value of the '<em><b>Parameter Unit</b></em>' containment reference list.
	 * The list contents are of type {@link subkdm.kdmObjects.ParameterUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Unit</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Unit</em>' containment reference list.
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getSignature_ParameterUnit()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterUnit> getParameterUnit();

} // Signature
