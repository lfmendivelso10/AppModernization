/**
 */
package subkdm.kdmObjects.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import subkdm.kdmObjects.AbstractCodeElement;
import subkdm.kdmObjects.ActionElement;
import subkdm.kdmObjects.BlockUnit;
import subkdm.kdmObjects.CallableUnit;
import subkdm.kdmObjects.CatchUnit;
import subkdm.kdmObjects.ClassUnit;
import subkdm.kdmObjects.CodeItem;
import subkdm.kdmObjects.CodeModel;
import subkdm.kdmObjects.CodeUnit;
import subkdm.kdmObjects.CommentUnit;
import subkdm.kdmObjects.ComputationalObject;
import subkdm.kdmObjects.ControlElement;
import subkdm.kdmObjects.DataElement;
import subkdm.kdmObjects.DataType;
import subkdm.kdmObjects.ExceptionUnit;
import subkdm.kdmObjects.FinallyUnit;
import subkdm.kdmObjects.InterfaceUnit;
import subkdm.kdmObjects.KdmObjectsPackage;
import subkdm.kdmObjects.MethodUnit;
import subkdm.kdmObjects.ModelElement;
import subkdm.kdmObjects.Module;
import subkdm.kdmObjects.ParameterUnit;
import subkdm.kdmObjects.Segment;
import subkdm.kdmObjects.Signature;
import subkdm.kdmObjects.StorableUnit;
import subkdm.kdmObjects.TemplateUnit;
import subkdm.kdmObjects.TryUnit;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see subkdm.kdmObjects.KdmObjectsPackage
 * @generated
 */
public class KdmObjectsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KdmObjectsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmObjectsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KdmObjectsPackage.eINSTANCE;
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
	protected KdmObjectsSwitch<Adapter> modelSwitch =
		new KdmObjectsSwitch<Adapter>() {
			@Override
			public Adapter caseCodeModel(CodeModel object) {
				return createCodeModelAdapter();
			}
			@Override
			public Adapter caseAbstractCodeElement(AbstractCodeElement object) {
				return createAbstractCodeElementAdapter();
			}
			@Override
			public Adapter caseCodeItem(CodeItem object) {
				return createCodeItemAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter casePackage(subkdm.kdmObjects.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseClassUnit(ClassUnit object) {
				return createClassUnitAdapter();
			}
			@Override
			public Adapter caseInterfaceUnit(InterfaceUnit object) {
				return createInterfaceUnitAdapter();
			}
			@Override
			public Adapter caseComputationalObject(ComputationalObject object) {
				return createComputationalObjectAdapter();
			}
			@Override
			public Adapter caseControlElement(ControlElement object) {
				return createControlElementAdapter();
			}
			@Override
			public Adapter caseCallableUnit(CallableUnit object) {
				return createCallableUnitAdapter();
			}
			@Override
			public Adapter caseMethodUnit(MethodUnit object) {
				return createMethodUnitAdapter();
			}
			@Override
			public Adapter caseDataElement(DataElement object) {
				return createDataElementAdapter();
			}
			@Override
			public Adapter caseStorableUnit(StorableUnit object) {
				return createStorableUnitAdapter();
			}
			@Override
			public Adapter caseCommentUnit(CommentUnit object) {
				return createCommentUnitAdapter();
			}
			@Override
			public Adapter caseParameterUnit(ParameterUnit object) {
				return createParameterUnitAdapter();
			}
			@Override
			public Adapter caseTemplateUnit(TemplateUnit object) {
				return createTemplateUnitAdapter();
			}
			@Override
			public Adapter caseCodeUnit(CodeUnit object) {
				return createCodeUnitAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseActionElement(ActionElement object) {
				return createActionElementAdapter();
			}
			@Override
			public Adapter caseBlockUnit(BlockUnit object) {
				return createBlockUnitAdapter();
			}
			@Override
			public Adapter caseExceptionUnit(ExceptionUnit object) {
				return createExceptionUnitAdapter();
			}
			@Override
			public Adapter caseTryUnit(TryUnit object) {
				return createTryUnitAdapter();
			}
			@Override
			public Adapter caseCatchUnit(CatchUnit object) {
				return createCatchUnitAdapter();
			}
			@Override
			public Adapter caseFinallyUnit(FinallyUnit object) {
				return createFinallyUnitAdapter();
			}
			@Override
			public Adapter caseSegment(Segment object) {
				return createSegmentAdapter();
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
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.CodeModel <em>Code Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.CodeModel
	 * @generated
	 */
	public Adapter createCodeModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.AbstractCodeElement <em>Abstract Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.AbstractCodeElement
	 * @generated
	 */
	public Adapter createAbstractCodeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.CodeItem <em>Code Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.CodeItem
	 * @generated
	 */
	public Adapter createCodeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.ClassUnit <em>Class Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.ClassUnit
	 * @generated
	 */
	public Adapter createClassUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.InterfaceUnit <em>Interface Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.InterfaceUnit
	 * @generated
	 */
	public Adapter createInterfaceUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.ComputationalObject <em>Computational Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.ComputationalObject
	 * @generated
	 */
	public Adapter createComputationalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.ControlElement <em>Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.ControlElement
	 * @generated
	 */
	public Adapter createControlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.CallableUnit <em>Callable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.CallableUnit
	 * @generated
	 */
	public Adapter createCallableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.MethodUnit <em>Method Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.MethodUnit
	 * @generated
	 */
	public Adapter createMethodUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.DataElement
	 * @generated
	 */
	public Adapter createDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.StorableUnit <em>Storable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.StorableUnit
	 * @generated
	 */
	public Adapter createStorableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.CommentUnit <em>Comment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.CommentUnit
	 * @generated
	 */
	public Adapter createCommentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.ParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.ParameterUnit
	 * @generated
	 */
	public Adapter createParameterUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.TemplateUnit <em>Template Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.TemplateUnit
	 * @generated
	 */
	public Adapter createTemplateUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.CodeUnit <em>Code Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.CodeUnit
	 * @generated
	 */
	public Adapter createCodeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.ActionElement
	 * @generated
	 */
	public Adapter createActionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.BlockUnit <em>Block Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.BlockUnit
	 * @generated
	 */
	public Adapter createBlockUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.ExceptionUnit <em>Exception Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.ExceptionUnit
	 * @generated
	 */
	public Adapter createExceptionUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.TryUnit <em>Try Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.TryUnit
	 * @generated
	 */
	public Adapter createTryUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.CatchUnit <em>Catch Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.CatchUnit
	 * @generated
	 */
	public Adapter createCatchUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.FinallyUnit <em>Finally Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.FinallyUnit
	 * @generated
	 */
	public Adapter createFinallyUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link subkdm.kdmObjects.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see subkdm.kdmObjects.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
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

} //KdmObjectsAdapterFactory
