/**
 */
package DFN.provider;


import DFN.DFNFactory;
import DFN.DFNPackage;
import DFN.DataFlowNetwork;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link DFN.DataFlowNetwork} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataFlowNetworkItemProvider
	extends EndPointItemProvider
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
	public DataFlowNetworkItemProvider(AdapterFactory adapterFactory) {
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

			addProtocolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataFlowNetwork_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataFlowNetwork_protocol_feature", "_UI_DataFlowNetwork_type"),
				 DFNPackage.Literals.DATA_FLOW_NETWORK__PROTOCOL,
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
			childrenFeatures.add(DFNPackage.Literals.DATA_FLOW_NETWORK__NODES);
			childrenFeatures.add(DFNPackage.Literals.DATA_FLOW_NETWORK__CHANNELS);
			childrenFeatures.add(DFNPackage.Literals.DATA_FLOW_NETWORK__TOKENS);
			childrenFeatures.add(DFNPackage.Literals.DATA_FLOW_NETWORK__OWNED_DF_NS);
			childrenFeatures.add(DFNPackage.Literals.DATA_FLOW_NETWORK__APPS);
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
	 * This returns DataFlowNetwork.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataFlowNetwork"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataFlowNetwork)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataFlowNetwork_type") :
			getString("_UI_DataFlowNetwork_type") + " " + label;
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

		switch (notification.getFeatureID(DataFlowNetwork.class)) {
			case DFNPackage.DATA_FLOW_NETWORK__PROTOCOL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DFNPackage.DATA_FLOW_NETWORK__NODES:
			case DFNPackage.DATA_FLOW_NETWORK__CHANNELS:
			case DFNPackage.DATA_FLOW_NETWORK__TOKENS:
			case DFNPackage.DATA_FLOW_NETWORK__OWNED_DF_NS:
			case DFNPackage.DATA_FLOW_NETWORK__APPS:
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
				(DFNPackage.Literals.DATA_FLOW_NETWORK__NODES,
				 DFNFactory.eINSTANCE.createNode()));

		newChildDescriptors.add
			(createChildParameter
				(DFNPackage.Literals.DATA_FLOW_NETWORK__CHANNELS,
				 DFNFactory.eINSTANCE.createChannel()));

		newChildDescriptors.add
			(createChildParameter
				(DFNPackage.Literals.DATA_FLOW_NETWORK__TOKENS,
				 DFNFactory.eINSTANCE.createStringToken()));

		newChildDescriptors.add
			(createChildParameter
				(DFNPackage.Literals.DATA_FLOW_NETWORK__TOKENS,
				 DFNFactory.eINSTANCE.createIntToken()));

		newChildDescriptors.add
			(createChildParameter
				(DFNPackage.Literals.DATA_FLOW_NETWORK__OWNED_DF_NS,
				 DFNFactory.eINSTANCE.createDataFlowNetwork()));

		newChildDescriptors.add
			(createChildParameter
				(DFNPackage.Literals.DATA_FLOW_NETWORK__APPS,
				 DFNFactory.eINSTANCE.createApplication()));
	}

}
