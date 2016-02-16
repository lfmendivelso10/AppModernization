/**
 */
package subkdm.kdmRelations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import subkdm.kdmObjects.ModelElement;

import subkdm.kdmRelations.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see subkdm.kdmRelations.KdmRelationsPackage
 * @generated
 */
public class KdmRelationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KdmRelationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmRelationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KdmRelationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KdmRelationsSwitch<Adapter> modelSwitch =
		new KdmRelationsSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractCodeRelationship(AbstractCodeRelationship object) {
				return createAbstractCodeRelationshipAdapter();
			}
			@Override
			public Adapter caseCalls(Calls object) {
				return createCallsAdapter();
			}
			@Override
			public Adapter caseReads(Reads object) {
				return createReadsAdapter();
			}
			@Override
			public Adapter caseWrites(Writes object) {
				return createWritesAdapter();
			}
			@Override
			public Adapter caseCreates(Creates object) {
				return createCreatesAdapter();
			}
			@Override
			public Adapter caseImplementationOf(ImplementationOf object) {
				return createImplementationOfAdapter();
			}
			@Override
			public Adapter caseHasValue(HasValue object) {
				return createHasValueAdapter();
			}
			@Override
			public Adapter caseImports(Imports object) {
				return createImportsAdapter();
			}
			@Override
			public Adapter caseImplements(Implements object) {
				return createImplementsAdapter();
			}
			@Override
			public Adapter caseAbstractActionRelationship(AbstractActionRelationship object) {
				return createAbstractActionRelationshipAdapter();
			}
			@Override
			public Adapter caseExtends(Extends object) {
				return createExtendsAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.AbstractCodeRelationship <em>Abstract Code Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.AbstractCodeRelationship
	 * @generated
	 */
	public Adapter createAbstractCodeRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.Calls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.Calls
	 * @generated
	 */
	public Adapter createCallsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.Reads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.Reads
	 * @generated
	 */
	public Adapter createReadsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.Writes <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.Writes
	 * @generated
	 */
	public Adapter createWritesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.Creates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.Creates
	 * @generated
	 */
	public Adapter createCreatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.ImplementationOf <em>Implementation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.ImplementationOf
	 * @generated
	 */
	public Adapter createImplementationOfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.HasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.HasValue
	 * @generated
	 */
	public Adapter createHasValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.Imports
	 * @generated
	 */
	public Adapter createImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.Implements
	 * @generated
	 */
	public Adapter createImplementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.AbstractActionRelationship
	 * @generated
	 */
	public Adapter createAbstractActionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmRelations.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmRelations.Extends
	 * @generated
	 */
	public Adapter createExtendsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KdmRelationsAdapterFactory
