/**
 */
package subkdm.kdmRelations;

import subkdm.kdmObjects.AbstractCodeElement;
import subkdm.kdmObjects.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Code Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmRelations.AbstractCodeRelationship#getTo <em>To</em>}</li>
 *   <li>{@link subkdm.kdmRelations.AbstractCodeRelationship#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmRelations.KdmRelationsPackage#getAbstractCodeRelationship()
 * @model
 * @generated
 */
public interface AbstractCodeRelationship extends ModelElement {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(AbstractCodeElement)
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getAbstractCodeRelationship_To()
	 * @model required="true"
	 * @generated
	 */
	AbstractCodeElement getTo();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.AbstractCodeRelationship#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(AbstractCodeElement value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(AbstractCodeElement)
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getAbstractCodeRelationship_From()
	 * @model required="true"
	 * @generated
	 */
	AbstractCodeElement getFrom();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.AbstractCodeRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractCodeElement value);

} // AbstractCodeRelationship
