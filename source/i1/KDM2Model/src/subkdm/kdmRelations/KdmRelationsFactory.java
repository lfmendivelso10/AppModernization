/**
 */
package subkdm.kdmRelations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see subkdm.kdmRelations.KdmRelationsPackage
 * @generated
 */
public interface KdmRelationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KdmRelationsFactory eINSTANCE = subkdm.kdmRelations.impl.KdmRelationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Code Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Code Relationship</em>'.
	 * @generated
	 */
	AbstractCodeRelationship createAbstractCodeRelationship();

	/**
	 * Returns a new object of class '<em>Calls</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Calls</em>'.
	 * @generated
	 */
	Calls createCalls();

	/**
	 * Returns a new object of class '<em>Reads</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reads</em>'.
	 * @generated
	 */
	Reads createReads();

	/**
	 * Returns a new object of class '<em>Writes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Writes</em>'.
	 * @generated
	 */
	Writes createWrites();

	/**
	 * Returns a new object of class '<em>Creates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creates</em>'.
	 * @generated
	 */
	Creates createCreates();

	/**
	 * Returns a new object of class '<em>Implementation Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Of</em>'.
	 * @generated
	 */
	ImplementationOf createImplementationOf();

	/**
	 * Returns a new object of class '<em>Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Has Value</em>'.
	 * @generated
	 */
	HasValue createHasValue();

	/**
	 * Returns a new object of class '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imports</em>'.
	 * @generated
	 */
	Imports createImports();

	/**
	 * Returns a new object of class '<em>Implements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implements</em>'.
	 * @generated
	 */
	Implements createImplements();

	/**
	 * Returns a new object of class '<em>Abstract Action Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Action Relationship</em>'.
	 * @generated
	 */
	AbstractActionRelationship createAbstractActionRelationship();

	/**
	 * Returns a new object of class '<em>Extends</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extends</em>'.
	 * @generated
	 */
	Extends createExtends();

	/**
	 * Returns a new object of class '<em>Class Level Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Level Relation</em>'.
	 * @generated
	 */
	ClassLevelRelation createClassLevelRelation();

	/**
	 * Returns a new object of class '<em>Type Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Relation</em>'.
	 * @generated
	 */
	TypeRelation createTypeRelation();

	/**
	 * Returns a new object of class '<em>Cluster Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cluster Relation</em>'.
	 * @generated
	 */
	ClusterRelation createClusterRelation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KdmRelationsPackage getKdmRelationsPackage();

} //KdmRelationsFactory
