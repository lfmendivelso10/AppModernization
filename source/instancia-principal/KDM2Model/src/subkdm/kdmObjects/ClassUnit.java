/**
 */
package subkdm.kdmObjects;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.ClassUnit#getCodeElement <em>Code Element</em>}</li>
 *   <li>{@link subkdm.kdmObjects.ClassUnit#isIsAbstract <em>Is Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmObjects.KdmObjectsPackage#getClassUnit()
 * @model
 * @generated
 */
public interface ClassUnit extends DataType {
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
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getClassUnit_CodeElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeItem> getCodeElement();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getClassUnit_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link subkdm.kdmObjects.ClassUnit#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

} // ClassUnit
