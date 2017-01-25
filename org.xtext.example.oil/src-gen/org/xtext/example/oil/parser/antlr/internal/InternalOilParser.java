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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_FILEID", "RULE_ID", "RULE_T_NUMBER", "RULE_T_FLOAT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#include'", "'<'", "'>'", "'OIL_VERSION'", "'='", "':'", "';'", "'IMPLEMENTATION'", "'{'", "'}'", "'TASK'", "'WITH_AUTO'", "'OS'", "'ENUM'", "'STATUS'", "'COUNTER'", "'IDENTIFIER'", "'APPLICATION'", "'HAS_RESTARTTASK'", "'TRUE'", "'FALSE'", "'RESTARTTASK'", "'TRUSTED'", "'TRUSTED_FUNCTION'", "'ISR'", "'TIMING_PROTECTION'", "'MEMORY_PROTECTION'", "'ALARM'", "'RESOURCE'", "'EVENT'", "'MESSAGE'", "'COM'", "'NM'", "'APPMODE'", "'IPDU'", "'NETWORKMESSAGE'", "'MEMOTY_PROTECTION'", "'SPINLOCK'", "'SCHEDULETABLE'", "'IOC'", "'LIBRARY'", "'FLOAT'", "'STRING'", "'BOOLEAN'", "'['", "','", "']'", "'..'", "'CPU'", "'PATH'", "'CHEADER'", "'CFILE'", "'AUTOSTART'", "'TIMINGPROTECTION'", "'RESOURCELOCK'", "'RESOURCEPROPERTY'", "'ACCESSING_APPLICATION'", "'ACTION'", "'ACTIVATETASK'", "'INCREMENTCOUNTER'", "'SETEVENT'", "'ALARMCALLBACK'", "'ALARMTIME'", "'CYCLETIME'", "'LENGTH'", "'NONE'", "'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION'", "'PERIODIC'", "'EXPIRY_POINT'", "'ABSOLUTE'", "'PRECISION'", "'SYNC_STRATEGY'", "'OFFSET'", "'ADJUSTBLE'", "'DATATYPENAME'", "'SEMANTICS'", "'RECEIVER'", "'SENDER'", "'DATATYPEPROPERTY'", "'QUEUED'", "'LAST_IS_BEST'", "'AUTO'", "'STACKSIZE'", "'PRIORITY'", "'SOURCE'", "'FREQUENCY'", "'CORE'", "'ERRORHOOK'", "'SHUTDOWNHOOK'", "'STARTUPHOOK'", "'MAXALLINTERRUPTLOCKTIME'", "'MAXOSINTERRUPTLOCKTIME'", "'EXECUTIONTIME'", "'TIMEFRAME'", "'CATEGORY'", "'ENTRY'", "'UINT32'", "'INT32'", "'UINT64'", "'INT64'", "'NO_DEFAULT'", "'OS_TYPE'", "'TASK_TYPE'", "'COUNTER_TYPE'", "'ALARM_TYPE'", "'RESOURCE_TYPE'", "'EVENT_TYPE'", "'ISR_TYPE'", "'MESSAGE_TYPE'", "'COM_TYPE'", "'NM_TYPE'", "'APPMODE_TYPE'", "'IPDU_TYPE'", "'NETWORKMESSAGE_TYPE'", "'APPLICATION_TYPE'", "'MEMOTY_PROTECTION_TYPE'", "'SPINLOCK_TYPE'", "'SCHEDULETABLE_TYPE'", "'IOC_TYPE'", "'APICONFIG_TYPE'", "'LIBRARY_TYPE'", "'COMSTATUS'", "'COMERRORHOOK'", "'COMUSEGETSERVICEID'", "'COMUSEPARAMETERACCESS'", "'COMSTARTCOMEXTENSION'", "'COMTIMEBASE'", "'COMAPPMODE'", "'USE'", "'LOCKTIME'", "'RESOURCENAME'", "'EXECUTIONBUDGET'", "'ACTIVATION'", "'NAME'", "'PROCESSKIND'", "'NONPREEMPTABLE'", "'SCHEDULE'", "'USEINTERNALRESOURCE'", "'INTERNALRESOURCE'", "'STANDARD'", "'INTERNAL'", "'LINKED'", "'START'", "'EXPLICIT'", "'IMPLICIT'", "'MAX_RETARD'", "'MAX_ADVANCE'", "'SENDER_ID'", "'SND_OSAPPLICATION'", "'REV_OSAPPLICATION'", "'RECEIVER_PULL_CB'", "'DATA'", "'REFERNCE'", "'BUFFER_LENGTH'", "'INIT_VALUE_SYMBOL'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
    public static final int RULE_T_FLOAT=8;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=6;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int RULE_T_NUMBER=7;
    public static final int T__166=166;
    public static final int T__165=165;
    public static final int T__168=168;
    public static final int T__167=167;
    public static final int T__162=162;
    public static final int T__161=161;
    public static final int T__164=164;
    public static final int T__163=163;
    public static final int T__160=160;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__159=159;
    public static final int T__30=30;
    public static final int T__158=158;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalOil.g:264:1: ruleOILVersion returns [EObject current=null] : (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' ) ;
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
            // InternalOil.g:270:2: ( (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' ) )
            // InternalOil.g:271:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' )
            {
            // InternalOil.g:271:2: (otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';' )
            // InternalOil.g:272:3: otherlv_0= 'OIL_VERSION' otherlv_1= '=' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getOILVersionAccess().getOIL_VERSIONKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOILVersionAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:280:3: ( (lv_value_2_0= ruleEString ) )
            // InternalOil.g:281:4: (lv_value_2_0= ruleEString )
            {
            // InternalOil.g:281:4: (lv_value_2_0= ruleEString )
            // InternalOil.g:282:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOILVersionAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalOil.g:299:3: (otherlv_3= ':' ( (lv_description_4_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOil.g:300:4: otherlv_3= ':' ( (lv_description_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getOILVersionAccess().getColonKeyword_3_0());
                    			
                    // InternalOil.g:304:4: ( (lv_description_4_0= ruleEString ) )
                    // InternalOil.g:305:5: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:305:5: (lv_description_4_0= ruleEString )
                    // InternalOil.g:306:6: lv_description_4_0= ruleEString
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
    // InternalOil.g:332:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // InternalOil.g:332:65: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // InternalOil.g:333:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
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
    // InternalOil.g:339:1: ruleImplementationDefinition returns [EObject current=null] : (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) ;
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
            // InternalOil.g:345:2: ( (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) )
            // InternalOil.g:346:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            {
            // InternalOil.g:346:2: (otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            // InternalOil.g:347:3: otherlv_0= 'IMPLEMENTATION' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) ) otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getImplementationDefinitionAccess().getIMPLEMENTATIONKeyword_0());
            		
            // InternalOil.g:351:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:352:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:352:4: (lv_name_1_0= ruleName )
            // InternalOil.g:353:5: lv_name_1_0= ruleName
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
            		
            // InternalOil.g:374:3: ( (lv_implementationSpecs_3_0= ruleImplementationSpec ) )
            // InternalOil.g:375:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            {
            // InternalOil.g:375:4: (lv_implementationSpecs_3_0= ruleImplementationSpec )
            // InternalOil.g:376:5: lv_implementationSpecs_3_0= ruleImplementationSpec
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

            otherlv_4=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getImplementationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:397:3: ( (lv_description_5_0= ruleEString ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalOil.g:398:4: (lv_description_5_0= ruleEString )
                    {
                    // InternalOil.g:398:4: (lv_description_5_0= ruleEString )
                    // InternalOil.g:399:5: lv_description_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getDescriptionEStringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_10);
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:424:1: entryRuleImplementationSpec returns [EObject current=null] : iv_ruleImplementationSpec= ruleImplementationSpec EOF ;
    public final EObject entryRuleImplementationSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationSpec = null;


        try {
            // InternalOil.g:424:59: (iv_ruleImplementationSpec= ruleImplementationSpec EOF )
            // InternalOil.g:425:2: iv_ruleImplementationSpec= ruleImplementationSpec EOF
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
    // InternalOil.g:431:1: ruleImplementationSpec returns [EObject current=null] : ( () ( ( (lv_osRule_1_0= ruleImpOsRule ) ) | ( (lv_counterRule_2_0= ruleImpCounterRule ) ) | ( (lv_isrRule_3_0= ruleIsrRule ) ) | ( (lv_taskRule_4_0= ruleImpTaskRule ) ) )* ) ;
    public final EObject ruleImplementationSpec() throws RecognitionException {
        EObject current = null;

        EObject lv_osRule_1_0 = null;

        EObject lv_counterRule_2_0 = null;

        EObject lv_isrRule_3_0 = null;

        EObject lv_taskRule_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:437:2: ( ( () ( ( (lv_osRule_1_0= ruleImpOsRule ) ) | ( (lv_counterRule_2_0= ruleImpCounterRule ) ) | ( (lv_isrRule_3_0= ruleIsrRule ) ) | ( (lv_taskRule_4_0= ruleImpTaskRule ) ) )* ) )
            // InternalOil.g:438:2: ( () ( ( (lv_osRule_1_0= ruleImpOsRule ) ) | ( (lv_counterRule_2_0= ruleImpCounterRule ) ) | ( (lv_isrRule_3_0= ruleIsrRule ) ) | ( (lv_taskRule_4_0= ruleImpTaskRule ) ) )* )
            {
            // InternalOil.g:438:2: ( () ( ( (lv_osRule_1_0= ruleImpOsRule ) ) | ( (lv_counterRule_2_0= ruleImpCounterRule ) ) | ( (lv_isrRule_3_0= ruleIsrRule ) ) | ( (lv_taskRule_4_0= ruleImpTaskRule ) ) )* )
            // InternalOil.g:439:3: () ( ( (lv_osRule_1_0= ruleImpOsRule ) ) | ( (lv_counterRule_2_0= ruleImpCounterRule ) ) | ( (lv_isrRule_3_0= ruleIsrRule ) ) | ( (lv_taskRule_4_0= ruleImpTaskRule ) ) )*
            {
            // InternalOil.g:439:3: ()
            // InternalOil.g:440:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementationSpecAccess().getImplementationSpecAction_0(),
            					current);
            			

            }

            // InternalOil.g:446:3: ( ( (lv_osRule_1_0= ruleImpOsRule ) ) | ( (lv_counterRule_2_0= ruleImpCounterRule ) ) | ( (lv_isrRule_3_0= ruleIsrRule ) ) | ( (lv_taskRule_4_0= ruleImpTaskRule ) ) )*
            loop7:
            do {
                int alt7=5;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    alt7=1;
                    }
                    break;
                case 29:
                    {
                    alt7=2;
                    }
                    break;
                case 38:
                    {
                    alt7=3;
                    }
                    break;
                case 24:
                    {
                    alt7=4;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalOil.g:447:4: ( (lv_osRule_1_0= ruleImpOsRule ) )
            	    {
            	    // InternalOil.g:447:4: ( (lv_osRule_1_0= ruleImpOsRule ) )
            	    // InternalOil.g:448:5: (lv_osRule_1_0= ruleImpOsRule )
            	    {
            	    // InternalOil.g:448:5: (lv_osRule_1_0= ruleImpOsRule )
            	    // InternalOil.g:449:6: lv_osRule_1_0= ruleImpOsRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getOsRuleImpOsRuleParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_osRule_1_0=ruleImpOsRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"osRule",
            	    							lv_osRule_1_0,
            	    							"org.xtext.example.oil.Oil.ImpOsRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOil.g:467:4: ( (lv_counterRule_2_0= ruleImpCounterRule ) )
            	    {
            	    // InternalOil.g:467:4: ( (lv_counterRule_2_0= ruleImpCounterRule ) )
            	    // InternalOil.g:468:5: (lv_counterRule_2_0= ruleImpCounterRule )
            	    {
            	    // InternalOil.g:468:5: (lv_counterRule_2_0= ruleImpCounterRule )
            	    // InternalOil.g:469:6: lv_counterRule_2_0= ruleImpCounterRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getCounterRuleImpCounterRuleParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_counterRule_2_0=ruleImpCounterRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"counterRule",
            	    							lv_counterRule_2_0,
            	    							"org.xtext.example.oil.Oil.ImpCounterRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOil.g:487:4: ( (lv_isrRule_3_0= ruleIsrRule ) )
            	    {
            	    // InternalOil.g:487:4: ( (lv_isrRule_3_0= ruleIsrRule ) )
            	    // InternalOil.g:488:5: (lv_isrRule_3_0= ruleIsrRule )
            	    {
            	    // InternalOil.g:488:5: (lv_isrRule_3_0= ruleIsrRule )
            	    // InternalOil.g:489:6: lv_isrRule_3_0= ruleIsrRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getIsrRuleIsrRuleParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_isrRule_3_0=ruleIsrRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"isrRule",
            	    							lv_isrRule_3_0,
            	    							"org.xtext.example.oil.Oil.IsrRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOil.g:507:4: ( (lv_taskRule_4_0= ruleImpTaskRule ) )
            	    {
            	    // InternalOil.g:507:4: ( (lv_taskRule_4_0= ruleImpTaskRule ) )
            	    // InternalOil.g:508:5: (lv_taskRule_4_0= ruleImpTaskRule )
            	    {
            	    // InternalOil.g:508:5: (lv_taskRule_4_0= ruleImpTaskRule )
            	    // InternalOil.g:509:6: lv_taskRule_4_0= ruleImpTaskRule
            	    {

            	    						newCompositeNode(grammarAccess.getImplementationSpecAccess().getTaskRuleImpTaskRuleParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_taskRule_4_0=ruleImpTaskRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImplementationSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"taskRule",
            	    							lv_taskRule_4_0,
            	    							"org.xtext.example.oil.Oil.ImpTaskRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
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


    // $ANTLR start "entryRuleImpTaskRule"
    // InternalOil.g:531:1: entryRuleImpTaskRule returns [EObject current=null] : iv_ruleImpTaskRule= ruleImpTaskRule EOF ;
    public final EObject entryRuleImpTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpTaskRule = null;


        try {
            // InternalOil.g:531:52: (iv_ruleImpTaskRule= ruleImpTaskRule EOF )
            // InternalOil.g:532:2: iv_ruleImpTaskRule= ruleImpTaskRule EOF
            {
             newCompositeNode(grammarAccess.getImpTaskRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpTaskRule=ruleImpTaskRule();

            state._fsp--;

             current =iv_ruleImpTaskRule; 
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
    // $ANTLR end "entryRuleImpTaskRule"


    // $ANTLR start "ruleImpTaskRule"
    // InternalOil.g:538:1: ruleImpTaskRule returns [EObject current=null] : ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpTaskParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleImpTaskRule() throws RecognitionException {
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
            // InternalOil.g:544:2: ( ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpTaskParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:545:2: ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpTaskParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:545:2: ( () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpTaskParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            // InternalOil.g:546:3: () otherlv_1= 'TASK' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpTaskParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';'
            {
            // InternalOil.g:546:3: ()
            // InternalOil.g:547:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImpTaskRuleAccess().getTaskRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImpTaskRuleAccess().getTASKKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getImpTaskRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:561:3: ( (lv_implementations_3_0= ruleImpTaskParam ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==58||(LA8_0>=96 && LA8_0<=97)||(LA8_0>=110 && LA8_0<=113)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOil.g:562:4: (lv_implementations_3_0= ruleImpTaskParam )
            	    {
            	    // InternalOil.g:562:4: (lv_implementations_3_0= ruleImpTaskParam )
            	    // InternalOil.g:563:5: lv_implementations_3_0= ruleImpTaskParam
            	    {

            	    					newCompositeNode(grammarAccess.getImpTaskRuleAccess().getImplementationsImpTaskParamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_implementations_3_0=ruleImpTaskParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImpTaskRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_3_0,
            	    						"org.xtext.example.oil.Oil.ImpTaskParam");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getImpTaskRuleAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:584:3: (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOil.g:585:4: otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getImpTaskRuleAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:589:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:590:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:590:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:591:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImpTaskRuleAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpTaskRuleRule());
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

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImpTaskRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleImpTaskRule"


    // $ANTLR start "entryRuleImpTaskParam"
    // InternalOil.g:617:1: entryRuleImpTaskParam returns [EObject current=null] : iv_ruleImpTaskParam= ruleImpTaskParam EOF ;
    public final EObject entryRuleImpTaskParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpTaskParam = null;


        try {
            // InternalOil.g:617:53: (iv_ruleImpTaskParam= ruleImpTaskParam EOF )
            // InternalOil.g:618:2: iv_ruleImpTaskParam= ruleImpTaskParam EOF
            {
             newCompositeNode(grammarAccess.getImpTaskParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpTaskParam=ruleImpTaskParam();

            state._fsp--;

             current =iv_ruleImpTaskParam; 
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
    // $ANTLR end "entryRuleImpTaskParam"


    // $ANTLR start "ruleImpTaskParam"
    // InternalOil.g:624:1: ruleImpTaskParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_param_3_0= ruleImpTaskParamEnum ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleImpTaskParam() throws RecognitionException {
        EObject current = null;

        Token lv_auto_1_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_range_2_0 = null;

        Enumerator lv_param_3_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:630:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_param_3_0= ruleImpTaskParamEnum ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:631:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_param_3_0= ruleImpTaskParamEnum ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:631:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_param_3_0= ruleImpTaskParamEnum ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:632:3: ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_param_3_0= ruleImpTaskParamEnum ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            // InternalOil.g:632:3: ( (lv_type_0_0= ruleIntTypeEnum ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=110 && LA10_0<=113)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOil.g:633:4: (lv_type_0_0= ruleIntTypeEnum )
                    {
                    // InternalOil.g:633:4: (lv_type_0_0= ruleIntTypeEnum )
                    // InternalOil.g:634:5: lv_type_0_0= ruleIntTypeEnum
                    {

                    					newCompositeNode(grammarAccess.getImpTaskParamAccess().getTypeIntTypeEnumEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_type_0_0=ruleIntTypeEnum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImpTaskParamRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.xtext.example.oil.Oil.IntTypeEnum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:651:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOil.g:652:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:652:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:653:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_18); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImpTaskParamAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImpTaskParamRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:665:3: ( (lv_range_2_0= ruleRange ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==58) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOil.g:666:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:666:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:667:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImpTaskParamAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_range_2_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImpTaskParamRule());
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

            // InternalOil.g:684:3: ( (lv_param_3_0= ruleImpTaskParamEnum ) )
            // InternalOil.g:685:4: (lv_param_3_0= ruleImpTaskParamEnum )
            {
            // InternalOil.g:685:4: (lv_param_3_0= ruleImpTaskParamEnum )
            // InternalOil.g:686:5: lv_param_3_0= ruleImpTaskParamEnum
            {

            					newCompositeNode(grammarAccess.getImpTaskParamAccess().getParamImpTaskParamEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_param_3_0=ruleImpTaskParamEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImpTaskParamRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_3_0,
            						"org.xtext.example.oil.Oil.ImpTaskParamEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:703:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==58) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalOil.g:704:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:704:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:705:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImpTaskParamAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_multiple_4_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImpTaskParamRule());
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

            // InternalOil.g:722:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalOil.g:723:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getImpTaskParamAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:727:4: ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_T_NUMBER) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==95||LA14_0==114) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalOil.g:728:5: ( (lv_value_6_0= ruleNumber ) )
                            {
                            // InternalOil.g:728:5: ( (lv_value_6_0= ruleNumber ) )
                            // InternalOil.g:729:6: (lv_value_6_0= ruleNumber )
                            {
                            // InternalOil.g:729:6: (lv_value_6_0= ruleNumber )
                            // InternalOil.g:730:7: lv_value_6_0= ruleNumber
                            {

                            							newCompositeNode(grammarAccess.getImpTaskParamAccess().getValueNumberParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_value_6_0=ruleNumber();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImpTaskParamRule());
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
                            // InternalOil.g:748:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:748:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:749:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:749:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:750:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImpTaskParamAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_default_7_0=ruleDefaultEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImpTaskParamRule());
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

            // InternalOil.g:769:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalOil.g:770:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getImpTaskParamAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:774:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:775:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:775:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:776:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImpTaskParamAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpTaskParamRule());
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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getImpTaskParamAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleImpTaskParam"


    // $ANTLR start "entryRuleImpOsRule"
    // InternalOil.g:802:1: entryRuleImpOsRule returns [EObject current=null] : iv_ruleImpOsRule= ruleImpOsRule EOF ;
    public final EObject entryRuleImpOsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpOsRule = null;


        try {
            // InternalOil.g:802:50: (iv_ruleImpOsRule= ruleImpOsRule EOF )
            // InternalOil.g:803:2: iv_ruleImpOsRule= ruleImpOsRule EOF
            {
             newCompositeNode(grammarAccess.getImpOsRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpOsRule=ruleImpOsRule();

            state._fsp--;

             current =iv_ruleImpOsRule; 
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
    // $ANTLR end "entryRuleImpOsRule"


    // $ANTLR start "ruleImpOsRule"
    // InternalOil.g:809:1: ruleImpOsRule returns [EObject current=null] : ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpOsParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleImpOsRule() throws RecognitionException {
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
            // InternalOil.g:815:2: ( ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpOsParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:816:2: ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpOsParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:816:2: ( () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpOsParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            // InternalOil.g:817:3: () otherlv_1= 'OS' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpOsParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';'
            {
            // InternalOil.g:817:3: ()
            // InternalOil.g:818:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImpOsRuleAccess().getOsRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImpOsRuleAccess().getOSKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getImpOsRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:832:3: ( (lv_implementations_3_0= ruleImpOsParam ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOil.g:833:4: (lv_implementations_3_0= ruleImpOsParam )
            	    {
            	    // InternalOil.g:833:4: (lv_implementations_3_0= ruleImpOsParam )
            	    // InternalOil.g:834:5: lv_implementations_3_0= ruleImpOsParam
            	    {

            	    					newCompositeNode(grammarAccess.getImpOsRuleAccess().getImplementationsImpOsParamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_implementations_3_0=ruleImpOsParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImpOsRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_3_0,
            	    						"org.xtext.example.oil.Oil.ImpOsParam");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getImpOsRuleAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:855:3: (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalOil.g:856:4: otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getImpOsRuleAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:860:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:861:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:861:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:862:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImpOsRuleAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpOsRuleRule());
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

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImpOsRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleImpOsRule"


    // $ANTLR start "entryRuleImpOsParam"
    // InternalOil.g:888:1: entryRuleImpOsParam returns [EObject current=null] : iv_ruleImpOsParam= ruleImpOsParam EOF ;
    public final EObject entryRuleImpOsParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpOsParam = null;


        try {
            // InternalOil.g:888:51: (iv_ruleImpOsParam= ruleImpOsParam EOF )
            // InternalOil.g:889:2: iv_ruleImpOsParam= ruleImpOsParam EOF
            {
             newCompositeNode(grammarAccess.getImpOsParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpOsParam=ruleImpOsParam();

            state._fsp--;

             current =iv_ruleImpOsParam; 
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
    // $ANTLR end "entryRuleImpOsParam"


    // $ANTLR start "ruleImpOsParam"
    // InternalOil.g:895:1: ruleImpOsParam returns [EObject current=null] : (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? otherlv_3= 'STATUS' ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
    public final EObject ruleImpOsParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_auto_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_enumeration_2_0 = null;

        AntlrDatatypeRuleToken lv_multiple_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        Enumerator lv_default_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:901:2: ( (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? otherlv_3= 'STATUS' ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:902:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? otherlv_3= 'STATUS' ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:902:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? otherlv_3= 'STATUS' ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:903:3: otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? otherlv_3= 'STATUS' ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getImpOsParamAccess().getENUMKeyword_0());
            		
            // InternalOil.g:907:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOil.g:908:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:908:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:909:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_24); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImpOsParamAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImpOsParamRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:921:3: ( (lv_enumeration_2_0= ruleEnumeration ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalOil.g:922:4: (lv_enumeration_2_0= ruleEnumeration )
                    {
                    // InternalOil.g:922:4: (lv_enumeration_2_0= ruleEnumeration )
                    // InternalOil.g:923:5: lv_enumeration_2_0= ruleEnumeration
                    {

                    					newCompositeNode(grammarAccess.getImpOsParamAccess().getEnumerationEnumerationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_25);
                    lv_enumeration_2_0=ruleEnumeration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImpOsParamRule());
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

            otherlv_3=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getImpOsParamAccess().getSTATUSKeyword_3());
            		
            // InternalOil.g:944:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalOil.g:945:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:945:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:946:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImpOsParamAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_multiple_4_0=ruleMultipleSpecifier();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImpOsParamRule());
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

            // InternalOil.g:963:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==18) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalOil.g:964:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getImpOsParamAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:968:4: ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==95||LA22_0==114) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalOil.g:969:5: ( (lv_value_6_0= ruleName ) )
                            {
                            // InternalOil.g:969:5: ( (lv_value_6_0= ruleName ) )
                            // InternalOil.g:970:6: (lv_value_6_0= ruleName )
                            {
                            // InternalOil.g:970:6: (lv_value_6_0= ruleName )
                            // InternalOil.g:971:7: lv_value_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getImpOsParamAccess().getValueNameParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_value_6_0=ruleName();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImpOsParamRule());
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
                            // InternalOil.g:989:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:989:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:990:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:990:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:991:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImpOsParamAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_default_7_0=ruleDefaultEnum();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getImpOsParamRule());
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

            // InternalOil.g:1010:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalOil.g:1011:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getImpOsParamAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:1015:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:1016:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:1016:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:1017:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImpOsParamAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpOsParamRule());
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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getImpOsParamAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleImpOsParam"


    // $ANTLR start "entryRuleImpCounterRule"
    // InternalOil.g:1043:1: entryRuleImpCounterRule returns [EObject current=null] : iv_ruleImpCounterRule= ruleImpCounterRule EOF ;
    public final EObject entryRuleImpCounterRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpCounterRule = null;


        try {
            // InternalOil.g:1043:55: (iv_ruleImpCounterRule= ruleImpCounterRule EOF )
            // InternalOil.g:1044:2: iv_ruleImpCounterRule= ruleImpCounterRule EOF
            {
             newCompositeNode(grammarAccess.getImpCounterRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpCounterRule=ruleImpCounterRule();

            state._fsp--;

             current =iv_ruleImpCounterRule; 
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
    // $ANTLR end "entryRuleImpCounterRule"


    // $ANTLR start "ruleImpCounterRule"
    // InternalOil.g:1050:1: ruleImpCounterRule returns [EObject current=null] : ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpCounterParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleImpCounterRule() throws RecognitionException {
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
            // InternalOil.g:1056:2: ( ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpCounterParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' ) )
            // InternalOil.g:1057:2: ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpCounterParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            {
            // InternalOil.g:1057:2: ( () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpCounterParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';' )
            // InternalOil.g:1058:3: () otherlv_1= 'COUNTER' otherlv_2= '{' ( (lv_implementations_3_0= ruleImpCounterParam ) )* otherlv_4= '}' (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )? otherlv_7= ';'
            {
            // InternalOil.g:1058:3: ()
            // InternalOil.g:1059:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImpCounterRuleAccess().getCounterRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getImpCounterRuleAccess().getCOUNTERKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getImpCounterRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:1073:3: ( (lv_implementations_3_0= ruleImpCounterParam ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==25||LA25_0==30||LA25_0==58||(LA25_0>=98 && LA25_0<=99)||(LA25_0>=110 && LA25_0<=113)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOil.g:1074:4: (lv_implementations_3_0= ruleImpCounterParam )
            	    {
            	    // InternalOil.g:1074:4: (lv_implementations_3_0= ruleImpCounterParam )
            	    // InternalOil.g:1075:5: lv_implementations_3_0= ruleImpCounterParam
            	    {

            	    					newCompositeNode(grammarAccess.getImpCounterRuleAccess().getImplementationsImpCounterParamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_27);
            	    lv_implementations_3_0=ruleImpCounterParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImpCounterRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"implementations",
            	    						lv_implementations_3_0,
            	    						"org.xtext.example.oil.Oil.ImpCounterParam");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getImpCounterRuleAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:1096:3: (otherlv_5= ':' ( (lv_description_6_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOil.g:1097:4: otherlv_5= ':' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getImpCounterRuleAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:1101:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:1102:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:1102:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:1103:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImpCounterRuleAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpCounterRuleRule());
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

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImpCounterRuleAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleImpCounterRule"


    // $ANTLR start "entryRuleImpCounterParam"
    // InternalOil.g:1129:1: entryRuleImpCounterParam returns [EObject current=null] : iv_ruleImpCounterParam= ruleImpCounterParam EOF ;
    public final EObject entryRuleImpCounterParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpCounterParam = null;


        try {
            // InternalOil.g:1129:56: (iv_ruleImpCounterParam= ruleImpCounterParam EOF )
            // InternalOil.g:1130:2: iv_ruleImpCounterParam= ruleImpCounterParam EOF
            {
             newCompositeNode(grammarAccess.getImpCounterParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImpCounterParam=ruleImpCounterParam();

            state._fsp--;

             current =iv_ruleImpCounterParam; 
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
    // $ANTLR end "entryRuleImpCounterParam"


    // $ANTLR start "ruleImpCounterParam"
    // InternalOil.g:1136:1: ruleImpCounterParam returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) | otherlv_1= 'IDENTIFIER' )? ( (lv_auto_2_0= 'WITH_AUTO' ) )? ( (lv_range_3_0= ruleRange ) )? ( (lv_param_4_0= ruleImpCounterParamEnum ) ) otherlv_5= '=' ( (lv_value_6_0= ruleAttributeValue ) ) otherlv_7= ';' ) ;
    public final EObject ruleImpCounterParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_auto_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_range_3_0 = null;

        Enumerator lv_param_4_0 = null;

        EObject lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1142:2: ( ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) | otherlv_1= 'IDENTIFIER' )? ( (lv_auto_2_0= 'WITH_AUTO' ) )? ( (lv_range_3_0= ruleRange ) )? ( (lv_param_4_0= ruleImpCounterParamEnum ) ) otherlv_5= '=' ( (lv_value_6_0= ruleAttributeValue ) ) otherlv_7= ';' ) )
            // InternalOil.g:1143:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) | otherlv_1= 'IDENTIFIER' )? ( (lv_auto_2_0= 'WITH_AUTO' ) )? ( (lv_range_3_0= ruleRange ) )? ( (lv_param_4_0= ruleImpCounterParamEnum ) ) otherlv_5= '=' ( (lv_value_6_0= ruleAttributeValue ) ) otherlv_7= ';' )
            {
            // InternalOil.g:1143:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) | otherlv_1= 'IDENTIFIER' )? ( (lv_auto_2_0= 'WITH_AUTO' ) )? ( (lv_range_3_0= ruleRange ) )? ( (lv_param_4_0= ruleImpCounterParamEnum ) ) otherlv_5= '=' ( (lv_value_6_0= ruleAttributeValue ) ) otherlv_7= ';' )
            // InternalOil.g:1144:3: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) | otherlv_1= 'IDENTIFIER' )? ( (lv_auto_2_0= 'WITH_AUTO' ) )? ( (lv_range_3_0= ruleRange ) )? ( (lv_param_4_0= ruleImpCounterParamEnum ) ) otherlv_5= '=' ( (lv_value_6_0= ruleAttributeValue ) ) otherlv_7= ';'
            {
            // InternalOil.g:1144:3: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) | otherlv_1= 'IDENTIFIER' )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=110 && LA27_0<=113)) ) {
                alt27=1;
            }
            else if ( (LA27_0==30) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // InternalOil.g:1145:4: ( (lv_type_0_0= ruleIntTypeEnum ) )
                    {
                    // InternalOil.g:1145:4: ( (lv_type_0_0= ruleIntTypeEnum ) )
                    // InternalOil.g:1146:5: (lv_type_0_0= ruleIntTypeEnum )
                    {
                    // InternalOil.g:1146:5: (lv_type_0_0= ruleIntTypeEnum )
                    // InternalOil.g:1147:6: lv_type_0_0= ruleIntTypeEnum
                    {

                    						newCompositeNode(grammarAccess.getImpCounterParamAccess().getTypeIntTypeEnumEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_type_0_0=ruleIntTypeEnum();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImpCounterParamRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"org.xtext.example.oil.Oil.IntTypeEnum");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:1165:4: otherlv_1= 'IDENTIFIER'
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getImpCounterParamAccess().getIDENTIFIERKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:1170:3: ( (lv_auto_2_0= 'WITH_AUTO' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOil.g:1171:4: (lv_auto_2_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:1171:4: (lv_auto_2_0= 'WITH_AUTO' )
                    // InternalOil.g:1172:5: lv_auto_2_0= 'WITH_AUTO'
                    {
                    lv_auto_2_0=(Token)match(input,25,FOLLOW_28); 

                    					newLeafNode(lv_auto_2_0, grammarAccess.getImpCounterParamAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImpCounterParamRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1184:3: ( (lv_range_3_0= ruleRange ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOil.g:1185:4: (lv_range_3_0= ruleRange )
                    {
                    // InternalOil.g:1185:4: (lv_range_3_0= ruleRange )
                    // InternalOil.g:1186:5: lv_range_3_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImpCounterParamAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_range_3_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImpCounterParamRule());
                    					}
                    					set(
                    						current,
                    						"range",
                    						lv_range_3_0,
                    						"org.xtext.example.oil.Oil.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:1203:3: ( (lv_param_4_0= ruleImpCounterParamEnum ) )
            // InternalOil.g:1204:4: (lv_param_4_0= ruleImpCounterParamEnum )
            {
            // InternalOil.g:1204:4: (lv_param_4_0= ruleImpCounterParamEnum )
            // InternalOil.g:1205:5: lv_param_4_0= ruleImpCounterParamEnum
            {

            					newCompositeNode(grammarAccess.getImpCounterParamAccess().getParamImpCounterParamEnumEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_param_4_0=ruleImpCounterParamEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImpCounterParamRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_4_0,
            						"org.xtext.example.oil.Oil.ImpCounterParamEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getImpCounterParamAccess().getEqualsSignKeyword_4());
            		
            // InternalOil.g:1226:3: ( (lv_value_6_0= ruleAttributeValue ) )
            // InternalOil.g:1227:4: (lv_value_6_0= ruleAttributeValue )
            {
            // InternalOil.g:1227:4: (lv_value_6_0= ruleAttributeValue )
            // InternalOil.g:1228:5: lv_value_6_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getImpCounterParamAccess().getValueAttributeValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_6_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImpCounterParamRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImpCounterParamAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleImpCounterParam"


    // $ANTLR start "entryRuleApplicationRule"
    // InternalOil.g:1253:1: entryRuleApplicationRule returns [EObject current=null] : iv_ruleApplicationRule= ruleApplicationRule EOF ;
    public final EObject entryRuleApplicationRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationRule = null;


        try {
            // InternalOil.g:1253:56: (iv_ruleApplicationRule= ruleApplicationRule EOF )
            // InternalOil.g:1254:2: iv_ruleApplicationRule= ruleApplicationRule EOF
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
    // InternalOil.g:1260:1: ruleApplicationRule returns [EObject current=null] : ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' ) ;
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
            // InternalOil.g:1266:2: ( ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' ) )
            // InternalOil.g:1267:2: ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' )
            {
            // InternalOil.g:1267:2: ( () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';' )
            // InternalOil.g:1268:3: () otherlv_1= 'APPLICATION' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )* otherlv_5= '}' otherlv_6= ';'
            {
            // InternalOil.g:1268:3: ()
            // InternalOil.g:1269:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getApplicationRuleAccess().getApplicationRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationRuleAccess().getAPPLICATIONKeyword_1());
            		
            // InternalOil.g:1279:3: ( (lv_name_2_0= ruleName ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalOil.g:1280:4: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:1280:4: (lv_name_2_0= ruleName )
                    // InternalOil.g:1281:5: lv_name_2_0= ruleName
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

            otherlv_3=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationRuleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOil.g:1302:3: ( ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24||LA32_0==29||LA32_0==32||LA32_0==36||LA32_0==38||(LA32_0>=41 && LA32_0<=42)||LA32_0==44||(LA32_0>=52 && LA32_0<=53)||(LA32_0>=100 && LA32_0<=103)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOil.g:1303:4: ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) )
            	    {
            	    // InternalOil.g:1303:4: ( (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam ) )
            	    // InternalOil.g:1304:5: (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam )
            	    {
            	    // InternalOil.g:1304:5: (lv_appSubOrParam_4_1= ruleAppSubContainer | lv_appSubOrParam_4_2= ruleApplicationParam )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==32||LA31_0==36) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==24||LA31_0==29||LA31_0==38||(LA31_0>=41 && LA31_0<=42)||LA31_0==44||(LA31_0>=52 && LA31_0<=53)||(LA31_0>=100 && LA31_0<=103)) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalOil.g:1305:6: lv_appSubOrParam_4_1= ruleAppSubContainer
            	            {

            	            						newCompositeNode(grammarAccess.getApplicationRuleAccess().getAppSubOrParamAppSubContainerParserRuleCall_4_0_0());
            	            					
            	            pushFollow(FOLLOW_31);
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
            	            // InternalOil.g:1321:6: lv_appSubOrParam_4_2= ruleApplicationParam
            	            {

            	            						newCompositeNode(grammarAccess.getApplicationRuleAccess().getAppSubOrParamApplicationParamParserRuleCall_4_0_1());
            	            					
            	            pushFollow(FOLLOW_31);
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
            	    break loop32;
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
    // InternalOil.g:1351:1: entryRuleAppSubContainer returns [EObject current=null] : iv_ruleAppSubContainer= ruleAppSubContainer EOF ;
    public final EObject entryRuleAppSubContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppSubContainer = null;


        try {
            // InternalOil.g:1351:56: (iv_ruleAppSubContainer= ruleAppSubContainer EOF )
            // InternalOil.g:1352:2: iv_ruleAppSubContainer= ruleAppSubContainer EOF
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
    // InternalOil.g:1358:1: ruleAppSubContainer returns [EObject current=null] : ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) ) ;
    public final EObject ruleAppSubContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_hasRestartTaskRule_0_0 = null;

        EObject lv_trustedRule_1_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1364:2: ( ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) ) )
            // InternalOil.g:1365:2: ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) )
            {
            // InternalOil.g:1365:2: ( ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) ) | ( (lv_trustedRule_1_0= ruleTrustedRule ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==32) ) {
                alt33=1;
            }
            else if ( (LA33_0==36) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalOil.g:1366:3: ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) )
                    {
                    // InternalOil.g:1366:3: ( (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule ) )
                    // InternalOil.g:1367:4: (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule )
                    {
                    // InternalOil.g:1367:4: (lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule )
                    // InternalOil.g:1368:5: lv_hasRestartTaskRule_0_0= ruleHasRestartTaskRule
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
                    // InternalOil.g:1386:3: ( (lv_trustedRule_1_0= ruleTrustedRule ) )
                    {
                    // InternalOil.g:1386:3: ( (lv_trustedRule_1_0= ruleTrustedRule ) )
                    // InternalOil.g:1387:4: (lv_trustedRule_1_0= ruleTrustedRule )
                    {
                    // InternalOil.g:1387:4: (lv_trustedRule_1_0= ruleTrustedRule )
                    // InternalOil.g:1388:5: lv_trustedRule_1_0= ruleTrustedRule
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


    // $ANTLR start "entryRuleApplicationParam"
    // InternalOil.g:1409:1: entryRuleApplicationParam returns [EObject current=null] : iv_ruleApplicationParam= ruleApplicationParam EOF ;
    public final EObject entryRuleApplicationParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationParam = null;


        try {
            // InternalOil.g:1409:57: (iv_ruleApplicationParam= ruleApplicationParam EOF )
            // InternalOil.g:1410:2: iv_ruleApplicationParam= ruleApplicationParam EOF
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
    // InternalOil.g:1416:1: ruleApplicationParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleApplicationParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1422:2: ( ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) )
            // InternalOil.g:1423:2: ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            {
            // InternalOil.g:1423:2: ( ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            // InternalOil.g:1424:3: ( (lv_type_0_0= ruleApplicationParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';'
            {
            // InternalOil.g:1424:3: ( (lv_type_0_0= ruleApplicationParamEnum ) )
            // InternalOil.g:1425:4: (lv_type_0_0= ruleApplicationParamEnum )
            {
            // InternalOil.g:1425:4: (lv_type_0_0= ruleApplicationParamEnum )
            // InternalOil.g:1426:5: lv_type_0_0= ruleApplicationParamEnum
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

            otherlv_1=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationParamAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:1447:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:1448:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:1448:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:1449:5: lv_value_2_0= ruleAttributeValue
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


    // $ANTLR start "entryRuleHasRestartTaskRule"
    // InternalOil.g:1474:1: entryRuleHasRestartTaskRule returns [EObject current=null] : iv_ruleHasRestartTaskRule= ruleHasRestartTaskRule EOF ;
    public final EObject entryRuleHasRestartTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasRestartTaskRule = null;


        try {
            // InternalOil.g:1474:59: (iv_ruleHasRestartTaskRule= ruleHasRestartTaskRule EOF )
            // InternalOil.g:1475:2: iv_ruleHasRestartTaskRule= ruleHasRestartTaskRule EOF
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
    // InternalOil.g:1481:1: ruleHasRestartTaskRule returns [EObject current=null] : (otherlv_0= 'HAS_RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleRestartTaskRule ) )* otherlv_6= '}' )? otherlv_7= ';' ) ;
    public final EObject ruleHasRestartTaskRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterList_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1487:2: ( (otherlv_0= 'HAS_RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleRestartTaskRule ) )* otherlv_6= '}' )? otherlv_7= ';' ) )
            // InternalOil.g:1488:2: (otherlv_0= 'HAS_RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleRestartTaskRule ) )* otherlv_6= '}' )? otherlv_7= ';' )
            {
            // InternalOil.g:1488:2: (otherlv_0= 'HAS_RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleRestartTaskRule ) )* otherlv_6= '}' )? otherlv_7= ';' )
            // InternalOil.g:1489:3: otherlv_0= 'HAS_RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleRestartTaskRule ) )* otherlv_6= '}' )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getHasRestartTaskRuleAccess().getHAS_RESTARTTASKKeyword_0());
            		
            // InternalOil.g:1493:3: ( (lv_name_1_0= ruleName ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOil.g:1494:4: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:1494:4: (lv_name_1_0= ruleName )
                    // InternalOil.g:1495:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getHasRestartTaskRuleAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHasRestartTaskRuleRule());
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

            otherlv_2=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getHasRestartTaskRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalOil.g:1516:3: ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) )
            // InternalOil.g:1517:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            {
            // InternalOil.g:1517:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            // InternalOil.g:1518:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            {
            // InternalOil.g:1518:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            else if ( (LA35_0==34) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalOil.g:1519:6: lv_value_3_1= 'TRUE'
                    {
                    lv_value_3_1=(Token)match(input,33,FOLLOW_34); 

                    						newLeafNode(lv_value_3_1, grammarAccess.getHasRestartTaskRuleAccess().getValueTRUEKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHasRestartTaskRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalOil.g:1530:6: lv_value_3_2= 'FALSE'
                    {
                    lv_value_3_2=(Token)match(input,34,FOLLOW_34); 

                    						newLeafNode(lv_value_3_2, grammarAccess.getHasRestartTaskRuleAccess().getValueFALSEKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHasRestartTaskRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalOil.g:1543:3: (otherlv_4= '{' ( (lv_parameterList_5_0= ruleRestartTaskRule ) )* otherlv_6= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalOil.g:1544:4: otherlv_4= '{' ( (lv_parameterList_5_0= ruleRestartTaskRule ) )* otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getHasRestartTaskRuleAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalOil.g:1548:4: ( (lv_parameterList_5_0= ruleRestartTaskRule ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==35) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalOil.g:1549:5: (lv_parameterList_5_0= ruleRestartTaskRule )
                    	    {
                    	    // InternalOil.g:1549:5: (lv_parameterList_5_0= ruleRestartTaskRule )
                    	    // InternalOil.g:1550:6: lv_parameterList_5_0= ruleRestartTaskRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getHasRestartTaskRuleAccess().getParameterListRestartTaskRuleParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
                    	    lv_parameterList_5_0=ruleRestartTaskRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getHasRestartTaskRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameterList",
                    	    							lv_parameterList_5_0,
                    	    							"org.xtext.example.oil.Oil.RestartTaskRule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getHasRestartTaskRuleAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getHasRestartTaskRuleAccess().getSemicolonKeyword_5());
            		

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
    // InternalOil.g:1580:1: entryRuleRestartTaskRule returns [EObject current=null] : iv_ruleRestartTaskRule= ruleRestartTaskRule EOF ;
    public final EObject entryRuleRestartTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartTaskRule = null;


        try {
            // InternalOil.g:1580:56: (iv_ruleRestartTaskRule= ruleRestartTaskRule EOF )
            // InternalOil.g:1581:2: iv_ruleRestartTaskRule= ruleRestartTaskRule EOF
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
    // InternalOil.g:1587:1: ruleRestartTaskRule returns [EObject current=null] : (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleRestartTaskRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1593:2: ( (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' ) )
            // InternalOil.g:1594:2: (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' )
            {
            // InternalOil.g:1594:2: (otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' )
            // InternalOil.g:1595:3: otherlv_0= 'RESTARTTASK' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getRestartTaskRuleAccess().getRESTARTTASKKeyword_0());
            		
            // InternalOil.g:1599:3: ( (lv_name_1_0= ruleName ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalOil.g:1600:4: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:1600:4: (lv_name_1_0= ruleName )
                    // InternalOil.g:1601:5: lv_name_1_0= ruleName
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

            otherlv_2=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getRestartTaskRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalOil.g:1622:3: ( (lv_value_3_0= ruleAttributeValue ) )
            // InternalOil.g:1623:4: (lv_value_3_0= ruleAttributeValue )
            {
            // InternalOil.g:1623:4: (lv_value_3_0= ruleAttributeValue )
            // InternalOil.g:1624:5: lv_value_3_0= ruleAttributeValue
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
    // InternalOil.g:1649:1: entryRuleTrustedRule returns [EObject current=null] : iv_ruleTrustedRule= ruleTrustedRule EOF ;
    public final EObject entryRuleTrustedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrustedRule = null;


        try {
            // InternalOil.g:1649:52: (iv_ruleTrustedRule= ruleTrustedRule EOF )
            // InternalOil.g:1650:2: iv_ruleTrustedRule= ruleTrustedRule EOF
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
    // InternalOil.g:1656:1: ruleTrustedRule returns [EObject current=null] : (otherlv_0= 'TRUSTED' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleTrustedFucRule ) ) otherlv_6= '}' )? otherlv_7= ';' ) ;
    public final EObject ruleTrustedRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameterList_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1662:2: ( (otherlv_0= 'TRUSTED' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleTrustedFucRule ) ) otherlv_6= '}' )? otherlv_7= ';' ) )
            // InternalOil.g:1663:2: (otherlv_0= 'TRUSTED' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleTrustedFucRule ) ) otherlv_6= '}' )? otherlv_7= ';' )
            {
            // InternalOil.g:1663:2: (otherlv_0= 'TRUSTED' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleTrustedFucRule ) ) otherlv_6= '}' )? otherlv_7= ';' )
            // InternalOil.g:1664:3: otherlv_0= 'TRUSTED' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_parameterList_5_0= ruleTrustedFucRule ) ) otherlv_6= '}' )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getTrustedRuleAccess().getTRUSTEDKeyword_0());
            		
            // InternalOil.g:1668:3: ( (lv_name_1_0= ruleName ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalOil.g:1669:4: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:1669:4: (lv_name_1_0= ruleName )
                    // InternalOil.g:1670:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getTrustedRuleAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTrustedRuleRule());
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

            otherlv_2=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTrustedRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalOil.g:1691:3: ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) )
            // InternalOil.g:1692:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            {
            // InternalOil.g:1692:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            // InternalOil.g:1693:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            {
            // InternalOil.g:1693:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            else if ( (LA40_0==34) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalOil.g:1694:6: lv_value_3_1= 'TRUE'
                    {
                    lv_value_3_1=(Token)match(input,33,FOLLOW_34); 

                    						newLeafNode(lv_value_3_1, grammarAccess.getTrustedRuleAccess().getValueTRUEKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTrustedRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalOil.g:1705:6: lv_value_3_2= 'FALSE'
                    {
                    lv_value_3_2=(Token)match(input,34,FOLLOW_34); 

                    						newLeafNode(lv_value_3_2, grammarAccess.getTrustedRuleAccess().getValueFALSEKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTrustedRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalOil.g:1718:3: (otherlv_4= '{' ( (lv_parameterList_5_0= ruleTrustedFucRule ) ) otherlv_6= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==22) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalOil.g:1719:4: otherlv_4= '{' ( (lv_parameterList_5_0= ruleTrustedFucRule ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getTrustedRuleAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalOil.g:1723:4: ( (lv_parameterList_5_0= ruleTrustedFucRule ) )
                    // InternalOil.g:1724:5: (lv_parameterList_5_0= ruleTrustedFucRule )
                    {
                    // InternalOil.g:1724:5: (lv_parameterList_5_0= ruleTrustedFucRule )
                    // InternalOil.g:1725:6: lv_parameterList_5_0= ruleTrustedFucRule
                    {

                    						newCompositeNode(grammarAccess.getTrustedRuleAccess().getParameterListTrustedFucRuleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameterList_5_0=ruleTrustedFucRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTrustedRuleRule());
                    						}
                    						add(
                    							current,
                    							"parameterList",
                    							lv_parameterList_5_0,
                    							"org.xtext.example.oil.Oil.TrustedFucRule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getTrustedRuleAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTrustedRuleAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleTrustedFucRule"
    // InternalOil.g:1755:1: entryRuleTrustedFucRule returns [EObject current=null] : iv_ruleTrustedFucRule= ruleTrustedFucRule EOF ;
    public final EObject entryRuleTrustedFucRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrustedFucRule = null;


        try {
            // InternalOil.g:1755:55: (iv_ruleTrustedFucRule= ruleTrustedFucRule EOF )
            // InternalOil.g:1756:2: iv_ruleTrustedFucRule= ruleTrustedFucRule EOF
            {
             newCompositeNode(grammarAccess.getTrustedFucRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrustedFucRule=ruleTrustedFucRule();

            state._fsp--;

             current =iv_ruleTrustedFucRule; 
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
    // $ANTLR end "entryRuleTrustedFucRule"


    // $ANTLR start "ruleTrustedFucRule"
    // InternalOil.g:1762:1: ruleTrustedFucRule returns [EObject current=null] : (otherlv_0= 'TRUSTED_FUNCTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' ) ;
    public final EObject ruleTrustedFucRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1768:2: ( (otherlv_0= 'TRUSTED_FUNCTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' ) )
            // InternalOil.g:1769:2: (otherlv_0= 'TRUSTED_FUNCTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' )
            {
            // InternalOil.g:1769:2: (otherlv_0= 'TRUSTED_FUNCTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';' )
            // InternalOil.g:1770:3: otherlv_0= 'TRUSTED_FUNCTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( (lv_value_3_0= ruleAttributeValue ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getTrustedFucRuleAccess().getTRUSTED_FUNCTIONKeyword_0());
            		
            // InternalOil.g:1774:3: ( (lv_name_1_0= ruleName ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalOil.g:1775:4: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:1775:4: (lv_name_1_0= ruleName )
                    // InternalOil.g:1776:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getTrustedFucRuleAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTrustedFucRuleRule());
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

            otherlv_2=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getTrustedFucRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalOil.g:1797:3: ( (lv_value_3_0= ruleAttributeValue ) )
            // InternalOil.g:1798:4: (lv_value_3_0= ruleAttributeValue )
            {
            // InternalOil.g:1798:4: (lv_value_3_0= ruleAttributeValue )
            // InternalOil.g:1799:5: lv_value_3_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getTrustedFucRuleAccess().getValueAttributeValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_3_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrustedFucRuleRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getTrustedFucRuleAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleTrustedFucRule"


    // $ANTLR start "entryRuleIsrRule"
    // InternalOil.g:1824:1: entryRuleIsrRule returns [EObject current=null] : iv_ruleIsrRule= ruleIsrRule EOF ;
    public final EObject entryRuleIsrRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsrRule = null;


        try {
            // InternalOil.g:1824:48: (iv_ruleIsrRule= ruleIsrRule EOF )
            // InternalOil.g:1825:2: iv_ruleIsrRule= ruleIsrRule EOF
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
    // InternalOil.g:1831:1: ruleIsrRule returns [EObject current=null] : ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_isrParam_4_0= ruleIsrParam ) ) | ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) ) )* otherlv_6= '}' otherlv_7= ';' (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? ) ;
    public final EObject ruleIsrRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_isrParam_4_0 = null;

        EObject lv_isrSubConainer_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1837:2: ( ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_isrParam_4_0= ruleIsrParam ) ) | ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) ) )* otherlv_6= '}' otherlv_7= ';' (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? ) )
            // InternalOil.g:1838:2: ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_isrParam_4_0= ruleIsrParam ) ) | ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) ) )* otherlv_6= '}' otherlv_7= ';' (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? )
            {
            // InternalOil.g:1838:2: ( () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_isrParam_4_0= ruleIsrParam ) ) | ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) ) )* otherlv_6= '}' otherlv_7= ';' (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? )
            // InternalOil.g:1839:3: () otherlv_1= 'ISR' ( (lv_name_2_0= ruleName ) )? otherlv_3= '{' ( ( (lv_isrParam_4_0= ruleIsrParam ) ) | ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) ) )* otherlv_6= '}' otherlv_7= ';' (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            {
            // InternalOil.g:1839:3: ()
            // InternalOil.g:1840:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsrRuleAccess().getIsrRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getIsrRuleAccess().getISRKeyword_1());
            		
            // InternalOil.g:1850:3: ( (lv_name_2_0= ruleName ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalOil.g:1851:4: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:1851:4: (lv_name_2_0= ruleName )
                    // InternalOil.g:1852:5: lv_name_2_0= ruleName
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

            otherlv_3=(Token)match(input,22,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getIsrRuleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOil.g:1873:3: ( ( (lv_isrParam_4_0= ruleIsrParam ) ) | ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) ) )*
            loop44:
            do {
                int alt44=3;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==42||LA44_0==44||LA44_0==58||(LA44_0>=96 && LA44_0<=98)||(LA44_0>=108 && LA44_0<=113)) ) {
                    alt44=1;
                }
                else if ( (LA44_0==39) ) {
                    alt44=2;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalOil.g:1874:4: ( (lv_isrParam_4_0= ruleIsrParam ) )
            	    {
            	    // InternalOil.g:1874:4: ( (lv_isrParam_4_0= ruleIsrParam ) )
            	    // InternalOil.g:1875:5: (lv_isrParam_4_0= ruleIsrParam )
            	    {
            	    // InternalOil.g:1875:5: (lv_isrParam_4_0= ruleIsrParam )
            	    // InternalOil.g:1876:6: lv_isrParam_4_0= ruleIsrParam
            	    {

            	    						newCompositeNode(grammarAccess.getIsrRuleAccess().getIsrParamIsrParamParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_isrParam_4_0=ruleIsrParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIsrRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"isrParam",
            	    							lv_isrParam_4_0,
            	    							"org.xtext.example.oil.Oil.IsrParam");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOil.g:1894:4: ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) )
            	    {
            	    // InternalOil.g:1894:4: ( (lv_isrSubConainer_5_0= ruleIsrSubContainer ) )
            	    // InternalOil.g:1895:5: (lv_isrSubConainer_5_0= ruleIsrSubContainer )
            	    {
            	    // InternalOil.g:1895:5: (lv_isrSubConainer_5_0= ruleIsrSubContainer )
            	    // InternalOil.g:1896:6: lv_isrSubConainer_5_0= ruleIsrSubContainer
            	    {

            	    						newCompositeNode(grammarAccess.getIsrRuleAccess().getIsrSubConainerIsrSubContainerParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_isrSubConainer_5_0=ruleIsrSubContainer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIsrRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"isrSubConainer",
            	    							lv_isrSubConainer_5_0,
            	    							"org.xtext.example.oil.Oil.IsrSubContainer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_6=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getIsrRuleAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_38); 

            			newLeafNode(otherlv_7, grammarAccess.getIsrRuleAccess().getSemicolonKeyword_6());
            		
            // InternalOil.g:1922:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==19) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalOil.g:1923:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getIsrRuleAccess().getColonKeyword_7_0());
                    			
                    // InternalOil.g:1927:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:1928:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:1928:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:1929:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getIsrRuleAccess().getDescriptionEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsrRuleRule());
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
    // InternalOil.g:1951:1: entryRuleIsrSubContainer returns [EObject current=null] : iv_ruleIsrSubContainer= ruleIsrSubContainer EOF ;
    public final EObject entryRuleIsrSubContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsrSubContainer = null;


        try {
            // InternalOil.g:1951:56: (iv_ruleIsrSubContainer= ruleIsrSubContainer EOF )
            // InternalOil.g:1952:2: iv_ruleIsrSubContainer= ruleIsrSubContainer EOF
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
    // InternalOil.g:1958:1: ruleIsrSubContainer returns [EObject current=null] : ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) ) ;
    public final EObject ruleIsrSubContainer() throws RecognitionException {
        EObject current = null;

        EObject lv_timingProtectionRule_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:1964:2: ( ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) ) )
            // InternalOil.g:1965:2: ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) )
            {
            // InternalOil.g:1965:2: ( (lv_timingProtectionRule_0_0= ruleTimingProtectionRule ) )
            // InternalOil.g:1966:3: (lv_timingProtectionRule_0_0= ruleTimingProtectionRule )
            {
            // InternalOil.g:1966:3: (lv_timingProtectionRule_0_0= ruleTimingProtectionRule )
            // InternalOil.g:1967:4: lv_timingProtectionRule_0_0= ruleTimingProtectionRule
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
    // InternalOil.g:1987:1: entryRuleTimingProtectionRule returns [EObject current=null] : iv_ruleTimingProtectionRule= ruleTimingProtectionRule EOF ;
    public final EObject entryRuleTimingProtectionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimingProtectionRule = null;


        try {
            // InternalOil.g:1987:61: (iv_ruleTimingProtectionRule= ruleTimingProtectionRule EOF )
            // InternalOil.g:1988:2: iv_ruleTimingProtectionRule= ruleTimingProtectionRule EOF
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
    // InternalOil.g:1994:1: ruleTimingProtectionRule returns [EObject current=null] : (otherlv_0= 'TIMING_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) ) otherlv_6= '}' )? (otherlv_7= ';' )? ) ;
    public final EObject ruleTimingProtectionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_timingProtectionParam_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2000:2: ( (otherlv_0= 'TIMING_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) ) otherlv_6= '}' )? (otherlv_7= ';' )? ) )
            // InternalOil.g:2001:2: (otherlv_0= 'TIMING_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) ) otherlv_6= '}' )? (otherlv_7= ';' )? )
            {
            // InternalOil.g:2001:2: (otherlv_0= 'TIMING_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) ) otherlv_6= '}' )? (otherlv_7= ';' )? )
            // InternalOil.g:2002:3: otherlv_0= 'TIMING_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) ) otherlv_6= '}' )? (otherlv_7= ';' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getTimingProtectionRuleAccess().getTIMING_PROTECTIONKeyword_0());
            		
            // InternalOil.g:2006:3: ( (lv_name_1_0= ruleName ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalOil.g:2007:4: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:2007:4: (lv_name_1_0= ruleName )
                    // InternalOil.g:2008:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getTimingProtectionRuleAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTimingProtectionRuleRule());
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

            otherlv_2=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTimingProtectionRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalOil.g:2029:3: ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) )
            // InternalOil.g:2030:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            {
            // InternalOil.g:2030:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            // InternalOil.g:2031:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            {
            // InternalOil.g:2031:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==33) ) {
                alt47=1;
            }
            else if ( (LA47_0==34) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalOil.g:2032:6: lv_value_3_1= 'TRUE'
                    {
                    lv_value_3_1=(Token)match(input,33,FOLLOW_39); 

                    						newLeafNode(lv_value_3_1, grammarAccess.getTimingProtectionRuleAccess().getValueTRUEKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimingProtectionRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalOil.g:2043:6: lv_value_3_2= 'FALSE'
                    {
                    lv_value_3_2=(Token)match(input,34,FOLLOW_39); 

                    						newLeafNode(lv_value_3_2, grammarAccess.getTimingProtectionRuleAccess().getValueFALSEKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimingProtectionRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalOil.g:2056:3: (otherlv_4= '{' ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) ) otherlv_6= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==22) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalOil.g:2057:4: otherlv_4= '{' ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getTimingProtectionRuleAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalOil.g:2061:4: ( (lv_timingProtectionParam_5_0= ruleTimingProtectionParam ) )
                    // InternalOil.g:2062:5: (lv_timingProtectionParam_5_0= ruleTimingProtectionParam )
                    {
                    // InternalOil.g:2062:5: (lv_timingProtectionParam_5_0= ruleTimingProtectionParam )
                    // InternalOil.g:2063:6: lv_timingProtectionParam_5_0= ruleTimingProtectionParam
                    {

                    						newCompositeNode(grammarAccess.getTimingProtectionRuleAccess().getTimingProtectionParamTimingProtectionParamParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_timingProtectionParam_5_0=ruleTimingProtectionParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimingProtectionRuleRule());
                    						}
                    						add(
                    							current,
                    							"timingProtectionParam",
                    							lv_timingProtectionParam_5_0,
                    							"org.xtext.example.oil.Oil.TimingProtectionParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getTimingProtectionRuleAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:2085:3: (otherlv_7= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOil.g:2086:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTimingProtectionRuleAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleTimingProtectionRule"


    // $ANTLR start "entryRuleTimingProtectionParam"
    // InternalOil.g:2095:1: entryRuleTimingProtectionParam returns [EObject current=null] : iv_ruleTimingProtectionParam= ruleTimingProtectionParam EOF ;
    public final EObject entryRuleTimingProtectionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimingProtectionParam = null;


        try {
            // InternalOil.g:2095:62: (iv_ruleTimingProtectionParam= ruleTimingProtectionParam EOF )
            // InternalOil.g:2096:2: iv_ruleTimingProtectionParam= ruleTimingProtectionParam EOF
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
    // InternalOil.g:2102:1: ruleTimingProtectionParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleTimingProtectionParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2108:2: ( ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) )
            // InternalOil.g:2109:2: ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            {
            // InternalOil.g:2109:2: ( ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
            // InternalOil.g:2110:3: ( (lv_type_0_0= ruleTimingProtectionParamEnum ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';'
            {
            // InternalOil.g:2110:3: ( (lv_type_0_0= ruleTimingProtectionParamEnum ) )
            // InternalOil.g:2111:4: (lv_type_0_0= ruleTimingProtectionParamEnum )
            {
            // InternalOil.g:2111:4: (lv_type_0_0= ruleTimingProtectionParamEnum )
            // InternalOil.g:2112:5: lv_type_0_0= ruleTimingProtectionParamEnum
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

            otherlv_1=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getTimingProtectionParamAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:2133:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:2134:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:2134:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:2135:5: lv_value_2_0= ruleAttributeValue
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
    // InternalOil.g:2160:1: entryRuleIsrParam returns [EObject current=null] : iv_ruleIsrParam= ruleIsrParam EOF ;
    public final EObject entryRuleIsrParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsrParam = null;


        try {
            // InternalOil.g:2160:49: (iv_ruleIsrParam= ruleIsrParam EOF )
            // InternalOil.g:2161:2: iv_ruleIsrParam= ruleIsrParam EOF
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
    // InternalOil.g:2167:1: ruleIsrParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_range_1_0= ruleRange ) )? ( (lv_param_2_0= ruleIsrParamEnum ) ) otherlv_3= '=' ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ';' ) ;
    public final EObject ruleIsrParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_range_1_0 = null;

        Enumerator lv_param_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2173:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_range_1_0= ruleRange ) )? ( (lv_param_2_0= ruleIsrParamEnum ) ) otherlv_3= '=' ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ';' ) )
            // InternalOil.g:2174:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_range_1_0= ruleRange ) )? ( (lv_param_2_0= ruleIsrParamEnum ) ) otherlv_3= '=' ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ';' )
            {
            // InternalOil.g:2174:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_range_1_0= ruleRange ) )? ( (lv_param_2_0= ruleIsrParamEnum ) ) otherlv_3= '=' ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ';' )
            // InternalOil.g:2175:3: ( (lv_type_0_0= ruleIntTypeEnum ) )? ( (lv_range_1_0= ruleRange ) )? ( (lv_param_2_0= ruleIsrParamEnum ) ) otherlv_3= '=' ( (lv_value_4_0= ruleAttributeValue ) ) otherlv_5= ';'
            {
            // InternalOil.g:2175:3: ( (lv_type_0_0= ruleIntTypeEnum ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=110 && LA50_0<=113)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalOil.g:2176:4: (lv_type_0_0= ruleIntTypeEnum )
                    {
                    // InternalOil.g:2176:4: (lv_type_0_0= ruleIntTypeEnum )
                    // InternalOil.g:2177:5: lv_type_0_0= ruleIntTypeEnum
                    {

                    					newCompositeNode(grammarAccess.getIsrParamAccess().getTypeIntTypeEnumEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_type_0_0=ruleIntTypeEnum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIsrParamRule());
                    					}
                    					set(
                    						current,
                    						"type",
                    						lv_type_0_0,
                    						"org.xtext.example.oil.Oil.IntTypeEnum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2194:3: ( (lv_range_1_0= ruleRange ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==58) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalOil.g:2195:4: (lv_range_1_0= ruleRange )
                    {
                    // InternalOil.g:2195:4: (lv_range_1_0= ruleRange )
                    // InternalOil.g:2196:5: lv_range_1_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getIsrParamAccess().getRangeRangeParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_42);
                    lv_range_1_0=ruleRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIsrParamRule());
                    					}
                    					set(
                    						current,
                    						"range",
                    						lv_range_1_0,
                    						"org.xtext.example.oil.Oil.Range");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2213:3: ( (lv_param_2_0= ruleIsrParamEnum ) )
            // InternalOil.g:2214:4: (lv_param_2_0= ruleIsrParamEnum )
            {
            // InternalOil.g:2214:4: (lv_param_2_0= ruleIsrParamEnum )
            // InternalOil.g:2215:5: lv_param_2_0= ruleIsrParamEnum
            {

            					newCompositeNode(grammarAccess.getIsrParamAccess().getParamIsrParamEnumEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_param_2_0=ruleIsrParamEnum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsrParamRule());
            					}
            					set(
            						current,
            						"param",
            						lv_param_2_0,
            						"org.xtext.example.oil.Oil.IsrParamEnum");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getIsrParamAccess().getEqualsSignKeyword_3());
            		
            // InternalOil.g:2236:3: ( (lv_value_4_0= ruleAttributeValue ) )
            // InternalOil.g:2237:4: (lv_value_4_0= ruleAttributeValue )
            {
            // InternalOil.g:2237:4: (lv_value_4_0= ruleAttributeValue )
            // InternalOil.g:2238:5: lv_value_4_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getIsrParamAccess().getValueAttributeValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_value_4_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsrParamRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIsrParamAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleMemoryProtectionRule"
    // InternalOil.g:2263:1: entryRuleMemoryProtectionRule returns [EObject current=null] : iv_ruleMemoryProtectionRule= ruleMemoryProtectionRule EOF ;
    public final EObject entryRuleMemoryProtectionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryProtectionRule = null;


        try {
            // InternalOil.g:2263:61: (iv_ruleMemoryProtectionRule= ruleMemoryProtectionRule EOF )
            // InternalOil.g:2264:2: iv_ruleMemoryProtectionRule= ruleMemoryProtectionRule EOF
            {
             newCompositeNode(grammarAccess.getMemoryProtectionRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryProtectionRule=ruleMemoryProtectionRule();

            state._fsp--;

             current =iv_ruleMemoryProtectionRule; 
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
    // $ANTLR end "entryRuleMemoryProtectionRule"


    // $ANTLR start "ruleMemoryProtectionRule"
    // InternalOil.g:2270:1: ruleMemoryProtectionRule returns [EObject current=null] : (otherlv_0= 'MEMORY_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' otherlv_5= '}' )? (otherlv_6= ';' )? ) ;
    public final EObject ruleMemoryProtectionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalOil.g:2276:2: ( (otherlv_0= 'MEMORY_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' otherlv_5= '}' )? (otherlv_6= ';' )? ) )
            // InternalOil.g:2277:2: (otherlv_0= 'MEMORY_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' otherlv_5= '}' )? (otherlv_6= ';' )? )
            {
            // InternalOil.g:2277:2: (otherlv_0= 'MEMORY_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' otherlv_5= '}' )? (otherlv_6= ';' )? )
            // InternalOil.g:2278:3: otherlv_0= 'MEMORY_PROTECTION' ( (lv_name_1_0= ruleName ) )? otherlv_2= '=' ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) ) (otherlv_4= '{' otherlv_5= '}' )? (otherlv_6= ';' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getMemoryProtectionRuleAccess().getMEMORY_PROTECTIONKeyword_0());
            		
            // InternalOil.g:2282:3: ( (lv_name_1_0= ruleName ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalOil.g:2283:4: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:2283:4: (lv_name_1_0= ruleName )
                    // InternalOil.g:2284:5: lv_name_1_0= ruleName
                    {

                    					newCompositeNode(grammarAccess.getMemoryProtectionRuleAccess().getNameNameParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMemoryProtectionRuleRule());
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

            otherlv_2=(Token)match(input,18,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getMemoryProtectionRuleAccess().getEqualsSignKeyword_2());
            		
            // InternalOil.g:2305:3: ( ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) ) )
            // InternalOil.g:2306:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            {
            // InternalOil.g:2306:4: ( (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' ) )
            // InternalOil.g:2307:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            {
            // InternalOil.g:2307:5: (lv_value_3_1= 'TRUE' | lv_value_3_2= 'FALSE' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==33) ) {
                alt53=1;
            }
            else if ( (LA53_0==34) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalOil.g:2308:6: lv_value_3_1= 'TRUE'
                    {
                    lv_value_3_1=(Token)match(input,33,FOLLOW_39); 

                    						newLeafNode(lv_value_3_1, grammarAccess.getMemoryProtectionRuleAccess().getValueTRUEKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemoryProtectionRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalOil.g:2319:6: lv_value_3_2= 'FALSE'
                    {
                    lv_value_3_2=(Token)match(input,34,FOLLOW_39); 

                    						newLeafNode(lv_value_3_2, grammarAccess.getMemoryProtectionRuleAccess().getValueFALSEKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMemoryProtectionRuleRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_3_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalOil.g:2332:3: (otherlv_4= '{' otherlv_5= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==22) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalOil.g:2333:4: otherlv_4= '{' otherlv_5= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getMemoryProtectionRuleAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,23,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getMemoryProtectionRuleAccess().getRightCurlyBracketKeyword_4_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:2342:3: (otherlv_6= ';' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==20) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalOil.g:2343:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMemoryProtectionRuleAccess().getSemicolonKeyword_5());
                    			

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
    // $ANTLR end "ruleMemoryProtectionRule"


    // $ANTLR start "entryRuleObject"
    // InternalOil.g:2352:1: entryRuleObject returns [String current=null] : iv_ruleObject= ruleObject EOF ;
    public final String entryRuleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObject = null;


        try {
            // InternalOil.g:2352:46: (iv_ruleObject= ruleObject EOF )
            // InternalOil.g:2353:2: iv_ruleObject= ruleObject EOF
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
    // InternalOil.g:2359:1: ruleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' ) ;
    public final AntlrDatatypeRuleToken ruleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:2365:2: ( (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' ) )
            // InternalOil.g:2366:2: (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' )
            {
            // InternalOil.g:2366:2: (kw= 'OS' | kw= 'TASK' | kw= 'COUNTER' | kw= 'ALARM' | kw= 'RESOURCE' | kw= 'EVENT' | kw= 'ISR' | kw= 'MESSAGE' | kw= 'COM' | kw= 'NM' | kw= 'APPMODE' | kw= 'IPDU' | kw= 'NETWORKMESSAGE' | kw= 'APPLICATION' | kw= 'MEMOTY_PROTECTION' | kw= 'SPINLOCK' | kw= 'SCHEDULETABLE' | kw= 'IOC' | kw= 'LIBRARY' )
            int alt56=19;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt56=1;
                }
                break;
            case 24:
                {
                alt56=2;
                }
                break;
            case 29:
                {
                alt56=3;
                }
                break;
            case 41:
                {
                alt56=4;
                }
                break;
            case 42:
                {
                alt56=5;
                }
                break;
            case 43:
                {
                alt56=6;
                }
                break;
            case 38:
                {
                alt56=7;
                }
                break;
            case 44:
                {
                alt56=8;
                }
                break;
            case 45:
                {
                alt56=9;
                }
                break;
            case 46:
                {
                alt56=10;
                }
                break;
            case 47:
                {
                alt56=11;
                }
                break;
            case 48:
                {
                alt56=12;
                }
                break;
            case 49:
                {
                alt56=13;
                }
                break;
            case 31:
                {
                alt56=14;
                }
                break;
            case 50:
                {
                alt56=15;
                }
                break;
            case 51:
                {
                alt56=16;
                }
                break;
            case 52:
                {
                alt56=17;
                }
                break;
            case 53:
                {
                alt56=18;
                }
                break;
            case 54:
                {
                alt56=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalOil.g:2367:3: kw= 'OS'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getOSKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:2373:3: kw= 'TASK'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getTASKKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOil.g:2379:3: kw= 'COUNTER'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getCOUNTERKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOil.g:2385:3: kw= 'ALARM'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getALARMKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOil.g:2391:3: kw= 'RESOURCE'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getRESOURCEKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOil.g:2397:3: kw= 'EVENT'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getEVENTKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalOil.g:2403:3: kw= 'ISR'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getISRKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalOil.g:2409:3: kw= 'MESSAGE'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getMESSAGEKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalOil.g:2415:3: kw= 'COM'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getCOMKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalOil.g:2421:3: kw= 'NM'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getNMKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalOil.g:2427:3: kw= 'APPMODE'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getAPPMODEKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalOil.g:2433:3: kw= 'IPDU'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getIPDUKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalOil.g:2439:3: kw= 'NETWORKMESSAGE'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getNETWORKMESSAGEKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalOil.g:2445:3: kw= 'APPLICATION'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getAPPLICATIONKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalOil.g:2451:3: kw= 'MEMOTY_PROTECTION'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getMEMOTY_PROTECTIONKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalOil.g:2457:3: kw= 'SPINLOCK'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getSPINLOCKKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalOil.g:2463:3: kw= 'SCHEDULETABLE'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getSCHEDULETABLEKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalOil.g:2469:3: kw= 'IOC'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getObjectAccess().getIOCKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalOil.g:2475:3: kw= 'LIBRARY'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

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
    // InternalOil.g:2484:1: entryRuleImplementationDef returns [EObject current=null] : iv_ruleImplementationDef= ruleImplementationDef EOF ;
    public final EObject entryRuleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDef = null;


        try {
            // InternalOil.g:2484:58: (iv_ruleImplementationDef= ruleImplementationDef EOF )
            // InternalOil.g:2485:2: iv_ruleImplementationDef= ruleImplementationDef EOF
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
    // InternalOil.g:2491:1: ruleImplementationDef returns [EObject current=null] : (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) ;
    public final EObject ruleImplementationDef() throws RecognitionException {
        EObject current = null;

        EObject this_ImplAttrDef_0 = null;

        EObject this_ImplRefDef_1 = null;



        	enterRule();

        try {
            // InternalOil.g:2497:2: ( (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef ) )
            // InternalOil.g:2498:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            {
            // InternalOil.g:2498:2: (this_ImplAttrDef_0= ruleImplAttrDef | this_ImplRefDef_1= ruleImplRefDef )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27||LA57_0==30||(LA57_0>=55 && LA57_0<=57)||(LA57_0>=110 && LA57_0<=113)) ) {
                alt57=1;
            }
            else if ( ((LA57_0>=115 && LA57_0<=134)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalOil.g:2499:3: this_ImplAttrDef_0= ruleImplAttrDef
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
                    // InternalOil.g:2508:3: this_ImplRefDef_1= ruleImplRefDef
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
    // InternalOil.g:2520:1: entryRuleImplAttrDef returns [EObject current=null] : iv_ruleImplAttrDef= ruleImplAttrDef EOF ;
    public final EObject entryRuleImplAttrDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrDef = null;


        try {
            // InternalOil.g:2520:52: (iv_ruleImplAttrDef= ruleImplAttrDef EOF )
            // InternalOil.g:2521:2: iv_ruleImplAttrDef= ruleImplAttrDef EOF
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
    // InternalOil.g:2527:1: ruleImplAttrDef returns [EObject current=null] : (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) ;
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
            // InternalOil.g:2533:2: ( (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier ) )
            // InternalOil.g:2534:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            {
            // InternalOil.g:2534:2: (this_ImplAttrIntDef_0= ruleImplAttrIntDef | this_ImplAttrFloatDef_1= ruleImplAttrFloatDef | this_ImplAttrEnumDef_2= ruleImplAttrEnumDef | this_ImplAttrStringDef_3= ruleImplAttrStringDef | this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef | this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 110:
            case 111:
            case 112:
            case 113:
                {
                alt58=1;
                }
                break;
            case 55:
                {
                alt58=2;
                }
                break;
            case 27:
                {
                alt58=3;
                }
                break;
            case 56:
                {
                alt58=4;
                }
                break;
            case 57:
                {
                alt58=5;
                }
                break;
            case 30:
                {
                alt58=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalOil.g:2535:3: this_ImplAttrIntDef_0= ruleImplAttrIntDef
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
                    // InternalOil.g:2544:3: this_ImplAttrFloatDef_1= ruleImplAttrFloatDef
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
                    // InternalOil.g:2553:3: this_ImplAttrEnumDef_2= ruleImplAttrEnumDef
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
                    // InternalOil.g:2562:3: this_ImplAttrStringDef_3= ruleImplAttrStringDef
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
                    // InternalOil.g:2571:3: this_ImplAttrBooleanDef_4= ruleImplAttrBooleanDef
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
                    // InternalOil.g:2580:3: this_ImplAttrIdentiFier_5= ruleImplAttrIdentiFier
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
    // InternalOil.g:2592:1: entryRuleImplAttrIntDef returns [EObject current=null] : iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF ;
    public final EObject entryRuleImplAttrIntDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIntDef = null;


        try {
            // InternalOil.g:2592:55: (iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF )
            // InternalOil.g:2593:2: iv_ruleImplAttrIntDef= ruleImplAttrIntDef EOF
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
    // InternalOil.g:2599:1: ruleImplAttrIntDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
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
            // InternalOil.g:2605:2: ( ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:2606:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:2606:2: ( ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:2607:3: ( (lv_type_0_0= ruleIntTypeEnum ) ) ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            // InternalOil.g:2607:3: ( (lv_type_0_0= ruleIntTypeEnum ) )
            // InternalOil.g:2608:4: (lv_type_0_0= ruleIntTypeEnum )
            {
            // InternalOil.g:2608:4: (lv_type_0_0= ruleIntTypeEnum )
            // InternalOil.g:2609:5: lv_type_0_0= ruleIntTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getTypeIntTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalOil.g:2626:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==25) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalOil.g:2627:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2627:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2628:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_43); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIntDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIntDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2640:3: ( (lv_range_2_0= ruleRange ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==58) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalOil.g:2641:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:2641:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:2642:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_43);
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

            // InternalOil.g:2659:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:2660:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:2660:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:2661:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOil.g:2678:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==58) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalOil.g:2679:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2679:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:2680:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalOil.g:2697:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==18) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalOil.g:2698:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrIntDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:2702:4: ( ( (lv_value_6_0= ruleNumber ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_T_NUMBER) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==95||LA62_0==114) ) {
                        alt62=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalOil.g:2703:5: ( (lv_value_6_0= ruleNumber ) )
                            {
                            // InternalOil.g:2703:5: ( (lv_value_6_0= ruleNumber ) )
                            // InternalOil.g:2704:6: (lv_value_6_0= ruleNumber )
                            {
                            // InternalOil.g:2704:6: (lv_value_6_0= ruleNumber )
                            // InternalOil.g:2705:7: lv_value_6_0= ruleNumber
                            {

                            							newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getValueNumberParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
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
                            // InternalOil.g:2723:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:2723:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:2724:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:2724:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:2725:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
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

            // InternalOil.g:2744:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==19) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalOil.g:2745:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrIntDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:2749:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:2750:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:2750:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:2751:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrIntDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:2777:1: entryRuleImplAttrFloatDef returns [EObject current=null] : iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF ;
    public final EObject entryRuleImplAttrFloatDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrFloatDef = null;


        try {
            // InternalOil.g:2777:57: (iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF )
            // InternalOil.g:2778:2: iv_ruleImplAttrFloatDef= ruleImplAttrFloatDef EOF
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
    // InternalOil.g:2784:1: ruleImplAttrFloatDef returns [EObject current=null] : (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
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
            // InternalOil.g:2790:2: ( (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:2791:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:2791:2: (otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:2792:3: otherlv_0= 'FLOAT' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_range_2_0= ruleRange ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrFloatDefAccess().getFLOATKeyword_0());
            		
            // InternalOil.g:2796:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==25) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalOil.g:2797:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2797:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2798:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_43); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrFloatDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrFloatDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2810:3: ( (lv_range_2_0= ruleRange ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==58) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalOil.g:2811:4: (lv_range_2_0= ruleRange )
                    {
                    // InternalOil.g:2811:4: (lv_range_2_0= ruleRange )
                    // InternalOil.g:2812:5: lv_range_2_0= ruleRange
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getRangeRangeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_43);
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

            // InternalOil.g:2829:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:2830:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:2830:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:2831:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOil.g:2848:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==58) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalOil.g:2849:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:2849:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:2850:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalOil.g:2867:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==18) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalOil.g:2868:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrFloatDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:2872:4: ( ( (lv_value_6_0= ruleEFloat ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_T_FLOAT) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==95||LA68_0==114) ) {
                        alt68=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalOil.g:2873:5: ( (lv_value_6_0= ruleEFloat ) )
                            {
                            // InternalOil.g:2873:5: ( (lv_value_6_0= ruleEFloat ) )
                            // InternalOil.g:2874:6: (lv_value_6_0= ruleEFloat )
                            {
                            // InternalOil.g:2874:6: (lv_value_6_0= ruleEFloat )
                            // InternalOil.g:2875:7: lv_value_6_0= ruleEFloat
                            {

                            							newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getValueEFloatParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
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
                            // InternalOil.g:2893:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:2893:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:2894:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:2894:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:2895:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
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

            // InternalOil.g:2914:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==19) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalOil.g:2915:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrFloatDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:2919:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:2920:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:2920:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:2921:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrFloatDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:2947:1: entryRuleImplAttrEnumDef returns [EObject current=null] : iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF ;
    public final EObject entryRuleImplAttrEnumDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrEnumDef = null;


        try {
            // InternalOil.g:2947:56: (iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF )
            // InternalOil.g:2948:2: iv_ruleImplAttrEnumDef= ruleImplAttrEnumDef EOF
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
    // InternalOil.g:2954:1: ruleImplAttrEnumDef returns [EObject current=null] : (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) ;
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
            // InternalOil.g:2960:2: ( (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' ) )
            // InternalOil.g:2961:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            {
            // InternalOil.g:2961:2: (otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';' )
            // InternalOil.g:2962:3: otherlv_0= 'ENUM' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_enumeration_2_0= ruleEnumeration ) )? ( (lv_name_3_0= ruleAttributeName ) ) ( (lv_multiple_4_0= ruleMultipleSpecifier ) )? (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )? (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrEnumDefAccess().getENUMKeyword_0());
            		
            // InternalOil.g:2966:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==25) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalOil.g:2967:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:2967:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:2968:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_43); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrEnumDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrEnumDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:2980:3: ( (lv_enumeration_2_0= ruleEnumeration ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==58) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalOil.g:2981:4: (lv_enumeration_2_0= ruleEnumeration )
                    {
                    // InternalOil.g:2981:4: (lv_enumeration_2_0= ruleEnumeration )
                    // InternalOil.g:2982:5: lv_enumeration_2_0= ruleEnumeration
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getEnumerationEnumerationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_43);
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

            // InternalOil.g:2999:3: ( (lv_name_3_0= ruleAttributeName ) )
            // InternalOil.g:3000:4: (lv_name_3_0= ruleAttributeName )
            {
            // InternalOil.g:3000:4: (lv_name_3_0= ruleAttributeName )
            // InternalOil.g:3001:5: lv_name_3_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getNameAttributeNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOil.g:3018:3: ( (lv_multiple_4_0= ruleMultipleSpecifier ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==58) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalOil.g:3019:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:3019:4: (lv_multiple_4_0= ruleMultipleSpecifier )
                    // InternalOil.g:3020:5: lv_multiple_4_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalOil.g:3037:3: (otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==18) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalOil.g:3038:4: otherlv_5= '=' ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplAttrEnumDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:3042:4: ( ( (lv_value_6_0= ruleName ) ) | ( (lv_default_7_0= ruleDefaultEnum ) ) )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==RULE_ID) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==95||LA74_0==114) ) {
                        alt74=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalOil.g:3043:5: ( (lv_value_6_0= ruleName ) )
                            {
                            // InternalOil.g:3043:5: ( (lv_value_6_0= ruleName ) )
                            // InternalOil.g:3044:6: (lv_value_6_0= ruleName )
                            {
                            // InternalOil.g:3044:6: (lv_value_6_0= ruleName )
                            // InternalOil.g:3045:7: lv_value_6_0= ruleName
                            {

                            							newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getValueNameParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
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
                            // InternalOil.g:3063:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:3063:5: ( (lv_default_7_0= ruleDefaultEnum ) )
                            // InternalOil.g:3064:6: (lv_default_7_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:3064:6: (lv_default_7_0= ruleDefaultEnum )
                            // InternalOil.g:3065:7: lv_default_7_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
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

            // InternalOil.g:3084:3: (otherlv_8= ':' ( (lv_description_9_0= ruleEString ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==19) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalOil.g:3085:4: otherlv_8= ':' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrEnumDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:3089:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalOil.g:3090:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalOil.g:3090:5: (lv_description_9_0= ruleEString )
                    // InternalOil.g:3091:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrEnumDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:3117:1: entryRuleImplAttrStringDef returns [EObject current=null] : iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF ;
    public final EObject entryRuleImplAttrStringDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrStringDef = null;


        try {
            // InternalOil.g:3117:58: (iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF )
            // InternalOil.g:3118:2: iv_ruleImplAttrStringDef= ruleImplAttrStringDef EOF
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
    // InternalOil.g:3124:1: ruleImplAttrStringDef returns [EObject current=null] : (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' ) ;
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
            // InternalOil.g:3130:2: ( (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' ) )
            // InternalOil.g:3131:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' )
            {
            // InternalOil.g:3131:2: (otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';' )
            // InternalOil.g:3132:3: otherlv_0= 'STRING' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) ( (lv_multiple_3_0= ruleMultipleSpecifier ) )? (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )? (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )? otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrStringDefAccess().getSTRINGKeyword_0());
            		
            // InternalOil.g:3136:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==25) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalOil.g:3137:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:3137:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:3138:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_43); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrStringDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrStringDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:3150:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:3151:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:3151:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:3152:5: lv_name_2_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getNameAttributeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalOil.g:3169:3: ( (lv_multiple_3_0= ruleMultipleSpecifier ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==58) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalOil.g:3170:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:3170:4: (lv_multiple_3_0= ruleMultipleSpecifier )
                    // InternalOil.g:3171:5: lv_multiple_3_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getMultipleMultipleSpecifierParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalOil.g:3188:3: (otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==18) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalOil.g:3189:4: otherlv_4= '=' ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getImplAttrStringDefAccess().getEqualsSignKeyword_4_0());
                    			
                    // InternalOil.g:3193:4: ( ( (lv_value_5_0= ruleEString ) ) | ( (lv_default_6_0= ruleDefaultEnum ) ) )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RULE_STRING) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==95||LA79_0==114) ) {
                        alt79=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalOil.g:3194:5: ( (lv_value_5_0= ruleEString ) )
                            {
                            // InternalOil.g:3194:5: ( (lv_value_5_0= ruleEString ) )
                            // InternalOil.g:3195:6: (lv_value_5_0= ruleEString )
                            {
                            // InternalOil.g:3195:6: (lv_value_5_0= ruleEString )
                            // InternalOil.g:3196:7: lv_value_5_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getValueEStringParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
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
                            // InternalOil.g:3214:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:3214:5: ( (lv_default_6_0= ruleDefaultEnum ) )
                            // InternalOil.g:3215:6: (lv_default_6_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:3215:6: (lv_default_6_0= ruleDefaultEnum )
                            // InternalOil.g:3216:7: lv_default_6_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getDefaultDefaultEnumEnumRuleCall_4_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
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

            // InternalOil.g:3235:3: (otherlv_7= ':' ( (lv_description_8_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==19) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalOil.g:3236:4: otherlv_7= ':' ( (lv_description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getImplAttrStringDefAccess().getColonKeyword_5_0());
                    			
                    // InternalOil.g:3240:4: ( (lv_description_8_0= ruleEString ) )
                    // InternalOil.g:3241:5: (lv_description_8_0= ruleEString )
                    {
                    // InternalOil.g:3241:5: (lv_description_8_0= ruleEString )
                    // InternalOil.g:3242:6: lv_description_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrStringDefAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:3268:1: entryRuleImplAttrBooleanDef returns [EObject current=null] : iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF ;
    public final EObject entryRuleImplAttrBooleanDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrBooleanDef = null;


        try {
            // InternalOil.g:3268:59: (iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF )
            // InternalOil.g:3269:2: iv_ruleImplAttrBooleanDef= ruleImplAttrBooleanDef EOF
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
    // InternalOil.g:3275:1: ruleImplAttrBooleanDef returns [EObject current=null] : (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' ) ;
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
            // InternalOil.g:3281:2: ( (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' ) )
            // InternalOil.g:3282:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' )
            {
            // InternalOil.g:3282:2: (otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';' )
            // InternalOil.g:3283:3: otherlv_0= 'BOOLEAN' ( (lv_auto_1_0= 'WITH_AUTO' ) )? (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )? ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) ) ( (lv_multiple_16_0= ruleMultipleSpecifier ) )? (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )? (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )? otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrBooleanDefAccess().getBOOLEANKeyword_0());
            		
            // InternalOil.g:3287:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==25) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalOil.g:3288:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:3288:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:3289:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_43); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrBooleanDefAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrBooleanDefRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:3301:3: (otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==58) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalOil.g:3302:4: otherlv_2= '[' otherlv_3= 'TRUE' (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )? ( (lv_trueDescription_7_0= ruleEString ) )? otherlv_8= ',' otherlv_9= 'FALSE' (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )? ( (lv_falseDescription_13_0= ruleEString ) )? otherlv_14= ']'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_46); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplAttrBooleanDefAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,33,FOLLOW_47); 

                    				newLeafNode(otherlv_3, grammarAccess.getImplAttrBooleanDefAccess().getTRUEKeyword_2_1());
                    			
                    // InternalOil.g:3310:4: (otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}' )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==22) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalOil.g:3311:5: otherlv_4= '{' ( (lv_trueParameterList_5_0= ruleImplementationDef ) )* otherlv_6= '}'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_48); 

                            					newLeafNode(otherlv_4, grammarAccess.getImplAttrBooleanDefAccess().getLeftCurlyBracketKeyword_2_2_0());
                            				
                            // InternalOil.g:3315:5: ( (lv_trueParameterList_5_0= ruleImplementationDef ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==27||LA83_0==30||(LA83_0>=55 && LA83_0<=57)||(LA83_0>=110 && LA83_0<=113)||(LA83_0>=115 && LA83_0<=134)) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // InternalOil.g:3316:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:3316:6: (lv_trueParameterList_5_0= ruleImplementationDef )
                            	    // InternalOil.g:3317:7: lv_trueParameterList_5_0= ruleImplementationDef
                            	    {

                            	    							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getTrueParameterListImplementationDefParserRuleCall_2_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_48);
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
                            	    break loop83;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,23,FOLLOW_49); 

                            					newLeafNode(otherlv_6, grammarAccess.getImplAttrBooleanDefAccess().getRightCurlyBracketKeyword_2_2_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:3339:4: ( (lv_trueDescription_7_0= ruleEString ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_STRING) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalOil.g:3340:5: (lv_trueDescription_7_0= ruleEString )
                            {
                            // InternalOil.g:3340:5: (lv_trueDescription_7_0= ruleEString )
                            // InternalOil.g:3341:6: lv_trueDescription_7_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getTrueDescriptionEStringParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_50);
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

                    otherlv_8=(Token)match(input,59,FOLLOW_51); 

                    				newLeafNode(otherlv_8, grammarAccess.getImplAttrBooleanDefAccess().getCommaKeyword_2_4());
                    			
                    otherlv_9=(Token)match(input,34,FOLLOW_52); 

                    				newLeafNode(otherlv_9, grammarAccess.getImplAttrBooleanDefAccess().getFALSEKeyword_2_5());
                    			
                    // InternalOil.g:3366:4: (otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==22) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalOil.g:3367:5: otherlv_10= '{' ( (lv_falseParameterList_11_0= ruleImplementationDef ) )* otherlv_12= '}'
                            {
                            otherlv_10=(Token)match(input,22,FOLLOW_48); 

                            					newLeafNode(otherlv_10, grammarAccess.getImplAttrBooleanDefAccess().getLeftCurlyBracketKeyword_2_6_0());
                            				
                            // InternalOil.g:3371:5: ( (lv_falseParameterList_11_0= ruleImplementationDef ) )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==27||LA86_0==30||(LA86_0>=55 && LA86_0<=57)||(LA86_0>=110 && LA86_0<=113)||(LA86_0>=115 && LA86_0<=134)) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // InternalOil.g:3372:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    {
                            	    // InternalOil.g:3372:6: (lv_falseParameterList_11_0= ruleImplementationDef )
                            	    // InternalOil.g:3373:7: lv_falseParameterList_11_0= ruleImplementationDef
                            	    {

                            	    							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getFalseParameterListImplementationDefParserRuleCall_2_6_1_0());
                            	    						
                            	    pushFollow(FOLLOW_48);
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
                            	    break loop86;
                                }
                            } while (true);

                            otherlv_12=(Token)match(input,23,FOLLOW_53); 

                            					newLeafNode(otherlv_12, grammarAccess.getImplAttrBooleanDefAccess().getRightCurlyBracketKeyword_2_6_2());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:3395:4: ( (lv_falseDescription_13_0= ruleEString ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_STRING) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalOil.g:3396:5: (lv_falseDescription_13_0= ruleEString )
                            {
                            // InternalOil.g:3396:5: (lv_falseDescription_13_0= ruleEString )
                            // InternalOil.g:3397:6: lv_falseDescription_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getFalseDescriptionEStringParserRuleCall_2_7_0());
                            					
                            pushFollow(FOLLOW_54);
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

                    otherlv_14=(Token)match(input,60,FOLLOW_43); 

                    				newLeafNode(otherlv_14, grammarAccess.getImplAttrBooleanDefAccess().getRightSquareBracketKeyword_2_8());
                    			

                    }
                    break;

            }

            // InternalOil.g:3419:3: ( ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) ) )
            // InternalOil.g:3420:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            {
            // InternalOil.g:3420:4: ( (lv_name_15_1= ruleName | lv_name_15_2= ruleObject ) )
            // InternalOil.g:3421:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            {
            // InternalOil.g:3421:5: (lv_name_15_1= ruleName | lv_name_15_2= ruleObject )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_ID) ) {
                alt90=1;
            }
            else if ( (LA90_0==24||LA90_0==26||LA90_0==29||LA90_0==31||LA90_0==38||(LA90_0>=41 && LA90_0<=54)) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalOil.g:3422:6: lv_name_15_1= ruleName
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameNameParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_19);
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
                    // InternalOil.g:3438:6: lv_name_15_2= ruleObject
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getNameObjectParserRuleCall_3_0_1());
                    					
                    pushFollow(FOLLOW_19);
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

            // InternalOil.g:3456:3: ( (lv_multiple_16_0= ruleMultipleSpecifier ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==58) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalOil.g:3457:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:3457:4: (lv_multiple_16_0= ruleMultipleSpecifier )
                    // InternalOil.g:3458:5: lv_multiple_16_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getMultipleMultipleSpecifierParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_20);
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

            // InternalOil.g:3475:3: (otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==18) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalOil.g:3476:4: otherlv_17= '=' ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    {
                    otherlv_17=(Token)match(input,18,FOLLOW_55); 

                    				newLeafNode(otherlv_17, grammarAccess.getImplAttrBooleanDefAccess().getEqualsSignKeyword_5_0());
                    			
                    // InternalOil.g:3480:4: ( ( (lv_value_18_0= ruleEBoolean ) ) | ( (lv_default_19_0= ruleDefaultEnum ) ) )
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( ((LA92_0>=33 && LA92_0<=34)) ) {
                        alt92=1;
                    }
                    else if ( (LA92_0==95||LA92_0==114) ) {
                        alt92=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 92, 0, input);

                        throw nvae;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalOil.g:3481:5: ( (lv_value_18_0= ruleEBoolean ) )
                            {
                            // InternalOil.g:3481:5: ( (lv_value_18_0= ruleEBoolean ) )
                            // InternalOil.g:3482:6: (lv_value_18_0= ruleEBoolean )
                            {
                            // InternalOil.g:3482:6: (lv_value_18_0= ruleEBoolean )
                            // InternalOil.g:3483:7: lv_value_18_0= ruleEBoolean
                            {

                            							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getValueEBooleanParserRuleCall_5_1_0_0());
                            						
                            pushFollow(FOLLOW_9);
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
                            // InternalOil.g:3501:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            {
                            // InternalOil.g:3501:5: ( (lv_default_19_0= ruleDefaultEnum ) )
                            // InternalOil.g:3502:6: (lv_default_19_0= ruleDefaultEnum )
                            {
                            // InternalOil.g:3502:6: (lv_default_19_0= ruleDefaultEnum )
                            // InternalOil.g:3503:7: lv_default_19_0= ruleDefaultEnum
                            {

                            							newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getDefaultDefaultEnumEnumRuleCall_5_1_1_0());
                            						
                            pushFollow(FOLLOW_9);
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

            // InternalOil.g:3522:3: (otherlv_20= ':' ( (lv_description_21_0= ruleEString ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==19) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalOil.g:3523:4: otherlv_20= ':' ( (lv_description_21_0= ruleEString ) )
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getImplAttrBooleanDefAccess().getColonKeyword_6_0());
                    			
                    // InternalOil.g:3527:4: ( (lv_description_21_0= ruleEString ) )
                    // InternalOil.g:3528:5: (lv_description_21_0= ruleEString )
                    {
                    // InternalOil.g:3528:5: (lv_description_21_0= ruleEString )
                    // InternalOil.g:3529:6: lv_description_21_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getImplAttrBooleanDefAccess().getDescriptionEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
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

            otherlv_22=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:3555:1: entryRuleImplAttrIdentiFier returns [EObject current=null] : iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF ;
    public final EObject entryRuleImplAttrIdentiFier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplAttrIdentiFier = null;


        try {
            // InternalOil.g:3555:59: (iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF )
            // InternalOil.g:3556:2: iv_ruleImplAttrIdentiFier= ruleImplAttrIdentiFier EOF
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
    // InternalOil.g:3562:1: ruleImplAttrIdentiFier returns [EObject current=null] : (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalOil.g:3568:2: ( (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalOil.g:3569:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalOil.g:3569:2: (otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';' )
            // InternalOil.g:3570:3: otherlv_0= 'IDENTIFIER' ( (lv_auto_1_0= 'WITH_AUTO' ) )? ( (lv_name_2_0= ruleAttributeName ) ) otherlv_3= '=' ( (lv_value_4_0= RULE_ID ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getImplAttrIdentiFierAccess().getIDENTIFIERKeyword_0());
            		
            // InternalOil.g:3574:3: ( (lv_auto_1_0= 'WITH_AUTO' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==25) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalOil.g:3575:4: (lv_auto_1_0= 'WITH_AUTO' )
                    {
                    // InternalOil.g:3575:4: (lv_auto_1_0= 'WITH_AUTO' )
                    // InternalOil.g:3576:5: lv_auto_1_0= 'WITH_AUTO'
                    {
                    lv_auto_1_0=(Token)match(input,25,FOLLOW_43); 

                    					newLeafNode(lv_auto_1_0, grammarAccess.getImplAttrIdentiFierAccess().getAutoWITH_AUTOKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImplAttrIdentiFierRule());
                    					}
                    					setWithLastConsumed(current, "auto", true, "WITH_AUTO");
                    				

                    }


                    }
                    break;

            }

            // InternalOil.g:3588:3: ( (lv_name_2_0= ruleAttributeName ) )
            // InternalOil.g:3589:4: (lv_name_2_0= ruleAttributeName )
            {
            // InternalOil.g:3589:4: (lv_name_2_0= ruleAttributeName )
            // InternalOil.g:3590:5: lv_name_2_0= ruleAttributeName
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
            		
            // InternalOil.g:3611:3: ( (lv_value_4_0= RULE_ID ) )
            // InternalOil.g:3612:4: (lv_value_4_0= RULE_ID )
            {
            // InternalOil.g:3612:4: (lv_value_4_0= RULE_ID )
            // InternalOil.g:3613:5: lv_value_4_0= RULE_ID
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
    // InternalOil.g:3637:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalOil.g:3637:46: (iv_ruleRange= ruleRange EOF )
            // InternalOil.g:3638:2: iv_ruleRange= ruleRange EOF
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
    // InternalOil.g:3644:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) ;
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
            // InternalOil.g:3650:2: ( (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' ) )
            // InternalOil.g:3651:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            {
            // InternalOil.g:3651:2: (otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']' )
            // InternalOil.g:3652:3: otherlv_0= '[' ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:3656:3: ( ( (lv_value_1_0= ruleNumber ) ) | ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) ) | ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ ) )
            int alt97=3;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==RULE_T_NUMBER) ) {
                switch ( input.LA(2) ) {
                case 61:
                    {
                    alt97=2;
                    }
                    break;
                case 60:
                    {
                    alt97=1;
                    }
                    break;
                case 59:
                    {
                    alt97=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 97, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalOil.g:3657:4: ( (lv_value_1_0= ruleNumber ) )
                    {
                    // InternalOil.g:3657:4: ( (lv_value_1_0= ruleNumber ) )
                    // InternalOil.g:3658:5: (lv_value_1_0= ruleNumber )
                    {
                    // InternalOil.g:3658:5: (lv_value_1_0= ruleNumber )
                    // InternalOil.g:3659:6: lv_value_1_0= ruleNumber
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getValueNumberParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_54);
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
                    // InternalOil.g:3677:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    {
                    // InternalOil.g:3677:4: ( ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) ) )
                    // InternalOil.g:3678:5: ( (lv_begin_2_0= ruleNumber ) ) otherlv_3= '..' ( (lv_end_4_0= ruleNumber ) )
                    {
                    // InternalOil.g:3678:5: ( (lv_begin_2_0= ruleNumber ) )
                    // InternalOil.g:3679:6: (lv_begin_2_0= ruleNumber )
                    {
                    // InternalOil.g:3679:6: (lv_begin_2_0= ruleNumber )
                    // InternalOil.g:3680:7: lv_begin_2_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getBeginNumberParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_57);
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

                    otherlv_3=(Token)match(input,61,FOLLOW_56); 

                    					newLeafNode(otherlv_3, grammarAccess.getRangeAccess().getFullStopFullStopKeyword_1_1_1());
                    				
                    // InternalOil.g:3701:5: ( (lv_end_4_0= ruleNumber ) )
                    // InternalOil.g:3702:6: (lv_end_4_0= ruleNumber )
                    {
                    // InternalOil.g:3702:6: (lv_end_4_0= ruleNumber )
                    // InternalOil.g:3703:7: lv_end_4_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getEndNumberParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_54);
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
                    // InternalOil.g:3722:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    {
                    // InternalOil.g:3722:4: ( ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+ )
                    // InternalOil.g:3723:5: ( (lv_numbers_5_0= ruleNumber ) ) (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    {
                    // InternalOil.g:3723:5: ( (lv_numbers_5_0= ruleNumber ) )
                    // InternalOil.g:3724:6: (lv_numbers_5_0= ruleNumber )
                    {
                    // InternalOil.g:3724:6: (lv_numbers_5_0= ruleNumber )
                    // InternalOil.g:3725:7: lv_numbers_5_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getRangeAccess().getNumbersNumberParserRuleCall_1_2_0_0());
                    						
                    pushFollow(FOLLOW_50);
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

                    // InternalOil.g:3742:5: (otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) ) )+
                    int cnt96=0;
                    loop96:
                    do {
                        int alt96=2;
                        int LA96_0 = input.LA(1);

                        if ( (LA96_0==59) ) {
                            alt96=1;
                        }


                        switch (alt96) {
                    	case 1 :
                    	    // InternalOil.g:3743:6: otherlv_6= ',' ( (lv_numbers_7_0= ruleNumber ) )
                    	    {
                    	    otherlv_6=(Token)match(input,59,FOLLOW_56); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getRangeAccess().getCommaKeyword_1_2_1_0());
                    	    					
                    	    // InternalOil.g:3747:6: ( (lv_numbers_7_0= ruleNumber ) )
                    	    // InternalOil.g:3748:7: (lv_numbers_7_0= ruleNumber )
                    	    {
                    	    // InternalOil.g:3748:7: (lv_numbers_7_0= ruleNumber )
                    	    // InternalOil.g:3749:8: lv_numbers_7_0= ruleNumber
                    	    {

                    	    								newCompositeNode(grammarAccess.getRangeAccess().getNumbersNumberParserRuleCall_1_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_58);
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
                    	    if ( cnt96 >= 1 ) break loop96;
                                EarlyExitException eee =
                                    new EarlyExitException(96, input);
                                throw eee;
                        }
                        cnt96++;
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,60,FOLLOW_2); 

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
    // InternalOil.g:3777:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalOil.g:3777:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalOil.g:3778:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalOil.g:3784:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3790:2: ( (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' ) )
            // InternalOil.g:3791:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            {
            // InternalOil.g:3791:2: (otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']' )
            // InternalOil.g:3792:3: otherlv_0= '[' ( (lv_list_1_0= ruleEnumerator ) ) (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalOil.g:3796:3: ( (lv_list_1_0= ruleEnumerator ) )
            // InternalOil.g:3797:4: (lv_list_1_0= ruleEnumerator )
            {
            // InternalOil.g:3797:4: (lv_list_1_0= ruleEnumerator )
            // InternalOil.g:3798:5: lv_list_1_0= ruleEnumerator
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getListEnumeratorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_58);
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

            // InternalOil.g:3815:3: (otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==59) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalOil.g:3816:4: otherlv_2= ',' ( (lv_list_3_0= ruleEnumerator ) )
            	    {
            	    otherlv_2=(Token)match(input,59,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOil.g:3820:4: ( (lv_list_3_0= ruleEnumerator ) )
            	    // InternalOil.g:3821:5: (lv_list_3_0= ruleEnumerator )
            	    {
            	    // InternalOil.g:3821:5: (lv_list_3_0= ruleEnumerator )
            	    // InternalOil.g:3822:6: lv_list_3_0= ruleEnumerator
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getListEnumeratorParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_58);
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
            	    break loop98;
                }
            } while (true);

            otherlv_4=(Token)match(input,60,FOLLOW_2); 

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
    // InternalOil.g:3848:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // InternalOil.g:3848:51: (iv_ruleEnumerator= ruleEnumerator EOF )
            // InternalOil.g:3849:2: iv_ruleEnumerator= ruleEnumerator EOF
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
    // InternalOil.g:3855:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_implParameterList_2_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3861:2: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? ) )
            // InternalOil.g:3862:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? )
            {
            // InternalOil.g:3862:2: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )? )
            // InternalOil.g:3863:3: ( (lv_name_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )? ( (lv_description_4_0= ruleEString ) )?
            {
            // InternalOil.g:3863:3: ( (lv_name_0_0= ruleName ) )
            // InternalOil.g:3864:4: (lv_name_0_0= ruleName )
            {
            // InternalOil.g:3864:4: (lv_name_0_0= ruleName )
            // InternalOil.g:3865:5: lv_name_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getEnumeratorAccess().getNameNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_59);
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

            // InternalOil.g:3882:3: (otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==22) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalOil.g:3883:4: otherlv_1= '{' ( (lv_implParameterList_2_0= ruleImplementationDef ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_48); 

                    				newLeafNode(otherlv_1, grammarAccess.getEnumeratorAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOil.g:3887:4: ( (lv_implParameterList_2_0= ruleImplementationDef ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==27||LA99_0==30||(LA99_0>=55 && LA99_0<=57)||(LA99_0>=110 && LA99_0<=113)||(LA99_0>=115 && LA99_0<=134)) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // InternalOil.g:3888:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    {
                    	    // InternalOil.g:3888:5: (lv_implParameterList_2_0= ruleImplementationDef )
                    	    // InternalOil.g:3889:6: lv_implParameterList_2_0= ruleImplementationDef
                    	    {

                    	    						newCompositeNode(grammarAccess.getEnumeratorAccess().getImplParameterListImplementationDefParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,23,FOLLOW_60); 

                    				newLeafNode(otherlv_3, grammarAccess.getEnumeratorAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:3911:3: ( (lv_description_4_0= ruleEString ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_STRING) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalOil.g:3912:4: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:3912:4: (lv_description_4_0= ruleEString )
                    // InternalOil.g:3913:5: lv_description_4_0= ruleEString
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
    // InternalOil.g:3934:1: entryRuleImplRefDef returns [EObject current=null] : iv_ruleImplRefDef= ruleImplRefDef EOF ;
    public final EObject entryRuleImplRefDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplRefDef = null;


        try {
            // InternalOil.g:3934:51: (iv_ruleImplRefDef= ruleImplRefDef EOF )
            // InternalOil.g:3935:2: iv_ruleImplRefDef= ruleImplRefDef EOF
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
    // InternalOil.g:3941:1: ruleImplRefDef returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleImplRefDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_multiple_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:3947:2: ( ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:3948:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:3948:2: ( ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:3949:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) ) ( (lv_name_1_0= ruleAttributeName ) ) ( (lv_multiple_2_0= ruleMultipleSpecifier ) )? ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:3949:3: ( (lv_type_0_0= ruleObjectRefTypeEnum ) )
            // InternalOil.g:3950:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            {
            // InternalOil.g:3950:4: (lv_type_0_0= ruleObjectRefTypeEnum )
            // InternalOil.g:3951:5: lv_type_0_0= ruleObjectRefTypeEnum
            {

            					newCompositeNode(grammarAccess.getImplRefDefAccess().getTypeObjectRefTypeEnumEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
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

            // InternalOil.g:3968:3: ( (lv_name_1_0= ruleAttributeName ) )
            // InternalOil.g:3969:4: (lv_name_1_0= ruleAttributeName )
            {
            // InternalOil.g:3969:4: (lv_name_1_0= ruleAttributeName )
            // InternalOil.g:3970:5: lv_name_1_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getImplRefDefAccess().getNameAttributeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_61);
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

            // InternalOil.g:3987:3: ( (lv_multiple_2_0= ruleMultipleSpecifier ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==58) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalOil.g:3988:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    {
                    // InternalOil.g:3988:4: (lv_multiple_2_0= ruleMultipleSpecifier )
                    // InternalOil.g:3989:5: lv_multiple_2_0= ruleMultipleSpecifier
                    {

                    					newCompositeNode(grammarAccess.getImplRefDefAccess().getMultipleMultipleSpecifierParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_15);
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

            // InternalOil.g:4006:3: ( (lv_description_3_0= ruleEString ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_STRING) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalOil.g:4007:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:4007:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:4008:5: lv_description_3_0= ruleEString
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
    // InternalOil.g:4033:1: entryRuleMultipleSpecifier returns [String current=null] : iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF ;
    public final String entryRuleMultipleSpecifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultipleSpecifier = null;


        try {
            // InternalOil.g:4033:57: (iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF )
            // InternalOil.g:4034:2: iv_ruleMultipleSpecifier= ruleMultipleSpecifier EOF
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
    // InternalOil.g:4040:1: ruleMultipleSpecifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '[' kw= ']' ) ;
    public final AntlrDatatypeRuleToken ruleMultipleSpecifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:4046:2: ( (kw= '[' kw= ']' ) )
            // InternalOil.g:4047:2: (kw= '[' kw= ']' )
            {
            // InternalOil.g:4047:2: (kw= '[' kw= ']' )
            // InternalOil.g:4048:3: kw= '[' kw= ']'
            {
            kw=(Token)match(input,58,FOLLOW_54); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getMultipleSpecifierAccess().getLeftSquareBracketKeyword_0());
            		
            kw=(Token)match(input,60,FOLLOW_2); 

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
    // InternalOil.g:4062:1: entryRuleApplicationDefinition returns [EObject current=null] : iv_ruleApplicationDefinition= ruleApplicationDefinition EOF ;
    public final EObject entryRuleApplicationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplicationDefinition = null;


        try {
            // InternalOil.g:4062:62: (iv_ruleApplicationDefinition= ruleApplicationDefinition EOF )
            // InternalOil.g:4063:2: iv_ruleApplicationDefinition= ruleApplicationDefinition EOF
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
    // InternalOil.g:4069:1: ruleApplicationDefinition returns [EObject current=null] : (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) ;
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
            // InternalOil.g:4075:2: ( (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' ) )
            // InternalOil.g:4076:2: (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            {
            // InternalOil.g:4076:2: (otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )
            // InternalOil.g:4077:3: otherlv_0= 'CPU' ( (lv_name_1_0= ruleName ) ) otherlv_2= '{' ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )* otherlv_4= '}' ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationDefinitionAccess().getCPUKeyword_0());
            		
            // InternalOil.g:4081:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:4082:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:4082:4: (lv_name_1_0= ruleName )
            // InternalOil.g:4083:5: lv_name_1_0= ruleName
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

            otherlv_2=(Token)match(input,22,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalOil.g:4104:3: ( (lv_objectDefinitionList_3_0= ruleObjectDefinition ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==24||LA104_0==31||LA104_0==38||(LA104_0>=40 && LA104_0<=42)||LA104_0==45||(LA104_0>=52 && LA104_0<=54)) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalOil.g:4105:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    {
            	    // InternalOil.g:4105:4: (lv_objectDefinitionList_3_0= ruleObjectDefinition )
            	    // InternalOil.g:4106:5: lv_objectDefinitionList_3_0= ruleObjectDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getObjectDefinitionListObjectDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_62);
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
            	    break loop104;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getApplicationDefinitionAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalOil.g:4127:3: ( (lv_description_5_0= ruleEString ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_STRING) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalOil.g:4128:4: (lv_description_5_0= ruleEString )
                    {
                    // InternalOil.g:4128:4: (lv_description_5_0= ruleEString )
                    // InternalOil.g:4129:5: lv_description_5_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getApplicationDefinitionAccess().getDescriptionEStringParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_10);
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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
    // InternalOil.g:4154:1: entryRuleObjectDefinition returns [EObject current=null] : iv_ruleObjectDefinition= ruleObjectDefinition EOF ;
    public final EObject entryRuleObjectDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectDefinition = null;


        try {
            // InternalOil.g:4154:57: (iv_ruleObjectDefinition= ruleObjectDefinition EOF )
            // InternalOil.g:4155:2: iv_ruleObjectDefinition= ruleObjectDefinition EOF
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
    // InternalOil.g:4161:1: ruleObjectDefinition returns [EObject current=null] : ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_AlarmRule_6= ruleAlarmRule | this_ScheduleTableRule_7= ruleScheduleTableRule | this_IocRule_8= ruleIocRule | this_ResourceRule_9= ruleResourceRule | this_TaskRule_10= ruleTaskRule | this_ComRule_11= ruleComRule | this_ApplicationRule_12= ruleApplicationRule | this_MemoryProtectionRule_13= ruleMemoryProtectionRule | this_IsrRule_14= ruleIsrRule ) ;
    public final EObject ruleObjectDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_LibraryList_3_0 = null;

        EObject this_AlarmRule_6 = null;

        EObject this_ScheduleTableRule_7 = null;

        EObject this_IocRule_8 = null;

        EObject this_ResourceRule_9 = null;

        EObject this_TaskRule_10 = null;

        EObject this_ComRule_11 = null;

        EObject this_ApplicationRule_12 = null;

        EObject this_MemoryProtectionRule_13 = null;

        EObject this_IsrRule_14 = null;



        	enterRule();

        try {
            // InternalOil.g:4167:2: ( ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_AlarmRule_6= ruleAlarmRule | this_ScheduleTableRule_7= ruleScheduleTableRule | this_IocRule_8= ruleIocRule | this_ResourceRule_9= ruleResourceRule | this_TaskRule_10= ruleTaskRule | this_ComRule_11= ruleComRule | this_ApplicationRule_12= ruleApplicationRule | this_MemoryProtectionRule_13= ruleMemoryProtectionRule | this_IsrRule_14= ruleIsrRule ) )
            // InternalOil.g:4168:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_AlarmRule_6= ruleAlarmRule | this_ScheduleTableRule_7= ruleScheduleTableRule | this_IocRule_8= ruleIocRule | this_ResourceRule_9= ruleResourceRule | this_TaskRule_10= ruleTaskRule | this_ComRule_11= ruleComRule | this_ApplicationRule_12= ruleApplicationRule | this_MemoryProtectionRule_13= ruleMemoryProtectionRule | this_IsrRule_14= ruleIsrRule )
            {
            // InternalOil.g:4168:2: ( (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' ) | this_AlarmRule_6= ruleAlarmRule | this_ScheduleTableRule_7= ruleScheduleTableRule | this_IocRule_8= ruleIocRule | this_ResourceRule_9= ruleResourceRule | this_TaskRule_10= ruleTaskRule | this_ComRule_11= ruleComRule | this_ApplicationRule_12= ruleApplicationRule | this_MemoryProtectionRule_13= ruleMemoryProtectionRule | this_IsrRule_14= ruleIsrRule )
            int alt108=10;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt108=1;
                }
                break;
            case 41:
                {
                alt108=2;
                }
                break;
            case 52:
                {
                alt108=3;
                }
                break;
            case 53:
                {
                alt108=4;
                }
                break;
            case 42:
                {
                alt108=5;
                }
                break;
            case 24:
                {
                alt108=6;
                }
                break;
            case 45:
                {
                alt108=7;
                }
                break;
            case 31:
                {
                alt108=8;
                }
                break;
            case 40:
                {
                alt108=9;
                }
                break;
            case 38:
                {
                alt108=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalOil.g:4169:3: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' )
                    {
                    // InternalOil.g:4169:3: (otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';' )
                    // InternalOil.g:4170:4: otherlv_0= 'LIBRARY' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )? otherlv_5= ';'
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getObjectDefinitionAccess().getLIBRARYKeyword_0_0());
                    			
                    // InternalOil.g:4174:4: ( (lv_name_1_0= ruleName ) )
                    // InternalOil.g:4175:5: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:4175:5: (lv_name_1_0= ruleName )
                    // InternalOil.g:4176:6: lv_name_1_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getObjectDefinitionAccess().getNameNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    // InternalOil.g:4193:4: (otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}' )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==22) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // InternalOil.g:4194:5: otherlv_2= '{' ( (lv_LibraryList_3_0= ruleLibrayattribute ) )* otherlv_4= '}'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_63); 

                            					newLeafNode(otherlv_2, grammarAccess.getObjectDefinitionAccess().getLeftCurlyBracketKeyword_0_2_0());
                            				
                            // InternalOil.g:4198:5: ( (lv_LibraryList_3_0= ruleLibrayattribute ) )*
                            loop106:
                            do {
                                int alt106=2;
                                int LA106_0 = input.LA(1);

                                if ( ((LA106_0>=63 && LA106_0<=65)) ) {
                                    alt106=1;
                                }


                                switch (alt106) {
                            	case 1 :
                            	    // InternalOil.g:4199:6: (lv_LibraryList_3_0= ruleLibrayattribute )
                            	    {
                            	    // InternalOil.g:4199:6: (lv_LibraryList_3_0= ruleLibrayattribute )
                            	    // InternalOil.g:4200:7: lv_LibraryList_3_0= ruleLibrayattribute
                            	    {

                            	    							newCompositeNode(grammarAccess.getObjectDefinitionAccess().getLibraryListLibrayattributeParserRuleCall_0_2_1_0());
                            	    						
                            	    pushFollow(FOLLOW_63);
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
                            	    break loop106;
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
                    // InternalOil.g:4228:3: this_AlarmRule_6= ruleAlarmRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getAlarmRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlarmRule_6=ruleAlarmRule();

                    state._fsp--;


                    			current = this_AlarmRule_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOil.g:4237:3: this_ScheduleTableRule_7= ruleScheduleTableRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getScheduleTableRuleParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScheduleTableRule_7=ruleScheduleTableRule();

                    state._fsp--;


                    			current = this_ScheduleTableRule_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOil.g:4246:3: this_IocRule_8= ruleIocRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getIocRuleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IocRule_8=ruleIocRule();

                    state._fsp--;


                    			current = this_IocRule_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalOil.g:4255:3: this_ResourceRule_9= ruleResourceRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getResourceRuleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ResourceRule_9=ruleResourceRule();

                    state._fsp--;


                    			current = this_ResourceRule_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalOil.g:4264:3: this_TaskRule_10= ruleTaskRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getTaskRuleParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskRule_10=ruleTaskRule();

                    state._fsp--;


                    			current = this_TaskRule_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalOil.g:4273:3: this_ComRule_11= ruleComRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getComRuleParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComRule_11=ruleComRule();

                    state._fsp--;


                    			current = this_ComRule_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalOil.g:4282:3: this_ApplicationRule_12= ruleApplicationRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getApplicationRuleParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ApplicationRule_12=ruleApplicationRule();

                    state._fsp--;


                    			current = this_ApplicationRule_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalOil.g:4291:3: this_MemoryProtectionRule_13= ruleMemoryProtectionRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getMemoryProtectionRuleParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemoryProtectionRule_13=ruleMemoryProtectionRule();

                    state._fsp--;


                    			current = this_MemoryProtectionRule_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalOil.g:4300:3: this_IsrRule_14= ruleIsrRule
                    {

                    			newCompositeNode(grammarAccess.getObjectDefinitionAccess().getIsrRuleParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsrRule_14=ruleIsrRule();

                    state._fsp--;


                    			current = this_IsrRule_14;
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
    // $ANTLR end "ruleObjectDefinition"


    // $ANTLR start "entryRuleLibrayattribute"
    // InternalOil.g:4312:1: entryRuleLibrayattribute returns [EObject current=null] : iv_ruleLibrayattribute= ruleLibrayattribute EOF ;
    public final EObject entryRuleLibrayattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrayattribute = null;


        try {
            // InternalOil.g:4312:56: (iv_ruleLibrayattribute= ruleLibrayattribute EOF )
            // InternalOil.g:4313:2: iv_ruleLibrayattribute= ruleLibrayattribute EOF
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
    // InternalOil.g:4319:1: ruleLibrayattribute returns [EObject current=null] : ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) ) ;
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
            // InternalOil.g:4325:2: ( ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) ) )
            // InternalOil.g:4326:2: ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) )
            {
            // InternalOil.g:4326:2: ( (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' ) | (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' ) | (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' ) )
            int alt109=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt109=1;
                }
                break;
            case 64:
                {
                alt109=2;
                }
                break;
            case 65:
                {
                alt109=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalOil.g:4327:3: (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' )
                    {
                    // InternalOil.g:4327:3: (otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';' )
                    // InternalOil.g:4328:4: otherlv_0= 'PATH' otherlv_1= '=' ( (lv_description_2_0= ruleEString ) ) otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,63,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getLibrayattributeAccess().getPATHKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalOil.g:4336:4: ( (lv_description_2_0= ruleEString ) )
                    // InternalOil.g:4337:5: (lv_description_2_0= ruleEString )
                    {
                    // InternalOil.g:4337:5: (lv_description_2_0= ruleEString )
                    // InternalOil.g:4338:6: lv_description_2_0= ruleEString
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
                    // InternalOil.g:4361:3: (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' )
                    {
                    // InternalOil.g:4361:3: (otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';' )
                    // InternalOil.g:4362:4: otherlv_4= 'CHEADER' otherlv_5= '=' ( (lv_description_6_0= ruleEString ) ) otherlv_7= ';'
                    {
                    otherlv_4=(Token)match(input,64,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getLibrayattributeAccess().getCHEADERKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalOil.g:4370:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalOil.g:4371:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:4371:5: (lv_description_6_0= ruleEString )
                    // InternalOil.g:4372:6: lv_description_6_0= ruleEString
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
                    // InternalOil.g:4395:3: (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' )
                    {
                    // InternalOil.g:4395:3: (otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';' )
                    // InternalOil.g:4396:4: otherlv_8= 'CFILE' otherlv_9= '=' ( (lv_description_10_0= ruleEString ) ) otherlv_11= ';'
                    {
                    otherlv_8=(Token)match(input,65,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getLibrayattributeAccess().getCFILEKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getLibrayattributeAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalOil.g:4404:4: ( (lv_description_10_0= ruleEString ) )
                    // InternalOil.g:4405:5: (lv_description_10_0= ruleEString )
                    {
                    // InternalOil.g:4405:5: (lv_description_10_0= ruleEString )
                    // InternalOil.g:4406:6: lv_description_10_0= ruleEString
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


    // $ANTLR start "entryRuleComRule"
    // InternalOil.g:4432:1: entryRuleComRule returns [EObject current=null] : iv_ruleComRule= ruleComRule EOF ;
    public final EObject entryRuleComRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComRule = null;


        try {
            // InternalOil.g:4432:48: (iv_ruleComRule= ruleComRule EOF )
            // InternalOil.g:4433:2: iv_ruleComRule= ruleComRule EOF
            {
             newCompositeNode(grammarAccess.getComRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComRule=ruleComRule();

            state._fsp--;

             current =iv_ruleComRule; 
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
    // $ANTLR end "entryRuleComRule"


    // $ANTLR start "ruleComRule"
    // InternalOil.g:4439:1: ruleComRule returns [EObject current=null] : ( () otherlv_1= 'COM' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_ComList_4_0= ruleComattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' ) ;
    public final EObject ruleComRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ComList_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:4445:2: ( ( () otherlv_1= 'COM' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_ComList_4_0= ruleComattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' ) )
            // InternalOil.g:4446:2: ( () otherlv_1= 'COM' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_ComList_4_0= ruleComattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' )
            {
            // InternalOil.g:4446:2: ( () otherlv_1= 'COM' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_ComList_4_0= ruleComattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' )
            // InternalOil.g:4447:3: () otherlv_1= 'COM' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_ComList_4_0= ruleComattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';'
            {
            // InternalOil.g:4447:3: ()
            // InternalOil.g:4448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComRuleAccess().getComRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getComRuleAccess().getCOMKeyword_1());
            		
            // InternalOil.g:4458:3: ( (lv_name_2_0= ruleName ) )
            // InternalOil.g:4459:4: (lv_name_2_0= ruleName )
            {
            // InternalOil.g:4459:4: (lv_name_2_0= ruleName )
            // InternalOil.g:4460:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getComRuleAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_64);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:4477:3: (otherlv_3= '{' ( (lv_ComList_4_0= ruleComattribute ) )* otherlv_5= '}' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==22) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalOil.g:4478:4: otherlv_3= '{' ( (lv_ComList_4_0= ruleComattribute ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_65); 

                    				newLeafNode(otherlv_3, grammarAccess.getComRuleAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOil.g:4482:4: ( (lv_ComList_4_0= ruleComattribute ) )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( ((LA110_0>=135 && LA110_0<=142)) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // InternalOil.g:4483:5: (lv_ComList_4_0= ruleComattribute )
                    	    {
                    	    // InternalOil.g:4483:5: (lv_ComList_4_0= ruleComattribute )
                    	    // InternalOil.g:4484:6: lv_ComList_4_0= ruleComattribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getComRuleAccess().getComListComattributeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_65);
                    	    lv_ComList_4_0=ruleComattribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"ComList",
                    	    							lv_ComList_4_0,
                    	    							"org.xtext.example.oil.Oil.Comattribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getComRuleAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:4506:3: ( (lv_description_6_0= ruleEString ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==RULE_STRING) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalOil.g:4507:4: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:4507:4: (lv_description_6_0= ruleEString )
                    // InternalOil.g:4508:5: lv_description_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getComRuleAccess().getDescriptionEStringParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComRuleRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_6_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComRuleAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleComRule"


    // $ANTLR start "entryRuleComattribute"
    // InternalOil.g:4533:1: entryRuleComattribute returns [EObject current=null] : iv_ruleComattribute= ruleComattribute EOF ;
    public final EObject entryRuleComattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComattribute = null;


        try {
            // InternalOil.g:4533:53: (iv_ruleComattribute= ruleComattribute EOF )
            // InternalOil.g:4534:2: iv_ruleComattribute= ruleComattribute EOF
            {
             newCompositeNode(grammarAccess.getComattributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComattribute=ruleComattribute();

            state._fsp--;

             current =iv_ruleComattribute; 
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
    // $ANTLR end "entryRuleComattribute"


    // $ANTLR start "ruleComattribute"
    // InternalOil.g:4540:1: ruleComattribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleComAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleComattribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_name_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:4546:2: ( ( ( (lv_name_0_0= ruleComAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:4547:2: ( ( (lv_name_0_0= ruleComAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:4547:2: ( ( (lv_name_0_0= ruleComAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:4548:3: ( (lv_name_0_0= ruleComAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:4548:3: ( (lv_name_0_0= ruleComAttributeName ) )
            // InternalOil.g:4549:4: (lv_name_0_0= ruleComAttributeName )
            {
            // InternalOil.g:4549:4: (lv_name_0_0= ruleComAttributeName )
            // InternalOil.g:4550:5: lv_name_0_0= ruleComAttributeName
            {

            					newCompositeNode(grammarAccess.getComattributeAccess().getNameComAttributeNameEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_66);
            lv_name_0_0=ruleComAttributeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComattributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.oil.Oil.ComAttributeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:4567:3: (otherlv_1= '=' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==18) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalOil.g:4568:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getComattributeAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:4573:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:4574:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:4574:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:4575:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getComattributeAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComattributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:4592:3: ( (lv_description_3_0= ruleEString ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_STRING) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalOil.g:4593:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:4593:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:4594:5: lv_description_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getComattributeAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComattributeRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getComattributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleComattribute"


    // $ANTLR start "entryRuleTaskRule"
    // InternalOil.g:4619:1: entryRuleTaskRule returns [EObject current=null] : iv_ruleTaskRule= ruleTaskRule EOF ;
    public final EObject entryRuleTaskRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskRule = null;


        try {
            // InternalOil.g:4619:49: (iv_ruleTaskRule= ruleTaskRule EOF )
            // InternalOil.g:4620:2: iv_ruleTaskRule= ruleTaskRule EOF
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
    // InternalOil.g:4626:1: ruleTaskRule returns [EObject current=null] : ( () otherlv_1= 'TASK' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_TaskList_4_0= ruleTaskattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' ) ;
    public final EObject ruleTaskRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_TaskList_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:4632:2: ( ( () otherlv_1= 'TASK' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_TaskList_4_0= ruleTaskattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' ) )
            // InternalOil.g:4633:2: ( () otherlv_1= 'TASK' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_TaskList_4_0= ruleTaskattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' )
            {
            // InternalOil.g:4633:2: ( () otherlv_1= 'TASK' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_TaskList_4_0= ruleTaskattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' )
            // InternalOil.g:4634:3: () otherlv_1= 'TASK' ( (lv_name_2_0= ruleName ) ) (otherlv_3= '{' ( (lv_TaskList_4_0= ruleTaskattribute ) )* otherlv_5= '}' )? ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';'
            {
            // InternalOil.g:4634:3: ()
            // InternalOil.g:4635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskRuleAccess().getTaskRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskRuleAccess().getTASKKeyword_1());
            		
            // InternalOil.g:4645:3: ( (lv_name_2_0= ruleName ) )
            // InternalOil.g:4646:4: (lv_name_2_0= ruleName )
            {
            // InternalOil.g:4646:4: (lv_name_2_0= ruleName )
            // InternalOil.g:4647:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getTaskRuleAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_64);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:4664:3: (otherlv_3= '{' ( (lv_TaskList_4_0= ruleTaskattribute ) )* otherlv_5= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==22) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalOil.g:4665:4: otherlv_3= '{' ( (lv_TaskList_4_0= ruleTaskattribute ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_67); 

                    				newLeafNode(otherlv_3, grammarAccess.getTaskRuleAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalOil.g:4669:4: ( (lv_TaskList_4_0= ruleTaskattribute ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( ((LA115_0>=42 && LA115_0<=44)||(LA115_0>=66 && LA115_0<=67)||LA115_0==70||LA115_0==97||(LA115_0>=146 && LA115_0<=152)) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // InternalOil.g:4670:5: (lv_TaskList_4_0= ruleTaskattribute )
                    	    {
                    	    // InternalOil.g:4670:5: (lv_TaskList_4_0= ruleTaskattribute )
                    	    // InternalOil.g:4671:6: lv_TaskList_4_0= ruleTaskattribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getTaskRuleAccess().getTaskListTaskattributeParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_67);
                    	    lv_TaskList_4_0=ruleTaskattribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTaskRuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"TaskList",
                    	    							lv_TaskList_4_0,
                    	    							"org.xtext.example.oil.Oil.Taskattribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,23,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskRuleAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalOil.g:4693:3: ( (lv_description_6_0= ruleEString ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==RULE_STRING) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalOil.g:4694:4: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:4694:4: (lv_description_6_0= ruleEString )
                    // InternalOil.g:4695:5: lv_description_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getTaskRuleAccess().getDescriptionEStringParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
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
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskRuleAccess().getSemicolonKeyword_5());
            		

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


    // $ANTLR start "entryRuleTaskattribute"
    // InternalOil.g:4720:1: entryRuleTaskattribute returns [EObject current=null] : iv_ruleTaskattribute= ruleTaskattribute EOF ;
    public final EObject entryRuleTaskattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskattribute = null;


        try {
            // InternalOil.g:4720:54: (iv_ruleTaskattribute= ruleTaskattribute EOF )
            // InternalOil.g:4721:2: iv_ruleTaskattribute= ruleTaskattribute EOF
            {
             newCompositeNode(grammarAccess.getTaskattributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskattribute=ruleTaskattribute();

            state._fsp--;

             current =iv_ruleTaskattribute; 
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
    // $ANTLR end "entryRuleTaskattribute"


    // $ANTLR start "ruleTaskattribute"
    // InternalOil.g:4727:1: ruleTaskattribute returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleTaskAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'AUTOSTART' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) | (otherlv_13= 'TIMINGPROTECTION' (otherlv_14= '=' )? ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' ) otherlv_20= ';' ) ) ;
    public final EObject ruleTaskattribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_name_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_parameterList_9_0 = null;

        EObject lv_parameterList_17_0 = null;



        	enterRule();

        try {
            // InternalOil.g:4733:2: ( ( ( ( (lv_name_0_0= ruleTaskAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'AUTOSTART' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) | (otherlv_13= 'TIMINGPROTECTION' (otherlv_14= '=' )? ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' ) otherlv_20= ';' ) ) )
            // InternalOil.g:4734:2: ( ( ( (lv_name_0_0= ruleTaskAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'AUTOSTART' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) | (otherlv_13= 'TIMINGPROTECTION' (otherlv_14= '=' )? ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' ) otherlv_20= ';' ) )
            {
            // InternalOil.g:4734:2: ( ( ( (lv_name_0_0= ruleTaskAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'AUTOSTART' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) | (otherlv_13= 'TIMINGPROTECTION' (otherlv_14= '=' )? ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' ) otherlv_20= ';' ) )
            int alt126=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
            case 70:
            case 97:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
                {
                alt126=1;
                }
                break;
            case 66:
                {
                alt126=2;
                }
                break;
            case 67:
                {
                alt126=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // InternalOil.g:4735:3: ( ( (lv_name_0_0= ruleTaskAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    {
                    // InternalOil.g:4735:3: ( ( (lv_name_0_0= ruleTaskAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    // InternalOil.g:4736:4: ( (lv_name_0_0= ruleTaskAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
                    {
                    // InternalOil.g:4736:4: ( (lv_name_0_0= ruleTaskAttributeName ) )
                    // InternalOil.g:4737:5: (lv_name_0_0= ruleTaskAttributeName )
                    {
                    // InternalOil.g:4737:5: (lv_name_0_0= ruleTaskAttributeName )
                    // InternalOil.g:4738:6: lv_name_0_0= ruleTaskAttributeName
                    {

                    						newCompositeNode(grammarAccess.getTaskattributeAccess().getNameTaskAttributeNameEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_name_0_0=ruleTaskAttributeName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskattributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.xtext.example.oil.Oil.TaskAttributeName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:4755:4: (otherlv_1= '=' )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==18) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // InternalOil.g:4756:5: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getTaskattributeAccess().getEqualsSignKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:4761:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalOil.g:4762:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalOil.g:4762:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalOil.g:4763:6: lv_value_2_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getTaskattributeAccess().getValueAttributeValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskattributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:4780:4: ( (lv_description_3_0= ruleEString ) )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==RULE_STRING) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // InternalOil.g:4781:5: (lv_description_3_0= ruleEString )
                            {
                            // InternalOil.g:4781:5: (lv_description_3_0= ruleEString )
                            // InternalOil.g:4782:6: lv_description_3_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getTaskattributeAccess().getDescriptionEStringParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_3_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTaskattributeRule());
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

                    				newLeafNode(otherlv_4, grammarAccess.getTaskattributeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:4805:3: (otherlv_5= 'AUTOSTART' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' )
                    {
                    // InternalOil.g:4805:3: (otherlv_5= 'AUTOSTART' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' )
                    // InternalOil.g:4806:4: otherlv_5= 'AUTOSTART' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';'
                    {
                    otherlv_5=(Token)match(input,66,FOLLOW_68); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskattributeAccess().getAUTOSTARTKeyword_1_0());
                    			
                    // InternalOil.g:4810:4: (otherlv_6= '=' )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==18) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // InternalOil.g:4811:5: otherlv_6= '='
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_33); 

                            					newLeafNode(otherlv_6, grammarAccess.getTaskattributeAccess().getEqualsSignKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:4816:4: ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' )
                    int alt122=2;
                    int LA122_0 = input.LA(1);

                    if ( (LA122_0==33) ) {
                        alt122=1;
                    }
                    else if ( (LA122_0==34) ) {
                        alt122=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 122, 0, input);

                        throw nvae;
                    }
                    switch (alt122) {
                        case 1 :
                            // InternalOil.g:4817:5: (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' )
                            {
                            // InternalOil.g:4817:5: (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}' )
                            // InternalOil.g:4818:6: otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )* otherlv_10= '}'
                            {
                            otherlv_7=(Token)match(input,33,FOLLOW_12); 

                            						newLeafNode(otherlv_7, grammarAccess.getTaskattributeAccess().getTRUEKeyword_1_2_0_0());
                            					
                            otherlv_8=(Token)match(input,22,FOLLOW_69); 

                            						newLeafNode(otherlv_8, grammarAccess.getTaskattributeAccess().getLeftCurlyBracketKeyword_1_2_0_1());
                            					
                            // InternalOil.g:4826:6: ( (lv_parameterList_9_0= ruleTaskAutostartAttribute ) )*
                            loop121:
                            do {
                                int alt121=2;
                                int LA121_0 = input.LA(1);

                                if ( (LA121_0==47) ) {
                                    alt121=1;
                                }


                                switch (alt121) {
                            	case 1 :
                            	    // InternalOil.g:4827:7: (lv_parameterList_9_0= ruleTaskAutostartAttribute )
                            	    {
                            	    // InternalOil.g:4827:7: (lv_parameterList_9_0= ruleTaskAutostartAttribute )
                            	    // InternalOil.g:4828:8: lv_parameterList_9_0= ruleTaskAutostartAttribute
                            	    {

                            	    								newCompositeNode(grammarAccess.getTaskattributeAccess().getParameterListTaskAutostartAttributeParserRuleCall_1_2_0_2_0());
                            	    							
                            	    pushFollow(FOLLOW_69);
                            	    lv_parameterList_9_0=ruleTaskAutostartAttribute();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getTaskattributeRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameterList",
                            	    									lv_parameterList_9_0,
                            	    									"org.xtext.example.oil.Oil.TaskAutostartAttribute");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop121;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,23,FOLLOW_10); 

                            						newLeafNode(otherlv_10, grammarAccess.getTaskattributeAccess().getRightCurlyBracketKeyword_1_2_0_3());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:4851:5: otherlv_11= 'FALSE'
                            {
                            otherlv_11=(Token)match(input,34,FOLLOW_10); 

                            					newLeafNode(otherlv_11, grammarAccess.getTaskattributeAccess().getFALSEKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTaskattributeAccess().getSemicolonKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:4862:3: (otherlv_13= 'TIMINGPROTECTION' (otherlv_14= '=' )? ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' ) otherlv_20= ';' )
                    {
                    // InternalOil.g:4862:3: (otherlv_13= 'TIMINGPROTECTION' (otherlv_14= '=' )? ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' ) otherlv_20= ';' )
                    // InternalOil.g:4863:4: otherlv_13= 'TIMINGPROTECTION' (otherlv_14= '=' )? ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' ) otherlv_20= ';'
                    {
                    otherlv_13=(Token)match(input,67,FOLLOW_68); 

                    				newLeafNode(otherlv_13, grammarAccess.getTaskattributeAccess().getTIMINGPROTECTIONKeyword_2_0());
                    			
                    // InternalOil.g:4867:4: (otherlv_14= '=' )?
                    int alt123=2;
                    int LA123_0 = input.LA(1);

                    if ( (LA123_0==18) ) {
                        alt123=1;
                    }
                    switch (alt123) {
                        case 1 :
                            // InternalOil.g:4868:5: otherlv_14= '='
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_33); 

                            					newLeafNode(otherlv_14, grammarAccess.getTaskattributeAccess().getEqualsSignKeyword_2_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:4873:4: ( (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' ) | otherlv_19= 'FALSE' )
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==33) ) {
                        alt125=1;
                    }
                    else if ( (LA125_0==34) ) {
                        alt125=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 125, 0, input);

                        throw nvae;
                    }
                    switch (alt125) {
                        case 1 :
                            // InternalOil.g:4874:5: (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' )
                            {
                            // InternalOil.g:4874:5: (otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}' )
                            // InternalOil.g:4875:6: otherlv_15= 'TRUE' otherlv_16= '{' ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )* otherlv_18= '}'
                            {
                            otherlv_15=(Token)match(input,33,FOLLOW_12); 

                            						newLeafNode(otherlv_15, grammarAccess.getTaskattributeAccess().getTRUEKeyword_2_2_0_0());
                            					
                            otherlv_16=(Token)match(input,22,FOLLOW_70); 

                            						newLeafNode(otherlv_16, grammarAccess.getTaskattributeAccess().getLeftCurlyBracketKeyword_2_2_0_1());
                            					
                            // InternalOil.g:4883:6: ( (lv_parameterList_17_0= ruleTaskTimingAttribute ) )*
                            loop124:
                            do {
                                int alt124=2;
                                int LA124_0 = input.LA(1);

                                if ( (LA124_0==68||(LA124_0>=104 && LA124_0<=107)||LA124_0==145) ) {
                                    alt124=1;
                                }


                                switch (alt124) {
                            	case 1 :
                            	    // InternalOil.g:4884:7: (lv_parameterList_17_0= ruleTaskTimingAttribute )
                            	    {
                            	    // InternalOil.g:4884:7: (lv_parameterList_17_0= ruleTaskTimingAttribute )
                            	    // InternalOil.g:4885:8: lv_parameterList_17_0= ruleTaskTimingAttribute
                            	    {

                            	    								newCompositeNode(grammarAccess.getTaskattributeAccess().getParameterListTaskTimingAttributeParserRuleCall_2_2_0_2_0());
                            	    							
                            	    pushFollow(FOLLOW_70);
                            	    lv_parameterList_17_0=ruleTaskTimingAttribute();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getTaskattributeRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameterList",
                            	    									lv_parameterList_17_0,
                            	    									"org.xtext.example.oil.Oil.TaskTimingAttribute");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop124;
                                }
                            } while (true);

                            otherlv_18=(Token)match(input,23,FOLLOW_10); 

                            						newLeafNode(otherlv_18, grammarAccess.getTaskattributeAccess().getRightCurlyBracketKeyword_2_2_0_3());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:4908:5: otherlv_19= 'FALSE'
                            {
                            otherlv_19=(Token)match(input,34,FOLLOW_10); 

                            					newLeafNode(otherlv_19, grammarAccess.getTaskattributeAccess().getFALSEKeyword_2_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_20=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getTaskattributeAccess().getSemicolonKeyword_2_3());
                    			

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
    // $ANTLR end "ruleTaskattribute"


    // $ANTLR start "entryRuleTaskTimingAttribute"
    // InternalOil.g:4922:1: entryRuleTaskTimingAttribute returns [EObject current=null] : iv_ruleTaskTimingAttribute= ruleTaskTimingAttribute EOF ;
    public final EObject entryRuleTaskTimingAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskTimingAttribute = null;


        try {
            // InternalOil.g:4922:60: (iv_ruleTaskTimingAttribute= ruleTaskTimingAttribute EOF )
            // InternalOil.g:4923:2: iv_ruleTaskTimingAttribute= ruleTaskTimingAttribute EOF
            {
             newCompositeNode(grammarAccess.getTaskTimingAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskTimingAttribute=ruleTaskTimingAttribute();

            state._fsp--;

             current =iv_ruleTaskTimingAttribute; 
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
    // $ANTLR end "entryRuleTaskTimingAttribute"


    // $ANTLR start "ruleTaskTimingAttribute"
    // InternalOil.g:4929:1: ruleTaskTimingAttribute returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleTaskTimingAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'RESOURCELOCK' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) ) ;
    public final EObject ruleTaskTimingAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_name_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        Enumerator lv_parameterList_9_0 = null;



        	enterRule();

        try {
            // InternalOil.g:4935:2: ( ( ( ( (lv_name_0_0= ruleTaskTimingAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'RESOURCELOCK' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) ) )
            // InternalOil.g:4936:2: ( ( ( (lv_name_0_0= ruleTaskTimingAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'RESOURCELOCK' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) )
            {
            // InternalOil.g:4936:2: ( ( ( (lv_name_0_0= ruleTaskTimingAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'RESOURCELOCK' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' ) )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=104 && LA132_0<=107)||LA132_0==145) ) {
                alt132=1;
            }
            else if ( (LA132_0==68) ) {
                alt132=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalOil.g:4937:3: ( ( (lv_name_0_0= ruleTaskTimingAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    {
                    // InternalOil.g:4937:3: ( ( (lv_name_0_0= ruleTaskTimingAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    // InternalOil.g:4938:4: ( (lv_name_0_0= ruleTaskTimingAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
                    {
                    // InternalOil.g:4938:4: ( (lv_name_0_0= ruleTaskTimingAttributeName ) )
                    // InternalOil.g:4939:5: (lv_name_0_0= ruleTaskTimingAttributeName )
                    {
                    // InternalOil.g:4939:5: (lv_name_0_0= ruleTaskTimingAttributeName )
                    // InternalOil.g:4940:6: lv_name_0_0= ruleTaskTimingAttributeName
                    {

                    						newCompositeNode(grammarAccess.getTaskTimingAttributeAccess().getNameTaskTimingAttributeNameEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_name_0_0=ruleTaskTimingAttributeName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskTimingAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"org.xtext.example.oil.Oil.TaskTimingAttributeName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:4957:4: (otherlv_1= '=' )?
                    int alt127=2;
                    int LA127_0 = input.LA(1);

                    if ( (LA127_0==18) ) {
                        alt127=1;
                    }
                    switch (alt127) {
                        case 1 :
                            // InternalOil.g:4958:5: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getTaskTimingAttributeAccess().getEqualsSignKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:4963:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalOil.g:4964:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalOil.g:4964:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalOil.g:4965:6: lv_value_2_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getTaskTimingAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskTimingAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:4982:4: ( (lv_description_3_0= ruleEString ) )?
                    int alt128=2;
                    int LA128_0 = input.LA(1);

                    if ( (LA128_0==RULE_STRING) ) {
                        alt128=1;
                    }
                    switch (alt128) {
                        case 1 :
                            // InternalOil.g:4983:5: (lv_description_3_0= ruleEString )
                            {
                            // InternalOil.g:4983:5: (lv_description_3_0= ruleEString )
                            // InternalOil.g:4984:6: lv_description_3_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getTaskTimingAttributeAccess().getDescriptionEStringParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_3_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getTaskTimingAttributeRule());
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

                    				newLeafNode(otherlv_4, grammarAccess.getTaskTimingAttributeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:5007:3: (otherlv_5= 'RESOURCELOCK' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' )
                    {
                    // InternalOil.g:5007:3: (otherlv_5= 'RESOURCELOCK' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';' )
                    // InternalOil.g:5008:4: otherlv_5= 'RESOURCELOCK' (otherlv_6= '=' )? ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' ) otherlv_12= ';'
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_68); 

                    				newLeafNode(otherlv_5, grammarAccess.getTaskTimingAttributeAccess().getRESOURCELOCKKeyword_1_0());
                    			
                    // InternalOil.g:5012:4: (otherlv_6= '=' )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==18) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // InternalOil.g:5013:5: otherlv_6= '='
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_33); 

                            					newLeafNode(otherlv_6, grammarAccess.getTaskTimingAttributeAccess().getEqualsSignKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:5018:4: ( (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' ) | otherlv_11= 'FALSE' )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==33) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==34) ) {
                        alt131=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // InternalOil.g:5019:5: (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' )
                            {
                            // InternalOil.g:5019:5: (otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}' )
                            // InternalOil.g:5020:6: otherlv_7= 'TRUE' otherlv_8= '{' ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )* otherlv_10= '}'
                            {
                            otherlv_7=(Token)match(input,33,FOLLOW_12); 

                            						newLeafNode(otherlv_7, grammarAccess.getTaskTimingAttributeAccess().getTRUEKeyword_1_2_0_0());
                            					
                            otherlv_8=(Token)match(input,22,FOLLOW_71); 

                            						newLeafNode(otherlv_8, grammarAccess.getTaskTimingAttributeAccess().getLeftCurlyBracketKeyword_1_2_0_1());
                            					
                            // InternalOil.g:5028:6: ( (lv_parameterList_9_0= ruleTaskTimingrLockAttribute ) )*
                            loop130:
                            do {
                                int alt130=2;
                                int LA130_0 = input.LA(1);

                                if ( ((LA130_0>=143 && LA130_0<=144)) ) {
                                    alt130=1;
                                }


                                switch (alt130) {
                            	case 1 :
                            	    // InternalOil.g:5029:7: (lv_parameterList_9_0= ruleTaskTimingrLockAttribute )
                            	    {
                            	    // InternalOil.g:5029:7: (lv_parameterList_9_0= ruleTaskTimingrLockAttribute )
                            	    // InternalOil.g:5030:8: lv_parameterList_9_0= ruleTaskTimingrLockAttribute
                            	    {

                            	    								newCompositeNode(grammarAccess.getTaskTimingAttributeAccess().getParameterListTaskTimingrLockAttributeEnumRuleCall_1_2_0_2_0());
                            	    							
                            	    pushFollow(FOLLOW_71);
                            	    lv_parameterList_9_0=ruleTaskTimingrLockAttribute();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getTaskTimingAttributeRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameterList",
                            	    									lv_parameterList_9_0,
                            	    									"org.xtext.example.oil.Oil.TaskTimingrLockAttribute");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop130;
                                }
                            } while (true);

                            otherlv_10=(Token)match(input,23,FOLLOW_10); 

                            						newLeafNode(otherlv_10, grammarAccess.getTaskTimingAttributeAccess().getRightCurlyBracketKeyword_1_2_0_3());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:5053:5: otherlv_11= 'FALSE'
                            {
                            otherlv_11=(Token)match(input,34,FOLLOW_10); 

                            					newLeafNode(otherlv_11, grammarAccess.getTaskTimingAttributeAccess().getFALSEKeyword_1_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getTaskTimingAttributeAccess().getSemicolonKeyword_1_3());
                    			

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
    // $ANTLR end "ruleTaskTimingAttribute"


    // $ANTLR start "entryRuleTaskAutostartAttribute"
    // InternalOil.g:5067:1: entryRuleTaskAutostartAttribute returns [EObject current=null] : iv_ruleTaskAutostartAttribute= ruleTaskAutostartAttribute EOF ;
    public final EObject entryRuleTaskAutostartAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskAutostartAttribute = null;


        try {
            // InternalOil.g:5067:63: (iv_ruleTaskAutostartAttribute= ruleTaskAutostartAttribute EOF )
            // InternalOil.g:5068:2: iv_ruleTaskAutostartAttribute= ruleTaskAutostartAttribute EOF
            {
             newCompositeNode(grammarAccess.getTaskAutostartAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskAutostartAttribute=ruleTaskAutostartAttribute();

            state._fsp--;

             current =iv_ruleTaskAutostartAttribute; 
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
    // $ANTLR end "entryRuleTaskAutostartAttribute"


    // $ANTLR start "ruleTaskAutostartAttribute"
    // InternalOil.g:5074:1: ruleTaskAutostartAttribute returns [EObject current=null] : (otherlv_0= 'APPMODE' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleTaskAutostartAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:5080:2: ( (otherlv_0= 'APPMODE' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:5081:2: (otherlv_0= 'APPMODE' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:5081:2: (otherlv_0= 'APPMODE' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:5082:3: otherlv_0= 'APPMODE' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAutostartAttributeAccess().getAPPMODEKeyword_0());
            		
            // InternalOil.g:5086:3: (otherlv_1= '=' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==18) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalOil.g:5087:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getTaskAutostartAttributeAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:5092:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:5093:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:5093:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:5094:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getTaskAutostartAttributeAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskAutostartAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:5111:3: ( (lv_description_3_0= ruleEString ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_STRING) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalOil.g:5112:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:5112:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:5113:5: lv_description_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getTaskAutostartAttributeAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTaskAutostartAttributeRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getTaskAutostartAttributeAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleTaskAutostartAttribute"


    // $ANTLR start "entryRuleResourceRule"
    // InternalOil.g:5138:1: entryRuleResourceRule returns [EObject current=null] : iv_ruleResourceRule= ruleResourceRule EOF ;
    public final EObject entryRuleResourceRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRule = null;


        try {
            // InternalOil.g:5138:53: (iv_ruleResourceRule= ruleResourceRule EOF )
            // InternalOil.g:5139:2: iv_ruleResourceRule= ruleResourceRule EOF
            {
             newCompositeNode(grammarAccess.getResourceRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceRule=ruleResourceRule();

            state._fsp--;

             current =iv_ruleResourceRule; 
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
    // $ANTLR end "entryRuleResourceRule"


    // $ANTLR start "ruleResourceRule"
    // InternalOil.g:5145:1: ruleResourceRule returns [EObject current=null] : ( () otherlv_1= 'RESOURCE' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ResourceList_4_0= ruleResourceattribute ) )* otherlv_5= '}' ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' ) ;
    public final EObject ruleResourceRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_ResourceList_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;



        	enterRule();

        try {
            // InternalOil.g:5151:2: ( ( () otherlv_1= 'RESOURCE' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ResourceList_4_0= ruleResourceattribute ) )* otherlv_5= '}' ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' ) )
            // InternalOil.g:5152:2: ( () otherlv_1= 'RESOURCE' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ResourceList_4_0= ruleResourceattribute ) )* otherlv_5= '}' ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' )
            {
            // InternalOil.g:5152:2: ( () otherlv_1= 'RESOURCE' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ResourceList_4_0= ruleResourceattribute ) )* otherlv_5= '}' ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';' )
            // InternalOil.g:5153:3: () otherlv_1= 'RESOURCE' ( (lv_name_2_0= ruleName ) ) otherlv_3= '{' ( (lv_ResourceList_4_0= ruleResourceattribute ) )* otherlv_5= '}' ( (lv_description_6_0= ruleEString ) )? otherlv_7= ';'
            {
            // InternalOil.g:5153:3: ()
            // InternalOil.g:5154:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceRuleAccess().getResourceRuleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceRuleAccess().getRESOURCEKeyword_1());
            		
            // InternalOil.g:5164:3: ( (lv_name_2_0= ruleName ) )
            // InternalOil.g:5165:4: (lv_name_2_0= ruleName )
            {
            // InternalOil.g:5165:4: (lv_name_2_0= ruleName )
            // InternalOil.g:5166:5: lv_name_2_0= ruleName
            {

            					newCompositeNode(grammarAccess.getResourceRuleAccess().getNameNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceRuleAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalOil.g:5187:3: ( (lv_ResourceList_4_0= ruleResourceattribute ) )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==69) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalOil.g:5188:4: (lv_ResourceList_4_0= ruleResourceattribute )
            	    {
            	    // InternalOil.g:5188:4: (lv_ResourceList_4_0= ruleResourceattribute )
            	    // InternalOil.g:5189:5: lv_ResourceList_4_0= ruleResourceattribute
            	    {

            	    					newCompositeNode(grammarAccess.getResourceRuleAccess().getResourceListResourceattributeParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_72);
            	    lv_ResourceList_4_0=ruleResourceattribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getResourceRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ResourceList",
            	    						lv_ResourceList_4_0,
            	    						"org.xtext.example.oil.Oil.Resourceattribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            otherlv_5=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getResourceRuleAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalOil.g:5210:3: ( (lv_description_6_0= ruleEString ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RULE_STRING) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalOil.g:5211:4: (lv_description_6_0= ruleEString )
                    {
                    // InternalOil.g:5211:4: (lv_description_6_0= ruleEString )
                    // InternalOil.g:5212:5: lv_description_6_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getResourceRuleAccess().getDescriptionEStringParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getResourceRuleRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_6_0,
                    						"org.xtext.example.oil.Oil.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getResourceRuleAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleResourceRule"


    // $ANTLR start "entryRuleResourceattribute"
    // InternalOil.g:5237:1: entryRuleResourceattribute returns [EObject current=null] : iv_ruleResourceattribute= ruleResourceattribute EOF ;
    public final EObject entryRuleResourceattribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceattribute = null;


        try {
            // InternalOil.g:5237:58: (iv_ruleResourceattribute= ruleResourceattribute EOF )
            // InternalOil.g:5238:2: iv_ruleResourceattribute= ruleResourceattribute EOF
            {
             newCompositeNode(grammarAccess.getResourceattributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceattribute=ruleResourceattribute();

            state._fsp--;

             current =iv_ruleResourceattribute; 
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
    // $ANTLR end "entryRuleResourceattribute"


    // $ANTLR start "ruleResourceattribute"
    // InternalOil.g:5244:1: ruleResourceattribute returns [EObject current=null] : (otherlv_0= 'RESOURCEPROPERTY' otherlv_1= '=' ( (lv_resourceRange_2_0= ruleResourceRange ) ) otherlv_3= ';' ) ;
    public final EObject ruleResourceattribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_resourceRange_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:5250:2: ( (otherlv_0= 'RESOURCEPROPERTY' otherlv_1= '=' ( (lv_resourceRange_2_0= ruleResourceRange ) ) otherlv_3= ';' ) )
            // InternalOil.g:5251:2: (otherlv_0= 'RESOURCEPROPERTY' otherlv_1= '=' ( (lv_resourceRange_2_0= ruleResourceRange ) ) otherlv_3= ';' )
            {
            // InternalOil.g:5251:2: (otherlv_0= 'RESOURCEPROPERTY' otherlv_1= '=' ( (lv_resourceRange_2_0= ruleResourceRange ) ) otherlv_3= ';' )
            // InternalOil.g:5252:3: otherlv_0= 'RESOURCEPROPERTY' otherlv_1= '=' ( (lv_resourceRange_2_0= ruleResourceRange ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceattributeAccess().getRESOURCEPROPERTYKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceattributeAccess().getEqualsSignKeyword_1());
            		
            // InternalOil.g:5260:3: ( (lv_resourceRange_2_0= ruleResourceRange ) )
            // InternalOil.g:5261:4: (lv_resourceRange_2_0= ruleResourceRange )
            {
            // InternalOil.g:5261:4: (lv_resourceRange_2_0= ruleResourceRange )
            // InternalOil.g:5262:5: lv_resourceRange_2_0= ruleResourceRange
            {

            					newCompositeNode(grammarAccess.getResourceattributeAccess().getResourceRangeResourceRangeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_resourceRange_2_0=ruleResourceRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceattributeRule());
            					}
            					set(
            						current,
            						"resourceRange",
            						lv_resourceRange_2_0,
            						"org.xtext.example.oil.Oil.ResourceRange");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getResourceattributeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleResourceattribute"


    // $ANTLR start "entryRuleAlarmRule"
    // InternalOil.g:5287:1: entryRuleAlarmRule returns [EObject current=null] : iv_ruleAlarmRule= ruleAlarmRule EOF ;
    public final EObject entryRuleAlarmRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmRule = null;


        try {
            // InternalOil.g:5287:50: (iv_ruleAlarmRule= ruleAlarmRule EOF )
            // InternalOil.g:5288:2: iv_ruleAlarmRule= ruleAlarmRule EOF
            {
             newCompositeNode(grammarAccess.getAlarmRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmRule=ruleAlarmRule();

            state._fsp--;

             current =iv_ruleAlarmRule; 
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
    // $ANTLR end "entryRuleAlarmRule"


    // $ANTLR start "ruleAlarmRule"
    // InternalOil.g:5294:1: ruleAlarmRule returns [EObject current=null] : (otherlv_0= 'ALARM' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' ) ;
    public final EObject ruleAlarmRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_AlarmList_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:5300:2: ( (otherlv_0= 'ALARM' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' ) )
            // InternalOil.g:5301:2: (otherlv_0= 'ALARM' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' )
            {
            // InternalOil.g:5301:2: (otherlv_0= 'ALARM' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' )
            // InternalOil.g:5302:3: otherlv_0= 'ALARM' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )* otherlv_4= '}' ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAlarmRuleAccess().getALARMKeyword_0());
            		
            // InternalOil.g:5306:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:5307:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:5307:4: (lv_name_1_0= ruleName )
            // InternalOil.g:5308:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getAlarmRuleAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlarmRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:5325:3: (otherlv_2= '{' ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )* otherlv_4= '}' )
            // InternalOil.g:5326:4: otherlv_2= '{' ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )* otherlv_4= '}'
            {
            otherlv_2=(Token)match(input,22,FOLLOW_74); 

            				newLeafNode(otherlv_2, grammarAccess.getAlarmRuleAccess().getLeftCurlyBracketKeyword_2_0());
            			
            // InternalOil.g:5330:4: ( (lv_AlarmList_3_0= ruleAlarmAttribute ) )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==29||LA137_0==66||(LA137_0>=70 && LA137_0<=71)) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // InternalOil.g:5331:5: (lv_AlarmList_3_0= ruleAlarmAttribute )
            	    {
            	    // InternalOil.g:5331:5: (lv_AlarmList_3_0= ruleAlarmAttribute )
            	    // InternalOil.g:5332:6: lv_AlarmList_3_0= ruleAlarmAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getAlarmRuleAccess().getAlarmListAlarmAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_74);
            	    lv_AlarmList_3_0=ruleAlarmAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAlarmRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"AlarmList",
            	    							lv_AlarmList_3_0,
            	    							"org.xtext.example.oil.Oil.AlarmAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            				newLeafNode(otherlv_4, grammarAccess.getAlarmRuleAccess().getRightCurlyBracketKeyword_2_2());
            			

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAlarmRuleAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAlarmRule"


    // $ANTLR start "entryRuleAlarmAttribute"
    // InternalOil.g:5362:1: entryRuleAlarmAttribute returns [EObject current=null] : iv_ruleAlarmAttribute= ruleAlarmAttribute EOF ;
    public final EObject entryRuleAlarmAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmAttribute = null;


        try {
            // InternalOil.g:5362:55: (iv_ruleAlarmAttribute= ruleAlarmAttribute EOF )
            // InternalOil.g:5363:2: iv_ruleAlarmAttribute= ruleAlarmAttribute EOF
            {
             newCompositeNode(grammarAccess.getAlarmAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmAttribute=ruleAlarmAttribute();

            state._fsp--;

             current =iv_ruleAlarmAttribute; 
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
    // $ANTLR end "entryRuleAlarmAttribute"


    // $ANTLR start "ruleAlarmAttribute"
    // InternalOil.g:5369:1: ruleAlarmAttribute returns [EObject current=null] : ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'ACTION' otherlv_9= '=' ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' ) otherlv_19= ';' ) ) ;
    public final EObject ruleAlarmAttribute() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_parameterList_10_0 = null;

        EObject lv_parameterList_16_0 = null;



        	enterRule();

        try {
            // InternalOil.g:5375:2: ( ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'ACTION' otherlv_9= '=' ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' ) otherlv_19= ';' ) ) )
            // InternalOil.g:5376:2: ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'ACTION' otherlv_9= '=' ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' ) otherlv_19= ';' ) )
            {
            // InternalOil.g:5376:2: ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'ACTION' otherlv_9= '=' ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' ) otherlv_19= ';' ) )
            int alt140=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt140=1;
                }
                break;
            case 70:
                {
                alt140=2;
                }
                break;
            case 71:
                {
                alt140=3;
                }
                break;
            case 66:
                {
                alt140=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }

            switch (alt140) {
                case 1 :
                    // InternalOil.g:5377:3: (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' )
                    {
                    // InternalOil.g:5377:3: (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' )
                    // InternalOil.g:5378:4: otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlarmAttributeAccess().getCOUNTERKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getAlarmAttributeAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalOil.g:5386:4: ( (lv_name_2_0= ruleName ) )
                    // InternalOil.g:5387:5: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:5387:5: (lv_name_2_0= ruleName )
                    // InternalOil.g:5388:6: lv_name_2_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getAlarmAttributeAccess().getNameNameParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlarmAttributeAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:5411:3: (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
                    {
                    // InternalOil.g:5411:3: (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
                    // InternalOil.g:5412:4: otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';'
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlarmAttributeAccess().getACCESSING_APPLICATIONKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlarmAttributeAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalOil.g:5420:4: ( (lv_name_6_0= ruleName ) )
                    // InternalOil.g:5421:5: (lv_name_6_0= ruleName )
                    {
                    // InternalOil.g:5421:5: (lv_name_6_0= ruleName )
                    // InternalOil.g:5422:6: lv_name_6_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getAlarmAttributeAccess().getNameNameParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_6_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlarmAttributeAccess().getSemicolonKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:5445:3: (otherlv_8= 'ACTION' otherlv_9= '=' ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) ) otherlv_11= ';' )
                    {
                    // InternalOil.g:5445:3: (otherlv_8= 'ACTION' otherlv_9= '=' ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) ) otherlv_11= ';' )
                    // InternalOil.g:5446:4: otherlv_8= 'ACTION' otherlv_9= '=' ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) ) otherlv_11= ';'
                    {
                    otherlv_8=(Token)match(input,71,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlarmAttributeAccess().getACTIONKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_75); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlarmAttributeAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalOil.g:5454:4: ( (lv_parameterList_10_0= ruleAlarmActionAttribute ) )
                    // InternalOil.g:5455:5: (lv_parameterList_10_0= ruleAlarmActionAttribute )
                    {
                    // InternalOil.g:5455:5: (lv_parameterList_10_0= ruleAlarmActionAttribute )
                    // InternalOil.g:5456:6: lv_parameterList_10_0= ruleAlarmActionAttribute
                    {

                    						newCompositeNode(grammarAccess.getAlarmAttributeAccess().getParameterListAlarmActionAttributeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameterList_10_0=ruleAlarmActionAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmAttributeRule());
                    						}
                    						add(
                    							current,
                    							"parameterList",
                    							lv_parameterList_10_0,
                    							"org.xtext.example.oil.Oil.AlarmActionAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlarmAttributeAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:5479:3: (otherlv_12= 'AUTOSTART' otherlv_13= '=' ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' ) otherlv_19= ';' )
                    {
                    // InternalOil.g:5479:3: (otherlv_12= 'AUTOSTART' otherlv_13= '=' ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' ) otherlv_19= ';' )
                    // InternalOil.g:5480:4: otherlv_12= 'AUTOSTART' otherlv_13= '=' ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' ) otherlv_19= ';'
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlarmAttributeAccess().getAUTOSTARTKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_33); 

                    				newLeafNode(otherlv_13, grammarAccess.getAlarmAttributeAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalOil.g:5488:4: ( (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' ) | otherlv_18= 'FALSE' )
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==33) ) {
                        alt139=1;
                    }
                    else if ( (LA139_0==34) ) {
                        alt139=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 139, 0, input);

                        throw nvae;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalOil.g:5489:5: (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' )
                            {
                            // InternalOil.g:5489:5: (otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}' )
                            // InternalOil.g:5490:6: otherlv_14= 'TRUE' otherlv_15= '{' ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )* otherlv_17= '}'
                            {
                            otherlv_14=(Token)match(input,33,FOLLOW_12); 

                            						newLeafNode(otherlv_14, grammarAccess.getAlarmAttributeAccess().getTRUEKeyword_3_2_0_0());
                            					
                            otherlv_15=(Token)match(input,22,FOLLOW_76); 

                            						newLeafNode(otherlv_15, grammarAccess.getAlarmAttributeAccess().getLeftCurlyBracketKeyword_3_2_0_1());
                            					
                            // InternalOil.g:5498:6: ( (lv_parameterList_16_0= ruleAlarmAutostartAttribute ) )*
                            loop138:
                            do {
                                int alt138=2;
                                int LA138_0 = input.LA(1);

                                if ( (LA138_0==47||(LA138_0>=76 && LA138_0<=77)) ) {
                                    alt138=1;
                                }


                                switch (alt138) {
                            	case 1 :
                            	    // InternalOil.g:5499:7: (lv_parameterList_16_0= ruleAlarmAutostartAttribute )
                            	    {
                            	    // InternalOil.g:5499:7: (lv_parameterList_16_0= ruleAlarmAutostartAttribute )
                            	    // InternalOil.g:5500:8: lv_parameterList_16_0= ruleAlarmAutostartAttribute
                            	    {

                            	    								newCompositeNode(grammarAccess.getAlarmAttributeAccess().getParameterListAlarmAutostartAttributeParserRuleCall_3_2_0_2_0());
                            	    							
                            	    pushFollow(FOLLOW_76);
                            	    lv_parameterList_16_0=ruleAlarmAutostartAttribute();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getAlarmAttributeRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameterList",
                            	    									lv_parameterList_16_0,
                            	    									"org.xtext.example.oil.Oil.AlarmAutostartAttribute");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop138;
                                }
                            } while (true);

                            otherlv_17=(Token)match(input,23,FOLLOW_10); 

                            						newLeafNode(otherlv_17, grammarAccess.getAlarmAttributeAccess().getRightCurlyBracketKeyword_3_2_0_3());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:5523:5: otherlv_18= 'FALSE'
                            {
                            otherlv_18=(Token)match(input,34,FOLLOW_10); 

                            					newLeafNode(otherlv_18, grammarAccess.getAlarmAttributeAccess().getFALSEKeyword_3_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getAlarmAttributeAccess().getSemicolonKeyword_3_3());
                    			

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
    // $ANTLR end "ruleAlarmAttribute"


    // $ANTLR start "entryRuleAlarmActionAttribute"
    // InternalOil.g:5537:1: entryRuleAlarmActionAttribute returns [EObject current=null] : iv_ruleAlarmActionAttribute= ruleAlarmActionAttribute EOF ;
    public final EObject entryRuleAlarmActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmActionAttribute = null;


        try {
            // InternalOil.g:5537:61: (iv_ruleAlarmActionAttribute= ruleAlarmActionAttribute EOF )
            // InternalOil.g:5538:2: iv_ruleAlarmActionAttribute= ruleAlarmActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getAlarmActionAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmActionAttribute=ruleAlarmActionAttribute();

            state._fsp--;

             current =iv_ruleAlarmActionAttribute; 
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
    // $ANTLR end "entryRuleAlarmActionAttribute"


    // $ANTLR start "ruleAlarmActionAttribute"
    // InternalOil.g:5544:1: ruleAlarmActionAttribute returns [EObject current=null] : ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'INCREMENTCOUNTER' otherlv_9= '{' ( (lv_incrementcounter_10_0= ruleIncrementCounter ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) | (otherlv_16= 'SETEVENT' otherlv_17= '{' ( (lv_setevent_18_0= ruleSetevent ) ) (otherlv_19= '=' )? ( (lv_value_20_0= ruleAttributeValue ) ) ( (lv_description_21_0= ruleEString ) )? otherlv_22= ';' otherlv_23= '}' ) | (otherlv_24= 'ALARMCALLBACK' otherlv_25= '{' ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) ) (otherlv_27= '=' )? ( (lv_value_28_0= ruleAttributeValue ) ) ( (lv_description_29_0= ruleEString ) )? otherlv_30= ';' otherlv_31= '}' ) ) ;
    public final EObject ruleAlarmActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Enumerator lv_activatetask_2_0 = null;

        EObject lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_incrementcounter_10_0 = null;

        EObject lv_value_12_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        Enumerator lv_setevent_18_0 = null;

        EObject lv_value_20_0 = null;

        AntlrDatatypeRuleToken lv_description_21_0 = null;

        Enumerator lv_alarmcallback_26_0 = null;

        EObject lv_value_28_0 = null;

        AntlrDatatypeRuleToken lv_description_29_0 = null;



        	enterRule();

        try {
            // InternalOil.g:5550:2: ( ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'INCREMENTCOUNTER' otherlv_9= '{' ( (lv_incrementcounter_10_0= ruleIncrementCounter ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) | (otherlv_16= 'SETEVENT' otherlv_17= '{' ( (lv_setevent_18_0= ruleSetevent ) ) (otherlv_19= '=' )? ( (lv_value_20_0= ruleAttributeValue ) ) ( (lv_description_21_0= ruleEString ) )? otherlv_22= ';' otherlv_23= '}' ) | (otherlv_24= 'ALARMCALLBACK' otherlv_25= '{' ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) ) (otherlv_27= '=' )? ( (lv_value_28_0= ruleAttributeValue ) ) ( (lv_description_29_0= ruleEString ) )? otherlv_30= ';' otherlv_31= '}' ) ) )
            // InternalOil.g:5551:2: ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'INCREMENTCOUNTER' otherlv_9= '{' ( (lv_incrementcounter_10_0= ruleIncrementCounter ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) | (otherlv_16= 'SETEVENT' otherlv_17= '{' ( (lv_setevent_18_0= ruleSetevent ) ) (otherlv_19= '=' )? ( (lv_value_20_0= ruleAttributeValue ) ) ( (lv_description_21_0= ruleEString ) )? otherlv_22= ';' otherlv_23= '}' ) | (otherlv_24= 'ALARMCALLBACK' otherlv_25= '{' ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) ) (otherlv_27= '=' )? ( (lv_value_28_0= ruleAttributeValue ) ) ( (lv_description_29_0= ruleEString ) )? otherlv_30= ';' otherlv_31= '}' ) )
            {
            // InternalOil.g:5551:2: ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'INCREMENTCOUNTER' otherlv_9= '{' ( (lv_incrementcounter_10_0= ruleIncrementCounter ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) | (otherlv_16= 'SETEVENT' otherlv_17= '{' ( (lv_setevent_18_0= ruleSetevent ) ) (otherlv_19= '=' )? ( (lv_value_20_0= ruleAttributeValue ) ) ( (lv_description_21_0= ruleEString ) )? otherlv_22= ';' otherlv_23= '}' ) | (otherlv_24= 'ALARMCALLBACK' otherlv_25= '{' ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) ) (otherlv_27= '=' )? ( (lv_value_28_0= ruleAttributeValue ) ) ( (lv_description_29_0= ruleEString ) )? otherlv_30= ';' otherlv_31= '}' ) )
            int alt149=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt149=1;
                }
                break;
            case 73:
                {
                alt149=2;
                }
                break;
            case 74:
                {
                alt149=3;
                }
                break;
            case 75:
                {
                alt149=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // InternalOil.g:5552:3: (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' )
                    {
                    // InternalOil.g:5552:3: (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' )
                    // InternalOil.g:5553:4: otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}'
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlarmActionAttributeAccess().getACTIVATETASKKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_77); 

                    				newLeafNode(otherlv_1, grammarAccess.getAlarmActionAttributeAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalOil.g:5561:4: ( (lv_activatetask_2_0= ruleActivateTask ) )
                    // InternalOil.g:5562:5: (lv_activatetask_2_0= ruleActivateTask )
                    {
                    // InternalOil.g:5562:5: (lv_activatetask_2_0= ruleActivateTask )
                    // InternalOil.g:5563:6: lv_activatetask_2_0= ruleActivateTask
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getActivatetaskActivateTaskEnumRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_activatetask_2_0=ruleActivateTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"activatetask",
                    							lv_activatetask_2_0,
                    							"org.xtext.example.oil.Oil.ActivateTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5580:4: (otherlv_3= '=' )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==18) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // InternalOil.g:5581:5: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_3, grammarAccess.getAlarmActionAttributeAccess().getEqualsSignKeyword_0_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:5586:4: ( (lv_value_4_0= ruleAttributeValue ) )
                    // InternalOil.g:5587:5: (lv_value_4_0= ruleAttributeValue )
                    {
                    // InternalOil.g:5587:5: (lv_value_4_0= ruleAttributeValue )
                    // InternalOil.g:5588:6: lv_value_4_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getValueAttributeValueParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_4_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5605:4: ( (lv_description_5_0= ruleEString ) )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==RULE_STRING) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // InternalOil.g:5606:5: (lv_description_5_0= ruleEString )
                            {
                            // InternalOil.g:5606:5: (lv_description_5_0= ruleEString )
                            // InternalOil.g:5607:6: lv_description_5_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getDescriptionEStringParserRuleCall_0_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_5_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
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

                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlarmActionAttributeAccess().getSemicolonKeyword_0_6());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlarmActionAttributeAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:5634:3: (otherlv_8= 'INCREMENTCOUNTER' otherlv_9= '{' ( (lv_incrementcounter_10_0= ruleIncrementCounter ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' )
                    {
                    // InternalOil.g:5634:3: (otherlv_8= 'INCREMENTCOUNTER' otherlv_9= '{' ( (lv_incrementcounter_10_0= ruleIncrementCounter ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' )
                    // InternalOil.g:5635:4: otherlv_8= 'INCREMENTCOUNTER' otherlv_9= '{' ( (lv_incrementcounter_10_0= ruleIncrementCounter ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}'
                    {
                    otherlv_8=(Token)match(input,73,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlarmActionAttributeAccess().getINCREMENTCOUNTERKeyword_1_0());
                    			
                    otherlv_9=(Token)match(input,22,FOLLOW_78); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlarmActionAttributeAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalOil.g:5643:4: ( (lv_incrementcounter_10_0= ruleIncrementCounter ) )
                    // InternalOil.g:5644:5: (lv_incrementcounter_10_0= ruleIncrementCounter )
                    {
                    // InternalOil.g:5644:5: (lv_incrementcounter_10_0= ruleIncrementCounter )
                    // InternalOil.g:5645:6: lv_incrementcounter_10_0= ruleIncrementCounter
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getIncrementcounterIncrementCounterEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_incrementcounter_10_0=ruleIncrementCounter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"incrementcounter",
                    							lv_incrementcounter_10_0,
                    							"org.xtext.example.oil.Oil.IncrementCounter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5662:4: (otherlv_11= '=' )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==18) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // InternalOil.g:5663:5: otherlv_11= '='
                            {
                            otherlv_11=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_11, grammarAccess.getAlarmActionAttributeAccess().getEqualsSignKeyword_1_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:5668:4: ( (lv_value_12_0= ruleAttributeValue ) )
                    // InternalOil.g:5669:5: (lv_value_12_0= ruleAttributeValue )
                    {
                    // InternalOil.g:5669:5: (lv_value_12_0= ruleAttributeValue )
                    // InternalOil.g:5670:6: lv_value_12_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getValueAttributeValueParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_12_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5687:4: ( (lv_description_13_0= ruleEString ) )?
                    int alt144=2;
                    int LA144_0 = input.LA(1);

                    if ( (LA144_0==RULE_STRING) ) {
                        alt144=1;
                    }
                    switch (alt144) {
                        case 1 :
                            // InternalOil.g:5688:5: (lv_description_13_0= ruleEString )
                            {
                            // InternalOil.g:5688:5: (lv_description_13_0= ruleEString )
                            // InternalOil.g:5689:6: lv_description_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getDescriptionEStringParserRuleCall_1_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_13_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_13_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getAlarmActionAttributeAccess().getSemicolonKeyword_1_6());
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getAlarmActionAttributeAccess().getRightCurlyBracketKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:5716:3: (otherlv_16= 'SETEVENT' otherlv_17= '{' ( (lv_setevent_18_0= ruleSetevent ) ) (otherlv_19= '=' )? ( (lv_value_20_0= ruleAttributeValue ) ) ( (lv_description_21_0= ruleEString ) )? otherlv_22= ';' otherlv_23= '}' )
                    {
                    // InternalOil.g:5716:3: (otherlv_16= 'SETEVENT' otherlv_17= '{' ( (lv_setevent_18_0= ruleSetevent ) ) (otherlv_19= '=' )? ( (lv_value_20_0= ruleAttributeValue ) ) ( (lv_description_21_0= ruleEString ) )? otherlv_22= ';' otherlv_23= '}' )
                    // InternalOil.g:5717:4: otherlv_16= 'SETEVENT' otherlv_17= '{' ( (lv_setevent_18_0= ruleSetevent ) ) (otherlv_19= '=' )? ( (lv_value_20_0= ruleAttributeValue ) ) ( (lv_description_21_0= ruleEString ) )? otherlv_22= ';' otherlv_23= '}'
                    {
                    otherlv_16=(Token)match(input,74,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getAlarmActionAttributeAccess().getSETEVENTKeyword_2_0());
                    			
                    otherlv_17=(Token)match(input,22,FOLLOW_79); 

                    				newLeafNode(otherlv_17, grammarAccess.getAlarmActionAttributeAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalOil.g:5725:4: ( (lv_setevent_18_0= ruleSetevent ) )
                    // InternalOil.g:5726:5: (lv_setevent_18_0= ruleSetevent )
                    {
                    // InternalOil.g:5726:5: (lv_setevent_18_0= ruleSetevent )
                    // InternalOil.g:5727:6: lv_setevent_18_0= ruleSetevent
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getSeteventSeteventEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_setevent_18_0=ruleSetevent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"setevent",
                    							lv_setevent_18_0,
                    							"org.xtext.example.oil.Oil.Setevent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5744:4: (otherlv_19= '=' )?
                    int alt145=2;
                    int LA145_0 = input.LA(1);

                    if ( (LA145_0==18) ) {
                        alt145=1;
                    }
                    switch (alt145) {
                        case 1 :
                            // InternalOil.g:5745:5: otherlv_19= '='
                            {
                            otherlv_19=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_19, grammarAccess.getAlarmActionAttributeAccess().getEqualsSignKeyword_2_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:5750:4: ( (lv_value_20_0= ruleAttributeValue ) )
                    // InternalOil.g:5751:5: (lv_value_20_0= ruleAttributeValue )
                    {
                    // InternalOil.g:5751:5: (lv_value_20_0= ruleAttributeValue )
                    // InternalOil.g:5752:6: lv_value_20_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getValueAttributeValueParserRuleCall_2_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_20_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_20_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5769:4: ( (lv_description_21_0= ruleEString ) )?
                    int alt146=2;
                    int LA146_0 = input.LA(1);

                    if ( (LA146_0==RULE_STRING) ) {
                        alt146=1;
                    }
                    switch (alt146) {
                        case 1 :
                            // InternalOil.g:5770:5: (lv_description_21_0= ruleEString )
                            {
                            // InternalOil.g:5770:5: (lv_description_21_0= ruleEString )
                            // InternalOil.g:5771:6: lv_description_21_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getDescriptionEStringParserRuleCall_2_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_21_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_21_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_22=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_22, grammarAccess.getAlarmActionAttributeAccess().getSemicolonKeyword_2_6());
                    			
                    otherlv_23=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_23, grammarAccess.getAlarmActionAttributeAccess().getRightCurlyBracketKeyword_2_7());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:5798:3: (otherlv_24= 'ALARMCALLBACK' otherlv_25= '{' ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) ) (otherlv_27= '=' )? ( (lv_value_28_0= ruleAttributeValue ) ) ( (lv_description_29_0= ruleEString ) )? otherlv_30= ';' otherlv_31= '}' )
                    {
                    // InternalOil.g:5798:3: (otherlv_24= 'ALARMCALLBACK' otherlv_25= '{' ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) ) (otherlv_27= '=' )? ( (lv_value_28_0= ruleAttributeValue ) ) ( (lv_description_29_0= ruleEString ) )? otherlv_30= ';' otherlv_31= '}' )
                    // InternalOil.g:5799:4: otherlv_24= 'ALARMCALLBACK' otherlv_25= '{' ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) ) (otherlv_27= '=' )? ( (lv_value_28_0= ruleAttributeValue ) ) ( (lv_description_29_0= ruleEString ) )? otherlv_30= ';' otherlv_31= '}'
                    {
                    otherlv_24=(Token)match(input,75,FOLLOW_12); 

                    				newLeafNode(otherlv_24, grammarAccess.getAlarmActionAttributeAccess().getALARMCALLBACKKeyword_3_0());
                    			
                    otherlv_25=(Token)match(input,22,FOLLOW_80); 

                    				newLeafNode(otherlv_25, grammarAccess.getAlarmActionAttributeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalOil.g:5807:4: ( (lv_alarmcallback_26_0= ruleAlarmCallBack ) )
                    // InternalOil.g:5808:5: (lv_alarmcallback_26_0= ruleAlarmCallBack )
                    {
                    // InternalOil.g:5808:5: (lv_alarmcallback_26_0= ruleAlarmCallBack )
                    // InternalOil.g:5809:6: lv_alarmcallback_26_0= ruleAlarmCallBack
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getAlarmcallbackAlarmCallBackEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_alarmcallback_26_0=ruleAlarmCallBack();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"alarmcallback",
                    							lv_alarmcallback_26_0,
                    							"org.xtext.example.oil.Oil.AlarmCallBack");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5826:4: (otherlv_27= '=' )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==18) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // InternalOil.g:5827:5: otherlv_27= '='
                            {
                            otherlv_27=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_27, grammarAccess.getAlarmActionAttributeAccess().getEqualsSignKeyword_3_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:5832:4: ( (lv_value_28_0= ruleAttributeValue ) )
                    // InternalOil.g:5833:5: (lv_value_28_0= ruleAttributeValue )
                    {
                    // InternalOil.g:5833:5: (lv_value_28_0= ruleAttributeValue )
                    // InternalOil.g:5834:6: lv_value_28_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getValueAttributeValueParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_28_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_28_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5851:4: ( (lv_description_29_0= ruleEString ) )?
                    int alt148=2;
                    int LA148_0 = input.LA(1);

                    if ( (LA148_0==RULE_STRING) ) {
                        alt148=1;
                    }
                    switch (alt148) {
                        case 1 :
                            // InternalOil.g:5852:5: (lv_description_29_0= ruleEString )
                            {
                            // InternalOil.g:5852:5: (lv_description_29_0= ruleEString )
                            // InternalOil.g:5853:6: lv_description_29_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getAlarmActionAttributeAccess().getDescriptionEStringParserRuleCall_3_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_29_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAlarmActionAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_29_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_30=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_30, grammarAccess.getAlarmActionAttributeAccess().getSemicolonKeyword_3_6());
                    			
                    otherlv_31=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_31, grammarAccess.getAlarmActionAttributeAccess().getRightCurlyBracketKeyword_3_7());
                    			

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
    // $ANTLR end "ruleAlarmActionAttribute"


    // $ANTLR start "entryRuleAlarmAutostartAttribute"
    // InternalOil.g:5883:1: entryRuleAlarmAutostartAttribute returns [EObject current=null] : iv_ruleAlarmAutostartAttribute= ruleAlarmAutostartAttribute EOF ;
    public final EObject entryRuleAlarmAutostartAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarmAutostartAttribute = null;


        try {
            // InternalOil.g:5883:64: (iv_ruleAlarmAutostartAttribute= ruleAlarmAutostartAttribute EOF )
            // InternalOil.g:5884:2: iv_ruleAlarmAutostartAttribute= ruleAlarmAutostartAttribute EOF
            {
             newCompositeNode(grammarAccess.getAlarmAutostartAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarmAutostartAttribute=ruleAlarmAutostartAttribute();

            state._fsp--;

             current =iv_ruleAlarmAutostartAttribute; 
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
    // $ANTLR end "entryRuleAlarmAutostartAttribute"


    // $ANTLR start "ruleAlarmAutostartAttribute"
    // InternalOil.g:5890:1: ruleAlarmAutostartAttribute returns [EObject current=null] : ( (otherlv_0= 'ALARMTIME' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'CYCLETIME' (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'APPMODE' (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' ) ) ;
    public final EObject ruleAlarmAutostartAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        EObject lv_value_7_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_value_12_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalOil.g:5896:2: ( ( (otherlv_0= 'ALARMTIME' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'CYCLETIME' (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'APPMODE' (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' ) ) )
            // InternalOil.g:5897:2: ( (otherlv_0= 'ALARMTIME' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'CYCLETIME' (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'APPMODE' (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' ) )
            {
            // InternalOil.g:5897:2: ( (otherlv_0= 'ALARMTIME' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'CYCLETIME' (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'APPMODE' (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' ) )
            int alt156=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt156=1;
                }
                break;
            case 77:
                {
                alt156=2;
                }
                break;
            case 47:
                {
                alt156=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }

            switch (alt156) {
                case 1 :
                    // InternalOil.g:5898:3: (otherlv_0= 'ALARMTIME' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    {
                    // InternalOil.g:5898:3: (otherlv_0= 'ALARMTIME' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    // InternalOil.g:5899:4: otherlv_0= 'ALARMTIME' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,76,FOLLOW_66); 

                    				newLeafNode(otherlv_0, grammarAccess.getAlarmAutostartAttributeAccess().getALARMTIMEKeyword_0_0());
                    			
                    // InternalOil.g:5903:4: (otherlv_1= '=' )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==18) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // InternalOil.g:5904:5: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getAlarmAutostartAttributeAccess().getEqualsSignKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:5909:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalOil.g:5910:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalOil.g:5910:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalOil.g:5911:6: lv_value_2_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAlarmAutostartAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmAutostartAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5928:4: ( (lv_description_3_0= ruleEString ) )?
                    int alt151=2;
                    int LA151_0 = input.LA(1);

                    if ( (LA151_0==RULE_STRING) ) {
                        alt151=1;
                    }
                    switch (alt151) {
                        case 1 :
                            // InternalOil.g:5929:5: (lv_description_3_0= ruleEString )
                            {
                            // InternalOil.g:5929:5: (lv_description_3_0= ruleEString )
                            // InternalOil.g:5930:6: lv_description_3_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getAlarmAutostartAttributeAccess().getDescriptionEStringParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_3_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAlarmAutostartAttributeRule());
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

                    				newLeafNode(otherlv_4, grammarAccess.getAlarmAutostartAttributeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:5953:3: (otherlv_5= 'CYCLETIME' (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' )
                    {
                    // InternalOil.g:5953:3: (otherlv_5= 'CYCLETIME' (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' )
                    // InternalOil.g:5954:4: otherlv_5= 'CYCLETIME' (otherlv_6= '=' )? ( (lv_value_7_0= ruleAttributeValue ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_66); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlarmAutostartAttributeAccess().getCYCLETIMEKeyword_1_0());
                    			
                    // InternalOil.g:5958:4: (otherlv_6= '=' )?
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==18) ) {
                        alt152=1;
                    }
                    switch (alt152) {
                        case 1 :
                            // InternalOil.g:5959:5: otherlv_6= '='
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_6, grammarAccess.getAlarmAutostartAttributeAccess().getEqualsSignKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:5964:4: ( (lv_value_7_0= ruleAttributeValue ) )
                    // InternalOil.g:5965:5: (lv_value_7_0= ruleAttributeValue )
                    {
                    // InternalOil.g:5965:5: (lv_value_7_0= ruleAttributeValue )
                    // InternalOil.g:5966:6: lv_value_7_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAlarmAutostartAttributeAccess().getValueAttributeValueParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_7_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmAutostartAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_7_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:5983:4: ( (lv_description_8_0= ruleEString ) )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==RULE_STRING) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // InternalOil.g:5984:5: (lv_description_8_0= ruleEString )
                            {
                            // InternalOil.g:5984:5: (lv_description_8_0= ruleEString )
                            // InternalOil.g:5985:6: lv_description_8_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getAlarmAutostartAttributeAccess().getDescriptionEStringParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_8_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAlarmAutostartAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_8_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlarmAutostartAttributeAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:6008:3: (otherlv_10= 'APPMODE' (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' )
                    {
                    // InternalOil.g:6008:3: (otherlv_10= 'APPMODE' (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' )
                    // InternalOil.g:6009:4: otherlv_10= 'APPMODE' (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';'
                    {
                    otherlv_10=(Token)match(input,47,FOLLOW_66); 

                    				newLeafNode(otherlv_10, grammarAccess.getAlarmAutostartAttributeAccess().getAPPMODEKeyword_2_0());
                    			
                    // InternalOil.g:6013:4: (otherlv_11= '=' )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==18) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // InternalOil.g:6014:5: otherlv_11= '='
                            {
                            otherlv_11=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_11, grammarAccess.getAlarmAutostartAttributeAccess().getEqualsSignKeyword_2_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:6019:4: ( (lv_value_12_0= ruleAttributeValue ) )
                    // InternalOil.g:6020:5: (lv_value_12_0= ruleAttributeValue )
                    {
                    // InternalOil.g:6020:5: (lv_value_12_0= ruleAttributeValue )
                    // InternalOil.g:6021:6: lv_value_12_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getAlarmAutostartAttributeAccess().getValueAttributeValueParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_12_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlarmAutostartAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6038:4: ( (lv_description_13_0= ruleEString ) )?
                    int alt155=2;
                    int LA155_0 = input.LA(1);

                    if ( (LA155_0==RULE_STRING) ) {
                        alt155=1;
                    }
                    switch (alt155) {
                        case 1 :
                            // InternalOil.g:6039:5: (lv_description_13_0= ruleEString )
                            {
                            // InternalOil.g:6039:5: (lv_description_13_0= ruleEString )
                            // InternalOil.g:6040:6: lv_description_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getAlarmAutostartAttributeAccess().getDescriptionEStringParserRuleCall_2_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_13_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getAlarmAutostartAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_13_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getAlarmAutostartAttributeAccess().getSemicolonKeyword_2_4());
                    			

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
    // $ANTLR end "ruleAlarmAutostartAttribute"


    // $ANTLR start "entryRuleScheduleTableRule"
    // InternalOil.g:6066:1: entryRuleScheduleTableRule returns [EObject current=null] : iv_ruleScheduleTableRule= ruleScheduleTableRule EOF ;
    public final EObject entryRuleScheduleTableRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleTableRule = null;


        try {
            // InternalOil.g:6066:58: (iv_ruleScheduleTableRule= ruleScheduleTableRule EOF )
            // InternalOil.g:6067:2: iv_ruleScheduleTableRule= ruleScheduleTableRule EOF
            {
             newCompositeNode(grammarAccess.getScheduleTableRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduleTableRule=ruleScheduleTableRule();

            state._fsp--;

             current =iv_ruleScheduleTableRule; 
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
    // $ANTLR end "entryRuleScheduleTableRule"


    // $ANTLR start "ruleScheduleTableRule"
    // InternalOil.g:6073:1: ruleScheduleTableRule returns [EObject current=null] : (otherlv_0= 'SCHEDULETABLE' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' ) ;
    public final EObject ruleScheduleTableRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_schedulelist_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:6079:2: ( (otherlv_0= 'SCHEDULETABLE' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' ) )
            // InternalOil.g:6080:2: (otherlv_0= 'SCHEDULETABLE' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' )
            {
            // InternalOil.g:6080:2: (otherlv_0= 'SCHEDULETABLE' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' )
            // InternalOil.g:6081:3: otherlv_0= 'SCHEDULETABLE' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )* otherlv_4= '}' ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleTableRuleAccess().getSCHEDULETABLEKeyword_0());
            		
            // InternalOil.g:6085:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:6086:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:6086:4: (lv_name_1_0= ruleName )
            // InternalOil.g:6087:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getScheduleTableRuleAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleTableRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:6104:3: (otherlv_2= '{' ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )* otherlv_4= '}' )
            // InternalOil.g:6105:4: otherlv_2= '{' ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )* otherlv_4= '}'
            {
            otherlv_2=(Token)match(input,22,FOLLOW_81); 

            				newLeafNode(otherlv_2, grammarAccess.getScheduleTableRuleAccess().getLeftCurlyBracketKeyword_2_0());
            			
            // InternalOil.g:6109:4: ( (lv_schedulelist_3_0= ruleScheduleTableAttribute ) )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==29||LA157_0==66||LA157_0==70||LA157_0==78||(LA157_0>=80 && LA157_0<=82)) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // InternalOil.g:6110:5: (lv_schedulelist_3_0= ruleScheduleTableAttribute )
            	    {
            	    // InternalOil.g:6110:5: (lv_schedulelist_3_0= ruleScheduleTableAttribute )
            	    // InternalOil.g:6111:6: lv_schedulelist_3_0= ruleScheduleTableAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getScheduleTableRuleAccess().getSchedulelistScheduleTableAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_81);
            	    lv_schedulelist_3_0=ruleScheduleTableAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScheduleTableRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"schedulelist",
            	    							lv_schedulelist_3_0,
            	    							"org.xtext.example.oil.Oil.ScheduleTableAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop157;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            				newLeafNode(otherlv_4, grammarAccess.getScheduleTableRuleAccess().getRightCurlyBracketKeyword_2_2());
            			

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScheduleTableRuleAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleScheduleTableRule"


    // $ANTLR start "entryRuleScheduleTableAttribute"
    // InternalOil.g:6141:1: entryRuleScheduleTableAttribute returns [EObject current=null] : iv_ruleScheduleTableAttribute= ruleScheduleTableAttribute EOF ;
    public final EObject entryRuleScheduleTableAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleTableAttribute = null;


        try {
            // InternalOil.g:6141:63: (iv_ruleScheduleTableAttribute= ruleScheduleTableAttribute EOF )
            // InternalOil.g:6142:2: iv_ruleScheduleTableAttribute= ruleScheduleTableAttribute EOF
            {
             newCompositeNode(grammarAccess.getScheduleTableAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduleTableAttribute=ruleScheduleTableAttribute();

            state._fsp--;

             current =iv_ruleScheduleTableAttribute; 
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
    // $ANTLR end "entryRuleScheduleTableAttribute"


    // $ANTLR start "ruleScheduleTableAttribute"
    // InternalOil.g:6148:1: ruleScheduleTableAttribute returns [EObject current=null] : ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'LENGTH' otherlv_9= '=' ( (lv_value_10_0= ruleAttributeValue ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) ) otherlv_16= ';' ) | (otherlv_17= 'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION' otherlv_18= '=' ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' ) otherlv_24= ';' ) | (otherlv_25= 'PERIODIC' otherlv_26= '=' (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' ) otherlv_29= ';' ) | (otherlv_30= 'EXPIRY_POINT' ( (lv_name_31_0= ruleName ) ) (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' ) otherlv_35= ';' ) ) ;
    public final EObject ruleScheduleTableAttribute() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_value_10_0 = null;

        EObject lv_parameterList_15_0 = null;

        EObject lv_parameterList_21_0 = null;

        AntlrDatatypeRuleToken lv_name_31_0 = null;

        EObject lv_parameterList_33_0 = null;



        	enterRule();

        try {
            // InternalOil.g:6154:2: ( ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'LENGTH' otherlv_9= '=' ( (lv_value_10_0= ruleAttributeValue ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) ) otherlv_16= ';' ) | (otherlv_17= 'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION' otherlv_18= '=' ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' ) otherlv_24= ';' ) | (otherlv_25= 'PERIODIC' otherlv_26= '=' (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' ) otherlv_29= ';' ) | (otherlv_30= 'EXPIRY_POINT' ( (lv_name_31_0= ruleName ) ) (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' ) otherlv_35= ';' ) ) )
            // InternalOil.g:6155:2: ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'LENGTH' otherlv_9= '=' ( (lv_value_10_0= ruleAttributeValue ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) ) otherlv_16= ';' ) | (otherlv_17= 'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION' otherlv_18= '=' ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' ) otherlv_24= ';' ) | (otherlv_25= 'PERIODIC' otherlv_26= '=' (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' ) otherlv_29= ';' ) | (otherlv_30= 'EXPIRY_POINT' ( (lv_name_31_0= ruleName ) ) (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' ) otherlv_35= ';' ) )
            {
            // InternalOil.g:6155:2: ( (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' ) | (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) | (otherlv_8= 'LENGTH' otherlv_9= '=' ( (lv_value_10_0= ruleAttributeValue ) ) otherlv_11= ';' ) | (otherlv_12= 'AUTOSTART' otherlv_13= '=' (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) ) otherlv_16= ';' ) | (otherlv_17= 'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION' otherlv_18= '=' ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' ) otherlv_24= ';' ) | (otherlv_25= 'PERIODIC' otherlv_26= '=' (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' ) otherlv_29= ';' ) | (otherlv_30= 'EXPIRY_POINT' ( (lv_name_31_0= ruleName ) ) (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' ) otherlv_35= ';' ) )
            int alt163=7;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt163=1;
                }
                break;
            case 70:
                {
                alt163=2;
                }
                break;
            case 78:
                {
                alt163=3;
                }
                break;
            case 66:
                {
                alt163=4;
                }
                break;
            case 80:
                {
                alt163=5;
                }
                break;
            case 81:
                {
                alt163=6;
                }
                break;
            case 82:
                {
                alt163=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // InternalOil.g:6156:3: (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' )
                    {
                    // InternalOil.g:6156:3: (otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';' )
                    // InternalOil.g:6157:4: otherlv_0= 'COUNTER' otherlv_1= '=' ( (lv_name_2_0= ruleName ) ) otherlv_3= ';'
                    {
                    otherlv_0=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getScheduleTableAttributeAccess().getCOUNTERKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getScheduleTableAttributeAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalOil.g:6165:4: ( (lv_name_2_0= ruleName ) )
                    // InternalOil.g:6166:5: (lv_name_2_0= ruleName )
                    {
                    // InternalOil.g:6166:5: (lv_name_2_0= ruleName )
                    // InternalOil.g:6167:6: lv_name_2_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getScheduleTableAttributeAccess().getNameNameParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_2_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleTableAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getScheduleTableAttributeAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:6190:3: (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
                    {
                    // InternalOil.g:6190:3: (otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
                    // InternalOil.g:6191:4: otherlv_4= 'ACCESSING_APPLICATION' otherlv_5= '=' ( (lv_name_6_0= ruleName ) ) otherlv_7= ';'
                    {
                    otherlv_4=(Token)match(input,70,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getScheduleTableAttributeAccess().getACCESSING_APPLICATIONKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getScheduleTableAttributeAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalOil.g:6199:4: ( (lv_name_6_0= ruleName ) )
                    // InternalOil.g:6200:5: (lv_name_6_0= ruleName )
                    {
                    // InternalOil.g:6200:5: (lv_name_6_0= ruleName )
                    // InternalOil.g:6201:6: lv_name_6_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getScheduleTableAttributeAccess().getNameNameParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_6_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleTableAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getScheduleTableAttributeAccess().getSemicolonKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:6224:3: (otherlv_8= 'LENGTH' otherlv_9= '=' ( (lv_value_10_0= ruleAttributeValue ) ) otherlv_11= ';' )
                    {
                    // InternalOil.g:6224:3: (otherlv_8= 'LENGTH' otherlv_9= '=' ( (lv_value_10_0= ruleAttributeValue ) ) otherlv_11= ';' )
                    // InternalOil.g:6225:4: otherlv_8= 'LENGTH' otherlv_9= '=' ( (lv_value_10_0= ruleAttributeValue ) ) otherlv_11= ';'
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getScheduleTableAttributeAccess().getLENGTHKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_9, grammarAccess.getScheduleTableAttributeAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalOil.g:6233:4: ( (lv_value_10_0= ruleAttributeValue ) )
                    // InternalOil.g:6234:5: (lv_value_10_0= ruleAttributeValue )
                    {
                    // InternalOil.g:6234:5: (lv_value_10_0= ruleAttributeValue )
                    // InternalOil.g:6235:6: lv_value_10_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getScheduleTableAttributeAccess().getValueAttributeValueParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_value_10_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleTableAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_10_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getScheduleTableAttributeAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:6258:3: (otherlv_12= 'AUTOSTART' otherlv_13= '=' (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) ) otherlv_16= ';' )
                    {
                    // InternalOil.g:6258:3: (otherlv_12= 'AUTOSTART' otherlv_13= '=' (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) ) otherlv_16= ';' )
                    // InternalOil.g:6259:4: otherlv_12= 'AUTOSTART' otherlv_13= '=' (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) ) otherlv_16= ';'
                    {
                    otherlv_12=(Token)match(input,66,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getScheduleTableAttributeAccess().getAUTOSTARTKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,18,FOLLOW_82); 

                    				newLeafNode(otherlv_13, grammarAccess.getScheduleTableAttributeAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalOil.g:6267:4: (otherlv_14= 'NONE' | ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) ) )
                    int alt158=2;
                    int LA158_0 = input.LA(1);

                    if ( (LA158_0==79) ) {
                        alt158=1;
                    }
                    else if ( (LA158_0==83) ) {
                        alt158=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 158, 0, input);

                        throw nvae;
                    }
                    switch (alt158) {
                        case 1 :
                            // InternalOil.g:6268:5: otherlv_14= 'NONE'
                            {
                            otherlv_14=(Token)match(input,79,FOLLOW_10); 

                            					newLeafNode(otherlv_14, grammarAccess.getScheduleTableAttributeAccess().getNONEKeyword_3_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalOil.g:6273:5: ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) )
                            {
                            // InternalOil.g:6273:5: ( (lv_parameterList_15_0= ruleScheduleAutoStartAttribute ) )
                            // InternalOil.g:6274:6: (lv_parameterList_15_0= ruleScheduleAutoStartAttribute )
                            {
                            // InternalOil.g:6274:6: (lv_parameterList_15_0= ruleScheduleAutoStartAttribute )
                            // InternalOil.g:6275:7: lv_parameterList_15_0= ruleScheduleAutoStartAttribute
                            {

                            							newCompositeNode(grammarAccess.getScheduleTableAttributeAccess().getParameterListScheduleAutoStartAttributeParserRuleCall_3_2_1_0());
                            						
                            pushFollow(FOLLOW_10);
                            lv_parameterList_15_0=ruleScheduleAutoStartAttribute();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getScheduleTableAttributeRule());
                            							}
                            							add(
                            								current,
                            								"parameterList",
                            								lv_parameterList_15_0,
                            								"org.xtext.example.oil.Oil.ScheduleAutoStartAttribute");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getScheduleTableAttributeAccess().getSemicolonKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:6299:3: (otherlv_17= 'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION' otherlv_18= '=' ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' ) otherlv_24= ';' )
                    {
                    // InternalOil.g:6299:3: (otherlv_17= 'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION' otherlv_18= '=' ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' ) otherlv_24= ';' )
                    // InternalOil.g:6300:4: otherlv_17= 'LOCAL_TO_GLOBAL_TIME_SYNCHRONIZATION' otherlv_18= '=' ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' ) otherlv_24= ';'
                    {
                    otherlv_17=(Token)match(input,80,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getScheduleTableAttributeAccess().getLOCAL_TO_GLOBAL_TIME_SYNCHRONIZATIONKeyword_4_0());
                    			
                    otherlv_18=(Token)match(input,18,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getScheduleTableAttributeAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalOil.g:6308:4: ( (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' ) | otherlv_23= 'FALSE' )
                    int alt160=2;
                    int LA160_0 = input.LA(1);

                    if ( (LA160_0==33) ) {
                        alt160=1;
                    }
                    else if ( (LA160_0==34) ) {
                        alt160=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 160, 0, input);

                        throw nvae;
                    }
                    switch (alt160) {
                        case 1 :
                            // InternalOil.g:6309:5: (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' )
                            {
                            // InternalOil.g:6309:5: (otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}' )
                            // InternalOil.g:6310:6: otherlv_19= 'TRUE' otherlv_20= '{' ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )* otherlv_22= '}'
                            {
                            otherlv_19=(Token)match(input,33,FOLLOW_12); 

                            						newLeafNode(otherlv_19, grammarAccess.getScheduleTableAttributeAccess().getTRUEKeyword_4_2_0_0());
                            					
                            otherlv_20=(Token)match(input,22,FOLLOW_83); 

                            						newLeafNode(otherlv_20, grammarAccess.getScheduleTableAttributeAccess().getLeftCurlyBracketKeyword_4_2_0_1());
                            					
                            // InternalOil.g:6318:6: ( (lv_parameterList_21_0= ruleSchduleSynAttribute ) )*
                            loop159:
                            do {
                                int alt159=2;
                                int LA159_0 = input.LA(1);

                                if ( ((LA159_0>=84 && LA159_0<=85)) ) {
                                    alt159=1;
                                }


                                switch (alt159) {
                            	case 1 :
                            	    // InternalOil.g:6319:7: (lv_parameterList_21_0= ruleSchduleSynAttribute )
                            	    {
                            	    // InternalOil.g:6319:7: (lv_parameterList_21_0= ruleSchduleSynAttribute )
                            	    // InternalOil.g:6320:8: lv_parameterList_21_0= ruleSchduleSynAttribute
                            	    {

                            	    								newCompositeNode(grammarAccess.getScheduleTableAttributeAccess().getParameterListSchduleSynAttributeParserRuleCall_4_2_0_2_0());
                            	    							
                            	    pushFollow(FOLLOW_83);
                            	    lv_parameterList_21_0=ruleSchduleSynAttribute();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getScheduleTableAttributeRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameterList",
                            	    									lv_parameterList_21_0,
                            	    									"org.xtext.example.oil.Oil.SchduleSynAttribute");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop159;
                                }
                            } while (true);

                            otherlv_22=(Token)match(input,23,FOLLOW_10); 

                            						newLeafNode(otherlv_22, grammarAccess.getScheduleTableAttributeAccess().getRightCurlyBracketKeyword_4_2_0_3());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalOil.g:6343:5: otherlv_23= 'FALSE'
                            {
                            otherlv_23=(Token)match(input,34,FOLLOW_10); 

                            					newLeafNode(otherlv_23, grammarAccess.getScheduleTableAttributeAccess().getFALSEKeyword_4_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getScheduleTableAttributeAccess().getSemicolonKeyword_4_3());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:6354:3: (otherlv_25= 'PERIODIC' otherlv_26= '=' (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' ) otherlv_29= ';' )
                    {
                    // InternalOil.g:6354:3: (otherlv_25= 'PERIODIC' otherlv_26= '=' (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' ) otherlv_29= ';' )
                    // InternalOil.g:6355:4: otherlv_25= 'PERIODIC' otherlv_26= '=' (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' ) otherlv_29= ';'
                    {
                    otherlv_25=(Token)match(input,81,FOLLOW_7); 

                    				newLeafNode(otherlv_25, grammarAccess.getScheduleTableAttributeAccess().getPERIODICKeyword_5_0());
                    			
                    otherlv_26=(Token)match(input,18,FOLLOW_33); 

                    				newLeafNode(otherlv_26, grammarAccess.getScheduleTableAttributeAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalOil.g:6363:4: (otherlv_27= 'TRUE' | otherlv_28= 'FALSE' )
                    int alt161=2;
                    int LA161_0 = input.LA(1);

                    if ( (LA161_0==33) ) {
                        alt161=1;
                    }
                    else if ( (LA161_0==34) ) {
                        alt161=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 161, 0, input);

                        throw nvae;
                    }
                    switch (alt161) {
                        case 1 :
                            // InternalOil.g:6364:5: otherlv_27= 'TRUE'
                            {
                            otherlv_27=(Token)match(input,33,FOLLOW_10); 

                            					newLeafNode(otherlv_27, grammarAccess.getScheduleTableAttributeAccess().getTRUEKeyword_5_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalOil.g:6369:5: otherlv_28= 'FALSE'
                            {
                            otherlv_28=(Token)match(input,34,FOLLOW_10); 

                            					newLeafNode(otherlv_28, grammarAccess.getScheduleTableAttributeAccess().getFALSEKeyword_5_2_1());
                            				

                            }
                            break;

                    }

                    otherlv_29=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_29, grammarAccess.getScheduleTableAttributeAccess().getSemicolonKeyword_5_3());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:6380:3: (otherlv_30= 'EXPIRY_POINT' ( (lv_name_31_0= ruleName ) ) (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' ) otherlv_35= ';' )
                    {
                    // InternalOil.g:6380:3: (otherlv_30= 'EXPIRY_POINT' ( (lv_name_31_0= ruleName ) ) (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' ) otherlv_35= ';' )
                    // InternalOil.g:6381:4: otherlv_30= 'EXPIRY_POINT' ( (lv_name_31_0= ruleName ) ) (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' ) otherlv_35= ';'
                    {
                    otherlv_30=(Token)match(input,82,FOLLOW_11); 

                    				newLeafNode(otherlv_30, grammarAccess.getScheduleTableAttributeAccess().getEXPIRY_POINTKeyword_6_0());
                    			
                    // InternalOil.g:6385:4: ( (lv_name_31_0= ruleName ) )
                    // InternalOil.g:6386:5: (lv_name_31_0= ruleName )
                    {
                    // InternalOil.g:6386:5: (lv_name_31_0= ruleName )
                    // InternalOil.g:6387:6: lv_name_31_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getScheduleTableAttributeAccess().getNameNameParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_31_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleTableAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_31_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6404:4: (otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}' )
                    // InternalOil.g:6405:5: otherlv_32= '{' ( (lv_parameterList_33_0= ruleExpiryAttribute ) )* otherlv_34= '}'
                    {
                    otherlv_32=(Token)match(input,22,FOLLOW_84); 

                    					newLeafNode(otherlv_32, grammarAccess.getScheduleTableAttributeAccess().getLeftCurlyBracketKeyword_6_2_0());
                    				
                    // InternalOil.g:6409:5: ( (lv_parameterList_33_0= ruleExpiryAttribute ) )*
                    loop162:
                    do {
                        int alt162=2;
                        int LA162_0 = input.LA(1);

                        if ( (LA162_0==71||(LA162_0>=86 && LA162_0<=87)) ) {
                            alt162=1;
                        }


                        switch (alt162) {
                    	case 1 :
                    	    // InternalOil.g:6410:6: (lv_parameterList_33_0= ruleExpiryAttribute )
                    	    {
                    	    // InternalOil.g:6410:6: (lv_parameterList_33_0= ruleExpiryAttribute )
                    	    // InternalOil.g:6411:7: lv_parameterList_33_0= ruleExpiryAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getScheduleTableAttributeAccess().getParameterListExpiryAttributeParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_84);
                    	    lv_parameterList_33_0=ruleExpiryAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getScheduleTableAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameterList",
                    	    								lv_parameterList_33_0,
                    	    								"org.xtext.example.oil.Oil.ExpiryAttribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop162;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_34, grammarAccess.getScheduleTableAttributeAccess().getRightCurlyBracketKeyword_6_2_2());
                    				

                    }

                    otherlv_35=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_35, grammarAccess.getScheduleTableAttributeAccess().getSemicolonKeyword_6_3());
                    			

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
    // $ANTLR end "ruleScheduleTableAttribute"


    // $ANTLR start "entryRuleScheduleAutoStartAttribute"
    // InternalOil.g:6442:1: entryRuleScheduleAutoStartAttribute returns [EObject current=null] : iv_ruleScheduleAutoStartAttribute= ruleScheduleAutoStartAttribute EOF ;
    public final EObject entryRuleScheduleAutoStartAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleAutoStartAttribute = null;


        try {
            // InternalOil.g:6442:67: (iv_ruleScheduleAutoStartAttribute= ruleScheduleAutoStartAttribute EOF )
            // InternalOil.g:6443:2: iv_ruleScheduleAutoStartAttribute= ruleScheduleAutoStartAttribute EOF
            {
             newCompositeNode(grammarAccess.getScheduleAutoStartAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduleAutoStartAttribute=ruleScheduleAutoStartAttribute();

            state._fsp--;

             current =iv_ruleScheduleAutoStartAttribute; 
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
    // $ANTLR end "entryRuleScheduleAutoStartAttribute"


    // $ANTLR start "ruleScheduleAutoStartAttribute"
    // InternalOil.g:6449:1: ruleScheduleAutoStartAttribute returns [EObject current=null] : (otherlv_0= 'ABSOLUTE' otherlv_1= '{' ( ( (lv_absolute_2_0= ruleAbsolute ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )* otherlv_7= '}' ) ;
    public final EObject ruleScheduleAutoStartAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_absolute_2_0 = null;

        EObject lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;



        	enterRule();

        try {
            // InternalOil.g:6455:2: ( (otherlv_0= 'ABSOLUTE' otherlv_1= '{' ( ( (lv_absolute_2_0= ruleAbsolute ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )* otherlv_7= '}' ) )
            // InternalOil.g:6456:2: (otherlv_0= 'ABSOLUTE' otherlv_1= '{' ( ( (lv_absolute_2_0= ruleAbsolute ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )* otherlv_7= '}' )
            {
            // InternalOil.g:6456:2: (otherlv_0= 'ABSOLUTE' otherlv_1= '{' ( ( (lv_absolute_2_0= ruleAbsolute ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )* otherlv_7= '}' )
            // InternalOil.g:6457:3: otherlv_0= 'ABSOLUTE' otherlv_1= '{' ( ( (lv_absolute_2_0= ruleAbsolute ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAutoStartAttributeAccess().getABSOLUTEKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_85); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleAutoStartAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalOil.g:6465:3: ( ( (lv_absolute_2_0= ruleAbsolute ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==47||LA166_0==156) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // InternalOil.g:6466:4: ( (lv_absolute_2_0= ruleAbsolute ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';'
            	    {
            	    // InternalOil.g:6466:4: ( (lv_absolute_2_0= ruleAbsolute ) )
            	    // InternalOil.g:6467:5: (lv_absolute_2_0= ruleAbsolute )
            	    {
            	    // InternalOil.g:6467:5: (lv_absolute_2_0= ruleAbsolute )
            	    // InternalOil.g:6468:6: lv_absolute_2_0= ruleAbsolute
            	    {

            	    						newCompositeNode(grammarAccess.getScheduleAutoStartAttributeAccess().getAbsoluteAbsoluteEnumRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_66);
            	    lv_absolute_2_0=ruleAbsolute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScheduleAutoStartAttributeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"absolute",
            	    							lv_absolute_2_0,
            	    							"org.xtext.example.oil.Oil.Absolute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOil.g:6485:4: (otherlv_3= '=' )?
            	    int alt164=2;
            	    int LA164_0 = input.LA(1);

            	    if ( (LA164_0==18) ) {
            	        alt164=1;
            	    }
            	    switch (alt164) {
            	        case 1 :
            	            // InternalOil.g:6486:5: otherlv_3= '='
            	            {
            	            otherlv_3=(Token)match(input,18,FOLLOW_29); 

            	            					newLeafNode(otherlv_3, grammarAccess.getScheduleAutoStartAttributeAccess().getEqualsSignKeyword_2_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalOil.g:6491:4: ( (lv_value_4_0= ruleAttributeValue ) )
            	    // InternalOil.g:6492:5: (lv_value_4_0= ruleAttributeValue )
            	    {
            	    // InternalOil.g:6492:5: (lv_value_4_0= ruleAttributeValue )
            	    // InternalOil.g:6493:6: lv_value_4_0= ruleAttributeValue
            	    {

            	    						newCompositeNode(grammarAccess.getScheduleAutoStartAttributeAccess().getValueAttributeValueParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_value_4_0=ruleAttributeValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScheduleAutoStartAttributeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"org.xtext.example.oil.Oil.AttributeValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOil.g:6510:4: ( (lv_description_5_0= ruleEString ) )?
            	    int alt165=2;
            	    int LA165_0 = input.LA(1);

            	    if ( (LA165_0==RULE_STRING) ) {
            	        alt165=1;
            	    }
            	    switch (alt165) {
            	        case 1 :
            	            // InternalOil.g:6511:5: (lv_description_5_0= ruleEString )
            	            {
            	            // InternalOil.g:6511:5: (lv_description_5_0= ruleEString )
            	            // InternalOil.g:6512:6: lv_description_5_0= ruleEString
            	            {

            	            						newCompositeNode(grammarAccess.getScheduleAutoStartAttributeAccess().getDescriptionEStringParserRuleCall_2_3_0());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_description_5_0=ruleEString();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getScheduleAutoStartAttributeRule());
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

            	    otherlv_6=(Token)match(input,20,FOLLOW_85); 

            	    				newLeafNode(otherlv_6, grammarAccess.getScheduleAutoStartAttributeAccess().getSemicolonKeyword_2_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop166;
                }
            } while (true);

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getScheduleAutoStartAttributeAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleScheduleAutoStartAttribute"


    // $ANTLR start "entryRuleSchduleSynAttribute"
    // InternalOil.g:6542:1: entryRuleSchduleSynAttribute returns [EObject current=null] : iv_ruleSchduleSynAttribute= ruleSchduleSynAttribute EOF ;
    public final EObject entryRuleSchduleSynAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchduleSynAttribute = null;


        try {
            // InternalOil.g:6542:60: (iv_ruleSchduleSynAttribute= ruleSchduleSynAttribute EOF )
            // InternalOil.g:6543:2: iv_ruleSchduleSynAttribute= ruleSchduleSynAttribute EOF
            {
             newCompositeNode(grammarAccess.getSchduleSynAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchduleSynAttribute=ruleSchduleSynAttribute();

            state._fsp--;

             current =iv_ruleSchduleSynAttribute; 
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
    // $ANTLR end "entryRuleSchduleSynAttribute"


    // $ANTLR start "ruleSchduleSynAttribute"
    // InternalOil.g:6549:1: ruleSchduleSynAttribute returns [EObject current=null] : ( (otherlv_0= 'PRECISION' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'SYNC_STRATEGY' (otherlv_6= '=' )? ( (lv_schdulesyn_7_0= ruleSchduleSyn ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) ) ;
    public final EObject ruleSchduleSynAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        Enumerator lv_schdulesyn_7_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;



        	enterRule();

        try {
            // InternalOil.g:6555:2: ( ( (otherlv_0= 'PRECISION' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'SYNC_STRATEGY' (otherlv_6= '=' )? ( (lv_schdulesyn_7_0= ruleSchduleSyn ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) ) )
            // InternalOil.g:6556:2: ( (otherlv_0= 'PRECISION' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'SYNC_STRATEGY' (otherlv_6= '=' )? ( (lv_schdulesyn_7_0= ruleSchduleSyn ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) )
            {
            // InternalOil.g:6556:2: ( (otherlv_0= 'PRECISION' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'SYNC_STRATEGY' (otherlv_6= '=' )? ( (lv_schdulesyn_7_0= ruleSchduleSyn ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==84) ) {
                alt171=1;
            }
            else if ( (LA171_0==85) ) {
                alt171=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;
            }
            switch (alt171) {
                case 1 :
                    // InternalOil.g:6557:3: (otherlv_0= 'PRECISION' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    {
                    // InternalOil.g:6557:3: (otherlv_0= 'PRECISION' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    // InternalOil.g:6558:4: otherlv_0= 'PRECISION' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,84,FOLLOW_66); 

                    				newLeafNode(otherlv_0, grammarAccess.getSchduleSynAttributeAccess().getPRECISIONKeyword_0_0());
                    			
                    // InternalOil.g:6562:4: (otherlv_1= '=' )?
                    int alt167=2;
                    int LA167_0 = input.LA(1);

                    if ( (LA167_0==18) ) {
                        alt167=1;
                    }
                    switch (alt167) {
                        case 1 :
                            // InternalOil.g:6563:5: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getSchduleSynAttributeAccess().getEqualsSignKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:6568:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalOil.g:6569:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalOil.g:6569:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalOil.g:6570:6: lv_value_2_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getSchduleSynAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchduleSynAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6587:4: ( (lv_description_3_0= ruleEString ) )?
                    int alt168=2;
                    int LA168_0 = input.LA(1);

                    if ( (LA168_0==RULE_STRING) ) {
                        alt168=1;
                    }
                    switch (alt168) {
                        case 1 :
                            // InternalOil.g:6588:5: (lv_description_3_0= ruleEString )
                            {
                            // InternalOil.g:6588:5: (lv_description_3_0= ruleEString )
                            // InternalOil.g:6589:6: lv_description_3_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getSchduleSynAttributeAccess().getDescriptionEStringParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_3_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSchduleSynAttributeRule());
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

                    				newLeafNode(otherlv_4, grammarAccess.getSchduleSynAttributeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:6612:3: (otherlv_5= 'SYNC_STRATEGY' (otherlv_6= '=' )? ( (lv_schdulesyn_7_0= ruleSchduleSyn ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' )
                    {
                    // InternalOil.g:6612:3: (otherlv_5= 'SYNC_STRATEGY' (otherlv_6= '=' )? ( (lv_schdulesyn_7_0= ruleSchduleSyn ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' )
                    // InternalOil.g:6613:4: otherlv_5= 'SYNC_STRATEGY' (otherlv_6= '=' )? ( (lv_schdulesyn_7_0= ruleSchduleSyn ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,85,FOLLOW_86); 

                    				newLeafNode(otherlv_5, grammarAccess.getSchduleSynAttributeAccess().getSYNC_STRATEGYKeyword_1_0());
                    			
                    // InternalOil.g:6617:4: (otherlv_6= '=' )?
                    int alt169=2;
                    int LA169_0 = input.LA(1);

                    if ( (LA169_0==18) ) {
                        alt169=1;
                    }
                    switch (alt169) {
                        case 1 :
                            // InternalOil.g:6618:5: otherlv_6= '='
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_86); 

                            					newLeafNode(otherlv_6, grammarAccess.getSchduleSynAttributeAccess().getEqualsSignKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:6623:4: ( (lv_schdulesyn_7_0= ruleSchduleSyn ) )
                    // InternalOil.g:6624:5: (lv_schdulesyn_7_0= ruleSchduleSyn )
                    {
                    // InternalOil.g:6624:5: (lv_schdulesyn_7_0= ruleSchduleSyn )
                    // InternalOil.g:6625:6: lv_schdulesyn_7_0= ruleSchduleSyn
                    {

                    						newCompositeNode(grammarAccess.getSchduleSynAttributeAccess().getSchdulesynSchduleSynEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_schdulesyn_7_0=ruleSchduleSyn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchduleSynAttributeRule());
                    						}
                    						set(
                    							current,
                    							"schdulesyn",
                    							lv_schdulesyn_7_0,
                    							"org.xtext.example.oil.Oil.SchduleSyn");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6642:4: ( (lv_description_8_0= ruleEString ) )?
                    int alt170=2;
                    int LA170_0 = input.LA(1);

                    if ( (LA170_0==RULE_STRING) ) {
                        alt170=1;
                    }
                    switch (alt170) {
                        case 1 :
                            // InternalOil.g:6643:5: (lv_description_8_0= ruleEString )
                            {
                            // InternalOil.g:6643:5: (lv_description_8_0= ruleEString )
                            // InternalOil.g:6644:6: lv_description_8_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getSchduleSynAttributeAccess().getDescriptionEStringParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_8_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSchduleSynAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_8_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getSchduleSynAttributeAccess().getSemicolonKeyword_1_4());
                    			

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
    // $ANTLR end "ruleSchduleSynAttribute"


    // $ANTLR start "entryRuleExpiryAttribute"
    // InternalOil.g:6670:1: entryRuleExpiryAttribute returns [EObject current=null] : iv_ruleExpiryAttribute= ruleExpiryAttribute EOF ;
    public final EObject entryRuleExpiryAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpiryAttribute = null;


        try {
            // InternalOil.g:6670:56: (iv_ruleExpiryAttribute= ruleExpiryAttribute EOF )
            // InternalOil.g:6671:2: iv_ruleExpiryAttribute= ruleExpiryAttribute EOF
            {
             newCompositeNode(grammarAccess.getExpiryAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpiryAttribute=ruleExpiryAttribute();

            state._fsp--;

             current =iv_ruleExpiryAttribute; 
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
    // $ANTLR end "entryRuleExpiryAttribute"


    // $ANTLR start "ruleExpiryAttribute"
    // InternalOil.g:6677:1: ruleExpiryAttribute returns [EObject current=null] : ( (otherlv_0= 'OFFSET' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'ADJUSTBLE' (otherlv_6= '=' )? ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'ACTION' otherlv_11= '=' ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) ) otherlv_13= ';' ) ) ;
    public final EObject ruleExpiryAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        Enumerator lv_schdulexpiry_7_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_parameterList_12_0 = null;



        	enterRule();

        try {
            // InternalOil.g:6683:2: ( ( (otherlv_0= 'OFFSET' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'ADJUSTBLE' (otherlv_6= '=' )? ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'ACTION' otherlv_11= '=' ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) ) otherlv_13= ';' ) ) )
            // InternalOil.g:6684:2: ( (otherlv_0= 'OFFSET' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'ADJUSTBLE' (otherlv_6= '=' )? ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'ACTION' otherlv_11= '=' ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) ) otherlv_13= ';' ) )
            {
            // InternalOil.g:6684:2: ( (otherlv_0= 'OFFSET' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) | (otherlv_5= 'ADJUSTBLE' (otherlv_6= '=' )? ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' ) | (otherlv_10= 'ACTION' otherlv_11= '=' ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) ) otherlv_13= ';' ) )
            int alt176=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt176=1;
                }
                break;
            case 87:
                {
                alt176=2;
                }
                break;
            case 71:
                {
                alt176=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 176, 0, input);

                throw nvae;
            }

            switch (alt176) {
                case 1 :
                    // InternalOil.g:6685:3: (otherlv_0= 'OFFSET' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    {
                    // InternalOil.g:6685:3: (otherlv_0= 'OFFSET' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
                    // InternalOil.g:6686:4: otherlv_0= 'OFFSET' (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,86,FOLLOW_66); 

                    				newLeafNode(otherlv_0, grammarAccess.getExpiryAttributeAccess().getOFFSETKeyword_0_0());
                    			
                    // InternalOil.g:6690:4: (otherlv_1= '=' )?
                    int alt172=2;
                    int LA172_0 = input.LA(1);

                    if ( (LA172_0==18) ) {
                        alt172=1;
                    }
                    switch (alt172) {
                        case 1 :
                            // InternalOil.g:6691:5: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getExpiryAttributeAccess().getEqualsSignKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:6696:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalOil.g:6697:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalOil.g:6697:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalOil.g:6698:6: lv_value_2_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getExpiryAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpiryAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6715:4: ( (lv_description_3_0= ruleEString ) )?
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==RULE_STRING) ) {
                        alt173=1;
                    }
                    switch (alt173) {
                        case 1 :
                            // InternalOil.g:6716:5: (lv_description_3_0= ruleEString )
                            {
                            // InternalOil.g:6716:5: (lv_description_3_0= ruleEString )
                            // InternalOil.g:6717:6: lv_description_3_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getExpiryAttributeAccess().getDescriptionEStringParserRuleCall_0_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_3_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpiryAttributeRule());
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

                    				newLeafNode(otherlv_4, grammarAccess.getExpiryAttributeAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:6740:3: (otherlv_5= 'ADJUSTBLE' (otherlv_6= '=' )? ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' )
                    {
                    // InternalOil.g:6740:3: (otherlv_5= 'ADJUSTBLE' (otherlv_6= '=' )? ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';' )
                    // InternalOil.g:6741:4: otherlv_5= 'ADJUSTBLE' (otherlv_6= '=' )? ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) ) ( (lv_description_8_0= ruleEString ) )? otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,87,FOLLOW_87); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpiryAttributeAccess().getADJUSTBLEKeyword_1_0());
                    			
                    // InternalOil.g:6745:4: (otherlv_6= '=' )?
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==18) ) {
                        alt174=1;
                    }
                    switch (alt174) {
                        case 1 :
                            // InternalOil.g:6746:5: otherlv_6= '='
                            {
                            otherlv_6=(Token)match(input,18,FOLLOW_87); 

                            					newLeafNode(otherlv_6, grammarAccess.getExpiryAttributeAccess().getEqualsSignKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:6751:4: ( (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble ) )
                    // InternalOil.g:6752:5: (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble )
                    {
                    // InternalOil.g:6752:5: (lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble )
                    // InternalOil.g:6753:6: lv_schdulexpiry_7_0= ruleSchduleExpiryAdustble
                    {

                    						newCompositeNode(grammarAccess.getExpiryAttributeAccess().getSchdulexpirySchduleExpiryAdustbleEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_schdulexpiry_7_0=ruleSchduleExpiryAdustble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpiryAttributeRule());
                    						}
                    						set(
                    							current,
                    							"schdulexpiry",
                    							lv_schdulexpiry_7_0,
                    							"org.xtext.example.oil.Oil.SchduleExpiryAdustble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6770:4: ( (lv_description_8_0= ruleEString ) )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==RULE_STRING) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // InternalOil.g:6771:5: (lv_description_8_0= ruleEString )
                            {
                            // InternalOil.g:6771:5: (lv_description_8_0= ruleEString )
                            // InternalOil.g:6772:6: lv_description_8_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getExpiryAttributeAccess().getDescriptionEStringParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_8_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getExpiryAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_8_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getExpiryAttributeAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:6795:3: (otherlv_10= 'ACTION' otherlv_11= '=' ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) ) otherlv_13= ';' )
                    {
                    // InternalOil.g:6795:3: (otherlv_10= 'ACTION' otherlv_11= '=' ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) ) otherlv_13= ';' )
                    // InternalOil.g:6796:4: otherlv_10= 'ACTION' otherlv_11= '=' ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,71,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getExpiryAttributeAccess().getACTIONKeyword_2_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_88); 

                    				newLeafNode(otherlv_11, grammarAccess.getExpiryAttributeAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalOil.g:6804:4: ( (lv_parameterList_12_0= ruleSchduleActionAttribute ) )
                    // InternalOil.g:6805:5: (lv_parameterList_12_0= ruleSchduleActionAttribute )
                    {
                    // InternalOil.g:6805:5: (lv_parameterList_12_0= ruleSchduleActionAttribute )
                    // InternalOil.g:6806:6: lv_parameterList_12_0= ruleSchduleActionAttribute
                    {

                    						newCompositeNode(grammarAccess.getExpiryAttributeAccess().getParameterListSchduleActionAttributeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_parameterList_12_0=ruleSchduleActionAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpiryAttributeRule());
                    						}
                    						add(
                    							current,
                    							"parameterList",
                    							lv_parameterList_12_0,
                    							"org.xtext.example.oil.Oil.SchduleActionAttribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getExpiryAttributeAccess().getSemicolonKeyword_2_3());
                    			

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
    // $ANTLR end "ruleExpiryAttribute"


    // $ANTLR start "entryRuleSchduleActionAttribute"
    // InternalOil.g:6832:1: entryRuleSchduleActionAttribute returns [EObject current=null] : iv_ruleSchduleActionAttribute= ruleSchduleActionAttribute EOF ;
    public final EObject entryRuleSchduleActionAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchduleActionAttribute = null;


        try {
            // InternalOil.g:6832:63: (iv_ruleSchduleActionAttribute= ruleSchduleActionAttribute EOF )
            // InternalOil.g:6833:2: iv_ruleSchduleActionAttribute= ruleSchduleActionAttribute EOF
            {
             newCompositeNode(grammarAccess.getSchduleActionAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchduleActionAttribute=ruleSchduleActionAttribute();

            state._fsp--;

             current =iv_ruleSchduleActionAttribute; 
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
    // $ANTLR end "entryRuleSchduleActionAttribute"


    // $ANTLR start "ruleSchduleActionAttribute"
    // InternalOil.g:6839:1: ruleSchduleActionAttribute returns [EObject current=null] : ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'SETEVENT' otherlv_9= '{' ( (lv_setevent_10_0= ruleSetevent ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) ) ;
    public final EObject ruleSchduleActionAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_activatetask_2_0 = null;

        EObject lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_setevent_10_0 = null;

        EObject lv_value_12_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalOil.g:6845:2: ( ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'SETEVENT' otherlv_9= '{' ( (lv_setevent_10_0= ruleSetevent ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) ) )
            // InternalOil.g:6846:2: ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'SETEVENT' otherlv_9= '{' ( (lv_setevent_10_0= ruleSetevent ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) )
            {
            // InternalOil.g:6846:2: ( (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'SETEVENT' otherlv_9= '{' ( (lv_setevent_10_0= ruleSetevent ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) )
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==72) ) {
                alt181=1;
            }
            else if ( (LA181_0==74) ) {
                alt181=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;
            }
            switch (alt181) {
                case 1 :
                    // InternalOil.g:6847:3: (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' )
                    {
                    // InternalOil.g:6847:3: (otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' )
                    // InternalOil.g:6848:4: otherlv_0= 'ACTIVATETASK' otherlv_1= '{' ( (lv_activatetask_2_0= ruleActivateTask ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}'
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getSchduleActionAttributeAccess().getACTIVATETASKKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_77); 

                    				newLeafNode(otherlv_1, grammarAccess.getSchduleActionAttributeAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalOil.g:6856:4: ( (lv_activatetask_2_0= ruleActivateTask ) )
                    // InternalOil.g:6857:5: (lv_activatetask_2_0= ruleActivateTask )
                    {
                    // InternalOil.g:6857:5: (lv_activatetask_2_0= ruleActivateTask )
                    // InternalOil.g:6858:6: lv_activatetask_2_0= ruleActivateTask
                    {

                    						newCompositeNode(grammarAccess.getSchduleActionAttributeAccess().getActivatetaskActivateTaskEnumRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_activatetask_2_0=ruleActivateTask();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchduleActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"activatetask",
                    							lv_activatetask_2_0,
                    							"org.xtext.example.oil.Oil.ActivateTask");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6875:4: (otherlv_3= '=' )?
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==18) ) {
                        alt177=1;
                    }
                    switch (alt177) {
                        case 1 :
                            // InternalOil.g:6876:5: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_3, grammarAccess.getSchduleActionAttributeAccess().getEqualsSignKeyword_0_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:6881:4: ( (lv_value_4_0= ruleAttributeValue ) )
                    // InternalOil.g:6882:5: (lv_value_4_0= ruleAttributeValue )
                    {
                    // InternalOil.g:6882:5: (lv_value_4_0= ruleAttributeValue )
                    // InternalOil.g:6883:6: lv_value_4_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getSchduleActionAttributeAccess().getValueAttributeValueParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_4_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchduleActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6900:4: ( (lv_description_5_0= ruleEString ) )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==RULE_STRING) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // InternalOil.g:6901:5: (lv_description_5_0= ruleEString )
                            {
                            // InternalOil.g:6901:5: (lv_description_5_0= ruleEString )
                            // InternalOil.g:6902:6: lv_description_5_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getSchduleActionAttributeAccess().getDescriptionEStringParserRuleCall_0_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_5_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSchduleActionAttributeRule());
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

                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getSchduleActionAttributeAccess().getSemicolonKeyword_0_6());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getSchduleActionAttributeAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:6929:3: (otherlv_8= 'SETEVENT' otherlv_9= '{' ( (lv_setevent_10_0= ruleSetevent ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' )
                    {
                    // InternalOil.g:6929:3: (otherlv_8= 'SETEVENT' otherlv_9= '{' ( (lv_setevent_10_0= ruleSetevent ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' )
                    // InternalOil.g:6930:4: otherlv_8= 'SETEVENT' otherlv_9= '{' ( (lv_setevent_10_0= ruleSetevent ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}'
                    {
                    otherlv_8=(Token)match(input,74,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getSchduleActionAttributeAccess().getSETEVENTKeyword_1_0());
                    			
                    otherlv_9=(Token)match(input,22,FOLLOW_79); 

                    				newLeafNode(otherlv_9, grammarAccess.getSchduleActionAttributeAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalOil.g:6938:4: ( (lv_setevent_10_0= ruleSetevent ) )
                    // InternalOil.g:6939:5: (lv_setevent_10_0= ruleSetevent )
                    {
                    // InternalOil.g:6939:5: (lv_setevent_10_0= ruleSetevent )
                    // InternalOil.g:6940:6: lv_setevent_10_0= ruleSetevent
                    {

                    						newCompositeNode(grammarAccess.getSchduleActionAttributeAccess().getSeteventSeteventEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_setevent_10_0=ruleSetevent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchduleActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"setevent",
                    							lv_setevent_10_0,
                    							"org.xtext.example.oil.Oil.Setevent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6957:4: (otherlv_11= '=' )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==18) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // InternalOil.g:6958:5: otherlv_11= '='
                            {
                            otherlv_11=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_11, grammarAccess.getSchduleActionAttributeAccess().getEqualsSignKeyword_1_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:6963:4: ( (lv_value_12_0= ruleAttributeValue ) )
                    // InternalOil.g:6964:5: (lv_value_12_0= ruleAttributeValue )
                    {
                    // InternalOil.g:6964:5: (lv_value_12_0= ruleAttributeValue )
                    // InternalOil.g:6965:6: lv_value_12_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getSchduleActionAttributeAccess().getValueAttributeValueParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_12_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSchduleActionAttributeRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:6982:4: ( (lv_description_13_0= ruleEString ) )?
                    int alt180=2;
                    int LA180_0 = input.LA(1);

                    if ( (LA180_0==RULE_STRING) ) {
                        alt180=1;
                    }
                    switch (alt180) {
                        case 1 :
                            // InternalOil.g:6983:5: (lv_description_13_0= ruleEString )
                            {
                            // InternalOil.g:6983:5: (lv_description_13_0= ruleEString )
                            // InternalOil.g:6984:6: lv_description_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getSchduleActionAttributeAccess().getDescriptionEStringParserRuleCall_1_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_13_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getSchduleActionAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_13_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getSchduleActionAttributeAccess().getSemicolonKeyword_1_6());
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getSchduleActionAttributeAccess().getRightCurlyBracketKeyword_1_7());
                    			

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
    // $ANTLR end "ruleSchduleActionAttribute"


    // $ANTLR start "entryRuleIocRule"
    // InternalOil.g:7014:1: entryRuleIocRule returns [EObject current=null] : iv_ruleIocRule= ruleIocRule EOF ;
    public final EObject entryRuleIocRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIocRule = null;


        try {
            // InternalOil.g:7014:48: (iv_ruleIocRule= ruleIocRule EOF )
            // InternalOil.g:7015:2: iv_ruleIocRule= ruleIocRule EOF
            {
             newCompositeNode(grammarAccess.getIocRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIocRule=ruleIocRule();

            state._fsp--;

             current =iv_ruleIocRule; 
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
    // $ANTLR end "entryRuleIocRule"


    // $ANTLR start "ruleIocRule"
    // InternalOil.g:7021:1: ruleIocRule returns [EObject current=null] : (otherlv_0= 'IOC' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_ioclist_3_0= ruleIocAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' ) ;
    public final EObject ruleIocRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_ioclist_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:7027:2: ( (otherlv_0= 'IOC' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_ioclist_3_0= ruleIocAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' ) )
            // InternalOil.g:7028:2: (otherlv_0= 'IOC' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_ioclist_3_0= ruleIocAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' )
            {
            // InternalOil.g:7028:2: (otherlv_0= 'IOC' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_ioclist_3_0= ruleIocAttribute ) )* otherlv_4= '}' ) otherlv_5= ';' )
            // InternalOil.g:7029:3: otherlv_0= 'IOC' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_ioclist_3_0= ruleIocAttribute ) )* otherlv_4= '}' ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getIocRuleAccess().getIOCKeyword_0());
            		
            // InternalOil.g:7033:3: ( (lv_name_1_0= ruleName ) )
            // InternalOil.g:7034:4: (lv_name_1_0= ruleName )
            {
            // InternalOil.g:7034:4: (lv_name_1_0= ruleName )
            // InternalOil.g:7035:5: lv_name_1_0= ruleName
            {

            					newCompositeNode(grammarAccess.getIocRuleAccess().getNameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIocRuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.oil.Oil.Name");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:7052:3: (otherlv_2= '{' ( (lv_ioclist_3_0= ruleIocAttribute ) )* otherlv_4= '}' )
            // InternalOil.g:7053:4: otherlv_2= '{' ( (lv_ioclist_3_0= ruleIocAttribute ) )* otherlv_4= '}'
            {
            otherlv_2=(Token)match(input,22,FOLLOW_89); 

            				newLeafNode(otherlv_2, grammarAccess.getIocRuleAccess().getLeftCurlyBracketKeyword_2_0());
            			
            // InternalOil.g:7057:4: ( (lv_ioclist_3_0= ruleIocAttribute ) )*
            loop182:
            do {
                int alt182=2;
                int LA182_0 = input.LA(1);

                if ( ((LA182_0>=88 && LA182_0<=91)) ) {
                    alt182=1;
                }


                switch (alt182) {
            	case 1 :
            	    // InternalOil.g:7058:5: (lv_ioclist_3_0= ruleIocAttribute )
            	    {
            	    // InternalOil.g:7058:5: (lv_ioclist_3_0= ruleIocAttribute )
            	    // InternalOil.g:7059:6: lv_ioclist_3_0= ruleIocAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getIocRuleAccess().getIoclistIocAttributeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_89);
            	    lv_ioclist_3_0=ruleIocAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIocRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ioclist",
            	    							lv_ioclist_3_0,
            	    							"org.xtext.example.oil.Oil.IocAttribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop182;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            				newLeafNode(otherlv_4, grammarAccess.getIocRuleAccess().getRightCurlyBracketKeyword_2_2());
            			

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIocRuleAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleIocRule"


    // $ANTLR start "entryRuleIocAttribute"
    // InternalOil.g:7089:1: entryRuleIocAttribute returns [EObject current=null] : iv_ruleIocAttribute= ruleIocAttribute EOF ;
    public final EObject entryRuleIocAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIocAttribute = null;


        try {
            // InternalOil.g:7089:53: (iv_ruleIocAttribute= ruleIocAttribute EOF )
            // InternalOil.g:7090:2: iv_ruleIocAttribute= ruleIocAttribute EOF
            {
             newCompositeNode(grammarAccess.getIocAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIocAttribute=ruleIocAttribute();

            state._fsp--;

             current =iv_ruleIocAttribute; 
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
    // $ANTLR end "entryRuleIocAttribute"


    // $ANTLR start "ruleIocAttribute"
    // InternalOil.g:7096:1: ruleIocAttribute returns [EObject current=null] : ( (otherlv_0= 'DATATYPENAME' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' ) otherlv_5= ';' ) | (otherlv_6= 'SEMANTICS' (otherlv_7= '=' )? ( (lv_iocsemantics_8_0= ruleIocSemantics ) ) ( (lv_description_9_0= ruleEString ) )? otherlv_10= ';' ) | (otherlv_11= 'RECEIVER' ( (lv_name_12_0= ruleName ) ) (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' ) otherlv_16= ';' ) | (otherlv_17= 'SENDER' ( (lv_name_18_0= ruleName ) ) (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' ) otherlv_22= ';' ) ) ;
    public final EObject ruleIocAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_datatypeList_3_0 = null;

        EObject lv_iocsemantics_8_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_name_12_0 = null;

        EObject lv_receiverList_14_0 = null;

        AntlrDatatypeRuleToken lv_name_18_0 = null;

        EObject lv_senderList_20_0 = null;



        	enterRule();

        try {
            // InternalOil.g:7102:2: ( ( (otherlv_0= 'DATATYPENAME' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' ) otherlv_5= ';' ) | (otherlv_6= 'SEMANTICS' (otherlv_7= '=' )? ( (lv_iocsemantics_8_0= ruleIocSemantics ) ) ( (lv_description_9_0= ruleEString ) )? otherlv_10= ';' ) | (otherlv_11= 'RECEIVER' ( (lv_name_12_0= ruleName ) ) (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' ) otherlv_16= ';' ) | (otherlv_17= 'SENDER' ( (lv_name_18_0= ruleName ) ) (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' ) otherlv_22= ';' ) ) )
            // InternalOil.g:7103:2: ( (otherlv_0= 'DATATYPENAME' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' ) otherlv_5= ';' ) | (otherlv_6= 'SEMANTICS' (otherlv_7= '=' )? ( (lv_iocsemantics_8_0= ruleIocSemantics ) ) ( (lv_description_9_0= ruleEString ) )? otherlv_10= ';' ) | (otherlv_11= 'RECEIVER' ( (lv_name_12_0= ruleName ) ) (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' ) otherlv_16= ';' ) | (otherlv_17= 'SENDER' ( (lv_name_18_0= ruleName ) ) (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' ) otherlv_22= ';' ) )
            {
            // InternalOil.g:7103:2: ( (otherlv_0= 'DATATYPENAME' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' ) otherlv_5= ';' ) | (otherlv_6= 'SEMANTICS' (otherlv_7= '=' )? ( (lv_iocsemantics_8_0= ruleIocSemantics ) ) ( (lv_description_9_0= ruleEString ) )? otherlv_10= ';' ) | (otherlv_11= 'RECEIVER' ( (lv_name_12_0= ruleName ) ) (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' ) otherlv_16= ';' ) | (otherlv_17= 'SENDER' ( (lv_name_18_0= ruleName ) ) (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' ) otherlv_22= ';' ) )
            int alt188=4;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt188=1;
                }
                break;
            case 89:
                {
                alt188=2;
                }
                break;
            case 90:
                {
                alt188=3;
                }
                break;
            case 91:
                {
                alt188=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 188, 0, input);

                throw nvae;
            }

            switch (alt188) {
                case 1 :
                    // InternalOil.g:7104:3: (otherlv_0= 'DATATYPENAME' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' ) otherlv_5= ';' )
                    {
                    // InternalOil.g:7104:3: (otherlv_0= 'DATATYPENAME' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' ) otherlv_5= ';' )
                    // InternalOil.g:7105:4: otherlv_0= 'DATATYPENAME' ( (lv_name_1_0= ruleName ) ) (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' ) otherlv_5= ';'
                    {
                    otherlv_0=(Token)match(input,88,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getIocAttributeAccess().getDATATYPENAMEKeyword_0_0());
                    			
                    // InternalOil.g:7109:4: ( (lv_name_1_0= ruleName ) )
                    // InternalOil.g:7110:5: (lv_name_1_0= ruleName )
                    {
                    // InternalOil.g:7110:5: (lv_name_1_0= ruleName )
                    // InternalOil.g:7111:6: lv_name_1_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getIocAttributeAccess().getNameNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_1_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7128:4: (otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}' )
                    // InternalOil.g:7129:5: otherlv_2= '{' ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_90); 

                    					newLeafNode(otherlv_2, grammarAccess.getIocAttributeAccess().getLeftCurlyBracketKeyword_0_2_0());
                    				
                    // InternalOil.g:7133:5: ( (lv_datatypeList_3_0= ruleIocDataTypeAttr ) )*
                    loop183:
                    do {
                        int alt183=2;
                        int LA183_0 = input.LA(1);

                        if ( (LA183_0==92) ) {
                            alt183=1;
                        }


                        switch (alt183) {
                    	case 1 :
                    	    // InternalOil.g:7134:6: (lv_datatypeList_3_0= ruleIocDataTypeAttr )
                    	    {
                    	    // InternalOil.g:7134:6: (lv_datatypeList_3_0= ruleIocDataTypeAttr )
                    	    // InternalOil.g:7135:7: lv_datatypeList_3_0= ruleIocDataTypeAttr
                    	    {

                    	    							newCompositeNode(grammarAccess.getIocAttributeAccess().getDatatypeListIocDataTypeAttrParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_90);
                    	    lv_datatypeList_3_0=ruleIocDataTypeAttr();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"datatypeList",
                    	    								lv_datatypeList_3_0,
                    	    								"org.xtext.example.oil.Oil.IocDataTypeAttr");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop183;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_4, grammarAccess.getIocAttributeAccess().getRightCurlyBracketKeyword_0_2_2());
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getIocAttributeAccess().getSemicolonKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:7163:3: (otherlv_6= 'SEMANTICS' (otherlv_7= '=' )? ( (lv_iocsemantics_8_0= ruleIocSemantics ) ) ( (lv_description_9_0= ruleEString ) )? otherlv_10= ';' )
                    {
                    // InternalOil.g:7163:3: (otherlv_6= 'SEMANTICS' (otherlv_7= '=' )? ( (lv_iocsemantics_8_0= ruleIocSemantics ) ) ( (lv_description_9_0= ruleEString ) )? otherlv_10= ';' )
                    // InternalOil.g:7164:4: otherlv_6= 'SEMANTICS' (otherlv_7= '=' )? ( (lv_iocsemantics_8_0= ruleIocSemantics ) ) ( (lv_description_9_0= ruleEString ) )? otherlv_10= ';'
                    {
                    otherlv_6=(Token)match(input,89,FOLLOW_91); 

                    				newLeafNode(otherlv_6, grammarAccess.getIocAttributeAccess().getSEMANTICSKeyword_1_0());
                    			
                    // InternalOil.g:7168:4: (otherlv_7= '=' )?
                    int alt184=2;
                    int LA184_0 = input.LA(1);

                    if ( (LA184_0==18) ) {
                        alt184=1;
                    }
                    switch (alt184) {
                        case 1 :
                            // InternalOil.g:7169:5: otherlv_7= '='
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_91); 

                            					newLeafNode(otherlv_7, grammarAccess.getIocAttributeAccess().getEqualsSignKeyword_1_1());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:7174:4: ( (lv_iocsemantics_8_0= ruleIocSemantics ) )
                    // InternalOil.g:7175:5: (lv_iocsemantics_8_0= ruleIocSemantics )
                    {
                    // InternalOil.g:7175:5: (lv_iocsemantics_8_0= ruleIocSemantics )
                    // InternalOil.g:7176:6: lv_iocsemantics_8_0= ruleIocSemantics
                    {

                    						newCompositeNode(grammarAccess.getIocAttributeAccess().getIocsemanticsIocSemanticsParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_iocsemantics_8_0=ruleIocSemantics();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                    						}
                    						set(
                    							current,
                    							"iocsemantics",
                    							lv_iocsemantics_8_0,
                    							"org.xtext.example.oil.Oil.IocSemantics");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7193:4: ( (lv_description_9_0= ruleEString ) )?
                    int alt185=2;
                    int LA185_0 = input.LA(1);

                    if ( (LA185_0==RULE_STRING) ) {
                        alt185=1;
                    }
                    switch (alt185) {
                        case 1 :
                            // InternalOil.g:7194:5: (lv_description_9_0= ruleEString )
                            {
                            // InternalOil.g:7194:5: (lv_description_9_0= ruleEString )
                            // InternalOil.g:7195:6: lv_description_9_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getIocAttributeAccess().getDescriptionEStringParserRuleCall_1_3_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_9_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_9_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getIocAttributeAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:7218:3: (otherlv_11= 'RECEIVER' ( (lv_name_12_0= ruleName ) ) (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' ) otherlv_16= ';' )
                    {
                    // InternalOil.g:7218:3: (otherlv_11= 'RECEIVER' ( (lv_name_12_0= ruleName ) ) (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' ) otherlv_16= ';' )
                    // InternalOil.g:7219:4: otherlv_11= 'RECEIVER' ( (lv_name_12_0= ruleName ) ) (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' ) otherlv_16= ';'
                    {
                    otherlv_11=(Token)match(input,90,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getIocAttributeAccess().getRECEIVERKeyword_2_0());
                    			
                    // InternalOil.g:7223:4: ( (lv_name_12_0= ruleName ) )
                    // InternalOil.g:7224:5: (lv_name_12_0= ruleName )
                    {
                    // InternalOil.g:7224:5: (lv_name_12_0= ruleName )
                    // InternalOil.g:7225:6: lv_name_12_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getIocAttributeAccess().getNameNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_12_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_12_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7242:4: (otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}' )
                    // InternalOil.g:7243:5: otherlv_13= '{' ( (lv_receiverList_14_0= ruleIocReceiver ) )* otherlv_15= '}'
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_92); 

                    					newLeafNode(otherlv_13, grammarAccess.getIocAttributeAccess().getLeftCurlyBracketKeyword_2_2_0());
                    				
                    // InternalOil.g:7247:5: ( (lv_receiverList_14_0= ruleIocReceiver ) )*
                    loop186:
                    do {
                        int alt186=2;
                        int LA186_0 = input.LA(1);

                        if ( (LA186_0==71||(LA186_0>=163 && LA186_0<=164)) ) {
                            alt186=1;
                        }


                        switch (alt186) {
                    	case 1 :
                    	    // InternalOil.g:7248:6: (lv_receiverList_14_0= ruleIocReceiver )
                    	    {
                    	    // InternalOil.g:7248:6: (lv_receiverList_14_0= ruleIocReceiver )
                    	    // InternalOil.g:7249:7: lv_receiverList_14_0= ruleIocReceiver
                    	    {

                    	    							newCompositeNode(grammarAccess.getIocAttributeAccess().getReceiverListIocReceiverParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_92);
                    	    lv_receiverList_14_0=ruleIocReceiver();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"receiverList",
                    	    								lv_receiverList_14_0,
                    	    								"org.xtext.example.oil.Oil.IocReceiver");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop186;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_15, grammarAccess.getIocAttributeAccess().getRightCurlyBracketKeyword_2_2_2());
                    				

                    }

                    otherlv_16=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getIocAttributeAccess().getSemicolonKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:7277:3: (otherlv_17= 'SENDER' ( (lv_name_18_0= ruleName ) ) (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' ) otherlv_22= ';' )
                    {
                    // InternalOil.g:7277:3: (otherlv_17= 'SENDER' ( (lv_name_18_0= ruleName ) ) (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' ) otherlv_22= ';' )
                    // InternalOil.g:7278:4: otherlv_17= 'SENDER' ( (lv_name_18_0= ruleName ) ) (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' ) otherlv_22= ';'
                    {
                    otherlv_17=(Token)match(input,91,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getIocAttributeAccess().getSENDERKeyword_3_0());
                    			
                    // InternalOil.g:7282:4: ( (lv_name_18_0= ruleName ) )
                    // InternalOil.g:7283:5: (lv_name_18_0= ruleName )
                    {
                    // InternalOil.g:7283:5: (lv_name_18_0= ruleName )
                    // InternalOil.g:7284:6: lv_name_18_0= ruleName
                    {

                    						newCompositeNode(grammarAccess.getIocAttributeAccess().getNameNameParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_name_18_0=ruleName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_18_0,
                    							"org.xtext.example.oil.Oil.Name");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7301:4: (otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}' )
                    // InternalOil.g:7302:5: otherlv_19= '{' ( (lv_senderList_20_0= ruleIocSender ) )* otherlv_21= '}'
                    {
                    otherlv_19=(Token)match(input,22,FOLLOW_93); 

                    					newLeafNode(otherlv_19, grammarAccess.getIocAttributeAccess().getLeftCurlyBracketKeyword_3_2_0());
                    				
                    // InternalOil.g:7306:5: ( (lv_senderList_20_0= ruleIocSender ) )*
                    loop187:
                    do {
                        int alt187=2;
                        int LA187_0 = input.LA(1);

                        if ( ((LA187_0>=161 && LA187_0<=162)) ) {
                            alt187=1;
                        }


                        switch (alt187) {
                    	case 1 :
                    	    // InternalOil.g:7307:6: (lv_senderList_20_0= ruleIocSender )
                    	    {
                    	    // InternalOil.g:7307:6: (lv_senderList_20_0= ruleIocSender )
                    	    // InternalOil.g:7308:7: lv_senderList_20_0= ruleIocSender
                    	    {

                    	    							newCompositeNode(grammarAccess.getIocAttributeAccess().getSenderListIocSenderParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_93);
                    	    lv_senderList_20_0=ruleIocSender();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIocAttributeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"senderList",
                    	    								lv_senderList_20_0,
                    	    								"org.xtext.example.oil.Oil.IocSender");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop187;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,23,FOLLOW_10); 

                    					newLeafNode(otherlv_21, grammarAccess.getIocAttributeAccess().getRightCurlyBracketKeyword_3_2_2());
                    				

                    }

                    otherlv_22=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getIocAttributeAccess().getSemicolonKeyword_3_3());
                    			

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
    // $ANTLR end "ruleIocAttribute"


    // $ANTLR start "entryRuleIocSender"
    // InternalOil.g:7339:1: entryRuleIocSender returns [EObject current=null] : iv_ruleIocSender= ruleIocSender EOF ;
    public final EObject entryRuleIocSender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIocSender = null;


        try {
            // InternalOil.g:7339:50: (iv_ruleIocSender= ruleIocSender EOF )
            // InternalOil.g:7340:2: iv_ruleIocSender= ruleIocSender EOF
            {
             newCompositeNode(grammarAccess.getIocSenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIocSender=ruleIocSender();

            state._fsp--;

             current =iv_ruleIocSender; 
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
    // $ANTLR end "entryRuleIocSender"


    // $ANTLR start "ruleIocSender"
    // InternalOil.g:7346:1: ruleIocSender returns [EObject current=null] : ( ( (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleIocSender() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_enumiocsenderlist_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:7352:2: ( ( ( (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:7353:2: ( ( (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:7353:2: ( ( (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:7354:3: ( (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:7354:3: ( (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec ) )
            // InternalOil.g:7355:4: (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec )
            {
            // InternalOil.g:7355:4: (lv_enumiocsenderlist_0_0= ruleEnumIocSendRec )
            // InternalOil.g:7356:5: lv_enumiocsenderlist_0_0= ruleEnumIocSendRec
            {

            					newCompositeNode(grammarAccess.getIocSenderAccess().getEnumiocsenderlistEnumIocSendRecEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_66);
            lv_enumiocsenderlist_0_0=ruleEnumIocSendRec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIocSenderRule());
            					}
            					add(
            						current,
            						"enumiocsenderlist",
            						lv_enumiocsenderlist_0_0,
            						"org.xtext.example.oil.Oil.EnumIocSendRec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:7373:3: (otherlv_1= '=' )?
            int alt189=2;
            int LA189_0 = input.LA(1);

            if ( (LA189_0==18) ) {
                alt189=1;
            }
            switch (alt189) {
                case 1 :
                    // InternalOil.g:7374:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getIocSenderAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:7379:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:7380:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:7380:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:7381:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getIocSenderAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIocSenderRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.oil.Oil.AttributeValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:7398:3: ( (lv_description_3_0= ruleEString ) )?
            int alt190=2;
            int LA190_0 = input.LA(1);

            if ( (LA190_0==RULE_STRING) ) {
                alt190=1;
            }
            switch (alt190) {
                case 1 :
                    // InternalOil.g:7399:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:7399:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:7400:5: lv_description_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getIocSenderAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIocSenderRule());
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

            			newLeafNode(otherlv_4, grammarAccess.getIocSenderAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleIocSender"


    // $ANTLR start "entryRuleIocReceiver"
    // InternalOil.g:7425:1: entryRuleIocReceiver returns [EObject current=null] : iv_ruleIocReceiver= ruleIocReceiver EOF ;
    public final EObject entryRuleIocReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIocReceiver = null;


        try {
            // InternalOil.g:7425:52: (iv_ruleIocReceiver= ruleIocReceiver EOF )
            // InternalOil.g:7426:2: iv_ruleIocReceiver= ruleIocReceiver EOF
            {
             newCompositeNode(grammarAccess.getIocReceiverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIocReceiver=ruleIocReceiver();

            state._fsp--;

             current =iv_ruleIocReceiver; 
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
    // $ANTLR end "entryRuleIocReceiver"


    // $ANTLR start "ruleIocReceiver"
    // InternalOil.g:7432:1: ruleIocReceiver returns [EObject current=null] : ( ( (lv_enumioclist_0_0= ruleEnumIocRec ) ) (otherlv_1= '=' )? ( ( (lv_value_2_0= ruleAttributeValue ) ) | ( (lv_recnone_3_0= ruleIocReciverNone ) ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= ';' ) ;
    public final EObject ruleIocReceiver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Enumerator lv_enumioclist_0_0 = null;

        EObject lv_value_2_0 = null;

        Enumerator lv_recnone_3_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalOil.g:7438:2: ( ( ( (lv_enumioclist_0_0= ruleEnumIocRec ) ) (otherlv_1= '=' )? ( ( (lv_value_2_0= ruleAttributeValue ) ) | ( (lv_recnone_3_0= ruleIocReciverNone ) ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= ';' ) )
            // InternalOil.g:7439:2: ( ( (lv_enumioclist_0_0= ruleEnumIocRec ) ) (otherlv_1= '=' )? ( ( (lv_value_2_0= ruleAttributeValue ) ) | ( (lv_recnone_3_0= ruleIocReciverNone ) ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= ';' )
            {
            // InternalOil.g:7439:2: ( ( (lv_enumioclist_0_0= ruleEnumIocRec ) ) (otherlv_1= '=' )? ( ( (lv_value_2_0= ruleAttributeValue ) ) | ( (lv_recnone_3_0= ruleIocReciverNone ) ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= ';' )
            // InternalOil.g:7440:3: ( (lv_enumioclist_0_0= ruleEnumIocRec ) ) (otherlv_1= '=' )? ( ( (lv_value_2_0= ruleAttributeValue ) ) | ( (lv_recnone_3_0= ruleIocReciverNone ) ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= ';'
            {
            // InternalOil.g:7440:3: ( (lv_enumioclist_0_0= ruleEnumIocRec ) )
            // InternalOil.g:7441:4: (lv_enumioclist_0_0= ruleEnumIocRec )
            {
            // InternalOil.g:7441:4: (lv_enumioclist_0_0= ruleEnumIocRec )
            // InternalOil.g:7442:5: lv_enumioclist_0_0= ruleEnumIocRec
            {

            					newCompositeNode(grammarAccess.getIocReceiverAccess().getEnumioclistEnumIocRecEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_94);
            lv_enumioclist_0_0=ruleEnumIocRec();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIocReceiverRule());
            					}
            					add(
            						current,
            						"enumioclist",
            						lv_enumioclist_0_0,
            						"org.xtext.example.oil.Oil.EnumIocRec");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOil.g:7459:3: (otherlv_1= '=' )?
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==18) ) {
                alt191=1;
            }
            switch (alt191) {
                case 1 :
                    // InternalOil.g:7460:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_94); 

                    				newLeafNode(otherlv_1, grammarAccess.getIocReceiverAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:7465:3: ( ( (lv_value_2_0= ruleAttributeValue ) ) | ( (lv_recnone_3_0= ruleIocReciverNone ) ) )
            int alt192=2;
            int LA192_0 = input.LA(1);

            if ( (LA192_0==RULE_STRING||(LA192_0>=RULE_ID && LA192_0<=RULE_T_FLOAT)||(LA192_0>=33 && LA192_0<=34)||LA192_0==95) ) {
                alt192=1;
            }
            else if ( (LA192_0==79) ) {
                alt192=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 192, 0, input);

                throw nvae;
            }
            switch (alt192) {
                case 1 :
                    // InternalOil.g:7466:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    {
                    // InternalOil.g:7466:4: ( (lv_value_2_0= ruleAttributeValue ) )
                    // InternalOil.g:7467:5: (lv_value_2_0= ruleAttributeValue )
                    {
                    // InternalOil.g:7467:5: (lv_value_2_0= ruleAttributeValue )
                    // InternalOil.g:7468:6: lv_value_2_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getIocReceiverAccess().getValueAttributeValueParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocReceiverRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:7486:4: ( (lv_recnone_3_0= ruleIocReciverNone ) )
                    {
                    // InternalOil.g:7486:4: ( (lv_recnone_3_0= ruleIocReciverNone ) )
                    // InternalOil.g:7487:5: (lv_recnone_3_0= ruleIocReciverNone )
                    {
                    // InternalOil.g:7487:5: (lv_recnone_3_0= ruleIocReciverNone )
                    // InternalOil.g:7488:6: lv_recnone_3_0= ruleIocReciverNone
                    {

                    						newCompositeNode(grammarAccess.getIocReceiverAccess().getRecnoneIocReciverNoneEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_recnone_3_0=ruleIocReciverNone();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocReceiverRule());
                    						}
                    						set(
                    							current,
                    							"recnone",
                    							lv_recnone_3_0,
                    							"org.xtext.example.oil.Oil.IocReciverNone");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalOil.g:7506:3: ( (lv_description_4_0= ruleEString ) )?
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==RULE_STRING) ) {
                alt193=1;
            }
            switch (alt193) {
                case 1 :
                    // InternalOil.g:7507:4: (lv_description_4_0= ruleEString )
                    {
                    // InternalOil.g:7507:4: (lv_description_4_0= ruleEString )
                    // InternalOil.g:7508:5: lv_description_4_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getIocReceiverAccess().getDescriptionEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_description_4_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIocReceiverRule());
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIocReceiverAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleIocReceiver"


    // $ANTLR start "entryRuleIocDataTypeAttr"
    // InternalOil.g:7533:1: entryRuleIocDataTypeAttr returns [EObject current=null] : iv_ruleIocDataTypeAttr= ruleIocDataTypeAttr EOF ;
    public final EObject entryRuleIocDataTypeAttr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIocDataTypeAttr = null;


        try {
            // InternalOil.g:7533:56: (iv_ruleIocDataTypeAttr= ruleIocDataTypeAttr EOF )
            // InternalOil.g:7534:2: iv_ruleIocDataTypeAttr= ruleIocDataTypeAttr EOF
            {
             newCompositeNode(grammarAccess.getIocDataTypeAttrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIocDataTypeAttr=ruleIocDataTypeAttr();

            state._fsp--;

             current =iv_ruleIocDataTypeAttr; 
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
    // $ANTLR end "entryRuleIocDataTypeAttr"


    // $ANTLR start "ruleIocDataTypeAttr"
    // InternalOil.g:7540:1: ruleIocDataTypeAttr returns [EObject current=null] : (otherlv_0= 'DATATYPEPROPERTY' (otherlv_1= '=' )? ( (lv_iocdatatype_2_0= ruleIocDataType ) ) otherlv_3= ';' otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleIocDataTypeAttr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_iocdatatype_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:7546:2: ( (otherlv_0= 'DATATYPEPROPERTY' (otherlv_1= '=' )? ( (lv_iocdatatype_2_0= ruleIocDataType ) ) otherlv_3= ';' otherlv_4= '}' otherlv_5= ';' ) )
            // InternalOil.g:7547:2: (otherlv_0= 'DATATYPEPROPERTY' (otherlv_1= '=' )? ( (lv_iocdatatype_2_0= ruleIocDataType ) ) otherlv_3= ';' otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalOil.g:7547:2: (otherlv_0= 'DATATYPEPROPERTY' (otherlv_1= '=' )? ( (lv_iocdatatype_2_0= ruleIocDataType ) ) otherlv_3= ';' otherlv_4= '}' otherlv_5= ';' )
            // InternalOil.g:7548:3: otherlv_0= 'DATATYPEPROPERTY' (otherlv_1= '=' )? ( (lv_iocdatatype_2_0= ruleIocDataType ) ) otherlv_3= ';' otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_95); 

            			newLeafNode(otherlv_0, grammarAccess.getIocDataTypeAttrAccess().getDATATYPEPROPERTYKeyword_0());
            		
            // InternalOil.g:7552:3: (otherlv_1= '=' )?
            int alt194=2;
            int LA194_0 = input.LA(1);

            if ( (LA194_0==18) ) {
                alt194=1;
            }
            switch (alt194) {
                case 1 :
                    // InternalOil.g:7553:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_95); 

                    				newLeafNode(otherlv_1, grammarAccess.getIocDataTypeAttrAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:7558:3: ( (lv_iocdatatype_2_0= ruleIocDataType ) )
            // InternalOil.g:7559:4: (lv_iocdatatype_2_0= ruleIocDataType )
            {
            // InternalOil.g:7559:4: (lv_iocdatatype_2_0= ruleIocDataType )
            // InternalOil.g:7560:5: lv_iocdatatype_2_0= ruleIocDataType
            {

            					newCompositeNode(grammarAccess.getIocDataTypeAttrAccess().getIocdatatypeIocDataTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_iocdatatype_2_0=ruleIocDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIocDataTypeAttrRule());
            					}
            					set(
            						current,
            						"iocdatatype",
            						lv_iocdatatype_2_0,
            						"org.xtext.example.oil.Oil.IocDataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getIocDataTypeAttrAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getIocDataTypeAttrAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIocDataTypeAttrAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleIocDataTypeAttr"


    // $ANTLR start "entryRuleIocSemantics"
    // InternalOil.g:7593:1: entryRuleIocSemantics returns [EObject current=null] : iv_ruleIocSemantics= ruleIocSemantics EOF ;
    public final EObject entryRuleIocSemantics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIocSemantics = null;


        try {
            // InternalOil.g:7593:53: (iv_ruleIocSemantics= ruleIocSemantics EOF )
            // InternalOil.g:7594:2: iv_ruleIocSemantics= ruleIocSemantics EOF
            {
             newCompositeNode(grammarAccess.getIocSemanticsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIocSemantics=ruleIocSemantics();

            state._fsp--;

             current =iv_ruleIocSemantics; 
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
    // $ANTLR end "entryRuleIocSemantics"


    // $ANTLR start "ruleIocSemantics"
    // InternalOil.g:7600:1: ruleIocSemantics returns [EObject current=null] : ( (otherlv_0= 'QUEUED' otherlv_1= '{' ( (lv_iocSema_2_0= ruleIocSemanticsenum ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'LAST_IS_BEST' otherlv_9= '{' ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) ) ;
    public final EObject ruleIocSemantics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_iocSema_2_0 = null;

        EObject lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_iocSeman_10_0 = null;

        EObject lv_value_12_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalOil.g:7606:2: ( ( (otherlv_0= 'QUEUED' otherlv_1= '{' ( (lv_iocSema_2_0= ruleIocSemanticsenum ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'LAST_IS_BEST' otherlv_9= '{' ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) ) )
            // InternalOil.g:7607:2: ( (otherlv_0= 'QUEUED' otherlv_1= '{' ( (lv_iocSema_2_0= ruleIocSemanticsenum ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'LAST_IS_BEST' otherlv_9= '{' ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) )
            {
            // InternalOil.g:7607:2: ( (otherlv_0= 'QUEUED' otherlv_1= '{' ( (lv_iocSema_2_0= ruleIocSemanticsenum ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' ) | (otherlv_8= 'LAST_IS_BEST' otherlv_9= '{' ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' ) )
            int alt199=2;
            int LA199_0 = input.LA(1);

            if ( (LA199_0==93) ) {
                alt199=1;
            }
            else if ( (LA199_0==94) ) {
                alt199=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 199, 0, input);

                throw nvae;
            }
            switch (alt199) {
                case 1 :
                    // InternalOil.g:7608:3: (otherlv_0= 'QUEUED' otherlv_1= '{' ( (lv_iocSema_2_0= ruleIocSemanticsenum ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' )
                    {
                    // InternalOil.g:7608:3: (otherlv_0= 'QUEUED' otherlv_1= '{' ( (lv_iocSema_2_0= ruleIocSemanticsenum ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}' )
                    // InternalOil.g:7609:4: otherlv_0= 'QUEUED' otherlv_1= '{' ( (lv_iocSema_2_0= ruleIocSemanticsenum ) ) (otherlv_3= '=' )? ( (lv_value_4_0= ruleAttributeValue ) ) ( (lv_description_5_0= ruleEString ) )? otherlv_6= ';' otherlv_7= '}'
                    {
                    otherlv_0=(Token)match(input,93,FOLLOW_12); 

                    				newLeafNode(otherlv_0, grammarAccess.getIocSemanticsAccess().getQUEUEDKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_96); 

                    				newLeafNode(otherlv_1, grammarAccess.getIocSemanticsAccess().getLeftCurlyBracketKeyword_0_1());
                    			
                    // InternalOil.g:7617:4: ( (lv_iocSema_2_0= ruleIocSemanticsenum ) )
                    // InternalOil.g:7618:5: (lv_iocSema_2_0= ruleIocSemanticsenum )
                    {
                    // InternalOil.g:7618:5: (lv_iocSema_2_0= ruleIocSemanticsenum )
                    // InternalOil.g:7619:6: lv_iocSema_2_0= ruleIocSemanticsenum
                    {

                    						newCompositeNode(grammarAccess.getIocSemanticsAccess().getIocSemaIocSemanticsenumEnumRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_iocSema_2_0=ruleIocSemanticsenum();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocSemanticsRule());
                    						}
                    						set(
                    							current,
                    							"iocSema",
                    							lv_iocSema_2_0,
                    							"org.xtext.example.oil.Oil.IocSemanticsenum");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7636:4: (otherlv_3= '=' )?
                    int alt195=2;
                    int LA195_0 = input.LA(1);

                    if ( (LA195_0==18) ) {
                        alt195=1;
                    }
                    switch (alt195) {
                        case 1 :
                            // InternalOil.g:7637:5: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_3, grammarAccess.getIocSemanticsAccess().getEqualsSignKeyword_0_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:7642:4: ( (lv_value_4_0= ruleAttributeValue ) )
                    // InternalOil.g:7643:5: (lv_value_4_0= ruleAttributeValue )
                    {
                    // InternalOil.g:7643:5: (lv_value_4_0= ruleAttributeValue )
                    // InternalOil.g:7644:6: lv_value_4_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getIocSemanticsAccess().getValueAttributeValueParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_4_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocSemanticsRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7661:4: ( (lv_description_5_0= ruleEString ) )?
                    int alt196=2;
                    int LA196_0 = input.LA(1);

                    if ( (LA196_0==RULE_STRING) ) {
                        alt196=1;
                    }
                    switch (alt196) {
                        case 1 :
                            // InternalOil.g:7662:5: (lv_description_5_0= ruleEString )
                            {
                            // InternalOil.g:7662:5: (lv_description_5_0= ruleEString )
                            // InternalOil.g:7663:6: lv_description_5_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getIocSemanticsAccess().getDescriptionEStringParserRuleCall_0_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_5_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIocSemanticsRule());
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

                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getIocSemanticsAccess().getSemicolonKeyword_0_6());
                    			
                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getIocSemanticsAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:7690:3: (otherlv_8= 'LAST_IS_BEST' otherlv_9= '{' ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' )
                    {
                    // InternalOil.g:7690:3: (otherlv_8= 'LAST_IS_BEST' otherlv_9= '{' ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}' )
                    // InternalOil.g:7691:4: otherlv_8= 'LAST_IS_BEST' otherlv_9= '{' ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) ) (otherlv_11= '=' )? ( (lv_value_12_0= ruleAttributeValue ) ) ( (lv_description_13_0= ruleEString ) )? otherlv_14= ';' otherlv_15= '}'
                    {
                    otherlv_8=(Token)match(input,94,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getIocSemanticsAccess().getLAST_IS_BESTKeyword_1_0());
                    			
                    otherlv_9=(Token)match(input,22,FOLLOW_97); 

                    				newLeafNode(otherlv_9, grammarAccess.getIocSemanticsAccess().getLeftCurlyBracketKeyword_1_1());
                    			
                    // InternalOil.g:7699:4: ( (lv_iocSeman_10_0= ruleIocSemanticsenumm ) )
                    // InternalOil.g:7700:5: (lv_iocSeman_10_0= ruleIocSemanticsenumm )
                    {
                    // InternalOil.g:7700:5: (lv_iocSeman_10_0= ruleIocSemanticsenumm )
                    // InternalOil.g:7701:6: lv_iocSeman_10_0= ruleIocSemanticsenumm
                    {

                    						newCompositeNode(grammarAccess.getIocSemanticsAccess().getIocSemanIocSemanticsenummEnumRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_iocSeman_10_0=ruleIocSemanticsenumm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocSemanticsRule());
                    						}
                    						set(
                    							current,
                    							"iocSeman",
                    							lv_iocSeman_10_0,
                    							"org.xtext.example.oil.Oil.IocSemanticsenumm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7718:4: (otherlv_11= '=' )?
                    int alt197=2;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==18) ) {
                        alt197=1;
                    }
                    switch (alt197) {
                        case 1 :
                            // InternalOil.g:7719:5: otherlv_11= '='
                            {
                            otherlv_11=(Token)match(input,18,FOLLOW_29); 

                            					newLeafNode(otherlv_11, grammarAccess.getIocSemanticsAccess().getEqualsSignKeyword_1_3());
                            				

                            }
                            break;

                    }

                    // InternalOil.g:7724:4: ( (lv_value_12_0= ruleAttributeValue ) )
                    // InternalOil.g:7725:5: (lv_value_12_0= ruleAttributeValue )
                    {
                    // InternalOil.g:7725:5: (lv_value_12_0= ruleAttributeValue )
                    // InternalOil.g:7726:6: lv_value_12_0= ruleAttributeValue
                    {

                    						newCompositeNode(grammarAccess.getIocSemanticsAccess().getValueAttributeValueParserRuleCall_1_4_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_value_12_0=ruleAttributeValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIocSemanticsRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_12_0,
                    							"org.xtext.example.oil.Oil.AttributeValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalOil.g:7743:4: ( (lv_description_13_0= ruleEString ) )?
                    int alt198=2;
                    int LA198_0 = input.LA(1);

                    if ( (LA198_0==RULE_STRING) ) {
                        alt198=1;
                    }
                    switch (alt198) {
                        case 1 :
                            // InternalOil.g:7744:5: (lv_description_13_0= ruleEString )
                            {
                            // InternalOil.g:7744:5: (lv_description_13_0= ruleEString )
                            // InternalOil.g:7745:6: lv_description_13_0= ruleEString
                            {

                            						newCompositeNode(grammarAccess.getIocSemanticsAccess().getDescriptionEStringParserRuleCall_1_5_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_description_13_0=ruleEString();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getIocSemanticsRule());
                            						}
                            						set(
                            							current,
                            							"description",
                            							lv_description_13_0,
                            							"org.xtext.example.oil.Oil.EString");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_14, grammarAccess.getIocSemanticsAccess().getSemicolonKeyword_1_6());
                    			
                    otherlv_15=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getIocSemanticsAccess().getRightCurlyBracketKeyword_1_7());
                    			

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
    // $ANTLR end "ruleIocSemantics"


    // $ANTLR start "entryRuleAttribute"
    // InternalOil.g:7775:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalOil.g:7775:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalOil.g:7776:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalOil.g:7782:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalOil.g:7788:2: ( ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' ) )
            // InternalOil.g:7789:2: ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            {
            // InternalOil.g:7789:2: ( ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';' )
            // InternalOil.g:7790:3: ( (lv_name_0_0= ruleAttributeName ) ) (otherlv_1= '=' )? ( (lv_value_2_0= ruleAttributeValue ) ) ( (lv_description_3_0= ruleEString ) )? otherlv_4= ';'
            {
            // InternalOil.g:7790:3: ( (lv_name_0_0= ruleAttributeName ) )
            // InternalOil.g:7791:4: (lv_name_0_0= ruleAttributeName )
            {
            // InternalOil.g:7791:4: (lv_name_0_0= ruleAttributeName )
            // InternalOil.g:7792:5: lv_name_0_0= ruleAttributeName
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameAttributeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_66);
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

            // InternalOil.g:7809:3: (otherlv_1= '=' )?
            int alt200=2;
            int LA200_0 = input.LA(1);

            if ( (LA200_0==18) ) {
                alt200=1;
            }
            switch (alt200) {
                case 1 :
                    // InternalOil.g:7810:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
                    			

                    }
                    break;

            }

            // InternalOil.g:7815:3: ( (lv_value_2_0= ruleAttributeValue ) )
            // InternalOil.g:7816:4: (lv_value_2_0= ruleAttributeValue )
            {
            // InternalOil.g:7816:4: (lv_value_2_0= ruleAttributeValue )
            // InternalOil.g:7817:5: lv_value_2_0= ruleAttributeValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getValueAttributeValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalOil.g:7834:3: ( (lv_description_3_0= ruleEString ) )?
            int alt201=2;
            int LA201_0 = input.LA(1);

            if ( (LA201_0==RULE_STRING) ) {
                alt201=1;
            }
            switch (alt201) {
                case 1 :
                    // InternalOil.g:7835:4: (lv_description_3_0= ruleEString )
                    {
                    // InternalOil.g:7835:4: (lv_description_3_0= ruleEString )
                    // InternalOil.g:7836:5: lv_description_3_0= ruleEString
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
    // InternalOil.g:7861:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // InternalOil.g:7861:54: (iv_ruleAttributeName= ruleAttributeName EOF )
            // InternalOil.g:7862:2: iv_ruleAttributeName= ruleAttributeName EOF
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
    // InternalOil.g:7868:1: ruleAttributeName returns [EObject current=null] : ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_1 = null;

        AntlrDatatypeRuleToken lv_value_0_2 = null;



        	enterRule();

        try {
            // InternalOil.g:7874:2: ( ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) ) )
            // InternalOil.g:7875:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            {
            // InternalOil.g:7875:2: ( ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) ) )
            // InternalOil.g:7876:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            {
            // InternalOil.g:7876:3: ( (lv_value_0_1= ruleName | lv_value_0_2= ruleObject ) )
            // InternalOil.g:7877:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            {
            // InternalOil.g:7877:4: (lv_value_0_1= ruleName | lv_value_0_2= ruleObject )
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==RULE_ID) ) {
                alt202=1;
            }
            else if ( (LA202_0==24||LA202_0==26||LA202_0==29||LA202_0==31||LA202_0==38||(LA202_0>=41 && LA202_0<=54)) ) {
                alt202=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 202, 0, input);

                throw nvae;
            }
            switch (alt202) {
                case 1 :
                    // InternalOil.g:7878:5: lv_value_0_1= ruleName
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
                    // InternalOil.g:7894:5: lv_value_0_2= ruleObject
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
    // InternalOil.g:7915:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // InternalOil.g:7915:55: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // InternalOil.g:7916:2: iv_ruleAttributeValue= ruleAttributeValue EOF
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
    // InternalOil.g:7922:1: ruleAttributeValue returns [EObject current=null] : (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) ;
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
            // InternalOil.g:7928:2: ( (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue ) )
            // InternalOil.g:7929:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            {
            // InternalOil.g:7929:2: (this_NameAttributeValue_0= ruleNameAttributeValue | this_BooleanAttributeValue_1= ruleBooleanAttributeValue | this_NumberAttributeValue_2= ruleNumberAttributeValue | this_FloatAttributeValue_3= ruleFloatAttributeValue | this_StringAttributeValue_4= ruleStringAttributeValue | this_AutoAttributeValue_5= ruleAutoAttributeValue )
            int alt203=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt203=1;
                }
                break;
            case 33:
            case 34:
                {
                alt203=2;
                }
                break;
            case RULE_T_NUMBER:
                {
                alt203=3;
                }
                break;
            case RULE_T_FLOAT:
                {
                alt203=4;
                }
                break;
            case RULE_STRING:
                {
                alt203=5;
                }
                break;
            case 95:
                {
                alt203=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 203, 0, input);

                throw nvae;
            }

            switch (alt203) {
                case 1 :
                    // InternalOil.g:7930:3: this_NameAttributeValue_0= ruleNameAttributeValue
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
                    // InternalOil.g:7939:3: this_BooleanAttributeValue_1= ruleBooleanAttributeValue
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
                    // InternalOil.g:7948:3: this_NumberAttributeValue_2= ruleNumberAttributeValue
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
                    // InternalOil.g:7957:3: this_FloatAttributeValue_3= ruleFloatAttributeValue
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
                    // InternalOil.g:7966:3: this_StringAttributeValue_4= ruleStringAttributeValue
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
                    // InternalOil.g:7975:3: this_AutoAttributeValue_5= ruleAutoAttributeValue
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
    // InternalOil.g:7987:1: entryRuleNameAttributeValue returns [EObject current=null] : iv_ruleNameAttributeValue= ruleNameAttributeValue EOF ;
    public final EObject entryRuleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameAttributeValue = null;


        try {
            // InternalOil.g:7987:59: (iv_ruleNameAttributeValue= ruleNameAttributeValue EOF )
            // InternalOil.g:7988:2: iv_ruleNameAttributeValue= ruleNameAttributeValue EOF
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
    // InternalOil.g:7994:1: ruleNameAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleNameAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:8000:2: ( ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) )
            // InternalOil.g:8001:2: ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            {
            // InternalOil.g:8001:2: ( ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            // InternalOil.g:8002:3: ( (lv_value_0_0= ruleName ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            {
            // InternalOil.g:8002:3: ( (lv_value_0_0= ruleName ) )
            // InternalOil.g:8003:4: (lv_value_0_0= ruleName )
            {
            // InternalOil.g:8003:4: (lv_value_0_0= ruleName )
            // InternalOil.g:8004:5: lv_value_0_0= ruleName
            {

            					newCompositeNode(grammarAccess.getNameAttributeValueAccess().getValueNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_98);
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

            // InternalOil.g:8021:3: (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            int alt205=2;
            int LA205_0 = input.LA(1);

            if ( (LA205_0==22) ) {
                alt205=1;
            }
            switch (alt205) {
                case 1 :
                    // InternalOil.g:8022:4: otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_99); 

                    				newLeafNode(otherlv_1, grammarAccess.getNameAttributeValueAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOil.g:8026:4: ( (lv_parameterList_2_0= ruleAttribute ) )*
                    loop204:
                    do {
                        int alt204=2;
                        int LA204_0 = input.LA(1);

                        if ( (LA204_0==RULE_ID||LA204_0==24||LA204_0==26||LA204_0==29||LA204_0==31||LA204_0==38||(LA204_0>=41 && LA204_0<=54)) ) {
                            alt204=1;
                        }


                        switch (alt204) {
                    	case 1 :
                    	    // InternalOil.g:8027:5: (lv_parameterList_2_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:8027:5: (lv_parameterList_2_0= ruleAttribute )
                    	    // InternalOil.g:8028:6: lv_parameterList_2_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getNameAttributeValueAccess().getParameterListAttributeParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_99);
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
                    	    break loop204;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalOil.g:8054:1: entryRuleBooleanAttributeValue returns [EObject current=null] : iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF ;
    public final EObject entryRuleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanAttributeValue = null;


        try {
            // InternalOil.g:8054:62: (iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF )
            // InternalOil.g:8055:2: iv_ruleBooleanAttributeValue= ruleBooleanAttributeValue EOF
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
    // InternalOil.g:8061:1: ruleBooleanAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) ;
    public final EObject ruleBooleanAttributeValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        EObject lv_parameterList_2_0 = null;



        	enterRule();

        try {
            // InternalOil.g:8067:2: ( ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? ) )
            // InternalOil.g:8068:2: ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            {
            // InternalOil.g:8068:2: ( ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )? )
            // InternalOil.g:8069:3: ( (lv_value_0_0= ruleEBoolean ) ) (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            {
            // InternalOil.g:8069:3: ( (lv_value_0_0= ruleEBoolean ) )
            // InternalOil.g:8070:4: (lv_value_0_0= ruleEBoolean )
            {
            // InternalOil.g:8070:4: (lv_value_0_0= ruleEBoolean )
            // InternalOil.g:8071:5: lv_value_0_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBooleanAttributeValueAccess().getValueEBooleanParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_98);
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

            // InternalOil.g:8088:3: (otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}' )?
            int alt207=2;
            int LA207_0 = input.LA(1);

            if ( (LA207_0==22) ) {
                alt207=1;
            }
            switch (alt207) {
                case 1 :
                    // InternalOil.g:8089:4: otherlv_1= '{' ( (lv_parameterList_2_0= ruleAttribute ) )* otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_99); 

                    				newLeafNode(otherlv_1, grammarAccess.getBooleanAttributeValueAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalOil.g:8093:4: ( (lv_parameterList_2_0= ruleAttribute ) )*
                    loop206:
                    do {
                        int alt206=2;
                        int LA206_0 = input.LA(1);

                        if ( (LA206_0==RULE_ID||LA206_0==24||LA206_0==26||LA206_0==29||LA206_0==31||LA206_0==38||(LA206_0>=41 && LA206_0<=54)) ) {
                            alt206=1;
                        }


                        switch (alt206) {
                    	case 1 :
                    	    // InternalOil.g:8094:5: (lv_parameterList_2_0= ruleAttribute )
                    	    {
                    	    // InternalOil.g:8094:5: (lv_parameterList_2_0= ruleAttribute )
                    	    // InternalOil.g:8095:6: lv_parameterList_2_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getBooleanAttributeValueAccess().getParameterListAttributeParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_99);
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
                    	    break loop206;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,23,FOLLOW_2); 

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
    // InternalOil.g:8121:1: entryRuleNumberAttributeValue returns [EObject current=null] : iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF ;
    public final EObject entryRuleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberAttributeValue = null;


        try {
            // InternalOil.g:8121:61: (iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF )
            // InternalOil.g:8122:2: iv_ruleNumberAttributeValue= ruleNumberAttributeValue EOF
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
    // InternalOil.g:8128:1: ruleNumberAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:8134:2: ( ( (lv_value_0_0= ruleNumber ) ) )
            // InternalOil.g:8135:2: ( (lv_value_0_0= ruleNumber ) )
            {
            // InternalOil.g:8135:2: ( (lv_value_0_0= ruleNumber ) )
            // InternalOil.g:8136:3: (lv_value_0_0= ruleNumber )
            {
            // InternalOil.g:8136:3: (lv_value_0_0= ruleNumber )
            // InternalOil.g:8137:4: lv_value_0_0= ruleNumber
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
    // InternalOil.g:8157:1: entryRuleFloatAttributeValue returns [EObject current=null] : iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF ;
    public final EObject entryRuleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloatAttributeValue = null;


        try {
            // InternalOil.g:8157:60: (iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF )
            // InternalOil.g:8158:2: iv_ruleFloatAttributeValue= ruleFloatAttributeValue EOF
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
    // InternalOil.g:8164:1: ruleFloatAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEFloat ) ) ;
    public final EObject ruleFloatAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:8170:2: ( ( (lv_value_0_0= ruleEFloat ) ) )
            // InternalOil.g:8171:2: ( (lv_value_0_0= ruleEFloat ) )
            {
            // InternalOil.g:8171:2: ( (lv_value_0_0= ruleEFloat ) )
            // InternalOil.g:8172:3: (lv_value_0_0= ruleEFloat )
            {
            // InternalOil.g:8172:3: (lv_value_0_0= ruleEFloat )
            // InternalOil.g:8173:4: lv_value_0_0= ruleEFloat
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
    // InternalOil.g:8193:1: entryRuleStringAttributeValue returns [EObject current=null] : iv_ruleStringAttributeValue= ruleStringAttributeValue EOF ;
    public final EObject entryRuleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringAttributeValue = null;


        try {
            // InternalOil.g:8193:61: (iv_ruleStringAttributeValue= ruleStringAttributeValue EOF )
            // InternalOil.g:8194:2: iv_ruleStringAttributeValue= ruleStringAttributeValue EOF
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
    // InternalOil.g:8200:1: ruleStringAttributeValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringAttributeValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalOil.g:8206:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalOil.g:8207:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalOil.g:8207:2: ( (lv_value_0_0= ruleEString ) )
            // InternalOil.g:8208:3: (lv_value_0_0= ruleEString )
            {
            // InternalOil.g:8208:3: (lv_value_0_0= ruleEString )
            // InternalOil.g:8209:4: lv_value_0_0= ruleEString
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
    // InternalOil.g:8229:1: entryRuleAutoAttributeValue returns [EObject current=null] : iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF ;
    public final EObject entryRuleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutoAttributeValue = null;


        try {
            // InternalOil.g:8229:59: (iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF )
            // InternalOil.g:8230:2: iv_ruleAutoAttributeValue= ruleAutoAttributeValue EOF
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
    // InternalOil.g:8236:1: ruleAutoAttributeValue returns [EObject current=null] : ( (lv_value_0_0= 'AUTO' ) ) ;
    public final EObject ruleAutoAttributeValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalOil.g:8242:2: ( ( (lv_value_0_0= 'AUTO' ) ) )
            // InternalOil.g:8243:2: ( (lv_value_0_0= 'AUTO' ) )
            {
            // InternalOil.g:8243:2: ( (lv_value_0_0= 'AUTO' ) )
            // InternalOil.g:8244:3: (lv_value_0_0= 'AUTO' )
            {
            // InternalOil.g:8244:3: (lv_value_0_0= 'AUTO' )
            // InternalOil.g:8245:4: lv_value_0_0= 'AUTO'
            {
            lv_value_0_0=(Token)match(input,95,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalOil.g:8260:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalOil.g:8260:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalOil.g:8261:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalOil.g:8267:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TRUE' | kw= 'FALSE' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOil.g:8273:2: ( (kw= 'TRUE' | kw= 'FALSE' ) )
            // InternalOil.g:8274:2: (kw= 'TRUE' | kw= 'FALSE' )
            {
            // InternalOil.g:8274:2: (kw= 'TRUE' | kw= 'FALSE' )
            int alt208=2;
            int LA208_0 = input.LA(1);

            if ( (LA208_0==33) ) {
                alt208=1;
            }
            else if ( (LA208_0==34) ) {
                alt208=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 208, 0, input);

                throw nvae;
            }
            switch (alt208) {
                case 1 :
                    // InternalOil.g:8275:3: kw= 'TRUE'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTRUEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOil.g:8281:3: kw= 'FALSE'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFALSEKeyword_1());
                    		

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


    // $ANTLR start "entryRuleEString"
    // InternalOil.g:8290:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalOil.g:8290:47: (iv_ruleEString= ruleEString EOF )
            // InternalOil.g:8291:2: iv_ruleEString= ruleEString EOF
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
    // InternalOil.g:8297:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalOil.g:8303:2: (this_STRING_0= RULE_STRING )
            // InternalOil.g:8304:2: this_STRING_0= RULE_STRING
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
    // InternalOil.g:8314:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalOil.g:8314:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalOil.g:8315:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalOil.g:8321:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_NUMBER_0= RULE_T_NUMBER ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_NUMBER_0=null;


        	enterRule();

        try {
            // InternalOil.g:8327:2: (this_T_NUMBER_0= RULE_T_NUMBER )
            // InternalOil.g:8328:2: this_T_NUMBER_0= RULE_T_NUMBER
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
    // InternalOil.g:8338:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalOil.g:8338:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalOil.g:8339:2: iv_ruleEFloat= ruleEFloat EOF
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
    // InternalOil.g:8345:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_T_FLOAT_0= RULE_T_FLOAT ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_T_FLOAT_0=null;


        	enterRule();

        try {
            // InternalOil.g:8351:2: (this_T_FLOAT_0= RULE_T_FLOAT )
            // InternalOil.g:8352:2: this_T_FLOAT_0= RULE_T_FLOAT
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
    // InternalOil.g:8362:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // InternalOil.g:8362:44: (iv_ruleName= ruleName EOF )
            // InternalOil.g:8363:2: iv_ruleName= ruleName EOF
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
    // InternalOil.g:8369:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalOil.g:8375:2: (this_ID_0= RULE_ID )
            // InternalOil.g:8376:2: this_ID_0= RULE_ID
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


    // $ANTLR start "ruleImpTaskParamEnum"
    // InternalOil.g:8386:1: ruleImpTaskParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'STACKSIZE' ) | (enumLiteral_1= 'PRIORITY' ) ) ;
    public final Enumerator ruleImpTaskParamEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:8392:2: ( ( (enumLiteral_0= 'STACKSIZE' ) | (enumLiteral_1= 'PRIORITY' ) ) )
            // InternalOil.g:8393:2: ( (enumLiteral_0= 'STACKSIZE' ) | (enumLiteral_1= 'PRIORITY' ) )
            {
            // InternalOil.g:8393:2: ( (enumLiteral_0= 'STACKSIZE' ) | (enumLiteral_1= 'PRIORITY' ) )
            int alt209=2;
            int LA209_0 = input.LA(1);

            if ( (LA209_0==96) ) {
                alt209=1;
            }
            else if ( (LA209_0==97) ) {
                alt209=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 209, 0, input);

                throw nvae;
            }
            switch (alt209) {
                case 1 :
                    // InternalOil.g:8394:3: (enumLiteral_0= 'STACKSIZE' )
                    {
                    // InternalOil.g:8394:3: (enumLiteral_0= 'STACKSIZE' )
                    // InternalOil.g:8395:4: enumLiteral_0= 'STACKSIZE'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getImpTaskParamEnumAccess().getSTACKSIZEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImpTaskParamEnumAccess().getSTACKSIZEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8402:3: (enumLiteral_1= 'PRIORITY' )
                    {
                    // InternalOil.g:8402:3: (enumLiteral_1= 'PRIORITY' )
                    // InternalOil.g:8403:4: enumLiteral_1= 'PRIORITY'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getImpTaskParamEnumAccess().getPRIORITYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImpTaskParamEnumAccess().getPRIORITYEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleImpTaskParamEnum"


    // $ANTLR start "ruleImpCounterParamEnum"
    // InternalOil.g:8413:1: ruleImpCounterParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'SOURCE' ) | (enumLiteral_1= 'FREQUENCY' ) ) ;
    public final Enumerator ruleImpCounterParamEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:8419:2: ( ( (enumLiteral_0= 'SOURCE' ) | (enumLiteral_1= 'FREQUENCY' ) ) )
            // InternalOil.g:8420:2: ( (enumLiteral_0= 'SOURCE' ) | (enumLiteral_1= 'FREQUENCY' ) )
            {
            // InternalOil.g:8420:2: ( (enumLiteral_0= 'SOURCE' ) | (enumLiteral_1= 'FREQUENCY' ) )
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==98) ) {
                alt210=1;
            }
            else if ( (LA210_0==99) ) {
                alt210=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 210, 0, input);

                throw nvae;
            }
            switch (alt210) {
                case 1 :
                    // InternalOil.g:8421:3: (enumLiteral_0= 'SOURCE' )
                    {
                    // InternalOil.g:8421:3: (enumLiteral_0= 'SOURCE' )
                    // InternalOil.g:8422:4: enumLiteral_0= 'SOURCE'
                    {
                    enumLiteral_0=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getImpCounterParamEnumAccess().getSOURCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImpCounterParamEnumAccess().getSOURCEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8429:3: (enumLiteral_1= 'FREQUENCY' )
                    {
                    // InternalOil.g:8429:3: (enumLiteral_1= 'FREQUENCY' )
                    // InternalOil.g:8430:4: enumLiteral_1= 'FREQUENCY'
                    {
                    enumLiteral_1=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getImpCounterParamEnumAccess().getFREQUENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImpCounterParamEnumAccess().getFREQUENCYEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleImpCounterParamEnum"


    // $ANTLR start "ruleApplicationParamEnum"
    // InternalOil.g:8440:1: ruleApplicationParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) ) ;
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
            // InternalOil.g:8446:2: ( ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) ) )
            // InternalOil.g:8447:2: ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) )
            {
            // InternalOil.g:8447:2: ( (enumLiteral_0= 'CORE' ) | (enumLiteral_1= 'ALARM' ) | (enumLiteral_2= 'COUNTER' ) | (enumLiteral_3= 'RESOURCE' ) | (enumLiteral_4= 'TASK' ) | (enumLiteral_5= 'ISR' ) | (enumLiteral_6= 'MESSAGE' ) | (enumLiteral_7= 'SCHEDULETABLE' ) | (enumLiteral_8= 'IOC' ) | (enumLiteral_9= 'ERRORHOOK' ) | (enumLiteral_10= 'SHUTDOWNHOOK' ) | (enumLiteral_11= 'STARTUPHOOK' ) )
            int alt211=12;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt211=1;
                }
                break;
            case 41:
                {
                alt211=2;
                }
                break;
            case 29:
                {
                alt211=3;
                }
                break;
            case 42:
                {
                alt211=4;
                }
                break;
            case 24:
                {
                alt211=5;
                }
                break;
            case 38:
                {
                alt211=6;
                }
                break;
            case 44:
                {
                alt211=7;
                }
                break;
            case 52:
                {
                alt211=8;
                }
                break;
            case 53:
                {
                alt211=9;
                }
                break;
            case 101:
                {
                alt211=10;
                }
                break;
            case 102:
                {
                alt211=11;
                }
                break;
            case 103:
                {
                alt211=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 211, 0, input);

                throw nvae;
            }

            switch (alt211) {
                case 1 :
                    // InternalOil.g:8448:3: (enumLiteral_0= 'CORE' )
                    {
                    // InternalOil.g:8448:3: (enumLiteral_0= 'CORE' )
                    // InternalOil.g:8449:4: enumLiteral_0= 'CORE'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getCOREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getApplicationParamEnumAccess().getCOREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8456:3: (enumLiteral_1= 'ALARM' )
                    {
                    // InternalOil.g:8456:3: (enumLiteral_1= 'ALARM' )
                    // InternalOil.g:8457:4: enumLiteral_1= 'ALARM'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getALARMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getApplicationParamEnumAccess().getALARMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:8464:3: (enumLiteral_2= 'COUNTER' )
                    {
                    // InternalOil.g:8464:3: (enumLiteral_2= 'COUNTER' )
                    // InternalOil.g:8465:4: enumLiteral_2= 'COUNTER'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getCOUNTEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getApplicationParamEnumAccess().getCOUNTEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:8472:3: (enumLiteral_3= 'RESOURCE' )
                    {
                    // InternalOil.g:8472:3: (enumLiteral_3= 'RESOURCE' )
                    // InternalOil.g:8473:4: enumLiteral_3= 'RESOURCE'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getRESOURCEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getApplicationParamEnumAccess().getRESOURCEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:8480:3: (enumLiteral_4= 'TASK' )
                    {
                    // InternalOil.g:8480:3: (enumLiteral_4= 'TASK' )
                    // InternalOil.g:8481:4: enumLiteral_4= 'TASK'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getTASKEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getApplicationParamEnumAccess().getTASKEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:8488:3: (enumLiteral_5= 'ISR' )
                    {
                    // InternalOil.g:8488:3: (enumLiteral_5= 'ISR' )
                    // InternalOil.g:8489:4: enumLiteral_5= 'ISR'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getISREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getApplicationParamEnumAccess().getISREnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:8496:3: (enumLiteral_6= 'MESSAGE' )
                    {
                    // InternalOil.g:8496:3: (enumLiteral_6= 'MESSAGE' )
                    // InternalOil.g:8497:4: enumLiteral_6= 'MESSAGE'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getMESSAGEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getApplicationParamEnumAccess().getMESSAGEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:8504:3: (enumLiteral_7= 'SCHEDULETABLE' )
                    {
                    // InternalOil.g:8504:3: (enumLiteral_7= 'SCHEDULETABLE' )
                    // InternalOil.g:8505:4: enumLiteral_7= 'SCHEDULETABLE'
                    {
                    enumLiteral_7=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getSCHEDULETABLEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getApplicationParamEnumAccess().getSCHEDULETABLEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOil.g:8512:3: (enumLiteral_8= 'IOC' )
                    {
                    // InternalOil.g:8512:3: (enumLiteral_8= 'IOC' )
                    // InternalOil.g:8513:4: enumLiteral_8= 'IOC'
                    {
                    enumLiteral_8=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getIOCEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getApplicationParamEnumAccess().getIOCEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOil.g:8520:3: (enumLiteral_9= 'ERRORHOOK' )
                    {
                    // InternalOil.g:8520:3: (enumLiteral_9= 'ERRORHOOK' )
                    // InternalOil.g:8521:4: enumLiteral_9= 'ERRORHOOK'
                    {
                    enumLiteral_9=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getERRORHOOKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getApplicationParamEnumAccess().getERRORHOOKEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOil.g:8528:3: (enumLiteral_10= 'SHUTDOWNHOOK' )
                    {
                    // InternalOil.g:8528:3: (enumLiteral_10= 'SHUTDOWNHOOK' )
                    // InternalOil.g:8529:4: enumLiteral_10= 'SHUTDOWNHOOK'
                    {
                    enumLiteral_10=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getApplicationParamEnumAccess().getSHUTDOWNHOOKEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getApplicationParamEnumAccess().getSHUTDOWNHOOKEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOil.g:8536:3: (enumLiteral_11= 'STARTUPHOOK' )
                    {
                    // InternalOil.g:8536:3: (enumLiteral_11= 'STARTUPHOOK' )
                    // InternalOil.g:8537:4: enumLiteral_11= 'STARTUPHOOK'
                    {
                    enumLiteral_11=(Token)match(input,103,FOLLOW_2); 

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
    // InternalOil.g:8547:1: ruleTimingProtectionParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) ) ;
    public final Enumerator ruleTimingProtectionParamEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOil.g:8553:2: ( ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) ) )
            // InternalOil.g:8554:2: ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) )
            {
            // InternalOil.g:8554:2: ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_2= 'EXECUTIONTIME' ) | (enumLiteral_3= 'TIMEFRAME' ) )
            int alt212=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt212=1;
                }
                break;
            case 105:
                {
                alt212=2;
                }
                break;
            case 106:
                {
                alt212=3;
                }
                break;
            case 107:
                {
                alt212=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 212, 0, input);

                throw nvae;
            }

            switch (alt212) {
                case 1 :
                    // InternalOil.g:8555:3: (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' )
                    {
                    // InternalOil.g:8555:3: (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' )
                    // InternalOil.g:8556:4: enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getTimingProtectionParamEnumAccess().getMAXALLINTERRUPTLOCKTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimingProtectionParamEnumAccess().getMAXALLINTERRUPTLOCKTIMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8563:3: (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' )
                    {
                    // InternalOil.g:8563:3: (enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME' )
                    // InternalOil.g:8564:4: enumLiteral_1= 'MAXOSINTERRUPTLOCKTIME'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getTimingProtectionParamEnumAccess().getMAXOSINTERRUPTLOCKTIMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimingProtectionParamEnumAccess().getMAXOSINTERRUPTLOCKTIMEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:8571:3: (enumLiteral_2= 'EXECUTIONTIME' )
                    {
                    // InternalOil.g:8571:3: (enumLiteral_2= 'EXECUTIONTIME' )
                    // InternalOil.g:8572:4: enumLiteral_2= 'EXECUTIONTIME'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTimingProtectionParamEnumAccess().getEXECUTIONTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimingProtectionParamEnumAccess().getEXECUTIONTIMEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:8579:3: (enumLiteral_3= 'TIMEFRAME' )
                    {
                    // InternalOil.g:8579:3: (enumLiteral_3= 'TIMEFRAME' )
                    // InternalOil.g:8580:4: enumLiteral_3= 'TIMEFRAME'
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); 

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
    // InternalOil.g:8590:1: ruleIsrParamEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) ) ;
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
            // InternalOil.g:8596:2: ( ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) ) )
            // InternalOil.g:8597:2: ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) )
            {
            // InternalOil.g:8597:2: ( (enumLiteral_0= 'CATEGORY' ) | (enumLiteral_1= 'RESOURCE' ) | (enumLiteral_2= 'MESSAGE' ) | (enumLiteral_3= 'PRIORITY' ) | (enumLiteral_4= 'ENTRY' ) | (enumLiteral_5= 'STACKSIZE' ) | (enumLiteral_6= 'SOURCE' ) )
            int alt213=7;
            switch ( input.LA(1) ) {
            case 108:
                {
                alt213=1;
                }
                break;
            case 42:
                {
                alt213=2;
                }
                break;
            case 44:
                {
                alt213=3;
                }
                break;
            case 97:
                {
                alt213=4;
                }
                break;
            case 109:
                {
                alt213=5;
                }
                break;
            case 96:
                {
                alt213=6;
                }
                break;
            case 98:
                {
                alt213=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 213, 0, input);

                throw nvae;
            }

            switch (alt213) {
                case 1 :
                    // InternalOil.g:8598:3: (enumLiteral_0= 'CATEGORY' )
                    {
                    // InternalOil.g:8598:3: (enumLiteral_0= 'CATEGORY' )
                    // InternalOil.g:8599:4: enumLiteral_0= 'CATEGORY'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getCATEGORYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIsrParamEnumAccess().getCATEGORYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8606:3: (enumLiteral_1= 'RESOURCE' )
                    {
                    // InternalOil.g:8606:3: (enumLiteral_1= 'RESOURCE' )
                    // InternalOil.g:8607:4: enumLiteral_1= 'RESOURCE'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getRESOURCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIsrParamEnumAccess().getRESOURCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:8614:3: (enumLiteral_2= 'MESSAGE' )
                    {
                    // InternalOil.g:8614:3: (enumLiteral_2= 'MESSAGE' )
                    // InternalOil.g:8615:4: enumLiteral_2= 'MESSAGE'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getMESSAGEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIsrParamEnumAccess().getMESSAGEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:8622:3: (enumLiteral_3= 'PRIORITY' )
                    {
                    // InternalOil.g:8622:3: (enumLiteral_3= 'PRIORITY' )
                    // InternalOil.g:8623:4: enumLiteral_3= 'PRIORITY'
                    {
                    enumLiteral_3=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getPRIORITYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIsrParamEnumAccess().getPRIORITYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:8630:3: (enumLiteral_4= 'ENTRY' )
                    {
                    // InternalOil.g:8630:3: (enumLiteral_4= 'ENTRY' )
                    // InternalOil.g:8631:4: enumLiteral_4= 'ENTRY'
                    {
                    enumLiteral_4=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getENTRYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getIsrParamEnumAccess().getENTRYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:8638:3: (enumLiteral_5= 'STACKSIZE' )
                    {
                    // InternalOil.g:8638:3: (enumLiteral_5= 'STACKSIZE' )
                    // InternalOil.g:8639:4: enumLiteral_5= 'STACKSIZE'
                    {
                    enumLiteral_5=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getIsrParamEnumAccess().getSTACKSIZEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getIsrParamEnumAccess().getSTACKSIZEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:8646:3: (enumLiteral_6= 'SOURCE' )
                    {
                    // InternalOil.g:8646:3: (enumLiteral_6= 'SOURCE' )
                    // InternalOil.g:8647:4: enumLiteral_6= 'SOURCE'
                    {
                    enumLiteral_6=(Token)match(input,98,FOLLOW_2); 

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
    // InternalOil.g:8657:1: ruleIntTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) ;
    public final Enumerator ruleIntTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalOil.g:8663:2: ( ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) ) )
            // InternalOil.g:8664:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            {
            // InternalOil.g:8664:2: ( (enumLiteral_0= 'UINT32' ) | (enumLiteral_1= 'INT32' ) | (enumLiteral_2= 'UINT64' ) | (enumLiteral_3= 'INT64' ) )
            int alt214=4;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt214=1;
                }
                break;
            case 111:
                {
                alt214=2;
                }
                break;
            case 112:
                {
                alt214=3;
                }
                break;
            case 113:
                {
                alt214=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 214, 0, input);

                throw nvae;
            }

            switch (alt214) {
                case 1 :
                    // InternalOil.g:8665:3: (enumLiteral_0= 'UINT32' )
                    {
                    // InternalOil.g:8665:3: (enumLiteral_0= 'UINT32' )
                    // InternalOil.g:8666:4: enumLiteral_0= 'UINT32'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntTypeEnumAccess().getUINT32EnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8673:3: (enumLiteral_1= 'INT32' )
                    {
                    // InternalOil.g:8673:3: (enumLiteral_1= 'INT32' )
                    // InternalOil.g:8674:4: enumLiteral_1= 'INT32'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntTypeEnumAccess().getINT32EnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:8681:3: (enumLiteral_2= 'UINT64' )
                    {
                    // InternalOil.g:8681:3: (enumLiteral_2= 'UINT64' )
                    // InternalOil.g:8682:4: enumLiteral_2= 'UINT64'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntTypeEnumAccess().getUINT64EnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:8689:3: (enumLiteral_3= 'INT64' )
                    {
                    // InternalOil.g:8689:3: (enumLiteral_3= 'INT64' )
                    // InternalOil.g:8690:4: enumLiteral_3= 'INT64'
                    {
                    enumLiteral_3=(Token)match(input,113,FOLLOW_2); 

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
    // InternalOil.g:8700:1: ruleDefaultEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) ;
    public final Enumerator ruleDefaultEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:8706:2: ( ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) ) )
            // InternalOil.g:8707:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            {
            // InternalOil.g:8707:2: ( (enumLiteral_0= 'NO_DEFAULT' ) | (enumLiteral_1= 'AUTO' ) )
            int alt215=2;
            int LA215_0 = input.LA(1);

            if ( (LA215_0==114) ) {
                alt215=1;
            }
            else if ( (LA215_0==95) ) {
                alt215=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 215, 0, input);

                throw nvae;
            }
            switch (alt215) {
                case 1 :
                    // InternalOil.g:8708:3: (enumLiteral_0= 'NO_DEFAULT' )
                    {
                    // InternalOil.g:8708:3: (enumLiteral_0= 'NO_DEFAULT' )
                    // InternalOil.g:8709:4: enumLiteral_0= 'NO_DEFAULT'
                    {
                    enumLiteral_0=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDefaultEnumAccess().getNO_DEFAULTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8716:3: (enumLiteral_1= 'AUTO' )
                    {
                    // InternalOil.g:8716:3: (enumLiteral_1= 'AUTO' )
                    // InternalOil.g:8717:4: enumLiteral_1= 'AUTO'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); 

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
    // InternalOil.g:8727:1: ruleObjectRefTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) ;
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
            // InternalOil.g:8733:2: ( ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) ) )
            // InternalOil.g:8734:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            {
            // InternalOil.g:8734:2: ( (enumLiteral_0= 'OS_TYPE' ) | (enumLiteral_1= 'TASK_TYPE' ) | (enumLiteral_2= 'COUNTER_TYPE' ) | (enumLiteral_3= 'ALARM_TYPE' ) | (enumLiteral_4= 'RESOURCE_TYPE' ) | (enumLiteral_5= 'EVENT_TYPE' ) | (enumLiteral_6= 'ISR_TYPE' ) | (enumLiteral_7= 'MESSAGE_TYPE' ) | (enumLiteral_8= 'COM_TYPE' ) | (enumLiteral_9= 'NM_TYPE' ) | (enumLiteral_10= 'APPMODE_TYPE' ) | (enumLiteral_11= 'IPDU_TYPE' ) | (enumLiteral_12= 'NETWORKMESSAGE_TYPE' ) | (enumLiteral_13= 'APPLICATION_TYPE' ) | (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' ) | (enumLiteral_15= 'SPINLOCK_TYPE' ) | (enumLiteral_16= 'SCHEDULETABLE_TYPE' ) | (enumLiteral_17= 'IOC_TYPE' ) | (enumLiteral_18= 'APICONFIG_TYPE' ) | (enumLiteral_19= 'LIBRARY_TYPE' ) )
            int alt216=20;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt216=1;
                }
                break;
            case 116:
                {
                alt216=2;
                }
                break;
            case 117:
                {
                alt216=3;
                }
                break;
            case 118:
                {
                alt216=4;
                }
                break;
            case 119:
                {
                alt216=5;
                }
                break;
            case 120:
                {
                alt216=6;
                }
                break;
            case 121:
                {
                alt216=7;
                }
                break;
            case 122:
                {
                alt216=8;
                }
                break;
            case 123:
                {
                alt216=9;
                }
                break;
            case 124:
                {
                alt216=10;
                }
                break;
            case 125:
                {
                alt216=11;
                }
                break;
            case 126:
                {
                alt216=12;
                }
                break;
            case 127:
                {
                alt216=13;
                }
                break;
            case 128:
                {
                alt216=14;
                }
                break;
            case 129:
                {
                alt216=15;
                }
                break;
            case 130:
                {
                alt216=16;
                }
                break;
            case 131:
                {
                alt216=17;
                }
                break;
            case 132:
                {
                alt216=18;
                }
                break;
            case 133:
                {
                alt216=19;
                }
                break;
            case 134:
                {
                alt216=20;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 216, 0, input);

                throw nvae;
            }

            switch (alt216) {
                case 1 :
                    // InternalOil.g:8735:3: (enumLiteral_0= 'OS_TYPE' )
                    {
                    // InternalOil.g:8735:3: (enumLiteral_0= 'OS_TYPE' )
                    // InternalOil.g:8736:4: enumLiteral_0= 'OS_TYPE'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectRefTypeEnumAccess().getOS_TYPEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8743:3: (enumLiteral_1= 'TASK_TYPE' )
                    {
                    // InternalOil.g:8743:3: (enumLiteral_1= 'TASK_TYPE' )
                    // InternalOil.g:8744:4: enumLiteral_1= 'TASK_TYPE'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectRefTypeEnumAccess().getTASK_TYPEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:8751:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    {
                    // InternalOil.g:8751:3: (enumLiteral_2= 'COUNTER_TYPE' )
                    // InternalOil.g:8752:4: enumLiteral_2= 'COUNTER_TYPE'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getObjectRefTypeEnumAccess().getCOUNTER_TYPEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:8759:3: (enumLiteral_3= 'ALARM_TYPE' )
                    {
                    // InternalOil.g:8759:3: (enumLiteral_3= 'ALARM_TYPE' )
                    // InternalOil.g:8760:4: enumLiteral_3= 'ALARM_TYPE'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getObjectRefTypeEnumAccess().getALARM_TYPEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:8767:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    {
                    // InternalOil.g:8767:3: (enumLiteral_4= 'RESOURCE_TYPE' )
                    // InternalOil.g:8768:4: enumLiteral_4= 'RESOURCE_TYPE'
                    {
                    enumLiteral_4=(Token)match(input,119,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getObjectRefTypeEnumAccess().getRESOURCE_TYPEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:8775:3: (enumLiteral_5= 'EVENT_TYPE' )
                    {
                    // InternalOil.g:8775:3: (enumLiteral_5= 'EVENT_TYPE' )
                    // InternalOil.g:8776:4: enumLiteral_5= 'EVENT_TYPE'
                    {
                    enumLiteral_5=(Token)match(input,120,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getObjectRefTypeEnumAccess().getEVENT_TYPEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:8783:3: (enumLiteral_6= 'ISR_TYPE' )
                    {
                    // InternalOil.g:8783:3: (enumLiteral_6= 'ISR_TYPE' )
                    // InternalOil.g:8784:4: enumLiteral_6= 'ISR_TYPE'
                    {
                    enumLiteral_6=(Token)match(input,121,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getObjectRefTypeEnumAccess().getISR_TYPEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:8791:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    {
                    // InternalOil.g:8791:3: (enumLiteral_7= 'MESSAGE_TYPE' )
                    // InternalOil.g:8792:4: enumLiteral_7= 'MESSAGE_TYPE'
                    {
                    enumLiteral_7=(Token)match(input,122,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getObjectRefTypeEnumAccess().getMESSAGE_TYPEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOil.g:8799:3: (enumLiteral_8= 'COM_TYPE' )
                    {
                    // InternalOil.g:8799:3: (enumLiteral_8= 'COM_TYPE' )
                    // InternalOil.g:8800:4: enumLiteral_8= 'COM_TYPE'
                    {
                    enumLiteral_8=(Token)match(input,123,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getObjectRefTypeEnumAccess().getCOM_TYPEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOil.g:8807:3: (enumLiteral_9= 'NM_TYPE' )
                    {
                    // InternalOil.g:8807:3: (enumLiteral_9= 'NM_TYPE' )
                    // InternalOil.g:8808:4: enumLiteral_9= 'NM_TYPE'
                    {
                    enumLiteral_9=(Token)match(input,124,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getObjectRefTypeEnumAccess().getNM_TYPEEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOil.g:8815:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    {
                    // InternalOil.g:8815:3: (enumLiteral_10= 'APPMODE_TYPE' )
                    // InternalOil.g:8816:4: enumLiteral_10= 'APPMODE_TYPE'
                    {
                    enumLiteral_10=(Token)match(input,125,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getObjectRefTypeEnumAccess().getAPPMODE_TYPEEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOil.g:8823:3: (enumLiteral_11= 'IPDU_TYPE' )
                    {
                    // InternalOil.g:8823:3: (enumLiteral_11= 'IPDU_TYPE' )
                    // InternalOil.g:8824:4: enumLiteral_11= 'IPDU_TYPE'
                    {
                    enumLiteral_11=(Token)match(input,126,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getObjectRefTypeEnumAccess().getIPDU_TYPEEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalOil.g:8831:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    {
                    // InternalOil.g:8831:3: (enumLiteral_12= 'NETWORKMESSAGE_TYPE' )
                    // InternalOil.g:8832:4: enumLiteral_12= 'NETWORKMESSAGE_TYPE'
                    {
                    enumLiteral_12=(Token)match(input,127,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getObjectRefTypeEnumAccess().getNETWORKMESSAGE_TYPEEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalOil.g:8839:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    {
                    // InternalOil.g:8839:3: (enumLiteral_13= 'APPLICATION_TYPE' )
                    // InternalOil.g:8840:4: enumLiteral_13= 'APPLICATION_TYPE'
                    {
                    enumLiteral_13=(Token)match(input,128,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getObjectRefTypeEnumAccess().getAPPLICATION_TYPEEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalOil.g:8847:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    {
                    // InternalOil.g:8847:3: (enumLiteral_14= 'MEMOTY_PROTECTION_TYPE' )
                    // InternalOil.g:8848:4: enumLiteral_14= 'MEMOTY_PROTECTION_TYPE'
                    {
                    enumLiteral_14=(Token)match(input,129,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getObjectRefTypeEnumAccess().getMEMOTY_PROTECTION_TYPEEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalOil.g:8855:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    {
                    // InternalOil.g:8855:3: (enumLiteral_15= 'SPINLOCK_TYPE' )
                    // InternalOil.g:8856:4: enumLiteral_15= 'SPINLOCK_TYPE'
                    {
                    enumLiteral_15=(Token)match(input,130,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getObjectRefTypeEnumAccess().getSPINLOCK_TYPEEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalOil.g:8863:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    {
                    // InternalOil.g:8863:3: (enumLiteral_16= 'SCHEDULETABLE_TYPE' )
                    // InternalOil.g:8864:4: enumLiteral_16= 'SCHEDULETABLE_TYPE'
                    {
                    enumLiteral_16=(Token)match(input,131,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getObjectRefTypeEnumAccess().getSCHEDULETABLE_TYPEEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalOil.g:8871:3: (enumLiteral_17= 'IOC_TYPE' )
                    {
                    // InternalOil.g:8871:3: (enumLiteral_17= 'IOC_TYPE' )
                    // InternalOil.g:8872:4: enumLiteral_17= 'IOC_TYPE'
                    {
                    enumLiteral_17=(Token)match(input,132,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getObjectRefTypeEnumAccess().getIOC_TYPEEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalOil.g:8879:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    {
                    // InternalOil.g:8879:3: (enumLiteral_18= 'APICONFIG_TYPE' )
                    // InternalOil.g:8880:4: enumLiteral_18= 'APICONFIG_TYPE'
                    {
                    enumLiteral_18=(Token)match(input,133,FOLLOW_2); 

                    				current = grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getObjectRefTypeEnumAccess().getAPICONFIG_TYPEEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalOil.g:8887:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    {
                    // InternalOil.g:8887:3: (enumLiteral_19= 'LIBRARY_TYPE' )
                    // InternalOil.g:8888:4: enumLiteral_19= 'LIBRARY_TYPE'
                    {
                    enumLiteral_19=(Token)match(input,134,FOLLOW_2); 

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


    // $ANTLR start "ruleComAttributeName"
    // InternalOil.g:8898:1: ruleComAttributeName returns [Enumerator current=null] : ( (enumLiteral_0= 'COMSTATUS' ) | (enumLiteral_1= 'COMERRORHOOK' ) | (enumLiteral_2= 'COMUSEGETSERVICEID' ) | (enumLiteral_3= 'COMUSEPARAMETERACCESS' ) | (enumLiteral_4= 'COMSTARTCOMEXTENSION' ) | (enumLiteral_5= 'COMTIMEBASE' ) | (enumLiteral_6= 'COMAPPMODE' ) | (enumLiteral_7= 'USE' ) ) ;
    public final Enumerator ruleComAttributeName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalOil.g:8904:2: ( ( (enumLiteral_0= 'COMSTATUS' ) | (enumLiteral_1= 'COMERRORHOOK' ) | (enumLiteral_2= 'COMUSEGETSERVICEID' ) | (enumLiteral_3= 'COMUSEPARAMETERACCESS' ) | (enumLiteral_4= 'COMSTARTCOMEXTENSION' ) | (enumLiteral_5= 'COMTIMEBASE' ) | (enumLiteral_6= 'COMAPPMODE' ) | (enumLiteral_7= 'USE' ) ) )
            // InternalOil.g:8905:2: ( (enumLiteral_0= 'COMSTATUS' ) | (enumLiteral_1= 'COMERRORHOOK' ) | (enumLiteral_2= 'COMUSEGETSERVICEID' ) | (enumLiteral_3= 'COMUSEPARAMETERACCESS' ) | (enumLiteral_4= 'COMSTARTCOMEXTENSION' ) | (enumLiteral_5= 'COMTIMEBASE' ) | (enumLiteral_6= 'COMAPPMODE' ) | (enumLiteral_7= 'USE' ) )
            {
            // InternalOil.g:8905:2: ( (enumLiteral_0= 'COMSTATUS' ) | (enumLiteral_1= 'COMERRORHOOK' ) | (enumLiteral_2= 'COMUSEGETSERVICEID' ) | (enumLiteral_3= 'COMUSEPARAMETERACCESS' ) | (enumLiteral_4= 'COMSTARTCOMEXTENSION' ) | (enumLiteral_5= 'COMTIMEBASE' ) | (enumLiteral_6= 'COMAPPMODE' ) | (enumLiteral_7= 'USE' ) )
            int alt217=8;
            switch ( input.LA(1) ) {
            case 135:
                {
                alt217=1;
                }
                break;
            case 136:
                {
                alt217=2;
                }
                break;
            case 137:
                {
                alt217=3;
                }
                break;
            case 138:
                {
                alt217=4;
                }
                break;
            case 139:
                {
                alt217=5;
                }
                break;
            case 140:
                {
                alt217=6;
                }
                break;
            case 141:
                {
                alt217=7;
                }
                break;
            case 142:
                {
                alt217=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 217, 0, input);

                throw nvae;
            }

            switch (alt217) {
                case 1 :
                    // InternalOil.g:8906:3: (enumLiteral_0= 'COMSTATUS' )
                    {
                    // InternalOil.g:8906:3: (enumLiteral_0= 'COMSTATUS' )
                    // InternalOil.g:8907:4: enumLiteral_0= 'COMSTATUS'
                    {
                    enumLiteral_0=(Token)match(input,135,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getCOMSTATUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComAttributeNameAccess().getCOMSTATUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8914:3: (enumLiteral_1= 'COMERRORHOOK' )
                    {
                    // InternalOil.g:8914:3: (enumLiteral_1= 'COMERRORHOOK' )
                    // InternalOil.g:8915:4: enumLiteral_1= 'COMERRORHOOK'
                    {
                    enumLiteral_1=(Token)match(input,136,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getCOMERRORHOOKEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComAttributeNameAccess().getCOMERRORHOOKEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:8922:3: (enumLiteral_2= 'COMUSEGETSERVICEID' )
                    {
                    // InternalOil.g:8922:3: (enumLiteral_2= 'COMUSEGETSERVICEID' )
                    // InternalOil.g:8923:4: enumLiteral_2= 'COMUSEGETSERVICEID'
                    {
                    enumLiteral_2=(Token)match(input,137,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getCOMUSEGETSERVICEIDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComAttributeNameAccess().getCOMUSEGETSERVICEIDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:8930:3: (enumLiteral_3= 'COMUSEPARAMETERACCESS' )
                    {
                    // InternalOil.g:8930:3: (enumLiteral_3= 'COMUSEPARAMETERACCESS' )
                    // InternalOil.g:8931:4: enumLiteral_3= 'COMUSEPARAMETERACCESS'
                    {
                    enumLiteral_3=(Token)match(input,138,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getCOMUSEPARAMETERACCESSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComAttributeNameAccess().getCOMUSEPARAMETERACCESSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:8938:3: (enumLiteral_4= 'COMSTARTCOMEXTENSION' )
                    {
                    // InternalOil.g:8938:3: (enumLiteral_4= 'COMSTARTCOMEXTENSION' )
                    // InternalOil.g:8939:4: enumLiteral_4= 'COMSTARTCOMEXTENSION'
                    {
                    enumLiteral_4=(Token)match(input,139,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getCOMSTARTCOMEXTENSIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComAttributeNameAccess().getCOMSTARTCOMEXTENSIONEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:8946:3: (enumLiteral_5= 'COMTIMEBASE' )
                    {
                    // InternalOil.g:8946:3: (enumLiteral_5= 'COMTIMEBASE' )
                    // InternalOil.g:8947:4: enumLiteral_5= 'COMTIMEBASE'
                    {
                    enumLiteral_5=(Token)match(input,140,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getCOMTIMEBASEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComAttributeNameAccess().getCOMTIMEBASEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:8954:3: (enumLiteral_6= 'COMAPPMODE' )
                    {
                    // InternalOil.g:8954:3: (enumLiteral_6= 'COMAPPMODE' )
                    // InternalOil.g:8955:4: enumLiteral_6= 'COMAPPMODE'
                    {
                    enumLiteral_6=(Token)match(input,141,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getCOMAPPMODEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getComAttributeNameAccess().getCOMAPPMODEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:8962:3: (enumLiteral_7= 'USE' )
                    {
                    // InternalOil.g:8962:3: (enumLiteral_7= 'USE' )
                    // InternalOil.g:8963:4: enumLiteral_7= 'USE'
                    {
                    enumLiteral_7=(Token)match(input,142,FOLLOW_2); 

                    				current = grammarAccess.getComAttributeNameAccess().getUSEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getComAttributeNameAccess().getUSEEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleComAttributeName"


    // $ANTLR start "ruleTaskTimingrLockAttribute"
    // InternalOil.g:8973:1: ruleTaskTimingrLockAttribute returns [Enumerator current=null] : ( (enumLiteral_0= 'LOCKTIME' ) | (enumLiteral_1= 'RESOURCENAME' ) ) ;
    public final Enumerator ruleTaskTimingrLockAttribute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:8979:2: ( ( (enumLiteral_0= 'LOCKTIME' ) | (enumLiteral_1= 'RESOURCENAME' ) ) )
            // InternalOil.g:8980:2: ( (enumLiteral_0= 'LOCKTIME' ) | (enumLiteral_1= 'RESOURCENAME' ) )
            {
            // InternalOil.g:8980:2: ( (enumLiteral_0= 'LOCKTIME' ) | (enumLiteral_1= 'RESOURCENAME' ) )
            int alt218=2;
            int LA218_0 = input.LA(1);

            if ( (LA218_0==143) ) {
                alt218=1;
            }
            else if ( (LA218_0==144) ) {
                alt218=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 218, 0, input);

                throw nvae;
            }
            switch (alt218) {
                case 1 :
                    // InternalOil.g:8981:3: (enumLiteral_0= 'LOCKTIME' )
                    {
                    // InternalOil.g:8981:3: (enumLiteral_0= 'LOCKTIME' )
                    // InternalOil.g:8982:4: enumLiteral_0= 'LOCKTIME'
                    {
                    enumLiteral_0=(Token)match(input,143,FOLLOW_2); 

                    				current = grammarAccess.getTaskTimingrLockAttributeAccess().getLOCKTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskTimingrLockAttributeAccess().getLOCKTIMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:8989:3: (enumLiteral_1= 'RESOURCENAME' )
                    {
                    // InternalOil.g:8989:3: (enumLiteral_1= 'RESOURCENAME' )
                    // InternalOil.g:8990:4: enumLiteral_1= 'RESOURCENAME'
                    {
                    enumLiteral_1=(Token)match(input,144,FOLLOW_2); 

                    				current = grammarAccess.getTaskTimingrLockAttributeAccess().getRESOURCENAMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskTimingrLockAttributeAccess().getRESOURCENAMEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTaskTimingrLockAttribute"


    // $ANTLR start "ruleTaskTimingAttributeName"
    // InternalOil.g:9000:1: ruleTaskTimingAttributeName returns [Enumerator current=null] : ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'EXECUTIONBUDGET' ) | (enumLiteral_2= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_3= 'EXECUTIONTIME' ) | (enumLiteral_4= 'TIMEFRAME' ) ) ;
    public final Enumerator ruleTaskTimingAttributeName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalOil.g:9006:2: ( ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'EXECUTIONBUDGET' ) | (enumLiteral_2= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_3= 'EXECUTIONTIME' ) | (enumLiteral_4= 'TIMEFRAME' ) ) )
            // InternalOil.g:9007:2: ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'EXECUTIONBUDGET' ) | (enumLiteral_2= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_3= 'EXECUTIONTIME' ) | (enumLiteral_4= 'TIMEFRAME' ) )
            {
            // InternalOil.g:9007:2: ( (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' ) | (enumLiteral_1= 'EXECUTIONBUDGET' ) | (enumLiteral_2= 'MAXOSINTERRUPTLOCKTIME' ) | (enumLiteral_3= 'EXECUTIONTIME' ) | (enumLiteral_4= 'TIMEFRAME' ) )
            int alt219=5;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt219=1;
                }
                break;
            case 145:
                {
                alt219=2;
                }
                break;
            case 105:
                {
                alt219=3;
                }
                break;
            case 106:
                {
                alt219=4;
                }
                break;
            case 107:
                {
                alt219=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 219, 0, input);

                throw nvae;
            }

            switch (alt219) {
                case 1 :
                    // InternalOil.g:9008:3: (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' )
                    {
                    // InternalOil.g:9008:3: (enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME' )
                    // InternalOil.g:9009:4: enumLiteral_0= 'MAXALLINTERRUPTLOCKTIME'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getTaskTimingAttributeNameAccess().getMAXALLINTERRUPTLOCKTIMEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskTimingAttributeNameAccess().getMAXALLINTERRUPTLOCKTIMEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9016:3: (enumLiteral_1= 'EXECUTIONBUDGET' )
                    {
                    // InternalOil.g:9016:3: (enumLiteral_1= 'EXECUTIONBUDGET' )
                    // InternalOil.g:9017:4: enumLiteral_1= 'EXECUTIONBUDGET'
                    {
                    enumLiteral_1=(Token)match(input,145,FOLLOW_2); 

                    				current = grammarAccess.getTaskTimingAttributeNameAccess().getEXECUTIONBUDGETEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskTimingAttributeNameAccess().getEXECUTIONBUDGETEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:9024:3: (enumLiteral_2= 'MAXOSINTERRUPTLOCKTIME' )
                    {
                    // InternalOil.g:9024:3: (enumLiteral_2= 'MAXOSINTERRUPTLOCKTIME' )
                    // InternalOil.g:9025:4: enumLiteral_2= 'MAXOSINTERRUPTLOCKTIME'
                    {
                    enumLiteral_2=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getTaskTimingAttributeNameAccess().getMAXOSINTERRUPTLOCKTIMEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskTimingAttributeNameAccess().getMAXOSINTERRUPTLOCKTIMEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:9032:3: (enumLiteral_3= 'EXECUTIONTIME' )
                    {
                    // InternalOil.g:9032:3: (enumLiteral_3= 'EXECUTIONTIME' )
                    // InternalOil.g:9033:4: enumLiteral_3= 'EXECUTIONTIME'
                    {
                    enumLiteral_3=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getTaskTimingAttributeNameAccess().getEXECUTIONTIMEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskTimingAttributeNameAccess().getEXECUTIONTIMEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:9040:3: (enumLiteral_4= 'TIMEFRAME' )
                    {
                    // InternalOil.g:9040:3: (enumLiteral_4= 'TIMEFRAME' )
                    // InternalOil.g:9041:4: enumLiteral_4= 'TIMEFRAME'
                    {
                    enumLiteral_4=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getTaskTimingAttributeNameAccess().getTIMEFRAMEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTaskTimingAttributeNameAccess().getTIMEFRAMEEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleTaskTimingAttributeName"


    // $ANTLR start "ruleTaskAttributeName"
    // InternalOil.g:9051:1: ruleTaskAttributeName returns [Enumerator current=null] : ( (enumLiteral_0= 'ACTIVATION' ) | (enumLiteral_1= 'NAME' ) | (enumLiteral_2= 'PROCESSKIND' ) | (enumLiteral_3= 'NONPREEMPTABLE' ) | (enumLiteral_4= 'PRIORITY' ) | (enumLiteral_5= 'SCHEDULE' ) | (enumLiteral_6= 'EVENT' ) | (enumLiteral_7= 'RESOURCE' ) | (enumLiteral_8= 'USEINTERNALRESOURCE' ) | (enumLiteral_9= 'ACCESSING_APPLICATION' ) | (enumLiteral_10= 'INTERNALRESOURCE' ) | (enumLiteral_11= 'MESSAGE' ) ) ;
    public final Enumerator ruleTaskAttributeName() throws RecognitionException {
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
            // InternalOil.g:9057:2: ( ( (enumLiteral_0= 'ACTIVATION' ) | (enumLiteral_1= 'NAME' ) | (enumLiteral_2= 'PROCESSKIND' ) | (enumLiteral_3= 'NONPREEMPTABLE' ) | (enumLiteral_4= 'PRIORITY' ) | (enumLiteral_5= 'SCHEDULE' ) | (enumLiteral_6= 'EVENT' ) | (enumLiteral_7= 'RESOURCE' ) | (enumLiteral_8= 'USEINTERNALRESOURCE' ) | (enumLiteral_9= 'ACCESSING_APPLICATION' ) | (enumLiteral_10= 'INTERNALRESOURCE' ) | (enumLiteral_11= 'MESSAGE' ) ) )
            // InternalOil.g:9058:2: ( (enumLiteral_0= 'ACTIVATION' ) | (enumLiteral_1= 'NAME' ) | (enumLiteral_2= 'PROCESSKIND' ) | (enumLiteral_3= 'NONPREEMPTABLE' ) | (enumLiteral_4= 'PRIORITY' ) | (enumLiteral_5= 'SCHEDULE' ) | (enumLiteral_6= 'EVENT' ) | (enumLiteral_7= 'RESOURCE' ) | (enumLiteral_8= 'USEINTERNALRESOURCE' ) | (enumLiteral_9= 'ACCESSING_APPLICATION' ) | (enumLiteral_10= 'INTERNALRESOURCE' ) | (enumLiteral_11= 'MESSAGE' ) )
            {
            // InternalOil.g:9058:2: ( (enumLiteral_0= 'ACTIVATION' ) | (enumLiteral_1= 'NAME' ) | (enumLiteral_2= 'PROCESSKIND' ) | (enumLiteral_3= 'NONPREEMPTABLE' ) | (enumLiteral_4= 'PRIORITY' ) | (enumLiteral_5= 'SCHEDULE' ) | (enumLiteral_6= 'EVENT' ) | (enumLiteral_7= 'RESOURCE' ) | (enumLiteral_8= 'USEINTERNALRESOURCE' ) | (enumLiteral_9= 'ACCESSING_APPLICATION' ) | (enumLiteral_10= 'INTERNALRESOURCE' ) | (enumLiteral_11= 'MESSAGE' ) )
            int alt220=12;
            switch ( input.LA(1) ) {
            case 146:
                {
                alt220=1;
                }
                break;
            case 147:
                {
                alt220=2;
                }
                break;
            case 148:
                {
                alt220=3;
                }
                break;
            case 149:
                {
                alt220=4;
                }
                break;
            case 97:
                {
                alt220=5;
                }
                break;
            case 150:
                {
                alt220=6;
                }
                break;
            case 43:
                {
                alt220=7;
                }
                break;
            case 42:
                {
                alt220=8;
                }
                break;
            case 151:
                {
                alt220=9;
                }
                break;
            case 70:
                {
                alt220=10;
                }
                break;
            case 152:
                {
                alt220=11;
                }
                break;
            case 44:
                {
                alt220=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 220, 0, input);

                throw nvae;
            }

            switch (alt220) {
                case 1 :
                    // InternalOil.g:9059:3: (enumLiteral_0= 'ACTIVATION' )
                    {
                    // InternalOil.g:9059:3: (enumLiteral_0= 'ACTIVATION' )
                    // InternalOil.g:9060:4: enumLiteral_0= 'ACTIVATION'
                    {
                    enumLiteral_0=(Token)match(input,146,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getACTIVATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTaskAttributeNameAccess().getACTIVATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9067:3: (enumLiteral_1= 'NAME' )
                    {
                    // InternalOil.g:9067:3: (enumLiteral_1= 'NAME' )
                    // InternalOil.g:9068:4: enumLiteral_1= 'NAME'
                    {
                    enumLiteral_1=(Token)match(input,147,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getNAMEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTaskAttributeNameAccess().getNAMEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:9075:3: (enumLiteral_2= 'PROCESSKIND' )
                    {
                    // InternalOil.g:9075:3: (enumLiteral_2= 'PROCESSKIND' )
                    // InternalOil.g:9076:4: enumLiteral_2= 'PROCESSKIND'
                    {
                    enumLiteral_2=(Token)match(input,148,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getPROCESSKINDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTaskAttributeNameAccess().getPROCESSKINDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalOil.g:9083:3: (enumLiteral_3= 'NONPREEMPTABLE' )
                    {
                    // InternalOil.g:9083:3: (enumLiteral_3= 'NONPREEMPTABLE' )
                    // InternalOil.g:9084:4: enumLiteral_3= 'NONPREEMPTABLE'
                    {
                    enumLiteral_3=(Token)match(input,149,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getNONPREEMPTABLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTaskAttributeNameAccess().getNONPREEMPTABLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalOil.g:9091:3: (enumLiteral_4= 'PRIORITY' )
                    {
                    // InternalOil.g:9091:3: (enumLiteral_4= 'PRIORITY' )
                    // InternalOil.g:9092:4: enumLiteral_4= 'PRIORITY'
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getPRIORITYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTaskAttributeNameAccess().getPRIORITYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalOil.g:9099:3: (enumLiteral_5= 'SCHEDULE' )
                    {
                    // InternalOil.g:9099:3: (enumLiteral_5= 'SCHEDULE' )
                    // InternalOil.g:9100:4: enumLiteral_5= 'SCHEDULE'
                    {
                    enumLiteral_5=(Token)match(input,150,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getSCHEDULEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getTaskAttributeNameAccess().getSCHEDULEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalOil.g:9107:3: (enumLiteral_6= 'EVENT' )
                    {
                    // InternalOil.g:9107:3: (enumLiteral_6= 'EVENT' )
                    // InternalOil.g:9108:4: enumLiteral_6= 'EVENT'
                    {
                    enumLiteral_6=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getEVENTEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getTaskAttributeNameAccess().getEVENTEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalOil.g:9115:3: (enumLiteral_7= 'RESOURCE' )
                    {
                    // InternalOil.g:9115:3: (enumLiteral_7= 'RESOURCE' )
                    // InternalOil.g:9116:4: enumLiteral_7= 'RESOURCE'
                    {
                    enumLiteral_7=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getRESOURCEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getTaskAttributeNameAccess().getRESOURCEEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalOil.g:9123:3: (enumLiteral_8= 'USEINTERNALRESOURCE' )
                    {
                    // InternalOil.g:9123:3: (enumLiteral_8= 'USEINTERNALRESOURCE' )
                    // InternalOil.g:9124:4: enumLiteral_8= 'USEINTERNALRESOURCE'
                    {
                    enumLiteral_8=(Token)match(input,151,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getUSEINTERNALRESOURCEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getTaskAttributeNameAccess().getUSEINTERNALRESOURCEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalOil.g:9131:3: (enumLiteral_9= 'ACCESSING_APPLICATION' )
                    {
                    // InternalOil.g:9131:3: (enumLiteral_9= 'ACCESSING_APPLICATION' )
                    // InternalOil.g:9132:4: enumLiteral_9= 'ACCESSING_APPLICATION'
                    {
                    enumLiteral_9=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getACCESSING_APPLICATIONEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getTaskAttributeNameAccess().getACCESSING_APPLICATIONEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalOil.g:9139:3: (enumLiteral_10= 'INTERNALRESOURCE' )
                    {
                    // InternalOil.g:9139:3: (enumLiteral_10= 'INTERNALRESOURCE' )
                    // InternalOil.g:9140:4: enumLiteral_10= 'INTERNALRESOURCE'
                    {
                    enumLiteral_10=(Token)match(input,152,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getINTERNALRESOURCEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getTaskAttributeNameAccess().getINTERNALRESOURCEEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalOil.g:9147:3: (enumLiteral_11= 'MESSAGE' )
                    {
                    // InternalOil.g:9147:3: (enumLiteral_11= 'MESSAGE' )
                    // InternalOil.g:9148:4: enumLiteral_11= 'MESSAGE'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTaskAttributeNameAccess().getMESSAGEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getTaskAttributeNameAccess().getMESSAGEEnumLiteralDeclaration_11());
                    			

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
    // $ANTLR end "ruleTaskAttributeName"


    // $ANTLR start "ruleResourceRange"
    // InternalOil.g:9158:1: ruleResourceRange returns [Enumerator current=null] : ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'INTERNAL' ) | (enumLiteral_2= 'LINKED' ) ) ;
    public final Enumerator ruleResourceRange() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOil.g:9164:2: ( ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'INTERNAL' ) | (enumLiteral_2= 'LINKED' ) ) )
            // InternalOil.g:9165:2: ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'INTERNAL' ) | (enumLiteral_2= 'LINKED' ) )
            {
            // InternalOil.g:9165:2: ( (enumLiteral_0= 'STANDARD' ) | (enumLiteral_1= 'INTERNAL' ) | (enumLiteral_2= 'LINKED' ) )
            int alt221=3;
            switch ( input.LA(1) ) {
            case 153:
                {
                alt221=1;
                }
                break;
            case 154:
                {
                alt221=2;
                }
                break;
            case 155:
                {
                alt221=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 221, 0, input);

                throw nvae;
            }

            switch (alt221) {
                case 1 :
                    // InternalOil.g:9166:3: (enumLiteral_0= 'STANDARD' )
                    {
                    // InternalOil.g:9166:3: (enumLiteral_0= 'STANDARD' )
                    // InternalOil.g:9167:4: enumLiteral_0= 'STANDARD'
                    {
                    enumLiteral_0=(Token)match(input,153,FOLLOW_2); 

                    				current = grammarAccess.getResourceRangeAccess().getSTANDARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResourceRangeAccess().getSTANDARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9174:3: (enumLiteral_1= 'INTERNAL' )
                    {
                    // InternalOil.g:9174:3: (enumLiteral_1= 'INTERNAL' )
                    // InternalOil.g:9175:4: enumLiteral_1= 'INTERNAL'
                    {
                    enumLiteral_1=(Token)match(input,154,FOLLOW_2); 

                    				current = grammarAccess.getResourceRangeAccess().getINTERNALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResourceRangeAccess().getINTERNALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:9182:3: (enumLiteral_2= 'LINKED' )
                    {
                    // InternalOil.g:9182:3: (enumLiteral_2= 'LINKED' )
                    // InternalOil.g:9183:4: enumLiteral_2= 'LINKED'
                    {
                    enumLiteral_2=(Token)match(input,155,FOLLOW_2); 

                    				current = grammarAccess.getResourceRangeAccess().getLINKEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getResourceRangeAccess().getLINKEDEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleResourceRange"


    // $ANTLR start "ruleActivateTask"
    // InternalOil.g:9193:1: ruleActivateTask returns [Enumerator current=null] : (enumLiteral_0= 'TASK' ) ;
    public final Enumerator ruleActivateTask() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalOil.g:9199:2: ( (enumLiteral_0= 'TASK' ) )
            // InternalOil.g:9200:2: (enumLiteral_0= 'TASK' )
            {
            // InternalOil.g:9200:2: (enumLiteral_0= 'TASK' )
            // InternalOil.g:9201:3: enumLiteral_0= 'TASK'
            {
            enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

            			current = grammarAccess.getActivateTaskAccess().getTASKEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getActivateTaskAccess().getTASKEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleActivateTask"


    // $ANTLR start "ruleIncrementCounter"
    // InternalOil.g:9210:1: ruleIncrementCounter returns [Enumerator current=null] : (enumLiteral_0= 'COUNTER' ) ;
    public final Enumerator ruleIncrementCounter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalOil.g:9216:2: ( (enumLiteral_0= 'COUNTER' ) )
            // InternalOil.g:9217:2: (enumLiteral_0= 'COUNTER' )
            {
            // InternalOil.g:9217:2: (enumLiteral_0= 'COUNTER' )
            // InternalOil.g:9218:3: enumLiteral_0= 'COUNTER'
            {
            enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

            			current = grammarAccess.getIncrementCounterAccess().getCOUNTEREnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getIncrementCounterAccess().getCOUNTEREnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleIncrementCounter"


    // $ANTLR start "ruleSetevent"
    // InternalOil.g:9227:1: ruleSetevent returns [Enumerator current=null] : ( (enumLiteral_0= 'TASK' ) | (enumLiteral_1= 'EVENT' ) ) ;
    public final Enumerator ruleSetevent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:9233:2: ( ( (enumLiteral_0= 'TASK' ) | (enumLiteral_1= 'EVENT' ) ) )
            // InternalOil.g:9234:2: ( (enumLiteral_0= 'TASK' ) | (enumLiteral_1= 'EVENT' ) )
            {
            // InternalOil.g:9234:2: ( (enumLiteral_0= 'TASK' ) | (enumLiteral_1= 'EVENT' ) )
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==24) ) {
                alt222=1;
            }
            else if ( (LA222_0==43) ) {
                alt222=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 222, 0, input);

                throw nvae;
            }
            switch (alt222) {
                case 1 :
                    // InternalOil.g:9235:3: (enumLiteral_0= 'TASK' )
                    {
                    // InternalOil.g:9235:3: (enumLiteral_0= 'TASK' )
                    // InternalOil.g:9236:4: enumLiteral_0= 'TASK'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getSeteventAccess().getTASKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSeteventAccess().getTASKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9243:3: (enumLiteral_1= 'EVENT' )
                    {
                    // InternalOil.g:9243:3: (enumLiteral_1= 'EVENT' )
                    // InternalOil.g:9244:4: enumLiteral_1= 'EVENT'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getSeteventAccess().getEVENTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSeteventAccess().getEVENTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSetevent"


    // $ANTLR start "ruleAlarmCallBack"
    // InternalOil.g:9254:1: ruleAlarmCallBack returns [Enumerator current=null] : (enumLiteral_0= 'ALARMCALLBACK' ) ;
    public final Enumerator ruleAlarmCallBack() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalOil.g:9260:2: ( (enumLiteral_0= 'ALARMCALLBACK' ) )
            // InternalOil.g:9261:2: (enumLiteral_0= 'ALARMCALLBACK' )
            {
            // InternalOil.g:9261:2: (enumLiteral_0= 'ALARMCALLBACK' )
            // InternalOil.g:9262:3: enumLiteral_0= 'ALARMCALLBACK'
            {
            enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

            			current = grammarAccess.getAlarmCallBackAccess().getALARMCALLBACKEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAlarmCallBackAccess().getALARMCALLBACKEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAlarmCallBack"


    // $ANTLR start "ruleAbsolute"
    // InternalOil.g:9271:1: ruleAbsolute returns [Enumerator current=null] : ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'APPMODE' ) ) ;
    public final Enumerator ruleAbsolute() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:9277:2: ( ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'APPMODE' ) ) )
            // InternalOil.g:9278:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'APPMODE' ) )
            {
            // InternalOil.g:9278:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'APPMODE' ) )
            int alt223=2;
            int LA223_0 = input.LA(1);

            if ( (LA223_0==156) ) {
                alt223=1;
            }
            else if ( (LA223_0==47) ) {
                alt223=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 223, 0, input);

                throw nvae;
            }
            switch (alt223) {
                case 1 :
                    // InternalOil.g:9279:3: (enumLiteral_0= 'START' )
                    {
                    // InternalOil.g:9279:3: (enumLiteral_0= 'START' )
                    // InternalOil.g:9280:4: enumLiteral_0= 'START'
                    {
                    enumLiteral_0=(Token)match(input,156,FOLLOW_2); 

                    				current = grammarAccess.getAbsoluteAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAbsoluteAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9287:3: (enumLiteral_1= 'APPMODE' )
                    {
                    // InternalOil.g:9287:3: (enumLiteral_1= 'APPMODE' )
                    // InternalOil.g:9288:4: enumLiteral_1= 'APPMODE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getAbsoluteAccess().getAPPMODEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAbsoluteAccess().getAPPMODEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAbsolute"


    // $ANTLR start "ruleSchduleSyn"
    // InternalOil.g:9298:1: ruleSchduleSyn returns [Enumerator current=null] : ( (enumLiteral_0= 'EXPLICIT' ) | (enumLiteral_1= 'IMPLICIT' ) ) ;
    public final Enumerator ruleSchduleSyn() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:9304:2: ( ( (enumLiteral_0= 'EXPLICIT' ) | (enumLiteral_1= 'IMPLICIT' ) ) )
            // InternalOil.g:9305:2: ( (enumLiteral_0= 'EXPLICIT' ) | (enumLiteral_1= 'IMPLICIT' ) )
            {
            // InternalOil.g:9305:2: ( (enumLiteral_0= 'EXPLICIT' ) | (enumLiteral_1= 'IMPLICIT' ) )
            int alt224=2;
            int LA224_0 = input.LA(1);

            if ( (LA224_0==157) ) {
                alt224=1;
            }
            else if ( (LA224_0==158) ) {
                alt224=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 224, 0, input);

                throw nvae;
            }
            switch (alt224) {
                case 1 :
                    // InternalOil.g:9306:3: (enumLiteral_0= 'EXPLICIT' )
                    {
                    // InternalOil.g:9306:3: (enumLiteral_0= 'EXPLICIT' )
                    // InternalOil.g:9307:4: enumLiteral_0= 'EXPLICIT'
                    {
                    enumLiteral_0=(Token)match(input,157,FOLLOW_2); 

                    				current = grammarAccess.getSchduleSynAccess().getEXPLICITEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchduleSynAccess().getEXPLICITEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9314:3: (enumLiteral_1= 'IMPLICIT' )
                    {
                    // InternalOil.g:9314:3: (enumLiteral_1= 'IMPLICIT' )
                    // InternalOil.g:9315:4: enumLiteral_1= 'IMPLICIT'
                    {
                    enumLiteral_1=(Token)match(input,158,FOLLOW_2); 

                    				current = grammarAccess.getSchduleSynAccess().getIMPLICITEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchduleSynAccess().getIMPLICITEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSchduleSyn"


    // $ANTLR start "ruleSchduleExpiryAdustble"
    // InternalOil.g:9325:1: ruleSchduleExpiryAdustble returns [Enumerator current=null] : ( (enumLiteral_0= 'MAX_RETARD' ) | (enumLiteral_1= 'MAX_ADVANCE' ) ) ;
    public final Enumerator ruleSchduleExpiryAdustble() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:9331:2: ( ( (enumLiteral_0= 'MAX_RETARD' ) | (enumLiteral_1= 'MAX_ADVANCE' ) ) )
            // InternalOil.g:9332:2: ( (enumLiteral_0= 'MAX_RETARD' ) | (enumLiteral_1= 'MAX_ADVANCE' ) )
            {
            // InternalOil.g:9332:2: ( (enumLiteral_0= 'MAX_RETARD' ) | (enumLiteral_1= 'MAX_ADVANCE' ) )
            int alt225=2;
            int LA225_0 = input.LA(1);

            if ( (LA225_0==159) ) {
                alt225=1;
            }
            else if ( (LA225_0==160) ) {
                alt225=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 225, 0, input);

                throw nvae;
            }
            switch (alt225) {
                case 1 :
                    // InternalOil.g:9333:3: (enumLiteral_0= 'MAX_RETARD' )
                    {
                    // InternalOil.g:9333:3: (enumLiteral_0= 'MAX_RETARD' )
                    // InternalOil.g:9334:4: enumLiteral_0= 'MAX_RETARD'
                    {
                    enumLiteral_0=(Token)match(input,159,FOLLOW_2); 

                    				current = grammarAccess.getSchduleExpiryAdustbleAccess().getMAX_RETARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSchduleExpiryAdustbleAccess().getMAX_RETARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9341:3: (enumLiteral_1= 'MAX_ADVANCE' )
                    {
                    // InternalOil.g:9341:3: (enumLiteral_1= 'MAX_ADVANCE' )
                    // InternalOil.g:9342:4: enumLiteral_1= 'MAX_ADVANCE'
                    {
                    enumLiteral_1=(Token)match(input,160,FOLLOW_2); 

                    				current = grammarAccess.getSchduleExpiryAdustbleAccess().getMAX_ADVANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSchduleExpiryAdustbleAccess().getMAX_ADVANCEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleSchduleExpiryAdustble"


    // $ANTLR start "ruleIocReciverNone"
    // InternalOil.g:9352:1: ruleIocReciverNone returns [Enumerator current=null] : (enumLiteral_0= 'NONE' ) ;
    public final Enumerator ruleIocReciverNone() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalOil.g:9358:2: ( (enumLiteral_0= 'NONE' ) )
            // InternalOil.g:9359:2: (enumLiteral_0= 'NONE' )
            {
            // InternalOil.g:9359:2: (enumLiteral_0= 'NONE' )
            // InternalOil.g:9360:3: enumLiteral_0= 'NONE'
            {
            enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

            			current = grammarAccess.getIocReciverNoneAccess().getNONEEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getIocReciverNoneAccess().getNONEEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleIocReciverNone"


    // $ANTLR start "ruleEnumIocSendRec"
    // InternalOil.g:9369:1: ruleEnumIocSendRec returns [Enumerator current=null] : ( (enumLiteral_0= 'SENDER_ID' ) | (enumLiteral_1= 'SND_OSAPPLICATION' ) ) ;
    public final Enumerator ruleEnumIocSendRec() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:9375:2: ( ( (enumLiteral_0= 'SENDER_ID' ) | (enumLiteral_1= 'SND_OSAPPLICATION' ) ) )
            // InternalOil.g:9376:2: ( (enumLiteral_0= 'SENDER_ID' ) | (enumLiteral_1= 'SND_OSAPPLICATION' ) )
            {
            // InternalOil.g:9376:2: ( (enumLiteral_0= 'SENDER_ID' ) | (enumLiteral_1= 'SND_OSAPPLICATION' ) )
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==161) ) {
                alt226=1;
            }
            else if ( (LA226_0==162) ) {
                alt226=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 226, 0, input);

                throw nvae;
            }
            switch (alt226) {
                case 1 :
                    // InternalOil.g:9377:3: (enumLiteral_0= 'SENDER_ID' )
                    {
                    // InternalOil.g:9377:3: (enumLiteral_0= 'SENDER_ID' )
                    // InternalOil.g:9378:4: enumLiteral_0= 'SENDER_ID'
                    {
                    enumLiteral_0=(Token)match(input,161,FOLLOW_2); 

                    				current = grammarAccess.getEnumIocSendRecAccess().getSENDER_IDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumIocSendRecAccess().getSENDER_IDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9385:3: (enumLiteral_1= 'SND_OSAPPLICATION' )
                    {
                    // InternalOil.g:9385:3: (enumLiteral_1= 'SND_OSAPPLICATION' )
                    // InternalOil.g:9386:4: enumLiteral_1= 'SND_OSAPPLICATION'
                    {
                    enumLiteral_1=(Token)match(input,162,FOLLOW_2); 

                    				current = grammarAccess.getEnumIocSendRecAccess().getSND_OSAPPLICATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumIocSendRecAccess().getSND_OSAPPLICATIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEnumIocSendRec"


    // $ANTLR start "ruleEnumIocRec"
    // InternalOil.g:9396:1: ruleEnumIocRec returns [Enumerator current=null] : ( (enumLiteral_0= 'REV_OSAPPLICATION' ) | (enumLiteral_1= 'RECEIVER_PULL_CB' ) | (enumLiteral_2= 'ACTION' ) ) ;
    public final Enumerator ruleEnumIocRec() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalOil.g:9402:2: ( ( (enumLiteral_0= 'REV_OSAPPLICATION' ) | (enumLiteral_1= 'RECEIVER_PULL_CB' ) | (enumLiteral_2= 'ACTION' ) ) )
            // InternalOil.g:9403:2: ( (enumLiteral_0= 'REV_OSAPPLICATION' ) | (enumLiteral_1= 'RECEIVER_PULL_CB' ) | (enumLiteral_2= 'ACTION' ) )
            {
            // InternalOil.g:9403:2: ( (enumLiteral_0= 'REV_OSAPPLICATION' ) | (enumLiteral_1= 'RECEIVER_PULL_CB' ) | (enumLiteral_2= 'ACTION' ) )
            int alt227=3;
            switch ( input.LA(1) ) {
            case 163:
                {
                alt227=1;
                }
                break;
            case 164:
                {
                alt227=2;
                }
                break;
            case 71:
                {
                alt227=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 227, 0, input);

                throw nvae;
            }

            switch (alt227) {
                case 1 :
                    // InternalOil.g:9404:3: (enumLiteral_0= 'REV_OSAPPLICATION' )
                    {
                    // InternalOil.g:9404:3: (enumLiteral_0= 'REV_OSAPPLICATION' )
                    // InternalOil.g:9405:4: enumLiteral_0= 'REV_OSAPPLICATION'
                    {
                    enumLiteral_0=(Token)match(input,163,FOLLOW_2); 

                    				current = grammarAccess.getEnumIocRecAccess().getREV_OSAPPLICATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumIocRecAccess().getREV_OSAPPLICATIONEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9412:3: (enumLiteral_1= 'RECEIVER_PULL_CB' )
                    {
                    // InternalOil.g:9412:3: (enumLiteral_1= 'RECEIVER_PULL_CB' )
                    // InternalOil.g:9413:4: enumLiteral_1= 'RECEIVER_PULL_CB'
                    {
                    enumLiteral_1=(Token)match(input,164,FOLLOW_2); 

                    				current = grammarAccess.getEnumIocRecAccess().getRECEIVER_PULL_CBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumIocRecAccess().getRECEIVER_PULL_CBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalOil.g:9420:3: (enumLiteral_2= 'ACTION' )
                    {
                    // InternalOil.g:9420:3: (enumLiteral_2= 'ACTION' )
                    // InternalOil.g:9421:4: enumLiteral_2= 'ACTION'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getEnumIocRecAccess().getACTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEnumIocRecAccess().getACTIONEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleEnumIocRec"


    // $ANTLR start "ruleIocDataType"
    // InternalOil.g:9431:1: ruleIocDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'REFERNCE' ) ) ;
    public final Enumerator ruleIocDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalOil.g:9437:2: ( ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'REFERNCE' ) ) )
            // InternalOil.g:9438:2: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'REFERNCE' ) )
            {
            // InternalOil.g:9438:2: ( (enumLiteral_0= 'DATA' ) | (enumLiteral_1= 'REFERNCE' ) )
            int alt228=2;
            int LA228_0 = input.LA(1);

            if ( (LA228_0==165) ) {
                alt228=1;
            }
            else if ( (LA228_0==166) ) {
                alt228=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 228, 0, input);

                throw nvae;
            }
            switch (alt228) {
                case 1 :
                    // InternalOil.g:9439:3: (enumLiteral_0= 'DATA' )
                    {
                    // InternalOil.g:9439:3: (enumLiteral_0= 'DATA' )
                    // InternalOil.g:9440:4: enumLiteral_0= 'DATA'
                    {
                    enumLiteral_0=(Token)match(input,165,FOLLOW_2); 

                    				current = grammarAccess.getIocDataTypeAccess().getDATAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIocDataTypeAccess().getDATAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalOil.g:9447:3: (enumLiteral_1= 'REFERNCE' )
                    {
                    // InternalOil.g:9447:3: (enumLiteral_1= 'REFERNCE' )
                    // InternalOil.g:9448:4: enumLiteral_1= 'REFERNCE'
                    {
                    enumLiteral_1=(Token)match(input,166,FOLLOW_2); 

                    				current = grammarAccess.getIocDataTypeAccess().getREFERNCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIocDataTypeAccess().getREFERNCEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleIocDataType"


    // $ANTLR start "ruleIocSemanticsenum"
    // InternalOil.g:9458:1: ruleIocSemanticsenum returns [Enumerator current=null] : (enumLiteral_0= 'BUFFER_LENGTH' ) ;
    public final Enumerator ruleIocSemanticsenum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalOil.g:9464:2: ( (enumLiteral_0= 'BUFFER_LENGTH' ) )
            // InternalOil.g:9465:2: (enumLiteral_0= 'BUFFER_LENGTH' )
            {
            // InternalOil.g:9465:2: (enumLiteral_0= 'BUFFER_LENGTH' )
            // InternalOil.g:9466:3: enumLiteral_0= 'BUFFER_LENGTH'
            {
            enumLiteral_0=(Token)match(input,167,FOLLOW_2); 

            			current = grammarAccess.getIocSemanticsenumAccess().getBUFFER_LENGTHEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getIocSemanticsenumAccess().getBUFFER_LENGTHEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleIocSemanticsenum"


    // $ANTLR start "ruleIocSemanticsenumm"
    // InternalOil.g:9475:1: ruleIocSemanticsenumm returns [Enumerator current=null] : (enumLiteral_0= 'INIT_VALUE_SYMBOL' ) ;
    public final Enumerator ruleIocSemanticsenumm() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalOil.g:9481:2: ( (enumLiteral_0= 'INIT_VALUE_SYMBOL' ) )
            // InternalOil.g:9482:2: (enumLiteral_0= 'INIT_VALUE_SYMBOL' )
            {
            // InternalOil.g:9482:2: (enumLiteral_0= 'INIT_VALUE_SYMBOL' )
            // InternalOil.g:9483:3: enumLiteral_0= 'INIT_VALUE_SYMBOL'
            {
            enumLiteral_0=(Token)match(input,168,FOLLOW_2); 

            			current = grammarAccess.getIocSemanticsenummAccess().getINIT_VALUE_SYMBOLEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getIocSemanticsenummAccess().getINIT_VALUE_SYMBOLEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleIocSemanticsenumm"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4000000000204000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004025800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004025000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0400000002800000L,0x0003C00300000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0400000002000000L,0x0003C00300000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x04000000001C0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L,0x0004000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0400000012000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000000C0L,0x0004000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0400000042800000L,0x0003C00C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0400000042000000L,0x0003C00C00000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000006000001D0L,0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0030165121800000L,0x000000F000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400148000800000L,0x0003F00700000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x00000F0000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400140000000000L,0x0003F00700000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x047FFE40A7000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000180L,0x0004000080000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000090L,0x0004000080000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000400010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0380000048800000L,0xFFFBC00000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000400010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000600000080L,0x0004000080000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0400000000100010L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0070274081800000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000800000L,0x0000000000000003L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000500010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000000000007F80L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00000006000401D0L,0x0000000080000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00001C0000800000L,0x000000020000004CL,0x0000000001FC0000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000600040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000800000800000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000800000L,0x00000F0000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000020L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000E000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000020800000L,0x00000000000000C4L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000800000800000L,0x0000000000003000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000080001000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000020800000L,0x0000000000074044L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000800000L,0x0000000000300000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000800000L,0x0000000000C00080L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000800000800000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000500L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000800000L,0x000000000F000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000800000L,0x0000000010000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000040000L,0x0000000060000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000080L,0x0000001800000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000000L,0x0000000600000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x00000006000401D0L,0x0000000080008000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x047FFE40A7800040L});

}