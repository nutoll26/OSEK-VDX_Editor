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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_FILEID", "RULE_ID", "RULE_T_NUMBER", "RULE_T_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#include'", "'<'", "'>'", "'OIL_VERSION'", "'='", "':'", "';'", "'IMPLEMENTATION'", "'{'", "'}'", "'OS'", "'TASK'", "'COUNTER'", "'APPLICATION'", "'HAS_RESTARTTASK'", "'TRUE'", "'FALSE'", "'RESTARTTASK'", "'TRUSTED'", "'ISR'", "'TIMING_PROTECTION'", "'ALARM'", "'RESOURCE'", "'EVENT'", "'MESSAGE'", "'COM'", "'NM'", "'APPMODE'", "'IPDU'", "'NETWORKMESSAGE'", "'MEMOTY_PROTECTION'", "'SPINLOCK'", "'SCHEDULETABLE'", "'IOC'", "'LIBRARY'", "'WITH_AUTO'", "'FLOAT'", "'ENUM'", "'STRING'", "'BOOLEAN'", "'['", "','", "']'", "'IDENTIFIER'", "'..'", "'CPU'", "'PATH'", "'CHEADER'", "'CFILE'", "'AUTO'", "'CORE'", "'ERRORHOOK'", "'SHUTDOWNHOOK'", "'STARTUPHOOK'", "'MAXALLINTERRUPTLOCKTIME'", "'MAXOSINTERRUPTLOCKTIME'", "'EXECUTIONTIME'", "'TIMEFRAME'", "'CATEGORY'", "'PRIORITY'", "'ENTRY'", "'STACKSIZE'", "'SOURCE'", "'UINT32'", "'INT32'", "'UINT64'", "'INT64'", "'NO_DEFAULT'", "'OS_TYPE'", "'TASK_TYPE'", "'COUNTER_TYPE'", "'ALARM_TYPE'", "'RESOURCE_TYPE'", "'EVENT_TYPE'", "'ISR_TYPE'", "'MESSAGE_TYPE'", "'COM_TYPE'", "'NM_TYPE'", "'APPMODE_TYPE'", "'IPDU_TYPE'", "'NETWORKMESSAGE_TYPE'", "'APPLICATION_TYPE'", "'MEMOTY_PROTECTION_TYPE'", "'SPINLOCK_TYPE'", "'SCHEDULETABLE_TYPE'", "'IOC_TYPE'", "'APICONFIG_TYPE'", "'LIBRARY_TYPE'"
    };
    public static final int T__50=50;
    public static final int RULE_T_FLOAT=8;
    public static final int T__59=59;
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
    public static final int RULE_ID=6;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_T_NUMBER=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_FILEID=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

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

            if ( (LA1_0==17) ) {
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

                if ( (LA2_0==14) ) {
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

            if ( (LA3_0==21) ) {
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
    // InternalOil.g:167:1: ruleInclude returns [EObject current=null] : (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:173:2: ( (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= RULE_STRING ) ) ) ) )
            // InternalOil.g:174:2: (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= RULE_STRING ) ) ) )
            {
            // InternalOil.g:174:2: (otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= RULE_STRING ) ) ) )
            // InternalOil.g:175:3: otherlv_0= '#include' ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalOil.g:179:3: ( (otherlv_1= '<' ( (lv_name_2_0= ruleFileName ) ) otherlv_3= '>' ) | ( (lv_name_4_0= RULE_STRING ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
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
                    otherlv_1=(Token)match(input,15,FOLLOW_5); 

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

                    otherlv_3=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getGreaterThanSignKeyword_1_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:210:4: ( (lv_name_4_0= RULE_STRING ) )
                    {
                    // InternalOil.g:210:4: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalOil.g:211:5: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalOil.g:211:5: (lv_name_4_0= RULE_STRING )
                    // InternalOil.g:212:6: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getIncludeAccess().getNameSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIncludeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // InternalOil.g:233:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // InternalOil.g:233:48: (iv_ruleFileName= ruleFileName EOF )
            // InternalOil.g:234:2: iv_ruleFileName= ruleFileName EOF
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
    // InternalOil.g:240:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FILEID_0= RULE_FILEID ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_FILEID_0=null;


        	enterRule();

        try {
            // InternalOil.g:246:2: (this_FILEID_0= RULE_FILEID )
            // InternalOil.g:247:2: this_FILEID_0= RULE_FILEID
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
    // InternalOil.g:257:1: entryRuleOILVersion returns [EObject current=null] : iv_ruleOILVersion= ruleOILVersion EOF ;
    public final EObject entryRuleOILVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOILVersion = null;


        try {
            // InternalOil.g:257:51: (iv_ruleOILVersion= ruleOILVersion EOF )
            // InternalOil.g:258:2: iv_ruleOILVersion= ruleOILVersion EOF
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
    // InternalOil.g:264:1: ruleOILVersion returns [EObject current=null] : (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleOILVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:270:2: ( (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' ) )
            // InternalOil.g:271:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' )
            {
            // InternalOil.g:271:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' )
            // InternalOil.g:272:3: otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_version_2_0= RULE_STRING ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOILVersionAccess().getOIL_VERSIONKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOILVersionAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:280:3: ( (lv_version_2_0= RULE_STRING ) )
            // InternalOil.g:281:4: (lv_version_2_0= RULE_STRING )
            {
            // InternalOil.g:281:4: (lv_version_2_0= RULE_STRING )
            // InternalOil.g:282:5: lv_version_2_0= RULE_STRING
            {
            lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_version_2_0, grammarAccess.getOILVersionAccess().getVersionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOILVersionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOil.g:298:3: (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOil.g:299:4: otherlv_3= ':' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getOILVersionAccess().getColonKeyword_3_0());
                    			
                    // InternalOil.g:303:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalOil.g:304:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:304:5: (lv_description_4_0= ruleEString )
                    // InternalOil.g:305:6: lv_description_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOILVersionAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:331:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // InternalOil.g:331:65: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // InternalOil.g:332:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
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
    // InternalOil.g:338:1: ruleImplementationDefinition returns [EObject current=null] : (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_implementationSpecs_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:344:2: ( (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' otherlv_5= ';' ) )
            // InternalOil.g:345:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalOil.g:345:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' otherlv_5= ';' )
            // InternalOil.g:346:3: otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationDefinitionAccess().getIMPLEMENTATIONKeyword_0());
            		
            // InternalOil.g:350:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:351:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:351:4: (lv_name_1_0= ruleName )
            // InternalOil.g:352:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getImplementationDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:373:3: ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )
            // InternalOil.g:374:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            {
            // InternalOil.g:374:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            // InternalOil.g:375:5: lv_implementationSpecs_3_0= ruleImplementationSpec
            {

            					newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getImplementationSpecsImplementationSpecParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getImplementationDefinitionAccess().getSemicolonKeyword_5());
            		

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
    // InternalOil.g:404:1: entryRuleImplementationSpec returns [EObject current=null] : iv_ruleImplementationSpec= ruleImplementationSpec EOF ;
    public final EObject entryRuleImplementationSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationSpec = null;


        try {
            // InternalOil.g:404:59: (iv_ruleImplementationSpec= ruleImplementationSpec EOF )
            // InternalOil.g:405:2: iv_ruleImplementationSpec= ruleImplementationSpec EOF
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
    // InternalOil.g:411:1: ruleImplementationSpec returns [EObject current=null] : ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ ) ;
    public final EObject ruleImplementationSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_osRule_1_0 = null;

        EObject lv_taskRule_2_0 = null;

        EObject lv_counterRule_3_0 = null;

        EObject lv_isrRule_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:417:2: ( ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ ) )
            // InternalOil.g:418:2: ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ )
            {
            // InternalOil.g:418:2: ( () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+ )
            // InternalOil.g:419:3: () ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+
            {
            // InternalOil.g:419:3: ()
            // InternalOil.g:420:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementationSpecAccess().getImplementationSpecAction_0(),
            					current);
            			

            }

            // InternalOil.g:426:3: ( ( (lv_osRule_1_0= ruleOsRule ) ) | ( (lv_taskRule_2_0= ruleTaskRule ) ) | ( (lv_counterRule_3_0= ruleCounterRule ) ) | ( (lv_isrRule_4_0= ruleIsrRule ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=5;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    alt6=1;
                    }
                    break;
                case 25:
                    {
                    alt6=2;
                    }
                    break;
                case 26:
                    {
                    alt6=3;
                    }
                    break;
                case 33:
                    {
                    alt6=4;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalOil.g:427:4: ( (lv_osRule_1_0= ruleOsRule ) )
            	    {
            	    // InternalOil.g:427:4: ( (lv_osRule_1_0= ruleOsRule ) )
            	    // InternalOil.g:428:5: (lv_osRule_1_0= ruleOsRule )
            	    {
            	    // InternalOil.g:428:5: (lv_osRule_1_0= ruleOsRule )
            	    // InternalOil.g:429:6: lv_osRule_1_0= ruleOsRule
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
            	    // InternalOil.g:447:4: ( (lv_taskRule_2_0= ruleTaskRule ) )
            	    {
            	    // InternalOil.g:447:4: ( (lv_taskRule_2_0= ruleTaskRule ) )
            	    // InternalOil.g:448:5: (lv_taskRule_2_0= ruleTaskRule )
            	    {
            	    // InternalOil.g:448:5: (lv_taskRule_2_0= ruleTaskRule )
            	    // InternalOil.g:449:6: lv_taskRule_2_0= ruleTaskRule
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
            	    // InternalOil.g:467:4: ( (lv_counterRule_3_0= ruleCounterRule ) )
            	    {
            	    // InternalOil.g:467:4: ( (lv_counterRule_3_0= ruleCounterRule ) )
            	    // InternalOil.g:468:5: (lv_counterRule_3_0= ruleCounterRule )
            	    {
            	    // InternalOil.g:468:5: (lv_counterRule_3_0= ruleCounterRule )
            	    // InternalOil.g:469:6: lv_counterRule_3_0= ruleCounterRule
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
            	    // InternalOil.g:487:4: ( (lv_isrRule_4_0= ruleIsrRule ) )
            	    {
            	    // InternalOil.g:487:4: ( (lv_isrRule_4_0= ruleIsrRule ) )
            	    // InternalOil.g:488:5: (lv_isrRule_4_0= ruleIsrRule )
            	    {
            	    // InternalOil.g:488:5: (lv_isrRule_4_0= ruleIsrRule )
            	    // InternalOil.g:489:6: lv_isrRule_4_0= ruleIsrRule
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // InternalOil.g:511:1: entryRuleOsRule returns [EObject current=null] : iv_ruleOsRule= ruleOsRule EOF ;
    public final EObject entryRuleOsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOsRule = null;


        try {
            // InternalOil.g:511:47: (iv_ruleOsRule= ruleOsRule EOF )
            // InternalOil.g:512:2: iv_ruleOsRule= ruleOsRule EOF
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
    // InternalOil.g:518:1: ruleOsRule returns [EObject current=null] : ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleOsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_implementations_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:524:2: ( ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalOil.g:525:2: ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalOil.g:525:2: ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalOil.g:526:3: () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';'
            {
            // InternalOil.g:526:3: ()
            // InternalOil.g:527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOsRuleAccess().getOsRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getOsRuleAccess().getOSKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getOsRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:541:3: ( (lv_implementations_3_0= ruleImplementationDef ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=50 && LA7_0<=53)||LA7_0==57||(LA7_0>=77 && LA7_0<=80)||(LA7_0>=82 && LA7_0<=101)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOil.g:542:4: (lv_implementations_3_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:542:4: (lv_implementations_3_0= ruleImplementationDef )
            	    // InternalOil.g:543:5: lv_implementations_3_0= ruleImplementationDef
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getOsRuleAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOsRuleAccess().getSemicolonKeyword_5());
            		

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
    // InternalOil.g:572:1: entryRuleTaskRule returns [EObject current=null] : iv_ruleTaskRule= ruleTaskRule EOF ;
    public final EObject entryRuleTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRule = null;


        try {
            // InternalOil.g:572:49: (iv_ruleTaskRule= ruleTaskRule EOF )
            // InternalOil.g:573:2: iv_ruleTaskRule= ruleTaskRule EOF
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
    // InternalOil.g:579:1: ruleTaskRule returns [EObject current=null] : ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleTaskRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_implementations_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:585:2: ( ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalOil.g:586:2: ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalOil.g:586:2: ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalOil.g:587:3: () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';'
            {
            // InternalOil.g:587:3: ()
            // InternalOil.g:588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskRuleAccess().getTaskRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRuleAccess().getTASKKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:602:3: ( (lv_implementations_3_0= ruleImplementationDef ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=50 && LA8_0<=53)||LA8_0==57||(LA8_0>=77 && LA8_0<=80)||(LA8_0>=82 && LA8_0<=101)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOil.g:603:4: (lv_implementations_3_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:603:4: (lv_implementations_3_0= ruleImplementationDef )
            	    // InternalOil.g:604:5: lv_implementations_3_0= ruleImplementationDef
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
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskRuleAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskRuleAccess().getSemicolonKeyword_5());
            		

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
    // InternalOil.g:633:1: entryRuleCounterRule returns [EObject current=null] : iv_ruleCounterRule= ruleCounterRule EOF ;
    public final EObject entryRuleCounterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCounterRule = null;


        try {
            // InternalOil.g:633:52: (iv_ruleCounterRule= ruleCounterRule EOF )
            // InternalOil.g:634:2: iv_ruleCounterRule= ruleCounterRule EOF
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
    // InternalOil.g:640:1: ruleCounterRule returns [EObject current=null] : ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleCounterRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_implementations_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:646:2: ( ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalOil.g:647:2: ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalOil.g:647:2: ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalOil.g:648:3: () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImplementationDef ) )* otherlv_4= '}' otherlv_5= ';'
            {
            // InternalOil.g:648:3: ()
            // InternalOil.g:649:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCounterRuleAccess().getCounterRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCounterRuleAccess().getCOUNTERKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getCounterRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:663:3: ( (lv_implementations_3_0= ruleImplementationDef ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=50 && LA9_0<=53)||LA9_0==57||(LA9_0>=77 && LA9_0<=80)||(LA9_0>=82 && LA9_0<=101)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOil.g:664:4: (lv_implementations_3_0= ruleImplementationDef )
            	    {
            	    // InternalOil.g:664:4: (lv_implementations_3_0= ruleImplementationDef )
            	    // InternalOil.g:665:5: lv_implementations_3_0= ruleImplementationDef
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getCounterRuleAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCounterRuleAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleApplicationRule"
    // InternalOil.g:694:1: entryRuleApplicationRule returns [EObject current=null] : iv_ruleApplicationRule= ruleApplicationRule EOF ;
    public final EObject entryRuleApplicationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationRule = null;


        try {
            // InternalOil.g:694:56: (iv_ruleApplicationRule= ruleApplicationRule EOF )
            // InternalOil.g:695:2: iv_ruleApplicationRule= ruleApplicationRule EOF
            {
             newCompositeNode(grammarAccess.getApplicationRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationRule=ruleApplicationRule();

            state._fsp--;

             current =iv_ruleApplicationRule; 
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
    // $ANTLR end "entryRuleApplicationRule"


    // $ANTLR start "ruleApplicationRule"
    // InternalOil.g:701:1: ruleApplicationRule returns [EObject current=null] : ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' ) ;
    public final EObject ruleApplicationRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_appSubOrParam_4_1 = null;

        EObject lv_appSubOrParam_4_2 = null;



        	enterRule();

        try {
            // InternalOil.g:707:2: ( ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalOil.g:708:2: ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalOil.g:708:2: ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalOil.g:709:3: () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';'
            {
            // InternalOil.g:709:3: ()
            // InternalOil.g:710:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationRuleAccess().getApplicationRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationRuleAccess().getAPPLICATIONKeyword_1());
            		
            // InternalOil.g:720:3: ( (lv_name_2_0= ruleName ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOil.g:721:4: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:721:4: (lv_name_2_0= ruleName )
                    // InternalOil.g:722:5: lv_name_2_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getApplicationRuleAccess().getNameNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getApplicationRuleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.oil.Oil.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationRuleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOil.g:743:3: ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=25 && LA12_0<=26)||LA12_0==28||(LA12_0>=32 && LA12_0<=33)||(LA12_0>=35 && LA12_0<=36)||LA12_0==38||(LA12_0>=46 && LA12_0<=47)||(LA12_0>=64 && LA12_0<=67)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOil.g:744:4: ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) )
            	    {
            	    // InternalOil.g:744:4: ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) )
            	    // InternalOil.g:745:5: (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam )
            	    {
            	    // InternalOil.g:745:5: (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==28||LA11_0==32) ) {
            	        alt11=1;
            	    }
            	    else if ( ((LA11_0>=25 && LA11_0<=26)||LA11_0==33||(LA11_0>=35 && LA11_0<=36)||LA11_0==38||(LA11_0>=46 && LA11_0<=47)||(LA11_0>=64 && LA11_0<=67)) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalOil.g:746:6: lv_appSubOrParam_4_1= ruleAppSubContainer
            	            {

            	            						newCompositeNode(grammarAccess.getApplicationRuleAccess().getAppSubOrParamAppSubContainerParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_appSubOrParam_4_1=ruleAppSubContainer();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getApplicationRuleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"appSubOrParam",
            	            							lv_appSubOrParam_4_1,
            	            							"org.xtext.example.oil.Oil.AppSubContainer");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalOil.g:762:6: lv_appSubOrParam_4_2= ruleApplicationParam
            	            {

            	            						newCompositeNode(grammarAccess.getApplicationRuleAccess().getAppSubOrParamApplicationParamParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_18);
            	            lv_appSubOrParam_4_2=ruleApplicationParam();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getApplicationRuleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"appSubOrParam",
            	            							lv_appSubOrParam_4_2,
            	            							"org.xtext.example.oil.Oil.ApplicationParam");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getApplicationRuleAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getApplicationRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleApplicationRule"


    // $ANTLR start "entryRuleAppSubContainer"
    // InternalOil.g:792:1: entryRuleAppSubContainer returns [EObject current=null] : iv_ruleAppSubContainer= ruleAppSubContainer EOF ;
    public final EObject entryRuleAppSubContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppSubContainer = null;


        try {
            // InternalOil.g:792:56: (iv_ruleAppSubContainer= ruleAppSubContainer EOF )
            // InternalOil.g:793:2: iv_ruleAppSubContainer= ruleAppSubContainer EOF
            {
             newCompositeNode(grammarAccess.getAppSubContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppSubContainer=ruleAppSubContainer();

            state._fsp--;

             current =iv_ruleAppSubContainer; 
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
    // $ANTLR end "entryRuleAppSubContainer"


    // $ANTLR start "ruleAppSubContainer"
    // InternalOil.g:799:1: ruleAppSubContainer returns [EObject current=null] : ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) ) ;
    public final EObject ruleAppSubContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_hasRestartTaskRule_0_0 = null;

        EObject lv_trustedRule_1_0 = null;



        	enterRule();

        try {
            // InternalOil.g:805:2: ( ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) ) )
            // InternalOil.g:806:2: ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) )
            {
            // InternalOil.g:806:2: ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalOil.g:807:3: ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) )
                    {
                    // InternalOil.g:807:3: ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) )
                    // InternalOil.g:808:4: (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule )
                    {
                    // InternalOil.g:808:4: (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule )
                    // InternalOil.g:809:5: lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule
                    {

                    					newCompositeNode(grammarAccess.getAppSubContainerAccess().getHasRestartTaskRuleHasRestartTaskRuleParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_hasRestartTaskRule_0_0=ruleHasRestartTaskRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppSubContainerRule());
                    					}
                    					set(
                    						current,
                    						"hasRestartTaskRule",
                    						lv_hasRestartTaskRule_0_0,
                    						"org.xtext.example.oil.Oil.HasRestartTaskRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:827:3: ( (lv_trustedRule_1_0= ruleTrustedRule ) )
                    {
                    // InternalOil.g:827:3: ( (lv_trustedRule_1_0= ruleTrustedRule ) )
                    // InternalOil.g:828:4: (lv_trustedRule_1_0= ruleTrustedRule )
                    {
                    // InternalOil.g:828:4: (lv_trustedRule_1_0= ruleTrustedRule )
                    // InternalOil.g:829:5: lv_trustedRule_1_0= ruleTrustedRule
                    {

                    					newCompositeNode(grammarAccess.getAppSubContainerAccess().getTrustedRuleTrustedRuleParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_trustedRule_1_0=ruleTrustedRule();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAppSubContainerRule());
                    					}
                    					set(
                    						current,
                    						"trustedRule",
                    						lv_trustedRule_1_0,
                    						"org.xtext.example.oil.Oil.TrustedRule");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleAppSubContainer"


    // $ANTLR start "entryRuleHasRestartTaskRule"
    // InternalOil.g:850:1: entryRuleHasRestartTaskRule returns [EObject current=null] : iv_ruleHasRestartTaskRule= ruleHasRestartTaskRule EOF ;
    public final EObject entryRuleHasRestartTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasRestartTaskRule = null;


        try {
            // InternalOil.g:850:59: (iv_ruleHasRestartTaskRule= ruleHasRestartTaskRule EOF )
            // InternalOil.g:851:2: iv_ruleHasRestartTaskRule= ruleHasRestartTaskRule EOF
            {
             newCompositeNode(grammarAccess.getHasRestartTaskRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHasRestartTaskRule=ruleHasRestartTaskRule();

            state._fsp--;

             current =iv_ruleHasRestartTaskRule; 
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
    // $ANTLR end "entryRuleHasRestartTaskRule"


    // $ANTLR start "ruleHasRestartTaskRule"
    // InternalOil.g:857:1: ruleHasRestartTaskRule returns [EObject current=null] : ( () otherlv_1= 'HAS_RESTARTTASK' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' ) ;
    public final EObject ruleHasRestartTaskRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_restartTaskRule_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:863:2: ( ( () otherlv_1= 'HAS_RESTARTTASK' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' ) )
            // InternalOil.g:864:2: ( () otherlv_1= 'HAS_RESTARTTASK' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' )
            {
            // InternalOil.g:864:2: ( () otherlv_1= 'HAS_RESTARTTASK' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' )
            // InternalOil.g:865:3: () otherlv_1= 'HAS_RESTARTTASK' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';'
            {
            // InternalOil.g:865:3: ()
            // InternalOil.g:866:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHasRestartTaskRuleAccess().getHasRestartTaskRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getHasRestartTaskRuleAccess().getHAS_RESTARTTASKKeyword_1());
            		
            // InternalOil.g:876:3: ( (lv_name_2_0= ruleName ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalOil.g:877:4: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:877:4: (lv_name_2_0= ruleName )
                    // InternalOil.g:878:5: lv_name_2_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getHasRestartTaskRuleAccess().getNameNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHasRestartTaskRuleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.oil.Oil.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getHasRestartTaskRuleAccess().getEqualsSignKeyword_3());
            		
            // InternalOil.g:899:3: ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' ) | otherlv_8= 'FALSE' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            else if ( (LA15_0==30) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalOil.g:900:4: (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' )
                    {
                    // InternalOil.g:900:4: (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}' )
                    // InternalOil.g:901:5: otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) ) otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getHasRestartTaskRuleAccess().getTRUEKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,22,FOLLOW_21); 

                    					newLeafNode(otherlv_5, grammarAccess.getHasRestartTaskRuleAccess().getLeftCurlyBracketKeyword_4_0_1());
                    				
                    // InternalOil.g:909:5: ( (lv_restartTaskRule_6_0= ruleRestartTaskRule ) )
                    // InternalOil.g:910:6: (lv_restartTaskRule_6_0= ruleRestartTaskRule )
                    {
                    // InternalOil.g:910:6: (lv_restartTaskRule_6_0= ruleRestartTaskRule )
                    // InternalOil.g:911:7: lv_restartTaskRule_6_0= ruleRestartTaskRule
                    {

                    							newCompositeNode(grammarAccess.getHasRestartTaskRuleAccess().getRestartTaskRuleRestartTaskRuleParserRuleCall_4_0_2_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_restartTaskRule_6_0=ruleRestartTaskRule();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getHasRestartTaskRuleRule());
                    							}
                    							set(
                    								current,
                    								"restartTaskRule",
                    								lv_restartTaskRule_6_0,
                    								"org.xtext.example.oil.Oil.RestartTaskRule");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getHasRestartTaskRuleAccess().getRightCurlyBracketKeyword_4_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:934:4: otherlv_8= 'FALSE'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getHasRestartTaskRuleAccess().getFALSEKeyword_4_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getHasRestartTaskRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleHasRestartTaskRule"


    // $ANTLR start "entryRuleRestartTaskRule"
    // InternalOil.g:947:1: entryRuleRestartTaskRule returns [EObject current=null] : iv_ruleRestartTaskRule= ruleRestartTaskRule EOF ;
    public final EObject entryRuleRestartTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartTaskRule = null;


        try {
            // InternalOil.g:947:56: (iv_ruleRestartTaskRule= ruleRestartTaskRule EOF )
            // InternalOil.g:948:2: iv_ruleRestartTaskRule= ruleRestartTaskRule EOF
            {
             newCompositeNode(grammarAccess.getRestartTaskRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestartTaskRule=ruleRestartTaskRule();

            state._fsp--;

             current =iv_ruleRestartTaskRule; 
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
    // $ANTLR end "entryRuleRestartTaskRule"


    // $ANTLR start "ruleRestartTaskRule"
    // InternalOil.g:954:1: ruleRestartTaskRule returns [EObject current=null] : (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleRestartTaskRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:960:2: ( (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' ) )
            // InternalOil.g:961:2: (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' )
            {
            // InternalOil.g:961:2: (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' )
            // InternalOil.g:962:3: otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getRestartTaskRuleAccess().getRESTARTTASKKeyword_0());
            		
            // InternalOil.g:966:3: ( (lv_name_1_0= ruleName ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOil.g:967:4: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:967:4: (lv_name_1_0= ruleName )
                    // InternalOil.g:968:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getRestartTaskRuleAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRestartTaskRuleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.xtext.example.oil.Oil.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getRestartTaskRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalOil.g:989:3: ( (lv_value_3_0= ruleAttributeValue ) )
            // InternalOil.g:990:4: (lv_value_3_0= ruleAttributeValue )
            {
            // InternalOil.g:990:4: (lv_value_3_0= ruleAttributeValue )
            // InternalOil.g:991:5: lv_value_3_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getRestartTaskRuleAccess().getValueAttributeValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestartTaskRuleRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRestartTaskRuleAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRestartTaskRule"


    // $ANTLR start "entryRuleTrustedRule"
    // InternalOil.g:1016:1: entryRuleTrustedRule returns [EObject current=null] : iv_ruleTrustedRule= ruleTrustedRule EOF ;
    public final EObject entryRuleTrustedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrustedRule = null;


        try {
            // InternalOil.g:1016:52: (iv_ruleTrustedRule= ruleTrustedRule EOF )
            // InternalOil.g:1017:2: iv_ruleTrustedRule= ruleTrustedRule EOF
            {
             newCompositeNode(grammarAccess.getTrustedRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrustedRule=ruleTrustedRule();

            state._fsp--;

             current =iv_ruleTrustedRule; 
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
    // $ANTLR end "entryRuleTrustedRule"


    // $ANTLR start "ruleTrustedRule"
    // InternalOil.g:1023:1: ruleTrustedRule returns [EObject current=null] : ( () otherlv_1= 'TRUSTED' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' (otherlv_4= 'TRUE' | otherlv_5= 'FALSE' ) otherlv_6= ';' ) ;
    public final EObject ruleTrustedRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1029:2: ( ( () otherlv_1= 'TRUSTED' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' (otherlv_4= 'TRUE' | otherlv_5= 'FALSE' ) otherlv_6= ';' ) )
            // InternalOil.g:1030:2: ( () otherlv_1= 'TRUSTED' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' (otherlv_4= 'TRUE' | otherlv_5= 'FALSE' ) otherlv_6= ';' )
            {
            // InternalOil.g:1030:2: ( () otherlv_1= 'TRUSTED' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' (otherlv_4= 'TRUE' | otherlv_5= 'FALSE' ) otherlv_6= ';' )
            // InternalOil.g:1031:3: () otherlv_1= 'TRUSTED' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' (otherlv_4= 'TRUE' | otherlv_5= 'FALSE' ) otherlv_6= ';'
            {
            // InternalOil.g:1031:3: ()
            // InternalOil.g:1032:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTrustedRuleAccess().getTrustedRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTrustedRuleAccess().getTRUSTEDKeyword_1());
            		
            // InternalOil.g:1042:3: ( (lv_name_2_0= ruleName ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalOil.g:1043:4: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:1043:4: (lv_name_2_0= ruleName )
                    // InternalOil.g:1044:5: lv_name_2_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getTrustedRuleAccess().getNameNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTrustedRuleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.oil.Oil.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTrustedRuleAccess().getEqualsSignKeyword_3());
            		
            // InternalOil.g:1065:3: (otherlv_4= 'TRUE' | otherlv_5= 'FALSE' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==30) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalOil.g:1066:4: otherlv_4= 'TRUE'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getTrustedRuleAccess().getTRUEKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOil.g:1071:4: otherlv_5= 'FALSE'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getTrustedRuleAccess().getFALSEKeyword_4_1());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTrustedRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleTrustedRule"


    // $ANTLR start "entryRuleApplicationParam"
    // InternalOil.g:1084:1: entryRuleApplicationParam returns [EObject current=null] : iv_ruleApplicationParam= ruleApplicationParam EOF ;
    public final EObject entryRuleApplicationParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationParam = null;


        try {
            // InternalOil.g:1084:57: (iv_ruleApplicationParam= ruleApplicationParam EOF )
            // InternalOil.g:1085:2: iv_ruleApplicationParam= ruleApplicationParam EOF
            {
             newCompositeNode(grammarAccess.getApplicationParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplicationParam=ruleApplicationParam();

            state._fsp--;

             current =iv_ruleApplicationParam; 
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
    // $ANTLR end "entryRuleApplicationParam"


    // $ANTLR start "ruleApplicationParam"
    // InternalOil.g:1091:1: ruleApplicationParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleApplicationParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1097:2: ( ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) )
            // InternalOil.g:1098:2: ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            {
            // InternalOil.g:1098:2: ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            // InternalOil.g:1099:3: ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';'
            {
            // InternalOil.g:1099:3: ( (lv_type_0_0= ruleApplicationParamEnum ) )
            // InternalOil.g:1100:4: (lv_type_0_0= ruleApplicationParamEnum )
            {
            // InternalOil.g:1100:4: (lv_type_0_0= ruleApplicationParamEnum )
            // InternalOil.g:1101:5: lv_type_0_0= ruleApplicationParamEnum
            {

            					newCompositeNode(grammarAccess.getApplicationParamAccess().getTypeApplicationParamEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=ruleApplicationParamEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.oil.Oil.ApplicationParamEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationParamAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:1122:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:1123:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:1123:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:1124:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getApplicationParamAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationParamRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationParamAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleApplicationParam"


    // $ANTLR start "entryRuleIsrRule"
    // InternalOil.g:1149:1: entryRuleIsrRule returns [EObject current=null] : iv_ruleIsrRule= ruleIsrRule EOF ;
    public final EObject entryRuleIsrRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsrRule = null;


        try {
            // InternalOil.g:1149:48: (iv_ruleIsrRule= ruleIsrRule EOF )
            // InternalOil.g:1150:2: iv_ruleIsrRule= ruleIsrRule EOF
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
    // InternalOil.g:1156:1: ruleIsrRule returns [EObject current=null] : ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( (lv_type_4_0= ruleIntTypeEnum ) )? ( ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleIsrRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;

        EObject lv_isrSubOrParam_5_1 = null;

        EObject lv_isrSubOrParam_5_2 = null;



        	enterRule();

        try {
            // InternalOil.g:1162:2: ( ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( (lv_type_4_0= ruleIntTypeEnum ) )? ( ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalOil.g:1163:2: ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( (lv_type_4_0= ruleIntTypeEnum ) )? ( ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalOil.g:1163:2: ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( (lv_type_4_0= ruleIntTypeEnum ) )? ( ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalOil.g:1164:3: () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( (lv_type_4_0= ruleIntTypeEnum ) )? ( ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalOil.g:1164:3: ()
            // InternalOil.g:1165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsrRuleAccess().getIsrRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getIsrRuleAccess().getISRKeyword_1());
            		
            // InternalOil.g:1175:3: ( (lv_name_2_0= ruleName ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOil.g:1176:4: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:1176:4: (lv_name_2_0= ruleName )
                    // InternalOil.g:1177:5: lv_name_2_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getIsrRuleAccess().getNameNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIsrRuleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.oil.Oil.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getIsrRuleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOil.g:1198:3: ( (lv_type_4_0= ruleIntTypeEnum ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=77 && LA20_0<=80)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOil.g:1199:4: (lv_type_4_0= ruleIntTypeEnum )
                    {
                    // InternalOil.g:1199:4: (lv_type_4_0= ruleIntTypeEnum )
                    // InternalOil.g:1200:5: lv_type_4_0= ruleIntTypeEnum
                    {

                    					newCompositeNode(grammarAccess.getIsrRuleAccess().getTypeIntTypeEnumEnumRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_24);
                    lv_type_4_0=ruleIntTypeEnum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIsrRuleRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_4_0,
                    						"org.xtext.example.oil.Oil.IntTypeEnum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1217:3: ( ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==34||LA22_0==36||LA22_0==38||(LA22_0>=72 && LA22_0<=76)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOil.g:1218:4: ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) )
            	    {
            	    // InternalOil.g:1218:4: ( (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam ) )
            	    // InternalOil.g:1219:5: (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam )
            	    {
            	    // InternalOil.g:1219:5: (lv_isrSubOrParam_5_1= ruleIsrSubContainer | lv_isrSubOrParam_5_2= ruleIsrParam )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==34) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==36||LA21_0==38||(LA21_0>=72 && LA21_0<=76)) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalOil.g:1220:6: lv_isrSubOrParam_5_1= ruleIsrSubContainer
            	            {

            	            						newCompositeNode(grammarAccess.getIsrRuleAccess().getIsrSubOrParamIsrSubContainerParserRuleCall_5_0_0());
            	            					
            	            pushFollow(FOLLOW_24);
            	            lv_isrSubOrParam_5_1=ruleIsrSubContainer();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getIsrRuleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"isrSubOrParam",
            	            							lv_isrSubOrParam_5_1,
            	            							"org.xtext.example.oil.Oil.IsrSubContainer");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalOil.g:1236:6: lv_isrSubOrParam_5_2= ruleIsrParam
            	            {

            	            						newCompositeNode(grammarAccess.getIsrRuleAccess().getIsrSubOrParamIsrParamParserRuleCall_5_0_1());
            	            					
            	            pushFollow(FOLLOW_24);
            	            lv_isrSubOrParam_5_2=ruleIsrParam();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getIsrRuleRule());
            	            						}
            	            						add(
            	            							current,
            	            							"isrSubOrParam",
            	            							lv_isrSubOrParam_5_2,
            	            							"org.xtext.example.oil.Oil.IsrParam");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getIsrRuleAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIsrRuleAccess().getSemicolonKeyword_7());
            		

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


    // $ANTLR start "entryRuleIsrSubContainer"
    // InternalOil.g:1266:1: entryRuleIsrSubContainer returns [EObject current=null] : iv_ruleIsrSubContainer= ruleIsrSubContainer EOF ;
    public final EObject entryRuleIsrSubContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsrSubContainer = null;


        try {
            // InternalOil.g:1266:56: (iv_ruleIsrSubContainer= ruleIsrSubContainer EOF )
            // InternalOil.g:1267:2: iv_ruleIsrSubContainer= ruleIsrSubContainer EOF
            {
             newCompositeNode(grammarAccess.getIsrSubContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsrSubContainer=ruleIsrSubContainer();

            state._fsp--;

             current =iv_ruleIsrSubContainer; 
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
    // $ANTLR end "entryRuleIsrSubContainer"


    // $ANTLR start "ruleIsrSubContainer"
    // InternalOil.g:1273:1: ruleIsrSubContainer returns [EObject current=null] : ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) ) ;
    public final EObject ruleIsrSubContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_timingProtectionRule_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1279:2: ( ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) ) )
            // InternalOil.g:1280:2: ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) )
            {
            // InternalOil.g:1280:2: ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) )
            // InternalOil.g:1281:3: (lv_timingProtectionRule_0_0= ruleTimingProtectionRule )
            {
            // InternalOil.g:1281:3: (lv_timingProtectionRule_0_0= ruleTimingProtectionRule )
            // InternalOil.g:1282:4: lv_timingProtectionRule_0_0= ruleTimingProtectionRule
            {

            				newCompositeNode(grammarAccess.getIsrSubContainerAccess().getTimingProtectionRuleTimingProtectionRuleParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_timingProtectionRule_0_0=ruleTimingProtectionRule();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getIsrSubContainerRule());
            				}
            				set(
            					current,
            					"timingProtectionRule",
            					lv_timingProtectionRule_0_0,
            					"org.xtext.example.oil.Oil.TimingProtectionRule");
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
    // $ANTLR end "ruleIsrSubContainer"


    // $ANTLR start "entryRuleTimingProtectionRule"
    // InternalOil.g:1302:1: entryRuleTimingProtectionRule returns [EObject current=null] : iv_ruleTimingProtectionRule= ruleTimingProtectionRule EOF ;
    public final EObject entryRuleTimingProtectionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimingProtectionRule = null;


        try {
            // InternalOil.g:1302:61: (iv_ruleTimingProtectionRule= ruleTimingProtectionRule EOF )
            // InternalOil.g:1303:2: iv_ruleTimingProtectionRule= ruleTimingProtectionRule EOF
            {
             newCompositeNode(grammarAccess.getTimingProtectionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimingProtectionRule=ruleTimingProtectionRule();

            state._fsp--;

             current =iv_ruleTimingProtectionRule; 
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
    // $ANTLR end "entryRuleTimingProtectionRule"


    // $ANTLR start "ruleTimingProtectionRule"
    // InternalOil.g:1309:1: ruleTimingProtectionRule returns [EObject current=null] : ( () otherlv_1= 'TIMING_PROTECTION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' ) ;
    public final EObject ruleTimingProtectionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_timingProtectionParam_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1315:2: ( ( () otherlv_1= 'TIMING_PROTECTION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' ) )
            // InternalOil.g:1316:2: ( () otherlv_1= 'TIMING_PROTECTION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' )
            {
            // InternalOil.g:1316:2: ( () otherlv_1= 'TIMING_PROTECTION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';' )
            // InternalOil.g:1317:3: () otherlv_1= 'TIMING_PROTECTION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '=' ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' ) | otherlv_8= 'FALSE' ) otherlv_9= ';'
            {
            // InternalOil.g:1317:3: ()
            // InternalOil.g:1318:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimingProtectionRuleAccess().getTimingProtectionRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTimingProtectionRuleAccess().getTIMING_PROTECTIONKeyword_1());
            		
            // InternalOil.g:1328:3: ( (lv_name_2_0= ruleName ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOil.g:1329:4: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:1329:4: (lv_name_2_0= ruleName )
                    // InternalOil.g:1330:5: lv_name_2_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getTimingProtectionRuleAccess().getNameNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimingProtectionRuleRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.xtext.example.oil.Oil.Name");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getTimingProtectionRuleAccess().getEqualsSignKeyword_3());
            		
            // InternalOil.g:1351:3: ( (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' ) | otherlv_8= 'FALSE' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            else if ( (LA25_0==30) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalOil.g:1352:4: (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' )
                    {
                    // InternalOil.g:1352:4: (otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}' )
                    // InternalOil.g:1353:5: otherlv_4= 'TRUE' otherlv_5= '{' ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_12); 

                    					newLeafNode(otherlv_4, grammarAccess.getTimingProtectionRuleAccess().getTRUEKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,22,FOLLOW_25); 

                    					newLeafNode(otherlv_5, grammarAccess.getTimingProtectionRuleAccess().getLeftCurlyBracketKeyword_4_0_1());
                    				
                    // InternalOil.g:1361:5: ( (lv_timingProtectionParam_6_0= ruleTimingProtectionParam ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>=68 && LA24_0<=71)) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalOil.g:1362:6: (lv_timingProtectionParam_6_0= ruleTimingProtectionParam )
                    	    {
                    	    // InternalOil.g:1362:6: (lv_timingProtectionParam_6_0= ruleTimingProtectionParam )
                    	    // InternalOil.g:1363:7: lv_timingProtectionParam_6_0= ruleTimingProtectionParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getTimingProtectionRuleAccess().getTimingProtectionParamTimingProtectionParamParserRuleCall_4_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_timingProtectionParam_6_0=ruleTimingProtectionParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTimingProtectionRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"timingProtectionParam",
                    	    								lv_timingProtectionParam_6_0,
                    	    								"org.xtext.example.oil.Oil.TimingProtectionParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_7, grammarAccess.getTimingProtectionRuleAccess().getRightCurlyBracketKeyword_4_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:1386:4: otherlv_8= 'FALSE'
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getTimingProtectionRuleAccess().getFALSEKeyword_4_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTimingProtectionRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleTimingProtectionRule"


    // $ANTLR start "entryRuleTimingProtectionParam"
    // InternalOil.g:1399:1: entryRuleTimingProtectionParam returns [EObject current=null] : iv_ruleTimingProtectionParam= ruleTimingProtectionParam EOF ;
    public final EObject entryRuleTimingProtectionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimingProtectionParam = null;


        try {
            // InternalOil.g:1399:62: (iv_ruleTimingProtectionParam= ruleTimingProtectionParam EOF )
            // InternalOil.g:1400:2: iv_ruleTimingProtectionParam= ruleTimingProtectionParam EOF
            {
             newCompositeNode(grammarAccess.getTimingProtectionParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimingProtectionParam=ruleTimingProtectionParam();

            state._fsp--;

             current =iv_ruleTimingProtectionParam; 
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
    // $ANTLR end "entryRuleTimingProtectionParam"


    // $ANTLR start "ruleTimingProtectionParam"
    // InternalOil.g:1406:1: ruleTimingProtectionParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleTimingProtectionParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1412:2: ( ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) )
            // InternalOil.g:1413:2: ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            {
            // InternalOil.g:1413:2: ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            // InternalOil.g:1414:3: ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';'
            {
            // InternalOil.g:1414:3: ( (lv_type_0_0= ruleTimingProtectionParamEnum ) )
            // InternalOil.g:1415:4: (lv_type_0_0= ruleTimingProtectionParamEnum )
            {
            // InternalOil.g:1415:4: (lv_type_0_0= ruleTimingProtectionParamEnum )
            // InternalOil.g:1416:5: lv_type_0_0= ruleTimingProtectionParamEnum
            {

            					newCompositeNode(grammarAccess.getTimingProtectionParamAccess().getTypeTimingProtectionParamEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=ruleTimingProtectionParamEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimingProtectionParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.oil.Oil.TimingProtectionParamEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getTimingProtectionParamAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:1437:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:1438:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:1438:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:1439:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getTimingProtectionParamAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimingProtectionParamRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTimingProtectionParamAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleTimingProtectionParam"


    // $ANTLR start "entryRuleIsrParam"
    // InternalOil.g:1464:1: entryRuleIsrParam returns [EObject current=null] : iv_ruleIsrParam= ruleIsrParam EOF ;
    public final EObject entryRuleIsrParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsrParam = null;


        try {
            // InternalOil.g:1464:49: (iv_ruleIsrParam= ruleIsrParam EOF )
            // InternalOil.g:1465:2: iv_ruleIsrParam= ruleIsrParam EOF
            {
             newCompositeNode(grammarAccess.getIsrParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsrParam=ruleIsrParam();

            state._fsp--;

             current =iv_ruleIsrParam; 
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
    // $ANTLR end "entryRuleIsrParam"


    // $ANTLR start "ruleIsrParam"
    // InternalOil.g:1471:1: ruleIsrParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleIsrParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleIsrParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1477:2: ( ( ( (lv_type_0_0= ruleIsrParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) )
            // InternalOil.g:1478:2: ( ( (lv_type_0_0= ruleIsrParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            {
            // InternalOil.g:1478:2: ( ( (lv_type_0_0= ruleIsrParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            // InternalOil.g:1479:3: ( (lv_type_0_0= ruleIsrParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';'
            {
            // InternalOil.g:1479:3: ( (lv_type_0_0= ruleIsrParamEnum ) )
            // InternalOil.g:1480:4: (lv_type_0_0= ruleIsrParamEnum )
            {
            // InternalOil.g:1480:4: (lv_type_0_0= ruleIsrParamEnum )
            // InternalOil.g:1481:5: lv_type_0_0= ruleIsrParamEnum
            {

            					newCompositeNode(grammarAccess.getIsrParamAccess().getTypeIsrParamEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_type_0_0=ruleIsrParamEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsrParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.oil.Oil.IsrParamEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getIsrParamAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:1502:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:1503:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:1503:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:1504:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getIsrParamAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsrParamRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getIsrParamAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleIsrParam"


    // $ANTLR start "entryRuleObject"
    // InternalOil.g:1529:1: entryRuleObject returns [String current=null] : iv_ruleObject= ruleObject EOF ;
    public final String entryRuleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObject = null;


        try {
            // InternalOil.g:1529:46: (iv_ruleObject= ruleObject EOF )
            // InternalOil.g:1530:2: iv_ruleObject= ruleObject EOF
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
    // InternalOil.g:1536:1: ruleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' ) ;
    public final AntlrDatatypeRuleToken ruleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:1542:2: ( (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' ) )
            // InternalOil.g:1543:2: (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' )
            {
            // InternalOil.g:1543:2: (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' )
            int alt26=19;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt26=1;
                }
                break;
            case 25:
                {
                alt26=2;
                }
                break;
            case 26:
                {
                alt26=3;
                }
                break;
            case 35:
                {
                alt26=4;
                }
                break;
            case 36:
                {
                alt26=5;
                }
                break;
            case 37:
                {
                alt26=6;
                }
                break;
            case 33:
                {
                alt26=7;
                }
                break;
            case 38:
                {
                alt26=8;
                }
                break;
            case 39:
                {
                alt26=9;
                }
                break;
            case 40:
                {
                alt26=10;
                }
                break;
            case 41:
                {
                alt26=11;
                }
                break;
            case 42:
                {
                alt26=12;
                }
                break;
            case 43:
                {
                alt26=13;
                }
                break;
            case 27:
                {
                alt26=14;
                }
                break;
            case 44:
                {
                alt26=15;
                }
                break;
            case 45:
                {
                alt26=16;
                }
                break;
            case 46:
                {
                alt26=17;
                }
                break;
            case 47:
                {
                alt26=18;
                }
                break;
            case 48:
                {
                alt26=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalOil.g:1544:3: kw= 'OS'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getOSKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:1550:3: kw= 'TASK'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getTASKKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOil.g:1556:3: kw= 'COUNTER'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getCOUNTERKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOil.g:1562:3: kw= 'ALARM'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getALARMKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOil.g:1568:3: kw= 'RESOURCE'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getRESOURCEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOil.g:1574:3: kw= 'EVENT'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getEVENTKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOil.g:1580:3: kw= 'ISR'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getISRKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOil.g:1586:3: kw= 'MESSAGE'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getMESSAGEKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOil.g:1592:3: kw= 'COM'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getCOMKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOil.g:1598:3: kw= 'NM'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getNMKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOil.g:1604:3: kw= 'APPMODE'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getAPPMODEKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOil.g:1610:3: kw= 'IPDU'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getIPDUKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOil.g:1616:3: kw= 'NETWORKMESSAGE'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getNETWORKMESSAGEKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOil.g:1622:3: kw= 'APPLICATION'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getAPPLICATIONKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOil.g:1628:3: kw= 'MEMOTY_PROTECTION'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getMEMOTY_PROTECTIONKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOil.g:1634:3: kw= 'SPINLOCK'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getSPINLOCKKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOil.g:1640:3: kw= 'SCHEDULETABLE'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getSCHEDULETABLEKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOil.g:1646:3: kw= 'IOC'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getIOCKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOil.g:1652:3: kw= 'LIBRARY'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

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
    // InternalOil.g:1661:1: entryRuleImplementationDef returns [EObject current=null] : iv_ruleImplementationDef= ruleImplementationDef EOF ;
    public final EObject entryRuleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDef = null;


        try {
            // InternalOil.g:1661:58: (iv_ruleImplementationDef= ruleImplementationDef EOF )
            // InternalOil.g:1662:2: iv_ruleImplementationDef= ruleImplementationDef EOF
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
    // InternalOil.g:1668:1: ruleImplementationDef returns [EObject current=null] : (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) ;
    public final EObject ruleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject this_ImplAttrDef_0 = null;

        EObject this_ImplRefDef_1 = null;



        	enterRule();

        try {
            // InternalOil.g:1674:2: ( (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) )
            // InternalOil.g:1675:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            {
            // InternalOil.g:1675:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=50 && LA27_0<=53)||LA27_0==57||(LA27_0>=77 && LA27_0<=80)) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=82 && LA27_0<=101)) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalOil.g:1676:3: this_ImplAttrDef_0= ruleImplAttrDef
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
                    // InternalOil.g:1685:3: this_ImplRefDef_1= ruleImplRefDef
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
    // InternalOil.g:1697:1: entryRuleImplAttrDef returns [EObject current=null] : iv_ruleImplAttrDef= ruleImplAttrDef EOF ;
    public final EObject entryRuleImplAttrDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrDef = null;


        try {
            // InternalOil.g:1697:52: (iv_ruleImplAttrDef= ruleImplAttrDef EOF )
            // InternalOil.g:1698:2: iv_ruleImplAttrDef= ruleImplAttrDef EOF
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
    // InternalOil.g:1704:1: ruleImplAttrDef returns [EObject current=null] : (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) ;
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
            // InternalOil.g:1710:2: ( (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) )
            // InternalOil.g:1711:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            {
            // InternalOil.g:1711:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 77:
            case 78:
            case 79:
            case 80:
                {
                alt28=1;
                }
                break;
            case 50:
                {
                alt28=2;
                }
                break;
            case 51:
                {
                alt28=3;
                }
                break;
            case 52:
                {
                alt28=4;
                }
                break;
            case 53:
                {
                alt28=5;
                }
                break;
            case 57:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalOil.g:1712:3: this_ImplAttrIntDef_0= ruleImplAttrIntDef
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
                    // InternalOil.g:1721:3: this_ImplAttrFloatDef_1= ruleImplAttrFloatDef
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
                    // InternalOil.g:1730:3: this_ImplAttrEnumDef_2= ruleImplAttrEnumDef
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
                    // InternalOil.g:1739:3: this_ImplAttrStringDef_3= ruleImplAttrStringDef
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
                    // InternalOil.g:1748:3: this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef
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
                    // InternalOil.g:1757:3: this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier
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
    // InternalOil.g:1769:1: entryRuleImplAttrIntDef returns [EObject current=null] : iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF ;
    public final EObject entryRuleImplAttrIntDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIntDef = null;


        try {
            // InternalOil.g:1769:55: (iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF )
            // InternalOil.g:1770:2: iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF
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
    // InternalOil.g:1776:1: ruleImplAttrIntDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleImplAttrIntDef() throws RecognitionException {
        EObject current = null;

        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_range_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1782:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' ) )
            // InternalOil.g:1783:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' )
            {
            // InternalOil.g:1783:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' )
            // InternalOil.g:1784:3: ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';'
            {
            // InternalOil.g:1784:3: ( (lv_type_0_0= ruleIntTypeEnum ) )
            // InternalOil.g:1785:4: (lv_type_0_0= ruleIntTypeEnum )
            {
            // InternalOil.g:1785:4: (lv_type_0_0= ruleIntTypeEnum )
            // InternalOil.g:1786:5: lv_type_0_0= ruleIntTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getTypeIntTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalOil.g:1803:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOil.g:1804:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1804:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1805:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,49,FOLLOW_26); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIntDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIntDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1817:3: ( (lv_range_2_0= ruleRange ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOil.g:1818:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:1818:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:1819:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
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

            // InternalOil.g:1836:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:1837:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:1837:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:1838:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalOil.g:1855:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==54) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOil.g:1856:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:1856:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:1857:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalOil.g:1874:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==18) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalOil.g:1875:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrIntDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:1879:4: ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_T_NUMBER) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==63||LA32_0==81) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalOil.g:1880:5: ( (lv_value_6_0= ruleNumber ) )
                            {
                            // InternalOil.g:1880:5: ( (lv_value_6_0= ruleNumber ) )
                            // InternalOil.g:1881:6: (lv_value_6_0= ruleNumber )
                            {
                            // InternalOil.g:1881:6: (lv_value_6_0= ruleNumber )
                            // InternalOil.g:1882:7: lv_value_6_0= ruleNumber
                            {

                            							newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getValueNumberParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_10);
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
                            // InternalOil.g:1900:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:1900:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:1901:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:1901:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:1902:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_10);
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

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getImplAttrIntDefAccess().getSemicolonKeyword_6());
            		

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
    // InternalOil.g:1929:1: entryRuleImplAttrFloatDef returns [EObject current=null] : iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF ;
    public final EObject entryRuleImplAttrFloatDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrFloatDef = null;


        try {
            // InternalOil.g:1929:57: (iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF )
            // InternalOil.g:1930:2: iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF
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
    // InternalOil.g:1936:1: ruleImplAttrFloatDef returns [EObject current=null] : (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleImplAttrFloatDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_range_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1942:2: ( (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' ) )
            // InternalOil.g:1943:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' )
            {
            // InternalOil.g:1943:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' )
            // InternalOil.g:1944:3: otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrFloatDefAccess().getFLOATKeyword_0());
            		
            // InternalOil.g:1948:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOil.g:1949:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1949:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:1950:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,49,FOLLOW_26); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrFloatDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrFloatDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1962:3: ( (lv_range_2_0= ruleRange ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalOil.g:1963:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:1963:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:1964:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
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

            // InternalOil.g:1981:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:1982:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:1982:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:1983:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalOil.g:2000:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==54) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOil.g:2001:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2001:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:2002:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalOil.g:2019:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==18) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOil.g:2020:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrFloatDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:2024:4: ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_T_FLOAT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==63||LA37_0==81) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalOil.g:2025:5: ( (lv_value_6_0= ruleEFloat ) )
                            {
                            // InternalOil.g:2025:5: ( (lv_value_6_0= ruleEFloat ) )
                            // InternalOil.g:2026:6: (lv_value_6_0= ruleEFloat )
                            {
                            // InternalOil.g:2026:6: (lv_value_6_0= ruleEFloat )
                            // InternalOil.g:2027:7: lv_value_6_0= ruleEFloat
                            {

                            							newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getValueEFloatParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_10);
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
                            // InternalOil.g:2045:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:2045:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:2046:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:2046:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:2047:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_10);
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

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getImplAttrFloatDefAccess().getSemicolonKeyword_6());
            		

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
    // InternalOil.g:2074:1: entryRuleImplAttrEnumDef returns [EObject current=null] : iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF ;
    public final EObject entryRuleImplAttrEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrEnumDef = null;


        try {
            // InternalOil.g:2074:56: (iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF )
            // InternalOil.g:2075:2: iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF
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
    // InternalOil.g:2081:1: ruleImplAttrEnumDef returns [EObject current=null] : (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' ) ;
    public final EObject ruleImplAttrEnumDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_enumeration_2_0 = null;

        EObject lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2087:2: ( (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' ) )
            // InternalOil.g:2088:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' )
            {
            // InternalOil.g:2088:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';' )
            // InternalOil.g:2089:3: otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrEnumDefAccess().getENUMKeyword_0());
            		
            // InternalOil.g:2093:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOil.g:2094:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2094:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2095:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,49,FOLLOW_26); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrEnumDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrEnumDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2107:3: ( (lv_enumeration_2_0= ruleEnumeration ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalOil.g:2108:4: (lv_enumeration_2_0= ruleEnumeration )
                    {
                    // InternalOil.g:2108:4: (lv_enumeration_2_0= ruleEnumeration )
                    // InternalOil.g:2109:5: lv_enumeration_2_0= ruleEnumeration
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getEnumerationEnumerationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_26);
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

            // InternalOil.g:2126:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:2127:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:2127:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:2128:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalOil.g:2145:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==54) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOil.g:2146:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2146:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:2147:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalOil.g:2164:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==18) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOil.g:2165:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrEnumDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:2169:4: ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_ID) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==63||LA42_0==81) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalOil.g:2170:5: ( (lv_value_6_0= ruleName ) )
                            {
                            // InternalOil.g:2170:5: ( (lv_value_6_0= ruleName ) )
                            // InternalOil.g:2171:6: (lv_value_6_0= ruleName )
                            {
                            // InternalOil.g:2171:6: (lv_value_6_0= ruleName )
                            // InternalOil.g:2172:7: lv_value_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getValueNameParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_10);
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
                            // InternalOil.g:2190:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:2190:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:2191:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:2191:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:2192:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_10);
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

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getImplAttrEnumDefAccess().getSemicolonKeyword_6());
            		

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
    // InternalOil.g:2219:1: entryRuleImplAttrStringDef returns [EObject current=null] : iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF ;
    public final EObject entryRuleImplAttrStringDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrStringDef = null;


        try {
            // InternalOil.g:2219:58: (iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF )
            // InternalOil.g:2220:2: iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF
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
    // InternalOil.g:2226:1: ruleImplAttrStringDef returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleImplAttrStringDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_multiple_3_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_default_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2232:2: ( (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:2233:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:2233:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? otherlv_7= ';' )
            // InternalOil.g:2234:3: otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrStringDefAccess().getSTRINGKeyword_0());
            		
            // InternalOil.g:2238:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalOil.g:2239:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2239:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2240:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,49,FOLLOW_26); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrStringDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrStringDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2252:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:2253:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:2253:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:2254:5: lv_name_2_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getNameAttributeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalOil.g:2271:3: ( (lv_multiple_3_0= ruleMultipleSpecifier ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==54) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOil.g:2272:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2272:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    // InternalOil.g:2273:5: lv_multiple_3_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getMultipleMultipleSpecifierParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalOil.g:2290:3: (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==18) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalOil.g:2291:4: otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getImplAttrStringDefAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOil.g:2295:4: ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_STRING) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==63||LA46_0==81) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalOil.g:2296:5: ( (lv_value_5_0= ruleEString ) )
                            {
                            // InternalOil.g:2296:5: ( (lv_value_5_0= ruleEString ) )
                            // InternalOil.g:2297:6: (lv_value_5_0= ruleEString )
                            {
                            // InternalOil.g:2297:6: (lv_value_5_0= ruleEString )
                            // InternalOil.g:2298:7: lv_value_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getValueEStringParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_10);
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
                            // InternalOil.g:2316:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:2316:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            // InternalOil.g:2317:6: (lv_default_6_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:2317:6: (lv_default_6_0= ruleDefaultEnum )
                            // InternalOil.g:2318:7: lv_default_6_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getDefaultDefaultEnumEnumRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_10);
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

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImplAttrStringDefAccess().getSemicolonKeyword_5());
            		

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
    // InternalOil.g:2345:1: entryRuleImplAttrBooleanDef returns [EObject current=null] : iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF ;
    public final EObject entryRuleImplAttrBooleanDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrBooleanDef = null;


        try {
            // InternalOil.g:2345:59: (iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF )
            // InternalOil.g:2346:2: iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF
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
    // InternalOil.g:2352:1: ruleImplAttrBooleanDef returns [EObject current=null] : (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? otherlv_20= ';' ) ;
    public final EObject ruleImplAttrBooleanDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token lv_value_18_1=null;
        Token lv_value_18_2=null;
        Token otherlv_20=null;
        EObject lv_trueParameterList_5_0 = null;

        AntlrDatatypeRuleToken lv_trueDescription_7_0 = null;

        EObject lv_falseParameterList_11_0 = null;

        AntlrDatatypeRuleToken lv_falseDescription_13_0 = null;

        AntlrDatatypeRuleToken lv_name_15_1 = null;

        AntlrDatatypeRuleToken lv_name_15_2 = null;

        AntlrDatatypeRuleToken lv_multiple_16_0 = null;

        Enumerator lv_default_19_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2358:2: ( (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? otherlv_20= ';' ) )
            // InternalOil.g:2359:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? otherlv_20= ';' )
            {
            // InternalOil.g:2359:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? otherlv_20= ';' )
            // InternalOil.g:2360:3: otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrBooleanDefAccess().getBOOLEANKeyword_0());
            		
            // InternalOil.g:2364:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOil.g:2365:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2365:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2366:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,49,FOLLOW_26); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrBooleanDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrBooleanDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2378:3: (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==54) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOil.g:2379:4: otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplAttrBooleanDefAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getImplAttrBooleanDefAccess().getTRUEKeyword_2_1());
                    			
                    // InternalOil.g:2387:4: (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==22) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalOil.g:2388:5: otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_16); 

                            					newLeafNode(otherlv_4, grammarAccess.getImplAttrBooleanDefAccess().getLeftCurlyBracketKeyword_2_2_0());
                            				
                            // InternalOil.g:2392:5: ( (lv_trueParameterList_5_0= ruleImplementationDef ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( ((LA49_0>=50 && LA49_0<=53)||LA49_0==57||(LA49_0>=77 && LA49_0<=80)||(LA49_0>=82 && LA49_0<=101)) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // InternalOil.g:2393:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:2393:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    // InternalOil.g:2394:7: lv_trueParameterList_5_0= ruleImplementationDef
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
                            	    break loop49;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,23,FOLLOW_35); 

                            					newLeafNode(otherlv_6, grammarAccess.getImplAttrBooleanDefAccess().getRightCurlyBracketKeyword_2_2_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:2416:4: ( (lv_trueDescription_7_0= ruleEString ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_STRING) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalOil.g:2417:5: (lv_trueDescription_7_0= ruleEString )
                            {
                            // InternalOil.g:2417:5: (lv_trueDescription_7_0= ruleEString )
                            // InternalOil.g:2418:6: lv_trueDescription_7_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getTrueDescriptionEStringParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_36);
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

                    otherlv_8=(Token)match(input,55,FOLLOW_37); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrBooleanDefAccess().getCommaKeyword_2_4());
                    			
                    otherlv_9=(Token)match(input,30,FOLLOW_38); 

                    				newLeafNode(otherlv_9, grammarAccess.getImplAttrBooleanDefAccess().getFALSEKeyword_2_5());
                    			
                    // InternalOil.g:2443:4: (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==22) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalOil.g:2444:5: otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}'
                            {
                            otherlv_10=(Token)match(input,22,FOLLOW_16); 

                            					newLeafNode(otherlv_10, grammarAccess.getImplAttrBooleanDefAccess().getLeftCurlyBracketKeyword_2_6_0());
                            				
                            // InternalOil.g:2448:5: ( (lv_falseParameterList_11_0= ruleImplementationDef ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( ((LA52_0>=50 && LA52_0<=53)||LA52_0==57||(LA52_0>=77 && LA52_0<=80)||(LA52_0>=82 && LA52_0<=101)) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalOil.g:2449:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:2449:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    // InternalOil.g:2450:7: lv_falseParameterList_11_0= ruleImplementationDef
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
                            	    break loop52;
                                }
                            } while (true);

                            otherlv_12=(Token)match(input,23,FOLLOW_39); 

                            					newLeafNode(otherlv_12, grammarAccess.getImplAttrBooleanDefAccess().getRightCurlyBracketKeyword_2_6_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:2472:4: ( (lv_falseDescription_13_0= ruleEString ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_STRING) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalOil.g:2473:5: (lv_falseDescription_13_0= ruleEString )
                            {
                            // InternalOil.g:2473:5: (lv_falseDescription_13_0= ruleEString )
                            // InternalOil.g:2474:6: lv_falseDescription_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getFalseDescriptionEStringParserRuleCall_2_7_0());
                            					
                            pushFollow(FOLLOW_40);
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

                    otherlv_14=(Token)match(input,56,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getImplAttrBooleanDefAccess().getRightSquareBracketKeyword_2_8());
                    			

                    }
                    break;

            }

            // InternalOil.g:2496:3: ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) )
            // InternalOil.g:2497:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            {
            // InternalOil.g:2497:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            // InternalOil.g:2498:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            {
            // InternalOil.g:2498:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=24 && LA56_0<=27)||LA56_0==33||(LA56_0>=35 && LA56_0<=48)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalOil.g:2499:6: lv_name_15_1= ruleName
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameNameParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_27);
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
                    // InternalOil.g:2515:6: lv_name_15_2= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameObjectParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalOil.g:2533:3: ( (lv_multiple_16_0= ruleMultipleSpecifier ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalOil.g:2534:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2534:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    // InternalOil.g:2535:5: lv_multiple_16_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_28);
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

            // InternalOil.g:2552:3: (otherlv_17= '=' ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==18) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOil.g:2553:4: otherlv_17= '=' ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_17=(Token)match(input,18,FOLLOW_41); 

                    				newLeafNode(otherlv_17, grammarAccess.getImplAttrBooleanDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:2557:4: ( ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( ((LA59_0>=29 && LA59_0<=30)) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==63||LA59_0==81) ) {
                        alt59=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalOil.g:2558:5: ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) )
                            {
                            // InternalOil.g:2558:5: ( ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) ) )
                            // InternalOil.g:2559:6: ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) )
                            {
                            // InternalOil.g:2559:6: ( (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' ) )
                            // InternalOil.g:2560:7: (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' )
                            {
                            // InternalOil.g:2560:7: (lv_value_18_1= 'TRUE' | lv_value_18_2= 'FALSE' )
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==29) ) {
                                alt58=1;
                            }
                            else if ( (LA58_0==30) ) {
                                alt58=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 58, 0, input);

                                throw nvae;
                            }
                            switch (alt58) {
                                case 1 :
                                    // InternalOil.g:2561:8: lv_value_18_1= 'TRUE'
                                    {
                                    lv_value_18_1=(Token)match(input,29,FOLLOW_10); 

                                    								newLeafNode(lv_value_18_1, grammarAccess.getImplAttrBooleanDefAccess().getValueTRUEKeyword_5_1_0_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getImplAttrBooleanDefRule());
                                    								}
                                    								setWithLastConsumed(current, "value", lv_value_18_1, null);
                                    							

                                    }
                                    break;
                                case 2 :
                                    // InternalOil.g:2572:8: lv_value_18_2= 'FALSE'
                                    {
                                    lv_value_18_2=(Token)match(input,30,FOLLOW_10); 

                                    								newLeafNode(lv_value_18_2, grammarAccess.getImplAttrBooleanDefAccess().getValueFALSEKeyword_5_1_0_0_1());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getImplAttrBooleanDefRule());
                                    								}
                                    								setWithLastConsumed(current, "value", lv_value_18_2, null);
                                    							

                                    }
                                    break;

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:2586:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:2586:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            // InternalOil.g:2587:6: (lv_default_19_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:2587:6: (lv_default_19_0= ruleDefaultEnum )
                            // InternalOil.g:2588:7: lv_default_19_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_10);
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

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getImplAttrBooleanDefAccess().getSemicolonKeyword_6());
            		

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
    // InternalOil.g:2615:1: entryRuleImplAttrIdentiFier returns [EObject current=null] : iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF ;
    public final EObject entryRuleImplAttrIdentiFier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIdentiFier = null;


        try {
            // InternalOil.g:2615:59: (iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF )
            // InternalOil.g:2616:2: iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF
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
    // InternalOil.g:2622:1: ruleImplAttrIdentiFier returns [EObject current=null] : (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalOil.g:2628:2: ( (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalOil.g:2629:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalOil.g:2629:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalOil.g:2630:3: otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrIdentiFierAccess().getIDENTIFIERKeyword_0());
            		
            // InternalOil.g:2634:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==49) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOil.g:2635:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2635:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2636:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,49,FOLLOW_26); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIdentiFierAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIdentiFierRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2648:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:2649:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:2649:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:2650:5: lv_name_2_0= ruleAttributeName
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

            otherlv_3=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getImplAttrIdentiFierAccess().getEqualsSignKeyword_3());
            		
            // InternalOil.g:2671:3: ( (lv_value_4_0= RULE_ID ) )
            // InternalOil.g:2672:4: (lv_value_4_0= RULE_ID )
            {
            // InternalOil.g:2672:4: (lv_value_4_0= RULE_ID )
            // InternalOil.g:2673:5: lv_value_4_0= RULE_ID
            {
            lv_value_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:2697:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalOil.g:2697:46: (iv_ruleRange= ruleRange EOF )
            // InternalOil.g:2698:2: iv_ruleRange= ruleRange EOF
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
    // InternalOil.g:2704:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) ;
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
            // InternalOil.g:2710:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) )
            // InternalOil.g:2711:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            {
            // InternalOil.g:2711:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            // InternalOil.g:2712:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:2716:3: ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) )
            int alt63=3;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_T_NUMBER) ) {
                switch ( input.LA(2) ) {
                case 56:
                    {
                    alt63=1;
                    }
                    break;
                case 55:
                    {
                    alt63=3;
                    }
                    break;
                case 58:
                    {
                    alt63=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalOil.g:2717:4: ( (lv_value_1_0= ruleNumber ) )
                    {
                    // InternalOil.g:2717:4: ( (lv_value_1_0= ruleNumber ) )
                    // InternalOil.g:2718:5: (lv_value_1_0= ruleNumber )
                    {
                    // InternalOil.g:2718:5: (lv_value_1_0= ruleNumber )
                    // InternalOil.g:2719:6: lv_value_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getValueNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_40);
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
                    // InternalOil.g:2737:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    {
                    // InternalOil.g:2737:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    // InternalOil.g:2738:5: ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) )
                    {
                    // InternalOil.g:2738:5: ( (lv_begin_2_0= ruleNumber ) )
                    // InternalOil.g:2739:6: (lv_begin_2_0= ruleNumber )
                    {
                    // InternalOil.g:2739:6: (lv_begin_2_0= ruleNumber )
                    // InternalOil.g:2740:7: lv_begin_2_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getBeginNumberParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_43);
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

                    otherlv_3=(Token)match(input,58,FOLLOW_42); 

                    					newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_1_1_1());
                    				
                    // InternalOil.g:2761:5: ( (lv_end_4_0= ruleNumber ) )
                    // InternalOil.g:2762:6: (lv_end_4_0= ruleNumber )
                    {
                    // InternalOil.g:2762:6: (lv_end_4_0= ruleNumber )
                    // InternalOil.g:2763:7: lv_end_4_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getEndNumberParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_40);
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
                    // InternalOil.g:2782:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    {
                    // InternalOil.g:2782:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    // InternalOil.g:2783:5: ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    {
                    // InternalOil.g:2783:5: ( (lv_numbers_5_0= ruleNumber ) )
                    // InternalOil.g:2784:6: (lv_numbers_5_0= ruleNumber )
                    {
                    // InternalOil.g:2784:6: (lv_numbers_5_0= ruleNumber )
                    // InternalOil.g:2785:7: lv_numbers_5_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getNumbersNumberParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_36);
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

                    // InternalOil.g:2802:5: (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==55) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalOil.g:2803:6: otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) )
                    	    {
                    	    otherlv_6=(Token)match(input,55,FOLLOW_42); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getRangeAccess().getCommaKeyword_1_2_1_0());
                    	    					
                    	    // InternalOil.g:2807:6: ( (lv_numbers_7_0= ruleNumber ) )
                    	    // InternalOil.g:2808:7: (lv_numbers_7_0= ruleNumber )
                    	    {
                    	    // InternalOil.g:2808:7: (lv_numbers_7_0= ruleNumber )
                    	    // InternalOil.g:2809:8: lv_numbers_7_0= ruleNumber
                    	    {

                    	    								newCompositeNode(grammarAccess.getRangeAccess().getNumbersNumberParserRuleCall_1_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_44);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,56,FOLLOW_2); 

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
    // InternalOil.g:2837:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalOil.g:2837:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalOil.g:2838:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalOil.g:2844:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2850:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) )
            // InternalOil.g:2851:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            {
            // InternalOil.g:2851:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            // InternalOil.g:2852:3: otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:2856:3: ( (lv_list_1_0= ruleEnumerator ) )
            // InternalOil.g:2857:4: (lv_list_1_0= ruleEnumerator )
            {
            // InternalOil.g:2857:4: (lv_list_1_0= ruleEnumerator )
            // InternalOil.g:2858:5: lv_list_1_0= ruleEnumerator
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListEnumeratorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
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

            // InternalOil.g:2875:3: (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==55) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalOil.g:2876:4: otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) )
            	    {
            	    otherlv_2=(Token)match(input,55,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOil.g:2880:4: ( (lv_list_3_0= ruleEnumerator ) )
            	    // InternalOil.g:2881:5: (lv_list_3_0= ruleEnumerator )
            	    {
            	    // InternalOil.g:2881:5: (lv_list_3_0= ruleEnumerator )
            	    // InternalOil.g:2882:6: lv_list_3_0= ruleEnumerator
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getListEnumeratorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_44);
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
            	    break loop64;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_2); 

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
    // InternalOil.g:2908:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // InternalOil.g:2908:51: (iv_ruleEnumerator= ruleEnumerator EOF )
            // InternalOil.g:2909:2: iv_ruleEnumerator= ruleEnumerator EOF
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
    // InternalOil.g:2915:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_implParameterList_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2921:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? ) )
            // InternalOil.g:2922:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? )
            {
            // InternalOil.g:2922:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? )
            // InternalOil.g:2923:3: ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )?
            {
            // InternalOil.g:2923:3: ( (lv_name_0_0= ruleName ) )
            // InternalOil.g:2924:4: (lv_name_0_0= ruleName )
            {
            // InternalOil.g:2924:4: (lv_name_0_0= ruleName )
            // InternalOil.g:2925:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getEnumeratorAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalOil.g:2942:3: (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==22) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOil.g:2943:4: otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumeratorAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOil.g:2947:4: ( (lv_implParameterList_2_0= ruleImplementationDef ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( ((LA65_0>=50 && LA65_0<=53)||LA65_0==57||(LA65_0>=77 && LA65_0<=80)||(LA65_0>=82 && LA65_0<=101)) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalOil.g:2948:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    {
                    	    // InternalOil.g:2948:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    // InternalOil.g:2949:6: lv_implParameterList_2_0= ruleImplementationDef
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
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,23,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumeratorAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:2971:3: ( (lv_description_4_0= ruleEString ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOil.g:2972:4: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:2972:4: (lv_description_4_0= ruleEString )
                    // InternalOil.g:2973:5: lv_description_4_0= ruleEString
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
    // InternalOil.g:2994:1: entryRuleImplRefDef returns [EObject current=null] : iv_ruleImplRefDef= ruleImplRefDef EOF ;
    public final EObject entryRuleImplRefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplRefDef = null;


        try {
            // InternalOil.g:2994:51: (iv_ruleImplRefDef= ruleImplRefDef EOF )
            // InternalOil.g:2995:2: iv_ruleImplRefDef= ruleImplRefDef EOF
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
    // InternalOil.g:3001:1: ruleImplRefDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleImplRefDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_multiple_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3007:2: ( ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:3008:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:3008:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:3009:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:3009:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) )
            // InternalOil.g:3010:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            {
            // InternalOil.g:3010:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            // InternalOil.g:3011:5: lv_type_0_0= ruleObjectRefTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplRefDefAccess().getTypeObjectRefTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalOil.g:3028:3: ( (lv_name_1_0= ruleAttributeName ) )
            // InternalOil.g:3029:4: (lv_name_1_0= ruleAttributeName )
            {
            // InternalOil.g:3029:4: (lv_name_1_0= ruleAttributeName )
            // InternalOil.g:3030:5: lv_name_1_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplRefDefAccess().getNameAttributeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalOil.g:3047:3: ( (lv_multiple_2_0= ruleMultipleSpecifier ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==54) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalOil.g:3048:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:3048:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    // InternalOil.g:3049:5: lv_multiple_2_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplRefDefAccess().getMultipleMultipleSpecifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_48);
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

            // InternalOil.g:3066:3: ( (lv_description_3_0= ruleEString ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_STRING) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOil.g:3067:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:3067:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:3068:5: lv_description_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getImplRefDefAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:3093:1: entryRuleMultipleSpecifier returns [String current=null] : iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF ;
    public final String entryRuleMultipleSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultipleSpecifier = null;


        try {
            // InternalOil.g:3093:57: (iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF )
            // InternalOil.g:3094:2: iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF
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
    // InternalOil.g:3100:1: ruleMultipleSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleMultipleSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:3106:2: ( (kw= '[' kw= ']' ) )
            // InternalOil.g:3107:2: (kw= '[' kw= ']' )
            {
            // InternalOil.g:3107:2: (kw= '[' kw= ']' )
            // InternalOil.g:3108:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,54,FOLLOW_40); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMultipleSpecifierAccess().getLeftSquareBracketKeyword_0());
            		
            kw=(Token)match(input,56,FOLLOW_2); 

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
    // InternalOil.g:3122:1: entryRuleApplicationDefinition returns [EObject current=null] : iv_ruleApplicationDefinition= ruleApplicationDefinition EOF ;
    public final EObject entryRuleApplicationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationDefinition = null;


        try {
            // InternalOil.g:3122:62: (iv_ruleApplicationDefinition= ruleApplicationDefinition EOF )
            // InternalOil.g:3123:2: iv_ruleApplicationDefinition= ruleApplicationDefinition EOF
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
    // InternalOil.g:3129:1: ruleApplicationDefinition returns [EObject current=null] : (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleApplicationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_objectDefinitionList_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3135:2: ( (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalOil.g:3136:2: (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalOil.g:3136:2: (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalOil.g:3137:3: otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationDefinitionAccess().getCPUKeyword_0());
            		
            // InternalOil.g:3141:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:3142:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:3142:4: (lv_name_1_0= ruleName )
            // InternalOil.g:3143:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,22,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:3164:3: ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=24 && LA70_0<=27)||LA70_0==33||(LA70_0>=35 && LA70_0<=48)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalOil.g:3165:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    {
            	    // InternalOil.g:3165:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    // InternalOil.g:3166:5: lv_objectDefinitionList_3_0= ruleObjectDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getObjectDefinitionListObjectDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop70;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getApplicationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getApplicationDefinitionAccess().getSemicolonKeyword_5());
            		

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
    // InternalOil.g:3195:1: entryRuleObjectDefinition returns [EObject current=null] : iv_ruleObjectDefinition= ruleObjectDefinition EOF ;
    public final EObject entryRuleObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDefinition = null;


        try {
            // InternalOil.g:3195:57: (iv_ruleObjectDefinition= ruleObjectDefinition EOF )
            // InternalOil.g:3196:2: iv_ruleObjectDefinition= ruleObjectDefinition EOF
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
    // InternalOil.g:3202:1: ruleObjectDefinition returns [EObject current=null] : ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_ApplicationRule_6= ruleApplicationRule | ( ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';' ) ) ;
    public final EObject ruleObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_LibraryList_3_0 = null;

        EObject this_ApplicationRule_6 = null;

        AntlrDatatypeRuleToken lv_object_7_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;

        EObject lv_parameterList_10_0 = null;

        AntlrDatatypeRuleToken lv_descrption_12_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3208:2: ( ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_ApplicationRule_6= ruleApplicationRule | ( ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';' ) ) )
            // InternalOil.g:3209:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_ApplicationRule_6= ruleApplicationRule | ( ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';' ) )
            {
            // InternalOil.g:3209:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_ApplicationRule_6= ruleApplicationRule | ( ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';' ) )
            int alt76=3;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalOil.g:3210:3: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' )
                    {
                    // InternalOil.g:3210:3: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' )
                    // InternalOil.g:3211:4: otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';'
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getObjectDefinitionAccess().getLIBRARYKeyword_0_0());
                    			
                    // InternalOil.g:3215:4: ( (lv_name_1_0= ruleName ) )
                    // InternalOil.g:3216:5: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:3216:5: (lv_name_1_0= ruleName )
                    // InternalOil.g:3217:6: lv_name_1_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getNameNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_50);
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

                    // InternalOil.g:3234:4: (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==22) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // InternalOil.g:3235:5: otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_51); 

                            					newLeafNode(otherlv_2, grammarAccess.getObjectDefinitionAccess().getLeftCurlyBracketKeyword_0_2_0());
                            				
                            // InternalOil.g:3239:5: ( (lv_LibraryList_3_0= ruleLibrayattribute ) )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( ((LA71_0>=60 && LA71_0<=62)) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // InternalOil.g:3240:6: (lv_LibraryList_3_0= ruleLibrayattribute )
                            	    {
                            	    // InternalOil.g:3240:6: (lv_LibraryList_3_0= ruleLibrayattribute )
                            	    // InternalOil.g:3241:7: lv_LibraryList_3_0= ruleLibrayattribute
                            	    {

                            	    							newCompositeNode(grammarAccess.getObjectDefinitionAccess().getLibraryListLibrayattributeParserRuleCall_0_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_51);
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
                            	    break loop71;
                                }
                            } while (true);

                            otherlv_4=(Token)match(input,23,FOLLOW_10); 

                            					newLeafNode(otherlv_4, grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_0_2_2());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getObjectDefinitionAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3269:3: this_ApplicationRule_6= ruleApplicationRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getApplicationRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicationRule_6=ruleApplicationRule();

                    state._fsp--;


                    			current = this_ApplicationRule_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOil.g:3278:3: ( ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';' )
                    {
                    // InternalOil.g:3278:3: ( ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';' )
                    // InternalOil.g:3279:4: ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';'
                    {
                    // InternalOil.g:3279:4: ( (lv_object_7_0= ruleObject ) )
                    // InternalOil.g:3280:5: (lv_object_7_0= ruleObject )
                    {
                    // InternalOil.g:3280:5: (lv_object_7_0= ruleObject )
                    // InternalOil.g:3281:6: lv_object_7_0= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getObjectObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_object_7_0=ruleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"object",
                    							lv_object_7_0,
                    							"org.xtext.example.oil.Oil.Object");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:3298:4: ( (lv_name_8_0= ruleName ) )
                    // InternalOil.g:3299:5: (lv_name_8_0= ruleName )
                    {
                    // InternalOil.g:3299:5: (lv_name_8_0= ruleName )
                    // InternalOil.g:3300:6: lv_name_8_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getNameNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_name_8_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:3317:4: (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==22) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalOil.g:3318:5: otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}'
                            {
                            otherlv_9=(Token)match(input,22,FOLLOW_49); 

                            					newLeafNode(otherlv_9, grammarAccess.getObjectDefinitionAccess().getLeftCurlyBracketKeyword_2_2_0());
                            				
                            // InternalOil.g:3322:5: ( (lv_parameterList_10_0= ruleAttribute ) )*
                            loop73:
                            do {
                                int alt73=2;
                                int LA73_0 = input.LA(1);

                                if ( (LA73_0==RULE_ID||(LA73_0>=24 && LA73_0<=27)||LA73_0==33||(LA73_0>=35 && LA73_0<=48)) ) {
                                    alt73=1;
                                }


                                switch (alt73) {
                            	case 1 :
                            	    // InternalOil.g:3323:6: (lv_parameterList_10_0= ruleAttribute )
                            	    {
                            	    // InternalOil.g:3323:6: (lv_parameterList_10_0= ruleAttribute )
                            	    // InternalOil.g:3324:7: lv_parameterList_10_0= ruleAttribute
                            	    {

                            	    							newCompositeNode(grammarAccess.getObjectDefinitionAccess().getParameterListAttributeParserRuleCall_2_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_49);
                            	    lv_parameterList_10_0=ruleAttribute();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"parameterList",
                            	    								lv_parameterList_10_0,
                            	    								"org.xtext.example.oil.Oil.Attribute");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop73;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,23,FOLLOW_48); 

                            					newLeafNode(otherlv_11, grammarAccess.getObjectDefinitionAccess().getRightCurlyBracketKeyword_2_2_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:3346:4: ( (lv_descrption_12_0= ruleEString ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_STRING) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalOil.g:3347:5: (lv_descrption_12_0= ruleEString )
                            {
                            // InternalOil.g:3347:5: (lv_descrption_12_0= ruleEString )
                            // InternalOil.g:3348:6: lv_descrption_12_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getDescrptionEStringParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_descrption_12_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getObjectDefinitionRule());
                            						}
                            						set(
                            							current,
                            							"descrption",
                            							lv_descrption_12_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getObjectDefinitionAccess().getSemicolonKeyword_2_4());
                    			

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
    // InternalOil.g:3374:1: entryRuleLibrayattribute returns [EObject current=null] : iv_ruleLibrayattribute= ruleLibrayattribute EOF ;
    public final EObject entryRuleLibrayattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrayattribute = null;


        try {
            // InternalOil.g:3374:56: (iv_ruleLibrayattribute= ruleLibrayattribute EOF )
            // InternalOil.g:3375:2: iv_ruleLibrayattribute= ruleLibrayattribute EOF
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
    // InternalOil.g:3381:1: ruleLibrayattribute returns [EObject current=null] : ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) ) ;
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
            // InternalOil.g:3387:2: ( ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) ) )
            // InternalOil.g:3388:2: ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) )
            {
            // InternalOil.g:3388:2: ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt77=1;
                }
                break;
            case 61:
                {
                alt77=2;
                }
                break;
            case 62:
                {
                alt77=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalOil.g:3389:3: (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' )
                    {
                    // InternalOil.g:3389:3: (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' )
                    // InternalOil.g:3390:4: otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getLibrayattributeAccess().getPATHKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalOil.g:3398:4: ( (lv_description_2_0= ruleEString ) )
                    // InternalOil.g:3399:5: (lv_description_2_0= ruleEString )
                    {
                    // InternalOil.g:3399:5: (lv_description_2_0= ruleEString )
                    // InternalOil.g:3400:6: lv_description_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLibrayattributeAccess().getDescriptionEStringParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getLibrayattributeAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:3423:3: (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' )
                    {
                    // InternalOil.g:3423:3: (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' )
                    // InternalOil.g:3424:4: otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_4=(Token)match(input,61,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getLibrayattributeAccess().getCHEADERKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalOil.g:3432:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:3433:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:3433:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:3434:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLibrayattributeAccess().getDescriptionEStringParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLibrayattributeAccess().getSemicolonKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:3457:3: (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' )
                    {
                    // InternalOil.g:3457:3: (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' )
                    // InternalOil.g:3458:4: otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';'
                    {
                    otherlv_8=(Token)match(input,62,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getLibrayattributeAccess().getCFILEKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalOil.g:3466:4: ( (lv_description_10_0= ruleEString ) )
                    // InternalOil.g:3467:5: (lv_description_10_0= ruleEString )
                    {
                    // InternalOil.g:3467:5: (lv_description_10_0= ruleEString )
                    // InternalOil.g:3468:6: lv_description_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLibrayattributeAccess().getDescriptionEStringParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:3494:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOil.g:3494:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOil.g:3495:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOil.g:3501:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3507:2: ( ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:3508:2: ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:3508:2: ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:3509:3: ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:3509:3: ( (lv_name_0_0= ruleAttributeName ) )
            // InternalOil.g:3510:4: (lv_name_0_0= ruleAttributeName )
            {
            // InternalOil.g:3510:4: (lv_name_0_0= ruleAttributeName )
            // InternalOil.g:3511:5: lv_name_0_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameAttributeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalOil.g:3528:3: (otherlv_1= '=' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==18) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOil.g:3529:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:3534:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:3535:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:3535:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:3536:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalOil.g:3553:3: ( (lv_description_3_0= ruleEString ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_STRING) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalOil.g:3554:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:3554:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:3555:5: lv_description_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:3580:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // InternalOil.g:3580:54: (iv_ruleAttributeName= ruleAttributeName EOF )
            // InternalOil.g:3581:2: iv_ruleAttributeName= ruleAttributeName EOF
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
    // InternalOil.g:3587:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_1 = null;

        AntlrDatatypeRuleToken lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalOil.g:3593:2: ( ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) )
            // InternalOil.g:3594:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            {
            // InternalOil.g:3594:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            // InternalOil.g:3595:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            {
            // InternalOil.g:3595:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            // InternalOil.g:3596:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            {
            // InternalOil.g:3596:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_ID) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=24 && LA80_0<=27)||LA80_0==33||(LA80_0>=35 && LA80_0<=48)) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // InternalOil.g:3597:5: lv_value_0_1= ruleName
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
                    // InternalOil.g:3613:5: lv_value_0_2= ruleObject
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
    // InternalOil.g:3634:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalOil.g:3634:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalOil.g:3635:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalOil.g:3641:1: ruleAttributeValue returns [EObject current=null] : (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) ;
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
            // InternalOil.g:3647:2: ( (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) )
            // InternalOil.g:3648:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            {
            // InternalOil.g:3648:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            int alt81=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt81=1;
                }
                break;
            case 29:
            case 30:
                {
                alt81=2;
                }
                break;
            case RULE_T_NUMBER:
                {
                alt81=3;
                }
                break;
            case RULE_T_FLOAT:
                {
                alt81=4;
                }
                break;
            case RULE_STRING:
                {
                alt81=5;
                }
                break;
            case 63:
                {
                alt81=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalOil.g:3649:3: this_NameAttributeValue_0= ruleNameAttributeValue
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
                    // InternalOil.g:3658:3: this_BooleanAttributeValue_1= ruleBooleanAttributeValue
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
                    // InternalOil.g:3667:3: this_NumberAttributeValue_2= ruleNumberAttributeValue
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
                    // InternalOil.g:3676:3: this_FloatAttributeValue_3= ruleFloatAttributeValue
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
                    // InternalOil.g:3685:3: this_StringAttributeValue_4= ruleStringAttributeValue
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
                    // InternalOil.g:3694:3: this_AutoAttributeValue_5= ruleAutoAttributeValue
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
    // InternalOil.g:3706:1: entryRuleNameAttributeValue returns [EObject current=null] : iv_ruleNameAttributeValue= ruleNameAttributeValue EOF ;
    public final EObject entryRuleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttributeValue = null;


        try {
            // InternalOil.g:3706:59: (iv_ruleNameAttributeValue= ruleNameAttributeValue EOF )
            // InternalOil.g:3707:2: iv_ruleNameAttributeValue= ruleNameAttributeValue EOF
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
    // InternalOil.g:3713:1: ruleNameAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleName ) ) ;
    public final EObject ruleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3719:2: ( ( (lv_value_0_0= ruleName ) ) )
            // InternalOil.g:3720:2: ( (lv_value_0_0= ruleName ) )
            {
            // InternalOil.g:3720:2: ( (lv_value_0_0= ruleName ) )
            // InternalOil.g:3721:3: (lv_value_0_0= ruleName )
            {
            // InternalOil.g:3721:3: (lv_value_0_0= ruleName )
            // InternalOil.g:3722:4: lv_value_0_0= ruleName
            {

            				newCompositeNode(grammarAccess.getNameAttributeValueAccess().getValueNameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
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
    // InternalOil.g:3742:1: entryRuleBooleanAttributeValue returns [EObject current=null] : iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF ;
    public final EObject entryRuleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAttributeValue = null;


        try {
            // InternalOil.g:3742:62: (iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF )
            // InternalOil.g:3743:2: iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF
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
    // InternalOil.g:3749:1: ruleBooleanAttributeValue returns [EObject current=null] : ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) ;
    public final EObject ruleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalOil.g:3755:2: ( ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) ) )
            // InternalOil.g:3756:2: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            {
            // InternalOil.g:3756:2: ( ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) ) )
            // InternalOil.g:3757:3: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            {
            // InternalOil.g:3757:3: ( (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' ) )
            // InternalOil.g:3758:4: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            {
            // InternalOil.g:3758:4: (lv_value_0_1= 'TRUE' | lv_value_0_2= 'FALSE' )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==29) ) {
                alt82=1;
            }
            else if ( (LA82_0==30) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalOil.g:3759:5: lv_value_0_1= 'TRUE'
                    {
                    lv_value_0_1=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBooleanAttributeValueAccess().getValueTRUEKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanAttributeValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalOil.g:3770:5: lv_value_0_2= 'FALSE'
                    {
                    lv_value_0_2=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBooleanAttributeValueAccess().getValueFALSEKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanAttributeValueRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

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
    // $ANTLR end "ruleBooleanAttributeValue"


    // $ANTLR start "entryRuleNumberAttributeValue"
    // InternalOil.g:3786:1: entryRuleNumberAttributeValue returns [EObject current=null] : iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF ;
    public final EObject entryRuleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAttributeValue = null;


        try {
            // InternalOil.g:3786:61: (iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF )
            // InternalOil.g:3787:2: iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF
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
    // InternalOil.g:3793:1: ruleNumberAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3799:2: ( ( (lv_value_0_0= ruleNumber ) ) )
            // InternalOil.g:3800:2: ( (lv_value_0_0= ruleNumber ) )
            {
            // InternalOil.g:3800:2: ( (lv_value_0_0= ruleNumber ) )
            // InternalOil.g:3801:3: (lv_value_0_0= ruleNumber )
            {
            // InternalOil.g:3801:3: (lv_value_0_0= ruleNumber )
            // InternalOil.g:3802:4: lv_value_0_0= ruleNumber
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
    // InternalOil.g:3822:1: entryRuleFloatAttributeValue returns [EObject current=null] : iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF ;
    public final EObject entryRuleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatAttributeValue = null;


        try {
            // InternalOil.g:3822:60: (iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF )
            // InternalOil.g:3823:2: iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF
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
    // InternalOil.g:3829:1: ruleFloatAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloat ) ) ;
    public final EObject ruleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3835:2: ( ( (lv_value_0_0= ruleEFloat ) ) )
            // InternalOil.g:3836:2: ( (lv_value_0_0= ruleEFloat ) )
            {
            // InternalOil.g:3836:2: ( (lv_value_0_0= ruleEFloat ) )
            // InternalOil.g:3837:3: (lv_value_0_0= ruleEFloat )
            {
            // InternalOil.g:3837:3: (lv_value_0_0= ruleEFloat )
            // InternalOil.g:3838:4: lv_value_0_0= ruleEFloat
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
    // InternalOil.g:3858:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // InternalOil.g:3858:61: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // InternalOil.g:3859:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
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
    // InternalOil.g:3865:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3871:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalOil.g:3872:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalOil.g:3872:2: ( (lv_value_0_0= ruleEString ) )
            // InternalOil.g:3873:3: (lv_value_0_0= ruleEString )
            {
            // InternalOil.g:3873:3: (lv_value_0_0= ruleEString )
            // InternalOil.g:3874:4: lv_value_0_0= ruleEString
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
    // InternalOil.g:3894:1: entryRuleAutoAttributeValue returns [EObject current=null] : iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF ;
    public final EObject entryRuleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoAttributeValue = null;


        try {
            // InternalOil.g:3894:59: (iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF )
            // InternalOil.g:3895:2: iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF
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
    // InternalOil.g:3901:1: ruleAutoAttributeValue returns [EObject current=null] : ( (lv_value_0_0= 'AUTO' ) ) ;
    public final EObject ruleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOil.g:3907:2: ( ( (lv_value_0_0= 'AUTO' ) ) )
            // InternalOil.g:3908:2: ( (lv_value_0_0= 'AUTO' ) )
            {
            // InternalOil.g:3908:2: ( (lv_value_0_0= 'AUTO' ) )
            // InternalOil.g:3909:3: (lv_value_0_0= 'AUTO' )
            {
            // InternalOil.g:3909:3: (lv_value_0_0= 'AUTO' )
            // InternalOil.g:3910:4: lv_value_0_0= 'AUTO'
            {
            lv_value_0_0=(Token)match(input,63,FOLLOW_2); 

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
    // InternalOil.g:3925:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOil.g:3925:47: (iv_ruleEString= ruleEString EOF )
            // InternalOil.g:3926:2: iv_ruleEString= ruleEString EOF
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
    // InternalOil.g:3932:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalOil.g:3938:2: (this_STRING_0= RULE_STRING )
            // InternalOil.g:3939:2: this_STRING_0= RULE_STRING
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


    // $ANTLR start "entryRuleNumber"
    // InternalOil.g:3949:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalOil.g:3949:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalOil.g:3950:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalOil.g:3956:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_NUMBER_0= RULE_T_NUMBER ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_NUMBER_0=null;


        	enterRule();

        try {
            // InternalOil.g:3962:2: (this_T_NUMBER_0= RULE_T_NUMBER )
            // InternalOil.g:3963:2: this_T_NUMBER_0= RULE_T_NUMBER
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
    // InternalOil.g:3973:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalOil.g:3973:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalOil.g:3974:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalOil.g:3980:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_FLOAT_0= RULE_T_FLOAT ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_FLOAT_0=null;


        	enterRule();

        try {
            // InternalOil.g:3986:2: (this_T_FLOAT_0= RULE_T_FLOAT )
            // InternalOil.g:3987:2: this_T_FLOAT_0= RULE_T_FLOAT
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
    // InternalOil.g:3997:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalOil.g:3997:44: (iv_ruleName= ruleName EOF )
            // InternalOil.g:3998:2: iv_ruleName= ruleName EOF
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
    // InternalOil.g:4004:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalOil.g:4010:2: (this_ID_0= RULE_ID )
            // InternalOil.g:4011:2: this_ID_0= RULE_ID
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


    // $ANTLR start "ruleApplicationParamEnum"
    // InternalOil.g:4021:1: ruleApplicationParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) ) ;
    public final Enumerator ruleApplicationParamEnum() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalOil.g:4027:2: ( ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) ) )
            // InternalOil.g:4028:2: ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) )
            {
            // InternalOil.g:4028:2: ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) )
            int alt83=12;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt83=1;
                }
                break;
            case 35:
                {
                alt83=2;
                }
                break;
            case 26:
                {
                alt83=3;
                }
                break;
            case 36:
                {
                alt83=4;
                }
                break;
            case 25:
                {
                alt83=5;
                }
                break;
            case 33:
                {
                alt83=6;
                }
                break;
            case 38:
                {
                alt83=7;
                }
                break;
            case 46:
                {
                alt83=8;
                }
                break;
            case 47:
                {
                alt83=9;
                }
                break;
            case 65:
                {
                alt83=10;
                }
                break;
            case 66:
                {
                alt83=11;
                }
                break;
            case 67:
                {
                alt83=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalOil.g:4029:3: (enumLiteral_0= 'CORE' )
                    {
                    // InternalOil.g:4029:3: (enumLiteral_0= 'CORE' )
                    // InternalOil.g:4030:4: enumLiteral_0= 'CORE'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getCOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getApplicationParamEnumAccess().getCOREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:4037:3: (enumLiteral_1= 'ALARM' )
                    {
                    // InternalOil.g:4037:3: (enumLiteral_1= 'ALARM' )
                    // InternalOil.g:4038:4: enumLiteral_1= 'ALARM'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getALARMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getApplicationParamEnumAccess().getALARMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:4045:3: (enumLiteral_2= 'COUNTER' )
                    {
                    // InternalOil.g:4045:3: (enumLiteral_2= 'COUNTER' )
                    // InternalOil.g:4046:4: enumLiteral_2= 'COUNTER'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getCOUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getApplicationParamEnumAccess().getCOUNTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:4053:3: (enumLiteral_3= 'RESOURCE' )
                    {
                    // InternalOil.g:4053:3: (enumLiteral_3= 'RESOURCE' )
                    // InternalOil.g:4054:4: enumLiteral_3= 'RESOURCE'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getRESOURCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getApplicationParamEnumAccess().getRESOURCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:4061:3: (enumLiteral_4= 'TASK' )
                    {
                    // InternalOil.g:4061:3: (enumLiteral_4= 'TASK' )
                    // InternalOil.g:4062:4: enumLiteral_4= 'TASK'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getTASKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getApplicationParamEnumAccess().getTASKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:4069:3: (enumLiteral_5= 'ISR' )
                    {
                    // InternalOil.g:4069:3: (enumLiteral_5= 'ISR' )
                    // InternalOil.g:4070:4: enumLiteral_5= 'ISR'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getISREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getApplicationParamEnumAccess().getISREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:4077:3: (enumLiteral_6= 'MESSAGE' )
                    {
                    // InternalOil.g:4077:3: (enumLiteral_6= 'MESSAGE' )
                    // InternalOil.g:4078:4: enumLiteral_6= 'MESSAGE'
                    {
                    enumLiteral_6=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getMESSAGEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getApplicationParamEnumAccess().getMESSAGEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:4085:3: (enumLiteral_7= 'SCHEDULETABLE' )
                    {
                    // InternalOil.g:4085:3: (enumLiteral_7= 'SCHEDULETABLE' )
                    // InternalOil.g:4086:4: enumLiteral_7= 'SCHEDULETABLE'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getSCHEDULETABLEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getApplicationParamEnumAccess().getSCHEDULETABLEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOil.g:4093:3: (enumLiteral_8= 'IOC' )
                    {
                    // InternalOil.g:4093:3: (enumLiteral_8= 'IOC' )
                    // InternalOil.g:4094:4: enumLiteral_8= 'IOC'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getIOCEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getApplicationParamEnumAccess().getIOCEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOil.g:4101:3: (enumLiteral_9= 'ERRORHOOK' )
                    {
                    // InternalOil.g:4101:3: (enumLiteral_9= 'ERRORHOOK' )
                    // InternalOil.g:4102:4: enumLiteral_9= 'ERRORHOOK'
                    {
                    enumLiteral_9=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getERRORHOOKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getApplicationParamEnumAccess().getERRORHOOKEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOil.g:4109:3: (enumLiteral_10= 'SHUTDOWNHOOK' )
                    {
                    // InternalOil.g:4109:3: (enumLiteral_10= 'SHUTDOWNHOOK' )
                    // InternalOil.g:4110:4: enumLiteral_10= 'SHUTDOWNHOOK'
                    {
                    enumLiteral_10=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getSHUTDOWNHOOKEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getApplicationParamEnumAccess().getSHUTDOWNHOOKEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOil.g:4117:3: (enumLiteral_11= 'STARTUPHOOK' )
                    {
                    // InternalOil.g:4117:3: (enumLiteral_11= 'STARTUPHOOK' )
                    // InternalOil.g:4118:4: enumLiteral_11= 'STARTUPHOOK'
                    {
                    enumLiteral_11=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getSTARTUPHOOKEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getApplicationParamEnumAccess().getSTARTUPHOOKEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "ruleApplicationParamEnum"


    // $ANTLR start "ruleTimingProtectionParamEnum"
    // InternalOil.g:4128:1: ruleTimingProtectionParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) ) ;
    public final Enumerator ruleTimingProtectionParamEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOil.g:4134:2: ( ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) ) )
            // InternalOil.g:4135:2: ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) )
            {
            // InternalOil.g:4135:2: ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) )
            int alt84=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt84=1;
                }
                break;
            case 69:
                {
                alt84=2;
                }
                break;
            case 70:
                {
                alt84=3;
                }
                break;
            case 71:
                {
                alt84=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalOil.g:4136:3: (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' )
                    {
                    // InternalOil.g:4136:3: (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' )
                    // InternalOil.g:4137:4: enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getTimingProtectionParamEnumAccess().getMAXALLINTERRUPTLOCKTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimingProtectionParamEnumAccess().getMAXALLINTERRUPTLOCKTIMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:4144:3: (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' )
                    {
                    // InternalOil.g:4144:3: (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' )
                    // InternalOil.g:4145:4: enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getTimingProtectionParamEnumAccess().getMAXOSINTERRUPTLOCKTIMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimingProtectionParamEnumAccess().getMAXOSINTERRUPTLOCKTIMEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:4152:3: (enumLiteral_2= 'EXECUTIONTIME' )
                    {
                    // InternalOil.g:4152:3: (enumLiteral_2= 'EXECUTIONTIME' )
                    // InternalOil.g:4153:4: enumLiteral_2= 'EXECUTIONTIME'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getTimingProtectionParamEnumAccess().getEXECUTIONTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimingProtectionParamEnumAccess().getEXECUTIONTIMEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:4160:3: (enumLiteral_3= 'TIMEFRAME' )
                    {
                    // InternalOil.g:4160:3: (enumLiteral_3= 'TIMEFRAME' )
                    // InternalOil.g:4161:4: enumLiteral_3= 'TIMEFRAME'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getTimingProtectionParamEnumAccess().getTIMEFRAMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimingProtectionParamEnumAccess().getTIMEFRAMEEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTimingProtectionParamEnum"


    // $ANTLR start "ruleIsrParamEnum"
    // InternalOil.g:4171:1: ruleIsrParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) ) ;
    public final Enumerator ruleIsrParamEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalOil.g:4177:2: ( ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) ) )
            // InternalOil.g:4178:2: ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) )
            {
            // InternalOil.g:4178:2: ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) )
            int alt85=7;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt85=1;
                }
                break;
            case 36:
                {
                alt85=2;
                }
                break;
            case 38:
                {
                alt85=3;
                }
                break;
            case 73:
                {
                alt85=4;
                }
                break;
            case 74:
                {
                alt85=5;
                }
                break;
            case 75:
                {
                alt85=6;
                }
                break;
            case 76:
                {
                alt85=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalOil.g:4179:3: (enumLiteral_0= 'CATEGORY' )
                    {
                    // InternalOil.g:4179:3: (enumLiteral_0= 'CATEGORY' )
                    // InternalOil.g:4180:4: enumLiteral_0= 'CATEGORY'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getCATEGORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIsrParamEnumAccess().getCATEGORYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:4187:3: (enumLiteral_1= 'RESOURCE' )
                    {
                    // InternalOil.g:4187:3: (enumLiteral_1= 'RESOURCE' )
                    // InternalOil.g:4188:4: enumLiteral_1= 'RESOURCE'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getRESOURCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIsrParamEnumAccess().getRESOURCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:4195:3: (enumLiteral_2= 'MESSAGE' )
                    {
                    // InternalOil.g:4195:3: (enumLiteral_2= 'MESSAGE' )
                    // InternalOil.g:4196:4: enumLiteral_2= 'MESSAGE'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getMESSAGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIsrParamEnumAccess().getMESSAGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:4203:3: (enumLiteral_3= 'PRIORITY' )
                    {
                    // InternalOil.g:4203:3: (enumLiteral_3= 'PRIORITY' )
                    // InternalOil.g:4204:4: enumLiteral_3= 'PRIORITY'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getPRIORITYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIsrParamEnumAccess().getPRIORITYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:4211:3: (enumLiteral_4= 'ENTRY' )
                    {
                    // InternalOil.g:4211:3: (enumLiteral_4= 'ENTRY' )
                    // InternalOil.g:4212:4: enumLiteral_4= 'ENTRY'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getENTRYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getIsrParamEnumAccess().getENTRYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:4219:3: (enumLiteral_5= 'STACKSIZE' )
                    {
                    // InternalOil.g:4219:3: (enumLiteral_5= 'STACKSIZE' )
                    // InternalOil.g:4220:4: enumLiteral_5= 'STACKSIZE'
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getSTACKSIZEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getIsrParamEnumAccess().getSTACKSIZEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:4227:3: (enumLiteral_6= 'SOURCE' )
                    {
                    // InternalOil.g:4227:3: (enumLiteral_6= 'SOURCE' )
                    // InternalOil.g:4228:4: enumLiteral_6= 'SOURCE'
                    {
                    enumLiteral_6=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getSOURCEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getIsrParamEnumAccess().getSOURCEEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleIsrParamEnum"


    // $ANTLR start "ruleIntTypeEnum"
    // InternalOil.g:4238:1: ruleIntTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) ;
    public final Enumerator ruleIntTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOil.g:4244:2: ( ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) )
            // InternalOil.g:4245:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            {
            // InternalOil.g:4245:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            int alt86=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt86=1;
                }
                break;
            case 78:
                {
                alt86=2;
                }
                break;
            case 79:
                {
                alt86=3;
                }
                break;
            case 80:
                {
                alt86=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalOil.g:4246:3: (enumLiteral_0= 'UINT32' )
                    {
                    // InternalOil.g:4246:3: (enumLiteral_0= 'UINT32' )
                    // InternalOil.g:4247:4: enumLiteral_0= 'UINT32'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:4254:3: (enumLiteral_1= 'INT32' )
                    {
                    // InternalOil.g:4254:3: (enumLiteral_1= 'INT32' )
                    // InternalOil.g:4255:4: enumLiteral_1= 'INT32'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:4262:3: (enumLiteral_2= 'UINT64' )
                    {
                    // InternalOil.g:4262:3: (enumLiteral_2= 'UINT64' )
                    // InternalOil.g:4263:4: enumLiteral_2= 'UINT64'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:4270:3: (enumLiteral_3= 'INT64' )
                    {
                    // InternalOil.g:4270:3: (enumLiteral_3= 'INT64' )
                    // InternalOil.g:4271:4: enumLiteral_3= 'INT64'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

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
    // InternalOil.g:4281:1: ruleDefaultEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) ;
    public final Enumerator ruleDefaultEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:4287:2: ( ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) )
            // InternalOil.g:4288:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            {
            // InternalOil.g:4288:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==81) ) {
                alt87=1;
            }
            else if ( (LA87_0==63) ) {
                alt87=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalOil.g:4289:3: (enumLiteral_0= 'NO_DEFAULT' )
                    {
                    // InternalOil.g:4289:3: (enumLiteral_0= 'NO_DEFAULT' )
                    // InternalOil.g:4290:4: enumLiteral_0= 'NO_DEFAULT'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:4297:3: (enumLiteral_1= 'AUTO' )
                    {
                    // InternalOil.g:4297:3: (enumLiteral_1= 'AUTO' )
                    // InternalOil.g:4298:4: enumLiteral_1= 'AUTO'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

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
    // InternalOil.g:4308:1: ruleObjectRefTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) ;
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
            // InternalOil.g:4314:2: ( ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) )
            // InternalOil.g:4315:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            {
            // InternalOil.g:4315:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            int alt88=20;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt88=1;
                }
                break;
            case 83:
                {
                alt88=2;
                }
                break;
            case 84:
                {
                alt88=3;
                }
                break;
            case 85:
                {
                alt88=4;
                }
                break;
            case 86:
                {
                alt88=5;
                }
                break;
            case 87:
                {
                alt88=6;
                }
                break;
            case 88:
                {
                alt88=7;
                }
                break;
            case 89:
                {
                alt88=8;
                }
                break;
            case 90:
                {
                alt88=9;
                }
                break;
            case 91:
                {
                alt88=10;
                }
                break;
            case 92:
                {
                alt88=11;
                }
                break;
            case 93:
                {
                alt88=12;
                }
                break;
            case 94:
                {
                alt88=13;
                }
                break;
            case 95:
                {
                alt88=14;
                }
                break;
            case 96:
                {
                alt88=15;
                }
                break;
            case 97:
                {
                alt88=16;
                }
                break;
            case 98:
                {
                alt88=17;
                }
                break;
            case 99:
                {
                alt88=18;
                }
                break;
            case 100:
                {
                alt88=19;
                }
                break;
            case 101:
                {
                alt88=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalOil.g:4316:3: (enumLiteral_0= 'OS_TYPE' )
                    {
                    // InternalOil.g:4316:3: (enumLiteral_0= 'OS_TYPE' )
                    // InternalOil.g:4317:4: enumLiteral_0= 'OS_TYPE'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:4324:3: (enumLiteral_1= 'TASK_TYPE' )
                    {
                    // InternalOil.g:4324:3: (enumLiteral_1= 'TASK_TYPE' )
                    // InternalOil.g:4325:4: enumLiteral_1= 'TASK_TYPE'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:4332:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    {
                    // InternalOil.g:4332:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    // InternalOil.g:4333:4: enumLiteral_2= 'COUNTER_TYPE'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:4340:3: (enumLiteral_3= 'ALARM_TYPE' )
                    {
                    // InternalOil.g:4340:3: (enumLiteral_3= 'ALARM_TYPE' )
                    // InternalOil.g:4341:4: enumLiteral_3= 'ALARM_TYPE'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:4348:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    {
                    // InternalOil.g:4348:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    // InternalOil.g:4349:4: enumLiteral_4= 'RESOURCE_TYPE'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:4356:3: (enumLiteral_5= 'EVENT_TYPE' )
                    {
                    // InternalOil.g:4356:3: (enumLiteral_5= 'EVENT_TYPE' )
                    // InternalOil.g:4357:4: enumLiteral_5= 'EVENT_TYPE'
                    {
                    enumLiteral_5=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:4364:3: (enumLiteral_6= 'ISR_TYPE' )
                    {
                    // InternalOil.g:4364:3: (enumLiteral_6= 'ISR_TYPE' )
                    // InternalOil.g:4365:4: enumLiteral_6= 'ISR_TYPE'
                    {
                    enumLiteral_6=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:4372:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    {
                    // InternalOil.g:4372:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    // InternalOil.g:4373:4: enumLiteral_7= 'MESSAGE_TYPE'
                    {
                    enumLiteral_7=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOil.g:4380:3: (enumLiteral_8= 'COM_TYPE' )
                    {
                    // InternalOil.g:4380:3: (enumLiteral_8= 'COM_TYPE' )
                    // InternalOil.g:4381:4: enumLiteral_8= 'COM_TYPE'
                    {
                    enumLiteral_8=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOil.g:4388:3: (enumLiteral_9= 'NM_TYPE' )
                    {
                    // InternalOil.g:4388:3: (enumLiteral_9= 'NM_TYPE' )
                    // InternalOil.g:4389:4: enumLiteral_9= 'NM_TYPE'
                    {
                    enumLiteral_9=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOil.g:4396:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    {
                    // InternalOil.g:4396:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    // InternalOil.g:4397:4: enumLiteral_10= 'APPMODE_TYPE'
                    {
                    enumLiteral_10=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOil.g:4404:3: (enumLiteral_11= 'IPDU_TYPE' )
                    {
                    // InternalOil.g:4404:3: (enumLiteral_11= 'IPDU_TYPE' )
                    // InternalOil.g:4405:4: enumLiteral_11= 'IPDU_TYPE'
                    {
                    enumLiteral_11=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalOil.g:4412:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    {
                    // InternalOil.g:4412:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    // InternalOil.g:4413:4: enumLiteral_12= 'NETWORKMESSAGE_TYPE'
                    {
                    enumLiteral_12=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalOil.g:4420:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    {
                    // InternalOil.g:4420:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    // InternalOil.g:4421:4: enumLiteral_13= 'APPLICATION_TYPE'
                    {
                    enumLiteral_13=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalOil.g:4428:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    {
                    // InternalOil.g:4428:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    // InternalOil.g:4429:4: enumLiteral_14= 'MEMOTY_PROTECTION_TYPE'
                    {
                    enumLiteral_14=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalOil.g:4436:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    {
                    // InternalOil.g:4436:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    // InternalOil.g:4437:4: enumLiteral_15= 'SPINLOCK_TYPE'
                    {
                    enumLiteral_15=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalOil.g:4444:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    {
                    // InternalOil.g:4444:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    // InternalOil.g:4445:4: enumLiteral_16= 'SCHEDULETABLE_TYPE'
                    {
                    enumLiteral_16=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalOil.g:4452:3: (enumLiteral_17= 'IOC_TYPE' )
                    {
                    // InternalOil.g:4452:3: (enumLiteral_17= 'IOC_TYPE' )
                    // InternalOil.g:4453:4: enumLiteral_17= 'IOC_TYPE'
                    {
                    enumLiteral_17=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalOil.g:4460:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    {
                    // InternalOil.g:4460:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    // InternalOil.g:4461:4: enumLiteral_18= 'APICONFIG_TYPE'
                    {
                    enumLiteral_18=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalOil.g:4468:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    {
                    // InternalOil.g:4468:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    // InternalOil.g:4469:4: enumLiteral_19= 'LIBRARY_TYPE'
                    {
                    enumLiteral_19=(Token)match(input,101,FOLLOW_2); 

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


    protected DFA76 dfa76 = new DFA76(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\1\30\2\6\1\uffff\2\4\1\uffff\1\6\1\uffff\1\6\13\4\1\uffff\7\4\1\6";
    static final String dfa_3s = "\1\60\1\6\1\26\1\uffff\2\26\1\uffff\1\76\1\uffff\1\103\1\24\10\77\1\24\1\77\1\uffff\7\24\1\103";
    static final String dfa_4s = "\3\uffff\1\3\2\uffff\1\2\1\uffff\1\1\14\uffff\1\2\10\uffff";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\3\3\1\2\5\uffff\1\3\1\uffff\15\3\1\1",
            "\1\4",
            "\1\5\17\uffff\1\6",
            "",
            "\1\3\17\uffff\1\10\1\uffff\1\7",
            "\1\3\17\uffff\1\3\1\uffff\1\11",
            "",
            "\1\3\20\uffff\1\12\4\3\5\uffff\1\3\1\uffff\16\3\13\uffff\3\10",
            "",
            "\1\3\20\uffff\1\23\1\3\1\16\1\14\1\3\1\6\3\uffff\1\6\1\17\1\uffff\1\13\1\15\1\3\1\20\7\3\1\21\1\22\1\3\17\uffff\4\6",
            "\1\3\17\uffff\1\10",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\1\uffff\3\3\11\uffff\1\24\12\uffff\2\3\40\uffff\1\3",
            "\1\3\17\uffff\1\25",
            "\1\33\1\uffff\1\26\1\31\1\32\24\uffff\1\27\1\30\40\uffff\1\34",
            "",
            "\1\3\17\uffff\1\35",
            "\1\3\17\uffff\1\35",
            "\1\3\17\uffff\1\35",
            "\1\3\17\uffff\1\35",
            "\1\3\17\uffff\1\35",
            "\1\3\17\uffff\1\35",
            "\1\3\17\uffff\1\35",
            "\1\3\20\uffff\1\23\1\3\1\16\1\14\1\3\1\25\3\uffff\1\25\1\17\1\uffff\1\13\1\15\1\3\1\20\7\3\1\21\1\22\1\3\17\uffff\4\25"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3209:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_ApplicationRule_6= ruleApplicationRule | ( ( (lv_object_7_0= ruleObject ) ) ( (lv_name_8_0= ruleName ) ) (otherlv_9= '{' ( (lv_parameterList_10_0= ruleAttribute ) )* otherlv_11= '}' )? ( (lv_descrption_12_0= ruleEString ) )? otherlv_13= ';' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0800000000204000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000207000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000207000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x023C000000800000L,0x0000003FFFFDE000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000C05B16800000L,0x000000000000000FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x80000000600001D0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000005400800000L,0x000000000001FF00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000005400800000L,0x0000000000001F00L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0043FFFA0F000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0040000000140000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000080L,0x0000000000020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000000000000180L,0x0000000000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x80000000000000C0L,0x0000000000020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000090L,0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000400010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000400010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000060000080L,0x0000000000020000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000000100010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0043FFFA0F800040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x7000000000800000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000500010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x80000000600401D0L});

}