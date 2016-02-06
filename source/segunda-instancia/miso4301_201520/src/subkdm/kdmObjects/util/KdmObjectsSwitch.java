/**
 */
package subkdm.kdmObjects.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see subkdm.kdmObjects.KdmObjectsPackage
 * @generated
 */
public class KdmObjectsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KdmObjectsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmObjectsSwitch() {
		if (modelPackage == null) {
			modelPackage = KdmObjectsPackage.eINSTANCE;
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
			case KdmObjectsPackage.CODE_MODEL: {
				CodeModel codeModel = (CodeModel)theEObject;
				T result = caseCodeModel(codeModel);
				if (result == null) result = caseModelElement(codeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.ABSTRACT_CODE_ELEMENT: {
				AbstractCodeElement abstractCodeElement = (AbstractCodeElement)theEObject;
				T result = caseAbstractCodeElement(abstractCodeElement);
				if (result == null) result = caseModelElement(abstractCodeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.CODE_ITEM: {
				CodeItem codeItem = (CodeItem)theEObject;
				T result = caseCodeItem(codeItem);
				if (result == null) result = caseAbstractCodeElement(codeItem);
				if (result == null) result = caseModelElement(codeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseCodeItem(module);
				if (result == null) result = caseAbstractCodeElement(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.PACKAGE: {
				subkdm.kdmObjects.Package package_ = (subkdm.kdmObjects.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseModule(package_);
				if (result == null) result = caseCodeItem(package_);
				if (result == null) result = caseAbstractCodeElement(package_);
				if (result == null) result = caseModelElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseCodeItem(dataType);
				if (result == null) result = caseAbstractCodeElement(dataType);
				if (result == null) result = caseModelElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.CLASS_UNIT: {
				ClassUnit classUnit = (ClassUnit)theEObject;
				T result = caseClassUnit(classUnit);
				if (result == null) result = caseDataType(classUnit);
				if (result == null) result = caseCodeItem(classUnit);
				if (result == null) result = caseAbstractCodeElement(classUnit);
				if (result == null) result = caseModelElement(classUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.INTERFACE_UNIT: {
				InterfaceUnit interfaceUnit = (InterfaceUnit)theEObject;
				T result = caseInterfaceUnit(interfaceUnit);
				if (result == null) result = caseDataType(interfaceUnit);
				if (result == null) result = caseCodeItem(interfaceUnit);
				if (result == null) result = caseAbstractCodeElement(interfaceUnit);
				if (result == null) result = caseModelElement(interfaceUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.COMPUTATIONAL_OBJECT: {
				ComputationalObject computationalObject = (ComputationalObject)theEObject;
				T result = caseComputationalObject(computationalObject);
				if (result == null) result = caseCodeItem(computationalObject);
				if (result == null) result = caseAbstractCodeElement(computationalObject);
				if (result == null) result = caseModelElement(computationalObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.CONTROL_ELEMENT: {
				ControlElement controlElement = (ControlElement)theEObject;
				T result = caseControlElement(controlElement);
				if (result == null) result = caseComputationalObject(controlElement);
				if (result == null) result = caseCodeItem(controlElement);
				if (result == null) result = caseAbstractCodeElement(controlElement);
				if (result == null) result = caseModelElement(controlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.CALLABLE_UNIT: {
				CallableUnit callableUnit = (CallableUnit)theEObject;
				T result = caseCallableUnit(callableUnit);
				if (result == null) result = caseControlElement(callableUnit);
				if (result == null) result = caseComputationalObject(callableUnit);
				if (result == null) result = caseCodeItem(callableUnit);
				if (result == null) result = caseAbstractCodeElement(callableUnit);
				if (result == null) result = caseModelElement(callableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.METHOD_UNIT: {
				MethodUnit methodUnit = (MethodUnit)theEObject;
				T result = caseMethodUnit(methodUnit);
				if (result == null) result = caseControlElement(methodUnit);
				if (result == null) result = caseComputationalObject(methodUnit);
				if (result == null) result = caseCodeItem(methodUnit);
				if (result == null) result = caseAbstractCodeElement(methodUnit);
				if (result == null) result = caseModelElement(methodUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.DATA_ELEMENT: {
				DataElement dataElement = (DataElement)theEObject;
				T result = caseDataElement(dataElement);
				if (result == null) result = caseComputationalObject(dataElement);
				if (result == null) result = caseCodeItem(dataElement);
				if (result == null) result = caseAbstractCodeElement(dataElement);
				if (result == null) result = caseModelElement(dataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.STORABLE_UNIT: {
				StorableUnit storableUnit = (StorableUnit)theEObject;
				T result = caseStorableUnit(storableUnit);
				if (result == null) result = caseDataElement(storableUnit);
				if (result == null) result = caseComputationalObject(storableUnit);
				if (result == null) result = caseCodeItem(storableUnit);
				if (result == null) result = caseAbstractCodeElement(storableUnit);
				if (result == null) result = caseModelElement(storableUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.COMMENT_UNIT: {
				CommentUnit commentUnit = (CommentUnit)theEObject;
				T result = caseCommentUnit(commentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.PARAMETER_UNIT: {
				ParameterUnit parameterUnit = (ParameterUnit)theEObject;
				T result = caseParameterUnit(parameterUnit);
				if (result == null) result = caseDataElement(parameterUnit);
				if (result == null) result = caseComputationalObject(parameterUnit);
				if (result == null) result = caseCodeItem(parameterUnit);
				if (result == null) result = caseAbstractCodeElement(parameterUnit);
				if (result == null) result = caseModelElement(parameterUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.TEMPLATE_UNIT: {
				TemplateUnit templateUnit = (TemplateUnit)theEObject;
				T result = caseTemplateUnit(templateUnit);
				if (result == null) result = caseDataType(templateUnit);
				if (result == null) result = caseCodeItem(templateUnit);
				if (result == null) result = caseAbstractCodeElement(templateUnit);
				if (result == null) result = caseModelElement(templateUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.CODE_UNIT: {
				CodeUnit codeUnit = (CodeUnit)theEObject;
				T result = caseCodeUnit(codeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = caseDataType(signature);
				if (result == null) result = caseCodeItem(signature);
				if (result == null) result = caseAbstractCodeElement(signature);
				if (result == null) result = caseModelElement(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.ACTION_ELEMENT: {
				ActionElement actionElement = (ActionElement)theEObject;
				T result = caseActionElement(actionElement);
				if (result == null) result = caseAbstractCodeElement(actionElement);
				if (result == null) result = caseModelElement(actionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.BLOCK_UNIT: {
				BlockUnit blockUnit = (BlockUnit)theEObject;
				T result = caseBlockUnit(blockUnit);
				if (result == null) result = caseActionElement(blockUnit);
				if (result == null) result = caseAbstractCodeElement(blockUnit);
				if (result == null) result = caseModelElement(blockUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.EXCEPTION_UNIT: {
				ExceptionUnit exceptionUnit = (ExceptionUnit)theEObject;
				T result = caseExceptionUnit(exceptionUnit);
				if (result == null) result = caseBlockUnit(exceptionUnit);
				if (result == null) result = caseActionElement(exceptionUnit);
				if (result == null) result = caseAbstractCodeElement(exceptionUnit);
				if (result == null) result = caseModelElement(exceptionUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.TRY_UNIT: {
				TryUnit tryUnit = (TryUnit)theEObject;
				T result = caseTryUnit(tryUnit);
				if (result == null) result = caseExceptionUnit(tryUnit);
				if (result == null) result = caseBlockUnit(tryUnit);
				if (result == null) result = caseActionElement(tryUnit);
				if (result == null) result = caseAbstractCodeElement(tryUnit);
				if (result == null) result = caseModelElement(tryUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.CATCH_UNIT: {
				CatchUnit catchUnit = (CatchUnit)theEObject;
				T result = caseCatchUnit(catchUnit);
				if (result == null) result = caseExceptionUnit(catchUnit);
				if (result == null) result = caseBlockUnit(catchUnit);
				if (result == null) result = caseActionElement(catchUnit);
				if (result == null) result = caseAbstractCodeElement(catchUnit);
				if (result == null) result = caseModelElement(catchUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.FINALLY_UNIT: {
				FinallyUnit finallyUnit = (FinallyUnit)theEObject;
				T result = caseFinallyUnit(finallyUnit);
				if (result == null) result = caseExceptionUnit(finallyUnit);
				if (result == null) result = caseBlockUnit(finallyUnit);
				if (result == null) result = caseActionElement(finallyUnit);
				if (result == null) result = caseAbstractCodeElement(finallyUnit);
				if (result == null) result = caseModelElement(finallyUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.SEGMENT: {
				Segment segment = (Segment)theEObject;
				T result = caseSegment(segment);
				if (result == null) result = caseModelElement(segment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KdmObjectsPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeModel(CodeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Code Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Code Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCodeElement(AbstractCodeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeItem(CodeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(subkdm.kdmObjects.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassUnit(ClassUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceUnit(InterfaceUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computational Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computational Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputationalObject(ComputationalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlElement(ControlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallableUnit(CallableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodUnit(MethodUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataElement(DataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storable Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorableUnit(StorableUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentUnit(CommentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterUnit(ParameterUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateUnit(TemplateUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeUnit(CodeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionElement(ActionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockUnit(BlockUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionUnit(ExceptionUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryUnit(TryUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchUnit(CatchUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinallyUnit(FinallyUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegment(Segment object) {
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

} //KdmObjectsSwitch
