package org.xtext.example.oil.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.oil.services.OilGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOilParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FILENAME", "RULE_SEMICOLON", "RULE_BLOCKBEGIN", "RULE_BLOCKEND", "RULE_T_OBJECT", "RULE_T_REOBJECT", "RULE_ID", "RULE_T_TRUE", "RULE_T_FALSE", "RULE_T_CPU", "RULE_STRING", "RULE_T_NUMBER", "RULE_T_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#include'", "'<'", "'>'", "'OIL_VERSION'", "'='", "':'", "'IMPLEMENTATION'", "'WITH_AUTO'", "'IDENTIFIER'", "'FLOAT'", "'ENUM'", "'STRING'", "'BOOLEAN'", "'['", "','", "']'", "'..'", "'AUTO'", "'UINT32'", "'INT32'", "'UINT64'", "'INT64'", "'NO_DEFAULT'", "'OS_TYPE'", "'TASK_TYPE'", "'COUNTER_TYPE'", "'ALARM_TYPE'", "'RESOURCE_TYPE'", "'EVENT_TYPE'", "'ISR_TYPE'", "'MESSAGE_TYPE'", "'COM_TYPE'", "'NM_TYPE'", "'APPMODE_TYPE'", "'IPDU_TYPE'", "'NETWORKMESSAGE_TYPE'", "'APPLICATION_TYPE'", "'MEMOTY_PROTECTION_TYPE'", "'SPINLOCK_TYPE'", "'SCHEDULETABLE_TYPE'", "'IOC_TYPE'", "'APICONFIG_TYPE'", "'LIBRARY_TYPE'"
    };
    public static final int RULE_BLOCKEND=7;
    public static final int T__50=50;
    public static final int RULE_T_FLOAT=16;
    public static final int RULE_FILENAME=4;
    public static final int RULE_BLOCKBEGIN=6;
    public static final int T__59=59;
    public static final int RULE_T_CPU=13;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_T_OBJECT=8;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=10;
    public static final int RULE_T_REOBJECT=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=17;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SEMICOLON=5;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_T_NUMBER=15;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_T_FALSE=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_T_TRUE=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalOilParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOilParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOilParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOil.g"; }



     	private OilGrammarAccess grammarAccess;

        public InternalOilParser(TokenStream input, OilGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "OILFile";
       	}

       	@Override
       	protected OilGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOILFile"
    // InternalOil.g:65:1: entryRuleOILFile returns [EObject current=null] : iv_ruleOILFile= ruleOILFile EOF ;
    public final EObject entryRuleOILFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOILFile = null;


        try {
            // InternalOil.g:65:48: (iv_ruleOILFile= ruleOILFile EOF )
            // InternalOil.g:66:2: iv_ruleOILFile= ruleOILFile EOF
            {
             newCompositeNode(grammarAccess.getOILFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOILFile=ruleOILFile();

            state._fsp--;

             current =iv_ruleOILFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOILFile"


    // $ANTLR start "ruleOILFile"
    // InternalOil.g:72:1: ruleOILFile returns [EObject current=null] : ( ( (lv_version_0_0= ruleOILVersion ) )? ( (lv_include_1_0= ruleInclude ) )* ( (lv_implementation_2_0= ruleImplementationDefinition ) )? ( (lv_application_3_0= ruleApplicationDefinition ) ) ) ;
    public final EObject ruleOILFile() throws RecognitionException {
        EObject current = null;

        EObject lv_version_0_0 = null;

        EObject lv_include_1_0 = null;

        EObject lv_implementation_2_0 = null;

        EObject lv_application_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:78:2: ( ( ( (lv_version_0_0= ruleOILVersion ) )? ( (lv_include_1_0= ruleInclude ) )* ( (lv_implementation_2_0= ruleImplementationDefinition ) )? ( (lv_application_3_0= ruleApplicationDefinition ) ) ) )
            // InternalOil.g:79:2: ( ( (lv_version_0_0= ruleOILVersion ) )? ( (lv_include_1_0= ruleInclude ) )* ( (lv_implementation_2_0= ruleImplementationDefinition ) )? ( (lv_application_3_0= ruleApplicationDefinition ) ) )
            {
            // InternalOil.g:79:2: ( ( (lv_version_0_0= ruleOILVersion ) )? ( (lv_include_1_0= ruleInclude ) )* ( (lv_implementation_2_0= ruleImplementationDefinition ) )? ( (lv_application_3_0= ruleApplicationDefinition ) ) )
            // InternalOil.g:80:3: ( (lv_version_0_0= ruleOILVersion ) )? ( (lv_include_1_0= ruleInclude ) )* ( (lv_implementation_2_0= ruleImplementationDefinition ) )? ( (lv_application_3_0= ruleApplicationDefinition ) )
            {
            // InternalOil.g:80:3: ( (lv_version_0_0= ruleOILVersion ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOil.g:81:4: (lv_version_0_0= ruleOILVersion )
                    {
                    // InternalOil.g:81:4: (lv_version_0_0= ruleOILVersion )
                    // InternalOil.g:82:5: lv_version_0_0= ruleOILVersion
                    {

                    					newCompositeNode(grammarAccess.getOILFileAccess().getVersionOILVersionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_version_0_0=ruleOILVersion();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOILFileRule());
                    					}
                    					set(
                    						current,
                    						"version",
                    						lv_version_0_0,
                    						"org.xtext.example.oil.Oil.OILVersion");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:99:3: ( (lv_include_1_0= ruleInclude ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOil.g:100:4: (lv_include_1_0= ruleInclude )
            	    {
            	    // InternalOil.g:100:4: (lv_include_1_0= ruleInclude )
            	    // InternalOil.g:101:5: lv_include_1_0= ruleInclude
            	    {

            	    					newCompositeNode(grammarAccess.getOILFileAccess().getIncludeIncludeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_include_1_0=ruleInclude();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOILFileRule());
            	    					}
            	    					add(
            	    						current,
            	    						"include",
            	    						lv_include_1_0,
            	    						"org.xtext.example.oil.Oil.Include");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalOil.g:118:3: ( (lv_implementation_2_0= ruleImplementationDefinition ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOil.g:119:4: (lv_implementation_2_0= ruleImplementationDefinition )
                    {
                    // InternalOil.g:119:4: (lv_implementation_2_0= ruleImplementationDefinition )
                    // InternalOil.g:120:5: lv_implementation_2_0= ruleImplementationDefinition
                    {

                    					newCompositeNode(grammarAccess.getOILFileAccess().getImplementationImplementationDefinitionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_implementation_2_0=ruleImplementationDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOILFileRule());
                    					}
                    					set(
                    						current,
                    						"implementation",
                    						lv_implementation_2_0,
                    						"org.xtext.example.oil.Oil.ImplementationDefinition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:137:3: ( (lv_application_3_0= ruleApplicationDefinition ) )
            // InternalOil.g:138:4: (lv_application_3_0= ruleApplicationDefinition )
            {
            // InternalOil.g:138:4: (lv_application_3_0= ruleApplicationDefinition )
            // InternalOil.g:139:5: lv_application_3_0= ruleApplicationDefinition
            {

            					newCompositeNode(grammarAccess.getOILFileAccess().getApplicationApplicationDefinitionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_application_3_0=ruleApplicationDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOILFileRule());
            					}
            					set(
            						current,
            						"application",
            						lv_application_3_0,
            						"org.xtext.example.oil.Oil.ApplicationDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOILFile"


    // $ANTLR start "entryRuleInclude"
    // InternalOil.g:160:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalOil.g:160:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalOil.g:161:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalOil.g:167:1: ruleInclude returns [EObject current=null] : (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:173:2: ( (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) ) )
            // InternalOil.g:174:2: (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) )
            {
            // InternalOil.g:174:2: (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalOil.g:175:3: otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalOil.g:179:3: ( (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalOil.g:180:4: (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' )
                    {
                    // InternalOil.g:180:4: (otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>' )
                    // InternalOil.g:181:5: otherlv_1= '<' ( (lv_name_2_0= RULE_FILENAME ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLessThanSignKeyword_1_0_0());
                    				
                    // InternalOil.g:185:5: ( (lv_name_2_0= RULE_FILENAME ) )
                    // InternalOil.g:186:6: (lv_name_2_0= RULE_FILENAME )
                    {
                    // InternalOil.g:186:6: (lv_name_2_0= RULE_FILENAME )
                    // InternalOil.g:187:7: lv_name_2_0= RULE_FILENAME
                    {
                    lv_name_2_0=(Token)match(input,RULE_FILENAME,FOLLOW_6); 

                    							newLeafNode(lv_name_2_0, grammarAccess.getIncludeAccess().getNameFILENAMETerminalRuleCall_1_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIncludeRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.xtext.example.oil.Oil.FILENAME");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getGreaterThanSignKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:209:4: ( (lv_name_4_0= ruleEString ) )
                    {
                    // InternalOil.g:209:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalOil.g:210:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalOil.g:210:5: (lv_name_4_0= ruleEString )
                    // InternalOil.g:211:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIncludeAccess().getNameEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIncludeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleOILVersion"
    // InternalOil.g:233:1: entryRuleOILVersion returns [EObject current=null] : iv_ruleOILVersion= ruleOILVersion EOF ;
    public final EObject entryRuleOILVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOILVersion = null;


        try {
            // InternalOil.g:233:51: (iv_ruleOILVersion= ruleOILVersion EOF )
            // InternalOil.g:234:2: iv_ruleOILVersion= ruleOILVersion EOF
            {
             newCompositeNode(grammarAccess.getOILVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOILVersion=ruleOILVersion();

            state._fsp--;

             current =iv_ruleOILVersion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOILVersion"


    // $ANTLR start "ruleOILVersion"
    // InternalOil.g:240:1: ruleOILVersion returns [EObject current=null] : (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? this_SEMICOLON_5= RULE_SEMICOLON ) ;
    public final EObject ruleOILVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_SEMICOLON_5=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:246:2: ( (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? this_SEMICOLON_5= RULE_SEMICOLON ) )
            // InternalOil.g:247:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? this_SEMICOLON_5= RULE_SEMICOLON )
            {
            // InternalOil.g:247:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? this_SEMICOLON_5= RULE_SEMICOLON )
            // InternalOil.g:248:3: otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? this_SEMICOLON_5= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOILVersionAccess().getOIL_VERSIONKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOILVersionAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:256:3: ( (lv_value_2_0= ruleEString ) )
            // InternalOil.g:257:4: (lv_value_2_0= ruleEString )
            {
            // InternalOil.g:257:4: (lv_value_2_0= ruleEString )
            // InternalOil.g:258:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOILVersionAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOILVersionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:275:3: (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOil.g:276:4: otherlv_3= ':' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getOILVersionAccess().getColonKeyword_3_0());
                    			
                    // InternalOil.g:280:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalOil.g:281:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:281:5: (lv_description_4_0= ruleEString )
                    // InternalOil.g:282:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOILVersionAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOILVersionRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getOILVersionAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOILVersion"


    // $ANTLR start "entryRuleImplementationDefinition"
    // InternalOil.g:308:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // InternalOil.g:308:65: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // InternalOil.g:309:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
             newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;

             current =iv_ruleImplementationDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationDefinition"


    // $ANTLR start "ruleImplementationDefinition"
    // InternalOil.g:315:1: ruleImplementationDefinition returns [EObject current=null] : (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BLOCKBEGIN_2=null;
        Token this_BLOCKEND_4=null;
        Token this_SEMICOLON_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_implementationSpecs_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:321:2: ( (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON ) )
            // InternalOil.g:322:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            {
            // InternalOil.g:322:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            // InternalOil.g:323:3: otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationDefinitionAccess().getIMPLEMENTATIONKeyword_0());
            		
            // InternalOil.g:327:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:328:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:328:4: (lv_name_1_0= ruleName )
            // InternalOil.g:329:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BLOCKBEGIN_2=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_12); 

            			newLeafNode(this_BLOCKBEGIN_2, grammarAccess.getImplementationDefinitionAccess().getBLOCKBEGINTerminalRuleCall_2());
            		
            // InternalOil.g:350:3: ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_T_OBJECT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOil.g:351:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            	    {
            	    // InternalOil.g:351:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            	    // InternalOil.g:352:5: lv_implementationSpecs_3_0= ruleImplementationSpec
            	    {

            	    					newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getImplementationSpecsImplementationSpecParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_implementationSpecs_3_0=ruleImplementationSpec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementationSpecs",
            	    						lv_implementationSpecs_3_0,
            	    						"org.xtext.example.oil.Oil.ImplementationSpec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_BLOCKEND_4=(Token)match(input,RULE_BLOCKEND,FOLLOW_13); 

            			newLeafNode(this_BLOCKEND_4, grammarAccess.getImplementationDefinitionAccess().getBLOCKENDTerminalRuleCall_4());
            		
            // InternalOil.g:373:3: ( (lv_description_5_0= ruleEString ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOil.g:374:4: (lv_description_5_0= ruleEString )
                    {
                    // InternalOil.g:374:4: (lv_description_5_0= ruleEString )
                    // InternalOil.g:375:5: lv_description_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getDescriptionEStringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getImplementationDefinitionAccess().getSEMICOLONTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationDefinition"


    // $ANTLR start "entryRuleImplementationSpec"
    // InternalOil.g:400:1: entryRuleImplementationSpec returns [EObject current=null] : iv_ruleImplementationSpec= ruleImplementationSpec EOF ;
    public final EObject entryRuleImplementationSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationSpec = null;


        try {
            // InternalOil.g:400:59: (iv_ruleImplementationSpec= ruleImplementationSpec EOF )
            // InternalOil.g:401:2: iv_ruleImplementationSpec= ruleImplementationSpec EOF
            {
             newCompositeNode(grammarAccess.getImplementationSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationSpec=ruleImplementationSpec();

            state._fsp--;

             current =iv_ruleImplementationSpec; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationSpec"


    // $ANTLR start "ruleImplementationSpec"
    // InternalOil.g:407:1: ruleImplementationSpec returns [EObject current=null] : ( ( (lv_object_0_0= ruleObject ) ) this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implementations_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND (otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? this_SEMICOLON_6= RULE_SEMICOLON ) ;
    public final EObject ruleImplementationSpec() throws RecognitionException {
        EObject current = null;

        Token this_BLOCKBEGIN_1=null;
        Token this_BLOCKEND_3=null;
        Token otherlv_4=null;
        Token this_SEMICOLON_6=null;
        AntlrDatatypeRuleToken lv_object_0_0 = null;

        EObject lv_implementations_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:413:2: ( ( ( (lv_object_0_0= ruleObject ) ) this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implementations_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND (otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? this_SEMICOLON_6= RULE_SEMICOLON ) )
            // InternalOil.g:414:2: ( ( (lv_object_0_0= ruleObject ) ) this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implementations_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND (otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            {
            // InternalOil.g:414:2: ( ( (lv_object_0_0= ruleObject ) ) this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implementations_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND (otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            // InternalOil.g:415:3: ( (lv_object_0_0= ruleObject ) ) this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implementations_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND (otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )? this_SEMICOLON_6= RULE_SEMICOLON
            {
            // InternalOil.g:415:3: ( (lv_object_0_0= ruleObject ) )
            // InternalOil.g:416:4: (lv_object_0_0= ruleObject )
            {
            // InternalOil.g:416:4: (lv_object_0_0= ruleObject )
            // InternalOil.g:417:5: lv_object_0_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getImplementationSpecAccess().getObjectObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_object_0_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.xtext.example.oil.Oil.Object");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BLOCKBEGIN_1=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_14); 

            			newLeafNode(this_BLOCKBEGIN_1, grammarAccess.getImplementationSpecAccess().getBLOCKBEGINTerminalRuleCall_1());
            		
            // InternalOil.g:438:3: ( (lv_implementations_2_0= ruleImplementationDef ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=30 && LA8_0<=34)||(LA8_0>=40 && LA8_0<=43)||(LA8_0>=45 && LA8_0<=64)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOil.g:439:4: (lv_implementations_2_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:439:4: (lv_implementations_2_0= ruleImplementationDef )
            	    // InternalOil.g:440:5: lv_implementations_2_0= ruleImplementationDef
            	    {

            	    					newCompositeNode(grammarAccess.getImplementationSpecAccess().getImplementationsImplementationDefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_implementations_2_0=ruleImplementationDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_2_0,
            	    						"org.xtext.example.oil.Oil.ImplementationDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            this_BLOCKEND_3=(Token)match(input,RULE_BLOCKEND,FOLLOW_8); 

            			newLeafNode(this_BLOCKEND_3, grammarAccess.getImplementationSpecAccess().getBLOCKENDTerminalRuleCall_3());
            		
            // InternalOil.g:461:3: (otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOil.g:462:4: otherlv_4= ':' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getImplementationSpecAccess().getColonKeyword_4_0());
                    			
                    // InternalOil.g:466:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalOil.g:467:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalOil.g:467:5: (lv_description_5_0= ruleEString )
                    // InternalOil.g:468:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getImplementationSpecAccess().getSEMICOLONTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationSpec"


    // $ANTLR start "entryRuleObject"
    // InternalOil.g:494:1: entryRuleObject returns [String current=null] : iv_ruleObject= ruleObject EOF ;
    public final String entryRuleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObject = null;


        try {
            // InternalOil.g:494:46: (iv_ruleObject= ruleObject EOF )
            // InternalOil.g:495:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalOil.g:501:1: ruleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_OBJECT_0= RULE_T_OBJECT ;
    public final AntlrDatatypeRuleToken ruleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_OBJECT_0=null;


        	enterRule();

        try {
            // InternalOil.g:507:2: (this_T_OBJECT_0= RULE_T_OBJECT )
            // InternalOil.g:508:2: this_T_OBJECT_0= RULE_T_OBJECT
            {
            this_T_OBJECT_0=(Token)match(input,RULE_T_OBJECT,FOLLOW_2); 

            		current.merge(this_T_OBJECT_0);
            	

            		newLeafNode(this_T_OBJECT_0, grammarAccess.getObjectAccess().getT_OBJECTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleReObject"
    // InternalOil.g:518:1: entryRuleReObject returns [String current=null] : iv_ruleReObject= ruleReObject EOF ;
    public final String entryRuleReObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReObject = null;


        try {
            // InternalOil.g:518:48: (iv_ruleReObject= ruleReObject EOF )
            // InternalOil.g:519:2: iv_ruleReObject= ruleReObject EOF
            {
             newCompositeNode(grammarAccess.getReObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReObject=ruleReObject();

            state._fsp--;

             current =iv_ruleReObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReObject"


    // $ANTLR start "ruleReObject"
    // InternalOil.g:525:1: ruleReObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_ReObject_0= RULE_T_REOBJECT ;
    public final AntlrDatatypeRuleToken ruleReObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_ReObject_0=null;


        	enterRule();

        try {
            // InternalOil.g:531:2: (this_T_ReObject_0= RULE_T_REOBJECT )
            // InternalOil.g:532:2: this_T_ReObject_0= RULE_T_REOBJECT
            {
            this_T_ReObject_0=(Token)match(input,RULE_T_REOBJECT,FOLLOW_2); 

            		current.merge(this_T_ReObject_0);
            	

            		newLeafNode(this_T_ReObject_0, grammarAccess.getReObjectAccess().getT_ReObjectTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReObject"


    // $ANTLR start "entryRuleImplementationDef"
    // InternalOil.g:542:1: entryRuleImplementationDef returns [EObject current=null] : iv_ruleImplementationDef= ruleImplementationDef EOF ;
    public final EObject entryRuleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDef = null;


        try {
            // InternalOil.g:542:58: (iv_ruleImplementationDef= ruleImplementationDef EOF )
            // InternalOil.g:543:2: iv_ruleImplementationDef= ruleImplementationDef EOF
            {
             newCompositeNode(grammarAccess.getImplementationDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplementationDef=ruleImplementationDef();

            state._fsp--;

             current =iv_ruleImplementationDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationDef"


    // $ANTLR start "ruleImplementationDef"
    // InternalOil.g:549:1: ruleImplementationDef returns [EObject current=null] : (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) ;
    public final EObject ruleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject this_ImplAttrDef_0 = null;

        EObject this_ImplRefDef_1 = null;



        	enterRule();

        try {
            // InternalOil.g:555:2: ( (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) )
            // InternalOil.g:556:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            {
            // InternalOil.g:556:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=30 && LA10_0<=34)||(LA10_0>=40 && LA10_0<=43)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=45 && LA10_0<=64)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOil.g:557:3: this_ImplAttrDef_0= ruleImplAttrDef
                    {

                    			newCompositeNode(grammarAccess.getImplementationDefAccess().getImplAttrDefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplAttrDef_0=ruleImplAttrDef();

                    state._fsp--;


                    			current = this_ImplAttrDef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:566:3: this_ImplRefDef_1= ruleImplRefDef
                    {

                    			newCompositeNode(grammarAccess.getImplementationDefAccess().getImplRefDefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplRefDef_1=ruleImplRefDef();

                    state._fsp--;


                    			current = this_ImplRefDef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationDef"


    // $ANTLR start "entryRuleImplAttrDef"
    // InternalOil.g:578:1: entryRuleImplAttrDef returns [EObject current=null] : iv_ruleImplAttrDef= ruleImplAttrDef EOF ;
    public final EObject entryRuleImplAttrDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrDef = null;


        try {
            // InternalOil.g:578:52: (iv_ruleImplAttrDef= ruleImplAttrDef EOF )
            // InternalOil.g:579:2: iv_ruleImplAttrDef= ruleImplAttrDef EOF
            {
             newCompositeNode(grammarAccess.getImplAttrDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplAttrDef=ruleImplAttrDef();

            state._fsp--;

             current =iv_ruleImplAttrDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplAttrDef"


    // $ANTLR start "ruleImplAttrDef"
    // InternalOil.g:585:1: ruleImplAttrDef returns [EObject current=null] : (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) ;
    public final EObject ruleImplAttrDef() throws RecognitionException {
        EObject current = null;

        EObject this_ImplAttrIntDef_0 = null;

        EObject this_ImplAttrFloatDef_1 = null;

        EObject this_ImplAttrEnumDef_2 = null;

        EObject this_ImplAttrStringDef_3 = null;

        EObject this_ImplAttrBooleanDef_4 = null;

        EObject this_ImplAttrIdentiFier_5 = null;



        	enterRule();

        try {
            // InternalOil.g:591:2: ( (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) )
            // InternalOil.g:592:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            {
            // InternalOil.g:592:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            case 34:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOil.g:593:3: this_ImplAttrIntDef_0= ruleImplAttrIntDef
                    {

                    			newCompositeNode(grammarAccess.getImplAttrDefAccess().getImplAttrIntDefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplAttrIntDef_0=ruleImplAttrIntDef();

                    state._fsp--;


                    			current = this_ImplAttrIntDef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:602:3: this_ImplAttrFloatDef_1= ruleImplAttrFloatDef
                    {

                    			newCompositeNode(grammarAccess.getImplAttrDefAccess().getImplAttrFloatDefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplAttrFloatDef_1=ruleImplAttrFloatDef();

                    state._fsp--;


                    			current = this_ImplAttrFloatDef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOil.g:611:3: this_ImplAttrEnumDef_2= ruleImplAttrEnumDef
                    {

                    			newCompositeNode(grammarAccess.getImplAttrDefAccess().getImplAttrEnumDefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplAttrEnumDef_2=ruleImplAttrEnumDef();

                    state._fsp--;


                    			current = this_ImplAttrEnumDef_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOil.g:620:3: this_ImplAttrStringDef_3= ruleImplAttrStringDef
                    {

                    			newCompositeNode(grammarAccess.getImplAttrDefAccess().getImplAttrStringDefParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplAttrStringDef_3=ruleImplAttrStringDef();

                    state._fsp--;


                    			current = this_ImplAttrStringDef_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOil.g:629:3: this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef
                    {

                    			newCompositeNode(grammarAccess.getImplAttrDefAccess().getImplAttrBooleanDefParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplAttrBooleanDef_4=ruleImplAttrBooleanDef();

                    state._fsp--;


                    			current = this_ImplAttrBooleanDef_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOil.g:638:3: this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier
                    {

                    			newCompositeNode(grammarAccess.getImplAttrDefAccess().getImplAttrIdentiFierParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImplAttrIdentiFier_5=ruleImplAttrIdentiFier();

                    state._fsp--;


                    			current = this_ImplAttrIdentiFier_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplAttrDef"


    // $ANTLR start "entryRuleImplAttrIntDef"
    // InternalOil.g:650:1: entryRuleImplAttrIntDef returns [EObject current=null] : iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF ;
    public final EObject entryRuleImplAttrIntDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIntDef = null;


        try {
            // InternalOil.g:650:55: (iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF )
            // InternalOil.g:651:2: iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF
            {
             newCompositeNode(grammarAccess.getImplAttrIntDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplAttrIntDef=ruleImplAttrIntDef();

            state._fsp--;

             current =iv_ruleImplAttrIntDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplAttrIntDef"


    // $ANTLR start "ruleImplAttrIntDef"
    // InternalOil.g:657:1: ruleImplAttrIntDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON ) ;
    public final EObject ruleImplAttrIntDef() throws RecognitionException {
        EObject current = null;

        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token this_SEMICOLON_10=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:663:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON ) )
            // InternalOil.g:664:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON )
            {
            // InternalOil.g:664:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON )
            // InternalOil.g:665:3: ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON
            {
            // InternalOil.g:665:3: ( (lv_type_0_0= ruleIntTypeEnum ) )
            // InternalOil.g:666:4: (lv_type_0_0= ruleIntTypeEnum )
            {
            // InternalOil.g:666:4: (lv_type_0_0= ruleIntTypeEnum )
            // InternalOil.g:667:5: lv_type_0_0= ruleIntTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getTypeIntTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_0_0=ruleIntTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplAttrIntDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.oil.Oil.IntTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:684:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOil.g:685:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:685:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:686:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,29,FOLLOW_15); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIntDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIntDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:698:3: ( (lv_range_2_0= ruleRange ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOil.g:699:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:699:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:700:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_range_2_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrIntDefRule());
                    					}
                    					set(
                    						current,
                    						"range",
                    						lv_range_2_0,
                    						"org.xtext.example.oil.Oil.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:717:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:718:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:718:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:719:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_3_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplAttrIntDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.oil.Oil.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:736:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOil.g:737:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:737:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:738:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_multiple_4_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrIntDefRule());
                    					}
                    					set(
                    						current,
                    						"multiple",
                    						true,
                    						"org.xtext.example.oil.Oil.MultipleSpecifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:755:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOil.g:756:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrIntDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:760:4: ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_T_NUMBER) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==39||LA15_0==44) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalOil.g:761:5: ( (lv_value_6_0= ruleNumber ) )
                            {
                            // InternalOil.g:761:5: ( (lv_value_6_0= ruleNumber ) )
                            // InternalOil.g:762:6: (lv_value_6_0= ruleNumber )
                            {
                            // InternalOil.g:762:6: (lv_value_6_0= ruleNumber )
                            // InternalOil.g:763:7: lv_value_6_0= ruleNumber
                            {

                            							newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getValueNumberParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_value_6_0=ruleNumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrIntDefRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_6_0,
                            								"org.xtext.example.oil.Oil.Number");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:781:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:781:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:782:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:782:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:783:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_default_7_0=ruleDefaultEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrIntDefRule());
                            							}
                            							set(
                            								current,
                            								"default",
                            								lv_default_7_0,
                            								"org.xtext.example.oil.Oil.DefaultEnum");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalOil.g:802:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOil.g:803:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrIntDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:807:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:808:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:808:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:809:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplAttrIntDefRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getImplAttrIntDefAccess().getSEMICOLONTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplAttrIntDef"


    // $ANTLR start "entryRuleImplAttrIdentiFier"
    // InternalOil.g:835:1: entryRuleImplAttrIdentiFier returns [EObject current=null] : iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF ;
    public final EObject entryRuleImplAttrIdentiFier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIdentiFier = null;


        try {
            // InternalOil.g:835:59: (iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF )
            // InternalOil.g:836:2: iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF
            {
             newCompositeNode(grammarAccess.getImplAttrIdentiFierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplAttrIdentiFier=ruleImplAttrIdentiFier();

            state._fsp--;

             current =iv_ruleImplAttrIdentiFier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplAttrIdentiFier"


    // $ANTLR start "ruleImplAttrIdentiFier"
    // InternalOil.g:842:1: ruleImplAttrIdentiFier returns [EObject current=null] : (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON ) ;
    public final EObject ruleImplAttrIdentiFier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token this_SEMICOLON_5=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:848:2: ( (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON ) )
            // InternalOil.g:849:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            {
            // InternalOil.g:849:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON )
            // InternalOil.g:850:3: otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) this_SEMICOLON_5= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,30,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrIdentiFierAccess().getIDENTIFIERKeyword_0());
            		
            // InternalOil.g:854:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOil.g:855:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:855:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:856:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,29,FOLLOW_15); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIdentiFierAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIdentiFierRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:868:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:869:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:869:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:870:5: lv_name_2_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrIdentiFierAccess().getNameAttributeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplAttrIdentiFierRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.oil.Oil.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getImplAttrIdentiFierAccess().getEqualsSignKeyword_3());
            		
            // InternalOil.g:891:3: ( (lv_value_4_0= RULE_ID ) )
            // InternalOil.g:892:4: (lv_value_4_0= RULE_ID )
            {
            // InternalOil.g:892:4: (lv_value_4_0= RULE_ID )
            // InternalOil.g:893:5: lv_value_4_0= RULE_ID
            {
            lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_value_4_0, grammarAccess.getImplAttrIdentiFierAccess().getValueIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImplAttrIdentiFierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.oil.Oil.ID");
            				

            }


            }

            this_SEMICOLON_5=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_5, grammarAccess.getImplAttrIdentiFierAccess().getSEMICOLONTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplAttrIdentiFier"


    // $ANTLR start "entryRuleImplAttrFloatDef"
    // InternalOil.g:917:1: entryRuleImplAttrFloatDef returns [EObject current=null] : iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF ;
    public final EObject entryRuleImplAttrFloatDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrFloatDef = null;


        try {
            // InternalOil.g:917:57: (iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF )
            // InternalOil.g:918:2: iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF
            {
             newCompositeNode(grammarAccess.getImplAttrFloatDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplAttrFloatDef=ruleImplAttrFloatDef();

            state._fsp--;

             current =iv_ruleImplAttrFloatDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplAttrFloatDef"


    // $ANTLR start "ruleImplAttrFloatDef"
    // InternalOil.g:924:1: ruleImplAttrFloatDef returns [EObject current=null] : (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON ) ;
    public final EObject ruleImplAttrFloatDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token this_SEMICOLON_10=null;
        EObject lv_range_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:930:2: ( (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON ) )
            // InternalOil.g:931:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON )
            {
            // InternalOil.g:931:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON )
            // InternalOil.g:932:3: otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrFloatDefAccess().getFLOATKeyword_0());
            		
            // InternalOil.g:936:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOil.g:937:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:937:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:938:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,29,FOLLOW_15); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrFloatDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrFloatDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:950:3: ( (lv_range_2_0= ruleRange ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOil.g:951:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:951:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:952:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_range_2_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrFloatDefRule());
                    					}
                    					set(
                    						current,
                    						"range",
                    						lv_range_2_0,
                    						"org.xtext.example.oil.Oil.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:969:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:970:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:970:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:971:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_3_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplAttrFloatDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.oil.Oil.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:988:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOil.g:989:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:989:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:990:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_multiple_4_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrFloatDefRule());
                    					}
                    					set(
                    						current,
                    						"multiple",
                    						true,
                    						"org.xtext.example.oil.Oil.MultipleSpecifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1007:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOil.g:1008:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrFloatDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:1012:4: ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_T_FLOAT) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==39||LA22_0==44) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalOil.g:1013:5: ( (lv_value_6_0= ruleEFloat ) )
                            {
                            // InternalOil.g:1013:5: ( (lv_value_6_0= ruleEFloat ) )
                            // InternalOil.g:1014:6: (lv_value_6_0= ruleEFloat )
                            {
                            // InternalOil.g:1014:6: (lv_value_6_0= ruleEFloat )
                            // InternalOil.g:1015:7: lv_value_6_0= ruleEFloat
                            {

                            							newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getValueEFloatParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_value_6_0=ruleEFloat();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrFloatDefRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_6_0,
                            								"org.xtext.example.oil.Oil.EFloat");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:1033:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1033:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:1034:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1034:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:1035:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_default_7_0=ruleDefaultEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrFloatDefRule());
                            							}
                            							set(
                            								current,
                            								"default",
                            								lv_default_7_0,
                            								"org.xtext.example.oil.Oil.DefaultEnum");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalOil.g:1054:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOil.g:1055:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrFloatDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:1059:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:1060:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:1060:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:1061:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplAttrFloatDefRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getImplAttrFloatDefAccess().getSEMICOLONTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplAttrFloatDef"


    // $ANTLR start "entryRuleImplAttrEnumDef"
    // InternalOil.g:1087:1: entryRuleImplAttrEnumDef returns [EObject current=null] : iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF ;
    public final EObject entryRuleImplAttrEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrEnumDef = null;


        try {
            // InternalOil.g:1087:56: (iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF )
            // InternalOil.g:1088:2: iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF
            {
             newCompositeNode(grammarAccess.getImplAttrEnumDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplAttrEnumDef=ruleImplAttrEnumDef();

            state._fsp--;

             current =iv_ruleImplAttrEnumDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplAttrEnumDef"


    // $ANTLR start "ruleImplAttrEnumDef"
    // InternalOil.g:1094:1: ruleImplAttrEnumDef returns [EObject current=null] : (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON ) ;
    public final EObject ruleImplAttrEnumDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token this_SEMICOLON_10=null;
        EObject lv_enumeration_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1100:2: ( (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON ) )
            // InternalOil.g:1101:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON )
            {
            // InternalOil.g:1101:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON )
            // InternalOil.g:1102:3: otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? this_SEMICOLON_10= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,32,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrEnumDefAccess().getENUMKeyword_0());
            		
            // InternalOil.g:1106:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOil.g:1107:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1107:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1108:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,29,FOLLOW_15); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrEnumDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrEnumDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1120:3: ( (lv_enumeration_2_0= ruleEnumeration ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOil.g:1121:4: (lv_enumeration_2_0= ruleEnumeration )
                    {
                    // InternalOil.g:1121:4: (lv_enumeration_2_0= ruleEnumeration )
                    // InternalOil.g:1122:5: lv_enumeration_2_0= ruleEnumeration
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getEnumerationEnumerationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_enumeration_2_0=ruleEnumeration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrEnumDefRule());
                    					}
                    					set(
                    						current,
                    						"enumeration",
                    						lv_enumeration_2_0,
                    						"org.xtext.example.oil.Oil.Enumeration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1139:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:1140:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:1140:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:1141:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_3_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplAttrEnumDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.oil.Oil.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:1158:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOil.g:1159:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1159:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:1160:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_multiple_4_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrEnumDefRule());
                    					}
                    					set(
                    						current,
                    						"multiple",
                    						true,
                    						"org.xtext.example.oil.Oil.MultipleSpecifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1177:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOil.g:1178:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrEnumDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:1182:4: ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_ID) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==39||LA28_0==44) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalOil.g:1183:5: ( (lv_value_6_0= ruleName ) )
                            {
                            // InternalOil.g:1183:5: ( (lv_value_6_0= ruleName ) )
                            // InternalOil.g:1184:6: (lv_value_6_0= ruleName )
                            {
                            // InternalOil.g:1184:6: (lv_value_6_0= ruleName )
                            // InternalOil.g:1185:7: lv_value_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getValueNameParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_value_6_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrEnumDefRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_6_0,
                            								"org.xtext.example.oil.Oil.Name");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:1203:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1203:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:1204:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1204:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:1205:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_default_7_0=ruleDefaultEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrEnumDefRule());
                            							}
                            							set(
                            								current,
                            								"default",
                            								lv_default_7_0,
                            								"org.xtext.example.oil.Oil.DefaultEnum");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalOil.g:1224:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOil.g:1225:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrEnumDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:1229:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:1230:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:1230:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:1231:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplAttrEnumDefRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getImplAttrEnumDefAccess().getSEMICOLONTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplAttrEnumDef"


    // $ANTLR start "entryRuleImplAttrStringDef"
    // InternalOil.g:1257:1: entryRuleImplAttrStringDef returns [EObject current=null] : iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF ;
    public final EObject entryRuleImplAttrStringDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrStringDef = null;


        try {
            // InternalOil.g:1257:58: (iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF )
            // InternalOil.g:1258:2: iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF
            {
             newCompositeNode(grammarAccess.getImplAttrStringDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplAttrStringDef=ruleImplAttrStringDef();

            state._fsp--;

             current =iv_ruleImplAttrStringDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplAttrStringDef"


    // $ANTLR start "ruleImplAttrStringDef"
    // InternalOil.g:1264:1: ruleImplAttrStringDef returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? this_SEMICOLON_9= RULE_SEMICOLON ) ;
    public final EObject ruleImplAttrStringDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token this_SEMICOLON_9=null;
        EObject lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_multiple_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_default_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1270:2: ( (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? this_SEMICOLON_9= RULE_SEMICOLON ) )
            // InternalOil.g:1271:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? this_SEMICOLON_9= RULE_SEMICOLON )
            {
            // InternalOil.g:1271:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? this_SEMICOLON_9= RULE_SEMICOLON )
            // InternalOil.g:1272:3: otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? this_SEMICOLON_9= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrStringDefAccess().getSTRINGKeyword_0());
            		
            // InternalOil.g:1276:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOil.g:1277:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1277:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1278:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,29,FOLLOW_15); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrStringDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrStringDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1290:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:1291:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:1291:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:1292:5: lv_name_2_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getNameAttributeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_name_2_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplAttrStringDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.oil.Oil.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:1309:3: ( (lv_multiple_3_0= ruleMultipleSpecifier ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOil.g:1310:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1310:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    // InternalOil.g:1311:5: lv_multiple_3_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getMultipleMultipleSpecifierParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_multiple_3_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrStringDefRule());
                    					}
                    					set(
                    						current,
                    						"multiple",
                    						true,
                    						"org.xtext.example.oil.Oil.MultipleSpecifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1328:3: (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOil.g:1329:4: otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getImplAttrStringDefAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOil.g:1333:4: ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_STRING) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==39||LA33_0==44) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalOil.g:1334:5: ( (lv_value_5_0= ruleEString ) )
                            {
                            // InternalOil.g:1334:5: ( (lv_value_5_0= ruleEString ) )
                            // InternalOil.g:1335:6: (lv_value_5_0= ruleEString )
                            {
                            // InternalOil.g:1335:6: (lv_value_5_0= ruleEString )
                            // InternalOil.g:1336:7: lv_value_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getValueEStringParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_value_5_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrStringDefRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_5_0,
                            								"org.xtext.example.oil.Oil.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:1354:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1354:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            // InternalOil.g:1355:6: (lv_default_6_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1355:6: (lv_default_6_0= ruleDefaultEnum )
                            // InternalOil.g:1356:7: lv_default_6_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getDefaultDefaultEnumEnumRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_default_6_0=ruleDefaultEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrStringDefRule());
                            							}
                            							set(
                            								current,
                            								"default",
                            								lv_default_6_0,
                            								"org.xtext.example.oil.Oil.DefaultEnum");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalOil.g:1375:3: (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOil.g:1376:4: otherlv_7= ':' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getImplAttrStringDefAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:1380:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalOil.g:1381:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalOil.g:1381:5: (lv_description_8_0= ruleEString )
                    // InternalOil.g:1382:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplAttrStringDefRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_8_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_9=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_9, grammarAccess.getImplAttrStringDefAccess().getSEMICOLONTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplAttrStringDef"


    // $ANTLR start "entryRuleImplAttrBooleanDef"
    // InternalOil.g:1408:1: entryRuleImplAttrBooleanDef returns [EObject current=null] : iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF ;
    public final EObject entryRuleImplAttrBooleanDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrBooleanDef = null;


        try {
            // InternalOil.g:1408:59: (iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF )
            // InternalOil.g:1409:2: iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF
            {
             newCompositeNode(grammarAccess.getImplAttrBooleanDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplAttrBooleanDef=ruleImplAttrBooleanDef();

            state._fsp--;

             current =iv_ruleImplAttrBooleanDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplAttrBooleanDef"


    // $ANTLR start "ruleImplAttrBooleanDef"
    // InternalOil.g:1415:1: ruleImplAttrBooleanDef returns [EObject current=null] : (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? this_SEMICOLON_22= RULE_SEMICOLON ) ;
    public final EObject ruleImplAttrBooleanDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_2=null;
        Token this_T_TRUE_3=null;
        Token this_BLOCKBEGIN_4=null;
        Token this_BLOCKEND_6=null;
        Token otherlv_8=null;
        Token this_T_FALSE_9=null;
        Token this_BLOCKBEGIN_10=null;
        Token this_BLOCKEND_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token this_SEMICOLON_22=null;
        EObject lv_trueParameterList_5_0 = null;

        AntlrDatatypeRuleToken lv_trueDescription_7_0 = null;

        EObject lv_falseParameterList_11_0 = null;

        AntlrDatatypeRuleToken lv_falseDescription_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_1 = null;

        AntlrDatatypeRuleToken lv_name_15_2 = null;

        AntlrDatatypeRuleToken lv_multiple_16_0 = null;

        AntlrDatatypeRuleToken lv_value_18_0 = null;

        Enumerator lv_default_19_0 = null;

        AntlrDatatypeRuleToken lv_description_21_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1421:2: ( (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? this_SEMICOLON_22= RULE_SEMICOLON ) )
            // InternalOil.g:1422:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? this_SEMICOLON_22= RULE_SEMICOLON )
            {
            // InternalOil.g:1422:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? this_SEMICOLON_22= RULE_SEMICOLON )
            // InternalOil.g:1423:3: otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? this_SEMICOLON_22= RULE_SEMICOLON
            {
            otherlv_0=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrBooleanDefAccess().getBOOLEANKeyword_0());
            		
            // InternalOil.g:1427:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOil.g:1428:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1428:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1429:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,29,FOLLOW_22); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrBooleanDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrBooleanDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1441:3: (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==35) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOil.g:1442:4: otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplAttrBooleanDefAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    this_T_TRUE_3=(Token)match(input,RULE_T_TRUE,FOLLOW_24); 

                    				newLeafNode(this_T_TRUE_3, grammarAccess.getImplAttrBooleanDefAccess().getT_TRUETerminalRuleCall_2_1());
                    			
                    // InternalOil.g:1450:4: (this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_BLOCKBEGIN) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalOil.g:1451:5: this_BLOCKBEGIN_4= RULE_BLOCKBEGIN ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* this_BLOCKEND_6= RULE_BLOCKEND
                            {
                            this_BLOCKBEGIN_4=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_14); 

                            					newLeafNode(this_BLOCKBEGIN_4, grammarAccess.getImplAttrBooleanDefAccess().getBLOCKBEGINTerminalRuleCall_2_2_0());
                            				
                            // InternalOil.g:1455:5: ( (lv_trueParameterList_5_0= ruleImplementationDef ) )*
                            loop37:
                            do {
                                int alt37=2;
                                int LA37_0 = input.LA(1);

                                if ( ((LA37_0>=30 && LA37_0<=34)||(LA37_0>=40 && LA37_0<=43)||(LA37_0>=45 && LA37_0<=64)) ) {
                                    alt37=1;
                                }


                                switch (alt37) {
                            	case 1 :
                            	    // InternalOil.g:1456:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:1456:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    // InternalOil.g:1457:7: lv_trueParameterList_5_0= ruleImplementationDef
                            	    {

                            	    							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getTrueParameterListImplementationDefParserRuleCall_2_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_14);
                            	    lv_trueParameterList_5_0=ruleImplementationDef();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"trueParameterList",
                            	    								lv_trueParameterList_5_0,
                            	    								"org.xtext.example.oil.Oil.ImplementationDef");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop37;
                                }
                            } while (true);

                            this_BLOCKEND_6=(Token)match(input,RULE_BLOCKEND,FOLLOW_25); 

                            					newLeafNode(this_BLOCKEND_6, grammarAccess.getImplAttrBooleanDefAccess().getBLOCKENDTerminalRuleCall_2_2_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:1479:4: ( (lv_trueDescription_7_0= ruleEString ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_STRING) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalOil.g:1480:5: (lv_trueDescription_7_0= ruleEString )
                            {
                            // InternalOil.g:1480:5: (lv_trueDescription_7_0= ruleEString )
                            // InternalOil.g:1481:6: lv_trueDescription_7_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getTrueDescriptionEStringParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_26);
                            lv_trueDescription_7_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                            						}
                            						set(
                            							current,
                            							"trueDescription",
                            							lv_trueDescription_7_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,36,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrBooleanDefAccess().getCommaKeyword_2_4());
                    			
                    this_T_FALSE_9=(Token)match(input,RULE_T_FALSE,FOLLOW_28); 

                    				newLeafNode(this_T_FALSE_9, grammarAccess.getImplAttrBooleanDefAccess().getT_FALSETerminalRuleCall_2_5());
                    			
                    // InternalOil.g:1506:4: (this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_BLOCKBEGIN) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalOil.g:1507:5: this_BLOCKBEGIN_10= RULE_BLOCKBEGIN ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* this_BLOCKEND_12= RULE_BLOCKEND
                            {
                            this_BLOCKBEGIN_10=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_14); 

                            					newLeafNode(this_BLOCKBEGIN_10, grammarAccess.getImplAttrBooleanDefAccess().getBLOCKBEGINTerminalRuleCall_2_6_0());
                            				
                            // InternalOil.g:1511:5: ( (lv_falseParameterList_11_0= ruleImplementationDef ) )*
                            loop40:
                            do {
                                int alt40=2;
                                int LA40_0 = input.LA(1);

                                if ( ((LA40_0>=30 && LA40_0<=34)||(LA40_0>=40 && LA40_0<=43)||(LA40_0>=45 && LA40_0<=64)) ) {
                                    alt40=1;
                                }


                                switch (alt40) {
                            	case 1 :
                            	    // InternalOil.g:1512:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:1512:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    // InternalOil.g:1513:7: lv_falseParameterList_11_0= ruleImplementationDef
                            	    {

                            	    							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getFalseParameterListImplementationDefParserRuleCall_2_6_1_0());
                            	    						
                            	    pushFollow(FOLLOW_14);
                            	    lv_falseParameterList_11_0=ruleImplementationDef();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"falseParameterList",
                            	    								lv_falseParameterList_11_0,
                            	    								"org.xtext.example.oil.Oil.ImplementationDef");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop40;
                                }
                            } while (true);

                            this_BLOCKEND_12=(Token)match(input,RULE_BLOCKEND,FOLLOW_29); 

                            					newLeafNode(this_BLOCKEND_12, grammarAccess.getImplAttrBooleanDefAccess().getBLOCKENDTerminalRuleCall_2_6_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:1535:4: ( (lv_falseDescription_13_0= ruleEString ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_STRING) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalOil.g:1536:5: (lv_falseDescription_13_0= ruleEString )
                            {
                            // InternalOil.g:1536:5: (lv_falseDescription_13_0= ruleEString )
                            // InternalOil.g:1537:6: lv_falseDescription_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getFalseDescriptionEStringParserRuleCall_2_7_0());
                            					
                            pushFollow(FOLLOW_30);
                            lv_falseDescription_13_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                            						}
                            						set(
                            							current,
                            							"falseDescription",
                            							lv_falseDescription_13_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,37,FOLLOW_31); 

                    				newLeafNode(otherlv_14, grammarAccess.getImplAttrBooleanDefAccess().getRightSquareBracketKeyword_2_8());
                    			

                    }
                    break;

            }

            // InternalOil.g:1559:3: ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) )
            // InternalOil.g:1560:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            {
            // InternalOil.g:1560:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            // InternalOil.g:1561:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            {
            // InternalOil.g:1561:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_T_OBJECT) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalOil.g:1562:6: lv_name_15_1= ruleName
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameNameParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_15_1=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_15_1,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalOil.g:1578:6: lv_name_15_2= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameObjectParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_16);
                    lv_name_15_2=ruleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_15_2,
                    							"org.xtext.example.oil.Oil.Object");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalOil.g:1596:3: ( (lv_multiple_16_0= ruleMultipleSpecifier ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOil.g:1597:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1597:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    // InternalOil.g:1598:5: lv_multiple_16_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_multiple_16_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                    					}
                    					set(
                    						current,
                    						"multiple",
                    						true,
                    						"org.xtext.example.oil.Oil.MultipleSpecifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1615:3: (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==26) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOil.g:1616:4: otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_17=(Token)match(input,26,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getImplAttrBooleanDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:1620:4: ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=RULE_T_TRUE && LA46_0<=RULE_T_FALSE)) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==39||LA46_0==44) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalOil.g:1621:5: ( (lv_value_18_0= ruleEBoolean ) )
                            {
                            // InternalOil.g:1621:5: ( (lv_value_18_0= ruleEBoolean ) )
                            // InternalOil.g:1622:6: (lv_value_18_0= ruleEBoolean )
                            {
                            // InternalOil.g:1622:6: (lv_value_18_0= ruleEBoolean )
                            // InternalOil.g:1623:7: lv_value_18_0= ruleEBoolean
                            {

                            							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getValueEBooleanParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_value_18_0=ruleEBoolean();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_18_0,
                            								"org.xtext.example.oil.Oil.EBoolean");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:1641:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1641:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            // InternalOil.g:1642:6: (lv_default_19_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1642:6: (lv_default_19_0= ruleDefaultEnum )
                            // InternalOil.g:1643:7: lv_default_19_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_default_19_0=ruleDefaultEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                            							}
                            							set(
                            								current,
                            								"default",
                            								lv_default_19_0,
                            								"org.xtext.example.oil.Oil.DefaultEnum");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalOil.g:1662:3: (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==27) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOil.g:1663:4: otherlv_20= ':' ( (lv_description_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getImplAttrBooleanDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:1667:4: ( (lv_description_21_0= ruleEString ) )
                    // InternalOil.g:1668:5: (lv_description_21_0= ruleEString )
                    {
                    // InternalOil.g:1668:5: (lv_description_21_0= ruleEString )
                    // InternalOil.g:1669:6: lv_description_21_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_21_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplAttrBooleanDefRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_21_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_SEMICOLON_22=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_22, grammarAccess.getImplAttrBooleanDefAccess().getSEMICOLONTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplAttrBooleanDef"


    // $ANTLR start "entryRuleRange"
    // InternalOil.g:1695:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalOil.g:1695:46: (iv_ruleRange= ruleRange EOF )
            // InternalOil.g:1696:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalOil.g:1702:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_begin_2_0 = null;

        AntlrDatatypeRuleToken lv_end_4_0 = null;

        AntlrDatatypeRuleToken lv_numbers_5_0 = null;

        AntlrDatatypeRuleToken lv_numbers_7_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1708:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) )
            // InternalOil.g:1709:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            {
            // InternalOil.g:1709:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            // InternalOil.g:1710:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:1714:3: ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_T_NUMBER) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt50=1;
                    }
                    break;
                case 36:
                    {
                    alt50=3;
                    }
                    break;
                case 38:
                    {
                    alt50=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalOil.g:1715:4: ( (lv_value_1_0= ruleNumber ) )
                    {
                    // InternalOil.g:1715:4: ( (lv_value_1_0= ruleNumber ) )
                    // InternalOil.g:1716:5: (lv_value_1_0= ruleNumber )
                    {
                    // InternalOil.g:1716:5: (lv_value_1_0= ruleNumber )
                    // InternalOil.g:1717:6: lv_value_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getValueNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_value_1_0=ruleNumber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.xtext.example.oil.Oil.Number");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:1735:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    {
                    // InternalOil.g:1735:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    // InternalOil.g:1736:5: ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) )
                    {
                    // InternalOil.g:1736:5: ( (lv_begin_2_0= ruleNumber ) )
                    // InternalOil.g:1737:6: (lv_begin_2_0= ruleNumber )
                    {
                    // InternalOil.g:1737:6: (lv_begin_2_0= ruleNumber )
                    // InternalOil.g:1738:7: lv_begin_2_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getBeginNumberParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_34);
                    lv_begin_2_0=ruleNumber();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRangeRule());
                    							}
                    							set(
                    								current,
                    								"begin",
                    								lv_begin_2_0,
                    								"org.xtext.example.oil.Oil.Number");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_33); 

                    					newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_1_1_1());
                    				
                    // InternalOil.g:1759:5: ( (lv_end_4_0= ruleNumber ) )
                    // InternalOil.g:1760:6: (lv_end_4_0= ruleNumber )
                    {
                    // InternalOil.g:1760:6: (lv_end_4_0= ruleNumber )
                    // InternalOil.g:1761:7: lv_end_4_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getEndNumberParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_30);
                    lv_end_4_0=ruleNumber();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRangeRule());
                    							}
                    							set(
                    								current,
                    								"end",
                    								lv_end_4_0,
                    								"org.xtext.example.oil.Oil.Number");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:1780:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    {
                    // InternalOil.g:1780:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    // InternalOil.g:1781:5: ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    {
                    // InternalOil.g:1781:5: ( (lv_numbers_5_0= ruleNumber ) )
                    // InternalOil.g:1782:6: (lv_numbers_5_0= ruleNumber )
                    {
                    // InternalOil.g:1782:6: (lv_numbers_5_0= ruleNumber )
                    // InternalOil.g:1783:7: lv_numbers_5_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getNumbersNumberParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_numbers_5_0=ruleNumber();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRangeRule());
                    							}
                    							add(
                    								current,
                    								"numbers",
                    								lv_numbers_5_0,
                    								"org.xtext.example.oil.Oil.Number");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalOil.g:1800:5: (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==36) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalOil.g:1801:6: otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) )
                    	    {
                    	    otherlv_6=(Token)match(input,36,FOLLOW_33); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getRangeAccess().getCommaKeyword_1_2_1_0());
                    	    					
                    	    // InternalOil.g:1805:6: ( (lv_numbers_7_0= ruleNumber ) )
                    	    // InternalOil.g:1806:7: (lv_numbers_7_0= ruleNumber )
                    	    {
                    	    // InternalOil.g:1806:7: (lv_numbers_7_0= ruleNumber )
                    	    // InternalOil.g:1807:8: lv_numbers_7_0= ruleNumber
                    	    {

                    	    								newCompositeNode(grammarAccess.getRangeAccess().getNumbersNumberParserRuleCall_1_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_35);
                    	    lv_numbers_7_0=ruleNumber();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getRangeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"numbers",
                    	    									lv_numbers_7_0,
                    	    									"org.xtext.example.oil.Oil.Number");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getRangeAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleEnumeration"
    // InternalOil.g:1835:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalOil.g:1835:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalOil.g:1836:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalOil.g:1842:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1848:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) )
            // InternalOil.g:1849:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            {
            // InternalOil.g:1849:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            // InternalOil.g:1850:3: otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:1854:3: ( (lv_list_1_0= ruleEnumerator ) )
            // InternalOil.g:1855:4: (lv_list_1_0= ruleEnumerator )
            {
            // InternalOil.g:1855:4: (lv_list_1_0= ruleEnumerator )
            // InternalOil.g:1856:5: lv_list_1_0= ruleEnumerator
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListEnumeratorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_list_1_0=ruleEnumerator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.xtext.example.oil.Oil.Enumerator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:1873:3: (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==36) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalOil.g:1874:4: otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) )
            	    {
            	    otherlv_2=(Token)match(input,36,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOil.g:1878:4: ( (lv_list_3_0= ruleEnumerator ) )
            	    // InternalOil.g:1879:5: (lv_list_3_0= ruleEnumerator )
            	    {
            	    // InternalOil.g:1879:5: (lv_list_3_0= ruleEnumerator )
            	    // InternalOil.g:1880:6: lv_list_3_0= ruleEnumerator
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getListEnumeratorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_35);
            	    lv_list_3_0=ruleEnumerator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_3_0,
            	    							"org.xtext.example.oil.Oil.Enumerator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerator"
    // InternalOil.g:1906:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // InternalOil.g:1906:51: (iv_ruleEnumerator= ruleEnumerator EOF )
            // InternalOil.g:1907:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
             newCompositeNode(grammarAccess.getEnumeratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;

             current =iv_ruleEnumerator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerator"


    // $ANTLR start "ruleEnumerator"
    // InternalOil.g:1913:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implParameterList_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ( (lv_description_4_0= ruleEString ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token this_BLOCKBEGIN_1=null;
        Token this_BLOCKEND_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_implParameterList_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1919:2: ( ( ( (lv_name_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implParameterList_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ( (lv_description_4_0= ruleEString ) )? ) )
            // InternalOil.g:1920:2: ( ( (lv_name_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implParameterList_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ( (lv_description_4_0= ruleEString ) )? )
            {
            // InternalOil.g:1920:2: ( ( (lv_name_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implParameterList_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ( (lv_description_4_0= ruleEString ) )? )
            // InternalOil.g:1921:3: ( (lv_name_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implParameterList_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ( (lv_description_4_0= ruleEString ) )?
            {
            // InternalOil.g:1921:3: ( (lv_name_0_0= ruleName ) )
            // InternalOil.g:1922:4: (lv_name_0_0= ruleName )
            {
            // InternalOil.g:1922:4: (lv_name_0_0= ruleName )
            // InternalOil.g:1923:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getEnumeratorAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumeratorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:1940:3: (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implParameterList_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_BLOCKBEGIN) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOil.g:1941:4: this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_implParameterList_2_0= ruleImplementationDef ) )* this_BLOCKEND_3= RULE_BLOCKEND
                    {
                    this_BLOCKBEGIN_1=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_14); 

                    				newLeafNode(this_BLOCKBEGIN_1, grammarAccess.getEnumeratorAccess().getBLOCKBEGINTerminalRuleCall_1_0());
                    			
                    // InternalOil.g:1945:4: ( (lv_implParameterList_2_0= ruleImplementationDef ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=30 && LA52_0<=34)||(LA52_0>=40 && LA52_0<=43)||(LA52_0>=45 && LA52_0<=64)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalOil.g:1946:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    {
                    	    // InternalOil.g:1946:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    // InternalOil.g:1947:6: lv_implParameterList_2_0= ruleImplementationDef
                    	    {

                    	    						newCompositeNode(grammarAccess.getEnumeratorAccess().getImplParameterListImplementationDefParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_implParameterList_2_0=ruleImplementationDef();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEnumeratorRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"implParameterList",
                    	    							lv_implParameterList_2_0,
                    	    							"org.xtext.example.oil.Oil.ImplementationDef");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    this_BLOCKEND_3=(Token)match(input,RULE_BLOCKEND,FOLLOW_37); 

                    				newLeafNode(this_BLOCKEND_3, grammarAccess.getEnumeratorAccess().getBLOCKENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:1969:3: ( (lv_description_4_0= ruleEString ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOil.g:1970:4: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:1970:4: (lv_description_4_0= ruleEString )
                    // InternalOil.g:1971:5: lv_description_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getEnumeratorAccess().getDescriptionEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEnumeratorRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerator"


    // $ANTLR start "entryRuleImplRefDef"
    // InternalOil.g:1992:1: entryRuleImplRefDef returns [EObject current=null] : iv_ruleImplRefDef= ruleImplRefDef EOF ;
    public final EObject entryRuleImplRefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplRefDef = null;


        try {
            // InternalOil.g:1992:51: (iv_ruleImplRefDef= ruleImplRefDef EOF )
            // InternalOil.g:1993:2: iv_ruleImplRefDef= ruleImplRefDef EOF
            {
             newCompositeNode(grammarAccess.getImplRefDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplRefDef=ruleImplRefDef();

            state._fsp--;

             current =iv_ruleImplRefDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplRefDef"


    // $ANTLR start "ruleImplRefDef"
    // InternalOil.g:1999:1: ruleImplRefDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleImplRefDef() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_multiple_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2005:2: ( ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalOil.g:2006:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalOil.g:2006:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalOil.g:2007:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON
            {
            // InternalOil.g:2007:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) )
            // InternalOil.g:2008:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            {
            // InternalOil.g:2008:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            // InternalOil.g:2009:5: lv_type_0_0= ruleObjectRefTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplRefDefAccess().getTypeObjectRefTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_type_0_0=ruleObjectRefTypeEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplRefDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.oil.Oil.ObjectRefTypeEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2026:3: ( (lv_name_1_0= ruleAttributeName ) )
            // InternalOil.g:2027:4: (lv_name_1_0= ruleAttributeName )
            {
            // InternalOil.g:2027:4: (lv_name_1_0= ruleAttributeName )
            // InternalOil.g:2028:5: lv_name_1_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplRefDefAccess().getNameAttributeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_38);
            lv_name_1_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplRefDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2045:3: ( (lv_multiple_2_0= ruleMultipleSpecifier ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==35) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOil.g:2046:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2046:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    // InternalOil.g:2047:5: lv_multiple_2_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplRefDefAccess().getMultipleMultipleSpecifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_multiple_2_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplRefDefRule());
                    					}
                    					set(
                    						current,
                    						"multiple",
                    						true,
                    						"org.xtext.example.oil.Oil.MultipleSpecifier");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2064:3: ( (lv_description_3_0= ruleEString ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_STRING) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalOil.g:2065:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:2065:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:2066:5: lv_description_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getImplRefDefAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImplRefDefRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_3_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getImplRefDefAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplRefDef"


    // $ANTLR start "entryRuleMultipleSpecifier"
    // InternalOil.g:2091:1: entryRuleMultipleSpecifier returns [String current=null] : iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF ;
    public final String entryRuleMultipleSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultipleSpecifier = null;


        try {
            // InternalOil.g:2091:57: (iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF )
            // InternalOil.g:2092:2: iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF
            {
             newCompositeNode(grammarAccess.getMultipleSpecifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleSpecifier=ruleMultipleSpecifier();

            state._fsp--;

             current =iv_ruleMultipleSpecifier.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleSpecifier"


    // $ANTLR start "ruleMultipleSpecifier"
    // InternalOil.g:2098:1: ruleMultipleSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleMultipleSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:2104:2: ( (kw= '[' kw= ']' ) )
            // InternalOil.g:2105:2: (kw= '[' kw= ']' )
            {
            // InternalOil.g:2105:2: (kw= '[' kw= ']' )
            // InternalOil.g:2106:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,35,FOLLOW_30); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMultipleSpecifierAccess().getLeftSquareBracketKeyword_0());
            		
            kw=(Token)match(input,37,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMultipleSpecifierAccess().getRightSquareBracketKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleSpecifier"


    // $ANTLR start "entryRuleApplicationDefinition"
    // InternalOil.g:2120:1: entryRuleApplicationDefinition returns [EObject current=null] : iv_ruleApplicationDefinition= ruleApplicationDefinition EOF ;
    public final EObject entryRuleApplicationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationDefinition = null;


        try {
            // InternalOil.g:2120:62: (iv_ruleApplicationDefinition= ruleApplicationDefinition EOF )
            // InternalOil.g:2121:2: iv_ruleApplicationDefinition= ruleApplicationDefinition EOF
            {
             newCompositeNode(grammarAccess.getApplicationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationDefinition=ruleApplicationDefinition();

            state._fsp--;

             current =iv_ruleApplicationDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplicationDefinition"


    // $ANTLR start "ruleApplicationDefinition"
    // InternalOil.g:2127:1: ruleApplicationDefinition returns [EObject current=null] : (this_T_CPU_0= RULE_T_CPU ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON ) ;
    public final EObject ruleApplicationDefinition() throws RecognitionException {
        EObject current = null;

        Token this_T_CPU_0=null;
        Token this_BLOCKBEGIN_2=null;
        Token this_BLOCKEND_4=null;
        Token this_SEMICOLON_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_objectDefinitionList_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2133:2: ( (this_T_CPU_0= RULE_T_CPU ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON ) )
            // InternalOil.g:2134:2: (this_T_CPU_0= RULE_T_CPU ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            {
            // InternalOil.g:2134:2: (this_T_CPU_0= RULE_T_CPU ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            // InternalOil.g:2135:3: this_T_CPU_0= RULE_T_CPU ( (lv_name_1_0= ruleName ) ) this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* this_BLOCKEND_4= RULE_BLOCKEND ( (lv_description_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON
            {
            this_T_CPU_0=(Token)match(input,RULE_T_CPU,FOLLOW_10); 

            			newLeafNode(this_T_CPU_0, grammarAccess.getApplicationDefinitionAccess().getT_CPUTerminalRuleCall_0());
            		
            // InternalOil.g:2139:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:2140:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:2140:4: (lv_name_1_0= ruleName )
            // InternalOil.g:2141:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BLOCKBEGIN_2=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_12); 

            			newLeafNode(this_BLOCKBEGIN_2, grammarAccess.getApplicationDefinitionAccess().getBLOCKBEGINTerminalRuleCall_2());
            		
            // InternalOil.g:2162:3: ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_T_OBJECT) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalOil.g:2163:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    {
            	    // InternalOil.g:2163:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    // InternalOil.g:2164:5: lv_objectDefinitionList_3_0= ruleObjectDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getObjectDefinitionListObjectDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_objectDefinitionList_3_0=ruleObjectDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objectDefinitionList",
            	    						lv_objectDefinitionList_3_0,
            	    						"org.xtext.example.oil.Oil.ObjectDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

            this_BLOCKEND_4=(Token)match(input,RULE_BLOCKEND,FOLLOW_13); 

            			newLeafNode(this_BLOCKEND_4, grammarAccess.getApplicationDefinitionAccess().getBLOCKENDTerminalRuleCall_4());
            		
            // InternalOil.g:2185:3: ( (lv_description_5_0= ruleEString ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalOil.g:2186:4: (lv_description_5_0= ruleEString )
                    {
                    // InternalOil.g:2186:4: (lv_description_5_0= ruleEString )
                    // InternalOil.g:2187:5: lv_description_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getDescriptionEStringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_5_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getApplicationDefinitionAccess().getSEMICOLONTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplicationDefinition"


    // $ANTLR start "entryRuleObjectDefinition"
    // InternalOil.g:2212:1: entryRuleObjectDefinition returns [EObject current=null] : iv_ruleObjectDefinition= ruleObjectDefinition EOF ;
    public final EObject entryRuleObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDefinition = null;


        try {
            // InternalOil.g:2212:57: (iv_ruleObjectDefinition= ruleObjectDefinition EOF )
            // InternalOil.g:2213:2: iv_ruleObjectDefinition= ruleObjectDefinition EOF
            {
             newCompositeNode(grammarAccess.getObjectDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectDefinition=ruleObjectDefinition();

            state._fsp--;

             current =iv_ruleObjectDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectDefinition"


    // $ANTLR start "ruleObjectDefinition"
    // InternalOil.g:2219:1: ruleObjectDefinition returns [EObject current=null] : ( ( (lv_object_0_0= ruleObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )* this_BLOCKEND_5= RULE_BLOCKEND )? ( (lv_descrption_6_0= ruleEString ) )? this_SEMICOLON_7= RULE_SEMICOLON ) ;
    public final EObject ruleObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token this_BLOCKBEGIN_2=null;
        Token this_BLOCKEND_5=null;
        Token this_SEMICOLON_7=null;
        AntlrDatatypeRuleToken lv_object_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterList_3_0 = null;

        EObject lv_reObjectDefinition_4_0 = null;

        AntlrDatatypeRuleToken lv_descrption_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2225:2: ( ( ( (lv_object_0_0= ruleObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )* this_BLOCKEND_5= RULE_BLOCKEND )? ( (lv_descrption_6_0= ruleEString ) )? this_SEMICOLON_7= RULE_SEMICOLON ) )
            // InternalOil.g:2226:2: ( ( (lv_object_0_0= ruleObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )* this_BLOCKEND_5= RULE_BLOCKEND )? ( (lv_descrption_6_0= ruleEString ) )? this_SEMICOLON_7= RULE_SEMICOLON )
            {
            // InternalOil.g:2226:2: ( ( (lv_object_0_0= ruleObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )* this_BLOCKEND_5= RULE_BLOCKEND )? ( (lv_descrption_6_0= ruleEString ) )? this_SEMICOLON_7= RULE_SEMICOLON )
            // InternalOil.g:2227:3: ( (lv_object_0_0= ruleObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )* this_BLOCKEND_5= RULE_BLOCKEND )? ( (lv_descrption_6_0= ruleEString ) )? this_SEMICOLON_7= RULE_SEMICOLON
            {
            // InternalOil.g:2227:3: ( (lv_object_0_0= ruleObject ) )
            // InternalOil.g:2228:4: (lv_object_0_0= ruleObject )
            {
            // InternalOil.g:2228:4: (lv_object_0_0= ruleObject )
            // InternalOil.g:2229:5: lv_object_0_0= ruleObject
            {

            					newCompositeNode(grammarAccess.getObjectDefinitionAccess().getObjectObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_object_0_0=ruleObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
            					}
            					set(
            						current,
            						"object",
            						lv_object_0_0,
            						"org.xtext.example.oil.Oil.Object");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2246:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:2247:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:2247:4: (lv_name_1_0= ruleName )
            // InternalOil.g:2248:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getObjectDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2265:3: (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )* this_BLOCKEND_5= RULE_BLOCKEND )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_BLOCKBEGIN) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOil.g:2266:4: this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )* this_BLOCKEND_5= RULE_BLOCKEND
                    {
                    this_BLOCKBEGIN_2=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_40); 

                    				newLeafNode(this_BLOCKBEGIN_2, grammarAccess.getObjectDefinitionAccess().getBLOCKBEGINTerminalRuleCall_2_0());
                    			
                    // InternalOil.g:2270:4: ( (lv_parameterList_3_0= ruleAttribute ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_T_OBJECT||LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalOil.g:2271:5: (lv_parameterList_3_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:2271:5: (lv_parameterList_3_0= ruleAttribute )
                    	    // InternalOil.g:2272:6: lv_parameterList_3_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getParameterListAttributeParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_40);
                    	    lv_parameterList_3_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameterList",
                    	    							lv_parameterList_3_0,
                    	    							"org.xtext.example.oil.Oil.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // InternalOil.g:2289:4: ( (lv_reObjectDefinition_4_0= ruleReObjectDefinition ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_T_REOBJECT) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalOil.g:2290:5: (lv_reObjectDefinition_4_0= ruleReObjectDefinition )
                    	    {
                    	    // InternalOil.g:2290:5: (lv_reObjectDefinition_4_0= ruleReObjectDefinition )
                    	    // InternalOil.g:2291:6: lv_reObjectDefinition_4_0= ruleReObjectDefinition
                    	    {

                    	    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getReObjectDefinitionReObjectDefinitionParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_41);
                    	    lv_reObjectDefinition_4_0=ruleReObjectDefinition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                    	    						}
                    	    						set(
                    	    							current,
                    	    							"reObjectDefinition",
                    	    							lv_reObjectDefinition_4_0,
                    	    							"org.xtext.example.oil.Oil.ReObjectDefinition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    this_BLOCKEND_5=(Token)match(input,RULE_BLOCKEND,FOLLOW_13); 

                    				newLeafNode(this_BLOCKEND_5, grammarAccess.getObjectDefinitionAccess().getBLOCKENDTerminalRuleCall_2_3());
                    			

                    }
                    break;

            }

            // InternalOil.g:2313:3: ( (lv_descrption_6_0= ruleEString ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOil.g:2314:4: (lv_descrption_6_0= ruleEString )
                    {
                    // InternalOil.g:2314:4: (lv_descrption_6_0= ruleEString )
                    // InternalOil.g:2315:5: lv_descrption_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getObjectDefinitionAccess().getDescrptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_descrption_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"descrption",
                    						lv_descrption_6_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_7=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_7, grammarAccess.getObjectDefinitionAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectDefinition"


    // $ANTLR start "entryRuleReObjectDefinition"
    // InternalOil.g:2340:1: entryRuleReObjectDefinition returns [EObject current=null] : iv_ruleReObjectDefinition= ruleReObjectDefinition EOF ;
    public final EObject entryRuleReObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReObjectDefinition = null;


        try {
            // InternalOil.g:2340:59: (iv_ruleReObjectDefinition= ruleReObjectDefinition EOF )
            // InternalOil.g:2341:2: iv_ruleReObjectDefinition= ruleReObjectDefinition EOF
            {
             newCompositeNode(grammarAccess.getReObjectDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReObjectDefinition=ruleReObjectDefinition();

            state._fsp--;

             current =iv_ruleReObjectDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReObjectDefinition"


    // $ANTLR start "ruleReObjectDefinition"
    // InternalOil.g:2347:1: ruleReObjectDefinition returns [EObject current=null] : ( ( (lv_reobject_0_0= ruleReObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* this_BLOCKEND_4= RULE_BLOCKEND )? ( (lv_descrption_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON ) ;
    public final EObject ruleReObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token this_BLOCKBEGIN_2=null;
        Token this_BLOCKEND_4=null;
        Token this_SEMICOLON_6=null;
        AntlrDatatypeRuleToken lv_reobject_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterList_3_0 = null;

        AntlrDatatypeRuleToken lv_descrption_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2353:2: ( ( ( (lv_reobject_0_0= ruleReObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* this_BLOCKEND_4= RULE_BLOCKEND )? ( (lv_descrption_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON ) )
            // InternalOil.g:2354:2: ( ( (lv_reobject_0_0= ruleReObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* this_BLOCKEND_4= RULE_BLOCKEND )? ( (lv_descrption_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            {
            // InternalOil.g:2354:2: ( ( (lv_reobject_0_0= ruleReObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* this_BLOCKEND_4= RULE_BLOCKEND )? ( (lv_descrption_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON )
            // InternalOil.g:2355:3: ( (lv_reobject_0_0= ruleReObject ) ) ( (lv_name_1_0= ruleName ) ) (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* this_BLOCKEND_4= RULE_BLOCKEND )? ( (lv_descrption_5_0= ruleEString ) )? this_SEMICOLON_6= RULE_SEMICOLON
            {
            // InternalOil.g:2355:3: ( (lv_reobject_0_0= ruleReObject ) )
            // InternalOil.g:2356:4: (lv_reobject_0_0= ruleReObject )
            {
            // InternalOil.g:2356:4: (lv_reobject_0_0= ruleReObject )
            // InternalOil.g:2357:5: lv_reobject_0_0= ruleReObject
            {

            					newCompositeNode(grammarAccess.getReObjectDefinitionAccess().getReobjectReObjectParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_reobject_0_0=ruleReObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReObjectDefinitionRule());
            					}
            					set(
            						current,
            						"reobject",
            						lv_reobject_0_0,
            						"org.xtext.example.oil.Oil.ReObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2374:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:2375:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:2375:4: (lv_name_1_0= ruleName )
            // InternalOil.g:2376:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getReObjectDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReObjectDefinitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2393:3: (this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* this_BLOCKEND_4= RULE_BLOCKEND )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_BLOCKBEGIN) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOil.g:2394:4: this_BLOCKBEGIN_2= RULE_BLOCKBEGIN ( (lv_parameterList_3_0= ruleAttribute ) )* this_BLOCKEND_4= RULE_BLOCKEND
                    {
                    this_BLOCKBEGIN_2=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_42); 

                    				newLeafNode(this_BLOCKBEGIN_2, grammarAccess.getReObjectDefinitionAccess().getBLOCKBEGINTerminalRuleCall_2_0());
                    			
                    // InternalOil.g:2398:4: ( (lv_parameterList_3_0= ruleAttribute ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_T_OBJECT||LA63_0==RULE_ID) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalOil.g:2399:5: (lv_parameterList_3_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:2399:5: (lv_parameterList_3_0= ruleAttribute )
                    	    // InternalOil.g:2400:6: lv_parameterList_3_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getReObjectDefinitionAccess().getParameterListAttributeParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
                    	    lv_parameterList_3_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getReObjectDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameterList",
                    	    							lv_parameterList_3_0,
                    	    							"org.xtext.example.oil.Oil.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    this_BLOCKEND_4=(Token)match(input,RULE_BLOCKEND,FOLLOW_13); 

                    				newLeafNode(this_BLOCKEND_4, grammarAccess.getReObjectDefinitionAccess().getBLOCKENDTerminalRuleCall_2_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:2422:3: ( (lv_descrption_5_0= ruleEString ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOil.g:2423:4: (lv_descrption_5_0= ruleEString )
                    {
                    // InternalOil.g:2423:4: (lv_descrption_5_0= ruleEString )
                    // InternalOil.g:2424:5: lv_descrption_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getReObjectDefinitionAccess().getDescrptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_descrption_5_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReObjectDefinitionRule());
                    					}
                    					set(
                    						current,
                    						"descrption",
                    						lv_descrption_5_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getReObjectDefinitionAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReObjectDefinition"


    // $ANTLR start "entryRuleAttribute"
    // InternalOil.g:2449:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOil.g:2449:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOil.g:2450:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalOil.g:2456:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SEMICOLON_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2462:2: ( ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON ) )
            // InternalOil.g:2463:2: ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON )
            {
            // InternalOil.g:2463:2: ( ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON )
            // InternalOil.g:2464:3: ( (lv_name_0_0= ruleAttributeName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? this_SEMICOLON_4= RULE_SEMICOLON
            {
            // InternalOil.g:2464:3: ( (lv_name_0_0= ruleAttributeName ) )
            // InternalOil.g:2465:4: (lv_name_0_0= ruleAttributeName )
            {
            // InternalOil.g:2465:4: (lv_name_0_0= ruleAttributeName )
            // InternalOil.g:2466:5: lv_name_0_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameAttributeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_0_0=ruleAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.oil.Oil.AttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:2487:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:2488:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:2488:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:2489:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2506:3: ( (lv_description_3_0= ruleEString ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_STRING) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOil.g:2507:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:2507:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:2508:5: lv_description_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_3_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_2); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getAttributeAccess().getSEMICOLONTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeName"
    // InternalOil.g:2533:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // InternalOil.g:2533:54: (iv_ruleAttributeName= ruleAttributeName EOF )
            // InternalOil.g:2534:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // InternalOil.g:2540:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_1 = null;

        AntlrDatatypeRuleToken lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalOil.g:2546:2: ( ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) )
            // InternalOil.g:2547:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            {
            // InternalOil.g:2547:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            // InternalOil.g:2548:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            {
            // InternalOil.g:2548:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            // InternalOil.g:2549:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            {
            // InternalOil.g:2549:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_T_OBJECT) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalOil.g:2550:5: lv_value_0_1= ruleName
                    {

                    					newCompositeNode(grammarAccess.getAttributeNameAccess().getValueNameParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_1=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeNameRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_1,
                    						"org.xtext.example.oil.Oil.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalOil.g:2566:5: lv_value_0_2= ruleObject
                    {

                    					newCompositeNode(grammarAccess.getAttributeNameAccess().getValueObjectParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_2=ruleObject();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeNameRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_0_2,
                    						"org.xtext.example.oil.Oil.Object");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleAttributeValue"
    // InternalOil.g:2587:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalOil.g:2587:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalOil.g:2588:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // InternalOil.g:2594:1: ruleAttributeValue returns [EObject current=null] : (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject this_NameAttributeValue_0 = null;

        EObject this_BooleanAttributeValue_1 = null;

        EObject this_NumberAttributeValue_2 = null;

        EObject this_FloatAttributeValue_3 = null;

        EObject this_StringAttributeValue_4 = null;

        EObject this_AutoAttributeValue_5 = null;



        	enterRule();

        try {
            // InternalOil.g:2600:2: ( (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) )
            // InternalOil.g:2601:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            {
            // InternalOil.g:2601:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            int alt68=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt68=1;
                }
                break;
            case RULE_T_TRUE:
            case RULE_T_FALSE:
                {
                alt68=2;
                }
                break;
            case RULE_T_NUMBER:
                {
                alt68=3;
                }
                break;
            case RULE_T_FLOAT:
                {
                alt68=4;
                }
                break;
            case RULE_STRING:
                {
                alt68=5;
                }
                break;
            case 39:
                {
                alt68=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalOil.g:2602:3: this_NameAttributeValue_0= ruleNameAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getAttributeValueAccess().getNameAttributeValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameAttributeValue_0=ruleNameAttributeValue();

                    state._fsp--;


                    			current = this_NameAttributeValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:2611:3: this_BooleanAttributeValue_1= ruleBooleanAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getAttributeValueAccess().getBooleanAttributeValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanAttributeValue_1=ruleBooleanAttributeValue();

                    state._fsp--;


                    			current = this_BooleanAttributeValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOil.g:2620:3: this_NumberAttributeValue_2= ruleNumberAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getAttributeValueAccess().getNumberAttributeValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberAttributeValue_2=ruleNumberAttributeValue();

                    state._fsp--;


                    			current = this_NumberAttributeValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOil.g:2629:3: this_FloatAttributeValue_3= ruleFloatAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getAttributeValueAccess().getFloatAttributeValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FloatAttributeValue_3=ruleFloatAttributeValue();

                    state._fsp--;


                    			current = this_FloatAttributeValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOil.g:2638:3: this_StringAttributeValue_4= ruleStringAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getAttributeValueAccess().getStringAttributeValueParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringAttributeValue_4=ruleStringAttributeValue();

                    state._fsp--;


                    			current = this_StringAttributeValue_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOil.g:2647:3: this_AutoAttributeValue_5= ruleAutoAttributeValue
                    {

                    			newCompositeNode(grammarAccess.getAttributeValueAccess().getAutoAttributeValueParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutoAttributeValue_5=ruleAutoAttributeValue();

                    state._fsp--;


                    			current = this_AutoAttributeValue_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleNameAttributeValue"
    // InternalOil.g:2659:1: entryRuleNameAttributeValue returns [EObject current=null] : iv_ruleNameAttributeValue= ruleNameAttributeValue EOF ;
    public final EObject entryRuleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttributeValue = null;


        try {
            // InternalOil.g:2659:59: (iv_ruleNameAttributeValue= ruleNameAttributeValue EOF )
            // InternalOil.g:2660:2: iv_ruleNameAttributeValue= ruleNameAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getNameAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameAttributeValue=ruleNameAttributeValue();

            state._fsp--;

             current =iv_ruleNameAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameAttributeValue"


    // $ANTLR start "ruleNameAttributeValue"
    // InternalOil.g:2666:1: ruleNameAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ) ;
    public final EObject ruleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        Token this_BLOCKBEGIN_1=null;
        Token this_BLOCKEND_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2672:2: ( ( ( (lv_value_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ) )
            // InternalOil.g:2673:2: ( ( (lv_value_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? )
            {
            // InternalOil.g:2673:2: ( ( (lv_value_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? )
            // InternalOil.g:2674:3: ( (lv_value_0_0= ruleName ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )?
            {
            // InternalOil.g:2674:3: ( (lv_value_0_0= ruleName ) )
            // InternalOil.g:2675:4: (lv_value_0_0= ruleName )
            {
            // InternalOil.g:2675:4: (lv_value_0_0= ruleName )
            // InternalOil.g:2676:5: lv_value_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNameAttributeValueAccess().getValueNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_value_0_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameAttributeValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2693:3: (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_BLOCKBEGIN) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOil.g:2694:4: this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND
                    {
                    this_BLOCKBEGIN_1=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_42); 

                    				newLeafNode(this_BLOCKBEGIN_1, grammarAccess.getNameAttributeValueAccess().getBLOCKBEGINTerminalRuleCall_1_0());
                    			
                    // InternalOil.g:2698:4: ( (lv_parameterList_2_0= ruleAttribute ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==RULE_T_OBJECT||LA69_0==RULE_ID) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalOil.g:2699:5: (lv_parameterList_2_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:2699:5: (lv_parameterList_2_0= ruleAttribute )
                    	    // InternalOil.g:2700:6: lv_parameterList_2_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getNameAttributeValueAccess().getParameterListAttributeParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
                    	    lv_parameterList_2_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getNameAttributeValueRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameterList",
                    	    							lv_parameterList_2_0,
                    	    							"org.xtext.example.oil.Oil.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                    this_BLOCKEND_3=(Token)match(input,RULE_BLOCKEND,FOLLOW_2); 

                    				newLeafNode(this_BLOCKEND_3, grammarAccess.getNameAttributeValueAccess().getBLOCKENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameAttributeValue"


    // $ANTLR start "entryRuleBooleanAttributeValue"
    // InternalOil.g:2726:1: entryRuleBooleanAttributeValue returns [EObject current=null] : iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF ;
    public final EObject entryRuleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAttributeValue = null;


        try {
            // InternalOil.g:2726:62: (iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF )
            // InternalOil.g:2727:2: iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getBooleanAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanAttributeValue=ruleBooleanAttributeValue();

            state._fsp--;

             current =iv_ruleBooleanAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanAttributeValue"


    // $ANTLR start "ruleBooleanAttributeValue"
    // InternalOil.g:2733:1: ruleBooleanAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleEBoolean ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ) ;
    public final EObject ruleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        Token this_BLOCKBEGIN_1=null;
        Token this_BLOCKEND_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2739:2: ( ( ( (lv_value_0_0= ruleEBoolean ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? ) )
            // InternalOil.g:2740:2: ( ( (lv_value_0_0= ruleEBoolean ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? )
            {
            // InternalOil.g:2740:2: ( ( (lv_value_0_0= ruleEBoolean ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )? )
            // InternalOil.g:2741:3: ( (lv_value_0_0= ruleEBoolean ) ) (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )?
            {
            // InternalOil.g:2741:3: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalOil.g:2742:4: (lv_value_0_0= ruleEBoolean )
            {
            // InternalOil.g:2742:4: (lv_value_0_0= ruleEBoolean )
            // InternalOil.g:2743:5: lv_value_0_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBooleanAttributeValueAccess().getValueEBooleanParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_value_0_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanAttributeValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_0_0,
            						"org.xtext.example.oil.Oil.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:2760:3: (this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_BLOCKBEGIN) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOil.g:2761:4: this_BLOCKBEGIN_1= RULE_BLOCKBEGIN ( (lv_parameterList_2_0= ruleAttribute ) )* this_BLOCKEND_3= RULE_BLOCKEND
                    {
                    this_BLOCKBEGIN_1=(Token)match(input,RULE_BLOCKBEGIN,FOLLOW_42); 

                    				newLeafNode(this_BLOCKBEGIN_1, grammarAccess.getBooleanAttributeValueAccess().getBLOCKBEGINTerminalRuleCall_1_0());
                    			
                    // InternalOil.g:2765:4: ( (lv_parameterList_2_0= ruleAttribute ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_T_OBJECT||LA71_0==RULE_ID) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalOil.g:2766:5: (lv_parameterList_2_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:2766:5: (lv_parameterList_2_0= ruleAttribute )
                    	    // InternalOil.g:2767:6: lv_parameterList_2_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getBooleanAttributeValueAccess().getParameterListAttributeParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
                    	    lv_parameterList_2_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getBooleanAttributeValueRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameterList",
                    	    							lv_parameterList_2_0,
                    	    							"org.xtext.example.oil.Oil.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    this_BLOCKEND_3=(Token)match(input,RULE_BLOCKEND,FOLLOW_2); 

                    				newLeafNode(this_BLOCKEND_3, grammarAccess.getBooleanAttributeValueAccess().getBLOCKENDTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanAttributeValue"


    // $ANTLR start "entryRuleNumberAttributeValue"
    // InternalOil.g:2793:1: entryRuleNumberAttributeValue returns [EObject current=null] : iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF ;
    public final EObject entryRuleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAttributeValue = null;


        try {
            // InternalOil.g:2793:61: (iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF )
            // InternalOil.g:2794:2: iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getNumberAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberAttributeValue=ruleNumberAttributeValue();

            state._fsp--;

             current =iv_ruleNumberAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberAttributeValue"


    // $ANTLR start "ruleNumberAttributeValue"
    // InternalOil.g:2800:1: ruleNumberAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2806:2: ( ( (lv_value_0_0= ruleNumber ) ) )
            // InternalOil.g:2807:2: ( (lv_value_0_0= ruleNumber ) )
            {
            // InternalOil.g:2807:2: ( (lv_value_0_0= ruleNumber ) )
            // InternalOil.g:2808:3: (lv_value_0_0= ruleNumber )
            {
            // InternalOil.g:2808:3: (lv_value_0_0= ruleNumber )
            // InternalOil.g:2809:4: lv_value_0_0= ruleNumber
            {

            				newCompositeNode(grammarAccess.getNumberAttributeValueAccess().getValueNumberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNumber();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberAttributeValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.oil.Oil.Number");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberAttributeValue"


    // $ANTLR start "entryRuleFloatAttributeValue"
    // InternalOil.g:2829:1: entryRuleFloatAttributeValue returns [EObject current=null] : iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF ;
    public final EObject entryRuleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatAttributeValue = null;


        try {
            // InternalOil.g:2829:60: (iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF )
            // InternalOil.g:2830:2: iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getFloatAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloatAttributeValue=ruleFloatAttributeValue();

            state._fsp--;

             current =iv_ruleFloatAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloatAttributeValue"


    // $ANTLR start "ruleFloatAttributeValue"
    // InternalOil.g:2836:1: ruleFloatAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloat ) ) ;
    public final EObject ruleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2842:2: ( ( (lv_value_0_0= ruleEFloat ) ) )
            // InternalOil.g:2843:2: ( (lv_value_0_0= ruleEFloat ) )
            {
            // InternalOil.g:2843:2: ( (lv_value_0_0= ruleEFloat ) )
            // InternalOil.g:2844:3: (lv_value_0_0= ruleEFloat )
            {
            // InternalOil.g:2844:3: (lv_value_0_0= ruleEFloat )
            // InternalOil.g:2845:4: lv_value_0_0= ruleEFloat
            {

            				newCompositeNode(grammarAccess.getFloatAttributeValueAccess().getValueEFloatParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEFloat();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getFloatAttributeValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.oil.Oil.EFloat");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatAttributeValue"


    // $ANTLR start "entryRuleStringAttributeValue"
    // InternalOil.g:2865:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // InternalOil.g:2865:61: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // InternalOil.g:2866:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getStringAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringAttributeValue=ruleStringAttributeValue();

            state._fsp--;

             current =iv_ruleStringAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringAttributeValue"


    // $ANTLR start "ruleStringAttributeValue"
    // InternalOil.g:2872:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2878:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalOil.g:2879:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalOil.g:2879:2: ( (lv_value_0_0= ruleEString ) )
            // InternalOil.g:2880:3: (lv_value_0_0= ruleEString )
            {
            // InternalOil.g:2880:3: (lv_value_0_0= ruleEString )
            // InternalOil.g:2881:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringAttributeValueAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringAttributeValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.oil.Oil.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringAttributeValue"


    // $ANTLR start "entryRuleAutoAttributeValue"
    // InternalOil.g:2901:1: entryRuleAutoAttributeValue returns [EObject current=null] : iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF ;
    public final EObject entryRuleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoAttributeValue = null;


        try {
            // InternalOil.g:2901:59: (iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF )
            // InternalOil.g:2902:2: iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAutoAttributeValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutoAttributeValue=ruleAutoAttributeValue();

            state._fsp--;

             current =iv_ruleAutoAttributeValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutoAttributeValue"


    // $ANTLR start "ruleAutoAttributeValue"
    // InternalOil.g:2908:1: ruleAutoAttributeValue returns [EObject current=null] : ( (lv_value_0_0= 'AUTO' ) ) ;
    public final EObject ruleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOil.g:2914:2: ( ( (lv_value_0_0= 'AUTO' ) ) )
            // InternalOil.g:2915:2: ( (lv_value_0_0= 'AUTO' ) )
            {
            // InternalOil.g:2915:2: ( (lv_value_0_0= 'AUTO' ) )
            // InternalOil.g:2916:3: (lv_value_0_0= 'AUTO' )
            {
            // InternalOil.g:2916:3: (lv_value_0_0= 'AUTO' )
            // InternalOil.g:2917:4: lv_value_0_0= 'AUTO'
            {
            lv_value_0_0=(Token)match(input,39,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getAutoAttributeValueAccess().getValueAUTOKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAutoAttributeValueRule());
            				}
            				setWithLastConsumed(current, "value", true, "AUTO");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutoAttributeValue"


    // $ANTLR start "entryRuleEString"
    // InternalOil.g:2932:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOil.g:2932:47: (iv_ruleEString= ruleEString EOF )
            // InternalOil.g:2933:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalOil.g:2939:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalOil.g:2945:2: (this_STRING_0= RULE_STRING )
            // InternalOil.g:2946:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalOil.g:2956:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalOil.g:2956:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalOil.g:2957:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalOil.g:2963:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_TRUE_0=null;
        Token this_T_FALSE_1=null;


        	enterRule();

        try {
            // InternalOil.g:2969:2: ( (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE ) )
            // InternalOil.g:2970:2: (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE )
            {
            // InternalOil.g:2970:2: (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_T_TRUE) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_T_FALSE) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalOil.g:2971:3: this_T_TRUE_0= RULE_T_TRUE
                    {
                    this_T_TRUE_0=(Token)match(input,RULE_T_TRUE,FOLLOW_2); 

                    			current.merge(this_T_TRUE_0);
                    		

                    			newLeafNode(this_T_TRUE_0, grammarAccess.getEBooleanAccess().getT_TRUETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:2979:3: this_T_FALSE_1= RULE_T_FALSE
                    {
                    this_T_FALSE_1=(Token)match(input,RULE_T_FALSE,FOLLOW_2); 

                    			current.merge(this_T_FALSE_1);
                    		

                    			newLeafNode(this_T_FALSE_1, grammarAccess.getEBooleanAccess().getT_FALSETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleNumber"
    // InternalOil.g:2990:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalOil.g:2990:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalOil.g:2991:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalOil.g:2997:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_NUMBER_0= RULE_T_NUMBER ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_NUMBER_0=null;


        	enterRule();

        try {
            // InternalOil.g:3003:2: (this_T_NUMBER_0= RULE_T_NUMBER )
            // InternalOil.g:3004:2: this_T_NUMBER_0= RULE_T_NUMBER
            {
            this_T_NUMBER_0=(Token)match(input,RULE_T_NUMBER,FOLLOW_2); 

            		current.merge(this_T_NUMBER_0);
            	

            		newLeafNode(this_T_NUMBER_0, grammarAccess.getNumberAccess().getT_NUMBERTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleEFloat"
    // InternalOil.g:3014:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalOil.g:3014:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalOil.g:3015:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalOil.g:3021:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_FLOAT_0= RULE_T_FLOAT ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_FLOAT_0=null;


        	enterRule();

        try {
            // InternalOil.g:3027:2: (this_T_FLOAT_0= RULE_T_FLOAT )
            // InternalOil.g:3028:2: this_T_FLOAT_0= RULE_T_FLOAT
            {
            this_T_FLOAT_0=(Token)match(input,RULE_T_FLOAT,FOLLOW_2); 

            		current.merge(this_T_FLOAT_0);
            	

            		newLeafNode(this_T_FLOAT_0, grammarAccess.getEFloatAccess().getT_FLOATTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleName"
    // InternalOil.g:3038:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalOil.g:3038:44: (iv_ruleName= ruleName EOF )
            // InternalOil.g:3039:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalOil.g:3045:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalOil.g:3051:2: (this_ID_0= RULE_ID )
            // InternalOil.g:3052:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getNameAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleIntTypeEnum"
    // InternalOil.g:3062:1: ruleIntTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) ;
    public final Enumerator ruleIntTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOil.g:3068:2: ( ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) )
            // InternalOil.g:3069:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            {
            // InternalOil.g:3069:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            int alt74=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt74=1;
                }
                break;
            case 41:
                {
                alt74=2;
                }
                break;
            case 42:
                {
                alt74=3;
                }
                break;
            case 43:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalOil.g:3070:3: (enumLiteral_0= 'UINT32' )
                    {
                    // InternalOil.g:3070:3: (enumLiteral_0= 'UINT32' )
                    // InternalOil.g:3071:4: enumLiteral_0= 'UINT32'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3078:3: (enumLiteral_1= 'INT32' )
                    {
                    // InternalOil.g:3078:3: (enumLiteral_1= 'INT32' )
                    // InternalOil.g:3079:4: enumLiteral_1= 'INT32'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:3086:3: (enumLiteral_2= 'UINT64' )
                    {
                    // InternalOil.g:3086:3: (enumLiteral_2= 'UINT64' )
                    // InternalOil.g:3087:4: enumLiteral_2= 'UINT64'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:3094:3: (enumLiteral_3= 'INT64' )
                    {
                    // InternalOil.g:3094:3: (enumLiteral_3= 'INT64' )
                    // InternalOil.g:3095:4: enumLiteral_3= 'INT64'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getINT64EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIntTypeEnumAccess().getINT64EnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntTypeEnum"


    // $ANTLR start "ruleDefaultEnum"
    // InternalOil.g:3105:1: ruleDefaultEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) ;
    public final Enumerator ruleDefaultEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:3111:2: ( ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) )
            // InternalOil.g:3112:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            {
            // InternalOil.g:3112:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==44) ) {
                alt75=1;
            }
            else if ( (LA75_0==39) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalOil.g:3113:3: (enumLiteral_0= 'NO_DEFAULT' )
                    {
                    // InternalOil.g:3113:3: (enumLiteral_0= 'NO_DEFAULT' )
                    // InternalOil.g:3114:4: enumLiteral_0= 'NO_DEFAULT'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3121:3: (enumLiteral_1= 'AUTO' )
                    {
                    // InternalOil.g:3121:3: (enumLiteral_1= 'AUTO' )
                    // InternalOil.g:3122:4: enumLiteral_1= 'AUTO'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDefaultEnumAccess().getAUTOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDefaultEnumAccess().getAUTOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultEnum"


    // $ANTLR start "ruleObjectRefTypeEnum"
    // InternalOil.g:3132:1: ruleObjectRefTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) ;
    public final Enumerator ruleObjectRefTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;


        	enterRule();

        try {
            // InternalOil.g:3138:2: ( ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) )
            // InternalOil.g:3139:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            {
            // InternalOil.g:3139:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            int alt76=20;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt76=1;
                }
                break;
            case 46:
                {
                alt76=2;
                }
                break;
            case 47:
                {
                alt76=3;
                }
                break;
            case 48:
                {
                alt76=4;
                }
                break;
            case 49:
                {
                alt76=5;
                }
                break;
            case 50:
                {
                alt76=6;
                }
                break;
            case 51:
                {
                alt76=7;
                }
                break;
            case 52:
                {
                alt76=8;
                }
                break;
            case 53:
                {
                alt76=9;
                }
                break;
            case 54:
                {
                alt76=10;
                }
                break;
            case 55:
                {
                alt76=11;
                }
                break;
            case 56:
                {
                alt76=12;
                }
                break;
            case 57:
                {
                alt76=13;
                }
                break;
            case 58:
                {
                alt76=14;
                }
                break;
            case 59:
                {
                alt76=15;
                }
                break;
            case 60:
                {
                alt76=16;
                }
                break;
            case 61:
                {
                alt76=17;
                }
                break;
            case 62:
                {
                alt76=18;
                }
                break;
            case 63:
                {
                alt76=19;
                }
                break;
            case 64:
                {
                alt76=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalOil.g:3140:3: (enumLiteral_0= 'OS_TYPE' )
                    {
                    // InternalOil.g:3140:3: (enumLiteral_0= 'OS_TYPE' )
                    // InternalOil.g:3141:4: enumLiteral_0= 'OS_TYPE'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3148:3: (enumLiteral_1= 'TASK_TYPE' )
                    {
                    // InternalOil.g:3148:3: (enumLiteral_1= 'TASK_TYPE' )
                    // InternalOil.g:3149:4: enumLiteral_1= 'TASK_TYPE'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:3156:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    {
                    // InternalOil.g:3156:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    // InternalOil.g:3157:4: enumLiteral_2= 'COUNTER_TYPE'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:3164:3: (enumLiteral_3= 'ALARM_TYPE' )
                    {
                    // InternalOil.g:3164:3: (enumLiteral_3= 'ALARM_TYPE' )
                    // InternalOil.g:3165:4: enumLiteral_3= 'ALARM_TYPE'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:3172:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    {
                    // InternalOil.g:3172:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    // InternalOil.g:3173:4: enumLiteral_4= 'RESOURCE_TYPE'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:3180:3: (enumLiteral_5= 'EVENT_TYPE' )
                    {
                    // InternalOil.g:3180:3: (enumLiteral_5= 'EVENT_TYPE' )
                    // InternalOil.g:3181:4: enumLiteral_5= 'EVENT_TYPE'
                    {
                    enumLiteral_5=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:3188:3: (enumLiteral_6= 'ISR_TYPE' )
                    {
                    // InternalOil.g:3188:3: (enumLiteral_6= 'ISR_TYPE' )
                    // InternalOil.g:3189:4: enumLiteral_6= 'ISR_TYPE'
                    {
                    enumLiteral_6=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:3196:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    {
                    // InternalOil.g:3196:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    // InternalOil.g:3197:4: enumLiteral_7= 'MESSAGE_TYPE'
                    {
                    enumLiteral_7=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOil.g:3204:3: (enumLiteral_8= 'COM_TYPE' )
                    {
                    // InternalOil.g:3204:3: (enumLiteral_8= 'COM_TYPE' )
                    // InternalOil.g:3205:4: enumLiteral_8= 'COM_TYPE'
                    {
                    enumLiteral_8=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOil.g:3212:3: (enumLiteral_9= 'NM_TYPE' )
                    {
                    // InternalOil.g:3212:3: (enumLiteral_9= 'NM_TYPE' )
                    // InternalOil.g:3213:4: enumLiteral_9= 'NM_TYPE'
                    {
                    enumLiteral_9=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOil.g:3220:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    {
                    // InternalOil.g:3220:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    // InternalOil.g:3221:4: enumLiteral_10= 'APPMODE_TYPE'
                    {
                    enumLiteral_10=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOil.g:3228:3: (enumLiteral_11= 'IPDU_TYPE' )
                    {
                    // InternalOil.g:3228:3: (enumLiteral_11= 'IPDU_TYPE' )
                    // InternalOil.g:3229:4: enumLiteral_11= 'IPDU_TYPE'
                    {
                    enumLiteral_11=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalOil.g:3236:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    {
                    // InternalOil.g:3236:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    // InternalOil.g:3237:4: enumLiteral_12= 'NETWORKMESSAGE_TYPE'
                    {
                    enumLiteral_12=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalOil.g:3244:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    {
                    // InternalOil.g:3244:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    // InternalOil.g:3245:4: enumLiteral_13= 'APPLICATION_TYPE'
                    {
                    enumLiteral_13=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalOil.g:3252:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    {
                    // InternalOil.g:3252:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    // InternalOil.g:3253:4: enumLiteral_14= 'MEMOTY_PROTECTION_TYPE'
                    {
                    enumLiteral_14=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalOil.g:3260:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    {
                    // InternalOil.g:3260:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    // InternalOil.g:3261:4: enumLiteral_15= 'SPINLOCK_TYPE'
                    {
                    enumLiteral_15=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalOil.g:3268:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    {
                    // InternalOil.g:3268:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    // InternalOil.g:3269:4: enumLiteral_16= 'SCHEDULETABLE_TYPE'
                    {
                    enumLiteral_16=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalOil.g:3276:3: (enumLiteral_17= 'IOC_TYPE' )
                    {
                    // InternalOil.g:3276:3: (enumLiteral_17= 'IOC_TYPE' )
                    // InternalOil.g:3277:4: enumLiteral_17= 'IOC_TYPE'
                    {
                    enumLiteral_17=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalOil.g:3284:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    {
                    // InternalOil.g:3284:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    // InternalOil.g:3285:4: enumLiteral_18= 'APICONFIG_TYPE'
                    {
                    enumLiteral_18=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalOil.g:3292:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    {
                    // InternalOil.g:3292:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    // InternalOil.g:3293:4: enumLiteral_19= 'LIBRARY_TYPE'
                    {
                    enumLiteral_19=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getLIBRARY_TYPEEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getObjectRefTypeEnumAccess().getLIBRARY_TYPEEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectRefTypeEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010402000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000804020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xFFFFEF07C0000080L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000820000500L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000080C000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000108000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000108000018000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000108000008400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000010800080C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000500L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000804040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000804000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000804040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000804000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000108000009800L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000804042L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000804002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800804020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000804060L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000820000780L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000820000580L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000800081DC00L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000042L});

}