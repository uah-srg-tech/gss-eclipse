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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSEnvironmentEnvironment'", "'{'", "'uri'", "'version'", "'}'", "'GSSEnvironmentScenario'", "'GSSEnvironmentOptions'", "'GSSEnvironmentProtocols'", "'GSSEnvironmentInterfaces'", "'GSSEnvironmentSpecialPackets'", "'GSSEnvironmentPeriodicTCs'", "'GSSEnvironmentGlobalVars'", "'GSSEnvironmentMonitors'", "'ChartsFile'", "'GSSEnvironmentInfo'", "'test_campaign'", "'date'", "'version_control_url'", "'GSSEnvironmentInfoPrint'", "'mainLog'", "'portLogs'", "'rawLog'", "'GSSEnvironmentPhyHeaderPrint'", "'gssTabs'", "'GSSEnvironmentDiscardErrorFlags'", "'txErrors'", "'notExpectedPackets'", "'filtersKo'", "'validTimesKo'", "'GSSEnvironmentProtocol'", "'id'", "'name'", "'typeLevel'", "'typeOffset'", "'subtypeOffset'", "'GSSEnvironmentMainInterface'", "'ifType'", "'ifConfig'", "'ioType'", "'protocolID'", "'ProtocolPacketsFile'", "'GSSEnvironmentInterface'", "'GSSEnvironmentLevelInOut'", "'TMformat'", "'TCformat'", "'inputFilter'", "'export_to_prev_Level'", "'import_from_prev_Level'", "'GSSEnvironmentLevelIn'", "'GSSEnvironmentLevelOut'", "'GSSEnvironmentSpecialPacket'", "'status'", "'ifRef'", "'levels'", "'levelRef'", "'GSSEnvironmentUpperLevels'", "'GSSEnvironmentPrintingData'", "'printStatus'", "'GSSEnvironmentPeriod'", "'min_value'", "'min_unit'", "'max_value'", "'max_unit'", "'GSSEnvironmentIntervalRange'", "'min'", "'max'", "'interval_value'", "'interval_unit'", "'GSSEnvironmentUpperLevel'", "'level'", "'GSSEnvironmentStructuredData'", "'firstField'", "'GSSEnvironmentPeriodicTCLevel2'", "'period_value'", "'period_unit'", "'level2'", "'app_to_level2'", "'level1'", "'level2_to_level1'", "'level0'", "'level1_to_level0'", "'GSSEnvironmentPeriodicTCLevel1'", "'app_to_level1'", "'GSSEnvironmentPeriodicTCLevel0'", "'app_to_level0'", "'GSSEnvironmentGlobalVar'", "'type'", "'initial_value'", "'GSSEnvironmentReferenceField'", "'fieldRef'", "'offset'", "'size'", "'GSSEnvironmentReferencePeriodicTC'", "'idRef'", "'GSSEnvironmentReferenceSpecialPacket'", "'GSSEnvironmentPlot'", "'chartRef'", "'GSSEnvironmentAlarmMsg'", "'text'", "'GSSEnvironmentModify'", "'value'", "'GSSEnvironmentAlarmVal'", "'GSSEnvironmentGVFiltered'", "'GlobalVarRef'", "'filter'", "'GSSEnvironmentGVPeriodic'", "'.'", "'('", "')'", "'::'", "'-'", "'/'", "'+'", "'://'", "'disabled'", "'enabled'", "'SpW'", "'SpW_TC'", "'SpW_Error'", "'uart'", "'dummy'", "'in_out'", "'in'", "'out'", "'_1'", "'_2'", "'_3'", "'miliseconds'", "'seconds'", "'uint'", "'formula'", "'tm'", "'tc'", "'alarm1'", "'alarm2'", "'alarm3'", "'increment'", "'increment1wrap'"
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
    public static final int T__151=151;
    public static final int T__150=150;
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
    // InternalENVIRONMENT.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment ) ) ) )
            // InternalENVIRONMENT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment ) ) )
            {
            // InternalENVIRONMENT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment ) ) )
            // InternalENVIRONMENT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment ) )
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

            // InternalENVIRONMENT.g:113:3: ( (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment ) )
            // InternalENVIRONMENT.g:114:4: (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment )
            {
            // InternalENVIRONMENT.g:114:4: (lv_element_1_0= ruleGSSEnvironmentGSSEnvironment )
            // InternalENVIRONMENT.g:115:5: lv_element_1_0= ruleGSSEnvironmentGSSEnvironment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSEnvironmentGSSEnvironmentParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSEnvironmentGSSEnvironment();

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
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSEnvironment");
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


    // $ANTLR start "entryRuleGSSEnvironmentGSSEnvironment"
    // InternalENVIRONMENT.g:185:1: entryRuleGSSEnvironmentGSSEnvironment returns [EObject current=null] : iv_ruleGSSEnvironmentGSSEnvironment= ruleGSSEnvironmentGSSEnvironment EOF ;
    public final EObject entryRuleGSSEnvironmentGSSEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGSSEnvironment = null;


        try {
            // InternalENVIRONMENT.g:185:69: (iv_ruleGSSEnvironmentGSSEnvironment= ruleGSSEnvironmentGSSEnvironment EOF )
            // InternalENVIRONMENT.g:186:2: iv_ruleGSSEnvironmentGSSEnvironment= ruleGSSEnvironmentGSSEnvironment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGSSEnvironment=ruleGSSEnvironmentGSSEnvironment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGSSEnvironment; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGSSEnvironment"


    // $ANTLR start "ruleGSSEnvironmentGSSEnvironment"
    // InternalENVIRONMENT.g:192:1: ruleGSSEnvironmentGSSEnvironment returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSEnvironmentScenario ) ) otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleGSSEnvironmentGSSEnvironment() throws RecognitionException {
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
            // InternalENVIRONMENT.g:198:2: ( (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSEnvironmentScenario ) ) otherlv_12= '}' otherlv_13= ';' ) )
            // InternalENVIRONMENT.g:199:2: (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSEnvironmentScenario ) ) otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalENVIRONMENT.g:199:2: (otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSEnvironmentScenario ) ) otherlv_12= '}' otherlv_13= ';' )
            // InternalENVIRONMENT.g:200:3: otherlv_0= 'GSSEnvironmentEnvironment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_scenario_11_0= ruleGSSEnvironmentScenario ) ) otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getGSSEnvironmentEnvironmentKeyword_0());
              		
            }
            // InternalENVIRONMENT.g:204:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENVIRONMENT.g:205:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENVIRONMENT.g:205:4: (lv_name_1_0= RULE_ID )
            // InternalENVIRONMENT.g:206:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:226:3: (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' )
            // InternalENVIRONMENT.g:227:4: otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';'
            {
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriKeyword_3_0());
              			
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_3_1());
              			
            }
            // InternalENVIRONMENT.g:235:4: ( (lv_uri_5_0= ruleQualifiedName ) )
            // InternalENVIRONMENT.g:236:5: (lv_uri_5_0= ruleQualifiedName )
            {
            // InternalENVIRONMENT.g:236:5: (lv_uri_5_0= ruleQualifiedName )
            // InternalENVIRONMENT.g:237:6: lv_uri_5_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getUriQualifiedNameParserRuleCall_3_2_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_uri_5_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
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

              				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_3_3());
              			
            }

            }

            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getColonEqualsSignKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:267:3: ( (lv_version_9_0= ruleVersion ) )
            // InternalENVIRONMENT.g:268:4: (lv_version_9_0= ruleVersion )
            {
            // InternalENVIRONMENT.g:268:4: (lv_version_9_0= ruleVersion )
            // InternalENVIRONMENT.g:269:5: lv_version_9_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getVersionVersionParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_9_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
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

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:290:3: ( (lv_scenario_11_0= ruleGSSEnvironmentScenario ) )
            // InternalENVIRONMENT.g:291:4: (lv_scenario_11_0= ruleGSSEnvironmentScenario )
            {
            // InternalENVIRONMENT.g:291:4: (lv_scenario_11_0= ruleGSSEnvironmentScenario )
            // InternalENVIRONMENT.g:292:5: lv_scenario_11_0= ruleGSSEnvironmentScenario
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getScenarioGSSEnvironmentScenarioParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_scenario_11_0=ruleGSSEnvironmentScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSEnvironmentRule());
              					}
              					add(
              						current,
              						"scenario",
              						lv_scenario_11_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentScenario");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSEnvironmentAccess().getSemicolonKeyword_10());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGSSEnvironment"


    // $ANTLR start "entryRuleGSSEnvironmentScenario"
    // InternalENVIRONMENT.g:321:1: entryRuleGSSEnvironmentScenario returns [EObject current=null] : iv_ruleGSSEnvironmentScenario= ruleGSSEnvironmentScenario EOF ;
    public final EObject entryRuleGSSEnvironmentScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentScenario = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8()
        	);

        try {
            // InternalENVIRONMENT.g:325:2: (iv_ruleGSSEnvironmentScenario= ruleGSSEnvironmentScenario EOF )
            // InternalENVIRONMENT.g:326:2: iv_ruleGSSEnvironmentScenario= ruleGSSEnvironmentScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentScenarioRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentScenario=ruleGSSEnvironmentScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentScenario; 
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
    // $ANTLR end "entryRuleGSSEnvironmentScenario"


    // $ANTLR start "ruleGSSEnvironmentScenario"
    // InternalENVIRONMENT.g:335:1: ruleGSSEnvironmentScenario returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSEnvironmentOptions ) ) ( (lv_Protocols_4_0= ruleGSSEnvironmentProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSEnvironmentScenario() throws RecognitionException {
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
        	grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8()
        	);

        try {
            // InternalENVIRONMENT.g:344:2: ( (otherlv_0= 'GSSEnvironmentScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSEnvironmentOptions ) ) ( (lv_Protocols_4_0= ruleGSSEnvironmentProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' ) )
            // InternalENVIRONMENT.g:345:2: (otherlv_0= 'GSSEnvironmentScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSEnvironmentOptions ) ) ( (lv_Protocols_4_0= ruleGSSEnvironmentProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalENVIRONMENT.g:345:2: (otherlv_0= 'GSSEnvironmentScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSEnvironmentOptions ) ) ( (lv_Protocols_4_0= ruleGSSEnvironmentProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';' )
            // InternalENVIRONMENT.g:346:3: otherlv_0= 'GSSEnvironmentScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_gss_options_3_0= ruleGSSEnvironmentOptions ) ) ( (lv_Protocols_4_0= ruleGSSEnvironmentProtocols ) ) ( (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces ) ) ( (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets ) )? ( (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) ) )? otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentScenarioAccess().getGSSEnvironmentScenarioKeyword_0());
              		
            }
            // InternalENVIRONMENT.g:350:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalENVIRONMENT.g:351:4: (lv_name_1_0= RULE_ID )
            {
            // InternalENVIRONMENT.g:351:4: (lv_name_1_0= RULE_ID )
            // InternalENVIRONMENT.g:352:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSEnvironmentScenarioAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentScenarioRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentScenarioAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:372:3: ( (lv_gss_options_3_0= ruleGSSEnvironmentOptions ) )
            // InternalENVIRONMENT.g:373:4: (lv_gss_options_3_0= ruleGSSEnvironmentOptions )
            {
            // InternalENVIRONMENT.g:373:4: (lv_gss_options_3_0= ruleGSSEnvironmentOptions )
            // InternalENVIRONMENT.g:374:5: lv_gss_options_3_0= ruleGSSEnvironmentOptions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getGss_optionsGSSEnvironmentOptionsParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_gss_options_3_0=ruleGSSEnvironmentOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
              					}
              					set(
              						current,
              						"gss_options",
              						lv_gss_options_3_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentOptions");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:391:3: ( (lv_Protocols_4_0= ruleGSSEnvironmentProtocols ) )
            // InternalENVIRONMENT.g:392:4: (lv_Protocols_4_0= ruleGSSEnvironmentProtocols )
            {
            // InternalENVIRONMENT.g:392:4: (lv_Protocols_4_0= ruleGSSEnvironmentProtocols )
            // InternalENVIRONMENT.g:393:5: lv_Protocols_4_0= ruleGSSEnvironmentProtocols
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getProtocolsGSSEnvironmentProtocolsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_Protocols_4_0=ruleGSSEnvironmentProtocols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
              					}
              					set(
              						current,
              						"Protocols",
              						lv_Protocols_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentProtocols");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:410:3: ( (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces ) )
            // InternalENVIRONMENT.g:411:4: (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces )
            {
            // InternalENVIRONMENT.g:411:4: (lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces )
            // InternalENVIRONMENT.g:412:5: lv_Interfaces_5_0= ruleGSSEnvironmentInterfaces
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getInterfacesGSSEnvironmentInterfacesParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_Interfaces_5_0=ruleGSSEnvironmentInterfaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
              					}
              					set(
              						current,
              						"Interfaces",
              						lv_Interfaces_5_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaces");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:429:3: ( (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalENVIRONMENT.g:430:4: (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets )
                    {
                    // InternalENVIRONMENT.g:430:4: (lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets )
                    // InternalENVIRONMENT.g:431:5: lv_SpecialPackets_6_0= ruleGSSEnvironmentSpecialPackets
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getSpecialPacketsGSSEnvironmentSpecialPacketsParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_SpecialPackets_6_0=ruleGSSEnvironmentSpecialPackets();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
                      					}
                      					set(
                      						current,
                      						"SpecialPackets",
                      						lv_SpecialPackets_6_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentSpecialPackets");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalENVIRONMENT.g:448:3: ( (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==25) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalENVIRONMENT.g:449:4: (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs )
                    {
                    // InternalENVIRONMENT.g:449:4: (lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs )
                    // InternalENVIRONMENT.g:450:5: lv_PeriodicTCs_7_0= ruleGSSEnvironmentPeriodicTCs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getPeriodicTCsGSSEnvironmentPeriodicTCsParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_19);
                    lv_PeriodicTCs_7_0=ruleGSSEnvironmentPeriodicTCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
                      					}
                      					set(
                      						current,
                      						"PeriodicTCs",
                      						lv_PeriodicTCs_7_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalENVIRONMENT.g:467:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=27)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalENVIRONMENT.g:468:4: ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalENVIRONMENT.g:468:4: ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?) )
                    // InternalENVIRONMENT.g:469:5: ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?)
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());
                    // InternalENVIRONMENT.g:472:5: ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?)
                    // InternalENVIRONMENT.g:473:6: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+ {...}?
                    {
                    // InternalENVIRONMENT.g:473:6: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( LA4_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0) ) {
                            alt4=1;
                        }
                        else if ( LA4_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) )
                    	    {
                    	    // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) )
                    	    // InternalENVIRONMENT.g:475:5: {...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSEnvironmentScenario", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0)");
                    	    }
                    	    // InternalENVIRONMENT.g:475:119: ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) )
                    	    // InternalENVIRONMENT.g:476:6: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0);
                    	    // InternalENVIRONMENT.g:479:9: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) )
                    	    // InternalENVIRONMENT.g:479:10: {...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSEnvironmentScenario", "true");
                    	    }
                    	    // InternalENVIRONMENT.g:479:19: ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) )
                    	    // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars )
                    	    {
                    	    // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars )
                    	    // InternalENVIRONMENT.g:480:10: lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      										newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_8_0_0());
                    	      									
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_GlobalVars_9_0=ruleGSSEnvironmentGlobalVars();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										if (current==null) {
                    	      											current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
                    	      										}
                    	      										set(
                    	      											current,
                    	      											"GlobalVars",
                    	      											lv_GlobalVars_9_0,
                    	      											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVars");
                    	      										afterParserOrEnumRuleCall();
                    	      									
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) )
                    	    {
                    	    // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) )
                    	    // InternalENVIRONMENT.g:503:5: {...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSEnvironmentScenario", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1)");
                    	    }
                    	    // InternalENVIRONMENT.g:503:119: ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) )
                    	    // InternalENVIRONMENT.g:504:6: ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1);
                    	    // InternalENVIRONMENT.g:507:9: ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) )
                    	    // InternalENVIRONMENT.g:507:10: {...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSEnvironmentScenario", "true");
                    	    }
                    	    // InternalENVIRONMENT.g:507:19: ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) )
                    	    // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSEnvironmentMonitors )
                    	    {
                    	    // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSEnvironmentMonitors )
                    	    // InternalENVIRONMENT.g:508:10: lv_Monitors_10_0= ruleGSSEnvironmentMonitors
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      										newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsGSSEnvironmentMonitorsParserRuleCall_8_1_0());
                    	      									
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_19);
                    	    lv_Monitors_10_0=ruleGSSEnvironmentMonitors();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										if (current==null) {
                    	      											current = createModelElementForParent(grammarAccess.getGSSEnvironmentScenarioRule());
                    	      										}
                    	      										set(
                    	      											current,
                    	      											"Monitors",
                    	      											lv_Monitors_10_0,
                    	      											"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentMonitors");
                    	      										afterParserOrEnumRuleCall();
                    	      									
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8()) ) {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        throw new FailedPredicateException(input, "ruleGSSEnvironmentScenario", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8())");
                    }

                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8());

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentScenarioAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentScenarioAccess().getSemicolonKeyword_10());
              		
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
    // $ANTLR end "ruleGSSEnvironmentScenario"


    // $ANTLR start "entryRuleGSSEnvironmentOptions"
    // InternalENVIRONMENT.g:553:1: entryRuleGSSEnvironmentOptions returns [EObject current=null] : iv_ruleGSSEnvironmentOptions= ruleGSSEnvironmentOptions EOF ;
    public final EObject entryRuleGSSEnvironmentOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentOptions = null;


        try {
            // InternalENVIRONMENT.g:553:62: (iv_ruleGSSEnvironmentOptions= ruleGSSEnvironmentOptions EOF )
            // InternalENVIRONMENT.g:554:2: iv_ruleGSSEnvironmentOptions= ruleGSSEnvironmentOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentOptionsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentOptions=ruleGSSEnvironmentOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentOptions; 
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
    // $ANTLR end "entryRuleGSSEnvironmentOptions"


    // $ANTLR start "ruleGSSEnvironmentOptions"
    // InternalENVIRONMENT.g:560:1: ruleGSSEnvironmentOptions returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSEnvironmentOptions() throws RecognitionException {
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
            // InternalENVIRONMENT.g:566:2: ( (otherlv_0= 'GSSEnvironmentOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalENVIRONMENT.g:567:2: (otherlv_0= 'GSSEnvironmentOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalENVIRONMENT.g:567:2: (otherlv_0= 'GSSEnvironmentOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' )
            // InternalENVIRONMENT.g:568:3: otherlv_0= 'GSSEnvironmentOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentOptionsAccess().getGSSEnvironmentOptionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentOptionsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:576:3: ( (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo ) )
            // InternalENVIRONMENT.g:577:4: (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo )
            {
            // InternalENVIRONMENT.g:577:4: (lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo )
            // InternalENVIRONMENT.g:578:5: lv_gss_info_2_0= ruleGSSEnvironmentGSSInfo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_infoGSSEnvironmentGSSInfoParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_21);
            lv_gss_info_2_0=ruleGSSEnvironmentGSSInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
              					}
              					set(
              						current,
              						"gss_info",
              						lv_gss_info_2_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSInfo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:595:3: ( (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint ) )
            // InternalENVIRONMENT.g:596:4: (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint )
            {
            // InternalENVIRONMENT.g:596:4: (lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint )
            // InternalENVIRONMENT.g:597:5: lv_gss_info_print_3_0= ruleGSSEnvironmentGSSInfoPrint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getGss_info_printGSSEnvironmentGSSInfoPrintParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_gss_info_print_3_0=ruleGSSEnvironmentGSSInfoPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
              					}
              					set(
              						current,
              						"gss_info_print",
              						lv_gss_info_print_3_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSInfoPrint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:614:3: ( (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint ) )
            // InternalENVIRONMENT.g:615:4: (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint )
            {
            // InternalENVIRONMENT.g:615:4: (lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint )
            // InternalENVIRONMENT.g:616:5: lv_phy_header_print_4_0= ruleGSSEnvironmentPhyHeaderPrint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getPhy_header_printGSSEnvironmentPhyHeaderPrintParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_phy_header_print_4_0=ruleGSSEnvironmentPhyHeaderPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
              					}
              					set(
              						current,
              						"phy_header_print",
              						lv_phy_header_print_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPhyHeaderPrint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:633:3: ( (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags ) )
            // InternalENVIRONMENT.g:634:4: (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags )
            {
            // InternalENVIRONMENT.g:634:4: (lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags )
            // InternalENVIRONMENT.g:635:5: lv_discardErrorFlags_5_0= ruleGSSEnvironmentGSSDiscardErrorFlags
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentOptionsAccess().getDiscardErrorFlagsGSSEnvironmentGSSDiscardErrorFlagsParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_discardErrorFlags_5_0=ruleGSSEnvironmentGSSDiscardErrorFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentOptionsRule());
              					}
              					set(
              						current,
              						"discardErrorFlags",
              						lv_discardErrorFlags_5_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGSSDiscardErrorFlags");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentOptionsAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentOptionsAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSEnvironmentOptions"


    // $ANTLR start "entryRuleGSSEnvironmentProtocols"
    // InternalENVIRONMENT.g:664:1: entryRuleGSSEnvironmentProtocols returns [EObject current=null] : iv_ruleGSSEnvironmentProtocols= ruleGSSEnvironmentProtocols EOF ;
    public final EObject entryRuleGSSEnvironmentProtocols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentProtocols = null;


        try {
            // InternalENVIRONMENT.g:664:64: (iv_ruleGSSEnvironmentProtocols= ruleGSSEnvironmentProtocols EOF )
            // InternalENVIRONMENT.g:665:2: iv_ruleGSSEnvironmentProtocols= ruleGSSEnvironmentProtocols EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentProtocolsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentProtocols=ruleGSSEnvironmentProtocols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentProtocols; 
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
    // $ANTLR end "entryRuleGSSEnvironmentProtocols"


    // $ANTLR start "ruleGSSEnvironmentProtocols"
    // InternalENVIRONMENT.g:671:1: ruleGSSEnvironmentProtocols returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSEnvironmentProtocol ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSEnvironmentProtocols() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_Protocol_2_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:677:2: ( (otherlv_0= 'GSSEnvironmentProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSEnvironmentProtocol ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalENVIRONMENT.g:678:2: (otherlv_0= 'GSSEnvironmentProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSEnvironmentProtocol ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalENVIRONMENT.g:678:2: (otherlv_0= 'GSSEnvironmentProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSEnvironmentProtocol ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalENVIRONMENT.g:679:3: otherlv_0= 'GSSEnvironmentProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSEnvironmentProtocol ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentProtocolsAccess().getGSSEnvironmentProtocolsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentProtocolsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:687:3: ( (lv_Protocol_2_0= ruleGSSEnvironmentProtocol ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==44) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalENVIRONMENT.g:688:4: (lv_Protocol_2_0= ruleGSSEnvironmentProtocol )
            	    {
            	    // InternalENVIRONMENT.g:688:4: (lv_Protocol_2_0= ruleGSSEnvironmentProtocol )
            	    // InternalENVIRONMENT.g:689:5: lv_Protocol_2_0= ruleGSSEnvironmentProtocol
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolsAccess().getProtocolGSSEnvironmentProtocolParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_Protocol_2_0=ruleGSSEnvironmentProtocol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Protocol",
            	      						lv_Protocol_2_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentProtocol");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentProtocolsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentProtocolsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSEnvironmentProtocols"


    // $ANTLR start "entryRuleGSSEnvironmentInterfaces"
    // InternalENVIRONMENT.g:718:1: entryRuleGSSEnvironmentInterfaces returns [EObject current=null] : iv_ruleGSSEnvironmentInterfaces= ruleGSSEnvironmentInterfaces EOF ;
    public final EObject entryRuleGSSEnvironmentInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentInterfaces = null;


        try {
            // InternalENVIRONMENT.g:718:65: (iv_ruleGSSEnvironmentInterfaces= ruleGSSEnvironmentInterfaces EOF )
            // InternalENVIRONMENT.g:719:2: iv_ruleGSSEnvironmentInterfaces= ruleGSSEnvironmentInterfaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentInterfacesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentInterfaces=ruleGSSEnvironmentInterfaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentInterfaces; 
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
    // $ANTLR end "entryRuleGSSEnvironmentInterfaces"


    // $ANTLR start "ruleGSSEnvironmentInterfaces"
    // InternalENVIRONMENT.g:725:1: ruleGSSEnvironmentInterfaces returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface ) ) ( (lv_Interface_3_0= ruleGSSEnvironmentInterface ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSEnvironmentInterfaces() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_MainInterface_2_0 = null;

        EObject lv_Interface_3_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:731:2: ( (otherlv_0= 'GSSEnvironmentInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface ) ) ( (lv_Interface_3_0= ruleGSSEnvironmentInterface ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalENVIRONMENT.g:732:2: (otherlv_0= 'GSSEnvironmentInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface ) ) ( (lv_Interface_3_0= ruleGSSEnvironmentInterface ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalENVIRONMENT.g:732:2: (otherlv_0= 'GSSEnvironmentInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface ) ) ( (lv_Interface_3_0= ruleGSSEnvironmentInterface ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalENVIRONMENT.g:733:3: otherlv_0= 'GSSEnvironmentInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface ) ) ( (lv_Interface_3_0= ruleGSSEnvironmentInterface ) )* otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentInterfacesAccess().getGSSEnvironmentInterfacesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentInterfacesAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:741:3: ( (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface ) )
            // InternalENVIRONMENT.g:742:4: (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface )
            {
            // InternalENVIRONMENT.g:742:4: (lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface )
            // InternalENVIRONMENT.g:743:5: lv_MainInterface_2_0= ruleGSSEnvironmentMainInterface
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentInterfacesAccess().getMainInterfaceGSSEnvironmentMainInterfaceParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_MainInterface_2_0=ruleGSSEnvironmentMainInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfacesRule());
              					}
              					set(
              						current,
              						"MainInterface",
              						lv_MainInterface_2_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentMainInterface");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:760:3: ( (lv_Interface_3_0= ruleGSSEnvironmentInterface ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==56) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalENVIRONMENT.g:761:4: (lv_Interface_3_0= ruleGSSEnvironmentInterface )
            	    {
            	    // InternalENVIRONMENT.g:761:4: (lv_Interface_3_0= ruleGSSEnvironmentInterface )
            	    // InternalENVIRONMENT.g:762:5: lv_Interface_3_0= ruleGSSEnvironmentInterface
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSEnvironmentInterfacesAccess().getInterfaceGSSEnvironmentInterfaceParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_Interface_3_0=ruleGSSEnvironmentInterface();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfacesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Interface",
            	      						lv_Interface_3_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterface");
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

              			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentInterfacesAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentInterfacesAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSEnvironmentInterfaces"


    // $ANTLR start "entryRuleGSSEnvironmentSpecialPackets"
    // InternalENVIRONMENT.g:791:1: entryRuleGSSEnvironmentSpecialPackets returns [EObject current=null] : iv_ruleGSSEnvironmentSpecialPackets= ruleGSSEnvironmentSpecialPackets EOF ;
    public final EObject entryRuleGSSEnvironmentSpecialPackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentSpecialPackets = null;


        try {
            // InternalENVIRONMENT.g:791:69: (iv_ruleGSSEnvironmentSpecialPackets= ruleGSSEnvironmentSpecialPackets EOF )
            // InternalENVIRONMENT.g:792:2: iv_ruleGSSEnvironmentSpecialPackets= ruleGSSEnvironmentSpecialPackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentSpecialPackets=ruleGSSEnvironmentSpecialPackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentSpecialPackets; 
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
    // $ANTLR end "entryRuleGSSEnvironmentSpecialPackets"


    // $ANTLR start "ruleGSSEnvironmentSpecialPackets"
    // InternalENVIRONMENT.g:798:1: ruleGSSEnvironmentSpecialPackets returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSEnvironmentSpecialPackets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_SpecialPacket_2_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:804:2: ( (otherlv_0= 'GSSEnvironmentSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' ) )
            // InternalENVIRONMENT.g:805:2: (otherlv_0= 'GSSEnvironmentSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalENVIRONMENT.g:805:2: (otherlv_0= 'GSSEnvironmentSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' )
            // InternalENVIRONMENT.g:806:3: otherlv_0= 'GSSEnvironmentSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getGSSEnvironmentSpecialPacketsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:814:3: ( (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket ) )
            // InternalENVIRONMENT.g:815:4: (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket )
            {
            // InternalENVIRONMENT.g:815:4: (lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket )
            // InternalENVIRONMENT.g:816:5: lv_SpecialPacket_2_0= ruleGSSEnvironmentSpecialPacket
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSpecialPacketGSSEnvironmentSpecialPacketParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_SpecialPacket_2_0=ruleGSSEnvironmentSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketsRule());
              					}
              					add(
              						current,
              						"SpecialPacket",
              						lv_SpecialPacket_2_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentSpecialPacket");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentSpecialPacketsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSEnvironmentSpecialPackets"


    // $ANTLR start "entryRuleGSSEnvironmentPeriodicTCs"
    // InternalENVIRONMENT.g:845:1: entryRuleGSSEnvironmentPeriodicTCs returns [EObject current=null] : iv_ruleGSSEnvironmentPeriodicTCs= ruleGSSEnvironmentPeriodicTCs EOF ;
    public final EObject entryRuleGSSEnvironmentPeriodicTCs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPeriodicTCs = null;


        try {
            // InternalENVIRONMENT.g:845:66: (iv_ruleGSSEnvironmentPeriodicTCs= ruleGSSEnvironmentPeriodicTCs EOF )
            // InternalENVIRONMENT.g:846:2: iv_ruleGSSEnvironmentPeriodicTCs= ruleGSSEnvironmentPeriodicTCs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPeriodicTCs=ruleGSSEnvironmentPeriodicTCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPeriodicTCs; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPeriodicTCs"


    // $ANTLR start "ruleGSSEnvironmentPeriodicTCs"
    // InternalENVIRONMENT.g:852:1: ruleGSSEnvironmentPeriodicTCs returns [EObject current=null] : ( () otherlv_1= 'GSSEnvironmentPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSEnvironmentPeriodicTCs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_PeriodicTC_level_2_3_0 = null;

        EObject lv_PeriodicTC_level_1_4_0 = null;

        EObject lv_PeriodicTC_level_0_5_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:858:2: ( ( () otherlv_1= 'GSSEnvironmentPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalENVIRONMENT.g:859:2: ( () otherlv_1= 'GSSEnvironmentPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalENVIRONMENT.g:859:2: ( () otherlv_1= 'GSSEnvironmentPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalENVIRONMENT.g:860:3: () otherlv_1= 'GSSEnvironmentPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalENVIRONMENT.g:860:3: ()
            // InternalENVIRONMENT.g:861:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getGSSEnvironmentPeriodicTCsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalENVIRONMENT.g:878:3: ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 87:
                    {
                    alt8=1;
                    }
                    break;
                case 96:
                    {
                    alt8=2;
                    }
                    break;
                case 98:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalENVIRONMENT.g:879:4: ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) )
            	    {
            	    // InternalENVIRONMENT.g:879:4: ( (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 ) )
            	    // InternalENVIRONMENT.g:880:5: (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 )
            	    {
            	    // InternalENVIRONMENT.g:880:5: (lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2 )
            	    // InternalENVIRONMENT.g:881:6: lv_PeriodicTC_level_2_3_0= ruleGSSEnvironmentPeriodicTCLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_2GSSEnvironmentPeriodicTCLevel2ParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_PeriodicTC_level_2_3_0=ruleGSSEnvironmentPeriodicTCLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"PeriodicTC_level_2",
            	      							lv_PeriodicTC_level_2_3_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel2");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalENVIRONMENT.g:899:4: ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) )
            	    {
            	    // InternalENVIRONMENT.g:899:4: ( (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 ) )
            	    // InternalENVIRONMENT.g:900:5: (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 )
            	    {
            	    // InternalENVIRONMENT.g:900:5: (lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1 )
            	    // InternalENVIRONMENT.g:901:6: lv_PeriodicTC_level_1_4_0= ruleGSSEnvironmentPeriodicTCLevel1
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_1GSSEnvironmentPeriodicTCLevel1ParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_PeriodicTC_level_1_4_0=ruleGSSEnvironmentPeriodicTCLevel1();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"PeriodicTC_level_1",
            	      							lv_PeriodicTC_level_1_4_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel1");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalENVIRONMENT.g:919:4: ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) )
            	    {
            	    // InternalENVIRONMENT.g:919:4: ( (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 ) )
            	    // InternalENVIRONMENT.g:920:5: (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 )
            	    {
            	    // InternalENVIRONMENT.g:920:5: (lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0 )
            	    // InternalENVIRONMENT.g:921:6: lv_PeriodicTC_level_0_5_0= ruleGSSEnvironmentPeriodicTCLevel0
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getPeriodicTC_level_0GSSEnvironmentPeriodicTCLevel0ParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_PeriodicTC_level_0_5_0=ruleGSSEnvironmentPeriodicTCLevel0();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"PeriodicTC_level_0",
            	      							lv_PeriodicTC_level_0_5_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriodicTCLevel0");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCsAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPeriodicTCs"


    // $ANTLR start "entryRuleGSSEnvironmentGlobalVars"
    // InternalENVIRONMENT.g:951:1: entryRuleGSSEnvironmentGlobalVars returns [EObject current=null] : iv_ruleGSSEnvironmentGlobalVars= ruleGSSEnvironmentGlobalVars EOF ;
    public final EObject entryRuleGSSEnvironmentGlobalVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGlobalVars = null;


        try {
            // InternalENVIRONMENT.g:951:65: (iv_ruleGSSEnvironmentGlobalVars= ruleGSSEnvironmentGlobalVars EOF )
            // InternalENVIRONMENT.g:952:2: iv_ruleGSSEnvironmentGlobalVars= ruleGSSEnvironmentGlobalVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGlobalVars=ruleGSSEnvironmentGlobalVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGlobalVars; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGlobalVars"


    // $ANTLR start "ruleGSSEnvironmentGlobalVars"
    // InternalENVIRONMENT.g:958:1: ruleGSSEnvironmentGlobalVars returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSEnvironmentGlobalVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_GlobalVar_2_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:964:2: ( (otherlv_0= 'GSSEnvironmentGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalENVIRONMENT.g:965:2: (otherlv_0= 'GSSEnvironmentGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalENVIRONMENT.g:965:2: (otherlv_0= 'GSSEnvironmentGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalENVIRONMENT.g:966:3: otherlv_0= 'GSSEnvironmentGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGSSEnvironmentGlobalVarsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:974:3: ( (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==100) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalENVIRONMENT.g:975:4: (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar )
            	    {
            	    // InternalENVIRONMENT.g:975:4: (lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar )
            	    // InternalENVIRONMENT.g:976:5: lv_GlobalVar_2_0= ruleGSSEnvironmentGlobalVar
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarsAccess().getGlobalVarGSSEnvironmentGlobalVarParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    lv_GlobalVar_2_0=ruleGSSEnvironmentGlobalVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"GlobalVar",
            	      						lv_GlobalVar_2_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVar");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGlobalVarsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGlobalVars"


    // $ANTLR start "entryRuleGSSEnvironmentMonitors"
    // InternalENVIRONMENT.g:1005:1: entryRuleGSSEnvironmentMonitors returns [EObject current=null] : iv_ruleGSSEnvironmentMonitors= ruleGSSEnvironmentMonitors EOF ;
    public final EObject entryRuleGSSEnvironmentMonitors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentMonitors = null;


        try {
            // InternalENVIRONMENT.g:1005:63: (iv_ruleGSSEnvironmentMonitors= ruleGSSEnvironmentMonitors EOF )
            // InternalENVIRONMENT.g:1006:2: iv_ruleGSSEnvironmentMonitors= ruleGSSEnvironmentMonitors EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentMonitors=ruleGSSEnvironmentMonitors();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentMonitors; 
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
    // $ANTLR end "entryRuleGSSEnvironmentMonitors"


    // $ANTLR start "ruleGSSEnvironmentMonitors"
    // InternalENVIRONMENT.g:1012:1: ruleGSSEnvironmentMonitors returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSEnvironmentModify ) ) | ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSEnvironmentMonitors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_plot_6_0 = null;

        EObject lv_alarmMsg_7_0 = null;

        EObject lv_modify_8_0 = null;

        EObject lv_alarmVal_9_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1018:2: ( (otherlv_0= 'GSSEnvironmentMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSEnvironmentModify ) ) | ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' ) )
            // InternalENVIRONMENT.g:1019:2: (otherlv_0= 'GSSEnvironmentMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSEnvironmentModify ) ) | ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalENVIRONMENT.g:1019:2: (otherlv_0= 'GSSEnvironmentMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSEnvironmentModify ) ) | ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' )
            // InternalENVIRONMENT.g:1020:3: otherlv_0= 'GSSEnvironmentMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSEnvironmentModify ) ) | ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentMonitorsAccess().getGSSEnvironmentMonitorsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentMonitorsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:1028:3: (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalENVIRONMENT.g:1029:4: otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentMonitorsAccess().getColonEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalENVIRONMENT.g:1037:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:1038:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:1038:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:1039:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentMonitorsRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0());
                      					
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

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:1061:3: ( ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSEnvironmentModify ) ) | ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=5;
                switch ( input.LA(1) ) {
                case 110:
                    {
                    alt11=1;
                    }
                    break;
                case 112:
                    {
                    alt11=2;
                    }
                    break;
                case 114:
                    {
                    alt11=3;
                    }
                    break;
                case 116:
                    {
                    alt11=4;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalENVIRONMENT.g:1062:4: ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) )
            	    {
            	    // InternalENVIRONMENT.g:1062:4: ( (lv_plot_6_0= ruleGSSEnvironmentPlot ) )
            	    // InternalENVIRONMENT.g:1063:5: (lv_plot_6_0= ruleGSSEnvironmentPlot )
            	    {
            	    // InternalENVIRONMENT.g:1063:5: (lv_plot_6_0= ruleGSSEnvironmentPlot )
            	    // InternalENVIRONMENT.g:1064:6: lv_plot_6_0= ruleGSSEnvironmentPlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getPlotGSSEnvironmentPlotParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    lv_plot_6_0=ruleGSSEnvironmentPlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"plot",
            	      							lv_plot_6_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPlot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalENVIRONMENT.g:1082:4: ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) )
            	    {
            	    // InternalENVIRONMENT.g:1082:4: ( (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg ) )
            	    // InternalENVIRONMENT.g:1083:5: (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg )
            	    {
            	    // InternalENVIRONMENT.g:1083:5: (lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg )
            	    // InternalENVIRONMENT.g:1084:6: lv_alarmMsg_7_0= ruleGSSEnvironmentAlarmMsg
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmMsgGSSEnvironmentAlarmMsgParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    lv_alarmMsg_7_0=ruleGSSEnvironmentAlarmMsg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"alarmMsg",
            	      							lv_alarmMsg_7_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmMsg");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalENVIRONMENT.g:1102:4: ( (lv_modify_8_0= ruleGSSEnvironmentModify ) )
            	    {
            	    // InternalENVIRONMENT.g:1102:4: ( (lv_modify_8_0= ruleGSSEnvironmentModify ) )
            	    // InternalENVIRONMENT.g:1103:5: (lv_modify_8_0= ruleGSSEnvironmentModify )
            	    {
            	    // InternalENVIRONMENT.g:1103:5: (lv_modify_8_0= ruleGSSEnvironmentModify )
            	    // InternalENVIRONMENT.g:1104:6: lv_modify_8_0= ruleGSSEnvironmentModify
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getModifyGSSEnvironmentModifyParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    lv_modify_8_0=ruleGSSEnvironmentModify();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"modify",
            	      							lv_modify_8_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentModify");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalENVIRONMENT.g:1122:4: ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) )
            	    {
            	    // InternalENVIRONMENT.g:1122:4: ( (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal ) )
            	    // InternalENVIRONMENT.g:1123:5: (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal )
            	    {
            	    // InternalENVIRONMENT.g:1123:5: (lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal )
            	    // InternalENVIRONMENT.g:1124:6: lv_alarmVal_9_0= ruleGSSEnvironmentAlarmVal
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentMonitorsAccess().getAlarmValGSSEnvironmentAlarmValParserRuleCall_3_3_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    lv_alarmVal_9_0=ruleGSSEnvironmentAlarmVal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"alarmVal",
            	      							lv_alarmVal_9_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmVal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentMonitorsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentMonitorsAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSEnvironmentMonitors"


    // $ANTLR start "entryRuleGSSEnvironmentGSSInfo"
    // InternalENVIRONMENT.g:1154:1: entryRuleGSSEnvironmentGSSInfo returns [EObject current=null] : iv_ruleGSSEnvironmentGSSInfo= ruleGSSEnvironmentGSSInfo EOF ;
    public final EObject entryRuleGSSEnvironmentGSSInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGSSInfo = null;


        try {
            // InternalENVIRONMENT.g:1154:62: (iv_ruleGSSEnvironmentGSSInfo= ruleGSSEnvironmentGSSInfo EOF )
            // InternalENVIRONMENT.g:1155:2: iv_ruleGSSEnvironmentGSSInfo= ruleGSSEnvironmentGSSInfo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGSSInfo=ruleGSSEnvironmentGSSInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGSSInfo; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGSSInfo"


    // $ANTLR start "ruleGSSEnvironmentGSSInfo"
    // InternalENVIRONMENT.g:1161:1: ruleGSSEnvironmentGSSInfo returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSEnvironmentGSSInfo() throws RecognitionException {
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
            // InternalENVIRONMENT.g:1167:2: ( (otherlv_0= 'GSSEnvironmentInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:1168:2: (otherlv_0= 'GSSEnvironmentInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:1168:2: (otherlv_0= 'GSSEnvironmentInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:1169:3: otherlv_0= 'GSSEnvironmentInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSInfoAccess().getGSSEnvironmentInfoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGSSInfoAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1185:3: ( (lv_test_campaign_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:1186:4: (lv_test_campaign_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:1186:4: (lv_test_campaign_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:1187:5: lv_test_campaign_4_0= RULE_STRING
            {
            lv_test_campaign_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_test_campaign_4_0, grammarAccess.getGSSEnvironmentGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentGSSInfoRule());
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

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1215:3: ( (lv_version_8_0= ruleVersion ) )
            // InternalENVIRONMENT.g:1216:4: (lv_version_8_0= ruleVersion )
            {
            // InternalENVIRONMENT.g:1216:4: (lv_version_8_0= ruleVersion )
            // InternalENVIRONMENT.g:1217:5: lv_version_8_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersionVersionParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_8_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1246:3: ( (lv_date_12_0= ruleDATE ) )
            // InternalENVIRONMENT.g:1247:4: (lv_date_12_0= ruleDATE )
            {
            // InternalENVIRONMENT.g:1247:4: (lv_date_12_0= ruleDATE )
            // InternalENVIRONMENT.g:1248:5: lv_date_12_0= ruleDATE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoAccess().getDateDATEParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_date_12_0=ruleDATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:1269:3: (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalENVIRONMENT.g:1270:4: otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,32,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGSSInfoAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalENVIRONMENT.g:1278:4: ( (lv_version_control_url_16_0= ruleURL ) )
                    // InternalENVIRONMENT.g:1279:5: (lv_version_control_url_16_0= ruleURL )
                    {
                    // InternalENVIRONMENT.g:1279:5: (lv_version_control_url_16_0= ruleURL )
                    // InternalENVIRONMENT.g:1280:6: lv_version_control_url_16_0= ruleURL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_version_control_url_16_0=ruleURL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoRule());
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

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentGSSInfoAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentGSSInfoAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGSSInfo"


    // $ANTLR start "entryRuleGSSEnvironmentGSSInfoPrint"
    // InternalENVIRONMENT.g:1314:1: entryRuleGSSEnvironmentGSSInfoPrint returns [EObject current=null] : iv_ruleGSSEnvironmentGSSInfoPrint= ruleGSSEnvironmentGSSInfoPrint EOF ;
    public final EObject entryRuleGSSEnvironmentGSSInfoPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGSSInfoPrint = null;


        try {
            // InternalENVIRONMENT.g:1314:67: (iv_ruleGSSEnvironmentGSSInfoPrint= ruleGSSEnvironmentGSSInfoPrint EOF )
            // InternalENVIRONMENT.g:1315:2: iv_ruleGSSEnvironmentGSSInfoPrint= ruleGSSEnvironmentGSSInfoPrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGSSInfoPrint=ruleGSSEnvironmentGSSInfoPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGSSInfoPrint; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGSSInfoPrint"


    // $ANTLR start "ruleGSSEnvironmentGSSInfoPrint"
    // InternalENVIRONMENT.g:1321:1: ruleGSSEnvironmentGSSInfoPrint returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSEnvironmentGSSInfoPrint() throws RecognitionException {
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
            // InternalENVIRONMENT.g:1327:2: ( (otherlv_0= 'GSSEnvironmentInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalENVIRONMENT.g:1328:2: (otherlv_0= 'GSSEnvironmentInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalENVIRONMENT.g:1328:2: (otherlv_0= 'GSSEnvironmentInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalENVIRONMENT.g:1329:3: otherlv_0= 'GSSEnvironmentInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getGSSEnvironmentInfoPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1345:3: ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1346:4: (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1346:4: (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1347:5: lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_mainLog_4_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"mainLog",
              						lv_mainLog_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1376:3: ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1377:4: (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1377:4: (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1378:5: lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_portLogs_8_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"portLogs",
              						lv_portLogs_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1407:3: ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1408:4: (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1408:4: (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1409:5: lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_rawLog_12_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"rawLog",
              						lv_rawLog_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGSSInfoPrintAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGSSInfoPrint"


    // $ANTLR start "entryRuleGSSEnvironmentPhyHeaderPrint"
    // InternalENVIRONMENT.g:1442:1: entryRuleGSSEnvironmentPhyHeaderPrint returns [EObject current=null] : iv_ruleGSSEnvironmentPhyHeaderPrint= ruleGSSEnvironmentPhyHeaderPrint EOF ;
    public final EObject entryRuleGSSEnvironmentPhyHeaderPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPhyHeaderPrint = null;


        try {
            // InternalENVIRONMENT.g:1442:69: (iv_ruleGSSEnvironmentPhyHeaderPrint= ruleGSSEnvironmentPhyHeaderPrint EOF )
            // InternalENVIRONMENT.g:1443:2: iv_ruleGSSEnvironmentPhyHeaderPrint= ruleGSSEnvironmentPhyHeaderPrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPhyHeaderPrint=ruleGSSEnvironmentPhyHeaderPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPhyHeaderPrint; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPhyHeaderPrint"


    // $ANTLR start "ruleGSSEnvironmentPhyHeaderPrint"
    // InternalENVIRONMENT.g:1449:1: ruleGSSEnvironmentPhyHeaderPrint returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSEnvironmentPhyHeaderPrint() throws RecognitionException {
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
            // InternalENVIRONMENT.g:1455:2: ( (otherlv_0= 'GSSEnvironmentPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:1456:2: (otherlv_0= 'GSSEnvironmentPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:1456:2: (otherlv_0= 'GSSEnvironmentPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:1457:3: otherlv_0= 'GSSEnvironmentPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'rawLog' otherlv_11= ':=' ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGSSEnvironmentPhyHeaderPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1473:3: ( (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1474:4: (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1474:4: (lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1475:5: lv_mainLog_4_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getMainLogGSSEnvironmentEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_mainLog_4_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"mainLog",
              						lv_mainLog_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1504:3: ( (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1505:4: (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1505:4: (lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1506:5: lv_portLogs_8_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getPortLogsGSSEnvironmentEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_portLogs_8_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"portLogs",
              						lv_portLogs_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1535:3: ( (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1536:4: (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1536:4: (lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1537:5: lv_rawLog_12_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRawLogGSSEnvironmentEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_rawLog_12_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"rawLog",
              						lv_rawLog_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:1566:3: ( (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1567:4: (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1567:4: (lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1568:5: lv_gssTabs_16_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getGssTabsGSSEnvironmentEnableDisableEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_gssTabs_16_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"gssTabs",
              						lv_gssTabs_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPhyHeaderPrintAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPhyHeaderPrint"


    // $ANTLR start "entryRuleGSSEnvironmentGSSDiscardErrorFlags"
    // InternalENVIRONMENT.g:1601:1: entryRuleGSSEnvironmentGSSDiscardErrorFlags returns [EObject current=null] : iv_ruleGSSEnvironmentGSSDiscardErrorFlags= ruleGSSEnvironmentGSSDiscardErrorFlags EOF ;
    public final EObject entryRuleGSSEnvironmentGSSDiscardErrorFlags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGSSDiscardErrorFlags = null;


        try {
            // InternalENVIRONMENT.g:1601:75: (iv_ruleGSSEnvironmentGSSDiscardErrorFlags= ruleGSSEnvironmentGSSDiscardErrorFlags EOF )
            // InternalENVIRONMENT.g:1602:2: iv_ruleGSSEnvironmentGSSDiscardErrorFlags= ruleGSSEnvironmentGSSDiscardErrorFlags EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGSSDiscardErrorFlags=ruleGSSEnvironmentGSSDiscardErrorFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGSSDiscardErrorFlags; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGSSDiscardErrorFlags"


    // $ANTLR start "ruleGSSEnvironmentGSSDiscardErrorFlags"
    // InternalENVIRONMENT.g:1608:1: ruleGSSEnvironmentGSSDiscardErrorFlags returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSEnvironmentGSSDiscardErrorFlags() throws RecognitionException {
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
            // InternalENVIRONMENT.g:1614:2: ( (otherlv_0= 'GSSEnvironmentDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:1615:2: (otherlv_0= 'GSSEnvironmentDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:1615:2: (otherlv_0= 'GSSEnvironmentDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:1616:3: otherlv_0= 'GSSEnvironmentDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getGSSEnvironmentDiscardErrorFlagsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1632:3: ( (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1633:4: (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1633:4: (lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1634:5: lv_txErrors_4_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getTxErrorsGSSEnvironmentEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_txErrors_4_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"txErrors",
              						lv_txErrors_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1663:3: ( (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1664:4: (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1664:4: (lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1665:5: lv_notExpectedPackets_8_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSEnvironmentEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_notExpectedPackets_8_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"notExpectedPackets",
              						lv_notExpectedPackets_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1694:3: ( (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1695:4: (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1695:4: (lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1696:5: lv_filtersKo_12_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getFiltersKoGSSEnvironmentEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_filtersKo_12_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"filtersKo",
              						lv_filtersKo_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:1725:3: ( (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:1726:4: (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:1726:4: (lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:1727:5: lv_validTimesKo_16_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getValidTimesKoGSSEnvironmentEnableDisableEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_validTimesKo_16_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"validTimesKo",
              						lv_validTimesKo_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGSSDiscardErrorFlags"


    // $ANTLR start "entryRuleGSSEnvironmentProtocol"
    // InternalENVIRONMENT.g:1760:1: entryRuleGSSEnvironmentProtocol returns [EObject current=null] : iv_ruleGSSEnvironmentProtocol= ruleGSSEnvironmentProtocol EOF ;
    public final EObject entryRuleGSSEnvironmentProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentProtocol = null;


        try {
            // InternalENVIRONMENT.g:1760:63: (iv_ruleGSSEnvironmentProtocol= ruleGSSEnvironmentProtocol EOF )
            // InternalENVIRONMENT.g:1761:2: iv_ruleGSSEnvironmentProtocol= ruleGSSEnvironmentProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentProtocolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentProtocol=ruleGSSEnvironmentProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentProtocol; 
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
    // $ANTLR end "entryRuleGSSEnvironmentProtocol"


    // $ANTLR start "ruleGSSEnvironmentProtocol"
    // InternalENVIRONMENT.g:1767:1: ruleGSSEnvironmentProtocol returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSEnvironmentProtocol() throws RecognitionException {
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

        AntlrDatatypeRuleToken lv_typeLevel_12_0 = null;

        AntlrDatatypeRuleToken lv_typeOffset_16_0 = null;

        AntlrDatatypeRuleToken lv_subtypeOffset_20_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1773:2: ( (otherlv_0= 'GSSEnvironmentProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalENVIRONMENT.g:1774:2: (otherlv_0= 'GSSEnvironmentProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalENVIRONMENT.g:1774:2: (otherlv_0= 'GSSEnvironmentProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalENVIRONMENT.g:1775:3: otherlv_0= 'GSSEnvironmentProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentProtocolAccess().getGSSEnvironmentProtocolKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentProtocolAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentProtocolAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1791:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:1792:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:1792:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:1793:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentProtocolAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:1822:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalENVIRONMENT.g:1823:4: (lv_name_8_0= RULE_ID )
            {
            // InternalENVIRONMENT.g:1823:4: (lv_name_8_0= RULE_ID )
            // InternalENVIRONMENT.g:1824:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentProtocolAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentProtocolRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:1852:3: ( (lv_typeLevel_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:1853:4: (lv_typeLevel_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:1853:4: (lv_typeLevel_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:1854:5: lv_typeLevel_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_typeLevel_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:1883:3: ( (lv_typeOffset_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:1884:4: (lv_typeOffset_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:1884:4: (lv_typeOffset_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:1885:5: lv_typeOffset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_typeOffset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
              					}
              					set(
              						current,
              						"typeOffset",
              						lv_typeOffset_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_17());
              		
            }
            // InternalENVIRONMENT.g:1906:3: (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalENVIRONMENT.g:1907:4: otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetKeyword_18_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentProtocolAccess().getColonEqualsSignKeyword_18_1());
                      			
                    }
                    // InternalENVIRONMENT.g:1915:4: ( (lv_subtypeOffset_20_0= ruleINTEGER ) )
                    // InternalENVIRONMENT.g:1916:5: (lv_subtypeOffset_20_0= ruleINTEGER )
                    {
                    // InternalENVIRONMENT.g:1916:5: (lv_subtypeOffset_20_0= ruleINTEGER )
                    // InternalENVIRONMENT.g:1917:6: lv_subtypeOffset_20_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_subtypeOffset_20_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentProtocolRule());
                      						}
                      						set(
                      							current,
                      							"subtypeOffset",
                      							lv_subtypeOffset_20_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_18_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentProtocolAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentProtocolAccess().getSemicolonKeyword_20());
              		
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
    // $ANTLR end "ruleGSSEnvironmentProtocol"


    // $ANTLR start "entryRuleGSSEnvironmentMainInterface"
    // InternalENVIRONMENT.g:1951:1: entryRuleGSSEnvironmentMainInterface returns [EObject current=null] : iv_ruleGSSEnvironmentMainInterface= ruleGSSEnvironmentMainInterface EOF ;
    public final EObject entryRuleGSSEnvironmentMainInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentMainInterface = null;


        try {
            // InternalENVIRONMENT.g:1951:68: (iv_ruleGSSEnvironmentMainInterface= ruleGSSEnvironmentMainInterface EOF )
            // InternalENVIRONMENT.g:1952:2: iv_ruleGSSEnvironmentMainInterface= ruleGSSEnvironmentMainInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentMainInterface=ruleGSSEnvironmentMainInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentMainInterface; 
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
    // $ANTLR end "entryRuleGSSEnvironmentMainInterface"


    // $ANTLR start "ruleGSSEnvironmentMainInterface"
    // InternalENVIRONMENT.g:1958:1: ruleGSSEnvironmentMainInterface returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? (otherlv_26= 'ProtocolPacketsFile' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? ( (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut ) )+ otherlv_31= '}' otherlv_32= ';' ) ;
    public final EObject ruleGSSEnvironmentMainInterface() throws RecognitionException {
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
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_ifType_12_0 = null;

        Enumerator lv_ioType_20_0 = null;

        EObject lv_LevelInOut_30_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:1964:2: ( (otherlv_0= 'GSSEnvironmentMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? (otherlv_26= 'ProtocolPacketsFile' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? ( (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut ) )+ otherlv_31= '}' otherlv_32= ';' ) )
            // InternalENVIRONMENT.g:1965:2: (otherlv_0= 'GSSEnvironmentMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? (otherlv_26= 'ProtocolPacketsFile' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? ( (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut ) )+ otherlv_31= '}' otherlv_32= ';' )
            {
            // InternalENVIRONMENT.g:1965:2: (otherlv_0= 'GSSEnvironmentMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? (otherlv_26= 'ProtocolPacketsFile' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? ( (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut ) )+ otherlv_31= '}' otherlv_32= ';' )
            // InternalENVIRONMENT.g:1966:3: otherlv_0= 'GSSEnvironmentMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? (otherlv_26= 'ProtocolPacketsFile' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? ( (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut ) )+ otherlv_31= '}' otherlv_32= ';'
            {
            otherlv_0=(Token)match(input,50,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getGSSEnvironmentMainInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:1982:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:1983:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:1983:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:1984:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2013:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2014:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2014:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2015:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentMainInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,51,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2043:3: ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) )
            // InternalENVIRONMENT.g:2044:4: (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType )
            {
            // InternalENVIRONMENT.g:2044:4: (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType )
            // InternalENVIRONMENT.g:2045:5: lv_ifType_12_0= ruleGSSEnvironmentInterfaceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifType_12_0=ruleGSSEnvironmentInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
              					}
              					set(
              						current,
              						"ifType",
              						lv_ifType_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,52,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:2074:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2075:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2075:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2076:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentMainInterfaceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:2105:3: ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) )
            // InternalENVIRONMENT.g:2106:4: (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType )
            {
            // InternalENVIRONMENT.g:2106:4: (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType )
            // InternalENVIRONMENT.g:2107:5: lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ioType_20_0=ruleGSSEnvironmentInterfaceIOType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
              					}
              					set(
              						current,
              						"ioType",
              						lv_ioType_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceIOType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:2128:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==54) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalENVIRONMENT.g:2129:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2137:4: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalENVIRONMENT.g:2138:5: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalENVIRONMENT.g:2138:5: ( ruleVersionedQualifiedReferenceName )
                    // InternalENVIRONMENT.g:2139:6: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentMainInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:2161:3: (otherlv_26= 'ProtocolPacketsFile' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==55) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalENVIRONMENT.g:2162:4: otherlv_26= 'ProtocolPacketsFile' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';'
                    {
                    otherlv_26=(Token)match(input,55,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileKeyword_23_0());
                      			
                    }
                    otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getColonEqualsSignKeyword_23_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2170:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:2171:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:2171:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:2172:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentMainInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_23_2_0());
                      					
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

                    otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_23_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:2194:3: ( (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==57) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalENVIRONMENT.g:2195:4: (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut )
            	    {
            	    // InternalENVIRONMENT.g:2195:4: (lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut )
            	    // InternalENVIRONMENT.g:2196:5: lv_LevelInOut_30_0= ruleGSSEnvironmentLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSEnvironmentMainInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_24_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
            	    lv_LevelInOut_30_0=ruleGSSEnvironmentLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentMainInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"LevelInOut",
            	      						lv_LevelInOut_30_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelInOut");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getRightCurlyBracketKeyword_25());
              		
            }
            otherlv_32=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSEnvironmentMainInterfaceAccess().getSemicolonKeyword_26());
              		
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
    // $ANTLR end "ruleGSSEnvironmentMainInterface"


    // $ANTLR start "entryRuleGSSEnvironmentInterface"
    // InternalENVIRONMENT.g:2225:1: entryRuleGSSEnvironmentInterface returns [EObject current=null] : iv_ruleGSSEnvironmentInterface= ruleGSSEnvironmentInterface EOF ;
    public final EObject entryRuleGSSEnvironmentInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentInterface = null;


        try {
            // InternalENVIRONMENT.g:2225:64: (iv_ruleGSSEnvironmentInterface= ruleGSSEnvironmentInterface EOF )
            // InternalENVIRONMENT.g:2226:2: iv_ruleGSSEnvironmentInterface= ruleGSSEnvironmentInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentInterface=ruleGSSEnvironmentInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentInterface; 
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
    // $ANTLR end "entryRuleGSSEnvironmentInterface"


    // $ANTLR start "ruleGSSEnvironmentInterface"
    // InternalENVIRONMENT.g:2232:1: ruleGSSEnvironmentInterface returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' ) ;
    public final EObject ruleGSSEnvironmentInterface() throws RecognitionException {
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
            // InternalENVIRONMENT.g:2238:2: ( (otherlv_0= 'GSSEnvironmentInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' ) )
            // InternalENVIRONMENT.g:2239:2: (otherlv_0= 'GSSEnvironmentInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' )
            {
            // InternalENVIRONMENT.g:2239:2: (otherlv_0= 'GSSEnvironmentInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' )
            // InternalENVIRONMENT.g:2240:3: otherlv_0= 'GSSEnvironmentInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentInterfaceAccess().getGSSEnvironmentInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2256:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2257:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2257:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2258:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2287:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2288:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2288:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2289:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,51,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2317:3: ( (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType ) )
            // InternalENVIRONMENT.g:2318:4: (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType )
            {
            // InternalENVIRONMENT.g:2318:4: (lv_ifType_12_0= ruleGSSEnvironmentInterfaceType )
            // InternalENVIRONMENT.g:2319:5: lv_ifType_12_0= ruleGSSEnvironmentInterfaceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfTypeGSSEnvironmentInterfaceTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifType_12_0=ruleGSSEnvironmentInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
              					}
              					set(
              						current,
              						"ifType",
              						lv_ifType_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,52,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:2348:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2349:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2349:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2350:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentInterfaceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:2379:3: ( (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType ) )
            // InternalENVIRONMENT.g:2380:4: (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType )
            {
            // InternalENVIRONMENT.g:2380:4: (lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType )
            // InternalENVIRONMENT.g:2381:5: lv_ioType_20_0= ruleGSSEnvironmentInterfaceIOType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getIoTypeGSSEnvironmentInterfaceIOTypeEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ioType_20_0=ruleGSSEnvironmentInterfaceIOType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
              					}
              					set(
              						current,
              						"ioType",
              						lv_ioType_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentInterfaceIOType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:2402:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalENVIRONMENT.g:2403:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2411:4: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalENVIRONMENT.g:2412:5: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalENVIRONMENT.g:2412:5: ( ruleVersionedQualifiedReferenceName )
                    // InternalENVIRONMENT.g:2413:6: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getProtocolIDGSSEnvironmentProtocolCrossReference_22_2_0());
                      					
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

                      				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:2435:3: ( ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=4;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt18=1;
                    }
                    break;
                case 63:
                    {
                    alt18=2;
                    }
                    break;
                case 64:
                    {
                    alt18=3;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // InternalENVIRONMENT.g:2436:4: ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) )
            	    {
            	    // InternalENVIRONMENT.g:2436:4: ( (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut ) )
            	    // InternalENVIRONMENT.g:2437:5: (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut )
            	    {
            	    // InternalENVIRONMENT.g:2437:5: (lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut )
            	    // InternalENVIRONMENT.g:2438:6: lv_LevelInOut_26_0= ruleGSSEnvironmentLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInOutGSSEnvironmentLevelInOutParserRuleCall_23_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_LevelInOut_26_0=ruleGSSEnvironmentLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelInOut",
            	      							lv_LevelInOut_26_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelInOut");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalENVIRONMENT.g:2456:4: ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) )
            	    {
            	    // InternalENVIRONMENT.g:2456:4: ( (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn ) )
            	    // InternalENVIRONMENT.g:2457:5: (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn )
            	    {
            	    // InternalENVIRONMENT.g:2457:5: (lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn )
            	    // InternalENVIRONMENT.g:2458:6: lv_LevelIn_27_0= ruleGSSEnvironmentLevelIn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelInGSSEnvironmentLevelInParserRuleCall_23_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_LevelIn_27_0=ruleGSSEnvironmentLevelIn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelIn",
            	      							lv_LevelIn_27_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelIn");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalENVIRONMENT.g:2476:4: ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) )
            	    {
            	    // InternalENVIRONMENT.g:2476:4: ( (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut ) )
            	    // InternalENVIRONMENT.g:2477:5: (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut )
            	    {
            	    // InternalENVIRONMENT.g:2477:5: (lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut )
            	    // InternalENVIRONMENT.g:2478:6: lv_LevelOut_28_0= ruleGSSEnvironmentLevelOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSEnvironmentInterfaceAccess().getLevelOutGSSEnvironmentLevelOutParserRuleCall_23_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_61);
            	    lv_LevelOut_28_0=ruleGSSEnvironmentLevelOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelOut",
            	      							lv_LevelOut_28_0,
            	      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentLevelOut");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            otherlv_29=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentInterfaceAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentInterfaceAccess().getSemicolonKeyword_25());
              		
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
    // $ANTLR end "ruleGSSEnvironmentInterface"


    // $ANTLR start "entryRuleGSSEnvironmentLevelInOut"
    // InternalENVIRONMENT.g:2508:1: entryRuleGSSEnvironmentLevelInOut returns [EObject current=null] : iv_ruleGSSEnvironmentLevelInOut= ruleGSSEnvironmentLevelInOut EOF ;
    public final EObject entryRuleGSSEnvironmentLevelInOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentLevelInOut = null;


        try {
            // InternalENVIRONMENT.g:2508:65: (iv_ruleGSSEnvironmentLevelInOut= ruleGSSEnvironmentLevelInOut EOF )
            // InternalENVIRONMENT.g:2509:2: iv_ruleGSSEnvironmentLevelInOut= ruleGSSEnvironmentLevelInOut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentLevelInOut=ruleGSSEnvironmentLevelInOut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentLevelInOut; 
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
    // $ANTLR end "entryRuleGSSEnvironmentLevelInOut"


    // $ANTLR start "ruleGSSEnvironmentLevelInOut"
    // InternalENVIRONMENT.g:2515:1: ruleGSSEnvironmentLevelInOut returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' ) ;
    public final EObject ruleGSSEnvironmentLevelInOut() throws RecognitionException {
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
            // InternalENVIRONMENT.g:2521:2: ( (otherlv_0= 'GSSEnvironmentLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' ) )
            // InternalENVIRONMENT.g:2522:2: (otherlv_0= 'GSSEnvironmentLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' )
            {
            // InternalENVIRONMENT.g:2522:2: (otherlv_0= 'GSSEnvironmentLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' )
            // InternalENVIRONMENT.g:2523:3: otherlv_0= 'GSSEnvironmentLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentLevelInOutAccess().getGSSEnvironmentLevelInOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentLevelInOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2539:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2540:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2540:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2541:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentLevelInOutRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2570:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2571:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2571:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2572:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2600:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2601:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2601:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2602:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0());
              				
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,59,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:2631:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2632:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2632:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2633:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getTCformatTMTCIFFormatFormatCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:2662:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2663:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2663:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2664:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_20_0());
              				
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:2685:3: (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==61) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalENVIRONMENT.g:2686:4: otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2694:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:2695:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:2695:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:2696:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:2718:3: (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==62) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalENVIRONMENT.g:2719:4: otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';'
                    {
                    otherlv_26=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0());
                      			
                    }
                    otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentLevelInOutAccess().getColonEqualsSignKeyword_23_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2727:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:2728:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:2728:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:2729:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentLevelInOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentLevelInOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_23_2_0());
                      					
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

                    otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_23_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentLevelInOutAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentLevelInOutAccess().getSemicolonKeyword_25());
              		
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
    // $ANTLR end "ruleGSSEnvironmentLevelInOut"


    // $ANTLR start "entryRuleGSSEnvironmentLevelIn"
    // InternalENVIRONMENT.g:2763:1: entryRuleGSSEnvironmentLevelIn returns [EObject current=null] : iv_ruleGSSEnvironmentLevelIn= ruleGSSEnvironmentLevelIn EOF ;
    public final EObject entryRuleGSSEnvironmentLevelIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentLevelIn = null;


        try {
            // InternalENVIRONMENT.g:2763:62: (iv_ruleGSSEnvironmentLevelIn= ruleGSSEnvironmentLevelIn EOF )
            // InternalENVIRONMENT.g:2764:2: iv_ruleGSSEnvironmentLevelIn= ruleGSSEnvironmentLevelIn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentLevelInRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentLevelIn=ruleGSSEnvironmentLevelIn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentLevelIn; 
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
    // $ANTLR end "entryRuleGSSEnvironmentLevelIn"


    // $ANTLR start "ruleGSSEnvironmentLevelIn"
    // InternalENVIRONMENT.g:2770:1: ruleGSSEnvironmentLevelIn returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSEnvironmentLevelIn() throws RecognitionException {
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
            // InternalENVIRONMENT.g:2776:2: ( (otherlv_0= 'GSSEnvironmentLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:2777:2: (otherlv_0= 'GSSEnvironmentLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:2777:2: (otherlv_0= 'GSSEnvironmentLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:2778:3: otherlv_0= 'GSSEnvironmentLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentLevelInAccess().getGSSEnvironmentLevelInKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentLevelInAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentLevelInAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2794:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2795:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2795:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2796:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentLevelInRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentLevelInAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2825:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2826:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2826:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2827:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentLevelInAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelInRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,59,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:2855:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:2856:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:2856:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:2857:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelInRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelInAccess().getTCformatTMTCIFFormatFormatCrossReference_12_0());
              				
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:2878:3: (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==61) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalENVIRONMENT.g:2879:4: otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentLevelInAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalENVIRONMENT.g:2887:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:2888:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:2888:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:2889:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentLevelInRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentLevelInAccess().getExport_to_prev_LevelTMTCIFExportExportCrossReference_14_2_0());
                      					
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

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentLevelInAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentLevelInAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSEnvironmentLevelIn"


    // $ANTLR start "entryRuleGSSEnvironmentLevelOut"
    // InternalENVIRONMENT.g:2923:1: entryRuleGSSEnvironmentLevelOut returns [EObject current=null] : iv_ruleGSSEnvironmentLevelOut= ruleGSSEnvironmentLevelOut EOF ;
    public final EObject entryRuleGSSEnvironmentLevelOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentLevelOut = null;


        try {
            // InternalENVIRONMENT.g:2923:63: (iv_ruleGSSEnvironmentLevelOut= ruleGSSEnvironmentLevelOut EOF )
            // InternalENVIRONMENT.g:2924:2: iv_ruleGSSEnvironmentLevelOut= ruleGSSEnvironmentLevelOut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentLevelOut=ruleGSSEnvironmentLevelOut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentLevelOut; 
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
    // $ANTLR end "entryRuleGSSEnvironmentLevelOut"


    // $ANTLR start "ruleGSSEnvironmentLevelOut"
    // InternalENVIRONMENT.g:2930:1: ruleGSSEnvironmentLevelOut returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSEnvironmentLevelOut() throws RecognitionException {
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
            // InternalENVIRONMENT.g:2936:2: ( (otherlv_0= 'GSSEnvironmentLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalENVIRONMENT.g:2937:2: (otherlv_0= 'GSSEnvironmentLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalENVIRONMENT.g:2937:2: (otherlv_0= 'GSSEnvironmentLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalENVIRONMENT.g:2938:3: otherlv_0= 'GSSEnvironmentLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentLevelOutAccess().getGSSEnvironmentLevelOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentLevelOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentLevelOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:2954:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:2955:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:2955:4: (lv_id_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:2956:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentLevelOutRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentLevelOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:2985:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:2986:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:2986:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:2987:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3015:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:3016:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:3016:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:3017:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getTMformatTMTCIFFormatFormatCrossReference_12_0());
              				
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3046:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:3047:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:3047:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:3048:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getInputFilterTMTCIFFilterFilterCrossReference_16_0());
              				
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

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_17());
              		
            }
            // InternalENVIRONMENT.g:3069:3: (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalENVIRONMENT.g:3070:4: otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelKeyword_18_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentLevelOutAccess().getColonEqualsSignKeyword_18_1());
                      			
                    }
                    // InternalENVIRONMENT.g:3078:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:3079:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:3079:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:3080:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentLevelOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentLevelOutAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_18_2_0());
                      					
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

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_18_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentLevelOutAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentLevelOutAccess().getSemicolonKeyword_20());
              		
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
    // $ANTLR end "ruleGSSEnvironmentLevelOut"


    // $ANTLR start "entryRuleGSSEnvironmentSpecialPacket"
    // InternalENVIRONMENT.g:3114:1: entryRuleGSSEnvironmentSpecialPacket returns [EObject current=null] : iv_ruleGSSEnvironmentSpecialPacket= ruleGSSEnvironmentSpecialPacket EOF ;
    public final EObject entryRuleGSSEnvironmentSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentSpecialPacket = null;


        try {
            // InternalENVIRONMENT.g:3114:68: (iv_ruleGSSEnvironmentSpecialPacket= ruleGSSEnvironmentSpecialPacket EOF )
            // InternalENVIRONMENT.g:3115:2: iv_ruleGSSEnvironmentSpecialPacket= ruleGSSEnvironmentSpecialPacket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentSpecialPacket=ruleGSSEnvironmentSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentSpecialPacket; 
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
    // $ANTLR end "entryRuleGSSEnvironmentSpecialPacket"


    // $ANTLR start "ruleGSSEnvironmentSpecialPacket"
    // InternalENVIRONMENT.g:3121:1: ruleGSSEnvironmentSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSEnvironmentPrintingData ) ) ( ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' ) ;
    public final EObject ruleGSSEnvironmentSpecialPacket() throws RecognitionException {
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
            // InternalENVIRONMENT.g:3127:2: ( (otherlv_0= 'GSSEnvironmentSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSEnvironmentPrintingData ) ) ( ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' ) )
            // InternalENVIRONMENT.g:3128:2: (otherlv_0= 'GSSEnvironmentSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSEnvironmentPrintingData ) ) ( ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' )
            {
            // InternalENVIRONMENT.g:3128:2: (otherlv_0= 'GSSEnvironmentSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSEnvironmentPrintingData ) ) ( ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' )
            // InternalENVIRONMENT.g:3129:3: otherlv_0= 'GSSEnvironmentSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSEnvironmentPrintingData ) ) ( ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getGSSEnvironmentSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,66,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3145:3: ( (lv_status_4_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:3146:4: (lv_status_4_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:3146:4: (lv_status_4_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:3147:5: lv_status_4_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_status_4_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
              					}
              					set(
              						current,
              						"status",
              						lv_status_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:3176:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:3177:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:3177:4: (lv_name_8_0= RULE_STRING )
            // InternalENVIRONMENT.g:3178:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentSpecialPacketRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3206:3: ( (lv_id_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3207:4: (lv_id_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3207:4: (lv_id_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3208:5: lv_id_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3237:3: ( (lv_ifRef_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3238:4: (lv_ifRef_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3238:4: (lv_ifRef_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3239:5: lv_ifRef_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:3268:3: ( (lv_levels_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3269:4: (lv_levels_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3269:4: (lv_levels_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3270:5: lv_levels_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levels_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalENVIRONMENT.g:3299:3: ( (lv_levelRef_24_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3300:4: (lv_levelRef_24_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3300:4: (lv_levelRef_24_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3301:5: lv_levelRef_24_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levelRef_24_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_25());
              		
            }
            otherlv_26=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getColonEqualsSignKeyword_27());
              		
            }
            // InternalENVIRONMENT.g:3330:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:3331:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:3331:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:3332:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentSpecialPacketRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getInputFilterTMTCIFFilterFilterCrossReference_28_0());
              				
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_29());
              		
            }
            // InternalENVIRONMENT.g:3353:3: ( (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==70) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalENVIRONMENT.g:3354:4: (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels )
                    {
                    // InternalENVIRONMENT.g:3354:4: (lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels )
                    // InternalENVIRONMENT.g:3355:5: lv_UpperLevels_30_0= ruleGSSEnvironmentUpperLevels
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getUpperLevelsGSSEnvironmentUpperLevelsParserRuleCall_30_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_72);
                    lv_UpperLevels_30_0=ruleGSSEnvironmentUpperLevels();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
                      					}
                      					add(
                      						current,
                      						"UpperLevels",
                      						lv_UpperLevels_30_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevels");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalENVIRONMENT.g:3372:3: ( (lv_printingData_31_0= ruleGSSEnvironmentPrintingData ) )
            // InternalENVIRONMENT.g:3373:4: (lv_printingData_31_0= ruleGSSEnvironmentPrintingData )
            {
            // InternalENVIRONMENT.g:3373:4: (lv_printingData_31_0= ruleGSSEnvironmentPrintingData )
            // InternalENVIRONMENT.g:3374:5: lv_printingData_31_0= ruleGSSEnvironmentPrintingData
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPrintingDataGSSEnvironmentPrintingDataParserRuleCall_31_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_73);
            lv_printingData_31_0=ruleGSSEnvironmentPrintingData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
              					}
              					set(
              						current,
              						"printingData",
              						lv_printingData_31_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPrintingData");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalENVIRONMENT.g:3391:3: ( ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) ) )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==73) ) {
                alt24=1;
            }
            else if ( (LA24_0==78) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalENVIRONMENT.g:3392:4: ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) )
                    {
                    // InternalENVIRONMENT.g:3392:4: ( (lv_period_32_0= ruleGSSEnvironmentPeriod ) )
                    // InternalENVIRONMENT.g:3393:5: (lv_period_32_0= ruleGSSEnvironmentPeriod )
                    {
                    // InternalENVIRONMENT.g:3393:5: (lv_period_32_0= ruleGSSEnvironmentPeriod )
                    // InternalENVIRONMENT.g:3394:6: lv_period_32_0= ruleGSSEnvironmentPeriod
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getPeriodGSSEnvironmentPeriodParserRuleCall_32_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_period_32_0=ruleGSSEnvironmentPeriod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"period",
                      							lv_period_32_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentPeriod");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:3412:4: ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) )
                    {
                    // InternalENVIRONMENT.g:3412:4: ( (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange ) )
                    // InternalENVIRONMENT.g:3413:5: (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange )
                    {
                    // InternalENVIRONMENT.g:3413:5: (lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange )
                    // InternalENVIRONMENT.g:3414:6: lv_intervalRange_33_0= ruleGSSEnvironmentIntervalRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentSpecialPacketAccess().getIntervalRangeGSSEnvironmentIntervalRangeParserRuleCall_32_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_intervalRange_33_0=ruleGSSEnvironmentIntervalRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"intervalRange",
                      							lv_intervalRange_33_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentIntervalRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_34=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getRightCurlyBracketKeyword_33());
              		
            }
            otherlv_35=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_35, grammarAccess.getGSSEnvironmentSpecialPacketAccess().getSemicolonKeyword_34());
              		
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
    // $ANTLR end "ruleGSSEnvironmentSpecialPacket"


    // $ANTLR start "entryRuleGSSEnvironmentUpperLevels"
    // InternalENVIRONMENT.g:3444:1: entryRuleGSSEnvironmentUpperLevels returns [EObject current=null] : iv_ruleGSSEnvironmentUpperLevels= ruleGSSEnvironmentUpperLevels EOF ;
    public final EObject entryRuleGSSEnvironmentUpperLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentUpperLevels = null;


        try {
            // InternalENVIRONMENT.g:3444:66: (iv_ruleGSSEnvironmentUpperLevels= ruleGSSEnvironmentUpperLevels EOF )
            // InternalENVIRONMENT.g:3445:2: iv_ruleGSSEnvironmentUpperLevels= ruleGSSEnvironmentUpperLevels EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentUpperLevels=ruleGSSEnvironmentUpperLevels();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentUpperLevels; 
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
    // $ANTLR end "entryRuleGSSEnvironmentUpperLevels"


    // $ANTLR start "ruleGSSEnvironmentUpperLevels"
    // InternalENVIRONMENT.g:3451:1: ruleGSSEnvironmentUpperLevels returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSEnvironmentUpperLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_UpperLevel_2_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:3457:2: ( (otherlv_0= 'GSSEnvironmentUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalENVIRONMENT.g:3458:2: (otherlv_0= 'GSSEnvironmentUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalENVIRONMENT.g:3458:2: (otherlv_0= 'GSSEnvironmentUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalENVIRONMENT.g:3459:3: otherlv_0= 'GSSEnvironmentUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getGSSEnvironmentUpperLevelsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalENVIRONMENT.g:3467:3: ( (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==83) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalENVIRONMENT.g:3468:4: (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel )
            	    {
            	    // InternalENVIRONMENT.g:3468:4: (lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel )
            	    // InternalENVIRONMENT.g:3469:5: lv_UpperLevel_2_0= ruleGSSEnvironmentUpperLevel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelsAccess().getUpperLevelGSSEnvironmentUpperLevelParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_75);
            	    lv_UpperLevel_2_0=ruleGSSEnvironmentUpperLevel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentUpperLevelsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"UpperLevel",
            	      						lv_UpperLevel_2_0,
            	      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevel");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentUpperLevelsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSEnvironmentUpperLevels"


    // $ANTLR start "entryRuleGSSEnvironmentPrintingData"
    // InternalENVIRONMENT.g:3498:1: entryRuleGSSEnvironmentPrintingData returns [EObject current=null] : iv_ruleGSSEnvironmentPrintingData= ruleGSSEnvironmentPrintingData EOF ;
    public final EObject entryRuleGSSEnvironmentPrintingData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPrintingData = null;


        try {
            // InternalENVIRONMENT.g:3498:67: (iv_ruleGSSEnvironmentPrintingData= ruleGSSEnvironmentPrintingData EOF )
            // InternalENVIRONMENT.g:3499:2: iv_ruleGSSEnvironmentPrintingData= ruleGSSEnvironmentPrintingData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPrintingDataRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPrintingData=ruleGSSEnvironmentPrintingData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPrintingData; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPrintingData"


    // $ANTLR start "ruleGSSEnvironmentPrintingData"
    // InternalENVIRONMENT.g:3505:1: ruleGSSEnvironmentPrintingData returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSEnvironmentPrintingData() throws RecognitionException {
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
            // InternalENVIRONMENT.g:3511:2: ( (otherlv_0= 'GSSEnvironmentPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) )
            // InternalENVIRONMENT.g:3512:2: (otherlv_0= 'GSSEnvironmentPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalENVIRONMENT.g:3512:2: (otherlv_0= 'GSSEnvironmentPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            // InternalENVIRONMENT.g:3513:3: otherlv_0= 'GSSEnvironmentPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData ) )? otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPrintingDataAccess().getGSSEnvironmentPrintingDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPrintingDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,72,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPrintingDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3529:3: ( (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable ) )
            // InternalENVIRONMENT.g:3530:4: (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable )
            {
            // InternalENVIRONMENT.g:3530:4: (lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable )
            // InternalENVIRONMENT.g:3531:5: lv_printStatus_4_0= ruleGSSEnvironmentEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPrintingDataAccess().getPrintStatusGSSEnvironmentEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_printStatus_4_0=ruleGSSEnvironmentEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPrintingDataRule());
              					}
              					set(
              						current,
              						"printStatus",
              						lv_printStatus_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:3552:3: ( (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==85) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalENVIRONMENT.g:3553:4: (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData )
                    {
                    // InternalENVIRONMENT.g:3553:4: (lv_structuredData_6_0= ruleGSSEnvironmentStructuredData )
                    // InternalENVIRONMENT.g:3554:5: lv_structuredData_6_0= ruleGSSEnvironmentStructuredData
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSEnvironmentPrintingDataAccess().getStructuredDataGSSEnvironmentStructuredDataParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_structuredData_6_0=ruleGSSEnvironmentStructuredData();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPrintingDataRule());
                      					}
                      					set(
                      						current,
                      						"structuredData",
                      						lv_structuredData_6_0,
                      						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentStructuredData");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPrintingDataAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSEnvironmentPrintingDataAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPrintingData"


    // $ANTLR start "entryRuleGSSEnvironmentPeriod"
    // InternalENVIRONMENT.g:3583:1: entryRuleGSSEnvironmentPeriod returns [EObject current=null] : iv_ruleGSSEnvironmentPeriod= ruleGSSEnvironmentPeriod EOF ;
    public final EObject entryRuleGSSEnvironmentPeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPeriod = null;


        try {
            // InternalENVIRONMENT.g:3583:61: (iv_ruleGSSEnvironmentPeriod= ruleGSSEnvironmentPeriod EOF )
            // InternalENVIRONMENT.g:3584:2: iv_ruleGSSEnvironmentPeriod= ruleGSSEnvironmentPeriod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPeriodRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPeriod=ruleGSSEnvironmentPeriod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPeriod; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPeriod"


    // $ANTLR start "ruleGSSEnvironmentPeriod"
    // InternalENVIRONMENT.g:3590:1: ruleGSSEnvironmentPeriod returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSEnvironmentUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSEnvironmentPeriod() throws RecognitionException {
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
            // InternalENVIRONMENT.g:3596:2: ( (otherlv_0= 'GSSEnvironmentPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSEnvironmentUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:3597:2: (otherlv_0= 'GSSEnvironmentPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSEnvironmentUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:3597:2: (otherlv_0= 'GSSEnvironmentPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSEnvironmentUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:3598:3: otherlv_0= 'GSSEnvironmentPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSEnvironmentUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodAccess().getGSSEnvironmentPeriodKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3614:3: ( (lv_min_value_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3615:4: (lv_min_value_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3615:4: (lv_min_value_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3616:5: lv_min_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,75,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:3645:3: ( (lv_min_unit_8_0= ruleGSSEnvironmentUnit ) )
            // InternalENVIRONMENT.g:3646:4: (lv_min_unit_8_0= ruleGSSEnvironmentUnit )
            {
            // InternalENVIRONMENT.g:3646:4: (lv_min_unit_8_0= ruleGSSEnvironmentUnit )
            // InternalENVIRONMENT.g:3647:5: lv_min_unit_8_0= ruleGSSEnvironmentUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMin_unitGSSEnvironmentUnitEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_unit_8_0=ruleGSSEnvironmentUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
              					}
              					set(
              						current,
              						"min_unit",
              						lv_min_unit_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3676:3: ( (lv_max_value_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3677:4: (lv_max_value_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3677:4: (lv_max_value_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3678:5: lv_max_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,77,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3707:3: ( (lv_max_unit_16_0= ruleGSSEnvironmentUnit ) )
            // InternalENVIRONMENT.g:3708:4: (lv_max_unit_16_0= ruleGSSEnvironmentUnit )
            {
            // InternalENVIRONMENT.g:3708:4: (lv_max_unit_16_0= ruleGSSEnvironmentUnit )
            // InternalENVIRONMENT.g:3709:5: lv_max_unit_16_0= ruleGSSEnvironmentUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodAccess().getMax_unitGSSEnvironmentUnitEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_unit_16_0=ruleGSSEnvironmentUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodRule());
              					}
              					set(
              						current,
              						"max_unit",
              						lv_max_unit_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPeriod"


    // $ANTLR start "entryRuleGSSEnvironmentIntervalRange"
    // InternalENVIRONMENT.g:3742:1: entryRuleGSSEnvironmentIntervalRange returns [EObject current=null] : iv_ruleGSSEnvironmentIntervalRange= ruleGSSEnvironmentIntervalRange EOF ;
    public final EObject entryRuleGSSEnvironmentIntervalRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentIntervalRange = null;


        try {
            // InternalENVIRONMENT.g:3742:68: (iv_ruleGSSEnvironmentIntervalRange= ruleGSSEnvironmentIntervalRange EOF )
            // InternalENVIRONMENT.g:3743:2: iv_ruleGSSEnvironmentIntervalRange= ruleGSSEnvironmentIntervalRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentIntervalRange=ruleGSSEnvironmentIntervalRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentIntervalRange; 
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
    // $ANTLR end "entryRuleGSSEnvironmentIntervalRange"


    // $ANTLR start "ruleGSSEnvironmentIntervalRange"
    // InternalENVIRONMENT.g:3749:1: ruleGSSEnvironmentIntervalRange returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSEnvironmentIntervalRange() throws RecognitionException {
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
            // InternalENVIRONMENT.g:3755:2: ( (otherlv_0= 'GSSEnvironmentIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:3756:2: (otherlv_0= 'GSSEnvironmentIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:3756:2: (otherlv_0= 'GSSEnvironmentIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:3757:3: otherlv_0= 'GSSEnvironmentIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSEnvironmentUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getGSSEnvironmentIntervalRangeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,79,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3773:3: ( (lv_min_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3774:4: (lv_min_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3774:4: (lv_min_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3775:5: lv_min_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,80,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:3804:3: ( (lv_max_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3805:4: (lv_max_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3805:4: (lv_max_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3806:5: lv_max_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,81,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:3835:3: ( (lv_interval_value_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:3836:4: (lv_interval_value_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:3836:4: (lv_interval_value_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:3837:5: lv_interval_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_interval_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,82,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:3866:3: ( (lv_interval_unit_16_0= ruleGSSEnvironmentUnit ) )
            // InternalENVIRONMENT.g:3867:4: (lv_interval_unit_16_0= ruleGSSEnvironmentUnit )
            {
            // InternalENVIRONMENT.g:3867:4: (lv_interval_unit_16_0= ruleGSSEnvironmentUnit )
            // InternalENVIRONMENT.g:3868:5: lv_interval_unit_16_0= ruleGSSEnvironmentUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentIntervalRangeAccess().getInterval_unitGSSEnvironmentUnitEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_interval_unit_16_0=ruleGSSEnvironmentUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentIntervalRangeRule());
              					}
              					set(
              						current,
              						"interval_unit",
              						lv_interval_unit_16_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentIntervalRangeAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSEnvironmentIntervalRange"


    // $ANTLR start "entryRuleGSSEnvironmentUpperLevel"
    // InternalENVIRONMENT.g:3901:1: entryRuleGSSEnvironmentUpperLevel returns [EObject current=null] : iv_ruleGSSEnvironmentUpperLevel= ruleGSSEnvironmentUpperLevel EOF ;
    public final EObject entryRuleGSSEnvironmentUpperLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentUpperLevel = null;


        try {
            // InternalENVIRONMENT.g:3901:65: (iv_ruleGSSEnvironmentUpperLevel= ruleGSSEnvironmentUpperLevel EOF )
            // InternalENVIRONMENT.g:3902:2: iv_ruleGSSEnvironmentUpperLevel= ruleGSSEnvironmentUpperLevel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentUpperLevel=ruleGSSEnvironmentUpperLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentUpperLevel; 
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
    // $ANTLR end "entryRuleGSSEnvironmentUpperLevel"


    // $ANTLR start "ruleGSSEnvironmentUpperLevel"
    // InternalENVIRONMENT.g:3908:1: ruleGSSEnvironmentUpperLevel returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSEnvironmentUpperLevel() throws RecognitionException {
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
            // InternalENVIRONMENT.g:3914:2: ( (otherlv_0= 'GSSEnvironmentUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalENVIRONMENT.g:3915:2: (otherlv_0= 'GSSEnvironmentUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalENVIRONMENT.g:3915:2: (otherlv_0= 'GSSEnvironmentUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalENVIRONMENT.g:3916:3: otherlv_0= 'GSSEnvironmentUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentUpperLevelAccess().getGSSEnvironmentUpperLevelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentUpperLevelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:3932:3: ( (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel ) )
            // InternalENVIRONMENT.g:3933:4: (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel )
            {
            // InternalENVIRONMENT.g:3933:4: (lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel )
            // InternalENVIRONMENT.g:3934:5: lv_level_4_0= ruleGSSEnvironmentUpperLevelLevel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getLevelGSSEnvironmentUpperLevelLevelEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_4_0=ruleGSSEnvironmentUpperLevelLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentUpperLevelRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUpperLevelLevel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:3955:3: (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalENVIRONMENT.g:3956:4: otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,58,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalENVIRONMENT.g:3964:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:3965:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:3965:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:3966:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getTMformatTMTCIFFormatFormatCrossReference_6_2_0());
                      					
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

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_90); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:3988:3: (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==60) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalENVIRONMENT.g:3989:4: otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterKeyword_7_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_7_1());
                      			
                    }
                    // InternalENVIRONMENT.g:3997:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:3998:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:3998:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:3999:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getInputFilterTMTCIFFilterFilterCrossReference_7_2_0());
                      					
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

                      				newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_7_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4021:3: (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalENVIRONMENT.g:4022:4: otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentUpperLevelAccess().getColonEqualsSignKeyword_8_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4030:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4031:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4031:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4032:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentUpperLevelAccess().getImport_from_prev_LevelTMTCIFImportImportCrossReference_8_2_0());
                      					
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

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_8_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentUpperLevelAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentUpperLevelAccess().getSemicolonKeyword_10());
              		
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
    // $ANTLR end "ruleGSSEnvironmentUpperLevel"


    // $ANTLR start "entryRuleGSSEnvironmentStructuredData"
    // InternalENVIRONMENT.g:4066:1: entryRuleGSSEnvironmentStructuredData returns [EObject current=null] : iv_ruleGSSEnvironmentStructuredData= ruleGSSEnvironmentStructuredData EOF ;
    public final EObject entryRuleGSSEnvironmentStructuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentStructuredData = null;


        try {
            // InternalENVIRONMENT.g:4066:69: (iv_ruleGSSEnvironmentStructuredData= ruleGSSEnvironmentStructuredData EOF )
            // InternalENVIRONMENT.g:4067:2: iv_ruleGSSEnvironmentStructuredData= ruleGSSEnvironmentStructuredData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentStructuredDataRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentStructuredData=ruleGSSEnvironmentStructuredData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentStructuredData; 
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
    // $ANTLR end "entryRuleGSSEnvironmentStructuredData"


    // $ANTLR start "ruleGSSEnvironmentStructuredData"
    // InternalENVIRONMENT.g:4073:1: ruleGSSEnvironmentStructuredData returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSEnvironmentStructuredData() throws RecognitionException {
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
            // InternalENVIRONMENT.g:4079:2: ( (otherlv_0= 'GSSEnvironmentStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalENVIRONMENT.g:4080:2: (otherlv_0= 'GSSEnvironmentStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalENVIRONMENT.g:4080:2: (otherlv_0= 'GSSEnvironmentStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalENVIRONMENT.g:4081:3: otherlv_0= 'GSSEnvironmentStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentStructuredDataAccess().getGSSEnvironmentStructuredDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentStructuredDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4097:3: ( (lv_levelRef_4_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4098:4: (lv_levelRef_4_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4098:4: (lv_levelRef_4_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4099:5: lv_levelRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levelRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentStructuredDataRule());
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,86,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentStructuredDataAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:4128:3: ( (lv_firstField_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4129:4: (lv_firstField_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4129:4: (lv_firstField_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4130:5: lv_firstField_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstField_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentStructuredDataRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentStructuredDataAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentStructuredDataAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSEnvironmentStructuredData"


    // $ANTLR start "entryRuleGSSEnvironmentPeriodicTCLevel2"
    // InternalENVIRONMENT.g:4163:1: entryRuleGSSEnvironmentPeriodicTCLevel2 returns [EObject current=null] : iv_ruleGSSEnvironmentPeriodicTCLevel2= ruleGSSEnvironmentPeriodicTCLevel2 EOF ;
    public final EObject entryRuleGSSEnvironmentPeriodicTCLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPeriodicTCLevel2 = null;


        try {
            // InternalENVIRONMENT.g:4163:71: (iv_ruleGSSEnvironmentPeriodicTCLevel2= ruleGSSEnvironmentPeriodicTCLevel2 EOF )
            // InternalENVIRONMENT.g:4164:2: iv_ruleGSSEnvironmentPeriodicTCLevel2= ruleGSSEnvironmentPeriodicTCLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPeriodicTCLevel2=ruleGSSEnvironmentPeriodicTCLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPeriodicTCLevel2; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPeriodicTCLevel2"


    // $ANTLR start "ruleGSSEnvironmentPeriodicTCLevel2"
    // InternalENVIRONMENT.g:4170:1: ruleGSSEnvironmentPeriodicTCLevel2 returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' ) ;
    public final EObject ruleGSSEnvironmentPeriodicTCLevel2() throws RecognitionException {
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
            // InternalENVIRONMENT.g:4176:2: ( (otherlv_0= 'GSSEnvironmentPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' ) )
            // InternalENVIRONMENT.g:4177:2: (otherlv_0= 'GSSEnvironmentPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' )
            {
            // InternalENVIRONMENT.g:4177:2: (otherlv_0= 'GSSEnvironmentPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' )
            // InternalENVIRONMENT.g:4178:3: otherlv_0= 'GSSEnvironmentPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';'
            {
            otherlv_0=(Token)match(input,87,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getGSSEnvironmentPeriodicTCLevel2Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4194:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:4195:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:4195:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:4196:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:4224:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4225:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4225:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4226:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:4255:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4256:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4256:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4257:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:4286:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4287:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4287:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4288:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:4317:3: ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) )
            // InternalENVIRONMENT.g:4318:4: (lv_period_unit_20_0= ruleGSSEnvironmentUnit )
            {
            // InternalENVIRONMENT.g:4318:4: (lv_period_unit_20_0= ruleGSSEnvironmentUnit )
            // InternalENVIRONMENT.g:4319:5: lv_period_unit_20_0= ruleGSSEnvironmentUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSEnvironmentUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:4340:3: (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==90) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalENVIRONMENT.g:4341:4: otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4349:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4350:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4350:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4351:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2TMTCIFFormatFormatCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_95); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,91,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalENVIRONMENT.g:4381:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:4382:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:4382:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:4383:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getApp_to_level2TMTCIFExportExportCrossReference_25_0());
              				
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_96); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_26());
              		
            }
            // InternalENVIRONMENT.g:4404:3: (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==92) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalENVIRONMENT.g:4405:4: otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';'
                    {
                    otherlv_30=(Token)match(input,92,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1Keyword_27_0());
                      			
                    }
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4413:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4414:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4414:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4415:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1TMTCIFFormatFormatCrossReference_27_2_0());
                      					
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

                    otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_97); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_27_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4437:3: (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==93) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalENVIRONMENT.g:4438:4: otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';'
                    {
                    otherlv_34=(Token)match(input,93,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0());
                      			
                    }
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4446:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4447:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4447:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4448:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel2_to_level1TMTCIFExportExportCrossReference_28_2_0());
                      					
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

                    otherlv_37=(Token)match(input,14,FollowSets000.FOLLOW_98); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_28_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4470:3: (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==94) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalENVIRONMENT.g:4471:4: otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';'
                    {
                    otherlv_38=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0Keyword_29_0());
                      			
                    }
                    otherlv_39=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4479:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4480:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4480:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4481:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel0TMTCIFFormatFormatCrossReference_29_2_0());
                      					
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

                    otherlv_41=(Token)match(input,14,FollowSets000.FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_29_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4503:3: (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==95) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalENVIRONMENT.g:4504:4: otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';'
                    {
                    otherlv_42=(Token)match(input,95,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0());
                      			
                    }
                    otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4512:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4513:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4513:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4514:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getLevel1_to_level0TMTCIFExportExportCrossReference_30_2_0());
                      					
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

                    otherlv_45=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_30_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_46=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_46, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_47=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_47, grammarAccess.getGSSEnvironmentPeriodicTCLevel2Access().getSemicolonKeyword_32());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPeriodicTCLevel2"


    // $ANTLR start "entryRuleGSSEnvironmentPeriodicTCLevel1"
    // InternalENVIRONMENT.g:4548:1: entryRuleGSSEnvironmentPeriodicTCLevel1 returns [EObject current=null] : iv_ruleGSSEnvironmentPeriodicTCLevel1= ruleGSSEnvironmentPeriodicTCLevel1 EOF ;
    public final EObject entryRuleGSSEnvironmentPeriodicTCLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPeriodicTCLevel1 = null;


        try {
            // InternalENVIRONMENT.g:4548:71: (iv_ruleGSSEnvironmentPeriodicTCLevel1= ruleGSSEnvironmentPeriodicTCLevel1 EOF )
            // InternalENVIRONMENT.g:4549:2: iv_ruleGSSEnvironmentPeriodicTCLevel1= ruleGSSEnvironmentPeriodicTCLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPeriodicTCLevel1=ruleGSSEnvironmentPeriodicTCLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPeriodicTCLevel1; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPeriodicTCLevel1"


    // $ANTLR start "ruleGSSEnvironmentPeriodicTCLevel1"
    // InternalENVIRONMENT.g:4555:1: ruleGSSEnvironmentPeriodicTCLevel1 returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' ) ;
    public final EObject ruleGSSEnvironmentPeriodicTCLevel1() throws RecognitionException {
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
            // InternalENVIRONMENT.g:4561:2: ( (otherlv_0= 'GSSEnvironmentPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' ) )
            // InternalENVIRONMENT.g:4562:2: (otherlv_0= 'GSSEnvironmentPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' )
            {
            // InternalENVIRONMENT.g:4562:2: (otherlv_0= 'GSSEnvironmentPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' )
            // InternalENVIRONMENT.g:4563:3: otherlv_0= 'GSSEnvironmentPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';'
            {
            otherlv_0=(Token)match(input,96,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getGSSEnvironmentPeriodicTCLevel1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4579:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:4580:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:4580:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:4581:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:4609:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4610:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4610:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4611:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:4640:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4641:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4641:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4642:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:4671:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4672:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4672:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4673:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:4702:3: ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) )
            // InternalENVIRONMENT.g:4703:4: (lv_period_unit_20_0= ruleGSSEnvironmentUnit )
            {
            // InternalENVIRONMENT.g:4703:4: (lv_period_unit_20_0= ruleGSSEnvironmentUnit )
            // InternalENVIRONMENT.g:4704:5: lv_period_unit_20_0= ruleGSSEnvironmentUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSEnvironmentUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:4725:3: (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==92) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalENVIRONMENT.g:4726:4: otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,92,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4734:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4735:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4735:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4736:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1TMTCIFFormatFormatCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,97,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalENVIRONMENT.g:4766:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:4767:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:4767:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:4768:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getApp_to_level1TMTCIFExportExportCrossReference_25_0());
              				
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

              			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_26());
              		
            }
            // InternalENVIRONMENT.g:4789:3: (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==94) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalENVIRONMENT.g:4790:4: otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';'
                    {
                    otherlv_30=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0Keyword_27_0());
                      			
                    }
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4798:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4799:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4799:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4800:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel0TMTCIFFormatFormatCrossReference_27_2_0());
                      					
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

                      				newLeafNode(otherlv_33, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_27_3());
                      			
                    }

                    }
                    break;

            }

            // InternalENVIRONMENT.g:4822:3: (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==95) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalENVIRONMENT.g:4823:4: otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';'
                    {
                    otherlv_34=(Token)match(input,95,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0());
                      			
                    }
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1());
                      			
                    }
                    // InternalENVIRONMENT.g:4831:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:4832:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:4832:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:4833:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getLevel1_to_level0TMTCIFExportExportCrossReference_28_2_0());
                      					
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

                    otherlv_37=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_28_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_38=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_38, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29());
              		
            }
            otherlv_39=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_39, grammarAccess.getGSSEnvironmentPeriodicTCLevel1Access().getSemicolonKeyword_30());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPeriodicTCLevel1"


    // $ANTLR start "entryRuleGSSEnvironmentPeriodicTCLevel0"
    // InternalENVIRONMENT.g:4867:1: entryRuleGSSEnvironmentPeriodicTCLevel0 returns [EObject current=null] : iv_ruleGSSEnvironmentPeriodicTCLevel0= ruleGSSEnvironmentPeriodicTCLevel0 EOF ;
    public final EObject entryRuleGSSEnvironmentPeriodicTCLevel0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPeriodicTCLevel0 = null;


        try {
            // InternalENVIRONMENT.g:4867:71: (iv_ruleGSSEnvironmentPeriodicTCLevel0= ruleGSSEnvironmentPeriodicTCLevel0 EOF )
            // InternalENVIRONMENT.g:4868:2: iv_ruleGSSEnvironmentPeriodicTCLevel0= ruleGSSEnvironmentPeriodicTCLevel0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPeriodicTCLevel0=ruleGSSEnvironmentPeriodicTCLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPeriodicTCLevel0; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPeriodicTCLevel0"


    // $ANTLR start "ruleGSSEnvironmentPeriodicTCLevel0"
    // InternalENVIRONMENT.g:4874:1: ruleGSSEnvironmentPeriodicTCLevel0 returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' ) ;
    public final EObject ruleGSSEnvironmentPeriodicTCLevel0() throws RecognitionException {
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
            // InternalENVIRONMENT.g:4880:2: ( (otherlv_0= 'GSSEnvironmentPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' ) )
            // InternalENVIRONMENT.g:4881:2: (otherlv_0= 'GSSEnvironmentPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' )
            {
            // InternalENVIRONMENT.g:4881:2: (otherlv_0= 'GSSEnvironmentPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' )
            // InternalENVIRONMENT.g:4882:3: otherlv_0= 'GSSEnvironmentPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getGSSEnvironmentPeriodicTCLevel0Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:4898:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:4899:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:4899:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:4900:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:4928:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4929:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4929:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4930:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:4959:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4960:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4960:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4961:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:4990:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:4991:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:4991:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:4992:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:5021:3: ( (lv_period_unit_20_0= ruleGSSEnvironmentUnit ) )
            // InternalENVIRONMENT.g:5022:4: (lv_period_unit_20_0= ruleGSSEnvironmentUnit )
            {
            // InternalENVIRONMENT.g:5022:4: (lv_period_unit_20_0= ruleGSSEnvironmentUnit )
            // InternalENVIRONMENT.g:5023:5: lv_period_unit_20_0= ruleGSSEnvironmentUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSEnvironmentUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_102); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_21());
              		
            }
            // InternalENVIRONMENT.g:5044:3: (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==94) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalENVIRONMENT.g:5045:4: otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalENVIRONMENT.g:5053:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:5054:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:5054:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:5055:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getLevel0TMTCIFFormatFormatCrossReference_22_2_0());
                      					
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

                      				newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,99,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalENVIRONMENT.g:5085:3: ( ( ruleVersionedQualifiedName ) )
            // InternalENVIRONMENT.g:5086:4: ( ruleVersionedQualifiedName )
            {
            // InternalENVIRONMENT.g:5086:4: ( ruleVersionedQualifiedName )
            // InternalENVIRONMENT.g:5087:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getApp_to_level0TMTCIFExportExportCrossReference_25_0());
              				
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_26());
              		
            }
            otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27());
              		
            }
            otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSEnvironmentPeriodicTCLevel0Access().getSemicolonKeyword_28());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPeriodicTCLevel0"


    // $ANTLR start "entryRuleGSSEnvironmentGlobalVar"
    // InternalENVIRONMENT.g:5120:1: entryRuleGSSEnvironmentGlobalVar returns [EObject current=null] : iv_ruleGSSEnvironmentGlobalVar= ruleGSSEnvironmentGlobalVar EOF ;
    public final EObject entryRuleGSSEnvironmentGlobalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGlobalVar = null;


        try {
            // InternalENVIRONMENT.g:5120:64: (iv_ruleGSSEnvironmentGlobalVar= ruleGSSEnvironmentGlobalVar EOF )
            // InternalENVIRONMENT.g:5121:2: iv_ruleGSSEnvironmentGlobalVar= ruleGSSEnvironmentGlobalVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGlobalVar=ruleGSSEnvironmentGlobalVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGlobalVar; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGlobalVar"


    // $ANTLR start "ruleGSSEnvironmentGlobalVar"
    // InternalENVIRONMENT.g:5127:1: ruleGSSEnvironmentGlobalVar returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSEnvironmentGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleGSSEnvironmentGlobalVar() throws RecognitionException {
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
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        Enumerator lv_type_12_0 = null;

        AntlrDatatypeRuleToken lv_initial_value_16_0 = null;

        EObject lv_referenceField_18_0 = null;

        EObject lv_referencePeriodicTC_19_0 = null;

        EObject lv_referenceSpecialPacket_20_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5133:2: ( (otherlv_0= 'GSSEnvironmentGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSEnvironmentGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' ) )
            // InternalENVIRONMENT.g:5134:2: (otherlv_0= 'GSSEnvironmentGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSEnvironmentGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalENVIRONMENT.g:5134:2: (otherlv_0= 'GSSEnvironmentGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSEnvironmentGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' )
            // InternalENVIRONMENT.g:5135:3: otherlv_0= 'GSSEnvironmentGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSEnvironmentGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,100,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGlobalVarAccess().getGSSEnvironmentGlobalVarKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGlobalVarAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5151:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:5152:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5152:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:5153:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentGlobalVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5181:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5182:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5182:4: (lv_id_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5183:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5212:3: ( (lv_type_12_0= ruleGSSEnvironmentGlobalVarType ) )
            // InternalENVIRONMENT.g:5213:4: (lv_type_12_0= ruleGSSEnvironmentGlobalVarType )
            {
            // InternalENVIRONMENT.g:5213:4: (lv_type_12_0= ruleGSSEnvironmentGlobalVarType )
            // InternalENVIRONMENT.g:5214:5: lv_type_12_0= ruleGSSEnvironmentGlobalVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getTypeGSSEnvironmentGlobalVarTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_12_0=ruleGSSEnvironmentGlobalVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGlobalVarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,102,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGlobalVarAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5243:3: ( (lv_initial_value_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5244:4: (lv_initial_value_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5244:4: (lv_initial_value_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5245:5: lv_initial_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_initial_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_17());
              		
            }
            // InternalENVIRONMENT.g:5266:3: ( ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt39=1;
                }
                break;
            case 107:
                {
                alt39=2;
                }
                break;
            case 109:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalENVIRONMENT.g:5267:4: ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) )
                    {
                    // InternalENVIRONMENT.g:5267:4: ( (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField ) )
                    // InternalENVIRONMENT.g:5268:5: (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField )
                    {
                    // InternalENVIRONMENT.g:5268:5: (lv_referenceField_18_0= ruleGSSEnvironmentReferenceField )
                    // InternalENVIRONMENT.g:5269:6: lv_referenceField_18_0= ruleGSSEnvironmentReferenceField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceFieldGSSEnvironmentReferenceFieldParserRuleCall_18_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_referenceField_18_0=ruleGSSEnvironmentReferenceField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
                      						}
                      						set(
                      							current,
                      							"referenceField",
                      							lv_referenceField_18_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceField");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:5287:4: ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) )
                    {
                    // InternalENVIRONMENT.g:5287:4: ( (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC ) )
                    // InternalENVIRONMENT.g:5288:5: (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC )
                    {
                    // InternalENVIRONMENT.g:5288:5: (lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC )
                    // InternalENVIRONMENT.g:5289:6: lv_referencePeriodicTC_19_0= ruleGSSEnvironmentReferencePeriodicTC
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferencePeriodicTCGSSEnvironmentReferencePeriodicTCParserRuleCall_18_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_referencePeriodicTC_19_0=ruleGSSEnvironmentReferencePeriodicTC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
                      						}
                      						set(
                      							current,
                      							"referencePeriodicTC",
                      							lv_referencePeriodicTC_19_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferencePeriodicTC");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:5307:4: ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) )
                    {
                    // InternalENVIRONMENT.g:5307:4: ( (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket ) )
                    // InternalENVIRONMENT.g:5308:5: (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket )
                    {
                    // InternalENVIRONMENT.g:5308:5: (lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket )
                    // InternalENVIRONMENT.g:5309:6: lv_referenceSpecialPacket_20_0= ruleGSSEnvironmentReferenceSpecialPacket
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentGlobalVarAccess().getReferenceSpecialPacketGSSEnvironmentReferenceSpecialPacketParserRuleCall_18_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_referenceSpecialPacket_20_0=ruleGSSEnvironmentReferenceSpecialPacket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentGlobalVarRule());
                      						}
                      						set(
                      							current,
                      							"referenceSpecialPacket",
                      							lv_referenceSpecialPacket_20_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceSpecialPacket");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentGlobalVarAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentGlobalVarAccess().getSemicolonKeyword_20());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGlobalVar"


    // $ANTLR start "entryRuleGSSEnvironmentReferenceField"
    // InternalENVIRONMENT.g:5339:1: entryRuleGSSEnvironmentReferenceField returns [EObject current=null] : iv_ruleGSSEnvironmentReferenceField= ruleGSSEnvironmentReferenceField EOF ;
    public final EObject entryRuleGSSEnvironmentReferenceField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentReferenceField = null;


        try {
            // InternalENVIRONMENT.g:5339:69: (iv_ruleGSSEnvironmentReferenceField= ruleGSSEnvironmentReferenceField EOF )
            // InternalENVIRONMENT.g:5340:2: iv_ruleGSSEnvironmentReferenceField= ruleGSSEnvironmentReferenceField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentReferenceField=ruleGSSEnvironmentReferenceField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentReferenceField; 
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
    // $ANTLR end "entryRuleGSSEnvironmentReferenceField"


    // $ANTLR start "ruleGSSEnvironmentReferenceField"
    // InternalENVIRONMENT.g:5346:1: ruleGSSEnvironmentReferenceField returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) ;
    public final EObject ruleGSSEnvironmentReferenceField() throws RecognitionException {
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
            // InternalENVIRONMENT.g:5352:2: ( (otherlv_0= 'GSSEnvironmentReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) )
            // InternalENVIRONMENT.g:5353:2: (otherlv_0= 'GSSEnvironmentReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalENVIRONMENT.g:5353:2: (otherlv_0= 'GSSEnvironmentReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            // InternalENVIRONMENT.g:5354:3: otherlv_0= 'GSSEnvironmentReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,103,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getGSSEnvironmentReferenceFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5370:3: ( (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType ) )
            // InternalENVIRONMENT.g:5371:4: (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType )
            {
            // InternalENVIRONMENT.g:5371:4: (lv_type_4_0= ruleGSSEnvironmentReferenceFieldType )
            // InternalENVIRONMENT.g:5372:5: lv_type_4_0= ruleGSSEnvironmentReferenceFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getTypeGSSEnvironmentReferenceFieldTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_4_0=ruleGSSEnvironmentReferenceFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentReferenceFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5401:3: ( (lv_ifRef_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5402:4: (lv_ifRef_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5402:4: (lv_ifRef_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5403:5: lv_ifRef_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5432:3: ( (lv_level_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5433:4: (lv_level_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5433:4: (lv_level_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5434:5: lv_level_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5463:3: ( (lv_fieldRef_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5464:4: (lv_fieldRef_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5464:4: (lv_fieldRef_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5465:5: lv_fieldRef_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:5494:3: ( (lv_offset_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5495:4: (lv_offset_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5495:4: (lv_offset_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5496:5: lv_offset_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalENVIRONMENT.g:5525:3: ( (lv_size_24_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5526:4: (lv_size_24_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5526:4: (lv_size_24_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5527:5: lv_size_24_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_24_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceFieldRule());
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_25());
              		
            }
            otherlv_26=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getRightCurlyBracketKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSEnvironmentReferenceFieldAccess().getSemicolonKeyword_27());
              		
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
    // $ANTLR end "ruleGSSEnvironmentReferenceField"


    // $ANTLR start "entryRuleGSSEnvironmentReferencePeriodicTC"
    // InternalENVIRONMENT.g:5560:1: entryRuleGSSEnvironmentReferencePeriodicTC returns [EObject current=null] : iv_ruleGSSEnvironmentReferencePeriodicTC= ruleGSSEnvironmentReferencePeriodicTC EOF ;
    public final EObject entryRuleGSSEnvironmentReferencePeriodicTC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentReferencePeriodicTC = null;


        try {
            // InternalENVIRONMENT.g:5560:74: (iv_ruleGSSEnvironmentReferencePeriodicTC= ruleGSSEnvironmentReferencePeriodicTC EOF )
            // InternalENVIRONMENT.g:5561:2: iv_ruleGSSEnvironmentReferencePeriodicTC= ruleGSSEnvironmentReferencePeriodicTC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentReferencePeriodicTC=ruleGSSEnvironmentReferencePeriodicTC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentReferencePeriodicTC; 
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
    // $ANTLR end "entryRuleGSSEnvironmentReferencePeriodicTC"


    // $ANTLR start "ruleGSSEnvironmentReferencePeriodicTC"
    // InternalENVIRONMENT.g:5567:1: ruleGSSEnvironmentReferencePeriodicTC returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSEnvironmentReferencePeriodicTC() throws RecognitionException {
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
            // InternalENVIRONMENT.g:5573:2: ( (otherlv_0= 'GSSEnvironmentReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalENVIRONMENT.g:5574:2: (otherlv_0= 'GSSEnvironmentReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalENVIRONMENT.g:5574:2: (otherlv_0= 'GSSEnvironmentReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalENVIRONMENT.g:5575:3: otherlv_0= 'GSSEnvironmentReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,107,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getGSSEnvironmentReferencePeriodicTCKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5591:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:5592:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5592:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:5593:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getIdRefGSSEnvironmentPeriodicTCCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5619:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5620:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5620:4: (lv_level_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5621:5: lv_level_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5650:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5651:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5651:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5652:5: lv_fieldRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5681:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5682:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5682:4: (lv_offset_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5683:5: lv_offset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:5712:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5713:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5713:4: (lv_size_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5714:5: lv_size_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferencePeriodicTCRule());
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentReferencePeriodicTCAccess().getSemicolonKeyword_23());
              		
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
    // $ANTLR end "ruleGSSEnvironmentReferencePeriodicTC"


    // $ANTLR start "entryRuleGSSEnvironmentReferenceSpecialPacket"
    // InternalENVIRONMENT.g:5747:1: entryRuleGSSEnvironmentReferenceSpecialPacket returns [EObject current=null] : iv_ruleGSSEnvironmentReferenceSpecialPacket= ruleGSSEnvironmentReferenceSpecialPacket EOF ;
    public final EObject entryRuleGSSEnvironmentReferenceSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentReferenceSpecialPacket = null;


        try {
            // InternalENVIRONMENT.g:5747:77: (iv_ruleGSSEnvironmentReferenceSpecialPacket= ruleGSSEnvironmentReferenceSpecialPacket EOF )
            // InternalENVIRONMENT.g:5748:2: iv_ruleGSSEnvironmentReferenceSpecialPacket= ruleGSSEnvironmentReferenceSpecialPacket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentReferenceSpecialPacket=ruleGSSEnvironmentReferenceSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentReferenceSpecialPacket; 
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
    // $ANTLR end "entryRuleGSSEnvironmentReferenceSpecialPacket"


    // $ANTLR start "ruleGSSEnvironmentReferenceSpecialPacket"
    // InternalENVIRONMENT.g:5754:1: ruleGSSEnvironmentReferenceSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSEnvironmentReferenceSpecialPacket() throws RecognitionException {
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
            // InternalENVIRONMENT.g:5760:2: ( (otherlv_0= 'GSSEnvironmentReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalENVIRONMENT.g:5761:2: (otherlv_0= 'GSSEnvironmentReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalENVIRONMENT.g:5761:2: (otherlv_0= 'GSSEnvironmentReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalENVIRONMENT.g:5762:3: otherlv_0= 'GSSEnvironmentReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,109,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getGSSEnvironmentReferenceSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5778:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:5779:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5779:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:5780:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getIdRefGSSEnvironmentSpecialPacketCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5806:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5807:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5807:4: (lv_level_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5808:5: lv_level_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:5837:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5838:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5838:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5839:5: lv_fieldRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalENVIRONMENT.g:5868:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5869:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5869:4: (lv_offset_16_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5870:5: lv_offset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalENVIRONMENT.g:5899:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:5900:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:5900:4: (lv_size_20_0= ruleINTEGER )
            // InternalENVIRONMENT.g:5901:5: lv_size_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentReferenceSpecialPacketRule());
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSEnvironmentReferenceSpecialPacketAccess().getSemicolonKeyword_23());
              		
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
    // $ANTLR end "ruleGSSEnvironmentReferenceSpecialPacket"


    // $ANTLR start "entryRuleGSSEnvironmentPlot"
    // InternalENVIRONMENT.g:5934:1: entryRuleGSSEnvironmentPlot returns [EObject current=null] : iv_ruleGSSEnvironmentPlot= ruleGSSEnvironmentPlot EOF ;
    public final EObject entryRuleGSSEnvironmentPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentPlot = null;


        try {
            // InternalENVIRONMENT.g:5934:59: (iv_ruleGSSEnvironmentPlot= ruleGSSEnvironmentPlot EOF )
            // InternalENVIRONMENT.g:5935:2: iv_ruleGSSEnvironmentPlot= ruleGSSEnvironmentPlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentPlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentPlot=ruleGSSEnvironmentPlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentPlot; 
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
    // $ANTLR end "entryRuleGSSEnvironmentPlot"


    // $ANTLR start "ruleGSSEnvironmentPlot"
    // InternalENVIRONMENT.g:5941:1: ruleGSSEnvironmentPlot returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleGSSEnvironmentPlot() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_GVFiltered_10_0 = null;

        EObject lv_GVPeriodic_11_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:5947:2: ( (otherlv_0= 'GSSEnvironmentPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) )
            // InternalENVIRONMENT.g:5948:2: (otherlv_0= 'GSSEnvironmentPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalENVIRONMENT.g:5948:2: (otherlv_0= 'GSSEnvironmentPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            // InternalENVIRONMENT.g:5949:3: otherlv_0= 'GSSEnvironmentPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'chartRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,110,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentPlotAccess().getGSSEnvironmentPlotKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentPlotAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentPlotAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:5965:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:5966:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:5966:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:5967:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentPlotAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPlotRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,111,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentPlotAccess().getChartRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentPlotAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:5995:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalENVIRONMENT.g:5996:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalENVIRONMENT.g:5996:4: ( ruleVersionedQualifiedReferenceName )
            // InternalENVIRONMENT.g:5997:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentPlotRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentPlotAccess().getChartRefGSSChartsChartCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_9());
              		
            }
            // InternalENVIRONMENT.g:6018:3: ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==117) ) {
                alt40=1;
            }
            else if ( (LA40_0==120) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalENVIRONMENT.g:6019:4: ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) )
                    {
                    // InternalENVIRONMENT.g:6019:4: ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) )
                    // InternalENVIRONMENT.g:6020:5: (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered )
                    {
                    // InternalENVIRONMENT.g:6020:5: (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered )
                    // InternalENVIRONMENT.g:6021:6: lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPlotAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVFiltered_10_0=ruleGSSEnvironmentGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentPlotRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_10_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6039:4: ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) )
                    {
                    // InternalENVIRONMENT.g:6039:4: ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) )
                    // InternalENVIRONMENT.g:6040:5: (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic )
                    {
                    // InternalENVIRONMENT.g:6040:5: (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic )
                    // InternalENVIRONMENT.g:6041:6: lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentPlotAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVPeriodic_11_0=ruleGSSEnvironmentGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentPlotRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_11_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentPlotAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentPlotAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleGSSEnvironmentPlot"


    // $ANTLR start "entryRuleGSSEnvironmentAlarmMsg"
    // InternalENVIRONMENT.g:6071:1: entryRuleGSSEnvironmentAlarmMsg returns [EObject current=null] : iv_ruleGSSEnvironmentAlarmMsg= ruleGSSEnvironmentAlarmMsg EOF ;
    public final EObject entryRuleGSSEnvironmentAlarmMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentAlarmMsg = null;


        try {
            // InternalENVIRONMENT.g:6071:63: (iv_ruleGSSEnvironmentAlarmMsg= ruleGSSEnvironmentAlarmMsg EOF )
            // InternalENVIRONMENT.g:6072:2: iv_ruleGSSEnvironmentAlarmMsg= ruleGSSEnvironmentAlarmMsg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentAlarmMsg=ruleGSSEnvironmentAlarmMsg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentAlarmMsg; 
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
    // $ANTLR end "entryRuleGSSEnvironmentAlarmMsg"


    // $ANTLR start "ruleGSSEnvironmentAlarmMsg"
    // InternalENVIRONMENT.g:6078:1: ruleGSSEnvironmentAlarmMsg returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) ;
    public final EObject ruleGSSEnvironmentAlarmMsg() throws RecognitionException {
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_type_8_0 = null;

        EObject lv_GVFiltered_14_0 = null;

        EObject lv_GVPeriodic_15_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6084:2: ( (otherlv_0= 'GSSEnvironmentAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) )
            // InternalENVIRONMENT.g:6085:2: (otherlv_0= 'GSSEnvironmentAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalENVIRONMENT.g:6085:2: (otherlv_0= 'GSSEnvironmentAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            // InternalENVIRONMENT.g:6086:3: otherlv_0= 'GSSEnvironmentAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_STRING ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,112,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGSSEnvironmentAlarmMsgKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6102:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6103:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6103:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:6104:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentAlarmMsgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6132:3: ( (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType ) )
            // InternalENVIRONMENT.g:6133:4: (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType )
            {
            // InternalENVIRONMENT.g:6133:4: (lv_type_8_0= ruleGSSEnvironmentAlarmMsgType )
            // InternalENVIRONMENT.g:6134:5: lv_type_8_0= ruleGSSEnvironmentAlarmMsgType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTypeGSSEnvironmentAlarmMsgTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSEnvironmentAlarmMsgType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmMsgRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmMsgType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,113,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:6163:3: ( (lv_text_12_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6164:4: (lv_text_12_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6164:4: (lv_text_12_0= RULE_STRING )
            // InternalENVIRONMENT.g:6165:5: lv_text_12_0= RULE_STRING
            {
            lv_text_12_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_12_0, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getTextSTRINGTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentAlarmMsgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_12_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:6185:3: ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==117) ) {
                alt41=1;
            }
            else if ( (LA41_0==120) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalENVIRONMENT.g:6186:4: ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) )
                    {
                    // InternalENVIRONMENT.g:6186:4: ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) )
                    // InternalENVIRONMENT.g:6187:5: (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered )
                    {
                    // InternalENVIRONMENT.g:6187:5: (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered )
                    // InternalENVIRONMENT.g:6188:6: lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVFiltered_14_0=ruleGSSEnvironmentGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmMsgRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_14_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6206:4: ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) )
                    {
                    // InternalENVIRONMENT.g:6206:4: ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) )
                    // InternalENVIRONMENT.g:6207:5: (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic )
                    {
                    // InternalENVIRONMENT.g:6207:5: (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic )
                    // InternalENVIRONMENT.g:6208:6: lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmMsgAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVPeriodic_15_0=ruleGSSEnvironmentGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmMsgRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_15_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentAlarmMsgAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSEnvironmentAlarmMsg"


    // $ANTLR start "entryRuleGSSEnvironmentModify"
    // InternalENVIRONMENT.g:6238:1: entryRuleGSSEnvironmentModify returns [EObject current=null] : iv_ruleGSSEnvironmentModify= ruleGSSEnvironmentModify EOF ;
    public final EObject entryRuleGSSEnvironmentModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentModify = null;


        try {
            // InternalENVIRONMENT.g:6238:61: (iv_ruleGSSEnvironmentModify= ruleGSSEnvironmentModify EOF )
            // InternalENVIRONMENT.g:6239:2: iv_ruleGSSEnvironmentModify= ruleGSSEnvironmentModify EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentModifyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentModify=ruleGSSEnvironmentModify();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentModify; 
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
    // $ANTLR end "entryRuleGSSEnvironmentModify"


    // $ANTLR start "ruleGSSEnvironmentModify"
    // InternalENVIRONMENT.g:6245:1: ruleGSSEnvironmentModify returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) ;
    public final EObject ruleGSSEnvironmentModify() throws RecognitionException {
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;

        EObject lv_GVFiltered_14_0 = null;

        EObject lv_GVPeriodic_15_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6251:2: ( (otherlv_0= 'GSSEnvironmentModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) )
            // InternalENVIRONMENT.g:6252:2: (otherlv_0= 'GSSEnvironmentModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalENVIRONMENT.g:6252:2: (otherlv_0= 'GSSEnvironmentModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            // InternalENVIRONMENT.g:6253:3: otherlv_0= 'GSSEnvironmentModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,114,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentModifyAccess().getGSSEnvironmentModifyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentModifyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentModifyAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6269:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6270:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6270:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:6271:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentModifyAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentModifyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentModifyAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6299:3: ( (lv_type_8_0= ruleGSSEnvironmentModifyType ) )
            // InternalENVIRONMENT.g:6300:4: (lv_type_8_0= ruleGSSEnvironmentModifyType )
            {
            // InternalENVIRONMENT.g:6300:4: (lv_type_8_0= ruleGSSEnvironmentModifyType )
            // InternalENVIRONMENT.g:6301:5: lv_type_8_0= ruleGSSEnvironmentModifyType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getTypeGSSEnvironmentModifyTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSEnvironmentModifyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentModifyType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,115,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentModifyAccess().getValueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentModifyAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:6330:3: ( (lv_value_12_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:6331:4: (lv_value_12_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:6331:4: (lv_value_12_0= ruleINTEGER )
            // InternalENVIRONMENT.g:6332:5: lv_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getValueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_13());
              		
            }
            // InternalENVIRONMENT.g:6353:3: ( ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==117) ) {
                alt42=1;
            }
            else if ( (LA42_0==120) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalENVIRONMENT.g:6354:4: ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) )
                    {
                    // InternalENVIRONMENT.g:6354:4: ( (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered ) )
                    // InternalENVIRONMENT.g:6355:5: (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered )
                    {
                    // InternalENVIRONMENT.g:6355:5: (lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered )
                    // InternalENVIRONMENT.g:6356:6: lv_GVFiltered_14_0= ruleGSSEnvironmentGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_14_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVFiltered_14_0=ruleGSSEnvironmentGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_14_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6374:4: ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) )
                    {
                    // InternalENVIRONMENT.g:6374:4: ( (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic ) )
                    // InternalENVIRONMENT.g:6375:5: (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic )
                    {
                    // InternalENVIRONMENT.g:6375:5: (lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic )
                    // InternalENVIRONMENT.g:6376:6: lv_GVPeriodic_15_0= ruleGSSEnvironmentGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentModifyAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_14_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVPeriodic_15_0=ruleGSSEnvironmentGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentModifyRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_15_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSEnvironmentModifyAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSEnvironmentModifyAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSEnvironmentModify"


    // $ANTLR start "entryRuleGSSEnvironmentAlarmVal"
    // InternalENVIRONMENT.g:6406:1: entryRuleGSSEnvironmentAlarmVal returns [EObject current=null] : iv_ruleGSSEnvironmentAlarmVal= ruleGSSEnvironmentAlarmVal EOF ;
    public final EObject entryRuleGSSEnvironmentAlarmVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentAlarmVal = null;


        try {
            // InternalENVIRONMENT.g:6406:63: (iv_ruleGSSEnvironmentAlarmVal= ruleGSSEnvironmentAlarmVal EOF )
            // InternalENVIRONMENT.g:6407:2: iv_ruleGSSEnvironmentAlarmVal= ruleGSSEnvironmentAlarmVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentAlarmVal=ruleGSSEnvironmentAlarmVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentAlarmVal; 
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
    // $ANTLR end "entryRuleGSSEnvironmentAlarmVal"


    // $ANTLR start "ruleGSSEnvironmentAlarmVal"
    // InternalENVIRONMENT.g:6413:1: ruleGSSEnvironmentAlarmVal returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleGSSEnvironmentAlarmVal() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_type_8_0 = null;

        EObject lv_GVFiltered_10_0 = null;

        EObject lv_GVPeriodic_11_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6419:2: ( (otherlv_0= 'GSSEnvironmentAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) )
            // InternalENVIRONMENT.g:6420:2: (otherlv_0= 'GSSEnvironmentAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalENVIRONMENT.g:6420:2: (otherlv_0= 'GSSEnvironmentAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            // InternalENVIRONMENT.g:6421:3: otherlv_0= 'GSSEnvironmentAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSEnvironmentAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,116,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentAlarmValAccess().getGSSEnvironmentAlarmValKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentAlarmValAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentAlarmValAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6437:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalENVIRONMENT.g:6438:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6438:4: (lv_name_4_0= RULE_STRING )
            // InternalENVIRONMENT.g:6439:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSEnvironmentAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentAlarmValRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentAlarmValAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6467:3: ( (lv_type_8_0= ruleGSSEnvironmentAlarmValType ) )
            // InternalENVIRONMENT.g:6468:4: (lv_type_8_0= ruleGSSEnvironmentAlarmValType )
            {
            // InternalENVIRONMENT.g:6468:4: (lv_type_8_0= ruleGSSEnvironmentAlarmValType )
            // InternalENVIRONMENT.g:6469:5: lv_type_8_0= ruleGSSEnvironmentAlarmValType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValAccess().getTypeGSSEnvironmentAlarmValTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSEnvironmentAlarmValType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmValRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentAlarmValType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_9());
              		
            }
            // InternalENVIRONMENT.g:6490:3: ( ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==117) ) {
                alt43=1;
            }
            else if ( (LA43_0==120) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalENVIRONMENT.g:6491:4: ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) )
                    {
                    // InternalENVIRONMENT.g:6491:4: ( (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered ) )
                    // InternalENVIRONMENT.g:6492:5: (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered )
                    {
                    // InternalENVIRONMENT.g:6492:5: (lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered )
                    // InternalENVIRONMENT.g:6493:6: lv_GVFiltered_10_0= ruleGSSEnvironmentGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVFilteredGSSEnvironmentGVFilteredParserRuleCall_10_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVFiltered_10_0=ruleGSSEnvironmentGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmValRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_10_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6511:4: ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) )
                    {
                    // InternalENVIRONMENT.g:6511:4: ( (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic ) )
                    // InternalENVIRONMENT.g:6512:5: (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic )
                    {
                    // InternalENVIRONMENT.g:6512:5: (lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic )
                    // InternalENVIRONMENT.g:6513:6: lv_GVPeriodic_11_0= ruleGSSEnvironmentGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentAlarmValAccess().getGVPeriodicGSSEnvironmentGVPeriodicParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    lv_GVPeriodic_11_0=ruleGSSEnvironmentGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSEnvironmentAlarmValRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_11_0,
                      							"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSEnvironmentAlarmValAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentAlarmValAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleGSSEnvironmentAlarmVal"


    // $ANTLR start "entryRuleGSSEnvironmentGVFiltered"
    // InternalENVIRONMENT.g:6543:1: entryRuleGSSEnvironmentGVFiltered returns [EObject current=null] : iv_ruleGSSEnvironmentGVFiltered= ruleGSSEnvironmentGVFiltered EOF ;
    public final EObject entryRuleGSSEnvironmentGVFiltered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGVFiltered = null;


        try {
            // InternalENVIRONMENT.g:6543:65: (iv_ruleGSSEnvironmentGVFiltered= ruleGSSEnvironmentGVFiltered EOF )
            // InternalENVIRONMENT.g:6544:2: iv_ruleGSSEnvironmentGVFiltered= ruleGSSEnvironmentGVFiltered EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGVFilteredRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGVFiltered=ruleGSSEnvironmentGVFiltered();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGVFiltered; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGVFiltered"


    // $ANTLR start "ruleGSSEnvironmentGVFiltered"
    // InternalENVIRONMENT.g:6550:1: ruleGSSEnvironmentGVFiltered returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSEnvironmentGVFiltered() throws RecognitionException {
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
            // InternalENVIRONMENT.g:6556:2: ( (otherlv_0= 'GSSEnvironmentGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) )
            // InternalENVIRONMENT.g:6557:2: (otherlv_0= 'GSSEnvironmentGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalENVIRONMENT.g:6557:2: (otherlv_0= 'GSSEnvironmentGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            // InternalENVIRONMENT.g:6558:3: otherlv_0= 'GSSEnvironmentGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,117,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGVFilteredAccess().getGSSEnvironmentGVFilteredKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGVFilteredAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,118,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6574:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:6575:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6575:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:6576:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentGVFilteredRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGVFilteredAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_5());
              		
            }
            // InternalENVIRONMENT.g:6594:3: (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==119) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalENVIRONMENT.g:6595:4: otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,119,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGVFilteredAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalENVIRONMENT.g:6603:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalENVIRONMENT.g:6604:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalENVIRONMENT.g:6604:5: ( ruleVersionedQualifiedName )
                    // InternalENVIRONMENT.g:6605:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSEnvironmentGVFilteredRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSEnvironmentGVFilteredAccess().getFilterTMTCIFFilterFilterCrossReference_6_2_0());
                      					
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

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGVFilteredAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGVFilteredAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGVFiltered"


    // $ANTLR start "entryRuleGSSEnvironmentGVPeriodic"
    // InternalENVIRONMENT.g:6639:1: entryRuleGSSEnvironmentGVPeriodic returns [EObject current=null] : iv_ruleGSSEnvironmentGVPeriodic= ruleGSSEnvironmentGVPeriodic EOF ;
    public final EObject entryRuleGSSEnvironmentGVPeriodic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSEnvironmentGVPeriodic = null;


        try {
            // InternalENVIRONMENT.g:6639:65: (iv_ruleGSSEnvironmentGVPeriodic= ruleGSSEnvironmentGVPeriodic EOF )
            // InternalENVIRONMENT.g:6640:2: iv_ruleGSSEnvironmentGVPeriodic= ruleGSSEnvironmentGVPeriodic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSEnvironmentGVPeriodicRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSEnvironmentGVPeriodic=ruleGSSEnvironmentGVPeriodic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSEnvironmentGVPeriodic; 
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
    // $ANTLR end "entryRuleGSSEnvironmentGVPeriodic"


    // $ANTLR start "ruleGSSEnvironmentGVPeriodic"
    // InternalENVIRONMENT.g:6646:1: ruleGSSEnvironmentGVPeriodic returns [EObject current=null] : (otherlv_0= 'GSSEnvironmentGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSEnvironmentUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSEnvironmentGVPeriodic() throws RecognitionException {
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
            // InternalENVIRONMENT.g:6652:2: ( (otherlv_0= 'GSSEnvironmentGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSEnvironmentUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalENVIRONMENT.g:6653:2: (otherlv_0= 'GSSEnvironmentGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSEnvironmentUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalENVIRONMENT.g:6653:2: (otherlv_0= 'GSSEnvironmentGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSEnvironmentUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalENVIRONMENT.g:6654:3: otherlv_0= 'GSSEnvironmentGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (otherlv_4= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'period_value' otherlv_7= ':=' ( (lv_period_value_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'period_unit' otherlv_11= ':=' ( (lv_period_unit_12_0= ruleGSSEnvironmentUnit ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,120,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGSSEnvironmentGVPeriodicKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,118,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalENVIRONMENT.g:6670:3: ( (otherlv_4= RULE_STRING ) )
            // InternalENVIRONMENT.g:6671:4: (otherlv_4= RULE_STRING )
            {
            // InternalENVIRONMENT.g:6671:4: (otherlv_4= RULE_STRING )
            // InternalENVIRONMENT.g:6672:5: otherlv_4= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSEnvironmentGVPeriodicRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getGlobalVarRefGSSEnvironmentGlobalVarCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalENVIRONMENT.g:6698:3: ( (lv_period_value_8_0= ruleINTEGER ) )
            // InternalENVIRONMENT.g:6699:4: (lv_period_value_8_0= ruleINTEGER )
            {
            // InternalENVIRONMENT.g:6699:4: (lv_period_value_8_0= ruleINTEGER )
            // InternalENVIRONMENT.g:6700:5: lv_period_value_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGVPeriodicRule());
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalENVIRONMENT.g:6729:3: ( (lv_period_unit_12_0= ruleGSSEnvironmentUnit ) )
            // InternalENVIRONMENT.g:6730:4: (lv_period_unit_12_0= ruleGSSEnvironmentUnit )
            {
            // InternalENVIRONMENT.g:6730:4: (lv_period_unit_12_0= ruleGSSEnvironmentUnit )
            // InternalENVIRONMENT.g:6731:5: lv_period_unit_12_0= ruleGSSEnvironmentUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSEnvironmentGVPeriodicAccess().getPeriod_unitGSSEnvironmentUnitEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_12_0=ruleGSSEnvironmentUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSEnvironmentGVPeriodicRule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_12_0,
              						"es.uah.aut.srg.gss.lang.environment.ENVIRONMENT.GSSEnvironmentUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSEnvironmentGVPeriodicAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleGSSEnvironmentGVPeriodic"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalENVIRONMENT.g:6764:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalENVIRONMENT.g:6764:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalENVIRONMENT.g:6765:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalENVIRONMENT.g:6771:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:6777:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalENVIRONMENT.g:6778:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalENVIRONMENT.g:6778:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalENVIRONMENT.g:6779:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalENVIRONMENT.g:6786:3: (kw= '.' this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==121) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalENVIRONMENT.g:6787:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,121,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalENVIRONMENT.g:6804:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalENVIRONMENT.g:6804:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalENVIRONMENT.g:6805:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalENVIRONMENT.g:6811:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalENVIRONMENT.g:6817:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalENVIRONMENT.g:6818:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalENVIRONMENT.g:6818:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalENVIRONMENT.g:6819:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalENVIRONMENT.g:6819:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_ID) ) {
                    alt47=2;
                }
                else if ( (LA47_1==EOF||LA47_1==14||LA47_1==121||LA47_1==123) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalENVIRONMENT.g:6820:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_122); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:6828:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalENVIRONMENT.g:6828:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalENVIRONMENT.g:6829:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalENVIRONMENT.g:6829:5: (this_INT_1= RULE_INT )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_INT) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalENVIRONMENT.g:6830:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_122); if (state.failed) return current;
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

            // InternalENVIRONMENT.g:6847:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==121) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalENVIRONMENT.g:6848:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,121,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalENVIRONMENT.g:6853:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==RULE_INT) ) {
            	        int LA49_1 = input.LA(2);

            	        if ( (LA49_1==RULE_ID) ) {
            	            alt49=2;
            	        }
            	        else if ( (LA49_1==EOF||LA49_1==14||LA49_1==121||LA49_1==123) ) {
            	            alt49=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 49, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA49_0==RULE_ID) ) {
            	        alt49=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // InternalENVIRONMENT.g:6854:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_122); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalENVIRONMENT.g:6862:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalENVIRONMENT.g:6862:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalENVIRONMENT.g:6863:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalENVIRONMENT.g:6863:6: (this_INT_5= RULE_INT )?
            	            int alt48=2;
            	            int LA48_0 = input.LA(1);

            	            if ( (LA48_0==RULE_INT) ) {
            	                alt48=1;
            	            }
            	            switch (alt48) {
            	                case 1 :
            	                    // InternalENVIRONMENT.g:6864:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_122); if (state.failed) return current;
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
            	    break loop50;
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
    // InternalENVIRONMENT.g:6886:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalENVIRONMENT.g:6886:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalENVIRONMENT.g:6887:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalENVIRONMENT.g:6893:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6899:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalENVIRONMENT.g:6900:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalENVIRONMENT.g:6900:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalENVIRONMENT.g:6901:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_123);
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
            pushFollow(FollowSets000.FOLLOW_124);
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
    // InternalENVIRONMENT.g:6935:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalENVIRONMENT.g:6935:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalENVIRONMENT.g:6936:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalENVIRONMENT.g:6942:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalENVIRONMENT.g:6948:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalENVIRONMENT.g:6949:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalENVIRONMENT.g:6949:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalENVIRONMENT.g:6950:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalENVIRONMENT.g:6950:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( ((LA51_1>=121 && LA51_1<=122)) ) {
                    alt51=1;
                }
            }
            switch (alt51) {
                case 1 :
                    // InternalENVIRONMENT.g:6951:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_125);
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

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalENVIRONMENT.g:6974:3: (kw= '::' this_ID_4= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==124) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalENVIRONMENT.g:6975:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,124,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_126); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
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
    // InternalENVIRONMENT.g:6992:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalENVIRONMENT.g:6992:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalENVIRONMENT.g:6993:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalENVIRONMENT.g:6999:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7005:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalENVIRONMENT.g:7006:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalENVIRONMENT.g:7006:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_INT||LA54_0==125) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_HEXADECIMAL) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalENVIRONMENT.g:7007:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalENVIRONMENT.g:7007:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalENVIRONMENT.g:7008:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalENVIRONMENT.g:7008:4: (kw= '-' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==125) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalENVIRONMENT.g:7009:5: kw= '-'
                            {
                            kw=(Token)match(input,125,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
                    // InternalENVIRONMENT.g:7024:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalENVIRONMENT.g:7035:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalENVIRONMENT.g:7035:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalENVIRONMENT.g:7036:2: iv_ruleDATE= ruleDATE EOF
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
    // InternalENVIRONMENT.g:7042:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7048:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalENVIRONMENT.g:7049:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalENVIRONMENT.g:7049:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalENVIRONMENT.g:7050:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,126,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
              		
            }
            kw=(Token)match(input,126,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
    // InternalENVIRONMENT.g:7085:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalENVIRONMENT.g:7085:43: (iv_ruleURL= ruleURL EOF )
            // InternalENVIRONMENT.g:7086:2: iv_ruleURL= ruleURL EOF
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
    // InternalENVIRONMENT.g:7092:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7098:2: ( (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) )
            // InternalENVIRONMENT.g:7099:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            {
            // InternalENVIRONMENT.g:7099:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            // InternalENVIRONMENT.g:7100:3: this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getURLAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalENVIRONMENT.g:7107:3: (kw= '+' this_ID_2= RULE_ID )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==127) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalENVIRONMENT.g:7108:4: kw= '+' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,127,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getURLAccess().getPlusSignKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_129); if (state.failed) return current;
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
            // InternalENVIRONMENT.g:7126:3: (this_ID_4= RULE_ID (kw= '.' )? )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==RULE_ID) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalENVIRONMENT.g:7127:4: this_ID_4= RULE_ID (kw= '.' )?
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_130); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getURLAccess().getIDTerminalRuleCall_3_0());
            	      			
            	    }
            	    // InternalENVIRONMENT.g:7134:4: (kw= '.' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==121) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalENVIRONMENT.g:7135:5: kw= '.'
            	            {
            	            kw=(Token)match(input,121,FollowSets000.FOLLOW_131); if (state.failed) return current;
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
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            // InternalENVIRONMENT.g:7142:3: (kw= '/' this_ID_7= RULE_ID )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==126) ) {
                    int LA58_1 = input.LA(2);

                    if ( (LA58_1==RULE_ID) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // InternalENVIRONMENT.g:7143:4: kw= '/' this_ID_7= RULE_ID
            	    {
            	    kw=(Token)match(input,126,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_4_0());
            	      			
            	    }
            	    this_ID_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_132); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_7);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_7, grammarAccess.getURLAccess().getIDTerminalRuleCall_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // InternalENVIRONMENT.g:7156:3: (kw= '/' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==126) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalENVIRONMENT.g:7157:4: kw= '/'
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


    // $ANTLR start "ruleGSSEnvironmentEnableDisable"
    // InternalENVIRONMENT.g:7167:1: ruleGSSEnvironmentEnableDisable returns [Enumerator current=null] : ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) ;
    public final Enumerator ruleGSSEnvironmentEnableDisable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7173:2: ( ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) )
            // InternalENVIRONMENT.g:7174:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            {
            // InternalENVIRONMENT.g:7174:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==129) ) {
                alt60=1;
            }
            else if ( (LA60_0==130) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalENVIRONMENT.g:7175:3: (enumLiteral_0= 'disabled' )
                    {
                    // InternalENVIRONMENT.g:7175:3: (enumLiteral_0= 'disabled' )
                    // InternalENVIRONMENT.g:7176:4: enumLiteral_0= 'disabled'
                    {
                    enumLiteral_0=(Token)match(input,129,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7183:3: (enumLiteral_1= 'enabled' )
                    {
                    // InternalENVIRONMENT.g:7183:3: (enumLiteral_1= 'enabled' )
                    // InternalENVIRONMENT.g:7184:4: enumLiteral_1= 'enabled'
                    {
                    enumLiteral_1=(Token)match(input,130,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentEnableDisableAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentEnableDisableAccess().getEnabledEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentEnableDisable"


    // $ANTLR start "ruleGSSEnvironmentInterfaceType"
    // InternalENVIRONMENT.g:7194:1: ruleGSSEnvironmentInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) ) ;
    public final Enumerator ruleGSSEnvironmentInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7200:2: ( ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) ) )
            // InternalENVIRONMENT.g:7201:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) )
            {
            // InternalENVIRONMENT.g:7201:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) )
            int alt61=5;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt61=1;
                }
                break;
            case 132:
                {
                alt61=2;
                }
                break;
            case 133:
                {
                alt61=3;
                }
                break;
            case 134:
                {
                alt61=4;
                }
                break;
            case 135:
                {
                alt61=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalENVIRONMENT.g:7202:3: (enumLiteral_0= 'SpW' )
                    {
                    // InternalENVIRONMENT.g:7202:3: (enumLiteral_0= 'SpW' )
                    // InternalENVIRONMENT.g:7203:4: enumLiteral_0= 'SpW'
                    {
                    enumLiteral_0=(Token)match(input,131,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7210:3: (enumLiteral_1= 'SpW_TC' )
                    {
                    // InternalENVIRONMENT.g:7210:3: (enumLiteral_1= 'SpW_TC' )
                    // InternalENVIRONMENT.g:7211:4: enumLiteral_1= 'SpW_TC'
                    {
                    enumLiteral_1=(Token)match(input,132,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7218:3: (enumLiteral_2= 'SpW_Error' )
                    {
                    // InternalENVIRONMENT.g:7218:3: (enumLiteral_2= 'SpW_Error' )
                    // InternalENVIRONMENT.g:7219:4: enumLiteral_2= 'SpW_Error'
                    {
                    enumLiteral_2=(Token)match(input,133,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalENVIRONMENT.g:7226:3: (enumLiteral_3= 'uart' )
                    {
                    // InternalENVIRONMENT.g:7226:3: (enumLiteral_3= 'uart' )
                    // InternalENVIRONMENT.g:7227:4: enumLiteral_3= 'uart'
                    {
                    enumLiteral_3=(Token)match(input,134,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getUartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getUartEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalENVIRONMENT.g:7234:3: (enumLiteral_4= 'dummy' )
                    {
                    // InternalENVIRONMENT.g:7234:3: (enumLiteral_4= 'dummy' )
                    // InternalENVIRONMENT.g:7235:4: enumLiteral_4= 'dummy'
                    {
                    enumLiteral_4=(Token)match(input,135,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSEnvironmentInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentInterfaceType"


    // $ANTLR start "ruleGSSEnvironmentInterfaceIOType"
    // InternalENVIRONMENT.g:7245:1: ruleGSSEnvironmentInterfaceIOType returns [Enumerator current=null] : ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleGSSEnvironmentInterfaceIOType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7251:2: ( ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // InternalENVIRONMENT.g:7252:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // InternalENVIRONMENT.g:7252:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt62=1;
                }
                break;
            case 137:
                {
                alt62=2;
                }
                break;
            case 138:
                {
                alt62=3;
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
                    // InternalENVIRONMENT.g:7253:3: (enumLiteral_0= 'in_out' )
                    {
                    // InternalENVIRONMENT.g:7253:3: (enumLiteral_0= 'in_out' )
                    // InternalENVIRONMENT.g:7254:4: enumLiteral_0= 'in_out'
                    {
                    enumLiteral_0=(Token)match(input,136,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7261:3: (enumLiteral_1= 'in' )
                    {
                    // InternalENVIRONMENT.g:7261:3: (enumLiteral_1= 'in' )
                    // InternalENVIRONMENT.g:7262:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,137,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7269:3: (enumLiteral_2= 'out' )
                    {
                    // InternalENVIRONMENT.g:7269:3: (enumLiteral_2= 'out' )
                    // InternalENVIRONMENT.g:7270:4: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,138,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentInterfaceIOType"


    // $ANTLR start "ruleGSSEnvironmentUpperLevelLevel"
    // InternalENVIRONMENT.g:7280:1: ruleGSSEnvironmentUpperLevelLevel returns [Enumerator current=null] : ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) ;
    public final Enumerator ruleGSSEnvironmentUpperLevelLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7286:2: ( ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) )
            // InternalENVIRONMENT.g:7287:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            {
            // InternalENVIRONMENT.g:7287:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt63=1;
                }
                break;
            case 140:
                {
                alt63=2;
                }
                break;
            case 141:
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
                    // InternalENVIRONMENT.g:7288:3: (enumLiteral_0= '_1' )
                    {
                    // InternalENVIRONMENT.g:7288:3: (enumLiteral_0= '_1' )
                    // InternalENVIRONMENT.g:7289:4: enumLiteral_0= '_1'
                    {
                    enumLiteral_0=(Token)match(input,139,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7296:3: (enumLiteral_1= '_2' )
                    {
                    // InternalENVIRONMENT.g:7296:3: (enumLiteral_1= '_2' )
                    // InternalENVIRONMENT.g:7297:4: enumLiteral_1= '_2'
                    {
                    enumLiteral_1=(Token)match(input,140,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7304:3: (enumLiteral_2= '_3' )
                    {
                    // InternalENVIRONMENT.g:7304:3: (enumLiteral_2= '_3' )
                    // InternalENVIRONMENT.g:7305:4: enumLiteral_2= '_3'
                    {
                    enumLiteral_2=(Token)match(input,141,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentUpperLevelLevel"


    // $ANTLR start "ruleGSSEnvironmentUnit"
    // InternalENVIRONMENT.g:7315:1: ruleGSSEnvironmentUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) ;
    public final Enumerator ruleGSSEnvironmentUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7321:2: ( ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) )
            // InternalENVIRONMENT.g:7322:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            {
            // InternalENVIRONMENT.g:7322:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==142) ) {
                alt64=1;
            }
            else if ( (LA64_0==143) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalENVIRONMENT.g:7323:3: (enumLiteral_0= 'miliseconds' )
                    {
                    // InternalENVIRONMENT.g:7323:3: (enumLiteral_0= 'miliseconds' )
                    // InternalENVIRONMENT.g:7324:4: enumLiteral_0= 'miliseconds'
                    {
                    enumLiteral_0=(Token)match(input,142,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7331:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalENVIRONMENT.g:7331:3: (enumLiteral_1= 'seconds' )
                    // InternalENVIRONMENT.g:7332:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,143,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentUnitAccess().getSecondsEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentUnit"


    // $ANTLR start "ruleGSSEnvironmentGlobalVarType"
    // InternalENVIRONMENT.g:7342:1: ruleGSSEnvironmentGlobalVarType returns [Enumerator current=null] : ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) ;
    public final Enumerator ruleGSSEnvironmentGlobalVarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7348:2: ( ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) )
            // InternalENVIRONMENT.g:7349:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
            {
            // InternalENVIRONMENT.g:7349:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
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
                    // InternalENVIRONMENT.g:7350:3: (enumLiteral_0= 'uint' )
                    {
                    // InternalENVIRONMENT.g:7350:3: (enumLiteral_0= 'uint' )
                    // InternalENVIRONMENT.g:7351:4: enumLiteral_0= 'uint'
                    {
                    enumLiteral_0=(Token)match(input,144,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7358:3: (enumLiteral_1= 'formula' )
                    {
                    // InternalENVIRONMENT.g:7358:3: (enumLiteral_1= 'formula' )
                    // InternalENVIRONMENT.g:7359:4: enumLiteral_1= 'formula'
                    {
                    enumLiteral_1=(Token)match(input,145,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentGlobalVarType"


    // $ANTLR start "ruleGSSEnvironmentReferenceFieldType"
    // InternalENVIRONMENT.g:7369:1: ruleGSSEnvironmentReferenceFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) ;
    public final Enumerator ruleGSSEnvironmentReferenceFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7375:2: ( ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) )
            // InternalENVIRONMENT.g:7376:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
            {
            // InternalENVIRONMENT.g:7376:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
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
                    // InternalENVIRONMENT.g:7377:3: (enumLiteral_0= 'tm' )
                    {
                    // InternalENVIRONMENT.g:7377:3: (enumLiteral_0= 'tm' )
                    // InternalENVIRONMENT.g:7378:4: enumLiteral_0= 'tm'
                    {
                    enumLiteral_0=(Token)match(input,146,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7385:3: (enumLiteral_1= 'tc' )
                    {
                    // InternalENVIRONMENT.g:7385:3: (enumLiteral_1= 'tc' )
                    // InternalENVIRONMENT.g:7386:4: enumLiteral_1= 'tc'
                    {
                    enumLiteral_1=(Token)match(input,147,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentReferenceFieldType"


    // $ANTLR start "ruleGSSEnvironmentAlarmMsgType"
    // InternalENVIRONMENT.g:7396:1: ruleGSSEnvironmentAlarmMsgType returns [Enumerator current=null] : ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) ;
    public final Enumerator ruleGSSEnvironmentAlarmMsgType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7402:2: ( ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) )
            // InternalENVIRONMENT.g:7403:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            {
            // InternalENVIRONMENT.g:7403:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 148:
                {
                alt67=1;
                }
                break;
            case 149:
                {
                alt67=2;
                }
                break;
            case 150:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalENVIRONMENT.g:7404:3: (enumLiteral_0= 'alarm1' )
                    {
                    // InternalENVIRONMENT.g:7404:3: (enumLiteral_0= 'alarm1' )
                    // InternalENVIRONMENT.g:7405:4: enumLiteral_0= 'alarm1'
                    {
                    enumLiteral_0=(Token)match(input,148,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7412:3: (enumLiteral_1= 'alarm2' )
                    {
                    // InternalENVIRONMENT.g:7412:3: (enumLiteral_1= 'alarm2' )
                    // InternalENVIRONMENT.g:7413:4: enumLiteral_1= 'alarm2'
                    {
                    enumLiteral_1=(Token)match(input,149,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalENVIRONMENT.g:7420:3: (enumLiteral_2= 'alarm3' )
                    {
                    // InternalENVIRONMENT.g:7420:3: (enumLiteral_2= 'alarm3' )
                    // InternalENVIRONMENT.g:7421:4: enumLiteral_2= 'alarm3'
                    {
                    enumLiteral_2=(Token)match(input,150,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSEnvironmentAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentAlarmMsgType"


    // $ANTLR start "ruleGSSEnvironmentModifyType"
    // InternalENVIRONMENT.g:7431:1: ruleGSSEnvironmentModifyType returns [Enumerator current=null] : ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) ;
    public final Enumerator ruleGSSEnvironmentModifyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7437:2: ( ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) )
            // InternalENVIRONMENT.g:7438:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            {
            // InternalENVIRONMENT.g:7438:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==151) ) {
                alt68=1;
            }
            else if ( (LA68_0==152) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalENVIRONMENT.g:7439:3: (enumLiteral_0= 'increment' )
                    {
                    // InternalENVIRONMENT.g:7439:3: (enumLiteral_0= 'increment' )
                    // InternalENVIRONMENT.g:7440:4: enumLiteral_0= 'increment'
                    {
                    enumLiteral_0=(Token)match(input,151,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrementEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalENVIRONMENT.g:7447:3: (enumLiteral_1= 'increment1wrap' )
                    {
                    // InternalENVIRONMENT.g:7447:3: (enumLiteral_1= 'increment1wrap' )
                    // InternalENVIRONMENT.g:7448:4: enumLiteral_1= 'increment1wrap'
                    {
                    enumLiteral_1=(Token)match(input,152,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSEnvironmentModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSEnvironmentModifyType"


    // $ANTLR start "ruleGSSEnvironmentAlarmValType"
    // InternalENVIRONMENT.g:7458:1: ruleGSSEnvironmentAlarmValType returns [Enumerator current=null] : (enumLiteral_0= 'alarm1' ) ;
    public final Enumerator ruleGSSEnvironmentAlarmValType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalENVIRONMENT.g:7464:2: ( (enumLiteral_0= 'alarm1' ) )
            // InternalENVIRONMENT.g:7465:2: (enumLiteral_0= 'alarm1' )
            {
            // InternalENVIRONMENT.g:7465:2: (enumLiteral_0= 'alarm1' )
            // InternalENVIRONMENT.g:7466:3: enumLiteral_0= 'alarm1'
            {
            enumLiteral_0=(Token)match(input,148,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getGSSEnvironmentAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getGSSEnvironmentAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleGSSEnvironmentAlarmValType"

    // $ANTLR start synpred4_InternalENVIRONMENT
    public final void synpred4_InternalENVIRONMENT_fragment() throws RecognitionException {   
        EObject lv_GlobalVars_9_0 = null;


        // InternalENVIRONMENT.g:474:4: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) ) )
        // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) )
        {
        // InternalENVIRONMENT.g:474:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) ) )
        // InternalENVIRONMENT.g:475:5: {...}? => ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalENVIRONMENT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0)");
        }
        // InternalENVIRONMENT.g:475:119: ( ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) ) )
        // InternalENVIRONMENT.g:476:6: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 0);
        // InternalENVIRONMENT.g:479:9: ({...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) ) )
        // InternalENVIRONMENT.g:479:10: {...}? => ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalENVIRONMENT", "true");
        }
        // InternalENVIRONMENT.g:479:19: ( (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars ) )
        // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars )
        {
        // InternalENVIRONMENT.g:479:20: (lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars )
        // InternalENVIRONMENT.g:480:10: lv_GlobalVars_9_0= ruleGSSEnvironmentGlobalVars
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getGlobalVarsGSSEnvironmentGlobalVarsParserRuleCall_8_0_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_GlobalVars_9_0=ruleGSSEnvironmentGlobalVars();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalENVIRONMENT

    // $ANTLR start synpred5_InternalENVIRONMENT
    public final void synpred5_InternalENVIRONMENT_fragment() throws RecognitionException {   
        EObject lv_Monitors_10_0 = null;


        // InternalENVIRONMENT.g:502:4: ( ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) ) )
        // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) )
        {
        // InternalENVIRONMENT.g:502:4: ({...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) ) )
        // InternalENVIRONMENT.g:503:5: {...}? => ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalENVIRONMENT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1)");
        }
        // InternalENVIRONMENT.g:503:119: ( ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) ) )
        // InternalENVIRONMENT.g:504:6: ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSEnvironmentScenarioAccess().getUnorderedGroup_8(), 1);
        // InternalENVIRONMENT.g:507:9: ({...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) ) )
        // InternalENVIRONMENT.g:507:10: {...}? => ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalENVIRONMENT", "true");
        }
        // InternalENVIRONMENT.g:507:19: ( (lv_Monitors_10_0= ruleGSSEnvironmentMonitors ) )
        // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSEnvironmentMonitors )
        {
        // InternalENVIRONMENT.g:507:20: (lv_Monitors_10_0= ruleGSSEnvironmentMonitors )
        // InternalENVIRONMENT.g:508:10: lv_Monitors_10_0= ruleGSSEnvironmentMonitors
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSEnvironmentScenarioAccess().getMonitorsGSSEnvironmentMonitorsParserRuleCall_8_1_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_Monitors_10_0=ruleGSSEnvironmentMonitors();

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

    // Delegated rules

    public final boolean synpred4_InternalENVIRONMENT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalENVIRONMENT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F080000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000E080000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C080000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000080000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000080000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080000L,0x0000000500800000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L,0x0000001000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L,0x0015400000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010080000L,0x0015400000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100080000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000000000C0L,0x2000000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0002000000080000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000F8L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000700L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x02C0000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x02C0000000080000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x82C0000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x82C0000000080000L,0x0000000000000001L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x6000000000080000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x4000000000080000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000080000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000080000L,0x0000000000004200L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000080000L,0x0000000000080000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000080000L,0x0000000000200000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003800L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x5400000000080000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x5000000000080000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000080000L,0x00000000F0000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000080000L,0x00000000E0000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000080000L,0x00000000C0000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000080000L,0x0000000080000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000000210000000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000840000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000030000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000288000000000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000C0000L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
        public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0120000000000000L});
        public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000700000L});
        public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
        public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
        public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
        public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
        public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000080000L,0x0080000000000000L});
        public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
        public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
        public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
        public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
        public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
        public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
        public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000022L,0x4200000000000000L});
        public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000022L,0x4000000000000000L});
        public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    }


}