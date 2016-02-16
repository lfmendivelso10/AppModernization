/**
 */
package subkdm.kdmObjects.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import subkdm.kdmObjects.Cluster;
import subkdm.kdmObjects.CodeItem;
import subkdm.kdmObjects.KdmObjectsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link subkdm.kdmObjects.impl.ClusterImpl#getCodeElement <em>Code Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClusterImpl extends CodeItemImpl implements Cluster {
	/**
	 * The cached value of the '{@link #getCodeElement() <em>Code Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeElement()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeItem> codeElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KdmObjectsPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeItem> getCodeElement() {
		if (codeElement == null) {
			codeElement = new EObjectResolvingEList<CodeItem>(CodeItem.class, this, KdmObjectsPackage.CLUSTER__CODE_ELEMENT);
		}
		return codeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KdmObjectsPackage.CLUSTER__CODE_ELEMENT:
				return getCodeElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KdmObjectsPackage.CLUSTER__CODE_ELEMENT:
				getCodeElement().clear();
				getCodeElement().addAll((Collection<? extends CodeItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KdmObjectsPackage.CLUSTER__CODE_ELEMENT:
				getCodeElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KdmObjectsPackage.CLUSTER__CODE_ELEMENT:
				return codeElement != null && !codeElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClusterImpl
