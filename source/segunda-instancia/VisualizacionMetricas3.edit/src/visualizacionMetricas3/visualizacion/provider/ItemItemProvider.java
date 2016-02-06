/**
 */
package visualizacionMetricas3.visualizacion.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import visualizacionMetricas3.provider.VisualizacionMetricas3EditPlugin;

import visualizacionMetricas3.visualizacion.Item;
import visualizacionMetricas3.visualizacion.VisualizacionFactory;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * This is the item provider adapter for a {@link visualizacionMetricas3.visualizacion.Item} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ItemItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDiagramaPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIconoPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Diagrama feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NavegacionDiagrama_diagrama_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NavegacionDiagrama_diagrama_feature", "_UI_NavegacionDiagrama_type"),
				 VisualizacionPackage.Literals.NAVEGACION_DIAGRAMA__DIAGRAMA,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ElementoDiagrama_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ElementoDiagrama_name_feature", "_UI_ElementoDiagrama_type"),
				 VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Icono feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIconoPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Item_icono_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Item_icono_feature", "_UI_Item_type"),
				 VisualizacionPackage.Literals.ITEM__ICONO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__LABEL);
			childrenFeatures.add(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__BORDE);
			childrenFeatures.add(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__CONECTORES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Item.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Item"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Item)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Item_type") :
			getString("_UI_Item_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Item.class)) {
			case VisualizacionPackage.ITEM__NAME:
			case VisualizacionPackage.ITEM__ICONO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case VisualizacionPackage.ITEM__LABEL:
			case VisualizacionPackage.ITEM__BORDE:
			case VisualizacionPackage.ITEM__CONECTORES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__LABEL,
				 VisualizacionFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__BORDE,
				 VisualizacionFactory.eINSTANCE.createBorde()));

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__CONECTORES,
				 VisualizacionFactory.eINSTANCE.createHerencia()));

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__CONECTORES,
				 VisualizacionFactory.eINSTANCE.createImplementacion()));

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__CONECTORES,
				 VisualizacionFactory.eINSTANCE.createDependencia()));

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__CONECTORES,
				 VisualizacionFactory.eINSTANCE.createAsociacion()));

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__CONECTORES,
				 VisualizacionFactory.eINSTANCE.createAgregacion()));

		newChildDescriptors.add
			(createChildParameter
				(VisualizacionPackage.Literals.ELEMENTO_DIAGRAMA__CONECTORES,
				 VisualizacionFactory.eINSTANCE.createComposicion()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return VisualizacionMetricas3EditPlugin.INSTANCE;
	}

}
