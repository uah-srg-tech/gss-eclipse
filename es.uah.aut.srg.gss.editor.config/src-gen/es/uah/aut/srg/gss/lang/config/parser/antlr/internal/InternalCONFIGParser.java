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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSConfigGSSConfig'", "'{'", "'uri'", "'version'", "'}'", "'GSSConfigGSSOptions'", "'GSSConfigProtocols'", "'GSSConfigInterfaces'", "'GSSConfigSpecialPackets'", "'GSSConfigPeriodicTCs'", "'GSSConfigGlobalVars'", "'GSSConfigMonitors'", "'ChartsFile'", "'GSSConfigTests'", "'ProtocolPacketsFile'", "'GSSConfigGSSInfo'", "'test_campaign'", "'date'", "'version_control_url'", "'GSSConfigGSSInfoPrint'", "'mainLog'", "'portLogs'", "'debugLog'", "'GSSConfigPhyHeaderPrint'", "'gssTabs'", "'GSSConfigGSSDiscardErrorFlags'", "'txErrors'", "'notExpectedPackets'", "'filtersKo'", "'validTimesKo'", "'GSSConfigProtocol'", "'id'", "'name'", "'typeLevel'", "'typeOffset'", "'subtypeOffset'", "'GSSConfigMainInterface'", "'ifType'", "'ifConfig'", "'ioType'", "'protocolID'", "'GSSConfigInterface'", "'GSSConfigLevelInOut'", "'GSSConfigLevelIn'", "'GSSConfigLevelOut'", "'GSSConfigTMFormat'", "'file'", "'GSSConfigTCFormat'", "'GSSConfigInputFilter'", "'GSSConfigExportToPrevLevel'", "'GSSConfigImportFromPrevLevel'", "'GSSConfigSpecialPacket'", "'status'", "'ifRef'", "'levels'", "'levelRef'", "'GSSConfigUpperLevels'", "'GSSConfigPrintingData'", "'printStatus'", "'GSSConfigPeriod'", "'min_value'", "'min_unit'", "'max_value'", "'max_unit'", "'GSSConfigIntervalRange'", "'min'", "'max'", "'interval_value'", "'interval_unit'", "'GSSConfigUpperLevel'", "'level'", "'GSSConfigStructuredData'", "'firstField'", "'GSSConfigPeriodicTCLevel2'", "'period_value'", "'period_unit'", "'GSSConfigPeriodicTCLevel1'", "'GSSConfigPeriodicTCLevel0'", "'GSSConfigLevel2'", "'format'", "'GSSConfigLevel1'", "'GSSConfigLevel0'", "'GSSConfigAppToLevel2'", "'export'", "'GSSConfigAppToLevel1'", "'GSSConfigAppToLevel0'", "'GSSConfigLevel2ToLevel1'", "'GSSConfigLevel1ToLevel0'", "'GSSConfigGlobalVar'", "'type'", "'initial_value'", "'GSSConfigReferenceField'", "'fieldRef'", "'offset'", "'size'", "'GSSConfigReferencePeriodicTC'", "'idRef'", "'GSSConfigReferenceSpecialPacket'", "'GSSConfigPlot'", "'GSSConfigAlarmMsg'", "'text'", "'GSSConfigModify'", "'value'", "'GSSConfigAlarmVal'", "'GSSConfigGVFiltered'", "'GlobalVarRef'", "'filter'", "'GSSConfigGVPeriodic'", "'GSSConfigTestCase'", "'procedure'", "'req'", "'reqAction'", "'.'", "'('", "')'", "'-'", "'/'", "'+'", "'://'", "'disabled'", "'enabled'", "'SpW'", "'uart'", "'dummy'", "'in_out'", "'SpW_TC'", "'SpW_Error'", "'in'", "'out'", "'_1'", "'_2'", "'_3'", "'miliseconds'", "'seconds'", "'uint'", "'formula'", "'tm'", "'tc'", "'alarm1'", "'alarm2'", "'alarm3'", "'increment'", "'increment1wrap'"
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
    // InternalCONFIG.g:709:1: ruleGSSConfigInterfaces returns [EObject current=null] : (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
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
            // InternalCONFIG.g:715:2: ( (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalCONFIG.g:716:2: (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalCONFIG.g:716:2: (otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalCONFIG.g:717:3: otherlv_0= 'GSSConfigInterfaces' otherlv_1= '{' ( (lv_MainInterface_2_0= ruleGSSConfigMainInterface ) ) ( (lv_Interface_3_0= ruleGSSConfigInterface ) )+ otherlv_4= '}' otherlv_5= ';'
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

            // InternalCONFIG.g:744:3: ( (lv_Interface_3_0= ruleGSSConfigInterface ) )+
            int cnt8=0;
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
            	    pushFollow(FollowSets000.FOLLOW_24);
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
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_25); if (state.failed) return current;
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
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCONFIG.g:862:3: ( ( (lv_PeriodicTC_level_2_3_0= ruleGSSConfigPeriodicTCLevel2 ) ) | ( (lv_PeriodicTC_level_1_4_0= ruleGSSConfigPeriodicTCLevel1 ) ) | ( (lv_PeriodicTC_level_0_5_0= ruleGSSConfigPeriodicTCLevel0 ) ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 88:
                    {
                    alt9=1;
                    }
                    break;
                case 91:
                    {
                    alt9=2;
                    }
                    break;
                case 92:
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
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            	    pushFollow(FollowSets000.FOLLOW_26);
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
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGlobalVarsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:958:3: ( (lv_GlobalVar_2_0= ruleGSSConfigGlobalVar ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==103) ) {
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
            	    pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalCONFIG.g:996:1: ruleGSSConfigMonitors returns [EObject current=null] : (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( (lv_ChartsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSConfigMonitors() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ChartsFile_4_0=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_plot_6_0 = null;

        EObject lv_alarmMsg_7_0 = null;

        EObject lv_modify_8_0 = null;

        EObject lv_alarmVal_9_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:1002:2: ( (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( (lv_ChartsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCONFIG.g:1003:2: (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( (lv_ChartsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCONFIG.g:1003:2: (otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( (lv_ChartsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';' )
            // InternalCONFIG.g:1004:3: otherlv_0= 'GSSConfigMonitors' otherlv_1= '{' (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( (lv_ChartsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+ otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigMonitorsAccess().getGSSConfigMonitorsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigMonitorsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:1012:3: (otherlv_2= 'ChartsFile' otherlv_3= ':=' ( (lv_ChartsFile_4_0= RULE_ID ) ) otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCONFIG.g:1013:4: otherlv_2= 'ChartsFile' otherlv_3= ':=' ( (lv_ChartsFile_4_0= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGSSConfigMonitorsAccess().getChartsFileKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGSSConfigMonitorsAccess().getColonEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalCONFIG.g:1021:4: ( (lv_ChartsFile_4_0= RULE_ID ) )
                    // InternalCONFIG.g:1022:5: (lv_ChartsFile_4_0= RULE_ID )
                    {
                    // InternalCONFIG.g:1022:5: (lv_ChartsFile_4_0= RULE_ID )
                    // InternalCONFIG.g:1023:6: lv_ChartsFile_4_0= RULE_ID
                    {
                    lv_ChartsFile_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ChartsFile_4_0, grammarAccess.getGSSConfigMonitorsAccess().getChartsFileIDTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigMonitorsRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"ChartsFile",
                      							lv_ChartsFile_4_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSConfigMonitorsAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:1044:3: ( ( (lv_plot_6_0= ruleGSSConfigPlot ) ) | ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) ) | ( (lv_modify_8_0= ruleGSSConfigModify ) ) | ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=5;
                switch ( input.LA(1) ) {
                case 113:
                    {
                    alt12=1;
                    }
                    break;
                case 114:
                    {
                    alt12=2;
                    }
                    break;
                case 116:
                    {
                    alt12=3;
                    }
                    break;
                case 118:
                    {
                    alt12=4;
                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // InternalCONFIG.g:1045:4: ( (lv_plot_6_0= ruleGSSConfigPlot ) )
            	    {
            	    // InternalCONFIG.g:1045:4: ( (lv_plot_6_0= ruleGSSConfigPlot ) )
            	    // InternalCONFIG.g:1046:5: (lv_plot_6_0= ruleGSSConfigPlot )
            	    {
            	    // InternalCONFIG.g:1046:5: (lv_plot_6_0= ruleGSSConfigPlot )
            	    // InternalCONFIG.g:1047:6: lv_plot_6_0= ruleGSSConfigPlot
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getPlotGSSConfigPlotParserRuleCall_3_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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
            	    // InternalCONFIG.g:1065:4: ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) )
            	    {
            	    // InternalCONFIG.g:1065:4: ( (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg ) )
            	    // InternalCONFIG.g:1066:5: (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg )
            	    {
            	    // InternalCONFIG.g:1066:5: (lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg )
            	    // InternalCONFIG.g:1067:6: lv_alarmMsg_7_0= ruleGSSConfigAlarmMsg
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getAlarmMsgGSSConfigAlarmMsgParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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
            	    // InternalCONFIG.g:1085:4: ( (lv_modify_8_0= ruleGSSConfigModify ) )
            	    {
            	    // InternalCONFIG.g:1085:4: ( (lv_modify_8_0= ruleGSSConfigModify ) )
            	    // InternalCONFIG.g:1086:5: (lv_modify_8_0= ruleGSSConfigModify )
            	    {
            	    // InternalCONFIG.g:1086:5: (lv_modify_8_0= ruleGSSConfigModify )
            	    // InternalCONFIG.g:1087:6: lv_modify_8_0= ruleGSSConfigModify
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getModifyGSSConfigModifyParserRuleCall_3_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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
            	    // InternalCONFIG.g:1105:4: ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) )
            	    {
            	    // InternalCONFIG.g:1105:4: ( (lv_alarmVal_9_0= ruleGSSConfigAlarmVal ) )
            	    // InternalCONFIG.g:1106:5: (lv_alarmVal_9_0= ruleGSSConfigAlarmVal )
            	    {
            	    // InternalCONFIG.g:1106:5: (lv_alarmVal_9_0= ruleGSSConfigAlarmVal )
            	    // InternalCONFIG.g:1107:6: lv_alarmVal_9_0= ruleGSSConfigAlarmVal
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigMonitorsAccess().getAlarmValGSSConfigAlarmValParserRuleCall_3_3_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalCONFIG.g:1137:1: entryRuleGSSConfigTests returns [EObject current=null] : iv_ruleGSSConfigTests= ruleGSSConfigTests EOF ;
    public final EObject entryRuleGSSConfigTests() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigTests = null;


        try {
            // InternalCONFIG.g:1137:55: (iv_ruleGSSConfigTests= ruleGSSConfigTests EOF )
            // InternalCONFIG.g:1138:2: iv_ruleGSSConfigTests= ruleGSSConfigTests EOF
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
    // InternalCONFIG.g:1144:1: ruleGSSConfigTests returns [EObject current=null] : (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSConfigTests() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ProtocolPacketsFile_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_TestCase_6_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:1150:2: ( (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalCONFIG.g:1151:2: (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalCONFIG.g:1151:2: (otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalCONFIG.g:1152:3: otherlv_0= 'GSSConfigTests' otherlv_1= '{' (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) ) otherlv_5= ';' )? ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestsAccess().getGSSConfigTestsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:1160:3: (otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) ) otherlv_5= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCONFIG.g:1161:4: otherlv_2= 'ProtocolPacketsFile' otherlv_3= ':=' ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestsAccess().getColonEqualsSignKeyword_2_1());
                      			
                    }
                    // InternalCONFIG.g:1169:4: ( (lv_ProtocolPacketsFile_4_0= RULE_ID ) )
                    // InternalCONFIG.g:1170:5: (lv_ProtocolPacketsFile_4_0= RULE_ID )
                    {
                    // InternalCONFIG.g:1170:5: (lv_ProtocolPacketsFile_4_0= RULE_ID )
                    // InternalCONFIG.g:1171:6: lv_ProtocolPacketsFile_4_0= RULE_ID
                    {
                    lv_ProtocolPacketsFile_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ProtocolPacketsFile_4_0, grammarAccess.getGSSConfigTestsAccess().getProtocolPacketsFileIDTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSConfigTestsRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"ProtocolPacketsFile",
                      							lv_ProtocolPacketsFile_4_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getGSSConfigTestsAccess().getSemicolonKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalCONFIG.g:1192:3: ( (lv_TestCase_6_0= ruleGSSConfigTestCase ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==123) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCONFIG.g:1193:4: (lv_TestCase_6_0= ruleGSSConfigTestCase )
            	    {
            	    // InternalCONFIG.g:1193:4: (lv_TestCase_6_0= ruleGSSConfigTestCase )
            	    // InternalCONFIG.g:1194:5: lv_TestCase_6_0= ruleGSSConfigTestCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigTestsAccess().getTestCaseGSSConfigTestCaseParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalCONFIG.g:1223:1: entryRuleGSSConfigGSSInfo returns [EObject current=null] : iv_ruleGSSConfigGSSInfo= ruleGSSConfigGSSInfo EOF ;
    public final EObject entryRuleGSSConfigGSSInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSInfo = null;


        try {
            // InternalCONFIG.g:1223:57: (iv_ruleGSSConfigGSSInfo= ruleGSSConfigGSSInfo EOF )
            // InternalCONFIG.g:1224:2: iv_ruleGSSConfigGSSInfo= ruleGSSConfigGSSInfo EOF
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
    // InternalCONFIG.g:1230:1: ruleGSSConfigGSSInfo returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
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
            // InternalCONFIG.g:1236:2: ( (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:1237:2: (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:1237:2: (otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:1238:3: otherlv_0= 'GSSConfigGSSInfo' otherlv_1= '{' otherlv_2= 'test_campaign' otherlv_3= ':=' ( (lv_test_campaign_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'version' otherlv_7= ':=' ( (lv_version_8_0= ruleVersion ) ) otherlv_9= ';' otherlv_10= 'date' otherlv_11= ':=' ( (lv_date_12_0= ruleDATE ) ) otherlv_13= ';' (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSInfoAccess().getGSSConfigGSSInfoKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSInfoAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1254:3: ( (lv_test_campaign_4_0= RULE_ID ) )
            // InternalCONFIG.g:1255:4: (lv_test_campaign_4_0= RULE_ID )
            {
            // InternalCONFIG.g:1255:4: (lv_test_campaign_4_0= RULE_ID )
            // InternalCONFIG.g:1256:5: lv_test_campaign_4_0= RULE_ID
            {
            lv_test_campaign_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_test_campaign_4_0, grammarAccess.getGSSConfigGSSInfoAccess().getTest_campaignIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigGSSInfoRule());
              					}
              					setWithLastConsumed(
              						current,
              						"test_campaign",
              						lv_test_campaign_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
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
            // InternalCONFIG.g:1284:3: ( (lv_version_8_0= ruleVersion ) )
            // InternalCONFIG.g:1285:4: (lv_version_8_0= ruleVersion )
            {
            // InternalCONFIG.g:1285:4: (lv_version_8_0= ruleVersion )
            // InternalCONFIG.g:1286:5: lv_version_8_0= ruleVersion
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,32,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSInfoAccess().getDateKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1315:3: ( (lv_date_12_0= ruleDATE ) )
            // InternalCONFIG.g:1316:4: (lv_date_12_0= ruleDATE )
            {
            // InternalCONFIG.g:1316:4: (lv_date_12_0= ruleDATE )
            // InternalCONFIG.g:1317:5: lv_date_12_0= ruleDATE
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSInfoAccess().getSemicolonKeyword_13());
              		
            }
            // InternalCONFIG.g:1338:3: (otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCONFIG.g:1339:4: otherlv_14= 'version_control_url' otherlv_15= ':=' ( (lv_version_control_url_16_0= ruleURL ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,33,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSInfoAccess().getVersion_control_urlKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSInfoAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalCONFIG.g:1347:4: ( (lv_version_control_url_16_0= ruleURL ) )
                    // InternalCONFIG.g:1348:5: (lv_version_control_url_16_0= ruleURL )
                    {
                    // InternalCONFIG.g:1348:5: (lv_version_control_url_16_0= ruleURL )
                    // InternalCONFIG.g:1349:6: lv_version_control_url_16_0= ruleURL
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
    // InternalCONFIG.g:1383:1: entryRuleGSSConfigGSSInfoPrint returns [EObject current=null] : iv_ruleGSSConfigGSSInfoPrint= ruleGSSConfigGSSInfoPrint EOF ;
    public final EObject entryRuleGSSConfigGSSInfoPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSInfoPrint = null;


        try {
            // InternalCONFIG.g:1383:62: (iv_ruleGSSConfigGSSInfoPrint= ruleGSSConfigGSSInfoPrint EOF )
            // InternalCONFIG.g:1384:2: iv_ruleGSSConfigGSSInfoPrint= ruleGSSConfigGSSInfoPrint EOF
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
    // InternalCONFIG.g:1390:1: ruleGSSConfigGSSInfoPrint returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
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
            // InternalCONFIG.g:1396:2: ( (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalCONFIG.g:1397:2: (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalCONFIG.g:1397:2: (otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalCONFIG.g:1398:3: otherlv_0= 'GSSConfigGSSInfoPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSInfoPrintAccess().getGSSConfigGSSInfoPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSInfoPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSInfoPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1414:3: ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1415:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1415:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1416:5: lv_mainLog_4_0= ruleGSSConfigEnableDisable
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSInfoPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1445:3: ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1446:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1446:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1447:5: lv_portLogs_8_0= ruleGSSConfigEnableDisable
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSInfoPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSInfoPrintAccess().getDebugLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSInfoPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1476:3: ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1477:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1477:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1478:5: lv_debugLog_12_0= ruleGSSConfigEnableDisable
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
    // InternalCONFIG.g:1511:1: entryRuleGSSConfigPhyHeaderPrint returns [EObject current=null] : iv_ruleGSSConfigPhyHeaderPrint= ruleGSSConfigPhyHeaderPrint EOF ;
    public final EObject entryRuleGSSConfigPhyHeaderPrint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPhyHeaderPrint = null;


        try {
            // InternalCONFIG.g:1511:64: (iv_ruleGSSConfigPhyHeaderPrint= ruleGSSConfigPhyHeaderPrint EOF )
            // InternalCONFIG.g:1512:2: iv_ruleGSSConfigPhyHeaderPrint= ruleGSSConfigPhyHeaderPrint EOF
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
    // InternalCONFIG.g:1518:1: ruleGSSConfigPhyHeaderPrint returns [EObject current=null] : (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
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
            // InternalCONFIG.g:1524:2: ( (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:1525:2: (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:1525:2: (otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:1526:3: otherlv_0= 'GSSConfigPhyHeaderPrint' otherlv_1= '{' otherlv_2= 'mainLog' otherlv_3= ':=' ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'portLogs' otherlv_7= ':=' ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'debugLog' otherlv_11= ':=' ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'gssTabs' otherlv_15= ':=' ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGSSConfigPhyHeaderPrintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getMainLogKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1542:3: ( (lv_mainLog_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1543:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1543:4: (lv_mainLog_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1544:5: lv_mainLog_4_0= ruleGSSConfigEnableDisable
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getPortLogsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1573:3: ( (lv_portLogs_8_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1574:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1574:4: (lv_portLogs_8_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1575:5: lv_portLogs_8_0= ruleGSSConfigEnableDisable
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getDebugLogKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1604:3: ( (lv_debugLog_12_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1605:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1605:4: (lv_debugLog_12_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1606:5: lv_debugLog_12_0= ruleGSSConfigEnableDisable
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getGssTabsKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPhyHeaderPrintAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:1635:3: ( (lv_gssTabs_16_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1636:4: (lv_gssTabs_16_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1636:4: (lv_gssTabs_16_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1637:5: lv_gssTabs_16_0= ruleGSSConfigEnableDisable
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
    // InternalCONFIG.g:1670:1: entryRuleGSSConfigGSSDiscardErrorFlags returns [EObject current=null] : iv_ruleGSSConfigGSSDiscardErrorFlags= ruleGSSConfigGSSDiscardErrorFlags EOF ;
    public final EObject entryRuleGSSConfigGSSDiscardErrorFlags() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGSSDiscardErrorFlags = null;


        try {
            // InternalCONFIG.g:1670:70: (iv_ruleGSSConfigGSSDiscardErrorFlags= ruleGSSConfigGSSDiscardErrorFlags EOF )
            // InternalCONFIG.g:1671:2: iv_ruleGSSConfigGSSDiscardErrorFlags= ruleGSSConfigGSSDiscardErrorFlags EOF
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
    // InternalCONFIG.g:1677:1: ruleGSSConfigGSSDiscardErrorFlags returns [EObject current=null] : (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
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
            // InternalCONFIG.g:1683:2: ( (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:1684:2: (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:1684:2: (otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:1685:3: otherlv_0= 'GSSConfigGSSDiscardErrorFlags' otherlv_1= '{' otherlv_2= 'txErrors' otherlv_3= ':=' ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'notExpectedPackets' otherlv_7= ':=' ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) ) otherlv_9= ';' otherlv_10= 'filtersKo' otherlv_11= ':=' ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) ) otherlv_13= ';' otherlv_14= 'validTimesKo' otherlv_15= ':=' ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getGSSConfigGSSDiscardErrorFlagsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getTxErrorsKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1701:3: ( (lv_txErrors_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1702:4: (lv_txErrors_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1702:4: (lv_txErrors_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1703:5: lv_txErrors_4_0= ruleGSSConfigEnableDisable
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getNotExpectedPacketsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:1732:3: ( (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1733:4: (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1733:4: (lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1734:5: lv_notExpectedPackets_8_0= ruleGSSConfigEnableDisable
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getFiltersKoKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1763:3: ( (lv_filtersKo_12_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1764:4: (lv_filtersKo_12_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1764:4: (lv_filtersKo_12_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1765:5: lv_filtersKo_12_0= ruleGSSConfigEnableDisable
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,44,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getValidTimesKoKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGSSDiscardErrorFlagsAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:1794:3: ( (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:1795:4: (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:1795:4: (lv_validTimesKo_16_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:1796:5: lv_validTimesKo_16_0= ruleGSSConfigEnableDisable
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
    // InternalCONFIG.g:1829:1: entryRuleGSSConfigProtocol returns [EObject current=null] : iv_ruleGSSConfigProtocol= ruleGSSConfigProtocol EOF ;
    public final EObject entryRuleGSSConfigProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigProtocol = null;


        try {
            // InternalCONFIG.g:1829:58: (iv_ruleGSSConfigProtocol= ruleGSSConfigProtocol EOF )
            // InternalCONFIG.g:1830:2: iv_ruleGSSConfigProtocol= ruleGSSConfigProtocol EOF
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
    // InternalCONFIG.g:1836:1: ruleGSSConfigProtocol returns [EObject current=null] : (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalCONFIG.g:1842:2: ( (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalCONFIG.g:1843:2: (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalCONFIG.g:1843:2: (otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalCONFIG.g:1844:3: otherlv_0= 'GSSConfigProtocol' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'typeLevel' otherlv_11= ':=' ( (lv_typeLevel_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'typeOffset' otherlv_15= ':=' ( (lv_typeOffset_16_0= ruleINTEGER ) ) otherlv_17= ';' (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigProtocolAccess().getGSSConfigProtocolKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigProtocolAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigProtocolAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:1860:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:1861:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:1861:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:1862:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
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
            // InternalCONFIG.g:1891:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:1892:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:1892:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:1893:5: lv_name_8_0= RULE_ID
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,48,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigProtocolAccess().getTypeLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:1921:3: ( (lv_typeLevel_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:1922:4: (lv_typeLevel_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:1922:4: (lv_typeLevel_12_0= ruleINTEGER )
            // InternalCONFIG.g:1923:5: lv_typeLevel_12_0= ruleINTEGER
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigProtocolAccess().getTypeOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:1952:3: ( (lv_typeOffset_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:1953:4: (lv_typeOffset_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:1953:4: (lv_typeOffset_16_0= ruleINTEGER )
            // InternalCONFIG.g:1954:5: lv_typeOffset_16_0= ruleINTEGER
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigProtocolAccess().getSemicolonKeyword_17());
              		
            }
            // InternalCONFIG.g:1975:3: (otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCONFIG.g:1976:4: otherlv_18= 'subtypeOffset' otherlv_19= ':=' ( (lv_subtypeOffset_20_0= ruleINTEGER ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSConfigProtocolAccess().getSubtypeOffsetKeyword_18_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSConfigProtocolAccess().getColonEqualsSignKeyword_18_1());
                      			
                    }
                    // InternalCONFIG.g:1984:4: ( (lv_subtypeOffset_20_0= ruleINTEGER ) )
                    // InternalCONFIG.g:1985:5: (lv_subtypeOffset_20_0= ruleINTEGER )
                    {
                    // InternalCONFIG.g:1985:5: (lv_subtypeOffset_20_0= ruleINTEGER )
                    // InternalCONFIG.g:1986:6: lv_subtypeOffset_20_0= ruleINTEGER
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
    // InternalCONFIG.g:2020:1: entryRuleGSSConfigMainInterface returns [EObject current=null] : iv_ruleGSSConfigMainInterface= ruleGSSConfigMainInterface EOF ;
    public final EObject entryRuleGSSConfigMainInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigMainInterface = null;


        try {
            // InternalCONFIG.g:2020:63: (iv_ruleGSSConfigMainInterface= ruleGSSConfigMainInterface EOF )
            // InternalCONFIG.g:2021:2: iv_ruleGSSConfigMainInterface= ruleGSSConfigMainInterface EOF
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
    // InternalCONFIG.g:2027:1: ruleGSSConfigMainInterface returns [EObject current=null] : (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )+ otherlv_26= '}' otherlv_27= ';' ) ;
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
        Token lv_ifConfig_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_ifType_12_0 = null;

        Enumerator lv_ioType_20_0 = null;

        AntlrDatatypeRuleToken lv_protocolID_24_0 = null;

        EObject lv_LevelInOut_25_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:2033:2: ( (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )+ otherlv_26= '}' otherlv_27= ';' ) )
            // InternalCONFIG.g:2034:2: (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )+ otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalCONFIG.g:2034:2: (otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )+ otherlv_26= '}' otherlv_27= ';' )
            // InternalCONFIG.g:2035:3: otherlv_0= 'GSSConfigMainInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )+ otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigMainInterfaceAccess().getGSSConfigMainInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigMainInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigMainInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2051:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2052:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2052:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2053:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigMainInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2082:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:2083:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:2083:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:2084:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigMainInterfaceAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigMainInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:2112:3: ( (lv_ifType_12_0= ruleGSSConfigMainInterfaceType ) )
            // InternalCONFIG.g:2113:4: (lv_ifType_12_0= ruleGSSConfigMainInterfaceType )
            {
            // InternalCONFIG.g:2113:4: (lv_ifType_12_0= ruleGSSConfigMainInterfaceType )
            // InternalCONFIG.g:2114:5: lv_ifType_12_0= ruleGSSConfigMainInterfaceType
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
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
            // InternalCONFIG.g:2143:3: ( (lv_ifConfig_16_0= RULE_ID ) )
            // InternalCONFIG.g:2144:4: (lv_ifConfig_16_0= RULE_ID )
            {
            // InternalCONFIG.g:2144:4: (lv_ifConfig_16_0= RULE_ID )
            // InternalCONFIG.g:2145:5: lv_ifConfig_16_0= RULE_ID
            {
            lv_ifConfig_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ifConfig_16_0, grammarAccess.getGSSConfigMainInterfaceAccess().getIfConfigIDTerminalRuleCall_16_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigMainInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"ifConfig",
              						lv_ifConfig_16_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigMainInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:2173:3: ( (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType ) )
            // InternalCONFIG.g:2174:4: (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType )
            {
            // InternalCONFIG.g:2174:4: (lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType )
            // InternalCONFIG.g:2175:5: lv_ioType_20_0= ruleGSSConfigMainInterfaceIOType
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:2196:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==55) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCONFIG.g:2197:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) )
                    {
                    otherlv_22=(Token)match(input,55,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigMainInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:2205:4: ( (lv_protocolID_24_0= ruleINTEGER ) )
                    // InternalCONFIG.g:2206:5: (lv_protocolID_24_0= ruleINTEGER )
                    {
                    // InternalCONFIG.g:2206:5: (lv_protocolID_24_0= ruleINTEGER )
                    // InternalCONFIG.g:2207:6: lv_protocolID_24_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getProtocolIDINTEGERParserRuleCall_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_58);
                    lv_protocolID_24_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
                      						}
                      						set(
                      							current,
                      							"protocolID",
                      							lv_protocolID_24_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCONFIG.g:2225:3: ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )+
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
            	    // InternalCONFIG.g:2226:4: (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut )
            	    {
            	    // InternalCONFIG.g:2226:4: (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut )
            	    // InternalCONFIG.g:2227:5: lv_LevelInOut_25_0= ruleGSSConfigLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigMainInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_59);
            	    lv_LevelInOut_25_0=ruleGSSConfigLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSConfigMainInterfaceRule());
            	      					}
            	      					add(
            	      						current,
            	      						"LevelInOut",
            	      						lv_LevelInOut_25_0,
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

            otherlv_26=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSConfigMainInterfaceAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigMainInterfaceAccess().getSemicolonKeyword_25());
              		
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
    // InternalCONFIG.g:2256:1: entryRuleGSSConfigInterface returns [EObject current=null] : iv_ruleGSSConfigInterface= ruleGSSConfigInterface EOF ;
    public final EObject entryRuleGSSConfigInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigInterface = null;


        try {
            // InternalCONFIG.g:2256:59: (iv_ruleGSSConfigInterface= ruleGSSConfigInterface EOF )
            // InternalCONFIG.g:2257:2: iv_ruleGSSConfigInterface= ruleGSSConfigInterface EOF
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
    // InternalCONFIG.g:2263:1: ruleGSSConfigInterface returns [EObject current=null] : (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) ) )+ otherlv_28= '}' otherlv_29= ';' ) ;
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
        Token lv_ifConfig_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_ifType_12_0 = null;

        Enumerator lv_ioType_20_0 = null;

        AntlrDatatypeRuleToken lv_protocolID_24_0 = null;

        EObject lv_LevelInOut_25_0 = null;

        EObject lv_LevelIn_26_0 = null;

        EObject lv_LevelOut_27_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:2269:2: ( (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) ) )+ otherlv_28= '}' otherlv_29= ';' ) )
            // InternalCONFIG.g:2270:2: (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) ) )+ otherlv_28= '}' otherlv_29= ';' )
            {
            // InternalCONFIG.g:2270:2: (otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) ) )+ otherlv_28= '}' otherlv_29= ';' )
            // InternalCONFIG.g:2271:3: otherlv_0= 'GSSConfigInterface' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'ifType' otherlv_11= ':=' ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) ) otherlv_13= ';' otherlv_14= 'ifConfig' otherlv_15= ':=' ( (lv_ifConfig_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'ioType' otherlv_19= ':=' ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) ) otherlv_21= ';' (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )? ( ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) ) )+ otherlv_28= '}' otherlv_29= ';'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigInterfaceAccess().getGSSConfigInterfaceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigInterfaceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigInterfaceAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2287:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2288:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2288:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2289:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigInterfaceAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2318:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:2319:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:2319:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:2320:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigInterfaceAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,52,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigInterfaceAccess().getIfTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:2348:3: ( (lv_ifType_12_0= ruleGSSConfigInterfaceType ) )
            // InternalCONFIG.g:2349:4: (lv_ifType_12_0= ruleGSSConfigInterfaceType )
            {
            // InternalCONFIG.g:2349:4: (lv_ifType_12_0= ruleGSSConfigInterfaceType )
            // InternalCONFIG.g:2350:5: lv_ifType_12_0= ruleGSSConfigInterfaceType
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_55); if (state.failed) return current;
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
            // InternalCONFIG.g:2379:3: ( (lv_ifConfig_16_0= RULE_ID ) )
            // InternalCONFIG.g:2380:4: (lv_ifConfig_16_0= RULE_ID )
            {
            // InternalCONFIG.g:2380:4: (lv_ifConfig_16_0= RULE_ID )
            // InternalCONFIG.g:2381:5: lv_ifConfig_16_0= RULE_ID
            {
            lv_ifConfig_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ifConfig_16_0, grammarAccess.getGSSConfigInterfaceAccess().getIfConfigIDTerminalRuleCall_16_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigInterfaceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"ifConfig",
              						lv_ifConfig_16_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,54,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigInterfaceAccess().getIoTypeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:2409:3: ( (lv_ioType_20_0= ruleGSSConfigInterfaceIOType ) )
            // InternalCONFIG.g:2410:4: (lv_ioType_20_0= ruleGSSConfigInterfaceIOType )
            {
            // InternalCONFIG.g:2410:4: (lv_ioType_20_0= ruleGSSConfigInterfaceIOType )
            // InternalCONFIG.g:2411:5: lv_ioType_20_0= ruleGSSConfigInterfaceIOType
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:2432:3: (otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==55) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCONFIG.g:2433:4: otherlv_22= 'protocolID' otherlv_23= ':=' ( (lv_protocolID_24_0= ruleINTEGER ) )
                    {
                    otherlv_22=(Token)match(input,55,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDKeyword_22_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSConfigInterfaceAccess().getColonEqualsSignKeyword_22_1());
                      			
                    }
                    // InternalCONFIG.g:2441:4: ( (lv_protocolID_24_0= ruleINTEGER ) )
                    // InternalCONFIG.g:2442:5: (lv_protocolID_24_0= ruleINTEGER )
                    {
                    // InternalCONFIG.g:2442:5: (lv_protocolID_24_0= ruleINTEGER )
                    // InternalCONFIG.g:2443:6: lv_protocolID_24_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getProtocolIDINTEGERParserRuleCall_22_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_62);
                    lv_protocolID_24_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
                      						}
                      						set(
                      							current,
                      							"protocolID",
                      							lv_protocolID_24_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCONFIG.g:2461:3: ( ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) ) | ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) ) | ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) ) )+
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
                case 58:
                    {
                    alt20=2;
                    }
                    break;
                case 59:
                    {
                    alt20=3;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalCONFIG.g:2462:4: ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )
            	    {
            	    // InternalCONFIG.g:2462:4: ( (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut ) )
            	    // InternalCONFIG.g:2463:5: (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut )
            	    {
            	    // InternalCONFIG.g:2463:5: (lv_LevelInOut_25_0= ruleGSSConfigLevelInOut )
            	    // InternalCONFIG.g:2464:6: lv_LevelInOut_25_0= ruleGSSConfigLevelInOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelInOutGSSConfigLevelInOutParserRuleCall_23_0_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_LevelInOut_25_0=ruleGSSConfigLevelInOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelInOut",
            	      							lv_LevelInOut_25_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelInOut");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCONFIG.g:2482:4: ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) )
            	    {
            	    // InternalCONFIG.g:2482:4: ( (lv_LevelIn_26_0= ruleGSSConfigLevelIn ) )
            	    // InternalCONFIG.g:2483:5: (lv_LevelIn_26_0= ruleGSSConfigLevelIn )
            	    {
            	    // InternalCONFIG.g:2483:5: (lv_LevelIn_26_0= ruleGSSConfigLevelIn )
            	    // InternalCONFIG.g:2484:6: lv_LevelIn_26_0= ruleGSSConfigLevelIn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelInGSSConfigLevelInParserRuleCall_23_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_LevelIn_26_0=ruleGSSConfigLevelIn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelIn",
            	      							lv_LevelIn_26_0,
            	      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevelIn");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCONFIG.g:2502:4: ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) )
            	    {
            	    // InternalCONFIG.g:2502:4: ( (lv_LevelOut_27_0= ruleGSSConfigLevelOut ) )
            	    // InternalCONFIG.g:2503:5: (lv_LevelOut_27_0= ruleGSSConfigLevelOut )
            	    {
            	    // InternalCONFIG.g:2503:5: (lv_LevelOut_27_0= ruleGSSConfigLevelOut )
            	    // InternalCONFIG.g:2504:6: lv_LevelOut_27_0= ruleGSSConfigLevelOut
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getGSSConfigInterfaceAccess().getLevelOutGSSConfigLevelOutParserRuleCall_23_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_63);
            	    lv_LevelOut_27_0=ruleGSSConfigLevelOut();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getGSSConfigInterfaceRule());
            	      						}
            	      						add(
            	      							current,
            	      							"LevelOut",
            	      							lv_LevelOut_27_0,
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

            otherlv_28=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getGSSConfigInterfaceAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSConfigInterfaceAccess().getSemicolonKeyword_25());
              		
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
    // InternalCONFIG.g:2534:1: entryRuleGSSConfigLevelInOut returns [EObject current=null] : iv_ruleGSSConfigLevelInOut= ruleGSSConfigLevelInOut EOF ;
    public final EObject entryRuleGSSConfigLevelInOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevelInOut = null;


        try {
            // InternalCONFIG.g:2534:60: (iv_ruleGSSConfigLevelInOut= ruleGSSConfigLevelInOut EOF )
            // InternalCONFIG.g:2535:2: iv_ruleGSSConfigLevelInOut= ruleGSSConfigLevelInOut EOF
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
    // InternalCONFIG.g:2541:1: ruleGSSConfigLevelInOut returns [EObject current=null] : (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_TCformat_11_0= ruleGSSConfigTCFormat ) ) ( (lv_inputFilter_12_0= ruleGSSConfigInputFilter ) ) ( (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel ) )? ( (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_15= '}' otherlv_16= ';' ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_TMformat_10_0 = null;

        EObject lv_TCformat_11_0 = null;

        EObject lv_inputFilter_12_0 = null;

        EObject lv_export_to_prev_Level_13_0 = null;

        EObject lv_import_from_prev_Level_14_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:2547:2: ( (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_TCformat_11_0= ruleGSSConfigTCFormat ) ) ( (lv_inputFilter_12_0= ruleGSSConfigInputFilter ) ) ( (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel ) )? ( (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_15= '}' otherlv_16= ';' ) )
            // InternalCONFIG.g:2548:2: (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_TCformat_11_0= ruleGSSConfigTCFormat ) ) ( (lv_inputFilter_12_0= ruleGSSConfigInputFilter ) ) ( (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel ) )? ( (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalCONFIG.g:2548:2: (otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_TCformat_11_0= ruleGSSConfigTCFormat ) ) ( (lv_inputFilter_12_0= ruleGSSConfigInputFilter ) ) ( (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel ) )? ( (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_15= '}' otherlv_16= ';' )
            // InternalCONFIG.g:2549:3: otherlv_0= 'GSSConfigLevelInOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_TCformat_11_0= ruleGSSConfigTCFormat ) ) ( (lv_inputFilter_12_0= ruleGSSConfigInputFilter ) ) ( (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel ) )? ( (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelInOutAccess().getGSSConfigLevelInOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelInOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelInOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2565:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2566:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2566:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2567:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelInOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelInOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2596:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:2597:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:2597:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:2598:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelInOutAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_9());
              		
            }
            // InternalCONFIG.g:2618:3: ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) )
            // InternalCONFIG.g:2619:4: (lv_TMformat_10_0= ruleGSSConfigTMFormat )
            {
            // InternalCONFIG.g:2619:4: (lv_TMformat_10_0= ruleGSSConfigTMFormat )
            // InternalCONFIG.g:2620:5: lv_TMformat_10_0= ruleGSSConfigTMFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getTMformatGSSConfigTMFormatParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_65);
            lv_TMformat_10_0=ruleGSSConfigTMFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              					set(
              						current,
              						"TMformat",
              						lv_TMformat_10_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTMFormat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:2637:3: ( (lv_TCformat_11_0= ruleGSSConfigTCFormat ) )
            // InternalCONFIG.g:2638:4: (lv_TCformat_11_0= ruleGSSConfigTCFormat )
            {
            // InternalCONFIG.g:2638:4: (lv_TCformat_11_0= ruleGSSConfigTCFormat )
            // InternalCONFIG.g:2639:5: lv_TCformat_11_0= ruleGSSConfigTCFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getTCformatGSSConfigTCFormatParserRuleCall_11_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_66);
            lv_TCformat_11_0=ruleGSSConfigTCFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              					set(
              						current,
              						"TCformat",
              						lv_TCformat_11_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTCFormat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:2656:3: ( (lv_inputFilter_12_0= ruleGSSConfigInputFilter ) )
            // InternalCONFIG.g:2657:4: (lv_inputFilter_12_0= ruleGSSConfigInputFilter )
            {
            // InternalCONFIG.g:2657:4: (lv_inputFilter_12_0= ruleGSSConfigInputFilter )
            // InternalCONFIG.g:2658:5: lv_inputFilter_12_0= ruleGSSConfigInputFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getInputFilterGSSConfigInputFilterParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_67);
            lv_inputFilter_12_0=ruleGSSConfigInputFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInOutRule());
              					}
              					set(
              						current,
              						"inputFilter",
              						lv_inputFilter_12_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInputFilter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:2675:3: ( (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==64) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCONFIG.g:2676:4: (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel )
                    {
                    // InternalCONFIG.g:2676:4: (lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel )
                    // InternalCONFIG.g:2677:5: lv_export_to_prev_Level_13_0= ruleGSSConfigExportToPrevLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getExport_to_prev_LevelGSSConfigExportToPrevLevelParserRuleCall_13_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_export_to_prev_Level_13_0=ruleGSSConfigExportToPrevLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInOutRule());
                      					}
                      					set(
                      						current,
                      						"export_to_prev_Level",
                      						lv_export_to_prev_Level_13_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigExportToPrevLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCONFIG.g:2694:3: ( (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==65) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCONFIG.g:2695:4: (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel )
                    {
                    // InternalCONFIG.g:2695:4: (lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel )
                    // InternalCONFIG.g:2696:5: lv_import_from_prev_Level_14_0= ruleGSSConfigImportFromPrevLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigLevelInOutAccess().getImport_from_prev_LevelGSSConfigImportFromPrevLevelParserRuleCall_14_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_import_from_prev_Level_14_0=ruleGSSConfigImportFromPrevLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInOutRule());
                      					}
                      					set(
                      						current,
                      						"import_from_prev_Level",
                      						lv_import_from_prev_Level_14_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigImportFromPrevLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigLevelInOutAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSConfigLevelInOutAccess().getSemicolonKeyword_16());
              		
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
    // InternalCONFIG.g:2725:1: entryRuleGSSConfigLevelIn returns [EObject current=null] : iv_ruleGSSConfigLevelIn= ruleGSSConfigLevelIn EOF ;
    public final EObject entryRuleGSSConfigLevelIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevelIn = null;


        try {
            // InternalCONFIG.g:2725:57: (iv_ruleGSSConfigLevelIn= ruleGSSConfigLevelIn EOF )
            // InternalCONFIG.g:2726:2: iv_ruleGSSConfigLevelIn= ruleGSSConfigLevelIn EOF
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
    // InternalCONFIG.g:2732:1: ruleGSSConfigLevelIn returns [EObject current=null] : (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TCformat_10_0= ruleGSSConfigTCFormat ) ) ( (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel ) )? otherlv_12= '}' otherlv_13= ';' ) ;
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_TCformat_10_0 = null;

        EObject lv_export_to_prev_Level_11_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:2738:2: ( (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TCformat_10_0= ruleGSSConfigTCFormat ) ) ( (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel ) )? otherlv_12= '}' otherlv_13= ';' ) )
            // InternalCONFIG.g:2739:2: (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TCformat_10_0= ruleGSSConfigTCFormat ) ) ( (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel ) )? otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalCONFIG.g:2739:2: (otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TCformat_10_0= ruleGSSConfigTCFormat ) ) ( (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel ) )? otherlv_12= '}' otherlv_13= ';' )
            // InternalCONFIG.g:2740:3: otherlv_0= 'GSSConfigLevelIn' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TCformat_10_0= ruleGSSConfigTCFormat ) ) ( (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel ) )? otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelInAccess().getGSSConfigLevelInKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelInAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelInAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2756:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2757:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2757:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2758:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelInAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelInAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2787:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:2788:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:2788:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:2789:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelInAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelInRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_9());
              		
            }
            // InternalCONFIG.g:2809:3: ( (lv_TCformat_10_0= ruleGSSConfigTCFormat ) )
            // InternalCONFIG.g:2810:4: (lv_TCformat_10_0= ruleGSSConfigTCFormat )
            {
            // InternalCONFIG.g:2810:4: (lv_TCformat_10_0= ruleGSSConfigTCFormat )
            // InternalCONFIG.g:2811:5: lv_TCformat_10_0= ruleGSSConfigTCFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getTCformatGSSConfigTCFormatParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_69);
            lv_TCformat_10_0=ruleGSSConfigTCFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInRule());
              					}
              					set(
              						current,
              						"TCformat",
              						lv_TCformat_10_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTCFormat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:2828:3: ( (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==64) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCONFIG.g:2829:4: (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel )
                    {
                    // InternalCONFIG.g:2829:4: (lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel )
                    // InternalCONFIG.g:2830:5: lv_export_to_prev_Level_11_0= ruleGSSConfigExportToPrevLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigLevelInAccess().getExport_to_prev_LevelGSSConfigExportToPrevLevelParserRuleCall_11_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_export_to_prev_Level_11_0=ruleGSSConfigExportToPrevLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigLevelInRule());
                      					}
                      					set(
                      						current,
                      						"export_to_prev_Level",
                      						lv_export_to_prev_Level_11_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigExportToPrevLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSConfigLevelInAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelInAccess().getSemicolonKeyword_13());
              		
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
    // InternalCONFIG.g:2859:1: entryRuleGSSConfigLevelOut returns [EObject current=null] : iv_ruleGSSConfigLevelOut= ruleGSSConfigLevelOut EOF ;
    public final EObject entryRuleGSSConfigLevelOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevelOut = null;


        try {
            // InternalCONFIG.g:2859:58: (iv_ruleGSSConfigLevelOut= ruleGSSConfigLevelOut EOF )
            // InternalCONFIG.g:2860:2: iv_ruleGSSConfigLevelOut= ruleGSSConfigLevelOut EOF
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
    // InternalCONFIG.g:2866:1: ruleGSSConfigLevelOut returns [EObject current=null] : (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_11_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_13= '}' otherlv_14= ';' ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_TMformat_10_0 = null;

        EObject lv_inputFilter_11_0 = null;

        EObject lv_import_from_prev_Level_12_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:2872:2: ( (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_11_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_13= '}' otherlv_14= ';' ) )
            // InternalCONFIG.g:2873:2: (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_11_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalCONFIG.g:2873:2: (otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_11_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_13= '}' otherlv_14= ';' )
            // InternalCONFIG.g:2874:3: otherlv_0= 'GSSConfigLevelOut' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_11_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevelOutAccess().getGSSConfigLevelOutKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevelOutAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevelOutAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:2890:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:2891:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:2891:4: (lv_id_4_0= ruleINTEGER )
            // InternalCONFIG.g:2892:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevelOutAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevelOutAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:2921:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:2922:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:2922:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:2923:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigLevelOutAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigLevelOutRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_9());
              		
            }
            // InternalCONFIG.g:2943:3: ( (lv_TMformat_10_0= ruleGSSConfigTMFormat ) )
            // InternalCONFIG.g:2944:4: (lv_TMformat_10_0= ruleGSSConfigTMFormat )
            {
            // InternalCONFIG.g:2944:4: (lv_TMformat_10_0= ruleGSSConfigTMFormat )
            // InternalCONFIG.g:2945:5: lv_TMformat_10_0= ruleGSSConfigTMFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getTMformatGSSConfigTMFormatParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_66);
            lv_TMformat_10_0=ruleGSSConfigTMFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelOutRule());
              					}
              					set(
              						current,
              						"TMformat",
              						lv_TMformat_10_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTMFormat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:2962:3: ( (lv_inputFilter_11_0= ruleGSSConfigInputFilter ) )
            // InternalCONFIG.g:2963:4: (lv_inputFilter_11_0= ruleGSSConfigInputFilter )
            {
            // InternalCONFIG.g:2963:4: (lv_inputFilter_11_0= ruleGSSConfigInputFilter )
            // InternalCONFIG.g:2964:5: lv_inputFilter_11_0= ruleGSSConfigInputFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getInputFilterGSSConfigInputFilterParserRuleCall_11_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_68);
            lv_inputFilter_11_0=ruleGSSConfigInputFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevelOutRule());
              					}
              					set(
              						current,
              						"inputFilter",
              						lv_inputFilter_11_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInputFilter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:2981:3: ( (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==65) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCONFIG.g:2982:4: (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel )
                    {
                    // InternalCONFIG.g:2982:4: (lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel )
                    // InternalCONFIG.g:2983:5: lv_import_from_prev_Level_12_0= ruleGSSConfigImportFromPrevLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigLevelOutAccess().getImport_from_prev_LevelGSSConfigImportFromPrevLevelParserRuleCall_12_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_import_from_prev_Level_12_0=ruleGSSConfigImportFromPrevLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigLevelOutRule());
                      					}
                      					set(
                      						current,
                      						"import_from_prev_Level",
                      						lv_import_from_prev_Level_12_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigImportFromPrevLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigLevelOutAccess().getRightCurlyBracketKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigLevelOutAccess().getSemicolonKeyword_14());
              		
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


    // $ANTLR start "entryRuleGSSConfigTMFormat"
    // InternalCONFIG.g:3012:1: entryRuleGSSConfigTMFormat returns [EObject current=null] : iv_ruleGSSConfigTMFormat= ruleGSSConfigTMFormat EOF ;
    public final EObject entryRuleGSSConfigTMFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigTMFormat = null;


        try {
            // InternalCONFIG.g:3012:58: (iv_ruleGSSConfigTMFormat= ruleGSSConfigTMFormat EOF )
            // InternalCONFIG.g:3013:2: iv_ruleGSSConfigTMFormat= ruleGSSConfigTMFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigTMFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigTMFormat=ruleGSSConfigTMFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigTMFormat; 
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
    // $ANTLR end "entryRuleGSSConfigTMFormat"


    // $ANTLR start "ruleGSSConfigTMFormat"
    // InternalCONFIG.g:3019:1: ruleGSSConfigTMFormat returns [EObject current=null] : (otherlv_0= 'GSSConfigTMFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigTMFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3025:2: ( (otherlv_0= 'GSSConfigTMFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:3026:2: (otherlv_0= 'GSSConfigTMFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:3026:2: (otherlv_0= 'GSSConfigTMFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:3027:3: otherlv_0= 'GSSConfigTMFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTMFormatAccess().getGSSConfigTMFormatKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTMFormatAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigTMFormatAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigTMFormatAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3043:3: ( (lv_file_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:3044:4: (lv_file_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:3044:4: (lv_file_4_0= ruleXMLREF )
            // InternalCONFIG.g:3045:5: lv_file_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigTMFormatAccess().getFileXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_file_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigTMFormatRule());
              					}
              					set(
              						current,
              						"file",
              						lv_file_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigTMFormatAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigTMFormatAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTMFormatAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigTMFormat"


    // $ANTLR start "entryRuleGSSConfigTCFormat"
    // InternalCONFIG.g:3078:1: entryRuleGSSConfigTCFormat returns [EObject current=null] : iv_ruleGSSConfigTCFormat= ruleGSSConfigTCFormat EOF ;
    public final EObject entryRuleGSSConfigTCFormat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigTCFormat = null;


        try {
            // InternalCONFIG.g:3078:58: (iv_ruleGSSConfigTCFormat= ruleGSSConfigTCFormat EOF )
            // InternalCONFIG.g:3079:2: iv_ruleGSSConfigTCFormat= ruleGSSConfigTCFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigTCFormatRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigTCFormat=ruleGSSConfigTCFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigTCFormat; 
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
    // $ANTLR end "entryRuleGSSConfigTCFormat"


    // $ANTLR start "ruleGSSConfigTCFormat"
    // InternalCONFIG.g:3085:1: ruleGSSConfigTCFormat returns [EObject current=null] : (otherlv_0= 'GSSConfigTCFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigTCFormat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3091:2: ( (otherlv_0= 'GSSConfigTCFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:3092:2: (otherlv_0= 'GSSConfigTCFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:3092:2: (otherlv_0= 'GSSConfigTCFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:3093:3: otherlv_0= 'GSSConfigTCFormat' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,62,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTCFormatAccess().getGSSConfigTCFormatKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTCFormatAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigTCFormatAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigTCFormatAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3109:3: ( (lv_file_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:3110:4: (lv_file_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:3110:4: (lv_file_4_0= ruleXMLREF )
            // InternalCONFIG.g:3111:5: lv_file_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigTCFormatAccess().getFileXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_file_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigTCFormatRule());
              					}
              					set(
              						current,
              						"file",
              						lv_file_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigTCFormatAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigTCFormatAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTCFormatAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigTCFormat"


    // $ANTLR start "entryRuleGSSConfigInputFilter"
    // InternalCONFIG.g:3144:1: entryRuleGSSConfigInputFilter returns [EObject current=null] : iv_ruleGSSConfigInputFilter= ruleGSSConfigInputFilter EOF ;
    public final EObject entryRuleGSSConfigInputFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigInputFilter = null;


        try {
            // InternalCONFIG.g:3144:61: (iv_ruleGSSConfigInputFilter= ruleGSSConfigInputFilter EOF )
            // InternalCONFIG.g:3145:2: iv_ruleGSSConfigInputFilter= ruleGSSConfigInputFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigInputFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigInputFilter=ruleGSSConfigInputFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigInputFilter; 
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
    // $ANTLR end "entryRuleGSSConfigInputFilter"


    // $ANTLR start "ruleGSSConfigInputFilter"
    // InternalCONFIG.g:3151:1: ruleGSSConfigInputFilter returns [EObject current=null] : (otherlv_0= 'GSSConfigInputFilter' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigInputFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3157:2: ( (otherlv_0= 'GSSConfigInputFilter' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:3158:2: (otherlv_0= 'GSSConfigInputFilter' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:3158:2: (otherlv_0= 'GSSConfigInputFilter' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:3159:3: otherlv_0= 'GSSConfigInputFilter' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,63,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigInputFilterAccess().getGSSConfigInputFilterKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigInputFilterAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigInputFilterAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigInputFilterAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3175:3: ( (lv_file_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:3176:4: (lv_file_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:3176:4: (lv_file_4_0= ruleXMLREF )
            // InternalCONFIG.g:3177:5: lv_file_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigInputFilterAccess().getFileXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_file_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigInputFilterRule());
              					}
              					set(
              						current,
              						"file",
              						lv_file_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigInputFilterAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigInputFilterAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigInputFilterAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigInputFilter"


    // $ANTLR start "entryRuleGSSConfigExportToPrevLevel"
    // InternalCONFIG.g:3210:1: entryRuleGSSConfigExportToPrevLevel returns [EObject current=null] : iv_ruleGSSConfigExportToPrevLevel= ruleGSSConfigExportToPrevLevel EOF ;
    public final EObject entryRuleGSSConfigExportToPrevLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigExportToPrevLevel = null;


        try {
            // InternalCONFIG.g:3210:67: (iv_ruleGSSConfigExportToPrevLevel= ruleGSSConfigExportToPrevLevel EOF )
            // InternalCONFIG.g:3211:2: iv_ruleGSSConfigExportToPrevLevel= ruleGSSConfigExportToPrevLevel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigExportToPrevLevelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigExportToPrevLevel=ruleGSSConfigExportToPrevLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigExportToPrevLevel; 
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
    // $ANTLR end "entryRuleGSSConfigExportToPrevLevel"


    // $ANTLR start "ruleGSSConfigExportToPrevLevel"
    // InternalCONFIG.g:3217:1: ruleGSSConfigExportToPrevLevel returns [EObject current=null] : (otherlv_0= 'GSSConfigExportToPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigExportToPrevLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3223:2: ( (otherlv_0= 'GSSConfigExportToPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:3224:2: (otherlv_0= 'GSSConfigExportToPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:3224:2: (otherlv_0= 'GSSConfigExportToPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:3225:3: otherlv_0= 'GSSConfigExportToPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigExportToPrevLevelAccess().getGSSConfigExportToPrevLevelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigExportToPrevLevelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigExportToPrevLevelAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigExportToPrevLevelAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3241:3: ( (lv_file_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:3242:4: (lv_file_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:3242:4: (lv_file_4_0= ruleXMLREF )
            // InternalCONFIG.g:3243:5: lv_file_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigExportToPrevLevelAccess().getFileXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_file_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigExportToPrevLevelRule());
              					}
              					set(
              						current,
              						"file",
              						lv_file_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigExportToPrevLevelAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigExportToPrevLevelAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigExportToPrevLevelAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigExportToPrevLevel"


    // $ANTLR start "entryRuleGSSConfigImportFromPrevLevel"
    // InternalCONFIG.g:3276:1: entryRuleGSSConfigImportFromPrevLevel returns [EObject current=null] : iv_ruleGSSConfigImportFromPrevLevel= ruleGSSConfigImportFromPrevLevel EOF ;
    public final EObject entryRuleGSSConfigImportFromPrevLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigImportFromPrevLevel = null;


        try {
            // InternalCONFIG.g:3276:69: (iv_ruleGSSConfigImportFromPrevLevel= ruleGSSConfigImportFromPrevLevel EOF )
            // InternalCONFIG.g:3277:2: iv_ruleGSSConfigImportFromPrevLevel= ruleGSSConfigImportFromPrevLevel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigImportFromPrevLevelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigImportFromPrevLevel=ruleGSSConfigImportFromPrevLevel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigImportFromPrevLevel; 
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
    // $ANTLR end "entryRuleGSSConfigImportFromPrevLevel"


    // $ANTLR start "ruleGSSConfigImportFromPrevLevel"
    // InternalCONFIG.g:3283:1: ruleGSSConfigImportFromPrevLevel returns [EObject current=null] : (otherlv_0= 'GSSConfigImportFromPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigImportFromPrevLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_file_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3289:2: ( (otherlv_0= 'GSSConfigImportFromPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:3290:2: (otherlv_0= 'GSSConfigImportFromPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:3290:2: (otherlv_0= 'GSSConfigImportFromPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:3291:3: otherlv_0= 'GSSConfigImportFromPrevLevel' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,65,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigImportFromPrevLevelAccess().getGSSConfigImportFromPrevLevelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_70); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigImportFromPrevLevelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigImportFromPrevLevelAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigImportFromPrevLevelAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3307:3: ( (lv_file_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:3308:4: (lv_file_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:3308:4: (lv_file_4_0= ruleXMLREF )
            // InternalCONFIG.g:3309:5: lv_file_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigImportFromPrevLevelAccess().getFileXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_file_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigImportFromPrevLevelRule());
              					}
              					set(
              						current,
              						"file",
              						lv_file_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigImportFromPrevLevelAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigImportFromPrevLevelAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigImportFromPrevLevelAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigImportFromPrevLevel"


    // $ANTLR start "entryRuleGSSConfigSpecialPacket"
    // InternalCONFIG.g:3342:1: entryRuleGSSConfigSpecialPacket returns [EObject current=null] : iv_ruleGSSConfigSpecialPacket= ruleGSSConfigSpecialPacket EOF ;
    public final EObject entryRuleGSSConfigSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigSpecialPacket = null;


        try {
            // InternalCONFIG.g:3342:63: (iv_ruleGSSConfigSpecialPacket= ruleGSSConfigSpecialPacket EOF )
            // InternalCONFIG.g:3343:2: iv_ruleGSSConfigSpecialPacket= ruleGSSConfigSpecialPacket EOF
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
    // InternalCONFIG.g:3349:1: ruleGSSConfigSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' ( (lv_inputFilter_26_0= ruleGSSConfigInputFilter ) ) ( (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_28_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_29_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) ) )? otherlv_31= '}' otherlv_32= ';' ) ;
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
        Token otherlv_31=null;
        Token otherlv_32=null;
        Enumerator lv_status_4_0 = null;

        AntlrDatatypeRuleToken lv_id_12_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_16_0 = null;

        AntlrDatatypeRuleToken lv_levels_20_0 = null;

        AntlrDatatypeRuleToken lv_levelRef_24_0 = null;

        EObject lv_inputFilter_26_0 = null;

        EObject lv_UpperLevels_27_0 = null;

        EObject lv_printingData_28_0 = null;

        EObject lv_period_29_0 = null;

        EObject lv_intervalRange_30_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3355:2: ( (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' ( (lv_inputFilter_26_0= ruleGSSConfigInputFilter ) ) ( (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_28_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_29_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) ) )? otherlv_31= '}' otherlv_32= ';' ) )
            // InternalCONFIG.g:3356:2: (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' ( (lv_inputFilter_26_0= ruleGSSConfigInputFilter ) ) ( (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_28_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_29_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) ) )? otherlv_31= '}' otherlv_32= ';' )
            {
            // InternalCONFIG.g:3356:2: (otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' ( (lv_inputFilter_26_0= ruleGSSConfigInputFilter ) ) ( (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_28_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_29_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) ) )? otherlv_31= '}' otherlv_32= ';' )
            // InternalCONFIG.g:3357:3: otherlv_0= 'GSSConfigSpecialPacket' otherlv_1= '{' otherlv_2= 'status' otherlv_3= ':=' ( (lv_status_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'id' otherlv_11= ':=' ( (lv_id_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'ifRef' otherlv_15= ':=' ( (lv_ifRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'levels' otherlv_19= ':=' ( (lv_levels_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'levelRef' otherlv_23= ':=' ( (lv_levelRef_24_0= ruleINTEGER ) ) otherlv_25= ';' ( (lv_inputFilter_26_0= ruleGSSConfigInputFilter ) ) ( (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels ) )? ( (lv_printingData_28_0= ruleGSSConfigPrintingData ) ) ( ( (lv_period_29_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) ) )? otherlv_31= '}' otherlv_32= ';'
            {
            otherlv_0=(Token)match(input,66,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigSpecialPacketAccess().getGSSConfigSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,67,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigSpecialPacketAccess().getStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3373:3: ( (lv_status_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:3374:4: (lv_status_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:3374:4: (lv_status_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:3375:5: lv_status_4_0= ruleGSSConfigEnableDisable
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigSpecialPacketAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:3404:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalCONFIG.g:3405:4: (lv_name_8_0= RULE_ID )
            {
            // InternalCONFIG.g:3405:4: (lv_name_8_0= RULE_ID )
            // InternalCONFIG.g:3406:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSConfigSpecialPacketAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigSpecialPacketAccess().getIdKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:3434:3: ( (lv_id_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:3435:4: (lv_id_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3435:4: (lv_id_12_0= ruleINTEGER )
            // InternalCONFIG.g:3436:5: lv_id_12_0= ruleINTEGER
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigSpecialPacketAccess().getIfRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:3465:3: ( (lv_ifRef_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:3466:4: (lv_ifRef_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3466:4: (lv_ifRef_16_0= ruleINTEGER )
            // InternalCONFIG.g:3467:5: lv_ifRef_16_0= ruleINTEGER
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,69,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigSpecialPacketAccess().getLevelsKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:3496:3: ( (lv_levels_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:3497:4: (lv_levels_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3497:4: (lv_levels_20_0= ruleINTEGER )
            // InternalCONFIG.g:3498:5: lv_levels_20_0= ruleINTEGER
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,70,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigSpecialPacketAccess().getLevelRefKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigSpecialPacketAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalCONFIG.g:3527:3: ( (lv_levelRef_24_0= ruleINTEGER ) )
            // InternalCONFIG.g:3528:4: (lv_levelRef_24_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3528:4: (lv_levelRef_24_0= ruleINTEGER )
            // InternalCONFIG.g:3529:5: lv_levelRef_24_0= ruleINTEGER
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

            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_25());
              		
            }
            // InternalCONFIG.g:3550:3: ( (lv_inputFilter_26_0= ruleGSSConfigInputFilter ) )
            // InternalCONFIG.g:3551:4: (lv_inputFilter_26_0= ruleGSSConfigInputFilter )
            {
            // InternalCONFIG.g:3551:4: (lv_inputFilter_26_0= ruleGSSConfigInputFilter )
            // InternalCONFIG.g:3552:5: lv_inputFilter_26_0= ruleGSSConfigInputFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getInputFilterGSSConfigInputFilterParserRuleCall_26_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_75);
            lv_inputFilter_26_0=ruleGSSConfigInputFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"inputFilter",
              						lv_inputFilter_26_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInputFilter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:3569:3: ( (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==71) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCONFIG.g:3570:4: (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels )
                    {
                    // InternalCONFIG.g:3570:4: (lv_UpperLevels_27_0= ruleGSSConfigUpperLevels )
                    // InternalCONFIG.g:3571:5: lv_UpperLevels_27_0= ruleGSSConfigUpperLevels
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getUpperLevelsGSSConfigUpperLevelsParserRuleCall_27_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_75);
                    lv_UpperLevels_27_0=ruleGSSConfigUpperLevels();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
                      					}
                      					add(
                      						current,
                      						"UpperLevels",
                      						lv_UpperLevels_27_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigUpperLevels");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalCONFIG.g:3588:3: ( (lv_printingData_28_0= ruleGSSConfigPrintingData ) )
            // InternalCONFIG.g:3589:4: (lv_printingData_28_0= ruleGSSConfigPrintingData )
            {
            // InternalCONFIG.g:3589:4: (lv_printingData_28_0= ruleGSSConfigPrintingData )
            // InternalCONFIG.g:3590:5: lv_printingData_28_0= ruleGSSConfigPrintingData
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getPrintingDataGSSConfigPrintingDataParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_76);
            lv_printingData_28_0=ruleGSSConfigPrintingData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
              					}
              					set(
              						current,
              						"printingData",
              						lv_printingData_28_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPrintingData");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:3607:3: ( ( (lv_period_29_0= ruleGSSConfigPeriod ) ) | ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) ) )?
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
                    // InternalCONFIG.g:3608:4: ( (lv_period_29_0= ruleGSSConfigPeriod ) )
                    {
                    // InternalCONFIG.g:3608:4: ( (lv_period_29_0= ruleGSSConfigPeriod ) )
                    // InternalCONFIG.g:3609:5: (lv_period_29_0= ruleGSSConfigPeriod )
                    {
                    // InternalCONFIG.g:3609:5: (lv_period_29_0= ruleGSSConfigPeriod )
                    // InternalCONFIG.g:3610:6: lv_period_29_0= ruleGSSConfigPeriod
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getPeriodGSSConfigPeriodParserRuleCall_29_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_period_29_0=ruleGSSConfigPeriod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"period",
                      							lv_period_29_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigPeriod");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:3628:4: ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) )
                    {
                    // InternalCONFIG.g:3628:4: ( (lv_intervalRange_30_0= ruleGSSConfigIntervalRange ) )
                    // InternalCONFIG.g:3629:5: (lv_intervalRange_30_0= ruleGSSConfigIntervalRange )
                    {
                    // InternalCONFIG.g:3629:5: (lv_intervalRange_30_0= ruleGSSConfigIntervalRange )
                    // InternalCONFIG.g:3630:6: lv_intervalRange_30_0= ruleGSSConfigIntervalRange
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSConfigSpecialPacketAccess().getIntervalRangeGSSConfigIntervalRangeParserRuleCall_29_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_intervalRange_30_0=ruleGSSConfigIntervalRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSConfigSpecialPacketRule());
                      						}
                      						set(
                      							current,
                      							"intervalRange",
                      							lv_intervalRange_30_0,
                      							"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigIntervalRange");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSConfigSpecialPacketAccess().getRightCurlyBracketKeyword_30());
              		
            }
            otherlv_32=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSConfigSpecialPacketAccess().getSemicolonKeyword_31());
              		
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
    // InternalCONFIG.g:3660:1: entryRuleGSSConfigUpperLevels returns [EObject current=null] : iv_ruleGSSConfigUpperLevels= ruleGSSConfigUpperLevels EOF ;
    public final EObject entryRuleGSSConfigUpperLevels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigUpperLevels = null;


        try {
            // InternalCONFIG.g:3660:61: (iv_ruleGSSConfigUpperLevels= ruleGSSConfigUpperLevels EOF )
            // InternalCONFIG.g:3661:2: iv_ruleGSSConfigUpperLevels= ruleGSSConfigUpperLevels EOF
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
    // InternalCONFIG.g:3667:1: ruleGSSConfigUpperLevels returns [EObject current=null] : (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSConfigUpperLevels() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_UpperLevel_2_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:3673:2: ( (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalCONFIG.g:3674:2: (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalCONFIG.g:3674:2: (otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalCONFIG.g:3675:3: otherlv_0= 'GSSConfigUpperLevels' otherlv_1= '{' ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigUpperLevelsAccess().getGSSConfigUpperLevelsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigUpperLevelsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCONFIG.g:3683:3: ( (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel ) )+
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
            	    // InternalCONFIG.g:3684:4: (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel )
            	    {
            	    // InternalCONFIG.g:3684:4: (lv_UpperLevel_2_0= ruleGSSConfigUpperLevel )
            	    // InternalCONFIG.g:3685:5: lv_UpperLevel_2_0= ruleGSSConfigUpperLevel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSConfigUpperLevelsAccess().getUpperLevelGSSConfigUpperLevelParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_78);
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
    // InternalCONFIG.g:3714:1: entryRuleGSSConfigPrintingData returns [EObject current=null] : iv_ruleGSSConfigPrintingData= ruleGSSConfigPrintingData EOF ;
    public final EObject entryRuleGSSConfigPrintingData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPrintingData = null;


        try {
            // InternalCONFIG.g:3714:62: (iv_ruleGSSConfigPrintingData= ruleGSSConfigPrintingData EOF )
            // InternalCONFIG.g:3715:2: iv_ruleGSSConfigPrintingData= ruleGSSConfigPrintingData EOF
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
    // InternalCONFIG.g:3721:1: ruleGSSConfigPrintingData returns [EObject current=null] : (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) ;
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
            // InternalCONFIG.g:3727:2: ( (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' ) )
            // InternalCONFIG.g:3728:2: (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalCONFIG.g:3728:2: (otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';' )
            // InternalCONFIG.g:3729:3: otherlv_0= 'GSSConfigPrintingData' otherlv_1= '{' otherlv_2= 'printStatus' otherlv_3= ':=' ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) ) otherlv_5= ';' ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )? otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,72,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPrintingDataAccess().getGSSConfigPrintingDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPrintingDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,73,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPrintingDataAccess().getPrintStatusKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPrintingDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3745:3: ( (lv_printStatus_4_0= ruleGSSConfigEnableDisable ) )
            // InternalCONFIG.g:3746:4: (lv_printStatus_4_0= ruleGSSConfigEnableDisable )
            {
            // InternalCONFIG.g:3746:4: (lv_printStatus_4_0= ruleGSSConfigEnableDisable )
            // InternalCONFIG.g:3747:5: lv_printStatus_4_0= ruleGSSConfigEnableDisable
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPrintingDataAccess().getSemicolonKeyword_5());
              		
            }
            // InternalCONFIG.g:3768:3: ( (lv_structuredData_6_0= ruleGSSConfigStructuredData ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==86) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCONFIG.g:3769:4: (lv_structuredData_6_0= ruleGSSConfigStructuredData )
                    {
                    // InternalCONFIG.g:3769:4: (lv_structuredData_6_0= ruleGSSConfigStructuredData )
                    // InternalCONFIG.g:3770:5: lv_structuredData_6_0= ruleGSSConfigStructuredData
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
    // InternalCONFIG.g:3799:1: entryRuleGSSConfigPeriod returns [EObject current=null] : iv_ruleGSSConfigPeriod= ruleGSSConfigPeriod EOF ;
    public final EObject entryRuleGSSConfigPeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriod = null;


        try {
            // InternalCONFIG.g:3799:56: (iv_ruleGSSConfigPeriod= ruleGSSConfigPeriod EOF )
            // InternalCONFIG.g:3800:2: iv_ruleGSSConfigPeriod= ruleGSSConfigPeriod EOF
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
    // InternalCONFIG.g:3806:1: ruleGSSConfigPeriod returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
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
            // InternalCONFIG.g:3812:2: ( (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:3813:2: (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:3813:2: (otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:3814:3: otherlv_0= 'GSSConfigPeriod' otherlv_1= '{' otherlv_2= 'min_value' otherlv_3= ':=' ( (lv_min_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'min_unit' otherlv_7= ':=' ( (lv_min_unit_8_0= ruleGSSConfigUnit ) ) otherlv_9= ';' otherlv_10= 'max_value' otherlv_11= ':=' ( (lv_max_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'max_unit' otherlv_15= ':=' ( (lv_max_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,74,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodAccess().getGSSConfigPeriodKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,75,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodAccess().getMin_valueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3830:3: ( (lv_min_value_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:3831:4: (lv_min_value_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3831:4: (lv_min_value_4_0= ruleINTEGER )
            // InternalCONFIG.g:3832:5: lv_min_value_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,76,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodAccess().getMin_unitKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:3861:3: ( (lv_min_unit_8_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:3862:4: (lv_min_unit_8_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:3862:4: (lv_min_unit_8_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:3863:5: lv_min_unit_8_0= ruleGSSConfigUnit
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,77,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodAccess().getMax_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:3892:3: ( (lv_max_value_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:3893:4: (lv_max_value_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3893:4: (lv_max_value_12_0= ruleINTEGER )
            // InternalCONFIG.g:3894:5: lv_max_value_12_0= ruleINTEGER
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigPeriodAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,78,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodAccess().getMax_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:3923:3: ( (lv_max_unit_16_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:3924:4: (lv_max_unit_16_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:3924:4: (lv_max_unit_16_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:3925:5: lv_max_unit_16_0= ruleGSSConfigUnit
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
    // InternalCONFIG.g:3958:1: entryRuleGSSConfigIntervalRange returns [EObject current=null] : iv_ruleGSSConfigIntervalRange= ruleGSSConfigIntervalRange EOF ;
    public final EObject entryRuleGSSConfigIntervalRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigIntervalRange = null;


        try {
            // InternalCONFIG.g:3958:63: (iv_ruleGSSConfigIntervalRange= ruleGSSConfigIntervalRange EOF )
            // InternalCONFIG.g:3959:2: iv_ruleGSSConfigIntervalRange= ruleGSSConfigIntervalRange EOF
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
    // InternalCONFIG.g:3965:1: ruleGSSConfigIntervalRange returns [EObject current=null] : (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) ;
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
            // InternalCONFIG.g:3971:2: ( (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' ) )
            // InternalCONFIG.g:3972:2: (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalCONFIG.g:3972:2: (otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';' )
            // InternalCONFIG.g:3973:3: otherlv_0= 'GSSConfigIntervalRange' otherlv_1= '{' otherlv_2= 'min' otherlv_3= ':=' ( (lv_min_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'max' otherlv_7= ':=' ( (lv_max_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'interval_value' otherlv_11= ':=' ( (lv_interval_value_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'interval_unit' otherlv_15= ':=' ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) ) otherlv_17= ';' otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,79,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigIntervalRangeAccess().getGSSConfigIntervalRangeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_86); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigIntervalRangeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,80,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigIntervalRangeAccess().getMinKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:3989:3: ( (lv_min_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:3990:4: (lv_min_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:3990:4: (lv_min_4_0= ruleINTEGER )
            // InternalCONFIG.g:3991:5: lv_min_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,81,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigIntervalRangeAccess().getMaxKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4020:3: ( (lv_max_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4021:4: (lv_max_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4021:4: (lv_max_8_0= ruleINTEGER )
            // InternalCONFIG.g:4022:5: lv_max_8_0= ruleINTEGER
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,82,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_valueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:4051:3: ( (lv_interval_value_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:4052:4: (lv_interval_value_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4052:4: (lv_interval_value_12_0= ruleINTEGER )
            // InternalCONFIG.g:4053:5: lv_interval_value_12_0= ruleINTEGER
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_89); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSConfigIntervalRangeAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,83,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigIntervalRangeAccess().getInterval_unitKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigIntervalRangeAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:4082:3: ( (lv_interval_unit_16_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:4083:4: (lv_interval_unit_16_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:4083:4: (lv_interval_unit_16_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:4084:5: lv_interval_unit_16_0= ruleGSSConfigUnit
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
    // InternalCONFIG.g:4117:1: entryRuleGSSConfigUpperLevel returns [EObject current=null] : iv_ruleGSSConfigUpperLevel= ruleGSSConfigUpperLevel EOF ;
    public final EObject entryRuleGSSConfigUpperLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigUpperLevel = null;


        try {
            // InternalCONFIG.g:4117:60: (iv_ruleGSSConfigUpperLevel= ruleGSSConfigUpperLevel EOF )
            // InternalCONFIG.g:4118:2: iv_ruleGSSConfigUpperLevel= ruleGSSConfigUpperLevel EOF
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
    // InternalCONFIG.g:4124:1: ruleGSSConfigUpperLevel returns [EObject current=null] : (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' ( (lv_TMformat_6_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_7_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_9= '}' otherlv_10= ';' ) ;
    public final EObject ruleGSSConfigUpperLevel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_level_4_0 = null;

        EObject lv_TMformat_6_0 = null;

        EObject lv_inputFilter_7_0 = null;

        EObject lv_import_from_prev_Level_8_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:4130:2: ( (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' ( (lv_TMformat_6_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_7_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_9= '}' otherlv_10= ';' ) )
            // InternalCONFIG.g:4131:2: (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' ( (lv_TMformat_6_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_7_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_9= '}' otherlv_10= ';' )
            {
            // InternalCONFIG.g:4131:2: (otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' ( (lv_TMformat_6_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_7_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_9= '}' otherlv_10= ';' )
            // InternalCONFIG.g:4132:3: otherlv_0= 'GSSConfigUpperLevel' otherlv_1= '{' otherlv_2= 'level' otherlv_3= ':=' ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) ) otherlv_5= ';' ( (lv_TMformat_6_0= ruleGSSConfigTMFormat ) ) ( (lv_inputFilter_7_0= ruleGSSConfigInputFilter ) ) ( (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel ) )? otherlv_9= '}' otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,84,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigUpperLevelAccess().getGSSConfigUpperLevelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigUpperLevelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigUpperLevelAccess().getLevelKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_91); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigUpperLevelAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4148:3: ( (lv_level_4_0= ruleGSSConfigUpperLevelLevel ) )
            // InternalCONFIG.g:4149:4: (lv_level_4_0= ruleGSSConfigUpperLevelLevel )
            {
            // InternalCONFIG.g:4149:4: (lv_level_4_0= ruleGSSConfigUpperLevelLevel )
            // InternalCONFIG.g:4150:5: lv_level_4_0= ruleGSSConfigUpperLevelLevel
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_5());
              		
            }
            // InternalCONFIG.g:4171:3: ( (lv_TMformat_6_0= ruleGSSConfigTMFormat ) )
            // InternalCONFIG.g:4172:4: (lv_TMformat_6_0= ruleGSSConfigTMFormat )
            {
            // InternalCONFIG.g:4172:4: (lv_TMformat_6_0= ruleGSSConfigTMFormat )
            // InternalCONFIG.g:4173:5: lv_TMformat_6_0= ruleGSSConfigTMFormat
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getTMformatGSSConfigTMFormatParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_66);
            lv_TMformat_6_0=ruleGSSConfigTMFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigUpperLevelRule());
              					}
              					set(
              						current,
              						"TMformat",
              						lv_TMformat_6_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigTMFormat");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4190:3: ( (lv_inputFilter_7_0= ruleGSSConfigInputFilter ) )
            // InternalCONFIG.g:4191:4: (lv_inputFilter_7_0= ruleGSSConfigInputFilter )
            {
            // InternalCONFIG.g:4191:4: (lv_inputFilter_7_0= ruleGSSConfigInputFilter )
            // InternalCONFIG.g:4192:5: lv_inputFilter_7_0= ruleGSSConfigInputFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getInputFilterGSSConfigInputFilterParserRuleCall_7_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_68);
            lv_inputFilter_7_0=ruleGSSConfigInputFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigUpperLevelRule());
              					}
              					set(
              						current,
              						"inputFilter",
              						lv_inputFilter_7_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigInputFilter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4209:3: ( (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==65) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCONFIG.g:4210:4: (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel )
                    {
                    // InternalCONFIG.g:4210:4: (lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel )
                    // InternalCONFIG.g:4211:5: lv_import_from_prev_Level_8_0= ruleGSSConfigImportFromPrevLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSConfigUpperLevelAccess().getImport_from_prev_LevelGSSConfigImportFromPrevLevelParserRuleCall_8_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
                    lv_import_from_prev_Level_8_0=ruleGSSConfigImportFromPrevLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSConfigUpperLevelRule());
                      					}
                      					set(
                      						current,
                      						"import_from_prev_Level",
                      						lv_import_from_prev_Level_8_0,
                      						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigImportFromPrevLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigUpperLevelAccess().getRightCurlyBracketKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigUpperLevelAccess().getSemicolonKeyword_10());
              		
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
    // InternalCONFIG.g:4240:1: entryRuleGSSConfigStructuredData returns [EObject current=null] : iv_ruleGSSConfigStructuredData= ruleGSSConfigStructuredData EOF ;
    public final EObject entryRuleGSSConfigStructuredData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigStructuredData = null;


        try {
            // InternalCONFIG.g:4240:64: (iv_ruleGSSConfigStructuredData= ruleGSSConfigStructuredData EOF )
            // InternalCONFIG.g:4241:2: iv_ruleGSSConfigStructuredData= ruleGSSConfigStructuredData EOF
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
    // InternalCONFIG.g:4247:1: ruleGSSConfigStructuredData returns [EObject current=null] : (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalCONFIG.g:4253:2: ( (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCONFIG.g:4254:2: (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCONFIG.g:4254:2: (otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalCONFIG.g:4255:3: otherlv_0= 'GSSConfigStructuredData' otherlv_1= '{' otherlv_2= 'levelRef' otherlv_3= ':=' ( (lv_levelRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'firstField' otherlv_7= ':=' ( (lv_firstField_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,86,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigStructuredDataAccess().getGSSConfigStructuredDataKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigStructuredDataAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,70,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigStructuredDataAccess().getLevelRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4271:3: ( (lv_levelRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:4272:4: (lv_levelRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4272:4: (lv_levelRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:4273:5: lv_levelRef_4_0= ruleINTEGER
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
            otherlv_6=(Token)match(input,87,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigStructuredDataAccess().getFirstFieldKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigStructuredDataAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4302:3: ( (lv_firstField_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4303:4: (lv_firstField_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4303:4: (lv_firstField_8_0= ruleINTEGER )
            // InternalCONFIG.g:4304:5: lv_firstField_8_0= ruleINTEGER
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
    // InternalCONFIG.g:4337:1: entryRuleGSSConfigPeriodicTCLevel2 returns [EObject current=null] : iv_ruleGSSConfigPeriodicTCLevel2= ruleGSSConfigPeriodicTCLevel2 EOF ;
    public final EObject entryRuleGSSConfigPeriodicTCLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriodicTCLevel2 = null;


        try {
            // InternalCONFIG.g:4337:66: (iv_ruleGSSConfigPeriodicTCLevel2= ruleGSSConfigPeriodicTCLevel2 EOF )
            // InternalCONFIG.g:4338:2: iv_ruleGSSConfigPeriodicTCLevel2= ruleGSSConfigPeriodicTCLevel2 EOF
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
    // InternalCONFIG.g:4344:1: ruleGSSConfigPeriodicTCLevel2 returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level2_22_0= ruleGSSConfigLevel2 ) ) ( (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 ) ) ( (lv_level1_24_0= ruleGSSConfigLevel1 ) ) ( (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 ) ) ( (lv_level0_26_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_28= '}' otherlv_29= ';' ) ;
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
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_12_0 = null;

        AntlrDatatypeRuleToken lv_period_value_16_0 = null;

        Enumerator lv_period_unit_20_0 = null;

        EObject lv_level2_22_0 = null;

        EObject lv_app_to_level2_23_0 = null;

        EObject lv_level1_24_0 = null;

        EObject lv_level2_to_level1_25_0 = null;

        EObject lv_level0_26_0 = null;

        EObject lv_level1_to_level0_27_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:4350:2: ( (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level2_22_0= ruleGSSConfigLevel2 ) ) ( (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 ) ) ( (lv_level1_24_0= ruleGSSConfigLevel1 ) ) ( (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 ) ) ( (lv_level0_26_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_28= '}' otherlv_29= ';' ) )
            // InternalCONFIG.g:4351:2: (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level2_22_0= ruleGSSConfigLevel2 ) ) ( (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 ) ) ( (lv_level1_24_0= ruleGSSConfigLevel1 ) ) ( (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 ) ) ( (lv_level0_26_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_28= '}' otherlv_29= ';' )
            {
            // InternalCONFIG.g:4351:2: (otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level2_22_0= ruleGSSConfigLevel2 ) ) ( (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 ) ) ( (lv_level1_24_0= ruleGSSConfigLevel1 ) ) ( (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 ) ) ( (lv_level0_26_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_28= '}' otherlv_29= ';' )
            // InternalCONFIG.g:4352:3: otherlv_0= 'GSSConfigPeriodicTCLevel2' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level2_22_0= ruleGSSConfigLevel2 ) ) ( (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 ) ) ( (lv_level1_24_0= ruleGSSConfigLevel1 ) ) ( (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 ) ) ( (lv_level0_26_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_28= '}' otherlv_29= ';'
            {
            otherlv_0=(Token)match(input,88,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getGSSConfigPeriodicTCLevel2Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4368:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:4369:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:4369:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:4370:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4398:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4399:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4399:4: (lv_id_8_0= ruleINTEGER )
            // InternalCONFIG.g:4400:5: lv_id_8_0= ruleINTEGER
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:4429:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:4430:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4430:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:4431:5: lv_ifRef_12_0= ruleINTEGER
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
            otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:4460:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:4461:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4461:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalCONFIG.g:4462:5: lv_period_value_16_0= ruleINTEGER
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
            otherlv_18=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:4491:3: ( (lv_period_unit_20_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:4492:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:4492:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:4493:5: lv_period_unit_20_0= ruleGSSConfigUnit
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
            // InternalCONFIG.g:4514:3: ( (lv_level2_22_0= ruleGSSConfigLevel2 ) )
            // InternalCONFIG.g:4515:4: (lv_level2_22_0= ruleGSSConfigLevel2 )
            {
            // InternalCONFIG.g:4515:4: (lv_level2_22_0= ruleGSSConfigLevel2 )
            // InternalCONFIG.g:4516:5: lv_level2_22_0= ruleGSSConfigLevel2
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2GSSConfigLevel2ParserRuleCall_22_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_96);
            lv_level2_22_0=ruleGSSConfigLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"level2",
              						lv_level2_22_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel2");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4533:3: ( (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 ) )
            // InternalCONFIG.g:4534:4: (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 )
            {
            // InternalCONFIG.g:4534:4: (lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2 )
            // InternalCONFIG.g:4535:5: lv_app_to_level2_23_0= ruleGSSConfigAppToLevel2
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getApp_to_level2GSSConfigAppToLevel2ParserRuleCall_23_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_97);
            lv_app_to_level2_23_0=ruleGSSConfigAppToLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"app_to_level2",
              						lv_app_to_level2_23_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAppToLevel2");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4552:3: ( (lv_level1_24_0= ruleGSSConfigLevel1 ) )
            // InternalCONFIG.g:4553:4: (lv_level1_24_0= ruleGSSConfigLevel1 )
            {
            // InternalCONFIG.g:4553:4: (lv_level1_24_0= ruleGSSConfigLevel1 )
            // InternalCONFIG.g:4554:5: lv_level1_24_0= ruleGSSConfigLevel1
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1GSSConfigLevel1ParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_98);
            lv_level1_24_0=ruleGSSConfigLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"level1",
              						lv_level1_24_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel1");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4571:3: ( (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 ) )
            // InternalCONFIG.g:4572:4: (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 )
            {
            // InternalCONFIG.g:4572:4: (lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1 )
            // InternalCONFIG.g:4573:5: lv_level2_to_level1_25_0= ruleGSSConfigLevel2ToLevel1
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel2_to_level1GSSConfigLevel2ToLevel1ParserRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_99);
            lv_level2_to_level1_25_0=ruleGSSConfigLevel2ToLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"level2_to_level1",
              						lv_level2_to_level1_25_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel2ToLevel1");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4590:3: ( (lv_level0_26_0= ruleGSSConfigLevel0 ) )
            // InternalCONFIG.g:4591:4: (lv_level0_26_0= ruleGSSConfigLevel0 )
            {
            // InternalCONFIG.g:4591:4: (lv_level0_26_0= ruleGSSConfigLevel0 )
            // InternalCONFIG.g:4592:5: lv_level0_26_0= ruleGSSConfigLevel0
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel0GSSConfigLevel0ParserRuleCall_26_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_100);
            lv_level0_26_0=ruleGSSConfigLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"level0",
              						lv_level0_26_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel0");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4609:3: ( (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 ) )
            // InternalCONFIG.g:4610:4: (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 )
            {
            // InternalCONFIG.g:4610:4: (lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0 )
            // InternalCONFIG.g:4611:5: lv_level1_to_level0_27_0= ruleGSSConfigLevel1ToLevel0
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel2Access().getLevel1_to_level0GSSConfigLevel1ToLevel0ParserRuleCall_27_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_level1_to_level0_27_0=ruleGSSConfigLevel1ToLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel2Rule());
              					}
              					set(
              						current,
              						"level1_to_level0",
              						lv_level1_to_level0_27_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel1ToLevel0");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_28=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getRightCurlyBracketKeyword_28());
              		
            }
            otherlv_29=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSConfigPeriodicTCLevel2Access().getSemicolonKeyword_29());
              		
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
    // InternalCONFIG.g:4640:1: entryRuleGSSConfigPeriodicTCLevel1 returns [EObject current=null] : iv_ruleGSSConfigPeriodicTCLevel1= ruleGSSConfigPeriodicTCLevel1 EOF ;
    public final EObject entryRuleGSSConfigPeriodicTCLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPeriodicTCLevel1 = null;


        try {
            // InternalCONFIG.g:4640:66: (iv_ruleGSSConfigPeriodicTCLevel1= ruleGSSConfigPeriodicTCLevel1 EOF )
            // InternalCONFIG.g:4641:2: iv_ruleGSSConfigPeriodicTCLevel1= ruleGSSConfigPeriodicTCLevel1 EOF
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
    // InternalCONFIG.g:4647:1: ruleGSSConfigPeriodicTCLevel1 returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level1_22_0= ruleGSSConfigLevel1 ) ) ( (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 ) ) ( (lv_level0_24_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_26= '}' otherlv_27= ';' ) ;
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
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_12_0 = null;

        AntlrDatatypeRuleToken lv_period_value_16_0 = null;

        Enumerator lv_period_unit_20_0 = null;

        EObject lv_level1_22_0 = null;

        EObject lv_app_to_level1_23_0 = null;

        EObject lv_level0_24_0 = null;

        EObject lv_level1_to_level0_25_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:4653:2: ( (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level1_22_0= ruleGSSConfigLevel1 ) ) ( (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 ) ) ( (lv_level0_24_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_26= '}' otherlv_27= ';' ) )
            // InternalCONFIG.g:4654:2: (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level1_22_0= ruleGSSConfigLevel1 ) ) ( (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 ) ) ( (lv_level0_24_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalCONFIG.g:4654:2: (otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level1_22_0= ruleGSSConfigLevel1 ) ) ( (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 ) ) ( (lv_level0_24_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_26= '}' otherlv_27= ';' )
            // InternalCONFIG.g:4655:3: otherlv_0= 'GSSConfigPeriodicTCLevel1' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level1_22_0= ruleGSSConfigLevel1 ) ) ( (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 ) ) ( (lv_level0_24_0= ruleGSSConfigLevel0 ) ) ( (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 ) ) otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getGSSConfigPeriodicTCLevel1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4671:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:4672:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:4672:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:4673:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:4701:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:4702:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4702:4: (lv_id_8_0= ruleINTEGER )
            // InternalCONFIG.g:4703:5: lv_id_8_0= ruleINTEGER
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:4732:3: ( (lv_ifRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:4733:4: (lv_ifRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4733:4: (lv_ifRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:4734:5: lv_ifRef_12_0= ruleINTEGER
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
            otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:4763:3: ( (lv_period_value_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:4764:4: (lv_period_value_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:4764:4: (lv_period_value_16_0= ruleINTEGER )
            // InternalCONFIG.g:4765:5: lv_period_value_16_0= ruleINTEGER
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
            otherlv_18=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:4794:3: ( (lv_period_unit_20_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:4795:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:4795:4: (lv_period_unit_20_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:4796:5: lv_period_unit_20_0= ruleGSSConfigUnit
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_97); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:4817:3: ( (lv_level1_22_0= ruleGSSConfigLevel1 ) )
            // InternalCONFIG.g:4818:4: (lv_level1_22_0= ruleGSSConfigLevel1 )
            {
            // InternalCONFIG.g:4818:4: (lv_level1_22_0= ruleGSSConfigLevel1 )
            // InternalCONFIG.g:4819:5: lv_level1_22_0= ruleGSSConfigLevel1
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1GSSConfigLevel1ParserRuleCall_22_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_101);
            lv_level1_22_0=ruleGSSConfigLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"level1",
              						lv_level1_22_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel1");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4836:3: ( (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 ) )
            // InternalCONFIG.g:4837:4: (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 )
            {
            // InternalCONFIG.g:4837:4: (lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1 )
            // InternalCONFIG.g:4838:5: lv_app_to_level1_23_0= ruleGSSConfigAppToLevel1
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getApp_to_level1GSSConfigAppToLevel1ParserRuleCall_23_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_99);
            lv_app_to_level1_23_0=ruleGSSConfigAppToLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"app_to_level1",
              						lv_app_to_level1_23_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAppToLevel1");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4855:3: ( (lv_level0_24_0= ruleGSSConfigLevel0 ) )
            // InternalCONFIG.g:4856:4: (lv_level0_24_0= ruleGSSConfigLevel0 )
            {
            // InternalCONFIG.g:4856:4: (lv_level0_24_0= ruleGSSConfigLevel0 )
            // InternalCONFIG.g:4857:5: lv_level0_24_0= ruleGSSConfigLevel0
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel0GSSConfigLevel0ParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_100);
            lv_level0_24_0=ruleGSSConfigLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"level0",
              						lv_level0_24_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel0");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:4874:3: ( (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 ) )
            // InternalCONFIG.g:4875:4: (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 )
            {
            // InternalCONFIG.g:4875:4: (lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0 )
            // InternalCONFIG.g:4876:5: lv_level1_to_level0_25_0= ruleGSSConfigLevel1ToLevel0
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel1Access().getLevel1_to_level0GSSConfigLevel1ToLevel0ParserRuleCall_25_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_level1_to_level0_25_0=ruleGSSConfigLevel1ToLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel1Rule());
              					}
              					set(
              						current,
              						"level1_to_level0",
              						lv_level1_to_level0_25_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel1ToLevel0");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_26=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getRightCurlyBracketKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSConfigPeriodicTCLevel1Access().getSemicolonKeyword_27());
              		
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
    // InternalCONFIG.g:4912:1: ruleGSSConfigPeriodicTCLevel0 returns [EObject current=null] : (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level0_22_0= ruleGSSConfigLevel0 ) ) ( (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 ) ) otherlv_24= '}' otherlv_25= ';' ) ;
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
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_id_8_0 = null;

        AntlrDatatypeRuleToken lv_ifRef_12_0 = null;

        AntlrDatatypeRuleToken lv_period_value_16_0 = null;

        Enumerator lv_period_unit_20_0 = null;

        EObject lv_level0_22_0 = null;

        EObject lv_app_to_level0_23_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:4918:2: ( (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level0_22_0= ruleGSSConfigLevel0 ) ) ( (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 ) ) otherlv_24= '}' otherlv_25= ';' ) )
            // InternalCONFIG.g:4919:2: (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level0_22_0= ruleGSSConfigLevel0 ) ) ( (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 ) ) otherlv_24= '}' otherlv_25= ';' )
            {
            // InternalCONFIG.g:4919:2: (otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level0_22_0= ruleGSSConfigLevel0 ) ) ( (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 ) ) otherlv_24= '}' otherlv_25= ';' )
            // InternalCONFIG.g:4920:3: otherlv_0= 'GSSConfigPeriodicTCLevel0' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'ifRef' otherlv_11= ':=' ( (lv_ifRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'period_value' otherlv_15= ':=' ( (lv_period_value_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'period_unit' otherlv_19= ':=' ( (lv_period_unit_20_0= ruleGSSConfigUnit ) ) otherlv_21= ';' ( (lv_level0_22_0= ruleGSSConfigLevel0 ) ) ( (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 ) ) otherlv_24= '}' otherlv_25= ';'
            {
            otherlv_0=(Token)match(input,92,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getGSSConfigPeriodicTCLevel0Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:4936:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:4937:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:4937:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:4938:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getIfRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
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
            otherlv_14=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
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
            otherlv_18=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getPeriod_unitKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_83); if (state.failed) return current;
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_99); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_21());
              		
            }
            // InternalCONFIG.g:5082:3: ( (lv_level0_22_0= ruleGSSConfigLevel0 ) )
            // InternalCONFIG.g:5083:4: (lv_level0_22_0= ruleGSSConfigLevel0 )
            {
            // InternalCONFIG.g:5083:4: (lv_level0_22_0= ruleGSSConfigLevel0 )
            // InternalCONFIG.g:5084:5: lv_level0_22_0= ruleGSSConfigLevel0
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getLevel0GSSConfigLevel0ParserRuleCall_22_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_102);
            lv_level0_22_0=ruleGSSConfigLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"level0",
              						lv_level0_22_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigLevel0");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCONFIG.g:5101:3: ( (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 ) )
            // InternalCONFIG.g:5102:4: (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 )
            {
            // InternalCONFIG.g:5102:4: (lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0 )
            // InternalCONFIG.g:5103:5: lv_app_to_level0_23_0= ruleGSSConfigAppToLevel0
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigPeriodicTCLevel0Access().getApp_to_level0GSSConfigAppToLevel0ParserRuleCall_23_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_app_to_level0_23_0=ruleGSSConfigAppToLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigPeriodicTCLevel0Rule());
              					}
              					set(
              						current,
              						"app_to_level0",
              						lv_app_to_level0_23_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.GSSConfigAppToLevel0");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_24=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_24, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSConfigPeriodicTCLevel0Access().getSemicolonKeyword_25());
              		
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


    // $ANTLR start "entryRuleGSSConfigLevel2"
    // InternalCONFIG.g:5132:1: entryRuleGSSConfigLevel2 returns [EObject current=null] : iv_ruleGSSConfigLevel2= ruleGSSConfigLevel2 EOF ;
    public final EObject entryRuleGSSConfigLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevel2 = null;


        try {
            // InternalCONFIG.g:5132:56: (iv_ruleGSSConfigLevel2= ruleGSSConfigLevel2 EOF )
            // InternalCONFIG.g:5133:2: iv_ruleGSSConfigLevel2= ruleGSSConfigLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevel2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevel2=ruleGSSConfigLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevel2; 
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
    // $ANTLR end "entryRuleGSSConfigLevel2"


    // $ANTLR start "ruleGSSConfigLevel2"
    // InternalCONFIG.g:5139:1: ruleGSSConfigLevel2 returns [EObject current=null] : (otherlv_0= 'GSSConfigLevel2' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_format_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5145:2: ( (otherlv_0= 'GSSConfigLevel2' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5146:2: (otherlv_0= 'GSSConfigLevel2' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5146:2: (otherlv_0= 'GSSConfigLevel2' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5147:3: otherlv_0= 'GSSConfigLevel2' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,93,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevel2Access().getGSSConfigLevel2Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevel2Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevel2Access().getFormatKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevel2Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5163:3: ( (lv_format_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5164:4: (lv_format_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5164:4: (lv_format_4_0= ruleXMLREF )
            // InternalCONFIG.g:5165:5: lv_format_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevel2Access().getFormatXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_format_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevel2Rule());
              					}
              					set(
              						current,
              						"format",
              						lv_format_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevel2Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevel2Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevel2Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigLevel2"


    // $ANTLR start "entryRuleGSSConfigLevel1"
    // InternalCONFIG.g:5198:1: entryRuleGSSConfigLevel1 returns [EObject current=null] : iv_ruleGSSConfigLevel1= ruleGSSConfigLevel1 EOF ;
    public final EObject entryRuleGSSConfigLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevel1 = null;


        try {
            // InternalCONFIG.g:5198:56: (iv_ruleGSSConfigLevel1= ruleGSSConfigLevel1 EOF )
            // InternalCONFIG.g:5199:2: iv_ruleGSSConfigLevel1= ruleGSSConfigLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevel1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevel1=ruleGSSConfigLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevel1; 
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
    // $ANTLR end "entryRuleGSSConfigLevel1"


    // $ANTLR start "ruleGSSConfigLevel1"
    // InternalCONFIG.g:5205:1: ruleGSSConfigLevel1 returns [EObject current=null] : (otherlv_0= 'GSSConfigLevel1' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_format_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5211:2: ( (otherlv_0= 'GSSConfigLevel1' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5212:2: (otherlv_0= 'GSSConfigLevel1' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5212:2: (otherlv_0= 'GSSConfigLevel1' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5213:3: otherlv_0= 'GSSConfigLevel1' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,95,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevel1Access().getGSSConfigLevel1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevel1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevel1Access().getFormatKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevel1Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5229:3: ( (lv_format_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5230:4: (lv_format_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5230:4: (lv_format_4_0= ruleXMLREF )
            // InternalCONFIG.g:5231:5: lv_format_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevel1Access().getFormatXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_format_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevel1Rule());
              					}
              					set(
              						current,
              						"format",
              						lv_format_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevel1Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevel1Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevel1Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigLevel1"


    // $ANTLR start "entryRuleGSSConfigLevel0"
    // InternalCONFIG.g:5264:1: entryRuleGSSConfigLevel0 returns [EObject current=null] : iv_ruleGSSConfigLevel0= ruleGSSConfigLevel0 EOF ;
    public final EObject entryRuleGSSConfigLevel0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevel0 = null;


        try {
            // InternalCONFIG.g:5264:56: (iv_ruleGSSConfigLevel0= ruleGSSConfigLevel0 EOF )
            // InternalCONFIG.g:5265:2: iv_ruleGSSConfigLevel0= ruleGSSConfigLevel0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevel0Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevel0=ruleGSSConfigLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevel0; 
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
    // $ANTLR end "entryRuleGSSConfigLevel0"


    // $ANTLR start "ruleGSSConfigLevel0"
    // InternalCONFIG.g:5271:1: ruleGSSConfigLevel0 returns [EObject current=null] : (otherlv_0= 'GSSConfigLevel0' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigLevel0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_format_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5277:2: ( (otherlv_0= 'GSSConfigLevel0' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5278:2: (otherlv_0= 'GSSConfigLevel0' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5278:2: (otherlv_0= 'GSSConfigLevel0' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5279:3: otherlv_0= 'GSSConfigLevel0' otherlv_1= '{' otherlv_2= 'format' otherlv_3= ':=' ( (lv_format_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,96,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevel0Access().getGSSConfigLevel0Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevel0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,94,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevel0Access().getFormatKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevel0Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5295:3: ( (lv_format_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5296:4: (lv_format_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5296:4: (lv_format_4_0= ruleXMLREF )
            // InternalCONFIG.g:5297:5: lv_format_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevel0Access().getFormatXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_format_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevel0Rule());
              					}
              					set(
              						current,
              						"format",
              						lv_format_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevel0Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevel0Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevel0Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigLevel0"


    // $ANTLR start "entryRuleGSSConfigAppToLevel2"
    // InternalCONFIG.g:5330:1: entryRuleGSSConfigAppToLevel2 returns [EObject current=null] : iv_ruleGSSConfigAppToLevel2= ruleGSSConfigAppToLevel2 EOF ;
    public final EObject entryRuleGSSConfigAppToLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigAppToLevel2 = null;


        try {
            // InternalCONFIG.g:5330:61: (iv_ruleGSSConfigAppToLevel2= ruleGSSConfigAppToLevel2 EOF )
            // InternalCONFIG.g:5331:2: iv_ruleGSSConfigAppToLevel2= ruleGSSConfigAppToLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigAppToLevel2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigAppToLevel2=ruleGSSConfigAppToLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigAppToLevel2; 
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
    // $ANTLR end "entryRuleGSSConfigAppToLevel2"


    // $ANTLR start "ruleGSSConfigAppToLevel2"
    // InternalCONFIG.g:5337:1: ruleGSSConfigAppToLevel2 returns [EObject current=null] : (otherlv_0= 'GSSConfigAppToLevel2' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigAppToLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_export_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5343:2: ( (otherlv_0= 'GSSConfigAppToLevel2' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5344:2: (otherlv_0= 'GSSConfigAppToLevel2' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5344:2: (otherlv_0= 'GSSConfigAppToLevel2' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5345:3: otherlv_0= 'GSSConfigAppToLevel2' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,97,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAppToLevel2Access().getGSSConfigAppToLevel2Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAppToLevel2Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,98,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAppToLevel2Access().getExportKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAppToLevel2Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5361:3: ( (lv_export_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5362:4: (lv_export_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5362:4: (lv_export_4_0= ruleXMLREF )
            // InternalCONFIG.g:5363:5: lv_export_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigAppToLevel2Access().getExportXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_export_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigAppToLevel2Rule());
              					}
              					set(
              						current,
              						"export",
              						lv_export_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAppToLevel2Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAppToLevel2Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAppToLevel2Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigAppToLevel2"


    // $ANTLR start "entryRuleGSSConfigAppToLevel1"
    // InternalCONFIG.g:5396:1: entryRuleGSSConfigAppToLevel1 returns [EObject current=null] : iv_ruleGSSConfigAppToLevel1= ruleGSSConfigAppToLevel1 EOF ;
    public final EObject entryRuleGSSConfigAppToLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigAppToLevel1 = null;


        try {
            // InternalCONFIG.g:5396:61: (iv_ruleGSSConfigAppToLevel1= ruleGSSConfigAppToLevel1 EOF )
            // InternalCONFIG.g:5397:2: iv_ruleGSSConfigAppToLevel1= ruleGSSConfigAppToLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigAppToLevel1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigAppToLevel1=ruleGSSConfigAppToLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigAppToLevel1; 
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
    // $ANTLR end "entryRuleGSSConfigAppToLevel1"


    // $ANTLR start "ruleGSSConfigAppToLevel1"
    // InternalCONFIG.g:5403:1: ruleGSSConfigAppToLevel1 returns [EObject current=null] : (otherlv_0= 'GSSConfigAppToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigAppToLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_export_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5409:2: ( (otherlv_0= 'GSSConfigAppToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5410:2: (otherlv_0= 'GSSConfigAppToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5410:2: (otherlv_0= 'GSSConfigAppToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5411:3: otherlv_0= 'GSSConfigAppToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,99,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAppToLevel1Access().getGSSConfigAppToLevel1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAppToLevel1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,98,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAppToLevel1Access().getExportKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAppToLevel1Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5427:3: ( (lv_export_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5428:4: (lv_export_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5428:4: (lv_export_4_0= ruleXMLREF )
            // InternalCONFIG.g:5429:5: lv_export_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigAppToLevel1Access().getExportXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_export_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigAppToLevel1Rule());
              					}
              					set(
              						current,
              						"export",
              						lv_export_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAppToLevel1Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAppToLevel1Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAppToLevel1Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigAppToLevel1"


    // $ANTLR start "entryRuleGSSConfigAppToLevel0"
    // InternalCONFIG.g:5462:1: entryRuleGSSConfigAppToLevel0 returns [EObject current=null] : iv_ruleGSSConfigAppToLevel0= ruleGSSConfigAppToLevel0 EOF ;
    public final EObject entryRuleGSSConfigAppToLevel0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigAppToLevel0 = null;


        try {
            // InternalCONFIG.g:5462:61: (iv_ruleGSSConfigAppToLevel0= ruleGSSConfigAppToLevel0 EOF )
            // InternalCONFIG.g:5463:2: iv_ruleGSSConfigAppToLevel0= ruleGSSConfigAppToLevel0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigAppToLevel0Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigAppToLevel0=ruleGSSConfigAppToLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigAppToLevel0; 
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
    // $ANTLR end "entryRuleGSSConfigAppToLevel0"


    // $ANTLR start "ruleGSSConfigAppToLevel0"
    // InternalCONFIG.g:5469:1: ruleGSSConfigAppToLevel0 returns [EObject current=null] : (otherlv_0= 'GSSConfigAppToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigAppToLevel0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_export_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5475:2: ( (otherlv_0= 'GSSConfigAppToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5476:2: (otherlv_0= 'GSSConfigAppToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5476:2: (otherlv_0= 'GSSConfigAppToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5477:3: otherlv_0= 'GSSConfigAppToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,100,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAppToLevel0Access().getGSSConfigAppToLevel0Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAppToLevel0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,98,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAppToLevel0Access().getExportKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAppToLevel0Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5493:3: ( (lv_export_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5494:4: (lv_export_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5494:4: (lv_export_4_0= ruleXMLREF )
            // InternalCONFIG.g:5495:5: lv_export_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigAppToLevel0Access().getExportXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_export_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigAppToLevel0Rule());
              					}
              					set(
              						current,
              						"export",
              						lv_export_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAppToLevel0Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAppToLevel0Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAppToLevel0Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigAppToLevel0"


    // $ANTLR start "entryRuleGSSConfigLevel2ToLevel1"
    // InternalCONFIG.g:5528:1: entryRuleGSSConfigLevel2ToLevel1 returns [EObject current=null] : iv_ruleGSSConfigLevel2ToLevel1= ruleGSSConfigLevel2ToLevel1 EOF ;
    public final EObject entryRuleGSSConfigLevel2ToLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevel2ToLevel1 = null;


        try {
            // InternalCONFIG.g:5528:64: (iv_ruleGSSConfigLevel2ToLevel1= ruleGSSConfigLevel2ToLevel1 EOF )
            // InternalCONFIG.g:5529:2: iv_ruleGSSConfigLevel2ToLevel1= ruleGSSConfigLevel2ToLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevel2ToLevel1Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevel2ToLevel1=ruleGSSConfigLevel2ToLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevel2ToLevel1; 
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
    // $ANTLR end "entryRuleGSSConfigLevel2ToLevel1"


    // $ANTLR start "ruleGSSConfigLevel2ToLevel1"
    // InternalCONFIG.g:5535:1: ruleGSSConfigLevel2ToLevel1 returns [EObject current=null] : (otherlv_0= 'GSSConfigLevel2ToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigLevel2ToLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_export_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5541:2: ( (otherlv_0= 'GSSConfigLevel2ToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5542:2: (otherlv_0= 'GSSConfigLevel2ToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5542:2: (otherlv_0= 'GSSConfigLevel2ToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5543:3: otherlv_0= 'GSSConfigLevel2ToLevel1' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,101,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevel2ToLevel1Access().getGSSConfigLevel2ToLevel1Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevel2ToLevel1Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,98,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevel2ToLevel1Access().getExportKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevel2ToLevel1Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5559:3: ( (lv_export_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5560:4: (lv_export_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5560:4: (lv_export_4_0= ruleXMLREF )
            // InternalCONFIG.g:5561:5: lv_export_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevel2ToLevel1Access().getExportXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_export_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevel2ToLevel1Rule());
              					}
              					set(
              						current,
              						"export",
              						lv_export_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevel2ToLevel1Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevel2ToLevel1Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevel2ToLevel1Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigLevel2ToLevel1"


    // $ANTLR start "entryRuleGSSConfigLevel1ToLevel0"
    // InternalCONFIG.g:5594:1: entryRuleGSSConfigLevel1ToLevel0 returns [EObject current=null] : iv_ruleGSSConfigLevel1ToLevel0= ruleGSSConfigLevel1ToLevel0 EOF ;
    public final EObject entryRuleGSSConfigLevel1ToLevel0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigLevel1ToLevel0 = null;


        try {
            // InternalCONFIG.g:5594:64: (iv_ruleGSSConfigLevel1ToLevel0= ruleGSSConfigLevel1ToLevel0 EOF )
            // InternalCONFIG.g:5595:2: iv_ruleGSSConfigLevel1ToLevel0= ruleGSSConfigLevel1ToLevel0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSConfigLevel1ToLevel0Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSConfigLevel1ToLevel0=ruleGSSConfigLevel1ToLevel0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSConfigLevel1ToLevel0; 
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
    // $ANTLR end "entryRuleGSSConfigLevel1ToLevel0"


    // $ANTLR start "ruleGSSConfigLevel1ToLevel0"
    // InternalCONFIG.g:5601:1: ruleGSSConfigLevel1ToLevel0 returns [EObject current=null] : (otherlv_0= 'GSSConfigLevel1ToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSConfigLevel1ToLevel0() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_export_4_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:5607:2: ( (otherlv_0= 'GSSConfigLevel1ToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalCONFIG.g:5608:2: (otherlv_0= 'GSSConfigLevel1ToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalCONFIG.g:5608:2: (otherlv_0= 'GSSConfigLevel1ToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalCONFIG.g:5609:3: otherlv_0= 'GSSConfigLevel1ToLevel0' otherlv_1= '{' otherlv_2= 'export' otherlv_3= ':=' ( (lv_export_4_0= ruleXMLREF ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,102,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigLevel1ToLevel0Access().getGSSConfigLevel1ToLevel0Keyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigLevel1ToLevel0Access().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,98,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigLevel1ToLevel0Access().getExportKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigLevel1ToLevel0Access().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5625:3: ( (lv_export_4_0= ruleXMLREF ) )
            // InternalCONFIG.g:5626:4: (lv_export_4_0= ruleXMLREF )
            {
            // InternalCONFIG.g:5626:4: (lv_export_4_0= ruleXMLREF )
            // InternalCONFIG.g:5627:5: lv_export_4_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigLevel1ToLevel0Access().getExportXMLREFParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_export_4_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigLevel1ToLevel0Rule());
              					}
              					set(
              						current,
              						"export",
              						lv_export_4_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigLevel1ToLevel0Access().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigLevel1ToLevel0Access().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigLevel1ToLevel0Access().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSConfigLevel1ToLevel0"


    // $ANTLR start "entryRuleGSSConfigGlobalVar"
    // InternalCONFIG.g:5660:1: entryRuleGSSConfigGlobalVar returns [EObject current=null] : iv_ruleGSSConfigGlobalVar= ruleGSSConfigGlobalVar EOF ;
    public final EObject entryRuleGSSConfigGlobalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGlobalVar = null;


        try {
            // InternalCONFIG.g:5660:59: (iv_ruleGSSConfigGlobalVar= ruleGSSConfigGlobalVar EOF )
            // InternalCONFIG.g:5661:2: iv_ruleGSSConfigGlobalVar= ruleGSSConfigGlobalVar EOF
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
    // InternalCONFIG.g:5667:1: ruleGSSConfigGlobalVar returns [EObject current=null] : (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' ) ;
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
            // InternalCONFIG.g:5673:2: ( (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' ) )
            // InternalCONFIG.g:5674:2: (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalCONFIG.g:5674:2: (otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';' )
            // InternalCONFIG.g:5675:3: otherlv_0= 'GSSConfigGlobalVar' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'id' otherlv_7= ':=' ( (lv_id_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'type' otherlv_11= ':=' ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) ) otherlv_13= ';' otherlv_14= 'initial_value' otherlv_15= ':=' ( (lv_initial_value_16_0= ruleINTEGER ) ) otherlv_17= ';' ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) ) otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,103,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGlobalVarAccess().getGSSConfigGlobalVarKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGlobalVarAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGlobalVarAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5691:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:5692:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:5692:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:5693:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigGlobalVarAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigGlobalVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigGlobalVarAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,46,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGlobalVarAccess().getIdKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:5721:3: ( (lv_id_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:5722:4: (lv_id_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5722:4: (lv_id_8_0= ruleINTEGER )
            // InternalCONFIG.g:5723:5: lv_id_8_0= ruleINTEGER
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
            otherlv_10=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGlobalVarAccess().getTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:5752:3: ( (lv_type_12_0= ruleGSSConfigGlobalVarType ) )
            // InternalCONFIG.g:5753:4: (lv_type_12_0= ruleGSSConfigGlobalVarType )
            {
            // InternalCONFIG.g:5753:4: (lv_type_12_0= ruleGSSConfigGlobalVarType )
            // InternalCONFIG.g:5754:5: lv_type_12_0= ruleGSSConfigGlobalVarType
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
            otherlv_14=(Token)match(input,105,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigGlobalVarAccess().getInitial_valueKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigGlobalVarAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:5783:3: ( (lv_initial_value_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:5784:4: (lv_initial_value_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5784:4: (lv_initial_value_16_0= ruleINTEGER )
            // InternalCONFIG.g:5785:5: lv_initial_value_16_0= ruleINTEGER
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
            // InternalCONFIG.g:5806:3: ( ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) ) | ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) ) | ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt30=1;
                }
                break;
            case 110:
                {
                alt30=2;
                }
                break;
            case 112:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalCONFIG.g:5807:4: ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) )
                    {
                    // InternalCONFIG.g:5807:4: ( (lv_referenceField_18_0= ruleGSSConfigReferenceField ) )
                    // InternalCONFIG.g:5808:5: (lv_referenceField_18_0= ruleGSSConfigReferenceField )
                    {
                    // InternalCONFIG.g:5808:5: (lv_referenceField_18_0= ruleGSSConfigReferenceField )
                    // InternalCONFIG.g:5809:6: lv_referenceField_18_0= ruleGSSConfigReferenceField
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
                    // InternalCONFIG.g:5827:4: ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) )
                    {
                    // InternalCONFIG.g:5827:4: ( (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC ) )
                    // InternalCONFIG.g:5828:5: (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC )
                    {
                    // InternalCONFIG.g:5828:5: (lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC )
                    // InternalCONFIG.g:5829:6: lv_referencePeriodicTC_19_0= ruleGSSConfigReferencePeriodicTC
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
                    // InternalCONFIG.g:5847:4: ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) )
                    {
                    // InternalCONFIG.g:5847:4: ( (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket ) )
                    // InternalCONFIG.g:5848:5: (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket )
                    {
                    // InternalCONFIG.g:5848:5: (lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket )
                    // InternalCONFIG.g:5849:6: lv_referenceSpecialPacket_20_0= ruleGSSConfigReferenceSpecialPacket
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
    // InternalCONFIG.g:5879:1: entryRuleGSSConfigReferenceField returns [EObject current=null] : iv_ruleGSSConfigReferenceField= ruleGSSConfigReferenceField EOF ;
    public final EObject entryRuleGSSConfigReferenceField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigReferenceField = null;


        try {
            // InternalCONFIG.g:5879:64: (iv_ruleGSSConfigReferenceField= ruleGSSConfigReferenceField EOF )
            // InternalCONFIG.g:5880:2: iv_ruleGSSConfigReferenceField= ruleGSSConfigReferenceField EOF
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
    // InternalCONFIG.g:5886:1: ruleGSSConfigReferenceField returns [EObject current=null] : (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) ;
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
            // InternalCONFIG.g:5892:2: ( (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' ) )
            // InternalCONFIG.g:5893:2: (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalCONFIG.g:5893:2: (otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';' )
            // InternalCONFIG.g:5894:3: otherlv_0= 'GSSConfigReferenceField' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'level' otherlv_11= ':=' ( (lv_level_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'fieldRef' otherlv_15= ':=' ( (lv_fieldRef_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'offset' otherlv_19= ':=' ( (lv_offset_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= 'size' otherlv_23= ':=' ( (lv_size_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,106,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferenceFieldAccess().getGSSConfigReferenceFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferenceFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferenceFieldAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:5910:3: ( (lv_type_4_0= ruleGSSConfigReferenceFieldType ) )
            // InternalCONFIG.g:5911:4: (lv_type_4_0= ruleGSSConfigReferenceFieldType )
            {
            // InternalCONFIG.g:5911:4: (lv_type_4_0= ruleGSSConfigReferenceFieldType )
            // InternalCONFIG.g:5912:5: lv_type_4_0= ruleGSSConfigReferenceFieldType
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,68,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferenceFieldAccess().getIfRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:5941:3: ( (lv_ifRef_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:5942:4: (lv_ifRef_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5942:4: (lv_ifRef_8_0= ruleINTEGER )
            // InternalCONFIG.g:5943:5: lv_ifRef_8_0= ruleINTEGER
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigReferenceFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferenceFieldAccess().getLevelKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:5972:3: ( (lv_level_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:5973:4: (lv_level_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:5973:4: (lv_level_12_0= ruleINTEGER )
            // InternalCONFIG.g:5974:5: lv_level_12_0= ruleINTEGER
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
            otherlv_14=(Token)match(input,107,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferenceFieldAccess().getFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:6003:3: ( (lv_fieldRef_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:6004:4: (lv_fieldRef_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6004:4: (lv_fieldRef_16_0= ruleINTEGER )
            // InternalCONFIG.g:6005:5: lv_fieldRef_16_0= ruleINTEGER
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
            otherlv_18=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferenceFieldAccess().getOffsetKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:6034:3: ( (lv_offset_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:6035:4: (lv_offset_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6035:4: (lv_offset_20_0= ruleINTEGER )
            // InternalCONFIG.g:6036:5: lv_offset_20_0= ruleINTEGER
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
            otherlv_22=(Token)match(input,109,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSConfigReferenceFieldAccess().getSizeKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSConfigReferenceFieldAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalCONFIG.g:6065:3: ( (lv_size_24_0= ruleINTEGER ) )
            // InternalCONFIG.g:6066:4: (lv_size_24_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6066:4: (lv_size_24_0= ruleINTEGER )
            // InternalCONFIG.g:6067:5: lv_size_24_0= ruleINTEGER
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
    // InternalCONFIG.g:6100:1: entryRuleGSSConfigReferencePeriodicTC returns [EObject current=null] : iv_ruleGSSConfigReferencePeriodicTC= ruleGSSConfigReferencePeriodicTC EOF ;
    public final EObject entryRuleGSSConfigReferencePeriodicTC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigReferencePeriodicTC = null;


        try {
            // InternalCONFIG.g:6100:69: (iv_ruleGSSConfigReferencePeriodicTC= ruleGSSConfigReferencePeriodicTC EOF )
            // InternalCONFIG.g:6101:2: iv_ruleGSSConfigReferencePeriodicTC= ruleGSSConfigReferencePeriodicTC EOF
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
    // InternalCONFIG.g:6107:1: ruleGSSConfigReferencePeriodicTC returns [EObject current=null] : (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalCONFIG.g:6113:2: ( (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalCONFIG.g:6114:2: (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalCONFIG.g:6114:2: (otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalCONFIG.g:6115:3: otherlv_0= 'GSSConfigReferencePeriodicTC' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,110,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getGSSConfigReferencePeriodicTCKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,111,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6131:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:6132:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6132:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:6133:5: lv_idRef_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6162:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:6163:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6163:4: (lv_level_8_0= ruleINTEGER )
            // InternalCONFIG.g:6164:5: lv_level_8_0= ruleINTEGER
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
            otherlv_10=(Token)match(input,107,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:6193:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:6194:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6194:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:6195:5: lv_fieldRef_12_0= ruleINTEGER
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
            otherlv_14=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:6224:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:6225:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6225:4: (lv_offset_16_0= ruleINTEGER )
            // InternalCONFIG.g:6226:5: lv_offset_16_0= ruleINTEGER
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
            otherlv_18=(Token)match(input,109,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferencePeriodicTCAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:6255:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:6256:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6256:4: (lv_size_20_0= ruleINTEGER )
            // InternalCONFIG.g:6257:5: lv_size_20_0= ruleINTEGER
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
    // InternalCONFIG.g:6290:1: entryRuleGSSConfigReferenceSpecialPacket returns [EObject current=null] : iv_ruleGSSConfigReferenceSpecialPacket= ruleGSSConfigReferenceSpecialPacket EOF ;
    public final EObject entryRuleGSSConfigReferenceSpecialPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigReferenceSpecialPacket = null;


        try {
            // InternalCONFIG.g:6290:72: (iv_ruleGSSConfigReferenceSpecialPacket= ruleGSSConfigReferenceSpecialPacket EOF )
            // InternalCONFIG.g:6291:2: iv_ruleGSSConfigReferenceSpecialPacket= ruleGSSConfigReferenceSpecialPacket EOF
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
    // InternalCONFIG.g:6297:1: ruleGSSConfigReferenceSpecialPacket returns [EObject current=null] : (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalCONFIG.g:6303:2: ( (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalCONFIG.g:6304:2: (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalCONFIG.g:6304:2: (otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalCONFIG.g:6305:3: otherlv_0= 'GSSConfigReferenceSpecialPacket' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'level' otherlv_7= ':=' ( (lv_level_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'fieldRef' otherlv_11= ':=' ( (lv_fieldRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,112,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getGSSConfigReferenceSpecialPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,111,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6321:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:6322:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6322:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:6323:5: lv_idRef_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_90); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,85,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getLevelKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6352:3: ( (lv_level_8_0= ruleINTEGER ) )
            // InternalCONFIG.g:6353:4: (lv_level_8_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6353:4: (lv_level_8_0= ruleINTEGER )
            // InternalCONFIG.g:6354:5: lv_level_8_0= ruleINTEGER
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
            otherlv_10=(Token)match(input,107,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:6383:3: ( (lv_fieldRef_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:6384:4: (lv_fieldRef_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6384:4: (lv_fieldRef_12_0= ruleINTEGER )
            // InternalCONFIG.g:6385:5: lv_fieldRef_12_0= ruleINTEGER
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
            otherlv_14=(Token)match(input,108,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getOffsetKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalCONFIG.g:6414:3: ( (lv_offset_16_0= ruleINTEGER ) )
            // InternalCONFIG.g:6415:4: (lv_offset_16_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6415:4: (lv_offset_16_0= ruleINTEGER )
            // InternalCONFIG.g:6416:5: lv_offset_16_0= ruleINTEGER
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
            otherlv_18=(Token)match(input,109,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getSizeKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSConfigReferenceSpecialPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalCONFIG.g:6445:3: ( (lv_size_20_0= ruleINTEGER ) )
            // InternalCONFIG.g:6446:4: (lv_size_20_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6446:4: (lv_size_20_0= ruleINTEGER )
            // InternalCONFIG.g:6447:5: lv_size_20_0= ruleINTEGER
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
    // InternalCONFIG.g:6480:1: entryRuleGSSConfigPlot returns [EObject current=null] : iv_ruleGSSConfigPlot= ruleGSSConfigPlot EOF ;
    public final EObject entryRuleGSSConfigPlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigPlot = null;


        try {
            // InternalCONFIG.g:6480:54: (iv_ruleGSSConfigPlot= ruleGSSConfigPlot EOF )
            // InternalCONFIG.g:6481:2: iv_ruleGSSConfigPlot= ruleGSSConfigPlot EOF
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
    // InternalCONFIG.g:6487:1: ruleGSSConfigPlot returns [EObject current=null] : (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' ) ;
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
            // InternalCONFIG.g:6493:2: ( (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' ) )
            // InternalCONFIG.g:6494:2: (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' )
            {
            // InternalCONFIG.g:6494:2: (otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';' )
            // InternalCONFIG.g:6495:3: otherlv_0= 'GSSConfigPlot' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_8= '}' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,113,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigPlotAccess().getGSSConfigPlotKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigPlotAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigPlotAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigPlotAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6511:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:6512:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:6512:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:6513:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigPlotAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigPlotRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigPlotAccess().getSemicolonKeyword_5());
              		
            }
            // InternalCONFIG.g:6533:3: ( ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==119) ) {
                alt31=1;
            }
            else if ( (LA31_0==122) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalCONFIG.g:6534:4: ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:6534:4: ( (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:6535:5: (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:6535:5: (lv_GVFiltered_6_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:6536:6: lv_GVFiltered_6_0= ruleGSSConfigGVFiltered
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
                    // InternalCONFIG.g:6554:4: ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:6554:4: ( (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:6555:5: (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:6555:5: (lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:6556:6: lv_GVPeriodic_7_0= ruleGSSConfigGVPeriodic
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
    // InternalCONFIG.g:6586:1: entryRuleGSSConfigAlarmMsg returns [EObject current=null] : iv_ruleGSSConfigAlarmMsg= ruleGSSConfigAlarmMsg EOF ;
    public final EObject entryRuleGSSConfigAlarmMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigAlarmMsg = null;


        try {
            // InternalCONFIG.g:6586:58: (iv_ruleGSSConfigAlarmMsg= ruleGSSConfigAlarmMsg EOF )
            // InternalCONFIG.g:6587:2: iv_ruleGSSConfigAlarmMsg= ruleGSSConfigAlarmMsg EOF
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
    // InternalCONFIG.g:6593:1: ruleGSSConfigAlarmMsg returns [EObject current=null] : (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) ;
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
            // InternalCONFIG.g:6599:2: ( (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) )
            // InternalCONFIG.g:6600:2: (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalCONFIG.g:6600:2: (otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            // InternalCONFIG.g:6601:3: otherlv_0= 'GSSConfigAlarmMsg' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) ) otherlv_9= ';' otherlv_10= 'text' otherlv_11= ':=' ( (lv_text_12_0= RULE_ID ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,114,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAlarmMsgAccess().getGSSConfigAlarmMsgKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAlarmMsgAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAlarmMsgAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6617:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:6618:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:6618:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:6619:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigAlarmMsgAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigAlarmMsgRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAlarmMsgAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAlarmMsgAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6647:3: ( (lv_type_8_0= ruleGSSConfigAlarmMsgType ) )
            // InternalCONFIG.g:6648:4: (lv_type_8_0= ruleGSSConfigAlarmMsgType )
            {
            // InternalCONFIG.g:6648:4: (lv_type_8_0= ruleGSSConfigAlarmMsgType )
            // InternalCONFIG.g:6649:5: lv_type_8_0= ruleGSSConfigAlarmMsgType
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
            otherlv_10=(Token)match(input,115,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigAlarmMsgAccess().getTextKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigAlarmMsgAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:6678:3: ( (lv_text_12_0= RULE_ID ) )
            // InternalCONFIG.g:6679:4: (lv_text_12_0= RULE_ID )
            {
            // InternalCONFIG.g:6679:4: (lv_text_12_0= RULE_ID )
            // InternalCONFIG.g:6680:5: lv_text_12_0= RULE_ID
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
            // InternalCONFIG.g:6700:3: ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==119) ) {
                alt32=1;
            }
            else if ( (LA32_0==122) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCONFIG.g:6701:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:6701:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:6702:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:6702:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:6703:6: lv_GVFiltered_14_0= ruleGSSConfigGVFiltered
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
                    // InternalCONFIG.g:6721:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:6721:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:6722:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:6722:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:6723:6: lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic
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
    // InternalCONFIG.g:6753:1: entryRuleGSSConfigModify returns [EObject current=null] : iv_ruleGSSConfigModify= ruleGSSConfigModify EOF ;
    public final EObject entryRuleGSSConfigModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigModify = null;


        try {
            // InternalCONFIG.g:6753:56: (iv_ruleGSSConfigModify= ruleGSSConfigModify EOF )
            // InternalCONFIG.g:6754:2: iv_ruleGSSConfigModify= ruleGSSConfigModify EOF
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
    // InternalCONFIG.g:6760:1: ruleGSSConfigModify returns [EObject current=null] : (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) ;
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
            // InternalCONFIG.g:6766:2: ( (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' ) )
            // InternalCONFIG.g:6767:2: (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalCONFIG.g:6767:2: (otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';' )
            // InternalCONFIG.g:6768:3: otherlv_0= 'GSSConfigModify' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigModifyType ) ) otherlv_9= ';' otherlv_10= 'value' otherlv_11= ':=' ( (lv_value_12_0= ruleINTEGER ) ) otherlv_13= ';' ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,116,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigModifyAccess().getGSSConfigModifyKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigModifyAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigModifyAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6784:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:6785:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:6785:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:6786:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigModifyAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigModifyRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigModifyAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigModifyAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6814:3: ( (lv_type_8_0= ruleGSSConfigModifyType ) )
            // InternalCONFIG.g:6815:4: (lv_type_8_0= ruleGSSConfigModifyType )
            {
            // InternalCONFIG.g:6815:4: (lv_type_8_0= ruleGSSConfigModifyType )
            // InternalCONFIG.g:6816:5: lv_type_8_0= ruleGSSConfigModifyType
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
            otherlv_10=(Token)match(input,117,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigModifyAccess().getValueKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigModifyAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalCONFIG.g:6845:3: ( (lv_value_12_0= ruleINTEGER ) )
            // InternalCONFIG.g:6846:4: (lv_value_12_0= ruleINTEGER )
            {
            // InternalCONFIG.g:6846:4: (lv_value_12_0= ruleINTEGER )
            // InternalCONFIG.g:6847:5: lv_value_12_0= ruleINTEGER
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
            // InternalCONFIG.g:6868:3: ( ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==119) ) {
                alt33=1;
            }
            else if ( (LA33_0==122) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalCONFIG.g:6869:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:6869:4: ( (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:6870:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:6870:5: (lv_GVFiltered_14_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:6871:6: lv_GVFiltered_14_0= ruleGSSConfigGVFiltered
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
                    // InternalCONFIG.g:6889:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:6889:4: ( (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:6890:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:6890:5: (lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:6891:6: lv_GVPeriodic_15_0= ruleGSSConfigGVPeriodic
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
    // InternalCONFIG.g:6921:1: entryRuleGSSConfigAlarmVal returns [EObject current=null] : iv_ruleGSSConfigAlarmVal= ruleGSSConfigAlarmVal EOF ;
    public final EObject entryRuleGSSConfigAlarmVal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigAlarmVal = null;


        try {
            // InternalCONFIG.g:6921:58: (iv_ruleGSSConfigAlarmVal= ruleGSSConfigAlarmVal EOF )
            // InternalCONFIG.g:6922:2: iv_ruleGSSConfigAlarmVal= ruleGSSConfigAlarmVal EOF
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
    // InternalCONFIG.g:6928:1: ruleGSSConfigAlarmVal returns [EObject current=null] : (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) ;
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
            // InternalCONFIG.g:6934:2: ( (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' ) )
            // InternalCONFIG.g:6935:2: (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalCONFIG.g:6935:2: (otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';' )
            // InternalCONFIG.g:6936:3: otherlv_0= 'GSSConfigAlarmVal' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSConfigAlarmValType ) ) otherlv_9= ';' ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) ) otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,118,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigAlarmValAccess().getGSSConfigAlarmValKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigAlarmValAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigAlarmValAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:6952:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:6953:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:6953:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:6954:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigAlarmValAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigAlarmValRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_105); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigAlarmValAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,104,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigAlarmValAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigAlarmValAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:6982:3: ( (lv_type_8_0= ruleGSSConfigAlarmValType ) )
            // InternalCONFIG.g:6983:4: (lv_type_8_0= ruleGSSConfigAlarmValType )
            {
            // InternalCONFIG.g:6983:4: (lv_type_8_0= ruleGSSConfigAlarmValType )
            // InternalCONFIG.g:6984:5: lv_type_8_0= ruleGSSConfigAlarmValType
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
            // InternalCONFIG.g:7005:3: ( ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) ) | ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==119) ) {
                alt34=1;
            }
            else if ( (LA34_0==122) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalCONFIG.g:7006:4: ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) )
                    {
                    // InternalCONFIG.g:7006:4: ( (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered ) )
                    // InternalCONFIG.g:7007:5: (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered )
                    {
                    // InternalCONFIG.g:7007:5: (lv_GVFiltered_10_0= ruleGSSConfigGVFiltered )
                    // InternalCONFIG.g:7008:6: lv_GVFiltered_10_0= ruleGSSConfigGVFiltered
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
                    // InternalCONFIG.g:7026:4: ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) )
                    {
                    // InternalCONFIG.g:7026:4: ( (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic ) )
                    // InternalCONFIG.g:7027:5: (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic )
                    {
                    // InternalCONFIG.g:7027:5: (lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic )
                    // InternalCONFIG.g:7028:6: lv_GVPeriodic_11_0= ruleGSSConfigGVPeriodic
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
    // InternalCONFIG.g:7058:1: entryRuleGSSConfigGVFiltered returns [EObject current=null] : iv_ruleGSSConfigGVFiltered= ruleGSSConfigGVFiltered EOF ;
    public final EObject entryRuleGSSConfigGVFiltered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGVFiltered = null;


        try {
            // InternalCONFIG.g:7058:60: (iv_ruleGSSConfigGVFiltered= ruleGSSConfigGVFiltered EOF )
            // InternalCONFIG.g:7059:2: iv_ruleGSSConfigGVFiltered= ruleGSSConfigGVFiltered EOF
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
    // InternalCONFIG.g:7065:1: ruleGSSConfigGVFiltered returns [EObject current=null] : (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'filter' otherlv_7= ':=' ( (lv_filter_8_0= ruleXMLREF ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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

        AntlrDatatypeRuleToken lv_filter_8_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:7071:2: ( (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'filter' otherlv_7= ':=' ( (lv_filter_8_0= ruleXMLREF ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCONFIG.g:7072:2: (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'filter' otherlv_7= ':=' ( (lv_filter_8_0= ruleXMLREF ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCONFIG.g:7072:2: (otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'filter' otherlv_7= ':=' ( (lv_filter_8_0= ruleXMLREF ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalCONFIG.g:7073:3: otherlv_0= 'GSSConfigGVFiltered' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' ( (lv_GlobalVarRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'filter' otherlv_7= ':=' ( (lv_filter_8_0= ruleXMLREF ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,119,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGVFilteredAccess().getGSSConfigGVFilteredKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGVFilteredAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,120,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGVFilteredAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:7089:3: ( (lv_GlobalVarRef_4_0= ruleINTEGER ) )
            // InternalCONFIG.g:7090:4: (lv_GlobalVarRef_4_0= ruleINTEGER )
            {
            // InternalCONFIG.g:7090:4: (lv_GlobalVarRef_4_0= ruleINTEGER )
            // InternalCONFIG.g:7091:5: lv_GlobalVarRef_4_0= ruleINTEGER
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
            otherlv_6=(Token)match(input,121,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigGVFilteredAccess().getFilterKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGVFilteredAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:7120:3: ( (lv_filter_8_0= ruleXMLREF ) )
            // InternalCONFIG.g:7121:4: (lv_filter_8_0= ruleXMLREF )
            {
            // InternalCONFIG.g:7121:4: (lv_filter_8_0= ruleXMLREF )
            // InternalCONFIG.g:7122:5: lv_filter_8_0= ruleXMLREF
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSConfigGVFilteredAccess().getFilterXMLREFParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_filter_8_0=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSConfigGVFilteredRule());
              					}
              					set(
              						current,
              						"filter",
              						lv_filter_8_0,
              						"es.uah.aut.srg.gss.lang.config.CONFIG.XMLREF");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSConfigGVFilteredAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGVFilteredAccess().getSemicolonKeyword_11());
              		
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
    // InternalCONFIG.g:7155:1: entryRuleGSSConfigGVPeriodic returns [EObject current=null] : iv_ruleGSSConfigGVPeriodic= ruleGSSConfigGVPeriodic EOF ;
    public final EObject entryRuleGSSConfigGVPeriodic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigGVPeriodic = null;


        try {
            // InternalCONFIG.g:7155:60: (iv_ruleGSSConfigGVPeriodic= ruleGSSConfigGVPeriodic EOF )
            // InternalCONFIG.g:7156:2: iv_ruleGSSConfigGVPeriodic= ruleGSSConfigGVPeriodic EOF
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
    // InternalCONFIG.g:7162:1: ruleGSSConfigGVPeriodic returns [EObject current=null] : (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' ) ;
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
            // InternalCONFIG.g:7168:2: ( (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' ) )
            // InternalCONFIG.g:7169:2: (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalCONFIG.g:7169:2: (otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';' )
            // InternalCONFIG.g:7170:3: otherlv_0= 'GSSConfigGVPeriodic' otherlv_1= '{' otherlv_2= 'GlobalVarRef' otherlv_3= ':=' otherlv_4= ':=' ( (lv_GlobalVarRef_5_0= ruleINTEGER ) ) otherlv_6= ';' otherlv_7= 'period_value' otherlv_8= ':=' ( (lv_period_value_9_0= ruleINTEGER ) ) otherlv_10= ';' otherlv_11= 'period_unit' otherlv_12= ':=' ( (lv_period_unit_13_0= ruleGSSConfigUnit ) ) otherlv_14= ';' otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,122,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigGVPeriodicAccess().getGSSConfigGVPeriodicKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigGVPeriodicAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,120,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigGVPeriodicAccess().getGlobalVarRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalCONFIG.g:7190:3: ( (lv_GlobalVarRef_5_0= ruleINTEGER ) )
            // InternalCONFIG.g:7191:4: (lv_GlobalVarRef_5_0= ruleINTEGER )
            {
            // InternalCONFIG.g:7191:4: (lv_GlobalVarRef_5_0= ruleINTEGER )
            // InternalCONFIG.g:7192:5: lv_GlobalVarRef_5_0= ruleINTEGER
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
            otherlv_7=(Token)match(input,89,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_valueKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_8());
              		
            }
            // InternalCONFIG.g:7221:3: ( (lv_period_value_9_0= ruleINTEGER ) )
            // InternalCONFIG.g:7222:4: (lv_period_value_9_0= ruleINTEGER )
            {
            // InternalCONFIG.g:7222:4: (lv_period_value_9_0= ruleINTEGER )
            // InternalCONFIG.g:7223:5: lv_period_value_9_0= ruleINTEGER
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
            otherlv_11=(Token)match(input,90,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSConfigGVPeriodicAccess().getPeriod_unitKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_83); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSConfigGVPeriodicAccess().getColonEqualsSignKeyword_12());
              		
            }
            // InternalCONFIG.g:7252:3: ( (lv_period_unit_13_0= ruleGSSConfigUnit ) )
            // InternalCONFIG.g:7253:4: (lv_period_unit_13_0= ruleGSSConfigUnit )
            {
            // InternalCONFIG.g:7253:4: (lv_period_unit_13_0= ruleGSSConfigUnit )
            // InternalCONFIG.g:7254:5: lv_period_unit_13_0= ruleGSSConfigUnit
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
    // InternalCONFIG.g:7287:1: entryRuleGSSConfigTestCase returns [EObject current=null] : iv_ruleGSSConfigTestCase= ruleGSSConfigTestCase EOF ;
    public final EObject entryRuleGSSConfigTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSConfigTestCase = null;


        try {
            // InternalCONFIG.g:7287:58: (iv_ruleGSSConfigTestCase= ruleGSSConfigTestCase EOF )
            // InternalCONFIG.g:7288:2: iv_ruleGSSConfigTestCase= ruleGSSConfigTestCase EOF
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
    // InternalCONFIG.g:7294:1: ruleGSSConfigTestCase returns [EObject current=null] : (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( (lv_procedure_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' ) ;
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
        Token lv_procedure_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_req_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_reqAction_13_0 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:7300:2: ( (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( (lv_procedure_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalCONFIG.g:7301:2: (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( (lv_procedure_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalCONFIG.g:7301:2: (otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( (lv_procedure_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';' )
            // InternalCONFIG.g:7302:3: otherlv_0= 'GSSConfigTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( (lv_procedure_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )? (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,123,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSConfigTestCaseAccess().getGSSConfigTestCaseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSConfigTestCaseAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSConfigTestCaseAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCONFIG.g:7318:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalCONFIG.g:7319:4: (lv_name_4_0= RULE_ID )
            {
            // InternalCONFIG.g:7319:4: (lv_name_4_0= RULE_ID )
            // InternalCONFIG.g:7320:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSConfigTestCaseAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,124,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSConfigTestCaseAccess().getProcedureKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSConfigTestCaseAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCONFIG.g:7348:3: ( (lv_procedure_8_0= RULE_ID ) )
            // InternalCONFIG.g:7349:4: (lv_procedure_8_0= RULE_ID )
            {
            // InternalCONFIG.g:7349:4: (lv_procedure_8_0= RULE_ID )
            // InternalCONFIG.g:7350:5: lv_procedure_8_0= RULE_ID
            {
            lv_procedure_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_procedure_8_0, grammarAccess.getGSSConfigTestCaseAccess().getProcedureIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSConfigTestCaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"procedure",
              						lv_procedure_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSConfigTestCaseAccess().getSemicolonKeyword_9());
              		
            }
            // InternalCONFIG.g:7370:3: (otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==125) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCONFIG.g:7371:4: otherlv_10= 'req' ( (lv_req_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,125,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSConfigTestCaseAccess().getReqKeyword_10_0());
                      			
                    }
                    // InternalCONFIG.g:7375:4: ( (lv_req_11_0= RULE_ID ) )
                    // InternalCONFIG.g:7376:5: (lv_req_11_0= RULE_ID )
                    {
                    // InternalCONFIG.g:7376:5: (lv_req_11_0= RULE_ID )
                    // InternalCONFIG.g:7377:6: lv_req_11_0= RULE_ID
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

            // InternalCONFIG.g:7394:3: (otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==126) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCONFIG.g:7395:4: otherlv_12= 'reqAction' ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) )
                    {
                    otherlv_12=(Token)match(input,126,FollowSets000.FOLLOW_125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getGSSConfigTestCaseAccess().getReqActionKeyword_11_0());
                      			
                    }
                    // InternalCONFIG.g:7399:4: ( (lv_reqAction_13_0= ruleGSSConfigReqAction ) )
                    // InternalCONFIG.g:7400:5: (lv_reqAction_13_0= ruleGSSConfigReqAction )
                    {
                    // InternalCONFIG.g:7400:5: (lv_reqAction_13_0= ruleGSSConfigReqAction )
                    // InternalCONFIG.g:7401:6: lv_reqAction_13_0= ruleGSSConfigReqAction
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
    // InternalCONFIG.g:7431:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCONFIG.g:7431:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCONFIG.g:7432:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCONFIG.g:7438:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7444:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCONFIG.g:7445:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCONFIG.g:7445:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCONFIG.g:7446:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCONFIG.g:7453:3: (kw= '.' this_ID_2= RULE_ID )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==127) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCONFIG.g:7454:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,127,FollowSets000.FOLLOW_7); if (state.failed) return current;
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
            	    break loop37;
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
    // InternalCONFIG.g:7471:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalCONFIG.g:7471:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalCONFIG.g:7472:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalCONFIG.g:7478:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalCONFIG.g:7484:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalCONFIG.g:7485:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalCONFIG.g:7485:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalCONFIG.g:7486:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalCONFIG.g:7486:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==EOF||LA39_1==14||LA39_1==127||LA39_1==129) ) {
                    alt39=1;
                }
                else if ( (LA39_1==RULE_ID) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCONFIG.g:7487:4: this_INT_0= RULE_INT
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
                    // InternalCONFIG.g:7495:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalCONFIG.g:7495:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalCONFIG.g:7496:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalCONFIG.g:7496:5: (this_INT_1= RULE_INT )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_INT) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalCONFIG.g:7497:6: this_INT_1= RULE_INT
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

            // InternalCONFIG.g:7514:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==127) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalCONFIG.g:7515:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,127,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalCONFIG.g:7520:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==RULE_INT) ) {
            	        int LA41_1 = input.LA(2);

            	        if ( (LA41_1==RULE_ID) ) {
            	            alt41=2;
            	        }
            	        else if ( (LA41_1==EOF||LA41_1==14||LA41_1==127||LA41_1==129) ) {
            	            alt41=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 41, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA41_0==RULE_ID) ) {
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
            	            // InternalCONFIG.g:7521:5: this_INT_4= RULE_INT
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
            	            // InternalCONFIG.g:7529:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalCONFIG.g:7529:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalCONFIG.g:7530:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalCONFIG.g:7530:6: (this_INT_5= RULE_INT )?
            	            int alt40=2;
            	            int LA40_0 = input.LA(1);

            	            if ( (LA40_0==RULE_INT) ) {
            	                alt40=1;
            	            }
            	            switch (alt40) {
            	                case 1 :
            	                    // InternalCONFIG.g:7531:7: this_INT_5= RULE_INT
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
            	    break loop42;
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
    // InternalCONFIG.g:7553:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalCONFIG.g:7553:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalCONFIG.g:7554:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalCONFIG.g:7560:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalCONFIG.g:7566:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalCONFIG.g:7567:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalCONFIG.g:7567:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalCONFIG.g:7568:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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
            kw=(Token)match(input,128,FollowSets000.FOLLOW_11); if (state.failed) return current;
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
            kw=(Token)match(input,129,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleINTEGER"
    // InternalCONFIG.g:7602:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalCONFIG.g:7602:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalCONFIG.g:7603:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalCONFIG.g:7609:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7615:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalCONFIG.g:7616:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalCONFIG.g:7616:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT||LA44_0==130) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_HEXADECIMAL) ) {
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
                    // InternalCONFIG.g:7617:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalCONFIG.g:7617:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalCONFIG.g:7618:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalCONFIG.g:7618:4: (kw= '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==130) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalCONFIG.g:7619:5: kw= '-'
                            {
                            kw=(Token)match(input,130,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
                    // InternalCONFIG.g:7634:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalCONFIG.g:7645:1: entryRuleDATE returns [String current=null] : iv_ruleDATE= ruleDATE EOF ;
    public final String entryRuleDATE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDATE = null;


        try {
            // InternalCONFIG.g:7645:44: (iv_ruleDATE= ruleDATE EOF )
            // InternalCONFIG.g:7646:2: iv_ruleDATE= ruleDATE EOF
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
    // InternalCONFIG.g:7652:1: ruleDATE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDATE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7658:2: ( (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT ) )
            // InternalCONFIG.g:7659:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            {
            // InternalCONFIG.g:7659:2: (this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT )
            // InternalCONFIG.g:7660:3: this_INT_0= RULE_INT kw= '/' this_INT_2= RULE_INT kw= '/' this_INT_4= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDATEAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,131,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDATEAccess().getSolidusKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDATEAccess().getINTTerminalRuleCall_2());
              		
            }
            kw=(Token)match(input,131,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
    // InternalCONFIG.g:7695:1: entryRuleURL returns [String current=null] : iv_ruleURL= ruleURL EOF ;
    public final String entryRuleURL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleURL = null;


        try {
            // InternalCONFIG.g:7695:43: (iv_ruleURL= ruleURL EOF )
            // InternalCONFIG.g:7696:2: iv_ruleURL= ruleURL EOF
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
    // InternalCONFIG.g:7702:1: ruleURL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) ;
    public final AntlrDatatypeRuleToken ruleURL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        Token this_ID_7=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7708:2: ( (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? ) )
            // InternalCONFIG.g:7709:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            {
            // InternalCONFIG.g:7709:2: (this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )? )
            // InternalCONFIG.g:7710:3: this_ID_0= RULE_ID (kw= '+' this_ID_2= RULE_ID )? kw= '://' (this_ID_4= RULE_ID (kw= '.' )? )+ (kw= '/' this_ID_7= RULE_ID )* (kw= '/' )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getURLAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCONFIG.g:7717:3: (kw= '+' this_ID_2= RULE_ID )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==132) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCONFIG.g:7718:4: kw= '+' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,132,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getURLAccess().getPlusSignKeyword_1_0());
                      			
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getURLAccess().getIDTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,133,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getURLAccess().getColonSolidusSolidusKeyword_2());
              		
            }
            // InternalCONFIG.g:7736:3: (this_ID_4= RULE_ID (kw= '.' )? )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalCONFIG.g:7737:4: this_ID_4= RULE_ID (kw= '.' )?
            	    {
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_132); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getURLAccess().getIDTerminalRuleCall_3_0());
            	      			
            	    }
            	    // InternalCONFIG.g:7744:4: (kw= '.' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==127) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalCONFIG.g:7745:5: kw= '.'
            	            {
            	            kw=(Token)match(input,127,FollowSets000.FOLLOW_133); if (state.failed) return current;
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
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            // InternalCONFIG.g:7752:3: (kw= '/' this_ID_7= RULE_ID )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==131) ) {
                    int LA48_1 = input.LA(2);

                    if ( (LA48_1==RULE_ID) ) {
                        alt48=1;
                    }


                }


                switch (alt48) {
            	case 1 :
            	    // InternalCONFIG.g:7753:4: kw= '/' this_ID_7= RULE_ID
            	    {
            	    kw=(Token)match(input,131,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getURLAccess().getSolidusKeyword_4_0());
            	      			
            	    }
            	    this_ID_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_134); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_7);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_7, grammarAccess.getURLAccess().getIDTerminalRuleCall_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            // InternalCONFIG.g:7766:3: (kw= '/' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==131) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCONFIG.g:7767:4: kw= '/'
                    {
                    kw=(Token)match(input,131,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleXMLREF"
    // InternalCONFIG.g:7777:1: entryRuleXMLREF returns [String current=null] : iv_ruleXMLREF= ruleXMLREF EOF ;
    public final String entryRuleXMLREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXMLREF = null;


        try {
            // InternalCONFIG.g:7777:46: (iv_ruleXMLREF= ruleXMLREF EOF )
            // InternalCONFIG.g:7778:2: iv_ruleXMLREF= ruleXMLREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMLREFRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXMLREF=ruleXMLREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMLREF.getText(); 
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
    // $ANTLR end "entryRuleXMLREF"


    // $ANTLR start "ruleXMLREF"
    // InternalCONFIG.g:7784:1: ruleXMLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleXMLREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7790:2: (this_ID_0= RULE_ID )
            // InternalCONFIG.g:7791:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getXMLREFAccess().getIDTerminalRuleCall());
              	
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
    // $ANTLR end "ruleXMLREF"


    // $ANTLR start "ruleGSSConfigEnableDisable"
    // InternalCONFIG.g:7801:1: ruleGSSConfigEnableDisable returns [Enumerator current=null] : ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) ;
    public final Enumerator ruleGSSConfigEnableDisable() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7807:2: ( ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) ) )
            // InternalCONFIG.g:7808:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            {
            // InternalCONFIG.g:7808:2: ( (enumLiteral_0= 'disabled' ) | (enumLiteral_1= 'enabled' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==134) ) {
                alt50=1;
            }
            else if ( (LA50_0==135) ) {
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
                    // InternalCONFIG.g:7809:3: (enumLiteral_0= 'disabled' )
                    {
                    // InternalCONFIG.g:7809:3: (enumLiteral_0= 'disabled' )
                    // InternalCONFIG.g:7810:4: enumLiteral_0= 'disabled'
                    {
                    enumLiteral_0=(Token)match(input,134,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigEnableDisableAccess().getDisabledEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7817:3: (enumLiteral_1= 'enabled' )
                    {
                    // InternalCONFIG.g:7817:3: (enumLiteral_1= 'enabled' )
                    // InternalCONFIG.g:7818:4: enumLiteral_1= 'enabled'
                    {
                    enumLiteral_1=(Token)match(input,135,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:7828:1: ruleGSSConfigMainInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) ) ;
    public final Enumerator ruleGSSConfigMainInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7834:2: ( ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) ) )
            // InternalCONFIG.g:7835:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) )
            {
            // InternalCONFIG.g:7835:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'uart' ) | (enumLiteral_2= 'dummy' ) )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt51=1;
                }
                break;
            case 137:
                {
                alt51=2;
                }
                break;
            case 138:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalCONFIG.g:7836:3: (enumLiteral_0= 'SpW' )
                    {
                    // InternalCONFIG.g:7836:3: (enumLiteral_0= 'SpW' )
                    // InternalCONFIG.g:7837:4: enumLiteral_0= 'SpW'
                    {
                    enumLiteral_0=(Token)match(input,136,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7844:3: (enumLiteral_1= 'uart' )
                    {
                    // InternalCONFIG.g:7844:3: (enumLiteral_1= 'uart' )
                    // InternalCONFIG.g:7845:4: enumLiteral_1= 'uart'
                    {
                    enumLiteral_1=(Token)match(input,137,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigMainInterfaceTypeAccess().getUartEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7852:3: (enumLiteral_2= 'dummy' )
                    {
                    // InternalCONFIG.g:7852:3: (enumLiteral_2= 'dummy' )
                    // InternalCONFIG.g:7853:4: enumLiteral_2= 'dummy'
                    {
                    enumLiteral_2=(Token)match(input,138,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:7863:1: ruleGSSConfigMainInterfaceIOType returns [Enumerator current=null] : (enumLiteral_0= 'in_out' ) ;
    public final Enumerator ruleGSSConfigMainInterfaceIOType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7869:2: ( (enumLiteral_0= 'in_out' ) )
            // InternalCONFIG.g:7870:2: (enumLiteral_0= 'in_out' )
            {
            // InternalCONFIG.g:7870:2: (enumLiteral_0= 'in_out' )
            // InternalCONFIG.g:7871:3: enumLiteral_0= 'in_out'
            {
            enumLiteral_0=(Token)match(input,139,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:7880:1: ruleGSSConfigInterfaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) ) ;
    public final Enumerator ruleGSSConfigInterfaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7886:2: ( ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) ) )
            // InternalCONFIG.g:7887:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) )
            {
            // InternalCONFIG.g:7887:2: ( (enumLiteral_0= 'SpW' ) | (enumLiteral_1= 'SpW_TC' ) | (enumLiteral_2= 'SpW_Error' ) | (enumLiteral_3= 'uart' ) | (enumLiteral_4= 'dummy' ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt52=1;
                }
                break;
            case 140:
                {
                alt52=2;
                }
                break;
            case 141:
                {
                alt52=3;
                }
                break;
            case 137:
                {
                alt52=4;
                }
                break;
            case 138:
                {
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // InternalCONFIG.g:7888:3: (enumLiteral_0= 'SpW' )
                    {
                    // InternalCONFIG.g:7888:3: (enumLiteral_0= 'SpW' )
                    // InternalCONFIG.g:7889:4: enumLiteral_0= 'SpW'
                    {
                    enumLiteral_0=(Token)match(input,136,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpWEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7896:3: (enumLiteral_1= 'SpW_TC' )
                    {
                    // InternalCONFIG.g:7896:3: (enumLiteral_1= 'SpW_TC' )
                    // InternalCONFIG.g:7897:4: enumLiteral_1= 'SpW_TC'
                    {
                    enumLiteral_1=(Token)match(input,140,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_TCEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7904:3: (enumLiteral_2= 'SpW_Error' )
                    {
                    // InternalCONFIG.g:7904:3: (enumLiteral_2= 'SpW_Error' )
                    // InternalCONFIG.g:7905:4: enumLiteral_2= 'SpW_Error'
                    {
                    enumLiteral_2=(Token)match(input,141,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSConfigInterfaceTypeAccess().getSpW_ErrorEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalCONFIG.g:7912:3: (enumLiteral_3= 'uart' )
                    {
                    // InternalCONFIG.g:7912:3: (enumLiteral_3= 'uart' )
                    // InternalCONFIG.g:7913:4: enumLiteral_3= 'uart'
                    {
                    enumLiteral_3=(Token)match(input,137,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSConfigInterfaceTypeAccess().getUartEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalCONFIG.g:7920:3: (enumLiteral_4= 'dummy' )
                    {
                    // InternalCONFIG.g:7920:3: (enumLiteral_4= 'dummy' )
                    // InternalCONFIG.g:7921:4: enumLiteral_4= 'dummy'
                    {
                    enumLiteral_4=(Token)match(input,138,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:7931:1: ruleGSSConfigInterfaceIOType returns [Enumerator current=null] : ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) ;
    public final Enumerator ruleGSSConfigInterfaceIOType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7937:2: ( ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) ) )
            // InternalCONFIG.g:7938:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            {
            // InternalCONFIG.g:7938:2: ( (enumLiteral_0= 'in_out' ) | (enumLiteral_1= 'in' ) | (enumLiteral_2= 'out' ) )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 139:
                {
                alt53=1;
                }
                break;
            case 142:
                {
                alt53=2;
                }
                break;
            case 143:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalCONFIG.g:7939:3: (enumLiteral_0= 'in_out' )
                    {
                    // InternalCONFIG.g:7939:3: (enumLiteral_0= 'in_out' )
                    // InternalCONFIG.g:7940:4: enumLiteral_0= 'in_out'
                    {
                    enumLiteral_0=(Token)match(input,139,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getIn_outEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7947:3: (enumLiteral_1= 'in' )
                    {
                    // InternalCONFIG.g:7947:3: (enumLiteral_1= 'in' )
                    // InternalCONFIG.g:7948:4: enumLiteral_1= 'in'
                    {
                    enumLiteral_1=(Token)match(input,142,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigInterfaceIOTypeAccess().getInEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7955:3: (enumLiteral_2= 'out' )
                    {
                    // InternalCONFIG.g:7955:3: (enumLiteral_2= 'out' )
                    // InternalCONFIG.g:7956:4: enumLiteral_2= 'out'
                    {
                    enumLiteral_2=(Token)match(input,143,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:7966:1: ruleGSSConfigUpperLevelLevel returns [Enumerator current=null] : ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) ;
    public final Enumerator ruleGSSConfigUpperLevelLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:7972:2: ( ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) ) )
            // InternalCONFIG.g:7973:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            {
            // InternalCONFIG.g:7973:2: ( (enumLiteral_0= '_1' ) | (enumLiteral_1= '_2' ) | (enumLiteral_2= '_3' ) )
            int alt54=3;
            switch ( input.LA(1) ) {
            case 144:
                {
                alt54=1;
                }
                break;
            case 145:
                {
                alt54=2;
                }
                break;
            case 146:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // InternalCONFIG.g:7974:3: (enumLiteral_0= '_1' )
                    {
                    // InternalCONFIG.g:7974:3: (enumLiteral_0= '_1' )
                    // InternalCONFIG.g:7975:4: enumLiteral_0= '_1'
                    {
                    enumLiteral_0=(Token)match(input,144,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:7982:3: (enumLiteral_1= '_2' )
                    {
                    // InternalCONFIG.g:7982:3: (enumLiteral_1= '_2' )
                    // InternalCONFIG.g:7983:4: enumLiteral_1= '_2'
                    {
                    enumLiteral_1=(Token)match(input,145,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigUpperLevelLevelAccess().get_2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:7990:3: (enumLiteral_2= '_3' )
                    {
                    // InternalCONFIG.g:7990:3: (enumLiteral_2= '_3' )
                    // InternalCONFIG.g:7991:4: enumLiteral_2= '_3'
                    {
                    enumLiteral_2=(Token)match(input,146,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:8001:1: ruleGSSConfigUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) ;
    public final Enumerator ruleGSSConfigUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:8007:2: ( ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) ) )
            // InternalCONFIG.g:8008:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            {
            // InternalCONFIG.g:8008:2: ( (enumLiteral_0= 'miliseconds' ) | (enumLiteral_1= 'seconds' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==147) ) {
                alt55=1;
            }
            else if ( (LA55_0==148) ) {
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
                    // InternalCONFIG.g:8009:3: (enumLiteral_0= 'miliseconds' )
                    {
                    // InternalCONFIG.g:8009:3: (enumLiteral_0= 'miliseconds' )
                    // InternalCONFIG.g:8010:4: enumLiteral_0= 'miliseconds'
                    {
                    enumLiteral_0=(Token)match(input,147,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigUnitAccess().getMilisecondsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:8017:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalCONFIG.g:8017:3: (enumLiteral_1= 'seconds' )
                    // InternalCONFIG.g:8018:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,148,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:8028:1: ruleGSSConfigGlobalVarType returns [Enumerator current=null] : ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) ;
    public final Enumerator ruleGSSConfigGlobalVarType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:8034:2: ( ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) ) )
            // InternalCONFIG.g:8035:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
            {
            // InternalCONFIG.g:8035:2: ( (enumLiteral_0= 'uint' ) | (enumLiteral_1= 'formula' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==149) ) {
                alt56=1;
            }
            else if ( (LA56_0==150) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalCONFIG.g:8036:3: (enumLiteral_0= 'uint' )
                    {
                    // InternalCONFIG.g:8036:3: (enumLiteral_0= 'uint' )
                    // InternalCONFIG.g:8037:4: enumLiteral_0= 'uint'
                    {
                    enumLiteral_0=(Token)match(input,149,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigGlobalVarTypeAccess().getUintEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:8044:3: (enumLiteral_1= 'formula' )
                    {
                    // InternalCONFIG.g:8044:3: (enumLiteral_1= 'formula' )
                    // InternalCONFIG.g:8045:4: enumLiteral_1= 'formula'
                    {
                    enumLiteral_1=(Token)match(input,150,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:8055:1: ruleGSSConfigReferenceFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) ;
    public final Enumerator ruleGSSConfigReferenceFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:8061:2: ( ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) ) )
            // InternalCONFIG.g:8062:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
            {
            // InternalCONFIG.g:8062:2: ( (enumLiteral_0= 'tm' ) | (enumLiteral_1= 'tc' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==151) ) {
                alt57=1;
            }
            else if ( (LA57_0==152) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalCONFIG.g:8063:3: (enumLiteral_0= 'tm' )
                    {
                    // InternalCONFIG.g:8063:3: (enumLiteral_0= 'tm' )
                    // InternalCONFIG.g:8064:4: enumLiteral_0= 'tm'
                    {
                    enumLiteral_0=(Token)match(input,151,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigReferenceFieldTypeAccess().getTmEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:8071:3: (enumLiteral_1= 'tc' )
                    {
                    // InternalCONFIG.g:8071:3: (enumLiteral_1= 'tc' )
                    // InternalCONFIG.g:8072:4: enumLiteral_1= 'tc'
                    {
                    enumLiteral_1=(Token)match(input,152,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:8082:1: ruleGSSConfigAlarmMsgType returns [Enumerator current=null] : ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) ;
    public final Enumerator ruleGSSConfigAlarmMsgType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCONFIG.g:8088:2: ( ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) ) )
            // InternalCONFIG.g:8089:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            {
            // InternalCONFIG.g:8089:2: ( (enumLiteral_0= 'alarm1' ) | (enumLiteral_1= 'alarm2' ) | (enumLiteral_2= 'alarm3' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 153:
                {
                alt58=1;
                }
                break;
            case 154:
                {
                alt58=2;
                }
                break;
            case 155:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalCONFIG.g:8090:3: (enumLiteral_0= 'alarm1' )
                    {
                    // InternalCONFIG.g:8090:3: (enumLiteral_0= 'alarm1' )
                    // InternalCONFIG.g:8091:4: enumLiteral_0= 'alarm1'
                    {
                    enumLiteral_0=(Token)match(input,153,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:8098:3: (enumLiteral_1= 'alarm2' )
                    {
                    // InternalCONFIG.g:8098:3: (enumLiteral_1= 'alarm2' )
                    // InternalCONFIG.g:8099:4: enumLiteral_1= 'alarm2'
                    {
                    enumLiteral_1=(Token)match(input,154,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSConfigAlarmMsgTypeAccess().getAlarm2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCONFIG.g:8106:3: (enumLiteral_2= 'alarm3' )
                    {
                    // InternalCONFIG.g:8106:3: (enumLiteral_2= 'alarm3' )
                    // InternalCONFIG.g:8107:4: enumLiteral_2= 'alarm3'
                    {
                    enumLiteral_2=(Token)match(input,155,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:8117:1: ruleGSSConfigModifyType returns [Enumerator current=null] : ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) ;
    public final Enumerator ruleGSSConfigModifyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCONFIG.g:8123:2: ( ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) ) )
            // InternalCONFIG.g:8124:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            {
            // InternalCONFIG.g:8124:2: ( (enumLiteral_0= 'increment' ) | (enumLiteral_1= 'increment1wrap' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==156) ) {
                alt59=1;
            }
            else if ( (LA59_0==157) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalCONFIG.g:8125:3: (enumLiteral_0= 'increment' )
                    {
                    // InternalCONFIG.g:8125:3: (enumLiteral_0= 'increment' )
                    // InternalCONFIG.g:8126:4: enumLiteral_0= 'increment'
                    {
                    enumLiteral_0=(Token)match(input,156,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSConfigModifyTypeAccess().getIncrementEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCONFIG.g:8133:3: (enumLiteral_1= 'increment1wrap' )
                    {
                    // InternalCONFIG.g:8133:3: (enumLiteral_1= 'increment1wrap' )
                    // InternalCONFIG.g:8134:4: enumLiteral_1= 'increment1wrap'
                    {
                    enumLiteral_1=(Token)match(input,157,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:8144:1: ruleGSSConfigAlarmValType returns [Enumerator current=null] : (enumLiteral_0= 'alarm1' ) ;
    public final Enumerator ruleGSSConfigAlarmValType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCONFIG.g:8150:2: ( (enumLiteral_0= 'alarm1' ) )
            // InternalCONFIG.g:8151:2: (enumLiteral_0= 'alarm1' )
            {
            // InternalCONFIG.g:8151:2: (enumLiteral_0= 'alarm1' )
            // InternalCONFIG.g:8152:3: enumLiteral_0= 'alarm1'
            {
            enumLiteral_0=(Token)match(input,153,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalCONFIG.g:8161:1: ruleGSSConfigReqAction returns [Enumerator current=null] : (enumLiteral_0= '_1' ) ;
    public final Enumerator ruleGSSConfigReqAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCONFIG.g:8167:2: ( (enumLiteral_0= '_1' ) )
            // InternalCONFIG.g:8168:2: (enumLiteral_0= '_1' )
            {
            // InternalCONFIG.g:8168:2: (enumLiteral_0= '_1' )
            // InternalCONFIG.g:8169:3: enumLiteral_0= '_1'
            {
            enumLiteral_0=(Token)match(input,144,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0100000000080000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L,0x0000000019000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L,0x0000008000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000000L,0x0056000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008080000L,0x0056000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000000L,0x0800000000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020080000L,0x0800000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000000000000C0L,0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0004000000080000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000700L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0280000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0280000000080000L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003700L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000C800L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0E80000000000000L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0E80000000080000L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000003L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000001L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000180L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000080000L,0x0000000000008400L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000080000L,0x0000000000100000L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000080000L,0x0000000000400000L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000180000L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000070000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000600000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000000L,0x0001440000000000L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
        public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
        public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0480000000000000L});
        public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000E000000L});
        public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
        public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000030000000L});
        public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
        public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
        public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
        public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
        public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000080000L,0x6000000000000000L});
        public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000080000L,0x4000000000000000L});
        public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
        public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
        public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000022L,0x8000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    }


}