package es.uah.aut.srg.gss.lang.campaign.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.campaign.services.CAMPAIGNGrammarAccess;



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
public class InternalCAMPAIGNParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSCampaignCampaign'", "'{'", "'uri'", "'version'", "'}'", "'GSSCampaignScenario'", "'environment'", "'scenarioRef'", "'GSSTestListTestList'", "'GSSTestListTestCase'", "'name'", "'procedure'", "'prevMsg'", "'prevAction'", "'prevActionParam'", "'.'", "'('", "')'", "'1'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCAMPAIGNParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCAMPAIGNParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCAMPAIGNParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCAMPAIGN.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private CAMPAIGNGrammarAccess grammarAccess;

        public InternalCAMPAIGNParser(TokenStream input, CAMPAIGNGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected CAMPAIGNGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalCAMPAIGN.g:78:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalCAMPAIGN.g:78:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalCAMPAIGN.g:79:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalCAMPAIGN.g:85:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSCampaignCampaign ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalCAMPAIGN.g:91:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSCampaignCampaign ) ) ) )
            // InternalCAMPAIGN.g:92:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSCampaignCampaign ) ) )
            {
            // InternalCAMPAIGN.g:92:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSCampaignCampaign ) ) )
            // InternalCAMPAIGN.g:93:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSCampaignCampaign ) )
            {
            // InternalCAMPAIGN.g:93:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCAMPAIGN.g:94:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalCAMPAIGN.g:94:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalCAMPAIGN.g:95:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalCAMPAIGN.g:112:3: ( (lv_element_1_0= ruleGSSCampaignCampaign ) )
            // InternalCAMPAIGN.g:113:4: (lv_element_1_0= ruleGSSCampaignCampaign )
            {
            // InternalCAMPAIGN.g:113:4: (lv_element_1_0= ruleGSSCampaignCampaign )
            // InternalCAMPAIGN.g:114:5: lv_element_1_0= ruleGSSCampaignCampaign
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSCampaignCampaignParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSCampaignCampaign();

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
              						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSCampaignCampaign");
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
    // InternalCAMPAIGN.g:135:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalCAMPAIGN.g:135:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalCAMPAIGN.g:136:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalCAMPAIGN.g:142:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalCAMPAIGN.g:148:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalCAMPAIGN.g:149:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalCAMPAIGN.g:149:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalCAMPAIGN.g:150:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalCAMPAIGN.g:158:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalCAMPAIGN.g:159:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalCAMPAIGN.g:159:4: (lv_importURI_2_0= RULE_STRING )
            // InternalCAMPAIGN.g:160:5: lv_importURI_2_0= RULE_STRING
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

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGSSCampaignCampaign"
    // InternalCAMPAIGN.g:184:1: entryRuleGSSCampaignCampaign returns [EObject current=null] : iv_ruleGSSCampaignCampaign= ruleGSSCampaignCampaign EOF ;
    public final EObject entryRuleGSSCampaignCampaign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSCampaignCampaign = null;


        try {
            // InternalCAMPAIGN.g:184:60: (iv_ruleGSSCampaignCampaign= ruleGSSCampaignCampaign EOF )
            // InternalCAMPAIGN.g:185:2: iv_ruleGSSCampaignCampaign= ruleGSSCampaignCampaign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSCampaignCampaignRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSCampaignCampaign=ruleGSSCampaignCampaign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSCampaignCampaign; 
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
    // $ANTLR end "entryRuleGSSCampaignCampaign"


    // $ANTLR start "ruleGSSCampaignCampaign"
    // InternalCAMPAIGN.g:191:1: ruleGSSCampaignCampaign returns [EObject current=null] : (otherlv_0= 'GSSCampaignCampaign' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_Scenario_11_0= ruleGSSCampaignScenario ) ) ( (lv_Tests_12_0= ruleGSSTestListTestList ) ) otherlv_13= '}' otherlv_14= ';' ) ;
    public final EObject ruleGSSCampaignCampaign() throws RecognitionException {
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uri_5_0 = null;

        AntlrDatatypeRuleToken lv_version_9_0 = null;

        EObject lv_Scenario_11_0 = null;

        EObject lv_Tests_12_0 = null;



        	enterRule();

        try {
            // InternalCAMPAIGN.g:197:2: ( (otherlv_0= 'GSSCampaignCampaign' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_Scenario_11_0= ruleGSSCampaignScenario ) ) ( (lv_Tests_12_0= ruleGSSTestListTestList ) ) otherlv_13= '}' otherlv_14= ';' ) )
            // InternalCAMPAIGN.g:198:2: (otherlv_0= 'GSSCampaignCampaign' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_Scenario_11_0= ruleGSSCampaignScenario ) ) ( (lv_Tests_12_0= ruleGSSTestListTestList ) ) otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalCAMPAIGN.g:198:2: (otherlv_0= 'GSSCampaignCampaign' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_Scenario_11_0= ruleGSSCampaignScenario ) ) ( (lv_Tests_12_0= ruleGSSTestListTestList ) ) otherlv_13= '}' otherlv_14= ';' )
            // InternalCAMPAIGN.g:199:3: otherlv_0= 'GSSCampaignCampaign' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' ) otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' ( (lv_Scenario_11_0= ruleGSSCampaignScenario ) ) ( (lv_Tests_12_0= ruleGSSTestListTestList ) ) otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSCampaignCampaignAccess().getGSSCampaignCampaignKeyword_0());
              		
            }
            // InternalCAMPAIGN.g:203:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCAMPAIGN.g:204:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCAMPAIGN.g:204:4: (lv_name_1_0= RULE_ID )
            // InternalCAMPAIGN.g:205:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSCampaignCampaignAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSCampaignCampaignRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSCampaignCampaignAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalCAMPAIGN.g:225:3: (otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' )
            // InternalCAMPAIGN.g:226:4: otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';'
            {
            otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getGSSCampaignCampaignAccess().getUriKeyword_3_0());
              			
            }
            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_4, grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_3_1());
              			
            }
            // InternalCAMPAIGN.g:234:4: ( (lv_uri_5_0= ruleQualifiedName ) )
            // InternalCAMPAIGN.g:235:5: (lv_uri_5_0= ruleQualifiedName )
            {
            // InternalCAMPAIGN.g:235:5: (lv_uri_5_0= ruleQualifiedName )
            // InternalCAMPAIGN.g:236:6: lv_uri_5_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getUriQualifiedNameParserRuleCall_3_2_0());
              					
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_uri_5_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
              						}
              						set(
              							current,
              							"uri",
              							lv_uri_5_0,
              							"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.QualifiedName");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_6, grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_3_3());
              			
            }

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSCampaignCampaignAccess().getVersionKeyword_4());
              		
            }
            otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSCampaignCampaignAccess().getColonEqualsSignKeyword_5());
              		
            }
            // InternalCAMPAIGN.g:266:3: ( (lv_version_9_0= ruleVersion ) )
            // InternalCAMPAIGN.g:267:4: (lv_version_9_0= ruleVersion )
            {
            // InternalCAMPAIGN.g:267:4: (lv_version_9_0= ruleVersion )
            // InternalCAMPAIGN.g:268:5: lv_version_9_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getVersionVersionParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_9_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
              					}
              					set(
              						current,
              						"version",
              						lv_version_9_0,
              						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.Version");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_7());
              		
            }
            // InternalCAMPAIGN.g:289:3: ( (lv_Scenario_11_0= ruleGSSCampaignScenario ) )
            // InternalCAMPAIGN.g:290:4: (lv_Scenario_11_0= ruleGSSCampaignScenario )
            {
            // InternalCAMPAIGN.g:290:4: (lv_Scenario_11_0= ruleGSSCampaignScenario )
            // InternalCAMPAIGN.g:291:5: lv_Scenario_11_0= ruleGSSCampaignScenario
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getScenarioGSSCampaignScenarioParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_13);
            lv_Scenario_11_0=ruleGSSCampaignScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
              					}
              					set(
              						current,
              						"Scenario",
              						lv_Scenario_11_0,
              						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSCampaignScenario");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalCAMPAIGN.g:308:3: ( (lv_Tests_12_0= ruleGSSTestListTestList ) )
            // InternalCAMPAIGN.g:309:4: (lv_Tests_12_0= ruleGSSTestListTestList )
            {
            // InternalCAMPAIGN.g:309:4: (lv_Tests_12_0= ruleGSSTestListTestList )
            // InternalCAMPAIGN.g:310:5: lv_Tests_12_0= ruleGSSTestListTestList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSCampaignCampaignAccess().getTestsGSSTestListTestListParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_Tests_12_0=ruleGSSTestListTestList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSCampaignCampaignRule());
              					}
              					set(
              						current,
              						"Tests",
              						lv_Tests_12_0,
              						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListTestList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSCampaignCampaignAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSCampaignCampaignAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSCampaignCampaign"


    // $ANTLR start "entryRuleGSSCampaignScenario"
    // InternalCAMPAIGN.g:339:1: entryRuleGSSCampaignScenario returns [EObject current=null] : iv_ruleGSSCampaignScenario= ruleGSSCampaignScenario EOF ;
    public final EObject entryRuleGSSCampaignScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSCampaignScenario = null;


        try {
            // InternalCAMPAIGN.g:339:60: (iv_ruleGSSCampaignScenario= ruleGSSCampaignScenario EOF )
            // InternalCAMPAIGN.g:340:2: iv_ruleGSSCampaignScenario= ruleGSSCampaignScenario EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSCampaignScenarioRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSCampaignScenario=ruleGSSCampaignScenario();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSCampaignScenario; 
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
    // $ANTLR end "entryRuleGSSCampaignScenario"


    // $ANTLR start "ruleGSSCampaignScenario"
    // InternalCAMPAIGN.g:346:1: ruleGSSCampaignScenario returns [EObject current=null] : (otherlv_0= 'GSSCampaignScenario' otherlv_1= '{' otherlv_2= 'environment' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' otherlv_6= 'scenarioRef' otherlv_7= ':=' ( (otherlv_8= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSCampaignScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalCAMPAIGN.g:352:2: ( (otherlv_0= 'GSSCampaignScenario' otherlv_1= '{' otherlv_2= 'environment' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' otherlv_6= 'scenarioRef' otherlv_7= ':=' ( (otherlv_8= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalCAMPAIGN.g:353:2: (otherlv_0= 'GSSCampaignScenario' otherlv_1= '{' otherlv_2= 'environment' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' otherlv_6= 'scenarioRef' otherlv_7= ':=' ( (otherlv_8= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalCAMPAIGN.g:353:2: (otherlv_0= 'GSSCampaignScenario' otherlv_1= '{' otherlv_2= 'environment' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' otherlv_6= 'scenarioRef' otherlv_7= ':=' ( (otherlv_8= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalCAMPAIGN.g:354:3: otherlv_0= 'GSSCampaignScenario' otherlv_1= '{' otherlv_2= 'environment' otherlv_3= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_5= ';' otherlv_6= 'scenarioRef' otherlv_7= ':=' ( (otherlv_8= RULE_STRING ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSCampaignScenarioAccess().getGSSCampaignScenarioKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSCampaignScenarioAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCAMPAIGN.g:370:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCAMPAIGN.g:371:4: ( ruleVersionedQualifiedName )
            {
            // InternalCAMPAIGN.g:371:4: ( ruleVersionedQualifiedName )
            // InternalCAMPAIGN.g:372:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSCampaignScenarioRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSCampaignScenarioAccess().getEnvironmentGSSEnvironmentEnvironmentCrossReference_4_0());
              				
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSCampaignScenarioAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCAMPAIGN.g:401:3: ( (otherlv_8= RULE_STRING ) )
            // InternalCAMPAIGN.g:402:4: (otherlv_8= RULE_STRING )
            {
            // InternalCAMPAIGN.g:402:4: (otherlv_8= RULE_STRING )
            // InternalCAMPAIGN.g:403:5: otherlv_8= RULE_STRING
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSCampaignScenarioRule());
              					}
              				
            }
            otherlv_8=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_8, grammarAccess.getGSSCampaignScenarioAccess().getScenarioRefGSSScenarioScenarioCrossReference_8_0());
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSCampaignScenarioAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSCampaignScenarioAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSCampaignScenario"


    // $ANTLR start "entryRuleGSSTestListTestList"
    // InternalCAMPAIGN.g:433:1: entryRuleGSSTestListTestList returns [EObject current=null] : iv_ruleGSSTestListTestList= ruleGSSTestListTestList EOF ;
    public final EObject entryRuleGSSTestListTestList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTestListTestList = null;


        try {
            // InternalCAMPAIGN.g:433:60: (iv_ruleGSSTestListTestList= ruleGSSTestListTestList EOF )
            // InternalCAMPAIGN.g:434:2: iv_ruleGSSTestListTestList= ruleGSSTestListTestList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTestListTestListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTestListTestList=ruleGSSTestListTestList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTestListTestList; 
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
    // $ANTLR end "entryRuleGSSTestListTestList"


    // $ANTLR start "ruleGSSTestListTestList"
    // InternalCAMPAIGN.g:440:1: ruleGSSTestListTestList returns [EObject current=null] : (otherlv_0= 'GSSTestListTestList' otherlv_1= '{' ( (lv_TestCase_2_0= ruleGSSTestListTestCase ) )+ otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSTestListTestList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_TestCase_2_0 = null;



        	enterRule();

        try {
            // InternalCAMPAIGN.g:446:2: ( (otherlv_0= 'GSSTestListTestList' otherlv_1= '{' ( (lv_TestCase_2_0= ruleGSSTestListTestCase ) )+ otherlv_3= '}' otherlv_4= ';' ) )
            // InternalCAMPAIGN.g:447:2: (otherlv_0= 'GSSTestListTestList' otherlv_1= '{' ( (lv_TestCase_2_0= ruleGSSTestListTestCase ) )+ otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalCAMPAIGN.g:447:2: (otherlv_0= 'GSSTestListTestList' otherlv_1= '{' ( (lv_TestCase_2_0= ruleGSSTestListTestCase ) )+ otherlv_3= '}' otherlv_4= ';' )
            // InternalCAMPAIGN.g:448:3: otherlv_0= 'GSSTestListTestList' otherlv_1= '{' ( (lv_TestCase_2_0= ruleGSSTestListTestCase ) )+ otherlv_3= '}' otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTestListTestListAccess().getGSSTestListTestListKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTestListTestListAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalCAMPAIGN.g:456:3: ( (lv_TestCase_2_0= ruleGSSTestListTestCase ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCAMPAIGN.g:457:4: (lv_TestCase_2_0= ruleGSSTestListTestCase )
            	    {
            	    // InternalCAMPAIGN.g:457:4: (lv_TestCase_2_0= ruleGSSTestListTestCase )
            	    // InternalCAMPAIGN.g:458:5: lv_TestCase_2_0= ruleGSSTestListTestCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSTestListTestListAccess().getTestCaseGSSTestListTestCaseParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_TestCase_2_0=ruleGSSTestListTestCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSTestListTestListRule());
            	      					}
            	      					add(
            	      						current,
            	      						"TestCase",
            	      						lv_TestCase_2_0,
            	      						"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListTestCase");
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTestListTestListAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSTestListTestListAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSTestListTestList"


    // $ANTLR start "entryRuleGSSTestListTestCase"
    // InternalCAMPAIGN.g:487:1: entryRuleGSSTestListTestCase returns [EObject current=null] : iv_ruleGSSTestListTestCase= ruleGSSTestListTestCase EOF ;
    public final EObject entryRuleGSSTestListTestCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSTestListTestCase = null;


        try {
            // InternalCAMPAIGN.g:487:60: (iv_ruleGSSTestListTestCase= ruleGSSTestListTestCase EOF )
            // InternalCAMPAIGN.g:488:2: iv_ruleGSSTestListTestCase= ruleGSSTestListTestCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSTestListTestCaseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSTestListTestCase=ruleGSSTestListTestCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSTestListTestCase; 
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
    // $ANTLR end "entryRuleGSSTestListTestCase"


    // $ANTLR start "ruleGSSTestListTestCase"
    // InternalCAMPAIGN.g:494:1: ruleGSSTestListTestCase returns [EObject current=null] : (otherlv_0= 'GSSTestListTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'prevMsg' ( (lv_prevMsg_11_0= RULE_ID ) ) )? (otherlv_12= 'prevAction' ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) ) (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )? )? otherlv_16= '}' otherlv_17= ';' ) ;
    public final EObject ruleGSSTestListTestCase() throws RecognitionException {
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
        Token lv_prevMsg_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_prevActionParam_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_prevAction_13_0 = null;



        	enterRule();

        try {
            // InternalCAMPAIGN.g:500:2: ( (otherlv_0= 'GSSTestListTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'prevMsg' ( (lv_prevMsg_11_0= RULE_ID ) ) )? (otherlv_12= 'prevAction' ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) ) (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )? )? otherlv_16= '}' otherlv_17= ';' ) )
            // InternalCAMPAIGN.g:501:2: (otherlv_0= 'GSSTestListTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'prevMsg' ( (lv_prevMsg_11_0= RULE_ID ) ) )? (otherlv_12= 'prevAction' ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) ) (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )? )? otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalCAMPAIGN.g:501:2: (otherlv_0= 'GSSTestListTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'prevMsg' ( (lv_prevMsg_11_0= RULE_ID ) ) )? (otherlv_12= 'prevAction' ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) ) (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )? )? otherlv_16= '}' otherlv_17= ';' )
            // InternalCAMPAIGN.g:502:3: otherlv_0= 'GSSTestListTestCase' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'procedure' otherlv_7= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_9= ';' (otherlv_10= 'prevMsg' ( (lv_prevMsg_11_0= RULE_ID ) ) )? (otherlv_12= 'prevAction' ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) ) (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )? )? otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSTestListTestCaseAccess().getGSSTestListTestCaseKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSTestListTestCaseAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSTestListTestCaseAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalCAMPAIGN.g:518:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalCAMPAIGN.g:519:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalCAMPAIGN.g:519:4: (lv_name_4_0= RULE_STRING )
            // InternalCAMPAIGN.g:520:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSTestListTestCaseAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSTestListTestCaseAccess().getProcedureKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSTestListTestCaseAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalCAMPAIGN.g:548:3: ( ( ruleVersionedQualifiedName ) )
            // InternalCAMPAIGN.g:549:4: ( ruleVersionedQualifiedName )
            {
            // InternalCAMPAIGN.g:549:4: ( ruleVersionedQualifiedName )
            // InternalCAMPAIGN.g:550:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSTestListTestCaseAccess().getProcedureGSSTestProcTestProcCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_9());
              		
            }
            // InternalCAMPAIGN.g:571:3: (otherlv_10= 'prevMsg' ( (lv_prevMsg_11_0= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCAMPAIGN.g:572:4: otherlv_10= 'prevMsg' ( (lv_prevMsg_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgKeyword_10_0());
                      			
                    }
                    // InternalCAMPAIGN.g:576:4: ( (lv_prevMsg_11_0= RULE_ID ) )
                    // InternalCAMPAIGN.g:577:5: (lv_prevMsg_11_0= RULE_ID )
                    {
                    // InternalCAMPAIGN.g:577:5: (lv_prevMsg_11_0= RULE_ID )
                    // InternalCAMPAIGN.g:578:6: lv_prevMsg_11_0= RULE_ID
                    {
                    lv_prevMsg_11_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_prevMsg_11_0, grammarAccess.getGSSTestListTestCaseAccess().getPrevMsgIDTerminalRuleCall_10_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"prevMsg",
                      							lv_prevMsg_11_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalCAMPAIGN.g:595:3: (otherlv_12= 'prevAction' ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) ) (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )? )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCAMPAIGN.g:596:4: otherlv_12= 'prevAction' ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) ) (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )?
                    {
                    otherlv_12=(Token)match(input,27,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getGSSTestListTestCaseAccess().getPrevActionKeyword_11_0());
                      			
                    }
                    // InternalCAMPAIGN.g:600:4: ( (lv_prevAction_13_0= ruleGSSTestListPrevAction ) )
                    // InternalCAMPAIGN.g:601:5: (lv_prevAction_13_0= ruleGSSTestListPrevAction )
                    {
                    // InternalCAMPAIGN.g:601:5: (lv_prevAction_13_0= ruleGSSTestListPrevAction )
                    // InternalCAMPAIGN.g:602:6: lv_prevAction_13_0= ruleGSSTestListPrevAction
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSTestListTestCaseAccess().getPrevActionGSSTestListPrevActionEnumRuleCall_11_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_24);
                    lv_prevAction_13_0=ruleGSSTestListPrevAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSTestListTestCaseRule());
                      						}
                      						set(
                      							current,
                      							"prevAction",
                      							lv_prevAction_13_0,
                      							"es.uah.aut.srg.gss.lang.campaign.CAMPAIGN.GSSTestListPrevAction");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalCAMPAIGN.g:619:4: (otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==28) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalCAMPAIGN.g:620:5: otherlv_14= 'prevActionParam' ( (lv_prevActionParam_15_0= RULE_STRING ) )
                            {
                            otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamKeyword_11_2_0());
                              				
                            }
                            // InternalCAMPAIGN.g:624:5: ( (lv_prevActionParam_15_0= RULE_STRING ) )
                            // InternalCAMPAIGN.g:625:6: (lv_prevActionParam_15_0= RULE_STRING )
                            {
                            // InternalCAMPAIGN.g:625:6: (lv_prevActionParam_15_0= RULE_STRING )
                            // InternalCAMPAIGN.g:626:7: lv_prevActionParam_15_0= RULE_STRING
                            {
                            lv_prevActionParam_15_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prevActionParam_15_0, grammarAccess.getGSSTestListTestCaseAccess().getPrevActionParamSTRINGTerminalRuleCall_11_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getGSSTestListTestCaseRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"prevActionParam",
                              								lv_prevActionParam_15_0,
                              								"org.eclipse.xtext.common.Terminals.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,18,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSTestListTestCaseAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSTestListTestCaseAccess().getSemicolonKeyword_13());
              		
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
    // $ANTLR end "ruleGSSTestListTestCase"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalCAMPAIGN.g:656:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalCAMPAIGN.g:656:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalCAMPAIGN.g:657:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalCAMPAIGN.g:663:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalCAMPAIGN.g:669:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCAMPAIGN.g:670:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCAMPAIGN.g:670:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCAMPAIGN.g:671:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalCAMPAIGN.g:678:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCAMPAIGN.g:679:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalCAMPAIGN.g:696:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalCAMPAIGN.g:696:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalCAMPAIGN.g:697:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalCAMPAIGN.g:703:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalCAMPAIGN.g:709:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalCAMPAIGN.g:710:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalCAMPAIGN.g:710:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalCAMPAIGN.g:711:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalCAMPAIGN.g:711:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==13||LA8_1==29||LA8_1==31) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCAMPAIGN.g:712:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalCAMPAIGN.g:720:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalCAMPAIGN.g:720:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalCAMPAIGN.g:721:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalCAMPAIGN.g:721:5: (this_INT_1= RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalCAMPAIGN.g:722:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
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

            // InternalCAMPAIGN.g:739:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCAMPAIGN.g:740:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,29,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalCAMPAIGN.g:745:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_INT) ) {
            	        int LA10_1 = input.LA(2);

            	        if ( (LA10_1==RULE_ID) ) {
            	            alt10=2;
            	        }
            	        else if ( (LA10_1==EOF||LA10_1==13||LA10_1==29||LA10_1==31) ) {
            	            alt10=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 10, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA10_0==RULE_ID) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalCAMPAIGN.g:746:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalCAMPAIGN.g:754:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalCAMPAIGN.g:754:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalCAMPAIGN.g:755:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalCAMPAIGN.g:755:6: (this_INT_5= RULE_INT )?
            	            int alt9=2;
            	            int LA9_0 = input.LA(1);

            	            if ( (LA9_0==RULE_INT) ) {
            	                alt9=1;
            	            }
            	            switch (alt9) {
            	                case 1 :
            	                    // InternalCAMPAIGN.g:756:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_25); if (state.failed) return current;
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
            	    break loop11;
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
    // InternalCAMPAIGN.g:778:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalCAMPAIGN.g:778:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalCAMPAIGN.g:779:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalCAMPAIGN.g:785:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalCAMPAIGN.g:791:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalCAMPAIGN.g:792:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalCAMPAIGN.g:792:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalCAMPAIGN.g:793:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,30,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_27);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleGSSTestListPrevAction"
    // InternalCAMPAIGN.g:827:1: ruleGSSTestListPrevAction returns [Enumerator current=null] : (enumLiteral_0= '1' ) ;
    public final Enumerator ruleGSSTestListPrevAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalCAMPAIGN.g:833:2: ( (enumLiteral_0= '1' ) )
            // InternalCAMPAIGN.g:834:2: (enumLiteral_0= '1' )
            {
            // InternalCAMPAIGN.g:834:2: (enumLiteral_0= '1' )
            // InternalCAMPAIGN.g:835:3: enumLiteral_0= '1'
            {
            enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getGSSTestListPrevActionAccess().getResetEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getGSSTestListPrevActionAccess().getResetEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleGSSTestListPrevAction"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000840000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C040000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008040000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010040000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    }


}