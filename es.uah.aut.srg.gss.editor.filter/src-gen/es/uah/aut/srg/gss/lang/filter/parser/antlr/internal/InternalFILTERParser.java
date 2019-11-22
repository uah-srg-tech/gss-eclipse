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
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
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
    // InternalFILTER.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalFILTER.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalFILTER.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalFILTER.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) ) )
            // InternalFILTER.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) )
            {
            // InternalFILTER.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) ) )
            // InternalFILTER.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSFilterFilter ) )
            {
            // InternalFILTER.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFILTER.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalFILTER.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalFILTER.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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

            // InternalFILTER.g:113:3: ( (lv_element_1_0= ruleGSSFilterFilter ) )
            // InternalFILTER.g:114:4: (lv_element_1_0= ruleGSSFilterFilter )
            {
            // InternalFILTER.g:114:4: (lv_element_1_0= ruleGSSFilterFilter )
            // InternalFILTER.g:115:5: lv_element_1_0= ruleGSSFilterFilter
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
    // InternalFILTER.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalFILTER.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalFILTER.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalFILTER.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalFILTER.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalFILTER.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalFILTER.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalFILTER.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalFILTER.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalFILTER.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalFILTER.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalFILTER.g:161:5: lv_importURI_2_0= RULE_STRING
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
    // InternalFILTER.g:185:1: entryRuleGSSFilterFilter returns [EObject current=null] : iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF ;
    public final EObject entryRuleGSSFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterFilter = null;


        try {
            // InternalFILTER.g:185:56: (iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF )
            // InternalFILTER.g:186:2: iv_ruleGSSFilterFilter= ruleGSSFilterFilter EOF
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
    // InternalFILTER.g:192:1: ruleGSSFilterFilter returns [EObject current=null] : (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter ) ;
    public final EObject ruleGSSFilterFilter() throws RecognitionException {
        EObject current = null;

        EObject this_GSSFilterMaxtermFilter_0 = null;

        EObject this_GSSFilterMintermFilter_1 = null;



        	enterRule();

        try {
            // InternalFILTER.g:198:2: ( (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter ) )
            // InternalFILTER.g:199:2: (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter )
            {
            // InternalFILTER.g:199:2: (this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter | this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter )
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
                    // InternalFILTER.g:200:3: this_GSSFilterMaxtermFilter_0= ruleGSSFilterMaxtermFilter
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
                    // InternalFILTER.g:212:3: this_GSSFilterMintermFilter_1= ruleGSSFilterMintermFilter
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
    // InternalFILTER.g:227:1: entryRuleGSSFilterMaxtermFilter returns [EObject current=null] : iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF ;
    public final EObject entryRuleGSSFilterMaxtermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMaxtermFilter = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTER.g:231:2: (iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF )
            // InternalFILTER.g:232:2: iv_ruleGSSFilterMaxtermFilter= ruleGSSFilterMaxtermFilter EOF
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
    // InternalFILTER.g:241:1: ruleGSSFilterMaxtermFilter returns [EObject current=null] : (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' ) ;
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
            // InternalFILTER.g:250:2: ( (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            // InternalFILTER.g:251:2: (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalFILTER.g:251:2: (otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            // InternalFILTER.g:252:3: otherlv_0= 'GSSFilterMaxtermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+ otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMaxtermFilterAccess().getGSSFilterMaxtermFilterKeyword_0());
              		
            }
            // InternalFILTER.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTER.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTER.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalFILTER.g:258:5: lv_name_1_0= RULE_ID
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
            // InternalFILTER.g:278:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalFILTER.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalFILTER.g:279:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalFILTER.g:280:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3());
            // InternalFILTER.g:283:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            // InternalFILTER.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalFILTER.g:284:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+
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
            	    // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFILTER.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFILTER.g:286:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFILTER.g:287:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
            	    // InternalFILTER.g:290:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFILTER.g:290:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "true");
            	    }
            	    // InternalFILTER.g:290:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFILTER.g:290:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSFilterMaxtermFilterAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFILTER.g:298:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFILTER.g:300:11: lv_uri_6_0= ruleQualifiedName
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
            	      												"es.uah.aut.srg.gss.lang.filter.FILTER.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
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
            	    // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    {
            	    // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    // InternalFILTER.g:328:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFILTER.g:328:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    // InternalFILTER.g:329:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
            	    // InternalFILTER.g:332:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    // InternalFILTER.g:332:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMaxtermFilter", "true");
            	    }
            	    // InternalFILTER.g:332:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
            	    {
            	    // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFILTER.g:333:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_8, grammarAccess.getGSSFilterMaxtermFilterAccess().getVersionKeyword_3_1_0_0());
            	      									
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_9, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
            	      									
            	    }
            	    // InternalFILTER.g:341:10: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
            	    // InternalFILTER.g:343:12: lv_version_10_0= ruleVersion
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
            	      													"es.uah.aut.srg.gss.lang.filter.FILTER.Version");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_11, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_0_3());
            	      									
            	    }

            	    }

            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileKeyword_3_1_1());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGSSFilterMaxtermFilterAccess().getColonEqualsSignKeyword_3_1_2());
            	      								
            	    }
            	    // InternalFILTER.g:373:9: ( ( ruleVersionedQualifiedName ) )
            	    // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
            	    // InternalFILTER.g:375:11: ruleVersionedQualifiedName
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

            	      											newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getFormatFileGSSFormatFormatCrossReference_3_1_3_0());
            	      										
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

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSFilterMaxtermFilterAccess().getSemicolonKeyword_3_1_4());
            	      								
            	    }
            	    // InternalFILTER.g:396:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
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
            	        case 27:
            	            {
            	            alt3=2;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt3=3;
            	            }
            	            break;
            	        case 32:
            	            {
            	            alt3=4;
            	            }
            	            break;

            	        }

            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    {
            	    	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    {
            	    	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    // InternalFILTER.g:399:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVar");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    // InternalFILTER.g:419:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFromArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    // InternalFILTER.g:439:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFromGroupedArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    {
            	    	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    {
            	    	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    // InternalFILTER.g:459:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFDIC");
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

            // InternalFILTER.g:491:3: ( (lv_Maxterm_20_0= ruleGSSFilterMaxterm ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==46) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFILTER.g:492:4: (lv_Maxterm_20_0= ruleGSSFilterMaxterm )
            	    {
            	    // InternalFILTER.g:492:4: (lv_Maxterm_20_0= ruleGSSFilterMaxterm )
            	    // InternalFILTER.g:493:5: lv_Maxterm_20_0= ruleGSSFilterMaxterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getMaxtermGSSFilterMaxtermParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
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
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMaxterm");
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
    // InternalFILTER.g:525:1: entryRuleGSSFilterMintermFilter returns [EObject current=null] : iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF ;
    public final EObject entryRuleGSSFilterMintermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMintermFilter = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalFILTER.g:529:2: (iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF )
            // InternalFILTER.g:530:2: iv_ruleGSSFilterMintermFilter= ruleGSSFilterMintermFilter EOF
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
    // InternalFILTER.g:539:1: ruleGSSFilterMintermFilter returns [EObject current=null] : (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' ) ;
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
            // InternalFILTER.g:548:2: ( (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' ) )
            // InternalFILTER.g:549:2: (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            {
            // InternalFILTER.g:549:2: (otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';' )
            // InternalFILTER.g:550:3: otherlv_0= 'GSSFilterMintermFilter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) ) ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+ otherlv_21= '}' otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMintermFilterAccess().getGSSFilterMintermFilterKeyword_0());
              		
            }
            // InternalFILTER.g:554:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFILTER.g:555:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFILTER.g:555:4: (lv_name_1_0= RULE_ID )
            // InternalFILTER.g:556:5: lv_name_1_0= RULE_ID
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
            // InternalFILTER.g:576:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) ) )
            // InternalFILTER.g:577:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            {
            // InternalFILTER.g:577:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?) )
            // InternalFILTER.g:578:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3());
            // InternalFILTER.g:581:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?)
            // InternalFILTER.g:582:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+ {...}?
            {
            // InternalFILTER.g:582:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )+
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
            	    // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalFILTER.g:584:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalFILTER.g:584:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalFILTER.g:585:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
            	    // InternalFILTER.g:588:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalFILTER.g:588:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "true");
            	    }
            	    // InternalFILTER.g:588:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalFILTER.g:588:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSFilterMintermFilterAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalFILTER.g:596:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalFILTER.g:598:11: lv_uri_6_0= ruleQualifiedName
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
            	      												"es.uah.aut.srg.gss.lang.filter.FILTER.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
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
            	    // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    {
            	    // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
            	    // InternalFILTER.g:626:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalFILTER.g:626:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
            	    // InternalFILTER.g:627:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
            	    // InternalFILTER.g:630:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
            	    // InternalFILTER.g:630:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSFilterMintermFilter", "true");
            	    }
            	    // InternalFILTER.g:630:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
            	    // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
            	    {
            	    // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalFILTER.g:631:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_8, grammarAccess.getGSSFilterMintermFilterAccess().getVersionKeyword_3_1_0_0());
            	      									
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_9, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_0_1());
            	      									
            	    }
            	    // InternalFILTER.g:639:10: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
            	    // InternalFILTER.g:641:12: lv_version_10_0= ruleVersion
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
            	      													"es.uah.aut.srg.gss.lang.filter.FILTER.Version");
            	      												afterParserOrEnumRuleCall();
            	      											
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(otherlv_11, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_0_3());
            	      									
            	    }

            	    }

            	    otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileKeyword_3_1_1());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getGSSFilterMintermFilterAccess().getColonEqualsSignKeyword_3_1_2());
            	      								
            	    }
            	    // InternalFILTER.g:671:9: ( ( ruleVersionedQualifiedName ) )
            	    // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
            	    {
            	    // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
            	    // InternalFILTER.g:673:11: ruleVersionedQualifiedName
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

            	      											newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getFormatFileGSSFormatFormatCrossReference_3_1_3_0());
            	      										
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

            	    otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSFilterMintermFilterAccess().getSemicolonKeyword_3_1_4());
            	      								
            	    }
            	    // InternalFILTER.g:694:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
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
            	        case 27:
            	            {
            	            alt6=2;
            	            }
            	            break;
            	        case 29:
            	            {
            	            alt6=3;
            	            }
            	            break;
            	        case 32:
            	            {
            	            alt6=4;
            	            }
            	            break;

            	        }

            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    {
            	    	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
            	    	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    {
            	    	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
            	    	    // InternalFILTER.g:697:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVar");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
            	    	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
            	    	    // InternalFILTER.g:717:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFromArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 3 :
            	    	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    {
            	    	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
            	    	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    {
            	    	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
            	    	    // InternalFILTER.g:737:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFromGroupedArrayItem");
            	    	      												afterParserOrEnumRuleCall();
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;
            	    	case 4 :
            	    	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    {
            	    	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
            	    	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    {
            	    	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
            	    	    // InternalFILTER.g:757:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_17);
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
            	    	      													"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterBoolVarFDIC");
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

            // InternalFILTER.g:789:3: ( (lv_Minterm_20_0= ruleGSSFilterMinterm ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==47) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFILTER.g:790:4: (lv_Minterm_20_0= ruleGSSFilterMinterm )
            	    {
            	    // InternalFILTER.g:790:4: (lv_Minterm_20_0= ruleGSSFilterMinterm )
            	    // InternalFILTER.g:791:5: lv_Minterm_20_0= ruleGSSFilterMinterm
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getMintermGSSFilterMintermParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
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
            	      						"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterMinterm");
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
    // InternalFILTER.g:823:1: entryRuleGSSFilterBoolVar returns [EObject current=null] : iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF ;
    public final EObject entryRuleGSSFilterBoolVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVar = null;


        try {
            // InternalFILTER.g:823:57: (iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF )
            // InternalFILTER.g:824:2: iv_ruleGSSFilterBoolVar= ruleGSSFilterBoolVar EOF
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
    // InternalFILTER.g:830:1: ruleGSSFilterBoolVar returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) ;
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
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_18_0 = null;

        EObject lv_Constant_19_0 = null;

        EObject lv_Select_20_0 = null;

        EObject lv_SelectLine_21_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:836:2: ( (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:837:2: (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:837:2: (otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:838:3: otherlv_0= 'GSSFilterBoolVar' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'FieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarAccess().getGSSFilterBoolVarKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:854:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:855:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:855:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:856:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
            // InternalFILTER.g:885:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:886:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:886:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:887:5: lv_name_8_0= RULE_ID
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:915:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTER.g:916:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:916:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTER.g:917:5: lv_constantType_12_0= ruleGSSFilterConstantType
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
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
            // InternalFILTER.g:946:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:947:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:947:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:948:5: ruleVersionedQualifiedReferenceName
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_17());
              		
            }
            // InternalFILTER.g:969:3: ( (lv_Op_18_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:970:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:970:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:971:5: lv_Op_18_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getOpGSSFilterFieldOpParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            // InternalFILTER.g:988:3: ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 42:
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
                    // InternalFILTER.g:989:4: ( (lv_Constant_19_0= ruleGSSFilterConstant ) )
                    {
                    // InternalFILTER.g:989:4: ( (lv_Constant_19_0= ruleGSSFilterConstant ) )
                    // InternalFILTER.g:990:5: (lv_Constant_19_0= ruleGSSFilterConstant )
                    {
                    // InternalFILTER.g:990:5: (lv_Constant_19_0= ruleGSSFilterConstant )
                    // InternalFILTER.g:991:6: lv_Constant_19_0= ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getConstantGSSFilterConstantParserRuleCall_19_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Constant_19_0=ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_19_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:1009:4: ( (lv_Select_20_0= ruleGSSFilterSelect ) )
                    {
                    // InternalFILTER.g:1009:4: ( (lv_Select_20_0= ruleGSSFilterSelect ) )
                    // InternalFILTER.g:1010:5: (lv_Select_20_0= ruleGSSFilterSelect )
                    {
                    // InternalFILTER.g:1010:5: (lv_Select_20_0= ruleGSSFilterSelect )
                    // InternalFILTER.g:1011:6: lv_Select_20_0= ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getSelectGSSFilterSelectParserRuleCall_19_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Select_20_0=ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_20_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:1029:4: ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) )
                    {
                    // InternalFILTER.g:1029:4: ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) )
                    // InternalFILTER.g:1030:5: (lv_SelectLine_21_0= ruleGSSFilterSelectLine )
                    {
                    // InternalFILTER.g:1030:5: (lv_SelectLine_21_0= ruleGSSFilterSelectLine )
                    // InternalFILTER.g:1031:6: lv_SelectLine_21_0= ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarAccess().getSelectLineGSSFilterSelectLineParserRuleCall_19_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_SelectLine_21_0=ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_21_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFilterBoolVarAccess().getRightCurlyBracketKeyword_20());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFilterBoolVarAccess().getSemicolonKeyword_21());
              		
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
    // InternalFILTER.g:1061:1: entryRuleGSSFilterBoolVarFromArrayItem returns [EObject current=null] : iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF ;
    public final EObject entryRuleGSSFilterBoolVarFromArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFromArrayItem = null;


        try {
            // InternalFILTER.g:1061:70: (iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF )
            // InternalFILTER.g:1062:2: iv_ruleGSSFilterBoolVarFromArrayItem= ruleGSSFilterBoolVarFromArrayItem EOF
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
    // InternalFILTER.g:1068:1: ruleGSSFilterBoolVarFromArrayItem returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) ;
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
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_18_0 = null;

        EObject lv_Constant_19_0 = null;

        EObject lv_Select_20_0 = null;

        EObject lv_SelectLine_21_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1074:2: ( (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:1075:2: (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:1075:2: (otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:1076:3: otherlv_0= 'GSSFilterBoolVarFromArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'AIFieldRef' otherlv_15= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_17= ';' ( (lv_Op_18_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) ) otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getGSSFilterBoolVarFromArrayItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1092:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1093:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1093:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1094:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
            // InternalFILTER.g:1123:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1124:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1124:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1125:5: lv_name_8_0= RULE_ID
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:1153:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTER.g:1154:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:1154:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTER.g:1155:5: lv_constantType_12_0= ruleGSSFilterConstantType
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_28); if (state.failed) return current;
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
            // InternalFILTER.g:1184:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1185:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1185:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1186:5: ruleVersionedQualifiedReferenceName
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_17());
              		
            }
            // InternalFILTER.g:1207:3: ( (lv_Op_18_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:1208:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:1208:4: (lv_Op_18_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:1209:5: lv_Op_18_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_18_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            // InternalFILTER.g:1226:3: ( ( (lv_Constant_19_0= ruleGSSFilterConstant ) ) | ( (lv_Select_20_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 42:
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
                    // InternalFILTER.g:1227:4: ( (lv_Constant_19_0= ruleGSSFilterConstant ) )
                    {
                    // InternalFILTER.g:1227:4: ( (lv_Constant_19_0= ruleGSSFilterConstant ) )
                    // InternalFILTER.g:1228:5: (lv_Constant_19_0= ruleGSSFilterConstant )
                    {
                    // InternalFILTER.g:1228:5: (lv_Constant_19_0= ruleGSSFilterConstant )
                    // InternalFILTER.g:1229:6: lv_Constant_19_0= ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_19_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Constant_19_0=ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_19_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:1247:4: ( (lv_Select_20_0= ruleGSSFilterSelect ) )
                    {
                    // InternalFILTER.g:1247:4: ( (lv_Select_20_0= ruleGSSFilterSelect ) )
                    // InternalFILTER.g:1248:5: (lv_Select_20_0= ruleGSSFilterSelect )
                    {
                    // InternalFILTER.g:1248:5: (lv_Select_20_0= ruleGSSFilterSelect )
                    // InternalFILTER.g:1249:6: lv_Select_20_0= ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_19_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Select_20_0=ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_20_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:1267:4: ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) )
                    {
                    // InternalFILTER.g:1267:4: ( (lv_SelectLine_21_0= ruleGSSFilterSelectLine ) )
                    // InternalFILTER.g:1268:5: (lv_SelectLine_21_0= ruleGSSFilterSelectLine )
                    {
                    // InternalFILTER.g:1268:5: (lv_SelectLine_21_0= ruleGSSFilterSelectLine )
                    // InternalFILTER.g:1269:6: lv_SelectLine_21_0= ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_19_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_SelectLine_21_0=ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_21_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_22=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getRightCurlyBracketKeyword_20());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSFilterBoolVarFromArrayItemAccess().getSemicolonKeyword_21());
              		
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
    // InternalFILTER.g:1299:1: entryRuleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF ;
    public final EObject entryRuleGSSFilterBoolVarFromGroupedArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFromGroupedArrayItem = null;


        try {
            // InternalFILTER.g:1299:77: (iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF )
            // InternalFILTER.g:1300:2: iv_ruleGSSFilterBoolVarFromGroupedArrayItem= ruleGSSFilterBoolVarFromGroupedArrayItem EOF
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
    // InternalFILTER.g:1306:1: ruleGSSFilterBoolVarFromGroupedArrayItem returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleGSSFilterConstant ) ) | ( (lv_Select_24_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' ) ;
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
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        Enumerator lv_constantType_12_0 = null;

        EObject lv_Op_22_0 = null;

        EObject lv_Constant_23_0 = null;

        EObject lv_Select_24_0 = null;

        EObject lv_SelectLine_25_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:1312:2: ( (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleGSSFilterConstant ) ) | ( (lv_Select_24_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' ) )
            // InternalFILTER.g:1313:2: (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleGSSFilterConstant ) ) | ( (lv_Select_24_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalFILTER.g:1313:2: (otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleGSSFilterConstant ) ) | ( (lv_Select_24_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';' )
            // InternalFILTER.g:1314:3: otherlv_0= 'GSSFilterBoolVarFromGroupedArrayItem' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'constantType' otherlv_11= ':=' ( (lv_constantType_12_0= ruleGSSFilterConstantType ) ) otherlv_13= ';' otherlv_14= 'group' otherlv_15= ':=' ( (lv_group_16_0= RULE_ID ) ) otherlv_17= ';' otherlv_18= 'AIFieldRefs' otherlv_19= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_21= ';' ( (lv_Op_22_0= ruleGSSFilterFieldOp ) ) ( ( (lv_Constant_23_0= ruleGSSFilterConstant ) ) | ( (lv_Select_24_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) ) ) otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getGSSFilterBoolVarFromGroupedArrayItemKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1330:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1331:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1331:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1332:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
            // InternalFILTER.g:1361:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1362:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1362:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1363:5: lv_name_8_0= RULE_ID
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantTypeKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalFILTER.g:1391:3: ( (lv_constantType_12_0= ruleGSSFilterConstantType ) )
            // InternalFILTER.g:1392:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            {
            // InternalFILTER.g:1392:4: (lv_constantType_12_0= ruleGSSFilterConstantType )
            // InternalFILTER.g:1393:5: lv_constantType_12_0= ruleGSSFilterConstantType
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
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
            // InternalFILTER.g:1422:3: ( (lv_group_16_0= RULE_ID ) )
            // InternalFILTER.g:1423:4: (lv_group_16_0= RULE_ID )
            {
            // InternalFILTER.g:1423:4: (lv_group_16_0= RULE_ID )
            // InternalFILTER.g:1424:5: lv_group_16_0= RULE_ID
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

            otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_30); if (state.failed) return current;
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
            // InternalFILTER.g:1452:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1453:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1453:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1454:5: ruleVersionedQualifiedReferenceName
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

            otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_21());
              		
            }
            // InternalFILTER.g:1475:3: ( (lv_Op_22_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:1476:4: (lv_Op_22_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:1476:4: (lv_Op_22_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:1477:5: lv_Op_22_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getOpGSSFilterFieldOpParserRuleCall_22_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            // InternalFILTER.g:1494:3: ( ( (lv_Constant_23_0= ruleGSSFilterConstant ) ) | ( (lv_Select_24_0= ruleGSSFilterSelect ) ) | ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 42:
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
                    // InternalFILTER.g:1495:4: ( (lv_Constant_23_0= ruleGSSFilterConstant ) )
                    {
                    // InternalFILTER.g:1495:4: ( (lv_Constant_23_0= ruleGSSFilterConstant ) )
                    // InternalFILTER.g:1496:5: (lv_Constant_23_0= ruleGSSFilterConstant )
                    {
                    // InternalFILTER.g:1496:5: (lv_Constant_23_0= ruleGSSFilterConstant )
                    // InternalFILTER.g:1497:6: lv_Constant_23_0= ruleGSSFilterConstant
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getConstantGSSFilterConstantParserRuleCall_23_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Constant_23_0=ruleGSSFilterConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Constant",
                      							lv_Constant_23_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterConstant");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFILTER.g:1515:4: ( (lv_Select_24_0= ruleGSSFilterSelect ) )
                    {
                    // InternalFILTER.g:1515:4: ( (lv_Select_24_0= ruleGSSFilterSelect ) )
                    // InternalFILTER.g:1516:5: (lv_Select_24_0= ruleGSSFilterSelect )
                    {
                    // InternalFILTER.g:1516:5: (lv_Select_24_0= ruleGSSFilterSelect )
                    // InternalFILTER.g:1517:6: lv_Select_24_0= ruleGSSFilterSelect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectGSSFilterSelectParserRuleCall_23_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_Select_24_0=ruleGSSFilterSelect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"Select",
                      							lv_Select_24_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFILTER.g:1535:4: ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) )
                    {
                    // InternalFILTER.g:1535:4: ( (lv_SelectLine_25_0= ruleGSSFilterSelectLine ) )
                    // InternalFILTER.g:1536:5: (lv_SelectLine_25_0= ruleGSSFilterSelectLine )
                    {
                    // InternalFILTER.g:1536:5: (lv_SelectLine_25_0= ruleGSSFilterSelectLine )
                    // InternalFILTER.g:1537:6: lv_SelectLine_25_0= ruleGSSFilterSelectLine
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSelectLineGSSFilterSelectLineParserRuleCall_23_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_SelectLine_25_0=ruleGSSFilterSelectLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemRule());
                      						}
                      						set(
                      							current,
                      							"SelectLine",
                      							lv_SelectLine_25_0,
                      							"es.uah.aut.srg.gss.lang.filter.FILTER.GSSFilterSelectLine");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_26=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getRightCurlyBracketKeyword_24());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSFilterBoolVarFromGroupedArrayItemAccess().getSemicolonKeyword_25());
              		
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
    // InternalFILTER.g:1567:1: entryRuleGSSFilterBoolVarFDIC returns [EObject current=null] : iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF ;
    public final EObject entryRuleGSSFilterBoolVarFDIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarFDIC = null;


        try {
            // InternalFILTER.g:1567:61: (iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF )
            // InternalFILTER.g:1568:2: iv_ruleGSSFilterBoolVarFDIC= ruleGSSFilterBoolVarFDIC EOF
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
    // InternalFILTER.g:1574:1: ruleGSSFilterBoolVarFDIC returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' ) ;
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
            // InternalFILTER.g:1580:2: ( (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' ) )
            // InternalFILTER.g:1581:2: (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalFILTER.g:1581:2: (otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';' )
            // InternalFILTER.g:1582:3: otherlv_0= 'GSSFilterBoolVarFDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'name' otherlv_7= ':=' ( (lv_name_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'FieldRef' otherlv_11= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_13= ';' ( (lv_Op_14_0= ruleGSSFilterFieldOp ) ) otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarFDICAccess().getGSSFilterBoolVarFDICKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarFDICAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarFDICAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarFDICAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1598:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1599:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1599:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:1600:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
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
            // InternalFILTER.g:1629:3: ( (lv_name_8_0= RULE_ID ) )
            // InternalFILTER.g:1630:4: (lv_name_8_0= RULE_ID )
            {
            // InternalFILTER.g:1630:4: (lv_name_8_0= RULE_ID )
            // InternalFILTER.g:1631:5: lv_name_8_0= RULE_ID
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_24); if (state.failed) return current;
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
            // InternalFILTER.g:1659:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalFILTER.g:1660:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalFILTER.g:1660:4: ( ruleVersionedQualifiedReferenceName )
            // InternalFILTER.g:1661:5: ruleVersionedQualifiedReferenceName
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

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSFilterBoolVarFDICAccess().getSemicolonKeyword_13());
              		
            }
            // InternalFILTER.g:1682:3: ( (lv_Op_14_0= ruleGSSFilterFieldOp ) )
            // InternalFILTER.g:1683:4: (lv_Op_14_0= ruleGSSFilterFieldOp )
            {
            // InternalFILTER.g:1683:4: (lv_Op_14_0= ruleGSSFilterFieldOp )
            // InternalFILTER.g:1684:5: lv_Op_14_0= ruleGSSFilterFieldOp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSFilterBoolVarFDICAccess().getOpGSSFilterFieldOpParserRuleCall_14_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
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


    // $ANTLR start "entryRuleGSSFilterFieldOp"
    // InternalFILTER.g:1713:1: entryRuleGSSFilterFieldOp returns [EObject current=null] : iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF ;
    public final EObject entryRuleGSSFilterFieldOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterFieldOp = null;


        try {
            // InternalFILTER.g:1713:57: (iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF )
            // InternalFILTER.g:1714:2: iv_ruleGSSFilterFieldOp= ruleGSSFilterFieldOp EOF
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
    // InternalFILTER.g:1720:1: ruleGSSFilterFieldOp returns [EObject current=null] : (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalFILTER.g:1726:2: ( (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTER.g:1727:2: (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTER.g:1727:2: (otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTER.g:1728:3: otherlv_0= 'GSSFilterFieldOp' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSFilterOPType ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterFieldOpAccess().getGSSFilterFieldOpKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterFieldOpAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterFieldOpAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterFieldOpAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1744:3: ( (lv_type_4_0= ruleGSSFilterOPType ) )
            // InternalFILTER.g:1745:4: (lv_type_4_0= ruleGSSFilterOPType )
            {
            // InternalFILTER.g:1745:4: (lv_type_4_0= ruleGSSFilterOPType )
            // InternalFILTER.g:1746:5: lv_type_4_0= ruleGSSFilterOPType
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
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
    // InternalFILTER.g:1779:1: entryRuleGSSFilterConstant returns [EObject current=null] : iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF ;
    public final EObject entryRuleGSSFilterConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterConstant = null;


        try {
            // InternalFILTER.g:1779:58: (iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF )
            // InternalFILTER.g:1780:2: iv_ruleGSSFilterConstant= ruleGSSFilterConstant EOF
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
    // InternalFILTER.g:1786:1: ruleGSSFilterConstant returns [EObject current=null] : (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalFILTER.g:1792:2: ( (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' ) )
            // InternalFILTER.g:1793:2: (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalFILTER.g:1793:2: (otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';' )
            // InternalFILTER.g:1794:3: otherlv_0= 'GSSFilterConstant' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )? otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterConstantAccess().getGSSFilterConstantKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterConstantAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterConstantAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:1810:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalFILTER.g:1811:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:1811:4: (lv_value_4_0= ruleINTEGER )
            // InternalFILTER.g:1812:5: lv_value_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterConstantAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:1833:3: (otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFILTER.g:1834:4: otherlv_6= 'mask' otherlv_7= ':=' ( (lv_mask_8_0= RULE_HEXADECIMAL ) ) otherlv_9= ';'
                    {
                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGSSFilterConstantAccess().getMaskKeyword_6_0());
                      			
                    }
                    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getGSSFilterConstantAccess().getColonEqualsSignKeyword_6_1());
                      			
                    }
                    // InternalFILTER.g:1842:4: ( (lv_mask_8_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:1843:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:1843:5: (lv_mask_8_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:1844:6: lv_mask_8_0= RULE_HEXADECIMAL
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

                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
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
    // InternalFILTER.g:1877:1: entryRuleGSSFilterSelect returns [EObject current=null] : iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF ;
    public final EObject entryRuleGSSFilterSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterSelect = null;


        try {
            // InternalFILTER.g:1877:56: (iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF )
            // InternalFILTER.g:1878:2: iv_ruleGSSFilterSelect= ruleGSSFilterSelect EOF
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
    // InternalFILTER.g:1884:1: ruleGSSFilterSelect returns [EObject current=null] : (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalFILTER.g:1890:2: ( (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:1891:2: (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:1891:2: (otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:1892:3: otherlv_0= 'GSSFilterSelect' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'type' otherlv_7= ':=' ( (lv_type_8_0= ruleGSSFilterSelectType ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectAccess().getGSSFilterSelectKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
            // InternalFILTER.g:1908:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTER.g:1909:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTER.g:1909:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTER.g:1910:5: lv_fromFile_4_0= RULE_ID
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
            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectAccess().getTypeKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:1938:3: ( (lv_type_8_0= ruleGSSFilterSelectType ) )
            // InternalFILTER.g:1939:4: (lv_type_8_0= ruleGSSFilterSelectType )
            {
            // InternalFILTER.g:1939:4: (lv_type_8_0= ruleGSSFilterSelectType )
            // InternalFILTER.g:1940:5: lv_type_8_0= ruleGSSFilterSelectType
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTER.g:1961:3: (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFILTER.g:1962:4: otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectAccess().getOffsetKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTER.g:1970:4: ( (lv_offset_12_0= ruleINTEGER ) )
                    // InternalFILTER.g:1971:5: (lv_offset_12_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:1971:5: (lv_offset_12_0= ruleINTEGER )
                    // InternalFILTER.g:1972:6: lv_offset_12_0= ruleINTEGER
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

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:1994:3: (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==41) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFILTER.g:1995:4: otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectAccess().getSizeKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTER.g:2003:4: ( (lv_size_16_0= ruleINTEGER ) )
                    // InternalFILTER.g:2004:5: (lv_size_16_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:2004:5: (lv_size_16_0= ruleINTEGER )
                    // InternalFILTER.g:2005:6: lv_size_16_0= ruleINTEGER
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

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:2027:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFILTER.g:2028:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTER.g:2036:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:2037:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:2037:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:2038:6: lv_mask_20_0= RULE_HEXADECIMAL
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

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
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
    // InternalFILTER.g:2071:1: entryRuleGSSFilterSelectLine returns [EObject current=null] : iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF ;
    public final EObject entryRuleGSSFilterSelectLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterSelectLine = null;


        try {
            // InternalFILTER.g:2071:60: (iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF )
            // InternalFILTER.g:2072:2: iv_ruleGSSFilterSelectLine= ruleGSSFilterSelectLine EOF
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
    // InternalFILTER.g:2078:1: ruleGSSFilterSelectLine returns [EObject current=null] : (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
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
            // InternalFILTER.g:2084:2: ( (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalFILTER.g:2085:2: (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalFILTER.g:2085:2: (otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalFILTER.g:2086:3: otherlv_0= 'GSSFilterSelectLine' otherlv_1= '{' otherlv_2= 'fromFile' otherlv_3= ':=' ( (lv_fromFile_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'line' otherlv_7= ':=' ( (lv_line_8_0= ruleINTEGER ) ) otherlv_9= ';' (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterSelectLineAccess().getGSSFilterSelectLineKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_36); if (state.failed) return current;
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
            // InternalFILTER.g:2102:3: ( (lv_fromFile_4_0= RULE_ID ) )
            // InternalFILTER.g:2103:4: (lv_fromFile_4_0= RULE_ID )
            {
            // InternalFILTER.g:2103:4: (lv_fromFile_4_0= RULE_ID )
            // InternalFILTER.g:2104:5: lv_fromFile_4_0= RULE_ID
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
            otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSFilterSelectLineAccess().getLineKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalFILTER.g:2132:3: ( (lv_line_8_0= ruleINTEGER ) )
            // InternalFILTER.g:2133:4: (lv_line_8_0= ruleINTEGER )
            {
            // InternalFILTER.g:2133:4: (lv_line_8_0= ruleINTEGER )
            // InternalFILTER.g:2134:5: lv_line_8_0= ruleINTEGER
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_9());
              		
            }
            // InternalFILTER.g:2155:3: (otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalFILTER.g:2156:4: otherlv_10= 'leftTrim' otherlv_11= ':=' ( (lv_leftTrim_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,44,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSFilterSelectLineAccess().getLeftTrimKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalFILTER.g:2164:4: ( (lv_leftTrim_12_0= ruleINTEGER ) )
                    // InternalFILTER.g:2165:5: (lv_leftTrim_12_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:2165:5: (lv_leftTrim_12_0= ruleINTEGER )
                    // InternalFILTER.g:2166:6: lv_leftTrim_12_0= ruleINTEGER
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

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:2188:3: (otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFILTER.g:2189:4: otherlv_14= 'rightTrim' otherlv_15= ':=' ( (lv_rightTrim_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSFilterSelectLineAccess().getRightTrimKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalFILTER.g:2197:4: ( (lv_rightTrim_16_0= ruleINTEGER ) )
                    // InternalFILTER.g:2198:5: (lv_rightTrim_16_0= ruleINTEGER )
                    {
                    // InternalFILTER.g:2198:5: (lv_rightTrim_16_0= ruleINTEGER )
                    // InternalFILTER.g:2199:6: lv_rightTrim_16_0= ruleINTEGER
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

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSFilterSelectLineAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalFILTER.g:2221:3: (otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFILTER.g:2222:4: otherlv_18= 'mask' otherlv_19= ':=' ( (lv_mask_20_0= RULE_HEXADECIMAL ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSFilterSelectLineAccess().getMaskKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSFilterSelectLineAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalFILTER.g:2230:4: ( (lv_mask_20_0= RULE_HEXADECIMAL ) )
                    // InternalFILTER.g:2231:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    {
                    // InternalFILTER.g:2231:5: (lv_mask_20_0= RULE_HEXADECIMAL )
                    // InternalFILTER.g:2232:6: lv_mask_20_0= RULE_HEXADECIMAL
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

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
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
    // InternalFILTER.g:2265:1: entryRuleGSSFilterMaxterm returns [EObject current=null] : iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF ;
    public final EObject entryRuleGSSFilterMaxterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMaxterm = null;


        try {
            // InternalFILTER.g:2265:57: (iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF )
            // InternalFILTER.g:2266:2: iv_ruleGSSFilterMaxterm= ruleGSSFilterMaxterm EOF
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
    // InternalFILTER.g:2272:1: ruleGSSFilterMaxterm returns [EObject current=null] : (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
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
            // InternalFILTER.g:2278:2: ( (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalFILTER.g:2279:2: (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalFILTER.g:2279:2: (otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalFILTER.g:2280:3: otherlv_0= 'GSSFilterMaxterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMaxtermAccess().getGSSFilterMaxtermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterMaxtermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMaxtermAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMaxtermAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2296:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2297:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2297:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:2298:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterMaxtermAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:2319:3: ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalFILTER.g:2320:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    {
            	    // InternalFILTER.g:2320:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    // InternalFILTER.g:2321:5: lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMaxtermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
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
    // InternalFILTER.g:2350:1: entryRuleGSSFilterMinterm returns [EObject current=null] : iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF ;
    public final EObject entryRuleGSSFilterMinterm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterMinterm = null;


        try {
            // InternalFILTER.g:2350:57: (iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF )
            // InternalFILTER.g:2351:2: iv_ruleGSSFilterMinterm= ruleGSSFilterMinterm EOF
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
    // InternalFILTER.g:2357:1: ruleGSSFilterMinterm returns [EObject current=null] : (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) ;
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
            // InternalFILTER.g:2363:2: ( (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' ) )
            // InternalFILTER.g:2364:2: (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalFILTER.g:2364:2: (otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';' )
            // InternalFILTER.g:2365:3: otherlv_0= 'GSSFilterMinterm' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+ otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterMintermAccess().getGSSFilterMintermKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterMintermAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterMintermAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterMintermAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2381:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2382:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2382:4: (lv_id_4_0= ruleINTEGER )
            // InternalFILTER.g:2383:5: lv_id_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSFilterMintermAccess().getSemicolonKeyword_5());
              		
            }
            // InternalFILTER.g:2404:3: ( (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalFILTER.g:2405:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    {
            	    // InternalFILTER.g:2405:4: (lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef )
            	    // InternalFILTER.g:2406:5: lv_BoolVarRef_6_0= ruleGSSFilterBoolVarRef
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSFilterMintermAccess().getBoolVarRefGSSFilterBoolVarRefParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_44);
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
            	    if ( cnt20 >= 1 ) break loop20;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // InternalFILTER.g:2435:1: entryRuleGSSFilterBoolVarRef returns [EObject current=null] : iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF ;
    public final EObject entryRuleGSSFilterBoolVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSFilterBoolVarRef = null;


        try {
            // InternalFILTER.g:2435:60: (iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF )
            // InternalFILTER.g:2436:2: iv_ruleGSSFilterBoolVarRef= ruleGSSFilterBoolVarRef EOF
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
    // InternalFILTER.g:2442:1: ruleGSSFilterBoolVarRef returns [EObject current=null] : (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalFILTER.g:2448:2: ( (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalFILTER.g:2449:2: (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalFILTER.g:2449:2: (otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalFILTER.g:2450:3: otherlv_0= 'GSSFilterBoolVarRef' otherlv_1= '{' otherlv_2= 'idRef' otherlv_3= ':=' ( (lv_idRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSFilterBoolVarRefAccess().getGSSFilterBoolVarRefKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSFilterBoolVarRefAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSFilterBoolVarRefAccess().getIdRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSFilterBoolVarRefAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalFILTER.g:2466:3: ( (lv_idRef_4_0= ruleINTEGER ) )
            // InternalFILTER.g:2467:4: (lv_idRef_4_0= ruleINTEGER )
            {
            // InternalFILTER.g:2467:4: (lv_idRef_4_0= ruleINTEGER )
            // InternalFILTER.g:2468:5: lv_idRef_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_27); if (state.failed) return current;
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
    // InternalFILTER.g:2501:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalFILTER.g:2501:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalFILTER.g:2502:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalFILTER.g:2508:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2514:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalFILTER.g:2515:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalFILTER.g:2515:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalFILTER.g:2516:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalFILTER.g:2523:3: (kw= '.' this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFILTER.g:2524:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalFILTER.g:2541:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalFILTER.g:2541:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalFILTER.g:2542:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalFILTER.g:2548:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalFILTER.g:2554:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalFILTER.g:2555:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalFILTER.g:2555:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalFILTER.g:2556:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalFILTER.g:2556:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_ID) ) {
                    alt23=2;
                }
                else if ( (LA23_1==EOF||LA23_1==14||LA23_1==50||LA23_1==52) ) {
                    alt23=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalFILTER.g:2557:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalFILTER.g:2565:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalFILTER.g:2565:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalFILTER.g:2566:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalFILTER.g:2566:5: (this_INT_1= RULE_INT )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_INT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalFILTER.g:2567:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
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

            // InternalFILTER.g:2584:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalFILTER.g:2585:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalFILTER.g:2590:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==RULE_INT) ) {
            	        int LA25_1 = input.LA(2);

            	        if ( (LA25_1==RULE_ID) ) {
            	            alt25=2;
            	        }
            	        else if ( (LA25_1==EOF||LA25_1==14||LA25_1==50||LA25_1==52) ) {
            	            alt25=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 25, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA25_0==RULE_ID) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalFILTER.g:2591:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalFILTER.g:2599:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalFILTER.g:2599:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalFILTER.g:2600:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalFILTER.g:2600:6: (this_INT_5= RULE_INT )?
            	            int alt24=2;
            	            int LA24_0 = input.LA(1);

            	            if ( (LA24_0==RULE_INT) ) {
            	                alt24=1;
            	            }
            	            switch (alt24) {
            	                case 1 :
            	                    // InternalFILTER.g:2601:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
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
            	    break loop26;
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
    // InternalFILTER.g:2623:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalFILTER.g:2623:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalFILTER.g:2624:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalFILTER.g:2630:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2636:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalFILTER.g:2637:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalFILTER.g:2637:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalFILTER.g:2638:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_47);
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
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalFILTER.g:2672:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalFILTER.g:2672:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalFILTER.g:2673:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalFILTER.g:2679:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalFILTER.g:2685:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalFILTER.g:2686:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalFILTER.g:2686:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalFILTER.g:2687:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalFILTER.g:2687:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>=50 && LA27_1<=51)) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalFILTER.g:2688:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_49);
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

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalFILTER.g:2711:3: (kw= '::' this_ID_4= RULE_ID )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==53) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFILTER.g:2712:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalFILTER.g:2729:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalFILTER.g:2729:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalFILTER.g:2730:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalFILTER.g:2736:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2742:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalFILTER.g:2743:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalFILTER.g:2743:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==54) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_HEXADECIMAL) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalFILTER.g:2744:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalFILTER.g:2744:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalFILTER.g:2745:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalFILTER.g:2745:4: (kw= '-' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==54) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalFILTER.g:2746:5: kw= '-'
                            {
                            kw=(Token)match(input,54,FollowSets000.FOLLOW_51); if (state.failed) return current;
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
                    // InternalFILTER.g:2761:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalFILTER.g:2772:1: ruleGSSFilterConstantType returns [Enumerator current=null] : ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) ;
    public final Enumerator ruleGSSFilterConstantType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalFILTER.g:2778:2: ( ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) ) )
            // InternalFILTER.g:2779:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            {
            // InternalFILTER.g:2779:2: ( (enumLiteral_0= 'decimal' ) | (enumLiteral_1= 'hex' ) | (enumLiteral_2= 'binary' ) | (enumLiteral_3= 'char' ) | (enumLiteral_4= 'string' ) )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt31=1;
                }
                break;
            case 56:
                {
                alt31=2;
                }
                break;
            case 57:
                {
                alt31=3;
                }
                break;
            case 58:
                {
                alt31=4;
                }
                break;
            case 59:
                {
                alt31=5;
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
                    // InternalFILTER.g:2780:3: (enumLiteral_0= 'decimal' )
                    {
                    // InternalFILTER.g:2780:3: (enumLiteral_0= 'decimal' )
                    // InternalFILTER.g:2781:4: enumLiteral_0= 'decimal'
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
                    // InternalFILTER.g:2788:3: (enumLiteral_1= 'hex' )
                    {
                    // InternalFILTER.g:2788:3: (enumLiteral_1= 'hex' )
                    // InternalFILTER.g:2789:4: enumLiteral_1= 'hex'
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
                    // InternalFILTER.g:2796:3: (enumLiteral_2= 'binary' )
                    {
                    // InternalFILTER.g:2796:3: (enumLiteral_2= 'binary' )
                    // InternalFILTER.g:2797:4: enumLiteral_2= 'binary'
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
                    // InternalFILTER.g:2804:3: (enumLiteral_3= 'char' )
                    {
                    // InternalFILTER.g:2804:3: (enumLiteral_3= 'char' )
                    // InternalFILTER.g:2805:4: enumLiteral_3= 'char'
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
                    // InternalFILTER.g:2812:3: (enumLiteral_4= 'string' )
                    {
                    // InternalFILTER.g:2812:3: (enumLiteral_4= 'string' )
                    // InternalFILTER.g:2813:4: enumLiteral_4= 'string'
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
    // InternalFILTER.g:2823:1: ruleGSSFilterOPType returns [Enumerator current=null] : ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) ;
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
            // InternalFILTER.g:2829:2: ( ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) ) )
            // InternalFILTER.g:2830:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            {
            // InternalFILTER.g:2830:2: ( (enumLiteral_0= 'equal' ) | (enumLiteral_1= 'different' ) | (enumLiteral_2= 'bigger_than' ) | (enumLiteral_3= 'smaller_than' ) | (enumLiteral_4= 'bigger_or_equal' ) | (enumLiteral_5= 'smaller_or_equal' ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt32=1;
                }
                break;
            case 61:
                {
                alt32=2;
                }
                break;
            case 62:
                {
                alt32=3;
                }
                break;
            case 63:
                {
                alt32=4;
                }
                break;
            case 64:
                {
                alt32=5;
                }
                break;
            case 65:
                {
                alt32=6;
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
                    // InternalFILTER.g:2831:3: (enumLiteral_0= 'equal' )
                    {
                    // InternalFILTER.g:2831:3: (enumLiteral_0= 'equal' )
                    // InternalFILTER.g:2832:4: enumLiteral_0= 'equal'
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
                    // InternalFILTER.g:2839:3: (enumLiteral_1= 'different' )
                    {
                    // InternalFILTER.g:2839:3: (enumLiteral_1= 'different' )
                    // InternalFILTER.g:2840:4: enumLiteral_1= 'different'
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
                    // InternalFILTER.g:2847:3: (enumLiteral_2= 'bigger_than' )
                    {
                    // InternalFILTER.g:2847:3: (enumLiteral_2= 'bigger_than' )
                    // InternalFILTER.g:2848:4: enumLiteral_2= 'bigger_than'
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
                    // InternalFILTER.g:2855:3: (enumLiteral_3= 'smaller_than' )
                    {
                    // InternalFILTER.g:2855:3: (enumLiteral_3= 'smaller_than' )
                    // InternalFILTER.g:2856:4: enumLiteral_3= 'smaller_than'
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
                    // InternalFILTER.g:2863:3: (enumLiteral_4= 'bigger_or_equal' )
                    {
                    // InternalFILTER.g:2863:3: (enumLiteral_4= 'bigger_or_equal' )
                    // InternalFILTER.g:2864:4: enumLiteral_4= 'bigger_or_equal'
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
                    // InternalFILTER.g:2871:3: (enumLiteral_5= 'smaller_or_equal' )
                    {
                    // InternalFILTER.g:2871:3: (enumLiteral_5= 'smaller_or_equal' )
                    // InternalFILTER.g:2872:4: enumLiteral_5= 'smaller_or_equal'
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
    // InternalFILTER.g:2882:1: ruleGSSFilterSelectType returns [Enumerator current=null] : ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) ;
    public final Enumerator ruleGSSFilterSelectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalFILTER.g:2888:2: ( ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) ) )
            // InternalFILTER.g:2889:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            {
            // InternalFILTER.g:2889:2: ( (enumLiteral_0= 'data' ) | (enumLiteral_1= 'size' ) | (enumLiteral_2= 'crc' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt33=1;
                }
                break;
            case 41:
                {
                alt33=2;
                }
                break;
            case 67:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalFILTER.g:2890:3: (enumLiteral_0= 'data' )
                    {
                    // InternalFILTER.g:2890:3: (enumLiteral_0= 'data' )
                    // InternalFILTER.g:2891:4: enumLiteral_0= 'data'
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
                    // InternalFILTER.g:2898:3: (enumLiteral_1= 'size' )
                    {
                    // InternalFILTER.g:2898:3: (enumLiteral_1= 'size' )
                    // InternalFILTER.g:2899:4: enumLiteral_1= 'size'
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
                    // InternalFILTER.g:2906:3: (enumLiteral_2= 'crc' )
                    {
                    // InternalFILTER.g:2906:3: (enumLiteral_2= 'crc' )
                    // InternalFILTER.g:2907:4: enumLiteral_2= 'crc'
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

    // $ANTLR start synpred3_InternalFILTER
    public final void synpred3_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFILTER.g:285:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFILTER.g:285:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFILTER.g:286:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTER.g:286:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFILTER.g:287:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTER.g:290:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFILTER.g:290:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalFILTER", "true");
        }
        // InternalFILTER.g:290:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFILTER.g:290:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:298:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFILTER.g:299:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFILTER.g:300:11: lv_uri_6_0= ruleQualifiedName
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
    // $ANTLR end synpred3_InternalFILTER

    // $ANTLR start synpred8_InternalFILTER
    public final void synpred8_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;


        // InternalFILTER.g:327:4: ( ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )
        // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        {
        // InternalFILTER.g:327:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        // InternalFILTER.g:328:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFILTER.g:328:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        // InternalFILTER.g:329:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMaxtermFilterAccess().getUnorderedGroup_3(), 1);
        // InternalFILTER.g:332:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        // InternalFILTER.g:332:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalFILTER", "true");
        }
        // InternalFILTER.g:332:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
        {
        // InternalFILTER.g:332:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFILTER.g:333:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalFILTER.g:341:10: ( (lv_version_10_0= ruleVersion ) )
        // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
        {
        // InternalFILTER.g:342:11: (lv_version_10_0= ruleVersion )
        // InternalFILTER.g:343:12: lv_version_10_0= ruleVersion
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

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return ;

        }

        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:373:9: ( ( ruleVersionedQualifiedName ) )
        // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
        {
        // InternalFILTER.g:374:10: ( ruleVersionedQualifiedName )
        // InternalFILTER.g:375:11: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {

          											/* */
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalFILTER.g:396:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
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
            case 27:
                {
                alt34=2;
                }
                break;
            case 29:
                {
                alt34=3;
                }
                break;
            case 32:
                {
                alt34=4;
                }
                break;

            }

            switch (alt34) {
        	case 1 :
        	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    {
        	    // InternalFILTER.g:397:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    {
        	    // InternalFILTER.g:398:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    // InternalFILTER.g:399:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVar_16_0=ruleGSSFilterBoolVar();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    {
        	    // InternalFILTER.g:417:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    {
        	    // InternalFILTER.g:418:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    // InternalFILTER.g:419:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromArrayItem_17_0=ruleGSSFilterBoolVarFromArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    {
        	    // InternalFILTER.g:437:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    {
        	    // InternalFILTER.g:438:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    // InternalFILTER.g:439:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromGroupedArrayItem_18_0=ruleGSSFilterBoolVarFromGroupedArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    {
        	    // InternalFILTER.g:457:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    {
        	    // InternalFILTER.g:458:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    // InternalFILTER.g:459:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMaxtermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
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
    // $ANTLR end synpred8_InternalFILTER

    // $ANTLR start synpred10_InternalFILTER
    public final void synpred10_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalFILTER.g:583:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalFILTER.g:583:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalFILTER.g:584:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalFILTER.g:584:119: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalFILTER.g:585:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 0);
        // InternalFILTER.g:588:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalFILTER.g:588:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalFILTER", "true");
        }
        // InternalFILTER.g:588:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalFILTER.g:588:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:596:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalFILTER.g:597:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalFILTER.g:598:11: lv_uri_6_0= ruleQualifiedName
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
    // $ANTLR end synpred10_InternalFILTER

    // $ANTLR start synpred15_InternalFILTER
    public final void synpred15_InternalFILTER_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_BoolVar_16_0 = null;

        EObject lv_BoolVarFromArrayItem_17_0 = null;

        EObject lv_BoolVarFromGroupedArrayItem_18_0 = null;

        EObject lv_BoolVarFDIC_19_0 = null;


        // InternalFILTER.g:625:4: ( ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) ) )
        // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        {
        // InternalFILTER.g:625:4: ({...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) ) )
        // InternalFILTER.g:626:5: {...}? => ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFILTER", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalFILTER.g:626:119: ( ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) ) )
        // InternalFILTER.g:627:6: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSFilterMintermFilterAccess().getUnorderedGroup_3(), 1);
        // InternalFILTER.g:630:9: ({...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ ) )
        // InternalFILTER.g:630:10: {...}? => ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalFILTER", "true");
        }
        // InternalFILTER.g:630:19: ( (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+ )
        // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) otherlv_12= 'formatFile' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
        {
        // InternalFILTER.g:630:20: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalFILTER.g:631:10: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalFILTER.g:639:10: ( (lv_version_10_0= ruleVersion ) )
        // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
        {
        // InternalFILTER.g:640:11: (lv_version_10_0= ruleVersion )
        // InternalFILTER.g:641:12: lv_version_10_0= ruleVersion
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

        otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return ;

        }

        otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalFILTER.g:671:9: ( ( ruleVersionedQualifiedName ) )
        // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
        {
        // InternalFILTER.g:672:10: ( ruleVersionedQualifiedName )
        // InternalFILTER.g:673:11: ruleVersionedQualifiedName
        {
        if ( state.backtracking==0 ) {

          											/* */
          										
        }
        pushFollow(FollowSets000.FOLLOW_6);
        ruleVersionedQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalFILTER.g:694:9: ( ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) ) | ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) ) | ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) ) | ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) ) )+
        int cnt35=0;
        loop35:
        do {
            int alt35=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt35=1;
                }
                break;
            case 27:
                {
                alt35=2;
                }
                break;
            case 29:
                {
                alt35=3;
                }
                break;
            case 32:
                {
                alt35=4;
                }
                break;

            }

            switch (alt35) {
        	case 1 :
        	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    {
        	    // InternalFILTER.g:695:10: ( (lv_BoolVar_16_0= ruleGSSFilterBoolVar ) )
        	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    {
        	    // InternalFILTER.g:696:11: (lv_BoolVar_16_0= ruleGSSFilterBoolVar )
        	    // InternalFILTER.g:697:12: lv_BoolVar_16_0= ruleGSSFilterBoolVar
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarGSSFilterBoolVarParserRuleCall_3_1_5_0_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVar_16_0=ruleGSSFilterBoolVar();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 2 :
        	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    {
        	    // InternalFILTER.g:715:10: ( (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem ) )
        	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    {
        	    // InternalFILTER.g:716:11: (lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem )
        	    // InternalFILTER.g:717:12: lv_BoolVarFromArrayItem_17_0= ruleGSSFilterBoolVarFromArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromArrayItemGSSFilterBoolVarFromArrayItemParserRuleCall_3_1_5_1_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromArrayItem_17_0=ruleGSSFilterBoolVarFromArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 3 :
        	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    {
        	    // InternalFILTER.g:735:10: ( (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem ) )
        	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    {
        	    // InternalFILTER.g:736:11: (lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem )
        	    // InternalFILTER.g:737:12: lv_BoolVarFromGroupedArrayItem_18_0= ruleGSSFilterBoolVarFromGroupedArrayItem
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFromGroupedArrayItemGSSFilterBoolVarFromGroupedArrayItemParserRuleCall_3_1_5_2_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFromGroupedArrayItem_18_0=ruleGSSFilterBoolVarFromGroupedArrayItem();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;
        	case 4 :
        	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    {
        	    // InternalFILTER.g:755:10: ( (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC ) )
        	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    {
        	    // InternalFILTER.g:756:11: (lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC )
        	    // InternalFILTER.g:757:12: lv_BoolVarFDIC_19_0= ruleGSSFilterBoolVarFDIC
        	    {
        	    if ( state.backtracking==0 ) {

        	      												newCompositeNode(grammarAccess.getGSSFilterMintermFilterAccess().getBoolVarFDICGSSFilterBoolVarFDICParserRuleCall_3_1_5_3_0());
        	      											
        	    }
        	    pushFollow(FollowSets000.FOLLOW_52);
        	    lv_BoolVarFDIC_19_0=ruleGSSFilterBoolVarFDIC();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt35 >= 1 ) break loop35;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(35, input);
                    throw eee;
            }
            cnt35++;
        } while (true);


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalFILTER

    // Delegated rules

    public final boolean synpred8_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalFILTER_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFILTER() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFILTER_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000060000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000128400000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400128460000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000100000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000060000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800128460000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000100000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00400000000000C0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0F80000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000044800000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000100000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L,0x000000000000000CL});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000032000100000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000022000100000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000302000100000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000202000100000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000100000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000128400002L});
    }


}