package es.uah.aut.srg.gss.lang.export.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.export.services.EXPORTGrammarAccess;



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
public class InternalEXPORTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "':='", "';'", "'GSSExportExport'", "'{'", "'uri'", "'version'", "'from'", "'NULL'", "'to'", "'}'", "'GSSExportSizes'", "'GSSExportSizeFromFileLength'", "'id'", "'fromFile'", "'addSize'", "'unit'", "'GSSExportSizeFromFileLine'", "'line'", "'GSSExportSizeInBits'", "'GSSExportSettings'", "'GSSExportSettingFromConst'", "'value'", "'toFieldRef'", "'GSSExportSettingFromSize'", "'sizeRef'", "'GSSExportSettingFromFile'", "'file'", "'offset'", "'size'", "'GSSExportSettingFromField'", "'fieldRef'", "'GSSExportSettingAIFromConst'", "'toArrayIndex'", "'GSSExportSettingAIFromFile'", "'GSSExportActivateDICs'", "'GSSExportDIC'", "'DICRef'", "'.'", "'('", "')'", "'::'", "'-'", "'bits'", "'bytes'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
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


        public InternalEXPORTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEXPORTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEXPORTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEXPORT.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private EXPORTGrammarAccess grammarAccess;

        public InternalEXPORTParser(TokenStream input, EXPORTGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected EXPORTGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalEXPORT.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalEXPORT.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalEXPORT.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalEXPORT.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSExportExport ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSExportExport ) ) ) )
            // InternalEXPORT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSExportExport ) ) )
            {
            // InternalEXPORT.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSExportExport ) ) )
            // InternalEXPORT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSExportExport ) )
            {
            // InternalEXPORT.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEXPORT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalEXPORT.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalEXPORT.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEXPORT.g:113:3: ( (lv_element_1_0= ruleGSSExportExport ) )
            // InternalEXPORT.g:114:4: (lv_element_1_0= ruleGSSExportExport )
            {
            // InternalEXPORT.g:114:4: (lv_element_1_0= ruleGSSExportExport )
            // InternalEXPORT.g:115:5: lv_element_1_0= ruleGSSExportExport
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSExportExportParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSExportExport();

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
              						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportExport");
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
    // InternalEXPORT.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalEXPORT.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalEXPORT.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalEXPORT.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_importURI_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEXPORT.g:149:2: ( (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalEXPORT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalEXPORT.g:150:2: (otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalEXPORT.g:151:3: otherlv_0= 'import' otherlv_1= ':=' ( (lv_importURI_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSModelFileImportAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalEXPORT.g:159:3: ( (lv_importURI_2_0= RULE_STRING ) )
            // InternalEXPORT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            {
            // InternalEXPORT.g:160:4: (lv_importURI_2_0= RULE_STRING )
            // InternalEXPORT.g:161:5: lv_importURI_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleGSSExportExport"
    // InternalEXPORT.g:185:1: entryRuleGSSExportExport returns [EObject current=null] : iv_ruleGSSExportExport= ruleGSSExportExport EOF ;
    public final EObject entryRuleGSSExportExport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportExport = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalEXPORT.g:189:2: (iv_ruleGSSExportExport= ruleGSSExportExport EOF )
            // InternalEXPORT.g:190:2: iv_ruleGSSExportExport= ruleGSSExportExport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportExportRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportExport=ruleGSSExportExport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportExport; 
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
    // $ANTLR end "entryRuleGSSExportExport"


    // $ANTLR start "ruleGSSExportExport"
    // InternalEXPORT.g:199:1: ruleGSSExportExport returns [EObject current=null] : (otherlv_0= 'GSSExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleGSSExportSizes ) )? ( (lv_settings_22_0= ruleGSSExportSettings ) ) ( (lv_activateDICs_23_0= ruleGSSExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' ) ;
    public final EObject ruleGSSExportExport() throws RecognitionException {
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
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_Sizes_21_0 = null;

        EObject lv_settings_22_0 = null;

        EObject lv_activateDICs_23_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalEXPORT.g:208:2: ( (otherlv_0= 'GSSExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleGSSExportSizes ) )? ( (lv_settings_22_0= ruleGSSExportSettings ) ) ( (lv_activateDICs_23_0= ruleGSSExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' ) )
            // InternalEXPORT.g:209:2: (otherlv_0= 'GSSExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleGSSExportSizes ) )? ( (lv_settings_22_0= ruleGSSExportSettings ) ) ( (lv_activateDICs_23_0= ruleGSSExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' )
            {
            // InternalEXPORT.g:209:2: (otherlv_0= 'GSSExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleGSSExportSizes ) )? ( (lv_settings_22_0= ruleGSSExportSettings ) ) ( (lv_activateDICs_23_0= ruleGSSExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';' )
            // InternalEXPORT.g:210:3: otherlv_0= 'GSSExportExport' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) otherlv_12= 'from' otherlv_13= ':=' (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) ) otherlv_16= ';' otherlv_17= 'to' otherlv_18= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_20= ';' ( (lv_Sizes_21_0= ruleGSSExportSizes ) )? ( (lv_settings_22_0= ruleGSSExportSettings ) ) ( (lv_activateDICs_23_0= ruleGSSExportActivateDICs ) )? otherlv_24= '}' otherlv_25= ';'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportExportAccess().getGSSExportExportKeyword_0());
              		
            }
            // InternalEXPORT.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEXPORT.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEXPORT.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalEXPORT.g:216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSExportExportAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportExportRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportExportAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) )
            // InternalEXPORT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalEXPORT.g:237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            // InternalEXPORT.g:238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());
            // InternalEXPORT.g:241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            // InternalEXPORT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?
            {
            // InternalEXPORT.g:242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalEXPORT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSExportExport", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalEXPORT.g:244:112: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalEXPORT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0);
            	    // InternalEXPORT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalEXPORT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSExportExport", "true");
            	    }
            	    // InternalEXPORT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalEXPORT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSExportExportAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalEXPORT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalEXPORT.g:258:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.export.EXPORT.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalEXPORT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSExportExport", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalEXPORT.g:286:112: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalEXPORT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1);
            	    // InternalEXPORT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalEXPORT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSExportExport", "true");
            	    }
            	    // InternalEXPORT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalEXPORT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSExportExportAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalEXPORT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
            	    // InternalEXPORT.g:300:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.gss.lang.export.EXPORT.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSExportExport", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3());

            }

            otherlv_12=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSExportExportAccess().getFromKeyword_4());
              		
            }
            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_5());
              		
            }
            // InternalEXPORT.g:343:3: (otherlv_14= 'NULL' | ( ( ruleVersionedQualifiedName ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
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
                    // InternalEXPORT.g:344:4: otherlv_14= 'NULL'
                    {
                    otherlv_14=(Token)match(input,20,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSExportExportAccess().getNULLKeyword_6_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:349:4: ( ( ruleVersionedQualifiedName ) )
                    {
                    // InternalEXPORT.g:349:4: ( ( ruleVersionedQualifiedName ) )
                    // InternalEXPORT.g:350:5: ( ruleVersionedQualifiedName )
                    {
                    // InternalEXPORT.g:350:5: ( ruleVersionedQualifiedName )
                    // InternalEXPORT.g:351:6: ruleVersionedQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getGSSExportExportRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportExportAccess().getFromGSSFormatFormatCrossReference_6_1_0());
                      					
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

            otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_7());
              		
            }
            otherlv_17=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSExportExportAccess().getToKeyword_8());
              		
            }
            otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSExportExportAccess().getColonEqualsSignKeyword_9());
              		
            }
            // InternalEXPORT.g:381:3: ( ( ruleVersionedQualifiedName ) )
            // InternalEXPORT.g:382:4: ( ruleVersionedQualifiedName )
            {
            // InternalEXPORT.g:382:4: ( ruleVersionedQualifiedName )
            // InternalEXPORT.g:383:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportExportRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportExportAccess().getToGSSFormatFormatCrossReference_10_0());
              				
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

            otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_11());
              		
            }
            // InternalEXPORT.g:404:3: ( (lv_Sizes_21_0= ruleGSSExportSizes ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEXPORT.g:405:4: (lv_Sizes_21_0= ruleGSSExportSizes )
                    {
                    // InternalEXPORT.g:405:4: (lv_Sizes_21_0= ruleGSSExportSizes )
                    // InternalEXPORT.g:406:5: lv_Sizes_21_0= ruleGSSExportSizes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSExportExportAccess().getSizesGSSExportSizesParserRuleCall_12_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_Sizes_21_0=ruleGSSExportSizes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
                      					}
                      					set(
                      						current,
                      						"Sizes",
                      						lv_Sizes_21_0,
                      						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSizes");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEXPORT.g:423:3: ( (lv_settings_22_0= ruleGSSExportSettings ) )
            // InternalEXPORT.g:424:4: (lv_settings_22_0= ruleGSSExportSettings )
            {
            // InternalEXPORT.g:424:4: (lv_settings_22_0= ruleGSSExportSettings )
            // InternalEXPORT.g:425:5: lv_settings_22_0= ruleGSSExportSettings
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportExportAccess().getSettingsGSSExportSettingsParserRuleCall_13_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_settings_22_0=ruleGSSExportSettings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
              					}
              					set(
              						current,
              						"settings",
              						lv_settings_22_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSettings");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEXPORT.g:442:3: ( (lv_activateDICs_23_0= ruleGSSExportActivateDICs ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==47) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEXPORT.g:443:4: (lv_activateDICs_23_0= ruleGSSExportActivateDICs )
                    {
                    // InternalEXPORT.g:443:4: (lv_activateDICs_23_0= ruleGSSExportActivateDICs )
                    // InternalEXPORT.g:444:5: lv_activateDICs_23_0= ruleGSSExportActivateDICs
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSExportExportAccess().getActivateDICsGSSExportActivateDICsParserRuleCall_14_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_16);
                    lv_activateDICs_23_0=ruleGSSExportActivateDICs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSExportExportRule());
                      					}
                      					set(
                      						current,
                      						"activateDICs",
                      						lv_activateDICs_23_0,
                      						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportActivateDICs");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_24, grammarAccess.getGSSExportExportAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSExportExportAccess().getSemicolonKeyword_16());
              		
            }

            }


            }

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
    // $ANTLR end "ruleGSSExportExport"


    // $ANTLR start "entryRuleGSSExportSizes"
    // InternalEXPORT.g:476:1: entryRuleGSSExportSizes returns [EObject current=null] : iv_ruleGSSExportSizes= ruleGSSExportSizes EOF ;
    public final EObject entryRuleGSSExportSizes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSizes = null;


        try {
            // InternalEXPORT.g:476:55: (iv_ruleGSSExportSizes= ruleGSSExportSizes EOF )
            // InternalEXPORT.g:477:2: iv_ruleGSSExportSizes= ruleGSSExportSizes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSizesRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSizes=ruleGSSExportSizes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSizes; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSizes"


    // $ANTLR start "ruleGSSExportSizes"
    // InternalEXPORT.g:483:1: ruleGSSExportSizes returns [EObject current=null] : ( () otherlv_1= 'GSSExportSizes' otherlv_2= '{' ( (lv_size_3_0= ruleGSSExportSize ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSExportSizes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_size_3_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:489:2: ( ( () otherlv_1= 'GSSExportSizes' otherlv_2= '{' ( (lv_size_3_0= ruleGSSExportSize ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalEXPORT.g:490:2: ( () otherlv_1= 'GSSExportSizes' otherlv_2= '{' ( (lv_size_3_0= ruleGSSExportSize ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalEXPORT.g:490:2: ( () otherlv_1= 'GSSExportSizes' otherlv_2= '{' ( (lv_size_3_0= ruleGSSExportSize ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalEXPORT.g:491:3: () otherlv_1= 'GSSExportSizes' otherlv_2= '{' ( (lv_size_3_0= ruleGSSExportSize ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            // InternalEXPORT.g:491:3: ()
            // InternalEXPORT.g:492:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSExportSizesAccess().getGSSExportSizesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizesAccess().getGSSExportSizesKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizesAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:509:3: ( (lv_size_3_0= ruleGSSExportSize ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||LA6_0==29||LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEXPORT.g:510:4: (lv_size_3_0= ruleGSSExportSize )
            	    {
            	    // InternalEXPORT.g:510:4: (lv_size_3_0= ruleGSSExportSize )
            	    // InternalEXPORT.g:511:5: lv_size_3_0= ruleGSSExportSize
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSExportSizesAccess().getSizeGSSExportSizeParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_size_3_0=ruleGSSExportSize();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSExportSizesRule());
            	      					}
            	      					add(
            	      						current,
            	      						"size",
            	      						lv_size_3_0,
            	      						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSize");
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

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSExportSizesAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSizesAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSizes"


    // $ANTLR start "entryRuleGSSExportSize"
    // InternalEXPORT.g:540:1: entryRuleGSSExportSize returns [EObject current=null] : iv_ruleGSSExportSize= ruleGSSExportSize EOF ;
    public final EObject entryRuleGSSExportSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSize = null;


        try {
            // InternalEXPORT.g:540:54: (iv_ruleGSSExportSize= ruleGSSExportSize EOF )
            // InternalEXPORT.g:541:2: iv_ruleGSSExportSize= ruleGSSExportSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSize=ruleGSSExportSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSize; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSize"


    // $ANTLR start "ruleGSSExportSize"
    // InternalEXPORT.g:547:1: ruleGSSExportSize returns [EObject current=null] : (this_GSSExportSizeFromFileLength_0= ruleGSSExportSizeFromFileLength | this_GSSExportSizeFromFileLine_1= ruleGSSExportSizeFromFileLine | this_GSSExportSizeInBits_2= ruleGSSExportSizeInBits ) ;
    public final EObject ruleGSSExportSize() throws RecognitionException {
        EObject current = null;

        EObject this_GSSExportSizeFromFileLength_0 = null;

        EObject this_GSSExportSizeFromFileLine_1 = null;

        EObject this_GSSExportSizeInBits_2 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:553:2: ( (this_GSSExportSizeFromFileLength_0= ruleGSSExportSizeFromFileLength | this_GSSExportSizeFromFileLine_1= ruleGSSExportSizeFromFileLine | this_GSSExportSizeInBits_2= ruleGSSExportSizeInBits ) )
            // InternalEXPORT.g:554:2: (this_GSSExportSizeFromFileLength_0= ruleGSSExportSizeFromFileLength | this_GSSExportSizeFromFileLine_1= ruleGSSExportSizeFromFileLine | this_GSSExportSizeInBits_2= ruleGSSExportSizeInBits )
            {
            // InternalEXPORT.g:554:2: (this_GSSExportSizeFromFileLength_0= ruleGSSExportSizeFromFileLength | this_GSSExportSizeFromFileLine_1= ruleGSSExportSizeFromFileLine | this_GSSExportSizeInBits_2= ruleGSSExportSizeInBits )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 29:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEXPORT.g:555:3: this_GSSExportSizeFromFileLength_0= ruleGSSExportSizeFromFileLength
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSizeAccess().getGSSExportSizeFromFileLengthParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSizeFromFileLength_0=ruleGSSExportSizeFromFileLength();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSizeFromFileLength_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:567:3: this_GSSExportSizeFromFileLine_1= ruleGSSExportSizeFromFileLine
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSizeAccess().getGSSExportSizeFromFileLineParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSizeFromFileLine_1=ruleGSSExportSizeFromFileLine();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSizeFromFileLine_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEXPORT.g:579:3: this_GSSExportSizeInBits_2= ruleGSSExportSizeInBits
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSizeAccess().getGSSExportSizeInBitsParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSizeInBits_2=ruleGSSExportSizeInBits();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSizeInBits_2;
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
    // $ANTLR end "ruleGSSExportSize"


    // $ANTLR start "entryRuleGSSExportSizeFromFileLength"
    // InternalEXPORT.g:594:1: entryRuleGSSExportSizeFromFileLength returns [EObject current=null] : iv_ruleGSSExportSizeFromFileLength= ruleGSSExportSizeFromFileLength EOF ;
    public final EObject entryRuleGSSExportSizeFromFileLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSizeFromFileLength = null;


        try {
            // InternalEXPORT.g:594:68: (iv_ruleGSSExportSizeFromFileLength= ruleGSSExportSizeFromFileLength EOF )
            // InternalEXPORT.g:595:2: iv_ruleGSSExportSizeFromFileLength= ruleGSSExportSizeFromFileLength EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSizeFromFileLength=ruleGSSExportSizeFromFileLength();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSizeFromFileLength; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSizeFromFileLength"


    // $ANTLR start "ruleGSSExportSizeFromFileLength"
    // InternalEXPORT.g:601:1: ruleGSSExportSizeFromFileLength returns [EObject current=null] : (otherlv_0= 'GSSExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSExportSizeFromFileLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_fromFile_8_0=null;
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

        AntlrDatatypeRuleToken lv_addSize_12_0 = null;

        Enumerator lv_unit_16_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:607:2: ( (otherlv_0= 'GSSExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalEXPORT.g:608:2: (otherlv_0= 'GSSExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalEXPORT.g:608:2: (otherlv_0= 'GSSExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalEXPORT.g:609:3: otherlv_0= 'GSSExportSizeFromFileLength' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSizeFromFileLengthAccess().getGSSExportSizeFromFileLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizeFromFileLengthAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:625:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:626:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:626:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:627:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLengthRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:656:3: ( (lv_fromFile_8_0= RULE_ID ) )
            // InternalEXPORT.g:657:4: (lv_fromFile_8_0= RULE_ID )
            {
            // InternalEXPORT.g:657:4: (lv_fromFile_8_0= RULE_ID )
            // InternalEXPORT.g:658:5: lv_fromFile_8_0= RULE_ID
            {
            lv_fromFile_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_8_0, grammarAccess.getGSSExportSizeFromFileLengthAccess().getFromFileIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSizeFromFileLengthRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_9());
              		
            }
            // InternalEXPORT.g:678:3: (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEXPORT.g:679:4: otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalEXPORT.g:687:4: ( (lv_addSize_12_0= ruleINTEGER ) )
                    // InternalEXPORT.g:688:5: (lv_addSize_12_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:688:5: (lv_addSize_12_0= ruleINTEGER )
                    // InternalEXPORT.g:689:6: lv_addSize_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_addSize_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLengthRule());
                      						}
                      						set(
                      							current,
                      							"addSize",
                      							lv_addSize_12_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:711:3: (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEXPORT.g:712:4: otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSExportSizeFromFileLengthAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalEXPORT.g:720:4: ( (lv_unit_16_0= ruleGSSExportUnit ) )
                    // InternalEXPORT.g:721:5: (lv_unit_16_0= ruleGSSExportUnit )
                    {
                    // InternalEXPORT.g:721:5: (lv_unit_16_0= ruleGSSExportUnit )
                    // InternalEXPORT.g:722:6: lv_unit_16_0= ruleGSSExportUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLengthAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_unit_16_0=ruleGSSExportUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLengthRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_16_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSExportSizeFromFileLengthAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSExportSizeFromFileLengthAccess().getSemicolonKeyword_13());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSizeFromFileLength"


    // $ANTLR start "entryRuleGSSExportSizeFromFileLine"
    // InternalEXPORT.g:756:1: entryRuleGSSExportSizeFromFileLine returns [EObject current=null] : iv_ruleGSSExportSizeFromFileLine= ruleGSSExportSizeFromFileLine EOF ;
    public final EObject entryRuleGSSExportSizeFromFileLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSizeFromFileLine = null;


        try {
            // InternalEXPORT.g:756:66: (iv_ruleGSSExportSizeFromFileLine= ruleGSSExportSizeFromFileLine EOF )
            // InternalEXPORT.g:757:2: iv_ruleGSSExportSizeFromFileLine= ruleGSSExportSizeFromFileLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSizeFromFileLine=ruleGSSExportSizeFromFileLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSizeFromFileLine; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSizeFromFileLine"


    // $ANTLR start "ruleGSSExportSizeFromFileLine"
    // InternalEXPORT.g:763:1: ruleGSSExportSizeFromFileLine returns [EObject current=null] : (otherlv_0= 'GSSExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleGSSExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSExportSizeFromFileLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_fromFile_8_0=null;
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

        AntlrDatatypeRuleToken lv_line_12_0 = null;

        AntlrDatatypeRuleToken lv_addSize_16_0 = null;

        Enumerator lv_unit_20_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:769:2: ( (otherlv_0= 'GSSExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleGSSExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalEXPORT.g:770:2: (otherlv_0= 'GSSExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleGSSExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalEXPORT.g:770:2: (otherlv_0= 'GSSExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleGSSExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalEXPORT.g:771:3: otherlv_0= 'GSSExportSizeFromFileLine' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'fromFile' otherlv_7= ':=' ( (lv_fromFile_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= 'line' otherlv_11= ':=' ( (lv_line_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleGSSExportUnit ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSizeFromFileLineAccess().getGSSExportSizeFromFileLineKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizeFromFileLineAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizeFromFileLineAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:787:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:788:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:788:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:789:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:818:3: ( (lv_fromFile_8_0= RULE_ID ) )
            // InternalEXPORT.g:819:4: (lv_fromFile_8_0= RULE_ID )
            {
            // InternalEXPORT.g:819:4: (lv_fromFile_8_0= RULE_ID )
            // InternalEXPORT.g:820:5: lv_fromFile_8_0= RULE_ID
            {
            lv_fromFile_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_fromFile_8_0, grammarAccess.getGSSExportSizeFromFileLineAccess().getFromFileIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSizeFromFileLineRule());
              					}
              					setWithLastConsumed(
              						current,
              						"fromFile",
              						lv_fromFile_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSExportSizeFromFileLineAccess().getLineKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalEXPORT.g:848:3: ( (lv_line_12_0= ruleINTEGER ) )
            // InternalEXPORT.g:849:4: (lv_line_12_0= ruleINTEGER )
            {
            // InternalEXPORT.g:849:4: (lv_line_12_0= ruleINTEGER )
            // InternalEXPORT.g:850:5: lv_line_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getLineINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_line_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
              					}
              					set(
              						current,
              						"line",
              						lv_line_12_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_13());
              		
            }
            // InternalEXPORT.g:871:3: (otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEXPORT.g:872:4: otherlv_14= 'addSize' otherlv_15= ':=' ( (lv_addSize_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalEXPORT.g:880:4: ( (lv_addSize_16_0= ruleINTEGER ) )
                    // InternalEXPORT.g:881:5: (lv_addSize_16_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:881:5: (lv_addSize_16_0= ruleINTEGER )
                    // InternalEXPORT.g:882:6: lv_addSize_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getAddSizeINTEGERParserRuleCall_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_addSize_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
                      						}
                      						set(
                      							current,
                      							"addSize",
                      							lv_addSize_16_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:904:3: (otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleGSSExportUnit ) ) otherlv_21= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEXPORT.g:905:4: otherlv_18= 'unit' otherlv_19= ':=' ( (lv_unit_20_0= ruleGSSExportUnit ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitKeyword_15_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSExportSizeFromFileLineAccess().getColonEqualsSignKeyword_15_1());
                      			
                    }
                    // InternalEXPORT.g:913:4: ( (lv_unit_20_0= ruleGSSExportUnit ) )
                    // InternalEXPORT.g:914:5: (lv_unit_20_0= ruleGSSExportUnit )
                    {
                    // InternalEXPORT.g:914:5: (lv_unit_20_0= ruleGSSExportUnit )
                    // InternalEXPORT.g:915:6: lv_unit_20_0= ruleGSSExportUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSizeFromFileLineAccess().getUnitGSSExportUnitEnumRuleCall_15_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_unit_20_0=ruleGSSExportUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSizeFromFileLineRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_20_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_15_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSExportSizeFromFileLineAccess().getRightCurlyBracketKeyword_16());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSExportSizeFromFileLineAccess().getSemicolonKeyword_17());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSizeFromFileLine"


    // $ANTLR start "entryRuleGSSExportSizeInBits"
    // InternalEXPORT.g:949:1: entryRuleGSSExportSizeInBits returns [EObject current=null] : iv_ruleGSSExportSizeInBits= ruleGSSExportSizeInBits EOF ;
    public final EObject entryRuleGSSExportSizeInBits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSizeInBits = null;


        try {
            // InternalEXPORT.g:949:60: (iv_ruleGSSExportSizeInBits= ruleGSSExportSizeInBits EOF )
            // InternalEXPORT.g:950:2: iv_ruleGSSExportSizeInBits= ruleGSSExportSizeInBits EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSizeInBitsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSizeInBits=ruleGSSExportSizeInBits();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSizeInBits; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSizeInBits"


    // $ANTLR start "ruleGSSExportSizeInBits"
    // InternalEXPORT.g:956:1: ruleGSSExportSizeInBits returns [EObject current=null] : (otherlv_0= 'GSSExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) ;
    public final EObject ruleGSSExportSizeInBits() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_from_8_0=null;
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

        AntlrDatatypeRuleToken lv_addSize_12_0 = null;

        Enumerator lv_unit_16_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:962:2: ( (otherlv_0= 'GSSExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' ) )
            // InternalEXPORT.g:963:2: (otherlv_0= 'GSSExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            {
            // InternalEXPORT.g:963:2: (otherlv_0= 'GSSExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';' )
            // InternalEXPORT.g:964:3: otherlv_0= 'GSSExportSizeInBits' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'from' otherlv_7= ':=' ( (lv_from_8_0= RULE_ID ) ) otherlv_9= ';' (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )? otherlv_18= '}' otherlv_19= ';'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSizeInBitsAccess().getGSSExportSizeInBitsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSizeInBitsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSizeInBitsAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:980:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:981:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:981:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:982:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSizeInBitsAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSizeInBitsRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSizeInBitsAccess().getFromKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1011:3: ( (lv_from_8_0= RULE_ID ) )
            // InternalEXPORT.g:1012:4: (lv_from_8_0= RULE_ID )
            {
            // InternalEXPORT.g:1012:4: (lv_from_8_0= RULE_ID )
            // InternalEXPORT.g:1013:5: lv_from_8_0= RULE_ID
            {
            lv_from_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_from_8_0, grammarAccess.getGSSExportSizeInBitsAccess().getFromIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSizeInBitsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"from",
              						lv_from_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_9());
              		
            }
            // InternalEXPORT.g:1033:3: (otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEXPORT.g:1034:4: otherlv_10= 'addSize' otherlv_11= ':=' ( (lv_addSize_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalEXPORT.g:1042:4: ( (lv_addSize_12_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1043:5: (lv_addSize_12_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1043:5: (lv_addSize_12_0= ruleINTEGER )
                    // InternalEXPORT.g:1044:6: lv_addSize_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSizeInBitsAccess().getAddSizeINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_addSize_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSizeInBitsRule());
                      						}
                      						set(
                      							current,
                      							"addSize",
                      							lv_addSize_12_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:1066:3: (otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEXPORT.g:1067:4: otherlv_14= 'unit' otherlv_15= ':=' ( (lv_unit_16_0= ruleGSSExportUnit ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSExportSizeInBitsAccess().getUnitKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSExportSizeInBitsAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalEXPORT.g:1075:4: ( (lv_unit_16_0= ruleGSSExportUnit ) )
                    // InternalEXPORT.g:1076:5: (lv_unit_16_0= ruleGSSExportUnit )
                    {
                    // InternalEXPORT.g:1076:5: (lv_unit_16_0= ruleGSSExportUnit )
                    // InternalEXPORT.g:1077:6: lv_unit_16_0= ruleGSSExportUnit
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSizeInBitsAccess().getUnitGSSExportUnitEnumRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_unit_16_0=ruleGSSExportUnit();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSizeInBitsRule());
                      						}
                      						set(
                      							current,
                      							"unit",
                      							lv_unit_16_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportUnit");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSExportSizeInBitsAccess().getRightCurlyBracketKeyword_12());
              		
            }
            otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSExportSizeInBitsAccess().getSemicolonKeyword_13());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSizeInBits"


    // $ANTLR start "entryRuleGSSExportSettings"
    // InternalEXPORT.g:1111:1: entryRuleGSSExportSettings returns [EObject current=null] : iv_ruleGSSExportSettings= ruleGSSExportSettings EOF ;
    public final EObject entryRuleGSSExportSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSettings = null;


        try {
            // InternalEXPORT.g:1111:58: (iv_ruleGSSExportSettings= ruleGSSExportSettings EOF )
            // InternalEXPORT.g:1112:2: iv_ruleGSSExportSettings= ruleGSSExportSettings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSettings=ruleGSSExportSettings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSettings; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSettings"


    // $ANTLR start "ruleGSSExportSettings"
    // InternalEXPORT.g:1118:1: ruleGSSExportSettings returns [EObject current=null] : ( () otherlv_1= 'GSSExportSettings' otherlv_2= '{' ( (lv_setting_3_0= ruleGSSExportSetting ) )* otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSExportSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_setting_3_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1124:2: ( ( () otherlv_1= 'GSSExportSettings' otherlv_2= '{' ( (lv_setting_3_0= ruleGSSExportSetting ) )* otherlv_4= '}' otherlv_5= ';' ) )
            // InternalEXPORT.g:1125:2: ( () otherlv_1= 'GSSExportSettings' otherlv_2= '{' ( (lv_setting_3_0= ruleGSSExportSetting ) )* otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalEXPORT.g:1125:2: ( () otherlv_1= 'GSSExportSettings' otherlv_2= '{' ( (lv_setting_3_0= ruleGSSExportSetting ) )* otherlv_4= '}' otherlv_5= ';' )
            // InternalEXPORT.g:1126:3: () otherlv_1= 'GSSExportSettings' otherlv_2= '{' ( (lv_setting_3_0= ruleGSSExportSetting ) )* otherlv_4= '}' otherlv_5= ';'
            {
            // InternalEXPORT.g:1126:3: ()
            // InternalEXPORT.g:1127:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingsAccess().getGSSExportSettingsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:1144:3: ( (lv_setting_3_0= ruleGSSExportSetting ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33||LA14_0==36||LA14_0==38||LA14_0==42||LA14_0==44||LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEXPORT.g:1145:4: (lv_setting_3_0= ruleGSSExportSetting )
            	    {
            	    // InternalEXPORT.g:1145:4: (lv_setting_3_0= ruleGSSExportSetting )
            	    // InternalEXPORT.g:1146:5: lv_setting_3_0= ruleGSSExportSetting
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSExportSettingsAccess().getSettingGSSExportSettingParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    lv_setting_3_0=ruleGSSExportSetting();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSExportSettingsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"setting",
            	      						lv_setting_3_0,
            	      						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportSetting");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSExportSettingsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingsAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSettings"


    // $ANTLR start "entryRuleGSSExportSetting"
    // InternalEXPORT.g:1175:1: entryRuleGSSExportSetting returns [EObject current=null] : iv_ruleGSSExportSetting= ruleGSSExportSetting EOF ;
    public final EObject entryRuleGSSExportSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSetting = null;


        try {
            // InternalEXPORT.g:1175:57: (iv_ruleGSSExportSetting= ruleGSSExportSetting EOF )
            // InternalEXPORT.g:1176:2: iv_ruleGSSExportSetting= ruleGSSExportSetting EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSetting=ruleGSSExportSetting();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSetting; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSetting"


    // $ANTLR start "ruleGSSExportSetting"
    // InternalEXPORT.g:1182:1: ruleGSSExportSetting returns [EObject current=null] : (this_GSSExportSettingFromConst_0= ruleGSSExportSettingFromConst | this_GSSExportSettingFromSize_1= ruleGSSExportSettingFromSize | this_GSSExportSettingFromFile_2= ruleGSSExportSettingFromFile | this_GSSExportSettingFromField_3= ruleGSSExportSettingFromField | this_GSSExportSettingAIFromConst_4= ruleGSSExportSettingAIFromConst | this_GSSExportSettingAIFromFile_5= ruleGSSExportSettingAIFromFile ) ;
    public final EObject ruleGSSExportSetting() throws RecognitionException {
        EObject current = null;

        EObject this_GSSExportSettingFromConst_0 = null;

        EObject this_GSSExportSettingFromSize_1 = null;

        EObject this_GSSExportSettingFromFile_2 = null;

        EObject this_GSSExportSettingFromField_3 = null;

        EObject this_GSSExportSettingAIFromConst_4 = null;

        EObject this_GSSExportSettingAIFromFile_5 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1188:2: ( (this_GSSExportSettingFromConst_0= ruleGSSExportSettingFromConst | this_GSSExportSettingFromSize_1= ruleGSSExportSettingFromSize | this_GSSExportSettingFromFile_2= ruleGSSExportSettingFromFile | this_GSSExportSettingFromField_3= ruleGSSExportSettingFromField | this_GSSExportSettingAIFromConst_4= ruleGSSExportSettingAIFromConst | this_GSSExportSettingAIFromFile_5= ruleGSSExportSettingAIFromFile ) )
            // InternalEXPORT.g:1189:2: (this_GSSExportSettingFromConst_0= ruleGSSExportSettingFromConst | this_GSSExportSettingFromSize_1= ruleGSSExportSettingFromSize | this_GSSExportSettingFromFile_2= ruleGSSExportSettingFromFile | this_GSSExportSettingFromField_3= ruleGSSExportSettingFromField | this_GSSExportSettingAIFromConst_4= ruleGSSExportSettingAIFromConst | this_GSSExportSettingAIFromFile_5= ruleGSSExportSettingAIFromFile )
            {
            // InternalEXPORT.g:1189:2: (this_GSSExportSettingFromConst_0= ruleGSSExportSettingFromConst | this_GSSExportSettingFromSize_1= ruleGSSExportSettingFromSize | this_GSSExportSettingFromFile_2= ruleGSSExportSettingFromFile | this_GSSExportSettingFromField_3= ruleGSSExportSettingFromField | this_GSSExportSettingAIFromConst_4= ruleGSSExportSettingAIFromConst | this_GSSExportSettingAIFromFile_5= ruleGSSExportSettingAIFromFile )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 36:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            case 42:
                {
                alt15=4;
                }
                break;
            case 44:
                {
                alt15=5;
                }
                break;
            case 46:
                {
                alt15=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalEXPORT.g:1190:3: this_GSSExportSettingFromConst_0= ruleGSSExportSettingFromConst
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSettingAccess().getGSSExportSettingFromConstParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSettingFromConst_0=ruleGSSExportSettingFromConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSettingFromConst_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:1202:3: this_GSSExportSettingFromSize_1= ruleGSSExportSettingFromSize
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSettingAccess().getGSSExportSettingFromSizeParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSettingFromSize_1=ruleGSSExportSettingFromSize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSettingFromSize_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEXPORT.g:1214:3: this_GSSExportSettingFromFile_2= ruleGSSExportSettingFromFile
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSettingAccess().getGSSExportSettingFromFileParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSettingFromFile_2=ruleGSSExportSettingFromFile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSettingFromFile_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEXPORT.g:1226:3: this_GSSExportSettingFromField_3= ruleGSSExportSettingFromField
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSettingAccess().getGSSExportSettingFromFieldParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSettingFromField_3=ruleGSSExportSettingFromField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSettingFromField_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEXPORT.g:1238:3: this_GSSExportSettingAIFromConst_4= ruleGSSExportSettingAIFromConst
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSettingAccess().getGSSExportSettingAIFromConstParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSettingAIFromConst_4=ruleGSSExportSettingAIFromConst();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSettingAIFromConst_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEXPORT.g:1250:3: this_GSSExportSettingAIFromFile_5= ruleGSSExportSettingAIFromFile
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSExportSettingAccess().getGSSExportSettingAIFromFileParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSExportSettingAIFromFile_5=ruleGSSExportSettingAIFromFile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSExportSettingAIFromFile_5;
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
    // $ANTLR end "ruleGSSExportSetting"


    // $ANTLR start "entryRuleGSSExportSettingFromConst"
    // InternalEXPORT.g:1265:1: entryRuleGSSExportSettingFromConst returns [EObject current=null] : iv_ruleGSSExportSettingFromConst= ruleGSSExportSettingFromConst EOF ;
    public final EObject entryRuleGSSExportSettingFromConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSettingFromConst = null;


        try {
            // InternalEXPORT.g:1265:66: (iv_ruleGSSExportSettingFromConst= ruleGSSExportSettingFromConst EOF )
            // InternalEXPORT.g:1266:2: iv_ruleGSSExportSettingFromConst= ruleGSSExportSettingFromConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingFromConstRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSettingFromConst=ruleGSSExportSettingFromConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSettingFromConst; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSettingFromConst"


    // $ANTLR start "ruleGSSExportSettingFromConst"
    // InternalEXPORT.g:1272:1: ruleGSSExportSettingFromConst returns [EObject current=null] : (otherlv_0= 'GSSExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSExportSettingFromConst() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1278:2: ( (otherlv_0= 'GSSExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:1279:2: (otherlv_0= 'GSSExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:1279:2: (otherlv_0= 'GSSExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:1280:3: otherlv_0= 'GSSExportSettingFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromConstAccess().getGSSExportSettingFromConstKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromConstAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromConstAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1296:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:1297:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1297:4: (lv_value_4_0= ruleINTEGER )
            // InternalEXPORT.g:1298:5: lv_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingFromConstAccess().getValueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSettingFromConstRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromConstAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1327:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1328:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1328:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1329:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingFromConstRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingFromConstAccess().getToFieldRefGSSFormatFieldCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromConstAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromConstAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSettingFromConst"


    // $ANTLR start "entryRuleGSSExportSettingFromSize"
    // InternalEXPORT.g:1362:1: entryRuleGSSExportSettingFromSize returns [EObject current=null] : iv_ruleGSSExportSettingFromSize= ruleGSSExportSettingFromSize EOF ;
    public final EObject entryRuleGSSExportSettingFromSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSettingFromSize = null;


        try {
            // InternalEXPORT.g:1362:65: (iv_ruleGSSExportSettingFromSize= ruleGSSExportSettingFromSize EOF )
            // InternalEXPORT.g:1363:2: iv_ruleGSSExportSettingFromSize= ruleGSSExportSettingFromSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingFromSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSettingFromSize=ruleGSSExportSettingFromSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSettingFromSize; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSettingFromSize"


    // $ANTLR start "ruleGSSExportSettingFromSize"
    // InternalEXPORT.g:1369:1: ruleGSSExportSettingFromSize returns [EObject current=null] : (otherlv_0= 'GSSExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSExportSettingFromSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_sizeRef_4_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1375:2: ( (otherlv_0= 'GSSExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:1376:2: (otherlv_0= 'GSSExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:1376:2: (otherlv_0= 'GSSExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:1377:3: otherlv_0= 'GSSExportSettingFromSize' otherlv_1= '{' otherlv_2= 'sizeRef' otherlv_3= ':=' ( (lv_sizeRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromSizeAccess().getGSSExportSettingFromSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1393:3: ( (lv_sizeRef_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:1394:4: (lv_sizeRef_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1394:4: (lv_sizeRef_4_0= ruleINTEGER )
            // InternalEXPORT.g:1395:5: lv_sizeRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingFromSizeAccess().getSizeRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_sizeRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSettingFromSizeRule());
              					}
              					set(
              						current,
              						"sizeRef",
              						lv_sizeRef_4_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1424:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1425:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1425:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1426:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingFromSizeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingFromSizeAccess().getToFieldRefGSSFormatFieldCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromSizeAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSettingFromSize"


    // $ANTLR start "entryRuleGSSExportSettingFromFile"
    // InternalEXPORT.g:1459:1: entryRuleGSSExportSettingFromFile returns [EObject current=null] : iv_ruleGSSExportSettingFromFile= ruleGSSExportSettingFromFile EOF ;
    public final EObject entryRuleGSSExportSettingFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSettingFromFile = null;


        try {
            // InternalEXPORT.g:1459:65: (iv_ruleGSSExportSettingFromFile= ruleGSSExportSettingFromFile EOF )
            // InternalEXPORT.g:1460:2: iv_ruleGSSExportSettingFromFile= ruleGSSExportSettingFromFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSettingFromFile=ruleGSSExportSettingFromFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSettingFromFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSettingFromFile"


    // $ANTLR start "ruleGSSExportSettingFromFile"
    // InternalEXPORT.g:1466:1: ruleGSSExportSettingFromFile returns [EObject current=null] : (otherlv_0= 'GSSExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSExportSettingFromFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_file_4_0=null;
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
        AntlrDatatypeRuleToken lv_offset_12_0 = null;

        AntlrDatatypeRuleToken lv_size_16_0 = null;

        AntlrDatatypeRuleToken lv_line_20_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1472:2: ( (otherlv_0= 'GSSExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' ) )
            // InternalEXPORT.g:1473:2: (otherlv_0= 'GSSExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalEXPORT.g:1473:2: (otherlv_0= 'GSSExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';' )
            // InternalEXPORT.g:1474:3: otherlv_0= 'GSSExportSettingFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )? (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )? otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromFileAccess().getGSSExportSettingFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromFileAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromFileAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1490:3: ( (lv_file_4_0= RULE_ID ) )
            // InternalEXPORT.g:1491:4: (lv_file_4_0= RULE_ID )
            {
            // InternalEXPORT.g:1491:4: (lv_file_4_0= RULE_ID )
            // InternalEXPORT.g:1492:5: lv_file_4_0= RULE_ID
            {
            lv_file_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_file_4_0, grammarAccess.getGSSExportSettingFromFileAccess().getFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"file",
              						lv_file_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1520:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1521:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1521:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1522:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingFromFileRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getToFieldRefGSSFormatFieldCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_9());
              		
            }
            // InternalEXPORT.g:1543:3: (otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEXPORT.g:1544:4: otherlv_10= 'offset' otherlv_11= ':=' ( (lv_offset_12_0= ruleINTEGER ) ) otherlv_13= ';'
                    {
                    otherlv_10=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromFileAccess().getOffsetKeyword_10_0());
                      			
                    }
                    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_10_1());
                      			
                    }
                    // InternalEXPORT.g:1552:4: ( (lv_offset_12_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1553:5: (lv_offset_12_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1553:5: (lv_offset_12_0= ruleINTEGER )
                    // InternalEXPORT.g:1554:6: lv_offset_12_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getOffsetINTEGERParserRuleCall_10_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_offset_12_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSettingFromFileRule());
                      						}
                      						set(
                      							current,
                      							"offset",
                      							lv_offset_12_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_10_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:1576:3: (otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEXPORT.g:1577:4: otherlv_14= 'size' otherlv_15= ':=' ( (lv_size_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSExportSettingFromFileAccess().getSizeKeyword_11_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_11_1());
                      			
                    }
                    // InternalEXPORT.g:1585:4: ( (lv_size_16_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1586:5: (lv_size_16_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1586:5: (lv_size_16_0= ruleINTEGER )
                    // InternalEXPORT.g:1587:6: lv_size_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getSizeINTEGERParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_size_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSettingFromFileRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_16_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_11_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:1609:3: (otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEXPORT.g:1610:4: otherlv_18= 'line' otherlv_19= ':=' ( (lv_line_20_0= ruleINTEGER ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSExportSettingFromFileAccess().getLineKeyword_12_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSExportSettingFromFileAccess().getColonEqualsSignKeyword_12_1());
                      			
                    }
                    // InternalEXPORT.g:1618:4: ( (lv_line_20_0= ruleINTEGER ) )
                    // InternalEXPORT.g:1619:5: (lv_line_20_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:1619:5: (lv_line_20_0= ruleINTEGER )
                    // InternalEXPORT.g:1620:6: lv_line_20_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSettingFromFileAccess().getLineINTEGERParserRuleCall_12_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_line_20_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSettingFromFileRule());
                      						}
                      						set(
                      							current,
                      							"line",
                      							lv_line_20_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_12_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSExportSettingFromFileAccess().getRightCurlyBracketKeyword_13());
              		
            }
            otherlv_23=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSExportSettingFromFileAccess().getSemicolonKeyword_14());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSettingFromFile"


    // $ANTLR start "entryRuleGSSExportSettingFromField"
    // InternalEXPORT.g:1654:1: entryRuleGSSExportSettingFromField returns [EObject current=null] : iv_ruleGSSExportSettingFromField= ruleGSSExportSettingFromField EOF ;
    public final EObject entryRuleGSSExportSettingFromField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSettingFromField = null;


        try {
            // InternalEXPORT.g:1654:66: (iv_ruleGSSExportSettingFromField= ruleGSSExportSettingFromField EOF )
            // InternalEXPORT.g:1655:2: iv_ruleGSSExportSettingFromField= ruleGSSExportSettingFromField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingFromFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSettingFromField=ruleGSSExportSettingFromField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSettingFromField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSettingFromField"


    // $ANTLR start "ruleGSSExportSettingFromField"
    // InternalEXPORT.g:1661:1: ruleGSSExportSettingFromField returns [EObject current=null] : (otherlv_0= 'GSSExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSExportSettingFromField() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalEXPORT.g:1667:2: ( (otherlv_0= 'GSSExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:1668:2: (otherlv_0= 'GSSExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:1668:2: (otherlv_0= 'GSSExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:1669:3: otherlv_0= 'GSSExportSettingFromField' otherlv_1= '{' otherlv_2= 'fieldRef' otherlv_3= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingFromFieldAccess().getGSSExportSettingFromFieldKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingFromFieldAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1685:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1686:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1686:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1687:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingFromFieldAccess().getFieldRefGSSFormatFieldCrossReference_4_0());
              				
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

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingFromFieldAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1716:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1717:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1717:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1718:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingFromFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingFromFieldAccess().getToFieldRefGSSFormatFieldCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingFromFieldAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingFromFieldAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSettingFromField"


    // $ANTLR start "entryRuleGSSExportSettingAIFromConst"
    // InternalEXPORT.g:1751:1: entryRuleGSSExportSettingAIFromConst returns [EObject current=null] : iv_ruleGSSExportSettingAIFromConst= ruleGSSExportSettingAIFromConst EOF ;
    public final EObject entryRuleGSSExportSettingAIFromConst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSettingAIFromConst = null;


        try {
            // InternalEXPORT.g:1751:68: (iv_ruleGSSExportSettingAIFromConst= ruleGSSExportSettingAIFromConst EOF )
            // InternalEXPORT.g:1752:2: iv_ruleGSSExportSettingAIFromConst= ruleGSSExportSettingAIFromConst EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingAIFromConstRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSettingAIFromConst=ruleGSSExportSettingAIFromConst();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSettingAIFromConst; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSettingAIFromConst"


    // $ANTLR start "ruleGSSExportSettingAIFromConst"
    // InternalEXPORT.g:1758:1: ruleGSSExportSettingAIFromConst returns [EObject current=null] : (otherlv_0= 'GSSExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSExportSettingAIFromConst() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_toArrayIndex_12_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1764:2: ( (otherlv_0= 'GSSExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' ) )
            // InternalEXPORT.g:1765:2: (otherlv_0= 'GSSExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalEXPORT.g:1765:2: (otherlv_0= 'GSSExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';' )
            // InternalEXPORT.g:1766:3: otherlv_0= 'GSSExportSettingAIFromConst' otherlv_1= '{' otherlv_2= 'value' otherlv_3= ':=' ( (lv_value_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingAIFromConstAccess().getGSSExportSettingAIFromConstKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingAIFromConstAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingAIFromConstAccess().getValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1782:3: ( (lv_value_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:1783:4: (lv_value_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1783:4: (lv_value_4_0= ruleINTEGER )
            // InternalEXPORT.g:1784:5: lv_value_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingAIFromConstAccess().getValueINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_value_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromConstRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_4_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1813:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1814:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1814:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1815:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingAIFromConstRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingAIFromConstAccess().getToFieldRefGSSFormatAIFieldCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingAIFromConstAccess().getToArrayIndexKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingAIFromConstAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalEXPORT.g:1844:3: ( (lv_toArrayIndex_12_0= ruleINTEGER ) )
            // InternalEXPORT.g:1845:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1845:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            // InternalEXPORT.g:1846:5: lv_toArrayIndex_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingAIFromConstAccess().getToArrayIndexINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_toArrayIndex_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromConstRule());
              					}
              					set(
              						current,
              						"toArrayIndex",
              						lv_toArrayIndex_12_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSExportSettingAIFromConstAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSExportSettingAIFromConstAccess().getSemicolonKeyword_15());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSettingAIFromConst"


    // $ANTLR start "entryRuleGSSExportSettingAIFromFile"
    // InternalEXPORT.g:1879:1: entryRuleGSSExportSettingAIFromFile returns [EObject current=null] : iv_ruleGSSExportSettingAIFromFile= ruleGSSExportSettingAIFromFile EOF ;
    public final EObject entryRuleGSSExportSettingAIFromFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportSettingAIFromFile = null;


        try {
            // InternalEXPORT.g:1879:67: (iv_ruleGSSExportSettingAIFromFile= ruleGSSExportSettingAIFromFile EOF )
            // InternalEXPORT.g:1880:2: iv_ruleGSSExportSettingAIFromFile= ruleGSSExportSettingAIFromFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportSettingAIFromFile=ruleGSSExportSettingAIFromFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportSettingAIFromFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportSettingAIFromFile"


    // $ANTLR start "ruleGSSExportSettingAIFromFile"
    // InternalEXPORT.g:1886:1: ruleGSSExportSettingAIFromFile returns [EObject current=null] : (otherlv_0= 'GSSExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' ) ;
    public final EObject ruleGSSExportSettingAIFromFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_file_4_0=null;
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
        AntlrDatatypeRuleToken lv_toArrayIndex_12_0 = null;

        AntlrDatatypeRuleToken lv_offset_16_0 = null;

        AntlrDatatypeRuleToken lv_size_20_0 = null;

        AntlrDatatypeRuleToken lv_line_24_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:1892:2: ( (otherlv_0= 'GSSExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' ) )
            // InternalEXPORT.g:1893:2: (otherlv_0= 'GSSExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' )
            {
            // InternalEXPORT.g:1893:2: (otherlv_0= 'GSSExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';' )
            // InternalEXPORT.g:1894:3: otherlv_0= 'GSSExportSettingAIFromFile' otherlv_1= '{' otherlv_2= 'file' otherlv_3= ':=' ( (lv_file_4_0= RULE_ID ) ) otherlv_5= ';' otherlv_6= 'toFieldRef' otherlv_7= ':=' ( ( ruleVersionedQualifiedReferenceName ) ) otherlv_9= ';' otherlv_10= 'toArrayIndex' otherlv_11= ':=' ( (lv_toArrayIndex_12_0= ruleINTEGER ) ) otherlv_13= ';' (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )? (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )? (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )? otherlv_26= '}' otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportSettingAIFromFileAccess().getGSSExportSettingAIFromFileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportSettingAIFromFileAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportSettingAIFromFileAccess().getFileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:1910:3: ( (lv_file_4_0= RULE_ID ) )
            // InternalEXPORT.g:1911:4: (lv_file_4_0= RULE_ID )
            {
            // InternalEXPORT.g:1911:4: (lv_file_4_0= RULE_ID )
            // InternalEXPORT.g:1912:5: lv_file_4_0= RULE_ID
            {
            lv_file_4_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_file_4_0, grammarAccess.getGSSExportSettingAIFromFileAccess().getFileIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingAIFromFileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"file",
              						lv_file_4_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:1940:3: ( ( ruleVersionedQualifiedReferenceName ) )
            // InternalEXPORT.g:1941:4: ( ruleVersionedQualifiedReferenceName )
            {
            // InternalEXPORT.g:1941:4: ( ruleVersionedQualifiedReferenceName )
            // InternalEXPORT.g:1942:5: ruleVersionedQualifiedReferenceName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportSettingAIFromFileRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getToFieldRefGSSFormatAIFieldCrossReference_8_0());
              				
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

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,45,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalEXPORT.g:1971:3: ( (lv_toArrayIndex_12_0= ruleINTEGER ) )
            // InternalEXPORT.g:1972:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            {
            // InternalEXPORT.g:1972:4: (lv_toArrayIndex_12_0= ruleINTEGER )
            // InternalEXPORT.g:1973:5: lv_toArrayIndex_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getToArrayIndexINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_toArrayIndex_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
              					}
              					set(
              						current,
              						"toArrayIndex",
              						lv_toArrayIndex_12_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_13());
              		
            }
            // InternalEXPORT.g:1994:3: (otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEXPORT.g:1995:4: otherlv_14= 'offset' otherlv_15= ':=' ( (lv_offset_16_0= ruleINTEGER ) ) otherlv_17= ';'
                    {
                    otherlv_14=(Token)match(input,40,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetKeyword_14_0());
                      			
                    }
                    otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_14_1());
                      			
                    }
                    // InternalEXPORT.g:2003:4: ( (lv_offset_16_0= ruleINTEGER ) )
                    // InternalEXPORT.g:2004:5: (lv_offset_16_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:2004:5: (lv_offset_16_0= ruleINTEGER )
                    // InternalEXPORT.g:2005:6: lv_offset_16_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getOffsetINTEGERParserRuleCall_14_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_offset_16_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
                      						}
                      						set(
                      							current,
                      							"offset",
                      							lv_offset_16_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,14,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_14_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:2027:3: (otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEXPORT.g:2028:4: otherlv_18= 'size' otherlv_19= ':=' ( (lv_size_20_0= ruleINTEGER ) ) otherlv_21= ';'
                    {
                    otherlv_18=(Token)match(input,41,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeKeyword_15_0());
                      			
                    }
                    otherlv_19=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_15_1());
                      			
                    }
                    // InternalEXPORT.g:2036:4: ( (lv_size_20_0= ruleINTEGER ) )
                    // InternalEXPORT.g:2037:5: (lv_size_20_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:2037:5: (lv_size_20_0= ruleINTEGER )
                    // InternalEXPORT.g:2038:6: lv_size_20_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getSizeINTEGERParserRuleCall_15_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_size_20_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
                      						}
                      						set(
                      							current,
                      							"size",
                      							lv_size_20_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,14,FollowSets000.FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_15_3());
                      			
                    }

                    }
                    break;

            }

            // InternalEXPORT.g:2060:3: (otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEXPORT.g:2061:4: otherlv_22= 'line' otherlv_23= ':=' ( (lv_line_24_0= ruleINTEGER ) ) otherlv_25= ';'
                    {
                    otherlv_22=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getGSSExportSettingAIFromFileAccess().getLineKeyword_16_0());
                      			
                    }
                    otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getGSSExportSettingAIFromFileAccess().getColonEqualsSignKeyword_16_1());
                      			
                    }
                    // InternalEXPORT.g:2069:4: ( (lv_line_24_0= ruleINTEGER ) )
                    // InternalEXPORT.g:2070:5: (lv_line_24_0= ruleINTEGER )
                    {
                    // InternalEXPORT.g:2070:5: (lv_line_24_0= ruleINTEGER )
                    // InternalEXPORT.g:2071:6: lv_line_24_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGSSExportSettingAIFromFileAccess().getLineINTEGERParserRuleCall_16_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_6);
                    lv_line_24_0=ruleINTEGER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGSSExportSettingAIFromFileRule());
                      						}
                      						set(
                      							current,
                      							"line",
                      							lv_line_24_0,
                      							"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_25=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_16_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_26=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSExportSettingAIFromFileAccess().getRightCurlyBracketKeyword_17());
              		
            }
            otherlv_27=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSExportSettingAIFromFileAccess().getSemicolonKeyword_18());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportSettingAIFromFile"


    // $ANTLR start "entryRuleGSSExportActivateDICs"
    // InternalEXPORT.g:2105:1: entryRuleGSSExportActivateDICs returns [EObject current=null] : iv_ruleGSSExportActivateDICs= ruleGSSExportActivateDICs EOF ;
    public final EObject entryRuleGSSExportActivateDICs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportActivateDICs = null;


        try {
            // InternalEXPORT.g:2105:62: (iv_ruleGSSExportActivateDICs= ruleGSSExportActivateDICs EOF )
            // InternalEXPORT.g:2106:2: iv_ruleGSSExportActivateDICs= ruleGSSExportActivateDICs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportActivateDICsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportActivateDICs=ruleGSSExportActivateDICs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportActivateDICs; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportActivateDICs"


    // $ANTLR start "ruleGSSExportActivateDICs"
    // InternalEXPORT.g:2112:1: ruleGSSExportActivateDICs returns [EObject current=null] : ( () otherlv_1= 'GSSExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleGSSExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' ) ;
    public final EObject ruleGSSExportActivateDICs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_DIC_3_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2118:2: ( ( () otherlv_1= 'GSSExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleGSSExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' ) )
            // InternalEXPORT.g:2119:2: ( () otherlv_1= 'GSSExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleGSSExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' )
            {
            // InternalEXPORT.g:2119:2: ( () otherlv_1= 'GSSExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleGSSExportDIC ) )+ otherlv_4= '}' otherlv_5= ';' )
            // InternalEXPORT.g:2120:3: () otherlv_1= 'GSSExportActivateDICs' otherlv_2= '{' ( (lv_DIC_3_0= ruleGSSExportDIC ) )+ otherlv_4= '}' otherlv_5= ';'
            {
            // InternalEXPORT.g:2120:3: ()
            // InternalEXPORT.g:2121:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportActivateDICsAccess().getGSSExportActivateDICsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportActivateDICsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEXPORT.g:2138:3: ( (lv_DIC_3_0= ruleGSSExportDIC ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEXPORT.g:2139:4: (lv_DIC_3_0= ruleGSSExportDIC )
            	    {
            	    // InternalEXPORT.g:2139:4: (lv_DIC_3_0= ruleGSSExportDIC )
            	    // InternalEXPORT.g:2140:5: lv_DIC_3_0= ruleGSSExportDIC
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSExportActivateDICsAccess().getDICGSSExportDICParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    lv_DIC_3_0=ruleGSSExportDIC();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSExportActivateDICsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"DIC",
            	      						lv_DIC_3_0,
            	      						"es.uah.aut.srg.gss.lang.export.EXPORT.GSSExportDIC");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_4=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSExportActivateDICsAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportActivateDICsAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportActivateDICs"


    // $ANTLR start "entryRuleGSSExportDIC"
    // InternalEXPORT.g:2169:1: entryRuleGSSExportDIC returns [EObject current=null] : iv_ruleGSSExportDIC= ruleGSSExportDIC EOF ;
    public final EObject entryRuleGSSExportDIC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSExportDIC = null;


        try {
            // InternalEXPORT.g:2169:53: (iv_ruleGSSExportDIC= ruleGSSExportDIC EOF )
            // InternalEXPORT.g:2170:2: iv_ruleGSSExportDIC= ruleGSSExportDIC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSExportDICRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSExportDIC=ruleGSSExportDIC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSExportDIC; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSExportDIC"


    // $ANTLR start "ruleGSSExportDIC"
    // InternalEXPORT.g:2176:1: ruleGSSExportDIC returns [EObject current=null] : (otherlv_0= 'GSSExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSExportDIC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_DICRef_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2182:2: ( (otherlv_0= 'GSSExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalEXPORT.g:2183:2: (otherlv_0= 'GSSExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalEXPORT.g:2183:2: (otherlv_0= 'GSSExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalEXPORT.g:2184:3: otherlv_0= 'GSSExportDIC' otherlv_1= '{' otherlv_2= 'id' otherlv_3= ':=' ( (lv_id_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'DICRef' otherlv_7= ':=' ( (lv_DICRef_8_0= RULE_ID ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSExportDICAccess().getGSSExportDICKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSExportDICAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSExportDICAccess().getIdKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalEXPORT.g:2200:3: ( (lv_id_4_0= ruleINTEGER ) )
            // InternalEXPORT.g:2201:4: (lv_id_4_0= ruleINTEGER )
            {
            // InternalEXPORT.g:2201:4: (lv_id_4_0= ruleINTEGER )
            // InternalEXPORT.g:2202:5: lv_id_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSExportDICAccess().getIdINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_6);
            lv_id_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSExportDICRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_4_0,
              						"es.uah.aut.srg.gss.lang.export.EXPORT.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,49,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSExportDICAccess().getDICRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSExportDICAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalEXPORT.g:2231:3: ( (lv_DICRef_8_0= RULE_ID ) )
            // InternalEXPORT.g:2232:4: (lv_DICRef_8_0= RULE_ID )
            {
            // InternalEXPORT.g:2232:4: (lv_DICRef_8_0= RULE_ID )
            // InternalEXPORT.g:2233:5: lv_DICRef_8_0= RULE_ID
            {
            lv_DICRef_8_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_DICRef_8_0, grammarAccess.getGSSExportDICAccess().getDICRefIDTerminalRuleCall_8_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSExportDICRule());
              					}
              					setWithLastConsumed(
              						current,
              						"DICRef",
              						lv_DICRef_8_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSExportDICAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSExportDICAccess().getSemicolonKeyword_11());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSExportDIC"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEXPORT.g:2265:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEXPORT.g:2265:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEXPORT.g:2266:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalEXPORT.g:2272:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEXPORT.g:2278:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEXPORT.g:2279:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEXPORT.g:2279:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEXPORT.g:2280:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalEXPORT.g:2287:3: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==50) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEXPORT.g:2288:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalEXPORT.g:2305:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalEXPORT.g:2305:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalEXPORT.g:2306:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalEXPORT.g:2312:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalEXPORT.g:2318:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalEXPORT.g:2319:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalEXPORT.g:2319:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalEXPORT.g:2320:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalEXPORT.g:2320:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||LA25_1==14||LA25_1==50||LA25_1==52) ) {
                    alt25=1;
                }
                else if ( (LA25_1==RULE_ID) ) {
                    alt25=2;
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
                    // InternalEXPORT.g:2321:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:2329:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalEXPORT.g:2329:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalEXPORT.g:2330:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalEXPORT.g:2330:5: (this_INT_1= RULE_INT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_INT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalEXPORT.g:2331:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
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

            // InternalEXPORT.g:2348:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==50) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEXPORT.g:2349:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalEXPORT.g:2354:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==RULE_INT) ) {
            	        int LA27_1 = input.LA(2);

            	        if ( (LA27_1==EOF||LA27_1==14||LA27_1==50||LA27_1==52) ) {
            	            alt27=1;
            	        }
            	        else if ( (LA27_1==RULE_ID) ) {
            	            alt27=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 27, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA27_0==RULE_ID) ) {
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
            	            // InternalEXPORT.g:2355:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_40); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEXPORT.g:2363:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalEXPORT.g:2363:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalEXPORT.g:2364:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalEXPORT.g:2364:6: (this_INT_5= RULE_INT )?
            	            int alt26=2;
            	            int LA26_0 = input.LA(1);

            	            if ( (LA26_0==RULE_INT) ) {
            	                alt26=1;
            	            }
            	            switch (alt26) {
            	                case 1 :
            	                    // InternalEXPORT.g:2365:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_40); if (state.failed) return current;
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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleVersionedQualifiedName"
    // InternalEXPORT.g:2387:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalEXPORT.g:2387:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalEXPORT.g:2388:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalEXPORT.g:2394:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2400:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalEXPORT.g:2401:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalEXPORT.g:2401:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalEXPORT.g:2402:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
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
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalEXPORT.g:2436:1: entryRuleVersionedQualifiedReferenceName returns [String current=null] : iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF ;
    public final String entryRuleVersionedQualifiedReferenceName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedReferenceName = null;


        try {
            // InternalEXPORT.g:2436:71: (iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF )
            // InternalEXPORT.g:2437:2: iv_ruleVersionedQualifiedReferenceName= ruleVersionedQualifiedReferenceName EOF
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
    // InternalEXPORT.g:2443:1: ruleVersionedQualifiedReferenceName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedReferenceName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;
        AntlrDatatypeRuleToken this_VersionedQualifiedName_0 = null;



        	enterRule();

        try {
            // InternalEXPORT.g:2449:2: ( ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* ) )
            // InternalEXPORT.g:2450:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            {
            // InternalEXPORT.g:2450:2: ( (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )* )
            // InternalEXPORT.g:2451:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )? this_ID_2= RULE_ID (kw= '::' this_ID_4= RULE_ID )*
            {
            // InternalEXPORT.g:2451:3: (this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1>=50 && LA29_1<=51)) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalEXPORT.g:2452:4: this_VersionedQualifiedName_0= ruleVersionedQualifiedName kw= '::'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getVersionedQualifiedReferenceNameAccess().getVersionedQualifiedNameParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_43);
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

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_2, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_1());
              		
            }
            // InternalEXPORT.g:2475:3: (kw= '::' this_ID_4= RULE_ID )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==53) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEXPORT.g:2476:4: kw= '::' this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,53,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionedQualifiedReferenceNameAccess().getColonColonKeyword_2_0());
            	      			
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_4, grammarAccess.getVersionedQualifiedReferenceNameAccess().getIDTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalEXPORT.g:2493:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalEXPORT.g:2493:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalEXPORT.g:2494:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalEXPORT.g:2500:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalEXPORT.g:2506:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalEXPORT.g:2507:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalEXPORT.g:2507:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT||LA32_0==54) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_HEXADECIMAL) ) {
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
                    // InternalEXPORT.g:2508:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalEXPORT.g:2508:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalEXPORT.g:2509:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalEXPORT.g:2509:4: (kw= '-' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==54) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalEXPORT.g:2510:5: kw= '-'
                            {
                            kw=(Token)match(input,54,FollowSets000.FOLLOW_45); if (state.failed) return current;
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
                    // InternalEXPORT.g:2525:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleGSSExportUnit"
    // InternalEXPORT.g:2536:1: ruleGSSExportUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) ) ;
    public final Enumerator ruleGSSExportUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEXPORT.g:2542:2: ( ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) ) )
            // InternalEXPORT.g:2543:2: ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) )
            {
            // InternalEXPORT.g:2543:2: ( (enumLiteral_0= 'bits' ) | (enumLiteral_1= 'bytes' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            else if ( (LA33_0==56) ) {
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
                    // InternalEXPORT.g:2544:3: (enumLiteral_0= 'bits' )
                    {
                    // InternalEXPORT.g:2544:3: (enumLiteral_0= 'bits' )
                    // InternalEXPORT.g:2545:4: enumLiteral_0= 'bits'
                    {
                    enumLiteral_0=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSExportUnitAccess().getBitsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSExportUnitAccess().getBitsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEXPORT.g:2552:3: (enumLiteral_1= 'bytes' )
                    {
                    // InternalEXPORT.g:2552:3: (enumLiteral_1= 'bytes' )
                    // InternalEXPORT.g:2553:4: enumLiteral_1= 'bytes'
                    {
                    enumLiteral_1=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSExportUnitAccess().getBytesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSExportUnitAccess().getBytesEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSExportUnit"

    // $ANTLR start synpred2_InternalEXPORT
    public final void synpred2_InternalEXPORT_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalEXPORT.g:243:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalEXPORT.g:243:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalEXPORT.g:244:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalEXPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalEXPORT.g:244:112: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalEXPORT.g:245:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 0);
        // InternalEXPORT.g:248:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalEXPORT.g:248:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalEXPORT", "true");
        }
        // InternalEXPORT.g:248:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalEXPORT.g:248:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_7); if (state.failed) return ;
        // InternalEXPORT.g:256:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalEXPORT.g:257:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalEXPORT.g:258:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSExportExportAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred2_InternalEXPORT

    // $ANTLR start synpred3_InternalEXPORT
    public final void synpred3_InternalEXPORT_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalEXPORT.g:285:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalEXPORT.g:285:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalEXPORT.g:286:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalEXPORT", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalEXPORT.g:286:112: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalEXPORT.g:287:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSExportExportAccess().getUnorderedGroup_3(), 1);
        // InternalEXPORT.g:290:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalEXPORT.g:290:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalEXPORT", "true");
        }
        // InternalEXPORT.g:290:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalEXPORT.g:290:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_4); if (state.failed) return ;
        otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalEXPORT.g:298:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
        {
        // InternalEXPORT.g:299:10: (lv_version_10_0= ruleVersion )
        // InternalEXPORT.g:300:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSExportExportAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
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
    // $ANTLR end synpred3_InternalEXPORT

    // Delegated rules

    public final boolean synpred2_InternalEXPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEXPORT_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalEXPORT() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalEXPORT_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100020L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100800000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000800000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000A1000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000A1400000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00400000000000C0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018400000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010400000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0180000000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000545200400000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030040400000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020040400000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000400000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0020000000000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000040L});
    }


}