/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrdinalExpressionType.java,v 1.2 2004/06/30 13:45:51 avix Exp $
 */
package net.sourceforge.mondrian.schema.Mondrian;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sourceforge.mondrian.schema.Mondrian.OrdinalExpressionType#getSQL <em>SQL</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getOrdinalExpressionType()
 * @model 
 * @generated
 */
public interface OrdinalExpressionType extends EObject {
  /**
   * Returns the value of the '<em><b>SQL</b></em>' containment reference list.
   * The list contents are of type {@link net.sourceforge.mondrian.schema.Mondrian.SQLType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SQL</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SQL</em>' containment reference list.
   * @see net.sourceforge.mondrian.schema.Mondrian.MondrianPackage#getOrdinalExpressionType_SQL()
   * @model type="net.sourceforge.mondrian.schema.Mondrian.SQLType" containment="true" resolveProxies="false" required="true"
   * @generated
   */
  EList getSQL();

} // OrdinalExpressionType
