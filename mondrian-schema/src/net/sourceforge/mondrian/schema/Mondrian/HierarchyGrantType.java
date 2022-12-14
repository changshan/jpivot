/**
 * <copyright>
 * </copyright>
 *
 * $Id: HierarchyGrantType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy Grant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getMemberGrant <em>Member Grant</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getAccess <em>Access</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getBottomLevel <em>Bottom Level</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getTopLevel <em>Top Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyGrantType()
 * @model 
 * @generated
 */
public interface HierarchyGrantType extends EObject {
  /**
   * Returns the value of the '<em><b>Member Grant</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.MemberGrantType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Grant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Grant</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyGrantType_MemberGrant()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.MemberGrantType" containment="true" resolveProxies="false"
   * @generated
   */
  EList getMemberGrant();

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The default value is <code>"all"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.AccessType3}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType3
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType3)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyGrantType_Access()
   * @model default="all" unique="false" unsettable="true" required="true"
   * @generated
   */
  AccessType3 getAccess();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType3
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType3 value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType3)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType3)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Bottom Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bottom Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bottom Level</em>' attribute.
   * @see #setBottomLevel(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyGrantType_BottomLevel()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getBottomLevel();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getBottomLevel <em>Bottom Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bottom Level</em>' attribute.
   * @see #getBottomLevel()
   * @generated
   */
  void setBottomLevel(Object value);

  /**
   * Returns the value of the '<em><b>Hierarchy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy</em>' attribute.
   * @see #setHierarchy(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyGrantType_Hierarchy()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getHierarchy();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getHierarchy <em>Hierarchy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hierarchy</em>' attribute.
   * @see #getHierarchy()
   * @generated
   */
  void setHierarchy(Object value);

  /**
   * Returns the value of the '<em><b>Top Level</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top Level</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top Level</em>' attribute.
   * @see #setTopLevel(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getHierarchyGrantType_TopLevel()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
   * @generated
   */
  Object getTopLevel();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.HierarchyGrantType#getTopLevel <em>Top Level</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top Level</em>' attribute.
   * @see #getTopLevel()
   * @generated
   */
  void setTopLevel(Object value);

} // HierarchyGrantType
