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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_FILEID", "RULE_T_TRUE", "RULE_T_FALSE", "RULE_ID", "RULE_STRING", "RULE_T_NUMBER", "RULE_T_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#include'", "'<'", "'>'", "'OIL_VERSION'", "'='", "':'", "';'", "'IMPLEMENTATION'", "'{'", "'}'", "'OS'", "'TASK'", "'COUNTER'", "'ISR'", "'ALARM'", "'RESOURCE'", "'EVENT'", "'MESSAGE'", "'COM'", "'NM'", "'APPMODE'", "'IPDU'", "'NETWORKMESSAGE'", "'APPLICATION'", "'MEMOTY_PROTECTION'", "'SPINLOCK'", "'SCHEDULETABLE'", "'IOC'", "'LIBRARY'", "'WITH_AUTO'", "'FLOAT'", "'ENUM'", "'STRING'", "'BOOLEAN'", "'['", "','", "']'", "'IDENTIFIER'", "'..'", "'CPU'", "'PATH'", "'CHEADER'", "'CFILE'", "'AUTO'", "'UINT32'", "'INT32'", "'UINT64'", "'INT64'", "'NO_DEFAULT'", "'OS_TYPE'", "'TASK_TYPE'", "'COUNTER_TYPE'", "'ALARM_TYPE'", "'RESOURCE_TYPE'", "'EVENT_TYPE'", "'ISR_TYPE'", "'MESSAGE_TYPE'", "'COM_TYPE'", "'NM_TYPE'", "'APPMODE_TYPE'", "'IPDU_TYPE'", "'NETWORKMESSAGE_TYPE'", "'APPLICATION_TYPE'", "'MEMOTY_PROTECTION_TYPE'", "'SPINLOCK_TYPE'", "'SCHEDULETABLE_TYPE'", "'IOC_TYPE'", "'APICONFIG_TYPE'", "'LIBRARY_TYPE'"
    };
    public static final int T__50=50;
    public static final int RULE_T_FLOAT=10;
    public static final int RULE_FILEID=4;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_T_NUMBER=9;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_T_FALSE=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_T_TRUE=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
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

            if ( (LA1_0==19) ) {
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

                if ( (LA2_0==16) ) {
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

            if ( (LA3_0==23) ) {
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
    // InternalOil.g:167:1: ruleInclude returns [EObject current=null] : (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:173:2: ( (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) ) )
            // InternalOil.g:174:2: (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) )
            {
            // InternalOil.g:174:2: (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) ) )
            // InternalOil.g:175:3: otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalOil.g:179:3: ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= ruleEString ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
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
                    // InternalOil.g:180:4: (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' )
                    {
                    // InternalOil.g:180:4: (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' )
                    // InternalOil.g:181:5: otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_5); 

                    					newLeafNode(otherlv_1, grammarAccess.getIncludeAccess().getLessThanSignKeyword_1_0_0());
                    				
                    // InternalOil.g:185:5: ( (lv_name_2_0= ruleFileName ) )
                    // InternalOil.g:186:6: (lv_name_2_0= ruleFileName )
                    {
                    // InternalOil.g:186:6: (lv_name_2_0= ruleFileName )
                    // InternalOil.g:187:7: lv_name_2_0= ruleFileName
                    {

                    							newCompositeNode(grammarAccess.getIncludeAccess().getNameFileNameParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_name_2_0=ruleFileName();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getIncludeRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_2_0,
                    								"org.xtext.example.oil.Oil.FileName");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getGreaterThanSignKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:210:4: ( (lv_name_4_0= ruleEString ) )
                    {
                    // InternalOil.g:210:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalOil.g:211:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalOil.g:211:5: (lv_name_4_0= ruleEString )
                    // InternalOil.g:212:6: lv_name_4_0= ruleEString
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


    // $ANTLR start "entryRuleFileName"
    // InternalOil.g:234:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // InternalOil.g:234:48: (iv_ruleFileName= ruleFileName EOF )
            // InternalOil.g:235:2: iv_ruleFileName= ruleFileName EOF
            {
             newCompositeNode(grammarAccess.getFileNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileName=ruleFileName();

            state._fsp--;

             current =iv_ruleFileName.getText(); 
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
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // InternalOil.g:241:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FILEID_0= RULE_FILEID ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FILEID_0=null;


        	enterRule();

        try {
            // InternalOil.g:247:2: (this_FILEID_0= RULE_FILEID )
            // InternalOil.g:248:2: this_FILEID_0= RULE_FILEID
            {
            this_FILEID_0=(Token)match(input,RULE_FILEID,FOLLOW_2); 

            		current.merge(this_FILEID_0);
            	

            		newLeafNode(this_FILEID_0, grammarAccess.getFileNameAccess().getFILEIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleOILVersion"
    // InternalOil.g:258:1: entryRuleOILVersion returns [EObject current=null] : iv_ruleOILVersion= ruleOILVersion EOF ;
    public final EObject entryRuleOILVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOILVersion = null;


        try {
            // InternalOil.g:258:51: (iv_ruleOILVersion= ruleOILVersion EOF )
            // InternalOil.g:259:2: iv_ruleOILVersion= ruleOILVersion EOF
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
    // InternalOil.g:265:1: ruleOILVersion returns [EObject current=null] : (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleOILVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:271:2: ( (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' ) )
            // InternalOil.g:272:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' )
            {
            // InternalOil.g:272:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' )
            // InternalOil.g:273:3: otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOILVersionAccess().getOIL_VERSIONKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOILVersionAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:281:3: ( (lv_value_2_0= ruleEString ) )
            // InternalOil.g:282:4: (lv_value_2_0= ruleEString )
            {
            // InternalOil.g:282:4: (lv_value_2_0= ruleEString )
            // InternalOil.g:283:5: lv_value_2_0= ruleEString
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

            // InternalOil.g:300:3: (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOil.g:301:4: otherlv_3= ':' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getOILVersionAccess().getColonKeyword_3_0());
                    			
                    // InternalOil.g:305:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalOil.g:306:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:306:5: (lv_description_4_0= ruleEString )
                    // InternalOil.g:307:6: lv_description_4_0= ruleEString
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

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOILVersionAccess().getSemicolonKeyword_4());
            		

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
    // InternalOil.g:333:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // InternalOil.g:333:65: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // InternalOil.g:334:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
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
    // InternalOil.g:340:1: ruleImplementationDefinition returns [EObject current=null] : (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_implementationSpecs_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:346:2: ( (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) )
            // InternalOil.g:347:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            {
            // InternalOil.g:347:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            // InternalOil.g:348:3: otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationDefinitionAccess().getIMPLEMENTATIONKeyword_0());
            		
            // InternalOil.g:352:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:353:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:353:4: (lv_name_1_0= ruleName )
            // InternalOil.g:354:5: lv_name_1_0= ruleName
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

            otherlv_2=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getImplementationDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:375:3: ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )
            // InternalOil.g:376:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            {
            // InternalOil.g:376:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            // InternalOil.g:377:5: lv_implementationSpecs_3_0= ruleImplementationSpec
            {

            					newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getImplementationSpecsImplementationSpecParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:398:3: ( (lv_description_5_0= ruleEString ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOil.g:399:4: (lv_description_5_0= ruleEString )
                    {
                    // InternalOil.g:399:4: (lv_description_5_0= ruleEString )
                    // InternalOil.g:400:5: lv_description_5_0= ruleEString
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

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getImplementationDefinitionAccess().getSemicolonKeyword_6());
            		

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
    // InternalOil.g:425:1: entryRuleImplementationSpec returns [EObject current=null] : iv_ruleImplementationSpec= ruleImplementationSpec EOF ;
    public final EObject entryRuleImplementationSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationSpec = null;


        try {
            // InternalOil.g:425:59: (iv_ruleImplementationSpec= ruleImplementationSpec EOF )
            // InternalOil.g:426:2: iv_ruleImplementationSpec= ruleImplementationSpec EOF
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
    // InternalOil.g:432:1: ruleImplementationSpec returns [EObject current=null] : ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ ) ;
    public final EObject ruleImplementationSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_osRule_1_0 = null;

        EObject lv_taskRule_2_0 = null;

        EObject lv_counterRule_3_0 = null;

        EObject lv_isrRule_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:438:2: ( ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ ) )
            // InternalOil.g:439:2: ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ )
            {
            // InternalOil.g:439:2: ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ )
            // InternalOil.g:440:3: () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+
            {
            // InternalOil.g:440:3: ()
            // InternalOil.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementationSpecAccess().getImplementationSpecAction_0(),
            					current);
            			

            }

            // InternalOil.g:447:3: ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=5;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt7=1;
                    }
                    break;
                case 27:
                    {
                    alt7=2;
                    }
                    break;
                case 28:
                    {
                    alt7=3;
                    }
                    break;
                case 29:
                    {
                    alt7=4;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalOil.g:448:4: ( (lv_osRule_1_0= ruleOsRule ) )
            	    {
            	    // InternalOil.g:448:4: ( (lv_osRule_1_0= ruleOsRule ) )
            	    // InternalOil.g:449:5: (lv_osRule_1_0= ruleOsRule )
            	    {
            	    // InternalOil.g:449:5: (lv_osRule_1_0= ruleOsRule )
            	    // InternalOil.g:450:6: lv_osRule_1_0= ruleOsRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getOsRuleOsRuleParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_osRule_1_0=ruleOsRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"osRule",
            	    							lv_osRule_1_0,
            	    							"org.xtext.example.oil.Oil.OsRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOil.g:468:4: ( (lv_taskRule_2_0= ruleTaskRule ) )
            	    {
            	    // InternalOil.g:468:4: ( (lv_taskRule_2_0= ruleTaskRule ) )
            	    // InternalOil.g:469:5: (lv_taskRule_2_0= ruleTaskRule )
            	    {
            	    // InternalOil.g:469:5: (lv_taskRule_2_0= ruleTaskRule )
            	    // InternalOil.g:470:6: lv_taskRule_2_0= ruleTaskRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getTaskRuleTaskRuleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_taskRule_2_0=ruleTaskRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"taskRule",
            	    							lv_taskRule_2_0,
            	    							"org.xtext.example.oil.Oil.TaskRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOil.g:488:4: ( (lv_counterRule_3_0= ruleCounterRule ) )
            	    {
            	    // InternalOil.g:488:4: ( (lv_counterRule_3_0= ruleCounterRule ) )
            	    // InternalOil.g:489:5: (lv_counterRule_3_0= ruleCounterRule )
            	    {
            	    // InternalOil.g:489:5: (lv_counterRule_3_0= ruleCounterRule )
            	    // InternalOil.g:490:6: lv_counterRule_3_0= ruleCounterRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getCounterRuleCounterRuleParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_counterRule_3_0=ruleCounterRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"counterRule",
            	    							lv_counterRule_3_0,
            	    							"org.xtext.example.oil.Oil.CounterRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOil.g:508:4: ( (lv_isrRule_4_0= ruleIsrRule ) )
            	    {
            	    // InternalOil.g:508:4: ( (lv_isrRule_4_0= ruleIsrRule ) )
            	    // InternalOil.g:509:5: (lv_isrRule_4_0= ruleIsrRule )
            	    {
            	    // InternalOil.g:509:5: (lv_isrRule_4_0= ruleIsrRule )
            	    // InternalOil.g:510:6: lv_isrRule_4_0= ruleIsrRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getIsrRuleIsrRuleParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_isrRule_4_0=ruleIsrRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"isrRule",
            	    							lv_isrRule_4_0,
            	    							"org.xtext.example.oil.Oil.IsrRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


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


    // $ANTLR start "entryRuleOsRule"
    // InternalOil.g:532:1: entryRuleOsRule returns [EObject current=null] : iv_ruleOsRule= ruleOsRule EOF ;
    public final EObject entryRuleOsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOsRule = null;


        try {
            // InternalOil.g:532:47: (iv_ruleOsRule= ruleOsRule EOF )
            // InternalOil.g:533:2: iv_ruleOsRule= ruleOsRule EOF
            {
             newCompositeNode(grammarAccess.getOsRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOsRule=ruleOsRule();

            state._fsp--;

             current =iv_ruleOsRule; 
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
    // $ANTLR end "entryRuleOsRule"


    // $ANTLR start "ruleOsRule"
    // InternalOil.g:539:1: ruleOsRule returns [EObject current=null] : ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleOsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_implementations_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:545:2: ( ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:546:2: ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:546:2: ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            // InternalOil.g:547:3: () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';'
            {
            // InternalOil.g:547:3: ()
            // InternalOil.g:548:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOsRuleAccess().getOsRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getOsRuleAccess().getOSKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getOsRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:562:3: ( (lv_implementations_3_0= ruleImplementationDef ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=46 && LA8_0<=49)||LA8_0==53||(LA8_0>=60 && LA8_0<=63)||(LA8_0>=65 && LA8_0<=84)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOil.g:563:4: (lv_implementations_3_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:563:4: (lv_implementations_3_0= ruleImplementationDef )
            	    // InternalOil.g:564:5: lv_implementations_3_0= ruleImplementationDef
            	    {

            	    					newCompositeNode(grammarAccess.getOsRuleAccess().getImplementationsImplementationDefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_implementations_3_0=ruleImplementationDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_3_0,
            	    						"org.xtext.example.oil.Oil.ImplementationDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getOsRuleAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:585:3: (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOil.g:586:4: otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getOsRuleAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:590:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:591:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:591:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:592:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOsRuleAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOsRuleRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOsRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleOsRule"


    // $ANTLR start "entryRuleTaskRule"
    // InternalOil.g:618:1: entryRuleTaskRule returns [EObject current=null] : iv_ruleTaskRule= ruleTaskRule EOF ;
    public final EObject entryRuleTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRule = null;


        try {
            // InternalOil.g:618:49: (iv_ruleTaskRule= ruleTaskRule EOF )
            // InternalOil.g:619:2: iv_ruleTaskRule= ruleTaskRule EOF
            {
             newCompositeNode(grammarAccess.getTaskRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskRule=ruleTaskRule();

            state._fsp--;

             current =iv_ruleTaskRule; 
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
    // $ANTLR end "entryRuleTaskRule"


    // $ANTLR start "ruleTaskRule"
    // InternalOil.g:625:1: ruleTaskRule returns [EObject current=null] : ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleTaskRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_implementations_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:631:2: ( ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:632:2: ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:632:2: ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            // InternalOil.g:633:3: () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';'
            {
            // InternalOil.g:633:3: ()
            // InternalOil.g:634:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskRuleAccess().getTaskRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRuleAccess().getTASKKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:648:3: ( (lv_implementations_3_0= ruleImplementationDef ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=46 && LA10_0<=49)||LA10_0==53||(LA10_0>=60 && LA10_0<=63)||(LA10_0>=65 && LA10_0<=84)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOil.g:649:4: (lv_implementations_3_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:649:4: (lv_implementations_3_0= ruleImplementationDef )
            	    // InternalOil.g:650:5: lv_implementations_3_0= ruleImplementationDef
            	    {

            	    					newCompositeNode(grammarAccess.getTaskRuleAccess().getImplementationsImplementationDefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_implementations_3_0=ruleImplementationDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_3_0,
            	    						"org.xtext.example.oil.Oil.ImplementationDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskRuleAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:671:3: (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOil.g:672:4: otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskRuleAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:676:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:677:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:677:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:678:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTaskRuleAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRuleRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleTaskRule"


    // $ANTLR start "entryRuleCounterRule"
    // InternalOil.g:704:1: entryRuleCounterRule returns [EObject current=null] : iv_ruleCounterRule= ruleCounterRule EOF ;
    public final EObject entryRuleCounterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounterRule = null;


        try {
            // InternalOil.g:704:52: (iv_ruleCounterRule= ruleCounterRule EOF )
            // InternalOil.g:705:2: iv_ruleCounterRule= ruleCounterRule EOF
            {
             newCompositeNode(grammarAccess.getCounterRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCounterRule=ruleCounterRule();

            state._fsp--;

             current =iv_ruleCounterRule; 
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
    // $ANTLR end "entryRuleCounterRule"


    // $ANTLR start "ruleCounterRule"
    // InternalOil.g:711:1: ruleCounterRule returns [EObject current=null] : ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleCounterRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_implementations_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:717:2: ( ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:718:2: ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:718:2: ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            // InternalOil.g:719:3: () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';'
            {
            // InternalOil.g:719:3: ()
            // InternalOil.g:720:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCounterRuleAccess().getCounterRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getCounterRuleAccess().getCOUNTERKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCounterRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:734:3: ( (lv_implementations_3_0= ruleImplementationDef ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=46 && LA12_0<=49)||LA12_0==53||(LA12_0>=60 && LA12_0<=63)||(LA12_0>=65 && LA12_0<=84)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOil.g:735:4: (lv_implementations_3_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:735:4: (lv_implementations_3_0= ruleImplementationDef )
            	    // InternalOil.g:736:5: lv_implementations_3_0= ruleImplementationDef
            	    {

            	    					newCompositeNode(grammarAccess.getCounterRuleAccess().getImplementationsImplementationDefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_implementations_3_0=ruleImplementationDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCounterRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_3_0,
            	    						"org.xtext.example.oil.Oil.ImplementationDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCounterRuleAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:757:3: (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOil.g:758:4: otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getCounterRuleAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:762:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:763:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:763:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:764:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCounterRuleAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCounterRuleRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCounterRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleCounterRule"


    // $ANTLR start "entryRuleIsrRule"
    // InternalOil.g:790:1: entryRuleIsrRule returns [EObject current=null] : iv_ruleIsrRule= ruleIsrRule EOF ;
    public final EObject entryRuleIsrRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsrRule = null;


        try {
            // InternalOil.g:790:48: (iv_ruleIsrRule= ruleIsrRule EOF )
            // InternalOil.g:791:2: iv_ruleIsrRule= ruleIsrRule EOF
            {
             newCompositeNode(grammarAccess.getIsrRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsrRule=ruleIsrRule();

            state._fsp--;

             current =iv_ruleIsrRule; 
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
    // $ANTLR end "entryRuleIsrRule"


    // $ANTLR start "ruleIsrRule"
    // InternalOil.g:797:1: ruleIsrRule returns [EObject current=null] : ( () otherlv_1= 'ISR' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleIsrRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_implementations_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:803:2: ( ( () otherlv_1= 'ISR' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:804:2: ( () otherlv_1= 'ISR' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:804:2: ( () otherlv_1= 'ISR' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            // InternalOil.g:805:3: () otherlv_1= 'ISR' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';'
            {
            // InternalOil.g:805:3: ()
            // InternalOil.g:806:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsrRuleAccess().getIsrRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getIsrRuleAccess().getISRKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getIsrRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:820:3: ( (lv_implementations_3_0= ruleImplementationDef ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=46 && LA14_0<=49)||LA14_0==53||(LA14_0>=60 && LA14_0<=63)||(LA14_0>=65 && LA14_0<=84)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOil.g:821:4: (lv_implementations_3_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:821:4: (lv_implementations_3_0= ruleImplementationDef )
            	    // InternalOil.g:822:5: lv_implementations_3_0= ruleImplementationDef
            	    {

            	    					newCompositeNode(grammarAccess.getIsrRuleAccess().getImplementationsImplementationDefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_implementations_3_0=ruleImplementationDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIsrRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_3_0,
            	    						"org.xtext.example.oil.Oil.ImplementationDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getIsrRuleAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:843:3: (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOil.g:844:4: otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getIsrRuleAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:848:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:849:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:849:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:850:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIsrRuleAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsrRuleRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIsrRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleIsrRule"


    // $ANTLR start "entryRuleObject"
    // InternalOil.g:876:1: entryRuleObject returns [String current=null] : iv_ruleObject= ruleObject EOF ;
    public final String entryRuleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObject = null;


        try {
            // InternalOil.g:876:46: (iv_ruleObject= ruleObject EOF )
            // InternalOil.g:877:2: iv_ruleObject= ruleObject EOF
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
    // InternalOil.g:883:1: ruleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' ) ;
    public final AntlrDatatypeRuleToken ruleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:889:2: ( (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' ) )
            // InternalOil.g:890:2: (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' )
            {
            // InternalOil.g:890:2: (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' )
            int alt16=19;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt16=1;
                }
                break;
            case 27:
                {
                alt16=2;
                }
                break;
            case 28:
                {
                alt16=3;
                }
                break;
            case 30:
                {
                alt16=4;
                }
                break;
            case 31:
                {
                alt16=5;
                }
                break;
            case 32:
                {
                alt16=6;
                }
                break;
            case 29:
                {
                alt16=7;
                }
                break;
            case 33:
                {
                alt16=8;
                }
                break;
            case 34:
                {
                alt16=9;
                }
                break;
            case 35:
                {
                alt16=10;
                }
                break;
            case 36:
                {
                alt16=11;
                }
                break;
            case 37:
                {
                alt16=12;
                }
                break;
            case 38:
                {
                alt16=13;
                }
                break;
            case 39:
                {
                alt16=14;
                }
                break;
            case 40:
                {
                alt16=15;
                }
                break;
            case 41:
                {
                alt16=16;
                }
                break;
            case 42:
                {
                alt16=17;
                }
                break;
            case 43:
                {
                alt16=18;
                }
                break;
            case 44:
                {
                alt16=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalOil.g:891:3: kw= 'OS'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getOSKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:897:3: kw= 'TASK'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getTASKKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOil.g:903:3: kw= 'COUNTER'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getCOUNTERKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOil.g:909:3: kw= 'ALARM'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getALARMKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOil.g:915:3: kw= 'RESOURCE'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getRESOURCEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOil.g:921:3: kw= 'EVENT'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getEVENTKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOil.g:927:3: kw= 'ISR'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getISRKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOil.g:933:3: kw= 'MESSAGE'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getMESSAGEKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOil.g:939:3: kw= 'COM'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getCOMKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOil.g:945:3: kw= 'NM'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getNMKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOil.g:951:3: kw= 'APPMODE'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getAPPMODEKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOil.g:957:3: kw= 'IPDU'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getIPDUKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOil.g:963:3: kw= 'NETWORKMESSAGE'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getNETWORKMESSAGEKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOil.g:969:3: kw= 'APPLICATION'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getAPPLICATIONKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOil.g:975:3: kw= 'MEMOTY_PROTECTION'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getMEMOTY_PROTECTIONKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOil.g:981:3: kw= 'SPINLOCK'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getSPINLOCKKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOil.g:987:3: kw= 'SCHEDULETABLE'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getSCHEDULETABLEKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOil.g:993:3: kw= 'IOC'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getIOCKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOil.g:999:3: kw= 'LIBRARY'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getLIBRARYKeyword_18());
                    		

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
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleImplementationDef"
    // InternalOil.g:1008:1: entryRuleImplementationDef returns [EObject current=null] : iv_ruleImplementationDef= ruleImplementationDef EOF ;
    public final EObject entryRuleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDef = null;


        try {
            // InternalOil.g:1008:58: (iv_ruleImplementationDef= ruleImplementationDef EOF )
            // InternalOil.g:1009:2: iv_ruleImplementationDef= ruleImplementationDef EOF
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
    // InternalOil.g:1015:1: ruleImplementationDef returns [EObject current=null] : (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) ;
    public final EObject ruleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject this_ImplAttrDef_0 = null;

        EObject this_ImplRefDef_1 = null;



        	enterRule();

        try {
            // InternalOil.g:1021:2: ( (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) )
            // InternalOil.g:1022:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            {
            // InternalOil.g:1022:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=46 && LA17_0<=49)||LA17_0==53||(LA17_0>=60 && LA17_0<=63)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=65 && LA17_0<=84)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalOil.g:1023:3: this_ImplAttrDef_0= ruleImplAttrDef
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
                    // InternalOil.g:1032:3: this_ImplRefDef_1= ruleImplRefDef
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
    // InternalOil.g:1044:1: entryRuleImplAttrDef returns [EObject current=null] : iv_ruleImplAttrDef= ruleImplAttrDef EOF ;
    public final EObject entryRuleImplAttrDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrDef = null;


        try {
            // InternalOil.g:1044:52: (iv_ruleImplAttrDef= ruleImplAttrDef EOF )
            // InternalOil.g:1045:2: iv_ruleImplAttrDef= ruleImplAttrDef EOF
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
    // InternalOil.g:1051:1: ruleImplAttrDef returns [EObject current=null] : (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) ;
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
            // InternalOil.g:1057:2: ( (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) )
            // InternalOil.g:1058:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            {
            // InternalOil.g:1058:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt18=1;
                }
                break;
            case 46:
                {
                alt18=2;
                }
                break;
            case 47:
                {
                alt18=3;
                }
                break;
            case 48:
                {
                alt18=4;
                }
                break;
            case 49:
                {
                alt18=5;
                }
                break;
            case 53:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOil.g:1059:3: this_ImplAttrIntDef_0= ruleImplAttrIntDef
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
                    // InternalOil.g:1068:3: this_ImplAttrFloatDef_1= ruleImplAttrFloatDef
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
                    // InternalOil.g:1077:3: this_ImplAttrEnumDef_2= ruleImplAttrEnumDef
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
                    // InternalOil.g:1086:3: this_ImplAttrStringDef_3= ruleImplAttrStringDef
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
                    // InternalOil.g:1095:3: this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef
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
                    // InternalOil.g:1104:3: this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier
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
    // InternalOil.g:1116:1: entryRuleImplAttrIntDef returns [EObject current=null] : iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF ;
    public final EObject entryRuleImplAttrIntDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIntDef = null;


        try {
            // InternalOil.g:1116:55: (iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF )
            // InternalOil.g:1117:2: iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF
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
    // InternalOil.g:1123:1: ruleImplAttrIntDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleImplAttrIntDef() throws RecognitionException {
        EObject current = null;

        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1129:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:1130:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:1130:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:1131:3: ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            // InternalOil.g:1131:3: ( (lv_type_0_0= ruleIntTypeEnum ) )
            // InternalOil.g:1132:4: (lv_type_0_0= ruleIntTypeEnum )
            {
            // InternalOil.g:1132:4: (lv_type_0_0= ruleIntTypeEnum )
            // InternalOil.g:1133:5: lv_type_0_0= ruleIntTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getTypeIntTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalOil.g:1150:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOil.g:1151:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1151:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1152:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,45,FOLLOW_17); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIntDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIntDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1164:3: ( (lv_range_2_0= ruleRange ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==50) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOil.g:1165:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:1165:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:1166:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalOil.g:1183:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:1184:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:1184:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:1185:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalOil.g:1202:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOil.g:1203:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1203:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:1204:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalOil.g:1221:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOil.g:1222:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrIntDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:1226:4: ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_T_NUMBER) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==59||LA22_0==64) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalOil.g:1227:5: ( (lv_value_6_0= ruleNumber ) )
                            {
                            // InternalOil.g:1227:5: ( (lv_value_6_0= ruleNumber ) )
                            // InternalOil.g:1228:6: (lv_value_6_0= ruleNumber )
                            {
                            // InternalOil.g:1228:6: (lv_value_6_0= ruleNumber )
                            // InternalOil.g:1229:7: lv_value_6_0= ruleNumber
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
                            // InternalOil.g:1247:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1247:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:1248:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1248:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:1249:7: lv_default_7_0= ruleDefaultEnum
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

            // InternalOil.g:1268:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOil.g:1269:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrIntDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:1273:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:1274:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:1274:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:1275:6: lv_description_9_0= ruleEString
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

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getImplAttrIntDefAccess().getSemicolonKeyword_7());
            		

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


    // $ANTLR start "entryRuleImplAttrFloatDef"
    // InternalOil.g:1301:1: entryRuleImplAttrFloatDef returns [EObject current=null] : iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF ;
    public final EObject entryRuleImplAttrFloatDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrFloatDef = null;


        try {
            // InternalOil.g:1301:57: (iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF )
            // InternalOil.g:1302:2: iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF
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
    // InternalOil.g:1308:1: ruleImplAttrFloatDef returns [EObject current=null] : (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleImplAttrFloatDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_range_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1314:2: ( (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:1315:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:1315:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:1316:3: otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrFloatDefAccess().getFLOATKeyword_0());
            		
            // InternalOil.g:1320:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalOil.g:1321:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1321:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1322:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,45,FOLLOW_17); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrFloatDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrFloatDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1334:3: ( (lv_range_2_0= ruleRange ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOil.g:1335:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:1335:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:1336:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalOil.g:1353:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:1354:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:1354:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:1355:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalOil.g:1372:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalOil.g:1373:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1373:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:1374:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalOil.g:1391:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOil.g:1392:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrFloatDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:1396:4: ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_T_FLOAT) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==59||LA28_0==64) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalOil.g:1397:5: ( (lv_value_6_0= ruleEFloat ) )
                            {
                            // InternalOil.g:1397:5: ( (lv_value_6_0= ruleEFloat ) )
                            // InternalOil.g:1398:6: (lv_value_6_0= ruleEFloat )
                            {
                            // InternalOil.g:1398:6: (lv_value_6_0= ruleEFloat )
                            // InternalOil.g:1399:7: lv_value_6_0= ruleEFloat
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
                            // InternalOil.g:1417:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1417:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:1418:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1418:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:1419:7: lv_default_7_0= ruleDefaultEnum
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

            // InternalOil.g:1438:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOil.g:1439:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrFloatDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:1443:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:1444:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:1444:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:1445:6: lv_description_9_0= ruleEString
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

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getImplAttrFloatDefAccess().getSemicolonKeyword_7());
            		

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
    // InternalOil.g:1471:1: entryRuleImplAttrEnumDef returns [EObject current=null] : iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF ;
    public final EObject entryRuleImplAttrEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrEnumDef = null;


        try {
            // InternalOil.g:1471:56: (iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF )
            // InternalOil.g:1472:2: iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF
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
    // InternalOil.g:1478:1: ruleImplAttrEnumDef returns [EObject current=null] : (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleImplAttrEnumDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_enumeration_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1484:2: ( (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:1485:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:1485:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:1486:3: otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrEnumDefAccess().getENUMKeyword_0());
            		
            // InternalOil.g:1490:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOil.g:1491:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1491:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1492:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,45,FOLLOW_17); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrEnumDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrEnumDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1504:3: ( (lv_enumeration_2_0= ruleEnumeration ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalOil.g:1505:4: (lv_enumeration_2_0= ruleEnumeration )
                    {
                    // InternalOil.g:1505:4: (lv_enumeration_2_0= ruleEnumeration )
                    // InternalOil.g:1506:5: lv_enumeration_2_0= ruleEnumeration
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getEnumerationEnumerationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
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

            // InternalOil.g:1523:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:1524:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:1524:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:1525:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalOil.g:1542:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOil.g:1543:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1543:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:1544:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalOil.g:1561:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOil.g:1562:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrEnumDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:1566:4: ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==59||LA34_0==64) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalOil.g:1567:5: ( (lv_value_6_0= ruleName ) )
                            {
                            // InternalOil.g:1567:5: ( (lv_value_6_0= ruleName ) )
                            // InternalOil.g:1568:6: (lv_value_6_0= ruleName )
                            {
                            // InternalOil.g:1568:6: (lv_value_6_0= ruleName )
                            // InternalOil.g:1569:7: lv_value_6_0= ruleName
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
                            // InternalOil.g:1587:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1587:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:1588:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1588:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:1589:7: lv_default_7_0= ruleDefaultEnum
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

            // InternalOil.g:1608:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOil.g:1609:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrEnumDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:1613:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:1614:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:1614:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:1615:6: lv_description_9_0= ruleEString
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

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getImplAttrEnumDefAccess().getSemicolonKeyword_7());
            		

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
    // InternalOil.g:1641:1: entryRuleImplAttrStringDef returns [EObject current=null] : iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF ;
    public final EObject entryRuleImplAttrStringDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrStringDef = null;


        try {
            // InternalOil.g:1641:58: (iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF )
            // InternalOil.g:1642:2: iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF
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
    // InternalOil.g:1648:1: ruleImplAttrStringDef returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' ) ;
    public final EObject ruleImplAttrStringDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_multiple_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_default_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1654:2: ( (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' ) )
            // InternalOil.g:1655:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' )
            {
            // InternalOil.g:1655:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' )
            // InternalOil.g:1656:3: otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrStringDefAccess().getSTRINGKeyword_0());
            		
            // InternalOil.g:1660:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOil.g:1661:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1661:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1662:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,45,FOLLOW_17); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrStringDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrStringDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1674:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:1675:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:1675:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:1676:5: lv_name_2_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getNameAttributeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalOil.g:1693:3: ( (lv_multiple_3_0= ruleMultipleSpecifier ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==50) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOil.g:1694:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1694:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    // InternalOil.g:1695:5: lv_multiple_3_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getMultipleMultipleSpecifierParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalOil.g:1712:3: (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOil.g:1713:4: otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getImplAttrStringDefAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOil.g:1717:4: ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_STRING) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==59||LA39_0==64) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalOil.g:1718:5: ( (lv_value_5_0= ruleEString ) )
                            {
                            // InternalOil.g:1718:5: ( (lv_value_5_0= ruleEString ) )
                            // InternalOil.g:1719:6: (lv_value_5_0= ruleEString )
                            {
                            // InternalOil.g:1719:6: (lv_value_5_0= ruleEString )
                            // InternalOil.g:1720:7: lv_value_5_0= ruleEString
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
                            // InternalOil.g:1738:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1738:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            // InternalOil.g:1739:6: (lv_default_6_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1739:6: (lv_default_6_0= ruleDefaultEnum )
                            // InternalOil.g:1740:7: lv_default_6_0= ruleDefaultEnum
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

            // InternalOil.g:1759:3: (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==21) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOil.g:1760:4: otherlv_7= ':' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getImplAttrStringDefAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:1764:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalOil.g:1765:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalOil.g:1765:5: (lv_description_8_0= ruleEString )
                    // InternalOil.g:1766:6: lv_description_8_0= ruleEString
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

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getImplAttrStringDefAccess().getSemicolonKeyword_6());
            		

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
    // InternalOil.g:1792:1: entryRuleImplAttrBooleanDef returns [EObject current=null] : iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF ;
    public final EObject entryRuleImplAttrBooleanDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrBooleanDef = null;


        try {
            // InternalOil.g:1792:59: (iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF )
            // InternalOil.g:1793:2: iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF
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
    // InternalOil.g:1799:1: ruleImplAttrBooleanDef returns [EObject current=null] : (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' ) ;
    public final EObject ruleImplAttrBooleanDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_2=null;
        Token this_T_TRUE_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_T_FALSE_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
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
            // InternalOil.g:1805:2: ( (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' ) )
            // InternalOil.g:1806:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' )
            {
            // InternalOil.g:1806:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' )
            // InternalOil.g:1807:3: otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrBooleanDefAccess().getBOOLEANKeyword_0());
            		
            // InternalOil.g:1811:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOil.g:1812:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1812:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1813:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,45,FOLLOW_17); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrBooleanDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrBooleanDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1825:3: (otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOil.g:1826:4: otherlv_2= '[' this_T_TRUE_3= RULE_T_TRUE (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' this_T_FALSE_9= RULE_T_FALSE (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplAttrBooleanDefAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    this_T_TRUE_3=(Token)match(input,RULE_T_TRUE,FOLLOW_25); 

                    				newLeafNode(this_T_TRUE_3, grammarAccess.getImplAttrBooleanDefAccess().getT_TRUETerminalRuleCall_2_1());
                    			
                    // InternalOil.g:1834:4: (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==24) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // InternalOil.g:1835:5: otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}'
                            {
                            otherlv_4=(Token)match(input,24,FOLLOW_16); 

                            					newLeafNode(otherlv_4, grammarAccess.getImplAttrBooleanDefAccess().getLeftCurlyBracketKeyword_2_2_0());
                            				
                            // InternalOil.g:1839:5: ( (lv_trueParameterList_5_0= ruleImplementationDef ) )*
                            loop43:
                            do {
                                int alt43=2;
                                int LA43_0 = input.LA(1);

                                if ( ((LA43_0>=46 && LA43_0<=49)||LA43_0==53||(LA43_0>=60 && LA43_0<=63)||(LA43_0>=65 && LA43_0<=84)) ) {
                                    alt43=1;
                                }


                                switch (alt43) {
                            	case 1 :
                            	    // InternalOil.g:1840:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:1840:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    // InternalOil.g:1841:7: lv_trueParameterList_5_0= ruleImplementationDef
                            	    {

                            	    							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getTrueParameterListImplementationDefParserRuleCall_2_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_16);
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
                            	    break loop43;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,25,FOLLOW_26); 

                            					newLeafNode(otherlv_6, grammarAccess.getImplAttrBooleanDefAccess().getRightCurlyBracketKeyword_2_2_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:1863:4: ( (lv_trueDescription_7_0= ruleEString ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_STRING) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // InternalOil.g:1864:5: (lv_trueDescription_7_0= ruleEString )
                            {
                            // InternalOil.g:1864:5: (lv_trueDescription_7_0= ruleEString )
                            // InternalOil.g:1865:6: lv_trueDescription_7_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getTrueDescriptionEStringParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_27);
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

                    otherlv_8=(Token)match(input,51,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrBooleanDefAccess().getCommaKeyword_2_4());
                    			
                    this_T_FALSE_9=(Token)match(input,RULE_T_FALSE,FOLLOW_29); 

                    				newLeafNode(this_T_FALSE_9, grammarAccess.getImplAttrBooleanDefAccess().getT_FALSETerminalRuleCall_2_5());
                    			
                    // InternalOil.g:1890:4: (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==24) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalOil.g:1891:5: otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}'
                            {
                            otherlv_10=(Token)match(input,24,FOLLOW_16); 

                            					newLeafNode(otherlv_10, grammarAccess.getImplAttrBooleanDefAccess().getLeftCurlyBracketKeyword_2_6_0());
                            				
                            // InternalOil.g:1895:5: ( (lv_falseParameterList_11_0= ruleImplementationDef ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( ((LA46_0>=46 && LA46_0<=49)||LA46_0==53||(LA46_0>=60 && LA46_0<=63)||(LA46_0>=65 && LA46_0<=84)) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // InternalOil.g:1896:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:1896:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    // InternalOil.g:1897:7: lv_falseParameterList_11_0= ruleImplementationDef
                            	    {

                            	    							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getFalseParameterListImplementationDefParserRuleCall_2_6_1_0());
                            	    						
                            	    pushFollow(FOLLOW_16);
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
                            	    break loop46;
                                }
                            } while (true);

                            otherlv_12=(Token)match(input,25,FOLLOW_30); 

                            					newLeafNode(otherlv_12, grammarAccess.getImplAttrBooleanDefAccess().getRightCurlyBracketKeyword_2_6_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:1919:4: ( (lv_falseDescription_13_0= ruleEString ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_STRING) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalOil.g:1920:5: (lv_falseDescription_13_0= ruleEString )
                            {
                            // InternalOil.g:1920:5: (lv_falseDescription_13_0= ruleEString )
                            // InternalOil.g:1921:6: lv_falseDescription_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getFalseDescriptionEStringParserRuleCall_2_7_0());
                            					
                            pushFollow(FOLLOW_31);
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

                    otherlv_14=(Token)match(input,52,FOLLOW_17); 

                    				newLeafNode(otherlv_14, grammarAccess.getImplAttrBooleanDefAccess().getRightSquareBracketKeyword_2_8());
                    			

                    }
                    break;

            }

            // InternalOil.g:1943:3: ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) )
            // InternalOil.g:1944:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            {
            // InternalOil.g:1944:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            // InternalOil.g:1945:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            {
            // InternalOil.g:1945:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( ((LA50_0>=26 && LA50_0<=44)) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalOil.g:1946:6: lv_name_15_1= ruleName
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameNameParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_18);
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
                    // InternalOil.g:1962:6: lv_name_15_2= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameObjectParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_18);
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

            // InternalOil.g:1980:3: ( (lv_multiple_16_0= ruleMultipleSpecifier ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==50) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOil.g:1981:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1981:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    // InternalOil.g:1982:5: lv_multiple_16_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_19);
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

            // InternalOil.g:1999:3: (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==20) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalOil.g:2000:4: otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getImplAttrBooleanDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:2004:4: ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( ((LA52_0>=RULE_T_TRUE && LA52_0<=RULE_T_FALSE)) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==59||LA52_0==64) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalOil.g:2005:5: ( (lv_value_18_0= ruleEBoolean ) )
                            {
                            // InternalOil.g:2005:5: ( (lv_value_18_0= ruleEBoolean ) )
                            // InternalOil.g:2006:6: (lv_value_18_0= ruleEBoolean )
                            {
                            // InternalOil.g:2006:6: (lv_value_18_0= ruleEBoolean )
                            // InternalOil.g:2007:7: lv_value_18_0= ruleEBoolean
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
                            // InternalOil.g:2025:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:2025:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            // InternalOil.g:2026:6: (lv_default_19_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:2026:6: (lv_default_19_0= ruleDefaultEnum )
                            // InternalOil.g:2027:7: lv_default_19_0= ruleDefaultEnum
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

            // InternalOil.g:2046:3: (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==21) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOil.g:2047:4: otherlv_20= ':' ( (lv_description_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getImplAttrBooleanDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:2051:4: ( (lv_description_21_0= ruleEString ) )
                    // InternalOil.g:2052:5: (lv_description_21_0= ruleEString )
                    {
                    // InternalOil.g:2052:5: (lv_description_21_0= ruleEString )
                    // InternalOil.g:2053:6: lv_description_21_0= ruleEString
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

            otherlv_22=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getImplAttrBooleanDefAccess().getSemicolonKeyword_7());
            		

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


    // $ANTLR start "entryRuleImplAttrIdentiFier"
    // InternalOil.g:2079:1: entryRuleImplAttrIdentiFier returns [EObject current=null] : iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF ;
    public final EObject entryRuleImplAttrIdentiFier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIdentiFier = null;


        try {
            // InternalOil.g:2079:59: (iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF )
            // InternalOil.g:2080:2: iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF
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
    // InternalOil.g:2086:1: ruleImplAttrIdentiFier returns [EObject current=null] : (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleImplAttrIdentiFier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        EObject lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2092:2: ( (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalOil.g:2093:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalOil.g:2093:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalOil.g:2094:3: otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrIdentiFierAccess().getIDENTIFIERKeyword_0());
            		
            // InternalOil.g:2098:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==45) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOil.g:2099:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2099:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2100:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,45,FOLLOW_17); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIdentiFierAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIdentiFierRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2112:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:2113:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:2113:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:2114:5: lv_name_2_0= ruleAttributeName
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

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getImplAttrIdentiFierAccess().getEqualsSignKeyword_3());
            		
            // InternalOil.g:2135:3: ( (lv_value_4_0= RULE_ID ) )
            // InternalOil.g:2136:4: (lv_value_4_0= RULE_ID )
            {
            // InternalOil.g:2136:4: (lv_value_4_0= RULE_ID )
            // InternalOil.g:2137:5: lv_value_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getImplAttrIdentiFierAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleRange"
    // InternalOil.g:2161:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalOil.g:2161:46: (iv_ruleRange= ruleRange EOF )
            // InternalOil.g:2162:2: iv_ruleRange= ruleRange EOF
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
    // InternalOil.g:2168:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) ;
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
            // InternalOil.g:2174:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) )
            // InternalOil.g:2175:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            {
            // InternalOil.g:2175:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            // InternalOil.g:2176:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:2180:3: ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) )
            int alt57=3;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_T_NUMBER) ) {
                switch ( input.LA(2) ) {
                case 54:
                    {
                    alt57=2;
                    }
                    break;
                case 52:
                    {
                    alt57=1;
                    }
                    break;
                case 51:
                    {
                    alt57=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalOil.g:2181:4: ( (lv_value_1_0= ruleNumber ) )
                    {
                    // InternalOil.g:2181:4: ( (lv_value_1_0= ruleNumber ) )
                    // InternalOil.g:2182:5: (lv_value_1_0= ruleNumber )
                    {
                    // InternalOil.g:2182:5: (lv_value_1_0= ruleNumber )
                    // InternalOil.g:2183:6: lv_value_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getValueNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_31);
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
                    // InternalOil.g:2201:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    {
                    // InternalOil.g:2201:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    // InternalOil.g:2202:5: ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) )
                    {
                    // InternalOil.g:2202:5: ( (lv_begin_2_0= ruleNumber ) )
                    // InternalOil.g:2203:6: (lv_begin_2_0= ruleNumber )
                    {
                    // InternalOil.g:2203:6: (lv_begin_2_0= ruleNumber )
                    // InternalOil.g:2204:7: lv_begin_2_0= ruleNumber
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

                    otherlv_3=(Token)match(input,54,FOLLOW_33); 

                    					newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_1_1_1());
                    				
                    // InternalOil.g:2225:5: ( (lv_end_4_0= ruleNumber ) )
                    // InternalOil.g:2226:6: (lv_end_4_0= ruleNumber )
                    {
                    // InternalOil.g:2226:6: (lv_end_4_0= ruleNumber )
                    // InternalOil.g:2227:7: lv_end_4_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getEndNumberParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_31);
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
                    // InternalOil.g:2246:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    {
                    // InternalOil.g:2246:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    // InternalOil.g:2247:5: ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    {
                    // InternalOil.g:2247:5: ( (lv_numbers_5_0= ruleNumber ) )
                    // InternalOil.g:2248:6: (lv_numbers_5_0= ruleNumber )
                    {
                    // InternalOil.g:2248:6: (lv_numbers_5_0= ruleNumber )
                    // InternalOil.g:2249:7: lv_numbers_5_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getNumbersNumberParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_27);
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

                    // InternalOil.g:2266:5: (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==51) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalOil.g:2267:6: otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) )
                    	    {
                    	    otherlv_6=(Token)match(input,51,FOLLOW_33); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getRangeAccess().getCommaKeyword_1_2_1_0());
                    	    					
                    	    // InternalOil.g:2271:6: ( (lv_numbers_7_0= ruleNumber ) )
                    	    // InternalOil.g:2272:7: (lv_numbers_7_0= ruleNumber )
                    	    {
                    	    // InternalOil.g:2272:7: (lv_numbers_7_0= ruleNumber )
                    	    // InternalOil.g:2273:8: lv_numbers_7_0= ruleNumber
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
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,52,FOLLOW_2); 

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
    // InternalOil.g:2301:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalOil.g:2301:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalOil.g:2302:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalOil.g:2308:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2314:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) )
            // InternalOil.g:2315:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            {
            // InternalOil.g:2315:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            // InternalOil.g:2316:3: otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:2320:3: ( (lv_list_1_0= ruleEnumerator ) )
            // InternalOil.g:2321:4: (lv_list_1_0= ruleEnumerator )
            {
            // InternalOil.g:2321:4: (lv_list_1_0= ruleEnumerator )
            // InternalOil.g:2322:5: lv_list_1_0= ruleEnumerator
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

            // InternalOil.g:2339:3: (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==51) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalOil.g:2340:4: otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) )
            	    {
            	    otherlv_2=(Token)match(input,51,FOLLOW_10); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOil.g:2344:4: ( (lv_list_3_0= ruleEnumerator ) )
            	    // InternalOil.g:2345:5: (lv_list_3_0= ruleEnumerator )
            	    {
            	    // InternalOil.g:2345:5: (lv_list_3_0= ruleEnumerator )
            	    // InternalOil.g:2346:6: lv_list_3_0= ruleEnumerator
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
            	    break loop58;
                }
            } while (true);

            otherlv_4=(Token)match(input,52,FOLLOW_2); 

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
    // InternalOil.g:2372:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // InternalOil.g:2372:51: (iv_ruleEnumerator= ruleEnumerator EOF )
            // InternalOil.g:2373:2: iv_ruleEnumerator= ruleEnumerator EOF
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
    // InternalOil.g:2379:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_implParameterList_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2385:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? ) )
            // InternalOil.g:2386:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? )
            {
            // InternalOil.g:2386:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? )
            // InternalOil.g:2387:3: ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )?
            {
            // InternalOil.g:2387:3: ( (lv_name_0_0= ruleName ) )
            // InternalOil.g:2388:4: (lv_name_0_0= ruleName )
            {
            // InternalOil.g:2388:4: (lv_name_0_0= ruleName )
            // InternalOil.g:2389:5: lv_name_0_0= ruleName
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

            // InternalOil.g:2406:3: (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==24) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOil.g:2407:4: otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumeratorAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOil.g:2411:4: ( (lv_implParameterList_2_0= ruleImplementationDef ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( ((LA59_0>=46 && LA59_0<=49)||LA59_0==53||(LA59_0>=60 && LA59_0<=63)||(LA59_0>=65 && LA59_0<=84)) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalOil.g:2412:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    {
                    	    // InternalOil.g:2412:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    // InternalOil.g:2413:6: lv_implParameterList_2_0= ruleImplementationDef
                    	    {

                    	    						newCompositeNode(grammarAccess.getEnumeratorAccess().getImplParameterListImplementationDefParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,25,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumeratorAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:2435:3: ( (lv_description_4_0= ruleEString ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_STRING) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOil.g:2436:4: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:2436:4: (lv_description_4_0= ruleEString )
                    // InternalOil.g:2437:5: lv_description_4_0= ruleEString
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
    // InternalOil.g:2458:1: entryRuleImplRefDef returns [EObject current=null] : iv_ruleImplRefDef= ruleImplRefDef EOF ;
    public final EObject entryRuleImplRefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplRefDef = null;


        try {
            // InternalOil.g:2458:51: (iv_ruleImplRefDef= ruleImplRefDef EOF )
            // InternalOil.g:2459:2: iv_ruleImplRefDef= ruleImplRefDef EOF
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
    // InternalOil.g:2465:1: ruleImplRefDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleImplRefDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_multiple_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2471:2: ( ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:2472:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:2472:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:2473:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:2473:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) )
            // InternalOil.g:2474:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            {
            // InternalOil.g:2474:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            // InternalOil.g:2475:5: lv_type_0_0= ruleObjectRefTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplRefDefAccess().getTypeObjectRefTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalOil.g:2492:3: ( (lv_name_1_0= ruleAttributeName ) )
            // InternalOil.g:2493:4: (lv_name_1_0= ruleAttributeName )
            {
            // InternalOil.g:2493:4: (lv_name_1_0= ruleAttributeName )
            // InternalOil.g:2494:5: lv_name_1_0= ruleAttributeName
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

            // InternalOil.g:2511:3: ( (lv_multiple_2_0= ruleMultipleSpecifier ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==50) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalOil.g:2512:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2512:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    // InternalOil.g:2513:5: lv_multiple_2_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplRefDefAccess().getMultipleMultipleSpecifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_14);
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

            // InternalOil.g:2530:3: ( (lv_description_3_0= ruleEString ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_STRING) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOil.g:2531:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:2531:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:2532:5: lv_description_3_0= ruleEString
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getImplRefDefAccess().getSemicolonKeyword_4());
            		

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
    // InternalOil.g:2557:1: entryRuleMultipleSpecifier returns [String current=null] : iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF ;
    public final String entryRuleMultipleSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultipleSpecifier = null;


        try {
            // InternalOil.g:2557:57: (iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF )
            // InternalOil.g:2558:2: iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF
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
    // InternalOil.g:2564:1: ruleMultipleSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleMultipleSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:2570:2: ( (kw= '[' kw= ']' ) )
            // InternalOil.g:2571:2: (kw= '[' kw= ']' )
            {
            // InternalOil.g:2571:2: (kw= '[' kw= ']' )
            // InternalOil.g:2572:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,50,FOLLOW_31); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMultipleSpecifierAccess().getLeftSquareBracketKeyword_0());
            		
            kw=(Token)match(input,52,FOLLOW_2); 

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
    // InternalOil.g:2586:1: entryRuleApplicationDefinition returns [EObject current=null] : iv_ruleApplicationDefinition= ruleApplicationDefinition EOF ;
    public final EObject entryRuleApplicationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationDefinition = null;


        try {
            // InternalOil.g:2586:62: (iv_ruleApplicationDefinition= ruleApplicationDefinition EOF )
            // InternalOil.g:2587:2: iv_ruleApplicationDefinition= ruleApplicationDefinition EOF
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
    // InternalOil.g:2593:1: ruleApplicationDefinition returns [EObject current=null] : (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) ;
    public final EObject ruleApplicationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_objectDefinitionList_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2599:2: ( (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) )
            // InternalOil.g:2600:2: (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            {
            // InternalOil.g:2600:2: (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            // InternalOil.g:2601:3: otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationDefinitionAccess().getCPUKeyword_0());
            		
            // InternalOil.g:2605:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:2606:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:2606:4: (lv_name_1_0= ruleName )
            // InternalOil.g:2607:5: lv_name_1_0= ruleName
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

            otherlv_2=(Token)match(input,24,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:2628:3: ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=26 && LA64_0<=44)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalOil.g:2629:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    {
            	    // InternalOil.g:2629:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    // InternalOil.g:2630:5: lv_objectDefinitionList_3_0= ruleObjectDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getObjectDefinitionListObjectDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getApplicationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:2651:3: ( (lv_description_5_0= ruleEString ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOil.g:2652:4: (lv_description_5_0= ruleEString )
                    {
                    // InternalOil.g:2652:4: (lv_description_5_0= ruleEString )
                    // InternalOil.g:2653:5: lv_description_5_0= ruleEString
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

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationDefinitionAccess().getSemicolonKeyword_6());
            		

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
    // InternalOil.g:2678:1: entryRuleObjectDefinition returns [EObject current=null] : iv_ruleObjectDefinition= ruleObjectDefinition EOF ;
    public final EObject entryRuleObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDefinition = null;


        try {
            // InternalOil.g:2678:57: (iv_ruleObjectDefinition= ruleObjectDefinition EOF )
            // InternalOil.g:2679:2: iv_ruleObjectDefinition= ruleObjectDefinition EOF
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
    // InternalOil.g:2685:1: ruleObjectDefinition returns [EObject current=null] : ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | ( ( (lv_object_6_0= ruleObject ) ) ( (lv_name_7_0= ruleName ) ) (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )? ( (lv_descrption_11_0= ruleEString ) )? otherlv_12= ';' ) ) ;
    public final EObject ruleObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_LibraryList_3_0 = null;

        AntlrDatatypeRuleToken lv_object_6_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_parameterList_9_0 = null;

        AntlrDatatypeRuleToken lv_descrption_11_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2691:2: ( ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | ( ( (lv_object_6_0= ruleObject ) ) ( (lv_name_7_0= ruleName ) ) (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )? ( (lv_descrption_11_0= ruleEString ) )? otherlv_12= ';' ) ) )
            // InternalOil.g:2692:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | ( ( (lv_object_6_0= ruleObject ) ) ( (lv_name_7_0= ruleName ) ) (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )? ( (lv_descrption_11_0= ruleEString ) )? otherlv_12= ';' ) )
            {
            // InternalOil.g:2692:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | ( ( (lv_object_6_0= ruleObject ) ) ( (lv_name_7_0= ruleName ) ) (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )? ( (lv_descrption_11_0= ruleEString ) )? otherlv_12= ';' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==44) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        switch ( input.LA(4) ) {
                        case RULE_ID:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                            {
                            alt71=2;
                            }
                            break;
                        case 25:
                            {
                            int LA71_6 = input.LA(5);

                            if ( (LA71_6==RULE_STRING) ) {
                                alt71=2;
                            }
                            else if ( (LA71_6==22) ) {
                                alt71=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 71, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case 56:
                        case 57:
                        case 58:
                            {
                            alt71=1;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 71, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RULE_STRING:
                        {
                        alt71=2;
                        }
                        break;
                    case 22:
                        {
                        alt71=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 3, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA71_0>=26 && LA71_0<=43)) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalOil.g:2693:3: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' )
                    {
                    // InternalOil.g:2693:3: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' )
                    // InternalOil.g:2694:4: otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getObjectDefinitionAccess().getLIBRARYKeyword_0_0());
                    			
                    // InternalOil.g:2698:4: ( (lv_name_1_0= ruleName ) )
                    // InternalOil.g:2699:5: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:2699:5: (lv_name_1_0= ruleName )
                    // InternalOil.g:2700:6: lv_name_1_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getNameNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_40);
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

                    // InternalOil.g:2717:4: (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==24) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalOil.g:2718:5: otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,24,FOLLOW_41); 

                            					newLeafNode(otherlv_2, grammarAccess.getObjectDefinitionAccess().getLeftCurlyBracketKeyword_0_2_0());
                            				
                            // InternalOil.g:2722:5: ( (lv_LibraryList_3_0= ruleLibrayattribute ) )*
                            loop66:
                            do {
                                int alt66=2;
                                int LA66_0 = input.LA(1);

                                if ( ((LA66_0>=56 && LA66_0<=58)) ) {
                                    alt66=1;
                                }


                                switch (alt66) {
                            	case 1 :
                            	    // InternalOil.g:2723:6: (lv_LibraryList_3_0= ruleLibrayattribute )
                            	    {
                            	    // InternalOil.g:2723:6: (lv_LibraryList_3_0= ruleLibrayattribute )
                            	    // InternalOil.g:2724:7: lv_LibraryList_3_0= ruleLibrayattribute
                            	    {

                            	    							newCompositeNode(grammarAccess.getObjectDefinitionAccess().getLibraryListLibrayattributeParserRuleCall_0_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_41);
                            	    lv_LibraryList_3_0=ruleLibrayattribute();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"LibraryList",
                            	    								lv_LibraryList_3_0,
                            	    								"org.xtext.example.oil.Oil.Librayattribute");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop66;
                                }
                            } while (true);

                            otherlv_4=(Token)match(input,25,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjectDefinitionAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:2752:3: ( ( (lv_object_6_0= ruleObject ) ) ( (lv_name_7_0= ruleName ) ) (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )? ( (lv_descrption_11_0= ruleEString ) )? otherlv_12= ';' )
                    {
                    // InternalOil.g:2752:3: ( ( (lv_object_6_0= ruleObject ) ) ( (lv_name_7_0= ruleName ) ) (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )? ( (lv_descrption_11_0= ruleEString ) )? otherlv_12= ';' )
                    // InternalOil.g:2753:4: ( (lv_object_6_0= ruleObject ) ) ( (lv_name_7_0= ruleName ) ) (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )? ( (lv_descrption_11_0= ruleEString ) )? otherlv_12= ';'
                    {
                    // InternalOil.g:2753:4: ( (lv_object_6_0= ruleObject ) )
                    // InternalOil.g:2754:5: (lv_object_6_0= ruleObject )
                    {
                    // InternalOil.g:2754:5: (lv_object_6_0= ruleObject )
                    // InternalOil.g:2755:6: lv_object_6_0= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getObjectObjectParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_object_6_0=ruleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"object",
                    							lv_object_6_0,
                    							"org.xtext.example.oil.Oil.Object");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:2772:4: ( (lv_name_7_0= ruleName ) )
                    // InternalOil.g:2773:5: (lv_name_7_0= ruleName )
                    {
                    // InternalOil.g:2773:5: (lv_name_7_0= ruleName )
                    // InternalOil.g:2774:6: lv_name_7_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getNameNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_name_7_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:2791:4: (otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==24) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalOil.g:2792:5: otherlv_8= '{' ( (lv_parameterList_9_0= ruleAttribute ) )* otherlv_10= '}'
                            {
                            otherlv_8=(Token)match(input,24,FOLLOW_39); 

                            					newLeafNode(otherlv_8, grammarAccess.getObjectDefinitionAccess().getLeftCurlyBracketKeyword_1_2_0());
                            				
                            // InternalOil.g:2796:5: ( (lv_parameterList_9_0= ruleAttribute ) )*
                            loop68:
                            do {
                                int alt68=2;
                                int LA68_0 = input.LA(1);

                                if ( (LA68_0==RULE_ID||(LA68_0>=26 && LA68_0<=44)) ) {
                                    alt68=1;
                                }


                                switch (alt68) {
                            	case 1 :
                            	    // InternalOil.g:2797:6: (lv_parameterList_9_0= ruleAttribute )
                            	    {
                            	    // InternalOil.g:2797:6: (lv_parameterList_9_0= ruleAttribute )
                            	    // InternalOil.g:2798:7: lv_parameterList_9_0= ruleAttribute
                            	    {

                            	    							newCompositeNode(grammarAccess.getObjectDefinitionAccess().getParameterListAttributeParserRuleCall_1_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_39);
                            	    lv_parameterList_9_0=ruleAttribute();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"parameterList",
                            	    								lv_parameterList_9_0,
                            	    								"org.xtext.example.oil.Oil.Attribute");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop68;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,25,FOLLOW_14); 

                            					newLeafNode(otherlv_10, grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_1_2_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:2820:4: ( (lv_descrption_11_0= ruleEString ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_STRING) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalOil.g:2821:5: (lv_descrption_11_0= ruleEString )
                            {
                            // InternalOil.g:2821:5: (lv_descrption_11_0= ruleEString )
                            // InternalOil.g:2822:6: lv_descrption_11_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getDescrptionEStringParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_9);
                            lv_descrption_11_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                            						}
                            						set(
                            							current,
                            							"descrption",
                            							lv_descrption_11_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getObjectDefinitionAccess().getSemicolonKeyword_1_4());
                    			

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
    // $ANTLR end "ruleObjectDefinition"


    // $ANTLR start "entryRuleLibrayattribute"
    // InternalOil.g:2848:1: entryRuleLibrayattribute returns [EObject current=null] : iv_ruleLibrayattribute= ruleLibrayattribute EOF ;
    public final EObject entryRuleLibrayattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrayattribute = null;


        try {
            // InternalOil.g:2848:56: (iv_ruleLibrayattribute= ruleLibrayattribute EOF )
            // InternalOil.g:2849:2: iv_ruleLibrayattribute= ruleLibrayattribute EOF
            {
             newCompositeNode(grammarAccess.getLibrayattributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrayattribute=ruleLibrayattribute();

            state._fsp--;

             current =iv_ruleLibrayattribute; 
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
    // $ANTLR end "entryRuleLibrayattribute"


    // $ANTLR start "ruleLibrayattribute"
    // InternalOil.g:2855:1: ruleLibrayattribute returns [EObject current=null] : ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleLibrayattribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_description_2_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2861:2: ( ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) ) )
            // InternalOil.g:2862:2: ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) )
            {
            // InternalOil.g:2862:2: ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt72=1;
                }
                break;
            case 57:
                {
                alt72=2;
                }
                break;
            case 58:
                {
                alt72=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalOil.g:2863:3: (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' )
                    {
                    // InternalOil.g:2863:3: (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' )
                    // InternalOil.g:2864:4: otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,56,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getLibrayattributeAccess().getPATHKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalOil.g:2872:4: ( (lv_description_2_0= ruleEString ) )
                    // InternalOil.g:2873:5: (lv_description_2_0= ruleEString )
                    {
                    // InternalOil.g:2873:5: (lv_description_2_0= ruleEString )
                    // InternalOil.g:2874:6: lv_description_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLibrayattributeAccess().getDescriptionEStringParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibrayattributeRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_2_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLibrayattributeAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:2897:3: (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' )
                    {
                    // InternalOil.g:2897:3: (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' )
                    // InternalOil.g:2898:4: otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getLibrayattributeAccess().getCHEADERKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalOil.g:2906:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:2907:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:2907:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:2908:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLibrayattributeAccess().getDescriptionEStringParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibrayattributeRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLibrayattributeAccess().getSemicolonKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:2931:3: (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' )
                    {
                    // InternalOil.g:2931:3: (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' )
                    // InternalOil.g:2932:4: otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';'
                    {
                    otherlv_8=(Token)match(input,58,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getLibrayattributeAccess().getCFILEKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalOil.g:2940:4: ( (lv_description_10_0= ruleEString ) )
                    // InternalOil.g:2941:5: (lv_description_10_0= ruleEString )
                    {
                    // InternalOil.g:2941:5: (lv_description_10_0= ruleEString )
                    // InternalOil.g:2942:6: lv_description_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLibrayattributeAccess().getDescriptionEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_description_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLibrayattributeRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_10_0,
                    							"org.xtext.example.oil.Oil.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getLibrayattributeAccess().getSemicolonKeyword_2_3());
                    			

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
    // $ANTLR end "ruleLibrayattribute"


    // $ANTLR start "entryRuleAttribute"
    // InternalOil.g:2968:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOil.g:2968:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOil.g:2969:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOil.g:2975:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2981:2: ( ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:2982:2: ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:2982:2: ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:2983:3: ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:2983:3: ( (lv_name_0_0= ruleAttributeName ) )
            // InternalOil.g:2984:4: (lv_name_0_0= ruleAttributeName )
            {
            // InternalOil.g:2984:4: (lv_name_0_0= ruleAttributeName )
            // InternalOil.g:2985:5: lv_name_0_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameAttributeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalOil.g:3002:3: (otherlv_1= '=' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==20) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOil.g:3003:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_43); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:3008:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:3009:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:3009:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:3010:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalOil.g:3027:3: ( (lv_description_3_0= ruleEString ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_STRING) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalOil.g:3028:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:3028:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:3029:5: lv_description_3_0= ruleEString
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

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getSemicolonKeyword_4());
            		

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
    // InternalOil.g:3054:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // InternalOil.g:3054:54: (iv_ruleAttributeName= ruleAttributeName EOF )
            // InternalOil.g:3055:2: iv_ruleAttributeName= ruleAttributeName EOF
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
    // InternalOil.g:3061:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_1 = null;

        AntlrDatatypeRuleToken lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalOil.g:3067:2: ( ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) )
            // InternalOil.g:3068:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            {
            // InternalOil.g:3068:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            // InternalOil.g:3069:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            {
            // InternalOil.g:3069:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            // InternalOil.g:3070:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            {
            // InternalOil.g:3070:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( ((LA75_0>=26 && LA75_0<=44)) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalOil.g:3071:5: lv_value_0_1= ruleName
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
                    // InternalOil.g:3087:5: lv_value_0_2= ruleObject
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
    // InternalOil.g:3108:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalOil.g:3108:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalOil.g:3109:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalOil.g:3115:1: ruleAttributeValue returns [EObject current=null] : (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) ;
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
            // InternalOil.g:3121:2: ( (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) )
            // InternalOil.g:3122:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            {
            // InternalOil.g:3122:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            int alt76=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt76=1;
                }
                break;
            case RULE_T_TRUE:
            case RULE_T_FALSE:
                {
                alt76=2;
                }
                break;
            case RULE_T_NUMBER:
                {
                alt76=3;
                }
                break;
            case RULE_T_FLOAT:
                {
                alt76=4;
                }
                break;
            case RULE_STRING:
                {
                alt76=5;
                }
                break;
            case 59:
                {
                alt76=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalOil.g:3123:3: this_NameAttributeValue_0= ruleNameAttributeValue
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
                    // InternalOil.g:3132:3: this_BooleanAttributeValue_1= ruleBooleanAttributeValue
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
                    // InternalOil.g:3141:3: this_NumberAttributeValue_2= ruleNumberAttributeValue
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
                    // InternalOil.g:3150:3: this_FloatAttributeValue_3= ruleFloatAttributeValue
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
                    // InternalOil.g:3159:3: this_StringAttributeValue_4= ruleStringAttributeValue
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
                    // InternalOil.g:3168:3: this_AutoAttributeValue_5= ruleAutoAttributeValue
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
    // InternalOil.g:3180:1: entryRuleNameAttributeValue returns [EObject current=null] : iv_ruleNameAttributeValue= ruleNameAttributeValue EOF ;
    public final EObject entryRuleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttributeValue = null;


        try {
            // InternalOil.g:3180:59: (iv_ruleNameAttributeValue= ruleNameAttributeValue EOF )
            // InternalOil.g:3181:2: iv_ruleNameAttributeValue= ruleNameAttributeValue EOF
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
    // InternalOil.g:3187:1: ruleNameAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3193:2: ( ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) )
            // InternalOil.g:3194:2: ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            {
            // InternalOil.g:3194:2: ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            // InternalOil.g:3195:3: ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            {
            // InternalOil.g:3195:3: ( (lv_value_0_0= ruleName ) )
            // InternalOil.g:3196:4: (lv_value_0_0= ruleName )
            {
            // InternalOil.g:3196:4: (lv_value_0_0= ruleName )
            // InternalOil.g:3197:5: lv_value_0_0= ruleName
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

            // InternalOil.g:3214:3: (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==24) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOil.g:3215:4: otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getNameAttributeValueAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOil.g:3219:4: ( (lv_parameterList_2_0= ruleAttribute ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==RULE_ID||(LA77_0>=26 && LA77_0<=44)) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalOil.g:3220:5: (lv_parameterList_2_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:3220:5: (lv_parameterList_2_0= ruleAttribute )
                    	    // InternalOil.g:3221:6: lv_parameterList_2_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getNameAttributeValueAccess().getParameterListAttributeParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop77;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getNameAttributeValueAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // InternalOil.g:3247:1: entryRuleBooleanAttributeValue returns [EObject current=null] : iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF ;
    public final EObject entryRuleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAttributeValue = null;


        try {
            // InternalOil.g:3247:62: (iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF )
            // InternalOil.g:3248:2: iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF
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
    // InternalOil.g:3254:1: ruleBooleanAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3260:2: ( ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) )
            // InternalOil.g:3261:2: ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            {
            // InternalOil.g:3261:2: ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            // InternalOil.g:3262:3: ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            {
            // InternalOil.g:3262:3: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalOil.g:3263:4: (lv_value_0_0= ruleEBoolean )
            {
            // InternalOil.g:3263:4: (lv_value_0_0= ruleEBoolean )
            // InternalOil.g:3264:5: lv_value_0_0= ruleEBoolean
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

            // InternalOil.g:3281:3: (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==24) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalOil.g:3282:4: otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_39); 

                    				newLeafNode(otherlv_1, grammarAccess.getBooleanAttributeValueAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOil.g:3286:4: ( (lv_parameterList_2_0= ruleAttribute ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_ID||(LA79_0>=26 && LA79_0<=44)) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalOil.g:3287:5: (lv_parameterList_2_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:3287:5: (lv_parameterList_2_0= ruleAttribute )
                    	    // InternalOil.g:3288:6: lv_parameterList_2_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getBooleanAttributeValueAccess().getParameterListAttributeParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
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
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanAttributeValueAccess().getRightCurlyBracketKeyword_1_2());
                    			

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
    // InternalOil.g:3314:1: entryRuleNumberAttributeValue returns [EObject current=null] : iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF ;
    public final EObject entryRuleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAttributeValue = null;


        try {
            // InternalOil.g:3314:61: (iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF )
            // InternalOil.g:3315:2: iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF
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
    // InternalOil.g:3321:1: ruleNumberAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3327:2: ( ( (lv_value_0_0= ruleNumber ) ) )
            // InternalOil.g:3328:2: ( (lv_value_0_0= ruleNumber ) )
            {
            // InternalOil.g:3328:2: ( (lv_value_0_0= ruleNumber ) )
            // InternalOil.g:3329:3: (lv_value_0_0= ruleNumber )
            {
            // InternalOil.g:3329:3: (lv_value_0_0= ruleNumber )
            // InternalOil.g:3330:4: lv_value_0_0= ruleNumber
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
    // InternalOil.g:3350:1: entryRuleFloatAttributeValue returns [EObject current=null] : iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF ;
    public final EObject entryRuleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatAttributeValue = null;


        try {
            // InternalOil.g:3350:60: (iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF )
            // InternalOil.g:3351:2: iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF
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
    // InternalOil.g:3357:1: ruleFloatAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloat ) ) ;
    public final EObject ruleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3363:2: ( ( (lv_value_0_0= ruleEFloat ) ) )
            // InternalOil.g:3364:2: ( (lv_value_0_0= ruleEFloat ) )
            {
            // InternalOil.g:3364:2: ( (lv_value_0_0= ruleEFloat ) )
            // InternalOil.g:3365:3: (lv_value_0_0= ruleEFloat )
            {
            // InternalOil.g:3365:3: (lv_value_0_0= ruleEFloat )
            // InternalOil.g:3366:4: lv_value_0_0= ruleEFloat
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
    // InternalOil.g:3386:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // InternalOil.g:3386:61: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // InternalOil.g:3387:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
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
    // InternalOil.g:3393:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3399:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalOil.g:3400:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalOil.g:3400:2: ( (lv_value_0_0= ruleEString ) )
            // InternalOil.g:3401:3: (lv_value_0_0= ruleEString )
            {
            // InternalOil.g:3401:3: (lv_value_0_0= ruleEString )
            // InternalOil.g:3402:4: lv_value_0_0= ruleEString
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
    // InternalOil.g:3422:1: entryRuleAutoAttributeValue returns [EObject current=null] : iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF ;
    public final EObject entryRuleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoAttributeValue = null;


        try {
            // InternalOil.g:3422:59: (iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF )
            // InternalOil.g:3423:2: iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF
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
    // InternalOil.g:3429:1: ruleAutoAttributeValue returns [EObject current=null] : ( (lv_value_0_0= 'AUTO' ) ) ;
    public final EObject ruleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOil.g:3435:2: ( ( (lv_value_0_0= 'AUTO' ) ) )
            // InternalOil.g:3436:2: ( (lv_value_0_0= 'AUTO' ) )
            {
            // InternalOil.g:3436:2: ( (lv_value_0_0= 'AUTO' ) )
            // InternalOil.g:3437:3: (lv_value_0_0= 'AUTO' )
            {
            // InternalOil.g:3437:3: (lv_value_0_0= 'AUTO' )
            // InternalOil.g:3438:4: lv_value_0_0= 'AUTO'
            {
            lv_value_0_0=(Token)match(input,59,FOLLOW_2); 

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
    // InternalOil.g:3453:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOil.g:3453:47: (iv_ruleEString= ruleEString EOF )
            // InternalOil.g:3454:2: iv_ruleEString= ruleEString EOF
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
    // InternalOil.g:3460:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalOil.g:3466:2: (this_STRING_0= RULE_STRING )
            // InternalOil.g:3467:2: this_STRING_0= RULE_STRING
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
    // InternalOil.g:3477:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalOil.g:3477:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalOil.g:3478:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalOil.g:3484:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_TRUE_0=null;
        Token this_T_FALSE_1=null;


        	enterRule();

        try {
            // InternalOil.g:3490:2: ( (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE ) )
            // InternalOil.g:3491:2: (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE )
            {
            // InternalOil.g:3491:2: (this_T_TRUE_0= RULE_T_TRUE | this_T_FALSE_1= RULE_T_FALSE )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_T_TRUE) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_T_FALSE) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // InternalOil.g:3492:3: this_T_TRUE_0= RULE_T_TRUE
                    {
                    this_T_TRUE_0=(Token)match(input,RULE_T_TRUE,FOLLOW_2); 

                    			current.merge(this_T_TRUE_0);
                    		

                    			newLeafNode(this_T_TRUE_0, grammarAccess.getEBooleanAccess().getT_TRUETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:3500:3: this_T_FALSE_1= RULE_T_FALSE
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
    // InternalOil.g:3511:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalOil.g:3511:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalOil.g:3512:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalOil.g:3518:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_NUMBER_0= RULE_T_NUMBER ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_NUMBER_0=null;


        	enterRule();

        try {
            // InternalOil.g:3524:2: (this_T_NUMBER_0= RULE_T_NUMBER )
            // InternalOil.g:3525:2: this_T_NUMBER_0= RULE_T_NUMBER
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
    // InternalOil.g:3535:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalOil.g:3535:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalOil.g:3536:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalOil.g:3542:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_FLOAT_0= RULE_T_FLOAT ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_FLOAT_0=null;


        	enterRule();

        try {
            // InternalOil.g:3548:2: (this_T_FLOAT_0= RULE_T_FLOAT )
            // InternalOil.g:3549:2: this_T_FLOAT_0= RULE_T_FLOAT
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
    // InternalOil.g:3559:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalOil.g:3559:44: (iv_ruleName= ruleName EOF )
            // InternalOil.g:3560:2: iv_ruleName= ruleName EOF
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
    // InternalOil.g:3566:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalOil.g:3572:2: (this_ID_0= RULE_ID )
            // InternalOil.g:3573:2: this_ID_0= RULE_ID
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
    // InternalOil.g:3583:1: ruleIntTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) ;
    public final Enumerator ruleIntTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOil.g:3589:2: ( ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) )
            // InternalOil.g:3590:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            {
            // InternalOil.g:3590:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt82=1;
                }
                break;
            case 61:
                {
                alt82=2;
                }
                break;
            case 62:
                {
                alt82=3;
                }
                break;
            case 63:
                {
                alt82=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalOil.g:3591:3: (enumLiteral_0= 'UINT32' )
                    {
                    // InternalOil.g:3591:3: (enumLiteral_0= 'UINT32' )
                    // InternalOil.g:3592:4: enumLiteral_0= 'UINT32'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3599:3: (enumLiteral_1= 'INT32' )
                    {
                    // InternalOil.g:3599:3: (enumLiteral_1= 'INT32' )
                    // InternalOil.g:3600:4: enumLiteral_1= 'INT32'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:3607:3: (enumLiteral_2= 'UINT64' )
                    {
                    // InternalOil.g:3607:3: (enumLiteral_2= 'UINT64' )
                    // InternalOil.g:3608:4: enumLiteral_2= 'UINT64'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:3615:3: (enumLiteral_3= 'INT64' )
                    {
                    // InternalOil.g:3615:3: (enumLiteral_3= 'INT64' )
                    // InternalOil.g:3616:4: enumLiteral_3= 'INT64'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

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
    // InternalOil.g:3626:1: ruleDefaultEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) ;
    public final Enumerator ruleDefaultEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:3632:2: ( ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) )
            // InternalOil.g:3633:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            {
            // InternalOil.g:3633:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==64) ) {
                alt83=1;
            }
            else if ( (LA83_0==59) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalOil.g:3634:3: (enumLiteral_0= 'NO_DEFAULT' )
                    {
                    // InternalOil.g:3634:3: (enumLiteral_0= 'NO_DEFAULT' )
                    // InternalOil.g:3635:4: enumLiteral_0= 'NO_DEFAULT'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3642:3: (enumLiteral_1= 'AUTO' )
                    {
                    // InternalOil.g:3642:3: (enumLiteral_1= 'AUTO' )
                    // InternalOil.g:3643:4: enumLiteral_1= 'AUTO'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalOil.g:3653:1: ruleObjectRefTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) ;
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
            // InternalOil.g:3659:2: ( ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) )
            // InternalOil.g:3660:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            {
            // InternalOil.g:3660:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            int alt84=20;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt84=1;
                }
                break;
            case 66:
                {
                alt84=2;
                }
                break;
            case 67:
                {
                alt84=3;
                }
                break;
            case 68:
                {
                alt84=4;
                }
                break;
            case 69:
                {
                alt84=5;
                }
                break;
            case 70:
                {
                alt84=6;
                }
                break;
            case 71:
                {
                alt84=7;
                }
                break;
            case 72:
                {
                alt84=8;
                }
                break;
            case 73:
                {
                alt84=9;
                }
                break;
            case 74:
                {
                alt84=10;
                }
                break;
            case 75:
                {
                alt84=11;
                }
                break;
            case 76:
                {
                alt84=12;
                }
                break;
            case 77:
                {
                alt84=13;
                }
                break;
            case 78:
                {
                alt84=14;
                }
                break;
            case 79:
                {
                alt84=15;
                }
                break;
            case 80:
                {
                alt84=16;
                }
                break;
            case 81:
                {
                alt84=17;
                }
                break;
            case 82:
                {
                alt84=18;
                }
                break;
            case 83:
                {
                alt84=19;
                }
                break;
            case 84:
                {
                alt84=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalOil.g:3661:3: (enumLiteral_0= 'OS_TYPE' )
                    {
                    // InternalOil.g:3661:3: (enumLiteral_0= 'OS_TYPE' )
                    // InternalOil.g:3662:4: enumLiteral_0= 'OS_TYPE'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3669:3: (enumLiteral_1= 'TASK_TYPE' )
                    {
                    // InternalOil.g:3669:3: (enumLiteral_1= 'TASK_TYPE' )
                    // InternalOil.g:3670:4: enumLiteral_1= 'TASK_TYPE'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:3677:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    {
                    // InternalOil.g:3677:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    // InternalOil.g:3678:4: enumLiteral_2= 'COUNTER_TYPE'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:3685:3: (enumLiteral_3= 'ALARM_TYPE' )
                    {
                    // InternalOil.g:3685:3: (enumLiteral_3= 'ALARM_TYPE' )
                    // InternalOil.g:3686:4: enumLiteral_3= 'ALARM_TYPE'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:3693:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    {
                    // InternalOil.g:3693:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    // InternalOil.g:3694:4: enumLiteral_4= 'RESOURCE_TYPE'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:3701:3: (enumLiteral_5= 'EVENT_TYPE' )
                    {
                    // InternalOil.g:3701:3: (enumLiteral_5= 'EVENT_TYPE' )
                    // InternalOil.g:3702:4: enumLiteral_5= 'EVENT_TYPE'
                    {
                    enumLiteral_5=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:3709:3: (enumLiteral_6= 'ISR_TYPE' )
                    {
                    // InternalOil.g:3709:3: (enumLiteral_6= 'ISR_TYPE' )
                    // InternalOil.g:3710:4: enumLiteral_6= 'ISR_TYPE'
                    {
                    enumLiteral_6=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:3717:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    {
                    // InternalOil.g:3717:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    // InternalOil.g:3718:4: enumLiteral_7= 'MESSAGE_TYPE'
                    {
                    enumLiteral_7=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOil.g:3725:3: (enumLiteral_8= 'COM_TYPE' )
                    {
                    // InternalOil.g:3725:3: (enumLiteral_8= 'COM_TYPE' )
                    // InternalOil.g:3726:4: enumLiteral_8= 'COM_TYPE'
                    {
                    enumLiteral_8=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOil.g:3733:3: (enumLiteral_9= 'NM_TYPE' )
                    {
                    // InternalOil.g:3733:3: (enumLiteral_9= 'NM_TYPE' )
                    // InternalOil.g:3734:4: enumLiteral_9= 'NM_TYPE'
                    {
                    enumLiteral_9=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOil.g:3741:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    {
                    // InternalOil.g:3741:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    // InternalOil.g:3742:4: enumLiteral_10= 'APPMODE_TYPE'
                    {
                    enumLiteral_10=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOil.g:3749:3: (enumLiteral_11= 'IPDU_TYPE' )
                    {
                    // InternalOil.g:3749:3: (enumLiteral_11= 'IPDU_TYPE' )
                    // InternalOil.g:3750:4: enumLiteral_11= 'IPDU_TYPE'
                    {
                    enumLiteral_11=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalOil.g:3757:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    {
                    // InternalOil.g:3757:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    // InternalOil.g:3758:4: enumLiteral_12= 'NETWORKMESSAGE_TYPE'
                    {
                    enumLiteral_12=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalOil.g:3765:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    {
                    // InternalOil.g:3765:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    // InternalOil.g:3766:4: enumLiteral_13= 'APPLICATION_TYPE'
                    {
                    enumLiteral_13=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalOil.g:3773:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    {
                    // InternalOil.g:3773:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    // InternalOil.g:3774:4: enumLiteral_14= 'MEMOTY_PROTECTION_TYPE'
                    {
                    enumLiteral_14=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalOil.g:3781:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    {
                    // InternalOil.g:3781:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    // InternalOil.g:3782:4: enumLiteral_15= 'SPINLOCK_TYPE'
                    {
                    enumLiteral_15=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalOil.g:3789:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    {
                    // InternalOil.g:3789:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    // InternalOil.g:3790:4: enumLiteral_16= 'SCHEDULETABLE_TYPE'
                    {
                    enumLiteral_16=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalOil.g:3797:3: (enumLiteral_17= 'IOC_TYPE' )
                    {
                    // InternalOil.g:3797:3: (enumLiteral_17= 'IOC_TYPE' )
                    // InternalOil.g:3798:4: enumLiteral_17= 'IOC_TYPE'
                    {
                    enumLiteral_17=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalOil.g:3805:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    {
                    // InternalOil.g:3805:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    // InternalOil.g:3806:4: enumLiteral_18= 'APICONFIG_TYPE'
                    {
                    enumLiteral_18=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalOil.g:3813:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    {
                    // InternalOil.g:3813:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    // InternalOil.g:3814:4: enumLiteral_19= 'LIBRARY_TYPE'
                    {
                    enumLiteral_19=(Token)match(input,84,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0080000000810000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000420100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xF023C00002000000L,0x00000000001FFFFEL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00043FFFFC000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000700000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0800000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0800000000000600L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800000000000280L,0x0000000000000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800000000020300L,0x0000000000000001L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0008000001020100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000020100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000001020100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000000020100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0800000000000260L,0x0000000000000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001020102L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020102L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000420100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00043FFFFE000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0700000002000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000001420100L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x08000000001207E0L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001000002L});

}