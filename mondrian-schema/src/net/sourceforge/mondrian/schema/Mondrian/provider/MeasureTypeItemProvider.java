/**
 * <copyright>
 * </copyright>
 *
 * $Id: MeasureTypeItemProvider.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.provider;


import java.util.Collection;
import java.util.List;

import net.sourceforge.mondrian.schema.Mondrian.MeasureType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

import net.sourceforge.mondrian.schema.provider.MondrianEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adpater for a {@link net.sourceforge.mondrian.schema.Mondrian.MeasureType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasureTypeItemProvider
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
  public MeasureTypeItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addAggregatorPropertyDescriptor(object);
      addColumnPropertyDescriptor(object);
      addFormatStringPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Aggregator feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAggregatorPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeasureType_aggregator_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeasureType_aggregator_feature", "_UI_MeasureType_type"),
         MondrianPackage.eINSTANCE.getMeasureType_Aggregator(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Column feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addColumnPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeasureType_column_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeasureType_column_feature", "_UI_MeasureType_type"),
         MondrianPackage.eINSTANCE.getMeasureType_Column(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Format String feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFormatStringPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeasureType_formatString_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeasureType_formatString_feature", "_UI_MeasureType_type"),
         MondrianPackage.eINSTANCE.getMeasureType_FormatString(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_MeasureType_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_MeasureType_name_feature", "_UI_MeasureType_type"),
         MondrianPackage.eINSTANCE.getMeasureType_Name(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This returns MeasureType.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object) {
    return getResourceLocator().getImage("full/obj16/MeasureType");
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object) {
    Object labelValue = ((MeasureType)object).getName();
    String label = labelValue == null ? null : labelValue.toString();
    return label == null || label.length() == 0 ?
      getString("_UI_MeasureType_type") :
      getString("_UI_MeasureType_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(MeasureType.class)) {
      case MondrianPackage.MEASURE_TYPE__AGGREGATOR:
      case MondrianPackage.MEASURE_TYPE__COLUMN:
      case MondrianPackage.MEASURE_TYPE__FORMAT_STRING:
      case MondrianPackage.MEASURE_TYPE__NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s
   * describing all of the children that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResourceLocator getResourceLocator() {
    return MondrianEditPlugin.INSTANCE;
  }

}
