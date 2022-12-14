/**
 * <copyright>
 * </copyright>
 *
 * $Id: DocumentRootItemProvider.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian.provider;


import java.util.Collection;
import java.util.List;

import net.sourceforge.mondrian.schema.Mondrian.DocumentRoot;
import net.sourceforge.mondrian.schema.Mondrian.MondrianFactory;
import net.sourceforge.mondrian.schema.Mondrian.MondrianPackage;

import net.sourceforge.mondrian.schema.provider.MondrianEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adpater for a {@link net.sourceforge.mondrian.schema.Mondrian.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
  public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

    }
    return itemPropertyDescriptors;
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
      childrenFeatures.add(MondrianPackage.eINSTANCE.getDocumentRoot_Mixed());
    }
    return childrenFeatures;
  }

  /**
   * This returns DocumentRoot.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getImage(Object object) {
    return getResourceLocator().getImage("full/obj16/DocumentRoot");
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText(Object object) {
    return getString("_UI_DocumentRoot_type");
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

    switch (notification.getFeatureID(DocumentRoot.class)) {
      case MondrianPackage.DOCUMENT_ROOT__MIXED:
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
        (MondrianPackage.eINSTANCE.getDocumentRoot_Column(),
         MondrianFactory.eINSTANCE.createColumnType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Cube(),
         MondrianFactory.eINSTANCE.createCubeType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_CubeGrant(),
         MondrianFactory.eINSTANCE.createCubeGrantType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Dimension(),
         MondrianFactory.eINSTANCE.createDimensionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_DimensionGrant(),
         MondrianFactory.eINSTANCE.createDimensionGrantType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_DimensionUsage(),
         MondrianFactory.eINSTANCE.createDimensionUsageType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Hierarchy(),
         MondrianFactory.eINSTANCE.createHierarchyType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_HierarchyGrant(),
         MondrianFactory.eINSTANCE.createHierarchyGrantType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Join(),
         MondrianFactory.eINSTANCE.createJoinType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_KeyExpression(),
         MondrianFactory.eINSTANCE.createKeyExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Level(),
         MondrianFactory.eINSTANCE.createLevelType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Measure(),
         MondrianFactory.eINSTANCE.createMeasureType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_MemberGrant(),
         MondrianFactory.eINSTANCE.createMemberGrantType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_NameExpression(),
         MondrianFactory.eINSTANCE.createNameExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_OrdinalExpression(),
         MondrianFactory.eINSTANCE.createOrdinalExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Parameter(),
         MondrianFactory.eINSTANCE.createParameterType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_ParentExpression(),
         MondrianFactory.eINSTANCE.createParentExpressionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Property(),
         MondrianFactory.eINSTANCE.createPropertyType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Role(),
         MondrianFactory.eINSTANCE.createRoleType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Schema(),
         MondrianFactory.eINSTANCE.createSchemaType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_SchemaGrant(),
         MondrianFactory.eINSTANCE.createSchemaGrantType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Sql(),
         MondrianFactory.eINSTANCE.createSQLType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_Table(),
         MondrianFactory.eINSTANCE.createTableType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_View(),
         MondrianFactory.eINSTANCE.createViewType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCube(),
         MondrianFactory.eINSTANCE.createVirtualCubeType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeDimension(),
         MondrianFactory.eINSTANCE.createVirtualCubeDimensionType()));

    newChildDescriptors.add
      (createChildParameter
        (MondrianPackage.eINSTANCE.getDocumentRoot_VirtualCubeMeasure(),
         MondrianFactory.eINSTANCE.createVirtualCubeMeasureType()));
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
