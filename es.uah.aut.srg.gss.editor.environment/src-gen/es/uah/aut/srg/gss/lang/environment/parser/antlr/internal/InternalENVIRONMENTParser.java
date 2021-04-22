package es.uah.aut.srg.gss.lang.environment.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.environment.services.ENVIRONMENTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2019 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalENVIRONMENTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSEnvironmentEnvironment'", "'{'", "'uri'", "'version'", "'}'", "'GSSScenarioScenario'", "'GSSScenarioOptions'", "'GSSScenarioProtocols'", "'GSSScenarioInterfaces'", "'ProtocolPacketsFile'", "'GSSScenarioSpecialPackets'", "'GSSScenarioPeriodicTCs'", "'GSSScenarioGlobalVars'", "'GSSScenarioMonitors'", "'ChartsFile'", "'GSSScenarioInfo'", "'test_campaign'", "'date'", "'version_control_url'", "'GSSScenarioInfoPrint'", "'mainLog'", "'portLogs'", "'rawLog'", "'GSSScenarioPhyHeaderPrint'", "'gssTabs'", "'GSSScenarioDiscardErrorFlags'", "'txErrors'", "'notExpectedPackets'", "'filtersKo'", "'validTimesKo'", "'GSSScenarioProtocol'", "'id'", "'name'", "'typeLevel'", "'GSSScenarioProtocolType'", "'offset'", "'GSSScenarioProtocolSubtype'", "'GSSScenarioMainInterface'", "'ifType'", "'ifConfig'", "'ioType'", "'protocolID'", "'GSSScenarioInterface'", "'GSSScenarioLevelInOut'", "'TMformat'", "'TCformat'", "'inputFilter'", "'export_to_prev_Level'", "'import_from_prev_Level'", "'GSSScenarioLevelIn'", "'GSSScenarioLevelOut'", "'GSSScenarioSpecialPacket'", "'status'", "'ifRef'", "'levels'", "'levelRef'", "'GSSScenarioUpperLevels'", "'GSSScenarioPrintingData'", "'printStatus'", "'GSSScenarioPeriod'", "'min_value'", "'min_unit'", "'max_value'", "'max_unit'", "'GSSScenarioIntervalRange'", "'min'", "'max'", "'interval_value'", "'interval_unit'", "'GSSScenarioUpperLevel'", "'level'", "'GSSScenarioStructuredData'", "'firstField'", "'GSSScenarioPeriodicTCLevel2'", "'period_value'", "'period_unit'", "'level2'", "'app_to_level2'", "'level1'", "'level2_to_level1'", "'level0'", "'level1_to_level0'", "'GSSScenarioPeriodicTCLevel1'", "'app_to_level1'", "'GSSScenarioPeriodicTCLevel0'", "'app_to_level0'", "'GSSScenarioGlobalVar'", "'type'", "'initial_value'", "'GSSScenarioReferenceField'", "'fieldRef'", "'size'", "'GSSScenarioReferencePeriodicTC'", "'idRef'", "'GSSScenarioReferenceSpecialPacket'", "'GSSScenarioPlot'", "'chartRef'", "'GSSScenarioAlarmMsg'", "'text'", "'GSSScenarioModify'", "'value'", "'GSSScenarioAlarmVal'", "'GSSScenarioGVFiltered'", "'GlobalVarRef'", "'filter'", "'GSSScenarioGVPeriodic'", "'.'", "'('", "')'", "'::'", "'-'", "'/'", "'+'", "'://'", "'disabled'", "'enabled'", "'SpW'", "'SpW_TC'", "'SpW_Error'", "'uart'", "'socketSrv'", "'socketCli'", "'dummy'", "'in_out'", "'in'", "'out'", "'_1'", "'_2'", "'_3'", "'miliseconds'", "'seconds'", "'uint'", "'formula'", "'tm'", "'tc'", "'alarm1'", "'alarm2'", "'alarm3'", "'increment'", "'increment1wrap'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
    public static final int T__140=140;
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
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int RULE_HEXADECIMAL=7;
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
    public static final int T__154=154;
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
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
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
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalENVIRONMENTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalENVIRONMENTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalENVIRONMENTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalENVIRONMENT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private ENVIRONMENTGrammarAccess grammarAccess;

        public InternalENVIRONMENTParser(TokenStream input, ENVIRONMENTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected ENVIRONMENTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalENVIRONMENT.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalENVIRONMENT.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalENVIRONMENT.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSModelFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSModelFile=ruleGSSModelFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSModelFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSModelFile"


    // $ANTLR start "ruleGSSModelFile"
    // InternalENVIRONMENT.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentEnvironment ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentEnvironment ) ) ) )
            // InternalENVIRONMENT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentEnvironment ) ) )
            {
            // InternalENVIRONMENT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentEnvironment ) ) )
            // InternalENVIRONMENT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentEnvironment ) )
            {
            // InternalENVIRONMENT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalENVIRONMENT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalENVIRONMENT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalENVIRONMENT.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSModelFileAccess().getImportsGSSModelFileImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_imports_0_0=ruleGSSModelFileImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_0_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalENVIRONMENT.g:113:3: ( (lv_element_1_0= ruleGSSEnvironmentEnvironment ) )
            // InternalENVIRONMENT.g:114:4: (lv_element_1_0= ruleGSSEnvironmentEnvironment )
            {
            // InternalENVIRONMENT.g:114:4: (lv_element_1_0= ruleGSSEnvironmentEnvironment )
            // InternalENVIRONMENT.g:115:5: lv_element_1_0= ruleGSSEnvironmentEnvironment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentEnvironmentParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSEnvironmentEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSModelFileRule());
              					}
              					set(
              						current,
              						"element",
              						lv_element_1_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnvironment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSModelFile"


    // $ANTLR start "entryRuleGSSModelFileImport"
    // InternalENVIRONMENT.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalENVIRONMENT.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalENVIRONMENT.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSModelFileImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSModelFileImport=ruleGSSModelFileImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSModelFileImport; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSModelFileImport"


    // $ANTLR start "ruleGSSModelFileImport"
    // InternalENVIRONMENT.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalENVIRONMENT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalENVIRONMENT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalENVIRONMENT.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalENVIRONMENT.g:161:5: lv_importURI_2_0= RULE_STRING
            {
            lv_importURI_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_importURI_2_0, grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSModelFileImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"importURI",
              						lv_importURI_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSModelFileImport"


    // $ANTLR start "entryRuleGSSEnvironmentEnvironment"
    // InternalENVIRONMENT.g:185:1: entryRuleGSSEnvironmentEnvironment returns [EObject current=null] : iv_ruleGSSEnvironmentEnvironment= ruleGSSEnvironmentEnvironment EOF ;
    public final EObject entryRuleGSSEnvironmentEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentEnvironment = null;


        try {
            // InternalENVIRONMENT.g:185:66: (iv_ruleGSSEnvironmentEnvironment= ruleGSSEnvironmentEnvironment EOF )
            // InternalENVIRONMENT.g:186:2: iv_ruleGSSEnvironmentEnvironment= ruleGSSEnvironmentEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentEnvironment=ruleGSSEnvironmentEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentEnvironment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSEnvironmentEnvironment"


    // $ANTLR start "ruleGSSEnvironmentEnvironment"
    // InternalENVIRONMENT.g:192:1: ruleGSSEnvironmentEnvironment returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSScenarioScenario ) )+ otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleGSSEnvironmentEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_uri_5_0 = null;

        AntlrDatatypeRuleToken lv_version_9_0 = null;

        EObject lv_scenario_11_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:198:2: ( (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSScenarioScenario ) )+ otherlv_12= '}' otherlv_13= ';' ) )
            // InternalENVIRONMENT.g:199:2: (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSScenarioScenario ) )+ otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalENVIRONMENT.g:199:2: (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSScenarioScenario ) )+ otherlv_12= '}' otherlv_13= ';' )
            // InternalENVIRONMENT.g:200:3: otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSScenarioScenario ) )+ otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0());
              		
            }
            // InternalENVIRONMENT.g:204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENVIRONMENT.g:205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENVIRONMENT.g:205:4: (lv_name_1_0= RULE_ID )
            // InternalENVIRONMENT.g:206:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSEnvironmentEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentEnvironmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentEnvironmentAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:226:3: (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' )
            // InternalENVIRONMENT.g:227:4: otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';'
            {
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriKeyword_3_0());
              			
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_3_1());
              			
            }
            // InternalENVIRONMENT.g:235:4: ( (lv_uri_5_0= ruleQualifiedName ) )
            // InternalENVIRONMENT.g:236:5: (lv_uri_5_0= ruleQualifiedName )
            {
            // InternalENVIRONMENT.g:236:5: (lv_uri_5_0= ruleQualifiedName )
            // InternalENVIRONMENT.g:237:6: lv_uri_5_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_uri_5_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getGSSEnvironmentEnvironmentRule());
              						}
              						set(
              							current,
              							"uri",
              							lv_uri_5_0,
              							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.QualifiedName");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_3_3());
              			
            }

            }

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSEnvironmentEnvironmentAccess().getColonEqualsSignKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:267:3: ( (lv_version_9_0= ruleVersion ) )
            // InternalENVIRONMENT.g:268:4: (lv_version_9_0= ruleVersion )
            {
            // InternalENVIRONMENT.g:268:4: (lv_version_9_0= ruleVersion )
            // InternalENVIRONMENT.g:269:5: lv_version_9_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentAccess().getVersionVersionParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_9_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentEnvironmentRule());
              					}
              					set(
              						current,
              						"version",
              						lv_version_9_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.Version");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:290:3: ( (lv_scenario_11_0= ruleGSSScenarioScenario ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalENVIRONMENT.g:291:4: (lv_scenario_11_0= ruleGSSScenarioScenario )
            	    {
            	    // InternalENVIRONMENT.g:291:4: (lv_scenario_11_0= ruleGSSScenarioScenario )
            	    // InternalENVIRONMENT.g:292:5: lv_scenario_11_0= ruleGSSScenarioScenario
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSEnvironmentEnvironmentAccess().getScenarioGSSScenarioScenarioParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_scenario_11_0=ruleGSSScenarioScenario();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentEnvironmentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"scenario",
            	      						lv_scenario_11_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioScenario");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentEnvironmentAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentEnvironmentAccess().getSemicolonKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSEnvironmentEnvironment"


    // $ANTLR start "entryRuleGSSScenarioScenario"
    // InternalENVIRONMENT.g:321:1: entryRuleGSSScenarioScenario returns [EObject current=null] : iv_ruleGSSScenarioScenario= ruleGSSScenarioScenario EOF ;
    public final EObject entryRuleGSSScenarioScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioScenario = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8()
        	);

        try {
            // InternalENVIRONMENT.g:325:2: (iv_ruleGSSScenarioScenario= ruleGSSScenarioScenario EOF )
            // InternalENVIRONMENT.g:326:2: iv_ruleGSSScenarioScenario= ruleGSSScenarioScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioScenarioRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioScenario=ruleGSSScenarioScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioScenario; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleGSSScenarioScenario"


    // $ANTLR start "ruleGSSScenarioScenario"
    // InternalENVIRONMENT.g:335:1: ruleGSSScenarioScenario returns [EObject current=null] : (otherlv_0= 'GSSScenarioScenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSScenarioOptions ) ) ( (lv_Protocols_4_0= ruleGSSScenarioProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSScenarioInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSScenarioScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_gss_options_3_0 = null;

        EObject lv_Protocols_4_0 = null;

        EObject lv_Interfaces_5_0 = null;

        EObject lv_SpecialPackets_6_0 = null;

        EObject lv_PeriodicTCs_7_0 = null;

        EObject lv_GlobalVars_9_0 = null;

        EObject lv_Monitors_10_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8()
        	);

        try {
            // InternalENVIRONMENT.g:344:2: ( (otherlv_0= 'GSSScenarioScenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSScenarioOptions ) ) ( (lv_Protocols_4_0= ruleGSSScenarioProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSScenarioInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' ) )
            // InternalENVIRONMENT.g:345:2: (otherlv_0= 'GSSScenarioScenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSScenarioOptions ) ) ( (lv_Protocols_4_0= ruleGSSScenarioProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSScenarioInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalENVIRONMENT.g:345:2: (otherlv_0= 'GSSScenarioScenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSScenarioOptions ) ) ( (lv_Protocols_4_0= ruleGSSScenarioProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSScenarioInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' )
            // InternalENVIRONMENT.g:346:3: otherlv_0= 'GSSScenarioScenario' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSScenarioOptions ) ) ( (lv_Protocols_4_0= ruleGSSScenarioProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSScenarioInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioScenarioAccess().getGSSScenarioScenarioKeyword_0());
              		
            }
            // InternalENVIRONMENT.g:350:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:351:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:351:4: (lv_name_1_0= RULE_STRING )
            // InternalENVIRONMENT.g:352:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSScenarioScenarioAccess().getNameSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioScenarioRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioScenarioAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:372:3: ( (lv_gss_options_3_0= ruleGSSScenarioOptions ) )
            // InternalENVIRONMENT.g:373:4: (lv_gss_options_3_0= ruleGSSScenarioOptions )
            {
            // InternalENVIRONMENT.g:373:4: (lv_gss_options_3_0= ruleGSSScenarioOptions )
            // InternalENVIRONMENT.g:374:5: lv_gss_options_3_0= ruleGSSScenarioOptions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getGss_optionsGSSScenarioOptionsParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_gss_options_3_0=ruleGSSScenarioOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
              					}
              					set(
              						current,
              						"gss_options",
              						lv_gss_options_3_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioOptions");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:391:3: ( (lv_Protocols_4_0= ruleGSSScenarioProtocols ) )
            // InternalENVIRONMENT.g:392:4: (lv_Protocols_4_0= ruleGSSScenarioProtocols )
            {
            // InternalENVIRONMENT.g:392:4: (lv_Protocols_4_0= ruleGSSScenarioProtocols )
            // InternalENVIRONMENT.g:393:5: lv_Protocols_4_0= ruleGSSScenarioProtocols
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getProtocolsGSSScenarioProtocolsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_Protocols_4_0=ruleGSSScenarioProtocols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
              					}
              					set(
              						current,
              						"Protocols",
              						lv_Protocols_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocols");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:410:3: ( (lv_Interfaces_5_0= ruleGSSScenarioInterfaces ) )
            // InternalENVIRONMENT.g:411:4: (lv_Interfaces_5_0= ruleGSSScenarioInterfaces )
            {
            // InternalENVIRONMENT.g:411:4: (lv_Interfaces_5_0= ruleGSSScenarioInterfaces )
            // InternalENVIRONMENT.g:412:5: lv_Interfaces_5_0= ruleGSSScenarioInterfaces
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getInterfacesGSSScenarioInterfacesParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_Interfaces_5_0=ruleGSSScenarioInterfaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
              					}
              					set(
              						current,
              						"Interfaces",
              						lv_Interfaces_5_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaces");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:429:3: ( (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalENVIRONMENT.g:430:4: (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets )
                    {
                    // InternalENVIRONMENT.g:430:4: (lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets )
                    // InternalENVIRONMENT.g:431:5: lv_SpecialPackets_6_0= ruleGSSScenarioSpecialPackets
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getSpecialPacketsGSSScenarioSpecialPacketsParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_SpecialPackets_6_0=ruleGSSScenarioSpecialPackets();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
                      					}
                      					set(
                      						current,
                      						"SpecialPackets",
                      						lv_SpecialPackets_6_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioSpecialPackets");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalENVIRONMENT.g:448:3: ( (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalENVIRONMENT.g:449:4: (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs )
                    {
                    // InternalENVIRONMENT.g:449:4: (lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs )
                    // InternalENVIRONMENT.g:450:5: lv_PeriodicTCs_7_0= ruleGSSScenarioPeriodicTCs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getPeriodicTCsGSSScenarioPeriodicTCsParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_PeriodicTCs_7_0=ruleGSSScenarioPeriodicTCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
                      					}
                      					set(
                      						current,
                      						"PeriodicTCs",
                      						lv_PeriodicTCs_7_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPeriodicTCs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalENVIRONMENT.g:467:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=27 && LA6_0<=28)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalENVIRONMENT.g:468:4: ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalENVIRONMENT.g:468:4: ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?) )
                    // InternalENVIRONMENT.g:469:5: ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?)
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());
                    // InternalENVIRONMENT.g:472:5: ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?)
                    // InternalENVIRONMENT.g:473:6: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+ {...}?
                    {
                    // InternalENVIRONMENT.g:473:6: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( LA5_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0) ) {
                            alt5=1;
                        }
                        else if ( LA5_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) )
                    	    {
                    	    // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) )
                    	    // InternalENVIRONMENT.g:475:5: {...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSScenarioScenario", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0)");
                    	    }
                    	    // InternalENVIRONMENT.g:475:116: ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) )
                    	    // InternalENVIRONMENT.g:476:6: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0);
                    	    // InternalENVIRONMENT.g:479:9: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) )
                    	    // InternalENVIRONMENT.g:479:10: {...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSScenarioScenario", "true");
                    	    }
                    	    // InternalENVIRONMENT.g:479:19: ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) )
                    	    // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars )
                    	    {
                    	    // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars )
                    	    // InternalENVIRONMENT.g:480:10: lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      										newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0());
                    	      									
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_GlobalVars_9_0=ruleGSSScenarioGlobalVars();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										if (current==null) {
                    	      											current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
                    	      										}
                    	      										set(
                    	      											current,
                    	      											"GlobalVars",
                    	      											lv_GlobalVars_9_0,
                    	      											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGlobalVars");
                    	      										afterParserOrEnumRuleCall();
                    	      									
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) )
                    	    {
                    	    // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) )
                    	    // InternalENVIRONMENT.g:503:5: {...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSScenarioScenario", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1)");
                    	    }
                    	    // InternalENVIRONMENT.g:503:116: ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) )
                    	    // InternalENVIRONMENT.g:504:6: ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1);
                    	    // InternalENVIRONMENT.g:507:9: ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) )
                    	    // InternalENVIRONMENT.g:507:10: {...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSScenarioScenario", "true");
                    	    }
                    	    // InternalENVIRONMENT.g:507:19: ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) )
                    	    // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSScenarioMonitors )
                    	    {
                    	    // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSScenarioMonitors )
                    	    // InternalENVIRONMENT.g:508:10: lv_Monitors_10_0= ruleGSSScenarioMonitors
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      										newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0());
                    	      									
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_Monitors_10_0=ruleGSSScenarioMonitors();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										if (current==null) {
                    	      											current = createModelElementForParent(grammarAccess.getGSSScenarioScenarioRule());
                    	      										}
                    	      										set(
                    	      											current,
                    	      											"Monitors",
                    	      											lv_Monitors_10_0,
                    	      											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioMonitors");
                    	      										afterParserOrEnumRuleCall();
                    	      									
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8()) ) {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        throw new FailedPredicateException(input, "ruleGSSScenarioScenario", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8())");
                    }

                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8());

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioScenarioAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSScenarioScenarioAccess().getSemicolonKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleGSSScenarioScenario"


    // $ANTLR start "entryRuleGSSScenarioOptions"
    // InternalENVIRONMENT.g:553:1: entryRuleGSSScenarioOptions returns [EObject current=null] : iv_ruleGSSScenarioOptions= ruleGSSScenarioOptions EOF ;
    public final EObject entryRuleGSSScenarioOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioOptions = null;


        try {
            // InternalENVIRONMENT.g:553:59: (iv_ruleGSSScenarioOptions= ruleGSSScenarioOptions EOF )
            // InternalENVIRONMENT.g:554:2: iv_ruleGSSScenarioOptions= ruleGSSScenarioOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioOptionsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioOptions=ruleGSSScenarioOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioOptions; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioOptions"


    // $ANTLR start "ruleGSSScenarioOptions"
    // InternalENVIRONMENT.g:560:1: ruleGSSScenarioOptions returns [EObject current=null] : (otherlv_0= 'GSSScenarioOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSScenarioGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSScenarioOptions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_gss_info_2_0 = null;

        EObject lv_gss_info_print_3_0 = null;

        EObject lv_phy_header_print_4_0 = null;

        EObject lv_discardErrorFlags_5_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:566:2: ( (otherlv_0= 'GSSScenarioOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSScenarioGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalENVIRONMENT.g:567:2: (otherlv_0= 'GSSScenarioOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSScenarioGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalENVIRONMENT.g:567:2: (otherlv_0= 'GSSScenarioOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSScenarioGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' )
            // InternalENVIRONMENT.g:568:3: otherlv_0= 'GSSScenarioOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSScenarioGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioOptionsAccess().getGSSScenarioOptionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioOptionsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:576:3: ( (lv_gss_info_2_0= ruleGSSScenarioGSSInfo ) )
            // InternalENVIRONMENT.g:577:4: (lv_gss_info_2_0= ruleGSSScenarioGSSInfo )
            {
            // InternalENVIRONMENT.g:577:4: (lv_gss_info_2_0= ruleGSSScenarioGSSInfo )
            // InternalENVIRONMENT.g:578:5: lv_gss_info_2_0= ruleGSSScenarioGSSInfo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getGss_infoGSSScenarioGSSInfoParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_gss_info_2_0=ruleGSSScenarioGSSInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
              					}
              					set(
              						current,
              						"gss_info",
              						lv_gss_info_2_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGSSInfo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:595:3: ( (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint ) )
            // InternalENVIRONMENT.g:596:4: (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint )
            {
            // InternalENVIRONMENT.g:596:4: (lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint )
            // InternalENVIRONMENT.g:597:5: lv_gss_info_print_3_0= ruleGSSScenarioGSSInfoPrint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getGss_info_printGSSScenarioGSSInfoPrintParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_gss_info_print_3_0=ruleGSSScenarioGSSInfoPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
              					}
              					set(
              						current,
              						"gss_info_print",
              						lv_gss_info_print_3_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGSSInfoPrint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:614:3: ( (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint ) )
            // InternalENVIRONMENT.g:615:4: (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint )
            {
            // InternalENVIRONMENT.g:615:4: (lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint )
            // InternalENVIRONMENT.g:616:5: lv_phy_header_print_4_0= ruleGSSScenarioPhyHeaderPrint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getPhy_header_printGSSScenarioPhyHeaderPrintParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_phy_header_print_4_0=ruleGSSScenarioPhyHeaderPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
              					}
              					set(
              						current,
              						"phy_header_print",
              						lv_phy_header_print_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPhyHeaderPrint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:633:3: ( (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags ) )
            // InternalENVIRONMENT.g:634:4: (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags )
            {
            // InternalENVIRONMENT.g:634:4: (lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags )
            // InternalENVIRONMENT.g:635:5: lv_discardErrorFlags_5_0= ruleGSSScenarioGSSDiscardErrorFlags
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioOptionsAccess().getDiscardErrorFlagsGSSScenarioGSSDiscardErrorFlagsParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_discardErrorFlags_5_0=ruleGSSScenarioGSSDiscardErrorFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioOptionsRule());
              					}
              					set(
              						current,
              						"discardErrorFlags",
              						lv_discardErrorFlags_5_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGSSDiscardErrorFlags");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioOptionsAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioOptionsAccess().getSemicolonKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioOptions"


    // $ANTLR start "entryRuleGSSScenarioProtocols"
    // InternalENVIRONMENT.g:664:1: entryRuleGSSScenarioProtocols returns [EObject current=null] : iv_ruleGSSScenarioProtocols= ruleGSSScenarioProtocols EOF ;
    public final EObject entryRuleGSSScenarioProtocols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioProtocols = null;


        try {
            // InternalENVIRONMENT.g:664:61: (iv_ruleGSSScenarioProtocols= ruleGSSScenarioProtocols EOF )
            // InternalENVIRONMENT.g:665:2: iv_ruleGSSScenarioProtocols= ruleGSSScenarioProtocols EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioProtocolsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioProtocols=ruleGSSScenarioProtocols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioProtocols; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioProtocols"


    // $ANTLR start "ruleGSSScenarioProtocols"
    // InternalENVIRONMENT.g:671:1: ruleGSSScenarioProtocols returns [EObject current=null] : ( () otherlv_1= 'GSSScenarioProtocols' otherlv_2= '{' ( (lv_Protocol_3_0= ruleGSSScenarioProtocol ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSScenarioProtocols() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_Protocol_3_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:677:2: ( ( () otherlv_1= 'GSSScenarioProtocols' otherlv_2= '{' ( (lv_Protocol_3_0= ruleGSSScenarioProtocol ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalENVIRONMENT.g:678:2: ( () otherlv_1= 'GSSScenarioProtocols' otherlv_2= '{' ( (lv_Protocol_3_0= ruleGSSScenarioProtocol ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalENVIRONMENT.g:678:2: ( () otherlv_1= 'GSSScenarioProtocols' otherlv_2= '{' ( (lv_Protocol_3_0= ruleGSSScenarioProtocol ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalENVIRONMENT.g:679:3: () otherlv_1= 'GSSScenarioProtocols' otherlv_2= '{' ( (lv_Protocol_3_0= ruleGSSScenarioProtocol ) )* otherlv_4= '}' otherlv_5= ';'
            {
            // InternalENVIRONMENT.g:679:3: ()
            // InternalENVIRONMENT.g:680:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolsAccess().getGSSScenarioProtocolsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:697:3: ( (lv_Protocol_3_0= ruleGSSScenarioProtocol ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalENVIRONMENT.g:698:4: (lv_Protocol_3_0= ruleGSSScenarioProtocol )
            	    {
            	    // InternalENVIRONMENT.g:698:4: (lv_Protocol_3_0= ruleGSSScenarioProtocol )
            	    // InternalENVIRONMENT.g:699:5: lv_Protocol_3_0= ruleGSSScenarioProtocol
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioProtocolsAccess().getProtocolGSSScenarioProtocolParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_Protocol_3_0=ruleGSSScenarioProtocol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Protocol",
            	      						lv_Protocol_3_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocol");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioProtocolsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolsAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioProtocols"


    // $ANTLR start "entryRuleGSSScenarioInterfaces"
    // InternalENVIRONMENT.g:728:1: entryRuleGSSScenarioInterfaces returns [EObject current=null] : iv_ruleGSSScenarioInterfaces= ruleGSSScenarioInterfaces EOF ;
    public final EObject entryRuleGSSScenarioInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioInterfaces = null;


        try {
            // InternalENVIRONMENT.g:728:62: (iv_ruleGSSScenarioInterfaces= ruleGSSScenarioInterfaces EOF )
            // InternalENVIRONMENT.g:729:2: iv_ruleGSSScenarioInterfaces= ruleGSSScenarioInterfaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioInterfacesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioInterfaces=ruleGSSScenarioInterfaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioInterfaces; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioInterfaces"


    // $ANTLR start "ruleGSSScenarioInterfaces"
    // InternalENVIRONMENT.g:735:1: ruleGSSScenarioInterfaces returns [EObject current=null] : (otherlv_0= 'GSSScenarioInterfaces' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_MainInterface_6_0= ruleGSSScenarioMainInterface ) ) ( (lv_Interface_7_0= ruleGSSScenarioInterface ) )* otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleGSSScenarioInterfaces() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_MainInterface_6_0 = null;

        EObject lv_Interface_7_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:741:2: ( (otherlv_0= 'GSSScenarioInterfaces' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_MainInterface_6_0= ruleGSSScenarioMainInterface ) ) ( (lv_Interface_7_0= ruleGSSScenarioInterface ) )* otherlv_8= '}' otherlv_9= ';' ) )
            // InternalENVIRONMENT.g:742:2: (otherlv_0= 'GSSScenarioInterfaces' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_MainInterface_6_0= ruleGSSScenarioMainInterface ) ) ( (lv_Interface_7_0= ruleGSSScenarioInterface ) )* otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalENVIRONMENT.g:742:2: (otherlv_0= 'GSSScenarioInterfaces' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_MainInterface_6_0= ruleGSSScenarioMainInterface ) ) ( (lv_Interface_7_0= ruleGSSScenarioInterface ) )* otherlv_8= '}' otherlv_9= ';' )
            // InternalENVIRONMENT.g:743:3: otherlv_0= 'GSSScenarioInterfaces' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_MainInterface_6_0= ruleGSSScenarioMainInterface ) ) ( (lv_Interface_7_0= ruleGSSScenarioInterface ) )* otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioInterfacesAccess().getGSSScenarioInterfacesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioInterfacesAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:751:3: (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalENVIRONMENT.g:752:4: otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGSSScenarioInterfacesAccess().getColonEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalENVIRONMENT.g:760:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:761:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:761:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:762:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioInterfacesRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioInterfacesAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:784:3: ( (lv_MainInterface_6_0= ruleGSSScenarioMainInterface ) )
            // InternalENVIRONMENT.g:785:4: (lv_MainInterface_6_0= ruleGSSScenarioMainInterface )
            {
            // InternalENVIRONMENT.g:785:4: (lv_MainInterface_6_0= ruleGSSScenarioMainInterface )
            // InternalENVIRONMENT.g:786:5: lv_MainInterface_6_0= ruleGSSScenarioMainInterface
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioInterfacesAccess().getMainInterfaceGSSScenarioMainInterfaceParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_MainInterface_6_0=ruleGSSScenarioMainInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioInterfacesRule());
              					}
              					set(
              						current,
              						"MainInterface",
              						lv_MainInterface_6_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioMainInterface");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:803:3: ( (lv_Interface_7_0= ruleGSSScenarioInterface ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==57) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalENVIRONMENT.g:804:4: (lv_Interface_7_0= ruleGSSScenarioInterface )
            	    {
            	    // InternalENVIRONMENT.g:804:4: (lv_Interface_7_0= ruleGSSScenarioInterface )
            	    // InternalENVIRONMENT.g:805:5: lv_Interface_7_0= ruleGSSScenarioInterface
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioInterfacesAccess().getInterfaceGSSScenarioInterfaceParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_Interface_7_0=ruleGSSScenarioInterface();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioInterfacesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Interface",
            	      						lv_Interface_7_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterface");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSScenarioInterfacesAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioInterfacesAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioInterfaces"


    // $ANTLR start "entryRuleGSSScenarioSpecialPackets"
    // InternalENVIRONMENT.g:834:1: entryRuleGSSScenarioSpecialPackets returns [EObject current=null] : iv_ruleGSSScenarioSpecialPackets= ruleGSSScenarioSpecialPackets EOF ;
    public final EObject entryRuleGSSScenarioSpecialPackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioSpecialPackets = null;


        try {
            // InternalENVIRONMENT.g:834:66: (iv_ruleGSSScenarioSpecialPackets= ruleGSSScenarioSpecialPackets EOF )
            // InternalENVIRONMENT.g:835:2: iv_ruleGSSScenarioSpecialPackets= ruleGSSScenarioSpecialPackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioSpecialPackets=ruleGSSScenarioSpecialPackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioSpecialPackets; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioSpecialPackets"


    // $ANTLR start "ruleGSSScenarioSpecialPackets"
    // InternalENVIRONMENT.g:841:1: ruleGSSScenarioSpecialPackets returns [EObject current=null] : (otherlv_0= 'GSSScenarioSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSScenarioSpecialPackets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_SpecialPacket_2_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:847:2: ( (otherlv_0= 'GSSScenarioSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalENVIRONMENT.g:848:2: (otherlv_0= 'GSSScenarioSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalENVIRONMENT.g:848:2: (otherlv_0= 'GSSScenarioSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalENVIRONMENT.g:849:3: otherlv_0= 'GSSScenarioSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioSpecialPacketsAccess().getGSSScenarioSpecialPacketsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioSpecialPacketsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:857:3: ( (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==66) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalENVIRONMENT.g:858:4: (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket )
            	    {
            	    // InternalENVIRONMENT.g:858:4: (lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket )
            	    // InternalENVIRONMENT.g:859:5: lv_SpecialPacket_2_0= ruleGSSScenarioSpecialPacket
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketsAccess().getSpecialPacketGSSScenarioSpecialPacketParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_SpecialPacket_2_0=ruleGSSScenarioSpecialPacket();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"SpecialPacket",
            	      						lv_SpecialPacket_2_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioSpecialPacket");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioSpecialPacketsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioSpecialPacketsAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioSpecialPackets"


    // $ANTLR start "entryRuleGSSScenarioPeriodicTCs"
    // InternalENVIRONMENT.g:888:1: entryRuleGSSScenarioPeriodicTCs returns [EObject current=null] : iv_ruleGSSScenarioPeriodicTCs= ruleGSSScenarioPeriodicTCs EOF ;
    public final EObject entryRuleGSSScenarioPeriodicTCs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPeriodicTCs = null;


        try {
            // InternalENVIRONMENT.g:888:63: (iv_ruleGSSScenarioPeriodicTCs= ruleGSSScenarioPeriodicTCs EOF )
            // InternalENVIRONMENT.g:889:2: iv_ruleGSSScenarioPeriodicTCs= ruleGSSScenarioPeriodicTCs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPeriodicTCs=ruleGSSScenarioPeriodicTCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPeriodicTCs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPeriodicTCs"


    // $ANTLR start "ruleGSSScenarioPeriodicTCs"
    // InternalENVIRONMENT.g:895:1: ruleGSSScenarioPeriodicTCs returns [EObject current=null] : ( () otherlv_1= 'GSSScenarioPeriodicTCs' otherlv_2= '{' ( (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSScenarioPeriodicTCs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_PeriodicTC_3_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:901:2: ( ( () otherlv_1= 'GSSScenarioPeriodicTCs' otherlv_2= '{' ( (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalENVIRONMENT.g:902:2: ( () otherlv_1= 'GSSScenarioPeriodicTCs' otherlv_2= '{' ( (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalENVIRONMENT.g:902:2: ( () otherlv_1= 'GSSScenarioPeriodicTCs' otherlv_2= '{' ( (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalENVIRONMENT.g:903:3: () otherlv_1= 'GSSScenarioPeriodicTCs' otherlv_2= '{' ( (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC ) )* otherlv_4= '}' otherlv_5= ';'
            {
            // InternalENVIRONMENT.g:903:3: ()
            // InternalENVIRONMENT.g:904:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCsAccess().getGSSScenarioPeriodicTCsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:921:3: ( (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==88||LA11_0==97||LA11_0==99) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalENVIRONMENT.g:922:4: (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC )
            	    {
            	    // InternalENVIRONMENT.g:922:4: (lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC )
            	    // InternalENVIRONMENT.g:923:5: lv_PeriodicTC_3_0= ruleGSSScenarioPeriodicTC
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCsAccess().getPeriodicTCGSSScenarioPeriodicTCParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
            	    lv_PeriodicTC_3_0=ruleGSSScenarioPeriodicTC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"PeriodicTC",
            	      						lv_PeriodicTC_3_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPeriodicTC");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioPeriodicTCsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCsAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPeriodicTCs"


    // $ANTLR start "entryRuleGSSScenarioGlobalVars"
    // InternalENVIRONMENT.g:952:1: entryRuleGSSScenarioGlobalVars returns [EObject current=null] : iv_ruleGSSScenarioGlobalVars= ruleGSSScenarioGlobalVars EOF ;
    public final EObject entryRuleGSSScenarioGlobalVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGlobalVars = null;


        try {
            // InternalENVIRONMENT.g:952:62: (iv_ruleGSSScenarioGlobalVars= ruleGSSScenarioGlobalVars EOF )
            // InternalENVIRONMENT.g:953:2: iv_ruleGSSScenarioGlobalVars= ruleGSSScenarioGlobalVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGlobalVarsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGlobalVars=ruleGSSScenarioGlobalVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGlobalVars; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGlobalVars"


    // $ANTLR start "ruleGSSScenarioGlobalVars"
    // InternalENVIRONMENT.g:959:1: ruleGSSScenarioGlobalVars returns [EObject current=null] : (otherlv_0= 'GSSScenarioGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSScenarioGlobalVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_GlobalVar_2_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:965:2: ( (otherlv_0= 'GSSScenarioGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalENVIRONMENT.g:966:2: (otherlv_0= 'GSSScenarioGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalENVIRONMENT.g:966:2: (otherlv_0= 'GSSScenarioGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalENVIRONMENT.g:967:3: otherlv_0= 'GSSScenarioGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGlobalVarsAccess().getGSSScenarioGlobalVarsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGlobalVarsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:975:3: ( (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==101) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalENVIRONMENT.g:976:4: (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar )
            	    {
            	    // InternalENVIRONMENT.g:976:4: (lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar )
            	    // InternalENVIRONMENT.g:977:5: lv_GlobalVar_2_0= ruleGSSScenarioGlobalVar
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarsAccess().getGlobalVarGSSScenarioGlobalVarParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_GlobalVar_2_0=ruleGSSScenarioGlobalVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"GlobalVar",
            	      						lv_GlobalVar_2_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGlobalVar");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGlobalVarsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioGlobalVarsAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGlobalVars"


    // $ANTLR start "entryRuleGSSScenarioMonitors"
    // InternalENVIRONMENT.g:1006:1: entryRuleGSSScenarioMonitors returns [EObject current=null] : iv_ruleGSSScenarioMonitors= ruleGSSScenarioMonitors EOF ;
    public final EObject entryRuleGSSScenarioMonitors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioMonitors = null;


        try {
            // InternalENVIRONMENT.g:1006:60: (iv_ruleGSSScenarioMonitors= ruleGSSScenarioMonitors EOF )
            // InternalENVIRONMENT.g:1007:2: iv_ruleGSSScenarioMonitors= ruleGSSScenarioMonitors EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioMonitorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioMonitors=ruleGSSScenarioMonitors();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioMonitors; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioMonitors"


    // $ANTLR start "ruleGSSScenarioMonitors"
    // InternalENVIRONMENT.g:1013:1: ruleGSSScenarioMonitors returns [EObject current=null] : (otherlv_0= 'GSSScenarioMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_monitor_6_0= ruleGSSScenarioMonitor ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSScenarioMonitors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_monitor_6_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1019:2: ( (otherlv_0= 'GSSScenarioMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_monitor_6_0= ruleGSSScenarioMonitor ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalENVIRONMENT.g:1020:2: (otherlv_0= 'GSSScenarioMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_monitor_6_0= ruleGSSScenarioMonitor ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalENVIRONMENT.g:1020:2: (otherlv_0= 'GSSScenarioMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_monitor_6_0= ruleGSSScenarioMonitor ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalENVIRONMENT.g:1021:3: otherlv_0= 'GSSScenarioMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_monitor_6_0= ruleGSSScenarioMonitor ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioMonitorsAccess().getGSSScenarioMonitorsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioMonitorsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:1029:3: (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalENVIRONMENT.g:1030:4: otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGSSScenarioMonitorsAccess().getColonEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalENVIRONMENT.g:1038:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:1039:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:1039:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:1040:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioMonitorsRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:1062:3: ( (lv_monitor_6_0= ruleGSSScenarioMonitor ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==110||LA14_0==112||LA14_0==114||LA14_0==116) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalENVIRONMENT.g:1063:4: (lv_monitor_6_0= ruleGSSScenarioMonitor )
            	    {
            	    // InternalENVIRONMENT.g:1063:4: (lv_monitor_6_0= ruleGSSScenarioMonitor )
            	    // InternalENVIRONMENT.g:1064:5: lv_monitor_6_0= ruleGSSScenarioMonitor
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioMonitorsAccess().getMonitorGSSScenarioMonitorParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
            	    lv_monitor_6_0=ruleGSSScenarioMonitor();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioMonitorsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"monitor",
            	      						lv_monitor_6_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioMonitor");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioMonitorsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSScenarioMonitorsAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioMonitors"


    // $ANTLR start "entryRuleGSSScenarioGSSInfo"
    // InternalENVIRONMENT.g:1093:1: entryRuleGSSScenarioGSSInfo returns [EObject current=null] : iv_ruleGSSScenarioGSSInfo= ruleGSSScenarioGSSInfo EOF ;
    public final EObject entryRuleGSSScenarioGSSInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGSSInfo = null;


        try {
            // InternalENVIRONMENT.g:1093:59: (iv_ruleGSSScenarioGSSInfo= ruleGSSScenarioGSSInfo EOF )
            // InternalENVIRONMENT.g:1094:2: iv_ruleGSSScenarioGSSInfo= ruleGSSScenarioGSSInfo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGSSInfoRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGSSInfo=ruleGSSScenarioGSSInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGSSInfo; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGSSInfo"


    // $ANTLR start "ruleGSSScenarioGSSInfo"
    // InternalENVIRONMENT.g:1100:1: ruleGSSScenarioGSSInfo returns [EObject current=null] : (otherlv_0= 'GSSScenarioInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSScenarioGSSInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_test_campaign_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_version_8_0 = null;

        AntlrDatatypeRuleToken lv_date_12_0 = null;

        AntlrDatatypeRuleToken lv_version_control_url_16_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1106:2: ( (otherlv_0= 'GSSScenarioInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:1107:2: (otherlv_0= 'GSSScenarioInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:1107:2: (otherlv_0= 'GSSScenarioInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:1108:3: otherlv_0= 'GSSScenarioInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGSSInfoAccess().getGSSScenarioInfoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGSSInfoAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1124:3: ( (lv_test_campaign_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:1125:4: (lv_test_campaign_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:1125:4: (lv_test_campaign_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:1126:5: lv_test_campaign_4_0= RULE_STRING
            {
            lv_test_campaign_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_test_campaign_4_0, grammarAccess.getGSSScenarioGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioGSSInfoRule());
              					}
              					setWithLastConsumed(
              						current,
              						"test_campaign",
              						lv_test_campaign_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGSSInfoAccess().getVersionKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1154:3: ( (lv_version_8_0= ruleVersion ) )
            // InternalENVIRONMENT.g:1155:4: (lv_version_8_0= ruleVersion )
            {
            // InternalENVIRONMENT.g:1155:4: (lv_version_8_0= ruleVersion )
            // InternalENVIRONMENT.g:1156:5: lv_version_8_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoAccess().getVersionVersionParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_8_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoRule());
              					}
              					set(
              						current,
              						"version",
              						lv_version_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.Version");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGSSInfoAccess().getDateKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1185:3: ( (lv_date_12_0= ruleDATE ) )
            // InternalENVIRONMENT.g:1186:4: (lv_date_12_0= ruleDATE )
            {
            // InternalENVIRONMENT.g:1186:4: (lv_date_12_0= ruleDATE )
            // InternalENVIRONMENT.g:1187:5: lv_date_12_0= ruleDATE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoAccess().getDateDATEParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_date_12_0=ruleDATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoRule());
              					}
              					set(
              						current,
              						"date",
              						lv_date_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.DATE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:1208:3: (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalENVIRONMENT.g:1209:4: otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGSSInfoAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalENVIRONMENT.g:1217:4: ( (lv_version_control_url_16_0= ruleURL ) )
                    // InternalENVIRONMENT.g:1218:5: (lv_version_control_url_16_0= ruleURL )
                    {
                    // InternalENVIRONMENT.g:1218:5: (lv_version_control_url_16_0= ruleURL )
                    // InternalENVIRONMENT.g:1219:6: lv_version_control_url_16_0= ruleURL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_version_control_url_16_0=ruleURL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoRule());
                      						}
                      						set(
                      							current,
                      							"version_control_url",
                      							lv_version_control_url_16_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.URL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioGSSInfoAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioGSSInfoAccess().getSemicolonKeyword_16());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGSSInfo"


    // $ANTLR start "entryRuleGSSScenarioGSSInfoPrint"
    // InternalENVIRONMENT.g:1253:1: entryRuleGSSScenarioGSSInfoPrint returns [EObject current=null] : iv_ruleGSSScenarioGSSInfoPrint= ruleGSSScenarioGSSInfoPrint EOF ;
    public final EObject entryRuleGSSScenarioGSSInfoPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGSSInfoPrint = null;


        try {
            // InternalENVIRONMENT.g:1253:64: (iv_ruleGSSScenarioGSSInfoPrint= ruleGSSScenarioGSSInfoPrint EOF )
            // InternalENVIRONMENT.g:1254:2: iv_ruleGSSScenarioGSSInfoPrint= ruleGSSScenarioGSSInfoPrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGSSInfoPrint=ruleGSSScenarioGSSInfoPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGSSInfoPrint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGSSInfoPrint"


    // $ANTLR start "ruleGSSScenarioGSSInfoPrint"
    // InternalENVIRONMENT.g:1260:1: ruleGSSScenarioGSSInfoPrint returns [EObject current=null] : (otherlv_0= 'GSSScenarioInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSScenarioGSSInfoPrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_mainLog_4_0 = null;

        Enumerator lv_portLogs_8_0 = null;

        Enumerator lv_rawLog_12_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1266:2: ( (otherlv_0= 'GSSScenarioInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalENVIRONMENT.g:1267:2: (otherlv_0= 'GSSScenarioInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalENVIRONMENT.g:1267:2: (otherlv_0= 'GSSScenarioInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalENVIRONMENT.g:1268:3: otherlv_0= 'GSSScenarioInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getGSSScenarioInfoPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1284:3: ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1285:4: (lv_mainLog_4_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1285:4: (lv_mainLog_4_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1286:5: lv_mainLog_4_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_mainLog_4_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"mainLog",
              						lv_mainLog_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1315:3: ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1316:4: (lv_portLogs_8_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1316:4: (lv_portLogs_8_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1317:5: lv_portLogs_8_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_portLogs_8_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"portLogs",
              						lv_portLogs_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1346:3: ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1347:4: (lv_rawLog_12_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1347:4: (lv_rawLog_12_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1348:5: lv_rawLog_12_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_rawLog_12_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"rawLog",
              						lv_rawLog_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGSSInfoPrintAccess().getSemicolonKeyword_15());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGSSInfoPrint"


    // $ANTLR start "entryRuleGSSScenarioPhyHeaderPrint"
    // InternalENVIRONMENT.g:1381:1: entryRuleGSSScenarioPhyHeaderPrint returns [EObject current=null] : iv_ruleGSSScenarioPhyHeaderPrint= ruleGSSScenarioPhyHeaderPrint EOF ;
    public final EObject entryRuleGSSScenarioPhyHeaderPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPhyHeaderPrint = null;


        try {
            // InternalENVIRONMENT.g:1381:66: (iv_ruleGSSScenarioPhyHeaderPrint= ruleGSSScenarioPhyHeaderPrint EOF )
            // InternalENVIRONMENT.g:1382:2: iv_ruleGSSScenarioPhyHeaderPrint= ruleGSSScenarioPhyHeaderPrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPhyHeaderPrint=ruleGSSScenarioPhyHeaderPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPhyHeaderPrint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPhyHeaderPrint"


    // $ANTLR start "ruleGSSScenarioPhyHeaderPrint"
    // InternalENVIRONMENT.g:1388:1: ruleGSSScenarioPhyHeaderPrint returns [EObject current=null] : (otherlv_0= 'GSSScenarioPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSScenarioPhyHeaderPrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_mainLog_4_0 = null;

        Enumerator lv_portLogs_8_0 = null;

        Enumerator lv_rawLog_12_0 = null;

        Enumerator lv_gssTabs_16_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1394:2: ( (otherlv_0= 'GSSScenarioPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:1395:2: (otherlv_0= 'GSSScenarioPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:1395:2: (otherlv_0= 'GSSScenarioPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:1396:3: otherlv_0= 'GSSScenarioPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGSSScenarioPhyHeaderPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1412:3: ( (lv_mainLog_4_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1413:4: (lv_mainLog_4_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1413:4: (lv_mainLog_4_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1414:5: lv_mainLog_4_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getMainLogGSSScenarioEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_mainLog_4_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"mainLog",
              						lv_mainLog_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1443:3: ( (lv_portLogs_8_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1444:4: (lv_portLogs_8_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1444:4: (lv_portLogs_8_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1445:5: lv_portLogs_8_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getPortLogsGSSScenarioEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_portLogs_8_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"portLogs",
              						lv_portLogs_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1474:3: ( (lv_rawLog_12_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1475:4: (lv_rawLog_12_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1475:4: (lv_rawLog_12_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1476:5: lv_rawLog_12_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRawLogGSSScenarioEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_rawLog_12_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"rawLog",
              						lv_rawLog_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:1505:3: ( (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1506:4: (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1506:4: (lv_gssTabs_16_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1507:5: lv_gssTabs_16_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getGssTabsGSSScenarioEnableDisableEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_gssTabs_16_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"gssTabs",
              						lv_gssTabs_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPhyHeaderPrintAccess().getSemicolonKeyword_19());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPhyHeaderPrint"


    // $ANTLR start "entryRuleGSSScenarioGSSDiscardErrorFlags"
    // InternalENVIRONMENT.g:1540:1: entryRuleGSSScenarioGSSDiscardErrorFlags returns [EObject current=null] : iv_ruleGSSScenarioGSSDiscardErrorFlags= ruleGSSScenarioGSSDiscardErrorFlags EOF ;
    public final EObject entryRuleGSSScenarioGSSDiscardErrorFlags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGSSDiscardErrorFlags = null;


        try {
            // InternalENVIRONMENT.g:1540:72: (iv_ruleGSSScenarioGSSDiscardErrorFlags= ruleGSSScenarioGSSDiscardErrorFlags EOF )
            // InternalENVIRONMENT.g:1541:2: iv_ruleGSSScenarioGSSDiscardErrorFlags= ruleGSSScenarioGSSDiscardErrorFlags EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGSSDiscardErrorFlags=ruleGSSScenarioGSSDiscardErrorFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGSSDiscardErrorFlags; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGSSDiscardErrorFlags"


    // $ANTLR start "ruleGSSScenarioGSSDiscardErrorFlags"
    // InternalENVIRONMENT.g:1547:1: ruleGSSScenarioGSSDiscardErrorFlags returns [EObject current=null] : (otherlv_0= 'GSSScenarioDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSScenarioGSSDiscardErrorFlags() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_txErrors_4_0 = null;

        Enumerator lv_notExpectedPackets_8_0 = null;

        Enumerator lv_filtersKo_12_0 = null;

        Enumerator lv_validTimesKo_16_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1553:2: ( (otherlv_0= 'GSSScenarioDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:1554:2: (otherlv_0= 'GSSScenarioDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:1554:2: (otherlv_0= 'GSSScenarioDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:1555:3: otherlv_0= 'GSSScenarioDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getGSSScenarioDiscardErrorFlagsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1571:3: ( (lv_txErrors_4_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1572:4: (lv_txErrors_4_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1572:4: (lv_txErrors_4_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1573:5: lv_txErrors_4_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getTxErrorsGSSScenarioEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_txErrors_4_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"txErrors",
              						lv_txErrors_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1602:3: ( (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1603:4: (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1603:4: (lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1604:5: lv_notExpectedPackets_8_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSScenarioEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_notExpectedPackets_8_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"notExpectedPackets",
              						lv_notExpectedPackets_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1633:3: ( (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1634:4: (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1634:4: (lv_filtersKo_12_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1635:5: lv_filtersKo_12_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getFiltersKoGSSScenarioEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_filtersKo_12_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"filtersKo",
              						lv_filtersKo_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,44,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:1664:3: ( (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:1665:4: (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:1665:4: (lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:1666:5: lv_validTimesKo_16_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getValidTimesKoGSSScenarioEnableDisableEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_validTimesKo_16_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"validTimesKo",
              						lv_validTimesKo_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGSSDiscardErrorFlags"


    // $ANTLR start "entryRuleGSSScenarioProtocol"
    // InternalENVIRONMENT.g:1699:1: entryRuleGSSScenarioProtocol returns [EObject current=null] : iv_ruleGSSScenarioProtocol= ruleGSSScenarioProtocol EOF ;
    public final EObject entryRuleGSSScenarioProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioProtocol = null;


        try {
            // InternalENVIRONMENT.g:1699:60: (iv_ruleGSSScenarioProtocol= ruleGSSScenarioProtocol EOF )
            // InternalENVIRONMENT.g:1700:2: iv_ruleGSSScenarioProtocol= ruleGSSScenarioProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioProtocolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioProtocol=ruleGSSScenarioProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioProtocol; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioProtocol"


    // $ANTLR start "ruleGSSScenarioProtocol"
    // InternalENVIRONMENT.g:1706:1: ruleGSSScenarioProtocol returns [EObject current=null] : (otherlv_0= 'GSSScenarioProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_type_14_0= ruleGSSScenarioProtocolType ) ) ( (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype ) )? otherlv_16= '}' otherlv_17= ';' ) ;
    public final EObject ruleGSSScenarioProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_typeLevel_12_0 = null;

        EObject lv_type_14_0 = null;

        EObject lv_subtype_15_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1712:2: ( (otherlv_0= 'GSSScenarioProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_type_14_0= ruleGSSScenarioProtocolType ) ) ( (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype ) )? otherlv_16= '}' otherlv_17= ';' ) )
            // InternalENVIRONMENT.g:1713:2: (otherlv_0= 'GSSScenarioProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_type_14_0= ruleGSSScenarioProtocolType ) ) ( (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype ) )? otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalENVIRONMENT.g:1713:2: (otherlv_0= 'GSSScenarioProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_type_14_0= ruleGSSScenarioProtocolType ) ) ( (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype ) )? otherlv_16= '}' otherlv_17= ';' )
            // InternalENVIRONMENT.g:1714:3: otherlv_0= 'GSSScenarioProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_type_14_0= ruleGSSScenarioProtocolType ) ) ( (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype ) )? otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioProtocolAccess().getGSSScenarioProtocolKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1730:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:1731:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:1731:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:1732:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioProtocolAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1761:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalENVIRONMENT.g:1762:4: (lv_name_8_0= RULE_ID )
            {
            // InternalENVIRONMENT.g:1762:4: (lv_name_8_0= RULE_ID )
            // InternalENVIRONMENT.g:1763:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioProtocolAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioProtocolRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioProtocolAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1791:3: ( (lv_typeLevel_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:1792:4: (lv_typeLevel_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:1792:4: (lv_typeLevel_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:1793:5: lv_typeLevel_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_typeLevel_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
              					}
              					set(
              						current,
              						"typeLevel",
              						lv_typeLevel_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:1814:3: ( (lv_type_14_0= ruleGSSScenarioProtocolType ) )
            // InternalENVIRONMENT.g:1815:4: (lv_type_14_0= ruleGSSScenarioProtocolType )
            {
            // InternalENVIRONMENT.g:1815:4: (lv_type_14_0= ruleGSSScenarioProtocolType )
            // InternalENVIRONMENT.g:1816:5: lv_type_14_0= ruleGSSScenarioProtocolType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getTypeGSSScenarioProtocolTypeParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_53);
            lv_type_14_0=ruleGSSScenarioProtocolType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_14_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocolType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:1833:3: ( (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalENVIRONMENT.g:1834:4: (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype )
                    {
                    // InternalENVIRONMENT.g:1834:4: (lv_subtype_15_0= ruleGSSScenarioProtocolSubtype )
                    // InternalENVIRONMENT.g:1835:5: lv_subtype_15_0= ruleGSSScenarioProtocolSubtype
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSScenarioProtocolAccess().getSubtypeGSSScenarioProtocolSubtypeParserRuleCall_15_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_subtype_15_0=ruleGSSScenarioProtocolSubtype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolRule());
                      					}
                      					set(
                      						current,
                      						"subtype",
                      						lv_subtype_15_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioProtocolSubtype");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSScenarioProtocolAccess().getRightCurlyBracketKeyword_16());
              		
            }
            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioProtocolAccess().getSemicolonKeyword_17());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioProtocol"


    // $ANTLR start "entryRuleGSSScenarioProtocolType"
    // InternalENVIRONMENT.g:1864:1: entryRuleGSSScenarioProtocolType returns [EObject current=null] : iv_ruleGSSScenarioProtocolType= ruleGSSScenarioProtocolType EOF ;
    public final EObject entryRuleGSSScenarioProtocolType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioProtocolType = null;


        try {
            // InternalENVIRONMENT.g:1864:64: (iv_ruleGSSScenarioProtocolType= ruleGSSScenarioProtocolType EOF )
            // InternalENVIRONMENT.g:1865:2: iv_ruleGSSScenarioProtocolType= ruleGSSScenarioProtocolType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioProtocolTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioProtocolType=ruleGSSScenarioProtocolType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioProtocolType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioProtocolType"


    // $ANTLR start "ruleGSSScenarioProtocolType"
    // InternalENVIRONMENT.g:1871:1: ruleGSSScenarioProtocolType returns [EObject current=null] : (otherlv_0= 'GSSScenarioProtocolType' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSScenarioProtocolType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_offset_8_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1877:2: ( (otherlv_0= 'GSSScenarioProtocolType' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalENVIRONMENT.g:1878:2: (otherlv_0= 'GSSScenarioProtocolType' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalENVIRONMENT.g:1878:2: (otherlv_0= 'GSSScenarioProtocolType' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalENVIRONMENT.g:1879:3: otherlv_0= 'GSSScenarioProtocolType' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioProtocolTypeAccess().getGSSScenarioProtocolTypeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolTypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolTypeAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1895:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:1896:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:1896:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:1897:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioProtocolTypeAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioProtocolTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioProtocolTypeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1925:3: ( (lv_offset_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:1926:4: (lv_offset_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:1926:4: (lv_offset_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:1927:5: lv_offset_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioProtocolTypeAccess().getOffsetINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolTypeRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioProtocolTypeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioProtocolTypeAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioProtocolType"


    // $ANTLR start "entryRuleGSSScenarioProtocolSubtype"
    // InternalENVIRONMENT.g:1960:1: entryRuleGSSScenarioProtocolSubtype returns [EObject current=null] : iv_ruleGSSScenarioProtocolSubtype= ruleGSSScenarioProtocolSubtype EOF ;
    public final EObject entryRuleGSSScenarioProtocolSubtype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioProtocolSubtype = null;


        try {
            // InternalENVIRONMENT.g:1960:67: (iv_ruleGSSScenarioProtocolSubtype= ruleGSSScenarioProtocolSubtype EOF )
            // InternalENVIRONMENT.g:1961:2: iv_ruleGSSScenarioProtocolSubtype= ruleGSSScenarioProtocolSubtype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioProtocolSubtypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioProtocolSubtype=ruleGSSScenarioProtocolSubtype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioProtocolSubtype; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioProtocolSubtype"


    // $ANTLR start "ruleGSSScenarioProtocolSubtype"
    // InternalENVIRONMENT.g:1967:1: ruleGSSScenarioProtocolSubtype returns [EObject current=null] : (otherlv_0= 'GSSScenarioProtocolSubtype' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSScenarioProtocolSubtype() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_offset_8_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1973:2: ( (otherlv_0= 'GSSScenarioProtocolSubtype' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalENVIRONMENT.g:1974:2: (otherlv_0= 'GSSScenarioProtocolSubtype' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalENVIRONMENT.g:1974:2: (otherlv_0= 'GSSScenarioProtocolSubtype' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalENVIRONMENT.g:1975:3: otherlv_0= 'GSSScenarioProtocolSubtype' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'offset' otherlv_7= ':=' ( (lv_offset_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getGSSScenarioProtocolSubtypeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1991:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:1992:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:1992:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:1993:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioProtocolSubtypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2021:3: ( (lv_offset_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2022:4: (lv_offset_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2022:4: (lv_offset_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2023:5: lv_offset_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioProtocolSubtypeAccess().getOffsetINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioProtocolSubtypeRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioProtocolSubtypeAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioProtocolSubtype"


    // $ANTLR start "entryRuleGSSScenarioMainInterface"
    // InternalENVIRONMENT.g:2056:1: entryRuleGSSScenarioMainInterface returns [EObject current=null] : iv_ruleGSSScenarioMainInterface= ruleGSSScenarioMainInterface EOF ;
    public final EObject entryRuleGSSScenarioMainInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioMainInterface = null;


        try {
            // InternalENVIRONMENT.g:2056:65: (iv_ruleGSSScenarioMainInterface= ruleGSSScenarioMainInterface EOF )
            // InternalENVIRONMENT.g:2057:2: iv_ruleGSSScenarioMainInterface= ruleGSSScenarioMainInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioMainInterface=ruleGSSScenarioMainInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioMainInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioMainInterface"


    // $ANTLR start "ruleGSSScenarioMainInterface"
    // InternalENVIRONMENT.g:2063:1: ruleGSSScenarioMainInterface returns [EObject current=null] : (otherlv_0= 'GSSScenarioMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' ) ;
    public final EObject ruleGSSScenarioMainInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_ifType_12_0 = null;

        Enumerator lv_ioType_20_0 = null;

        EObject lv_LevelInOut_26_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:2069:2: ( (otherlv_0= 'GSSScenarioMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            // InternalENVIRONMENT.g:2070:2: (otherlv_0= 'GSSScenarioMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' )
            {
            // InternalENVIRONMENT.g:2070:2: (otherlv_0= 'GSSScenarioMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' )
            // InternalENVIRONMENT.g:2071:3: otherlv_0= 'GSSScenarioMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioMainInterfaceAccess().getGSSScenarioMainInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioMainInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioMainInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2087:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2088:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2088:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2089:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioMainInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2118:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2119:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2119:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2120:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioMainInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2148:3: ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) )
            // InternalENVIRONMENT.g:2149:4: (lv_ifType_12_0= ruleGSSScenarioInterfaceType )
            {
            // InternalENVIRONMENT.g:2149:4: (lv_ifType_12_0= ruleGSSScenarioInterfaceType )
            // InternalENVIRONMENT.g:2150:5: lv_ifType_12_0= ruleGSSScenarioInterfaceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifType_12_0=ruleGSSScenarioInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
              					}
              					set(
              						current,
              						"ifType",
              						lv_ifType_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:2179:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2180:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2180:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2181:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioMainInterfaceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,55,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:2210:3: ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) )
            // InternalENVIRONMENT.g:2211:4: (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType )
            {
            // InternalENVIRONMENT.g:2211:4: (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType )
            // InternalENVIRONMENT.g:2212:5: lv_ioType_20_0= ruleGSSScenarioInterfaceIOType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ioType_20_0=ruleGSSScenarioInterfaceIOType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
              					}
              					set(
              						current,
              						"ioType",
              						lv_ioType_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceIOType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:2233:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==56) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalENVIRONMENT.g:2234:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,56,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioMainInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2242:4: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalENVIRONMENT.g:2243:5: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalENVIRONMENT.g:2243:5: ( ruleVersionedQualifiedReferenceName )
                    // InternalENVIRONMENT.g:2244:6: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioMainInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedReferenceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_60); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:2266:3: ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==58) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalENVIRONMENT.g:2267:4: (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut )
            	    {
            	    // InternalENVIRONMENT.g:2267:4: (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut )
            	    // InternalENVIRONMENT.g:2268:5: lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioMainInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_LevelInOut_26_0=ruleGSSScenarioLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioMainInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"LevelInOut",
            	      						lv_LevelInOut_26_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelInOut");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioMainInterfaceAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getGSSScenarioMainInterfaceAccess().getSemicolonKeyword_25());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioMainInterface"


    // $ANTLR start "entryRuleGSSScenarioInterface"
    // InternalENVIRONMENT.g:2297:1: entryRuleGSSScenarioInterface returns [EObject current=null] : iv_ruleGSSScenarioInterface= ruleGSSScenarioInterface EOF ;
    public final EObject entryRuleGSSScenarioInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioInterface = null;


        try {
            // InternalENVIRONMENT.g:2297:61: (iv_ruleGSSScenarioInterface= ruleGSSScenarioInterface EOF )
            // InternalENVIRONMENT.g:2298:2: iv_ruleGSSScenarioInterface= ruleGSSScenarioInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioInterface=ruleGSSScenarioInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioInterface; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioInterface"


    // $ANTLR start "ruleGSSScenarioInterface"
    // InternalENVIRONMENT.g:2304:1: ruleGSSScenarioInterface returns [EObject current=null] : (otherlv_0= 'GSSScenarioInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' ) ;
    public final EObject ruleGSSScenarioInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_ifType_12_0 = null;

        Enumerator lv_ioType_20_0 = null;

        EObject lv_LevelInOut_26_0 = null;

        EObject lv_LevelIn_27_0 = null;

        EObject lv_LevelOut_28_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:2310:2: ( (otherlv_0= 'GSSScenarioInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' ) )
            // InternalENVIRONMENT.g:2311:2: (otherlv_0= 'GSSScenarioInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' )
            {
            // InternalENVIRONMENT.g:2311:2: (otherlv_0= 'GSSScenarioInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' )
            // InternalENVIRONMENT.g:2312:3: otherlv_0= 'GSSScenarioInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioInterfaceAccess().getGSSScenarioInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2328:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2329:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2329:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2330:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2359:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2360:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2360:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2361:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2389:3: ( (lv_ifType_12_0= ruleGSSScenarioInterfaceType ) )
            // InternalENVIRONMENT.g:2390:4: (lv_ifType_12_0= ruleGSSScenarioInterfaceType )
            {
            // InternalENVIRONMENT.g:2390:4: (lv_ifType_12_0= ruleGSSScenarioInterfaceType )
            // InternalENVIRONMENT.g:2391:5: lv_ifType_12_0= ruleGSSScenarioInterfaceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIfTypeGSSScenarioInterfaceTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifType_12_0=ruleGSSScenarioInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
              					}
              					set(
              						current,
              						"ifType",
              						lv_ifType_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:2420:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2421:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2421:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2422:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioInterfaceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,55,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:2451:3: ( (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType ) )
            // InternalENVIRONMENT.g:2452:4: (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType )
            {
            // InternalENVIRONMENT.g:2452:4: (lv_ioType_20_0= ruleGSSScenarioInterfaceIOType )
            // InternalENVIRONMENT.g:2453:5: lv_ioType_20_0= ruleGSSScenarioInterfaceIOType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getIoTypeGSSScenarioInterfaceIOTypeEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ioType_20_0=ruleGSSScenarioInterfaceIOType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
              					}
              					set(
              						current,
              						"ioType",
              						lv_ioType_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioInterfaceIOType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:2474:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalENVIRONMENT.g:2475:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,56,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2483:4: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalENVIRONMENT.g:2484:5: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalENVIRONMENT.g:2484:5: ( ruleVersionedQualifiedReferenceName )
                    // InternalENVIRONMENT.g:2485:6: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getProtocolIDGSSScenarioProtocolCrossReference_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedReferenceName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:2507:3: ( ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case 58:
                    {
                    alt20=1;
                    }
                    break;
                case 64:
                    {
                    alt20=2;
                    }
                    break;
                case 65:
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalENVIRONMENT.g:2508:4: ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )
            	    {
            	    // InternalENVIRONMENT.g:2508:4: ( (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut ) )
            	    // InternalENVIRONMENT.g:2509:5: (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut )
            	    {
            	    // InternalENVIRONMENT.g:2509:5: (lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut )
            	    // InternalENVIRONMENT.g:2510:6: lv_LevelInOut_26_0= ruleGSSScenarioLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInOutGSSScenarioLevelInOutParserRuleCall_23_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_LevelInOut_26_0=ruleGSSScenarioLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelInOut",
            	      							lv_LevelInOut_26_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelInOut");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalENVIRONMENT.g:2528:4: ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) )
            	    {
            	    // InternalENVIRONMENT.g:2528:4: ( (lv_LevelIn_27_0= ruleGSSScenarioLevelIn ) )
            	    // InternalENVIRONMENT.g:2529:5: (lv_LevelIn_27_0= ruleGSSScenarioLevelIn )
            	    {
            	    // InternalENVIRONMENT.g:2529:5: (lv_LevelIn_27_0= ruleGSSScenarioLevelIn )
            	    // InternalENVIRONMENT.g:2530:6: lv_LevelIn_27_0= ruleGSSScenarioLevelIn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getLevelInGSSScenarioLevelInParserRuleCall_23_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_LevelIn_27_0=ruleGSSScenarioLevelIn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelIn",
            	      							lv_LevelIn_27_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelIn");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalENVIRONMENT.g:2548:4: ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) )
            	    {
            	    // InternalENVIRONMENT.g:2548:4: ( (lv_LevelOut_28_0= ruleGSSScenarioLevelOut ) )
            	    // InternalENVIRONMENT.g:2549:5: (lv_LevelOut_28_0= ruleGSSScenarioLevelOut )
            	    {
            	    // InternalENVIRONMENT.g:2549:5: (lv_LevelOut_28_0= ruleGSSScenarioLevelOut )
            	    // InternalENVIRONMENT.g:2550:6: lv_LevelOut_28_0= ruleGSSScenarioLevelOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSScenarioInterfaceAccess().getLevelOutGSSScenarioLevelOutParserRuleCall_23_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_LevelOut_28_0=ruleGSSScenarioLevelOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSScenarioInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelOut",
            	      							lv_LevelOut_28_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioLevelOut");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_29=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioInterfaceAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSScenarioInterfaceAccess().getSemicolonKeyword_25());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioInterface"


    // $ANTLR start "entryRuleGSSScenarioLevelInOut"
    // InternalENVIRONMENT.g:2580:1: entryRuleGSSScenarioLevelInOut returns [EObject current=null] : iv_ruleGSSScenarioLevelInOut= ruleGSSScenarioLevelInOut EOF ;
    public final EObject entryRuleGSSScenarioLevelInOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioLevelInOut = null;


        try {
            // InternalENVIRONMENT.g:2580:62: (iv_ruleGSSScenarioLevelInOut= ruleGSSScenarioLevelInOut EOF )
            // InternalENVIRONMENT.g:2581:2: iv_ruleGSSScenarioLevelInOut= ruleGSSScenarioLevelInOut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioLevelInOutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioLevelInOut=ruleGSSScenarioLevelInOut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioLevelInOut; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioLevelInOut"


    // $ANTLR start "ruleGSSScenarioLevelInOut"
    // InternalENVIRONMENT.g:2587:1: ruleGSSScenarioLevelInOut returns [EObject current=null] : (otherlv_0= 'GSSScenarioLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' ) ;
    public final EObject ruleGSSScenarioLevelInOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:2593:2: ( (otherlv_0= 'GSSScenarioLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' ) )
            // InternalENVIRONMENT.g:2594:2: (otherlv_0= 'GSSScenarioLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' )
            {
            // InternalENVIRONMENT.g:2594:2: (otherlv_0= 'GSSScenarioLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' )
            // InternalENVIRONMENT.g:2595:3: otherlv_0= 'GSSScenarioLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioLevelInOutAccess().getGSSScenarioLevelInOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioLevelInOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioLevelInOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2611:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2612:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2612:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2613:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioLevelInOutRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioLevelInOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2642:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2643:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2643:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2644:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,59,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2672:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2673:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2673:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2674:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getTMformatGSSFormatFormatCrossReference_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:2703:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2704:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2704:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2705:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getTCformatGSSFormatFormatCrossReference_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:2734:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2735:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2735:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2736:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getInputFilterGSSFilterFilterCrossReference_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:2757:3: (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==62) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalENVIRONMENT.g:2758:4: otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2766:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:2767:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:2767:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:2768:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getExport_to_prev_LevelGSSExportExportCrossReference_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:2790:3: (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==63) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalENVIRONMENT.g:2791:4: otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';'
                    {
                    otherlv_26=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0());
                      			
                    }
                    otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getGSSScenarioLevelInOutAccess().getColonEqualsSignKeyword_23_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2799:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:2800:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:2800:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:2801:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioLevelInOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioLevelInOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_23_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_23_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSScenarioLevelInOutAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSScenarioLevelInOutAccess().getSemicolonKeyword_25());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioLevelInOut"


    // $ANTLR start "entryRuleGSSScenarioLevelIn"
    // InternalENVIRONMENT.g:2835:1: entryRuleGSSScenarioLevelIn returns [EObject current=null] : iv_ruleGSSScenarioLevelIn= ruleGSSScenarioLevelIn EOF ;
    public final EObject entryRuleGSSScenarioLevelIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioLevelIn = null;


        try {
            // InternalENVIRONMENT.g:2835:59: (iv_ruleGSSScenarioLevelIn= ruleGSSScenarioLevelIn EOF )
            // InternalENVIRONMENT.g:2836:2: iv_ruleGSSScenarioLevelIn= ruleGSSScenarioLevelIn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioLevelInRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioLevelIn=ruleGSSScenarioLevelIn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioLevelIn; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioLevelIn"


    // $ANTLR start "ruleGSSScenarioLevelIn"
    // InternalENVIRONMENT.g:2842:1: ruleGSSScenarioLevelIn returns [EObject current=null] : (otherlv_0= 'GSSScenarioLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSScenarioLevelIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:2848:2: ( (otherlv_0= 'GSSScenarioLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:2849:2: (otherlv_0= 'GSSScenarioLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:2849:2: (otherlv_0= 'GSSScenarioLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:2850:3: otherlv_0= 'GSSScenarioLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioLevelInAccess().getGSSScenarioLevelInKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioLevelInAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioLevelInAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2866:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2867:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2867:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2868:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelInAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioLevelInRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioLevelInAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2897:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2898:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2898:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2899:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioLevelInAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelInRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioLevelInAccess().getTCformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2927:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2928:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2928:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2929:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelInRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelInAccess().getTCformatGSSFormatFormatCrossReference_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:2950:3: (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==62) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalENVIRONMENT.g:2951:4: otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSScenarioLevelInAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2959:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:2960:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:2960:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:2961:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioLevelInRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioLevelInAccess().getExport_to_prev_LevelGSSExportExportCrossReference_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioLevelInAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioLevelInAccess().getSemicolonKeyword_16());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioLevelIn"


    // $ANTLR start "entryRuleGSSScenarioLevelOut"
    // InternalENVIRONMENT.g:2995:1: entryRuleGSSScenarioLevelOut returns [EObject current=null] : iv_ruleGSSScenarioLevelOut= ruleGSSScenarioLevelOut EOF ;
    public final EObject entryRuleGSSScenarioLevelOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioLevelOut = null;


        try {
            // InternalENVIRONMENT.g:2995:60: (iv_ruleGSSScenarioLevelOut= ruleGSSScenarioLevelOut EOF )
            // InternalENVIRONMENT.g:2996:2: iv_ruleGSSScenarioLevelOut= ruleGSSScenarioLevelOut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioLevelOutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioLevelOut=ruleGSSScenarioLevelOut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioLevelOut; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioLevelOut"


    // $ANTLR start "ruleGSSScenarioLevelOut"
    // InternalENVIRONMENT.g:3002:1: ruleGSSScenarioLevelOut returns [EObject current=null] : (otherlv_0= 'GSSScenarioLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSScenarioLevelOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3008:2: ( (otherlv_0= 'GSSScenarioLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalENVIRONMENT.g:3009:2: (otherlv_0= 'GSSScenarioLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalENVIRONMENT.g:3009:2: (otherlv_0= 'GSSScenarioLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalENVIRONMENT.g:3010:3: otherlv_0= 'GSSScenarioLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioLevelOutAccess().getGSSScenarioLevelOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioLevelOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioLevelOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3026:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3027:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3027:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3028:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioLevelOutRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioLevelOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:3057:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:3058:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:3058:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:3059:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,59,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioLevelOutAccess().getTMformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3087:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:3088:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:3088:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:3089:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getTMformatGSSFormatFormatCrossReference_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3118:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:3119:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:3119:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:3120:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getInputFilterGSSFilterFilterCrossReference_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_17());
              		
            }
            // InternalENVIRONMENT.g:3141:3: (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==63) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalENVIRONMENT.g:3142:4: otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelKeyword_18_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSScenarioLevelOutAccess().getColonEqualsSignKeyword_18_1());
                      			
                    }
                    // InternalENVIRONMENT.g:3150:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:3151:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:3151:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:3152:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioLevelOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioLevelOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_18_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_18_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioLevelOutAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioLevelOutAccess().getSemicolonKeyword_20());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioLevelOut"


    // $ANTLR start "entryRuleGSSScenarioSpecialPacket"
    // InternalENVIRONMENT.g:3186:1: entryRuleGSSScenarioSpecialPacket returns [EObject current=null] : iv_ruleGSSScenarioSpecialPacket= ruleGSSScenarioSpecialPacket EOF ;
    public final EObject entryRuleGSSScenarioSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioSpecialPacket = null;


        try {
            // InternalENVIRONMENT.g:3186:65: (iv_ruleGSSScenarioSpecialPacket= ruleGSSScenarioSpecialPacket EOF )
            // InternalENVIRONMENT.g:3187:2: iv_ruleGSSScenarioSpecialPacket= ruleGSSScenarioSpecialPacket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioSpecialPacket=ruleGSSScenarioSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioSpecialPacket; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioSpecialPacket"


    // $ANTLR start "ruleGSSScenarioSpecialPacket"
    // InternalENVIRONMENT.g:3193:1: ruleGSSScenarioSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSScenarioSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSScenarioPrintingData ) ) ( ( (lv_period_32_0= ruleGSSScenarioPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' ) ;
    public final EObject ruleGSSScenarioSpecialPacket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Enumerator lv_status_4_0 = null;

        AntlrDatatypeRuleToken lv_id_12_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_16_0 = null;

        AntlrDatatypeRuleToken lv_levels_20_0 = null;

        AntlrDatatypeRuleToken lv_levelRef_24_0 = null;

        EObject lv_UpperLevels_30_0 = null;

        EObject lv_printingData_31_0 = null;

        EObject lv_period_32_0 = null;

        EObject lv_intervalRange_33_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3199:2: ( (otherlv_0= 'GSSScenarioSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSScenarioPrintingData ) ) ( ( (lv_period_32_0= ruleGSSScenarioPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' ) )
            // InternalENVIRONMENT.g:3200:2: (otherlv_0= 'GSSScenarioSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSScenarioPrintingData ) ) ( ( (lv_period_32_0= ruleGSSScenarioPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' )
            {
            // InternalENVIRONMENT.g:3200:2: (otherlv_0= 'GSSScenarioSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSScenarioPrintingData ) ) ( ( (lv_period_32_0= ruleGSSScenarioPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' )
            // InternalENVIRONMENT.g:3201:3: otherlv_0= 'GSSScenarioSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSScenarioPrintingData ) ) ( ( (lv_period_32_0= ruleGSSScenarioPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioSpecialPacketAccess().getGSSScenarioSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3217:3: ( (lv_status_4_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:3218:4: (lv_status_4_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:3218:4: (lv_status_4_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:3219:5: lv_status_4_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getStatusGSSScenarioEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_status_4_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              					set(
              						current,
              						"status",
              						lv_status_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioSpecialPacketAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:3248:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:3249:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:3249:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:3250:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSScenarioSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioSpecialPacketAccess().getIdKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3278:3: ( (lv_id_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3279:4: (lv_id_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3279:4: (lv_id_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3280:5: lv_id_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3309:3: ( (lv_ifRef_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3310:4: (lv_ifRef_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3310:4: (lv_ifRef_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3311:5: lv_ifRef_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:3340:3: ( (lv_levels_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3341:4: (lv_levels_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3341:4: (lv_levels_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3342:5: lv_levels_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levels_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              					set(
              						current,
              						"levels",
              						lv_levels_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,70,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalENVIRONMENT.g:3371:3: ( (lv_levelRef_24_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3372:4: (lv_levelRef_24_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3372:4: (lv_levelRef_24_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3373:5: lv_levelRef_24_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levelRef_24_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              					set(
              						current,
              						"levelRef",
              						lv_levelRef_24_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_25());
              		
            }
            otherlv_26=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioSpecialPacketAccess().getColonEqualsSignKeyword_27());
              		
            }
            // InternalENVIRONMENT.g:3402:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:3403:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:3403:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:3404:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getInputFilterGSSFilterFilterCrossReference_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_29());
              		
            }
            // InternalENVIRONMENT.g:3425:3: ( (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==71) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalENVIRONMENT.g:3426:4: (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels )
                    {
                    // InternalENVIRONMENT.g:3426:4: (lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels )
                    // InternalENVIRONMENT.g:3427:5: lv_UpperLevels_30_0= ruleGSSScenarioUpperLevels
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getUpperLevelsGSSScenarioUpperLevelsParserRuleCall_30_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_74);
                    lv_UpperLevels_30_0=ruleGSSScenarioUpperLevels();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
                      					}
                      					add(
                      						current,
                      						"UpperLevels",
                      						lv_UpperLevels_30_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUpperLevels");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalENVIRONMENT.g:3444:3: ( (lv_printingData_31_0= ruleGSSScenarioPrintingData ) )
            // InternalENVIRONMENT.g:3445:4: (lv_printingData_31_0= ruleGSSScenarioPrintingData )
            {
            // InternalENVIRONMENT.g:3445:4: (lv_printingData_31_0= ruleGSSScenarioPrintingData )
            // InternalENVIRONMENT.g:3446:5: lv_printingData_31_0= ruleGSSScenarioPrintingData
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getPrintingDataGSSScenarioPrintingDataParserRuleCall_31_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_75);
            lv_printingData_31_0=ruleGSSScenarioPrintingData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
              					}
              					set(
              						current,
              						"printingData",
              						lv_printingData_31_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPrintingData");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:3463:3: ( ( (lv_period_32_0= ruleGSSScenarioPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==74) ) {
                alt26=1;
            }
            else if ( (LA26_0==79) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // InternalENVIRONMENT.g:3464:4: ( (lv_period_32_0= ruleGSSScenarioPeriod ) )
                    {
                    // InternalENVIRONMENT.g:3464:4: ( (lv_period_32_0= ruleGSSScenarioPeriod ) )
                    // InternalENVIRONMENT.g:3465:5: (lv_period_32_0= ruleGSSScenarioPeriod )
                    {
                    // InternalENVIRONMENT.g:3465:5: (lv_period_32_0= ruleGSSScenarioPeriod )
                    // InternalENVIRONMENT.g:3466:6: lv_period_32_0= ruleGSSScenarioPeriod
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getPeriodGSSScenarioPeriodParserRuleCall_32_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_period_32_0=ruleGSSScenarioPeriod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"period",
                      							lv_period_32_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioPeriod");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:3484:4: ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) )
                    {
                    // InternalENVIRONMENT.g:3484:4: ( (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange ) )
                    // InternalENVIRONMENT.g:3485:5: (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange )
                    {
                    // InternalENVIRONMENT.g:3485:5: (lv_intervalRange_33_0= ruleGSSScenarioIntervalRange )
                    // InternalENVIRONMENT.g:3486:6: lv_intervalRange_33_0= ruleGSSScenarioIntervalRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioSpecialPacketAccess().getIntervalRangeGSSScenarioIntervalRangeParserRuleCall_32_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_intervalRange_33_0=ruleGSSScenarioIntervalRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSScenarioSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"intervalRange",
                      							lv_intervalRange_33_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioIntervalRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_34=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSScenarioSpecialPacketAccess().getRightCurlyBracketKeyword_33());
              		
            }
            otherlv_35=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_35, grammarAccess.getGSSScenarioSpecialPacketAccess().getSemicolonKeyword_34());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioSpecialPacket"


    // $ANTLR start "entryRuleGSSScenarioUpperLevels"
    // InternalENVIRONMENT.g:3516:1: entryRuleGSSScenarioUpperLevels returns [EObject current=null] : iv_ruleGSSScenarioUpperLevels= ruleGSSScenarioUpperLevels EOF ;
    public final EObject entryRuleGSSScenarioUpperLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioUpperLevels = null;


        try {
            // InternalENVIRONMENT.g:3516:63: (iv_ruleGSSScenarioUpperLevels= ruleGSSScenarioUpperLevels EOF )
            // InternalENVIRONMENT.g:3517:2: iv_ruleGSSScenarioUpperLevels= ruleGSSScenarioUpperLevels EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioUpperLevelsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioUpperLevels=ruleGSSScenarioUpperLevels();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioUpperLevels; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioUpperLevels"


    // $ANTLR start "ruleGSSScenarioUpperLevels"
    // InternalENVIRONMENT.g:3523:1: ruleGSSScenarioUpperLevels returns [EObject current=null] : (otherlv_0= 'GSSScenarioUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSScenarioUpperLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_UpperLevel_2_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3529:2: ( (otherlv_0= 'GSSScenarioUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalENVIRONMENT.g:3530:2: (otherlv_0= 'GSSScenarioUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalENVIRONMENT.g:3530:2: (otherlv_0= 'GSSScenarioUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalENVIRONMENT.g:3531:3: otherlv_0= 'GSSScenarioUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioUpperLevelsAccess().getGSSScenarioUpperLevelsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioUpperLevelsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:3539:3: ( (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==84) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalENVIRONMENT.g:3540:4: (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel )
            	    {
            	    // InternalENVIRONMENT.g:3540:4: (lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel )
            	    // InternalENVIRONMENT.g:3541:5: lv_UpperLevel_2_0= ruleGSSScenarioUpperLevel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSScenarioUpperLevelsAccess().getUpperLevelGSSScenarioUpperLevelParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_77);
            	    lv_UpperLevel_2_0=ruleGSSScenarioUpperLevel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSScenarioUpperLevelsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"UpperLevel",
            	      						lv_UpperLevel_2_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUpperLevel");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioUpperLevelsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSScenarioUpperLevelsAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioUpperLevels"


    // $ANTLR start "entryRuleGSSScenarioPrintingData"
    // InternalENVIRONMENT.g:3570:1: entryRuleGSSScenarioPrintingData returns [EObject current=null] : iv_ruleGSSScenarioPrintingData= ruleGSSScenarioPrintingData EOF ;
    public final EObject entryRuleGSSScenarioPrintingData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPrintingData = null;


        try {
            // InternalENVIRONMENT.g:3570:64: (iv_ruleGSSScenarioPrintingData= ruleGSSScenarioPrintingData EOF )
            // InternalENVIRONMENT.g:3571:2: iv_ruleGSSScenarioPrintingData= ruleGSSScenarioPrintingData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPrintingDataRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPrintingData=ruleGSSScenarioPrintingData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPrintingData; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPrintingData"


    // $ANTLR start "ruleGSSScenarioPrintingData"
    // InternalENVIRONMENT.g:3577:1: ruleGSSScenarioPrintingData returns [EObject current=null] : (otherlv_0= 'GSSScenarioPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSScenarioStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSScenarioPrintingData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_printStatus_4_0 = null;

        EObject lv_structuredData_6_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3583:2: ( (otherlv_0= 'GSSScenarioPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSScenarioStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) )
            // InternalENVIRONMENT.g:3584:2: (otherlv_0= 'GSSScenarioPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSScenarioStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalENVIRONMENT.g:3584:2: (otherlv_0= 'GSSScenarioPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSScenarioStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            // InternalENVIRONMENT.g:3585:3: otherlv_0= 'GSSScenarioPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSScenarioEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSScenarioStructuredData ) )? otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,72,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPrintingDataAccess().getGSSScenarioPrintingDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPrintingDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,73,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPrintingDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3601:3: ( (lv_printStatus_4_0= ruleGSSScenarioEnableDisable ) )
            // InternalENVIRONMENT.g:3602:4: (lv_printStatus_4_0= ruleGSSScenarioEnableDisable )
            {
            // InternalENVIRONMENT.g:3602:4: (lv_printStatus_4_0= ruleGSSScenarioEnableDisable )
            // InternalENVIRONMENT.g:3603:5: lv_printStatus_4_0= ruleGSSScenarioEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPrintingDataAccess().getPrintStatusGSSScenarioEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_printStatus_4_0=ruleGSSScenarioEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPrintingDataRule());
              					}
              					set(
              						current,
              						"printStatus",
              						lv_printStatus_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:3624:3: ( (lv_structuredData_6_0= ruleGSSScenarioStructuredData ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==86) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalENVIRONMENT.g:3625:4: (lv_structuredData_6_0= ruleGSSScenarioStructuredData )
                    {
                    // InternalENVIRONMENT.g:3625:4: (lv_structuredData_6_0= ruleGSSScenarioStructuredData )
                    // InternalENVIRONMENT.g:3626:5: lv_structuredData_6_0= ruleGSSScenarioStructuredData
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSScenarioPrintingDataAccess().getStructuredDataGSSScenarioStructuredDataParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_structuredData_6_0=ruleGSSScenarioStructuredData();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSScenarioPrintingDataRule());
                      					}
                      					set(
                      						current,
                      						"structuredData",
                      						lv_structuredData_6_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioStructuredData");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPrintingDataAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSScenarioPrintingDataAccess().getSemicolonKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPrintingData"


    // $ANTLR start "entryRuleGSSScenarioPeriod"
    // InternalENVIRONMENT.g:3655:1: entryRuleGSSScenarioPeriod returns [EObject current=null] : iv_ruleGSSScenarioPeriod= ruleGSSScenarioPeriod EOF ;
    public final EObject entryRuleGSSScenarioPeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPeriod = null;


        try {
            // InternalENVIRONMENT.g:3655:58: (iv_ruleGSSScenarioPeriod= ruleGSSScenarioPeriod EOF )
            // InternalENVIRONMENT.g:3656:2: iv_ruleGSSScenarioPeriod= ruleGSSScenarioPeriod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPeriodRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPeriod=ruleGSSScenarioPeriod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPeriod; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPeriod"


    // $ANTLR start "ruleGSSScenarioPeriod"
    // InternalENVIRONMENT.g:3662:1: ruleGSSScenarioPeriod returns [EObject current=null] : (otherlv_0= 'GSSScenarioPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSScenarioUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSScenarioPeriod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_min_value_4_0 = null;

        Enumerator lv_min_unit_8_0 = null;

        AntlrDatatypeRuleToken lv_max_value_12_0 = null;

        Enumerator lv_max_unit_16_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3668:2: ( (otherlv_0= 'GSSScenarioPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSScenarioUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:3669:2: (otherlv_0= 'GSSScenarioPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSScenarioUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:3669:2: (otherlv_0= 'GSSScenarioPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSScenarioUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:3670:3: otherlv_0= 'GSSScenarioPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSScenarioUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,74,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodAccess().getGSSScenarioPeriodKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,75,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodAccess().getMin_valueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3686:3: ( (lv_min_value_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3687:4: (lv_min_value_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3687:4: (lv_min_value_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3688:5: lv_min_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
              					}
              					set(
              						current,
              						"min_value",
              						lv_min_value_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodAccess().getMin_unitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:3717:3: ( (lv_min_unit_8_0= ruleGSSScenarioUnit ) )
            // InternalENVIRONMENT.g:3718:4: (lv_min_unit_8_0= ruleGSSScenarioUnit )
            {
            // InternalENVIRONMENT.g:3718:4: (lv_min_unit_8_0= ruleGSSScenarioUnit )
            // InternalENVIRONMENT.g:3719:5: lv_min_unit_8_0= ruleGSSScenarioUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMin_unitGSSScenarioUnitEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_unit_8_0=ruleGSSScenarioUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
              					}
              					set(
              						current,
              						"min_unit",
              						lv_min_unit_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,77,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodAccess().getMax_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3748:3: ( (lv_max_value_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3749:4: (lv_max_value_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3749:4: (lv_max_value_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3750:5: lv_max_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
              					}
              					set(
              						current,
              						"max_value",
              						lv_max_value_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,78,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodAccess().getMax_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3779:3: ( (lv_max_unit_16_0= ruleGSSScenarioUnit ) )
            // InternalENVIRONMENT.g:3780:4: (lv_max_unit_16_0= ruleGSSScenarioUnit )
            {
            // InternalENVIRONMENT.g:3780:4: (lv_max_unit_16_0= ruleGSSScenarioUnit )
            // InternalENVIRONMENT.g:3781:5: lv_max_unit_16_0= ruleGSSScenarioUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodAccess().getMax_unitGSSScenarioUnitEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_unit_16_0=ruleGSSScenarioUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodRule());
              					}
              					set(
              						current,
              						"max_unit",
              						lv_max_unit_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodAccess().getSemicolonKeyword_19());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPeriod"


    // $ANTLR start "entryRuleGSSScenarioIntervalRange"
    // InternalENVIRONMENT.g:3814:1: entryRuleGSSScenarioIntervalRange returns [EObject current=null] : iv_ruleGSSScenarioIntervalRange= ruleGSSScenarioIntervalRange EOF ;
    public final EObject entryRuleGSSScenarioIntervalRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioIntervalRange = null;


        try {
            // InternalENVIRONMENT.g:3814:65: (iv_ruleGSSScenarioIntervalRange= ruleGSSScenarioIntervalRange EOF )
            // InternalENVIRONMENT.g:3815:2: iv_ruleGSSScenarioIntervalRange= ruleGSSScenarioIntervalRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioIntervalRange=ruleGSSScenarioIntervalRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioIntervalRange; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioIntervalRange"


    // $ANTLR start "ruleGSSScenarioIntervalRange"
    // InternalENVIRONMENT.g:3821:1: ruleGSSScenarioIntervalRange returns [EObject current=null] : (otherlv_0= 'GSSScenarioIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSScenarioIntervalRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_min_4_0 = null;

        AntlrDatatypeRuleToken lv_max_8_0 = null;

        AntlrDatatypeRuleToken lv_interval_value_12_0 = null;

        Enumerator lv_interval_unit_16_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3827:2: ( (otherlv_0= 'GSSScenarioIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:3828:2: (otherlv_0= 'GSSScenarioIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:3828:2: (otherlv_0= 'GSSScenarioIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:3829:3: otherlv_0= 'GSSScenarioIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSScenarioUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,79,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioIntervalRangeAccess().getGSSScenarioIntervalRangeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioIntervalRangeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,80,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioIntervalRangeAccess().getMinKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3845:3: ( (lv_min_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3846:4: (lv_min_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3846:4: (lv_min_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3847:5: lv_min_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
              					}
              					set(
              						current,
              						"min",
              						lv_min_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,81,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:3876:3: ( (lv_max_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3877:4: (lv_max_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3877:4: (lv_max_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3878:5: lv_max_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
              					}
              					set(
              						current,
              						"max",
              						lv_max_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,82,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3907:3: ( (lv_interval_value_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3908:4: (lv_interval_value_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3908:4: (lv_interval_value_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3909:5: lv_interval_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_interval_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
              					}
              					set(
              						current,
              						"interval_value",
              						lv_interval_value_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,83,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioIntervalRangeAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3938:3: ( (lv_interval_unit_16_0= ruleGSSScenarioUnit ) )
            // InternalENVIRONMENT.g:3939:4: (lv_interval_unit_16_0= ruleGSSScenarioUnit )
            {
            // InternalENVIRONMENT.g:3939:4: (lv_interval_unit_16_0= ruleGSSScenarioUnit )
            // InternalENVIRONMENT.g:3940:5: lv_interval_unit_16_0= ruleGSSScenarioUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioIntervalRangeAccess().getInterval_unitGSSScenarioUnitEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_interval_unit_16_0=ruleGSSScenarioUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioIntervalRangeRule());
              					}
              					set(
              						current,
              						"interval_unit",
              						lv_interval_unit_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioIntervalRangeAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioIntervalRangeAccess().getSemicolonKeyword_19());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioIntervalRange"


    // $ANTLR start "entryRuleGSSScenarioUpperLevel"
    // InternalENVIRONMENT.g:3973:1: entryRuleGSSScenarioUpperLevel returns [EObject current=null] : iv_ruleGSSScenarioUpperLevel= ruleGSSScenarioUpperLevel EOF ;
    public final EObject entryRuleGSSScenarioUpperLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioUpperLevel = null;


        try {
            // InternalENVIRONMENT.g:3973:62: (iv_ruleGSSScenarioUpperLevel= ruleGSSScenarioUpperLevel EOF )
            // InternalENVIRONMENT.g:3974:2: iv_ruleGSSScenarioUpperLevel= ruleGSSScenarioUpperLevel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioUpperLevelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioUpperLevel=ruleGSSScenarioUpperLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioUpperLevel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioUpperLevel"


    // $ANTLR start "ruleGSSScenarioUpperLevel"
    // InternalENVIRONMENT.g:3980:1: ruleGSSScenarioUpperLevel returns [EObject current=null] : (otherlv_0= 'GSSScenarioUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSScenarioUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSScenarioUpperLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Enumerator lv_level_4_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3986:2: ( (otherlv_0= 'GSSScenarioUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSScenarioUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:3987:2: (otherlv_0= 'GSSScenarioUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSScenarioUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:3987:2: (otherlv_0= 'GSSScenarioUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSScenarioUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:3988:3: otherlv_0= 'GSSScenarioUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSScenarioUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,84,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioUpperLevelAccess().getGSSScenarioUpperLevelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioUpperLevelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioUpperLevelAccess().getLevelKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4004:3: ( (lv_level_4_0= ruleGSSScenarioUpperLevelLevel ) )
            // InternalENVIRONMENT.g:4005:4: (lv_level_4_0= ruleGSSScenarioUpperLevelLevel )
            {
            // InternalENVIRONMENT.g:4005:4: (lv_level_4_0= ruleGSSScenarioUpperLevelLevel )
            // InternalENVIRONMENT.g:4006:5: lv_level_4_0= ruleGSSScenarioUpperLevelLevel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getLevelGSSScenarioUpperLevelLevelEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_4_0=ruleGSSScenarioUpperLevelLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioUpperLevelRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUpperLevelLevel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:4027:3: (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==59) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalENVIRONMENT.g:4028:4: otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,59,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4036:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4037:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4037:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4038:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getTMformatGSSFormatFormatCrossReference_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_92); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4060:3: (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==61) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalENVIRONMENT.g:4061:4: otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterKeyword_7_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_7_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4069:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4070:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4070:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4071:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getInputFilterGSSFilterFilterCrossReference_7_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_7_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4093:3: (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==63) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalENVIRONMENT.g:4094:4: otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,63,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSScenarioUpperLevelAccess().getColonEqualsSignKeyword_8_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4102:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4103:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4103:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4104:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioUpperLevelAccess().getImport_from_prev_LevelGSSImportImportCrossReference_8_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_8_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioUpperLevelAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioUpperLevelAccess().getSemicolonKeyword_10());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioUpperLevel"


    // $ANTLR start "entryRuleGSSScenarioStructuredData"
    // InternalENVIRONMENT.g:4138:1: entryRuleGSSScenarioStructuredData returns [EObject current=null] : iv_ruleGSSScenarioStructuredData= ruleGSSScenarioStructuredData EOF ;
    public final EObject entryRuleGSSScenarioStructuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioStructuredData = null;


        try {
            // InternalENVIRONMENT.g:4138:66: (iv_ruleGSSScenarioStructuredData= ruleGSSScenarioStructuredData EOF )
            // InternalENVIRONMENT.g:4139:2: iv_ruleGSSScenarioStructuredData= ruleGSSScenarioStructuredData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioStructuredDataRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioStructuredData=ruleGSSScenarioStructuredData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioStructuredData; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioStructuredData"


    // $ANTLR start "ruleGSSScenarioStructuredData"
    // InternalENVIRONMENT.g:4145:1: ruleGSSScenarioStructuredData returns [EObject current=null] : (otherlv_0= 'GSSScenarioStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSScenarioStructuredData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_levelRef_4_0 = null;

        AntlrDatatypeRuleToken lv_firstField_8_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:4151:2: ( (otherlv_0= 'GSSScenarioStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalENVIRONMENT.g:4152:2: (otherlv_0= 'GSSScenarioStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalENVIRONMENT.g:4152:2: (otherlv_0= 'GSSScenarioStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalENVIRONMENT.g:4153:3: otherlv_0= 'GSSScenarioStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,86,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioStructuredDataAccess().getGSSScenarioStructuredDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioStructuredDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,70,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4169:3: ( (lv_levelRef_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4170:4: (lv_levelRef_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4170:4: (lv_levelRef_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4171:5: lv_levelRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levelRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioStructuredDataRule());
              					}
              					set(
              						current,
              						"levelRef",
              						lv_levelRef_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,87,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioStructuredDataAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:4200:3: ( (lv_firstField_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4201:4: (lv_firstField_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4201:4: (lv_firstField_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4202:5: lv_firstField_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstField_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioStructuredDataRule());
              					}
              					set(
              						current,
              						"firstField",
              						lv_firstField_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioStructuredDataAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioStructuredDataAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioStructuredData"


    // $ANTLR start "entryRuleGSSScenarioPeriodicTC"
    // InternalENVIRONMENT.g:4235:1: entryRuleGSSScenarioPeriodicTC returns [EObject current=null] : iv_ruleGSSScenarioPeriodicTC= ruleGSSScenarioPeriodicTC EOF ;
    public final EObject entryRuleGSSScenarioPeriodicTC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPeriodicTC = null;


        try {
            // InternalENVIRONMENT.g:4235:62: (iv_ruleGSSScenarioPeriodicTC= ruleGSSScenarioPeriodicTC EOF )
            // InternalENVIRONMENT.g:4236:2: iv_ruleGSSScenarioPeriodicTC= ruleGSSScenarioPeriodicTC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPeriodicTC=ruleGSSScenarioPeriodicTC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPeriodicTC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPeriodicTC"


    // $ANTLR start "ruleGSSScenarioPeriodicTC"
    // InternalENVIRONMENT.g:4242:1: ruleGSSScenarioPeriodicTC returns [EObject current=null] : (this_GSSScenarioPeriodicTCLevel2_0= ruleGSSScenarioPeriodicTCLevel2 | this_GSSScenarioPeriodicTCLevel1_1= ruleGSSScenarioPeriodicTCLevel1 | this_GSSScenarioPeriodicTCLevel0_2= ruleGSSScenarioPeriodicTCLevel0 ) ;
    public final EObject ruleGSSScenarioPeriodicTC() throws RecognitionException {
        EObject current = null;

        EObject this_GSSScenarioPeriodicTCLevel2_0 = null;

        EObject this_GSSScenarioPeriodicTCLevel1_1 = null;

        EObject this_GSSScenarioPeriodicTCLevel0_2 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:4248:2: ( (this_GSSScenarioPeriodicTCLevel2_0= ruleGSSScenarioPeriodicTCLevel2 | this_GSSScenarioPeriodicTCLevel1_1= ruleGSSScenarioPeriodicTCLevel1 | this_GSSScenarioPeriodicTCLevel0_2= ruleGSSScenarioPeriodicTCLevel0 ) )
            // InternalENVIRONMENT.g:4249:2: (this_GSSScenarioPeriodicTCLevel2_0= ruleGSSScenarioPeriodicTCLevel2 | this_GSSScenarioPeriodicTCLevel1_1= ruleGSSScenarioPeriodicTCLevel1 | this_GSSScenarioPeriodicTCLevel0_2= ruleGSSScenarioPeriodicTCLevel0 )
            {
            // InternalENVIRONMENT.g:4249:2: (this_GSSScenarioPeriodicTCLevel2_0= ruleGSSScenarioPeriodicTCLevel2 | this_GSSScenarioPeriodicTCLevel1_1= ruleGSSScenarioPeriodicTCLevel1 | this_GSSScenarioPeriodicTCLevel0_2= ruleGSSScenarioPeriodicTCLevel0 )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt32=1;
                }
                break;
            case 97:
                {
                alt32=2;
                }
                break;
            case 99:
                {
                alt32=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalENVIRONMENT.g:4250:3: this_GSSScenarioPeriodicTCLevel2_0= ruleGSSScenarioPeriodicTCLevel2
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel2ParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioPeriodicTCLevel2_0=ruleGSSScenarioPeriodicTCLevel2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioPeriodicTCLevel2_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:4262:3: this_GSSScenarioPeriodicTCLevel1_1= ruleGSSScenarioPeriodicTCLevel1
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel1ParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioPeriodicTCLevel1_1=ruleGSSScenarioPeriodicTCLevel1();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioPeriodicTCLevel1_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:4274:3: this_GSSScenarioPeriodicTCLevel0_2= ruleGSSScenarioPeriodicTCLevel0
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCAccess().getGSSScenarioPeriodicTCLevel0ParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioPeriodicTCLevel0_2=ruleGSSScenarioPeriodicTCLevel0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioPeriodicTCLevel0_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPeriodicTC"


    // $ANTLR start "entryRuleGSSScenarioPeriodicTCLevel2"
    // InternalENVIRONMENT.g:4289:1: entryRuleGSSScenarioPeriodicTCLevel2 returns [EObject current=null] : iv_ruleGSSScenarioPeriodicTCLevel2= ruleGSSScenarioPeriodicTCLevel2 EOF ;
    public final EObject entryRuleGSSScenarioPeriodicTCLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPeriodicTCLevel2 = null;


        try {
            // InternalENVIRONMENT.g:4289:68: (iv_ruleGSSScenarioPeriodicTCLevel2= ruleGSSScenarioPeriodicTCLevel2 EOF )
            // InternalENVIRONMENT.g:4290:2: iv_ruleGSSScenarioPeriodicTCLevel2= ruleGSSScenarioPeriodicTCLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPeriodicTCLevel2=ruleGSSScenarioPeriodicTCLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPeriodicTCLevel2; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPeriodicTCLevel2"


    // $ANTLR start "ruleGSSScenarioPeriodicTCLevel2"
    // InternalENVIRONMENT.g:4296:1: ruleGSSScenarioPeriodicTCLevel2 returns [EObject current=null] : (otherlv_0= 'GSSScenarioPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' ) ;
    public final EObject ruleGSSScenarioPeriodicTCLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_12_0 = null;

        AntlrDatatypeRuleToken lv_period_value_16_0 = null;

        Enumerator lv_period_unit_20_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:4302:2: ( (otherlv_0= 'GSSScenarioPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' ) )
            // InternalENVIRONMENT.g:4303:2: (otherlv_0= 'GSSScenarioPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' )
            {
            // InternalENVIRONMENT.g:4303:2: (otherlv_0= 'GSSScenarioPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' )
            // InternalENVIRONMENT.g:4304:3: otherlv_0= 'GSSScenarioPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';'
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getGSSScenarioPeriodicTCLevel2Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4320:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:4321:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:4321:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:4322:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:4350:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4351:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4351:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4352:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:4381:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4382:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4382:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4383:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:4412:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4413:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4413:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4414:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:4443:3: ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) )
            // InternalENVIRONMENT.g:4444:4: (lv_period_unit_20_0= ruleGSSScenarioUnit )
            {
            // InternalENVIRONMENT.g:4444:4: (lv_period_unit_20_0= ruleGSSScenarioUnit )
            // InternalENVIRONMENT.g:4445:5: lv_period_unit_20_0= ruleGSSScenarioUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSScenarioUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_96); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:4466:3: (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==91) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalENVIRONMENT.g:4467:4: otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,91,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4475:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4476:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4476:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4477:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2GSSFormatFormatCrossReference_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_97); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,92,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalENVIRONMENT.g:4507:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:4508:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:4508:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:4509:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getApp_to_level2GSSExportExportCrossReference_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_98); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_26());
              		
            }
            // InternalENVIRONMENT.g:4530:3: (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==93) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalENVIRONMENT.g:4531:4: otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';'
                    {
                    otherlv_30=(Token)match(input,93,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1Keyword_27_0());
                      			
                    }
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4539:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4540:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4540:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4541:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1GSSFormatFormatCrossReference_27_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_27_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4563:3: (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==94) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalENVIRONMENT.g:4564:4: otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';'
                    {
                    otherlv_34=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0());
                      			
                    }
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4572:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4573:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4573:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4574:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_28_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,14,FollowSets000.FOLLOW_100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_28_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4596:3: (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==95) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalENVIRONMENT.g:4597:4: otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';'
                    {
                    otherlv_38=(Token)match(input,95,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0Keyword_29_0());
                      			
                    }
                    otherlv_39=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4605:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4606:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4606:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4607:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel0GSSFormatFormatCrossReference_29_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_41=(Token)match(input,14,FollowSets000.FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_29_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4629:3: (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==96) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalENVIRONMENT.g:4630:4: otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';'
                    {
                    otherlv_42=(Token)match(input,96,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0());
                      			
                    }
                    otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4638:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4639:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4639:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4640:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_30_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_45=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_30_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_46=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_46, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_47=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_47, grammarAccess.getGSSScenarioPeriodicTCLevel2Access().getSemicolonKeyword_32());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPeriodicTCLevel2"


    // $ANTLR start "entryRuleGSSScenarioPeriodicTCLevel1"
    // InternalENVIRONMENT.g:4674:1: entryRuleGSSScenarioPeriodicTCLevel1 returns [EObject current=null] : iv_ruleGSSScenarioPeriodicTCLevel1= ruleGSSScenarioPeriodicTCLevel1 EOF ;
    public final EObject entryRuleGSSScenarioPeriodicTCLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPeriodicTCLevel1 = null;


        try {
            // InternalENVIRONMENT.g:4674:68: (iv_ruleGSSScenarioPeriodicTCLevel1= ruleGSSScenarioPeriodicTCLevel1 EOF )
            // InternalENVIRONMENT.g:4675:2: iv_ruleGSSScenarioPeriodicTCLevel1= ruleGSSScenarioPeriodicTCLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPeriodicTCLevel1=ruleGSSScenarioPeriodicTCLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPeriodicTCLevel1; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPeriodicTCLevel1"


    // $ANTLR start "ruleGSSScenarioPeriodicTCLevel1"
    // InternalENVIRONMENT.g:4681:1: ruleGSSScenarioPeriodicTCLevel1 returns [EObject current=null] : (otherlv_0= 'GSSScenarioPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' ) ;
    public final EObject ruleGSSScenarioPeriodicTCLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_12_0 = null;

        AntlrDatatypeRuleToken lv_period_value_16_0 = null;

        Enumerator lv_period_unit_20_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:4687:2: ( (otherlv_0= 'GSSScenarioPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' ) )
            // InternalENVIRONMENT.g:4688:2: (otherlv_0= 'GSSScenarioPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' )
            {
            // InternalENVIRONMENT.g:4688:2: (otherlv_0= 'GSSScenarioPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' )
            // InternalENVIRONMENT.g:4689:3: otherlv_0= 'GSSScenarioPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';'
            {
            otherlv_0=(Token)match(input,97,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getGSSScenarioPeriodicTCLevel1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4705:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:4706:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:4706:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:4707:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:4735:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4736:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4736:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4737:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:4766:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4767:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4767:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4768:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:4797:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4798:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4798:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4799:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:4828:3: ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) )
            // InternalENVIRONMENT.g:4829:4: (lv_period_unit_20_0= ruleGSSScenarioUnit )
            {
            // InternalENVIRONMENT.g:4829:4: (lv_period_unit_20_0= ruleGSSScenarioUnit )
            // InternalENVIRONMENT.g:4830:5: lv_period_unit_20_0= ruleGSSScenarioUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSScenarioUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:4851:3: (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==93) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalENVIRONMENT.g:4852:4: otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,93,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4860:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4861:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4861:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4862:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1GSSFormatFormatCrossReference_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_103); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,98,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalENVIRONMENT.g:4892:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:4893:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:4893:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:4894:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getApp_to_level1GSSExportExportCrossReference_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_26());
              		
            }
            // InternalENVIRONMENT.g:4915:3: (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==95) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalENVIRONMENT.g:4916:4: otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';'
                    {
                    otherlv_30=(Token)match(input,95,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0Keyword_27_0());
                      			
                    }
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4924:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4925:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4925:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4926:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel0GSSFormatFormatCrossReference_27_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_27_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4948:3: (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==96) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalENVIRONMENT.g:4949:4: otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';'
                    {
                    otherlv_34=(Token)match(input,96,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0());
                      			
                    }
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4957:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4958:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4958:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4959:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_37=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_28_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_38=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_38, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29());
              		
            }
            otherlv_39=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_39, grammarAccess.getGSSScenarioPeriodicTCLevel1Access().getSemicolonKeyword_30());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPeriodicTCLevel1"


    // $ANTLR start "entryRuleGSSScenarioPeriodicTCLevel0"
    // InternalENVIRONMENT.g:4993:1: entryRuleGSSScenarioPeriodicTCLevel0 returns [EObject current=null] : iv_ruleGSSScenarioPeriodicTCLevel0= ruleGSSScenarioPeriodicTCLevel0 EOF ;
    public final EObject entryRuleGSSScenarioPeriodicTCLevel0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPeriodicTCLevel0 = null;


        try {
            // InternalENVIRONMENT.g:4993:68: (iv_ruleGSSScenarioPeriodicTCLevel0= ruleGSSScenarioPeriodicTCLevel0 EOF )
            // InternalENVIRONMENT.g:4994:2: iv_ruleGSSScenarioPeriodicTCLevel0= ruleGSSScenarioPeriodicTCLevel0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPeriodicTCLevel0=ruleGSSScenarioPeriodicTCLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPeriodicTCLevel0; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPeriodicTCLevel0"


    // $ANTLR start "ruleGSSScenarioPeriodicTCLevel0"
    // InternalENVIRONMENT.g:5000:1: ruleGSSScenarioPeriodicTCLevel0 returns [EObject current=null] : (otherlv_0= 'GSSScenarioPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' ) ;
    public final EObject ruleGSSScenarioPeriodicTCLevel0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_12_0 = null;

        AntlrDatatypeRuleToken lv_period_value_16_0 = null;

        Enumerator lv_period_unit_20_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5006:2: ( (otherlv_0= 'GSSScenarioPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' ) )
            // InternalENVIRONMENT.g:5007:2: (otherlv_0= 'GSSScenarioPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' )
            {
            // InternalENVIRONMENT.g:5007:2: (otherlv_0= 'GSSScenarioPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' )
            // InternalENVIRONMENT.g:5008:3: otherlv_0= 'GSSScenarioPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';'
            {
            otherlv_0=(Token)match(input,99,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getGSSScenarioPeriodicTCLevel0Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5024:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:5025:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5025:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:5026:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5054:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5055:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5055:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5056:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5085:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5086:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5086:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5087:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5116:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5117:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5117:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5118:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:5147:3: ( (lv_period_unit_20_0= ruleGSSScenarioUnit ) )
            // InternalENVIRONMENT.g:5148:4: (lv_period_unit_20_0= ruleGSSScenarioUnit )
            {
            // InternalENVIRONMENT.g:5148:4: (lv_period_unit_20_0= ruleGSSScenarioUnit )
            // InternalENVIRONMENT.g:5149:5: lv_period_unit_20_0= ruleGSSScenarioUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getPeriod_unitGSSScenarioUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSScenarioUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:5170:3: (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==95) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalENVIRONMENT.g:5171:4: otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,95,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:5179:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:5180:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:5180:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:5181:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getLevel0GSSFormatFormatCrossReference_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,100,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalENVIRONMENT.g:5211:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:5212:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:5212:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:5213:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPeriodicTCLevel0Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getApp_to_level0GSSExportExportCrossReference_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_26());
              		
            }
            otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27());
              		
            }
            otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSScenarioPeriodicTCLevel0Access().getSemicolonKeyword_28());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPeriodicTCLevel0"


    // $ANTLR start "entryRuleGSSScenarioGlobalVar"
    // InternalENVIRONMENT.g:5246:1: entryRuleGSSScenarioGlobalVar returns [EObject current=null] : iv_ruleGSSScenarioGlobalVar= ruleGSSScenarioGlobalVar EOF ;
    public final EObject entryRuleGSSScenarioGlobalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGlobalVar = null;


        try {
            // InternalENVIRONMENT.g:5246:61: (iv_ruleGSSScenarioGlobalVar= ruleGSSScenarioGlobalVar EOF )
            // InternalENVIRONMENT.g:5247:2: iv_ruleGSSScenarioGlobalVar= ruleGSSScenarioGlobalVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGlobalVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGlobalVar=ruleGSSScenarioGlobalVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGlobalVar; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGlobalVar"


    // $ANTLR start "ruleGSSScenarioGlobalVar"
    // InternalENVIRONMENT.g:5253:1: ruleGSSScenarioGlobalVar returns [EObject current=null] : (otherlv_0= 'GSSScenarioGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSScenarioGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( (lv_reference_18_0= ruleGSSScenarioReference ) ) otherlv_19= '}' otherlv_20= ';' ) ;
    public final EObject ruleGSSScenarioGlobalVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        Enumerator lv_type_12_0 = null;

        AntlrDatatypeRuleToken lv_initial_value_16_0 = null;

        EObject lv_reference_18_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5259:2: ( (otherlv_0= 'GSSScenarioGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSScenarioGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( (lv_reference_18_0= ruleGSSScenarioReference ) ) otherlv_19= '}' otherlv_20= ';' ) )
            // InternalENVIRONMENT.g:5260:2: (otherlv_0= 'GSSScenarioGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSScenarioGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( (lv_reference_18_0= ruleGSSScenarioReference ) ) otherlv_19= '}' otherlv_20= ';' )
            {
            // InternalENVIRONMENT.g:5260:2: (otherlv_0= 'GSSScenarioGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSScenarioGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( (lv_reference_18_0= ruleGSSScenarioReference ) ) otherlv_19= '}' otherlv_20= ';' )
            // InternalENVIRONMENT.g:5261:3: otherlv_0= 'GSSScenarioGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSScenarioGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( (lv_reference_18_0= ruleGSSScenarioReference ) ) otherlv_19= '}' otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,101,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGlobalVarAccess().getGSSScenarioGlobalVarKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGlobalVarAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGlobalVarAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5277:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:5278:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5278:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:5279:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioGlobalVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGlobalVarAccess().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5307:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5308:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5308:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5309:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,102,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGlobalVarAccess().getTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5338:3: ( (lv_type_12_0= ruleGSSScenarioGlobalVarType ) )
            // InternalENVIRONMENT.g:5339:4: (lv_type_12_0= ruleGSSScenarioGlobalVarType )
            {
            // InternalENVIRONMENT.g:5339:4: (lv_type_12_0= ruleGSSScenarioGlobalVarType )
            // InternalENVIRONMENT.g:5340:5: lv_type_12_0= ruleGSSScenarioGlobalVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getTypeGSSScenarioGlobalVarTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_12_0=ruleGSSScenarioGlobalVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGlobalVarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,103,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGlobalVarAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5369:3: ( (lv_initial_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5370:4: (lv_initial_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5370:4: (lv_initial_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5371:5: lv_initial_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_initial_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
              					}
              					set(
              						current,
              						"initial_value",
              						lv_initial_value_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_17());
              		
            }
            // InternalENVIRONMENT.g:5392:3: ( (lv_reference_18_0= ruleGSSScenarioReference ) )
            // InternalENVIRONMENT.g:5393:4: (lv_reference_18_0= ruleGSSScenarioReference )
            {
            // InternalENVIRONMENT.g:5393:4: (lv_reference_18_0= ruleGSSScenarioReference )
            // InternalENVIRONMENT.g:5394:5: lv_reference_18_0= ruleGSSScenarioReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGlobalVarAccess().getReferenceGSSScenarioReferenceParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_reference_18_0=ruleGSSScenarioReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGlobalVarRule());
              					}
              					set(
              						current,
              						"reference",
              						lv_reference_18_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioGlobalVarAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getGSSScenarioGlobalVarAccess().getSemicolonKeyword_20());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGlobalVar"


    // $ANTLR start "entryRuleGSSScenarioReference"
    // InternalENVIRONMENT.g:5423:1: entryRuleGSSScenarioReference returns [EObject current=null] : iv_ruleGSSScenarioReference= ruleGSSScenarioReference EOF ;
    public final EObject entryRuleGSSScenarioReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioReference = null;


        try {
            // InternalENVIRONMENT.g:5423:61: (iv_ruleGSSScenarioReference= ruleGSSScenarioReference EOF )
            // InternalENVIRONMENT.g:5424:2: iv_ruleGSSScenarioReference= ruleGSSScenarioReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioReference=ruleGSSScenarioReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioReference"


    // $ANTLR start "ruleGSSScenarioReference"
    // InternalENVIRONMENT.g:5430:1: ruleGSSScenarioReference returns [EObject current=null] : (this_GSSScenarioReferenceField_0= ruleGSSScenarioReferenceField | this_GSSScenarioReferencePeriodicTC_1= ruleGSSScenarioReferencePeriodicTC | this_GSSScenarioReferenceSpecialPacket_2= ruleGSSScenarioReferenceSpecialPacket ) ;
    public final EObject ruleGSSScenarioReference() throws RecognitionException {
        EObject current = null;

        EObject this_GSSScenarioReferenceField_0 = null;

        EObject this_GSSScenarioReferencePeriodicTC_1 = null;

        EObject this_GSSScenarioReferenceSpecialPacket_2 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5436:2: ( (this_GSSScenarioReferenceField_0= ruleGSSScenarioReferenceField | this_GSSScenarioReferencePeriodicTC_1= ruleGSSScenarioReferencePeriodicTC | this_GSSScenarioReferenceSpecialPacket_2= ruleGSSScenarioReferenceSpecialPacket ) )
            // InternalENVIRONMENT.g:5437:2: (this_GSSScenarioReferenceField_0= ruleGSSScenarioReferenceField | this_GSSScenarioReferencePeriodicTC_1= ruleGSSScenarioReferencePeriodicTC | this_GSSScenarioReferenceSpecialPacket_2= ruleGSSScenarioReferenceSpecialPacket )
            {
            // InternalENVIRONMENT.g:5437:2: (this_GSSScenarioReferenceField_0= ruleGSSScenarioReferenceField | this_GSSScenarioReferencePeriodicTC_1= ruleGSSScenarioReferencePeriodicTC | this_GSSScenarioReferenceSpecialPacket_2= ruleGSSScenarioReferenceSpecialPacket )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt42=1;
                }
                break;
            case 107:
                {
                alt42=2;
                }
                break;
            case 109:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalENVIRONMENT.g:5438:3: this_GSSScenarioReferenceField_0= ruleGSSScenarioReferenceField
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioReferenceField_0=ruleGSSScenarioReferenceField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioReferenceField_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:5450:3: this_GSSScenarioReferencePeriodicTC_1= ruleGSSScenarioReferencePeriodicTC
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferencePeriodicTCParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioReferencePeriodicTC_1=ruleGSSScenarioReferencePeriodicTC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioReferencePeriodicTC_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:5462:3: this_GSSScenarioReferenceSpecialPacket_2= ruleGSSScenarioReferenceSpecialPacket
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioReferenceAccess().getGSSScenarioReferenceSpecialPacketParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioReferenceSpecialPacket_2=ruleGSSScenarioReferenceSpecialPacket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioReferenceSpecialPacket_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioReference"


    // $ANTLR start "entryRuleGSSScenarioReferenceField"
    // InternalENVIRONMENT.g:5477:1: entryRuleGSSScenarioReferenceField returns [EObject current=null] : iv_ruleGSSScenarioReferenceField= ruleGSSScenarioReferenceField EOF ;
    public final EObject entryRuleGSSScenarioReferenceField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioReferenceField = null;


        try {
            // InternalENVIRONMENT.g:5477:66: (iv_ruleGSSScenarioReferenceField= ruleGSSScenarioReferenceField EOF )
            // InternalENVIRONMENT.g:5478:2: iv_ruleGSSScenarioReferenceField= ruleGSSScenarioReferenceField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioReferenceField=ruleGSSScenarioReferenceField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioReferenceField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioReferenceField"


    // $ANTLR start "ruleGSSScenarioReferenceField"
    // InternalENVIRONMENT.g:5484:1: ruleGSSScenarioReferenceField returns [EObject current=null] : (otherlv_0= 'GSSScenarioReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSScenarioReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) ;
    public final EObject ruleGSSScenarioReferenceField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_8_0 = null;

        AntlrDatatypeRuleToken lv_level_12_0 = null;

        AntlrDatatypeRuleToken lv_fieldRef_16_0 = null;

        AntlrDatatypeRuleToken lv_offset_20_0 = null;

        AntlrDatatypeRuleToken lv_size_24_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5490:2: ( (otherlv_0= 'GSSScenarioReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSScenarioReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) )
            // InternalENVIRONMENT.g:5491:2: (otherlv_0= 'GSSScenarioReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSScenarioReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalENVIRONMENT.g:5491:2: (otherlv_0= 'GSSScenarioReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSScenarioReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            // InternalENVIRONMENT.g:5492:3: otherlv_0= 'GSSScenarioReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSScenarioReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,104,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioReferenceFieldAccess().getGSSScenarioReferenceFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioReferenceFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,102,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5508:3: ( (lv_type_4_0= ruleGSSScenarioReferenceFieldType ) )
            // InternalENVIRONMENT.g:5509:4: (lv_type_4_0= ruleGSSScenarioReferenceFieldType )
            {
            // InternalENVIRONMENT.g:5509:4: (lv_type_4_0= ruleGSSScenarioReferenceFieldType )
            // InternalENVIRONMENT.g:5510:5: lv_type_4_0= ruleGSSScenarioReferenceFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getTypeGSSScenarioReferenceFieldTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_4_0=ruleGSSScenarioReferenceFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioReferenceFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5539:3: ( (lv_ifRef_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5540:4: (lv_ifRef_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5540:4: (lv_ifRef_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5541:5: lv_ifRef_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5570:3: ( (lv_level_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5571:4: (lv_level_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5571:4: (lv_level_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5572:5: lv_level_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5601:3: ( (lv_fieldRef_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5602:4: (lv_fieldRef_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5602:4: (lv_fieldRef_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5603:5: lv_fieldRef_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
              					}
              					set(
              						current,
              						"fieldRef",
              						lv_fieldRef_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:5632:3: ( (lv_offset_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5633:4: (lv_offset_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5633:4: (lv_offset_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5634:5: lv_offset_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioReferenceFieldAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalENVIRONMENT.g:5663:3: ( (lv_size_24_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5664:4: (lv_size_24_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5664:4: (lv_size_24_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5665:5: lv_size_24_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_24_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_24_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_25());
              		
            }
            otherlv_26=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSScenarioReferenceFieldAccess().getRightCurlyBracketKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSScenarioReferenceFieldAccess().getSemicolonKeyword_27());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioReferenceField"


    // $ANTLR start "entryRuleGSSScenarioReferencePeriodicTC"
    // InternalENVIRONMENT.g:5698:1: entryRuleGSSScenarioReferencePeriodicTC returns [EObject current=null] : iv_ruleGSSScenarioReferencePeriodicTC= ruleGSSScenarioReferencePeriodicTC EOF ;
    public final EObject entryRuleGSSScenarioReferencePeriodicTC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioReferencePeriodicTC = null;


        try {
            // InternalENVIRONMENT.g:5698:71: (iv_ruleGSSScenarioReferencePeriodicTC= ruleGSSScenarioReferencePeriodicTC EOF )
            // InternalENVIRONMENT.g:5699:2: iv_ruleGSSScenarioReferencePeriodicTC= ruleGSSScenarioReferencePeriodicTC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioReferencePeriodicTC=ruleGSSScenarioReferencePeriodicTC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioReferencePeriodicTC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioReferencePeriodicTC"


    // $ANTLR start "ruleGSSScenarioReferencePeriodicTC"
    // InternalENVIRONMENT.g:5705:1: ruleGSSScenarioReferencePeriodicTC returns [EObject current=null] : (otherlv_0= 'GSSScenarioReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSScenarioReferencePeriodicTC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_level_8_0 = null;

        AntlrDatatypeRuleToken lv_fieldRef_12_0 = null;

        AntlrDatatypeRuleToken lv_offset_16_0 = null;

        AntlrDatatypeRuleToken lv_size_20_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5711:2: ( (otherlv_0= 'GSSScenarioReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalENVIRONMENT.g:5712:2: (otherlv_0= 'GSSScenarioReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalENVIRONMENT.g:5712:2: (otherlv_0= 'GSSScenarioReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalENVIRONMENT.g:5713:3: otherlv_0= 'GSSScenarioReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,107,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getGSSScenarioReferencePeriodicTCKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5729:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:5730:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5730:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:5731:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getIdRefGSSScenarioPeriodicTCCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5757:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5758:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5758:4: (lv_level_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5759:5: lv_level_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5788:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5789:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5789:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5790:5: lv_fieldRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"fieldRef",
              						lv_fieldRef_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5819:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5820:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5820:4: (lv_offset_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5821:5: lv_offset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:5850:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5851:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5851:4: (lv_size_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5852:5: lv_size_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioReferencePeriodicTCAccess().getSemicolonKeyword_23());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioReferencePeriodicTC"


    // $ANTLR start "entryRuleGSSScenarioReferenceSpecialPacket"
    // InternalENVIRONMENT.g:5885:1: entryRuleGSSScenarioReferenceSpecialPacket returns [EObject current=null] : iv_ruleGSSScenarioReferenceSpecialPacket= ruleGSSScenarioReferenceSpecialPacket EOF ;
    public final EObject entryRuleGSSScenarioReferenceSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioReferenceSpecialPacket = null;


        try {
            // InternalENVIRONMENT.g:5885:74: (iv_ruleGSSScenarioReferenceSpecialPacket= ruleGSSScenarioReferenceSpecialPacket EOF )
            // InternalENVIRONMENT.g:5886:2: iv_ruleGSSScenarioReferenceSpecialPacket= ruleGSSScenarioReferenceSpecialPacket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioReferenceSpecialPacket=ruleGSSScenarioReferenceSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioReferenceSpecialPacket; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioReferenceSpecialPacket"


    // $ANTLR start "ruleGSSScenarioReferenceSpecialPacket"
    // InternalENVIRONMENT.g:5892:1: ruleGSSScenarioReferenceSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSScenarioReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSScenarioReferenceSpecialPacket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_level_8_0 = null;

        AntlrDatatypeRuleToken lv_fieldRef_12_0 = null;

        AntlrDatatypeRuleToken lv_offset_16_0 = null;

        AntlrDatatypeRuleToken lv_size_20_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5898:2: ( (otherlv_0= 'GSSScenarioReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalENVIRONMENT.g:5899:2: (otherlv_0= 'GSSScenarioReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalENVIRONMENT.g:5899:2: (otherlv_0= 'GSSScenarioReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalENVIRONMENT.g:5900:3: otherlv_0= 'GSSScenarioReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,109,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getGSSScenarioReferenceSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5916:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:5917:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5917:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:5918:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getIdRefGSSScenarioSpecialPacketCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5944:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5945:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5945:4: (lv_level_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5946:5: lv_level_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5975:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5976:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5976:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5977:5: lv_fieldRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"fieldRef",
              						lv_fieldRef_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:6006:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:6007:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:6007:4: (lv_offset_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:6008:5: lv_offset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:6037:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:6038:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:6038:4: (lv_size_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:6039:5: lv_size_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSScenarioReferenceSpecialPacketAccess().getSemicolonKeyword_23());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioReferenceSpecialPacket"


    // $ANTLR start "entryRuleGSSScenarioMonitor"
    // InternalENVIRONMENT.g:6072:1: entryRuleGSSScenarioMonitor returns [EObject current=null] : iv_ruleGSSScenarioMonitor= ruleGSSScenarioMonitor EOF ;
    public final EObject entryRuleGSSScenarioMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioMonitor = null;


        try {
            // InternalENVIRONMENT.g:6072:59: (iv_ruleGSSScenarioMonitor= ruleGSSScenarioMonitor EOF )
            // InternalENVIRONMENT.g:6073:2: iv_ruleGSSScenarioMonitor= ruleGSSScenarioMonitor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioMonitorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioMonitor=ruleGSSScenarioMonitor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioMonitor; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioMonitor"


    // $ANTLR start "ruleGSSScenarioMonitor"
    // InternalENVIRONMENT.g:6079:1: ruleGSSScenarioMonitor returns [EObject current=null] : (this_GSSScenarioPlot_0= ruleGSSScenarioPlot | this_GSSScenarioAlarmMsg_1= ruleGSSScenarioAlarmMsg | this_GSSScenarioModify_2= ruleGSSScenarioModify | this_GSSScenarioAlarmVal_3= ruleGSSScenarioAlarmVal ) ;
    public final EObject ruleGSSScenarioMonitor() throws RecognitionException {
        EObject current = null;

        EObject this_GSSScenarioPlot_0 = null;

        EObject this_GSSScenarioAlarmMsg_1 = null;

        EObject this_GSSScenarioModify_2 = null;

        EObject this_GSSScenarioAlarmVal_3 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6085:2: ( (this_GSSScenarioPlot_0= ruleGSSScenarioPlot | this_GSSScenarioAlarmMsg_1= ruleGSSScenarioAlarmMsg | this_GSSScenarioModify_2= ruleGSSScenarioModify | this_GSSScenarioAlarmVal_3= ruleGSSScenarioAlarmVal ) )
            // InternalENVIRONMENT.g:6086:2: (this_GSSScenarioPlot_0= ruleGSSScenarioPlot | this_GSSScenarioAlarmMsg_1= ruleGSSScenarioAlarmMsg | this_GSSScenarioModify_2= ruleGSSScenarioModify | this_GSSScenarioAlarmVal_3= ruleGSSScenarioAlarmVal )
            {
            // InternalENVIRONMENT.g:6086:2: (this_GSSScenarioPlot_0= ruleGSSScenarioPlot | this_GSSScenarioAlarmMsg_1= ruleGSSScenarioAlarmMsg | this_GSSScenarioModify_2= ruleGSSScenarioModify | this_GSSScenarioAlarmVal_3= ruleGSSScenarioAlarmVal )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt43=1;
                }
                break;
            case 112:
                {
                alt43=2;
                }
                break;
            case 114:
                {
                alt43=3;
                }
                break;
            case 116:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalENVIRONMENT.g:6087:3: this_GSSScenarioPlot_0= ruleGSSScenarioPlot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioPlotParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioPlot_0=ruleGSSScenarioPlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioPlot_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6099:3: this_GSSScenarioAlarmMsg_1= ruleGSSScenarioAlarmMsg
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmMsgParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioAlarmMsg_1=ruleGSSScenarioAlarmMsg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioAlarmMsg_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:6111:3: this_GSSScenarioModify_2= ruleGSSScenarioModify
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioModifyParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioModify_2=ruleGSSScenarioModify();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioModify_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalENVIRONMENT.g:6123:3: this_GSSScenarioAlarmVal_3= ruleGSSScenarioAlarmVal
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioMonitorAccess().getGSSScenarioAlarmValParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioAlarmVal_3=ruleGSSScenarioAlarmVal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioAlarmVal_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioMonitor"


    // $ANTLR start "entryRuleGSSScenarioPlot"
    // InternalENVIRONMENT.g:6138:1: entryRuleGSSScenarioPlot returns [EObject current=null] : iv_ruleGSSScenarioPlot= ruleGSSScenarioPlot EOF ;
    public final EObject entryRuleGSSScenarioPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioPlot = null;


        try {
            // InternalENVIRONMENT.g:6138:56: (iv_ruleGSSScenarioPlot= ruleGSSScenarioPlot EOF )
            // InternalENVIRONMENT.g:6139:2: iv_ruleGSSScenarioPlot= ruleGSSScenarioPlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioPlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioPlot=ruleGSSScenarioPlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioPlot; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioPlot"


    // $ANTLR start "ruleGSSScenarioPlot"
    // InternalENVIRONMENT.g:6145:1: ruleGSSScenarioPlot returns [EObject current=null] : (otherlv_0= 'GSSScenarioPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSScenarioPlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_GVRef_10_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6151:2: ( (otherlv_0= 'GSSScenarioPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' ) )
            // InternalENVIRONMENT.g:6152:2: (otherlv_0= 'GSSScenarioPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalENVIRONMENT.g:6152:2: (otherlv_0= 'GSSScenarioPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' )
            // InternalENVIRONMENT.g:6153:3: otherlv_0= 'GSSScenarioPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,110,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioPlotAccess().getGSSScenarioPlotKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioPlotAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioPlotAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6169:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6170:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6170:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:6171:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioPlotAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPlotRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,111,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioPlotAccess().getChartRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioPlotAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6199:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalENVIRONMENT.g:6200:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalENVIRONMENT.g:6200:4: ( ruleVersionedQualifiedReferenceName )
            // InternalENVIRONMENT.g:6201:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioPlotRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPlotAccess().getChartRefGSSChartsChartCrossReference_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_9());
              		
            }
            // InternalENVIRONMENT.g:6222:3: ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) )
            // InternalENVIRONMENT.g:6223:4: (lv_GVRef_10_0= ruleGSSScenarioGVRef )
            {
            // InternalENVIRONMENT.g:6223:4: (lv_GVRef_10_0= ruleGSSScenarioGVRef )
            // InternalENVIRONMENT.g:6224:5: lv_GVRef_10_0= ruleGSSScenarioGVRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioPlotAccess().getGVRefGSSScenarioGVRefParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_GVRef_10_0=ruleGSSScenarioGVRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioPlotRule());
              					}
              					set(
              						current,
              						"GVRef",
              						lv_GVRef_10_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioPlotAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSScenarioPlotAccess().getSemicolonKeyword_12());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioPlot"


    // $ANTLR start "entryRuleGSSScenarioAlarmMsg"
    // InternalENVIRONMENT.g:6253:1: entryRuleGSSScenarioAlarmMsg returns [EObject current=null] : iv_ruleGSSScenarioAlarmMsg= ruleGSSScenarioAlarmMsg EOF ;
    public final EObject entryRuleGSSScenarioAlarmMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioAlarmMsg = null;


        try {
            // InternalENVIRONMENT.g:6253:60: (iv_ruleGSSScenarioAlarmMsg= ruleGSSScenarioAlarmMsg EOF )
            // InternalENVIRONMENT.g:6254:2: iv_ruleGSSScenarioAlarmMsg= ruleGSSScenarioAlarmMsg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioAlarmMsgRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioAlarmMsg=ruleGSSScenarioAlarmMsg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioAlarmMsg; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioAlarmMsg"


    // $ANTLR start "ruleGSSScenarioAlarmMsg"
    // InternalENVIRONMENT.g:6260:1: ruleGSSScenarioAlarmMsg returns [EObject current=null] : (otherlv_0= 'GSSScenarioAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleGSSScenarioAlarmMsg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_text_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_type_8_0 = null;

        EObject lv_GVRef_14_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6266:2: ( (otherlv_0= 'GSSScenarioAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' ) )
            // InternalENVIRONMENT.g:6267:2: (otherlv_0= 'GSSScenarioAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalENVIRONMENT.g:6267:2: (otherlv_0= 'GSSScenarioAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' )
            // InternalENVIRONMENT.g:6268:3: otherlv_0= 'GSSScenarioAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,112,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioAlarmMsgAccess().getGSSScenarioAlarmMsgKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioAlarmMsgAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioAlarmMsgAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6284:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6285:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6285:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:6286:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioAlarmMsgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,102,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6314:3: ( (lv_type_8_0= ruleGSSScenarioAlarmMsgType ) )
            // InternalENVIRONMENT.g:6315:4: (lv_type_8_0= ruleGSSScenarioAlarmMsgType )
            {
            // InternalENVIRONMENT.g:6315:4: (lv_type_8_0= ruleGSSScenarioAlarmMsgType )
            // InternalENVIRONMENT.g:6316:5: lv_type_8_0= ruleGSSScenarioAlarmMsgType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioAlarmMsgAccess().getTypeGSSScenarioAlarmMsgTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSScenarioAlarmMsgType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmMsgRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioAlarmMsgType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,113,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioAlarmMsgAccess().getTextKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioAlarmMsgAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:6345:3: ( (lv_text_12_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6346:4: (lv_text_12_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6346:4: (lv_text_12_0= RULE_STRING )
            // InternalENVIRONMENT.g:6347:5: lv_text_12_0= RULE_STRING
            {
            lv_text_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_12_0, grammarAccess.getGSSScenarioAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioAlarmMsgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:6367:3: ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) )
            // InternalENVIRONMENT.g:6368:4: (lv_GVRef_14_0= ruleGSSScenarioGVRef )
            {
            // InternalENVIRONMENT.g:6368:4: (lv_GVRef_14_0= ruleGSSScenarioGVRef )
            // InternalENVIRONMENT.g:6369:5: lv_GVRef_14_0= ruleGSSScenarioGVRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioAlarmMsgAccess().getGVRefGSSScenarioGVRefParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_GVRef_14_0=ruleGSSScenarioGVRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmMsgRule());
              					}
              					set(
              						current,
              						"GVRef",
              						lv_GVRef_14_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioAlarmMsgAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSScenarioAlarmMsgAccess().getSemicolonKeyword_16());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioAlarmMsg"


    // $ANTLR start "entryRuleGSSScenarioModify"
    // InternalENVIRONMENT.g:6398:1: entryRuleGSSScenarioModify returns [EObject current=null] : iv_ruleGSSScenarioModify= ruleGSSScenarioModify EOF ;
    public final EObject entryRuleGSSScenarioModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioModify = null;


        try {
            // InternalENVIRONMENT.g:6398:58: (iv_ruleGSSScenarioModify= ruleGSSScenarioModify EOF )
            // InternalENVIRONMENT.g:6399:2: iv_ruleGSSScenarioModify= ruleGSSScenarioModify EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioModifyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioModify=ruleGSSScenarioModify();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioModify; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioModify"


    // $ANTLR start "ruleGSSScenarioModify"
    // InternalENVIRONMENT.g:6405:1: ruleGSSScenarioModify returns [EObject current=null] : (otherlv_0= 'GSSScenarioModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleGSSScenarioModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;

        EObject lv_GVRef_14_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6411:2: ( (otherlv_0= 'GSSScenarioModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' ) )
            // InternalENVIRONMENT.g:6412:2: (otherlv_0= 'GSSScenarioModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalENVIRONMENT.g:6412:2: (otherlv_0= 'GSSScenarioModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';' )
            // InternalENVIRONMENT.g:6413:3: otherlv_0= 'GSSScenarioModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) ) otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,114,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioModifyAccess().getGSSScenarioModifyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioModifyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioModifyAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6429:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6430:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6430:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:6431:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioModifyAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioModifyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,102,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioModifyAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6459:3: ( (lv_type_8_0= ruleGSSScenarioModifyType ) )
            // InternalENVIRONMENT.g:6460:4: (lv_type_8_0= ruleGSSScenarioModifyType )
            {
            // InternalENVIRONMENT.g:6460:4: (lv_type_8_0= ruleGSSScenarioModifyType )
            // InternalENVIRONMENT.g:6461:5: lv_type_8_0= ruleGSSScenarioModifyType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioModifyAccess().getTypeGSSScenarioModifyTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSScenarioModifyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioModifyRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioModifyType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,115,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioModifyAccess().getValueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioModifyAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:6490:3: ( (lv_value_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:6491:4: (lv_value_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:6491:4: (lv_value_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:6492:5: lv_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioModifyAccess().getValueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioModifyRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:6513:3: ( (lv_GVRef_14_0= ruleGSSScenarioGVRef ) )
            // InternalENVIRONMENT.g:6514:4: (lv_GVRef_14_0= ruleGSSScenarioGVRef )
            {
            // InternalENVIRONMENT.g:6514:4: (lv_GVRef_14_0= ruleGSSScenarioGVRef )
            // InternalENVIRONMENT.g:6515:5: lv_GVRef_14_0= ruleGSSScenarioGVRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioModifyAccess().getGVRefGSSScenarioGVRefParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_GVRef_14_0=ruleGSSScenarioGVRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioModifyRule());
              					}
              					set(
              						current,
              						"GVRef",
              						lv_GVRef_14_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioModifyAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSScenarioModifyAccess().getSemicolonKeyword_16());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioModify"


    // $ANTLR start "entryRuleGSSScenarioAlarmVal"
    // InternalENVIRONMENT.g:6544:1: entryRuleGSSScenarioAlarmVal returns [EObject current=null] : iv_ruleGSSScenarioAlarmVal= ruleGSSScenarioAlarmVal EOF ;
    public final EObject entryRuleGSSScenarioAlarmVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioAlarmVal = null;


        try {
            // InternalENVIRONMENT.g:6544:60: (iv_ruleGSSScenarioAlarmVal= ruleGSSScenarioAlarmVal EOF )
            // InternalENVIRONMENT.g:6545:2: iv_ruleGSSScenarioAlarmVal= ruleGSSScenarioAlarmVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioAlarmValRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioAlarmVal=ruleGSSScenarioAlarmVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioAlarmVal; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioAlarmVal"


    // $ANTLR start "ruleGSSScenarioAlarmVal"
    // InternalENVIRONMENT.g:6551:1: ruleGSSScenarioAlarmVal returns [EObject current=null] : (otherlv_0= 'GSSScenarioAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmValType ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSScenarioAlarmVal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_type_8_0 = null;

        EObject lv_GVRef_10_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6557:2: ( (otherlv_0= 'GSSScenarioAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmValType ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' ) )
            // InternalENVIRONMENT.g:6558:2: (otherlv_0= 'GSSScenarioAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmValType ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalENVIRONMENT.g:6558:2: (otherlv_0= 'GSSScenarioAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmValType ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';' )
            // InternalENVIRONMENT.g:6559:3: otherlv_0= 'GSSScenarioAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSScenarioAlarmValType ) ) otherlv_9= ';' ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) ) otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,116,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioAlarmValAccess().getGSSScenarioAlarmValKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioAlarmValAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioAlarmValAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6575:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6576:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6576:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:6577:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSScenarioAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioAlarmValRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,102,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioAlarmValAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioAlarmValAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6605:3: ( (lv_type_8_0= ruleGSSScenarioAlarmValType ) )
            // InternalENVIRONMENT.g:6606:4: (lv_type_8_0= ruleGSSScenarioAlarmValType )
            {
            // InternalENVIRONMENT.g:6606:4: (lv_type_8_0= ruleGSSScenarioAlarmValType )
            // InternalENVIRONMENT.g:6607:5: lv_type_8_0= ruleGSSScenarioAlarmValType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioAlarmValAccess().getTypeGSSScenarioAlarmValTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSScenarioAlarmValType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmValRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioAlarmValType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_9());
              		
            }
            // InternalENVIRONMENT.g:6628:3: ( (lv_GVRef_10_0= ruleGSSScenarioGVRef ) )
            // InternalENVIRONMENT.g:6629:4: (lv_GVRef_10_0= ruleGSSScenarioGVRef )
            {
            // InternalENVIRONMENT.g:6629:4: (lv_GVRef_10_0= ruleGSSScenarioGVRef )
            // InternalENVIRONMENT.g:6630:5: lv_GVRef_10_0= ruleGSSScenarioGVRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioAlarmValAccess().getGVRefGSSScenarioGVRefParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_GVRef_10_0=ruleGSSScenarioGVRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioAlarmValRule());
              					}
              					set(
              						current,
              						"GVRef",
              						lv_GVRef_10_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioGVRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioAlarmValAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSScenarioAlarmValAccess().getSemicolonKeyword_12());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioAlarmVal"


    // $ANTLR start "entryRuleGSSScenarioGVRef"
    // InternalENVIRONMENT.g:6659:1: entryRuleGSSScenarioGVRef returns [EObject current=null] : iv_ruleGSSScenarioGVRef= ruleGSSScenarioGVRef EOF ;
    public final EObject entryRuleGSSScenarioGVRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGVRef = null;


        try {
            // InternalENVIRONMENT.g:6659:57: (iv_ruleGSSScenarioGVRef= ruleGSSScenarioGVRef EOF )
            // InternalENVIRONMENT.g:6660:2: iv_ruleGSSScenarioGVRef= ruleGSSScenarioGVRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGVRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGVRef=ruleGSSScenarioGVRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGVRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGVRef"


    // $ANTLR start "ruleGSSScenarioGVRef"
    // InternalENVIRONMENT.g:6666:1: ruleGSSScenarioGVRef returns [EObject current=null] : (this_GSSScenarioGVFiltered_0= ruleGSSScenarioGVFiltered | this_GSSScenarioGVPeriodic_1= ruleGSSScenarioGVPeriodic ) ;
    public final EObject ruleGSSScenarioGVRef() throws RecognitionException {
        EObject current = null;

        EObject this_GSSScenarioGVFiltered_0 = null;

        EObject this_GSSScenarioGVPeriodic_1 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6672:2: ( (this_GSSScenarioGVFiltered_0= ruleGSSScenarioGVFiltered | this_GSSScenarioGVPeriodic_1= ruleGSSScenarioGVPeriodic ) )
            // InternalENVIRONMENT.g:6673:2: (this_GSSScenarioGVFiltered_0= ruleGSSScenarioGVFiltered | this_GSSScenarioGVPeriodic_1= ruleGSSScenarioGVPeriodic )
            {
            // InternalENVIRONMENT.g:6673:2: (this_GSSScenarioGVFiltered_0= ruleGSSScenarioGVFiltered | this_GSSScenarioGVPeriodic_1= ruleGSSScenarioGVPeriodic )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==117) ) {
                alt44=1;
            }
            else if ( (LA44_0==120) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalENVIRONMENT.g:6674:3: this_GSSScenarioGVFiltered_0= ruleGSSScenarioGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioGVRefAccess().getGSSScenarioGVFilteredParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioGVFiltered_0=ruleGSSScenarioGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioGVFiltered_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6686:3: this_GSSScenarioGVPeriodic_1= ruleGSSScenarioGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSScenarioGVRefAccess().getGSSScenarioGVPeriodicParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSScenarioGVPeriodic_1=ruleGSSScenarioGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSScenarioGVPeriodic_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGVRef"


    // $ANTLR start "entryRuleGSSScenarioGVFiltered"
    // InternalENVIRONMENT.g:6701:1: entryRuleGSSScenarioGVFiltered returns [EObject current=null] : iv_ruleGSSScenarioGVFiltered= ruleGSSScenarioGVFiltered EOF ;
    public final EObject entryRuleGSSScenarioGVFiltered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGVFiltered = null;


        try {
            // InternalENVIRONMENT.g:6701:62: (iv_ruleGSSScenarioGVFiltered= ruleGSSScenarioGVFiltered EOF )
            // InternalENVIRONMENT.g:6702:2: iv_ruleGSSScenarioGVFiltered= ruleGSSScenarioGVFiltered EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGVFilteredRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGVFiltered=ruleGSSScenarioGVFiltered();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGVFiltered; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGVFiltered"


    // $ANTLR start "ruleGSSScenarioGVFiltered"
    // InternalENVIRONMENT.g:6708:1: ruleGSSScenarioGVFiltered returns [EObject current=null] : (otherlv_0= 'GSSScenarioGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSScenarioGVFiltered() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:6714:2: ( (otherlv_0= 'GSSScenarioGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) )
            // InternalENVIRONMENT.g:6715:2: (otherlv_0= 'GSSScenarioGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalENVIRONMENT.g:6715:2: (otherlv_0= 'GSSScenarioGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            // InternalENVIRONMENT.g:6716:3: otherlv_0= 'GSSScenarioGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,117,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGVFilteredAccess().getGSSScenarioGVFilteredKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGVFilteredAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,118,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6732:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:6733:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6733:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:6734:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioGVFilteredRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioGVFilteredAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:6752:3: (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==119) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalENVIRONMENT.g:6753:4: otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,119,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGVFilteredAccess().getFilterKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGVFilteredAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalENVIRONMENT.g:6761:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:6762:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:6762:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:6763:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSScenarioGVFilteredRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSScenarioGVFilteredAccess().getFilterGSSFilterFilterCrossReference_6_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGVFilteredAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGVFilteredAccess().getSemicolonKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGVFiltered"


    // $ANTLR start "entryRuleGSSScenarioGVPeriodic"
    // InternalENVIRONMENT.g:6797:1: entryRuleGSSScenarioGVPeriodic returns [EObject current=null] : iv_ruleGSSScenarioGVPeriodic= ruleGSSScenarioGVPeriodic EOF ;
    public final EObject entryRuleGSSScenarioGVPeriodic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSScenarioGVPeriodic = null;


        try {
            // InternalENVIRONMENT.g:6797:62: (iv_ruleGSSScenarioGVPeriodic= ruleGSSScenarioGVPeriodic EOF )
            // InternalENVIRONMENT.g:6798:2: iv_ruleGSSScenarioGVPeriodic= ruleGSSScenarioGVPeriodic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSScenarioGVPeriodicRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSScenarioGVPeriodic=ruleGSSScenarioGVPeriodic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSScenarioGVPeriodic; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGSSScenarioGVPeriodic"


    // $ANTLR start "ruleGSSScenarioGVPeriodic"
    // InternalENVIRONMENT.g:6804:1: ruleGSSScenarioGVPeriodic returns [EObject current=null] : (otherlv_0= 'GSSScenarioGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSScenarioUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSScenarioGVPeriodic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_period_value_8_0 = null;

        Enumerator lv_period_unit_12_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6810:2: ( (otherlv_0= 'GSSScenarioGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSScenarioUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalENVIRONMENT.g:6811:2: (otherlv_0= 'GSSScenarioGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSScenarioUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalENVIRONMENT.g:6811:2: (otherlv_0= 'GSSScenarioGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSScenarioUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalENVIRONMENT.g:6812:3: otherlv_0= 'GSSScenarioGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSScenarioUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,120,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSScenarioGVPeriodicAccess().getGSSScenarioGVPeriodicKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSScenarioGVPeriodicAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,118,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6828:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:6829:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6829:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:6830:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSScenarioGVPeriodicRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSScenarioGVPeriodicAccess().getGlobalVarRefGSSScenarioGlobalVarCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6856:3: ( (lv_period_value_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:6857:4: (lv_period_value_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:6857:4: (lv_period_value_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:6858:5: lv_period_value_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGVPeriodicRule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSScenarioGVPeriodicAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:6887:3: ( (lv_period_unit_12_0= ruleGSSScenarioUnit ) )
            // InternalENVIRONMENT.g:6888:4: (lv_period_unit_12_0= ruleGSSScenarioUnit )
            {
            // InternalENVIRONMENT.g:6888:4: (lv_period_unit_12_0= ruleGSSScenarioUnit )
            // InternalENVIRONMENT.g:6889:5: lv_period_unit_12_0= ruleGSSScenarioUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSScenarioGVPeriodicAccess().getPeriod_unitGSSScenarioUnitEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_12_0=ruleGSSScenarioUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSScenarioGVPeriodicRule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSScenarioUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSScenarioGVPeriodicAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSScenarioGVPeriodicAccess().getSemicolonKeyword_15());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGVPeriodic"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalENVIRONMENT.g:6922:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalENVIRONMENT.g:6922:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalENVIRONMENT.g:6923:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalENVIRONMENT.g:6929:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:6935:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalENVIRONMENT.g:6936:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalENVIRONMENT.g:6936:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalENVIRONMENT.g:6937:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalENVIRONMENT.g:6944:3: (kw= '.' this_ID_2= RULE_ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==121) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalENVIRONMENT.g:6945:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,121,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_123); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalENVIRONMENT.g:6962:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalENVIRONMENT.g:6962:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalENVIRONMENT.g:6963:2: iv_ruleVersion= ruleVersion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalENVIRONMENT.g:6969:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
    public final AntlrDatatypeRuleToken ruleVersion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT_1=null;
        Token this_ID_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_INT_5=null;
        Token this_ID_6=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:6975:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalENVIRONMENT.g:6976:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalENVIRONMENT.g:6976:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalENVIRONMENT.g:6977:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalENVIRONMENT.g:6977:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==EOF||LA48_1==14||LA48_1==121||LA48_1==123) ) {
                    alt48=1;
                }
                else if ( (LA48_1==RULE_ID) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA48_0==RULE_ID) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalENVIRONMENT.g:6978:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6986:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalENVIRONMENT.g:6986:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalENVIRONMENT.g:6987:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalENVIRONMENT.g:6987:5: (this_INT_1= RULE_INT )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_INT) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalENVIRONMENT.g:6988:6: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_1);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
                              					
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_123); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					current.merge(this_ID_2);
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ID_2, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0_1_1());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalENVIRONMENT.g:7005:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==121) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalENVIRONMENT.g:7006:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,121,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalENVIRONMENT.g:7011:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( (LA50_0==RULE_INT) ) {
            	        int LA50_1 = input.LA(2);

            	        if ( (LA50_1==EOF||LA50_1==14||LA50_1==121||LA50_1==123) ) {
            	            alt50=1;
            	        }
            	        else if ( (LA50_1==RULE_ID) ) {
            	            alt50=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 50, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA50_0==RULE_ID) ) {
            	        alt50=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // InternalENVIRONMENT.g:7012:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_123); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalENVIRONMENT.g:7020:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalENVIRONMENT.g:7020:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalENVIRONMENT.g:7021:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalENVIRONMENT.g:7021:6: (this_INT_5= RULE_INT )?
            	            int alt49=2;
            	            int LA49_0 = input.LA(1);

            	            if ( (LA49_0==RULE_INT) ) {
            	                alt49=1;
            	            }
            	            switch (alt49) {
            	                case 1 :
            	                    // InternalENVIRONMENT.g:7022:7: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							current.merge(this_INT_5);
            	                      						
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
            	                      						
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_123); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						current.merge(this_ID_6);
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_ID_6, grammarAccess.getVersionAccess().getIDTerminalRuleCall_1_1_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleVersionedQualifiedName"
    // InternalENVIRONMENT.g:7044:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalENVIRONMENT.g:7044:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalENVIRONMENT.g:7045:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersionedQualifiedName=ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVersionedQualifiedName"


    // $ANTLR start "ruleVersionedQualifiedName"
    // InternalENVIRONMENT.g:7051:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:7057:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalENVIRONMENT.g:7058:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalENVIRONMENT.g:7058:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalENVIRONMENT.g:7059:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_124);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,122,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_125);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,123,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVersionedQualifiedName"


    // $ANTLR start "entryRuleVersionedQualifiedReferenceName"
    // InternalENVIRONMENT.g:7093:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalENVIRONMENT.g:7093:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalENVIRONMENT.g:7094:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleVersionedQualifiedReferenceName=ruleVersionedQualifiedReferenceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionedQualifiedReferenceName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVersionedQualifiedReferenceName"


    // $ANTLR start "ruleVersionedQualifiedReferenceName"
    // InternalENVIRONMENT.g:7100:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:7106:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalENVIRONMENT.g:7107:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalENVIRONMENT.g:7107:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalENVIRONMENT.g:7108:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalENVIRONMENT.g:7108:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( ((LA52_1>=121 && LA52_1<=122)) ) {
                    alt52=1;
                }
            }
            switch (alt52) {
                case 1 :
                    // InternalENVIRONMENT.g:7109:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_126);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_VersionedQualifiedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,124,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalENVIRONMENT.g:7132:3: (kw= '::' this_ID_4= RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==124) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalENVIRONMENT.g:7133:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,124,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_127); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVersionedQualifiedReferenceName"


    // $ANTLR start "entryRuleINTEGER"
    // InternalENVIRONMENT.g:7150:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalENVIRONMENT.g:7150:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalENVIRONMENT.g:7151:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleINTEGER"


    // $ANTLR start "ruleINTEGER"
    // InternalENVIRONMENT.g:7157:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7163:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalENVIRONMENT.g:7164:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalENVIRONMENT.g:7164:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT||LA55_0==125) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_HEXADECIMAL) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalENVIRONMENT.g:7165:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalENVIRONMENT.g:7165:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalENVIRONMENT.g:7166:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalENVIRONMENT.g:7166:4: (kw= '-' )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==125) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalENVIRONMENT.g:7167:5: kw= '-'
                            {
                            kw=(Token)match(input,125,FollowSets000.FOLLOW_37); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getINTEGERAccess().getINTTerminalRuleCall_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7182:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
                    {
                    this_HEXADECIMAL_2=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HEXADECIMAL_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HEXADECIMAL_2, grammarAccess.getINTEGERAccess().getHEXADECIMALTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleINTEGER"


    // $ANTLR start "entryRuleDATE"
    // InternalENVIRONMENT.g:7193:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalENVIRONMENT.g:7193:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalENVIRONMENT.g:7194:2: iv_ruleDATE= ruleDATE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDATERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDATE=ruleDATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDATE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDATE"


    // $ANTLR start "ruleDATE"
    // InternalENVIRONMENT.g:7200:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7206:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalENVIRONMENT.g:7207:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalENVIRONMENT.g:7207:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalENVIRONMENT.g:7208:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,126,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
              		
            }
            kw=(Token)match(input,126,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_3());
              		
            }
            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_4);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_4, grammarAccess.getDATEAccess().getINTTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDATE"


    // $ANTLR start "entryRuleURL"
    // InternalENVIRONMENT.g:7243:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalENVIRONMENT.g:7243:43: (iv_ruleURL= ruleURL EOF )
            // InternalENVIRONMENT.g:7244:2: iv_ruleURL= ruleURL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getURLRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleURL=ruleURL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleURL.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleURL"


    // $ANTLR start "ruleURL"
    // InternalENVIRONMENT.g:7250:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7256:2: ( (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) )
            // InternalENVIRONMENT.g:7257:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            {
            // InternalENVIRONMENT.g:7257:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            // InternalENVIRONMENT.g:7258:3: this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getURLAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalENVIRONMENT.g:7265:3: (kw= '+' this_ID_2= RULE_ID )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==127) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalENVIRONMENT.g:7266:4: kw= '+' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,127,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getURLAccess().getPlusSignKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getURLAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,128,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:7284:3: (this_ID_4= RULE_ID (kw= '.' )? )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalENVIRONMENT.g:7285:4: this_ID_4= RULE_ID (kw= '.' )?
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_131); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getURLAccess().getIDTerminalRuleCall_3_0());
            	      			
            	    }
            	    // InternalENVIRONMENT.g:7292:4: (kw= '.' )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==121) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalENVIRONMENT.g:7293:5: kw= '.'
            	            {
            	            kw=(Token)match(input,121,FollowSets000.FOLLOW_132); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(kw);
            	              					newLeafNode(kw, grammarAccess.getURLAccess().getFullStopKeyword_3_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            // InternalENVIRONMENT.g:7300:3: (kw= '/' this_ID_7= RULE_ID )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==126) ) {
                    int LA59_1 = input.LA(2);

                    if ( (LA59_1==RULE_ID) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // InternalENVIRONMENT.g:7301:4: kw= '/' this_ID_7= RULE_ID
            	    {
            	    kw=(Token)match(input,126,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_4_0());
            	      			
            	    }
            	    this_ID_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_133); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_7);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_7, grammarAccess.getURLAccess().getIDTerminalRuleCall_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            // InternalENVIRONMENT.g:7314:3: (kw= '/' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==126) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalENVIRONMENT.g:7315:4: kw= '/'
                    {
                    kw=(Token)match(input,126,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_5());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleURL"


    // $ANTLR start "ruleGSSScenarioEnableDisable"
    // InternalENVIRONMENT.g:7325:1: ruleGSSScenarioEnableDisable returns [Enumerator current=null] : ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) ;
    public final Enumerator ruleGSSScenarioEnableDisable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7331:2: ( ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) )
            // InternalENVIRONMENT.g:7332:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            {
            // InternalENVIRONMENT.g:7332:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==129) ) {
                alt61=1;
            }
            else if ( (LA61_0==130) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalENVIRONMENT.g:7333:3: (enumLiteral_0= 'disabled' )
                    {
                    // InternalENVIRONMENT.g:7333:3: (enumLiteral_0= 'disabled' )
                    // InternalENVIRONMENT.g:7334:4: enumLiteral_0= 'disabled'
                    {
                    enumLiteral_0=(Token)match(input,129,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7341:3: (enumLiteral_1= 'enabled' )
                    {
                    // InternalENVIRONMENT.g:7341:3: (enumLiteral_1= 'enabled' )
                    // InternalENVIRONMENT.g:7342:4: enumLiteral_1= 'enabled'
                    {
                    enumLiteral_1=(Token)match(input,130,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioEnableDisableAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioEnableDisableAccess().getEnabledEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioEnableDisable"


    // $ANTLR start "ruleGSSScenarioInterfaceType"
    // InternalENVIRONMENT.g:7352:1: ruleGSSScenarioInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'socketSrv' ) | (enumLiteral_5= 'socketCli' ) | (enumLiteral_6= 'dummy' ) ) ;
    public final Enumerator ruleGSSScenarioInterfaceType() throws RecognitionException {
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
            // InternalENVIRONMENT.g:7358:2: ( ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'socketSrv' ) | (enumLiteral_5= 'socketCli' ) | (enumLiteral_6= 'dummy' ) ) )
            // InternalENVIRONMENT.g:7359:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'socketSrv' ) | (enumLiteral_5= 'socketCli' ) | (enumLiteral_6= 'dummy' ) )
            {
            // InternalENVIRONMENT.g:7359:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'socketSrv' ) | (enumLiteral_5= 'socketCli' ) | (enumLiteral_6= 'dummy' ) )
            int alt62=7;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt62=1;
                }
                break;
            case 132:
                {
                alt62=2;
                }
                break;
            case 133:
                {
                alt62=3;
                }
                break;
            case 134:
                {
                alt62=4;
                }
                break;
            case 135:
                {
                alt62=5;
                }
                break;
            case 136:
                {
                alt62=6;
                }
                break;
            case 137:
                {
                alt62=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalENVIRONMENT.g:7360:3: (enumLiteral_0= 'SpW' )
                    {
                    // InternalENVIRONMENT.g:7360:3: (enumLiteral_0= 'SpW' )
                    // InternalENVIRONMENT.g:7361:4: enumLiteral_0= 'SpW'
                    {
                    enumLiteral_0=(Token)match(input,131,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7368:3: (enumLiteral_1= 'SpW_TC' )
                    {
                    // InternalENVIRONMENT.g:7368:3: (enumLiteral_1= 'SpW_TC' )
                    // InternalENVIRONMENT.g:7369:4: enumLiteral_1= 'SpW_TC'
                    {
                    enumLiteral_1=(Token)match(input,132,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7376:3: (enumLiteral_2= 'SpW_Error' )
                    {
                    // InternalENVIRONMENT.g:7376:3: (enumLiteral_2= 'SpW_Error' )
                    // InternalENVIRONMENT.g:7377:4: enumLiteral_2= 'SpW_Error'
                    {
                    enumLiteral_2=(Token)match(input,133,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalENVIRONMENT.g:7384:3: (enumLiteral_3= 'uart' )
                    {
                    // InternalENVIRONMENT.g:7384:3: (enumLiteral_3= 'uart' )
                    // InternalENVIRONMENT.g:7385:4: enumLiteral_3= 'uart'
                    {
                    enumLiteral_3=(Token)match(input,134,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getUartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSScenarioInterfaceTypeAccess().getUartEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalENVIRONMENT.g:7392:3: (enumLiteral_4= 'socketSrv' )
                    {
                    // InternalENVIRONMENT.g:7392:3: (enumLiteral_4= 'socketSrv' )
                    // InternalENVIRONMENT.g:7393:4: enumLiteral_4= 'socketSrv'
                    {
                    enumLiteral_4=(Token)match(input,135,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSocketSrvEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSocketSrvEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalENVIRONMENT.g:7400:3: (enumLiteral_5= 'socketCli' )
                    {
                    // InternalENVIRONMENT.g:7400:3: (enumLiteral_5= 'socketCli' )
                    // InternalENVIRONMENT.g:7401:4: enumLiteral_5= 'socketCli'
                    {
                    enumLiteral_5=(Token)match(input,136,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getSocketCliEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getGSSScenarioInterfaceTypeAccess().getSocketCliEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalENVIRONMENT.g:7408:3: (enumLiteral_6= 'dummy' )
                    {
                    // InternalENVIRONMENT.g:7408:3: (enumLiteral_6= 'dummy' )
                    // InternalENVIRONMENT.g:7409:4: enumLiteral_6= 'dummy'
                    {
                    enumLiteral_6=(Token)match(input,137,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceTypeAccess().getDummyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getGSSScenarioInterfaceTypeAccess().getDummyEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioInterfaceType"


    // $ANTLR start "ruleGSSScenarioInterfaceIOType"
    // InternalENVIRONMENT.g:7419:1: ruleGSSScenarioInterfaceIOType returns [Enumerator current=null] : ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleGSSScenarioInterfaceIOType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7425:2: ( ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // InternalENVIRONMENT.g:7426:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // InternalENVIRONMENT.g:7426:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt63=1;
                }
                break;
            case 139:
                {
                alt63=2;
                }
                break;
            case 140:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalENVIRONMENT.g:7427:3: (enumLiteral_0= 'in_out' )
                    {
                    // InternalENVIRONMENT.g:7427:3: (enumLiteral_0= 'in_out' )
                    // InternalENVIRONMENT.g:7428:4: enumLiteral_0= 'in_out'
                    {
                    enumLiteral_0=(Token)match(input,138,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7435:3: (enumLiteral_1= 'in' )
                    {
                    // InternalENVIRONMENT.g:7435:3: (enumLiteral_1= 'in' )
                    // InternalENVIRONMENT.g:7436:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,139,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7443:3: (enumLiteral_2= 'out' )
                    {
                    // InternalENVIRONMENT.g:7443:3: (enumLiteral_2= 'out' )
                    // InternalENVIRONMENT.g:7444:4: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,140,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioInterfaceIOType"


    // $ANTLR start "ruleGSSScenarioUpperLevelLevel"
    // InternalENVIRONMENT.g:7454:1: ruleGSSScenarioUpperLevelLevel returns [Enumerator current=null] : ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) ;
    public final Enumerator ruleGSSScenarioUpperLevelLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7460:2: ( ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) )
            // InternalENVIRONMENT.g:7461:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            {
            // InternalENVIRONMENT.g:7461:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt64=1;
                }
                break;
            case 142:
                {
                alt64=2;
                }
                break;
            case 143:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalENVIRONMENT.g:7462:3: (enumLiteral_0= '_1' )
                    {
                    // InternalENVIRONMENT.g:7462:3: (enumLiteral_0= '_1' )
                    // InternalENVIRONMENT.g:7463:4: enumLiteral_0= '_1'
                    {
                    enumLiteral_0=(Token)match(input,141,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7470:3: (enumLiteral_1= '_2' )
                    {
                    // InternalENVIRONMENT.g:7470:3: (enumLiteral_1= '_2' )
                    // InternalENVIRONMENT.g:7471:4: enumLiteral_1= '_2'
                    {
                    enumLiteral_1=(Token)match(input,142,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7478:3: (enumLiteral_2= '_3' )
                    {
                    // InternalENVIRONMENT.g:7478:3: (enumLiteral_2= '_3' )
                    // InternalENVIRONMENT.g:7479:4: enumLiteral_2= '_3'
                    {
                    enumLiteral_2=(Token)match(input,143,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioUpperLevelLevel"


    // $ANTLR start "ruleGSSScenarioUnit"
    // InternalENVIRONMENT.g:7489:1: ruleGSSScenarioUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) ;
    public final Enumerator ruleGSSScenarioUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7495:2: ( ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) )
            // InternalENVIRONMENT.g:7496:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            {
            // InternalENVIRONMENT.g:7496:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==144) ) {
                alt65=1;
            }
            else if ( (LA65_0==145) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalENVIRONMENT.g:7497:3: (enumLiteral_0= 'miliseconds' )
                    {
                    // InternalENVIRONMENT.g:7497:3: (enumLiteral_0= 'miliseconds' )
                    // InternalENVIRONMENT.g:7498:4: enumLiteral_0= 'miliseconds'
                    {
                    enumLiteral_0=(Token)match(input,144,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7505:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalENVIRONMENT.g:7505:3: (enumLiteral_1= 'seconds' )
                    // InternalENVIRONMENT.g:7506:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,145,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioUnitAccess().getSecondsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioUnit"


    // $ANTLR start "ruleGSSScenarioGlobalVarType"
    // InternalENVIRONMENT.g:7516:1: ruleGSSScenarioGlobalVarType returns [Enumerator current=null] : ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) ;
    public final Enumerator ruleGSSScenarioGlobalVarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7522:2: ( ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) )
            // InternalENVIRONMENT.g:7523:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
            {
            // InternalENVIRONMENT.g:7523:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==146) ) {
                alt66=1;
            }
            else if ( (LA66_0==147) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalENVIRONMENT.g:7524:3: (enumLiteral_0= 'uint' )
                    {
                    // InternalENVIRONMENT.g:7524:3: (enumLiteral_0= 'uint' )
                    // InternalENVIRONMENT.g:7525:4: enumLiteral_0= 'uint'
                    {
                    enumLiteral_0=(Token)match(input,146,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7532:3: (enumLiteral_1= 'formula' )
                    {
                    // InternalENVIRONMENT.g:7532:3: (enumLiteral_1= 'formula' )
                    // InternalENVIRONMENT.g:7533:4: enumLiteral_1= 'formula'
                    {
                    enumLiteral_1=(Token)match(input,147,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioGlobalVarType"


    // $ANTLR start "ruleGSSScenarioReferenceFieldType"
    // InternalENVIRONMENT.g:7543:1: ruleGSSScenarioReferenceFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) ;
    public final Enumerator ruleGSSScenarioReferenceFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7549:2: ( ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) )
            // InternalENVIRONMENT.g:7550:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
            {
            // InternalENVIRONMENT.g:7550:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==148) ) {
                alt67=1;
            }
            else if ( (LA67_0==149) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalENVIRONMENT.g:7551:3: (enumLiteral_0= 'tm' )
                    {
                    // InternalENVIRONMENT.g:7551:3: (enumLiteral_0= 'tm' )
                    // InternalENVIRONMENT.g:7552:4: enumLiteral_0= 'tm'
                    {
                    enumLiteral_0=(Token)match(input,148,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7559:3: (enumLiteral_1= 'tc' )
                    {
                    // InternalENVIRONMENT.g:7559:3: (enumLiteral_1= 'tc' )
                    // InternalENVIRONMENT.g:7560:4: enumLiteral_1= 'tc'
                    {
                    enumLiteral_1=(Token)match(input,149,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioReferenceFieldType"


    // $ANTLR start "ruleGSSScenarioAlarmMsgType"
    // InternalENVIRONMENT.g:7570:1: ruleGSSScenarioAlarmMsgType returns [Enumerator current=null] : ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) ;
    public final Enumerator ruleGSSScenarioAlarmMsgType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7576:2: ( ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) )
            // InternalENVIRONMENT.g:7577:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            {
            // InternalENVIRONMENT.g:7577:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 150:
                {
                alt68=1;
                }
                break;
            case 151:
                {
                alt68=2;
                }
                break;
            case 152:
                {
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalENVIRONMENT.g:7578:3: (enumLiteral_0= 'alarm1' )
                    {
                    // InternalENVIRONMENT.g:7578:3: (enumLiteral_0= 'alarm1' )
                    // InternalENVIRONMENT.g:7579:4: enumLiteral_0= 'alarm1'
                    {
                    enumLiteral_0=(Token)match(input,150,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7586:3: (enumLiteral_1= 'alarm2' )
                    {
                    // InternalENVIRONMENT.g:7586:3: (enumLiteral_1= 'alarm2' )
                    // InternalENVIRONMENT.g:7587:4: enumLiteral_1= 'alarm2'
                    {
                    enumLiteral_1=(Token)match(input,151,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7594:3: (enumLiteral_2= 'alarm3' )
                    {
                    // InternalENVIRONMENT.g:7594:3: (enumLiteral_2= 'alarm3' )
                    // InternalENVIRONMENT.g:7595:4: enumLiteral_2= 'alarm3'
                    {
                    enumLiteral_2=(Token)match(input,152,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSScenarioAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioAlarmMsgType"


    // $ANTLR start "ruleGSSScenarioModifyType"
    // InternalENVIRONMENT.g:7605:1: ruleGSSScenarioModifyType returns [Enumerator current=null] : ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) ;
    public final Enumerator ruleGSSScenarioModifyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7611:2: ( ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) )
            // InternalENVIRONMENT.g:7612:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            {
            // InternalENVIRONMENT.g:7612:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==153) ) {
                alt69=1;
            }
            else if ( (LA69_0==154) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalENVIRONMENT.g:7613:3: (enumLiteral_0= 'increment' )
                    {
                    // InternalENVIRONMENT.g:7613:3: (enumLiteral_0= 'increment' )
                    // InternalENVIRONMENT.g:7614:4: enumLiteral_0= 'increment'
                    {
                    enumLiteral_0=(Token)match(input,153,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioModifyTypeAccess().getIncrementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioModifyTypeAccess().getIncrementEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7621:3: (enumLiteral_1= 'increment1wrap' )
                    {
                    // InternalENVIRONMENT.g:7621:3: (enumLiteral_1= 'increment1wrap' )
                    // InternalENVIRONMENT.g:7622:4: enumLiteral_1= 'increment1wrap'
                    {
                    enumLiteral_1=(Token)match(input,154,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSScenarioModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSScenarioModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioModifyType"


    // $ANTLR start "ruleGSSScenarioAlarmValType"
    // InternalENVIRONMENT.g:7632:1: ruleGSSScenarioAlarmValType returns [Enumerator current=null] : (enumLiteral_0= 'alarm1' ) ;
    public final Enumerator ruleGSSScenarioAlarmValType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7638:2: ( (enumLiteral_0= 'alarm1' ) )
            // InternalENVIRONMENT.g:7639:2: (enumLiteral_0= 'alarm1' )
            {
            // InternalENVIRONMENT.g:7639:2: (enumLiteral_0= 'alarm1' )
            // InternalENVIRONMENT.g:7640:3: enumLiteral_0= 'alarm1'
            {
            enumLiteral_0=(Token)match(input,150,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getGSSScenarioAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getGSSScenarioAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGSSScenarioAlarmValType"

    // $ANTLR start synpred5_InternalENVIRONMENT
    public final void synpred5_InternalENVIRONMENT_fragment() throws RecognitionException {   
        EObject lv_GlobalVars_9_0 = null;


        // InternalENVIRONMENT.g:474:4: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) ) )
        // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) )
        {
        // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) ) )
        // InternalENVIRONMENT.g:475:5: {...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalENVIRONMENT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0)");
        }
        // InternalENVIRONMENT.g:475:116: ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) ) )
        // InternalENVIRONMENT.g:476:6: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 0);
        // InternalENVIRONMENT.g:479:9: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) ) )
        // InternalENVIRONMENT.g:479:10: {...}? => ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalENVIRONMENT", "true");
        }
        // InternalENVIRONMENT.g:479:19: ( (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars ) )
        // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars )
        {
        // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars )
        // InternalENVIRONMENT.g:480:10: lv_GlobalVars_9_0= ruleGSSScenarioGlobalVars
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getGlobalVarsGSSScenarioGlobalVarsParserRuleCall_8_0_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_GlobalVars_9_0=ruleGSSScenarioGlobalVars();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalENVIRONMENT

    // $ANTLR start synpred6_InternalENVIRONMENT
    public final void synpred6_InternalENVIRONMENT_fragment() throws RecognitionException {   
        EObject lv_Monitors_10_0 = null;


        // InternalENVIRONMENT.g:502:4: ( ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) ) )
        // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) )
        {
        // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) ) )
        // InternalENVIRONMENT.g:503:5: {...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalENVIRONMENT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1)");
        }
        // InternalENVIRONMENT.g:503:116: ( ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) ) )
        // InternalENVIRONMENT.g:504:6: ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSScenarioScenarioAccess().getUnorderedGroup_8(), 1);
        // InternalENVIRONMENT.g:507:9: ({...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) ) )
        // InternalENVIRONMENT.g:507:10: {...}? => ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalENVIRONMENT", "true");
        }
        // InternalENVIRONMENT.g:507:19: ( (lv_Monitors_10_0= ruleGSSScenarioMonitors ) )
        // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSScenarioMonitors )
        {
        // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSScenarioMonitors )
        // InternalENVIRONMENT.g:508:10: lv_Monitors_10_0= ruleGSSScenarioMonitors
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSScenarioScenarioAccess().getMonitorsGSSScenarioMonitorsParserRuleCall_8_1_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_Monitors_10_0=ruleGSSScenarioMonitors();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalENVIRONMENT

    // Delegated rules

    public final boolean synpred6_InternalENVIRONMENT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalENVIRONMENT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalENVIRONMENT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalENVIRONMENT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000009000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001E080000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001C080000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018080000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000080000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000001000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0200000000080000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000080000L,0x0000000A01000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000080000L,0x0000002000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L,0x0015400000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020080000L,0x0015400000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000000000C0L,0x2000000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000080000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000003F8L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001C00L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0500000000000000L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0500000000080000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0500000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0500000000080000L,0x0000000000000003L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xC000000000080000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x8000000000080000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4000000000080000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000080000L,0x0000000000008400L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000080000L,0x0000000000100000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000080000L,0x0000000000400000L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000E000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0xA800000000080000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0xA000000000080000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000080000L,0x00000001E0000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000080000L,0x00000001C0000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000080000L,0x0000000180000000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000080000L,0x0000000100000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000420000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000001080000000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000C0000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000290000000000L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
        public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0120000000000000L});
        public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001C00000L});
        public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
        public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
        public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
        public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000080000L,0x0080000000000000L});
        public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
        public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
        public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
        public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
        public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
        public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
        public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000022L,0x4200000000000000L});
        public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000022L,0x4000000000000000L});
        public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    }


}