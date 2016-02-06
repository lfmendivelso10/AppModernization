/**
 */
package subkdm.kdmObjects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see subkdm.kdmObjects.KdmObjectsFactory
 * @model kind="package"
 * @generated
 */
public interface KdmObjectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kdmObjects";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subkdm/kdmobjects";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kdmObjects";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KdmObjectsPackage eINSTANCE = subkdm.kdmObjects.impl.KdmObjectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ModelElementImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 26;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.CodeModelImpl <em>Code Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.CodeModelImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCodeModel()
	 * @generated
	 */
	int CODE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__CODE_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL__NAME = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_MODEL_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.AbstractCodeElementImpl <em>Abstract Code Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.AbstractCodeElementImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getAbstractCodeElement()
	 * @generated
	 */
	int ABSTRACT_CODE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__CODE_RELATION = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__COMMENT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Abstract Code Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.CodeItemImpl <em>Code Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.CodeItemImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCodeItem()
	 * @generated
	 */
	int CODE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__CODE_RELATION = ABSTRACT_CODE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__COMMENT = ABSTRACT_CODE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM__NAME = ABSTRACT_CODE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Code Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM_FEATURE_COUNT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ITEM_OPERATION_COUNT = ABSTRACT_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ModuleImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 3;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = CODE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__CODE_ELEMENT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = CODE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.PackageImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_RELATION = MODULE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMMENT = MODULE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CODE_ELEMENT = MODULE__CODE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.DataTypeImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = CODE_ITEM__NAME;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CODE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ClassUnitImpl <em>Class Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ClassUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getClassUnit()
	 * @generated
	 */
	int CLASS_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__CODE_ELEMENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT__IS_ABSTRACT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Class Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_UNIT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.InterfaceUnitImpl <em>Interface Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.InterfaceUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getInterfaceUnit()
	 * @generated
	 */
	int INTERFACE_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT__CODE_ELEMENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_UNIT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ComputationalObjectImpl <em>Computational Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ComputationalObjectImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getComputationalObject()
	 * @generated
	 */
	int COMPUTATIONAL_OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__CODE_RELATION = CODE_ITEM__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__COMMENT = CODE_ITEM__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT__NAME = CODE_ITEM__NAME;

	/**
	 * The number of structural features of the '<em>Computational Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT_FEATURE_COUNT = CODE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Computational Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTATIONAL_OBJECT_OPERATION_COUNT = CODE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ControlElementImpl <em>Control Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ControlElementImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getControlElement()
	 * @generated
	 */
	int CONTROL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__CODE_RELATION = COMPUTATIONAL_OBJECT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__COMMENT = COMPUTATIONAL_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__NAME = COMPUTATIONAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__CODE_ELEMENT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT__TYPE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT_FEATURE_COUNT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Control Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_ELEMENT_OPERATION_COUNT = COMPUTATIONAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.CallableUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCallableUnit()
	 * @generated
	 */
	int CALLABLE_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__CODE_RELATION = CONTROL_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__COMMENT = CONTROL_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__NAME = CONTROL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__CODE_ELEMENT = CONTROL_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__TYPE = CONTROL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT__KIND = CONTROL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Callable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Callable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLABLE_UNIT_OPERATION_COUNT = CONTROL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.MethodUnitImpl <em>Method Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.MethodUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getMethodUnit()
	 * @generated
	 */
	int METHOD_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__CODE_RELATION = CONTROL_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__COMMENT = CONTROL_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__NAME = CONTROL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__CODE_ELEMENT = CONTROL_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__TYPE = CONTROL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT__KIND = CONTROL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT_FEATURE_COUNT = CONTROL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Method Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_UNIT_OPERATION_COUNT = CONTROL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.DataElementImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CODE_RELATION = COMPUTATIONAL_OBJECT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COMMENT = COMPUTATIONAL_OBJECT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = COMPUTATIONAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CODE_ELEMENT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TYPE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__EXT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SIZE = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = COMPUTATIONAL_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = COMPUTATIONAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.StorableUnitImpl <em>Storable Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.StorableUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getStorableUnit()
	 * @generated
	 */
	int STORABLE_UNIT = 13;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT__KIND = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Storable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Storable Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORABLE_UNIT_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.CommentUnitImpl <em>Comment Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.CommentUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCommentUnit()
	 * @generated
	 */
	int COMMENT_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Comment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ParameterUnitImpl <em>Parameter Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ParameterUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getParameterUnit()
	 * @generated
	 */
	int PARAMETER_UNIT = 15;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__CODE_RELATION = DATA_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__COMMENT = DATA_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__NAME = DATA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__CODE_ELEMENT = DATA_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__TYPE = DATA_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__EXT = DATA_ELEMENT__EXT;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__SIZE = DATA_ELEMENT__SIZE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__KIND = DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT__POS = DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT_FEATURE_COUNT = DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_UNIT_OPERATION_COUNT = DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.TemplateUnitImpl <em>Template Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.TemplateUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getTemplateUnit()
	 * @generated
	 */
	int TEMPLATE_UNIT = 16;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT__CODE_ELEMENT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Template Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_UNIT_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.CodeUnitImpl <em>Code Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.CodeUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCodeUnit()
	 * @generated
	 */
	int CODE_UNIT = 17;

	/**
	 * The number of structural features of the '<em>Code Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Code Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.SignatureImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 18;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__CODE_RELATION = DATA_TYPE__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__COMMENT = DATA_TYPE__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Unit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__PARAMETER_UNIT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ActionElementImpl <em>Action Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ActionElementImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getActionElement()
	 * @generated
	 */
	int ACTION_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__CODE_RELATION = ABSTRACT_CODE_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__COMMENT = ABSTRACT_CODE_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__NAME = ABSTRACT_CODE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__KIND = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__CODE_ELEMENT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT__ACTION_RELATION = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_FEATURE_COUNT = ABSTRACT_CODE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Action Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ELEMENT_OPERATION_COUNT = ABSTRACT_CODE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.BlockUnitImpl <em>Block Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.BlockUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getBlockUnit()
	 * @generated
	 */
	int BLOCK_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__CODE_RELATION = ACTION_ELEMENT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__COMMENT = ACTION_ELEMENT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__NAME = ACTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__KIND = ACTION_ELEMENT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__CODE_ELEMENT = ACTION_ELEMENT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT__ACTION_RELATION = ACTION_ELEMENT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Block Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT_FEATURE_COUNT = ACTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_UNIT_OPERATION_COUNT = ACTION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.ExceptionUnitImpl <em>Exception Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.ExceptionUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getExceptionUnit()
	 * @generated
	 */
	int EXCEPTION_UNIT = 21;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__CODE_RELATION = BLOCK_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__COMMENT = BLOCK_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__NAME = BLOCK_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__KIND = BLOCK_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__CODE_ELEMENT = BLOCK_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT__ACTION_RELATION = BLOCK_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Exception Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT_FEATURE_COUNT = BLOCK_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exception Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_UNIT_OPERATION_COUNT = BLOCK_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.TryUnitImpl <em>Try Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.TryUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getTryUnit()
	 * @generated
	 */
	int TRY_UNIT = 22;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Try Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Try Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_UNIT_OPERATION_COUNT = EXCEPTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.CatchUnitImpl <em>Catch Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.CatchUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCatchUnit()
	 * @generated
	 */
	int CATCH_UNIT = 23;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Catch Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catch Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCH_UNIT_OPERATION_COUNT = EXCEPTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.FinallyUnitImpl <em>Finally Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.FinallyUnitImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getFinallyUnit()
	 * @generated
	 */
	int FINALLY_UNIT = 24;

	/**
	 * The feature id for the '<em><b>Code Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__CODE_RELATION = EXCEPTION_UNIT__CODE_RELATION;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__COMMENT = EXCEPTION_UNIT__COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__NAME = EXCEPTION_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__KIND = EXCEPTION_UNIT__KIND;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__CODE_ELEMENT = EXCEPTION_UNIT__CODE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Action Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT__ACTION_RELATION = EXCEPTION_UNIT__ACTION_RELATION;

	/**
	 * The number of structural features of the '<em>Finally Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT_FEATURE_COUNT = EXCEPTION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Finally Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINALLY_UNIT_OPERATION_COUNT = EXCEPTION_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.impl.SegmentImpl
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 25;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__MODEL = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.MethoKind <em>Metho Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.MethoKind
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getMethoKind()
	 * @generated
	 */
	int METHO_KIND = 27;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.CallableKind <em>Callable Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.CallableKind
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCallableKind()
	 * @generated
	 */
	int CALLABLE_KIND = 28;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.StorableKind <em>Storable Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.StorableKind
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getStorableKind()
	 * @generated
	 */
	int STORABLE_KIND = 29;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.ExportKind <em>Export Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.ExportKind
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getExportKind()
	 * @generated
	 */
	int EXPORT_KIND = 30;

	/**
	 * The meta object id for the '{@link subkdm.kdmObjects.ParameterKind <em>Parameter Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmObjects.ParameterKind
	 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getParameterKind()
	 * @generated
	 */
	int PARAMETER_KIND = 31;


	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.CodeModel <em>Code Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Model</em>'.
	 * @see subkdm.kdmObjects.CodeModel
	 * @generated
	 */
	EClass getCodeModel();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.CodeModel#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.CodeModel#getCodeElement()
	 * @see #getCodeModel()
	 * @generated
	 */
	EReference getCodeModel_CodeElement();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.CodeModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subkdm.kdmObjects.CodeModel#getName()
	 * @see #getCodeModel()
	 * @generated
	 */
	EAttribute getCodeModel_Name();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.AbstractCodeElement <em>Abstract Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Code Element</em>'.
	 * @see subkdm.kdmObjects.AbstractCodeElement
	 * @generated
	 */
	EClass getAbstractCodeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.AbstractCodeElement#getCodeRelation <em>Code Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Relation</em>'.
	 * @see subkdm.kdmObjects.AbstractCodeElement#getCodeRelation()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_CodeRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.AbstractCodeElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comment</em>'.
	 * @see subkdm.kdmObjects.AbstractCodeElement#getComment()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EReference getAbstractCodeElement_Comment();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.AbstractCodeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subkdm.kdmObjects.AbstractCodeElement#getName()
	 * @see #getAbstractCodeElement()
	 * @generated
	 */
	EAttribute getAbstractCodeElement_Name();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.CodeItem <em>Code Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Item</em>'.
	 * @see subkdm.kdmObjects.CodeItem
	 * @generated
	 */
	EClass getCodeItem();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see subkdm.kdmObjects.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.Module#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.Module#getCodeElement()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_CodeElement();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see subkdm.kdmObjects.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see subkdm.kdmObjects.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.ClassUnit <em>Class Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Unit</em>'.
	 * @see subkdm.kdmObjects.ClassUnit
	 * @generated
	 */
	EClass getClassUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.ClassUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.ClassUnit#getCodeElement()
	 * @see #getClassUnit()
	 * @generated
	 */
	EReference getClassUnit_CodeElement();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.ClassUnit#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see subkdm.kdmObjects.ClassUnit#isIsAbstract()
	 * @see #getClassUnit()
	 * @generated
	 */
	EAttribute getClassUnit_IsAbstract();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.InterfaceUnit <em>Interface Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Unit</em>'.
	 * @see subkdm.kdmObjects.InterfaceUnit
	 * @generated
	 */
	EClass getInterfaceUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.InterfaceUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.InterfaceUnit#getCodeElement()
	 * @see #getInterfaceUnit()
	 * @generated
	 */
	EReference getInterfaceUnit_CodeElement();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.ComputationalObject <em>Computational Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computational Object</em>'.
	 * @see subkdm.kdmObjects.ComputationalObject
	 * @generated
	 */
	EClass getComputationalObject();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.ControlElement <em>Control Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Element</em>'.
	 * @see subkdm.kdmObjects.ControlElement
	 * @generated
	 */
	EClass getControlElement();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.ControlElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.ControlElement#getCodeElement()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_CodeElement();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmObjects.ControlElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see subkdm.kdmObjects.ControlElement#getType()
	 * @see #getControlElement()
	 * @generated
	 */
	EReference getControlElement_Type();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.CallableUnit <em>Callable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Callable Unit</em>'.
	 * @see subkdm.kdmObjects.CallableUnit
	 * @generated
	 */
	EClass getCallableUnit();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.CallableUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see subkdm.kdmObjects.CallableUnit#getKind()
	 * @see #getCallableUnit()
	 * @generated
	 */
	EAttribute getCallableUnit_Kind();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.MethodUnit <em>Method Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Unit</em>'.
	 * @see subkdm.kdmObjects.MethodUnit
	 * @generated
	 */
	EClass getMethodUnit();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.MethodUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see subkdm.kdmObjects.MethodUnit#getKind()
	 * @see #getMethodUnit()
	 * @generated
	 */
	EAttribute getMethodUnit_Kind();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see subkdm.kdmObjects.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.DataElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.DataElement#getCodeElement()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_CodeElement();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmObjects.DataElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see subkdm.kdmObjects.DataElement#getType()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.DataElement#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see subkdm.kdmObjects.DataElement#getExt()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Ext();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.DataElement#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see subkdm.kdmObjects.DataElement#getSize()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Size();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.StorableUnit <em>Storable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storable Unit</em>'.
	 * @see subkdm.kdmObjects.StorableUnit
	 * @generated
	 */
	EClass getStorableUnit();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.StorableUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see subkdm.kdmObjects.StorableUnit#getKind()
	 * @see #getStorableUnit()
	 * @generated
	 */
	EAttribute getStorableUnit_Kind();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.CommentUnit <em>Comment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment Unit</em>'.
	 * @see subkdm.kdmObjects.CommentUnit
	 * @generated
	 */
	EClass getCommentUnit();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.CommentUnit#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see subkdm.kdmObjects.CommentUnit#getText()
	 * @see #getCommentUnit()
	 * @generated
	 */
	EAttribute getCommentUnit_Text();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.ParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Unit</em>'.
	 * @see subkdm.kdmObjects.ParameterUnit
	 * @generated
	 */
	EClass getParameterUnit();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.ParameterUnit#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see subkdm.kdmObjects.ParameterUnit#getKind()
	 * @see #getParameterUnit()
	 * @generated
	 */
	EAttribute getParameterUnit_Kind();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.ParameterUnit#getPos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos</em>'.
	 * @see subkdm.kdmObjects.ParameterUnit#getPos()
	 * @see #getParameterUnit()
	 * @generated
	 */
	EAttribute getParameterUnit_Pos();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.TemplateUnit <em>Template Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Unit</em>'.
	 * @see subkdm.kdmObjects.TemplateUnit
	 * @generated
	 */
	EClass getTemplateUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.TemplateUnit#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.TemplateUnit#getCodeElement()
	 * @see #getTemplateUnit()
	 * @generated
	 */
	EReference getTemplateUnit_CodeElement();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.CodeUnit <em>Code Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Unit</em>'.
	 * @see subkdm.kdmObjects.CodeUnit
	 * @generated
	 */
	EClass getCodeUnit();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see subkdm.kdmObjects.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.Signature#getParameterUnit <em>Parameter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Unit</em>'.
	 * @see subkdm.kdmObjects.Signature#getParameterUnit()
	 * @see #getSignature()
	 * @generated
	 */
	EReference getSignature_ParameterUnit();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.ActionElement <em>Action Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Element</em>'.
	 * @see subkdm.kdmObjects.ActionElement
	 * @generated
	 */
	EClass getActionElement();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.ActionElement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see subkdm.kdmObjects.ActionElement#getKind()
	 * @see #getActionElement()
	 * @generated
	 */
	EAttribute getActionElement_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.ActionElement#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmObjects.ActionElement#getCodeElement()
	 * @see #getActionElement()
	 * @generated
	 */
	EReference getActionElement_CodeElement();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.ActionElement#getActionRelation <em>Action Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Relation</em>'.
	 * @see subkdm.kdmObjects.ActionElement#getActionRelation()
	 * @see #getActionElement()
	 * @generated
	 */
	EReference getActionElement_ActionRelation();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.BlockUnit <em>Block Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Unit</em>'.
	 * @see subkdm.kdmObjects.BlockUnit
	 * @generated
	 */
	EClass getBlockUnit();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.ExceptionUnit <em>Exception Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception Unit</em>'.
	 * @see subkdm.kdmObjects.ExceptionUnit
	 * @generated
	 */
	EClass getExceptionUnit();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.TryUnit <em>Try Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Unit</em>'.
	 * @see subkdm.kdmObjects.TryUnit
	 * @generated
	 */
	EClass getTryUnit();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.CatchUnit <em>Catch Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catch Unit</em>'.
	 * @see subkdm.kdmObjects.CatchUnit
	 * @generated
	 */
	EClass getCatchUnit();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.FinallyUnit <em>Finally Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finally Unit</em>'.
	 * @see subkdm.kdmObjects.FinallyUnit
	 * @generated
	 */
	EClass getFinallyUnit();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see subkdm.kdmObjects.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmObjects.Segment#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see subkdm.kdmObjects.Segment#getModel()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Model();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmObjects.Segment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subkdm.kdmObjects.Segment#getName()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Name();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmObjects.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see subkdm.kdmObjects.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for enum '{@link subkdm.kdmObjects.MethoKind <em>Metho Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metho Kind</em>'.
	 * @see subkdm.kdmObjects.MethoKind
	 * @generated
	 */
	EEnum getMethoKind();

	/**
	 * Returns the meta object for enum '{@link subkdm.kdmObjects.CallableKind <em>Callable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Callable Kind</em>'.
	 * @see subkdm.kdmObjects.CallableKind
	 * @generated
	 */
	EEnum getCallableKind();

	/**
	 * Returns the meta object for enum '{@link subkdm.kdmObjects.StorableKind <em>Storable Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storable Kind</em>'.
	 * @see subkdm.kdmObjects.StorableKind
	 * @generated
	 */
	EEnum getStorableKind();

	/**
	 * Returns the meta object for enum '{@link subkdm.kdmObjects.ExportKind <em>Export Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Export Kind</em>'.
	 * @see subkdm.kdmObjects.ExportKind
	 * @generated
	 */
	EEnum getExportKind();

	/**
	 * Returns the meta object for enum '{@link subkdm.kdmObjects.ParameterKind <em>Parameter Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Kind</em>'.
	 * @see subkdm.kdmObjects.ParameterKind
	 * @generated
	 */
	EEnum getParameterKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KdmObjectsFactory getKdmObjectsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.CodeModelImpl <em>Code Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.CodeModelImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCodeModel()
		 * @generated
		 */
		EClass CODE_MODEL = eINSTANCE.getCodeModel();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_MODEL__CODE_ELEMENT = eINSTANCE.getCodeModel_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_MODEL__NAME = eINSTANCE.getCodeModel_Name();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.AbstractCodeElementImpl <em>Abstract Code Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.AbstractCodeElementImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getAbstractCodeElement()
		 * @generated
		 */
		EClass ABSTRACT_CODE_ELEMENT = eINSTANCE.getAbstractCodeElement();

		/**
		 * The meta object literal for the '<em><b>Code Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__CODE_RELATION = eINSTANCE.getAbstractCodeElement_CodeRelation();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_ELEMENT__COMMENT = eINSTANCE.getAbstractCodeElement_Comment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CODE_ELEMENT__NAME = eINSTANCE.getAbstractCodeElement_Name();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.CodeItemImpl <em>Code Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.CodeItemImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCodeItem()
		 * @generated
		 */
		EClass CODE_ITEM = eINSTANCE.getCodeItem();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ModuleImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__CODE_ELEMENT = eINSTANCE.getModule_CodeElement();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.PackageImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.DataTypeImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ClassUnitImpl <em>Class Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ClassUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getClassUnit()
		 * @generated
		 */
		EClass CLASS_UNIT = eINSTANCE.getClassUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_UNIT__CODE_ELEMENT = eINSTANCE.getClassUnit_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_UNIT__IS_ABSTRACT = eINSTANCE.getClassUnit_IsAbstract();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.InterfaceUnitImpl <em>Interface Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.InterfaceUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getInterfaceUnit()
		 * @generated
		 */
		EClass INTERFACE_UNIT = eINSTANCE.getInterfaceUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_UNIT__CODE_ELEMENT = eINSTANCE.getInterfaceUnit_CodeElement();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ComputationalObjectImpl <em>Computational Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ComputationalObjectImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getComputationalObject()
		 * @generated
		 */
		EClass COMPUTATIONAL_OBJECT = eINSTANCE.getComputationalObject();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ControlElementImpl <em>Control Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ControlElementImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getControlElement()
		 * @generated
		 */
		EClass CONTROL_ELEMENT = eINSTANCE.getControlElement();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__CODE_ELEMENT = eINSTANCE.getControlElement_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_ELEMENT__TYPE = eINSTANCE.getControlElement_Type();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.CallableUnitImpl <em>Callable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.CallableUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCallableUnit()
		 * @generated
		 */
		EClass CALLABLE_UNIT = eINSTANCE.getCallableUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALLABLE_UNIT__KIND = eINSTANCE.getCallableUnit_Kind();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.MethodUnitImpl <em>Method Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.MethodUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getMethodUnit()
		 * @generated
		 */
		EClass METHOD_UNIT = eINSTANCE.getMethodUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_UNIT__KIND = eINSTANCE.getMethodUnit_Kind();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.DataElementImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__CODE_ELEMENT = eINSTANCE.getDataElement_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__TYPE = eINSTANCE.getDataElement_Type();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__EXT = eINSTANCE.getDataElement_Ext();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__SIZE = eINSTANCE.getDataElement_Size();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.StorableUnitImpl <em>Storable Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.StorableUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getStorableUnit()
		 * @generated
		 */
		EClass STORABLE_UNIT = eINSTANCE.getStorableUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORABLE_UNIT__KIND = eINSTANCE.getStorableUnit_Kind();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.CommentUnitImpl <em>Comment Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.CommentUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCommentUnit()
		 * @generated
		 */
		EClass COMMENT_UNIT = eINSTANCE.getCommentUnit();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT_UNIT__TEXT = eINSTANCE.getCommentUnit_Text();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ParameterUnitImpl <em>Parameter Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ParameterUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getParameterUnit()
		 * @generated
		 */
		EClass PARAMETER_UNIT = eINSTANCE.getParameterUnit();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_UNIT__KIND = eINSTANCE.getParameterUnit_Kind();

		/**
		 * The meta object literal for the '<em><b>Pos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_UNIT__POS = eINSTANCE.getParameterUnit_Pos();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.TemplateUnitImpl <em>Template Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.TemplateUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getTemplateUnit()
		 * @generated
		 */
		EClass TEMPLATE_UNIT = eINSTANCE.getTemplateUnit();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_UNIT__CODE_ELEMENT = eINSTANCE.getTemplateUnit_CodeElement();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.CodeUnitImpl <em>Code Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.CodeUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCodeUnit()
		 * @generated
		 */
		EClass CODE_UNIT = eINSTANCE.getCodeUnit();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.SignatureImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Parameter Unit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE__PARAMETER_UNIT = eINSTANCE.getSignature_ParameterUnit();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ActionElementImpl <em>Action Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ActionElementImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getActionElement()
		 * @generated
		 */
		EClass ACTION_ELEMENT = eINSTANCE.getActionElement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ELEMENT__KIND = eINSTANCE.getActionElement_Kind();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT__CODE_ELEMENT = eINSTANCE.getActionElement_CodeElement();

		/**
		 * The meta object literal for the '<em><b>Action Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_ELEMENT__ACTION_RELATION = eINSTANCE.getActionElement_ActionRelation();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.BlockUnitImpl <em>Block Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.BlockUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getBlockUnit()
		 * @generated
		 */
		EClass BLOCK_UNIT = eINSTANCE.getBlockUnit();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ExceptionUnitImpl <em>Exception Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ExceptionUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getExceptionUnit()
		 * @generated
		 */
		EClass EXCEPTION_UNIT = eINSTANCE.getExceptionUnit();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.TryUnitImpl <em>Try Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.TryUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getTryUnit()
		 * @generated
		 */
		EClass TRY_UNIT = eINSTANCE.getTryUnit();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.CatchUnitImpl <em>Catch Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.CatchUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCatchUnit()
		 * @generated
		 */
		EClass CATCH_UNIT = eINSTANCE.getCatchUnit();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.FinallyUnitImpl <em>Finally Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.FinallyUnitImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getFinallyUnit()
		 * @generated
		 */
		EClass FINALLY_UNIT = eINSTANCE.getFinallyUnit();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.SegmentImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__MODEL = eINSTANCE.getSegment_Model();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__NAME = eINSTANCE.getSegment_Name();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.impl.ModelElementImpl
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.MethoKind <em>Metho Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.MethoKind
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getMethoKind()
		 * @generated
		 */
		EEnum METHO_KIND = eINSTANCE.getMethoKind();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.CallableKind <em>Callable Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.CallableKind
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getCallableKind()
		 * @generated
		 */
		EEnum CALLABLE_KIND = eINSTANCE.getCallableKind();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.StorableKind <em>Storable Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.StorableKind
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getStorableKind()
		 * @generated
		 */
		EEnum STORABLE_KIND = eINSTANCE.getStorableKind();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.ExportKind <em>Export Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.ExportKind
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getExportKind()
		 * @generated
		 */
		EEnum EXPORT_KIND = eINSTANCE.getExportKind();

		/**
		 * The meta object literal for the '{@link subkdm.kdmObjects.ParameterKind <em>Parameter Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmObjects.ParameterKind
		 * @see subkdm.kdmObjects.impl.KdmObjectsPackageImpl#getParameterKind()
		 * @generated
		 */
		EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

	}

} //KdmObjectsPackage
