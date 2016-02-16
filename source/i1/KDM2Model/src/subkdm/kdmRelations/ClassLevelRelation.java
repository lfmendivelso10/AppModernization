/**
 */
package subkdm.kdmRelations;

import org.eclipse.emf.common.util.EList;

import subkdm.kdmObjects.DataType;
import subkdm.kdmObjects.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Level Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmRelations.ClassLevelRelation#getTo <em>To</em>}</li>
 *   <li>{@link subkdm.kdmRelations.ClassLevelRelation#getFrom <em>From</em>}</li>
 *   <li>{@link subkdm.kdmRelations.ClassLevelRelation#getType <em>Type</em>}</li>
 *   <li>{@link subkdm.kdmRelations.ClassLevelRelation#getTypeRelations <em>Type Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmRelations.KdmRelationsPackage#getClassLevelRelation()
 * @model
 * @generated
 */
public interface ClassLevelRelation extends ModelElement {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(DataType)
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getClassLevelRelation_To()
	 * @model required="true"
	 * @generated
	 */
	DataType getTo();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.ClassLevelRelation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(DataType value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(DataType)
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getClassLevelRelation_From()
	 * @model required="true"
	 * @generated
	 */
	DataType getFrom();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.ClassLevelRelation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(DataType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getClassLevelRelation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.ClassLevelRelation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Type Relations</b></em>' containment reference list.
	 * The list contents are of type {@link subkdm.kdmRelations.TypeRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Relations</em>' containment reference list.
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getClassLevelRelation_TypeRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeRelation> getTypeRelations();

} // ClassLevelRelation
