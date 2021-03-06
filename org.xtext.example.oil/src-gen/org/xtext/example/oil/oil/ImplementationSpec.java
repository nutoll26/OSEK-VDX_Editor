/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.oil.oil.ImplementationSpec#getOsRule <em>Os Rule</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplementationSpec#getCounterRule <em>Counter Rule</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplementationSpec#getIsrRule <em>Isr Rule</em>}</li>
 *   <li>{@link org.xtext.example.oil.oil.ImplementationSpec#getTaskRule <em>Task Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.oil.oil.OilPackage#getImplementationSpec()
 * @model
 * @generated
 */
public interface ImplementationSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Os Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.oil.oil.ImpOsRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Os Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Os Rule</em>' containment reference list.
   * @see org.xtext.example.oil.oil.OilPackage#getImplementationSpec_OsRule()
   * @model containment="true"
   * @generated
   */
  EList<ImpOsRule> getOsRule();

  /**
   * Returns the value of the '<em><b>Counter Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.oil.oil.ImpCounterRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Counter Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Counter Rule</em>' containment reference list.
   * @see org.xtext.example.oil.oil.OilPackage#getImplementationSpec_CounterRule()
   * @model containment="true"
   * @generated
   */
  EList<ImpCounterRule> getCounterRule();

  /**
   * Returns the value of the '<em><b>Isr Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.oil.oil.IsrRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Isr Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Isr Rule</em>' containment reference list.
   * @see org.xtext.example.oil.oil.OilPackage#getImplementationSpec_IsrRule()
   * @model containment="true"
   * @generated
   */
  EList<IsrRule> getIsrRule();

  /**
   * Returns the value of the '<em><b>Task Rule</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.oil.oil.ImpTaskRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Rule</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Rule</em>' containment reference list.
   * @see org.xtext.example.oil.oil.OilPackage#getImplementationSpec_TaskRule()
   * @model containment="true"
   * @generated
   */
  EList<ImpTaskRule> getTaskRule();

} // ImplementationSpec
