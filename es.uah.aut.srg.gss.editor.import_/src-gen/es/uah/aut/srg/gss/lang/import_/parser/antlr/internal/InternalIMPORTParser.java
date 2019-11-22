package es.uah.aut.srg.gss.lang.import_.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.import_.services.IMPORTGrammarAccess;



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
public class InternalIMPORTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSImportImport'", "'{'", "'uri'", "'version'", "'from'", "'to'", "'NULL'", "'}'", "'GSSImportDataSource'", "'FieldRef'", "'leftTrim'", "'rightTrim'", "'GSSImportVirtualSize'", "'addSize'", "'unit'", "'.'", "'('", "')'", "'::'", "'-'", "'bits'", "'bytes'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int RULE_HEXADECIMAL=7;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalIMPORTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIMPORTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIMPORTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIMPORT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private IMPORTGrammarAccess grammarAccess;

        public InternalIMPORTParser(TokenStream input, IMPORTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected IMPORTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalIMPORT.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalIMPORT.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalIMPORT.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalIMPORT.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSImportImport ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalIMPORT.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSImportImport ) ) ) )
            // InternalIMPORT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSImportImport ) ) )
            {
            // InternalIMPORT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSImportImport ) ) )
            // InternalIMPORT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSImportImport ) )
            {
            // InternalIMPORT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIMPORT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalIMPORT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalIMPORT.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.import_.IMPORT.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIMPORT.g:113:3: ( (lv_element_1_0= ruleGSSImportImport ) )
            // InternalIMPORT.g:114:4: (lv_element_1_0= ruleGSSImportImport )
            {
            // InternalIMPORT.g:114:4: (lv_element_1_0= ruleGSSImportImport )
            // InternalIMPORT.g:115:5: lv_element_1_0= ruleGSSImportImport
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSImportImportParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSImportImport();

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
              						"es.uah.aut.srg.gss.lang.import_.IMPORT.GSSImportImport");
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
    // InternalIMPORT.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalIMPORT.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalIMPORT.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalIMPORT.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalIMPORT.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalIMPORT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalIMPORT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalIMPORT.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalIMPORT.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalIMPORT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalIMPORT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalIMPORT.g:161:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleGSSImportImport"
    // InternalIMPORT.g:185:1: entryRuleGSSImportImport returns [EObject current=null] : iv_ruleGSSImportImport= ruleGSSImportImport EOF ;
    public final EObject entryRuleGSSImportImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSImportImport = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalIMPORT.g:189:2: (iv_ruleGSSImportImport= ruleGSSImportImport EOF )
            // InternalIMPORT.g:190:2: iv_ruleGSSImportImport= ruleGSSImportImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSImportImportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSImportImport=ruleGSSImportImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSImportImport; 
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
    // $ANTLR end "entryRuleGSSImportImport"


    // $ANTLR start "ruleGSSImportImport"
    // InternalIMPORT.g:199:1: ruleGSSImportImport returns [EObject current=null] : (otherlv_0= 'GSSImportImport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' otherlv_16= 'to' otherlv_17= ':=' (otherlv_18= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ( (lv_dataSource_21_0= ruleGSSImportDataSource ) )+ ( (lv_virtualSize_22_0= ruleGSSImportVirtualSize ) )? otherlv_23= '}' otherlv_24= ';' ) ;
    public final EObject ruleGSSImportImport() throws RecognitionException {
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_dataSource_21_0 = null;

        EObject lv_virtualSize_22_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalIMPORT.g:208:2: ( (otherlv_0= 'GSSImportImport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' otherlv_16= 'to' otherlv_17= ':=' (otherlv_18= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ( (lv_dataSource_21_0= ruleGSSImportDataSource ) )+ ( (lv_virtualSize_22_0= ruleGSSImportVirtualSize ) )? otherlv_23= '}' otherlv_24= ';' ) )
            // InternalIMPORT.g:209:2: (otherlv_0= 'GSSImportImport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' otherlv_16= 'to' otherlv_17= ':=' (otherlv_18= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ( (lv_dataSource_21_0= ruleGSSImportDataSource ) )+ ( (lv_virtualSize_22_0= ruleGSSImportVirtualSize ) )? otherlv_23= '}' otherlv_24= ';' )
            {
            // InternalIMPORT.g:209:2: (otherlv_0= 'GSSImportImport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' otherlv_16= 'to' otherlv_17= ':=' (otherlv_18= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ( (lv_dataSource_21_0= ruleGSSImportDataSource ) )+ ( (lv_virtualSize_22_0= ruleGSSImportVirtualSize ) )? otherlv_23= '}' otherlv_24= ';' )
            // InternalIMPORT.g:210:3: otherlv_0= 'GSSImportImport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_15= ';' otherlv_16= 'to' otherlv_17= ':=' (otherlv_18= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_20= ';' ( (lv_dataSource_21_0= ruleGSSImportDataSource ) )+ ( (lv_virtualSize_22_0= ruleGSSImportVirtualSize ) )? otherlv_23= '}' otherlv_24= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSImportImportAccess().getGSSImportImportKeyword_0());
              		
            }
            // InternalIMPORT.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIMPORT.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIMPORT.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalIMPORT.g:216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSImportImportAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSImportImportRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getGSSImportImportAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalIMPORT.g:236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) )
            // InternalIMPORT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalIMPORT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            // InternalIMPORT.g:238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());
            // InternalIMPORT.g:241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            // InternalIMPORT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?
            {
            // InternalIMPORT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIMPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalIMPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalIMPORT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSImportImport", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalIMPORT.g:244:112: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalIMPORT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0);
            	    // InternalIMPORT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalIMPORT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSImportImport", "true");
            	    }
            	    // InternalIMPORT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalIMPORT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSImportImportAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalIMPORT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalIMPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalIMPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalIMPORT.g:258:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.import_.IMPORT.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIMPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalIMPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalIMPORT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSImportImport", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalIMPORT.g:286:112: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalIMPORT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1);
            	    // InternalIMPORT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalIMPORT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSImportImport", "true");
            	    }
            	    // InternalIMPORT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalIMPORT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSImportImportAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalIMPORT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalIMPORT.g:299:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalIMPORT.g:299:10: (lv_version_10_0= ruleVersion )
            	    // InternalIMPORT.g:300:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.gss.lang.import_.IMPORT.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSImportImport", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3());

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSImportImportAccess().getFromKeyword_4());
              		
            }
            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_5());
              		
            }
            // InternalIMPORT.g:343:3: ( ( ruleVersionedQualifiedName ) )
            // InternalIMPORT.g:344:4: ( ruleVersionedQualifiedName )
            {
            // InternalIMPORT.g:344:4: ( ruleVersionedQualifiedName )
            // InternalIMPORT.g:345:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSImportImportRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSImportImportAccess().getFromGSSFormatFormatCrossReference_6_0());
              				
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

            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_7());
              		
            }
            otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSImportImportAccess().getToKeyword_8());
              		
            }
            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSImportImportAccess().getColonEqualsSignKeyword_9());
              		
            }
            // InternalIMPORT.g:374:3: (otherlv_18= 'NULL' | ( ( ruleVersionedQualifiedName ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalIMPORT.g:375:4: otherlv_18= 'NULL'
                    {
                    otherlv_18=(Token)match(input,21,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSImportImportAccess().getNULLKeyword_10_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalIMPORT.g:380:4: ( ( ruleVersionedQualifiedName ) )
                    {
                    // InternalIMPORT.g:380:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalIMPORT.g:381:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalIMPORT.g:381:5: ( ruleVersionedQualifiedName )
                    // InternalIMPORT.g:382:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSImportImportRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSImportImportAccess().getToGSSFormatFormatCrossReference_10_1_0());
                      					
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


                    }
                    break;

            }

            otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_11());
              		
            }
            // InternalIMPORT.g:404:3: ( (lv_dataSource_21_0= ruleGSSImportDataSource ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIMPORT.g:405:4: (lv_dataSource_21_0= ruleGSSImportDataSource )
            	    {
            	    // InternalIMPORT.g:405:4: (lv_dataSource_21_0= ruleGSSImportDataSource )
            	    // InternalIMPORT.g:406:5: lv_dataSource_21_0= ruleGSSImportDataSource
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSImportImportAccess().getDataSourceGSSImportDataSourceParserRuleCall_12_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_dataSource_21_0=ruleGSSImportDataSource();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
            	      					}
            	      					add(
            	      						current,
            	      						"dataSource",
            	      						lv_dataSource_21_0,
            	      						"es.uah.aut.srg.gss.lang.import_.IMPORT.GSSImportDataSource");
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

            // InternalIMPORT.g:423:3: ( (lv_virtualSize_22_0= ruleGSSImportVirtualSize ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIMPORT.g:424:4: (lv_virtualSize_22_0= ruleGSSImportVirtualSize )
                    {
                    // InternalIMPORT.g:424:4: (lv_virtualSize_22_0= ruleGSSImportVirtualSize )
                    // InternalIMPORT.g:425:5: lv_virtualSize_22_0= ruleGSSImportVirtualSize
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSImportImportAccess().getVirtualSizeGSSImportVirtualSizeParserRuleCall_13_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_virtualSize_22_0=ruleGSSImportVirtualSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSImportImportRule());
                      					}
                      					set(
                      						current,
                      						"virtualSize",
                      						lv_virtualSize_22_0,
                      						"es.uah.aut.srg.gss.lang.import_.IMPORT.GSSImportVirtualSize");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSImportImportAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_24, grammarAccess.getGSSImportImportAccess().getSemicolonKeyword_15());
              		
            }

            }


            }

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
    // $ANTLR end "ruleGSSImportImport"


    // $ANTLR start "entryRuleGSSImportDataSource"
    // InternalIMPORT.g:457:1: entryRuleGSSImportDataSource returns [EObject current=null] : iv_ruleGSSImportDataSource= ruleGSSImportDataSource EOF ;
    public final EObject entryRuleGSSImportDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSImportDataSource = null;


        try {
            // InternalIMPORT.g:457:60: (iv_ruleGSSImportDataSource= ruleGSSImportDataSource EOF )
            // InternalIMPORT.g:458:2: iv_ruleGSSImportDataSource= ruleGSSImportDataSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSImportDataSourceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSImportDataSource=ruleGSSImportDataSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSImportDataSource; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSImportDataSource"


    // $ANTLR start "ruleGSSImportDataSource"
    // InternalIMPORT.g:464:1: ruleGSSImportDataSource returns [EObject current=null] : (otherlv_0= 'GSSImportDataSource' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'leftTrim' otherlv_7= ':=' ( (lv_leftTrim_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'rightTrim' otherlv_11= ':=' ( (lv_rightTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSImportDataSource() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_leftTrim_8_0 = null;

        AntlrDatatypeRuleToken lv_rightTrim_12_0 = null;



        	enterRule();

        try {
            // InternalIMPORT.g:470:2: ( (otherlv_0= 'GSSImportDataSource' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'leftTrim' otherlv_7= ':=' ( (lv_leftTrim_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'rightTrim' otherlv_11= ':=' ( (lv_rightTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalIMPORT.g:471:2: (otherlv_0= 'GSSImportDataSource' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'leftTrim' otherlv_7= ':=' ( (lv_leftTrim_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'rightTrim' otherlv_11= ':=' ( (lv_rightTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalIMPORT.g:471:2: (otherlv_0= 'GSSImportDataSource' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'leftTrim' otherlv_7= ':=' ( (lv_leftTrim_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'rightTrim' otherlv_11= ':=' ( (lv_rightTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalIMPORT.g:472:3: otherlv_0= 'GSSImportDataSource' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'leftTrim' otherlv_7= ':=' ( (lv_leftTrim_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'rightTrim' otherlv_11= ':=' ( (lv_rightTrim_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSImportDataSourceAccess().getGSSImportDataSourceKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSImportDataSourceAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSImportDataSourceAccess().getFieldRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIMPORT.g:488:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORT.g:489:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalIMPORT.g:489:4: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORT.g:490:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSImportDataSourceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSImportDataSourceAccess().getFieldRefGSSFormatFieldCrossReference_4_0());
              				
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSImportDataSourceAccess().getLeftTrimKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIMPORT.g:519:3: ( (lv_leftTrim_8_0= ruleINTEGER ) )
            // InternalIMPORT.g:520:4: (lv_leftTrim_8_0= ruleINTEGER )
            {
            // InternalIMPORT.g:520:4: (lv_leftTrim_8_0= ruleINTEGER )
            // InternalIMPORT.g:521:5: lv_leftTrim_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSImportDataSourceAccess().getLeftTrimINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_leftTrim_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSImportDataSourceRule());
              					}
              					set(
              						current,
              						"leftTrim",
              						lv_leftTrim_8_0,
              						"es.uah.aut.srg.gss.lang.import_.IMPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSImportDataSourceAccess().getRightTrimKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSImportDataSourceAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalIMPORT.g:550:3: ( (lv_rightTrim_12_0= ruleINTEGER ) )
            // InternalIMPORT.g:551:4: (lv_rightTrim_12_0= ruleINTEGER )
            {
            // InternalIMPORT.g:551:4: (lv_rightTrim_12_0= ruleINTEGER )
            // InternalIMPORT.g:552:5: lv_rightTrim_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSImportDataSourceAccess().getRightTrimINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_rightTrim_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSImportDataSourceRule());
              					}
              					set(
              						current,
              						"rightTrim",
              						lv_rightTrim_12_0,
              						"es.uah.aut.srg.gss.lang.import_.IMPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSImportDataSourceAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSImportDataSourceAccess().getSemicolonKeyword_15());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSImportDataSource"


    // $ANTLR start "entryRuleGSSImportVirtualSize"
    // InternalIMPORT.g:585:1: entryRuleGSSImportVirtualSize returns [EObject current=null] : iv_ruleGSSImportVirtualSize= ruleGSSImportVirtualSize EOF ;
    public final EObject entryRuleGSSImportVirtualSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSImportVirtualSize = null;


        try {
            // InternalIMPORT.g:585:61: (iv_ruleGSSImportVirtualSize= ruleGSSImportVirtualSize EOF )
            // InternalIMPORT.g:586:2: iv_ruleGSSImportVirtualSize= ruleGSSImportVirtualSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSImportVirtualSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSImportVirtualSize=ruleGSSImportVirtualSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSImportVirtualSize; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSImportVirtualSize"


    // $ANTLR start "ruleGSSImportVirtualSize"
    // InternalIMPORT.g:592:1: ruleGSSImportVirtualSize returns [EObject current=null] : (otherlv_0= 'GSSImportVirtualSize' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'to' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSImportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSImportVirtualSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_addSize_12_0 = null;

        Enumerator lv_unit_16_0 = null;



        	enterRule();

        try {
            // InternalIMPORT.g:598:2: ( (otherlv_0= 'GSSImportVirtualSize' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'to' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSImportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalIMPORT.g:599:2: (otherlv_0= 'GSSImportVirtualSize' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'to' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSImportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalIMPORT.g:599:2: (otherlv_0= 'GSSImportVirtualSize' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'to' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSImportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalIMPORT.g:600:3: otherlv_0= 'GSSImportVirtualSize' otherlv_1= '{' otherlv_2= 'FieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'to' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSImportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSImportVirtualSizeAccess().getGSSImportVirtualSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSImportVirtualSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIMPORT.g:616:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORT.g:617:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalIMPORT.g:617:4: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORT.g:618:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSImportVirtualSizeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSImportVirtualSizeAccess().getFieldRefGSSFormatFieldCrossReference_4_0());
              				
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSImportVirtualSizeAccess().getToKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIMPORT.g:647:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalIMPORT.g:648:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalIMPORT.g:648:4: ( ruleVersionedQualifiedReferenceName )
            // InternalIMPORT.g:649:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSImportVirtualSizeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSImportVirtualSizeAccess().getToGSSFormatFieldCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_9());
              		
            }
            // InternalIMPORT.g:670:3: (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalIMPORT.g:671:4: otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalIMPORT.g:679:4: ( (lv_addSize_12_0= ruleINTEGER ) )
                    // InternalIMPORT.g:680:5: (lv_addSize_12_0= ruleINTEGER )
                    {
                    // InternalIMPORT.g:680:5: (lv_addSize_12_0= ruleINTEGER )
                    // InternalIMPORT.g:681:6: lv_addSize_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSImportVirtualSizeAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_addSize_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSImportVirtualSizeRule());
                      						}
                      						set(
                      							current,
                      							"addSize",
                      							lv_addSize_12_0,
                      							"es.uah.aut.srg.gss.lang.import_.IMPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalIMPORT.g:703:3: (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSImportUnit ) ) otherlv_17= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIMPORT.g:704:4: otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSImportUnit ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,29,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSImportVirtualSizeAccess().getUnitKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSImportVirtualSizeAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalIMPORT.g:712:4: ( (lv_unit_16_0= ruleGSSImportUnit ) )
                    // InternalIMPORT.g:713:5: (lv_unit_16_0= ruleGSSImportUnit )
                    {
                    // InternalIMPORT.g:713:5: (lv_unit_16_0= ruleGSSImportUnit )
                    // InternalIMPORT.g:714:6: lv_unit_16_0= ruleGSSImportUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSImportVirtualSizeAccess().getUnitGSSImportUnitEnumRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_unit_16_0=ruleGSSImportUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSImportVirtualSizeRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_16_0,
                      							"es.uah.aut.srg.gss.lang.import_.IMPORT.GSSImportUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSImportVirtualSizeAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSImportVirtualSizeAccess().getSemicolonKeyword_13());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSImportVirtualSize"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIMPORT.g:748:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalIMPORT.g:748:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalIMPORT.g:749:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalIMPORT.g:755:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalIMPORT.g:761:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalIMPORT.g:762:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalIMPORT.g:762:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalIMPORT.g:763:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalIMPORT.g:770:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIMPORT.g:771:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalIMPORT.g:788:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalIMPORT.g:788:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalIMPORT.g:789:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalIMPORT.g:795:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalIMPORT.g:801:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalIMPORT.g:802:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalIMPORT.g:802:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalIMPORT.g:803:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalIMPORT.g:803:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==14||LA10_1==30||LA10_1==32) ) {
                    alt10=1;
                }
                else if ( (LA10_1==RULE_ID) ) {
                    alt10=2;
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
                    // InternalIMPORT.g:804:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalIMPORT.g:812:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalIMPORT.g:812:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalIMPORT.g:813:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalIMPORT.g:813:5: (this_INT_1= RULE_INT )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalIMPORT.g:814:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
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

            // InternalIMPORT.g:831:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==30) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIMPORT.g:832:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,30,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalIMPORT.g:837:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==RULE_INT) ) {
            	        int LA12_1 = input.LA(2);

            	        if ( (LA12_1==RULE_ID) ) {
            	            alt12=2;
            	        }
            	        else if ( (LA12_1==EOF||LA12_1==14||LA12_1==30||LA12_1==32) ) {
            	            alt12=1;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 12, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA12_0==RULE_ID) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalIMPORT.g:838:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_24); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalIMPORT.g:846:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalIMPORT.g:846:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalIMPORT.g:847:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalIMPORT.g:847:6: (this_INT_5= RULE_INT )?
            	            int alt11=2;
            	            int LA11_0 = input.LA(1);

            	            if ( (LA11_0==RULE_INT) ) {
            	                alt11=1;
            	            }
            	            switch (alt11) {
            	                case 1 :
            	                    // InternalIMPORT.g:848:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); if (state.failed) return current;
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
            	    break loop13;
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
    // InternalIMPORT.g:870:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalIMPORT.g:870:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalIMPORT.g:871:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalIMPORT.g:877:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalIMPORT.g:883:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalIMPORT.g:884:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalIMPORT.g:884:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalIMPORT.g:885:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_25);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,31,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_26);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalIMPORT.g:919:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalIMPORT.g:919:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalIMPORT.g:920:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalIMPORT.g:926:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalIMPORT.g:932:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalIMPORT.g:933:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalIMPORT.g:933:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalIMPORT.g:934:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalIMPORT.g:934:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( ((LA14_1>=30 && LA14_1<=31)) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalIMPORT.g:935:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
                    this_VersionedQualifiedName_0=ruleVersionedQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_VersionedQualifiedName_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalIMPORT.g:958:3: (kw= '::' this_ID_4= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIMPORT.g:959:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalIMPORT.g:976:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalIMPORT.g:976:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalIMPORT.g:977:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalIMPORT.g:983:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalIMPORT.g:989:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalIMPORT.g:990:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalIMPORT.g:990:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_HEXADECIMAL) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalIMPORT.g:991:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalIMPORT.g:991:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalIMPORT.g:992:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalIMPORT.g:992:4: (kw= '-' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==34) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalIMPORT.g:993:5: kw= '-'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_29); if (state.failed) return current;
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
                    // InternalIMPORT.g:1008:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleGSSImportUnit"
    // InternalIMPORT.g:1019:1: ruleGSSImportUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) ) ;
    public final Enumerator ruleGSSImportUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIMPORT.g:1025:2: ( ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) ) )
            // InternalIMPORT.g:1026:2: ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) )
            {
            // InternalIMPORT.g:1026:2: ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            else if ( (LA18_0==36) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalIMPORT.g:1027:3: (enumLiteral_0= 'bits' )
                    {
                    // InternalIMPORT.g:1027:3: (enumLiteral_0= 'bits' )
                    // InternalIMPORT.g:1028:4: enumLiteral_0= 'bits'
                    {
                    enumLiteral_0=(Token)match(input,35,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSImportUnitAccess().getBitsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIMPORT.g:1035:3: (enumLiteral_1= 'bytes' )
                    {
                    // InternalIMPORT.g:1035:3: (enumLiteral_1= 'bytes' )
                    // InternalIMPORT.g:1036:4: enumLiteral_1= 'bytes'
                    {
                    enumLiteral_1=(Token)match(input,36,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSImportUnitAccess().getBytesEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSImportUnit"

    // $ANTLR start synpred2_InternalIMPORT
    public final void synpred2_InternalIMPORT_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalIMPORT.g:243:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalIMPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalIMPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalIMPORT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalIMPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIMPORT.g:244:112: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalIMPORT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 0);
        // InternalIMPORT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalIMPORT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalIMPORT", "true");
        }
        // InternalIMPORT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalIMPORT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalIMPORT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalIMPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalIMPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalIMPORT.g:258:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSImportImportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred2_InternalIMPORT

    // $ANTLR start synpred3_InternalIMPORT
    public final void synpred3_InternalIMPORT_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalIMPORT.g:285:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalIMPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalIMPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalIMPORT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalIMPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalIMPORT.g:286:112: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalIMPORT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSImportImportAccess().getUnorderedGroup_3(), 1);
        // InternalIMPORT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalIMPORT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalIMPORT", "true");
        }
        // InternalIMPORT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalIMPORT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalIMPORT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalIMPORT.g:299:10: (lv_version_10_0= ruleVersion )
        {
        // InternalIMPORT.g:299:10: (lv_version_10_0= ruleVersion )
        // InternalIMPORT.g:300:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSImportImportAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
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
    // $ANTLR end synpred3_InternalIMPORT

    // Delegated rules

    public final boolean synpred2_InternalIMPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalIMPORT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalIMPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalIMPORT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000E0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200020L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008C00000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000004000000C0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030400000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020400000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    }


}