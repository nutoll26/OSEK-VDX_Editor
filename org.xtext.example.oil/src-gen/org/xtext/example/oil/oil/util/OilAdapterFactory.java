/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.oil.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.oil.oil.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.oil.oil.OilPackage
 * @generated
 */
public class OilAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OilPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OilAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OilPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OilSwitch<Adapter> modelSwitch =
    new OilSwitch<Adapter>()
    {
      @Override
      public Adapter caseOILFile(OILFile object)
      {
        return createOILFileAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseOILVersion(OILVersion object)
      {
        return createOILVersionAdapter();
      }
      @Override
      public Adapter caseImplementationDefinition(ImplementationDefinition object)
      {
        return createImplementationDefinitionAdapter();
      }
      @Override
      public Adapter caseImplementationSpec(ImplementationSpec object)
      {
        return createImplementationSpecAdapter();
      }
      @Override
      public Adapter caseOsRule(OsRule object)
      {
        return createOsRuleAdapter();
      }
      @Override
      public Adapter caseTaskRule(TaskRule object)
      {
        return createTaskRuleAdapter();
      }
      @Override
      public Adapter caseCounterRule(CounterRule object)
      {
        return createCounterRuleAdapter();
      }
      @Override
      public Adapter caseApplicationRule(ApplicationRule object)
      {
        return createApplicationRuleAdapter();
      }
      @Override
      public Adapter caseAppSubContainer(AppSubContainer object)
      {
        return createAppSubContainerAdapter();
      }
      @Override
      public Adapter caseHasRestartTaskRule(HasRestartTaskRule object)
      {
        return createHasRestartTaskRuleAdapter();
      }
      @Override
      public Adapter caseRestartTaskRule(RestartTaskRule object)
      {
        return createRestartTaskRuleAdapter();
      }
      @Override
      public Adapter caseTrustedRule(TrustedRule object)
      {
        return createTrustedRuleAdapter();
      }
      @Override
      public Adapter caseApplicationParam(ApplicationParam object)
      {
        return createApplicationParamAdapter();
      }
      @Override
      public Adapter caseIsrRule(IsrRule object)
      {
        return createIsrRuleAdapter();
      }
      @Override
      public Adapter caseIsrSubContainer(IsrSubContainer object)
      {
        return createIsrSubContainerAdapter();
      }
      @Override
      public Adapter caseTimingProtectionRule(TimingProtectionRule object)
      {
        return createTimingProtectionRuleAdapter();
      }
      @Override
      public Adapter caseTimingProtectionParam(TimingProtectionParam object)
      {
        return createTimingProtectionParamAdapter();
      }
      @Override
      public Adapter caseIsrParam(IsrParam object)
      {
        return createIsrParamAdapter();
      }
      @Override
      public Adapter caseMemoryProtectionRule(MemoryProtectionRule object)
      {
        return createMemoryProtectionRuleAdapter();
      }
      @Override
      public Adapter caseImplementationDef(ImplementationDef object)
      {
        return createImplementationDefAdapter();
      }
      @Override
      public Adapter caseImplAttrDef(ImplAttrDef object)
      {
        return createImplAttrDefAdapter();
      }
      @Override
      public Adapter caseImplAttrIntDef(ImplAttrIntDef object)
      {
        return createImplAttrIntDefAdapter();
      }
      @Override
      public Adapter caseImplAttrFloatDef(ImplAttrFloatDef object)
      {
        return createImplAttrFloatDefAdapter();
      }
      @Override
      public Adapter caseImplAttrEnumDef(ImplAttrEnumDef object)
      {
        return createImplAttrEnumDefAdapter();
      }
      @Override
      public Adapter caseImplAttrStringDef(ImplAttrStringDef object)
      {
        return createImplAttrStringDefAdapter();
      }
      @Override
      public Adapter caseImplAttrBooleanDef(ImplAttrBooleanDef object)
      {
        return createImplAttrBooleanDefAdapter();
      }
      @Override
      public Adapter caseImplAttrIdentiFier(ImplAttrIdentiFier object)
      {
        return createImplAttrIdentiFierAdapter();
      }
      @Override
      public Adapter caseRange(Range object)
      {
        return createRangeAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseEnumerator(Enumerator object)
      {
        return createEnumeratorAdapter();
      }
      @Override
      public Adapter caseImplRefDef(ImplRefDef object)
      {
        return createImplRefDefAdapter();
      }
      @Override
      public Adapter caseApplicationDefinition(ApplicationDefinition object)
      {
        return createApplicationDefinitionAdapter();
      }
      @Override
      public Adapter caseObjectDefinition(ObjectDefinition object)
      {
        return createObjectDefinitionAdapter();
      }
      @Override
      public Adapter caseLibrayattribute(Librayattribute object)
      {
        return createLibrayattributeAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeName(AttributeName object)
      {
        return createAttributeNameAdapter();
      }
      @Override
      public Adapter caseAttributeValue(AttributeValue object)
      {
        return createAttributeValueAdapter();
      }
      @Override
      public Adapter caseNameAttributeValue(NameAttributeValue object)
      {
        return createNameAttributeValueAdapter();
      }
      @Override
      public Adapter caseBooleanAttributeValue(BooleanAttributeValue object)
      {
        return createBooleanAttributeValueAdapter();
      }
      @Override
      public Adapter caseNumberAttributeValue(NumberAttributeValue object)
      {
        return createNumberAttributeValueAdapter();
      }
      @Override
      public Adapter caseFloatAttributeValue(FloatAttributeValue object)
      {
        return createFloatAttributeValueAdapter();
      }
      @Override
      public Adapter caseStringAttributeValue(StringAttributeValue object)
      {
        return createStringAttributeValueAdapter();
      }
      @Override
      public Adapter caseAutoAttributeValue(AutoAttributeValue object)
      {
        return createAutoAttributeValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.OILFile <em>OIL File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.OILFile
   * @generated
   */
  public Adapter createOILFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.OILVersion <em>OIL Version</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.OILVersion
   * @generated
   */
  public Adapter createOILVersionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplementationDefinition <em>Implementation Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplementationDefinition
   * @generated
   */
  public Adapter createImplementationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplementationSpec <em>Implementation Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplementationSpec
   * @generated
   */
  public Adapter createImplementationSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.OsRule <em>Os Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.OsRule
   * @generated
   */
  public Adapter createOsRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.TaskRule <em>Task Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.TaskRule
   * @generated
   */
  public Adapter createTaskRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.CounterRule <em>Counter Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.CounterRule
   * @generated
   */
  public Adapter createCounterRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ApplicationRule <em>Application Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ApplicationRule
   * @generated
   */
  public Adapter createApplicationRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.AppSubContainer <em>App Sub Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.AppSubContainer
   * @generated
   */
  public Adapter createAppSubContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.HasRestartTaskRule <em>Has Restart Task Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.HasRestartTaskRule
   * @generated
   */
  public Adapter createHasRestartTaskRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.RestartTaskRule <em>Restart Task Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.RestartTaskRule
   * @generated
   */
  public Adapter createRestartTaskRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.TrustedRule <em>Trusted Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.TrustedRule
   * @generated
   */
  public Adapter createTrustedRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ApplicationParam <em>Application Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ApplicationParam
   * @generated
   */
  public Adapter createApplicationParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.IsrRule <em>Isr Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.IsrRule
   * @generated
   */
  public Adapter createIsrRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.IsrSubContainer <em>Isr Sub Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.IsrSubContainer
   * @generated
   */
  public Adapter createIsrSubContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.TimingProtectionRule <em>Timing Protection Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.TimingProtectionRule
   * @generated
   */
  public Adapter createTimingProtectionRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.TimingProtectionParam <em>Timing Protection Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.TimingProtectionParam
   * @generated
   */
  public Adapter createTimingProtectionParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.IsrParam <em>Isr Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.IsrParam
   * @generated
   */
  public Adapter createIsrParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.MemoryProtectionRule <em>Memory Protection Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.MemoryProtectionRule
   * @generated
   */
  public Adapter createMemoryProtectionRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplementationDef <em>Implementation Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplementationDef
   * @generated
   */
  public Adapter createImplementationDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplAttrDef <em>Impl Attr Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplAttrDef
   * @generated
   */
  public Adapter createImplAttrDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplAttrIntDef <em>Impl Attr Int Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplAttrIntDef
   * @generated
   */
  public Adapter createImplAttrIntDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplAttrFloatDef <em>Impl Attr Float Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplAttrFloatDef
   * @generated
   */
  public Adapter createImplAttrFloatDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplAttrEnumDef <em>Impl Attr Enum Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplAttrEnumDef
   * @generated
   */
  public Adapter createImplAttrEnumDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplAttrStringDef <em>Impl Attr String Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplAttrStringDef
   * @generated
   */
  public Adapter createImplAttrStringDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplAttrBooleanDef <em>Impl Attr Boolean Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplAttrBooleanDef
   * @generated
   */
  public Adapter createImplAttrBooleanDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplAttrIdentiFier <em>Impl Attr Identi Fier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplAttrIdentiFier
   * @generated
   */
  public Adapter createImplAttrIdentiFierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.Range <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.Range
   * @generated
   */
  public Adapter createRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.Enumerator <em>Enumerator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.Enumerator
   * @generated
   */
  public Adapter createEnumeratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ImplRefDef <em>Impl Ref Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ImplRefDef
   * @generated
   */
  public Adapter createImplRefDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ApplicationDefinition <em>Application Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ApplicationDefinition
   * @generated
   */
  public Adapter createApplicationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.ObjectDefinition <em>Object Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.ObjectDefinition
   * @generated
   */
  public Adapter createObjectDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.Librayattribute <em>Librayattribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.Librayattribute
   * @generated
   */
  public Adapter createLibrayattributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.AttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.AttributeName
   * @generated
   */
  public Adapter createAttributeNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.AttributeValue
   * @generated
   */
  public Adapter createAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.NameAttributeValue <em>Name Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.NameAttributeValue
   * @generated
   */
  public Adapter createNameAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.BooleanAttributeValue <em>Boolean Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.BooleanAttributeValue
   * @generated
   */
  public Adapter createBooleanAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.NumberAttributeValue <em>Number Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.NumberAttributeValue
   * @generated
   */
  public Adapter createNumberAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.FloatAttributeValue <em>Float Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.FloatAttributeValue
   * @generated
   */
  public Adapter createFloatAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.StringAttributeValue <em>String Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.StringAttributeValue
   * @generated
   */
  public Adapter createStringAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.oil.oil.AutoAttributeValue <em>Auto Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.oil.oil.AutoAttributeValue
   * @generated
   */
  public Adapter createAutoAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OilAdapterFactory
