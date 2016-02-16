/**
 */
package subkdm.kdmObjects.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import subkdm.kdmObjects.ActionElement;
import subkdm.kdmObjects.BlockUnit;
import subkdm.kdmObjects.CallableKind;
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
import subkdm.kdmObjects.ExportKind;
import subkdm.kdmObjects.FinallyUnit;
import subkdm.kdmObjects.InterfaceUnit;
import subkdm.kdmObjects.KdmObjectsFactory;
import subkdm.kdmObjects.KdmObjectsPackage;
import subkdm.kdmObjects.MethoKind;
import subkdm.kdmObjects.MethodUnit;
import subkdm.kdmObjects.ModelElement;
import subkdm.kdmObjects.Module;
import subkdm.kdmObjects.ParameterKind;
import subkdm.kdmObjects.ParameterUnit;
import subkdm.kdmObjects.Segment;
import subkdm.kdmObjects.Signature;
import subkdm.kdmObjects.StorableKind;
import subkdm.kdmObjects.StorableUnit;
import subkdm.kdmObjects.TemplateUnit;
import subkdm.kdmObjects.TryUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KdmObjectsFactoryImpl extends EFactoryImpl implements KdmObjectsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KdmObjectsFactory init() {
		try {
			KdmObjectsFactory theKdmObjectsFactory = (KdmObjectsFactory)EPackage.Registry.INSTANCE.getEFactory(KdmObjectsPackage.eNS_URI);
			if (theKdmObjectsFactory != null) {
				return theKdmObjectsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KdmObjectsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmObjectsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KdmObjectsPackage.CODE_MODEL: return createCodeModel();
			case KdmObjectsPackage.CODE_ITEM: return createCodeItem();
			case KdmObjectsPackage.MODULE: return createModule();
			case KdmObjectsPackage.PACKAGE: return createPackage();
			case KdmObjectsPackage.DATA_TYPE: return createDataType();
			case KdmObjectsPackage.CLASS_UNIT: return createClassUnit();
			case KdmObjectsPackage.INTERFACE_UNIT: return createInterfaceUnit();
			case KdmObjectsPackage.COMPUTATIONAL_OBJECT: return createComputationalObject();
			case KdmObjectsPackage.CONTROL_ELEMENT: return createControlElement();
			case KdmObjectsPackage.CALLABLE_UNIT: return createCallableUnit();
			case KdmObjectsPackage.METHOD_UNIT: return createMethodUnit();
			case KdmObjectsPackage.DATA_ELEMENT: return createDataElement();
			case KdmObjectsPackage.STORABLE_UNIT: return createStorableUnit();
			case KdmObjectsPackage.COMMENT_UNIT: return createCommentUnit();
			case KdmObjectsPackage.PARAMETER_UNIT: return createParameterUnit();
			case KdmObjectsPackage.TEMPLATE_UNIT: return createTemplateUnit();
			case KdmObjectsPackage.CODE_UNIT: return createCodeUnit();
			case KdmObjectsPackage.SIGNATURE: return createSignature();
			case KdmObjectsPackage.ACTION_ELEMENT: return createActionElement();
			case KdmObjectsPackage.BLOCK_UNIT: return createBlockUnit();
			case KdmObjectsPackage.EXCEPTION_UNIT: return createExceptionUnit();
			case KdmObjectsPackage.TRY_UNIT: return createTryUnit();
			case KdmObjectsPackage.CATCH_UNIT: return createCatchUnit();
			case KdmObjectsPackage.FINALLY_UNIT: return createFinallyUnit();
			case KdmObjectsPackage.SEGMENT: return createSegment();
			case KdmObjectsPackage.MODEL_ELEMENT: return createModelElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case KdmObjectsPackage.METHO_KIND:
				return createMethoKindFromString(eDataType, initialValue);
			case KdmObjectsPackage.CALLABLE_KIND:
				return createCallableKindFromString(eDataType, initialValue);
			case KdmObjectsPackage.STORABLE_KIND:
				return createStorableKindFromString(eDataType, initialValue);
			case KdmObjectsPackage.EXPORT_KIND:
				return createExportKindFromString(eDataType, initialValue);
			case KdmObjectsPackage.PARAMETER_KIND:
				return createParameterKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case KdmObjectsPackage.METHO_KIND:
				return convertMethoKindToString(eDataType, instanceValue);
			case KdmObjectsPackage.CALLABLE_KIND:
				return convertCallableKindToString(eDataType, instanceValue);
			case KdmObjectsPackage.STORABLE_KIND:
				return convertStorableKindToString(eDataType, instanceValue);
			case KdmObjectsPackage.EXPORT_KIND:
				return convertExportKindToString(eDataType, instanceValue);
			case KdmObjectsPackage.PARAMETER_KIND:
				return convertParameterKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeModel createCodeModel() {
		CodeModelImpl codeModel = new CodeModelImpl();
		return codeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeItem createCodeItem() {
		CodeItemImpl codeItem = new CodeItemImpl();
		return codeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subkdm.kdmObjects.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassUnit createClassUnit() {
		ClassUnitImpl classUnit = new ClassUnitImpl();
		return classUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceUnit createInterfaceUnit() {
		InterfaceUnitImpl interfaceUnit = new InterfaceUnitImpl();
		return interfaceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationalObject createComputationalObject() {
		ComputationalObjectImpl computationalObject = new ComputationalObjectImpl();
		return computationalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlElement createControlElement() {
		ControlElementImpl controlElement = new ControlElementImpl();
		return controlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableUnit createCallableUnit() {
		CallableUnitImpl callableUnit = new CallableUnitImpl();
		return callableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodUnit createMethodUnit() {
		MethodUnitImpl methodUnit = new MethodUnitImpl();
		return methodUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorableUnit createStorableUnit() {
		StorableUnitImpl storableUnit = new StorableUnitImpl();
		return storableUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentUnit createCommentUnit() {
		CommentUnitImpl commentUnit = new CommentUnitImpl();
		return commentUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterUnit createParameterUnit() {
		ParameterUnitImpl parameterUnit = new ParameterUnitImpl();
		return parameterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateUnit createTemplateUnit() {
		TemplateUnitImpl templateUnit = new TemplateUnitImpl();
		return templateUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeUnit createCodeUnit() {
		CodeUnitImpl codeUnit = new CodeUnitImpl();
		return codeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionElement createActionElement() {
		ActionElementImpl actionElement = new ActionElementImpl();
		return actionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockUnit createBlockUnit() {
		BlockUnitImpl blockUnit = new BlockUnitImpl();
		return blockUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionUnit createExceptionUnit() {
		ExceptionUnitImpl exceptionUnit = new ExceptionUnitImpl();
		return exceptionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryUnit createTryUnit() {
		TryUnitImpl tryUnit = new TryUnitImpl();
		return tryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchUnit createCatchUnit() {
		CatchUnitImpl catchUnit = new CatchUnitImpl();
		return catchUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinallyUnit createFinallyUnit() {
		FinallyUnitImpl finallyUnit = new FinallyUnitImpl();
		return finallyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethoKind createMethoKindFromString(EDataType eDataType, String initialValue) {
		MethoKind result = MethoKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethoKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableKind createCallableKindFromString(EDataType eDataType, String initialValue) {
		CallableKind result = CallableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorableKind createStorableKindFromString(EDataType eDataType, String initialValue) {
		StorableKind result = StorableKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorableKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExportKind createExportKindFromString(EDataType eDataType, String initialValue) {
		ExportKind result = ExportKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExportKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue) {
		ParameterKind result = ParameterKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmObjectsPackage getKdmObjectsPackage() {
		return (KdmObjectsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KdmObjectsPackage getPackage() {
		return KdmObjectsPackage.eINSTANCE;
	}

} //KdmObjectsFactoryImpl
