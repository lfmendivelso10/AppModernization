/**
 */
package subkdm.kdmObjects;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Callable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.CallableUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmObjects.KdmObjectsPackage#getCallableUnit()
 * @model
 * @generated
 */
public interface CallableUnit extends ControlElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link subkdm.kdmObjects.MethoKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see subkdm.kdmObjects.MethoKind
	 * @see #setKind(MethoKind)
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getCallableUnit_Kind()
	 * @model
	 * @generated
	 */
	MethoKind getKind();

	/**
	 * Sets the value of the '{@link subkdm.kdmObjects.CallableUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see subkdm.kdmObjects.MethoKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MethoKind value);

} // CallableUnit
