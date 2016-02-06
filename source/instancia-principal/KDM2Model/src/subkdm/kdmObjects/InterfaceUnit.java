/**
 */
package subkdm.kdmObjects;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.InterfaceUnit#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmObjects.KdmObjectsPackage#getInterfaceUnit()
 * @model
 * @generated
 */
public interface InterfaceUnit extends DataType {
	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' containment reference list.
	 * The list contents are of type {@link subkdm.kdmObjects.CodeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' containment reference list.
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getInterfaceUnit_CodeElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeItem> getCodeElement();

} // InterfaceUnit
