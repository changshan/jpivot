/**
 * <copyright>
 * </copyright>
 *
 * $Id: HierarchyTypeItemProvider.java,v 1.2 2004/06/30 13:45:50 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.provider;


import java.util.Collection;
import java.util.List;

import net.sourceforge.mondrian.schema.Mondrian.HierarchyType;
import net.sourceforge.mondrian.schema.Mondrian.MondrianFactory;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

import net.sourceforge.mondrian.schema.provider.MondrianEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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
 * This is the item provider adpater for a {@link net.sourceforge.mondrian.schema.Mondrian.HierarchyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HierarchyTypeItemProvider
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
  public HierarchyTypeItemProvider(AdapterFactory adapterFactory) {
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

      addAllMemberNamePropertyDescriptor(object);
      addDefaultMemberPropertyDescriptor(object);
      addHasAllPropertyDescriptor(object);
      addMemberReaderClassPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addPrimaryKeyPropertyDescriptor(object);
      addPrimaryKeyTablePropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the All Member Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAllMemberNamePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HierarchyType_allMemberName_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HierarchyType_allMemberName_feature", "_UI_HierarchyType_type"),
         MondrianPackage.eINSTANCE.getHierarchyType_AllMemberName(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Default Member feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDefaultMemberPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HierarchyType_defaultMember_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HierarchyType_defaultMember_feature", "_UI_HierarchyType_type"),
         MondrianPackage.eINSTANCE.getHierarchyType_DefaultMember(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Has All feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHasAllPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HierarchyType_hasAll_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HierarchyType_hasAll_feature", "_UI_HierarchyType_type"),
         MondrianPackage.eINSTANCE.getHierarchyType_HasAll(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Member Reader Class feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addMemberReaderClassPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HierarchyType_memberReaderClass_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HierarchyType_memberReaderClass_feature", "_UI_HierarchyType_type"),
         MondrianPackage.eINSTANCE.getHierarchyType_MemberReaderClass(),
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
         getString("_UI_HierarchyType_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HierarchyType_name_feature", "_UI_HierarchyType_type"),
         MondrianPackage.eINSTANCE.getHierarchyType_Name(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Primary Key feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPrimaryKeyPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HierarchyType_primaryKey_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HierarchyType_primaryKey_feature", "_UI_HierarchyType_type"),
         MondrianPackage.eINSTANCE.getHierarchyType_PrimaryKey(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Primary Key Table feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPrimaryKeyTablePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_HierarchyType_primaryKeyTable_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_HierarchyType_primaryKeyTable_feature", "_UI_HierarchyType_type"),
         MondrianPackage.eINSTANCE.getHierarchyType_PrimaryKeyTable(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(MondrianPackage.eINSTANCE.getHierarchyType_View());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getHierarchyType_Join());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getHierarchyType_Table());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getHierarchyType_Level());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getHierarchyType_Parameter());
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns HierarchyType.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object) {
    return getResourceLocator().getImage("full/obj16/HierarchyType");
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object) {
    Object labelValue = ((HierarchyType)object).getName();
    String label = labelValue == null ? null : labelValue.toString();
    return label == null || label.length() == 0 ?
      getString("_UI_HierarchyType_type") :
      getString("_UI_HierarchyType_type") + " " + label;
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

    switch (notification.getFeatureID(HierarchyType.class)) {
      case MondrianPackage.HIERARCHY_TYPE__ALL_MEMBER_NAME:
      case MondrianPackage.HIERARCHY_TYPE__DEFAULT_MEMBER:
      case MondrianPackage.HIERARCHY_TYPE__HAS_ALL:
      case MondrianPackage.HIERARCHY_TYPE__MEMBER_READER_CLASS:
      case MondrianPackage.HIERARCHY_TYPE__NAME:
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY:
      case MondrianPackage.HIERARCHY_TYPE__PRIMARY_KEY_TABLE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case MondrianPackage.HIERARCHY_TYPE__VIEW:
      case MondrianPackage.HIERARCHY_TYPE__JOIN:
      case MondrianPackage.HIERARCHY_TYPE__TABLE:
      case MondrianPackage.HIERARCHY_TYPE__LEVEL:
      case MondrianPackage.HIERARCHY_TYPE__PARAMETER:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getHierarchyType_View(),
         MondrianFactory.eINSTANCE.createViewType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getHierarchyType_Join(),
         MondrianFactory.eINSTANCE.createJoinType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getHierarchyType_Table(),
         MondrianFactory.eINSTANCE.createTableType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getHierarchyType_Level(),
         MondrianFactory.eINSTANCE.createLevelType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getHierarchyType_Parameter(),
         MondrianFactory.eINSTANCE.createParameterType()));
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
