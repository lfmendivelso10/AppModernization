/**
 */
package subkdm.kdmObjects;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see subkdm.kdmObjects.KdmObjectsPackage
 * @generated
 */
public interface KdmObjectsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KdmObjectsFactory eINSTANCE = subkdm.kdmObjects.impl.KdmObjectsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Code Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Model</em>'.
	 * @generated
	 */
	CodeModel createCodeModel();

	/**
	 * Returns a new object of class '<em>Code Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Item</em>'.
	 * @generated
	 */
	CodeItem createCodeItem();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Class Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Unit</em>'.
	 * @generated
	 */
	ClassUnit createClassUnit();

	/**
	 * Returns a new object of class '<em>Interface Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Unit</em>'.
	 * @generated
	 */
	InterfaceUnit createInterfaceUnit();

	/**
	 * Returns a new object of class '<em>Computational Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Computational Object</em>'.
	 * @generated
	 */
	ComputationalObject createComputationalObject();

	/**
	 * Returns a new object of class '<em>Control Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Element</em>'.
	 * @generated
	 */
	ControlElement createControlElement();

	/**
	 * Returns a new object of class '<em>Callable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callable Unit</em>'.
	 * @generated
	 */
	CallableUnit createCallableUnit();

	/**
	 * Returns a new object of class '<em>Method Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Unit</em>'.
	 * @generated
	 */
	MethodUnit createMethodUnit();

	/**
	 * Returns a new object of class '<em>Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Element</em>'.
	 * @generated
	 */
	DataElement createDataElement();

	/**
	 * Returns a new object of class '<em>Storable Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storable Unit</em>'.
	 * @generated
	 */
	StorableUnit createStorableUnit();

	/**
	 * Returns a new object of class '<em>Comment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment Unit</em>'.
	 * @generated
	 */
	CommentUnit createCommentUnit();

	/**
	 * Returns a new object of class '<em>Parameter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Unit</em>'.
	 * @generated
	 */
	ParameterUnit createParameterUnit();

	/**
	 * Returns a new object of class '<em>Template Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Unit</em>'.
	 * @generated
	 */
	TemplateUnit createTemplateUnit();

	/**
	 * Returns a new object of class '<em>Code Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Unit</em>'.
	 * @generated
	 */
	CodeUnit createCodeUnit();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Action Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Element</em>'.
	 * @generated
	 */
	ActionElement createActionElement();

	/**
	 * Returns a new object of class '<em>Block Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Unit</em>'.
	 * @generated
	 */
	BlockUnit createBlockUnit();

	/**
	 * Returns a new object of class '<em>Exception Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Unit</em>'.
	 * @generated
	 */
	ExceptionUnit createExceptionUnit();

	/**
	 * Returns a new object of class '<em>Try Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Try Unit</em>'.
	 * @generated
	 */
	TryUnit createTryUnit();

	/**
	 * Returns a new object of class '<em>Catch Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catch Unit</em>'.
	 * @generated
	 */
	CatchUnit createCatchUnit();

	/**
	 * Returns a new object of class '<em>Finally Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finally Unit</em>'.
	 * @generated
	 */
	FinallyUnit createFinallyUnit();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	Segment createSegment();

	/**
	 * Returns a new object of class '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element</em>'.
	 * @generated
	 */
	ModelElement createModelElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KdmObjectsPackage getKdmObjectsPackage();

} //KdmObjectsFactory
