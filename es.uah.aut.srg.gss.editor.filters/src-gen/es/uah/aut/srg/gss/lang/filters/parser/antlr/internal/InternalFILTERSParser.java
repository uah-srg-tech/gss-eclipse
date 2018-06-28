package es.uah.aut.srg.gss.lang.filters.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.filters.services.FILTERSGrammarAccess;



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
public class InternalFILTERSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HEXADECIMAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSFilterMaxtermFilter'", "'{'", "'uri'", "'version'", "'formatFile'", "'}'", "'GSSFilterMintermFilter'", "'GSSFilterBoolVar'", "'id'", "'name'", "'constantType'", "'GSSFilterBoolVarFromArrayItem'", "'GSSFilterBoolVarFromGroupedArrayItem'", "'group'", "'GSSFilterBoolVarFDIC'", "'GSSFilterFieldRef'", "'GSSFilterFieldOp'", "'type'", "'GSSFilterConstant'", "'value'", "'mask'", "'GSSFilterSelect'", "'fromFile'", "'offset'", "'size'", "'GSSFilterSelectLine'", "'line'", "'leftTrim'", "'rightTrim'", "'GSSFilterAIFieldRef'", "'index'", "'GSSFilterAIFieldRefs'", "'GSSFilterMaxterm'", "'GSSFilterMinterm'", "'GSSFilterBoolVarRef'", "'idRef'", "'.'", "'('", "')'", "'-'", "'decimal'", "'hex'", "'binary'", "'char'", "'string'", "'equal'", "'different'", "'bigger_than'", "'smaller_than'", "'bigger_or_equal'", "'smaller_or_equal'", "'data'", "'crc'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int RULE_HEXADECIMAL=5;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalFILTERSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFILTERSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFILTERSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFILTERS.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private FILTERSGrammarAccess grammarAccess;

        public InternalFILTERSParser(TokenStream input, FILTERSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected FILTERSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalFILTERS.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalFILTERS.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalFILTERS.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalFILTERS.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) ) )
            // InternalFILTERS.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) )
            {
            // InternalFILTERS.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) )
            // InternalFILTERS.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) )
            {
            // InternalFILTERS.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFILTERS.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalFILTERS.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalFILTERS.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFILTERS.g:113:3: ( (lv_element_1_0= ruleGSSFilterFilter ) )
            // InternalFILTERS.g:114:4: (lv_element_1_0= ruleGSSFilterFilter )
            {
            // InternalFILTERS.g:114:4: (lv_element_1_0= ruleGSSFilterFilter )
            // InternalFILTERS.g:115:5: lv_element_1_0= ruleGSSFilterFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSFilterFilterParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSFilterFilter();

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
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFilter");
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
    // InternalFILTERS.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalFILTERS.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalFILTERS.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalFILTERS.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFILTERS.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalFILTERS.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalFILTERS.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalFILTERS.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalFILTERS.g:159:3: ( (lv_importURI_2_0= RULE_ID ) )
            // InternalFILTERS.g:160:4: (lv_importURI_2_0= RULE_ID )
            {
            // InternalFILTERS.g:160:4: (lv_importURI_2_0= RULE_ID )
            // InternalFILTERS.g:161:5: lv_importURI_2_0= RULE_ID
            {
            lv_importURI_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_importURI_2_0, grammarAccess.getGSSModelFileImportAccess().getImportURIIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSModelFileImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"importURI",
              						lv_importURI_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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


    // $ANTLR start "entryRuleGSSFilterFilter"
    // InternalFILTERS.g:185:1: entryRuleGSSFilterFilter returns [EObject current=null] : iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF ;
    public final EObject entryRuleGSSFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterFilter = null;


        try {
            // InternalFILTERS.g:185:56: (iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF )
            // InternalFILTERS.g:186:2: iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterFilter=ruleGSSFilterFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterFilter; 
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
    // $ANTLR end "entryRuleGSSFilterFilter"


    // $ANTLR start "ruleGSSFilterFilter"
    // InternalFILTERS.g:192:1: ruleGSSFilterFilter returns [EObject current=null] : (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter ) ;
    public final EObject ruleGSSFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject this_GSSFilterMaxtermFilter_0 = null;

        EObject this_GSSFilterMintermFilter_1 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:198:2: ( (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter ) )
            // InternalFILTERS.g:199:2: (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter )
            {
            // InternalFILTERS.g:199:2: (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFILTERS.g:200:3: this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMaxtermFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterMaxtermFilter_0=ruleGSSFilterMaxtermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterMaxtermFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:212:3: this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterFilterAccess().getGSSFilterMintermFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterMintermFilter_1=ruleGSSFilterMintermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterMintermFilter_1;
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
    // $ANTLR end "ruleGSSFilterFilter"


    // $ANTLR start "entryRuleGSSFilterMaxtermFilter"
    // InternalFILTERS.g:227:1: entryRuleGSSFilterMaxtermFilter returns [EObject current=null] : iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF ;
    public final EObject entryRuleGSSFilterMaxtermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMaxtermFilter = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTERS.g:231:2: (iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF )
            // InternalFILTERS.g:232:2: iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterMaxtermFilter=ruleGSSFilterMaxtermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterMaxtermFilter; 
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
    // $ANTLR end "entryRuleGSSFilterMaxtermFilter"


    // $ANTLR start "ruleGSSFilterMaxtermFilter"
    // InternalFILTERS.g:241:1: ruleGSSFilterMaxtermFilter returns [EObject current=null] : (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleGSSFilterMaxtermFilter() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_formatFile_14_0=null;
        Token otherlv_15=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;

        EObject lv_Maxterm_20_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTERS.g:250:2: ( (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            // InternalFILTERS.g:251:2: (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalFILTERS.g:251:2: (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            // InternalFILTERS.g:252:3: otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0());
              		
            }
            // InternalFILTERS.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTERS.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTERS.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalFILTERS.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSFilterMaxtermFilterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterMaxtermFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFILTERS.g:278:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalFILTERS.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalFILTERS.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalFILTERS.g:280:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());
            // InternalFILTERS.g:283:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            // InternalFILTERS.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalFILTERS.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFILTERS.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFILTERS.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFILTERS.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFILTERS.g:286:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFILTERS.g:287:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
            	    // InternalFILTERS.g:290:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFILTERS.g:290:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "true");
            	    }
            	    // InternalFILTERS.g:290:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFILTERS.g:290:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFILTERS.g:298:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFILTERS.g:299:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFILTERS.g:299:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFILTERS.g:300:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.filters.FILTERS.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFILTERS.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    {
            	    // InternalFILTERS.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    // InternalFILTERS.g:328:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFILTERS.g:328:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    // InternalFILTERS.g:329:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
            	    // InternalFILTERS.g:332:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    // InternalFILTERS.g:332:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "true");
            	    }
            	    // InternalFILTERS.g:332:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    // InternalFILTERS.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
            	    {
            	    // InternalFILTERS.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFILTERS.g:333:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_8, grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0());
            	      									
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_9, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
            	      									
            	    }
            	    // InternalFILTERS.g:341:10: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFILTERS.g:342:11: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFILTERS.g:342:11: (lv_version_10_0= ruleVersion )
            	    // InternalFILTERS.g:343:12: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	      												}
            	      												set(
            	      													current,
            	      													"version",
            	      													lv_version_10_0,
            	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.Version");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_11, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3());
            	      									
            	    }

            	    }

            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2());
            	      								
            	    }
            	    // InternalFILTERS.g:373:9: ( (lv_formatFile_14_0= RULE_ID ) )
            	    // InternalFILTERS.g:374:10: (lv_formatFile_14_0= RULE_ID )
            	    {
            	    // InternalFILTERS.g:374:10: (lv_formatFile_14_0= RULE_ID )
            	    // InternalFILTERS.g:375:11: lv_formatFile_14_0= RULE_ID
            	    {
            	    lv_formatFile_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_formatFile_14_0, grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileIDTerminalRuleCall_3_1_3_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGSSFilterMaxtermFilterRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"formatFile",
            	      												lv_formatFile_14_0,
            	      												"org.eclipse.xtext.common.Terminals.ID");
            	      										
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4());
            	      								
            	    }
            	    // InternalFILTERS.g:395:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=5;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            alt3=1;
            	            }
            	            break;
            	        case 26:
            	            {
            	            alt3=2;
            	            }
            	            break;
            	        case 27:
            	            {
            	            alt3=3;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt3=4;
            	            }
            	            break;

            	        }

            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalFILTERS.g:396:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    {
            	    	    // InternalFILTERS.g:396:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    // InternalFILTERS.g:397:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    {
            	    	    // InternalFILTERS.g:397:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    // InternalFILTERS.g:398:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_BoolVar_16_0=ruleGSSFilterBoolVar();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVar",
            	    	      													lv_BoolVar_16_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVar");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFILTERS.g:416:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    {
            	    	    // InternalFILTERS.g:416:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    // InternalFILTERS.g:417:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    {
            	    	    // InternalFILTERS.g:417:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    // InternalFILTERS.g:418:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_BoolVarFromArrayItem_17_0=ruleGSSFilterBoolVarFromArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromArrayItem",
            	    	      													lv_BoolVarFromArrayItem_17_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFromArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFILTERS.g:436:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    {
            	    	    // InternalFILTERS.g:436:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    // InternalFILTERS.g:437:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    {
            	    	    // InternalFILTERS.g:437:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    // InternalFILTERS.g:438:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_BoolVarFromGroupedArrayItem_18_0=ruleGSSFilterBoolVarFromGroupedArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromGroupedArrayItem",
            	    	      													lv_BoolVarFromGroupedArrayItem_18_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFromGroupedArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFILTERS.g:456:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    {
            	    	    // InternalFILTERS.g:456:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    // InternalFILTERS.g:457:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    {
            	    	    // InternalFILTERS.g:457:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    // InternalFILTERS.g:458:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_13);
            	    	    lv_BoolVarFDIC_19_0=ruleGSSFilterBoolVarFDIC();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFDIC",
            	    	      													lv_BoolVarFDIC_19_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFDIC");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());

            }

            // InternalFILTERS.g:490:3: ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==47) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFILTERS.g:491:4: (lv_Maxterm_20_0= ruleGSSFilterMaxterm )
            	    {
            	    // InternalFILTERS.g:491:4: (lv_Maxterm_20_0= ruleGSSFilterMaxterm )
            	    // InternalFILTERS.g:492:5: lv_Maxterm_20_0= ruleGSSFilterMaxterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_Maxterm_20_0=ruleGSSFilterMaxterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Maxterm",
            	      						lv_Maxterm_20_0,
            	      						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterMaxterm");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleGSSFilterMaxtermFilter"


    // $ANTLR start "entryRuleGSSFilterMintermFilter"
    // InternalFILTERS.g:524:1: entryRuleGSSFilterMintermFilter returns [EObject current=null] : iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF ;
    public final EObject entryRuleGSSFilterMintermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMintermFilter = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTERS.g:528:2: (iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF )
            // InternalFILTERS.g:529:2: iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterMintermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterMintermFilter=ruleGSSFilterMintermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterMintermFilter; 
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
    // $ANTLR end "entryRuleGSSFilterMintermFilter"


    // $ANTLR start "ruleGSSFilterMintermFilter"
    // InternalFILTERS.g:538:1: ruleGSSFilterMintermFilter returns [EObject current=null] : (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' ) ;
    public final EObject ruleGSSFilterMintermFilter() throws RecognitionException {
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
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_formatFile_14_0=null;
        Token otherlv_15=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;

        EObject lv_Minterm_20_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTERS.g:547:2: ( (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            // InternalFILTERS.g:548:2: (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalFILTERS.g:548:2: (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            // InternalFILTERS.g:549:3: otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0());
              		
            }
            // InternalFILTERS.g:553:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTERS.g:554:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTERS.g:554:4: (lv_name_1_0= RULE_ID )
            // InternalFILTERS.g:555:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSFilterMintermFilterAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterMintermFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalFILTERS.g:575:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalFILTERS.g:576:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalFILTERS.g:576:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalFILTERS.g:577:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());
            // InternalFILTERS.g:580:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            // InternalFILTERS.g:581:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalFILTERS.g:581:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFILTERS.g:582:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFILTERS.g:582:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFILTERS.g:583:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFILTERS.g:583:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFILTERS.g:584:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
            	    // InternalFILTERS.g:587:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFILTERS.g:587:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "true");
            	    }
            	    // InternalFILTERS.g:587:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFILTERS.g:587:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFILTERS.g:595:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFILTERS.g:596:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFILTERS.g:596:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFILTERS.g:597:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.filters.FILTERS.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFILTERS.g:624:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    {
            	    // InternalFILTERS.g:624:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    // InternalFILTERS.g:625:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFILTERS.g:625:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    // InternalFILTERS.g:626:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
            	    // InternalFILTERS.g:629:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    // InternalFILTERS.g:629:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "true");
            	    }
            	    // InternalFILTERS.g:629:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    // InternalFILTERS.g:629:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
            	    {
            	    // InternalFILTERS.g:629:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFILTERS.g:630:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_8, grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_3_1_0_0());
            	      									
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_9, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
            	      									
            	    }
            	    // InternalFILTERS.g:638:10: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFILTERS.g:639:11: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFILTERS.g:639:11: (lv_version_10_0= ruleVersion )
            	    // InternalFILTERS.g:640:12: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
            	      											
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      												if (current==null) {
            	      													current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	      												}
            	      												set(
            	      													current,
            	      													"version",
            	      													lv_version_10_0,
            	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.Version");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_11, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3());
            	      									
            	    }

            	    }

            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_3_1_1());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2());
            	      								
            	    }
            	    // InternalFILTERS.g:670:9: ( (lv_formatFile_14_0= RULE_ID ) )
            	    // InternalFILTERS.g:671:10: (lv_formatFile_14_0= RULE_ID )
            	    {
            	    // InternalFILTERS.g:671:10: (lv_formatFile_14_0= RULE_ID )
            	    // InternalFILTERS.g:672:11: lv_formatFile_14_0= RULE_ID
            	    {
            	    lv_formatFile_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_formatFile_14_0, grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileIDTerminalRuleCall_3_1_3_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getGSSFilterMintermFilterRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"formatFile",
            	      												lv_formatFile_14_0,
            	      												"org.eclipse.xtext.common.Terminals.ID");
            	      										
            	    }

            	    }


            	    }

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_4());
            	      								
            	    }
            	    // InternalFILTERS.g:692:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=5;
            	        switch ( input.LA(1) ) {
            	        case 22:
            	            {
            	            alt6=1;
            	            }
            	            break;
            	        case 26:
            	            {
            	            alt6=2;
            	            }
            	            break;
            	        case 27:
            	            {
            	            alt6=3;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt6=4;
            	            }
            	            break;

            	        }

            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalFILTERS.g:693:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    {
            	    	    // InternalFILTERS.g:693:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    // InternalFILTERS.g:694:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    {
            	    	    // InternalFILTERS.g:694:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    // InternalFILTERS.g:695:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_16);
            	    	    lv_BoolVar_16_0=ruleGSSFilterBoolVar();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVar",
            	    	      													lv_BoolVar_16_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVar");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFILTERS.g:713:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    {
            	    	    // InternalFILTERS.g:713:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    // InternalFILTERS.g:714:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    {
            	    	    // InternalFILTERS.g:714:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    // InternalFILTERS.g:715:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_16);
            	    	    lv_BoolVarFromArrayItem_17_0=ruleGSSFilterBoolVarFromArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromArrayItem",
            	    	      													lv_BoolVarFromArrayItem_17_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFromArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFILTERS.g:733:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    {
            	    	    // InternalFILTERS.g:733:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    // InternalFILTERS.g:734:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    {
            	    	    // InternalFILTERS.g:734:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    // InternalFILTERS.g:735:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_16);
            	    	    lv_BoolVarFromGroupedArrayItem_18_0=ruleGSSFilterBoolVarFromGroupedArrayItem();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFromGroupedArrayItem",
            	    	      													lv_BoolVarFromGroupedArrayItem_18_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFromGroupedArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFILTERS.g:753:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    {
            	    	    // InternalFILTERS.g:753:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    // InternalFILTERS.g:754:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    {
            	    	    // InternalFILTERS.g:754:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    // InternalFILTERS.g:755:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_16);
            	    	    lv_BoolVarFDIC_19_0=ruleGSSFilterBoolVarFDIC();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	    	      												}
            	    	      												add(
            	    	      													current,
            	    	      													"BoolVarFDIC",
            	    	      													lv_BoolVarFDIC_19_0,
            	    	      													"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarFDIC");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

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


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());

            }

            // InternalFILTERS.g:787:3: ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==48) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFILTERS.g:788:4: (lv_Minterm_20_0= ruleGSSFilterMinterm )
            	    {
            	    // InternalFILTERS.g:788:4: (lv_Minterm_20_0= ruleGSSFilterMinterm )
            	    // InternalFILTERS.g:789:5: lv_Minterm_20_0= ruleGSSFilterMinterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_Minterm_20_0=ruleGSSFilterMinterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Minterm",
            	      						lv_Minterm_20_0,
            	      						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterMinterm");
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

            otherlv_21=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleGSSFilterMintermFilter"


    // $ANTLR start "entryRuleGSSFilterBoolVar"
    // InternalFILTERS.g:821:1: entryRuleGSSFilterBoolVar returns [EObject current=null] : iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF ;
    public final EObject entryRuleGSSFilterBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVar = null;


        try {
            // InternalFILTERS.g:821:57: (iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF )
            // InternalFILTERS.g:822:2: iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterBoolVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterBoolVar=ruleGSSFilterBoolVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterBoolVar; 
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
    // $ANTLR end "entryRuleGSSFilterBoolVar"


    // $ANTLR start "ruleGSSFilterBoolVar"
    // InternalFILTERS.g:828:1: ruleGSSFilterBoolVar returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_FieldRef_14_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' ) ;
    public final EObject ruleGSSFilterBoolVar() throws RecognitionException {
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
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_FieldRef_14_0 = null;

        EObject lv_Op_15_0 = null;

        EObject lv_Constant_16_0 = null;

        EObject lv_Select_17_0 = null;

        EObject lv_SelectLine_18_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:834:2: ( (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_FieldRef_14_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' ) )
            // InternalFILTERS.g:835:2: (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_FieldRef_14_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' )
            {
            // InternalFILTERS.g:835:2: (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_FieldRef_14_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' )
            // InternalFILTERS.g:836:3: otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_FieldRef_14_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarAccess().getGSSFilterBoolVarKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:852:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:853:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:853:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTERS.g:854:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTERS.g:883:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTERS.g:884:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTERS.g:884:4: (lv_name_8_0= RULE_ID )
            // InternalFILTERS.g:885:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTERS.g:913:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTERS.g:914:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTERS.g:914:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTERS.g:915:5: lv_constantType_12_0= ruleGSSFilterConstantType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_constantType_12_0=ruleGSSFilterConstantType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
              					}
              					set(
              						current,
              						"constantType",
              						lv_constantType_12_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFILTERS.g:936:3: ( (lv_FieldRef_14_0= ruleGSSFilterFieldRef ) )
            // InternalFILTERS.g:937:4: (lv_FieldRef_14_0= ruleGSSFilterFieldRef )
            {
            // InternalFILTERS.g:937:4: (lv_FieldRef_14_0= ruleGSSFilterFieldRef )
            // InternalFILTERS.g:938:5: lv_FieldRef_14_0= ruleGSSFilterFieldRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFilterFieldRefParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_FieldRef_14_0=ruleGSSFilterFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
              					}
              					set(
              						current,
              						"FieldRef",
              						lv_FieldRef_14_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:955:3: ( (lv_Op_15_0= ruleGSSFilterFieldOp ) )
            // InternalFILTERS.g:956:4: (lv_Op_15_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTERS.g:956:4: (lv_Op_15_0= ruleGSSFilterFieldOp )
            // InternalFILTERS.g:957:5: lv_Op_15_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_15_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_Op_15_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_15_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:974:3: ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 40:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalFILTERS.g:975:4: ( (lv_Constant_16_0= ruleGSSFilterConstant ) )
                    {
                    // InternalFILTERS.g:975:4: ( (lv_Constant_16_0= ruleGSSFilterConstant ) )
                    // InternalFILTERS.g:976:5: (lv_Constant_16_0= ruleGSSFilterConstant )
                    {
                    // InternalFILTERS.g:976:5: (lv_Constant_16_0= ruleGSSFilterConstant )
                    // InternalFILTERS.g:977:6: lv_Constant_16_0= ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getConstantGSSFilterConstantParserRuleCall_16_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_Constant_16_0=ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_16_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:995:4: ( (lv_Select_17_0= ruleGSSFilterSelect ) )
                    {
                    // InternalFILTERS.g:995:4: ( (lv_Select_17_0= ruleGSSFilterSelect ) )
                    // InternalFILTERS.g:996:5: (lv_Select_17_0= ruleGSSFilterSelect )
                    {
                    // InternalFILTERS.g:996:5: (lv_Select_17_0= ruleGSSFilterSelect )
                    // InternalFILTERS.g:997:6: lv_Select_17_0= ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getSelectGSSFilterSelectParserRuleCall_16_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_Select_17_0=ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_17_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTERS.g:1015:4: ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) )
                    {
                    // InternalFILTERS.g:1015:4: ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) )
                    // InternalFILTERS.g:1016:5: (lv_SelectLine_18_0= ruleGSSFilterSelectLine )
                    {
                    // InternalFILTERS.g:1016:5: (lv_SelectLine_18_0= ruleGSSFilterSelectLine )
                    // InternalFILTERS.g:1017:6: lv_SelectLine_18_0= ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_SelectLine_18_0=ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_18_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_17());
              		
            }
            otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_18());
              		
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
    // $ANTLR end "ruleGSSFilterBoolVar"


    // $ANTLR start "entryRuleGSSFilterBoolVarFromArrayItem"
    // InternalFILTERS.g:1047:1: entryRuleGSSFilterBoolVarFromArrayItem returns [EObject current=null] : iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF ;
    public final EObject entryRuleGSSFilterBoolVarFromArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFromArrayItem = null;


        try {
            // InternalFILTERS.g:1047:70: (iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF )
            // InternalFILTERS.g:1048:2: iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterBoolVarFromArrayItem=ruleGSSFilterBoolVarFromArrayItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterBoolVarFromArrayItem; 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarFromArrayItem"


    // $ANTLR start "ruleGSSFilterBoolVarFromArrayItem"
    // InternalFILTERS.g:1054:1: ruleGSSFilterBoolVarFromArrayItem returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' ) ;
    public final EObject ruleGSSFilterBoolVarFromArrayItem() throws RecognitionException {
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
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_AIFieldRef_14_0 = null;

        EObject lv_Op_15_0 = null;

        EObject lv_Constant_16_0 = null;

        EObject lv_Select_17_0 = null;

        EObject lv_SelectLine_18_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:1060:2: ( (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' ) )
            // InternalFILTERS.g:1061:2: (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' )
            {
            // InternalFILTERS.g:1061:2: (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';' )
            // InternalFILTERS.g:1062:3: otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' ( (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef ) ) ( (lv_Op_15_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) ) otherlv_19= '}' otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGSSFilterBoolVarFromArrayItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:1078:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:1079:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:1079:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTERS.g:1080:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTERS.g:1109:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTERS.g:1110:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTERS.g:1110:4: (lv_name_8_0= RULE_ID )
            // InternalFILTERS.g:1111:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTERS.g:1139:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTERS.g:1140:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTERS.g:1140:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTERS.g:1141:5: lv_constantType_12_0= ruleGSSFilterConstantType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_constantType_12_0=ruleGSSFilterConstantType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"constantType",
              						lv_constantType_12_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFILTERS.g:1162:3: ( (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef ) )
            // InternalFILTERS.g:1163:4: (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef )
            {
            // InternalFILTERS.g:1163:4: (lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef )
            // InternalFILTERS.g:1164:5: lv_AIFieldRef_14_0= ruleGSSFilterAIFieldRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFilterAIFieldRefParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_AIFieldRef_14_0=ruleGSSFilterAIFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"AIFieldRef",
              						lv_AIFieldRef_14_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterAIFieldRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:1181:3: ( (lv_Op_15_0= ruleGSSFilterFieldOp ) )
            // InternalFILTERS.g:1182:4: (lv_Op_15_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTERS.g:1182:4: (lv_Op_15_0= ruleGSSFilterFieldOp )
            // InternalFILTERS.g:1183:5: lv_Op_15_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_15_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_Op_15_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_15_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:1200:3: ( ( (lv_Constant_16_0= ruleGSSFilterConstant ) ) | ( (lv_Select_17_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt10=1;
                }
                break;
            case 36:
                {
                alt10=2;
                }
                break;
            case 40:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalFILTERS.g:1201:4: ( (lv_Constant_16_0= ruleGSSFilterConstant ) )
                    {
                    // InternalFILTERS.g:1201:4: ( (lv_Constant_16_0= ruleGSSFilterConstant ) )
                    // InternalFILTERS.g:1202:5: (lv_Constant_16_0= ruleGSSFilterConstant )
                    {
                    // InternalFILTERS.g:1202:5: (lv_Constant_16_0= ruleGSSFilterConstant )
                    // InternalFILTERS.g:1203:6: lv_Constant_16_0= ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_16_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_Constant_16_0=ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_16_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:1221:4: ( (lv_Select_17_0= ruleGSSFilterSelect ) )
                    {
                    // InternalFILTERS.g:1221:4: ( (lv_Select_17_0= ruleGSSFilterSelect ) )
                    // InternalFILTERS.g:1222:5: (lv_Select_17_0= ruleGSSFilterSelect )
                    {
                    // InternalFILTERS.g:1222:5: (lv_Select_17_0= ruleGSSFilterSelect )
                    // InternalFILTERS.g:1223:6: lv_Select_17_0= ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_16_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_Select_17_0=ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_17_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTERS.g:1241:4: ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) )
                    {
                    // InternalFILTERS.g:1241:4: ( (lv_SelectLine_18_0= ruleGSSFilterSelectLine ) )
                    // InternalFILTERS.g:1242:5: (lv_SelectLine_18_0= ruleGSSFilterSelectLine )
                    {
                    // InternalFILTERS.g:1242:5: (lv_SelectLine_18_0= ruleGSSFilterSelectLine )
                    // InternalFILTERS.g:1243:6: lv_SelectLine_18_0= ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_16_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_SelectLine_18_0=ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_18_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_17());
              		
            }
            otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_18());
              		
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
    // $ANTLR end "ruleGSSFilterBoolVarFromArrayItem"


    // $ANTLR start "entryRuleGSSFilterBoolVarFromGroupedArrayItem"
    // InternalFILTERS.g:1273:1: entryRuleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF ;
    public final EObject entryRuleGSSFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFromGroupedArrayItem = null;


        try {
            // InternalFILTERS.g:1273:77: (iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF )
            // InternalFILTERS.g:1274:2: iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterBoolVarFromGroupedArrayItem=ruleGSSFilterBoolVarFromGroupedArrayItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterBoolVarFromGroupedArrayItem; 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "ruleGSSFilterBoolVarFromGroupedArrayItem"
    // InternalFILTERS.g:1280:1: ruleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= ruleEString ) ) otherlv_17= ';' ( (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs ) ) ( (lv_Op_19_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_20_0= ruleGSSFilterConstant ) ) | ( (lv_Select_21_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) ) ) otherlv_23= '}' otherlv_24= ';' ) ;
    public final EObject ruleGSSFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
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
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        AntlrDatatypeRuleToken lv_group_16_0 = null;

        EObject lv_AIFieldRefs_18_0 = null;

        EObject lv_Op_19_0 = null;

        EObject lv_Constant_20_0 = null;

        EObject lv_Select_21_0 = null;

        EObject lv_SelectLine_22_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:1286:2: ( (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= ruleEString ) ) otherlv_17= ';' ( (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs ) ) ( (lv_Op_19_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_20_0= ruleGSSFilterConstant ) ) | ( (lv_Select_21_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) ) ) otherlv_23= '}' otherlv_24= ';' ) )
            // InternalFILTERS.g:1287:2: (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= ruleEString ) ) otherlv_17= ';' ( (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs ) ) ( (lv_Op_19_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_20_0= ruleGSSFilterConstant ) ) | ( (lv_Select_21_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) ) ) otherlv_23= '}' otherlv_24= ';' )
            {
            // InternalFILTERS.g:1287:2: (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= ruleEString ) ) otherlv_17= ';' ( (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs ) ) ( (lv_Op_19_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_20_0= ruleGSSFilterConstant ) ) | ( (lv_Select_21_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) ) ) otherlv_23= '}' otherlv_24= ';' )
            // InternalFILTERS.g:1288:3: otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= ruleEString ) ) otherlv_17= ';' ( (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs ) ) ( (lv_Op_19_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_20_0= ruleGSSFilterConstant ) ) | ( (lv_Select_21_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) ) ) otherlv_23= '}' otherlv_24= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGSSFilterBoolVarFromGroupedArrayItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:1304:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:1305:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:1305:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTERS.g:1306:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTERS.g:1335:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTERS.g:1336:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTERS.g:1336:4: (lv_name_8_0= RULE_ID )
            // InternalFILTERS.g:1337:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTERS.g:1365:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTERS.g:1366:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTERS.g:1366:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTERS.g:1367:5: lv_constantType_12_0= ruleGSSFilterConstantType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeGSSFilterConstantTypeEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_constantType_12_0=ruleGSSFilterConstantType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"constantType",
              						lv_constantType_12_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalFILTERS.g:1396:3: ( (lv_group_16_0= ruleEString ) )
            // InternalFILTERS.g:1397:4: (lv_group_16_0= ruleEString )
            {
            // InternalFILTERS.g:1397:4: (lv_group_16_0= ruleEString )
            // InternalFILTERS.g:1398:5: lv_group_16_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupEStringParserRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_group_16_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"group",
              						lv_group_16_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17());
              		
            }
            // InternalFILTERS.g:1419:3: ( (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs ) )
            // InternalFILTERS.g:1420:4: (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs )
            {
            // InternalFILTERS.g:1420:4: (lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs )
            // InternalFILTERS.g:1421:5: lv_AIFieldRefs_18_0= ruleGSSFilterAIFieldRefs
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFilterAIFieldRefsParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_AIFieldRefs_18_0=ruleGSSFilterAIFieldRefs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"AIFieldRefs",
              						lv_AIFieldRefs_18_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterAIFieldRefs");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:1438:3: ( (lv_Op_19_0= ruleGSSFilterFieldOp ) )
            // InternalFILTERS.g:1439:4: (lv_Op_19_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTERS.g:1439:4: (lv_Op_19_0= ruleGSSFilterFieldOp )
            // InternalFILTERS.g:1440:5: lv_Op_19_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_19_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_Op_19_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_19_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:1457:3: ( ( (lv_Constant_20_0= ruleGSSFilterConstant ) ) | ( (lv_Select_21_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalFILTERS.g:1458:4: ( (lv_Constant_20_0= ruleGSSFilterConstant ) )
                    {
                    // InternalFILTERS.g:1458:4: ( (lv_Constant_20_0= ruleGSSFilterConstant ) )
                    // InternalFILTERS.g:1459:5: (lv_Constant_20_0= ruleGSSFilterConstant )
                    {
                    // InternalFILTERS.g:1459:5: (lv_Constant_20_0= ruleGSSFilterConstant )
                    // InternalFILTERS.g:1460:6: lv_Constant_20_0= ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_20_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_Constant_20_0=ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_20_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:1478:4: ( (lv_Select_21_0= ruleGSSFilterSelect ) )
                    {
                    // InternalFILTERS.g:1478:4: ( (lv_Select_21_0= ruleGSSFilterSelect ) )
                    // InternalFILTERS.g:1479:5: (lv_Select_21_0= ruleGSSFilterSelect )
                    {
                    // InternalFILTERS.g:1479:5: (lv_Select_21_0= ruleGSSFilterSelect )
                    // InternalFILTERS.g:1480:6: lv_Select_21_0= ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_20_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_Select_21_0=ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_21_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTERS.g:1498:4: ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) )
                    {
                    // InternalFILTERS.g:1498:4: ( (lv_SelectLine_22_0= ruleGSSFilterSelectLine ) )
                    // InternalFILTERS.g:1499:5: (lv_SelectLine_22_0= ruleGSSFilterSelectLine )
                    {
                    // InternalFILTERS.g:1499:5: (lv_SelectLine_22_0= ruleGSSFilterSelectLine )
                    // InternalFILTERS.g:1500:6: lv_SelectLine_22_0= ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_20_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_26);
                    lv_SelectLine_22_0=ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_22_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_21());
              		
            }
            otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_24, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_22());
              		
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
    // $ANTLR end "ruleGSSFilterBoolVarFromGroupedArrayItem"


    // $ANTLR start "entryRuleGSSFilterBoolVarFDIC"
    // InternalFILTERS.g:1530:1: entryRuleGSSFilterBoolVarFDIC returns [EObject current=null] : iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF ;
    public final EObject entryRuleGSSFilterBoolVarFDIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFDIC = null;


        try {
            // InternalFILTERS.g:1530:61: (iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF )
            // InternalFILTERS.g:1531:2: iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterBoolVarFDIC=ruleGSSFilterBoolVarFDIC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterBoolVarFDIC; 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarFDIC"


    // $ANTLR start "ruleGSSFilterBoolVarFDIC"
    // InternalFILTERS.g:1537:1: ruleGSSFilterBoolVarFDIC returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_FieldRef_10_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_11_0= ruleGSSFilterFieldOp ) ) otherlv_12= '}' otherlv_13= ';' ) ;
    public final EObject ruleGSSFilterBoolVarFDIC() throws RecognitionException {
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

        EObject lv_FieldRef_10_0 = null;

        EObject lv_Op_11_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:1543:2: ( (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_FieldRef_10_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_11_0= ruleGSSFilterFieldOp ) ) otherlv_12= '}' otherlv_13= ';' ) )
            // InternalFILTERS.g:1544:2: (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_FieldRef_10_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_11_0= ruleGSSFilterFieldOp ) ) otherlv_12= '}' otherlv_13= ';' )
            {
            // InternalFILTERS.g:1544:2: (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_FieldRef_10_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_11_0= ruleGSSFilterFieldOp ) ) otherlv_12= '}' otherlv_13= ';' )
            // InternalFILTERS.g:1545:3: otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' ( (lv_FieldRef_10_0= ruleGSSFilterFieldRef ) ) ( (lv_Op_11_0= ruleGSSFilterFieldOp ) ) otherlv_12= '}' otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFDICAccess().getGSSFilterBoolVarFDICKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFDICAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:1561:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:1562:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:1562:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTERS.g:1563:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFDICRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarFDICAccess().getNameKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTERS.g:1592:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTERS.g:1593:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTERS.g:1593:4: (lv_name_8_0= RULE_ID )
            // InternalFILTERS.g:1594:5: lv_name_8_0= RULE_ID
            {
            lv_name_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_8_0, grammarAccess.getGSSFilterBoolVarFDICAccess().getNameIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarFDICRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTERS.g:1614:3: ( (lv_FieldRef_10_0= ruleGSSFilterFieldRef ) )
            // InternalFILTERS.g:1615:4: (lv_FieldRef_10_0= ruleGSSFilterFieldRef )
            {
            // InternalFILTERS.g:1615:4: (lv_FieldRef_10_0= ruleGSSFilterFieldRef )
            // InternalFILTERS.g:1616:5: lv_FieldRef_10_0= ruleGSSFilterFieldRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFilterFieldRefParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_FieldRef_10_0=ruleGSSFilterFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFDICRule());
              					}
              					set(
              						current,
              						"FieldRef",
              						lv_FieldRef_10_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:1633:3: ( (lv_Op_11_0= ruleGSSFilterFieldOp ) )
            // InternalFILTERS.g:1634:4: (lv_Op_11_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTERS.g:1634:4: (lv_Op_11_0= ruleGSSFilterFieldOp )
            // InternalFILTERS.g:1635:5: lv_Op_11_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_11_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_Op_11_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFDICRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_11_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_12=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13());
              		
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
    // $ANTLR end "ruleGSSFilterBoolVarFDIC"


    // $ANTLR start "entryRuleGSSFilterFieldRef"
    // InternalFILTERS.g:1664:1: entryRuleGSSFilterFieldRef returns [EObject current=null] : iv_ruleGSSFilterFieldRef= ruleGSSFilterFieldRef EOF ;
    public final EObject entryRuleGSSFilterFieldRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterFieldRef = null;


        try {
            // InternalFILTERS.g:1664:58: (iv_ruleGSSFilterFieldRef= ruleGSSFilterFieldRef EOF )
            // InternalFILTERS.g:1665:2: iv_ruleGSSFilterFieldRef= ruleGSSFilterFieldRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterFieldRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterFieldRef=ruleGSSFilterFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterFieldRef; 
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
    // $ANTLR end "entryRuleGSSFilterFieldRef"


    // $ANTLR start "ruleGSSFilterFieldRef"
    // InternalFILTERS.g:1671:1: ruleGSSFilterFieldRef returns [EObject current=null] : (otherlv_0= 'GSSFilterFieldRef' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFilterFieldRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFILTERS.g:1677:2: ( (otherlv_0= 'GSSFilterFieldRef' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTERS.g:1678:2: (otherlv_0= 'GSSFilterFieldRef' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTERS.g:1678:2: (otherlv_0= 'GSSFilterFieldRef' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTERS.g:1679:3: otherlv_0= 'GSSFilterFieldRef' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterFieldRefAccess().getGSSFilterFieldRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterFieldRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterFieldRefAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterFieldRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:1695:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFILTERS.g:1696:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFILTERS.g:1696:4: (lv_name_4_0= RULE_ID )
            // InternalFILTERS.g:1697:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSFilterFieldRefAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterFieldRefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterFieldRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterFieldRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterFieldRefAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFilterFieldRef"


    // $ANTLR start "entryRuleGSSFilterFieldOp"
    // InternalFILTERS.g:1729:1: entryRuleGSSFilterFieldOp returns [EObject current=null] : iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF ;
    public final EObject entryRuleGSSFilterFieldOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterFieldOp = null;


        try {
            // InternalFILTERS.g:1729:57: (iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF )
            // InternalFILTERS.g:1730:2: iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterFieldOpRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterFieldOp=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterFieldOp; 
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
    // $ANTLR end "entryRuleGSSFilterFieldOp"


    // $ANTLR start "ruleGSSFilterFieldOp"
    // InternalFILTERS.g:1736:1: ruleGSSFilterFieldOp returns [EObject current=null] : (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFilterFieldOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:1742:2: ( (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTERS.g:1743:2: (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTERS.g:1743:2: (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTERS.g:1744:3: otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:1760:3: ( (lv_type_4_0= ruleGSSFilterOPType ) )
            // InternalFILTERS.g:1761:4: (lv_type_4_0= ruleGSSFilterOPType )
            {
            // InternalFILTERS.g:1761:4: (lv_type_4_0= ruleGSSFilterOPType )
            // InternalFILTERS.g:1762:5: lv_type_4_0= ruleGSSFilterOPType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterFieldOpAccess().getTypeGSSFilterOPTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_4_0=ruleGSSFilterOPType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterFieldOpRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterOPType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterFieldOpAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterFieldOpAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFilterFieldOp"


    // $ANTLR start "entryRuleGSSFilterConstant"
    // InternalFILTERS.g:1795:1: entryRuleGSSFilterConstant returns [EObject current=null] : iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF ;
    public final EObject entryRuleGSSFilterConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterConstant = null;


        try {
            // InternalFILTERS.g:1795:58: (iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF )
            // InternalFILTERS.g:1796:2: iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterConstantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterConstant=ruleGSSFilterConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterConstant; 
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
    // $ANTLR end "entryRuleGSSFilterConstant"


    // $ANTLR start "ruleGSSFilterConstant"
    // InternalFILTERS.g:1802:1: ruleGSSFilterConstant returns [EObject current=null] : (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSFilterConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_mask_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:1808:2: ( (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFILTERS.g:1809:2: (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFILTERS.g:1809:2: (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            // InternalFILTERS.g:1810:3: otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:1826:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:1827:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:1827:4: (lv_value_4_0= ruleINTEGER )
            // InternalFILTERS.g:1828:5: lv_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterConstantAccess().getValueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterConstantRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTERS.g:1849:3: (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFILTERS.g:1850:4: otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalFILTERS.g:1858:4: ( (lv_mask_8_0= RULE_HEXADECIMAL ) )
                    // InternalFILTERS.g:1859:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTERS.g:1859:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    // InternalFILTERS.g:1860:6: lv_mask_8_0= RULE_HEXADECIMAL
                    {
                    lv_mask_8_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mask_8_0, grammarAccess.getGSSFilterConstantAccess().getMaskHEXADECIMALTerminalRuleCall_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFilterConstantRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"mask",
                      							lv_mask_8_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.HEXADECIMAL");
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_6_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterConstantAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSFilterConstant"


    // $ANTLR start "entryRuleGSSFilterSelect"
    // InternalFILTERS.g:1893:1: entryRuleGSSFilterSelect returns [EObject current=null] : iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF ;
    public final EObject entryRuleGSSFilterSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterSelect = null;


        try {
            // InternalFILTERS.g:1893:56: (iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF )
            // InternalFILTERS.g:1894:2: iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterSelectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterSelect=ruleGSSFilterSelect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterSelect; 
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
    // $ANTLR end "entryRuleGSSFilterSelect"


    // $ANTLR start "ruleGSSFilterSelect"
    // InternalFILTERS.g:1900:1: ruleGSSFilterSelect returns [EObject current=null] : (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSFilterSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fromFile_4_0=null;
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
        Token lv_mask_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Enumerator lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_offset_12_0 = null;

        AntlrDatatypeRuleToken lv_size_16_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:1906:2: ( (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTERS.g:1907:2: (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTERS.g:1907:2: (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTERS.g:1908:3: otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterSelectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterSelectAccess().getFromFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:1924:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTERS.g:1925:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTERS.g:1925:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTERS.g:1926:5: lv_fromFile_4_0= RULE_ID
            {
            lv_fromFile_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_4_0, grammarAccess.getGSSFilterSelectAccess().getFromFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterSelectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTERS.g:1954:3: ( (lv_type_8_0= ruleGSSFilterSelectType ) )
            // InternalFILTERS.g:1955:4: (lv_type_8_0= ruleGSSFilterSelectType )
            {
            // InternalFILTERS.g:1955:4: (lv_type_8_0= ruleGSSFilterSelectType )
            // InternalFILTERS.g:1956:5: lv_type_8_0= ruleGSSFilterSelectType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterSelectAccess().getTypeGSSFilterSelectTypeEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_type_8_0=ruleGSSFilterSelectType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterSelectRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterSelectType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTERS.g:1977:3: (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFILTERS.g:1978:4: otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,38,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTERS.g:1986:4: ( (lv_offset_12_0= ruleINTEGER ) )
                    // InternalFILTERS.g:1987:5: (lv_offset_12_0= ruleINTEGER )
                    {
                    // InternalFILTERS.g:1987:5: (lv_offset_12_0= ruleINTEGER )
                    // InternalFILTERS.g:1988:6: lv_offset_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterSelectAccess().getOffsetINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_offset_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterSelectRule());
                      						}
                      						set(
                      							current,
                      							"offset",
                      							lv_offset_12_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTERS.g:2010:3: (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFILTERS.g:2011:4: otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTERS.g:2019:4: ( (lv_size_16_0= ruleINTEGER ) )
                    // InternalFILTERS.g:2020:5: (lv_size_16_0= ruleINTEGER )
                    {
                    // InternalFILTERS.g:2020:5: (lv_size_16_0= ruleINTEGER )
                    // InternalFILTERS.g:2021:6: lv_size_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterSelectAccess().getSizeINTEGERParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_size_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterSelectRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_16_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTERS.g:2043:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFILTERS.g:2044:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTERS.g:2052:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTERS.g:2053:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTERS.g:2053:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTERS.g:2054:6: lv_mask_20_0= RULE_HEXADECIMAL
                    {
                    lv_mask_20_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mask_20_0, grammarAccess.getGSSFilterSelectAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFilterSelectRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"mask",
                      							lv_mask_20_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.HEXADECIMAL");
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFilterSelectAccess().getRightCurlyBracketKeyword_13());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_14());
              		
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
    // $ANTLR end "ruleGSSFilterSelect"


    // $ANTLR start "entryRuleGSSFilterSelectLine"
    // InternalFILTERS.g:2087:1: entryRuleGSSFilterSelectLine returns [EObject current=null] : iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF ;
    public final EObject entryRuleGSSFilterSelectLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterSelectLine = null;


        try {
            // InternalFILTERS.g:2087:60: (iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF )
            // InternalFILTERS.g:2088:2: iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterSelectLineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterSelectLine=ruleGSSFilterSelectLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterSelectLine; 
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
    // $ANTLR end "entryRuleGSSFilterSelectLine"


    // $ANTLR start "ruleGSSFilterSelectLine"
    // InternalFILTERS.g:2094:1: ruleGSSFilterSelectLine returns [EObject current=null] : (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSFilterSelectLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_fromFile_4_0=null;
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
        Token lv_mask_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_line_8_0 = null;

        AntlrDatatypeRuleToken lv_leftTrim_12_0 = null;

        AntlrDatatypeRuleToken lv_rightTrim_16_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:2100:2: ( (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTERS.g:2101:2: (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTERS.g:2101:2: (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTERS.g:2102:3: otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterSelectLineAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterSelectLineAccess().getFromFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:2118:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTERS.g:2119:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTERS.g:2119:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTERS.g:2120:5: lv_fromFile_4_0= RULE_ID
            {
            lv_fromFile_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_4_0, grammarAccess.getGSSFilterSelectLineAccess().getFromFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterSelectLineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTERS.g:2148:3: ( (lv_line_8_0= ruleINTEGER ) )
            // InternalFILTERS.g:2149:4: (lv_line_8_0= ruleINTEGER )
            {
            // InternalFILTERS.g:2149:4: (lv_line_8_0= ruleINTEGER )
            // InternalFILTERS.g:2150:5: lv_line_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterSelectLineAccess().getLineINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_line_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterSelectLineRule());
              					}
              					set(
              						current,
              						"line",
              						lv_line_8_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTERS.g:2171:3: (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFILTERS.g:2172:4: otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,42,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTERS.g:2180:4: ( (lv_leftTrim_12_0= ruleINTEGER ) )
                    // InternalFILTERS.g:2181:5: (lv_leftTrim_12_0= ruleINTEGER )
                    {
                    // InternalFILTERS.g:2181:5: (lv_leftTrim_12_0= ruleINTEGER )
                    // InternalFILTERS.g:2182:6: lv_leftTrim_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_leftTrim_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterSelectLineRule());
                      						}
                      						set(
                      							current,
                      							"leftTrim",
                      							lv_leftTrim_12_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTERS.g:2204:3: (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFILTERS.g:2205:4: otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTERS.g:2213:4: ( (lv_rightTrim_16_0= ruleINTEGER ) )
                    // InternalFILTERS.g:2214:5: (lv_rightTrim_16_0= ruleINTEGER )
                    {
                    // InternalFILTERS.g:2214:5: (lv_rightTrim_16_0= ruleINTEGER )
                    // InternalFILTERS.g:2215:6: lv_rightTrim_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterSelectLineAccess().getRightTrimINTEGERParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_rightTrim_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterSelectLineRule());
                      						}
                      						set(
                      							current,
                      							"rightTrim",
                      							lv_rightTrim_16_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTERS.g:2237:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFILTERS.g:2238:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTERS.g:2246:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTERS.g:2247:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTERS.g:2247:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTERS.g:2248:6: lv_mask_20_0= RULE_HEXADECIMAL
                    {
                    lv_mask_20_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mask_20_0, grammarAccess.getGSSFilterSelectLineAccess().getMaskHEXADECIMALTerminalRuleCall_12_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSFilterSelectLineRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"mask",
                      							lv_mask_20_0,
                      							"es.uah.aut.srg.gss.lang.filters.FILTERS.HEXADECIMAL");
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFilterSelectLineAccess().getRightCurlyBracketKeyword_13());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_14());
              		
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
    // $ANTLR end "ruleGSSFilterSelectLine"


    // $ANTLR start "entryRuleGSSFilterAIFieldRef"
    // InternalFILTERS.g:2281:1: entryRuleGSSFilterAIFieldRef returns [EObject current=null] : iv_ruleGSSFilterAIFieldRef= ruleGSSFilterAIFieldRef EOF ;
    public final EObject entryRuleGSSFilterAIFieldRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterAIFieldRef = null;


        try {
            // InternalFILTERS.g:2281:60: (iv_ruleGSSFilterAIFieldRef= ruleGSSFilterAIFieldRef EOF )
            // InternalFILTERS.g:2282:2: iv_ruleGSSFilterAIFieldRef= ruleGSSFilterAIFieldRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterAIFieldRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterAIFieldRef=ruleGSSFilterAIFieldRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterAIFieldRef; 
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
    // $ANTLR end "entryRuleGSSFilterAIFieldRef"


    // $ANTLR start "ruleGSSFilterAIFieldRef"
    // InternalFILTERS.g:2288:1: ruleGSSFilterAIFieldRef returns [EObject current=null] : (otherlv_0= 'GSSFilterAIFieldRef' otherlv_1= '{' otherlv_2= 'index' otherlv_3= ':=' ( (lv_index_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFilterAIFieldRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_index_4_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:2294:2: ( (otherlv_0= 'GSSFilterAIFieldRef' otherlv_1= '{' otherlv_2= 'index' otherlv_3= ':=' ( (lv_index_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTERS.g:2295:2: (otherlv_0= 'GSSFilterAIFieldRef' otherlv_1= '{' otherlv_2= 'index' otherlv_3= ':=' ( (lv_index_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTERS.g:2295:2: (otherlv_0= 'GSSFilterAIFieldRef' otherlv_1= '{' otherlv_2= 'index' otherlv_3= ':=' ( (lv_index_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTERS.g:2296:3: otherlv_0= 'GSSFilterAIFieldRef' otherlv_1= '{' otherlv_2= 'index' otherlv_3= ':=' ( (lv_index_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterAIFieldRefAccess().getGSSFilterAIFieldRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterAIFieldRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterAIFieldRefAccess().getIndexKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterAIFieldRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:2312:3: ( (lv_index_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:2313:4: (lv_index_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:2313:4: (lv_index_4_0= ruleINTEGER )
            // InternalFILTERS.g:2314:5: lv_index_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterAIFieldRefAccess().getIndexINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_index_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterAIFieldRefRule());
              					}
              					set(
              						current,
              						"index",
              						lv_index_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterAIFieldRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterAIFieldRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterAIFieldRefAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFilterAIFieldRef"


    // $ANTLR start "entryRuleGSSFilterAIFieldRefs"
    // InternalFILTERS.g:2347:1: entryRuleGSSFilterAIFieldRefs returns [EObject current=null] : iv_ruleGSSFilterAIFieldRefs= ruleGSSFilterAIFieldRefs EOF ;
    public final EObject entryRuleGSSFilterAIFieldRefs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterAIFieldRefs = null;


        try {
            // InternalFILTERS.g:2347:61: (iv_ruleGSSFilterAIFieldRefs= ruleGSSFilterAIFieldRefs EOF )
            // InternalFILTERS.g:2348:2: iv_ruleGSSFilterAIFieldRefs= ruleGSSFilterAIFieldRefs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterAIFieldRefsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterAIFieldRefs=ruleGSSFilterAIFieldRefs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterAIFieldRefs; 
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
    // $ANTLR end "entryRuleGSSFilterAIFieldRefs"


    // $ANTLR start "ruleGSSFilterAIFieldRefs"
    // InternalFILTERS.g:2354:1: ruleGSSFilterAIFieldRefs returns [EObject current=null] : (otherlv_0= 'GSSFilterAIFieldRefs' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFilterAIFieldRefs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalFILTERS.g:2360:2: ( (otherlv_0= 'GSSFilterAIFieldRefs' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTERS.g:2361:2: (otherlv_0= 'GSSFilterAIFieldRefs' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTERS.g:2361:2: (otherlv_0= 'GSSFilterAIFieldRefs' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTERS.g:2362:3: otherlv_0= 'GSSFilterAIFieldRefs' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterAIFieldRefsAccess().getGSSFilterAIFieldRefsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterAIFieldRefsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterAIFieldRefsAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterAIFieldRefsAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:2378:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalFILTERS.g:2379:4: (lv_name_4_0= RULE_ID )
            {
            // InternalFILTERS.g:2379:4: (lv_name_4_0= RULE_ID )
            // InternalFILTERS.g:2380:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSFilterAIFieldRefsAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterAIFieldRefsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterAIFieldRefsAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterAIFieldRefsAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterAIFieldRefsAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFilterAIFieldRefs"


    // $ANTLR start "entryRuleGSSFilterMaxterm"
    // InternalFILTERS.g:2412:1: entryRuleGSSFilterMaxterm returns [EObject current=null] : iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF ;
    public final EObject entryRuleGSSFilterMaxterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMaxterm = null;


        try {
            // InternalFILTERS.g:2412:57: (iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF )
            // InternalFILTERS.g:2413:2: iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterMaxtermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterMaxterm=ruleGSSFilterMaxterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterMaxterm; 
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
    // $ANTLR end "entryRuleGSSFilterMaxterm"


    // $ANTLR start "ruleGSSFilterMaxterm"
    // InternalFILTERS.g:2419:1: ruleGSSFilterMaxterm returns [EObject current=null] : (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSFilterMaxterm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_BoolVarRef_6_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:2425:2: ( (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalFILTERS.g:2426:2: (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalFILTERS.g:2426:2: (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalFILTERS.g:2427:3: otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMaxtermAccess().getGSSFilterMaxtermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterMaxtermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMaxtermAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMaxtermAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:2443:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:2444:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:2444:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTERS.g:2445:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMaxtermAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTERS.g:2466:3: ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==49) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFILTERS.g:2467:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    {
            	    // InternalFILTERS.g:2467:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    // InternalFILTERS.g:2468:5: lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    lv_BoolVarRef_6_0=ruleGSSFilterBoolVarRef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermRule());
            	      					}
            	      					add(
            	      						current,
            	      						"BoolVarRef",
            	      						lv_BoolVarRef_6_0,
            	      						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarRef");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMaxtermAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSFilterMaxterm"


    // $ANTLR start "entryRuleGSSFilterMinterm"
    // InternalFILTERS.g:2497:1: entryRuleGSSFilterMinterm returns [EObject current=null] : iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF ;
    public final EObject entryRuleGSSFilterMinterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMinterm = null;


        try {
            // InternalFILTERS.g:2497:57: (iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF )
            // InternalFILTERS.g:2498:2: iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterMintermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterMinterm=ruleGSSFilterMinterm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterMinterm; 
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
    // $ANTLR end "entryRuleGSSFilterMinterm"


    // $ANTLR start "ruleGSSFilterMinterm"
    // InternalFILTERS.g:2504:1: ruleGSSFilterMinterm returns [EObject current=null] : (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) ( (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef ) )+ otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFilterMinterm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_BoolVarRef_5_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:2510:2: ( (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) ( (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef ) )+ otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTERS.g:2511:2: (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) ( (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef ) )+ otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTERS.g:2511:2: (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) ( (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef ) )+ otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTERS.g:2512:3: otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) ( (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef ) )+ otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMintermAccess().getGSSFilterMintermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterMintermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMintermAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMintermAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:2528:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:2529:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:2529:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTERS.g:2530:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMintermAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_44);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterMintermRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTERS.g:2547:3: ( (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFILTERS.g:2548:4: (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef )
            	    {
            	    // InternalFILTERS.g:2548:4: (lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef )
            	    // InternalFILTERS.g:2549:5: lv_BoolVarRef_5_0= ruleGSSFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    lv_BoolVarRef_5_0=ruleGSSFilterBoolVarRef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMintermRule());
            	      					}
            	      					add(
            	      						current,
            	      						"BoolVarRef",
            	      						lv_BoolVarRef_5_0,
            	      						"es.uah.aut.srg.gss.lang.filters.FILTERS.GSSFilterBoolVarRef");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFilterMinterm"


    // $ANTLR start "entryRuleGSSFilterBoolVarRef"
    // InternalFILTERS.g:2578:1: entryRuleGSSFilterBoolVarRef returns [EObject current=null] : iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF ;
    public final EObject entryRuleGSSFilterBoolVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarRef = null;


        try {
            // InternalFILTERS.g:2578:60: (iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF )
            // InternalFILTERS.g:2579:2: iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterBoolVarRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterBoolVarRef=ruleGSSFilterBoolVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterBoolVarRef; 
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
    // $ANTLR end "entryRuleGSSFilterBoolVarRef"


    // $ANTLR start "ruleGSSFilterBoolVarRef"
    // InternalFILTERS.g:2585:1: ruleGSSFilterBoolVarRef returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSFilterBoolVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_idRef_4_0 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:2591:2: ( (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTERS.g:2592:2: (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTERS.g:2592:2: (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTERS.g:2593:3: otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTERS.g:2609:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalFILTERS.g:2610:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalFILTERS.g:2610:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalFILTERS.g:2611:5: lv_idRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_idRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRefRule());
              					}
              					set(
              						current,
              						"idRef",
              						lv_idRef_4_0,
              						"es.uah.aut.srg.gss.lang.filters.FILTERS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterBoolVarRefAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarRefAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSFilterBoolVarRef"


    // $ANTLR start "entryRuleEString"
    // InternalFILTERS.g:2644:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFILTERS.g:2644:47: (iv_ruleEString= ruleEString EOF )
            // InternalFILTERS.g:2645:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFILTERS.g:2651:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFILTERS.g:2657:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFILTERS.g:2658:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFILTERS.g:2658:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalFILTERS.g:2659:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:2667:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFILTERS.g:2678:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFILTERS.g:2678:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFILTERS.g:2679:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalFILTERS.g:2685:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFILTERS.g:2691:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFILTERS.g:2692:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFILTERS.g:2692:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFILTERS.g:2693:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFILTERS.g:2700:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==51) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFILTERS.g:2701:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,51,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalFILTERS.g:2718:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalFILTERS.g:2718:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalFILTERS.g:2719:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalFILTERS.g:2725:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalFILTERS.g:2731:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalFILTERS.g:2732:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalFILTERS.g:2732:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalFILTERS.g:2733:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalFILTERS.g:2733:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID) ) {
                    alt24=2;
                }
                else if ( (LA24_1==EOF||LA24_1==14||LA24_1==51||LA24_1==53) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalFILTERS.g:2734:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:2742:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalFILTERS.g:2742:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalFILTERS.g:2743:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalFILTERS.g:2743:5: (this_INT_1= RULE_INT )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_INT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalFILTERS.g:2744:6: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_1);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
                              					
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); if (state.failed) return current;
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

            // InternalFILTERS.g:2761:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalFILTERS.g:2762:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,51,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFILTERS.g:2767:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_INT) ) {
            	        int LA26_1 = input.LA(2);

            	        if ( (LA26_1==EOF||LA26_1==14||LA26_1==51||LA26_1==53) ) {
            	            alt26=1;
            	        }
            	        else if ( (LA26_1==RULE_ID) ) {
            	            alt26=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 26, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA26_0==RULE_ID) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalFILTERS.g:2768:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFILTERS.g:2776:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalFILTERS.g:2776:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalFILTERS.g:2777:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalFILTERS.g:2777:6: (this_INT_5= RULE_INT )?
            	            int alt25=2;
            	            int LA25_0 = input.LA(1);

            	            if ( (LA25_0==RULE_INT) ) {
            	                alt25=1;
            	            }
            	            switch (alt25) {
            	                case 1 :
            	                    // InternalFILTERS.g:2778:7: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_5); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							current.merge(this_INT_5);
            	                      						
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
            	                      						
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); if (state.failed) return current;
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
            	    break loop27;
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
    // InternalFILTERS.g:2800:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalFILTERS.g:2800:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalFILTERS.g:2801:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalFILTERS.g:2807:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalFILTERS.g:2813:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalFILTERS.g:2814:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalFILTERS.g:2814:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalFILTERS.g:2815:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_48);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,52,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_49);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalFILTERS.g:2849:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalFILTERS.g:2849:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalFILTERS.g:2850:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalFILTERS.g:2856:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalFILTERS.g:2862:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalFILTERS.g:2863:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalFILTERS.g:2863:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT||LA29_0==54) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_HEXADECIMAL) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalFILTERS.g:2864:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalFILTERS.g:2864:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalFILTERS.g:2865:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalFILTERS.g:2865:4: (kw= '-' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==54) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalFILTERS.g:2866:5: kw= '-'
                            {
                            kw=(Token)match(input,54,FollowSets000.FOLLOW_50); if (state.failed) return current;
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
                    // InternalFILTERS.g:2881:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleGSSFilterConstantType"
    // InternalFILTERS.g:2892:1: ruleGSSFilterConstantType returns [Enumerator current=null] : ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) ;
    public final Enumerator ruleGSSFilterConstantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalFILTERS.g:2898:2: ( ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) )
            // InternalFILTERS.g:2899:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            {
            // InternalFILTERS.g:2899:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt30=1;
                }
                break;
            case 56:
                {
                alt30=2;
                }
                break;
            case 57:
                {
                alt30=3;
                }
                break;
            case 58:
                {
                alt30=4;
                }
                break;
            case 59:
                {
                alt30=5;
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
                    // InternalFILTERS.g:2900:3: (enumLiteral_0= 'decimal' )
                    {
                    // InternalFILTERS.g:2900:3: (enumLiteral_0= 'decimal' )
                    // InternalFILTERS.g:2901:4: enumLiteral_0= 'decimal'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFilterConstantTypeAccess().getDecimalEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:2908:3: (enumLiteral_1= 'hex' )
                    {
                    // InternalFILTERS.g:2908:3: (enumLiteral_1= 'hex' )
                    // InternalFILTERS.g:2909:4: enumLiteral_1= 'hex'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFilterConstantTypeAccess().getHexEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTERS.g:2916:3: (enumLiteral_2= 'binary' )
                    {
                    // InternalFILTERS.g:2916:3: (enumLiteral_2= 'binary' )
                    // InternalFILTERS.g:2917:4: enumLiteral_2= 'binary'
                    {
                    enumLiteral_2=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSFilterConstantTypeAccess().getBinaryEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTERS.g:2924:3: (enumLiteral_3= 'char' )
                    {
                    // InternalFILTERS.g:2924:3: (enumLiteral_3= 'char' )
                    // InternalFILTERS.g:2925:4: enumLiteral_3= 'char'
                    {
                    enumLiteral_3=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSFilterConstantTypeAccess().getCharEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTERS.g:2932:3: (enumLiteral_4= 'string' )
                    {
                    // InternalFILTERS.g:2932:3: (enumLiteral_4= 'string' )
                    // InternalFILTERS.g:2933:4: enumLiteral_4= 'string'
                    {
                    enumLiteral_4=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSFilterConstantTypeAccess().getStringEnumLiteralDeclaration_4());
                      			
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
    // $ANTLR end "ruleGSSFilterConstantType"


    // $ANTLR start "ruleGSSFilterOPType"
    // InternalFILTERS.g:2943:1: ruleGSSFilterOPType returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) ;
    public final Enumerator ruleGSSFilterOPType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalFILTERS.g:2949:2: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) )
            // InternalFILTERS.g:2950:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            {
            // InternalFILTERS.g:2950:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt31=1;
                }
                break;
            case 61:
                {
                alt31=2;
                }
                break;
            case 62:
                {
                alt31=3;
                }
                break;
            case 63:
                {
                alt31=4;
                }
                break;
            case 64:
                {
                alt31=5;
                }
                break;
            case 65:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalFILTERS.g:2951:3: (enumLiteral_0= 'equal' )
                    {
                    // InternalFILTERS.g:2951:3: (enumLiteral_0= 'equal' )
                    // InternalFILTERS.g:2952:4: enumLiteral_0= 'equal'
                    {
                    enumLiteral_0=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFilterOPTypeAccess().getEqualEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:2959:3: (enumLiteral_1= 'different' )
                    {
                    // InternalFILTERS.g:2959:3: (enumLiteral_1= 'different' )
                    // InternalFILTERS.g:2960:4: enumLiteral_1= 'different'
                    {
                    enumLiteral_1=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFilterOPTypeAccess().getDifferentEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTERS.g:2967:3: (enumLiteral_2= 'bigger_than' )
                    {
                    // InternalFILTERS.g:2967:3: (enumLiteral_2= 'bigger_than' )
                    // InternalFILTERS.g:2968:4: enumLiteral_2= 'bigger_than'
                    {
                    enumLiteral_2=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSFilterOPTypeAccess().getBigger_thanEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFILTERS.g:2975:3: (enumLiteral_3= 'smaller_than' )
                    {
                    // InternalFILTERS.g:2975:3: (enumLiteral_3= 'smaller_than' )
                    // InternalFILTERS.g:2976:4: enumLiteral_3= 'smaller_than'
                    {
                    enumLiteral_3=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSFilterOPTypeAccess().getSmaller_thanEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFILTERS.g:2983:3: (enumLiteral_4= 'bigger_or_equal' )
                    {
                    // InternalFILTERS.g:2983:3: (enumLiteral_4= 'bigger_or_equal' )
                    // InternalFILTERS.g:2984:4: enumLiteral_4= 'bigger_or_equal'
                    {
                    enumLiteral_4=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSFilterOPTypeAccess().getBigger_or_equalEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFILTERS.g:2991:3: (enumLiteral_5= 'smaller_or_equal' )
                    {
                    // InternalFILTERS.g:2991:3: (enumLiteral_5= 'smaller_or_equal' )
                    // InternalFILTERS.g:2992:4: enumLiteral_5= 'smaller_or_equal'
                    {
                    enumLiteral_5=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getGSSFilterOPTypeAccess().getSmaller_or_equalEnumLiteralDeclaration_5());
                      			
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
    // $ANTLR end "ruleGSSFilterOPType"


    // $ANTLR start "ruleGSSFilterSelectType"
    // InternalFILTERS.g:3002:1: ruleGSSFilterSelectType returns [Enumerator current=null] : ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) ;
    public final Enumerator ruleGSSFilterSelectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFILTERS.g:3008:2: ( ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) )
            // InternalFILTERS.g:3009:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            {
            // InternalFILTERS.g:3009:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt32=1;
                }
                break;
            case 39:
                {
                alt32=2;
                }
                break;
            case 67:
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
                    // InternalFILTERS.g:3010:3: (enumLiteral_0= 'data' )
                    {
                    // InternalFILTERS.g:3010:3: (enumLiteral_0= 'data' )
                    // InternalFILTERS.g:3011:4: enumLiteral_0= 'data'
                    {
                    enumLiteral_0=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSFilterSelectTypeAccess().getDataEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFILTERS.g:3018:3: (enumLiteral_1= 'size' )
                    {
                    // InternalFILTERS.g:3018:3: (enumLiteral_1= 'size' )
                    // InternalFILTERS.g:3019:4: enumLiteral_1= 'size'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTERS.g:3026:3: (enumLiteral_2= 'crc' )
                    {
                    // InternalFILTERS.g:3026:3: (enumLiteral_2= 'crc' )
                    // InternalFILTERS.g:3027:4: enumLiteral_2= 'crc'
                    {
                    enumLiteral_2=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSFilterSelectTypeAccess().getCrcEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSFilterSelectType"

    // $ANTLR start synpred3_InternalFILTERS
    public final void synpred3_InternalFILTERS_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFILTERS.g:285:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFILTERS.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFILTERS.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFILTERS.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFILTERS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTERS.g:286:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFILTERS.g:287:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTERS.g:290:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFILTERS.g:290:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFILTERS", "true");
        }
        // InternalFILTERS.g:290:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFILTERS.g:290:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return ;
        // InternalFILTERS.g:298:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFILTERS.g:299:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFILTERS.g:299:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFILTERS.g:300:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred3_InternalFILTERS

    // $ANTLR start synpred8_InternalFILTERS
    public final void synpred8_InternalFILTERS_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_formatFile_14_0=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;


        // InternalFILTERS.g:327:4: ( ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )
        // InternalFILTERS.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        {
        // InternalFILTERS.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        // InternalFILTERS.g:328:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalFILTERS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFILTERS.g:328:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        // InternalFILTERS.g:329:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
        // InternalFILTERS.g:332:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        // InternalFILTERS.g:332:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalFILTERS", "true");
        }
        // InternalFILTERS.g:332:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        // InternalFILTERS.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
        {
        // InternalFILTERS.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFILTERS.g:333:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalFILTERS.g:341:10: ( (lv_version_10_0= ruleVersion ) )
        // InternalFILTERS.g:342:11: (lv_version_10_0= ruleVersion )
        {
        // InternalFILTERS.g:342:11: (lv_version_10_0= ruleVersion )
        // InternalFILTERS.g:343:12: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_11); if (state.failed) return ;

        }

        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return ;
        // InternalFILTERS.g:373:9: ( (lv_formatFile_14_0= RULE_ID ) )
        // InternalFILTERS.g:374:10: (lv_formatFile_14_0= RULE_ID )
        {
        // InternalFILTERS.g:374:10: (lv_formatFile_14_0= RULE_ID )
        // InternalFILTERS.g:375:11: lv_formatFile_14_0= RULE_ID
        {
        lv_formatFile_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return ;
        // InternalFILTERS.g:395:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
        int cnt33=0;
        loop33:
        do {
            int alt33=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt33=1;
                }
                break;
            case 26:
                {
                alt33=2;
                }
                break;
            case 27:
                {
                alt33=3;
                }
                break;
            case 29:
                {
                alt33=4;
                }
                break;

            }

            switch (alt33) {
        	case 1 :
        	    // InternalFILTERS.g:396:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    {
        	    // InternalFILTERS.g:396:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    // InternalFILTERS.g:397:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    {
        	    // InternalFILTERS.g:397:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    // InternalFILTERS.g:398:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVar_16_0=ruleGSSFilterBoolVar();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFILTERS.g:416:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    {
        	    // InternalFILTERS.g:416:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    // InternalFILTERS.g:417:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    {
        	    // InternalFILTERS.g:417:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    // InternalFILTERS.g:418:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVarFromArrayItem_17_0=ruleGSSFilterBoolVarFromArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFILTERS.g:436:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    {
        	    // InternalFILTERS.g:436:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    // InternalFILTERS.g:437:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    {
        	    // InternalFILTERS.g:437:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    // InternalFILTERS.g:438:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVarFromGroupedArrayItem_18_0=ruleGSSFilterBoolVarFromGroupedArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFILTERS.g:456:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    {
        	    // InternalFILTERS.g:456:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    // InternalFILTERS.g:457:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    {
        	    // InternalFILTERS.g:457:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    // InternalFILTERS.g:458:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVarFDIC_19_0=ruleGSSFilterBoolVarFDIC();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt33 >= 1 ) break loop33;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(33, input);
                    throw eee;
            }
            cnt33++;
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalFILTERS

    // $ANTLR start synpred10_InternalFILTERS
    public final void synpred10_InternalFILTERS_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFILTERS.g:582:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFILTERS.g:582:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFILTERS.g:582:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFILTERS.g:583:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalFILTERS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTERS.g:583:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFILTERS.g:584:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTERS.g:587:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFILTERS.g:587:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalFILTERS", "true");
        }
        // InternalFILTERS.g:587:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFILTERS.g:587:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return ;
        // InternalFILTERS.g:595:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFILTERS.g:596:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFILTERS.g:596:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFILTERS.g:597:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred10_InternalFILTERS

    // $ANTLR start synpred15_InternalFILTERS
    public final void synpred15_InternalFILTERS_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_formatFile_14_0=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;


        // InternalFILTERS.g:624:4: ( ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )
        // InternalFILTERS.g:624:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        {
        // InternalFILTERS.g:624:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        // InternalFILTERS.g:625:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFILTERS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFILTERS.g:625:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        // InternalFILTERS.g:626:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
        // InternalFILTERS.g:629:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        // InternalFILTERS.g:629:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFILTERS", "true");
        }
        // InternalFILTERS.g:629:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        // InternalFILTERS.g:629:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( (lv_formatFile_14_0= RULE_ID ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
        {
        // InternalFILTERS.g:629:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFILTERS.g:630:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return ;
        // InternalFILTERS.g:638:10: ( (lv_version_10_0= ruleVersion ) )
        // InternalFILTERS.g:639:11: (lv_version_10_0= ruleVersion )
        {
        // InternalFILTERS.g:639:11: (lv_version_10_0= ruleVersion )
        // InternalFILTERS.g:640:12: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_3_1_0_2_0());
          											
        }
        pushFollow(FollowSets000.FOLLOW_6);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_11); if (state.failed) return ;

        }

        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return ;
        // InternalFILTERS.g:670:9: ( (lv_formatFile_14_0= RULE_ID ) )
        // InternalFILTERS.g:671:10: (lv_formatFile_14_0= RULE_ID )
        {
        // InternalFILTERS.g:671:10: (lv_formatFile_14_0= RULE_ID )
        // InternalFILTERS.g:672:11: lv_formatFile_14_0= RULE_ID
        {
        lv_formatFile_14_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return ;
        // InternalFILTERS.g:692:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
        int cnt34=0;
        loop34:
        do {
            int alt34=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt34=1;
                }
                break;
            case 26:
                {
                alt34=2;
                }
                break;
            case 27:
                {
                alt34=3;
                }
                break;
            case 29:
                {
                alt34=4;
                }
                break;

            }

            switch (alt34) {
        	case 1 :
        	    // InternalFILTERS.g:693:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    {
        	    // InternalFILTERS.g:693:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    // InternalFILTERS.g:694:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    {
        	    // InternalFILTERS.g:694:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    // InternalFILTERS.g:695:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVar_16_0=ruleGSSFilterBoolVar();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFILTERS.g:713:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    {
        	    // InternalFILTERS.g:713:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    // InternalFILTERS.g:714:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    {
        	    // InternalFILTERS.g:714:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    // InternalFILTERS.g:715:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVarFromArrayItem_17_0=ruleGSSFilterBoolVarFromArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFILTERS.g:733:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    {
        	    // InternalFILTERS.g:733:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    // InternalFILTERS.g:734:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    {
        	    // InternalFILTERS.g:734:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    // InternalFILTERS.g:735:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVarFromGroupedArrayItem_18_0=ruleGSSFilterBoolVarFromGroupedArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFILTERS.g:753:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    {
        	    // InternalFILTERS.g:753:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    // InternalFILTERS.g:754:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    {
        	    // InternalFILTERS.g:754:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    // InternalFILTERS.g:755:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_51);
        	    lv_BoolVarFDIC_19_0=ruleGSSFilterBoolVarFDIC();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt34 >= 1 ) break loop34;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(34, input);
                    throw eee;
            }
            cnt34++;
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalFILTERS

    // Delegated rules

    public final boolean synpred8_InternalFILTERS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFILTERS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFILTERS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFILTERS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFILTERS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFILTERS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFILTERS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFILTERS_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000209000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000800000060000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000090L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000002C400000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000080002C460000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000800000100000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001000000060000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000100002C460000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000100000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00400000000000A0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0F80000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000011200000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000050L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800100000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000C800100000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008800100000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000C0800100000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080800100000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000100000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000000002C400002L});
    }


}