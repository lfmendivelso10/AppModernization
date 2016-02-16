/**
 */
package subkdm.kdmObjects;

import org.eclipse.emf.common.util.EList;

import subkdm.kdmRelations.AbstractCodeRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Code Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.AbstractCodeElement#getCodeRelation <em>Code Relation</em>}</li>
 *   <li>{@link subkdm.kdmObjects.AbstractCodeElement#getComment <em>Comment</em>}</li>
 *   <li>{@link subkdm.kdmObjects.AbstractCodeElement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmObjects.KdmObjectsPackage#getAbstractCodeElement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCodeElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Code Relation</b></em>' containment reference list.
	 * The list contents are of type {@link subkdm.kdmRelations.AbstractCodeRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Relation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Relation</em>' containment reference list.
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getAbstractCodeElement_CodeRelation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCodeRelationship> getCodeRelation();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference list.
	 * The list contents are of type {@link subkdm.kdmObjects.CommentUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference list.
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getAbstractCodeElement_Comment()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommentUnit> getComment();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see subkdm.kdmObjects.KdmObjectsPackage#getAbstractCodeElement_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link subkdm.kdmObjects.AbstractCodeElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractCodeElement
