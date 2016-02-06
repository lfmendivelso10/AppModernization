/**
 */
package subkdm.kdmRelations.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import subkdm.kdmRelations.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KdmRelationsFactoryImpl extends EFactoryImpl implements KdmRelationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KdmRelationsFactory init() {
		try {
			KdmRelationsFactory theKdmRelationsFactory = (KdmRelationsFactory)EPackage.Registry.INSTANCE.getEFactory(KdmRelationsPackage.eNS_URI);
			if (theKdmRelationsFactory != null) {
				return theKdmRelationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KdmRelationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmRelationsFactoryImpl() {
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
			case KdmRelationsPackage.ABSTRACT_CODE_RELATIONSHIP: return createAbstractCodeRelationship();
			case KdmRelationsPackage.CALLS: return createCalls();
			case KdmRelationsPackage.READS: return createReads();
			case KdmRelationsPackage.WRITES: return createWrites();
			case KdmRelationsPackage.CREATES: return createCreates();
			case KdmRelationsPackage.IMPLEMENTATION_OF: return createImplementationOf();
			case KdmRelationsPackage.HAS_VALUE: return createHasValue();
			case KdmRelationsPackage.IMPORTS: return createImports();
			case KdmRelationsPackage.IMPLEMENTS: return createImplements();
			case KdmRelationsPackage.ABSTRACT_ACTION_RELATIONSHIP: return createAbstractActionRelationship();
			case KdmRelationsPackage.EXTENDS: return createExtends();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCodeRelationship createAbstractCodeRelationship() {
		AbstractCodeRelationshipImpl abstractCodeRelationship = new AbstractCodeRelationshipImpl();
		return abstractCodeRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calls createCalls() {
		CallsImpl calls = new CallsImpl();
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reads createReads() {
		ReadsImpl reads = new ReadsImpl();
		return reads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Writes createWrites() {
		WritesImpl writes = new WritesImpl();
		return writes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creates createCreates() {
		CreatesImpl creates = new CreatesImpl();
		return creates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationOf createImplementationOf() {
		ImplementationOfImpl implementationOf = new ImplementationOfImpl();
		return implementationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HasValue createHasValue() {
		HasValueImpl hasValue = new HasValueImpl();
		return hasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implements createImplements() {
		ImplementsImpl implements_ = new ImplementsImpl();
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActionRelationship createAbstractActionRelationship() {
		AbstractActionRelationshipImpl abstractActionRelationship = new AbstractActionRelationshipImpl();
		return abstractActionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extends createExtends() {
		ExtendsImpl extends_ = new ExtendsImpl();
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KdmRelationsPackage getKdmRelationsPackage() {
		return (KdmRelationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KdmRelationsPackage getPackage() {
		return KdmRelationsPackage.eINSTANCE;
	}

} //KdmRelationsFactoryImpl
