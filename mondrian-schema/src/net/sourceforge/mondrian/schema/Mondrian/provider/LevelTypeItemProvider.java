/**
 * <copyright>
 * </copyright>
 *
 * $Id: LevelTypeItemProvider.java,v 1.2 2004/06/30 13:45:50 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.provider;


import java.util.Collection;
import java.util.List;

import net.sourceforge.mondrian.schema.Mondrian.LevelType;
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
 * This is the item provider adpater for a {@link net.sourceforge.mondrian.schema.Mondrian.LevelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LevelTypeItemProvider
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
  public LevelTypeItemProvider(AdapterFactory adapterFactory) {
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

      addColumnPropertyDescriptor(object);
      addHideMemberIfPropertyDescriptor(object);
      addLevelTypePropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addNameColumnPropertyDescriptor(object);
      addNullParentValuePropertyDescriptor(object);
      addOrdinalColumnPropertyDescriptor(object);
      addParentColumnPropertyDescriptor(object);
      addTablePropertyDescriptor(object);
      addTypePropertyDescriptor(object);
      addUniqueMembersPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
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
         getString("_UI_LevelType_column_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_column_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_Column(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Hide Member If feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHideMemberIfPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_hideMemberIf_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_hideMemberIf_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_HideMemberIf(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Level Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLevelTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_levelType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_levelType_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_LevelType(),
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
         getString("_UI_LevelType_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_name_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_Name(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Name Column feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNameColumnPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_nameColumn_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_nameColumn_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_NameColumn(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Null Parent Value feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNullParentValuePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_nullParentValue_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_nullParentValue_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_NullParentValue(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Ordinal Column feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOrdinalColumnPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_ordinalColumn_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_ordinalColumn_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_OrdinalColumn(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Parent Column feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addParentColumnPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_parentColumn_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_parentColumn_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_ParentColumn(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Table feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTablePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_table_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_table_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_Table(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTypePropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_type_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_type_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_Type(),
         true,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE));
  }

  /**
   * This adds a property descriptor for the Unique Members feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUniqueMembersPropertyDescriptor(Object object) {
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_LevelType_uniqueMembers_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_LevelType_uniqueMembers_feature", "_UI_LevelType_type"),
         MondrianPackage.eINSTANCE.getLevelType_UniqueMembers(),
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
      childrenFeatures.add(MondrianPackage.eINSTANCE.getLevelType_KeyExpression());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getLevelType_NameExpression());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getLevelType_OrdinalExpression());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getLevelType_ParentExpression());
      childrenFeatures.add(MondrianPackage.eINSTANCE.getLevelType_Property());
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
   * This returns LevelType.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object) {
    return getResourceLocator().getImage("full/obj16/LevelType");
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object) {
    Object labelValue = ((LevelType)object).getName();
    String label = labelValue == null ? null : labelValue.toString();
    return label == null || label.length() == 0 ?
      getString("_UI_LevelType_type") :
      getString("_UI_LevelType_type") + " " + label;
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

    switch (notification.getFeatureID(LevelType.class)) {
      case MondrianPackage.LEVEL_TYPE__COLUMN:
      case MondrianPackage.LEVEL_TYPE__HIDE_MEMBER_IF:
      case MondrianPackage.LEVEL_TYPE__LEVEL_TYPE:
      case MondrianPackage.LEVEL_TYPE__NAME:
      case MondrianPackage.LEVEL_TYPE__NAME_COLUMN:
      case MondrianPackage.LEVEL_TYPE__NULL_PARENT_VALUE:
      case MondrianPackage.LEVEL_TYPE__ORDINAL_COLUMN:
      case MondrianPackage.LEVEL_TYPE__PARENT_COLUMN:
      case MondrianPackage.LEVEL_TYPE__TABLE:
      case MondrianPackage.LEVEL_TYPE__TYPE:
      case MondrianPackage.LEVEL_TYPE__UNIQUE_MEMBERS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case MondrianPackage.LEVEL_TYPE__KEY_EXPRESSION:
      case MondrianPackage.LEVEL_TYPE__NAME_EXPRESSION:
      case MondrianPackage.LEVEL_TYPE__ORDINAL_EXPRESSION:
      case MondrianPackage.LEVEL_TYPE__PARENT_EXPRESSION:
      case MondrianPackage.LEVEL_TYPE__PROPERTY:
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
        (MondrianPackage.eINSTANCE.getLevelType_KeyExpression(),
         MondrianFactory.eINSTANCE.createKeyExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getLevelType_NameExpression(),
         MondrianFactory.eINSTANCE.createNameExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getLevelType_OrdinalExpression(),
         MondrianFactory.eINSTANCE.createOrdinalExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getLevelType_ParentExpression(),
         MondrianFactory.eINSTANCE.createParentExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getLevelType_Property(),
         MondrianFactory.eINSTANCE.createPropertyType()));
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
