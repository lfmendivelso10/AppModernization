/**
 */
package subkdm.kdmObjects;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storable Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.StorableUnit#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmObjects.KdmObjectsPackage#getStorableUnit()
 * @model
 * @generated
 */
public interface StorableUnit extends DataElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link subkdm.kdmObjects.StorableKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see subkdm.kdmObjects.StorableKind
	 * @see #setKind(StorableKind)
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getStorableUnit_Kind()
	 * @model
	 * @generated
	 */
	StorableKind getKind();

	/**
	 * Sets the value of the '{@link subkdm.kdmObjects.StorableUnit#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see subkdm.kdmObjects.StorableKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(StorableKind value);

} // StorableUnit
