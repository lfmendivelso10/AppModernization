/**
 */
package visualizacionMetricas3.visualizacion.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import visualizacionMetricas3.visualizacion.Label;
import visualizacionMetricas3.visualizacion.VisualizacionPackage;

/**
 * This is the item provider adapter for a {@link visualizacionMetricas3.visualizacion.Label} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LabelItemProvider 
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
	public LabelItemProvider(AdapterFactory adapterFactory) {
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

			addIsBoldPropertyDescriptor(object);
			addIsItalicPropertyDescriptor(object);
			addAlineacionPropertyDescriptor(object);
			addPosicionPropertyDescriptor(object);
			addColorPropertyDescriptor(object);
			addTamanioPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Bold feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsBoldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Label_isBold_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Label_isBold_feature", "_UI_Label_type"),
				 VisualizacionPackage.Literals.LABEL__IS_BOLD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Italic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsItalicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Label_isItalic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Label_isItalic_feature", "_UI_Label_type"),
				 VisualizacionPackage.Literals.LABEL__IS_ITALIC,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alineacion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlineacionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Label_alineacion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Label_alineacion_feature", "_UI_Label_type"),
				 VisualizacionPackage.Literals.LABEL__ALINEACION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Posicion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPosicionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Label_posicion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Label_posicion_feature", "_UI_Label_type"),
				 VisualizacionPackage.Literals.LABEL__POSICION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Label_color_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Label_color_feature", "_UI_Label_type"),
				 VisualizacionPackage.Literals.LABEL__COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tamanio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTamanioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Label_tamanio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Label_tamanio_feature", "_UI_Label_type"),
				 VisualizacionPackage.Literals.LABEL__TAMANIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Label.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Label"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Label label = (Label)object;
		return getString("_UI_Label_type") + " " + label.isIsBold();
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

		switch (notification.getFeatureID(Label.class)) {
			case VisualizacionPackage.LABEL__IS_BOLD:
			case VisualizacionPackage.LABEL__IS_ITALIC:
			case VisualizacionPackage.LABEL__ALINEACION:
			case VisualizacionPackage.LABEL__POSICION:
			case VisualizacionPackage.LABEL__COLOR:
			case VisualizacionPackage.LABEL__TAMANIO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
