/**
 * <copyright>
 * </copyright>
 *
 * $Id: DimensionGrantType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Grant Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getAccess <em>Access</em>}</li>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDimensionGrantType()
 * @model 
 * @generated
 */
public interface DimensionGrantType extends EObject {
  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The default value is <code>"all"</code>.
   * The literals are from the enumeration {@link net.sourceforge.mondrian.schema.Mondrian.AccessType4}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType4
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType4)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDimensionGrantType_Access()
   * @model default="all" unique="false" unsettable="true" required="true"
   * @generated
   */
  AccessType4 getAccess();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see net.sourceforge.mondrian.schema.Mondrian.AccessType4
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType4 value);

  /**
   * Unsets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType4)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType4)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Dimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' attribute.
   * @see #setDimension(Object)
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getDimensionGrantType_Dimension()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" required="true"
   * @generated
   */
  Object getDimension();

  /**
   * Sets the value of the '{@link net.sourceforge.mondrian.schema.Mondrian.DimensionGrantType#getDimension <em>Dimension</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimension</em>' attribute.
   * @see #getDimension()
   * @generated
   */
  void setDimension(Object value);

} // DimensionGrantType
