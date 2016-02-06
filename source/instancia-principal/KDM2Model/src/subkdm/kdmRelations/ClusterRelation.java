/**
 */
package subkdm.kdmRelations;

import org.eclipse.emf.common.util.EList;

import subkdm.kdmObjects.Cluster;
import subkdm.kdmObjects.CodeItem;
import subkdm.kdmObjects.ModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link subkdm.kdmRelations.ClusterRelation#getTo <em>To</em>}</li>
 *   <li>{@link subkdm.kdmRelations.ClusterRelation#getFrom <em>From</em>}</li>
 *   <li>{@link subkdm.kdmRelations.ClusterRelation#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see subkdm.kdmRelations.KdmRelationsPackage#getClusterRelation()
 * @model
 * @generated
 */
public interface ClusterRelation extends ModelElement {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Cluster)
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getClusterRelation_To()
	 * @model
	 * @generated
	 */
	Cluster getTo();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.ClusterRelation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Cluster value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Cluster)
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getClusterRelation_From()
	 * @model
	 * @generated
	 */
	Cluster getFrom();

	/**
	 * Sets the value of the '{@link subkdm.kdmRelations.ClusterRelation#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Cluster value);

	/**
	 * Returns the value of the '<em><b>Code Element</b></em>' reference list.
	 * The list contents are of type {@link subkdm.kdmObjects.CodeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Element</em>' reference list.
	 * @see subkdm.kdmRelations.KdmRelationsPackage#getClusterRelation_CodeElement()
	 * @model
	 * @generated
	 */
	EList<CodeItem> getCodeElement();

} // ClusterRelation
