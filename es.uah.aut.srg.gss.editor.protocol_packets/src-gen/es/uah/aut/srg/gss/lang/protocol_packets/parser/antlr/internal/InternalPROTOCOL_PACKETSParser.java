package es.uah.aut.srg.gss.lang.protocol_packets.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uah.aut.srg.gss.lang.protocol_packets.services.PROTOCOL_PACKETSGrammarAccess;



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
public class InternalPROTOCOL_PACKETSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HEXADECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'GSSProtocolPacketsProtocolPackets'", "'{'", "'uri'", "':='", "'version'", "'}'", "'GSSProtocolPacketsProtocolPacket'", "'name'", "'ifRef'", "'levelRef'", "'export'", "'format'", "'.'", "'('", "')'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
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


        public InternalPROTOCOL_PACKETSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPROTOCOL_PACKETSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPROTOCOL_PACKETSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPROTOCOL_PACKETS.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private PROTOCOL_PACKETSGrammarAccess grammarAccess;

        public InternalPROTOCOL_PACKETSParser(TokenStream input, PROTOCOL_PACKETSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected PROTOCOL_PACKETSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalPROTOCOL_PACKETS.g:78:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalPROTOCOL_PACKETS.g:78:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalPROTOCOL_PACKETS.g:79:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalPROTOCOL_PACKETS.g:85:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalPROTOCOL_PACKETS.g:91:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets ) ) ) )
            // InternalPROTOCOL_PACKETS.g:92:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets ) ) )
            {
            // InternalPROTOCOL_PACKETS.g:92:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets ) ) )
            // InternalPROTOCOL_PACKETS.g:93:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets ) )
            {
            // InternalPROTOCOL_PACKETS.g:93:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:94:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalPROTOCOL_PACKETS.g:94:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalPROTOCOL_PACKETS.g:95:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPROTOCOL_PACKETS.g:112:3: ( (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets ) )
            // InternalPROTOCOL_PACKETS.g:113:4: (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets )
            {
            // InternalPROTOCOL_PACKETS.g:113:4: (lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets )
            // InternalPROTOCOL_PACKETS.g:114:5: lv_element_1_0= ruleGSSProtocolPacketsProtocolPackets
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSProtocolPacketsProtocolPacketsParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSProtocolPacketsProtocolPackets();

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
              						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.GSSProtocolPacketsProtocolPackets");
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
    // InternalPROTOCOL_PACKETS.g:135:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalPROTOCOL_PACKETS.g:135:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalPROTOCOL_PACKETS.g:136:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalPROTOCOL_PACKETS.g:142:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPROTOCOL_PACKETS.g:148:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalPROTOCOL_PACKETS.g:149:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalPROTOCOL_PACKETS.g:149:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalPROTOCOL_PACKETS.g:150:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            // InternalPROTOCOL_PACKETS.g:154:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalPROTOCOL_PACKETS.g:155:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalPROTOCOL_PACKETS.g:155:4: (lv_importURI_1_0= RULE_STRING )
            // InternalPROTOCOL_PACKETS.g:156:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_importURI_1_0, grammarAccess.getGSSModelFileImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSModelFileImportRule());
              					}
              					setWithLastConsumed(
              						current,
              						"importURI",
              						lv_importURI_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSModelFileImportAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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


    // $ANTLR start "entryRuleGSSProtocolPacketsProtocolPackets"
    // InternalPROTOCOL_PACKETS.g:180:1: entryRuleGSSProtocolPacketsProtocolPackets returns [EObject current=null] : iv_ruleGSSProtocolPacketsProtocolPackets= ruleGSSProtocolPacketsProtocolPackets EOF ;
    public final EObject entryRuleGSSProtocolPacketsProtocolPackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSProtocolPacketsProtocolPackets = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalPROTOCOL_PACKETS.g:184:2: (iv_ruleGSSProtocolPacketsProtocolPackets= ruleGSSProtocolPacketsProtocolPackets EOF )
            // InternalPROTOCOL_PACKETS.g:185:2: iv_ruleGSSProtocolPacketsProtocolPackets= ruleGSSProtocolPacketsProtocolPackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSProtocolPacketsProtocolPackets=ruleGSSProtocolPacketsProtocolPackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSProtocolPacketsProtocolPackets; 
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
    // $ANTLR end "entryRuleGSSProtocolPacketsProtocolPackets"


    // $ANTLR start "ruleGSSProtocolPacketsProtocolPackets"
    // InternalPROTOCOL_PACKETS.g:194:1: ruleGSSProtocolPacketsProtocolPackets returns [EObject current=null] : (otherlv_0= 'GSSProtocolPacketsProtocolPackets' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket ) )+ otherlv_13= '}' otherlv_14= ';' ) ;
    public final EObject ruleGSSProtocolPacketsProtocolPackets() throws RecognitionException {
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;

        AntlrDatatypeRuleToken lv_version_10_0 = null;

        EObject lv_ProtocolPacket_12_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalPROTOCOL_PACKETS.g:203:2: ( (otherlv_0= 'GSSProtocolPacketsProtocolPackets' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket ) )+ otherlv_13= '}' otherlv_14= ';' ) )
            // InternalPROTOCOL_PACKETS.g:204:2: (otherlv_0= 'GSSProtocolPacketsProtocolPackets' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket ) )+ otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalPROTOCOL_PACKETS.g:204:2: (otherlv_0= 'GSSProtocolPacketsProtocolPackets' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket ) )+ otherlv_13= '}' otherlv_14= ';' )
            // InternalPROTOCOL_PACKETS.g:205:3: otherlv_0= 'GSSProtocolPacketsProtocolPackets' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket ) )+ otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getGSSProtocolPacketsProtocolPacketsKeyword_0());
              		
            }
            // InternalPROTOCOL_PACKETS.g:209:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPROTOCOL_PACKETS.g:210:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPROTOCOL_PACKETS.g:210:4: (lv_name_1_0= RULE_ID )
            // InternalPROTOCOL_PACKETS.g:211:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalPROTOCOL_PACKETS.g:231:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) )
            // InternalPROTOCOL_PACKETS.g:232:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalPROTOCOL_PACKETS.g:232:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            // InternalPROTOCOL_PACKETS.g:233:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());
            // InternalPROTOCOL_PACKETS.g:236:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            // InternalPROTOCOL_PACKETS.g:237:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?
            {
            // InternalPROTOCOL_PACKETS.g:237:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:238:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalPROTOCOL_PACKETS.g:238:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalPROTOCOL_PACKETS.g:239:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSProtocolPacketsProtocolPackets", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalPROTOCOL_PACKETS.g:239:130: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalPROTOCOL_PACKETS.g:240:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
            	    // InternalPROTOCOL_PACKETS.g:243:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalPROTOCOL_PACKETS.g:243:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSProtocolPacketsProtocolPackets", "true");
            	    }
            	    // InternalPROTOCOL_PACKETS.g:243:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalPROTOCOL_PACKETS.g:243:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalPROTOCOL_PACKETS.g:251:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalPROTOCOL_PACKETS.g:252:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalPROTOCOL_PACKETS.g:252:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalPROTOCOL_PACKETS.g:253:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPROTOCOL_PACKETS.g:280:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalPROTOCOL_PACKETS.g:280:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalPROTOCOL_PACKETS.g:281:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSProtocolPacketsProtocolPackets", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalPROTOCOL_PACKETS.g:281:130: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalPROTOCOL_PACKETS.g:282:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1);
            	    // InternalPROTOCOL_PACKETS.g:285:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalPROTOCOL_PACKETS.g:285:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSProtocolPacketsProtocolPackets", "true");
            	    }
            	    // InternalPROTOCOL_PACKETS.g:285:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalPROTOCOL_PACKETS.g:285:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalPROTOCOL_PACKETS.g:293:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalPROTOCOL_PACKETS.g:294:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalPROTOCOL_PACKETS.g:294:10: (lv_version_10_0= ruleVersion )
            	    // InternalPROTOCOL_PACKETS.g:295:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSProtocolPacketsProtocolPackets", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3());

            }

            // InternalPROTOCOL_PACKETS.g:330:3: ( (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:331:4: (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket )
            	    {
            	    // InternalPROTOCOL_PACKETS.g:331:4: (lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket )
            	    // InternalPROTOCOL_PACKETS.g:332:5: lv_ProtocolPacket_12_0= ruleGSSProtocolPacketsProtocolPacket
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getProtocolPacketGSSProtocolPacketsProtocolPacketParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    lv_ProtocolPacket_12_0=ruleGSSProtocolPacketsProtocolPacket();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketsRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ProtocolPacket",
            	      						lv_ProtocolPacket_12_0,
            	      						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.GSSProtocolPacketsProtocolPacket");
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

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

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
    // $ANTLR end "ruleGSSProtocolPacketsProtocolPackets"


    // $ANTLR start "entryRuleGSSProtocolPacketsProtocolPacket"
    // InternalPROTOCOL_PACKETS.g:364:1: entryRuleGSSProtocolPacketsProtocolPacket returns [EObject current=null] : iv_ruleGSSProtocolPacketsProtocolPacket= ruleGSSProtocolPacketsProtocolPacket EOF ;
    public final EObject entryRuleGSSProtocolPacketsProtocolPacket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSProtocolPacketsProtocolPacket = null;


        try {
            // InternalPROTOCOL_PACKETS.g:364:73: (iv_ruleGSSProtocolPacketsProtocolPacket= ruleGSSProtocolPacketsProtocolPacket EOF )
            // InternalPROTOCOL_PACKETS.g:365:2: iv_ruleGSSProtocolPacketsProtocolPacket= ruleGSSProtocolPacketsProtocolPacket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSProtocolPacketsProtocolPacket=ruleGSSProtocolPacketsProtocolPacket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSProtocolPacketsProtocolPacket; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSProtocolPacketsProtocolPacket"


    // $ANTLR start "ruleGSSProtocolPacketsProtocolPacket"
    // InternalPROTOCOL_PACKETS.g:371:1: ruleGSSProtocolPacketsProtocolPacket returns [EObject current=null] : (otherlv_0= 'GSSProtocolPacketsProtocolPacket' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'levelRef' otherlv_11= ':=' ( (lv_levelRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'export' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'format' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) ;
    public final EObject ruleGSSProtocolPacketsProtocolPacket() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_ifRef_8_0 = null;

        AntlrDatatypeRuleToken lv_levelRef_12_0 = null;



        	enterRule();

        try {
            // InternalPROTOCOL_PACKETS.g:377:2: ( (otherlv_0= 'GSSProtocolPacketsProtocolPacket' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'levelRef' otherlv_11= ':=' ( (lv_levelRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'export' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'format' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' ) )
            // InternalPROTOCOL_PACKETS.g:378:2: (otherlv_0= 'GSSProtocolPacketsProtocolPacket' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'levelRef' otherlv_11= ':=' ( (lv_levelRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'export' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'format' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            {
            // InternalPROTOCOL_PACKETS.g:378:2: (otherlv_0= 'GSSProtocolPacketsProtocolPacket' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'levelRef' otherlv_11= ':=' ( (lv_levelRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'export' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'format' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';' )
            // InternalPROTOCOL_PACKETS.g:379:3: otherlv_0= 'GSSProtocolPacketsProtocolPacket' otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':=' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'ifRef' otherlv_7= ':=' ( (lv_ifRef_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'levelRef' otherlv_11= ':=' ( (lv_levelRef_12_0= ruleINTEGER ) ) otherlv_13= ';' otherlv_14= 'export' otherlv_15= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_17= ';' otherlv_18= 'format' otherlv_19= ':=' ( ( ruleVersionedQualifiedName ) ) otherlv_21= ';' otherlv_22= '}' otherlv_23= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getGSSProtocolPacketsProtocolPacketKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalPROTOCOL_PACKETS.g:395:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalPROTOCOL_PACKETS.g:396:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalPROTOCOL_PACKETS.g:396:4: (lv_name_4_0= RULE_STRING )
            // InternalPROTOCOL_PACKETS.g:397:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getNameSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalPROTOCOL_PACKETS.g:425:3: ( (lv_ifRef_8_0= ruleINTEGER ) )
            // InternalPROTOCOL_PACKETS.g:426:4: (lv_ifRef_8_0= ruleINTEGER )
            {
            // InternalPROTOCOL_PACKETS.g:426:4: (lv_ifRef_8_0= ruleINTEGER )
            // InternalPROTOCOL_PACKETS.g:427:5: lv_ifRef_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getIfRefINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_ifRef_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
              					}
              					set(
              						current,
              						"ifRef",
              						lv_ifRef_8_0,
              						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalPROTOCOL_PACKETS.g:456:3: ( (lv_levelRef_12_0= ruleINTEGER ) )
            // InternalPROTOCOL_PACKETS.g:457:4: (lv_levelRef_12_0= ruleINTEGER )
            {
            // InternalPROTOCOL_PACKETS.g:457:4: (lv_levelRef_12_0= ruleINTEGER )
            // InternalPROTOCOL_PACKETS.g:458:5: lv_levelRef_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getLevelRefINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_levelRef_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
              					}
              					set(
              						current,
              						"levelRef",
              						lv_levelRef_12_0,
              						"es.uah.aut.srg.gss.lang.protocol_packets.PROTOCOL_PACKETS.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,24,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalPROTOCOL_PACKETS.g:487:3: ( ( ruleVersionedQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:488:4: ( ruleVersionedQualifiedName )
            {
            // InternalPROTOCOL_PACKETS.g:488:4: ( ruleVersionedQualifiedName )
            // InternalPROTOCOL_PACKETS.g:489:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getExportTMTCIFExportExportCrossReference_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalPROTOCOL_PACKETS.g:518:3: ( ( ruleVersionedQualifiedName ) )
            // InternalPROTOCOL_PACKETS.g:519:4: ( ruleVersionedQualifiedName )
            {
            // InternalPROTOCOL_PACKETS.g:519:4: ( ruleVersionedQualifiedName )
            // InternalPROTOCOL_PACKETS.g:520:5: ruleVersionedQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSProtocolPacketsProtocolPacketRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getFormatTMTCIFFormatFormatCrossReference_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            ruleVersionedQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getRightCurlyBracketKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSProtocolPacketsProtocolPacketAccess().getSemicolonKeyword_23());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGSSProtocolPacketsProtocolPacket"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPROTOCOL_PACKETS.g:553:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalPROTOCOL_PACKETS.g:553:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalPROTOCOL_PACKETS.g:554:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalPROTOCOL_PACKETS.g:560:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalPROTOCOL_PACKETS.g:566:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalPROTOCOL_PACKETS.g:567:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalPROTOCOL_PACKETS.g:567:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalPROTOCOL_PACKETS.g:568:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalPROTOCOL_PACKETS.g:575:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:576:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalPROTOCOL_PACKETS.g:593:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalPROTOCOL_PACKETS.g:593:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalPROTOCOL_PACKETS.g:594:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalPROTOCOL_PACKETS.g:600:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalPROTOCOL_PACKETS.g:606:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalPROTOCOL_PACKETS.g:607:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalPROTOCOL_PACKETS.g:607:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalPROTOCOL_PACKETS.g:608:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalPROTOCOL_PACKETS.g:608:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF||LA6_1==13||LA6_1==26||LA6_1==28) ) {
                    alt6=1;
                }
                else if ( (LA6_1==RULE_ID) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:609:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalPROTOCOL_PACKETS.g:617:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalPROTOCOL_PACKETS.g:617:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalPROTOCOL_PACKETS.g:618:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalPROTOCOL_PACKETS.g:618:5: (this_INT_1= RULE_INT )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==RULE_INT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalPROTOCOL_PACKETS.g:619:6: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						current.merge(this_INT_1);
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_INT_1, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_1_0());
                              					
                            }

                            }
                            break;

                    }

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); if (state.failed) return current;
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

            // InternalPROTOCOL_PACKETS.g:636:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPROTOCOL_PACKETS.g:637:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,26,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalPROTOCOL_PACKETS.g:642:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==RULE_INT) ) {
            	        int LA8_1 = input.LA(2);

            	        if ( (LA8_1==EOF||LA8_1==13||LA8_1==26||LA8_1==28) ) {
            	            alt8=1;
            	        }
            	        else if ( (LA8_1==RULE_ID) ) {
            	            alt8=2;
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
            	            // InternalPROTOCOL_PACKETS.g:643:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalPROTOCOL_PACKETS.g:651:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalPROTOCOL_PACKETS.g:651:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalPROTOCOL_PACKETS.g:652:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalPROTOCOL_PACKETS.g:652:6: (this_INT_5= RULE_INT )?
            	            int alt7=2;
            	            int LA7_0 = input.LA(1);

            	            if ( (LA7_0==RULE_INT) ) {
            	                alt7=1;
            	            }
            	            switch (alt7) {
            	                case 1 :
            	                    // InternalPROTOCOL_PACKETS.g:653:7: this_INT_5= RULE_INT
            	                    {
            	                    this_INT_5=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      							current.merge(this_INT_5);
            	                      						
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      							newLeafNode(this_INT_5, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_1_0());
            	                      						
            	                    }

            	                    }
            	                    break;

            	            }

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_20); if (state.failed) return current;
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
            	    break loop9;
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
    // InternalPROTOCOL_PACKETS.g:675:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalPROTOCOL_PACKETS.g:675:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalPROTOCOL_PACKETS.g:676:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalPROTOCOL_PACKETS.g:682:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalPROTOCOL_PACKETS.g:688:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalPROTOCOL_PACKETS.g:689:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalPROTOCOL_PACKETS.g:689:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalPROTOCOL_PACKETS.g:690:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_21);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,27,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getVersionedQualifiedNameAccess().getLeftParenthesisKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getVersionParserRuleCall_2());
              		
            }
            pushFollow(FollowSets000.FOLLOW_22);
            this_Version_2=ruleVersion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_Version_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalPROTOCOL_PACKETS.g:724:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalPROTOCOL_PACKETS.g:724:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalPROTOCOL_PACKETS.g:725:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalPROTOCOL_PACKETS.g:731:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalPROTOCOL_PACKETS.g:737:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalPROTOCOL_PACKETS.g:738:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalPROTOCOL_PACKETS.g:738:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==29) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_HEXADECIMAL) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPROTOCOL_PACKETS.g:739:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalPROTOCOL_PACKETS.g:739:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalPROTOCOL_PACKETS.g:740:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalPROTOCOL_PACKETS.g:740:4: (kw= '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==29) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalPROTOCOL_PACKETS.g:741:5: kw= '-'
                            {
                            kw=(Token)match(input,29,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
                    // InternalPROTOCOL_PACKETS.g:756:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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

    // $ANTLR start synpred2_InternalPROTOCOL_PACKETS
    public final void synpred2_InternalPROTOCOL_PACKETS_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalPROTOCOL_PACKETS.g:238:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalPROTOCOL_PACKETS.g:238:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalPROTOCOL_PACKETS.g:238:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalPROTOCOL_PACKETS.g:239:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalPROTOCOL_PACKETS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalPROTOCOL_PACKETS.g:239:130: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalPROTOCOL_PACKETS.g:240:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 0);
        // InternalPROTOCOL_PACKETS.g:243:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalPROTOCOL_PACKETS.g:243:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalPROTOCOL_PACKETS", "true");
        }
        // InternalPROTOCOL_PACKETS.g:243:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalPROTOCOL_PACKETS.g:243:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return ;
        // InternalPROTOCOL_PACKETS.g:251:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalPROTOCOL_PACKETS.g:252:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalPROTOCOL_PACKETS.g:252:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalPROTOCOL_PACKETS.g:253:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_uri_6_0=ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalPROTOCOL_PACKETS

    // $ANTLR start synpred3_InternalPROTOCOL_PACKETS
    public final void synpred3_InternalPROTOCOL_PACKETS_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalPROTOCOL_PACKETS.g:280:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalPROTOCOL_PACKETS.g:280:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalPROTOCOL_PACKETS.g:280:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalPROTOCOL_PACKETS.g:281:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalPROTOCOL_PACKETS", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalPROTOCOL_PACKETS.g:281:130: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalPROTOCOL_PACKETS.g:282:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getUnorderedGroup_3(), 1);
        // InternalPROTOCOL_PACKETS.g:285:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalPROTOCOL_PACKETS.g:285:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalPROTOCOL_PACKETS", "true");
        }
        // InternalPROTOCOL_PACKETS.g:285:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalPROTOCOL_PACKETS.g:285:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalPROTOCOL_PACKETS.g:293:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalPROTOCOL_PACKETS.g:294:10: (lv_version_10_0= ruleVersion )
        {
        // InternalPROTOCOL_PACKETS.g:294:10: (lv_version_10_0= ruleVersion )
        // InternalPROTOCOL_PACKETS.g:295:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSProtocolPacketsProtocolPacketsAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_version_10_0=ruleVersion();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalPROTOCOL_PACKETS

    // Delegated rules

    public final boolean synpred3_InternalPROTOCOL_PACKETS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalPROTOCOL_PACKETS_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPROTOCOL_PACKETS() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPROTOCOL_PACKETS_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000150000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000200000C0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    }


}