package es.uah.aut.srg.gss.lang.filter.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.filter.services.FILTERGrammarAccess;



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
public class InternalFILTERParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HEXADECIMAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSFilterMaxtermFilter'", "'{'", "'uri'", "'version'", "'formatFile'", "'}'", "'GSSFilterMintermFilter'", "'GSSFilterBoolVar'", "'id'", "'name'", "'constantType'", "'FieldRef'", "'GSSFilterBoolVarFromArrayItem'", "'AIFieldRef'", "'GSSFilterBoolVarFromGroupedArrayItem'", "'group'", "'AIFieldRefs'", "'GSSFilterBoolVarFDIC'", "'GSSFilterFieldOp'", "'type'", "'GSSFilterConstant'", "'value'", "'mask'", "'GSSFilterSelect'", "'fromFile'", "'offset'", "'size'", "'GSSFilterSelectLine'", "'line'", "'leftTrim'", "'rightTrim'", "'GSSFilterMaxterm'", "'GSSFilterMinterm'", "'GSSFilterBoolVarRef'", "'idRef'", "'.'", "'('", "')'", "'::'", "'-'", "'decimal'", "'hex'", "'binary'", "'char'", "'string'", "'equal'", "'different'", "'bigger_than'", "'smaller_than'", "'bigger_or_equal'", "'smaller_or_equal'", "'data'", "'crc'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_HEXADECIMAL=6;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
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


        public InternalFILTERParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFILTERParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFILTERParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFILTER.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private FILTERGrammarAccess grammarAccess;

        public InternalFILTERParser(TokenStream input, FILTERGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected FILTERGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalFILTER.g:78:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalFILTER.g:78:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalFILTER.g:79:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalFILTER.g:85:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:91:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) ) )
            // InternalFILTER.g:92:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) )
            {
            // InternalFILTER.g:92:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) )
            // InternalFILTER.g:93:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) )
            {
            // InternalFILTER.g:93:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFILTER.g:94:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalFILTER.g:94:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalFILTER.g:95:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFILTER.g:112:3: ( (lv_element_1_0= ruleGSSFilterFilter ) )
            // InternalFILTER.g:113:4: (lv_element_1_0= ruleGSSFilterFilter )
            {
            // InternalFILTER.g:113:4: (lv_element_1_0= ruleGSSFilterFilter )
            // InternalFILTER.g:114:5: lv_element_1_0= ruleGSSFilterFilter
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFilter");
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
    // InternalFILTER.g:135:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalFILTER.g:135:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalFILTER.g:136:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalFILTER.g:142:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFILTER.g:148:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalFILTER.g:149:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalFILTER.g:149:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalFILTER.g:150:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalFILTER.g:158:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalFILTER.g:159:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalFILTER.g:159:4: (lv_importURI_2_0= RULE_STRING )
            // InternalFILTER.g:160:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleGSSFilterFilter"
    // InternalFILTER.g:184:1: entryRuleGSSFilterFilter returns [EObject current=null] : iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF ;
    public final EObject entryRuleGSSFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterFilter = null;


        try {
            // InternalFILTER.g:184:56: (iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF )
            // InternalFILTER.g:185:2: iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF
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
    // InternalFILTER.g:191:1: ruleGSSFilterFilter returns [EObject current=null] : (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter ) ;
    public final EObject ruleGSSFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject this_GSSFilterMaxtermFilter_0 = null;

        EObject this_GSSFilterMintermFilter_1 = null;



        	enterRule();

        try {
            // InternalFILTER.g:197:2: ( (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter ) )
            // InternalFILTER.g:198:2: (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter )
            {
            // InternalFILTER.g:198:2: (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter )
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
                    // InternalFILTER.g:199:3: this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter
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
                    // InternalFILTER.g:211:3: this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter
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
    // InternalFILTER.g:226:1: entryRuleGSSFilterMaxtermFilter returns [EObject current=null] : iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF ;
    public final EObject entryRuleGSSFilterMaxtermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMaxtermFilter = null;


        try {
            // InternalFILTER.g:226:63: (iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF )
            // InternalFILTER.g:227:2: iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSFilterMaxtermFilter"


    // $ANTLR start "ruleGSSFilterMaxtermFilter"
    // InternalFILTER.g:233:1: ruleGSSFilterMaxtermFilter returns [EObject current=null] : (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Maxterm_16_0= ruleGSSFilterMaxterm ) )+ otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleGSSFilterMaxtermFilter() throws RecognitionException {
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_uri_5_0 = null;

        AntlrDatatypeRuleToken lv_version_9_0 = null;

        EObject lv_BoolVar_15_0 = null;

        EObject lv_Maxterm_16_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:239:2: ( (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Maxterm_16_0= ruleGSSFilterMaxterm ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            // InternalFILTER.g:240:2: (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Maxterm_16_0= ruleGSSFilterMaxterm ) )+ otherlv_17= '}' otherlv_18= ';' )
            {
            // InternalFILTER.g:240:2: (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Maxterm_16_0= ruleGSSFilterMaxterm ) )+ otherlv_17= '}' otherlv_18= ';' )
            // InternalFILTER.g:241:3: otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Maxterm_16_0= ruleGSSFilterMaxterm ) )+ otherlv_17= '}' otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0());
              		
            }
            // InternalFILTER.g:245:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTER.g:246:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTER.g:246:4: (lv_name_1_0= RULE_ID )
            // InternalFILTER.g:247:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMaxtermFilterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalFILTER.g:275:3: ( (lv_uri_5_0= ruleQualifiedName ) )
            // InternalFILTER.g:276:4: (lv_uri_5_0= ruleQualifiedName )
            {
            // InternalFILTER.g:276:4: (lv_uri_5_0= ruleQualifiedName )
            // InternalFILTER.g:277:5: lv_uri_5_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getUriQualifiedNameParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_uri_5_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
              					}
              					set(
              						current,
              						"uri",
              						lv_uri_5_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_8());
              		
            }
            // InternalFILTER.g:306:3: ( (lv_version_9_0= ruleVersion ) )
            // InternalFILTER.g:307:4: (lv_version_9_0= ruleVersion )
            {
            // InternalFILTER.g:307:4: (lv_version_9_0= ruleVersion )
            // InternalFILTER.g:308:5: lv_version_9_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionVersionParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_9_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
              					}
              					set(
              						current,
              						"version",
              						lv_version_9_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.Version");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_12());
              		
            }
            // InternalFILTER.g:337:3: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:338:4: ( ruleVersionedQualifiedName )
            {
            // InternalFILTER.g:338:4: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:339:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterMaxtermFilterRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0());
              				
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

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_14());
              		
            }
            // InternalFILTER.g:360:3: ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22||LA3_0==27||LA3_0==29||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFILTER.g:361:4: (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar )
            	    {
            	    // InternalFILTER.g:361:4: (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar )
            	    // InternalFILTER.g:362:5: lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
            	    lv_BoolVar_15_0=ruleGSSFilterAbstractBoolVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"BoolVar",
            	      						lv_BoolVar_15_0,
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterAbstractBoolVar");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            // InternalFILTER.g:379:3: ( (lv_Maxterm_16_0= ruleGSSFilterMaxterm ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==46) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFILTER.g:380:4: (lv_Maxterm_16_0= ruleGSSFilterMaxterm )
            	    {
            	    // InternalFILTER.g:380:4: (lv_Maxterm_16_0= ruleGSSFilterMaxterm )
            	    // InternalFILTER.g:381:5: lv_Maxterm_16_0= ruleGSSFilterMaxterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_16_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_Maxterm_16_0=ruleGSSFilterMaxterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMaxtermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Maxterm",
            	      						lv_Maxterm_16_0,
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMaxterm");
            	      					afterParserOrEnumRuleCall();
            	      				
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

            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterMaxtermFilterAccess().getRightCurlyBracketKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_18());
              		
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
    // $ANTLR end "ruleGSSFilterMaxtermFilter"


    // $ANTLR start "entryRuleGSSFilterAbstractBoolVar"
    // InternalFILTER.g:410:1: entryRuleGSSFilterAbstractBoolVar returns [EObject current=null] : iv_ruleGSSFilterAbstractBoolVar= ruleGSSFilterAbstractBoolVar EOF ;
    public final EObject entryRuleGSSFilterAbstractBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterAbstractBoolVar = null;


        try {
            // InternalFILTER.g:410:65: (iv_ruleGSSFilterAbstractBoolVar= ruleGSSFilterAbstractBoolVar EOF )
            // InternalFILTER.g:411:2: iv_ruleGSSFilterAbstractBoolVar= ruleGSSFilterAbstractBoolVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterAbstractBoolVar=ruleGSSFilterAbstractBoolVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterAbstractBoolVar; 
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
    // $ANTLR end "entryRuleGSSFilterAbstractBoolVar"


    // $ANTLR start "ruleGSSFilterAbstractBoolVar"
    // InternalFILTER.g:417:1: ruleGSSFilterAbstractBoolVar returns [EObject current=null] : (this_GSSFilterBoolVar_0= ruleGSSFilterBoolVar | this_GSSFilterBoolVarFromArrayItem_1= ruleGSSFilterBoolVarFromArrayItem | this_GSSFilterBoolVarFromGroupedArrayItem_2= ruleGSSFilterBoolVarFromGroupedArrayItem | this_GSSFilterBoolVarFDIC_3= ruleGSSFilterBoolVarFDIC ) ;
    public final EObject ruleGSSFilterAbstractBoolVar() throws RecognitionException {
        EObject current = null;

        EObject this_GSSFilterBoolVar_0 = null;

        EObject this_GSSFilterBoolVarFromArrayItem_1 = null;

        EObject this_GSSFilterBoolVarFromGroupedArrayItem_2 = null;

        EObject this_GSSFilterBoolVarFDIC_3 = null;



        	enterRule();

        try {
            // InternalFILTER.g:423:2: ( (this_GSSFilterBoolVar_0= ruleGSSFilterBoolVar | this_GSSFilterBoolVarFromArrayItem_1= ruleGSSFilterBoolVarFromArrayItem | this_GSSFilterBoolVarFromGroupedArrayItem_2= ruleGSSFilterBoolVarFromGroupedArrayItem | this_GSSFilterBoolVarFDIC_3= ruleGSSFilterBoolVarFDIC ) )
            // InternalFILTER.g:424:2: (this_GSSFilterBoolVar_0= ruleGSSFilterBoolVar | this_GSSFilterBoolVarFromArrayItem_1= ruleGSSFilterBoolVarFromArrayItem | this_GSSFilterBoolVarFromGroupedArrayItem_2= ruleGSSFilterBoolVarFromGroupedArrayItem | this_GSSFilterBoolVarFDIC_3= ruleGSSFilterBoolVarFDIC )
            {
            // InternalFILTER.g:424:2: (this_GSSFilterBoolVar_0= ruleGSSFilterBoolVar | this_GSSFilterBoolVarFromArrayItem_1= ruleGSSFilterBoolVarFromArrayItem | this_GSSFilterBoolVarFromGroupedArrayItem_2= ruleGSSFilterBoolVarFromGroupedArrayItem | this_GSSFilterBoolVarFDIC_3= ruleGSSFilterBoolVarFDIC )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 27:
                {
                alt5=2;
                }
                break;
            case 29:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFILTER.g:425:3: this_GSSFilterBoolVar_0= ruleGSSFilterBoolVar
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterBoolVar_0=ruleGSSFilterBoolVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterBoolVar_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTER.g:437:3: this_GSSFilterBoolVarFromArrayItem_1= ruleGSSFilterBoolVarFromArrayItem
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromArrayItemParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterBoolVarFromArrayItem_1=ruleGSSFilterBoolVarFromArrayItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterBoolVarFromArrayItem_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalFILTER.g:449:3: this_GSSFilterBoolVarFromGroupedArrayItem_2= ruleGSSFilterBoolVarFromGroupedArrayItem
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterBoolVarFromGroupedArrayItem_2=ruleGSSFilterBoolVarFromGroupedArrayItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterBoolVarFromGroupedArrayItem_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalFILTER.g:461:3: this_GSSFilterBoolVarFDIC_3= ruleGSSFilterBoolVarFDIC
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterAbstractBoolVarAccess().getGSSFilterBoolVarFDICParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterBoolVarFDIC_3=ruleGSSFilterBoolVarFDIC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterBoolVarFDIC_3;
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
    // $ANTLR end "ruleGSSFilterAbstractBoolVar"


    // $ANTLR start "entryRuleGSSFilterMintermFilter"
    // InternalFILTER.g:476:1: entryRuleGSSFilterMintermFilter returns [EObject current=null] : iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF ;
    public final EObject entryRuleGSSFilterMintermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMintermFilter = null;


        try {
            // InternalFILTER.g:476:63: (iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF )
            // InternalFILTER.g:477:2: iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSFilterMintermFilter"


    // $ANTLR start "ruleGSSFilterMintermFilter"
    // InternalFILTER.g:483:1: ruleGSSFilterMintermFilter returns [EObject current=null] : (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Minterm_16_0= ruleGSSFilterMinterm ) )+ otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleGSSFilterMintermFilter() throws RecognitionException {
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_uri_5_0 = null;

        AntlrDatatypeRuleToken lv_version_9_0 = null;

        EObject lv_BoolVar_15_0 = null;

        EObject lv_Minterm_16_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:489:2: ( (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Minterm_16_0= ruleGSSFilterMinterm ) )+ otherlv_17= '}' otherlv_18= ';' ) )
            // InternalFILTER.g:490:2: (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Minterm_16_0= ruleGSSFilterMinterm ) )+ otherlv_17= '}' otherlv_18= ';' )
            {
            // InternalFILTER.g:490:2: (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Minterm_16_0= ruleGSSFilterMinterm ) )+ otherlv_17= '}' otherlv_18= ';' )
            // InternalFILTER.g:491:3: otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'uri' otherlv_4= ':=' ( (lv_uri_5_0= ruleQualifiedName ) ) otherlv_6= ';' otherlv_7= 'version' otherlv_8= ':=' ( (lv_version_9_0= ruleVersion ) ) otherlv_10= ';' otherlv_11= 'formatFile' otherlv_12= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_14= ';' ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+ ( (lv_Minterm_16_0= ruleGSSFilterMinterm ) )+ otherlv_17= '}' otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0());
              		
            }
            // InternalFILTER.g:495:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTER.g:496:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTER.g:496:4: (lv_name_1_0= RULE_ID )
            // InternalFILTER.g:497:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMintermFilterAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_4());
              		
            }
            // InternalFILTER.g:525:3: ( (lv_uri_5_0= ruleQualifiedName ) )
            // InternalFILTER.g:526:4: (lv_uri_5_0= ruleQualifiedName )
            {
            // InternalFILTER.g:526:4: (lv_uri_5_0= ruleQualifiedName )
            // InternalFILTER.g:527:5: lv_uri_5_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getUriQualifiedNameParserRuleCall_5_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_uri_5_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
              					}
              					set(
              						current,
              						"uri",
              						lv_uri_5_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_8());
              		
            }
            // InternalFILTER.g:556:3: ( (lv_version_9_0= ruleVersion ) )
            // InternalFILTER.g:557:4: (lv_version_9_0= ruleVersion )
            {
            // InternalFILTER.g:557:4: (lv_version_9_0= ruleVersion )
            // InternalFILTER.g:558:5: lv_version_9_0= ruleVersion
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getVersionVersionParserRuleCall_9_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_version_9_0=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
              					}
              					set(
              						current,
              						"version",
              						lv_version_9_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.Version");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_12());
              		
            }
            // InternalFILTER.g:587:3: ( ( ruleVersionedQualifiedName ) )
            // InternalFILTER.g:588:4: ( ruleVersionedQualifiedName )
            {
            // InternalFILTER.g:588:4: ( ruleVersionedQualifiedName )
            // InternalFILTER.g:589:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterMintermFilterRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatCrossReference_13_0());
              				
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

            otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_14());
              		
            }
            // InternalFILTER.g:610:3: ( (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22||LA6_0==27||LA6_0==29||LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFILTER.g:611:4: (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar )
            	    {
            	    // InternalFILTER.g:611:4: (lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar )
            	    // InternalFILTER.g:612:5: lv_BoolVar_15_0= ruleGSSFilterAbstractBoolVar
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterAbstractBoolVarParserRuleCall_15_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_BoolVar_15_0=ruleGSSFilterAbstractBoolVar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"BoolVar",
            	      						lv_BoolVar_15_0,
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterAbstractBoolVar");
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

            // InternalFILTER.g:629:3: ( (lv_Minterm_16_0= ruleGSSFilterMinterm ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==47) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFILTER.g:630:4: (lv_Minterm_16_0= ruleGSSFilterMinterm )
            	    {
            	    // InternalFILTER.g:630:4: (lv_Minterm_16_0= ruleGSSFilterMinterm )
            	    // InternalFILTER.g:631:5: lv_Minterm_16_0= ruleGSSFilterMinterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_16_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_Minterm_16_0=ruleGSSFilterMinterm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMintermFilterRule());
            	      					}
            	      					add(
            	      						current,
            	      						"Minterm",
            	      						lv_Minterm_16_0,
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMinterm");
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

            otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterMintermFilterAccess().getRightCurlyBracketKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_18());
              		
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
    // $ANTLR end "ruleGSSFilterMintermFilter"


    // $ANTLR start "entryRuleGSSFilterBoolVar"
    // InternalFILTER.g:660:1: entryRuleGSSFilterBoolVar returns [EObject current=null] : iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF ;
    public final EObject entryRuleGSSFilterBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVar = null;


        try {
            // InternalFILTER.g:660:57: (iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF )
            // InternalFILTER.g:661:2: iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF
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
    // InternalFILTER.g:667:1: ruleGSSFilterBoolVar returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_18_0 = null;

        EObject lv_value_19_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:673:2: ( (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' ) )
            // InternalFILTER.g:674:2: (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' )
            {
            // InternalFILTER.g:674:2: (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' )
            // InternalFILTER.g:675:3: otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
            // InternalFILTER.g:691:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:692:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:692:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:693:5: lv_id_4_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
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
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:722:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:723:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:723:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:724:5: lv_name_8_0= RULE_ID
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
            // InternalFILTER.g:752:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTER.g:753:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:753:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTER.g:754:5: lv_constantType_12_0= ruleGSSFilterConstantType
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFilterBoolVarAccess().getFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalFILTER.g:783:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:784:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:784:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:785:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getFieldRefGSSFormatFieldCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_17());
              		
            }
            // InternalFILTER.g:806:3: ( (lv_Op_18_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:807:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:807:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:808:5: lv_Op_18_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_Op_18_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_18_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTER.g:825:3: ( (lv_value_19_0= ruleGSSFilterValue ) )
            // InternalFILTER.g:826:4: (lv_value_19_0= ruleGSSFilterValue )
            {
            // InternalFILTER.g:826:4: (lv_value_19_0= ruleGSSFilterValue )
            // InternalFILTER.g:827:5: lv_value_19_0= ruleGSSFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getValueGSSFilterValueParserRuleCall_19_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_value_19_0=ruleGSSFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_19_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_20());
              		
            }
            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_21());
              		
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
    // InternalFILTER.g:856:1: entryRuleGSSFilterBoolVarFromArrayItem returns [EObject current=null] : iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF ;
    public final EObject entryRuleGSSFilterBoolVarFromArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFromArrayItem = null;


        try {
            // InternalFILTER.g:856:70: (iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF )
            // InternalFILTER.g:857:2: iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF
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
    // InternalFILTER.g:863:1: ruleGSSFilterBoolVarFromArrayItem returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_18_0 = null;

        EObject lv_value_19_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:869:2: ( (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' ) )
            // InternalFILTER.g:870:2: (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' )
            {
            // InternalFILTER.g:870:2: (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';' )
            // InternalFILTER.g:871:3: otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( (lv_value_19_0= ruleGSSFilterValue ) ) otherlv_20= '}' otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
            // InternalFILTER.g:887:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:888:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:888:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:889:5: lv_id_4_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
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
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:918:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:919:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:919:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:920:5: lv_name_8_0= RULE_ID
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
            // InternalFILTER.g:948:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTER.g:949:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:949:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTER.g:950:5: lv_constantType_12_0= ruleGSSFilterConstantType
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalFILTER.g:979:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:980:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:980:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:981:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getAIFieldRefGSSFormatAIFieldCrossReference_16_0());
              				
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17());
              		
            }
            // InternalFILTER.g:1002:3: ( (lv_Op_18_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:1003:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:1003:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:1004:5: lv_Op_18_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_Op_18_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_18_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTER.g:1021:3: ( (lv_value_19_0= ruleGSSFilterValue ) )
            // InternalFILTER.g:1022:4: (lv_value_19_0= ruleGSSFilterValue )
            {
            // InternalFILTER.g:1022:4: (lv_value_19_0= ruleGSSFilterValue )
            // InternalFILTER.g:1023:5: lv_value_19_0= ruleGSSFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getValueGSSFilterValueParserRuleCall_19_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_value_19_0=ruleGSSFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_19_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20());
              		
            }
            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21());
              		
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
    // InternalFILTER.g:1052:1: entryRuleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF ;
    public final EObject entryRuleGSSFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFromGroupedArrayItem = null;


        try {
            // InternalFILTER.g:1052:77: (iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF )
            // InternalFILTER.g:1053:2: iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF
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
    // InternalFILTER.g:1059:1: ruleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( (lv_value_23_0= ruleGSSFilterValue ) ) otherlv_24= '}' otherlv_25= ';' ) ;
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
        Token lv_group_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_22_0 = null;

        EObject lv_value_23_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1065:2: ( (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( (lv_value_23_0= ruleGSSFilterValue ) ) otherlv_24= '}' otherlv_25= ';' ) )
            // InternalFILTER.g:1066:2: (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( (lv_value_23_0= ruleGSSFilterValue ) ) otherlv_24= '}' otherlv_25= ';' )
            {
            // InternalFILTER.g:1066:2: (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( (lv_value_23_0= ruleGSSFilterValue ) ) otherlv_24= '}' otherlv_25= ';' )
            // InternalFILTER.g:1067:3: otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( (lv_value_23_0= ruleGSSFilterValue ) ) otherlv_24= '}' otherlv_25= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
            // InternalFILTER.g:1083:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1084:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1084:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1085:5: lv_id_4_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
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
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1114:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1115:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1115:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1116:5: lv_name_8_0= RULE_ID
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
            // InternalFILTER.g:1144:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTER.g:1145:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:1145:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTER.g:1146:5: lv_constantType_12_0= ruleGSSFilterConstantType
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstantType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalFILTER.g:1175:3: ( (lv_group_16_0= RULE_ID ) )
            // InternalFILTER.g:1176:4: (lv_group_16_0= RULE_ID )
            {
            // InternalFILTER.g:1176:4: (lv_group_16_0= RULE_ID )
            // InternalFILTER.g:1177:5: lv_group_16_0= RULE_ID
            {
            lv_group_16_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_group_16_0, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGroupIDTerminalRuleCall_16_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					setWithLastConsumed(
              						current,
              						"group",
              						lv_group_16_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,31,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalFILTER.g:1205:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1206:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1206:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1207:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getAIFieldRefsGSSFormatAFieldCrossReference_20_0());
              				
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21());
              		
            }
            // InternalFILTER.g:1228:3: ( (lv_Op_22_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:1229:4: (lv_Op_22_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:1229:4: (lv_Op_22_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:1230:5: lv_Op_22_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_22_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_Op_22_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_22_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFILTER.g:1247:3: ( (lv_value_23_0= ruleGSSFilterValue ) )
            // InternalFILTER.g:1248:4: (lv_value_23_0= ruleGSSFilterValue )
            {
            // InternalFILTER.g:1248:4: (lv_value_23_0= ruleGSSFilterValue )
            // InternalFILTER.g:1249:5: lv_value_23_0= ruleGSSFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getValueGSSFilterValueParserRuleCall_23_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_value_23_0=ruleGSSFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_23_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_24=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_24, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25());
              		
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
    // InternalFILTER.g:1278:1: entryRuleGSSFilterBoolVarFDIC returns [EObject current=null] : iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF ;
    public final EObject entryRuleGSSFilterBoolVarFDIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFDIC = null;


        try {
            // InternalFILTER.g:1278:61: (iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF )
            // InternalFILTER.g:1279:2: iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF
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
    // InternalFILTER.g:1285:1: ruleGSSFilterBoolVarFDIC returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' ) ;
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
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        EObject lv_Op_14_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1291:2: ( (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' ) )
            // InternalFILTER.g:1292:2: (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalFILTER.g:1292:2: (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' )
            // InternalFILTER.g:1293:3: otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
            // InternalFILTER.g:1309:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1310:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1310:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1311:5: lv_id_4_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
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
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1340:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1341:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1341:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1342:5: lv_name_8_0= RULE_ID
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
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:1370:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1371:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1371:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1372:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSFilterBoolVarFDICRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getFieldRefGSSFormatFDICFieldCrossReference_12_0());
              				
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFILTER.g:1393:3: ( (lv_Op_14_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:1394:4: (lv_Op_14_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:1394:4: (lv_Op_14_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:1395:5: lv_Op_14_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
            lv_Op_14_0=ruleGSSFilterFieldOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFDICRule());
              					}
              					set(
              						current,
              						"Op",
              						lv_Op_14_0,
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterFieldOp");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSFilterBoolVarFDICAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_16());
              		
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


    // $ANTLR start "entryRuleGSSFilterValue"
    // InternalFILTER.g:1424:1: entryRuleGSSFilterValue returns [EObject current=null] : iv_ruleGSSFilterValue= ruleGSSFilterValue EOF ;
    public final EObject entryRuleGSSFilterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterValue = null;


        try {
            // InternalFILTER.g:1424:55: (iv_ruleGSSFilterValue= ruleGSSFilterValue EOF )
            // InternalFILTER.g:1425:2: iv_ruleGSSFilterValue= ruleGSSFilterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSFilterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSFilterValue=ruleGSSFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSFilterValue; 
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
    // $ANTLR end "entryRuleGSSFilterValue"


    // $ANTLR start "ruleGSSFilterValue"
    // InternalFILTER.g:1431:1: ruleGSSFilterValue returns [EObject current=null] : (this_GSSFilterConstant_0= ruleGSSFilterConstant | this_GSSFilterSelect_1= ruleGSSFilterSelect | this_GSSFilterSelectLine_2= ruleGSSFilterSelectLine ) ;
    public final EObject ruleGSSFilterValue() throws RecognitionException {
        EObject current = null;

        EObject this_GSSFilterConstant_0 = null;

        EObject this_GSSFilterSelect_1 = null;

        EObject this_GSSFilterSelectLine_2 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1437:2: ( (this_GSSFilterConstant_0= ruleGSSFilterConstant | this_GSSFilterSelect_1= ruleGSSFilterSelect | this_GSSFilterSelectLine_2= ruleGSSFilterSelectLine ) )
            // InternalFILTER.g:1438:2: (this_GSSFilterConstant_0= ruleGSSFilterConstant | this_GSSFilterSelect_1= ruleGSSFilterSelect | this_GSSFilterSelectLine_2= ruleGSSFilterSelectLine )
            {
            // InternalFILTER.g:1438:2: (this_GSSFilterConstant_0= ruleGSSFilterConstant | this_GSSFilterSelect_1= ruleGSSFilterSelect | this_GSSFilterSelectLine_2= ruleGSSFilterSelectLine )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalFILTER.g:1439:3: this_GSSFilterConstant_0= ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterValueAccess().getGSSFilterConstantParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterConstant_0=ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterConstant_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTER.g:1451:3: this_GSSFilterSelect_1= ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterSelect_1=ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterSelect_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalFILTER.g:1463:3: this_GSSFilterSelectLine_2= ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSFilterValueAccess().getGSSFilterSelectLineParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSFilterSelectLine_2=ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSFilterSelectLine_2;
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
    // $ANTLR end "ruleGSSFilterValue"


    // $ANTLR start "entryRuleGSSFilterFieldOp"
    // InternalFILTER.g:1478:1: entryRuleGSSFilterFieldOp returns [EObject current=null] : iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF ;
    public final EObject entryRuleGSSFilterFieldOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterFieldOp = null;


        try {
            // InternalFILTER.g:1478:57: (iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF )
            // InternalFILTER.g:1479:2: iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF
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
    // InternalFILTER.g:1485:1: ruleGSSFilterFieldOp returns [EObject current=null] : (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalFILTER.g:1491:2: ( (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTER.g:1492:2: (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTER.g:1492:2: (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTER.g:1493:3: otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1509:3: ( (lv_type_4_0= ruleGSSFilterOPType ) )
            // InternalFILTER.g:1510:4: (lv_type_4_0= ruleGSSFilterOPType )
            {
            // InternalFILTER.g:1510:4: (lv_type_4_0= ruleGSSFilterOPType )
            // InternalFILTER.g:1511:5: lv_type_4_0= ruleGSSFilterOPType
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterOPType");
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
    // InternalFILTER.g:1544:1: entryRuleGSSFilterConstant returns [EObject current=null] : iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF ;
    public final EObject entryRuleGSSFilterConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterConstant = null;


        try {
            // InternalFILTER.g:1544:58: (iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF )
            // InternalFILTER.g:1545:2: iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF
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
    // InternalFILTER.g:1551:1: ruleGSSFilterConstant returns [EObject current=null] : (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalFILTER.g:1557:2: ( (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFILTER.g:1558:2: (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFILTER.g:1558:2: (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            // InternalFILTER.g:1559:3: otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1575:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1576:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1576:4: (lv_value_4_0= ruleINTEGER )
            // InternalFILTER.g:1577:5: lv_value_4_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:1598:3: (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalFILTER.g:1599:4: otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalFILTER.g:1607:4: ( (lv_mask_8_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:1608:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:1608:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:1609:6: lv_mask_8_0= RULE_HEXADECIMAL
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
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.HEXADECIMAL");
                      					
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
    // InternalFILTER.g:1642:1: entryRuleGSSFilterSelect returns [EObject current=null] : iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF ;
    public final EObject entryRuleGSSFilterSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterSelect = null;


        try {
            // InternalFILTER.g:1642:56: (iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF )
            // InternalFILTER.g:1643:2: iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF
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
    // InternalFILTER.g:1649:1: ruleGSSFilterSelect returns [EObject current=null] : (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalFILTER.g:1655:2: ( (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:1656:2: (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:1656:2: (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:1657:3: otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterSelectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterSelectAccess().getFromFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1673:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTER.g:1674:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTER.g:1674:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTER.g:1675:5: lv_fromFile_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1703:3: ( (lv_type_8_0= ruleGSSFilterSelectType ) )
            // InternalFILTER.g:1704:4: (lv_type_8_0= ruleGSSFilterSelectType )
            {
            // InternalFILTER.g:1704:4: (lv_type_8_0= ruleGSSFilterSelectType )
            // InternalFILTER.g:1705:5: lv_type_8_0= ruleGSSFilterSelectType
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelectType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTER.g:1726:3: (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFILTER.g:1727:4: otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTER.g:1735:4: ( (lv_offset_12_0= ruleINTEGER ) )
                    // InternalFILTER.g:1736:5: (lv_offset_12_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:1736:5: (lv_offset_12_0= ruleINTEGER )
                    // InternalFILTER.g:1737:6: lv_offset_12_0= ruleINTEGER
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
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:1759:3: (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFILTER.g:1760:4: otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTER.g:1768:4: ( (lv_size_16_0= ruleINTEGER ) )
                    // InternalFILTER.g:1769:5: (lv_size_16_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:1769:5: (lv_size_16_0= ruleINTEGER )
                    // InternalFILTER.g:1770:6: lv_size_16_0= ruleINTEGER
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
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:1792:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFILTER.g:1793:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTER.g:1801:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:1802:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:1802:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:1803:6: lv_mask_20_0= RULE_HEXADECIMAL
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
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.HEXADECIMAL");
                      					
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
    // InternalFILTER.g:1836:1: entryRuleGSSFilterSelectLine returns [EObject current=null] : iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF ;
    public final EObject entryRuleGSSFilterSelectLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterSelectLine = null;


        try {
            // InternalFILTER.g:1836:60: (iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF )
            // InternalFILTER.g:1837:2: iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF
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
    // InternalFILTER.g:1843:1: ruleGSSFilterSelectLine returns [EObject current=null] : (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalFILTER.g:1849:2: ( (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:1850:2: (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:1850:2: (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:1851:3: otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterSelectLineAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterSelectLineAccess().getFromFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1867:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTER.g:1868:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTER.g:1868:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTER.g:1869:5: lv_fromFile_4_0= RULE_ID
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1897:3: ( (lv_line_8_0= ruleINTEGER ) )
            // InternalFILTER.g:1898:4: (lv_line_8_0= ruleINTEGER )
            {
            // InternalFILTER.g:1898:4: (lv_line_8_0= ruleINTEGER )
            // InternalFILTER.g:1899:5: lv_line_8_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTER.g:1920:3: (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFILTER.g:1921:4: otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,44,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTER.g:1929:4: ( (lv_leftTrim_12_0= ruleINTEGER ) )
                    // InternalFILTER.g:1930:5: (lv_leftTrim_12_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:1930:5: (lv_leftTrim_12_0= ruleINTEGER )
                    // InternalFILTER.g:1931:6: lv_leftTrim_12_0= ruleINTEGER
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
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:1953:3: (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==45) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFILTER.g:1954:4: otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTER.g:1962:4: ( (lv_rightTrim_16_0= ruleINTEGER ) )
                    // InternalFILTER.g:1963:5: (lv_rightTrim_16_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:1963:5: (lv_rightTrim_16_0= ruleINTEGER )
                    // InternalFILTER.g:1964:6: lv_rightTrim_16_0= ruleINTEGER
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
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:1986:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFILTER.g:1987:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTER.g:1995:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:1996:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:1996:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:1997:6: lv_mask_20_0= RULE_HEXADECIMAL
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
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.HEXADECIMAL");
                      					
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


    // $ANTLR start "entryRuleGSSFilterMaxterm"
    // InternalFILTER.g:2030:1: entryRuleGSSFilterMaxterm returns [EObject current=null] : iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF ;
    public final EObject entryRuleGSSFilterMaxterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMaxterm = null;


        try {
            // InternalFILTER.g:2030:57: (iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF )
            // InternalFILTER.g:2031:2: iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF
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
    // InternalFILTER.g:2037:1: ruleGSSFilterMaxterm returns [EObject current=null] : (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
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
            // InternalFILTER.g:2043:2: ( (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalFILTER.g:2044:2: (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalFILTER.g:2044:2: (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalFILTER.g:2045:3: otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
            // InternalFILTER.g:2061:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2062:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2062:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:2063:5: lv_id_4_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:2084:3: ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==48) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFILTER.g:2085:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    {
            	    // InternalFILTER.g:2085:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    // InternalFILTER.g:2086:5: lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_43);
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
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarRef");
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
    // InternalFILTER.g:2115:1: entryRuleGSSFilterMinterm returns [EObject current=null] : iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF ;
    public final EObject entryRuleGSSFilterMinterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMinterm = null;


        try {
            // InternalFILTER.g:2115:57: (iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF )
            // InternalFILTER.g:2116:2: iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF
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
    // InternalFILTER.g:2122:1: ruleGSSFilterMinterm returns [EObject current=null] : (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSFilterMinterm() throws RecognitionException {
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
            // InternalFILTER.g:2128:2: ( (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalFILTER.g:2129:2: (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalFILTER.g:2129:2: (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalFILTER.g:2130:3: otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_8); if (state.failed) return current;
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
            // InternalFILTER.g:2146:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2147:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2147:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:2148:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterMintermAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:2169:3: ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalFILTER.g:2170:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    {
            	    // InternalFILTER.g:2170:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    // InternalFILTER.g:2171:5: lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_43);
            	    lv_BoolVarRef_6_0=ruleGSSFilterBoolVarRef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSFilterMintermRule());
            	      					}
            	      					add(
            	      						current,
            	      						"BoolVarRef",
            	      						lv_BoolVarRef_6_0,
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarRef");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterMintermAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_8());
              		
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
    // InternalFILTER.g:2200:1: entryRuleGSSFilterBoolVarRef returns [EObject current=null] : iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF ;
    public final EObject entryRuleGSSFilterBoolVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarRef = null;


        try {
            // InternalFILTER.g:2200:60: (iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF )
            // InternalFILTER.g:2201:2: iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF
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
    // InternalFILTER.g:2207:1: ruleGSSFilterBoolVarRef returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalFILTER.g:2213:2: ( (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTER.g:2214:2: (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTER.g:2214:2: (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTER.g:2215:3: otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2231:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2232:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2232:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalFILTER.g:2233:5: lv_idRef_4_0= ruleINTEGER
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
              						"es.uah.aut.srg.gss.lang.filter.FILTER.INTEGER");
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalFILTER.g:2266:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFILTER.g:2266:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFILTER.g:2267:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalFILTER.g:2273:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2279:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFILTER.g:2280:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFILTER.g:2280:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFILTER.g:2281:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFILTER.g:2288:3: (kw= '.' this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFILTER.g:2289:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalFILTER.g:2306:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalFILTER.g:2306:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalFILTER.g:2307:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalFILTER.g:2313:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalFILTER.g:2319:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalFILTER.g:2320:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalFILTER.g:2320:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalFILTER.g:2321:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalFILTER.g:2321:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_ID) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EOF||LA20_1==14||LA20_1==50||LA20_1==52) ) {
                    alt20=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFILTER.g:2322:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTER.g:2330:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalFILTER.g:2330:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalFILTER.g:2331:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalFILTER.g:2331:5: (this_INT_1= RULE_INT )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==RULE_INT) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalFILTER.g:2332:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
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

            // InternalFILTER.g:2349:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==50) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFILTER.g:2350:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFILTER.g:2355:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_INT) ) {
            	        int LA22_1 = input.LA(2);

            	        if ( (LA22_1==EOF||LA22_1==14||LA22_1==50||LA22_1==52) ) {
            	            alt22=1;
            	        }
            	        else if ( (LA22_1==RULE_ID) ) {
            	            alt22=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 22, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA22_0==RULE_ID) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalFILTER.g:2356:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFILTER.g:2364:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalFILTER.g:2364:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalFILTER.g:2365:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalFILTER.g:2365:6: (this_INT_5= RULE_INT )?
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==RULE_INT) ) {
            	                alt21=1;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // InternalFILTER.g:2366:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_45); if (state.failed) return current;
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
            	    break loop23;
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
    // InternalFILTER.g:2388:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalFILTER.g:2388:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalFILTER.g:2389:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalFILTER.g:2395:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2401:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalFILTER.g:2402:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalFILTER.g:2402:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalFILTER.g:2403:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_46);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,51,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_47);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalFILTER.g:2437:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalFILTER.g:2437:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalFILTER.g:2438:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalFILTER.g:2444:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2450:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalFILTER.g:2451:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalFILTER.g:2451:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalFILTER.g:2452:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalFILTER.g:2452:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( ((LA24_1>=50 && LA24_1<=51)) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalFILTER.g:2453:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_48);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_VersionedQualifiedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalFILTER.g:2476:3: (kw= '::' this_ID_4= RULE_ID )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==53) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFILTER.g:2477:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalFILTER.g:2494:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalFILTER.g:2494:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalFILTER.g:2495:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalFILTER.g:2501:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2507:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalFILTER.g:2508:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:2508:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT||LA27_0==54) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_HEXADECIMAL) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalFILTER.g:2509:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalFILTER.g:2509:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalFILTER.g:2510:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalFILTER.g:2510:4: (kw= '-' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==54) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalFILTER.g:2511:5: kw= '-'
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
                    // InternalFILTER.g:2526:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalFILTER.g:2537:1: ruleGSSFilterConstantType returns [Enumerator current=null] : ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) ;
    public final Enumerator ruleGSSFilterConstantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalFILTER.g:2543:2: ( ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) )
            // InternalFILTER.g:2544:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            {
            // InternalFILTER.g:2544:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt28=1;
                }
                break;
            case 56:
                {
                alt28=2;
                }
                break;
            case 57:
                {
                alt28=3;
                }
                break;
            case 58:
                {
                alt28=4;
                }
                break;
            case 59:
                {
                alt28=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalFILTER.g:2545:3: (enumLiteral_0= 'decimal' )
                    {
                    // InternalFILTER.g:2545:3: (enumLiteral_0= 'decimal' )
                    // InternalFILTER.g:2546:4: enumLiteral_0= 'decimal'
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
                    // InternalFILTER.g:2553:3: (enumLiteral_1= 'hex' )
                    {
                    // InternalFILTER.g:2553:3: (enumLiteral_1= 'hex' )
                    // InternalFILTER.g:2554:4: enumLiteral_1= 'hex'
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
                    // InternalFILTER.g:2561:3: (enumLiteral_2= 'binary' )
                    {
                    // InternalFILTER.g:2561:3: (enumLiteral_2= 'binary' )
                    // InternalFILTER.g:2562:4: enumLiteral_2= 'binary'
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
                    // InternalFILTER.g:2569:3: (enumLiteral_3= 'char' )
                    {
                    // InternalFILTER.g:2569:3: (enumLiteral_3= 'char' )
                    // InternalFILTER.g:2570:4: enumLiteral_3= 'char'
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
                    // InternalFILTER.g:2577:3: (enumLiteral_4= 'string' )
                    {
                    // InternalFILTER.g:2577:3: (enumLiteral_4= 'string' )
                    // InternalFILTER.g:2578:4: enumLiteral_4= 'string'
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
    // InternalFILTER.g:2588:1: ruleGSSFilterOPType returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) ;
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
            // InternalFILTER.g:2594:2: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) )
            // InternalFILTER.g:2595:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            {
            // InternalFILTER.g:2595:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            int alt29=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt29=1;
                }
                break;
            case 61:
                {
                alt29=2;
                }
                break;
            case 62:
                {
                alt29=3;
                }
                break;
            case 63:
                {
                alt29=4;
                }
                break;
            case 64:
                {
                alt29=5;
                }
                break;
            case 65:
                {
                alt29=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalFILTER.g:2596:3: (enumLiteral_0= 'equal' )
                    {
                    // InternalFILTER.g:2596:3: (enumLiteral_0= 'equal' )
                    // InternalFILTER.g:2597:4: enumLiteral_0= 'equal'
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
                    // InternalFILTER.g:2604:3: (enumLiteral_1= 'different' )
                    {
                    // InternalFILTER.g:2604:3: (enumLiteral_1= 'different' )
                    // InternalFILTER.g:2605:4: enumLiteral_1= 'different'
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
                    // InternalFILTER.g:2612:3: (enumLiteral_2= 'bigger_than' )
                    {
                    // InternalFILTER.g:2612:3: (enumLiteral_2= 'bigger_than' )
                    // InternalFILTER.g:2613:4: enumLiteral_2= 'bigger_than'
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
                    // InternalFILTER.g:2620:3: (enumLiteral_3= 'smaller_than' )
                    {
                    // InternalFILTER.g:2620:3: (enumLiteral_3= 'smaller_than' )
                    // InternalFILTER.g:2621:4: enumLiteral_3= 'smaller_than'
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
                    // InternalFILTER.g:2628:3: (enumLiteral_4= 'bigger_or_equal' )
                    {
                    // InternalFILTER.g:2628:3: (enumLiteral_4= 'bigger_or_equal' )
                    // InternalFILTER.g:2629:4: enumLiteral_4= 'bigger_or_equal'
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
                    // InternalFILTER.g:2636:3: (enumLiteral_5= 'smaller_or_equal' )
                    {
                    // InternalFILTER.g:2636:3: (enumLiteral_5= 'smaller_or_equal' )
                    // InternalFILTER.g:2637:4: enumLiteral_5= 'smaller_or_equal'
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
    // InternalFILTER.g:2647:1: ruleGSSFilterSelectType returns [Enumerator current=null] : ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) ;
    public final Enumerator ruleGSSFilterSelectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2653:2: ( ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) )
            // InternalFILTER.g:2654:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            {
            // InternalFILTER.g:2654:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt30=1;
                }
                break;
            case 41:
                {
                alt30=2;
                }
                break;
            case 67:
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
                    // InternalFILTER.g:2655:3: (enumLiteral_0= 'data' )
                    {
                    // InternalFILTER.g:2655:3: (enumLiteral_0= 'data' )
                    // InternalFILTER.g:2656:4: enumLiteral_0= 'data'
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
                    // InternalFILTER.g:2663:3: (enumLiteral_1= 'size' )
                    {
                    // InternalFILTER.g:2663:3: (enumLiteral_1= 'size' )
                    // InternalFILTER.g:2664:4: enumLiteral_1= 'size'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSFilterSelectTypeAccess().getSizeEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:2671:3: (enumLiteral_2= 'crc' )
                    {
                    // InternalFILTER.g:2671:3: (enumLiteral_2= 'crc' )
                    // InternalFILTER.g:2672:4: enumLiteral_2= 'crc'
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000209000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000128400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400128400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000100000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800128400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000100000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00400000000000C0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0F80000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000044800000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000100000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000032000100000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000022000100000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000302000100000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000202000100000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000100000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
    }


}