/**
 * generated by Xtext 2.10.0
 */
package org.xtext.ufcg.compiladores.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constant definition part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ufcg.compiladores.pascal.constant_definition_part#getConsts <em>Consts</em>}</li>
 * </ul>
 *
 * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getconstant_definition_part()
 * @model
 * @generated
 */
public interface constant_definition_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Consts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ufcg.compiladores.pascal.constant_definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Consts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consts</em>' containment reference list.
   * @see org.xtext.ufcg.compiladores.pascal.PascalPackage#getconstant_definition_part_Consts()
   * @model containment="true"
   * @generated
   */
  EList<constant_definition> getConsts();

} // constant_definition_part
