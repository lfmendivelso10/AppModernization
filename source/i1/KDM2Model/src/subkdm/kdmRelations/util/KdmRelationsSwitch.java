/**
 */
package subkdm.kdmRelations.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import subkdm.kdmObjects.ModelElement;

import subkdm.kdmRelations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see subkdm.kdmRelations.KdmRelationsPackage
 * @generated
 */
public class KdmRelationsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KdmRelationsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmRelationsSwitch() {
		if (modelPackage == null) {
			modelPackage = KdmRelationsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case KdmRelationsPackage.ABSTRACT_CODE_RELATIONSHIP: {
				AbstractCodeRelationship abstractCodeRelationship = (AbstractCodeRelationship)theEObject;
				T result = caseAbstractCodeRelationship(abstractCodeRelationship);
				if (result == null) result = caseModelElement(abstractCodeRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.CALLS: {
				Calls calls = (Calls)theEObject;
				T result = caseCalls(calls);
				if (result == null) result = caseAbstractActionRelationship(calls);
				if (result == null) result = caseModelElement(calls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.READS: {
				Reads reads = (Reads)theEObject;
				T result = caseReads(reads);
				if (result == null) result = caseAbstractActionRelationship(reads);
				if (result == null) result = caseModelElement(reads);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.WRITES: {
				Writes writes = (Writes)theEObject;
				T result = caseWrites(writes);
				if (result == null) result = caseAbstractActionRelationship(writes);
				if (result == null) result = caseModelElement(writes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.CREATES: {
				Creates creates = (Creates)theEObject;
				T result = caseCreates(creates);
				if (result == null) result = caseAbstractActionRelationship(creates);
				if (result == null) result = caseModelElement(creates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.IMPLEMENTATION_OF: {
				ImplementationOf implementationOf = (ImplementationOf)theEObject;
				T result = caseImplementationOf(implementationOf);
				if (result == null) result = caseAbstractCodeRelationship(implementationOf);
				if (result == null) result = caseModelElement(implementationOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.HAS_VALUE: {
				HasValue hasValue = (HasValue)theEObject;
				T result = caseHasValue(hasValue);
				if (result == null) result = caseAbstractCodeRelationship(hasValue);
				if (result == null) result = caseModelElement(hasValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.IMPORTS: {
				Imports imports = (Imports)theEObject;
				T result = caseImports(imports);
				if (result == null) result = caseAbstractCodeRelationship(imports);
				if (result == null) result = caseModelElement(imports);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.IMPLEMENTS: {
				Implements implements_ = (Implements)theEObject;
				T result = caseImplements(implements_);
				if (result == null) result = caseAbstractCodeRelationship(implements_);
				if (result == null) result = caseModelElement(implements_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.ABSTRACT_ACTION_RELATIONSHIP: {
				AbstractActionRelationship abstractActionRelationship = (AbstractActionRelationship)theEObject;
				T result = caseAbstractActionRelationship(abstractActionRelationship);
				if (result == null) result = caseModelElement(abstractActionRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.EXTENDS: {
				Extends extends_ = (Extends)theEObject;
				T result = caseExtends(extends_);
				if (result == null) result = caseAbstractCodeRelationship(extends_);
				if (result == null) result = caseModelElement(extends_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.CLASS_LEVEL_RELATION: {
				ClassLevelRelation classLevelRelation = (ClassLevelRelation)theEObject;
				T result = caseClassLevelRelation(classLevelRelation);
				if (result == null) result = caseModelElement(classLevelRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.TYPE_RELATION: {
				TypeRelation typeRelation = (TypeRelation)theEObject;
				T result = caseTypeRelation(typeRelation);
				if (result == null) result = caseModelElement(typeRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmRelationsPackage.CLUSTER_RELATION: {
				ClusterRelation clusterRelation = (ClusterRelation)theEObject;
				T result = caseClusterRelation(clusterRelation);
				if (result == null) result = caseModelElement(clusterRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Code Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Code Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCodeRelationship(AbstractCodeRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalls(Calls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reads</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reads</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReads(Reads object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Writes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Writes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrites(Writes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreates(Creates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationOf(ImplementationOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Has Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Has Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHasValue(HasValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImports(Imports object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplements(Implements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Action Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActionRelationship(AbstractActionRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extends</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extends</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtends(Extends object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Level Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Level Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassLevelRelation(ClassLevelRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRelation(TypeRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClusterRelation(ClusterRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //KdmRelationsSwitch
