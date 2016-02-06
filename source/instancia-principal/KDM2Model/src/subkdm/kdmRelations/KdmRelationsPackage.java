/**
 */
package subkdm.kdmRelations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import subkdm.kdmObjects.KdmObjectsPackage;

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
 * @see subkdm.kdmRelations.KdmRelationsFactory
 * @model kind="package"
 * @generated
 */
public interface KdmRelationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kdmRelations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://subkdm/kdmrelations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kdmrelations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KdmRelationsPackage eINSTANCE = subkdm.kdmRelations.impl.KdmRelationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.AbstractCodeRelationshipImpl <em>Abstract Code Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.AbstractCodeRelationshipImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getAbstractCodeRelationship()
	 * @generated
	 */
	int ABSTRACT_CODE_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP__ANNOTATION = KdmObjectsPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP__TO = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP__FROM = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Code Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Code Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT = KdmObjectsPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.AbstractActionRelationshipImpl <em>Abstract Action Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.AbstractActionRelationshipImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getAbstractActionRelationship()
	 * @generated
	 */
	int ABSTRACT_ACTION_RELATIONSHIP = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION = KdmObjectsPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP__TO = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP__FROM = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Action Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Action Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT = KdmObjectsPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.CallsImpl <em>Calls</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.CallsImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getCalls()
	 * @generated
	 */
	int CALLS = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__TO = ABSTRACT_ACTION_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS__FROM = ABSTRACT_ACTION_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Calls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Calls</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALLS_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.ReadsImpl <em>Reads</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.ReadsImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getReads()
	 * @generated
	 */
	int READS = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__TO = ABSTRACT_ACTION_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS__FROM = ABSTRACT_ACTION_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Reads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reads</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READS_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.WritesImpl <em>Writes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.WritesImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getWrites()
	 * @generated
	 */
	int WRITES = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__TO = ABSTRACT_ACTION_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES__FROM = ABSTRACT_ACTION_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Writes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Writes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITES_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.CreatesImpl <em>Creates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.CreatesImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getCreates()
	 * @generated
	 */
	int CREATES = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__ANNOTATION = ABSTRACT_ACTION_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__TO = ABSTRACT_ACTION_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES__FROM = ABSTRACT_ACTION_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Creates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES_FEATURE_COUNT = ABSTRACT_ACTION_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Creates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATES_OPERATION_COUNT = ABSTRACT_ACTION_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.ImplementationOfImpl <em>Implementation Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.ImplementationOfImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getImplementationOf()
	 * @generated
	 */
	int IMPLEMENTATION_OF = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__TO = ABSTRACT_CODE_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF__FROM = ABSTRACT_CODE_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Implementation Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implementation Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_OF_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.HasValueImpl <em>Has Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.HasValueImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getHasValue()
	 * @generated
	 */
	int HAS_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__TO = ABSTRACT_CODE_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE__FROM = ABSTRACT_CODE_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Has Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VALUE_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.ImportsImpl <em>Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.ImportsImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getImports()
	 * @generated
	 */
	int IMPORTS = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__TO = ABSTRACT_CODE_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__FROM = ABSTRACT_CODE_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.ImplementsImpl <em>Implements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.ImplementsImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getImplements()
	 * @generated
	 */
	int IMPLEMENTS = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__TO = ABSTRACT_CODE_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__FROM = ABSTRACT_CODE_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.ExtendsImpl <em>Extends</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.ExtendsImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getExtends()
	 * @generated
	 */
	int EXTENDS = 10;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__ANNOTATION = ABSTRACT_CODE_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__TO = ABSTRACT_CODE_RELATIONSHIP__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__FROM = ABSTRACT_CODE_RELATIONSHIP__FROM;

	/**
	 * The number of structural features of the '<em>Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_FEATURE_COUNT = ABSTRACT_CODE_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_OPERATION_COUNT = ABSTRACT_CODE_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.ClassLevelRelationImpl <em>Class Level Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.ClassLevelRelationImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getClassLevelRelation()
	 * @generated
	 */
	int CLASS_LEVEL_RELATION = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_RELATION__ANNOTATION = KdmObjectsPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_RELATION__TO = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_RELATION__FROM = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_RELATION__TYPE = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_RELATION__TYPE_RELATIONS = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Level Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_RELATION_FEATURE_COUNT = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Class Level Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_RELATION_OPERATION_COUNT = KdmObjectsPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.TypeRelationImpl <em>Type Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.TypeRelationImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getTypeRelation()
	 * @generated
	 */
	int TYPE_RELATION = 12;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION__ANNOTATION = KdmObjectsPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION__NAME = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_FEATURE_COUNT = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_RELATION_OPERATION_COUNT = KdmObjectsPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link subkdm.kdmRelations.impl.ClusterRelationImpl <em>Cluster Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see subkdm.kdmRelations.impl.ClusterRelationImpl
	 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getClusterRelation()
	 * @generated
	 */
	int CLUSTER_RELATION = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION__ANNOTATION = KdmObjectsPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION__TO = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION__FROM = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Code Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION__CODE_ELEMENT = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cluster Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_FEATURE_COUNT = KdmObjectsPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cluster Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_RELATION_OPERATION_COUNT = KdmObjectsPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.AbstractCodeRelationship <em>Abstract Code Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Code Relationship</em>'.
	 * @see subkdm.kdmRelations.AbstractCodeRelationship
	 * @generated
	 */
	EClass getAbstractCodeRelationship();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.AbstractCodeRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see subkdm.kdmRelations.AbstractCodeRelationship#getTo()
	 * @see #getAbstractCodeRelationship()
	 * @generated
	 */
	EReference getAbstractCodeRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.AbstractCodeRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see subkdm.kdmRelations.AbstractCodeRelationship#getFrom()
	 * @see #getAbstractCodeRelationship()
	 * @generated
	 */
	EReference getAbstractCodeRelationship_From();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.Calls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Calls</em>'.
	 * @see subkdm.kdmRelations.Calls
	 * @generated
	 */
	EClass getCalls();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.Reads <em>Reads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reads</em>'.
	 * @see subkdm.kdmRelations.Reads
	 * @generated
	 */
	EClass getReads();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.Writes <em>Writes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Writes</em>'.
	 * @see subkdm.kdmRelations.Writes
	 * @generated
	 */
	EClass getWrites();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.Creates <em>Creates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creates</em>'.
	 * @see subkdm.kdmRelations.Creates
	 * @generated
	 */
	EClass getCreates();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.ImplementationOf <em>Implementation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Of</em>'.
	 * @see subkdm.kdmRelations.ImplementationOf
	 * @generated
	 */
	EClass getImplementationOf();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.HasValue <em>Has Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Value</em>'.
	 * @see subkdm.kdmRelations.HasValue
	 * @generated
	 */
	EClass getHasValue();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imports</em>'.
	 * @see subkdm.kdmRelations.Imports
	 * @generated
	 */
	EClass getImports();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements</em>'.
	 * @see subkdm.kdmRelations.Implements
	 * @generated
	 */
	EClass getImplements();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.AbstractActionRelationship <em>Abstract Action Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Action Relationship</em>'.
	 * @see subkdm.kdmRelations.AbstractActionRelationship
	 * @generated
	 */
	EClass getAbstractActionRelationship();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.AbstractActionRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see subkdm.kdmRelations.AbstractActionRelationship#getTo()
	 * @see #getAbstractActionRelationship()
	 * @generated
	 */
	EReference getAbstractActionRelationship_To();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.AbstractActionRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see subkdm.kdmRelations.AbstractActionRelationship#getFrom()
	 * @see #getAbstractActionRelationship()
	 * @generated
	 */
	EReference getAbstractActionRelationship_From();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends</em>'.
	 * @see subkdm.kdmRelations.Extends
	 * @generated
	 */
	EClass getExtends();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.ClassLevelRelation <em>Class Level Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Level Relation</em>'.
	 * @see subkdm.kdmRelations.ClassLevelRelation
	 * @generated
	 */
	EClass getClassLevelRelation();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.ClassLevelRelation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see subkdm.kdmRelations.ClassLevelRelation#getTo()
	 * @see #getClassLevelRelation()
	 * @generated
	 */
	EReference getClassLevelRelation_To();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.ClassLevelRelation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see subkdm.kdmRelations.ClassLevelRelation#getFrom()
	 * @see #getClassLevelRelation()
	 * @generated
	 */
	EReference getClassLevelRelation_From();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmRelations.ClassLevelRelation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see subkdm.kdmRelations.ClassLevelRelation#getType()
	 * @see #getClassLevelRelation()
	 * @generated
	 */
	EAttribute getClassLevelRelation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link subkdm.kdmRelations.ClassLevelRelation#getTypeRelations <em>Type Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Relations</em>'.
	 * @see subkdm.kdmRelations.ClassLevelRelation#getTypeRelations()
	 * @see #getClassLevelRelation()
	 * @generated
	 */
	EReference getClassLevelRelation_TypeRelations();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.TypeRelation <em>Type Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Relation</em>'.
	 * @see subkdm.kdmRelations.TypeRelation
	 * @generated
	 */
	EClass getTypeRelation();

	/**
	 * Returns the meta object for the attribute '{@link subkdm.kdmRelations.TypeRelation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see subkdm.kdmRelations.TypeRelation#getName()
	 * @see #getTypeRelation()
	 * @generated
	 */
	EAttribute getTypeRelation_Name();

	/**
	 * Returns the meta object for class '{@link subkdm.kdmRelations.ClusterRelation <em>Cluster Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster Relation</em>'.
	 * @see subkdm.kdmRelations.ClusterRelation
	 * @generated
	 */
	EClass getClusterRelation();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.ClusterRelation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see subkdm.kdmRelations.ClusterRelation#getTo()
	 * @see #getClusterRelation()
	 * @generated
	 */
	EReference getClusterRelation_To();

	/**
	 * Returns the meta object for the reference '{@link subkdm.kdmRelations.ClusterRelation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see subkdm.kdmRelations.ClusterRelation#getFrom()
	 * @see #getClusterRelation()
	 * @generated
	 */
	EReference getClusterRelation_From();

	/**
	 * Returns the meta object for the reference list '{@link subkdm.kdmRelations.ClusterRelation#getCodeElement <em>Code Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Code Element</em>'.
	 * @see subkdm.kdmRelations.ClusterRelation#getCodeElement()
	 * @see #getClusterRelation()
	 * @generated
	 */
	EReference getClusterRelation_CodeElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KdmRelationsFactory getKdmRelationsFactory();

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
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.AbstractCodeRelationshipImpl <em>Abstract Code Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.AbstractCodeRelationshipImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getAbstractCodeRelationship()
		 * @generated
		 */
		EClass ABSTRACT_CODE_RELATIONSHIP = eINSTANCE.getAbstractCodeRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_RELATIONSHIP__TO = eINSTANCE.getAbstractCodeRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CODE_RELATIONSHIP__FROM = eINSTANCE.getAbstractCodeRelationship_From();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.CallsImpl <em>Calls</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.CallsImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getCalls()
		 * @generated
		 */
		EClass CALLS = eINSTANCE.getCalls();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.ReadsImpl <em>Reads</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.ReadsImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getReads()
		 * @generated
		 */
		EClass READS = eINSTANCE.getReads();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.WritesImpl <em>Writes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.WritesImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getWrites()
		 * @generated
		 */
		EClass WRITES = eINSTANCE.getWrites();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.CreatesImpl <em>Creates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.CreatesImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getCreates()
		 * @generated
		 */
		EClass CREATES = eINSTANCE.getCreates();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.ImplementationOfImpl <em>Implementation Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.ImplementationOfImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getImplementationOf()
		 * @generated
		 */
		EClass IMPLEMENTATION_OF = eINSTANCE.getImplementationOf();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.HasValueImpl <em>Has Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.HasValueImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getHasValue()
		 * @generated
		 */
		EClass HAS_VALUE = eINSTANCE.getHasValue();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.ImportsImpl <em>Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.ImportsImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getImports()
		 * @generated
		 */
		EClass IMPORTS = eINSTANCE.getImports();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.ImplementsImpl <em>Implements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.ImplementsImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getImplements()
		 * @generated
		 */
		EClass IMPLEMENTS = eINSTANCE.getImplements();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.AbstractActionRelationshipImpl <em>Abstract Action Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.AbstractActionRelationshipImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getAbstractActionRelationship()
		 * @generated
		 */
		EClass ABSTRACT_ACTION_RELATIONSHIP = eINSTANCE.getAbstractActionRelationship();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION_RELATIONSHIP__TO = eINSTANCE.getAbstractActionRelationship_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTION_RELATIONSHIP__FROM = eINSTANCE.getAbstractActionRelationship_From();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.ExtendsImpl <em>Extends</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.ExtendsImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getExtends()
		 * @generated
		 */
		EClass EXTENDS = eINSTANCE.getExtends();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.ClassLevelRelationImpl <em>Class Level Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.ClassLevelRelationImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getClassLevelRelation()
		 * @generated
		 */
		EClass CLASS_LEVEL_RELATION = eINSTANCE.getClassLevelRelation();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LEVEL_RELATION__TO = eINSTANCE.getClassLevelRelation_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LEVEL_RELATION__FROM = eINSTANCE.getClassLevelRelation_From();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LEVEL_RELATION__TYPE = eINSTANCE.getClassLevelRelation_Type();

		/**
		 * The meta object literal for the '<em><b>Type Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_LEVEL_RELATION__TYPE_RELATIONS = eINSTANCE.getClassLevelRelation_TypeRelations();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.TypeRelationImpl <em>Type Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.TypeRelationImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getTypeRelation()
		 * @generated
		 */
		EClass TYPE_RELATION = eINSTANCE.getTypeRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_RELATION__NAME = eINSTANCE.getTypeRelation_Name();

		/**
		 * The meta object literal for the '{@link subkdm.kdmRelations.impl.ClusterRelationImpl <em>Cluster Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see subkdm.kdmRelations.impl.ClusterRelationImpl
		 * @see subkdm.kdmRelations.impl.KdmRelationsPackageImpl#getClusterRelation()
		 * @generated
		 */
		EClass CLUSTER_RELATION = eINSTANCE.getClusterRelation();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER_RELATION__TO = eINSTANCE.getClusterRelation_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER_RELATION__FROM = eINSTANCE.getClusterRelation_From();

		/**
		 * The meta object literal for the '<em><b>Code Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER_RELATION__CODE_ELEMENT = eINSTANCE.getClusterRelation_CodeElement();

	}

} //KdmRelationsPackage
