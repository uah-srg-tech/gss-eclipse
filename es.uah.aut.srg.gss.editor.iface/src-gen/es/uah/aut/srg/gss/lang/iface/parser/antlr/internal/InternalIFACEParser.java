package es.uah.aut.srg.gss.lang.iface.parser.antlr.internal;

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
import es.uah.aut.srg.gss.lang.iface.services.IFACEGrammarAccess;



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
public class InternalIFACEParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HEXADECIMAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'portConfig'", "'{'", "'uri'", "':='", "'version'", "'}'", "'spwPort'", "'type'", "'link'", "'writingPort'", "'readingPort'", "'port'", "'uartPort'", "'number'", "'baudRate'", "'parity'", "'dataBits'", "'stopBits'", "'inputQueueSize'", "'outputQueueSize'", "'uartProtocol'", "'unit'", "'power'", "'constSize'", "'bytes'", "'bits'", "'sizeFieldOffset'", "'sizeFieldTrim'", "'syncPattern'", "'hexValue'", "'spwTCPort'", "'spwPortRef'", "'dummyPort'", "'.'", "'('", "')'", "'-'", "'usb'", "'mk2'", "'pci'", "'38400bauds'", "'115200bauds'", "'NO'", "'ODD'", "'EVEN'", "'MARK'", "'SPACE'", "'5bits'", "'6bits'", "'7bits'", "'8bits'", "'1bit'", "'2bits'", "'no'", "'2_with_0'"
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
    public static final int T__68=68;
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


        public InternalIFACEParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIFACEParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIFACEParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIFACE.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private IFACEGrammarAccess grammarAccess;

        public InternalIFACEParser(TokenStream input, IFACEGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GSSModelFile";
       	}

       	@Override
       	protected IFACEGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGSSModelFile"
    // InternalIFACE.g:79:1: entryRuleGSSModelFile returns [EObject current=null] : iv_ruleGSSModelFile= ruleGSSModelFile EOF ;
    public final EObject entryRuleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFile = null;


        try {
            // InternalIFACE.g:79:53: (iv_ruleGSSModelFile= ruleGSSModelFile EOF )
            // InternalIFACE.g:80:2: iv_ruleGSSModelFile= ruleGSSModelFile EOF
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
    // InternalIFACE.g:86:1: ruleGSSModelFile returns [EObject current=null] : ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSIfacePortConfig ) ) ) ;
    public final EObject ruleGSSModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_element_1_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:92:2: ( ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSIfacePortConfig ) ) ) )
            // InternalIFACE.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSIfacePortConfig ) ) )
            {
            // InternalIFACE.g:93:2: ( ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSIfacePortConfig ) ) )
            // InternalIFACE.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )* ( (lv_element_1_0= ruleGSSIfacePortConfig ) )
            {
            // InternalIFACE.g:94:3: ( (lv_imports_0_0= ruleGSSModelFileImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIFACE.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    {
            	    // InternalIFACE.g:95:4: (lv_imports_0_0= ruleGSSModelFileImport )
            	    // InternalIFACE.g:96:5: lv_imports_0_0= ruleGSSModelFileImport
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
            	      						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSModelFileImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalIFACE.g:113:3: ( (lv_element_1_0= ruleGSSIfacePortConfig ) )
            // InternalIFACE.g:114:4: (lv_element_1_0= ruleGSSIfacePortConfig )
            {
            // InternalIFACE.g:114:4: (lv_element_1_0= ruleGSSIfacePortConfig )
            // InternalIFACE.g:115:5: lv_element_1_0= ruleGSSIfacePortConfig
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSModelFileAccess().getElementGSSIfacePortConfigParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_element_1_0=ruleGSSIfacePortConfig();

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
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortConfig");
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
    // InternalIFACE.g:136:1: entryRuleGSSModelFileImport returns [EObject current=null] : iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF ;
    public final EObject entryRuleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSModelFileImport = null;


        try {
            // InternalIFACE.g:136:59: (iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF )
            // InternalIFACE.g:137:2: iv_ruleGSSModelFileImport= ruleGSSModelFileImport EOF
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
    // InternalIFACE.g:143:1: ruleGSSModelFileImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleGSSModelFileImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:149:2: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalIFACE.g:150:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalIFACE.g:150:2: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalIFACE.g:151:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSModelFileImportAccess().getImportKeyword_0());
              		
            }
            // InternalIFACE.g:155:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalIFACE.g:156:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalIFACE.g:156:4: (lv_importURI_1_0= RULE_STRING )
            // InternalIFACE.g:157:5: lv_importURI_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleGSSIfacePortConfig"
    // InternalIFACE.g:181:1: entryRuleGSSIfacePortConfig returns [EObject current=null] : iv_ruleGSSIfacePortConfig= ruleGSSIfacePortConfig EOF ;
    public final EObject entryRuleGSSIfacePortConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfacePortConfig = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalIFACE.g:185:2: (iv_ruleGSSIfacePortConfig= ruleGSSIfacePortConfig EOF )
            // InternalIFACE.g:186:2: iv_ruleGSSIfacePortConfig= ruleGSSIfacePortConfig EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfacePortConfigRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfacePortConfig=ruleGSSIfacePortConfig();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfacePortConfig; 
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
    // $ANTLR end "entryRuleGSSIfacePortConfig"


    // $ANTLR start "ruleGSSIfacePortConfig"
    // InternalIFACE.g:195:1: ruleGSSIfacePortConfig returns [EObject current=null] : (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_portConfig_12_0= ruleGSSIfacePort ) ) otherlv_13= '}' otherlv_14= ';' ) ;
    public final EObject ruleGSSIfacePortConfig() throws RecognitionException {
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

        EObject lv_portConfig_12_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalIFACE.g:204:2: ( (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_portConfig_12_0= ruleGSSIfacePort ) ) otherlv_13= '}' otherlv_14= ';' ) )
            // InternalIFACE.g:205:2: (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_portConfig_12_0= ruleGSSIfacePort ) ) otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalIFACE.g:205:2: (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_portConfig_12_0= ruleGSSIfacePort ) ) otherlv_13= '}' otherlv_14= ';' )
            // InternalIFACE.g:206:3: otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) ) ( (lv_portConfig_12_0= ruleGSSIfacePort ) ) otherlv_13= '}' otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfacePortConfigAccess().getPortConfigKeyword_0());
              		
            }
            // InternalIFACE.g:210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIFACE.g:211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIFACE.g:211:4: (lv_name_1_0= RULE_ID )
            // InternalIFACE.g:212:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getGSSIfacePortConfigAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSIfacePortConfigRule());
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

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfacePortConfigAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalIFACE.g:232:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) ) )
            // InternalIFACE.g:233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalIFACE.g:233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?) )
            // InternalIFACE.g:234:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
            // InternalIFACE.g:237:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?)
            // InternalIFACE.g:238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+ {...}?
            {
            // InternalIFACE.g:238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIFACE.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
            	    // InternalIFACE.g:240:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfacePortConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalIFACE.g:240:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
            	    // InternalIFACE.g:241:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
            	    // InternalIFACE.g:244:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
            	    // InternalIFACE.g:244:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfacePortConfig", "true");
            	    }
            	    // InternalIFACE.g:244:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
            	    // InternalIFACE.g:244:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSIfacePortConfigAccess().getUriKeyword_3_0_0());
            	      								
            	    }
            	    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_0_1());
            	      								
            	    }
            	    // InternalIFACE.g:252:9: ( (lv_uri_6_0= ruleQualifiedName ) )
            	    // InternalIFACE.g:253:10: (lv_uri_6_0= ruleQualifiedName )
            	    {
            	    // InternalIFACE.g:253:10: (lv_uri_6_0= ruleQualifiedName )
            	    // InternalIFACE.g:254:11: lv_uri_6_0= ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_uri_6_0=ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfacePortConfigRule());
            	      											}
            	      											set(
            	      												current,
            	      												"uri",
            	      												lv_uri_6_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.QualifiedName");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIFACE.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
            	    // InternalIFACE.g:282:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfacePortConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalIFACE.g:282:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
            	    // InternalIFACE.g:283:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
            	    // InternalIFACE.g:286:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
            	    // InternalIFACE.g:286:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfacePortConfig", "true");
            	    }
            	    // InternalIFACE.g:286:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
            	    // InternalIFACE.g:286:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSIfacePortConfigAccess().getVersionKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getGSSIfacePortConfigAccess().getColonEqualsSignKeyword_3_1_1());
            	      								
            	    }
            	    // InternalIFACE.g:294:9: ( (lv_version_10_0= ruleVersion ) )
            	    // InternalIFACE.g:295:10: (lv_version_10_0= ruleVersion )
            	    {
            	    // InternalIFACE.g:295:10: (lv_version_10_0= ruleVersion )
            	    // InternalIFACE.g:296:11: lv_version_10_0= ruleVersion
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getVersionVersionParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_version_10_0=ruleVersion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfacePortConfigRule());
            	      											}
            	      											set(
            	      												current,
            	      												"version",
            	      												lv_version_10_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.Version");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_3_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSIfacePortConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());

            }

            // InternalIFACE.g:331:3: ( (lv_portConfig_12_0= ruleGSSIfacePort ) )
            // InternalIFACE.g:332:4: (lv_portConfig_12_0= ruleGSSIfacePort )
            {
            // InternalIFACE.g:332:4: (lv_portConfig_12_0= ruleGSSIfacePort )
            // InternalIFACE.g:333:5: lv_portConfig_12_0= ruleGSSIfacePort
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getPortConfigGSSIfacePortParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_portConfig_12_0=ruleGSSIfacePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfacePortConfigRule());
              					}
              					set(
              						current,
              						"portConfig",
              						lv_portConfig_12_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePort");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_5());
              		
            }
            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleGSSIfacePortConfig"


    // $ANTLR start "entryRuleGSSIfacePort"
    // InternalIFACE.g:365:1: entryRuleGSSIfacePort returns [EObject current=null] : iv_ruleGSSIfacePort= ruleGSSIfacePort EOF ;
    public final EObject entryRuleGSSIfacePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfacePort = null;


        try {
            // InternalIFACE.g:365:53: (iv_ruleGSSIfacePort= ruleGSSIfacePort EOF )
            // InternalIFACE.g:366:2: iv_ruleGSSIfacePort= ruleGSSIfacePort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfacePortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfacePort=ruleGSSIfacePort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfacePort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfacePort"


    // $ANTLR start "ruleGSSIfacePort"
    // InternalIFACE.g:372:1: ruleGSSIfacePort returns [EObject current=null] : (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort ) ;
    public final EObject ruleGSSIfacePort() throws RecognitionException {
        EObject current = null;

        EObject this_GSSIfaceSpWPort_0 = null;

        EObject this_GSSIfaceUartPort_1 = null;

        EObject this_GSSIfaceSpWTCPort_2 = null;

        EObject this_GSSIfaceDummyPort_3 = null;



        	enterRule();

        try {
            // InternalIFACE.g:378:2: ( (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort ) )
            // InternalIFACE.g:379:2: (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort )
            {
            // InternalIFACE.g:379:2: (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 44:
                {
                alt3=3;
                }
                break;
            case 46:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalIFACE.g:380:3: this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWPortParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceSpWPort_0=ruleGSSIfaceSpWPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceSpWPort_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalIFACE.g:392:3: this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceUartPortParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceUartPort_1=ruleGSSIfaceUartPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceUartPort_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalIFACE.g:404:3: this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceSpWTCPort_2=ruleGSSIfaceSpWTCPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceSpWTCPort_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIFACE.g:416:3: this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceDummyPort_3=ruleGSSIfaceDummyPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceDummyPort_3;
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
    // $ANTLR end "ruleGSSIfacePort"


    // $ANTLR start "entryRuleGSSIfaceSpWPort"
    // InternalIFACE.g:431:1: entryRuleGSSIfaceSpWPort returns [EObject current=null] : iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF ;
    public final EObject entryRuleGSSIfaceSpWPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSpWPort = null;


        try {
            // InternalIFACE.g:431:56: (iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF )
            // InternalIFACE.g:432:2: iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceSpWPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceSpWPort=ruleGSSIfaceSpWPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceSpWPort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSpWPort"


    // $ANTLR start "ruleGSSIfaceSpWPort"
    // InternalIFACE.g:438:1: ruleGSSIfaceSpWPort returns [EObject current=null] : (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleGSSIfaceSpWPort() throws RecognitionException {
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_link_8_0 = null;

        AntlrDatatypeRuleToken lv_writingPort_12_0 = null;

        EObject lv_readingPort_14_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:444:2: ( (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            // InternalIFACE.g:445:2: (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalIFACE.g:445:2: (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' )
            // InternalIFACE.g:446:3: otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:462:3: ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) )
            // InternalIFACE.g:463:4: (lv_type_4_0= ruleGSSIfaceSpWPortType )
            {
            // InternalIFACE.g:463:4: (lv_type_4_0= ruleGSSIfaceSpWPortType )
            // InternalIFACE.g:464:5: lv_type_4_0= ruleGSSIfaceSpWPortType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_type_4_0=ruleGSSIfaceSpWPortType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWPortType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:493:3: ( (lv_link_8_0= ruleINTEGER ) )
            // InternalIFACE.g:494:4: (lv_link_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:494:4: (lv_link_8_0= ruleINTEGER )
            // InternalIFACE.g:495:5: lv_link_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_link_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
              					}
              					set(
              						current,
              						"link",
              						lv_link_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalIFACE.g:524:3: ( (lv_writingPort_12_0= ruleINTEGER ) )
            // InternalIFACE.g:525:4: (lv_writingPort_12_0= ruleINTEGER )
            {
            // InternalIFACE.g:525:4: (lv_writingPort_12_0= ruleINTEGER )
            // InternalIFACE.g:526:5: lv_writingPort_12_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_writingPort_12_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
              					}
              					set(
              						current,
              						"writingPort",
              						lv_writingPort_12_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_13());
              		
            }
            // InternalIFACE.g:547:3: ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIFACE.g:548:4: (lv_readingPort_14_0= ruleGSSIfaceReadingPort )
            	    {
            	    // InternalIFACE.g:548:4: (lv_readingPort_14_0= ruleGSSIfaceReadingPort )
            	    // InternalIFACE.g:549:5: lv_readingPort_14_0= ruleGSSIfaceReadingPort
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_14_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_readingPort_14_0=ruleGSSIfaceReadingPort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
            	      					}
            	      					add(
            	      						current,
            	      						"readingPort",
            	      						lv_readingPort_14_0,
            	      						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceReadingPort");
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

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_15());
              		
            }
            otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_16());
              		
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
    // $ANTLR end "ruleGSSIfaceSpWPort"


    // $ANTLR start "entryRuleGSSIfaceReadingPort"
    // InternalIFACE.g:578:1: entryRuleGSSIfaceReadingPort returns [EObject current=null] : iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF ;
    public final EObject entryRuleGSSIfaceReadingPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceReadingPort = null;


        try {
            // InternalIFACE.g:578:60: (iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF )
            // InternalIFACE.g:579:2: iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceReadingPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceReadingPort=ruleGSSIfaceReadingPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceReadingPort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceReadingPort"


    // $ANTLR start "ruleGSSIfaceReadingPort"
    // InternalIFACE.g:585:1: ruleGSSIfaceReadingPort returns [EObject current=null] : (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSIfaceReadingPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_port_4_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:591:2: ( (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:592:2: (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:592:2: (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:593:3: otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:609:3: ( (lv_port_4_0= ruleINTEGER ) )
            // InternalIFACE.g:610:4: (lv_port_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:610:4: (lv_port_4_0= ruleINTEGER )
            // InternalIFACE.g:611:5: lv_port_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_port_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceReadingPortRule());
              					}
              					set(
              						current,
              						"port",
              						lv_port_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSIfaceReadingPort"


    // $ANTLR start "entryRuleGSSIfaceUartPort"
    // InternalIFACE.g:644:1: entryRuleGSSIfaceUartPort returns [EObject current=null] : iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF ;
    public final EObject entryRuleGSSIfaceUartPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceUartPort = null;


        try {
            // InternalIFACE.g:644:57: (iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF )
            // InternalIFACE.g:645:2: iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceUartPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceUartPort=ruleGSSIfaceUartPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceUartPort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceUartPort"


    // $ANTLR start "ruleGSSIfaceUartPort"
    // InternalIFACE.g:651:1: ruleGSSIfaceUartPort returns [EObject current=null] : (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'inputQueueSize' otherlv_23= ':=' ( (lv_inputQueueSize_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'outputQueueSize' otherlv_27= ':=' ( (lv_outputQueueSize_28_0= ruleINTEGER ) ) otherlv_29= ';' ( (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol ) ) otherlv_31= '}' otherlv_32= ';' ) ;
    public final EObject ruleGSSIfaceUartPort() throws RecognitionException {
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
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        AntlrDatatypeRuleToken lv_number_4_0 = null;

        Enumerator lv_baudRate_8_0 = null;

        Enumerator lv_parity_12_0 = null;

        Enumerator lv_dataBits_16_0 = null;

        Enumerator lv_stopBits_20_0 = null;

        AntlrDatatypeRuleToken lv_inputQueueSize_24_0 = null;

        AntlrDatatypeRuleToken lv_outputQueueSize_28_0 = null;

        EObject lv_uartProtocol_30_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:657:2: ( (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'inputQueueSize' otherlv_23= ':=' ( (lv_inputQueueSize_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'outputQueueSize' otherlv_27= ':=' ( (lv_outputQueueSize_28_0= ruleINTEGER ) ) otherlv_29= ';' ( (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol ) ) otherlv_31= '}' otherlv_32= ';' ) )
            // InternalIFACE.g:658:2: (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'inputQueueSize' otherlv_23= ':=' ( (lv_inputQueueSize_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'outputQueueSize' otherlv_27= ':=' ( (lv_outputQueueSize_28_0= ruleINTEGER ) ) otherlv_29= ';' ( (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol ) ) otherlv_31= '}' otherlv_32= ';' )
            {
            // InternalIFACE.g:658:2: (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'inputQueueSize' otherlv_23= ':=' ( (lv_inputQueueSize_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'outputQueueSize' otherlv_27= ':=' ( (lv_outputQueueSize_28_0= ruleINTEGER ) ) otherlv_29= ';' ( (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol ) ) otherlv_31= '}' otherlv_32= ';' )
            // InternalIFACE.g:659:3: otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'inputQueueSize' otherlv_23= ':=' ( (lv_inputQueueSize_24_0= ruleINTEGER ) ) otherlv_25= ';' otherlv_26= 'outputQueueSize' otherlv_27= ':=' ( (lv_outputQueueSize_28_0= ruleINTEGER ) ) otherlv_29= ';' ( (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol ) ) otherlv_31= '}' otherlv_32= ';'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:675:3: ( (lv_number_4_0= ruleINTEGER ) )
            // InternalIFACE.g:676:4: (lv_number_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:676:4: (lv_number_4_0= ruleINTEGER )
            // InternalIFACE.g:677:5: lv_number_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_number_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"number",
              						lv_number_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:706:3: ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) )
            // InternalIFACE.g:707:4: (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate )
            {
            // InternalIFACE.g:707:4: (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate )
            // InternalIFACE.g:708:5: lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_baudRate_8_0=ruleGSSIfaceUartPortBaudRate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"baudRate",
              						lv_baudRate_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortBaudRate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,29,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_11());
              		
            }
            // InternalIFACE.g:737:3: ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) )
            // InternalIFACE.g:738:4: (lv_parity_12_0= ruleGSSIfaceUartPortParity )
            {
            // InternalIFACE.g:738:4: (lv_parity_12_0= ruleGSSIfaceUartPortParity )
            // InternalIFACE.g:739:5: lv_parity_12_0= ruleGSSIfaceUartPortParity
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_parity_12_0=ruleGSSIfaceUartPortParity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"parity",
              						lv_parity_12_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortParity");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_13=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_13());
              		
            }
            otherlv_14=(Token)match(input,30,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,17,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_15());
              		
            }
            // InternalIFACE.g:768:3: ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) )
            // InternalIFACE.g:769:4: (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits )
            {
            // InternalIFACE.g:769:4: (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits )
            // InternalIFACE.g:770:5: lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_16_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_dataBits_16_0=ruleGSSIfaceUartPortDataBits();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"dataBits",
              						lv_dataBits_16_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortDataBits");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_17());
              		
            }
            otherlv_18=(Token)match(input,31,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_18, grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_18());
              		
            }
            otherlv_19=(Token)match(input,17,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_19());
              		
            }
            // InternalIFACE.g:799:3: ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) )
            // InternalIFACE.g:800:4: (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits )
            {
            // InternalIFACE.g:800:4: (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits )
            // InternalIFACE.g:801:5: lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_20_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_stopBits_20_0=ruleGSSIfaceUartPortStopBits();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"stopBits",
              						lv_stopBits_20_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortStopBits");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_21=(Token)match(input,13,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_21());
              		
            }
            otherlv_22=(Token)match(input,32,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_22, grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalIFACE.g:830:3: ( (lv_inputQueueSize_24_0= ruleINTEGER ) )
            // InternalIFACE.g:831:4: (lv_inputQueueSize_24_0= ruleINTEGER )
            {
            // InternalIFACE.g:831:4: (lv_inputQueueSize_24_0= ruleINTEGER )
            // InternalIFACE.g:832:5: lv_inputQueueSize_24_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_inputQueueSize_24_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"inputQueueSize",
              						lv_inputQueueSize_24_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25());
              		
            }
            otherlv_26=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_26());
              		
            }
            otherlv_27=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_27());
              		
            }
            // InternalIFACE.g:861:3: ( (lv_outputQueueSize_28_0= ruleINTEGER ) )
            // InternalIFACE.g:862:4: (lv_outputQueueSize_28_0= ruleINTEGER )
            {
            // InternalIFACE.g:862:4: (lv_outputQueueSize_28_0= ruleINTEGER )
            // InternalIFACE.g:863:5: lv_outputQueueSize_28_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_28_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_outputQueueSize_28_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"outputQueueSize",
              						lv_outputQueueSize_28_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_29=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_29, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_29());
              		
            }
            // InternalIFACE.g:884:3: ( (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol ) )
            // InternalIFACE.g:885:4: (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol )
            {
            // InternalIFACE.g:885:4: (lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol )
            // InternalIFACE.g:886:5: lv_uartProtocol_30_0= ruleGSSIfaceUartProtocol
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_30_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_uartProtocol_30_0=ruleGSSIfaceUartProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"uartProtocol",
              						lv_uartProtocol_30_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocol");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_31=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_31());
              		
            }
            otherlv_32=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_32());
              		
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
    // $ANTLR end "ruleGSSIfaceUartPort"


    // $ANTLR start "entryRuleGSSIfaceUartProtocol"
    // InternalIFACE.g:915:1: entryRuleGSSIfaceUartProtocol returns [EObject current=null] : iv_ruleGSSIfaceUartProtocol= ruleGSSIfaceUartProtocol EOF ;
    public final EObject entryRuleGSSIfaceUartProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceUartProtocol = null;


        try {
            // InternalIFACE.g:915:61: (iv_ruleGSSIfaceUartProtocol= ruleGSSIfaceUartProtocol EOF )
            // InternalIFACE.g:916:2: iv_ruleGSSIfaceUartProtocol= ruleGSSIfaceUartProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceUartProtocolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceUartProtocol=ruleGSSIfaceUartProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceUartProtocol; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceUartProtocol"


    // $ANTLR start "ruleGSSIfaceUartProtocol"
    // InternalIFACE.g:922:1: ruleGSSIfaceUartProtocol returns [EObject current=null] : (otherlv_0= 'uartProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSIfaceUartProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_unit_4_0 = null;

        Enumerator lv_power_8_0 = null;

        EObject lv_constSize_10_0 = null;

        EObject lv_sizeFieldOffset_11_0 = null;

        EObject lv_sizeFieldTrim_12_0 = null;

        EObject lv_syncPattern_13_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:928:2: ( (otherlv_0= 'uartProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalIFACE.g:929:2: (otherlv_0= 'uartProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalIFACE.g:929:2: (otherlv_0= 'uartProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' )
            // InternalIFACE.g:930:3: otherlv_0= 'uartProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:946:3: ( (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit ) )
            // InternalIFACE.g:947:4: (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit )
            {
            // InternalIFACE.g:947:4: (lv_unit_4_0= ruleGSSIfaceUartProtocolUnit )
            // InternalIFACE.g:948:5: lv_unit_4_0= ruleGSSIfaceUartProtocolUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_unit_4_0=ruleGSSIfaceUartProtocolUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,36,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:977:3: ( (lv_power_8_0= ruleGSSIfaceUartProtocolPower ) )
            // InternalIFACE.g:978:4: (lv_power_8_0= ruleGSSIfaceUartProtocolPower )
            {
            // InternalIFACE.g:978:4: (lv_power_8_0= ruleGSSIfaceUartProtocolPower )
            // InternalIFACE.g:979:5: lv_power_8_0= ruleGSSIfaceUartProtocolPower
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_power_8_0=ruleGSSIfaceUartProtocolPower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
              					}
              					set(
              						current,
              						"power",
              						lv_power_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolPower");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_9());
              		
            }
            // InternalIFACE.g:1000:3: ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) )
            // InternalIFACE.g:1001:4: (lv_constSize_10_0= ruleGSSIfaceConstSize )
            {
            // InternalIFACE.g:1001:4: (lv_constSize_10_0= ruleGSSIfaceConstSize )
            // InternalIFACE.g:1002:5: lv_constSize_10_0= ruleGSSIfaceConstSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_constSize_10_0=ruleGSSIfaceConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
              					}
              					set(
              						current,
              						"constSize",
              						lv_constSize_10_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceConstSize");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIFACE.g:1019:3: ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) )
            // InternalIFACE.g:1020:4: (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset )
            {
            // InternalIFACE.g:1020:4: (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset )
            // InternalIFACE.g:1021:5: lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
            lv_sizeFieldOffset_11_0=ruleGSSIfaceSizeFieldOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
              					}
              					set(
              						current,
              						"sizeFieldOffset",
              						lv_sizeFieldOffset_11_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldOffset");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIFACE.g:1038:3: ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) )
            // InternalIFACE.g:1039:4: (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim )
            {
            // InternalIFACE.g:1039:4: (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim )
            // InternalIFACE.g:1040:5: lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_sizeFieldTrim_12_0=ruleGSSIfaceSizeFieldTrim();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
              					}
              					set(
              						current,
              						"sizeFieldTrim",
              						lv_sizeFieldTrim_12_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldTrim");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalIFACE.g:1057:3: ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==42) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIFACE.g:1058:4: (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern )
                    {
                    // InternalIFACE.g:1058:4: (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern )
                    // InternalIFACE.g:1059:5: lv_syncPattern_13_0= ruleGSSIfaceSyncPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_syncPattern_13_0=ruleGSSIfaceSyncPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
                      					}
                      					set(
                      						current,
                      						"syncPattern",
                      						lv_syncPattern_13_0,
                      						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSyncPattern");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleGSSIfaceUartProtocol"


    // $ANTLR start "entryRuleGSSIfaceConstSize"
    // InternalIFACE.g:1088:1: entryRuleGSSIfaceConstSize returns [EObject current=null] : iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF ;
    public final EObject entryRuleGSSIfaceConstSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceConstSize = null;


        try {
            // InternalIFACE.g:1088:58: (iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF )
            // InternalIFACE.g:1089:2: iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceConstSizeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceConstSize=ruleGSSIfaceConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceConstSize; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceConstSize"


    // $ANTLR start "ruleGSSIfaceConstSize"
    // InternalIFACE.g:1095:1: ruleGSSIfaceConstSize returns [EObject current=null] : (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSIfaceConstSize() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:1101:2: ( (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalIFACE.g:1102:2: (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalIFACE.g:1102:2: (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalIFACE.g:1103:3: otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1119:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1120:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1120:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalIFACE.g:1121:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceConstSizeRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1150:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalIFACE.g:1151:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:1151:4: (lv_bits_8_0= ruleINTEGER )
            // InternalIFACE.g:1152:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceConstSizeRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSIfaceConstSize"


    // $ANTLR start "entryRuleGSSIfaceSizeFieldOffset"
    // InternalIFACE.g:1185:1: entryRuleGSSIfaceSizeFieldOffset returns [EObject current=null] : iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF ;
    public final EObject entryRuleGSSIfaceSizeFieldOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSizeFieldOffset = null;


        try {
            // InternalIFACE.g:1185:64: (iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF )
            // InternalIFACE.g:1186:2: iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceSizeFieldOffset=ruleGSSIfaceSizeFieldOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceSizeFieldOffset; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSizeFieldOffset"


    // $ANTLR start "ruleGSSIfaceSizeFieldOffset"
    // InternalIFACE.g:1192:1: ruleGSSIfaceSizeFieldOffset returns [EObject current=null] : (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSIfaceSizeFieldOffset() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:1198:2: ( (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalIFACE.g:1199:2: (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalIFACE.g:1199:2: (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalIFACE.g:1200:3: otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1216:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1217:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1217:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalIFACE.g:1218:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldOffsetRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1247:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalIFACE.g:1248:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:1248:4: (lv_bits_8_0= ruleINTEGER )
            // InternalIFACE.g:1249:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldOffsetRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSIfaceSizeFieldOffset"


    // $ANTLR start "entryRuleGSSIfaceSizeFieldTrim"
    // InternalIFACE.g:1282:1: entryRuleGSSIfaceSizeFieldTrim returns [EObject current=null] : iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF ;
    public final EObject entryRuleGSSIfaceSizeFieldTrim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSizeFieldTrim = null;


        try {
            // InternalIFACE.g:1282:62: (iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF )
            // InternalIFACE.g:1283:2: iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceSizeFieldTrim=ruleGSSIfaceSizeFieldTrim();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceSizeFieldTrim; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSizeFieldTrim"


    // $ANTLR start "ruleGSSIfaceSizeFieldTrim"
    // InternalIFACE.g:1289:1: ruleGSSIfaceSizeFieldTrim returns [EObject current=null] : (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
    public final EObject ruleGSSIfaceSizeFieldTrim() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_bytes_4_0 = null;

        AntlrDatatypeRuleToken lv_bits_8_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:1295:2: ( (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalIFACE.g:1296:2: (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalIFACE.g:1296:2: (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalIFACE.g:1297:3: otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1313:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1314:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1314:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalIFACE.g:1315:5: lv_bytes_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bytes_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldTrimRule());
              					}
              					set(
              						current,
              						"bytes",
              						lv_bytes_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1344:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalIFACE.g:1345:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:1345:4: (lv_bits_8_0= ruleINTEGER )
            // InternalIFACE.g:1346:5: lv_bits_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_bits_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldTrimRule());
              					}
              					set(
              						current,
              						"bits",
              						lv_bits_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_9());
              		
            }
            otherlv_10=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_11());
              		
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
    // $ANTLR end "ruleGSSIfaceSizeFieldTrim"


    // $ANTLR start "entryRuleGSSIfaceSyncPattern"
    // InternalIFACE.g:1379:1: entryRuleGSSIfaceSyncPattern returns [EObject current=null] : iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF ;
    public final EObject entryRuleGSSIfaceSyncPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSyncPattern = null;


        try {
            // InternalIFACE.g:1379:60: (iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF )
            // InternalIFACE.g:1380:2: iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceSyncPatternRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceSyncPattern=ruleGSSIfaceSyncPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceSyncPattern; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSyncPattern"


    // $ANTLR start "ruleGSSIfaceSyncPattern"
    // InternalIFACE.g:1386:1: ruleGSSIfaceSyncPattern returns [EObject current=null] : (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSIfaceSyncPattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_hexValue_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalIFACE.g:1392:2: ( (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:1393:2: (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:1393:2: (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:1394:3: otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1410:3: ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) )
            // InternalIFACE.g:1411:4: (lv_hexValue_4_0= RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:1411:4: (lv_hexValue_4_0= RULE_HEXADECIMAL )
            // InternalIFACE.g:1412:5: lv_hexValue_4_0= RULE_HEXADECIMAL
            {
            lv_hexValue_4_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_hexValue_4_0, grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSIfaceSyncPatternRule());
              					}
              					setWithLastConsumed(
              						current,
              						"hexValue",
              						lv_hexValue_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.HEXADECIMAL");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSIfaceSyncPattern"


    // $ANTLR start "entryRuleGSSIfaceSpWTCPort"
    // InternalIFACE.g:1444:1: entryRuleGSSIfaceSpWTCPort returns [EObject current=null] : iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF ;
    public final EObject entryRuleGSSIfaceSpWTCPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSpWTCPort = null;


        try {
            // InternalIFACE.g:1444:58: (iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF )
            // InternalIFACE.g:1445:2: iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceSpWTCPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceSpWTCPort=ruleGSSIfaceSpWTCPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceSpWTCPort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSpWTCPort"


    // $ANTLR start "ruleGSSIfaceSpWTCPort"
    // InternalIFACE.g:1451:1: ruleGSSIfaceSpWTCPort returns [EObject current=null] : (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleGSSIfaceSpWTCPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_spwPortRef_4_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:1457:2: ( (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:1458:2: (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:1458:2: (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:1459:3: otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1475:3: ( (lv_spwPortRef_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1476:4: (lv_spwPortRef_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1476:4: (lv_spwPortRef_4_0= ruleINTEGER )
            // InternalIFACE.g:1477:5: lv_spwPortRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_spwPortRef_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSpWTCPortRule());
              					}
              					set(
              						current,
              						"spwPortRef",
              						lv_spwPortRef_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_7());
              		
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
    // $ANTLR end "ruleGSSIfaceSpWTCPort"


    // $ANTLR start "entryRuleGSSIfaceDummyPort"
    // InternalIFACE.g:1510:1: entryRuleGSSIfaceDummyPort returns [EObject current=null] : iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF ;
    public final EObject entryRuleGSSIfaceDummyPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceDummyPort = null;


        try {
            // InternalIFACE.g:1510:58: (iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF )
            // InternalIFACE.g:1511:2: iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceDummyPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceDummyPort=ruleGSSIfaceDummyPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceDummyPort; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceDummyPort"


    // $ANTLR start "ruleGSSIfaceDummyPort"
    // InternalIFACE.g:1517:1: ruleGSSIfaceDummyPort returns [EObject current=null] : ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSIfaceDummyPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIFACE.g:1523:2: ( ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) )
            // InternalIFACE.g:1524:2: ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalIFACE.g:1524:2: ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            // InternalIFACE.g:1525:3: () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';'
            {
            // InternalIFACE.g:1525:3: ()
            // InternalIFACE.g:1526:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGSSIfaceDummyPortAccess().getGSSIfaceDummyPortAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceDummyPortAccess().getDummyPortKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceDummyPortAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceDummyPortAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getGSSIfaceDummyPortAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSIfaceDummyPort"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalIFACE.g:1555:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalIFACE.g:1555:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalIFACE.g:1556:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalIFACE.g:1562:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:1568:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalIFACE.g:1569:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalIFACE.g:1569:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalIFACE.g:1570:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalIFACE.g:1577:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==47) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIFACE.g:1578:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FollowSets000.FOLLOW_6); if (state.failed) return current;
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
    // InternalIFACE.g:1595:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalIFACE.g:1595:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalIFACE.g:1596:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalIFACE.g:1602:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalIFACE.g:1608:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalIFACE.g:1609:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalIFACE.g:1609:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalIFACE.g:1610:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalIFACE.g:1610:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==13||LA8_1==47||LA8_1==49) ) {
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
                    // InternalIFACE.g:1611:4: this_INT_0= RULE_INT
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
                    // InternalIFACE.g:1619:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalIFACE.g:1619:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalIFACE.g:1620:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalIFACE.g:1620:5: (this_INT_1= RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalIFACE.g:1621:6: this_INT_1= RULE_INT
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

            // InternalIFACE.g:1638:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIFACE.g:1639:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,47,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalIFACE.g:1644:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_INT) ) {
            	        int LA10_1 = input.LA(2);

            	        if ( (LA10_1==RULE_ID) ) {
            	            alt10=2;
            	        }
            	        else if ( (LA10_1==EOF||LA10_1==13||LA10_1==47||LA10_1==49) ) {
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
            	            // InternalIFACE.g:1645:5: this_INT_4= RULE_INT
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
            	            // InternalIFACE.g:1653:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalIFACE.g:1653:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalIFACE.g:1654:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalIFACE.g:1654:6: (this_INT_5= RULE_INT )?
            	            int alt9=2;
            	            int LA9_0 = input.LA(1);

            	            if ( (LA9_0==RULE_INT) ) {
            	                alt9=1;
            	            }
            	            switch (alt9) {
            	                case 1 :
            	                    // InternalIFACE.g:1655:7: this_INT_5= RULE_INT
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
    // InternalIFACE.g:1677:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalIFACE.g:1677:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalIFACE.g:1678:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalIFACE.g:1684:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalIFACE.g:1690:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalIFACE.g:1691:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalIFACE.g:1691:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalIFACE.g:1692:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
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
            kw=(Token)match(input,48,FollowSets000.FOLLOW_11); if (state.failed) return current;
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
            kw=(Token)match(input,49,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalIFACE.g:1726:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalIFACE.g:1726:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalIFACE.g:1727:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalIFACE.g:1733:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:1739:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalIFACE.g:1740:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:1740:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==50) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_HEXADECIMAL) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalIFACE.g:1741:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalIFACE.g:1741:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalIFACE.g:1742:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalIFACE.g:1742:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==50) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalIFACE.g:1743:5: kw= '-'
                            {
                            kw=(Token)match(input,50,FollowSets000.FOLLOW_49); if (state.failed) return current;
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
                    // InternalIFACE.g:1758:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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


    // $ANTLR start "ruleGSSIfaceSpWPortType"
    // InternalIFACE.g:1769:1: ruleGSSIfaceSpWPortType returns [Enumerator current=null] : ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) ) ;
    public final Enumerator ruleGSSIfaceSpWPortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:1775:2: ( ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) ) )
            // InternalIFACE.g:1776:2: ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) )
            {
            // InternalIFACE.g:1776:2: ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt14=1;
                }
                break;
            case 52:
                {
                alt14=2;
                }
                break;
            case 53:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalIFACE.g:1777:3: (enumLiteral_0= 'usb' )
                    {
                    // InternalIFACE.g:1777:3: (enumLiteral_0= 'usb' )
                    // InternalIFACE.g:1778:4: enumLiteral_0= 'usb'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1785:3: (enumLiteral_1= 'mk2' )
                    {
                    // InternalIFACE.g:1785:3: (enumLiteral_1= 'mk2' )
                    // InternalIFACE.g:1786:4: enumLiteral_1= 'mk2'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:1793:3: (enumLiteral_2= 'pci' )
                    {
                    // InternalIFACE.g:1793:3: (enumLiteral_2= 'pci' )
                    // InternalIFACE.g:1794:4: enumLiteral_2= 'pci'
                    {
                    enumLiteral_2=(Token)match(input,53,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceSpWPortTypeAccess().getPciEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSIfaceSpWPortType"


    // $ANTLR start "ruleGSSIfaceUartPortBaudRate"
    // InternalIFACE.g:1804:1: ruleGSSIfaceUartPortBaudRate returns [Enumerator current=null] : ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortBaudRate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:1810:2: ( ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) ) )
            // InternalIFACE.g:1811:2: ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) )
            {
            // InternalIFACE.g:1811:2: ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==54) ) {
                alt15=1;
            }
            else if ( (LA15_0==55) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalIFACE.g:1812:3: (enumLiteral_0= '38400bauds' )
                    {
                    // InternalIFACE.g:1812:3: (enumLiteral_0= '38400bauds' )
                    // InternalIFACE.g:1813:4: enumLiteral_0= '38400bauds'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1820:3: (enumLiteral_1= '115200bauds' )
                    {
                    // InternalIFACE.g:1820:3: (enumLiteral_1= '115200bauds' )
                    // InternalIFACE.g:1821:4: enumLiteral_1= '115200bauds'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_115200EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSIfaceUartPortBaudRate"


    // $ANTLR start "ruleGSSIfaceUartPortParity"
    // InternalIFACE.g:1831:1: ruleGSSIfaceUartPortParity returns [Enumerator current=null] : ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortParity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalIFACE.g:1837:2: ( ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) ) )
            // InternalIFACE.g:1838:2: ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) )
            {
            // InternalIFACE.g:1838:2: ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt16=1;
                }
                break;
            case 57:
                {
                alt16=2;
                }
                break;
            case 58:
                {
                alt16=3;
                }
                break;
            case 59:
                {
                alt16=4;
                }
                break;
            case 60:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalIFACE.g:1839:3: (enumLiteral_0= 'NO' )
                    {
                    // InternalIFACE.g:1839:3: (enumLiteral_0= 'NO' )
                    // InternalIFACE.g:1840:4: enumLiteral_0= 'NO'
                    {
                    enumLiteral_0=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1847:3: (enumLiteral_1= 'ODD' )
                    {
                    // InternalIFACE.g:1847:3: (enumLiteral_1= 'ODD' )
                    // InternalIFACE.g:1848:4: enumLiteral_1= 'ODD'
                    {
                    enumLiteral_1=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:1855:3: (enumLiteral_2= 'EVEN' )
                    {
                    // InternalIFACE.g:1855:3: (enumLiteral_2= 'EVEN' )
                    // InternalIFACE.g:1856:4: enumLiteral_2= 'EVEN'
                    {
                    enumLiteral_2=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:1863:3: (enumLiteral_3= 'MARK' )
                    {
                    // InternalIFACE.g:1863:3: (enumLiteral_3= 'MARK' )
                    // InternalIFACE.g:1864:4: enumLiteral_3= 'MARK'
                    {
                    enumLiteral_3=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIFACE.g:1871:3: (enumLiteral_4= 'SPACE' )
                    {
                    // InternalIFACE.g:1871:3: (enumLiteral_4= 'SPACE' )
                    // InternalIFACE.g:1872:4: enumLiteral_4= 'SPACE'
                    {
                    enumLiteral_4=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getGSSIfaceUartPortParityAccess().getSPACEEnumLiteralDeclaration_4());
                      			
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
    // $ANTLR end "ruleGSSIfaceUartPortParity"


    // $ANTLR start "ruleGSSIfaceUartPortDataBits"
    // InternalIFACE.g:1882:1: ruleGSSIfaceUartPortDataBits returns [Enumerator current=null] : ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortDataBits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalIFACE.g:1888:2: ( ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) ) )
            // InternalIFACE.g:1889:2: ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) )
            {
            // InternalIFACE.g:1889:2: ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt17=1;
                }
                break;
            case 62:
                {
                alt17=2;
                }
                break;
            case 63:
                {
                alt17=3;
                }
                break;
            case 64:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalIFACE.g:1890:3: (enumLiteral_0= '5bits' )
                    {
                    // InternalIFACE.g:1890:3: (enumLiteral_0= '5bits' )
                    // InternalIFACE.g:1891:4: enumLiteral_0= '5bits'
                    {
                    enumLiteral_0=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1898:3: (enumLiteral_1= '6bits' )
                    {
                    // InternalIFACE.g:1898:3: (enumLiteral_1= '6bits' )
                    // InternalIFACE.g:1899:4: enumLiteral_1= '6bits'
                    {
                    enumLiteral_1=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:1906:3: (enumLiteral_2= '7bits' )
                    {
                    // InternalIFACE.g:1906:3: (enumLiteral_2= '7bits' )
                    // InternalIFACE.g:1907:4: enumLiteral_2= '7bits'
                    {
                    enumLiteral_2=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:1914:3: (enumLiteral_3= '8bits' )
                    {
                    // InternalIFACE.g:1914:3: (enumLiteral_3= '8bits' )
                    // InternalIFACE.g:1915:4: enumLiteral_3= '8bits'
                    {
                    enumLiteral_3=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_8EnumLiteralDeclaration_3());
                      			
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
    // $ANTLR end "ruleGSSIfaceUartPortDataBits"


    // $ANTLR start "ruleGSSIfaceUartPortStopBits"
    // InternalIFACE.g:1925:1: ruleGSSIfaceUartPortStopBits returns [Enumerator current=null] : ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortStopBits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:1931:2: ( ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) ) )
            // InternalIFACE.g:1932:2: ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) )
            {
            // InternalIFACE.g:1932:2: ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==65) ) {
                alt18=1;
            }
            else if ( (LA18_0==66) ) {
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
                    // InternalIFACE.g:1933:3: (enumLiteral_0= '1bit' )
                    {
                    // InternalIFACE.g:1933:3: (enumLiteral_0= '1bit' )
                    // InternalIFACE.g:1934:4: enumLiteral_0= '1bit'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1941:3: (enumLiteral_1= '2bits' )
                    {
                    // InternalIFACE.g:1941:3: (enumLiteral_1= '2bits' )
                    // InternalIFACE.g:1942:4: enumLiteral_1= '2bits'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_2EnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSIfaceUartPortStopBits"


    // $ANTLR start "ruleGSSIfaceUartProtocolUnit"
    // InternalIFACE.g:1952:1: ruleGSSIfaceUartProtocolUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartProtocolUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:1958:2: ( ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) ) )
            // InternalIFACE.g:1959:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) )
            {
            // InternalIFACE.g:1959:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalIFACE.g:1960:3: (enumLiteral_0= 'bytes' )
                    {
                    // InternalIFACE.g:1960:3: (enumLiteral_0= 'bytes' )
                    // InternalIFACE.g:1961:4: enumLiteral_0= 'bytes'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBytesEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1968:3: (enumLiteral_1= 'bits' )
                    {
                    // InternalIFACE.g:1968:3: (enumLiteral_1= 'bits' )
                    // InternalIFACE.g:1969:4: enumLiteral_1= 'bits'
                    {
                    enumLiteral_1=(Token)match(input,39,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartProtocolUnitAccess().getBitsEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSIfaceUartProtocolUnit"


    // $ANTLR start "ruleGSSIfaceUartProtocolPower"
    // InternalIFACE.g:1979:1: ruleGSSIfaceUartProtocolPower returns [Enumerator current=null] : ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) ) ;
    public final Enumerator ruleGSSIfaceUartProtocolPower() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:1985:2: ( ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) ) )
            // InternalIFACE.g:1986:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) )
            {
            // InternalIFACE.g:1986:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt20=1;
                }
                break;
            case 66:
                {
                alt20=2;
                }
                break;
            case 68:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalIFACE.g:1987:3: (enumLiteral_0= 'no' )
                    {
                    // InternalIFACE.g:1987:3: (enumLiteral_0= 'no' )
                    // InternalIFACE.g:1988:4: enumLiteral_0= 'no'
                    {
                    enumLiteral_0=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartProtocolPowerAccess().getNoEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1995:3: (enumLiteral_1= '2bits' )
                    {
                    // InternalIFACE.g:1995:3: (enumLiteral_1= '2bits' )
                    // InternalIFACE.g:1996:4: enumLiteral_1= '2bits'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:2003:3: (enumLiteral_2= '2_with_0' )
                    {
                    // InternalIFACE.g:2003:3: (enumLiteral_2= '2_with_0' )
                    // InternalIFACE.g:2004:4: enumLiteral_2= '2_with_0'
                    {
                    enumLiteral_2=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSIfaceUartProtocolPower"

    // $ANTLR start synpred2_InternalIFACE
    public final void synpred2_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_uri_6_0 = null;


        // InternalIFACE.g:239:4: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) )
        // InternalIFACE.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        {
        // InternalIFACE.g:239:4: ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) )
        // InternalIFACE.g:240:5: {...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalIFACE.g:240:115: ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) )
        // InternalIFACE.g:241:6: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0);
        // InternalIFACE.g:244:9: ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) )
        // InternalIFACE.g:244:10: {...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalIFACE", "true");
        }
        // InternalIFACE.g:244:19: (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' )
        // InternalIFACE.g:244:20: otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';'
        {
        otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_6); if (state.failed) return ;
        // InternalIFACE.g:252:9: ( (lv_uri_6_0= ruleQualifiedName ) )
        // InternalIFACE.g:253:10: (lv_uri_6_0= ruleQualifiedName )
        {
        // InternalIFACE.g:253:10: (lv_uri_6_0= ruleQualifiedName )
        // InternalIFACE.g:254:11: lv_uri_6_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getUriQualifiedNameParserRuleCall_3_0_2_0());
          										
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
    // $ANTLR end synpred2_InternalIFACE

    // $ANTLR start synpred3_InternalIFACE
    public final void synpred3_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_version_10_0 = null;


        // InternalIFACE.g:281:4: ( ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) )
        // InternalIFACE.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        {
        // InternalIFACE.g:281:4: ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) )
        // InternalIFACE.g:282:5: {...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalIFACE.g:282:115: ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) )
        // InternalIFACE.g:283:6: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1);
        // InternalIFACE.g:286:9: ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) )
        // InternalIFACE.g:286:10: {...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalIFACE", "true");
        }
        // InternalIFACE.g:286:19: (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' )
        // InternalIFACE.g:286:20: otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';'
        {
        otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_9=(Token)match(input,17,FollowSets000.FOLLOW_11); if (state.failed) return ;
        // InternalIFACE.g:294:9: ( (lv_version_10_0= ruleVersion ) )
        // InternalIFACE.g:295:10: (lv_version_10_0= ruleVersion )
        {
        // InternalIFACE.g:295:10: (lv_version_10_0= ruleVersion )
        // InternalIFACE.g:296:11: lv_version_10_0= ruleVersion
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getVersionVersionParserRuleCall_3_1_2_0());
          										
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
    // $ANTLR end synpred3_InternalIFACE

    // Delegated rules

    public final boolean synpred2_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalIFACE_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000500004150000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0038000000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00040000000000C0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1F00000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000080000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000080L});
    }


}