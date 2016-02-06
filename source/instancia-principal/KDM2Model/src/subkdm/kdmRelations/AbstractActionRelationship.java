/**
 */
package subkdm.kdmRelations;

import subkdm.kdmObjects.AbstractCodeElement;
import subkdm.kdmObjects.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Action Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmRelations.AbstractActionRelationship#getTo <em>To</em>}</li>
 *   <li>{@link subkdm.kdmRelations.AbstractActionRelationship#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmRelations.KdmRelationsPackage#getAbstractActionRelationship()
 * @model
 * @generated
 */
public interface AbstractActionRelationship extends ModelElement {
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
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getAbstractActionRelationship_To()
	 * @model required="true"
	 * @generated
	 */
	AbstractCodeElement getTo();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.AbstractActionRelationship#getTo <em>To</em>}' reference.
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
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getAbstractActionRelationship_From()
	 * @model required="true"
	 * @generated
	 */
	AbstractCodeElement getFrom();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.AbstractActionRelationship#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(AbstractCodeElement value);

} // AbstractActionRelationship
