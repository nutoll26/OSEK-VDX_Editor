/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.oil.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.oil.ide.contentassist.antlr.internal.InternalOilParser;
import org.xtext.example.oil.services.OilGrammarAccess;

public class OilParser extends AbstractContentAssistParser {

	@Inject
	private OilGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalOilParser createParser() {
		InternalOilParser result = new InternalOilParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getIncludeAccess().getAlternatives_1(), "rule__Include__Alternatives_1");
					put(grammarAccess.getImplementationDefAccess().getAlternatives(), "rule__ImplementationDef__Alternatives");
					put(grammarAccess.getImplAttrDefAccess().getAlternatives(), "rule__ImplAttrDef__Alternatives");
					put(grammarAccess.getImplAttrIntDefAccess().getAlternatives_5_1(), "rule__ImplAttrIntDef__Alternatives_5_1");
					put(grammarAccess.getImplAttrFloatDefAccess().getAlternatives_5_1(), "rule__ImplAttrFloatDef__Alternatives_5_1");
					put(grammarAccess.getImplAttrEnumDefAccess().getAlternatives_5_1(), "rule__ImplAttrEnumDef__Alternatives_5_1");
					put(grammarAccess.getImplAttrStringDefAccess().getAlternatives_4_1(), "rule__ImplAttrStringDef__Alternatives_4_1");
					put(grammarAccess.getImplAttrBooleanDefAccess().getNameAlternatives_3_0(), "rule__ImplAttrBooleanDef__NameAlternatives_3_0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getAlternatives_5_1(), "rule__ImplAttrBooleanDef__Alternatives_5_1");
					put(grammarAccess.getRangeAccess().getAlternatives_1(), "rule__Range__Alternatives_1");
					put(grammarAccess.getAttributeNameAccess().getValueAlternatives_0(), "rule__AttributeName__ValueAlternatives_0");
					put(grammarAccess.getAttributeValueAccess().getAlternatives(), "rule__AttributeValue__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getIntTypeEnumAccess().getAlternatives(), "rule__IntTypeEnum__Alternatives");
					put(grammarAccess.getDefaultEnumAccess().getAlternatives(), "rule__DefaultEnum__Alternatives");
					put(grammarAccess.getObjectRefTypeEnumAccess().getAlternatives(), "rule__ObjectRefTypeEnum__Alternatives");
					put(grammarAccess.getOILFileAccess().getGroup(), "rule__OILFile__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup_1_0(), "rule__Include__Group_1_0__0");
					put(grammarAccess.getOILVersionAccess().getGroup(), "rule__OILVersion__Group__0");
					put(grammarAccess.getOILVersionAccess().getGroup_3(), "rule__OILVersion__Group_3__0");
					put(grammarAccess.getImplementationDefinitionAccess().getGroup(), "rule__ImplementationDefinition__Group__0");
					put(grammarAccess.getImplementationSpecAccess().getGroup(), "rule__ImplementationSpec__Group__0");
					put(grammarAccess.getImplementationSpecAccess().getGroup_4(), "rule__ImplementationSpec__Group_4__0");
					put(grammarAccess.getImplAttrIntDefAccess().getGroup(), "rule__ImplAttrIntDef__Group__0");
					put(grammarAccess.getImplAttrIntDefAccess().getGroup_5(), "rule__ImplAttrIntDef__Group_5__0");
					put(grammarAccess.getImplAttrIntDefAccess().getGroup_6(), "rule__ImplAttrIntDef__Group_6__0");
					put(grammarAccess.getImplAttrIdentiFierAccess().getGroup(), "rule__ImplAttrIdentiFier__Group__0");
					put(grammarAccess.getImplAttrFloatDefAccess().getGroup(), "rule__ImplAttrFloatDef__Group__0");
					put(grammarAccess.getImplAttrFloatDefAccess().getGroup_5(), "rule__ImplAttrFloatDef__Group_5__0");
					put(grammarAccess.getImplAttrFloatDefAccess().getGroup_6(), "rule__ImplAttrFloatDef__Group_6__0");
					put(grammarAccess.getImplAttrEnumDefAccess().getGroup(), "rule__ImplAttrEnumDef__Group__0");
					put(grammarAccess.getImplAttrEnumDefAccess().getGroup_5(), "rule__ImplAttrEnumDef__Group_5__0");
					put(grammarAccess.getImplAttrEnumDefAccess().getGroup_6(), "rule__ImplAttrEnumDef__Group_6__0");
					put(grammarAccess.getImplAttrStringDefAccess().getGroup(), "rule__ImplAttrStringDef__Group__0");
					put(grammarAccess.getImplAttrStringDefAccess().getGroup_4(), "rule__ImplAttrStringDef__Group_4__0");
					put(grammarAccess.getImplAttrStringDefAccess().getGroup_5(), "rule__ImplAttrStringDef__Group_5__0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getGroup(), "rule__ImplAttrBooleanDef__Group__0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getGroup_2(), "rule__ImplAttrBooleanDef__Group_2__0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getGroup_2_2(), "rule__ImplAttrBooleanDef__Group_2_2__0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getGroup_2_6(), "rule__ImplAttrBooleanDef__Group_2_6__0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getGroup_5(), "rule__ImplAttrBooleanDef__Group_5__0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getGroup_6(), "rule__ImplAttrBooleanDef__Group_6__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getRangeAccess().getGroup_1_1(), "rule__Range__Group_1_1__0");
					put(grammarAccess.getRangeAccess().getGroup_1_2(), "rule__Range__Group_1_2__0");
					put(grammarAccess.getRangeAccess().getGroup_1_2_1(), "rule__Range__Group_1_2_1__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_2(), "rule__Enumeration__Group_2__0");
					put(grammarAccess.getEnumeratorAccess().getGroup(), "rule__Enumerator__Group__0");
					put(grammarAccess.getEnumeratorAccess().getGroup_1(), "rule__Enumerator__Group_1__0");
					put(grammarAccess.getImplRefDefAccess().getGroup(), "rule__ImplRefDef__Group__0");
					put(grammarAccess.getMultipleSpecifierAccess().getGroup(), "rule__MultipleSpecifier__Group__0");
					put(grammarAccess.getApplicationDefinitionAccess().getGroup(), "rule__ApplicationDefinition__Group__0");
					put(grammarAccess.getObjectDefinitionAccess().getGroup(), "rule__ObjectDefinition__Group__0");
					put(grammarAccess.getObjectDefinitionAccess().getGroup_2(), "rule__ObjectDefinition__Group_2__0");
					put(grammarAccess.getReObjectDefinitionAccess().getGroup(), "rule__ReObjectDefinition__Group__0");
					put(grammarAccess.getReObjectDefinitionAccess().getGroup_2(), "rule__ReObjectDefinition__Group_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getNameAttributeValueAccess().getGroup(), "rule__NameAttributeValue__Group__0");
					put(grammarAccess.getNameAttributeValueAccess().getGroup_1(), "rule__NameAttributeValue__Group_1__0");
					put(grammarAccess.getBooleanAttributeValueAccess().getGroup(), "rule__BooleanAttributeValue__Group__0");
					put(grammarAccess.getBooleanAttributeValueAccess().getGroup_1(), "rule__BooleanAttributeValue__Group_1__0");
					put(grammarAccess.getOILFileAccess().getVersionAssignment_0(), "rule__OILFile__VersionAssignment_0");
					put(grammarAccess.getOILFileAccess().getIncludeAssignment_1(), "rule__OILFile__IncludeAssignment_1");
					put(grammarAccess.getOILFileAccess().getImplementationAssignment_2(), "rule__OILFile__ImplementationAssignment_2");
					put(grammarAccess.getOILFileAccess().getApplicationAssignment_3(), "rule__OILFile__ApplicationAssignment_3");
					put(grammarAccess.getIncludeAccess().getNameAssignment_1_0_1(), "rule__Include__NameAssignment_1_0_1");
					put(grammarAccess.getIncludeAccess().getNameAssignment_1_1(), "rule__Include__NameAssignment_1_1");
					put(grammarAccess.getOILVersionAccess().getValueAssignment_2(), "rule__OILVersion__ValueAssignment_2");
					put(grammarAccess.getOILVersionAccess().getDescriptionAssignment_3_1(), "rule__OILVersion__DescriptionAssignment_3_1");
					put(grammarAccess.getImplementationDefinitionAccess().getNameAssignment_1(), "rule__ImplementationDefinition__NameAssignment_1");
					put(grammarAccess.getImplementationDefinitionAccess().getImplementationSpecsAssignment_3(), "rule__ImplementationDefinition__ImplementationSpecsAssignment_3");
					put(grammarAccess.getImplementationDefinitionAccess().getDescriptionAssignment_5(), "rule__ImplementationDefinition__DescriptionAssignment_5");
					put(grammarAccess.getImplementationSpecAccess().getObjectAssignment_0(), "rule__ImplementationSpec__ObjectAssignment_0");
					put(grammarAccess.getImplementationSpecAccess().getImplementationsAssignment_2(), "rule__ImplementationSpec__ImplementationsAssignment_2");
					put(grammarAccess.getImplementationSpecAccess().getDescriptionAssignment_4_1(), "rule__ImplementationSpec__DescriptionAssignment_4_1");
					put(grammarAccess.getImplAttrIntDefAccess().getTypeAssignment_0(), "rule__ImplAttrIntDef__TypeAssignment_0");
					put(grammarAccess.getImplAttrIntDefAccess().getAutoAssignment_1(), "rule__ImplAttrIntDef__AutoAssignment_1");
					put(grammarAccess.getImplAttrIntDefAccess().getRangeAssignment_2(), "rule__ImplAttrIntDef__RangeAssignment_2");
					put(grammarAccess.getImplAttrIntDefAccess().getNameAssignment_3(), "rule__ImplAttrIntDef__NameAssignment_3");
					put(grammarAccess.getImplAttrIntDefAccess().getMultipleAssignment_4(), "rule__ImplAttrIntDef__MultipleAssignment_4");
					put(grammarAccess.getImplAttrIntDefAccess().getValueAssignment_5_1_0(), "rule__ImplAttrIntDef__ValueAssignment_5_1_0");
					put(grammarAccess.getImplAttrIntDefAccess().getDefaultAssignment_5_1_1(), "rule__ImplAttrIntDef__DefaultAssignment_5_1_1");
					put(grammarAccess.getImplAttrIntDefAccess().getDescriptionAssignment_6_1(), "rule__ImplAttrIntDef__DescriptionAssignment_6_1");
					put(grammarAccess.getImplAttrIdentiFierAccess().getAutoAssignment_1(), "rule__ImplAttrIdentiFier__AutoAssignment_1");
					put(grammarAccess.getImplAttrIdentiFierAccess().getNameAssignment_2(), "rule__ImplAttrIdentiFier__NameAssignment_2");
					put(grammarAccess.getImplAttrIdentiFierAccess().getValueAssignment_4(), "rule__ImplAttrIdentiFier__ValueAssignment_4");
					put(grammarAccess.getImplAttrFloatDefAccess().getAutoAssignment_1(), "rule__ImplAttrFloatDef__AutoAssignment_1");
					put(grammarAccess.getImplAttrFloatDefAccess().getRangeAssignment_2(), "rule__ImplAttrFloatDef__RangeAssignment_2");
					put(grammarAccess.getImplAttrFloatDefAccess().getNameAssignment_3(), "rule__ImplAttrFloatDef__NameAssignment_3");
					put(grammarAccess.getImplAttrFloatDefAccess().getMultipleAssignment_4(), "rule__ImplAttrFloatDef__MultipleAssignment_4");
					put(grammarAccess.getImplAttrFloatDefAccess().getValueAssignment_5_1_0(), "rule__ImplAttrFloatDef__ValueAssignment_5_1_0");
					put(grammarAccess.getImplAttrFloatDefAccess().getDefaultAssignment_5_1_1(), "rule__ImplAttrFloatDef__DefaultAssignment_5_1_1");
					put(grammarAccess.getImplAttrFloatDefAccess().getDescriptionAssignment_6_1(), "rule__ImplAttrFloatDef__DescriptionAssignment_6_1");
					put(grammarAccess.getImplAttrEnumDefAccess().getAutoAssignment_1(), "rule__ImplAttrEnumDef__AutoAssignment_1");
					put(grammarAccess.getImplAttrEnumDefAccess().getEnumerationAssignment_2(), "rule__ImplAttrEnumDef__EnumerationAssignment_2");
					put(grammarAccess.getImplAttrEnumDefAccess().getNameAssignment_3(), "rule__ImplAttrEnumDef__NameAssignment_3");
					put(grammarAccess.getImplAttrEnumDefAccess().getMultipleAssignment_4(), "rule__ImplAttrEnumDef__MultipleAssignment_4");
					put(grammarAccess.getImplAttrEnumDefAccess().getValueAssignment_5_1_0(), "rule__ImplAttrEnumDef__ValueAssignment_5_1_0");
					put(grammarAccess.getImplAttrEnumDefAccess().getDefaultAssignment_5_1_1(), "rule__ImplAttrEnumDef__DefaultAssignment_5_1_1");
					put(grammarAccess.getImplAttrEnumDefAccess().getDescriptionAssignment_6_1(), "rule__ImplAttrEnumDef__DescriptionAssignment_6_1");
					put(grammarAccess.getImplAttrStringDefAccess().getAutoAssignment_1(), "rule__ImplAttrStringDef__AutoAssignment_1");
					put(grammarAccess.getImplAttrStringDefAccess().getNameAssignment_2(), "rule__ImplAttrStringDef__NameAssignment_2");
					put(grammarAccess.getImplAttrStringDefAccess().getMultipleAssignment_3(), "rule__ImplAttrStringDef__MultipleAssignment_3");
					put(grammarAccess.getImplAttrStringDefAccess().getValueAssignment_4_1_0(), "rule__ImplAttrStringDef__ValueAssignment_4_1_0");
					put(grammarAccess.getImplAttrStringDefAccess().getDefaultAssignment_4_1_1(), "rule__ImplAttrStringDef__DefaultAssignment_4_1_1");
					put(grammarAccess.getImplAttrStringDefAccess().getDescriptionAssignment_5_1(), "rule__ImplAttrStringDef__DescriptionAssignment_5_1");
					put(grammarAccess.getImplAttrBooleanDefAccess().getAutoAssignment_1(), "rule__ImplAttrBooleanDef__AutoAssignment_1");
					put(grammarAccess.getImplAttrBooleanDefAccess().getTrueParameterListAssignment_2_2_1(), "rule__ImplAttrBooleanDef__TrueParameterListAssignment_2_2_1");
					put(grammarAccess.getImplAttrBooleanDefAccess().getTrueDescriptionAssignment_2_3(), "rule__ImplAttrBooleanDef__TrueDescriptionAssignment_2_3");
					put(grammarAccess.getImplAttrBooleanDefAccess().getFalseParameterListAssignment_2_6_1(), "rule__ImplAttrBooleanDef__FalseParameterListAssignment_2_6_1");
					put(grammarAccess.getImplAttrBooleanDefAccess().getFalseDescriptionAssignment_2_7(), "rule__ImplAttrBooleanDef__FalseDescriptionAssignment_2_7");
					put(grammarAccess.getImplAttrBooleanDefAccess().getNameAssignment_3(), "rule__ImplAttrBooleanDef__NameAssignment_3");
					put(grammarAccess.getImplAttrBooleanDefAccess().getMultipleAssignment_4(), "rule__ImplAttrBooleanDef__MultipleAssignment_4");
					put(grammarAccess.getImplAttrBooleanDefAccess().getValueAssignment_5_1_0(), "rule__ImplAttrBooleanDef__ValueAssignment_5_1_0");
					put(grammarAccess.getImplAttrBooleanDefAccess().getDefaultAssignment_5_1_1(), "rule__ImplAttrBooleanDef__DefaultAssignment_5_1_1");
					put(grammarAccess.getImplAttrBooleanDefAccess().getDescriptionAssignment_6_1(), "rule__ImplAttrBooleanDef__DescriptionAssignment_6_1");
					put(grammarAccess.getRangeAccess().getValueAssignment_1_0(), "rule__Range__ValueAssignment_1_0");
					put(grammarAccess.getRangeAccess().getBeginAssignment_1_1_0(), "rule__Range__BeginAssignment_1_1_0");
					put(grammarAccess.getRangeAccess().getEndAssignment_1_1_2(), "rule__Range__EndAssignment_1_1_2");
					put(grammarAccess.getRangeAccess().getNumbersAssignment_1_2_0(), "rule__Range__NumbersAssignment_1_2_0");
					put(grammarAccess.getRangeAccess().getNumbersAssignment_1_2_1_1(), "rule__Range__NumbersAssignment_1_2_1_1");
					put(grammarAccess.getEnumerationAccess().getListAssignment_1(), "rule__Enumeration__ListAssignment_1");
					put(grammarAccess.getEnumerationAccess().getListAssignment_2_1(), "rule__Enumeration__ListAssignment_2_1");
					put(grammarAccess.getEnumeratorAccess().getNameAssignment_0(), "rule__Enumerator__NameAssignment_0");
					put(grammarAccess.getEnumeratorAccess().getImplParameterListAssignment_1_1(), "rule__Enumerator__ImplParameterListAssignment_1_1");
					put(grammarAccess.getEnumeratorAccess().getDescriptionAssignment_2(), "rule__Enumerator__DescriptionAssignment_2");
					put(grammarAccess.getImplRefDefAccess().getTypeAssignment_0(), "rule__ImplRefDef__TypeAssignment_0");
					put(grammarAccess.getImplRefDefAccess().getNameAssignment_1(), "rule__ImplRefDef__NameAssignment_1");
					put(grammarAccess.getImplRefDefAccess().getMultipleAssignment_2(), "rule__ImplRefDef__MultipleAssignment_2");
					put(grammarAccess.getImplRefDefAccess().getDescriptionAssignment_3(), "rule__ImplRefDef__DescriptionAssignment_3");
					put(grammarAccess.getApplicationDefinitionAccess().getNameAssignment_1(), "rule__ApplicationDefinition__NameAssignment_1");
					put(grammarAccess.getApplicationDefinitionAccess().getObjectDefinitionListAssignment_3(), "rule__ApplicationDefinition__ObjectDefinitionListAssignment_3");
					put(grammarAccess.getApplicationDefinitionAccess().getDescriptionAssignment_5(), "rule__ApplicationDefinition__DescriptionAssignment_5");
					put(grammarAccess.getObjectDefinitionAccess().getObjectAssignment_0(), "rule__ObjectDefinition__ObjectAssignment_0");
					put(grammarAccess.getObjectDefinitionAccess().getNameAssignment_1(), "rule__ObjectDefinition__NameAssignment_1");
					put(grammarAccess.getObjectDefinitionAccess().getParameterListAssignment_2_1(), "rule__ObjectDefinition__ParameterListAssignment_2_1");
					put(grammarAccess.getObjectDefinitionAccess().getReObjectDefinitionAssignment_2_2(), "rule__ObjectDefinition__ReObjectDefinitionAssignment_2_2");
					put(grammarAccess.getObjectDefinitionAccess().getDescrptionAssignment_3(), "rule__ObjectDefinition__DescrptionAssignment_3");
					put(grammarAccess.getReObjectDefinitionAccess().getReobjectAssignment_0(), "rule__ReObjectDefinition__ReobjectAssignment_0");
					put(grammarAccess.getReObjectDefinitionAccess().getNameAssignment_1(), "rule__ReObjectDefinition__NameAssignment_1");
					put(grammarAccess.getReObjectDefinitionAccess().getParameterListAssignment_2_1(), "rule__ReObjectDefinition__ParameterListAssignment_2_1");
					put(grammarAccess.getReObjectDefinitionAccess().getDescrptionAssignment_3(), "rule__ReObjectDefinition__DescrptionAssignment_3");
					put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
					put(grammarAccess.getAttributeAccess().getValueAssignment_2(), "rule__Attribute__ValueAssignment_2");
					put(grammarAccess.getAttributeAccess().getDescriptionAssignment_3(), "rule__Attribute__DescriptionAssignment_3");
					put(grammarAccess.getAttributeNameAccess().getValueAssignment(), "rule__AttributeName__ValueAssignment");
					put(grammarAccess.getNameAttributeValueAccess().getValueAssignment_0(), "rule__NameAttributeValue__ValueAssignment_0");
					put(grammarAccess.getNameAttributeValueAccess().getParameterListAssignment_1_1(), "rule__NameAttributeValue__ParameterListAssignment_1_1");
					put(grammarAccess.getBooleanAttributeValueAccess().getValueAssignment_0(), "rule__BooleanAttributeValue__ValueAssignment_0");
					put(grammarAccess.getBooleanAttributeValueAccess().getParameterListAssignment_1_1(), "rule__BooleanAttributeValue__ParameterListAssignment_1_1");
					put(grammarAccess.getNumberAttributeValueAccess().getValueAssignment(), "rule__NumberAttributeValue__ValueAssignment");
					put(grammarAccess.getFloatAttributeValueAccess().getValueAssignment(), "rule__FloatAttributeValue__ValueAssignment");
					put(grammarAccess.getStringAttributeValueAccess().getValueAssignment(), "rule__StringAttributeValue__ValueAssignment");
					put(grammarAccess.getAutoAttributeValueAccess().getValueAssignment(), "rule__AutoAttributeValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalOilParser typedParser = (InternalOilParser) parser;
			typedParser.entryRuleOILFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public OilGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(OilGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}