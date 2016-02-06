/**
 */
package subkdm.kdmObjects;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.ParameterUnit#getKind <em>Kind</em>}</li>
 *   <li>{@link subkdm.kdmObjects.ParameterUnit#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmObjects.KdmObjectsPackage#getParameterUnit()
 * @model
 * @generated
 */
public interface ParameterUnit extends DataElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link subkdm.kdmObjects.ParameterKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see subkdm.kdmObjects.ParameterKind
	 * @see #setKind(ParameterKind)
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getParameterUnit_Kind()
	 * @model
	 * @generated
	 */
	ParameterKind getKind();

	/**
	 * Sets the value of the '{@link subkdm.kdmObjects.ParameterUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see subkdm.kdmObjects.ParameterKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ParameterKind value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(int)
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getParameterUnit_Pos()
	 * @model
	 * @generated
	 */
	int getPos();

	/**
	 * Sets the value of the '{@link subkdm.kdmObjects.ParameterUnit#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(int value);

} // ParameterUnit
