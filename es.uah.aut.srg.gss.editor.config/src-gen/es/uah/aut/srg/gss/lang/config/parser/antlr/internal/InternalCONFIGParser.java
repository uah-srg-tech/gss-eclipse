package es.uah.aut.srg.gss.lang.config.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.config.services.CONFIGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*******************************************************************************
 * Copyright (c) 2018 UAH Space Research Group.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SRG Team - Initial API and implementation
 ******************************************************************************/
@SuppressWarnings("all")
public class InternalCONFIGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSConfigGSSConfig'", "'{'", "'uri'", "'version'", "'}'", "'GSSConfigGSSOptions'", "'GSSConfigProtocols'", "'GSSConfigInterfaces'", "'GSSConfigSpecialPackets'", "'GSSConfigPeriodicTCs'", "'GSSConfigGlobalVars'", "'GSSConfigMonitors'", "'ChartsFile'", "'GSSConfigTests'", "'ProtocolPacketsFile'", "'GSSConfigGSSInfo'", "'test_campaign'", "'date'", "'version_control_url'", "'GSSConfigGSSInfoPrint'", "'mainLog'", "'portLogs'", "'debugLog'", "'GSSConfigPhyHeaderPrint'", "'gssTabs'", "'GSSConfigGSSDiscardErrorFlags'", "'txErrors'", "'notExpectedPackets'", "'filtersKo'", "'validTimesKo'", "'GSSConfigProtocol'", "'id'", "'name'", "'typeLevel'", "'typeOffset'", "'subtypeOffset'", "'GSSConfigMainInterface'", "'ifType'", "'ifConfig'", "'ioType'", "'protocolID'", "'GSSConfigInterface'", "'GSSConfigLevelInOut'", "'TMformat'", "'TCformat'", "'inputFilter'", "'export_to_prev_Level'", "'import_from_prev_Level'", "'GSSConfigLevelIn'", "'GSSConfigLevelOut'", "'GSSConfigSpecialPacket'", "'status'", "'ifRef'", "'levels'", "'levelRef'", "'GSSConfigUpperLevels'", "'GSSConfigPrintingData'", "'printStatus'", "'GSSConfigPeriod'", "'min_value'", "'min_unit'", "'max_value'", "'max_unit'", "'GSSConfigIntervalRange'", "'min'", "'max'", "'interval_value'", "'interval_unit'", "'GSSConfigUpperLevel'", "'level'", "'GSSConfigStructuredData'", "'firstField'", "'GSSConfigPeriodicTCLevel2'", "'period_value'", "'period_unit'", "'level2'", "'app_to_level2'", "'level1'", "'level2_to_level1'", "'level0'", "'level1_to_level0'", "'GSSConfigPeriodicTCLevel1'", "'app_to_level1'", "'GSSConfigPeriodicTCLevel0'", "'app_to_level0'", "'GSSConfigGlobalVar'", "'type'", "'initial_value'", "'GSSConfigReferenceField'", "'fieldRef'", "'offset'", "'size'", "'GSSConfigReferencePeriodicTC'", "'idRef'", "'GSSConfigReferenceSpecialPacket'", "'GSSConfigPlot'", "'GSSConfigAlarmMsg'", "'text'", "'GSSConfigModify'", "'value'", "'GSSConfigAlarmVal'", "'GSSConfigGVFiltered'", "'GlobalVarRef'", "'filter'", "'GSSConfigGVPeriodic'", "'GSSConfigTestCase'", "'procedure'", "'req'", "'reqAction'", "'.'", "'('", "')'", "'::'", "'-'", "'/'", "'+'", "'://'", "'disabled'", "'enabled'", "'SpW'", "'uart'", "'dummy'", "'in_out'", "'SpW_TC'", "'SpW_Error'", "'in'", "'out'", "'_1'", "'_2'", "'_3'", "'miliseconds'", "'seconds'", "'uint'", "'formula'", "'tm'", "'tc'", "'alarm1'", "'alarm2'", "'alarm3'", "'increment'", "'increment1wrap'"
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
    public static final int T__155=155;
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


        public InternalCONFIGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCONFIGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCONFIGParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCONFIG.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private CONFIGGrammarAccess grammarAccess;

        public InternalCONFIGParser(TokenStream input, CONFIGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected CONFIGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalCONFIG.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalCONFIG.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalCONFIG.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalCONFIG.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSConfigGSSConfig ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSConfigGSSConfig ) ) ) )
            // InternalCONFIG.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSConfigGSSConfig ) ) )
            {
            // InternalCONFIG.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSConfigGSSConfig ) ) )
            // InternalCONFIG.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSConfigGSSConfig ) )
            {
            // InternalCONFIG.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCONFIG.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalCONFIG.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalCONFIG.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCONFIG.g:113:3: ( (lv_element_1_0= ruleGSSConfigGSSConfig ) )
            // InternalCONFIG.g:114:4: (lv_element_1_0= ruleGSSConfigGSSConfig )
            {
            // InternalCONFIG.g:114:4: (lv_element_1_0= ruleGSSConfigGSSConfig )
            // InternalCONFIG.g:115:5: lv_element_1_0= ruleGSSConfigGSSConfig
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSConfigGSSConfigParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSConfigGSSConfig();

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
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSConfig");
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
    // InternalCONFIG.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalCONFIG.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalCONFIG.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalCONFIG.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCONFIG.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalCONFIG.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalCONFIG.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalCONFIG.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalCONFIG.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalCONFIG.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalCONFIG.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalCONFIG.g:161:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleGSSConfigGSSConfig"
    // InternalCONFIG.g:185:1: entryRuleGSSConfigGSSConfig returns [EObject current=null] : iv_ruleGSSConfigGSSConfig= ruleGSSConfigGSSConfig EOF ;
    public final EObject entryRuleGSSConfigGSSConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSConfig = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 
        	grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9()
        	);

        try {
            // InternalCONFIG.g:190:2: (iv_ruleGSSConfigGSSConfig= ruleGSSConfigGSSConfig EOF )
            // InternalCONFIG.g:191:2: iv_ruleGSSConfigGSSConfig= ruleGSSConfigGSSConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGSSConfigRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGSSConfig=ruleGSSConfigGSSConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGSSConfig; 
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
    // $ANTLR end "entryRuleGSSConfigGSSConfig"


    // $ANTLR start "ruleGSSConfigGSSConfig"
    // InternalCONFIG.g:200:1: ruleGSSConfigGSSConfig returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_gss_options_12_0= ruleGSSConfigGSSOptions ) ) ( (lv_Protocols_13_0= ruleGSSConfigProtocols ) ) ( (lv_Interfaces_14_0= ruleGSSConfigInterfaces ) ) ( (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets ) )? ( (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) ) )? ( (lv_Tests_20_0= ruleGSSConfigTests ) ) otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleGSSConfigGSSConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_gss_options_12_0 = null;

        EObject lv_Protocols_13_0 = null;

        EObject lv_Interfaces_14_0 = null;

        EObject lv_SpecialPackets_15_0 = null;

        EObject lv_PeriodicTCs_16_0 = null;

        EObject lv_GlobalVars_18_0 = null;

        EObject lv_Monitors_19_0 = null;

        EObject lv_Tests_20_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 
        	grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9()
        	);

        try {
            // InternalCONFIG.g:210:2: ( (otherlv_0= 'GSSConfigGSSConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_gss_options_12_0= ruleGSSConfigGSSOptions ) ) ( (lv_Protocols_13_0= ruleGSSConfigProtocols ) ) ( (lv_Interfaces_14_0= ruleGSSConfigInterfaces ) ) ( (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets ) )? ( (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) ) )? ( (lv_Tests_20_0= ruleGSSConfigTests ) ) otherlv_21= '}' otherlv_22= ';' ) )
            // InternalCONFIG.g:211:2: (otherlv_0= 'GSSConfigGSSConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_gss_options_12_0= ruleGSSConfigGSSOptions ) ) ( (lv_Protocols_13_0= ruleGSSConfigProtocols ) ) ( (lv_Interfaces_14_0= ruleGSSConfigInterfaces ) ) ( (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets ) )? ( (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) ) )? ( (lv_Tests_20_0= ruleGSSConfigTests ) ) otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalCONFIG.g:211:2: (otherlv_0= 'GSSConfigGSSConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_gss_options_12_0= ruleGSSConfigGSSOptions ) ) ( (lv_Protocols_13_0= ruleGSSConfigProtocols ) ) ( (lv_Interfaces_14_0= ruleGSSConfigInterfaces ) ) ( (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets ) )? ( (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) ) )? ( (lv_Tests_20_0= ruleGSSConfigTests ) ) otherlv_21= '}' otherlv_22= ';' )
            // InternalCONFIG.g:212:3: otherlv_0= 'GSSConfigGSSConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_gss_options_12_0= ruleGSSConfigGSSOptions ) ) ( (lv_Protocols_13_0= ruleGSSConfigProtocols ) ) ( (lv_Interfaces_14_0= ruleGSSConfigInterfaces ) ) ( (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets ) )? ( (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) ) )? ( (lv_Tests_20_0= ruleGSSConfigTests ) ) otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSConfigAccess().getGSSConfigGSSConfigKeyword_0());
              		
            }
            // InternalCONFIG.g:216:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCONFIG.g:217:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCONFIG.g:217:4: (lv_name_1_0= RULE_ID )
            // InternalCONFIG.g:218:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSConfigGSSConfigAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigGSSConfigRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSConfigAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCONFIG.g:238:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) )
            // InternalCONFIG.g:239:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalCONFIG.g:239:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            // InternalCONFIG.g:240:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3());
            // InternalCONFIG.g:243:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            // InternalCONFIG.g:244:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?
            {
            // InternalCONFIG.g:244:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCONFIG.g:245:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalCONFIG.g:245:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalCONFIG.g:246:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalCONFIG.g:246:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalCONFIG.g:247:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 0);
            	    // InternalCONFIG.g:250:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalCONFIG.g:250:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "true");
            	    }
            	    // InternalCONFIG.g:250:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalCONFIG.g:250:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSConfigGSSConfigAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalCONFIG.g:258:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalCONFIG.g:259:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalCONFIG.g:259:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalCONFIG.g:260:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.config.CONFIG.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCONFIG.g:287:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalCONFIG.g:287:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalCONFIG.g:288:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalCONFIG.g:288:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalCONFIG.g:289:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 1);
            	    // InternalCONFIG.g:292:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalCONFIG.g:292:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "true");
            	    }
            	    // InternalCONFIG.g:292:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalCONFIG.g:292:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSConfigGSSConfigAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSConfigAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalCONFIG.g:300:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalCONFIG.g:301:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalCONFIG.g:301:10: (lv_version_10_0= ruleVersion )
            	    // InternalCONFIG.g:302:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.gss.lang.config.CONFIG.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3());

            }

            // InternalCONFIG.g:337:3: ( (lv_gss_options_12_0= ruleGSSConfigGSSOptions ) )
            // InternalCONFIG.g:338:4: (lv_gss_options_12_0= ruleGSSConfigGSSOptions )
            {
            // InternalCONFIG.g:338:4: (lv_gss_options_12_0= ruleGSSConfigGSSOptions )
            // InternalCONFIG.g:339:5: lv_gss_options_12_0= ruleGSSConfigGSSOptions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getGss_optionsGSSConfigGSSOptionsParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_gss_options_12_0=ruleGSSConfigGSSOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
              					}
              					set(
              						current,
              						"gss_options",
              						lv_gss_options_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSOptions");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:356:3: ( (lv_Protocols_13_0= ruleGSSConfigProtocols ) )
            // InternalCONFIG.g:357:4: (lv_Protocols_13_0= ruleGSSConfigProtocols )
            {
            // InternalCONFIG.g:357:4: (lv_Protocols_13_0= ruleGSSConfigProtocols )
            // InternalCONFIG.g:358:5: lv_Protocols_13_0= ruleGSSConfigProtocols
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getProtocolsGSSConfigProtocolsParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_Protocols_13_0=ruleGSSConfigProtocols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
              					}
              					set(
              						current,
              						"Protocols",
              						lv_Protocols_13_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigProtocols");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:375:3: ( (lv_Interfaces_14_0= ruleGSSConfigInterfaces ) )
            // InternalCONFIG.g:376:4: (lv_Interfaces_14_0= ruleGSSConfigInterfaces )
            {
            // InternalCONFIG.g:376:4: (lv_Interfaces_14_0= ruleGSSConfigInterfaces )
            // InternalCONFIG.g:377:5: lv_Interfaces_14_0= ruleGSSConfigInterfaces
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getInterfacesGSSConfigInterfacesParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_Interfaces_14_0=ruleGSSConfigInterfaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
              					}
              					set(
              						current,
              						"Interfaces",
              						lv_Interfaces_14_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaces");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:394:3: ( (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCONFIG.g:395:4: (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets )
                    {
                    // InternalCONFIG.g:395:4: (lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets )
                    // InternalCONFIG.g:396:5: lv_SpecialPackets_15_0= ruleGSSConfigSpecialPackets
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getSpecialPacketsGSSConfigSpecialPacketsParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_SpecialPackets_15_0=ruleGSSConfigSpecialPackets();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
                      					}
                      					set(
                      						current,
                      						"SpecialPackets",
                      						lv_SpecialPackets_15_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigSpecialPackets");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCONFIG.g:413:3: ( (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCONFIG.g:414:4: (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs )
                    {
                    // InternalCONFIG.g:414:4: (lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs )
                    // InternalCONFIG.g:415:5: lv_PeriodicTCs_16_0= ruleGSSConfigPeriodicTCs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getPeriodicTCsGSSConfigPeriodicTCsParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_PeriodicTCs_16_0=ruleGSSConfigPeriodicTCs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
                      					}
                      					set(
                      						current,
                      						"PeriodicTCs",
                      						lv_PeriodicTCs_16_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCONFIG.g:432:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=25 && LA6_0<=26)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCONFIG.g:433:4: ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalCONFIG.g:433:4: ( ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?) )
                    // InternalCONFIG.g:434:5: ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?)
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9());
                    // InternalCONFIG.g:437:5: ( ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?)
                    // InternalCONFIG.g:438:6: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+ {...}?
                    {
                    // InternalCONFIG.g:438:6: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( LA5_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 0) ) {
                            alt5=1;
                        }
                        else if ( LA5_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 1) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCONFIG.g:439:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) )
                    	    {
                    	    // InternalCONFIG.g:439:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) )
                    	    // InternalCONFIG.g:440:5: {...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 0)");
                    	    }
                    	    // InternalCONFIG.g:440:115: ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) )
                    	    // InternalCONFIG.g:441:6: ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 0);
                    	    // InternalCONFIG.g:444:9: ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) )
                    	    // InternalCONFIG.g:444:10: {...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "true");
                    	    }
                    	    // InternalCONFIG.g:444:19: ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) )
                    	    // InternalCONFIG.g:444:20: (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars )
                    	    {
                    	    // InternalCONFIG.g:444:20: (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars )
                    	    // InternalCONFIG.g:445:10: lv_GlobalVars_18_0= ruleGSSConfigGlobalVars
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      										newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsGSSConfigGlobalVarsParserRuleCall_9_0_0());
                    	      									
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_GlobalVars_18_0=ruleGSSConfigGlobalVars();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										if (current==null) {
                    	      											current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
                    	      										}
                    	      										set(
                    	      											current,
                    	      											"GlobalVars",
                    	      											lv_GlobalVars_18_0,
                    	      											"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVars");
                    	      										afterParserOrEnumRuleCall();
                    	      									
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCONFIG.g:467:4: ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) )
                    	    {
                    	    // InternalCONFIG.g:467:4: ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) )
                    	    // InternalCONFIG.g:468:5: {...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 1)");
                    	    }
                    	    // InternalCONFIG.g:468:115: ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) )
                    	    // InternalCONFIG.g:469:6: ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 1);
                    	    // InternalCONFIG.g:472:9: ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) )
                    	    // InternalCONFIG.g:472:10: {...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "true");
                    	    }
                    	    // InternalCONFIG.g:472:19: ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) )
                    	    // InternalCONFIG.g:472:20: (lv_Monitors_19_0= ruleGSSConfigMonitors )
                    	    {
                    	    // InternalCONFIG.g:472:20: (lv_Monitors_19_0= ruleGSSConfigMonitors )
                    	    // InternalCONFIG.g:473:10: lv_Monitors_19_0= ruleGSSConfigMonitors
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      										newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsGSSConfigMonitorsParserRuleCall_9_1_0());
                    	      									
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_14);
                    	    lv_Monitors_19_0=ruleGSSConfigMonitors();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										if (current==null) {
                    	      											current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
                    	      										}
                    	      										set(
                    	      											current,
                    	      											"Monitors",
                    	      											lv_Monitors_19_0,
                    	      											"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMonitors");
                    	      										afterParserOrEnumRuleCall();
                    	      									
                    	    }

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9());

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

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9()) ) {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        throw new FailedPredicateException(input, "ruleGSSConfigGSSConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9())");
                    }

                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9());

                    }
                    break;

            }

            // InternalCONFIG.g:503:3: ( (lv_Tests_20_0= ruleGSSConfigTests ) )
            // InternalCONFIG.g:504:4: (lv_Tests_20_0= ruleGSSConfigTests )
            {
            // InternalCONFIG.g:504:4: (lv_Tests_20_0= ruleGSSConfigTests )
            // InternalCONFIG.g:505:5: lv_Tests_20_0= ruleGSSConfigTests
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getTestsGSSConfigTestsParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_Tests_20_0=ruleGSSConfigTests();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSConfigRule());
              					}
              					set(
              						current,
              						"Tests",
              						lv_Tests_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTests");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigGSSConfigAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigGSSConfigAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleGSSConfigGSSConfig"


    // $ANTLR start "entryRuleGSSConfigGSSOptions"
    // InternalCONFIG.g:537:1: entryRuleGSSConfigGSSOptions returns [EObject current=null] : iv_ruleGSSConfigGSSOptions= ruleGSSConfigGSSOptions EOF ;
    public final EObject entryRuleGSSConfigGSSOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSOptions = null;


        try {
            // InternalCONFIG.g:537:60: (iv_ruleGSSConfigGSSOptions= ruleGSSConfigGSSOptions EOF )
            // InternalCONFIG.g:538:2: iv_ruleGSSConfigGSSOptions= ruleGSSConfigGSSOptions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGSSOptionsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGSSOptions=ruleGSSConfigGSSOptions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGSSOptions; 
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
    // $ANTLR end "entryRuleGSSConfigGSSOptions"


    // $ANTLR start "ruleGSSConfigGSSOptions"
    // InternalCONFIG.g:544:1: ruleGSSConfigGSSOptions returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSConfigGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigGSSOptions() throws RecognitionException {
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
            // InternalCONFIG.g:550:2: ( (otherlv_0= 'GSSConfigGSSOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSConfigGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:551:2: (otherlv_0= 'GSSConfigGSSOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSConfigGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:551:2: (otherlv_0= 'GSSConfigGSSOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSConfigGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:552:3: otherlv_0= 'GSSConfigGSSOptions' otherlv_1= '{' ( (lv_gss_info_2_0= ruleGSSConfigGSSInfo ) ) ( (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint ) ) ( (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint ) ) ( (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags ) ) otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSOptionsAccess().getGSSConfigGSSOptionsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSOptionsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:560:3: ( (lv_gss_info_2_0= ruleGSSConfigGSSInfo ) )
            // InternalCONFIG.g:561:4: (lv_gss_info_2_0= ruleGSSConfigGSSInfo )
            {
            // InternalCONFIG.g:561:4: (lv_gss_info_2_0= ruleGSSConfigGSSInfo )
            // InternalCONFIG.g:562:5: lv_gss_info_2_0= ruleGSSConfigGSSInfo
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_infoGSSConfigGSSInfoParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
            lv_gss_info_2_0=ruleGSSConfigGSSInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
              					}
              					set(
              						current,
              						"gss_info",
              						lv_gss_info_2_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSInfo");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:579:3: ( (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint ) )
            // InternalCONFIG.g:580:4: (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint )
            {
            // InternalCONFIG.g:580:4: (lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint )
            // InternalCONFIG.g:581:5: lv_gss_info_print_3_0= ruleGSSConfigGSSInfoPrint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getGss_info_printGSSConfigGSSInfoPrintParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_18);
            lv_gss_info_print_3_0=ruleGSSConfigGSSInfoPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
              					}
              					set(
              						current,
              						"gss_info_print",
              						lv_gss_info_print_3_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSInfoPrint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:598:3: ( (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint ) )
            // InternalCONFIG.g:599:4: (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint )
            {
            // InternalCONFIG.g:599:4: (lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint )
            // InternalCONFIG.g:600:5: lv_phy_header_print_4_0= ruleGSSConfigPhyHeaderPrint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getPhy_header_printGSSConfigPhyHeaderPrintParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_phy_header_print_4_0=ruleGSSConfigPhyHeaderPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
              					}
              					set(
              						current,
              						"phy_header_print",
              						lv_phy_header_print_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPhyHeaderPrint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:617:3: ( (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags ) )
            // InternalCONFIG.g:618:4: (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags )
            {
            // InternalCONFIG.g:618:4: (lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags )
            // InternalCONFIG.g:619:5: lv_discardErrorFlags_5_0= ruleGSSConfigGSSDiscardErrorFlags
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSOptionsAccess().getDiscardErrorFlagsGSSConfigGSSDiscardErrorFlagsParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_discardErrorFlags_5_0=ruleGSSConfigGSSDiscardErrorFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSOptionsRule());
              					}
              					set(
              						current,
              						"discardErrorFlags",
              						lv_discardErrorFlags_5_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGSSDiscardErrorFlags");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSOptionsAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSOptionsAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigGSSOptions"


    // $ANTLR start "entryRuleGSSConfigProtocols"
    // InternalCONFIG.g:648:1: entryRuleGSSConfigProtocols returns [EObject current=null] : iv_ruleGSSConfigProtocols= ruleGSSConfigProtocols EOF ;
    public final EObject entryRuleGSSConfigProtocols() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigProtocols = null;


        try {
            // InternalCONFIG.g:648:59: (iv_ruleGSSConfigProtocols= ruleGSSConfigProtocols EOF )
            // InternalCONFIG.g:649:2: iv_ruleGSSConfigProtocols= ruleGSSConfigProtocols EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigProtocolsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigProtocols=ruleGSSConfigProtocols();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigProtocols; 
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
    // $ANTLR end "entryRuleGSSConfigProtocols"


    // $ANTLR start "ruleGSSConfigProtocols"
    // InternalCONFIG.g:655:1: ruleGSSConfigProtocols returns [EObject current=null] : (otherlv_0= 'GSSConfigProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSConfigProtocol ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSConfigProtocols() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_Protocol_2_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:661:2: ( (otherlv_0= 'GSSConfigProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSConfigProtocol ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalCONFIG.g:662:2: (otherlv_0= 'GSSConfigProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSConfigProtocol ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalCONFIG.g:662:2: (otherlv_0= 'GSSConfigProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSConfigProtocol ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalCONFIG.g:663:3: otherlv_0= 'GSSConfigProtocols' otherlv_1= '{' ( (lv_Protocol_2_0= ruleGSSConfigProtocol ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigProtocolsAccess().getGSSConfigProtocolsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigProtocolsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:671:3: ( (lv_Protocol_2_0= ruleGSSConfigProtocol ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCONFIG.g:672:4: (lv_Protocol_2_0= ruleGSSConfigProtocol )
            	    {
            	    // InternalCONFIG.g:672:4: (lv_Protocol_2_0= ruleGSSConfigProtocol )
            	    // InternalCONFIG.g:673:5: lv_Protocol_2_0= ruleGSSConfigProtocol
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigProtocolsAccess().getProtocolGSSConfigProtocolParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    lv_Protocol_2_0=ruleGSSConfigProtocol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSConfigProtocolsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Protocol",
            	      						lv_Protocol_2_0,
            	      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigProtocol");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigProtocolsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSConfigProtocolsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSConfigProtocols"


    // $ANTLR start "entryRuleGSSConfigInterfaces"
    // InternalCONFIG.g:702:1: entryRuleGSSConfigInterfaces returns [EObject current=null] : iv_ruleGSSConfigInterfaces= ruleGSSConfigInterfaces EOF ;
    public final EObject entryRuleGSSConfigInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigInterfaces = null;


        try {
            // InternalCONFIG.g:702:60: (iv_ruleGSSConfigInterfaces= ruleGSSConfigInterfaces EOF )
            // InternalCONFIG.g:703:2: iv_ruleGSSConfigInterfaces= ruleGSSConfigInterfaces EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigInterfacesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigInterfaces=ruleGSSConfigInterfaces();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigInterfaces; 
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
    // $ANTLR end "entryRuleGSSConfigInterfaces"


    // $ANTLR start "ruleGSSConfigInterfaces"
    // InternalCONFIG.g:709:1: ruleGSSConfigInterfaces returns [EObject current=null] : (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSConfigInterfaces() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_MainInterface_2_0 = null;

        EObject lv_Interface_3_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:715:2: ( (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalCONFIG.g:716:2: (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalCONFIG.g:716:2: (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalCONFIG.g:717:3: otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )* otherlv_4= '}' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigInterfacesAccess().getGSSConfigInterfacesKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigInterfacesAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:725:3: ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) )
            // InternalCONFIG.g:726:4: (lv_MainInterface_2_0= ruleGSSConfigMainInterface )
            {
            // InternalCONFIG.g:726:4: (lv_MainInterface_2_0= ruleGSSConfigMainInterface )
            // InternalCONFIG.g:727:5: lv_MainInterface_2_0= ruleGSSConfigMainInterface
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigInterfacesAccess().getMainInterfaceGSSConfigMainInterfaceParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_MainInterface_2_0=ruleGSSConfigMainInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigInterfacesRule());
              					}
              					set(
              						current,
              						"MainInterface",
              						lv_MainInterface_2_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterface");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:744:3: ( (lv_Interface_3_0= ruleGSSConfigInterface ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==56) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCONFIG.g:745:4: (lv_Interface_3_0= ruleGSSConfigInterface )
            	    {
            	    // InternalCONFIG.g:745:4: (lv_Interface_3_0= ruleGSSConfigInterface )
            	    // InternalCONFIG.g:746:5: lv_Interface_3_0= ruleGSSConfigInterface
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigInterfacesAccess().getInterfaceGSSConfigInterfaceParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_Interface_3_0=ruleGSSConfigInterface();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSConfigInterfacesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Interface",
            	      						lv_Interface_3_0,
            	      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterface");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSConfigInterfacesAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigInterfacesAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSConfigInterfaces"


    // $ANTLR start "entryRuleGSSConfigSpecialPackets"
    // InternalCONFIG.g:775:1: entryRuleGSSConfigSpecialPackets returns [EObject current=null] : iv_ruleGSSConfigSpecialPackets= ruleGSSConfigSpecialPackets EOF ;
    public final EObject entryRuleGSSConfigSpecialPackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigSpecialPackets = null;


        try {
            // InternalCONFIG.g:775:64: (iv_ruleGSSConfigSpecialPackets= ruleGSSConfigSpecialPackets EOF )
            // InternalCONFIG.g:776:2: iv_ruleGSSConfigSpecialPackets= ruleGSSConfigSpecialPackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigSpecialPacketsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigSpecialPackets=ruleGSSConfigSpecialPackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigSpecialPackets; 
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
    // $ANTLR end "entryRuleGSSConfigSpecialPackets"


    // $ANTLR start "ruleGSSConfigSpecialPackets"
    // InternalCONFIG.g:782:1: ruleGSSConfigSpecialPackets returns [EObject current=null] : (otherlv_0= 'GSSConfigSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSConfigSpecialPackets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_SpecialPacket_2_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:788:2: ( (otherlv_0= 'GSSConfigSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' ) )
            // InternalCONFIG.g:789:2: (otherlv_0= 'GSSConfigSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalCONFIG.g:789:2: (otherlv_0= 'GSSConfigSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';' )
            // InternalCONFIG.g:790:3: otherlv_0= 'GSSConfigSpecialPackets' otherlv_1= '{' ( (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket ) ) otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigSpecialPacketsAccess().getGSSConfigSpecialPacketsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigSpecialPacketsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:798:3: ( (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket ) )
            // InternalCONFIG.g:799:4: (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket )
            {
            // InternalCONFIG.g:799:4: (lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket )
            // InternalCONFIG.g:800:5: lv_SpecialPacket_2_0= ruleGSSConfigSpecialPacket
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketsAccess().getSpecialPacketGSSConfigSpecialPacketParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_SpecialPacket_2_0=ruleGSSConfigSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketsRule());
              					}
              					add(
              						current,
              						"SpecialPacket",
              						lv_SpecialPacket_2_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigSpecialPacket");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigSpecialPacketsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSConfigSpecialPacketsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSConfigSpecialPackets"


    // $ANTLR start "entryRuleGSSConfigPeriodicTCs"
    // InternalCONFIG.g:829:1: entryRuleGSSConfigPeriodicTCs returns [EObject current=null] : iv_ruleGSSConfigPeriodicTCs= ruleGSSConfigPeriodicTCs EOF ;
    public final EObject entryRuleGSSConfigPeriodicTCs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriodicTCs = null;


        try {
            // InternalCONFIG.g:829:61: (iv_ruleGSSConfigPeriodicTCs= ruleGSSConfigPeriodicTCs EOF )
            // InternalCONFIG.g:830:2: iv_ruleGSSConfigPeriodicTCs= ruleGSSConfigPeriodicTCs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPeriodicTCs=ruleGSSConfigPeriodicTCs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPeriodicTCs; 
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
    // $ANTLR end "entryRuleGSSConfigPeriodicTCs"


    // $ANTLR start "ruleGSSConfigPeriodicTCs"
    // InternalCONFIG.g:836:1: ruleGSSConfigPeriodicTCs returns [EObject current=null] : ( () otherlv_1= 'GSSConfigPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigPeriodicTCs() throws RecognitionException {
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
            // InternalCONFIG.g:842:2: ( ( () otherlv_1= 'GSSConfigPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:843:2: ( () otherlv_1= 'GSSConfigPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:843:2: ( () otherlv_1= 'GSSConfigPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:844:3: () otherlv_1= 'GSSConfigPeriodicTCs' otherlv_2= '{' ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) ) )* otherlv_6= '}' otherlv_7= ';'
            {
            // InternalCONFIG.g:844:3: ()
            // InternalCONFIG.g:845:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCsAccess().getGSSConfigPeriodicTCsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCONFIG.g:862:3: ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 87:
                    {
                    alt9=1;
                    }
                    break;
                case 96:
                    {
                    alt9=2;
                    }
                    break;
                case 98:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalCONFIG.g:863:4: ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) )
            	    {
            	    // InternalCONFIG.g:863:4: ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) )
            	    // InternalCONFIG.g:864:5: (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 )
            	    {
            	    // InternalCONFIG.g:864:5: (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 )
            	    // InternalCONFIG.g:865:6: lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_2GSSConfigPeriodicTCLevel2ParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_PeriodicTC_level_2_3_0=ruleGSSConfigPeriodicTCLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"PeriodicTC_level_2",
            	      							lv_PeriodicTC_level_2_3_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel2");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCONFIG.g:883:4: ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) )
            	    {
            	    // InternalCONFIG.g:883:4: ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) )
            	    // InternalCONFIG.g:884:5: (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 )
            	    {
            	    // InternalCONFIG.g:884:5: (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 )
            	    // InternalCONFIG.g:885:6: lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_1GSSConfigPeriodicTCLevel1ParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_PeriodicTC_level_1_4_0=ruleGSSConfigPeriodicTCLevel1();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"PeriodicTC_level_1",
            	      							lv_PeriodicTC_level_1_4_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel1");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCONFIG.g:903:4: ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) )
            	    {
            	    // InternalCONFIG.g:903:4: ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) )
            	    // InternalCONFIG.g:904:5: (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 )
            	    {
            	    // InternalCONFIG.g:904:5: (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 )
            	    // InternalCONFIG.g:905:6: lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCsAccess().getPeriodicTC_level_0GSSConfigPeriodicTCLevel0ParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    lv_PeriodicTC_level_0_5_0=ruleGSSConfigPeriodicTCLevel0();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"PeriodicTC_level_0",
            	      							lv_PeriodicTC_level_0_5_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriodicTCLevel0");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCsAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSConfigPeriodicTCs"


    // $ANTLR start "entryRuleGSSConfigGlobalVars"
    // InternalCONFIG.g:935:1: entryRuleGSSConfigGlobalVars returns [EObject current=null] : iv_ruleGSSConfigGlobalVars= ruleGSSConfigGlobalVars EOF ;
    public final EObject entryRuleGSSConfigGlobalVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGlobalVars = null;


        try {
            // InternalCONFIG.g:935:60: (iv_ruleGSSConfigGlobalVars= ruleGSSConfigGlobalVars EOF )
            // InternalCONFIG.g:936:2: iv_ruleGSSConfigGlobalVars= ruleGSSConfigGlobalVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGlobalVarsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGlobalVars=ruleGSSConfigGlobalVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGlobalVars; 
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
    // $ANTLR end "entryRuleGSSConfigGlobalVars"


    // $ANTLR start "ruleGSSConfigGlobalVars"
    // InternalCONFIG.g:942:1: ruleGSSConfigGlobalVars returns [EObject current=null] : (otherlv_0= 'GSSConfigGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSConfigGlobalVars() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_GlobalVar_2_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:948:2: ( (otherlv_0= 'GSSConfigGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalCONFIG.g:949:2: (otherlv_0= 'GSSConfigGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalCONFIG.g:949:2: (otherlv_0= 'GSSConfigGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalCONFIG.g:950:3: otherlv_0= 'GSSConfigGlobalVars' otherlv_1= '{' ( (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGlobalVarsAccess().getGSSConfigGlobalVarsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGlobalVarsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:958:3: ( (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==100) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCONFIG.g:959:4: (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar )
            	    {
            	    // InternalCONFIG.g:959:4: (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar )
            	    // InternalCONFIG.g:960:5: lv_GlobalVar_2_0= ruleGSSConfigGlobalVar
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigGlobalVarsAccess().getGlobalVarGSSConfigGlobalVarParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_GlobalVar_2_0=ruleGSSConfigGlobalVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"GlobalVar",
            	      						lv_GlobalVar_2_0,
            	      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVar");
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

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGlobalVarsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSConfigGlobalVarsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSConfigGlobalVars"


    // $ANTLR start "entryRuleGSSConfigMonitors"
    // InternalCONFIG.g:989:1: entryRuleGSSConfigMonitors returns [EObject current=null] : iv_ruleGSSConfigMonitors= ruleGSSConfigMonitors EOF ;
    public final EObject entryRuleGSSConfigMonitors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigMonitors = null;


        try {
            // InternalCONFIG.g:989:58: (iv_ruleGSSConfigMonitors= ruleGSSConfigMonitors EOF )
            // InternalCONFIG.g:990:2: iv_ruleGSSConfigMonitors= ruleGSSConfigMonitors EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigMonitorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigMonitors=ruleGSSConfigMonitors();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigMonitors; 
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
    // $ANTLR end "entryRuleGSSConfigMonitors"


    // $ANTLR start "ruleGSSConfigMonitors"
    // InternalCONFIG.g:996:1: ruleGSSConfigMonitors returns [EObject current=null] : (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSConfigMonitors() throws RecognitionException {
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
            // InternalCONFIG.g:1002:2: ( (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCONFIG.g:1003:2: (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCONFIG.g:1003:2: (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' )
            // InternalCONFIG.g:1004:3: otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigMonitorsAccess().getGSSConfigMonitorsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigMonitorsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:1012:3: (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCONFIG.g:1013:4: otherlv_2= 'ChartsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGSSConfigMonitorsAccess().getChartsFileKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGSSConfigMonitorsAccess().getColonEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalCONFIG.g:1021:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:1022:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:1022:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:1023:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigMonitorsRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getChartsFileGSSChartsChartsCrossReference_2_2_0());
                      					
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

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:1045:3: ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=5;
                switch ( input.LA(1) ) {
                case 110:
                    {
                    alt12=1;
                    }
                    break;
                case 111:
                    {
                    alt12=2;
                    }
                    break;
                case 113:
                    {
                    alt12=3;
                    }
                    break;
                case 115:
                    {
                    alt12=4;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalCONFIG.g:1046:4: ( (lv_plot_6_0= ruleGSSConfigPlot ) )
            	    {
            	    // InternalCONFIG.g:1046:4: ( (lv_plot_6_0= ruleGSSConfigPlot ) )
            	    // InternalCONFIG.g:1047:5: (lv_plot_6_0= ruleGSSConfigPlot )
            	    {
            	    // InternalCONFIG.g:1047:5: (lv_plot_6_0= ruleGSSConfigPlot )
            	    // InternalCONFIG.g:1048:6: lv_plot_6_0= ruleGSSConfigPlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getPlotGSSConfigPlotParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_plot_6_0=ruleGSSConfigPlot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"plot",
            	      							lv_plot_6_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPlot");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCONFIG.g:1066:4: ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) )
            	    {
            	    // InternalCONFIG.g:1066:4: ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) )
            	    // InternalCONFIG.g:1067:5: (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg )
            	    {
            	    // InternalCONFIG.g:1067:5: (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg )
            	    // InternalCONFIG.g:1068:6: lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_alarmMsg_7_0=ruleGSSConfigAlarmMsg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"alarmMsg",
            	      							lv_alarmMsg_7_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmMsg");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCONFIG.g:1086:4: ( (lv_modify_8_0= ruleGSSConfigModify ) )
            	    {
            	    // InternalCONFIG.g:1086:4: ( (lv_modify_8_0= ruleGSSConfigModify ) )
            	    // InternalCONFIG.g:1087:5: (lv_modify_8_0= ruleGSSConfigModify )
            	    {
            	    // InternalCONFIG.g:1087:5: (lv_modify_8_0= ruleGSSConfigModify )
            	    // InternalCONFIG.g:1088:6: lv_modify_8_0= ruleGSSConfigModify
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getModifyGSSConfigModifyParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_modify_8_0=ruleGSSConfigModify();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"modify",
            	      							lv_modify_8_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigModify");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCONFIG.g:1106:4: ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) )
            	    {
            	    // InternalCONFIG.g:1106:4: ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) )
            	    // InternalCONFIG.g:1107:5: (lv_alarmVal_9_0= ruleGSSConfigAlarmVal )
            	    {
            	    // InternalCONFIG.g:1107:5: (lv_alarmVal_9_0= ruleGSSConfigAlarmVal )
            	    // InternalCONFIG.g:1108:6: lv_alarmVal_9_0= ruleGSSConfigAlarmVal
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValGSSConfigAlarmValParserRuleCall_3_3_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    lv_alarmVal_9_0=ruleGSSConfigAlarmVal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigMonitorsRule());
            	      						}
            	      						add(
            	      							current,
            	      							"alarmVal",
            	      							lv_alarmVal_9_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmVal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

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

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigMonitorsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSConfigMonitors"


    // $ANTLR start "entryRuleGSSConfigTests"
    // InternalCONFIG.g:1138:1: entryRuleGSSConfigTests returns [EObject current=null] : iv_ruleGSSConfigTests= ruleGSSConfigTests EOF ;
    public final EObject entryRuleGSSConfigTests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigTests = null;


        try {
            // InternalCONFIG.g:1138:55: (iv_ruleGSSConfigTests= ruleGSSConfigTests EOF )
            // InternalCONFIG.g:1139:2: iv_ruleGSSConfigTests= ruleGSSConfigTests EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigTestsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigTests=ruleGSSConfigTests();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigTests; 
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
    // $ANTLR end "entryRuleGSSConfigTests"


    // $ANTLR start "ruleGSSConfigTests"
    // InternalCONFIG.g:1145:1: ruleGSSConfigTests returns [EObject current=null] : (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSConfigTests() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_TestCase_6_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:1151:2: ( (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalCONFIG.g:1152:2: (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalCONFIG.g:1152:2: (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalCONFIG.g:1153:3: otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:1161:3: (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCONFIG.g:1162:4: otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestsAccess().getColonEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalCONFIG.g:1170:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:1171:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:1171:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:1172:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigTestsRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileGSSProtocolPacketsProtocolPacketsCrossReference_2_2_0());
                      					
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

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:1194:3: ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==120) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCONFIG.g:1195:4: (lv_TestCase_6_0= ruleGSSConfigTestCase )
            	    {
            	    // InternalCONFIG.g:1195:4: (lv_TestCase_6_0= ruleGSSConfigTestCase )
            	    // InternalCONFIG.g:1196:5: lv_TestCase_6_0= ruleGSSConfigTestCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    lv_TestCase_6_0=ruleGSSConfigTestCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSConfigTestsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"TestCase",
            	      						lv_TestCase_6_0,
            	      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTestCase");
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

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTestsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleGSSConfigTests"


    // $ANTLR start "entryRuleGSSConfigGSSInfo"
    // InternalCONFIG.g:1225:1: entryRuleGSSConfigGSSInfo returns [EObject current=null] : iv_ruleGSSConfigGSSInfo= ruleGSSConfigGSSInfo EOF ;
    public final EObject entryRuleGSSConfigGSSInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSInfo = null;


        try {
            // InternalCONFIG.g:1225:57: (iv_ruleGSSConfigGSSInfo= ruleGSSConfigGSSInfo EOF )
            // InternalCONFIG.g:1226:2: iv_ruleGSSConfigGSSInfo= ruleGSSConfigGSSInfo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGSSInfoRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGSSInfo=ruleGSSConfigGSSInfo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGSSInfo; 
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
    // $ANTLR end "entryRuleGSSConfigGSSInfo"


    // $ANTLR start "ruleGSSConfigGSSInfo"
    // InternalCONFIG.g:1232:1: ruleGSSConfigGSSInfo returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSConfigGSSInfo() throws RecognitionException {
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
            // InternalCONFIG.g:1238:2: ( (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:1239:2: (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:1239:2: (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:1240:3: otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSInfoAccess().getGSSConfigGSSInfoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSInfoAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1256:3: ( (lv_test_campaign_4_0= RULE_STRING ) )
            // InternalCONFIG.g:1257:4: (lv_test_campaign_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:1257:4: (lv_test_campaign_4_0= RULE_STRING )
            // InternalCONFIG.g:1258:5: lv_test_campaign_4_0= RULE_STRING
            {
            lv_test_campaign_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_test_campaign_4_0, grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigGSSInfoRule());
              					}
              					setWithLastConsumed(
              						current,
              						"test_campaign",
              						lv_test_campaign_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSInfoAccess().getVersionKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1286:3: ( (lv_version_8_0= ruleVersion ) )
            // InternalCONFIG.g:1287:4: (lv_version_8_0= ruleVersion )
            {
            // InternalCONFIG.g:1287:4: (lv_version_8_0= ruleVersion )
            // InternalCONFIG.g:1288:5: lv_version_8_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSInfoAccess().getVersionVersionParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_8_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoRule());
              					}
              					set(
              						current,
              						"version",
              						lv_version_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.Version");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSInfoAccess().getDateKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1317:3: ( (lv_date_12_0= ruleDATE ) )
            // InternalCONFIG.g:1318:4: (lv_date_12_0= ruleDATE )
            {
            // InternalCONFIG.g:1318:4: (lv_date_12_0= ruleDATE )
            // InternalCONFIG.g:1319:5: lv_date_12_0= ruleDATE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSInfoAccess().getDateDATEParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_date_12_0=ruleDATE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoRule());
              					}
              					set(
              						current,
              						"date",
              						lv_date_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.DATE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_13());
              		
            }
            // InternalCONFIG.g:1340:3: (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCONFIG.g:1341:4: otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalCONFIG.g:1349:4: ( (lv_version_control_url_16_0= ruleURL ) )
                    // InternalCONFIG.g:1350:5: (lv_version_control_url_16_0= ruleURL )
                    {
                    // InternalCONFIG.g:1350:5: (lv_version_control_url_16_0= ruleURL )
                    // InternalCONFIG.g:1351:6: lv_version_control_url_16_0= ruleURL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlURLParserRuleCall_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_version_control_url_16_0=ruleURL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoRule());
                      						}
                      						set(
                      							current,
                      							"version_control_url",
                      							lv_version_control_url_16_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.URL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigGSSInfoAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSConfigGSSInfo"


    // $ANTLR start "entryRuleGSSConfigGSSInfoPrint"
    // InternalCONFIG.g:1385:1: entryRuleGSSConfigGSSInfoPrint returns [EObject current=null] : iv_ruleGSSConfigGSSInfoPrint= ruleGSSConfigGSSInfoPrint EOF ;
    public final EObject entryRuleGSSConfigGSSInfoPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSInfoPrint = null;


        try {
            // InternalCONFIG.g:1385:62: (iv_ruleGSSConfigGSSInfoPrint= ruleGSSConfigGSSInfoPrint EOF )
            // InternalCONFIG.g:1386:2: iv_ruleGSSConfigGSSInfoPrint= ruleGSSConfigGSSInfoPrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGSSInfoPrint=ruleGSSConfigGSSInfoPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGSSInfoPrint; 
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
    // $ANTLR end "entryRuleGSSConfigGSSInfoPrint"


    // $ANTLR start "ruleGSSConfigGSSInfoPrint"
    // InternalCONFIG.g:1392:1: ruleGSSConfigGSSInfoPrint returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSConfigGSSInfoPrint() throws RecognitionException {
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

        Enumerator lv_debugLog_12_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:1398:2: ( (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalCONFIG.g:1399:2: (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalCONFIG.g:1399:2: (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalCONFIG.g:1400:3: otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSInfoPrintAccess().getGSSConfigGSSInfoPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1416:3: ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1417:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1417:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1418:5: lv_mainLog_4_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_mainLog_4_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"mainLog",
              						lv_mainLog_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1447:3: ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1448:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1448:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1449:5: lv_portLogs_8_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_portLogs_8_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"portLogs",
              						lv_portLogs_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSInfoPrintAccess().getDebugLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1478:3: ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1479:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1479:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1480:5: lv_debugLog_12_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSInfoPrintAccess().getDebugLogGSSConfigEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_debugLog_12_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSInfoPrintRule());
              					}
              					set(
              						current,
              						"debugLog",
              						lv_debugLog_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSInfoPrintAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleGSSConfigGSSInfoPrint"


    // $ANTLR start "entryRuleGSSConfigPhyHeaderPrint"
    // InternalCONFIG.g:1513:1: entryRuleGSSConfigPhyHeaderPrint returns [EObject current=null] : iv_ruleGSSConfigPhyHeaderPrint= ruleGSSConfigPhyHeaderPrint EOF ;
    public final EObject entryRuleGSSConfigPhyHeaderPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPhyHeaderPrint = null;


        try {
            // InternalCONFIG.g:1513:64: (iv_ruleGSSConfigPhyHeaderPrint= ruleGSSConfigPhyHeaderPrint EOF )
            // InternalCONFIG.g:1514:2: iv_ruleGSSConfigPhyHeaderPrint= ruleGSSConfigPhyHeaderPrint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPhyHeaderPrint=ruleGSSConfigPhyHeaderPrint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPhyHeaderPrint; 
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
    // $ANTLR end "entryRuleGSSConfigPhyHeaderPrint"


    // $ANTLR start "ruleGSSConfigPhyHeaderPrint"
    // InternalCONFIG.g:1520:1: ruleGSSConfigPhyHeaderPrint returns [EObject current=null] : (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSConfigPhyHeaderPrint() throws RecognitionException {
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

        Enumerator lv_debugLog_12_0 = null;

        Enumerator lv_gssTabs_16_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:1526:2: ( (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:1527:2: (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:1527:2: (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:1528:3: otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGSSConfigPhyHeaderPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1544:3: ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1545:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1545:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1546:5: lv_mainLog_4_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogGSSConfigEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_mainLog_4_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"mainLog",
              						lv_mainLog_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1575:3: ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1576:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1576:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1577:5: lv_portLogs_8_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsGSSConfigEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_portLogs_8_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"portLogs",
              						lv_portLogs_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getDebugLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1606:3: ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1607:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1607:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1608:5: lv_debugLog_12_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getDebugLogGSSConfigEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_debugLog_12_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"debugLog",
              						lv_debugLog_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:1637:3: ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1638:4: (lv_gssTabs_16_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1638:4: (lv_gssTabs_16_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1639:5: lv_gssTabs_16_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsGSSConfigEnableDisableEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_gssTabs_16_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPhyHeaderPrintRule());
              					}
              					set(
              						current,
              						"gssTabs",
              						lv_gssTabs_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSConfigPhyHeaderPrint"


    // $ANTLR start "entryRuleGSSConfigGSSDiscardErrorFlags"
    // InternalCONFIG.g:1672:1: entryRuleGSSConfigGSSDiscardErrorFlags returns [EObject current=null] : iv_ruleGSSConfigGSSDiscardErrorFlags= ruleGSSConfigGSSDiscardErrorFlags EOF ;
    public final EObject entryRuleGSSConfigGSSDiscardErrorFlags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSDiscardErrorFlags = null;


        try {
            // InternalCONFIG.g:1672:70: (iv_ruleGSSConfigGSSDiscardErrorFlags= ruleGSSConfigGSSDiscardErrorFlags EOF )
            // InternalCONFIG.g:1673:2: iv_ruleGSSConfigGSSDiscardErrorFlags= ruleGSSConfigGSSDiscardErrorFlags EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGSSDiscardErrorFlags=ruleGSSConfigGSSDiscardErrorFlags();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGSSDiscardErrorFlags; 
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
    // $ANTLR end "entryRuleGSSConfigGSSDiscardErrorFlags"


    // $ANTLR start "ruleGSSConfigGSSDiscardErrorFlags"
    // InternalCONFIG.g:1679:1: ruleGSSConfigGSSDiscardErrorFlags returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSConfigGSSDiscardErrorFlags() throws RecognitionException {
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
            // InternalCONFIG.g:1685:2: ( (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:1686:2: (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:1686:2: (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:1687:3: otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGSSConfigGSSDiscardErrorFlagsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1703:3: ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1704:4: (lv_txErrors_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1704:4: (lv_txErrors_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1705:5: lv_txErrors_4_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsGSSConfigEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_txErrors_4_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"txErrors",
              						lv_txErrors_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1734:3: ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1735:4: (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1735:4: (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1736:5: lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsGSSConfigEnableDisableEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_notExpectedPackets_8_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"notExpectedPackets",
              						lv_notExpectedPackets_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1765:3: ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1766:4: (lv_filtersKo_12_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1766:4: (lv_filtersKo_12_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1767:5: lv_filtersKo_12_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoGSSConfigEnableDisableEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_filtersKo_12_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"filtersKo",
              						lv_filtersKo_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,44,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:1796:3: ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1797:4: (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1797:4: (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1798:5: lv_validTimesKo_16_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoGSSConfigEnableDisableEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_validTimesKo_16_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGSSDiscardErrorFlagsRule());
              					}
              					set(
              						current,
              						"validTimesKo",
              						lv_validTimesKo_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSConfigGSSDiscardErrorFlags"


    // $ANTLR start "entryRuleGSSConfigProtocol"
    // InternalCONFIG.g:1831:1: entryRuleGSSConfigProtocol returns [EObject current=null] : iv_ruleGSSConfigProtocol= ruleGSSConfigProtocol EOF ;
    public final EObject entryRuleGSSConfigProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigProtocol = null;


        try {
            // InternalCONFIG.g:1831:58: (iv_ruleGSSConfigProtocol= ruleGSSConfigProtocol EOF )
            // InternalCONFIG.g:1832:2: iv_ruleGSSConfigProtocol= ruleGSSConfigProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigProtocolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigProtocol=ruleGSSConfigProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigProtocol; 
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
    // $ANTLR end "entryRuleGSSConfigProtocol"


    // $ANTLR start "ruleGSSConfigProtocol"
    // InternalCONFIG.g:1838:1: ruleGSSConfigProtocol returns [EObject current=null] : (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSConfigProtocol() throws RecognitionException {
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
            // InternalCONFIG.g:1844:2: ( (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalCONFIG.g:1845:2: (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalCONFIG.g:1845:2: (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalCONFIG.g:1846:3: otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigProtocolAccess().getGSSConfigProtocolKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigProtocolAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigProtocolAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1862:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:1863:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:1863:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:1864:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigProtocolAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1893:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:1894:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:1894:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:1895:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigProtocolAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigProtocolRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigProtocolAccess().getTypeLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1923:3: ( (lv_typeLevel_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:1924:4: (lv_typeLevel_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:1924:4: (lv_typeLevel_12_0= ruleINTEGER )
            // InternalCONFIG.g:1925:5: lv_typeLevel_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getTypeLevelINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_typeLevel_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
              					}
              					set(
              						current,
              						"typeLevel",
              						lv_typeLevel_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:1954:3: ( (lv_typeOffset_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:1955:4: (lv_typeOffset_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:1955:4: (lv_typeOffset_16_0= ruleINTEGER )
            // InternalCONFIG.g:1956:5: lv_typeOffset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_typeOffset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
              					}
              					set(
              						current,
              						"typeOffset",
              						lv_typeOffset_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_17());
              		
            }
            // InternalCONFIG.g:1977:3: (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCONFIG.g:1978:4: otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetKeyword_18_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_18_1());
                      			
                    }
                    // InternalCONFIG.g:1986:4: ( (lv_subtypeOffset_20_0= ruleINTEGER ) )
                    // InternalCONFIG.g:1987:5: (lv_subtypeOffset_20_0= ruleINTEGER )
                    {
                    // InternalCONFIG.g:1987:5: (lv_subtypeOffset_20_0= ruleINTEGER )
                    // InternalCONFIG.g:1988:6: lv_subtypeOffset_20_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetINTEGERParserRuleCall_18_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_subtypeOffset_20_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigProtocolRule());
                      						}
                      						set(
                      							current,
                      							"subtypeOffset",
                      							lv_subtypeOffset_20_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_18_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigProtocolAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_20());
              		
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
    // $ANTLR end "ruleGSSConfigProtocol"


    // $ANTLR start "entryRuleGSSConfigMainInterface"
    // InternalCONFIG.g:2022:1: entryRuleGSSConfigMainInterface returns [EObject current=null] : iv_ruleGSSConfigMainInterface= ruleGSSConfigMainInterface EOF ;
    public final EObject entryRuleGSSConfigMainInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigMainInterface = null;


        try {
            // InternalCONFIG.g:2022:63: (iv_ruleGSSConfigMainInterface= ruleGSSConfigMainInterface EOF )
            // InternalCONFIG.g:2023:2: iv_ruleGSSConfigMainInterface= ruleGSSConfigMainInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigMainInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigMainInterface=ruleGSSConfigMainInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigMainInterface; 
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
    // $ANTLR end "entryRuleGSSConfigMainInterface"


    // $ANTLR start "ruleGSSConfigMainInterface"
    // InternalCONFIG.g:2029:1: ruleGSSConfigMainInterface returns [EObject current=null] : (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' ) ;
    public final EObject ruleGSSConfigMainInterface() throws RecognitionException {
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
            // InternalCONFIG.g:2035:2: ( (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' ) )
            // InternalCONFIG.g:2036:2: (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' )
            {
            // InternalCONFIG.g:2036:2: (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';' )
            // InternalCONFIG.g:2037:3: otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )+ otherlv_27= '}' otherlv_28= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigMainInterfaceAccess().getGSSConfigMainInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigMainInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigMainInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2053:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2054:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2054:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2055:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigMainInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2084:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalCONFIG.g:2085:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalCONFIG.g:2085:4: (lv_name_8_0= RULE_STRING )
            // InternalCONFIG.g:2086:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigMainInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:2114:3: ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) )
            // InternalCONFIG.g:2115:4: (lv_ifType_12_0= ruleGSSConfigMainInterfaceType )
            {
            // InternalCONFIG.g:2115:4: (lv_ifType_12_0= ruleGSSConfigMainInterfaceType )
            // InternalCONFIG.g:2116:5: lv_ifType_12_0= ruleGSSConfigMainInterfaceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeGSSConfigMainInterfaceTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifType_12_0=ruleGSSConfigMainInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
              					}
              					set(
              						current,
              						"ifType",
              						lv_ifType_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterfaceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:2145:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:2146:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:2146:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:2147:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:2176:3: ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) )
            // InternalCONFIG.g:2177:4: (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType )
            {
            // InternalCONFIG.g:2177:4: (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType )
            // InternalCONFIG.g:2178:5: lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeGSSConfigMainInterfaceIOTypeEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ioType_20_0=ruleGSSConfigMainInterfaceIOType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
              					}
              					set(
              						current,
              						"ioType",
              						lv_ioType_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigMainInterfaceIOType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:2199:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==55) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCONFIG.g:2200:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,55,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:2208:4: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalCONFIG.g:2209:5: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalCONFIG.g:2209:5: ( ruleVersionedQualifiedReferenceName )
                    // InternalCONFIG.g:2210:6: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:2232:3: ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==57) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCONFIG.g:2233:4: (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut )
            	    {
            	    // InternalCONFIG.g:2233:4: (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut )
            	    // InternalCONFIG.g:2234:5: lv_LevelInOut_26_0= ruleGSSConfigLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_58);
            	    lv_LevelInOut_26_0=ruleGSSConfigLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"LevelInOut",
            	      						lv_LevelInOut_26_0,
            	      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelInOut");
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

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigMainInterfaceAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_25());
              		
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
    // $ANTLR end "ruleGSSConfigMainInterface"


    // $ANTLR start "entryRuleGSSConfigInterface"
    // InternalCONFIG.g:2263:1: entryRuleGSSConfigInterface returns [EObject current=null] : iv_ruleGSSConfigInterface= ruleGSSConfigInterface EOF ;
    public final EObject entryRuleGSSConfigInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigInterface = null;


        try {
            // InternalCONFIG.g:2263:59: (iv_ruleGSSConfigInterface= ruleGSSConfigInterface EOF )
            // InternalCONFIG.g:2264:2: iv_ruleGSSConfigInterface= ruleGSSConfigInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigInterfaceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigInterface=ruleGSSConfigInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigInterface; 
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
    // $ANTLR end "entryRuleGSSConfigInterface"


    // $ANTLR start "ruleGSSConfigInterface"
    // InternalCONFIG.g:2270:1: ruleGSSConfigInterface returns [EObject current=null] : (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' ) ;
    public final EObject ruleGSSConfigInterface() throws RecognitionException {
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
            // InternalCONFIG.g:2276:2: ( (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' ) )
            // InternalCONFIG.g:2277:2: (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' )
            {
            // InternalCONFIG.g:2277:2: (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';' )
            // InternalCONFIG.g:2278:3: otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )? ( ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) ) )+ otherlv_29= '}' otherlv_30= ';'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigInterfaceAccess().getGSSConfigInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2294:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2295:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2295:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2296:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2325:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalCONFIG.g:2326:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalCONFIG.g:2326:4: (lv_name_8_0= RULE_STRING )
            // InternalCONFIG.g:2327:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigInterfaceAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:2355:3: ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) )
            // InternalCONFIG.g:2356:4: (lv_ifType_12_0= ruleGSSConfigInterfaceType )
            {
            // InternalCONFIG.g:2356:4: (lv_ifType_12_0= ruleGSSConfigInterfaceType )
            // InternalCONFIG.g:2357:5: lv_ifType_12_0= ruleGSSConfigInterfaceType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIfTypeGSSConfigInterfaceTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifType_12_0=ruleGSSConfigInterfaceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
              					}
              					set(
              						current,
              						"ifType",
              						lv_ifType_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaceType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,53,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigInterfaceAccess().getIfConfigKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:2386:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:2387:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:2387:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:2388:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIfConfigGSSIfacePortConfigCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:2417:3: ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) )
            // InternalCONFIG.g:2418:4: (lv_ioType_20_0= ruleGSSConfigInterfaceIOType )
            {
            // InternalCONFIG.g:2418:4: (lv_ioType_20_0= ruleGSSConfigInterfaceIOType )
            // InternalCONFIG.g:2419:5: lv_ioType_20_0= ruleGSSConfigInterfaceIOType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getIoTypeGSSConfigInterfaceIOTypeEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ioType_20_0=ruleGSSConfigInterfaceIOType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
              					}
              					set(
              						current,
              						"ioType",
              						lv_ioType_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInterfaceIOType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:2440:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==55) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCONFIG.g:2441:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,55,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:2449:4: ( ( ruleVersionedQualifiedReferenceName ) )
                    // InternalCONFIG.g:2450:5: ( ruleVersionedQualifiedReferenceName )
                    {
                    // InternalCONFIG.g:2450:5: ( ruleVersionedQualifiedReferenceName )
                    // InternalCONFIG.g:2451:6: ruleVersionedQualifiedReferenceName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDGSSConfigProtocolCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:2473:3: ( ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=4;
                switch ( input.LA(1) ) {
                case 57:
                    {
                    alt20=1;
                    }
                    break;
                case 63:
                    {
                    alt20=2;
                    }
                    break;
                case 64:
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalCONFIG.g:2474:4: ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )
            	    {
            	    // InternalCONFIG.g:2474:4: ( (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut ) )
            	    // InternalCONFIG.g:2475:5: (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut )
            	    {
            	    // InternalCONFIG.g:2475:5: (lv_LevelInOut_26_0= ruleGSSConfigLevelInOut )
            	    // InternalCONFIG.g:2476:6: lv_LevelInOut_26_0= ruleGSSConfigLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_LevelInOut_26_0=ruleGSSConfigLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelInOut",
            	      							lv_LevelInOut_26_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelInOut");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCONFIG.g:2494:4: ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) )
            	    {
            	    // InternalCONFIG.g:2494:4: ( (lv_LevelIn_27_0= ruleGSSConfigLevelIn ) )
            	    // InternalCONFIG.g:2495:5: (lv_LevelIn_27_0= ruleGSSConfigLevelIn )
            	    {
            	    // InternalCONFIG.g:2495:5: (lv_LevelIn_27_0= ruleGSSConfigLevelIn )
            	    // InternalCONFIG.g:2496:6: lv_LevelIn_27_0= ruleGSSConfigLevelIn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelInGSSConfigLevelInParserRuleCall_23_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_LevelIn_27_0=ruleGSSConfigLevelIn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelIn",
            	      							lv_LevelIn_27_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelIn");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCONFIG.g:2514:4: ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) )
            	    {
            	    // InternalCONFIG.g:2514:4: ( (lv_LevelOut_28_0= ruleGSSConfigLevelOut ) )
            	    // InternalCONFIG.g:2515:5: (lv_LevelOut_28_0= ruleGSSConfigLevelOut )
            	    {
            	    // InternalCONFIG.g:2515:5: (lv_LevelOut_28_0= ruleGSSConfigLevelOut )
            	    // InternalCONFIG.g:2516:6: lv_LevelOut_28_0= ruleGSSConfigLevelOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutGSSConfigLevelOutParserRuleCall_23_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_62);
            	    lv_LevelOut_28_0=ruleGSSConfigLevelOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelOut",
            	      							lv_LevelOut_28_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelOut");
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

              			newLeafNode(otherlv_29, grammarAccess.getGSSConfigInterfaceAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_30=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_25());
              		
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
    // $ANTLR end "ruleGSSConfigInterface"


    // $ANTLR start "entryRuleGSSConfigLevelInOut"
    // InternalCONFIG.g:2546:1: entryRuleGSSConfigLevelInOut returns [EObject current=null] : iv_ruleGSSConfigLevelInOut= ruleGSSConfigLevelInOut EOF ;
    public final EObject entryRuleGSSConfigLevelInOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevelInOut = null;


        try {
            // InternalCONFIG.g:2546:60: (iv_ruleGSSConfigLevelInOut= ruleGSSConfigLevelInOut EOF )
            // InternalCONFIG.g:2547:2: iv_ruleGSSConfigLevelInOut= ruleGSSConfigLevelInOut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevelInOutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevelInOut=ruleGSSConfigLevelInOut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevelInOut; 
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
    // $ANTLR end "entryRuleGSSConfigLevelInOut"


    // $ANTLR start "ruleGSSConfigLevelInOut"
    // InternalCONFIG.g:2553:1: ruleGSSConfigLevelInOut returns [EObject current=null] : (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' ) ;
    public final EObject ruleGSSConfigLevelInOut() throws RecognitionException {
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
            // InternalCONFIG.g:2559:2: ( (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' ) )
            // InternalCONFIG.g:2560:2: (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' )
            {
            // InternalCONFIG.g:2560:2: (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';' )
            // InternalCONFIG.g:2561:3: otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'TCformat' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'inputFilter' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )? otherlv_30= '}' otherlv_31= ';'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelInOutAccess().getGSSConfigLevelInOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelInOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelInOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2577:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2578:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2578:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2579:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelInOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2608:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalCONFIG.g:2609:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalCONFIG.g:2609:4: (lv_name_8_0= RULE_STRING )
            // InternalCONFIG.g:2610:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelInOutAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
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

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigLevelInOutAccess().getTMformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:2638:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:2639:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:2639:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:2640:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0());
              				
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,59,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigLevelInOutAccess().getTCformatKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:2669:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:2670:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:2670:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:2671:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatGSSTmTcFormatTmTCFormatCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:2700:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:2701:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:2701:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:2702:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterGSSFilterFilterCrossReference_20_0());
              				
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:2723:3: (otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==61) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCONFIG.g:2724:4: otherlv_22= 'export_to_prev_Level' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:2732:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:2733:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:2733:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:2734:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelGSSExportExportCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:2756:3: (otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==62) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCONFIG.g:2757:4: otherlv_26= 'import_from_prev_Level' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';'
                    {
                    otherlv_26=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelKeyword_23_0());
                      			
                    }
                    otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_23_1());
                      			
                    }
                    // InternalCONFIG.g:2765:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:2766:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:2766:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:2767:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_23_2_0());
                      					
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

                    otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_23_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSConfigLevelInOutAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_25());
              		
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
    // $ANTLR end "ruleGSSConfigLevelInOut"


    // $ANTLR start "entryRuleGSSConfigLevelIn"
    // InternalCONFIG.g:2801:1: entryRuleGSSConfigLevelIn returns [EObject current=null] : iv_ruleGSSConfigLevelIn= ruleGSSConfigLevelIn EOF ;
    public final EObject entryRuleGSSConfigLevelIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevelIn = null;


        try {
            // InternalCONFIG.g:2801:57: (iv_ruleGSSConfigLevelIn= ruleGSSConfigLevelIn EOF )
            // InternalCONFIG.g:2802:2: iv_ruleGSSConfigLevelIn= ruleGSSConfigLevelIn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevelInRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevelIn=ruleGSSConfigLevelIn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevelIn; 
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
    // $ANTLR end "entryRuleGSSConfigLevelIn"


    // $ANTLR start "ruleGSSConfigLevelIn"
    // InternalCONFIG.g:2808:1: ruleGSSConfigLevelIn returns [EObject current=null] : (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSConfigLevelIn() throws RecognitionException {
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
            // InternalCONFIG.g:2814:2: ( (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:2815:2: (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:2815:2: (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:2816:3: otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TCformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelInAccess().getGSSConfigLevelInKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelInAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelInAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2832:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2833:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2833:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2834:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelInAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2863:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalCONFIG.g:2864:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalCONFIG.g:2864:4: (lv_name_8_0= RULE_STRING )
            // InternalCONFIG.g:2865:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelInAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInRule());
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

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,59,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigLevelInAccess().getTCformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:2893:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:2894:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:2894:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:2895:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getTCformatGSSTmTcFormatTmTCFormatCrossReference_12_0());
              				
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_13());
              		
            }
            // InternalCONFIG.g:2916:3: (otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCONFIG.g:2917:4: otherlv_14= 'export_to_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalCONFIG.g:2925:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:2926:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:2926:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:2927:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigLevelInRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelGSSExportExportCrossReference_14_2_0());
                      					
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

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigLevelInAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSConfigLevelIn"


    // $ANTLR start "entryRuleGSSConfigLevelOut"
    // InternalCONFIG.g:2961:1: entryRuleGSSConfigLevelOut returns [EObject current=null] : iv_ruleGSSConfigLevelOut= ruleGSSConfigLevelOut EOF ;
    public final EObject entryRuleGSSConfigLevelOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevelOut = null;


        try {
            // InternalCONFIG.g:2961:58: (iv_ruleGSSConfigLevelOut= ruleGSSConfigLevelOut EOF )
            // InternalCONFIG.g:2962:2: iv_ruleGSSConfigLevelOut= ruleGSSConfigLevelOut EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevelOutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevelOut=ruleGSSConfigLevelOut();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevelOut; 
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
    // $ANTLR end "entryRuleGSSConfigLevelOut"


    // $ANTLR start "ruleGSSConfigLevelOut"
    // InternalCONFIG.g:2968:1: ruleGSSConfigLevelOut returns [EObject current=null] : (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSConfigLevelOut() throws RecognitionException {
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
            // InternalCONFIG.g:2974:2: ( (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalCONFIG.g:2975:2: (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalCONFIG.g:2975:2: (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalCONFIG.g:2976:3: otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'TMformat' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' otherlv_14= 'inputFilter' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelOutAccess().getGSSConfigLevelOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2992:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2993:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2993:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2994:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelOutRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:3023:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalCONFIG.g:3024:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalCONFIG.g:3024:4: (lv_name_8_0= RULE_STRING )
            // InternalCONFIG.g:3025:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelOutAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
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

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigLevelOutAccess().getTMformatKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:3053:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:3054:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:3054:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:3055:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getTMformatGSSTmTcFormatTmTCFormatCrossReference_12_0());
              				
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

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigLevelOutAccess().getInputFilterKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:3084:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:3085:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:3085:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:3086:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterGSSFilterFilterCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_17());
              		
            }
            // InternalCONFIG.g:3107:3: (otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==62) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCONFIG.g:3108:4: otherlv_18= 'import_from_prev_Level' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelKeyword_18_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_18_1());
                      			
                    }
                    // InternalCONFIG.g:3116:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:3117:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:3117:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:3118:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelGSSImportImportCrossReference_18_2_0());
                      					
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

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_18_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigLevelOutAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_20());
              		
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
    // $ANTLR end "ruleGSSConfigLevelOut"


    // $ANTLR start "entryRuleGSSConfigSpecialPacket"
    // InternalCONFIG.g:3152:1: entryRuleGSSConfigSpecialPacket returns [EObject current=null] : iv_ruleGSSConfigSpecialPacket= ruleGSSConfigSpecialPacket EOF ;
    public final EObject entryRuleGSSConfigSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigSpecialPacket = null;


        try {
            // InternalCONFIG.g:3152:63: (iv_ruleGSSConfigSpecialPacket= ruleGSSConfigSpecialPacket EOF )
            // InternalCONFIG.g:3153:2: iv_ruleGSSConfigSpecialPacket= ruleGSSConfigSpecialPacket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigSpecialPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigSpecialPacket=ruleGSSConfigSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigSpecialPacket; 
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
    // $ANTLR end "entryRuleGSSConfigSpecialPacket"


    // $ANTLR start "ruleGSSConfigSpecialPacket"
    // InternalCONFIG.g:3159:1: ruleGSSConfigSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_32_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' ) ;
    public final EObject ruleGSSConfigSpecialPacket() throws RecognitionException {
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
            // InternalCONFIG.g:3165:2: ( (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_32_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' ) )
            // InternalCONFIG.g:3166:2: (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_32_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' )
            {
            // InternalCONFIG.g:3166:2: (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_32_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';' )
            // InternalCONFIG.g:3167:3: otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'inputFilter' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' ( (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_31_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_32_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) ) )? otherlv_34= '}' otherlv_35= ';'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigSpecialPacketAccess().getGSSConfigSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,66,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigSpecialPacketAccess().getStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3183:3: ( (lv_status_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:3184:4: (lv_status_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:3184:4: (lv_status_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:3185:5: lv_status_4_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getStatusGSSConfigEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_status_4_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"status",
              						lv_status_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigSpecialPacketAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:3214:3: ( (lv_name_8_0= RULE_STRING ) )
            // InternalCONFIG.g:3215:4: (lv_name_8_0= RULE_STRING )
            {
            // InternalCONFIG.g:3215:4: (lv_name_8_0= RULE_STRING )
            // InternalCONFIG.g:3216:5: lv_name_8_0= RULE_STRING
            {
            lv_name_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigSpecialPacketAccess().getNameSTRINGTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigSpecialPacketAccess().getIdKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:3244:3: ( (lv_id_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:3245:4: (lv_id_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3245:4: (lv_id_12_0= ruleINTEGER )
            // InternalCONFIG.g:3246:5: lv_id_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getIdINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:3275:3: ( (lv_ifRef_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:3276:4: (lv_ifRef_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3276:4: (lv_ifRef_16_0= ruleINTEGER )
            // InternalCONFIG.g:3277:5: lv_ifRef_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:3306:3: ( (lv_levels_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:3307:4: (lv_levels_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3307:4: (lv_levels_20_0= ruleINTEGER )
            // InternalCONFIG.g:3308:5: lv_levels_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levels_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"levels",
              						lv_levels_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalCONFIG.g:3337:3: ( (lv_levelRef_24_0= ruleINTEGER ) )
            // InternalCONFIG.g:3338:4: (lv_levelRef_24_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3338:4: (lv_levelRef_24_0= ruleINTEGER )
            // InternalCONFIG.g:3339:5: lv_levelRef_24_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefINTEGERParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levelRef_24_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"levelRef",
              						lv_levelRef_24_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_25());
              		
            }
            otherlv_26=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_27());
              		
            }
            // InternalCONFIG.g:3368:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:3369:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:3369:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:3370:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterGSSFilterFilterCrossReference_28_0());
              				
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_29());
              		
            }
            // InternalCONFIG.g:3391:3: ( (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==70) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCONFIG.g:3392:4: (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels )
                    {
                    // InternalCONFIG.g:3392:4: (lv_UpperLevels_30_0= ruleGSSConfigUpperLevels )
                    // InternalCONFIG.g:3393:5: lv_UpperLevels_30_0= ruleGSSConfigUpperLevels
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsGSSConfigUpperLevelsParserRuleCall_30_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_73);
                    lv_UpperLevels_30_0=ruleGSSConfigUpperLevels();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
                      					}
                      					add(
                      						current,
                      						"UpperLevels",
                      						lv_UpperLevels_30_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevels");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCONFIG.g:3410:3: ( (lv_printingData_31_0= ruleGSSConfigPrintingData ) )
            // InternalCONFIG.g:3411:4: (lv_printingData_31_0= ruleGSSConfigPrintingData )
            {
            // InternalCONFIG.g:3411:4: (lv_printingData_31_0= ruleGSSConfigPrintingData )
            // InternalCONFIG.g:3412:5: lv_printingData_31_0= ruleGSSConfigPrintingData
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataGSSConfigPrintingDataParserRuleCall_31_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_74);
            lv_printingData_31_0=ruleGSSConfigPrintingData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"printingData",
              						lv_printingData_31_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPrintingData");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:3429:3: ( ( (lv_period_32_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) ) )?
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==73) ) {
                alt26=1;
            }
            else if ( (LA26_0==78) ) {
                alt26=2;
            }
            switch (alt26) {
                case 1 :
                    // InternalCONFIG.g:3430:4: ( (lv_period_32_0= ruleGSSConfigPeriod ) )
                    {
                    // InternalCONFIG.g:3430:4: ( (lv_period_32_0= ruleGSSConfigPeriod ) )
                    // InternalCONFIG.g:3431:5: (lv_period_32_0= ruleGSSConfigPeriod )
                    {
                    // InternalCONFIG.g:3431:5: (lv_period_32_0= ruleGSSConfigPeriod )
                    // InternalCONFIG.g:3432:6: lv_period_32_0= ruleGSSConfigPeriod
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodGSSConfigPeriodParserRuleCall_32_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_period_32_0=ruleGSSConfigPeriod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"period",
                      							lv_period_32_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriod");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:3450:4: ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) )
                    {
                    // InternalCONFIG.g:3450:4: ( (lv_intervalRange_33_0= ruleGSSConfigIntervalRange ) )
                    // InternalCONFIG.g:3451:5: (lv_intervalRange_33_0= ruleGSSConfigIntervalRange )
                    {
                    // InternalCONFIG.g:3451:5: (lv_intervalRange_33_0= ruleGSSConfigIntervalRange )
                    // InternalCONFIG.g:3452:6: lv_intervalRange_33_0= ruleGSSConfigIntervalRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeGSSConfigIntervalRangeParserRuleCall_32_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_intervalRange_33_0=ruleGSSConfigIntervalRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"intervalRange",
                      							lv_intervalRange_33_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigIntervalRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_34=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_34, grammarAccess.getGSSConfigSpecialPacketAccess().getRightCurlyBracketKeyword_33());
              		
            }
            otherlv_35=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_35, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_34());
              		
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
    // $ANTLR end "ruleGSSConfigSpecialPacket"


    // $ANTLR start "entryRuleGSSConfigUpperLevels"
    // InternalCONFIG.g:3482:1: entryRuleGSSConfigUpperLevels returns [EObject current=null] : iv_ruleGSSConfigUpperLevels= ruleGSSConfigUpperLevels EOF ;
    public final EObject entryRuleGSSConfigUpperLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigUpperLevels = null;


        try {
            // InternalCONFIG.g:3482:61: (iv_ruleGSSConfigUpperLevels= ruleGSSConfigUpperLevels EOF )
            // InternalCONFIG.g:3483:2: iv_ruleGSSConfigUpperLevels= ruleGSSConfigUpperLevels EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigUpperLevelsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigUpperLevels=ruleGSSConfigUpperLevels();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigUpperLevels; 
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
    // $ANTLR end "entryRuleGSSConfigUpperLevels"


    // $ANTLR start "ruleGSSConfigUpperLevels"
    // InternalCONFIG.g:3489:1: ruleGSSConfigUpperLevels returns [EObject current=null] : (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSConfigUpperLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_UpperLevel_2_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3495:2: ( (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalCONFIG.g:3496:2: (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalCONFIG.g:3496:2: (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalCONFIG.g:3497:3: otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,70,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigUpperLevelsAccess().getGSSConfigUpperLevelsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigUpperLevelsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:3505:3: ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==83) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalCONFIG.g:3506:4: (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel )
            	    {
            	    // InternalCONFIG.g:3506:4: (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel )
            	    // InternalCONFIG.g:3507:5: lv_UpperLevel_2_0= ruleGSSConfigUpperLevel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelGSSConfigUpperLevelParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_76);
            	    lv_UpperLevel_2_0=ruleGSSConfigUpperLevel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSConfigUpperLevelsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"UpperLevel",
            	      						lv_UpperLevel_2_0,
            	      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevel");
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

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigUpperLevelsAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSConfigUpperLevelsAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSConfigUpperLevels"


    // $ANTLR start "entryRuleGSSConfigPrintingData"
    // InternalCONFIG.g:3536:1: entryRuleGSSConfigPrintingData returns [EObject current=null] : iv_ruleGSSConfigPrintingData= ruleGSSConfigPrintingData EOF ;
    public final EObject entryRuleGSSConfigPrintingData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPrintingData = null;


        try {
            // InternalCONFIG.g:3536:62: (iv_ruleGSSConfigPrintingData= ruleGSSConfigPrintingData EOF )
            // InternalCONFIG.g:3537:2: iv_ruleGSSConfigPrintingData= ruleGSSConfigPrintingData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPrintingDataRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPrintingData=ruleGSSConfigPrintingData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPrintingData; 
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
    // $ANTLR end "entryRuleGSSConfigPrintingData"


    // $ANTLR start "ruleGSSConfigPrintingData"
    // InternalCONFIG.g:3543:1: ruleGSSConfigPrintingData returns [EObject current=null] : (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSConfigPrintingData() throws RecognitionException {
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
            // InternalCONFIG.g:3549:2: ( (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) )
            // InternalCONFIG.g:3550:2: (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalCONFIG.g:3550:2: (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            // InternalCONFIG.g:3551:3: otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPrintingDataAccess().getGSSConfigPrintingDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPrintingDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,72,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPrintingDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3567:3: ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:3568:4: (lv_printStatus_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:3568:4: (lv_printStatus_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:3569:5: lv_printStatus_4_0= ruleGSSConfigEnableDisable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusGSSConfigEnableDisableEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_printStatus_4_0=ruleGSSConfigEnableDisable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPrintingDataRule());
              					}
              					set(
              						current,
              						"printStatus",
              						lv_printStatus_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigEnableDisable");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_5());
              		
            }
            // InternalCONFIG.g:3590:3: ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==85) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCONFIG.g:3591:4: (lv_structuredData_6_0= ruleGSSConfigStructuredData )
                    {
                    // InternalCONFIG.g:3591:4: (lv_structuredData_6_0= ruleGSSConfigStructuredData )
                    // InternalCONFIG.g:3592:5: lv_structuredData_6_0= ruleGSSConfigStructuredData
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigPrintingDataAccess().getStructuredDataGSSConfigStructuredDataParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_structuredData_6_0=ruleGSSConfigStructuredData();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigPrintingDataRule());
                      					}
                      					set(
                      						current,
                      						"structuredData",
                      						lv_structuredData_6_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigStructuredData");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPrintingDataAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSConfigPrintingData"


    // $ANTLR start "entryRuleGSSConfigPeriod"
    // InternalCONFIG.g:3621:1: entryRuleGSSConfigPeriod returns [EObject current=null] : iv_ruleGSSConfigPeriod= ruleGSSConfigPeriod EOF ;
    public final EObject entryRuleGSSConfigPeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriod = null;


        try {
            // InternalCONFIG.g:3621:56: (iv_ruleGSSConfigPeriod= ruleGSSConfigPeriod EOF )
            // InternalCONFIG.g:3622:2: iv_ruleGSSConfigPeriod= ruleGSSConfigPeriod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPeriodRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPeriod=ruleGSSConfigPeriod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPeriod; 
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
    // $ANTLR end "entryRuleGSSConfigPeriod"


    // $ANTLR start "ruleGSSConfigPeriod"
    // InternalCONFIG.g:3628:1: ruleGSSConfigPeriod returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSConfigPeriod() throws RecognitionException {
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
            // InternalCONFIG.g:3634:2: ( (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:3635:2: (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:3635:2: (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:3636:3: otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodAccess().getGSSConfigPeriodKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodAccess().getMin_valueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3652:3: ( (lv_min_value_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:3653:4: (lv_min_value_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3653:4: (lv_min_value_4_0= ruleINTEGER )
            // InternalCONFIG.g:3654:5: lv_min_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMin_valueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
              					}
              					set(
              						current,
              						"min_value",
              						lv_min_value_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,75,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodAccess().getMin_unitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:3683:3: ( (lv_min_unit_8_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:3684:4: (lv_min_unit_8_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:3684:4: (lv_min_unit_8_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:3685:5: lv_min_unit_8_0= ruleGSSConfigUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMin_unitGSSConfigUnitEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_unit_8_0=ruleGSSConfigUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
              					}
              					set(
              						current,
              						"min_unit",
              						lv_min_unit_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodAccess().getMax_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:3714:3: ( (lv_max_value_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:3715:4: (lv_max_value_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3715:4: (lv_max_value_12_0= ruleINTEGER )
            // InternalCONFIG.g:3716:5: lv_max_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMax_valueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
              					}
              					set(
              						current,
              						"max_value",
              						lv_max_value_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,77,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodAccess().getMax_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:3745:3: ( (lv_max_unit_16_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:3746:4: (lv_max_unit_16_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:3746:4: (lv_max_unit_16_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:3747:5: lv_max_unit_16_0= ruleGSSConfigUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodAccess().getMax_unitGSSConfigUnitEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_unit_16_0=ruleGSSConfigUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodRule());
              					}
              					set(
              						current,
              						"max_unit",
              						lv_max_unit_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSConfigPeriod"


    // $ANTLR start "entryRuleGSSConfigIntervalRange"
    // InternalCONFIG.g:3780:1: entryRuleGSSConfigIntervalRange returns [EObject current=null] : iv_ruleGSSConfigIntervalRange= ruleGSSConfigIntervalRange EOF ;
    public final EObject entryRuleGSSConfigIntervalRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigIntervalRange = null;


        try {
            // InternalCONFIG.g:3780:63: (iv_ruleGSSConfigIntervalRange= ruleGSSConfigIntervalRange EOF )
            // InternalCONFIG.g:3781:2: iv_ruleGSSConfigIntervalRange= ruleGSSConfigIntervalRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigIntervalRangeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigIntervalRange=ruleGSSConfigIntervalRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigIntervalRange; 
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
    // $ANTLR end "entryRuleGSSConfigIntervalRange"


    // $ANTLR start "ruleGSSConfigIntervalRange"
    // InternalCONFIG.g:3787:1: ruleGSSConfigIntervalRange returns [EObject current=null] : (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSConfigIntervalRange() throws RecognitionException {
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
            // InternalCONFIG.g:3793:2: ( (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:3794:2: (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:3794:2: (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:3795:3: otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigIntervalRangeAccess().getGSSConfigIntervalRangeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigIntervalRangeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,79,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigIntervalRangeAccess().getMinKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3811:3: ( (lv_min_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:3812:4: (lv_min_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3812:4: (lv_min_4_0= ruleINTEGER )
            // InternalCONFIG.g:3813:5: lv_min_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getMinINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_min_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
              					}
              					set(
              						current,
              						"min",
              						lv_min_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,80,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigIntervalRangeAccess().getMaxKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:3842:3: ( (lv_max_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:3843:4: (lv_max_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3843:4: (lv_max_8_0= ruleINTEGER )
            // InternalCONFIG.g:3844:5: lv_max_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getMaxINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_max_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
              					}
              					set(
              						current,
              						"max",
              						lv_max_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,81,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:3873:3: ( (lv_interval_value_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:3874:4: (lv_interval_value_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3874:4: (lv_interval_value_12_0= ruleINTEGER )
            // InternalCONFIG.g:3875:5: lv_interval_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_interval_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
              					}
              					set(
              						current,
              						"interval_value",
              						lv_interval_value_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,82,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:3904:3: ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:3905:4: (lv_interval_unit_16_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:3905:4: (lv_interval_unit_16_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:3906:5: lv_interval_unit_16_0= ruleGSSConfigUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitGSSConfigUnitEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_interval_unit_16_0=ruleGSSConfigUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigIntervalRangeRule());
              					}
              					set(
              						current,
              						"interval_unit",
              						lv_interval_unit_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigIntervalRangeAccess().getRightCurlyBracketKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_19());
              		
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
    // $ANTLR end "ruleGSSConfigIntervalRange"


    // $ANTLR start "entryRuleGSSConfigUpperLevel"
    // InternalCONFIG.g:3939:1: entryRuleGSSConfigUpperLevel returns [EObject current=null] : iv_ruleGSSConfigUpperLevel= ruleGSSConfigUpperLevel EOF ;
    public final EObject entryRuleGSSConfigUpperLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigUpperLevel = null;


        try {
            // InternalCONFIG.g:3939:60: (iv_ruleGSSConfigUpperLevel= ruleGSSConfigUpperLevel EOF )
            // InternalCONFIG.g:3940:2: iv_ruleGSSConfigUpperLevel= ruleGSSConfigUpperLevel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigUpperLevelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigUpperLevel=ruleGSSConfigUpperLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigUpperLevel; 
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
    // $ANTLR end "entryRuleGSSConfigUpperLevel"


    // $ANTLR start "ruleGSSConfigUpperLevel"
    // InternalCONFIG.g:3946:1: ruleGSSConfigUpperLevel returns [EObject current=null] : (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSConfigUpperLevel() throws RecognitionException {
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
            // InternalCONFIG.g:3952:2: ( (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:3953:2: (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:3953:2: (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:3954:3: otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )? (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigUpperLevelAccess().getGSSConfigUpperLevelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigUpperLevelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigUpperLevelAccess().getLevelKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3970:3: ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) )
            // InternalCONFIG.g:3971:4: (lv_level_4_0= ruleGSSConfigUpperLevelLevel )
            {
            // InternalCONFIG.g:3971:4: (lv_level_4_0= ruleGSSConfigUpperLevelLevel )
            // InternalCONFIG.g:3972:5: lv_level_4_0= ruleGSSConfigUpperLevelLevel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getLevelGSSConfigUpperLevelLevelEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_4_0=ruleGSSConfigUpperLevelLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigUpperLevelRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevelLevel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_5());
              		
            }
            // InternalCONFIG.g:3993:3: (otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==58) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCONFIG.g:3994:4: otherlv_6= 'TMformat' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,58,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSConfigUpperLevelAccess().getTMformatKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalCONFIG.g:4002:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4003:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4003:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4004:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatGSSTmTcFormatTmTCFormatCrossReference_6_2_0());
                      					
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

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_91); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:4026:3: (otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCONFIG.g:4027:4: otherlv_10= 'inputFilter' otherlv_11= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,60,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterKeyword_7_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_7_1());
                      			
                    }
                    // InternalCONFIG.g:4035:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4036:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4036:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4037:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterGSSFilterFilterCrossReference_7_2_0());
                      					
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

                      				newLeafNode(otherlv_13, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_7_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:4059:3: (otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==62) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCONFIG.g:4060:4: otherlv_14= 'import_from_prev_Level' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,62,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelKeyword_8_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_8_1());
                      			
                    }
                    // InternalCONFIG.g:4068:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4069:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4069:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4070:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigUpperLevelRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelGSSImportImportCrossReference_8_2_0());
                      					
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

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_8_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigUpperLevelAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_10());
              		
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
    // $ANTLR end "ruleGSSConfigUpperLevel"


    // $ANTLR start "entryRuleGSSConfigStructuredData"
    // InternalCONFIG.g:4104:1: entryRuleGSSConfigStructuredData returns [EObject current=null] : iv_ruleGSSConfigStructuredData= ruleGSSConfigStructuredData EOF ;
    public final EObject entryRuleGSSConfigStructuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigStructuredData = null;


        try {
            // InternalCONFIG.g:4104:64: (iv_ruleGSSConfigStructuredData= ruleGSSConfigStructuredData EOF )
            // InternalCONFIG.g:4105:2: iv_ruleGSSConfigStructuredData= ruleGSSConfigStructuredData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigStructuredDataRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigStructuredData=ruleGSSConfigStructuredData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigStructuredData; 
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
    // $ANTLR end "entryRuleGSSConfigStructuredData"


    // $ANTLR start "ruleGSSConfigStructuredData"
    // InternalCONFIG.g:4111:1: ruleGSSConfigStructuredData returns [EObject current=null] : (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSConfigStructuredData() throws RecognitionException {
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
            // InternalCONFIG.g:4117:2: ( (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCONFIG.g:4118:2: (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCONFIG.g:4118:2: (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalCONFIG.g:4119:3: otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigStructuredDataAccess().getGSSConfigStructuredDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigStructuredDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4135:3: ( (lv_levelRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:4136:4: (lv_levelRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4136:4: (lv_levelRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:4137:5: lv_levelRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_levelRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigStructuredDataRule());
              					}
              					set(
              						current,
              						"levelRef",
              						lv_levelRef_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_92); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,86,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4166:3: ( (lv_firstField_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4167:4: (lv_firstField_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4167:4: (lv_firstField_8_0= ruleINTEGER )
            // InternalCONFIG.g:4168:5: lv_firstField_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_firstField_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigStructuredDataRule());
              					}
              					set(
              						current,
              						"firstField",
              						lv_firstField_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigStructuredDataAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigStructuredDataAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSConfigStructuredData"


    // $ANTLR start "entryRuleGSSConfigPeriodicTCLevel2"
    // InternalCONFIG.g:4201:1: entryRuleGSSConfigPeriodicTCLevel2 returns [EObject current=null] : iv_ruleGSSConfigPeriodicTCLevel2= ruleGSSConfigPeriodicTCLevel2 EOF ;
    public final EObject entryRuleGSSConfigPeriodicTCLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriodicTCLevel2 = null;


        try {
            // InternalCONFIG.g:4201:66: (iv_ruleGSSConfigPeriodicTCLevel2= ruleGSSConfigPeriodicTCLevel2 EOF )
            // InternalCONFIG.g:4202:2: iv_ruleGSSConfigPeriodicTCLevel2= ruleGSSConfigPeriodicTCLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPeriodicTCLevel2=ruleGSSConfigPeriodicTCLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPeriodicTCLevel2; 
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
    // $ANTLR end "entryRuleGSSConfigPeriodicTCLevel2"


    // $ANTLR start "ruleGSSConfigPeriodicTCLevel2"
    // InternalCONFIG.g:4208:1: ruleGSSConfigPeriodicTCLevel2 returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' ) ;
    public final EObject ruleGSSConfigPeriodicTCLevel2() throws RecognitionException {
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
            // InternalCONFIG.g:4214:2: ( (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' ) )
            // InternalCONFIG.g:4215:2: (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' )
            {
            // InternalCONFIG.g:4215:2: (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';' )
            // InternalCONFIG.g:4216:3: otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level2' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )? (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )? otherlv_46= '}' otherlv_47= ';'
            {
            otherlv_0=(Token)match(input,87,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGSSConfigPeriodicTCLevel2Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4232:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:4233:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:4233:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:4234:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4262:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4263:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4263:4: (lv_id_8_0= ruleINTEGER )
            // InternalCONFIG.g:4264:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:4293:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:4294:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4294:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:4295:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:4324:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:4325:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4325:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalCONFIG.g:4326:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:4355:3: ( (lv_period_unit_20_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:4356:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:4356:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:4357:5: lv_period_unit_20_0= ruleGSSConfigUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSConfigUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_95); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:4378:3: (otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==90) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCONFIG.g:4379:4: otherlv_22= 'level2' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:4387:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4388:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4388:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4389:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2GSSTmTcFormatTmTCFormatCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_96); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,91,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalCONFIG.g:4419:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:4420:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:4420:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:4421:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2GSSExportExportCrossReference_25_0());
              				
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_26());
              		
            }
            // InternalCONFIG.g:4442:3: (otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==92) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCONFIG.g:4443:4: otherlv_30= 'level1' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';'
                    {
                    otherlv_30=(Token)match(input,92,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1Keyword_27_0());
                      			
                    }
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_27_1());
                      			
                    }
                    // InternalCONFIG.g:4451:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4452:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4452:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4453:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1GSSTmTcFormatTmTCFormatCrossReference_27_2_0());
                      					
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

                    otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_98); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_27_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:4475:3: (otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==93) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCONFIG.g:4476:4: otherlv_34= 'level2_to_level1' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';'
                    {
                    otherlv_34=(Token)match(input,93,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1Keyword_28_0());
                      			
                    }
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_28_1());
                      			
                    }
                    // InternalCONFIG.g:4484:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4485:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4485:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4486:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1GSSExportExportCrossReference_28_2_0());
                      					
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

                    otherlv_37=(Token)match(input,14,FollowSets000.FOLLOW_99); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_28_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:4508:3: (otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==94) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCONFIG.g:4509:4: otherlv_38= 'level0' otherlv_39= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_41= ';'
                    {
                    otherlv_38=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0Keyword_29_0());
                      			
                    }
                    otherlv_39=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_39, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_29_1());
                      			
                    }
                    // InternalCONFIG.g:4517:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4518:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4518:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4519:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0GSSTmTcFormatTmTCFormatCrossReference_29_2_0());
                      					
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

                    otherlv_41=(Token)match(input,14,FollowSets000.FOLLOW_100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_29_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:4541:3: (otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==95) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCONFIG.g:4542:4: otherlv_42= 'level1_to_level0' otherlv_43= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_45= ';'
                    {
                    otherlv_42=(Token)match(input,95,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_42, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0Keyword_30_0());
                      			
                    }
                    otherlv_43=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_43, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_30_1());
                      			
                    }
                    // InternalCONFIG.g:4550:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4551:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4551:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4552:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0GSSExportExportCrossReference_30_2_0());
                      					
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

                    otherlv_45=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_30_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_46=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_46, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_47=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_47, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_32());
              		
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
    // $ANTLR end "ruleGSSConfigPeriodicTCLevel2"


    // $ANTLR start "entryRuleGSSConfigPeriodicTCLevel1"
    // InternalCONFIG.g:4586:1: entryRuleGSSConfigPeriodicTCLevel1 returns [EObject current=null] : iv_ruleGSSConfigPeriodicTCLevel1= ruleGSSConfigPeriodicTCLevel1 EOF ;
    public final EObject entryRuleGSSConfigPeriodicTCLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriodicTCLevel1 = null;


        try {
            // InternalCONFIG.g:4586:66: (iv_ruleGSSConfigPeriodicTCLevel1= ruleGSSConfigPeriodicTCLevel1 EOF )
            // InternalCONFIG.g:4587:2: iv_ruleGSSConfigPeriodicTCLevel1= ruleGSSConfigPeriodicTCLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPeriodicTCLevel1=ruleGSSConfigPeriodicTCLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPeriodicTCLevel1; 
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
    // $ANTLR end "entryRuleGSSConfigPeriodicTCLevel1"


    // $ANTLR start "ruleGSSConfigPeriodicTCLevel1"
    // InternalCONFIG.g:4593:1: ruleGSSConfigPeriodicTCLevel1 returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' ) ;
    public final EObject ruleGSSConfigPeriodicTCLevel1() throws RecognitionException {
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
            // InternalCONFIG.g:4599:2: ( (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' ) )
            // InternalCONFIG.g:4600:2: (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' )
            {
            // InternalCONFIG.g:4600:2: (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';' )
            // InternalCONFIG.g:4601:3: otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level1' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )? (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )? otherlv_38= '}' otherlv_39= ';'
            {
            otherlv_0=(Token)match(input,96,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGSSConfigPeriodicTCLevel1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4617:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:4618:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:4618:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:4619:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4647:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4648:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4648:4: (lv_id_8_0= ruleINTEGER )
            // InternalCONFIG.g:4649:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:4678:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:4679:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4679:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:4680:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:4709:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:4710:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4710:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalCONFIG.g:4711:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:4740:3: ( (lv_period_unit_20_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:4741:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:4741:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:4742:5: lv_period_unit_20_0= ruleGSSConfigUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSConfigUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_101); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:4763:3: (otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==92) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCONFIG.g:4764:4: otherlv_22= 'level1' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,92,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:4772:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4773:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4773:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4774:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1GSSTmTcFormatTmTCFormatCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_102); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,97,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalCONFIG.g:4804:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:4805:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:4805:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:4806:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1GSSExportExportCrossReference_25_0());
              				
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_26());
              		
            }
            // InternalCONFIG.g:4827:3: (otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==94) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCONFIG.g:4828:4: otherlv_30= 'level0' otherlv_31= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_33= ';'
                    {
                    otherlv_30=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_30, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0Keyword_27_0());
                      			
                    }
                    otherlv_31=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_27_1());
                      			
                    }
                    // InternalCONFIG.g:4836:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4837:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4837:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4838:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0GSSTmTcFormatTmTCFormatCrossReference_27_2_0());
                      					
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

                    otherlv_33=(Token)match(input,14,FollowSets000.FOLLOW_100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_27_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:4860:3: (otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==95) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCONFIG.g:4861:4: otherlv_34= 'level1_to_level0' otherlv_35= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_37= ';'
                    {
                    otherlv_34=(Token)match(input,95,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0Keyword_28_0());
                      			
                    }
                    otherlv_35=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_28_1());
                      			
                    }
                    // InternalCONFIG.g:4869:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:4870:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:4870:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:4871:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0GSSExportExportCrossReference_28_2_0());
                      					
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

                    otherlv_37=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_37, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_28_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_38=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_38, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getRightCurlyBracketKeyword_29());
              		
            }
            otherlv_39=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_39, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_30());
              		
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
    // $ANTLR end "ruleGSSConfigPeriodicTCLevel1"


    // $ANTLR start "entryRuleGSSConfigPeriodicTCLevel0"
    // InternalCONFIG.g:4905:1: entryRuleGSSConfigPeriodicTCLevel0 returns [EObject current=null] : iv_ruleGSSConfigPeriodicTCLevel0= ruleGSSConfigPeriodicTCLevel0 EOF ;
    public final EObject entryRuleGSSConfigPeriodicTCLevel0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriodicTCLevel0 = null;


        try {
            // InternalCONFIG.g:4905:66: (iv_ruleGSSConfigPeriodicTCLevel0= ruleGSSConfigPeriodicTCLevel0 EOF )
            // InternalCONFIG.g:4906:2: iv_ruleGSSConfigPeriodicTCLevel0= ruleGSSConfigPeriodicTCLevel0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPeriodicTCLevel0=ruleGSSConfigPeriodicTCLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPeriodicTCLevel0; 
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
    // $ANTLR end "entryRuleGSSConfigPeriodicTCLevel0"


    // $ANTLR start "ruleGSSConfigPeriodicTCLevel0"
    // InternalCONFIG.g:4912:1: ruleGSSConfigPeriodicTCLevel0 returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' ) ;
    public final EObject ruleGSSConfigPeriodicTCLevel0() throws RecognitionException {
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
            // InternalCONFIG.g:4918:2: ( (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' ) )
            // InternalCONFIG.g:4919:2: (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' )
            {
            // InternalCONFIG.g:4919:2: (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';' )
            // InternalCONFIG.g:4920:3: otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )? otherlv_26= 'app_to_level0' otherlv_27= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_29= ';' otherlv_30= '}' otherlv_31= ';'
            {
            otherlv_0=(Token)match(input,98,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGSSConfigPeriodicTCLevel0Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4936:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:4937:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:4937:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:4938:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4966:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4967:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4967:4: (lv_id_8_0= ruleINTEGER )
            // InternalCONFIG.g:4968:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:4997:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:4998:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4998:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:4999:5: lv_ifRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:5028:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:5029:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5029:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalCONFIG.g:5030:5: lv_period_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:5059:3: ( (lv_period_unit_20_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:5060:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:5060:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:5061:5: lv_period_unit_20_0= ruleGSSConfigUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitGSSConfigUnitEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_20_0=ruleGSSConfigUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:5082:3: (otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==94) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCONFIG.g:5083:4: otherlv_22= 'level0' otherlv_23= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0Keyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:5091:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:5092:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:5092:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:5093:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0GSSTmTcFormatTmTCFormatCrossReference_22_2_0());
                      					
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

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_22_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,99,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0Keyword_23());
              		
            }
            otherlv_27=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_24());
              		
            }
            // InternalCONFIG.g:5123:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:5124:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:5124:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:5125:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0GSSExportExportCrossReference_25_0());
              				
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

            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_26());
              		
            }
            otherlv_30=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getRightCurlyBracketKeyword_27());
              		
            }
            otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_28());
              		
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
    // $ANTLR end "ruleGSSConfigPeriodicTCLevel0"


    // $ANTLR start "entryRuleGSSConfigGlobalVar"
    // InternalCONFIG.g:5158:1: entryRuleGSSConfigGlobalVar returns [EObject current=null] : iv_ruleGSSConfigGlobalVar= ruleGSSConfigGlobalVar EOF ;
    public final EObject entryRuleGSSConfigGlobalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGlobalVar = null;


        try {
            // InternalCONFIG.g:5158:59: (iv_ruleGSSConfigGlobalVar= ruleGSSConfigGlobalVar EOF )
            // InternalCONFIG.g:5159:2: iv_ruleGSSConfigGlobalVar= ruleGSSConfigGlobalVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGlobalVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGlobalVar=ruleGSSConfigGlobalVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGlobalVar; 
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
    // $ANTLR end "entryRuleGSSConfigGlobalVar"


    // $ANTLR start "ruleGSSConfigGlobalVar"
    // InternalCONFIG.g:5165:1: ruleGSSConfigGlobalVar returns [EObject current=null] : (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleGSSConfigGlobalVar() throws RecognitionException {
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
            // InternalCONFIG.g:5171:2: ( (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' ) )
            // InternalCONFIG.g:5172:2: (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalCONFIG.g:5172:2: (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' )
            // InternalCONFIG.g:5173:3: otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,100,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGlobalVarAccess().getGSSConfigGlobalVarKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGlobalVarAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGlobalVarAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5189:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:5190:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:5190:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:5191:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigGlobalVarAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigGlobalVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGlobalVarAccess().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:5219:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:5220:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5220:4: (lv_id_8_0= ruleINTEGER )
            // InternalCONFIG.g:5221:5: lv_id_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getIdINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGlobalVarAccess().getTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:5250:3: ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) )
            // InternalCONFIG.g:5251:4: (lv_type_12_0= ruleGSSConfigGlobalVarType )
            {
            // InternalCONFIG.g:5251:4: (lv_type_12_0= ruleGSSConfigGlobalVarType )
            // InternalCONFIG.g:5252:5: lv_type_12_0= ruleGSSConfigGlobalVarType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getTypeGSSConfigGlobalVarTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_12_0=ruleGSSConfigGlobalVarType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGlobalVarType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,102,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:5281:3: ( (lv_initial_value_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:5282:4: (lv_initial_value_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5282:4: (lv_initial_value_16_0= ruleINTEGER )
            // InternalCONFIG.g:5283:5: lv_initial_value_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_initial_value_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
              					}
              					set(
              						current,
              						"initial_value",
              						lv_initial_value_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_17());
              		
            }
            // InternalCONFIG.g:5304:3: ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt41=1;
                }
                break;
            case 107:
                {
                alt41=2;
                }
                break;
            case 109:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalCONFIG.g:5305:4: ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) )
                    {
                    // InternalCONFIG.g:5305:4: ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) )
                    // InternalCONFIG.g:5306:5: (lv_referenceField_18_0= ruleGSSConfigReferenceField )
                    {
                    // InternalCONFIG.g:5306:5: (lv_referenceField_18_0= ruleGSSConfigReferenceField )
                    // InternalCONFIG.g:5307:6: lv_referenceField_18_0= ruleGSSConfigReferenceField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceFieldGSSConfigReferenceFieldParserRuleCall_18_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_referenceField_18_0=ruleGSSConfigReferenceField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
                      						}
                      						set(
                      							current,
                      							"referenceField",
                      							lv_referenceField_18_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceField");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:5325:4: ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) )
                    {
                    // InternalCONFIG.g:5325:4: ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) )
                    // InternalCONFIG.g:5326:5: (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC )
                    {
                    // InternalCONFIG.g:5326:5: (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC )
                    // InternalCONFIG.g:5327:6: lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getReferencePeriodicTCGSSConfigReferencePeriodicTCParserRuleCall_18_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_referencePeriodicTC_19_0=ruleGSSConfigReferencePeriodicTC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
                      						}
                      						set(
                      							current,
                      							"referencePeriodicTC",
                      							lv_referencePeriodicTC_19_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferencePeriodicTC");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:5345:4: ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) )
                    {
                    // InternalCONFIG.g:5345:4: ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) )
                    // InternalCONFIG.g:5346:5: (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket )
                    {
                    // InternalCONFIG.g:5346:5: (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket )
                    // InternalCONFIG.g:5347:6: lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigGlobalVarAccess().getReferenceSpecialPacketGSSConfigReferenceSpecialPacketParserRuleCall_18_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_referenceSpecialPacket_20_0=ruleGSSConfigReferenceSpecialPacket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigGlobalVarRule());
                      						}
                      						set(
                      							current,
                      							"referenceSpecialPacket",
                      							lv_referenceSpecialPacket_20_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceSpecialPacket");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigGlobalVarAccess().getRightCurlyBracketKeyword_19());
              		
            }
            otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_20());
              		
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
    // $ANTLR end "ruleGSSConfigGlobalVar"


    // $ANTLR start "entryRuleGSSConfigReferenceField"
    // InternalCONFIG.g:5377:1: entryRuleGSSConfigReferenceField returns [EObject current=null] : iv_ruleGSSConfigReferenceField= ruleGSSConfigReferenceField EOF ;
    public final EObject entryRuleGSSConfigReferenceField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigReferenceField = null;


        try {
            // InternalCONFIG.g:5377:64: (iv_ruleGSSConfigReferenceField= ruleGSSConfigReferenceField EOF )
            // InternalCONFIG.g:5378:2: iv_ruleGSSConfigReferenceField= ruleGSSConfigReferenceField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigReferenceFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigReferenceField=ruleGSSConfigReferenceField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigReferenceField; 
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
    // $ANTLR end "entryRuleGSSConfigReferenceField"


    // $ANTLR start "ruleGSSConfigReferenceField"
    // InternalCONFIG.g:5384:1: ruleGSSConfigReferenceField returns [EObject current=null] : (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) ;
    public final EObject ruleGSSConfigReferenceField() throws RecognitionException {
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
            // InternalCONFIG.g:5390:2: ( (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) )
            // InternalCONFIG.g:5391:2: (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalCONFIG.g:5391:2: (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            // InternalCONFIG.g:5392:3: otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,103,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferenceFieldAccess().getGSSConfigReferenceFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferenceFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferenceFieldAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5408:3: ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) )
            // InternalCONFIG.g:5409:4: (lv_type_4_0= ruleGSSConfigReferenceFieldType )
            {
            // InternalCONFIG.g:5409:4: (lv_type_4_0= ruleGSSConfigReferenceFieldType )
            // InternalCONFIG.g:5410:5: lv_type_4_0= ruleGSSConfigReferenceFieldType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getTypeGSSConfigReferenceFieldTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_4_0=ruleGSSConfigReferenceFieldType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReferenceFieldType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:5439:3: ( (lv_ifRef_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:5440:4: (lv_ifRef_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5440:4: (lv_ifRef_8_0= ruleINTEGER )
            // InternalCONFIG.g:5441:5: lv_ifRef_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_ifRef_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferenceFieldAccess().getLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:5470:3: ( (lv_level_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:5471:4: (lv_level_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5471:4: (lv_level_12_0= ruleINTEGER )
            // InternalCONFIG.g:5472:5: lv_level_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getLevelINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:5501:3: ( (lv_fieldRef_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:5502:4: (lv_fieldRef_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5502:4: (lv_fieldRef_16_0= ruleINTEGER )
            // InternalCONFIG.g:5503:5: lv_fieldRef_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
              					}
              					set(
              						current,
              						"fieldRef",
              						lv_fieldRef_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:5532:3: ( (lv_offset_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:5533:4: (lv_offset_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5533:4: (lv_offset_20_0= ruleINTEGER )
            // InternalCONFIG.g:5534:5: lv_offset_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigReferenceFieldAccess().getSizeKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalCONFIG.g:5563:3: ( (lv_size_24_0= ruleINTEGER ) )
            // InternalCONFIG.g:5564:4: (lv_size_24_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5564:4: (lv_size_24_0= ruleINTEGER )
            // InternalCONFIG.g:5565:5: lv_size_24_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceFieldAccess().getSizeINTEGERParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_24_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceFieldRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_24_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_25());
              		
            }
            otherlv_26=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSConfigReferenceFieldAccess().getRightCurlyBracketKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_27());
              		
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
    // $ANTLR end "ruleGSSConfigReferenceField"


    // $ANTLR start "entryRuleGSSConfigReferencePeriodicTC"
    // InternalCONFIG.g:5598:1: entryRuleGSSConfigReferencePeriodicTC returns [EObject current=null] : iv_ruleGSSConfigReferencePeriodicTC= ruleGSSConfigReferencePeriodicTC EOF ;
    public final EObject entryRuleGSSConfigReferencePeriodicTC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigReferencePeriodicTC = null;


        try {
            // InternalCONFIG.g:5598:69: (iv_ruleGSSConfigReferencePeriodicTC= ruleGSSConfigReferencePeriodicTC EOF )
            // InternalCONFIG.g:5599:2: iv_ruleGSSConfigReferencePeriodicTC= ruleGSSConfigReferencePeriodicTC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigReferencePeriodicTC=ruleGSSConfigReferencePeriodicTC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigReferencePeriodicTC; 
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
    // $ANTLR end "entryRuleGSSConfigReferencePeriodicTC"


    // $ANTLR start "ruleGSSConfigReferencePeriodicTC"
    // InternalCONFIG.g:5605:1: ruleGSSConfigReferencePeriodicTC returns [EObject current=null] : (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSConfigReferencePeriodicTC() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_idRef_4_0 = null;

        AntlrDatatypeRuleToken lv_level_8_0 = null;

        AntlrDatatypeRuleToken lv_fieldRef_12_0 = null;

        AntlrDatatypeRuleToken lv_offset_16_0 = null;

        AntlrDatatypeRuleToken lv_size_20_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5611:2: ( (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalCONFIG.g:5612:2: (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalCONFIG.g:5612:2: (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalCONFIG.g:5613:3: otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,107,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGSSConfigReferencePeriodicTCKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5629:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:5630:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5630:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:5631:5: lv_idRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_idRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"idRef",
              						lv_idRef_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:5660:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:5661:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5661:4: (lv_level_8_0= ruleINTEGER )
            // InternalCONFIG.g:5662:5: lv_level_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:5691:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:5692:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5692:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:5693:5: lv_fieldRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"fieldRef",
              						lv_fieldRef_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:5722:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:5723:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5723:4: (lv_offset_16_0= ruleINTEGER )
            // InternalCONFIG.g:5724:5: lv_offset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:5753:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:5754:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5754:4: (lv_size_20_0= ruleINTEGER )
            // InternalCONFIG.g:5755:5: lv_size_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferencePeriodicTCRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getRightCurlyBracketKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_23());
              		
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
    // $ANTLR end "ruleGSSConfigReferencePeriodicTC"


    // $ANTLR start "entryRuleGSSConfigReferenceSpecialPacket"
    // InternalCONFIG.g:5788:1: entryRuleGSSConfigReferenceSpecialPacket returns [EObject current=null] : iv_ruleGSSConfigReferenceSpecialPacket= ruleGSSConfigReferenceSpecialPacket EOF ;
    public final EObject entryRuleGSSConfigReferenceSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigReferenceSpecialPacket = null;


        try {
            // InternalCONFIG.g:5788:72: (iv_ruleGSSConfigReferenceSpecialPacket= ruleGSSConfigReferenceSpecialPacket EOF )
            // InternalCONFIG.g:5789:2: iv_ruleGSSConfigReferenceSpecialPacket= ruleGSSConfigReferenceSpecialPacket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigReferenceSpecialPacket=ruleGSSConfigReferenceSpecialPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigReferenceSpecialPacket; 
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
    // $ANTLR end "entryRuleGSSConfigReferenceSpecialPacket"


    // $ANTLR start "ruleGSSConfigReferenceSpecialPacket"
    // InternalCONFIG.g:5795:1: ruleGSSConfigReferenceSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSConfigReferenceSpecialPacket() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_idRef_4_0 = null;

        AntlrDatatypeRuleToken lv_level_8_0 = null;

        AntlrDatatypeRuleToken lv_fieldRef_12_0 = null;

        AntlrDatatypeRuleToken lv_offset_16_0 = null;

        AntlrDatatypeRuleToken lv_size_20_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5801:2: ( (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalCONFIG.g:5802:2: (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalCONFIG.g:5802:2: (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalCONFIG.g:5803:3: otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,109,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGSSConfigReferenceSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5819:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:5820:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5820:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:5821:5: lv_idRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_idRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"idRef",
              						lv_idRef_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,84,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:5850:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:5851:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5851:4: (lv_level_8_0= ruleINTEGER )
            // InternalCONFIG.g:5852:5: lv_level_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_level_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"level",
              						lv_level_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_110); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:5881:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:5882:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5882:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:5883:5: lv_fieldRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_fieldRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"fieldRef",
              						lv_fieldRef_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:5912:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:5913:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5913:4: (lv_offset_16_0= ruleINTEGER )
            // InternalCONFIG.g:5914:5: lv_offset_16_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetINTEGERParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_offset_16_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"offset",
              						lv_offset_16_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,106,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:5943:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:5944:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5944:4: (lv_size_20_0= ruleINTEGER )
            // InternalCONFIG.g:5945:5: lv_size_20_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeINTEGERParserRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_size_20_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigReferenceSpecialPacketRule());
              					}
              					set(
              						current,
              						"size",
              						lv_size_20_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getRightCurlyBracketKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_23());
              		
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
    // $ANTLR end "ruleGSSConfigReferenceSpecialPacket"


    // $ANTLR start "entryRuleGSSConfigPlot"
    // InternalCONFIG.g:5978:1: entryRuleGSSConfigPlot returns [EObject current=null] : iv_ruleGSSConfigPlot= ruleGSSConfigPlot EOF ;
    public final EObject entryRuleGSSConfigPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPlot = null;


        try {
            // InternalCONFIG.g:5978:54: (iv_ruleGSSConfigPlot= ruleGSSConfigPlot EOF )
            // InternalCONFIG.g:5979:2: iv_ruleGSSConfigPlot= ruleGSSConfigPlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigPlotRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigPlot=ruleGSSConfigPlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigPlot; 
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
    // $ANTLR end "entryRuleGSSConfigPlot"


    // $ANTLR start "ruleGSSConfigPlot"
    // InternalCONFIG.g:5985:1: ruleGSSConfigPlot returns [EObject current=null] : (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' ) ;
    public final EObject ruleGSSConfigPlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_GVFiltered_6_0 = null;

        EObject lv_GVPeriodic_7_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5991:2: ( (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' ) )
            // InternalCONFIG.g:5992:2: (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalCONFIG.g:5992:2: (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' )
            // InternalCONFIG.g:5993:3: otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,110,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPlotAccess().getGSSConfigPlotKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPlotAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPlotAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6009:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:6010:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:6010:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:6011:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPlotAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPlotRule());
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

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_5());
              		
            }
            // InternalCONFIG.g:6031:3: ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==116) ) {
                alt42=1;
            }
            else if ( (LA42_0==119) ) {
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
                    // InternalCONFIG.g:6032:4: ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:6032:4: ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:6033:5: (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:6033:5: (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:6034:6: lv_GVFiltered_6_0= ruleGSSConfigGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPlotAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_6_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVFiltered_6_0=ruleGSSConfigGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigPlotRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_6_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:6052:4: ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:6052:4: ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:6053:5: (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:6053:5: (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:6054:6: lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigPlotAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVPeriodic_7_0=ruleGSSConfigGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigPlotRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_7_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSConfigPlotAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSConfigPlot"


    // $ANTLR start "entryRuleGSSConfigAlarmMsg"
    // InternalCONFIG.g:6084:1: entryRuleGSSConfigAlarmMsg returns [EObject current=null] : iv_ruleGSSConfigAlarmMsg= ruleGSSConfigAlarmMsg EOF ;
    public final EObject entryRuleGSSConfigAlarmMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigAlarmMsg = null;


        try {
            // InternalCONFIG.g:6084:58: (iv_ruleGSSConfigAlarmMsg= ruleGSSConfigAlarmMsg EOF )
            // InternalCONFIG.g:6085:2: iv_ruleGSSConfigAlarmMsg= ruleGSSConfigAlarmMsg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigAlarmMsgRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigAlarmMsg=ruleGSSConfigAlarmMsg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigAlarmMsg; 
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
    // $ANTLR end "entryRuleGSSConfigAlarmMsg"


    // $ANTLR start "ruleGSSConfigAlarmMsg"
    // InternalCONFIG.g:6091:1: ruleGSSConfigAlarmMsg returns [EObject current=null] : (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) ;
    public final EObject ruleGSSConfigAlarmMsg() throws RecognitionException {
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
            // InternalCONFIG.g:6097:2: ( (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) )
            // InternalCONFIG.g:6098:2: (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalCONFIG.g:6098:2: (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            // InternalCONFIG.g:6099:3: otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,111,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAlarmMsgAccess().getGSSConfigAlarmMsgKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAlarmMsgAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAlarmMsgAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6115:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:6116:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:6116:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:6117:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigAlarmMsgAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigAlarmMsgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAlarmMsgAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6145:3: ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) )
            // InternalCONFIG.g:6146:4: (lv_type_8_0= ruleGSSConfigAlarmMsgType )
            {
            // InternalCONFIG.g:6146:4: (lv_type_8_0= ruleGSSConfigAlarmMsgType )
            // InternalCONFIG.g:6147:5: lv_type_8_0= ruleGSSConfigAlarmMsgType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigAlarmMsgAccess().getTypeGSSConfigAlarmMsgTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSConfigAlarmMsgType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigAlarmMsgRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmMsgType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,112,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigAlarmMsgAccess().getTextKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:6176:3: ( (lv_text_12_0= RULE_ID ) )
            // InternalCONFIG.g:6177:4: (lv_text_12_0= RULE_ID )
            {
            // InternalCONFIG.g:6177:4: (lv_text_12_0= RULE_ID )
            // InternalCONFIG.g:6178:5: lv_text_12_0= RULE_ID
            {
            lv_text_12_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_text_12_0, grammarAccess.getGSSConfigAlarmMsgAccess().getTextIDTerminalRuleCall_12_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigAlarmMsgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"text",
              						lv_text_12_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_13());
              		
            }
            // InternalCONFIG.g:6198:3: ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==116) ) {
                alt43=1;
            }
            else if ( (LA43_0==119) ) {
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
                    // InternalCONFIG.g:6199:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:6199:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:6200:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:6200:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:6201:6: lv_GVFiltered_14_0= ruleGSSConfigGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigAlarmMsgAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVFiltered_14_0=ruleGSSConfigGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigAlarmMsgRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_14_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:6219:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:6219:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:6220:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:6220:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:6221:6: lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigAlarmMsgAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVPeriodic_15_0=ruleGSSConfigGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigAlarmMsgRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_15_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSConfigAlarmMsgAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSConfigAlarmMsg"


    // $ANTLR start "entryRuleGSSConfigModify"
    // InternalCONFIG.g:6251:1: entryRuleGSSConfigModify returns [EObject current=null] : iv_ruleGSSConfigModify= ruleGSSConfigModify EOF ;
    public final EObject entryRuleGSSConfigModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigModify = null;


        try {
            // InternalCONFIG.g:6251:56: (iv_ruleGSSConfigModify= ruleGSSConfigModify EOF )
            // InternalCONFIG.g:6252:2: iv_ruleGSSConfigModify= ruleGSSConfigModify EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigModifyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigModify=ruleGSSConfigModify();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigModify; 
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
    // $ANTLR end "entryRuleGSSConfigModify"


    // $ANTLR start "ruleGSSConfigModify"
    // InternalCONFIG.g:6258:1: ruleGSSConfigModify returns [EObject current=null] : (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) ;
    public final EObject ruleGSSConfigModify() throws RecognitionException {
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
            // InternalCONFIG.g:6264:2: ( (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) )
            // InternalCONFIG.g:6265:2: (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalCONFIG.g:6265:2: (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            // InternalCONFIG.g:6266:3: otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,113,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigModifyAccess().getGSSConfigModifyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigModifyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigModifyAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6282:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:6283:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:6283:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:6284:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigModifyAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigModifyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigModifyAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6312:3: ( (lv_type_8_0= ruleGSSConfigModifyType ) )
            // InternalCONFIG.g:6313:4: (lv_type_8_0= ruleGSSConfigModifyType )
            {
            // InternalCONFIG.g:6313:4: (lv_type_8_0= ruleGSSConfigModifyType )
            // InternalCONFIG.g:6314:5: lv_type_8_0= ruleGSSConfigModifyType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getTypeGSSConfigModifyTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSConfigModifyType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigModifyType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,114,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigModifyAccess().getValueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:6343:3: ( (lv_value_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:6344:4: (lv_value_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6344:4: (lv_value_12_0= ruleINTEGER )
            // InternalCONFIG.g:6345:5: lv_value_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getValueINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_13());
              		
            }
            // InternalCONFIG.g:6366:3: ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==116) ) {
                alt44=1;
            }
            else if ( (LA44_0==119) ) {
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
                    // InternalCONFIG.g:6367:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:6367:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:6368:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:6368:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:6369:6: lv_GVFiltered_14_0= ruleGSSConfigGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_14_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVFiltered_14_0=ruleGSSConfigGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_14_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:6387:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:6387:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:6388:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:6388:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:6389:6: lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigModifyAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_14_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVPeriodic_15_0=ruleGSSConfigGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigModifyRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_15_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSConfigModifyAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSConfigModify"


    // $ANTLR start "entryRuleGSSConfigAlarmVal"
    // InternalCONFIG.g:6419:1: entryRuleGSSConfigAlarmVal returns [EObject current=null] : iv_ruleGSSConfigAlarmVal= ruleGSSConfigAlarmVal EOF ;
    public final EObject entryRuleGSSConfigAlarmVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigAlarmVal = null;


        try {
            // InternalCONFIG.g:6419:58: (iv_ruleGSSConfigAlarmVal= ruleGSSConfigAlarmVal EOF )
            // InternalCONFIG.g:6420:2: iv_ruleGSSConfigAlarmVal= ruleGSSConfigAlarmVal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigAlarmValRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigAlarmVal=ruleGSSConfigAlarmVal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigAlarmVal; 
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
    // $ANTLR end "entryRuleGSSConfigAlarmVal"


    // $ANTLR start "ruleGSSConfigAlarmVal"
    // InternalCONFIG.g:6426:1: ruleGSSConfigAlarmVal returns [EObject current=null] : (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleGSSConfigAlarmVal() throws RecognitionException {
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
            // InternalCONFIG.g:6432:2: ( (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) )
            // InternalCONFIG.g:6433:2: (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalCONFIG.g:6433:2: (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            // InternalCONFIG.g:6434:3: otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,115,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAlarmValAccess().getGSSConfigAlarmValKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAlarmValAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAlarmValAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6450:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:6451:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:6451:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:6452:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigAlarmValAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigAlarmValRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,101,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAlarmValAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6480:3: ( (lv_type_8_0= ruleGSSConfigAlarmValType ) )
            // InternalCONFIG.g:6481:4: (lv_type_8_0= ruleGSSConfigAlarmValType )
            {
            // InternalCONFIG.g:6481:4: (lv_type_8_0= ruleGSSConfigAlarmValType )
            // InternalCONFIG.g:6482:5: lv_type_8_0= ruleGSSConfigAlarmValType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigAlarmValAccess().getTypeGSSConfigAlarmValTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSConfigAlarmValType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigAlarmValRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAlarmValType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_9());
              		
            }
            // InternalCONFIG.g:6503:3: ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==116) ) {
                alt45=1;
            }
            else if ( (LA45_0==119) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalCONFIG.g:6504:4: ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:6504:4: ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:6505:5: (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:6505:5: (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:6506:6: lv_GVFiltered_10_0= ruleGSSConfigGVFiltered
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigAlarmValAccess().getGVFilteredGSSConfigGVFilteredParserRuleCall_10_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVFiltered_10_0=ruleGSSConfigGVFiltered();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigAlarmValRule());
                      						}
                      						set(
                      							current,
                      							"GVFiltered",
                      							lv_GVFiltered_10_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVFiltered");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:6524:4: ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:6524:4: ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:6525:5: (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:6525:5: (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:6526:6: lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigAlarmValAccess().getGVPeriodicGSSConfigGVPeriodicParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_GVPeriodic_11_0=ruleGSSConfigGVPeriodic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigAlarmValRule());
                      						}
                      						set(
                      							current,
                      							"GVPeriodic",
                      							lv_GVPeriodic_11_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigGVPeriodic");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSConfigAlarmValAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleGSSConfigAlarmVal"


    // $ANTLR start "entryRuleGSSConfigGVFiltered"
    // InternalCONFIG.g:6556:1: entryRuleGSSConfigGVFiltered returns [EObject current=null] : iv_ruleGSSConfigGVFiltered= ruleGSSConfigGVFiltered EOF ;
    public final EObject entryRuleGSSConfigGVFiltered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGVFiltered = null;


        try {
            // InternalCONFIG.g:6556:60: (iv_ruleGSSConfigGVFiltered= ruleGSSConfigGVFiltered EOF )
            // InternalCONFIG.g:6557:2: iv_ruleGSSConfigGVFiltered= ruleGSSConfigGVFiltered EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGVFilteredRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGVFiltered=ruleGSSConfigGVFiltered();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGVFiltered; 
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
    // $ANTLR end "entryRuleGSSConfigGVFiltered"


    // $ANTLR start "ruleGSSConfigGVFiltered"
    // InternalCONFIG.g:6563:1: ruleGSSConfigGVFiltered returns [EObject current=null] : (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSConfigGVFiltered() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_GlobalVarRef_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:6569:2: ( (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCONFIG.g:6570:2: (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCONFIG.g:6570:2: (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            // InternalCONFIG.g:6571:3: otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,116,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGVFilteredAccess().getGSSConfigGVFilteredKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGVFilteredAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,117,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6587:3: ( (lv_GlobalVarRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:6588:4: (lv_GlobalVarRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6588:4: (lv_GlobalVarRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:6589:5: lv_GlobalVarRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_GlobalVarRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGVFilteredRule());
              					}
              					set(
              						current,
              						"GlobalVarRef",
              						lv_GlobalVarRef_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_5());
              		
            }
            // InternalCONFIG.g:6610:3: (otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==118) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCONFIG.g:6611:4: otherlv_6= 'filter' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,118,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSConfigGVFilteredAccess().getFilterKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalCONFIG.g:6619:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalCONFIG.g:6620:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalCONFIG.g:6620:5: ( ruleVersionedQualifiedName )
                    // InternalCONFIG.g:6621:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigGVFilteredRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigGVFilteredAccess().getFilterGSSFilterFilterCrossReference_6_2_0());
                      					
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

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGVFilteredAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSConfigGVFiltered"


    // $ANTLR start "entryRuleGSSConfigGVPeriodic"
    // InternalCONFIG.g:6655:1: entryRuleGSSConfigGVPeriodic returns [EObject current=null] : iv_ruleGSSConfigGVPeriodic= ruleGSSConfigGVPeriodic EOF ;
    public final EObject entryRuleGSSConfigGVPeriodic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGVPeriodic = null;


        try {
            // InternalCONFIG.g:6655:60: (iv_ruleGSSConfigGVPeriodic= ruleGSSConfigGVPeriodic EOF )
            // InternalCONFIG.g:6656:2: iv_ruleGSSConfigGVPeriodic= ruleGSSConfigGVPeriodic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigGVPeriodicRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigGVPeriodic=ruleGSSConfigGVPeriodic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigGVPeriodic; 
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
    // $ANTLR end "entryRuleGSSConfigGVPeriodic"


    // $ANTLR start "ruleGSSConfigGVPeriodic"
    // InternalCONFIG.g:6662:1: ruleGSSConfigGVPeriodic returns [EObject current=null] : (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleGSSConfigGVPeriodic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_GlobalVarRef_5_0 = null;

        AntlrDatatypeRuleToken lv_period_value_9_0 = null;

        Enumerator lv_period_unit_13_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:6668:2: ( (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' ) )
            // InternalCONFIG.g:6669:2: (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalCONFIG.g:6669:2: (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' )
            // InternalCONFIG.g:6670:3: otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,119,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGVPeriodicAccess().getGSSConfigGVPeriodicKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGVPeriodicAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,117,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalCONFIG.g:6690:3: ( (lv_GlobalVarRef_5_0= ruleINTEGER ) )
            // InternalCONFIG.g:6691:4: (lv_GlobalVarRef_5_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6691:4: (lv_GlobalVarRef_5_0= ruleINTEGER )
            // InternalCONFIG.g:6692:5: lv_GlobalVarRef_5_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefINTEGERParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_GlobalVarRef_5_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGVPeriodicRule());
              					}
              					set(
              						current,
              						"GlobalVarRef",
              						lv_GlobalVarRef_5_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_93); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,88,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_8());
              		
            }
            // InternalCONFIG.g:6721:3: ( (lv_period_value_9_0= ruleINTEGER ) )
            // InternalCONFIG.g:6722:4: (lv_period_value_9_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6722:4: (lv_period_value_9_0= ruleINTEGER )
            // InternalCONFIG.g:6723:5: lv_period_value_9_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueINTEGERParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_value_9_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGVPeriodicRule());
              					}
              					set(
              						current,
              						"period_value",
              						lv_period_value_9_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_94); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_12());
              		
            }
            // InternalCONFIG.g:6752:3: ( (lv_period_unit_13_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:6753:4: (lv_period_unit_13_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:6753:4: (lv_period_unit_13_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:6754:5: lv_period_unit_13_0= ruleGSSConfigUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitGSSConfigUnitEnumRuleCall_13_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_period_unit_13_0=ruleGSSConfigUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGVPeriodicRule());
              					}
              					set(
              						current,
              						"period_unit",
              						lv_period_unit_13_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGVPeriodicAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSConfigGVPeriodicAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSConfigGVPeriodic"


    // $ANTLR start "entryRuleGSSConfigTestCase"
    // InternalCONFIG.g:6787:1: entryRuleGSSConfigTestCase returns [EObject current=null] : iv_ruleGSSConfigTestCase= ruleGSSConfigTestCase EOF ;
    public final EObject entryRuleGSSConfigTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigTestCase = null;


        try {
            // InternalCONFIG.g:6787:58: (iv_ruleGSSConfigTestCase= ruleGSSConfigTestCase EOF )
            // InternalCONFIG.g:6788:2: iv_ruleGSSConfigTestCase= ruleGSSConfigTestCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigTestCaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigTestCase=ruleGSSConfigTestCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigTestCase; 
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
    // $ANTLR end "entryRuleGSSConfigTestCase"


    // $ANTLR start "ruleGSSConfigTestCase"
    // InternalCONFIG.g:6794:1: ruleGSSConfigTestCase returns [EObject current=null] : (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSConfigTestCase() throws RecognitionException {
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
        Token lv_req_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_reqAction_13_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:6800:2: ( (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalCONFIG.g:6801:2: (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalCONFIG.g:6801:2: (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' )
            // InternalCONFIG.g:6802:3: otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,120,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6818:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCONFIG.g:6819:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCONFIG.g:6819:4: (lv_name_4_0= RULE_STRING )
            // InternalCONFIG.g:6820:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,121,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6848:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCONFIG.g:6849:4: ( ruleVersionedQualifiedName )
            {
            // InternalCONFIG.g:6849:4: ( ruleVersionedQualifiedName )
            // InternalCONFIG.g:6850:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9());
              		
            }
            // InternalCONFIG.g:6871:3: (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==122) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCONFIG.g:6872:4: otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,122,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0());
                      			
                    }
                    // InternalCONFIG.g:6876:4: ( (lv_req_11_0= RULE_ID ) )
                    // InternalCONFIG.g:6877:5: (lv_req_11_0= RULE_ID )
                    {
                    // InternalCONFIG.g:6877:5: (lv_req_11_0= RULE_ID )
                    // InternalCONFIG.g:6878:6: lv_req_11_0= RULE_ID
                    {
                    lv_req_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_req_11_0, grammarAccess.getGSSConfigTestCaseAccess().getReqIDTerminalRuleCall_10_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"req",
                      							lv_req_11_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCONFIG.g:6895:3: (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==123) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCONFIG.g:6896:4: otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) )
                    {
                    otherlv_12=(Token)match(input,123,FollowSets000.FOLLOW_125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0());
                      			
                    }
                    // InternalCONFIG.g:6900:4: ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) )
                    // InternalCONFIG.g:6901:5: (lv_reqAction_13_0= ruleGSSConfigReqAction )
                    {
                    // InternalCONFIG.g:6901:5: (lv_reqAction_13_0= ruleGSSConfigReqAction )
                    // InternalCONFIG.g:6902:6: lv_reqAction_13_0= ruleGSSConfigReqAction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigTestCaseAccess().getReqActionGSSConfigReqActionEnumRuleCall_11_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_reqAction_13_0=ruleGSSConfigReqAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigTestCaseRule());
                      						}
                      						set(
                      							current,
                      							"reqAction",
                      							lv_reqAction_13_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigReqAction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigTestCaseAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_13());
              		
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
    // $ANTLR end "ruleGSSConfigTestCase"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCONFIG.g:6932:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCONFIG.g:6932:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCONFIG.g:6933:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCONFIG.g:6939:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:6945:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCONFIG.g:6946:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCONFIG.g:6946:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCONFIG.g:6947:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCONFIG.g:6954:3: (kw= '.' this_ID_2= RULE_ID )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==124) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalCONFIG.g:6955:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,124,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_126); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalCONFIG.g:6972:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalCONFIG.g:6972:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalCONFIG.g:6973:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalCONFIG.g:6979:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalCONFIG.g:6985:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalCONFIG.g:6986:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalCONFIG.g:6986:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalCONFIG.g:6987:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalCONFIG.g:6987:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_INT) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_ID) ) {
                    alt51=2;
                }
                else if ( (LA51_1==EOF||LA51_1==14||LA51_1==124||LA51_1==126) ) {
                    alt51=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalCONFIG.g:6988:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:6996:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalCONFIG.g:6996:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalCONFIG.g:6997:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalCONFIG.g:6997:5: (this_INT_1= RULE_INT )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_INT) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalCONFIG.g:6998:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_126); if (state.failed) return current;
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

            // InternalCONFIG.g:7015:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==124) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalCONFIG.g:7016:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,124,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalCONFIG.g:7021:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_INT) ) {
            	        int LA53_1 = input.LA(2);

            	        if ( (LA53_1==RULE_ID) ) {
            	            alt53=2;
            	        }
            	        else if ( (LA53_1==EOF||LA53_1==14||LA53_1==124||LA53_1==126) ) {
            	            alt53=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 53, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA53_0==RULE_ID) ) {
            	        alt53=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 53, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalCONFIG.g:7022:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_126); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCONFIG.g:7030:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalCONFIG.g:7030:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalCONFIG.g:7031:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalCONFIG.g:7031:6: (this_INT_5= RULE_INT )?
            	            int alt52=2;
            	            int LA52_0 = input.LA(1);

            	            if ( (LA52_0==RULE_INT) ) {
            	                alt52=1;
            	            }
            	            switch (alt52) {
            	                case 1 :
            	                    // InternalCONFIG.g:7032:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_126); if (state.failed) return current;
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
            	    break loop54;
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
    // InternalCONFIG.g:7054:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalCONFIG.g:7054:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalCONFIG.g:7055:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalCONFIG.g:7061:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:7067:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalCONFIG.g:7068:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalCONFIG.g:7068:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalCONFIG.g:7069:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_127);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,125,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_128);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,126,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:7103:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalCONFIG.g:7103:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalCONFIG.g:7104:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalCONFIG.g:7110:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:7116:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalCONFIG.g:7117:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalCONFIG.g:7117:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalCONFIG.g:7118:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalCONFIG.g:7118:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1>=124 && LA55_1<=125)) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalCONFIG.g:7119:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_129);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_VersionedQualifiedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,127,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalCONFIG.g:7142:3: (kw= '::' this_ID_4= RULE_ID )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==127) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalCONFIG.g:7143:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,127,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_130); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalCONFIG.g:7160:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalCONFIG.g:7160:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalCONFIG.g:7161:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalCONFIG.g:7167:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7173:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalCONFIG.g:7174:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalCONFIG.g:7174:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_INT||LA58_0==128) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_HEXADECIMAL) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalCONFIG.g:7175:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalCONFIG.g:7175:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalCONFIG.g:7176:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalCONFIG.g:7176:4: (kw= '-' )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==128) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalCONFIG.g:7177:5: kw= '-'
                            {
                            kw=(Token)match(input,128,FollowSets000.FOLLOW_35); if (state.failed) return current;
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
                    // InternalCONFIG.g:7192:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalCONFIG.g:7203:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalCONFIG.g:7203:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalCONFIG.g:7204:2: iv_ruleDATE= ruleDATE EOF
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
    // InternalCONFIG.g:7210:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7216:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalCONFIG.g:7217:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalCONFIG.g:7217:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalCONFIG.g:7218:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,129,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
              		
            }
            kw=(Token)match(input,129,FollowSets000.FOLLOW_35); if (state.failed) return current;
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
    // InternalCONFIG.g:7253:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalCONFIG.g:7253:43: (iv_ruleURL= ruleURL EOF )
            // InternalCONFIG.g:7254:2: iv_ruleURL= ruleURL EOF
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
    // InternalCONFIG.g:7260:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7266:2: ( (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) )
            // InternalCONFIG.g:7267:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            {
            // InternalCONFIG.g:7267:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            // InternalCONFIG.g:7268:3: this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getURLAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCONFIG.g:7275:3: (kw= '+' this_ID_2= RULE_ID )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==130) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCONFIG.g:7276:4: kw= '+' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,130,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getURLAccess().getPlusSignKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_133); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getURLAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,131,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_2());
              		
            }
            // InternalCONFIG.g:7294:3: (this_ID_4= RULE_ID (kw= '.' )? )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalCONFIG.g:7295:4: this_ID_4= RULE_ID (kw= '.' )?
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_134); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getURLAccess().getIDTerminalRuleCall_3_0());
            	      			
            	    }
            	    // InternalCONFIG.g:7302:4: (kw= '.' )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==124) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalCONFIG.g:7303:5: kw= '.'
            	            {
            	            kw=(Token)match(input,124,FollowSets000.FOLLOW_135); if (state.failed) return current;
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
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            // InternalCONFIG.g:7310:3: (kw= '/' this_ID_7= RULE_ID )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==129) ) {
                    int LA62_1 = input.LA(2);

                    if ( (LA62_1==RULE_ID) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // InternalCONFIG.g:7311:4: kw= '/' this_ID_7= RULE_ID
            	    {
            	    kw=(Token)match(input,129,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_4_0());
            	      			
            	    }
            	    this_ID_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_136); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_7);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_7, grammarAccess.getURLAccess().getIDTerminalRuleCall_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalCONFIG.g:7324:3: (kw= '/' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==129) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCONFIG.g:7325:4: kw= '/'
                    {
                    kw=(Token)match(input,129,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleGSSConfigEnableDisable"
    // InternalCONFIG.g:7335:1: ruleGSSConfigEnableDisable returns [Enumerator current=null] : ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) ;
    public final Enumerator ruleGSSConfigEnableDisable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7341:2: ( ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) )
            // InternalCONFIG.g:7342:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            {
            // InternalCONFIG.g:7342:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==132) ) {
                alt64=1;
            }
            else if ( (LA64_0==133) ) {
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
                    // InternalCONFIG.g:7343:3: (enumLiteral_0= 'disabled' )
                    {
                    // InternalCONFIG.g:7343:3: (enumLiteral_0= 'disabled' )
                    // InternalCONFIG.g:7344:4: enumLiteral_0= 'disabled'
                    {
                    enumLiteral_0=(Token)match(input,132,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7351:3: (enumLiteral_1= 'enabled' )
                    {
                    // InternalCONFIG.g:7351:3: (enumLiteral_1= 'enabled' )
                    // InternalCONFIG.g:7352:4: enumLiteral_1= 'enabled'
                    {
                    enumLiteral_1=(Token)match(input,133,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigEnableDisableAccess().getEnabledEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigEnableDisableAccess().getEnabledEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSConfigEnableDisable"


    // $ANTLR start "ruleGSSConfigMainInterfaceType"
    // InternalCONFIG.g:7362:1: ruleGSSConfigMainInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) ) ;
    public final Enumerator ruleGSSConfigMainInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7368:2: ( ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) ) )
            // InternalCONFIG.g:7369:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) )
            {
            // InternalCONFIG.g:7369:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt65=1;
                }
                break;
            case 135:
                {
                alt65=2;
                }
                break;
            case 136:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalCONFIG.g:7370:3: (enumLiteral_0= 'SpW' )
                    {
                    // InternalCONFIG.g:7370:3: (enumLiteral_0= 'SpW' )
                    // InternalCONFIG.g:7371:4: enumLiteral_0= 'SpW'
                    {
                    enumLiteral_0=(Token)match(input,134,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7378:3: (enumLiteral_1= 'uart' )
                    {
                    // InternalCONFIG.g:7378:3: (enumLiteral_1= 'uart' )
                    // InternalCONFIG.g:7379:4: enumLiteral_1= 'uart'
                    {
                    enumLiteral_1=(Token)match(input,135,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7386:3: (enumLiteral_2= 'dummy' )
                    {
                    // InternalCONFIG.g:7386:3: (enumLiteral_2= 'dummy' )
                    // InternalCONFIG.g:7387:4: enumLiteral_2= 'dummy'
                    {
                    enumLiteral_2=(Token)match(input,136,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getDummyEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getDummyEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSConfigMainInterfaceType"


    // $ANTLR start "ruleGSSConfigMainInterfaceIOType"
    // InternalCONFIG.g:7397:1: ruleGSSConfigMainInterfaceIOType returns [Enumerator current=null] : (enumLiteral_0= 'in_out' ) ;
    public final Enumerator ruleGSSConfigMainInterfaceIOType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7403:2: ( (enumLiteral_0= 'in_out' ) )
            // InternalCONFIG.g:7404:2: (enumLiteral_0= 'in_out' )
            {
            // InternalCONFIG.g:7404:2: (enumLiteral_0= 'in_out' )
            // InternalCONFIG.g:7405:3: enumLiteral_0= 'in_out'
            {
            enumLiteral_0=(Token)match(input,137,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getGSSConfigMainInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigMainInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleGSSConfigMainInterfaceIOType"


    // $ANTLR start "ruleGSSConfigInterfaceType"
    // InternalCONFIG.g:7414:1: ruleGSSConfigInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) ) ;
    public final Enumerator ruleGSSConfigInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7420:2: ( ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) ) )
            // InternalCONFIG.g:7421:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) )
            {
            // InternalCONFIG.g:7421:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) )
            int alt66=5;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt66=1;
                }
                break;
            case 138:
                {
                alt66=2;
                }
                break;
            case 139:
                {
                alt66=3;
                }
                break;
            case 135:
                {
                alt66=4;
                }
                break;
            case 136:
                {
                alt66=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalCONFIG.g:7422:3: (enumLiteral_0= 'SpW' )
                    {
                    // InternalCONFIG.g:7422:3: (enumLiteral_0= 'SpW' )
                    // InternalCONFIG.g:7423:4: enumLiteral_0= 'SpW'
                    {
                    enumLiteral_0=(Token)match(input,134,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7430:3: (enumLiteral_1= 'SpW_TC' )
                    {
                    // InternalCONFIG.g:7430:3: (enumLiteral_1= 'SpW_TC' )
                    // InternalCONFIG.g:7431:4: enumLiteral_1= 'SpW_TC'
                    {
                    enumLiteral_1=(Token)match(input,138,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7438:3: (enumLiteral_2= 'SpW_Error' )
                    {
                    // InternalCONFIG.g:7438:3: (enumLiteral_2= 'SpW_Error' )
                    // InternalCONFIG.g:7439:4: enumLiteral_2= 'SpW_Error'
                    {
                    enumLiteral_2=(Token)match(input,139,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCONFIG.g:7446:3: (enumLiteral_3= 'uart' )
                    {
                    // InternalCONFIG.g:7446:3: (enumLiteral_3= 'uart' )
                    // InternalCONFIG.g:7447:4: enumLiteral_3= 'uart'
                    {
                    enumLiteral_3=(Token)match(input,135,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCONFIG.g:7454:3: (enumLiteral_4= 'dummy' )
                    {
                    // InternalCONFIG.g:7454:3: (enumLiteral_4= 'dummy' )
                    // InternalCONFIG.g:7455:4: enumLiteral_4= 'dummy'
                    {
                    enumLiteral_4=(Token)match(input,136,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSConfigInterfaceTypeAccess().getDummyEnumLiteralDeclaration_4());
                      			
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
    // $ANTLR end "ruleGSSConfigInterfaceType"


    // $ANTLR start "ruleGSSConfigInterfaceIOType"
    // InternalCONFIG.g:7465:1: ruleGSSConfigInterfaceIOType returns [Enumerator current=null] : ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleGSSConfigInterfaceIOType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7471:2: ( ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // InternalCONFIG.g:7472:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // InternalCONFIG.g:7472:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt67=1;
                }
                break;
            case 140:
                {
                alt67=2;
                }
                break;
            case 141:
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
                    // InternalCONFIG.g:7473:3: (enumLiteral_0= 'in_out' )
                    {
                    // InternalCONFIG.g:7473:3: (enumLiteral_0= 'in_out' )
                    // InternalCONFIG.g:7474:4: enumLiteral_0= 'in_out'
                    {
                    enumLiteral_0=(Token)match(input,137,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7481:3: (enumLiteral_1= 'in' )
                    {
                    // InternalCONFIG.g:7481:3: (enumLiteral_1= 'in' )
                    // InternalCONFIG.g:7482:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,140,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7489:3: (enumLiteral_2= 'out' )
                    {
                    // InternalCONFIG.g:7489:3: (enumLiteral_2= 'out' )
                    // InternalCONFIG.g:7490:4: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,141,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getOutEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSConfigInterfaceIOType"


    // $ANTLR start "ruleGSSConfigUpperLevelLevel"
    // InternalCONFIG.g:7500:1: ruleGSSConfigUpperLevelLevel returns [Enumerator current=null] : ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) ;
    public final Enumerator ruleGSSConfigUpperLevelLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7506:2: ( ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) )
            // InternalCONFIG.g:7507:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            {
            // InternalCONFIG.g:7507:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 142:
                {
                alt68=1;
                }
                break;
            case 143:
                {
                alt68=2;
                }
                break;
            case 144:
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
                    // InternalCONFIG.g:7508:3: (enumLiteral_0= '_1' )
                    {
                    // InternalCONFIG.g:7508:3: (enumLiteral_0= '_1' )
                    // InternalCONFIG.g:7509:4: enumLiteral_0= '_1'
                    {
                    enumLiteral_0=(Token)match(input,142,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7516:3: (enumLiteral_1= '_2' )
                    {
                    // InternalCONFIG.g:7516:3: (enumLiteral_1= '_2' )
                    // InternalCONFIG.g:7517:4: enumLiteral_1= '_2'
                    {
                    enumLiteral_1=(Token)match(input,143,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7524:3: (enumLiteral_2= '_3' )
                    {
                    // InternalCONFIG.g:7524:3: (enumLiteral_2= '_3' )
                    // InternalCONFIG.g:7525:4: enumLiteral_2= '_3'
                    {
                    enumLiteral_2=(Token)match(input,144,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_3EnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSConfigUpperLevelLevel"


    // $ANTLR start "ruleGSSConfigUnit"
    // InternalCONFIG.g:7535:1: ruleGSSConfigUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) ;
    public final Enumerator ruleGSSConfigUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7541:2: ( ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) )
            // InternalCONFIG.g:7542:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            {
            // InternalCONFIG.g:7542:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==145) ) {
                alt69=1;
            }
            else if ( (LA69_0==146) ) {
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
                    // InternalCONFIG.g:7543:3: (enumLiteral_0= 'miliseconds' )
                    {
                    // InternalCONFIG.g:7543:3: (enumLiteral_0= 'miliseconds' )
                    // InternalCONFIG.g:7544:4: enumLiteral_0= 'miliseconds'
                    {
                    enumLiteral_0=(Token)match(input,145,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7551:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalCONFIG.g:7551:3: (enumLiteral_1= 'seconds' )
                    // InternalCONFIG.g:7552:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,146,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigUnitAccess().getSecondsEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSConfigUnit"


    // $ANTLR start "ruleGSSConfigGlobalVarType"
    // InternalCONFIG.g:7562:1: ruleGSSConfigGlobalVarType returns [Enumerator current=null] : ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) ;
    public final Enumerator ruleGSSConfigGlobalVarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7568:2: ( ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) )
            // InternalCONFIG.g:7569:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
            {
            // InternalCONFIG.g:7569:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==147) ) {
                alt70=1;
            }
            else if ( (LA70_0==148) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalCONFIG.g:7570:3: (enumLiteral_0= 'uint' )
                    {
                    // InternalCONFIG.g:7570:3: (enumLiteral_0= 'uint' )
                    // InternalCONFIG.g:7571:4: enumLiteral_0= 'uint'
                    {
                    enumLiteral_0=(Token)match(input,147,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7578:3: (enumLiteral_1= 'formula' )
                    {
                    // InternalCONFIG.g:7578:3: (enumLiteral_1= 'formula' )
                    // InternalCONFIG.g:7579:4: enumLiteral_1= 'formula'
                    {
                    enumLiteral_1=(Token)match(input,148,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigGlobalVarTypeAccess().getFormulaEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSConfigGlobalVarType"


    // $ANTLR start "ruleGSSConfigReferenceFieldType"
    // InternalCONFIG.g:7589:1: ruleGSSConfigReferenceFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) ;
    public final Enumerator ruleGSSConfigReferenceFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7595:2: ( ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) )
            // InternalCONFIG.g:7596:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
            {
            // InternalCONFIG.g:7596:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==149) ) {
                alt71=1;
            }
            else if ( (LA71_0==150) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalCONFIG.g:7597:3: (enumLiteral_0= 'tm' )
                    {
                    // InternalCONFIG.g:7597:3: (enumLiteral_0= 'tm' )
                    // InternalCONFIG.g:7598:4: enumLiteral_0= 'tm'
                    {
                    enumLiteral_0=(Token)match(input,149,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7605:3: (enumLiteral_1= 'tc' )
                    {
                    // InternalCONFIG.g:7605:3: (enumLiteral_1= 'tc' )
                    // InternalCONFIG.g:7606:4: enumLiteral_1= 'tc'
                    {
                    enumLiteral_1=(Token)match(input,150,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTcEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSConfigReferenceFieldType"


    // $ANTLR start "ruleGSSConfigAlarmMsgType"
    // InternalCONFIG.g:7616:1: ruleGSSConfigAlarmMsgType returns [Enumerator current=null] : ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) ;
    public final Enumerator ruleGSSConfigAlarmMsgType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7622:2: ( ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) )
            // InternalCONFIG.g:7623:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            {
            // InternalCONFIG.g:7623:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 151:
                {
                alt72=1;
                }
                break;
            case 152:
                {
                alt72=2;
                }
                break;
            case 153:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalCONFIG.g:7624:3: (enumLiteral_0= 'alarm1' )
                    {
                    // InternalCONFIG.g:7624:3: (enumLiteral_0= 'alarm1' )
                    // InternalCONFIG.g:7625:4: enumLiteral_0= 'alarm1'
                    {
                    enumLiteral_0=(Token)match(input,151,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7632:3: (enumLiteral_1= 'alarm2' )
                    {
                    // InternalCONFIG.g:7632:3: (enumLiteral_1= 'alarm2' )
                    // InternalCONFIG.g:7633:4: enumLiteral_1= 'alarm2'
                    {
                    enumLiteral_1=(Token)match(input,152,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7640:3: (enumLiteral_2= 'alarm3' )
                    {
                    // InternalCONFIG.g:7640:3: (enumLiteral_2= 'alarm3' )
                    // InternalCONFIG.g:7641:4: enumLiteral_2= 'alarm3'
                    {
                    enumLiteral_2=(Token)match(input,153,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm3EnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSConfigAlarmMsgType"


    // $ANTLR start "ruleGSSConfigModifyType"
    // InternalCONFIG.g:7651:1: ruleGSSConfigModifyType returns [Enumerator current=null] : ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) ;
    public final Enumerator ruleGSSConfigModifyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7657:2: ( ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) )
            // InternalCONFIG.g:7658:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            {
            // InternalCONFIG.g:7658:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==154) ) {
                alt73=1;
            }
            else if ( (LA73_0==155) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalCONFIG.g:7659:3: (enumLiteral_0= 'increment' )
                    {
                    // InternalCONFIG.g:7659:3: (enumLiteral_0= 'increment' )
                    // InternalCONFIG.g:7660:4: enumLiteral_0= 'increment'
                    {
                    enumLiteral_0=(Token)match(input,154,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7667:3: (enumLiteral_1= 'increment1wrap' )
                    {
                    // InternalCONFIG.g:7667:3: (enumLiteral_1= 'increment1wrap' )
                    // InternalCONFIG.g:7668:4: enumLiteral_1= 'increment1wrap'
                    {
                    enumLiteral_1=(Token)match(input,155,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigModifyTypeAccess().getIncrement1wrapEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSConfigModifyType"


    // $ANTLR start "ruleGSSConfigAlarmValType"
    // InternalCONFIG.g:7678:1: ruleGSSConfigAlarmValType returns [Enumerator current=null] : (enumLiteral_0= 'alarm1' ) ;
    public final Enumerator ruleGSSConfigAlarmValType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7684:2: ( (enumLiteral_0= 'alarm1' ) )
            // InternalCONFIG.g:7685:2: (enumLiteral_0= 'alarm1' )
            {
            // InternalCONFIG.g:7685:2: (enumLiteral_0= 'alarm1' )
            // InternalCONFIG.g:7686:3: enumLiteral_0= 'alarm1'
            {
            enumLiteral_0=(Token)match(input,151,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getGSSConfigAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigAlarmValTypeAccess().getAlarm1EnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleGSSConfigAlarmValType"


    // $ANTLR start "ruleGSSConfigReqAction"
    // InternalCONFIG.g:7695:1: ruleGSSConfigReqAction returns [Enumerator current=null] : (enumLiteral_0= '_1' ) ;
    public final Enumerator ruleGSSConfigReqAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7701:2: ( (enumLiteral_0= '_1' ) )
            // InternalCONFIG.g:7702:2: (enumLiteral_0= '_1' )
            {
            // InternalCONFIG.g:7702:2: (enumLiteral_0= '_1' )
            // InternalCONFIG.g:7703:3: enumLiteral_0= '_1'
            {
            enumLiteral_0=(Token)match(input,142,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigReqActionAccess().get_1EnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleGSSConfigReqAction"

    // $ANTLR start synpred2_InternalCONFIG
    public final void synpred2_InternalCONFIG_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalCONFIG.g:245:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalCONFIG.g:245:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalCONFIG.g:245:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalCONFIG.g:246:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalCONFIG", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalCONFIG.g:246:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalCONFIG.g:247:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 0);
        // InternalCONFIG.g:250:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalCONFIG.g:250:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalCONFIG", "true");
        }
        // InternalCONFIG.g:250:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalCONFIG.g:250:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalCONFIG.g:258:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalCONFIG.g:259:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalCONFIG.g:259:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalCONFIG.g:260:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_uri_6_0=ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalCONFIG

    // $ANTLR start synpred3_InternalCONFIG
    public final void synpred3_InternalCONFIG_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalCONFIG.g:287:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalCONFIG.g:287:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalCONFIG.g:287:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalCONFIG.g:288:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalCONFIG", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalCONFIG.g:288:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalCONFIG.g:289:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_3(), 1);
        // InternalCONFIG.g:292:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalCONFIG.g:292:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalCONFIG", "true");
        }
        // InternalCONFIG.g:292:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalCONFIG.g:292:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalCONFIG.g:300:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalCONFIG.g:301:10: (lv_version_10_0= ruleVersion )
        {
        // InternalCONFIG.g:301:10: (lv_version_10_0= ruleVersion )
        // InternalCONFIG.g:302:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalCONFIG

    // $ANTLR start synpred6_InternalCONFIG
    public final void synpred6_InternalCONFIG_fragment() throws RecognitionException {   
        EObject lv_GlobalVars_18_0 = null;


        // InternalCONFIG.g:439:4: ( ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) ) )
        // InternalCONFIG.g:439:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) )
        {
        // InternalCONFIG.g:439:4: ({...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) ) )
        // InternalCONFIG.g:440:5: {...}? => ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalCONFIG", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 0)");
        }
        // InternalCONFIG.g:440:115: ( ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) ) )
        // InternalCONFIG.g:441:6: ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 0);
        // InternalCONFIG.g:444:9: ({...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) ) )
        // InternalCONFIG.g:444:10: {...}? => ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalCONFIG", "true");
        }
        // InternalCONFIG.g:444:19: ( (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars ) )
        // InternalCONFIG.g:444:20: (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars )
        {
        // InternalCONFIG.g:444:20: (lv_GlobalVars_18_0= ruleGSSConfigGlobalVars )
        // InternalCONFIG.g:445:10: lv_GlobalVars_18_0= ruleGSSConfigGlobalVars
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getGlobalVarsGSSConfigGlobalVarsParserRuleCall_9_0_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_GlobalVars_18_0=ruleGSSConfigGlobalVars();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalCONFIG

    // $ANTLR start synpred7_InternalCONFIG
    public final void synpred7_InternalCONFIG_fragment() throws RecognitionException {   
        EObject lv_Monitors_19_0 = null;


        // InternalCONFIG.g:467:4: ( ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) ) )
        // InternalCONFIG.g:467:4: ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) )
        {
        // InternalCONFIG.g:467:4: ({...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) ) )
        // InternalCONFIG.g:468:5: {...}? => ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalCONFIG", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 1)");
        }
        // InternalCONFIG.g:468:115: ( ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) ) )
        // InternalCONFIG.g:469:6: ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSConfigGSSConfigAccess().getUnorderedGroup_9(), 1);
        // InternalCONFIG.g:472:9: ({...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) ) )
        // InternalCONFIG.g:472:10: {...}? => ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalCONFIG", "true");
        }
        // InternalCONFIG.g:472:19: ( (lv_Monitors_19_0= ruleGSSConfigMonitors ) )
        // InternalCONFIG.g:472:20: (lv_Monitors_19_0= ruleGSSConfigMonitors )
        {
        // InternalCONFIG.g:472:20: (lv_Monitors_19_0= ruleGSSConfigMonitors )
        // InternalCONFIG.g:473:10: lv_Monitors_19_0= ruleGSSConfigMonitors
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSConfigGSSConfigAccess().getMonitorsGSSConfigMonitorsParserRuleCall_9_1_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_Monitors_19_0=ruleGSSConfigMonitors();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalCONFIG

    // Delegated rules

    public final boolean synpred6_InternalCONFIG() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCONFIG_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalCONFIG() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCONFIG_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalCONFIG() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCONFIG_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCONFIG() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCONFIG_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000160000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000017800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000200000080000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000080000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L,0x0000000500800000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L,0x0000001000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L,0x000AC00000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008080000L,0x000AC00000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L,0x0100000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020080000L,0x0100000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000000000000C0L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0004000000080000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0280000000080000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000DC0L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003200L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8280000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8280000000080000L,0x0000000000000001L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x6000000000080000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x4000000000080000L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x2000000000080000L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000080000L,0x0000000000004200L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000080000L,0x0000000000080000L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000080000L,0x0000000000200000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000060000L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001C000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x5400000000080000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x5000000000080000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000080000L,0x00000000F0000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000080000L,0x00000000E0000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000080000L,0x00000000C0000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000080000L,0x0000000080000000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000210000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000840000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0000288000000000L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
        public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0090000000000000L});
        public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000003800000L});
        public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000C000000L});
        public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
        public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000080000L,0x0040000000000000L});
        public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
        public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000080000L,0x0C00000000000000L});
        public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000080000L,0x0800000000000000L});
        public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
        public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
        public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
        public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
        public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
        public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000022L,0x1000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000002L});
    }


}