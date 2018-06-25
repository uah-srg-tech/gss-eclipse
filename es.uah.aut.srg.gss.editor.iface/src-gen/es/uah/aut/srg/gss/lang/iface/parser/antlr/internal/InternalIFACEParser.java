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
    // InternalIFACE.g:195:1: ruleGSSIfacePortConfig returns [EObject current=null] : (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' otherlv_14= ';' ) ;
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

        EObject lv_port_12_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalIFACE.g:204:2: ( (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' otherlv_14= ';' ) )
            // InternalIFACE.g:205:2: (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' otherlv_14= ';' )
            {
            // InternalIFACE.g:205:2: (otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' otherlv_14= ';' )
            // InternalIFACE.g:206:3: otherlv_0= 'portConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' otherlv_14= ';'
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
            // InternalIFACE.g:232:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) ) )
            // InternalIFACE.g:233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) )
            {
            // InternalIFACE.g:233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?) )
            // InternalIFACE.g:234:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3());
            // InternalIFACE.g:237:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?)
            // InternalIFACE.g:238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+ {...}?
            {
            // InternalIFACE.g:238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'uri' otherlv_5= ':=' ( (lv_uri_6_0= ruleQualifiedName ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'version' otherlv_9= ':=' ( (lv_version_10_0= ruleVersion ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt2=3;
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
            	case 3 :
            	    // InternalIFACE.g:323:4: ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) )
            	    {
            	    // InternalIFACE.g:323:4: ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) )
            	    // InternalIFACE.g:324:5: {...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfacePortConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalIFACE.g:324:115: ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) )
            	    // InternalIFACE.g:325:6: ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2);
            	    // InternalIFACE.g:328:9: ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) )
            	    // InternalIFACE.g:328:10: {...}? => ( (lv_port_12_0= ruleGSSIfacePort ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfacePortConfig", "true");
            	    }
            	    // InternalIFACE.g:328:19: ( (lv_port_12_0= ruleGSSIfacePort ) )
            	    // InternalIFACE.g:328:20: (lv_port_12_0= ruleGSSIfacePort )
            	    {
            	    // InternalIFACE.g:328:20: (lv_port_12_0= ruleGSSIfacePort )
            	    // InternalIFACE.g:329:10: lv_port_12_0= ruleGSSIfacePort
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getPortGSSIfacePortParserRuleCall_3_2_0());
            	      									
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_port_12_0=ruleGSSIfacePort();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getGSSIfacePortConfigRule());
            	      										}
            	      										set(
            	      											current,
            	      											"port",
            	      											lv_port_12_0,
            	      											"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePort");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

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

            otherlv_13=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getGSSIfacePortConfigAccess().getRightCurlyBracketKeyword_4());
              		
            }
            otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getGSSIfacePortConfigAccess().getSemicolonKeyword_5());
              		
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
    // InternalIFACE.g:374:1: entryRuleGSSIfacePort returns [EObject current=null] : iv_ruleGSSIfacePort= ruleGSSIfacePort EOF ;
    public final EObject entryRuleGSSIfacePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfacePort = null;


        try {
            // InternalIFACE.g:374:53: (iv_ruleGSSIfacePort= ruleGSSIfacePort EOF )
            // InternalIFACE.g:375:2: iv_ruleGSSIfacePort= ruleGSSIfacePort EOF
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
    // InternalIFACE.g:381:1: ruleGSSIfacePort returns [EObject current=null] : (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort ) ;
    public final EObject ruleGSSIfacePort() throws RecognitionException {
        EObject current = null;

        EObject this_GSSIfaceSpWPort_0 = null;

        EObject this_GSSIfaceUartPort_1 = null;

        EObject this_GSSIfaceSpWTCPort_2 = null;

        EObject this_GSSIfaceDummyPort_3 = null;



        	enterRule();

        try {
            // InternalIFACE.g:387:2: ( (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort ) )
            // InternalIFACE.g:388:2: (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort )
            {
            // InternalIFACE.g:388:2: (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort )
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
                    // InternalIFACE.g:389:3: this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort
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
                    // InternalIFACE.g:401:3: this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort
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
                    // InternalIFACE.g:413:3: this_GSSIfaceSpWTCPort_2= ruleGSSIfaceSpWTCPort
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
                    // InternalIFACE.g:425:3: this_GSSIfaceDummyPort_3= ruleGSSIfaceDummyPort
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
    // InternalIFACE.g:440:1: entryRuleGSSIfaceSpWPort returns [EObject current=null] : iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF ;
    public final EObject entryRuleGSSIfaceSpWPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSpWPort = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:444:2: (iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF )
            // InternalIFACE.g:445:2: iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF
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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSpWPort"


    // $ANTLR start "ruleGSSIfaceSpWPort"
    // InternalIFACE.g:454:1: ruleGSSIfaceSpWPort returns [EObject current=null] : (otherlv_0= 'spwPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' otherlv_17= ';' ) ;
    public final EObject ruleGSSIfaceSpWPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_link_9_0 = null;

        AntlrDatatypeRuleToken lv_writingPort_13_0 = null;

        EObject lv_readingPort_15_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:463:2: ( (otherlv_0= 'spwPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' otherlv_17= ';' ) )
            // InternalIFACE.g:464:2: (otherlv_0= 'spwPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' otherlv_17= ';' )
            {
            // InternalIFACE.g:464:2: (otherlv_0= 'spwPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' otherlv_17= ';' )
            // InternalIFACE.g:465:3: otherlv_0= 'spwPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) ) ) otherlv_16= '}' otherlv_17= ';'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSpWPortAccess().getSpwPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSpWPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:473:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) ) )
            // InternalIFACE.g:474:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) )
            {
            // InternalIFACE.g:474:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?) )
            // InternalIFACE.g:475:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());
            // InternalIFACE.g:478:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?)
            // InternalIFACE.g:479:6: ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+ {...}?
            {
            // InternalIFACE.g:479:6: ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalIFACE.g:480:4: ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:480:4: ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) )
            	    // InternalIFACE.g:481:5: {...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalIFACE.g:481:112: ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) )
            	    // InternalIFACE.g:482:6: ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0);
            	    // InternalIFACE.g:485:9: ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) )
            	    // InternalIFACE.g:485:10: {...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "true");
            	    }
            	    // InternalIFACE.g:485:19: (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' )
            	    // InternalIFACE.g:485:20: otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSpWPortAccess().getTypeKeyword_2_0_0());
            	      								
            	    }
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_0_1());
            	      								
            	    }
            	    // InternalIFACE.g:493:9: ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) )
            	    // InternalIFACE.g:494:10: (lv_type_5_0= ruleGSSIfaceSpWPortType )
            	    {
            	    // InternalIFACE.g:494:10: (lv_type_5_0= ruleGSSIfaceSpWPortType )
            	    // InternalIFACE.g:495:11: lv_type_5_0= ruleGSSIfaceSpWPortType
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_type_5_0=ruleGSSIfaceSpWPortType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"type",
            	      												lv_type_5_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSpWPortType");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIFACE.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    // InternalIFACE.g:523:5: {...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalIFACE.g:523:112: ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    // InternalIFACE.g:524:6: ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1);
            	    // InternalIFACE.g:527:9: ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    // InternalIFACE.g:527:10: {...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "true");
            	    }
            	    // InternalIFACE.g:527:19: (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    // InternalIFACE.g:527:20: otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSpWPortAccess().getLinkKeyword_2_1_0());
            	      								
            	    }
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_1_1());
            	      								
            	    }
            	    // InternalIFACE.g:535:9: ( (lv_link_9_0= ruleINTEGER ) )
            	    // InternalIFACE.g:536:10: (lv_link_9_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:536:10: (lv_link_9_0= ruleINTEGER )
            	    // InternalIFACE.g:537:11: lv_link_9_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_2_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_link_9_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"link",
            	      												lv_link_9_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIFACE.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) )
            	    // InternalIFACE.g:565:5: {...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalIFACE.g:565:112: ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) )
            	    // InternalIFACE.g:566:6: ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2);
            	    // InternalIFACE.g:569:9: ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) )
            	    // InternalIFACE.g:569:10: {...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "true");
            	    }
            	    // InternalIFACE.g:569:19: (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' )
            	    // InternalIFACE.g:569:20: otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortKeyword_2_2_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSIfaceSpWPortAccess().getColonEqualsSignKeyword_2_2_1());
            	      								
            	    }
            	    // InternalIFACE.g:577:9: ( (lv_writingPort_13_0= ruleINTEGER ) )
            	    // InternalIFACE.g:578:10: (lv_writingPort_13_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:578:10: (lv_writingPort_13_0= ruleINTEGER )
            	    // InternalIFACE.g:579:11: lv_writingPort_13_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_2_2_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_writingPort_13_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"writingPort",
            	      												lv_writingPort_13_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_14, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_2_2_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIFACE.g:606:4: ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) )
            	    {
            	    // InternalIFACE.g:606:4: ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) )
            	    // InternalIFACE.g:607:5: {...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalIFACE.g:607:112: ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ )
            	    // InternalIFACE.g:608:6: ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3);
            	    // InternalIFACE.g:611:9: ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==24) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((synpred11_InternalIFACE()&&(true))) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalIFACE.g:611:10: {...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "true");
            	    	    }
            	    	    // InternalIFACE.g:611:19: ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) )
            	    	    // InternalIFACE.g:611:20: (lv_readingPort_15_0= ruleGSSIfaceReadingPort )
            	    	    {
            	    	    // InternalIFACE.g:611:20: (lv_readingPort_15_0= ruleGSSIfaceReadingPort )
            	    	    // InternalIFACE.g:612:10: lv_readingPort_15_0= ruleGSSIfaceReadingPort
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_14);
            	    	    lv_readingPort_15_0=ruleGSSIfaceReadingPort();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										if (current==null) {
            	    	      											current = createModelElementForParent(grammarAccess.getGSSIfaceSpWPortRule());
            	    	      										}
            	    	      										add(
            	    	      											current,
            	    	      											"readingPort",
            	    	      											lv_readingPort_15_0,
            	    	      											"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceReadingPort");
            	    	      										afterParserOrEnumRuleCall();
            	    	      									
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSIfaceSpWPort", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2());

            }

            otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSIfaceSpWPortAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_17=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getGSSIfaceSpWPortAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSIfaceSpWPort"


    // $ANTLR start "entryRuleGSSIfaceReadingPort"
    // InternalIFACE.g:657:1: entryRuleGSSIfaceReadingPort returns [EObject current=null] : iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF ;
    public final EObject entryRuleGSSIfaceReadingPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceReadingPort = null;


        try {
            // InternalIFACE.g:657:60: (iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF )
            // InternalIFACE.g:658:2: iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF
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
    // InternalIFACE.g:664:1: ruleGSSIfaceReadingPort returns [EObject current=null] : (otherlv_0= 'readingPort' otherlv_1= '{' (otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalIFACE.g:670:2: ( (otherlv_0= 'readingPort' otherlv_1= '{' (otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:671:2: (otherlv_0= 'readingPort' otherlv_1= '{' (otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:671:2: (otherlv_0= 'readingPort' otherlv_1= '{' (otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:672:3: otherlv_0= 'readingPort' otherlv_1= '{' (otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceReadingPortAccess().getReadingPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceReadingPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:680:3: (otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' )
            // InternalIFACE.g:681:4: otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';'
            {
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getGSSIfaceReadingPortAccess().getPortKeyword_2_0());
              			
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getGSSIfaceReadingPortAccess().getColonEqualsSignKeyword_2_1());
              			
            }
            // InternalIFACE.g:689:4: ( (lv_port_4_0= ruleINTEGER ) )
            // InternalIFACE.g:690:5: (lv_port_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:690:5: (lv_port_4_0= ruleINTEGER )
            // InternalIFACE.g:691:6: lv_port_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getGSSIfaceReadingPortAccess().getPortINTEGERParserRuleCall_2_2_0());
              					
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_2_3());
              			
            }

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceReadingPortAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceReadingPortAccess().getSemicolonKeyword_4());
              		
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
    // InternalIFACE.g:725:1: entryRuleGSSIfaceUartPort returns [EObject current=null] : iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF ;
    public final EObject entryRuleGSSIfaceUartPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceUartPort = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:729:2: (iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF )
            // InternalIFACE.g:730:2: iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF
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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceUartPort"


    // $ANTLR start "ruleGSSIfaceUartPort"
    // InternalIFACE.g:739:1: ruleGSSIfaceUartPort returns [EObject current=null] : (otherlv_0= 'uartPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' otherlv_33= ';' ) ;
    public final EObject ruleGSSIfaceUartPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        AntlrDatatypeRuleToken lv_number_5_0 = null;

        Enumerator lv_baudRate_9_0 = null;

        Enumerator lv_parity_13_0 = null;

        Enumerator lv_dataBits_17_0 = null;

        Enumerator lv_stopBits_21_0 = null;

        AntlrDatatypeRuleToken lv_inputQueueSize_25_0 = null;

        AntlrDatatypeRuleToken lv_outputQueueSize_29_0 = null;

        EObject lv_uartProtocol_31_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:748:2: ( (otherlv_0= 'uartPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' otherlv_33= ';' ) )
            // InternalIFACE.g:749:2: (otherlv_0= 'uartPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' otherlv_33= ';' )
            {
            // InternalIFACE.g:749:2: (otherlv_0= 'uartPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' otherlv_33= ';' )
            // InternalIFACE.g:750:3: otherlv_0= 'uartPort' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) ) ) otherlv_32= '}' otherlv_33= ';'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceUartPortAccess().getUartPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceUartPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:758:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) ) )
            // InternalIFACE.g:759:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) )
            {
            // InternalIFACE.g:759:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?) )
            // InternalIFACE.g:760:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());
            // InternalIFACE.g:763:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?)
            // InternalIFACE.g:764:6: ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+ {...}?
            {
            // InternalIFACE.g:764:6: ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=9;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalIFACE.g:765:4: ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:765:4: ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    // InternalIFACE.g:766:5: {...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalIFACE.g:766:113: ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    // InternalIFACE.g:767:6: ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0);
            	    // InternalIFACE.g:770:9: ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    // InternalIFACE.g:770:10: {...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:770:19: (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    // InternalIFACE.g:770:20: otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getGSSIfaceUartPortAccess().getNumberKeyword_2_0_0());
            	      								
            	    }
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_0_1());
            	      								
            	    }
            	    // InternalIFACE.g:778:9: ( (lv_number_5_0= ruleINTEGER ) )
            	    // InternalIFACE.g:779:10: (lv_number_5_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:779:10: (lv_number_5_0= ruleINTEGER )
            	    // InternalIFACE.g:780:11: lv_number_5_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_2_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_number_5_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"number",
            	      												lv_number_5_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIFACE.g:807:4: ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:807:4: ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) )
            	    // InternalIFACE.g:808:5: {...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalIFACE.g:808:113: ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) )
            	    // InternalIFACE.g:809:6: ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1);
            	    // InternalIFACE.g:812:9: ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) )
            	    // InternalIFACE.g:812:10: {...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:812:19: (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' )
            	    // InternalIFACE.g:812:20: otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSIfaceUartPortAccess().getBaudRateKeyword_2_1_0());
            	      								
            	    }
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_1_1());
            	      								
            	    }
            	    // InternalIFACE.g:820:9: ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) )
            	    // InternalIFACE.g:821:10: (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate )
            	    {
            	    // InternalIFACE.g:821:10: (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate )
            	    // InternalIFACE.g:822:11: lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_baudRate_9_0=ruleGSSIfaceUartPortBaudRate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"baudRate",
            	      												lv_baudRate_9_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortBaudRate");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIFACE.g:849:4: ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:849:4: ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) )
            	    // InternalIFACE.g:850:5: {...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalIFACE.g:850:113: ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) )
            	    // InternalIFACE.g:851:6: ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2);
            	    // InternalIFACE.g:854:9: ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) )
            	    // InternalIFACE.g:854:10: {...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:854:19: (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' )
            	    // InternalIFACE.g:854:20: otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getGSSIfaceUartPortAccess().getParityKeyword_2_2_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_2_1());
            	      								
            	    }
            	    // InternalIFACE.g:862:9: ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) )
            	    // InternalIFACE.g:863:10: (lv_parity_13_0= ruleGSSIfaceUartPortParity )
            	    {
            	    // InternalIFACE.g:863:10: (lv_parity_13_0= ruleGSSIfaceUartPortParity )
            	    // InternalIFACE.g:864:11: lv_parity_13_0= ruleGSSIfaceUartPortParity
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_parity_13_0=ruleGSSIfaceUartPortParity();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"parity",
            	      												lv_parity_13_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortParity");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_14, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_2_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIFACE.g:891:4: ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:891:4: ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) )
            	    // InternalIFACE.g:892:5: {...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalIFACE.g:892:113: ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) )
            	    // InternalIFACE.g:893:6: ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3);
            	    // InternalIFACE.g:896:9: ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) )
            	    // InternalIFACE.g:896:10: {...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:896:19: (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' )
            	    // InternalIFACE.g:896:20: otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';'
            	    {
            	    otherlv_15=(Token)match(input,30,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getGSSIfaceUartPortAccess().getDataBitsKeyword_2_3_0());
            	      								
            	    }
            	    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_3_1());
            	      								
            	    }
            	    // InternalIFACE.g:904:9: ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) )
            	    // InternalIFACE.g:905:10: (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits )
            	    {
            	    // InternalIFACE.g:905:10: (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits )
            	    // InternalIFACE.g:906:11: lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_dataBits_17_0=ruleGSSIfaceUartPortDataBits();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"dataBits",
            	      												lv_dataBits_17_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortDataBits");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_18, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_3_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIFACE.g:933:4: ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:933:4: ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) )
            	    // InternalIFACE.g:934:5: {...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalIFACE.g:934:113: ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) )
            	    // InternalIFACE.g:935:6: ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4);
            	    // InternalIFACE.g:938:9: ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) )
            	    // InternalIFACE.g:938:10: {...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:938:19: (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' )
            	    // InternalIFACE.g:938:20: otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';'
            	    {
            	    otherlv_19=(Token)match(input,31,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getGSSIfaceUartPortAccess().getStopBitsKeyword_2_4_0());
            	      								
            	    }
            	    otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_4_1());
            	      								
            	    }
            	    // InternalIFACE.g:946:9: ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) )
            	    // InternalIFACE.g:947:10: (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits )
            	    {
            	    // InternalIFACE.g:947:10: (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits )
            	    // InternalIFACE.g:948:11: lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_stopBits_21_0=ruleGSSIfaceUartPortStopBits();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"stopBits",
            	      												lv_stopBits_21_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortStopBits");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_22, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_4_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIFACE.g:975:4: ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:975:4: ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) )
            	    // InternalIFACE.g:976:5: {...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalIFACE.g:976:113: ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) )
            	    // InternalIFACE.g:977:6: ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5);
            	    // InternalIFACE.g:980:9: ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) )
            	    // InternalIFACE.g:980:10: {...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:980:19: (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' )
            	    // InternalIFACE.g:980:20: otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';'
            	    {
            	    otherlv_23=(Token)match(input,32,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_23, grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeKeyword_2_5_0());
            	      								
            	    }
            	    otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_24, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_5_1());
            	      								
            	    }
            	    // InternalIFACE.g:988:9: ( (lv_inputQueueSize_25_0= ruleINTEGER ) )
            	    // InternalIFACE.g:989:10: (lv_inputQueueSize_25_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:989:10: (lv_inputQueueSize_25_0= ruleINTEGER )
            	    // InternalIFACE.g:990:11: lv_inputQueueSize_25_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_2_5_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_inputQueueSize_25_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"inputQueueSize",
            	      												lv_inputQueueSize_25_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_26, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_5_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalIFACE.g:1017:4: ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1017:4: ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) )
            	    // InternalIFACE.g:1018:5: {...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalIFACE.g:1018:113: ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) )
            	    // InternalIFACE.g:1019:6: ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6);
            	    // InternalIFACE.g:1022:9: ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) )
            	    // InternalIFACE.g:1022:10: {...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:1022:19: (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' )
            	    // InternalIFACE.g:1022:20: otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';'
            	    {
            	    otherlv_27=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_27, grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeKeyword_2_6_0());
            	      								
            	    }
            	    otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_28, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_2_6_1());
            	      								
            	    }
            	    // InternalIFACE.g:1030:9: ( (lv_outputQueueSize_29_0= ruleINTEGER ) )
            	    // InternalIFACE.g:1031:10: (lv_outputQueueSize_29_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:1031:10: (lv_outputQueueSize_29_0= ruleINTEGER )
            	    // InternalIFACE.g:1032:11: lv_outputQueueSize_29_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_2_6_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_outputQueueSize_29_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      											}
            	      											set(
            	      												current,
            	      												"outputQueueSize",
            	      												lv_outputQueueSize_29_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_30=(Token)match(input,13,FollowSets000.FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_30, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_2_6_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalIFACE.g:1059:4: ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) )
            	    {
            	    // InternalIFACE.g:1059:4: ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) )
            	    // InternalIFACE.g:1060:5: {...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalIFACE.g:1060:113: ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) )
            	    // InternalIFACE.g:1061:6: ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7);
            	    // InternalIFACE.g:1064:9: ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) )
            	    // InternalIFACE.g:1064:10: {...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "true");
            	    }
            	    // InternalIFACE.g:1064:19: ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) )
            	    // InternalIFACE.g:1064:20: (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol )
            	    {
            	    // InternalIFACE.g:1064:20: (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol )
            	    // InternalIFACE.g:1065:10: lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0());
            	      									
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_uartProtocol_31_0=ruleGSSIfaceUartProtocol();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
            	      										}
            	      										set(
            	      											current,
            	      											"uartProtocol",
            	      											lv_uartProtocol_31_0,
            	      											"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocol");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSIfaceUartPort", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2());

            }

            otherlv_32=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_32, grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_33=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_33, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSIfaceUartPort"


    // $ANTLR start "entryRuleGSSIfaceUartProtocol"
    // InternalIFACE.g:1110:1: entryRuleGSSIfaceUartProtocol returns [EObject current=null] : iv_ruleGSSIfaceUartProtocol= ruleGSSIfaceUartProtocol EOF ;
    public final EObject entryRuleGSSIfaceUartProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceUartProtocol = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1114:2: (iv_ruleGSSIfaceUartProtocol= ruleGSSIfaceUartProtocol EOF )
            // InternalIFACE.g:1115:2: iv_ruleGSSIfaceUartProtocol= ruleGSSIfaceUartProtocol EOF
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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceUartProtocol"


    // $ANTLR start "ruleGSSIfaceUartProtocol"
    // InternalIFACE.g:1124:1: ruleGSSIfaceUartProtocol returns [EObject current=null] : (otherlv_0= 'uartProtocol' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' ) ;
    public final EObject ruleGSSIfaceUartProtocol() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_unit_5_0 = null;

        Enumerator lv_power_9_0 = null;

        EObject lv_constSize_11_0 = null;

        EObject lv_sizeFieldOffset_12_0 = null;

        EObject lv_sizeFieldTrim_13_0 = null;

        EObject lv_syncPattern_14_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1133:2: ( (otherlv_0= 'uartProtocol' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' ) )
            // InternalIFACE.g:1134:2: (otherlv_0= 'uartProtocol' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalIFACE.g:1134:2: (otherlv_0= 'uartProtocol' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';' )
            // InternalIFACE.g:1135:3: otherlv_0= 'uartProtocol' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceUartProtocolAccess().getUartProtocolKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceUartProtocolAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:1143:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) ) )
            // InternalIFACE.g:1144:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) )
            {
            // InternalIFACE.g:1144:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?) )
            // InternalIFACE.g:1145:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());
            // InternalIFACE.g:1148:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?)
            // InternalIFACE.g:1149:6: ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+ {...}?
            {
            // InternalIFACE.g:1149:6: ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=7;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
                    alt7=4;
                }
                else if ( LA7_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
                    alt7=5;
                }
                else if ( LA7_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
                    alt7=6;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalIFACE.g:1150:4: ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1150:4: ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) )
            	    // InternalIFACE.g:1151:5: {...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalIFACE.g:1151:117: ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) )
            	    // InternalIFACE.g:1152:6: ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0);
            	    // InternalIFACE.g:1155:9: ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) )
            	    // InternalIFACE.g:1155:10: {...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "true");
            	    }
            	    // InternalIFACE.g:1155:19: (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' )
            	    // InternalIFACE.g:1155:20: otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getGSSIfaceUartProtocolAccess().getUnitKeyword_2_0_0());
            	      								
            	    }
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_0_1());
            	      								
            	    }
            	    // InternalIFACE.g:1163:9: ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) )
            	    // InternalIFACE.g:1164:10: (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit )
            	    {
            	    // InternalIFACE.g:1164:10: (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit )
            	    // InternalIFACE.g:1165:11: lv_unit_5_0= ruleGSSIfaceUartProtocolUnit
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_unit_5_0=ruleGSSIfaceUartProtocolUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
            	      											}
            	      											set(
            	      												current,
            	      												"unit",
            	      												lv_unit_5_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolUnit");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIFACE.g:1192:4: ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1192:4: ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) )
            	    // InternalIFACE.g:1193:5: {...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalIFACE.g:1193:117: ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) )
            	    // InternalIFACE.g:1194:6: ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1);
            	    // InternalIFACE.g:1197:9: ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) )
            	    // InternalIFACE.g:1197:10: {...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "true");
            	    }
            	    // InternalIFACE.g:1197:19: (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' )
            	    // InternalIFACE.g:1197:20: otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSIfaceUartProtocolAccess().getPowerKeyword_2_1_0());
            	      								
            	    }
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSIfaceUartProtocolAccess().getColonEqualsSignKeyword_2_1_1());
            	      								
            	    }
            	    // InternalIFACE.g:1205:9: ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) )
            	    // InternalIFACE.g:1206:10: (lv_power_9_0= ruleGSSIfaceUartProtocolPower )
            	    {
            	    // InternalIFACE.g:1206:10: (lv_power_9_0= ruleGSSIfaceUartProtocolPower )
            	    // InternalIFACE.g:1207:11: lv_power_9_0= ruleGSSIfaceUartProtocolPower
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_power_9_0=ruleGSSIfaceUartProtocolPower();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
            	      											}
            	      											set(
            	      												current,
            	      												"power",
            	      												lv_power_9_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartProtocolPower");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_2_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalIFACE.g:1234:4: ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) )
            	    {
            	    // InternalIFACE.g:1234:4: ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) )
            	    // InternalIFACE.g:1235:5: {...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalIFACE.g:1235:117: ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) )
            	    // InternalIFACE.g:1236:6: ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2);
            	    // InternalIFACE.g:1239:9: ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) )
            	    // InternalIFACE.g:1239:10: {...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "true");
            	    }
            	    // InternalIFACE.g:1239:19: ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) )
            	    // InternalIFACE.g:1239:20: (lv_constSize_11_0= ruleGSSIfaceConstSize )
            	    {
            	    // InternalIFACE.g:1239:20: (lv_constSize_11_0= ruleGSSIfaceConstSize )
            	    // InternalIFACE.g:1240:10: lv_constSize_11_0= ruleGSSIfaceConstSize
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0());
            	      									
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_constSize_11_0=ruleGSSIfaceConstSize();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
            	      										}
            	      										set(
            	      											current,
            	      											"constSize",
            	      											lv_constSize_11_0,
            	      											"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceConstSize");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalIFACE.g:1262:4: ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) )
            	    {
            	    // InternalIFACE.g:1262:4: ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) )
            	    // InternalIFACE.g:1263:5: {...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalIFACE.g:1263:117: ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) )
            	    // InternalIFACE.g:1264:6: ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3);
            	    // InternalIFACE.g:1267:9: ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) )
            	    // InternalIFACE.g:1267:10: {...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "true");
            	    }
            	    // InternalIFACE.g:1267:19: ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) )
            	    // InternalIFACE.g:1267:20: (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset )
            	    {
            	    // InternalIFACE.g:1267:20: (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset )
            	    // InternalIFACE.g:1268:10: lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0());
            	      									
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_sizeFieldOffset_12_0=ruleGSSIfaceSizeFieldOffset();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
            	      										}
            	      										set(
            	      											current,
            	      											"sizeFieldOffset",
            	      											lv_sizeFieldOffset_12_0,
            	      											"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldOffset");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalIFACE.g:1290:4: ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) )
            	    {
            	    // InternalIFACE.g:1290:4: ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) )
            	    // InternalIFACE.g:1291:5: {...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalIFACE.g:1291:117: ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) )
            	    // InternalIFACE.g:1292:6: ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4);
            	    // InternalIFACE.g:1295:9: ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) )
            	    // InternalIFACE.g:1295:10: {...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "true");
            	    }
            	    // InternalIFACE.g:1295:19: ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) )
            	    // InternalIFACE.g:1295:20: (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim )
            	    {
            	    // InternalIFACE.g:1295:20: (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim )
            	    // InternalIFACE.g:1296:10: lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0());
            	      									
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_sizeFieldTrim_13_0=ruleGSSIfaceSizeFieldTrim();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
            	      										}
            	      										set(
            	      											current,
            	      											"sizeFieldTrim",
            	      											lv_sizeFieldTrim_13_0,
            	      											"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSizeFieldTrim");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalIFACE.g:1318:4: ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) )
            	    {
            	    // InternalIFACE.g:1318:4: ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) )
            	    // InternalIFACE.g:1319:5: {...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalIFACE.g:1319:117: ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) )
            	    // InternalIFACE.g:1320:6: ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5);
            	    // InternalIFACE.g:1323:9: ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) )
            	    // InternalIFACE.g:1323:10: {...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "true");
            	    }
            	    // InternalIFACE.g:1323:19: ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) )
            	    // InternalIFACE.g:1323:20: (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern )
            	    {
            	    // InternalIFACE.g:1323:20: (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern )
            	    // InternalIFACE.g:1324:10: lv_syncPattern_14_0= ruleGSSIfaceSyncPattern
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0());
            	      									
            	    }
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    lv_syncPattern_14_0=ruleGSSIfaceSyncPattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getGSSIfaceUartProtocolRule());
            	      										}
            	      										set(
            	      											current,
            	      											"syncPattern",
            	      											lv_syncPattern_14_0,
            	      											"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceSyncPattern");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSIfaceUartProtocol", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2());

            }

            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSIfaceUartProtocolAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_16=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getGSSIfaceUartProtocolAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSIfaceUartProtocol"


    // $ANTLR start "entryRuleGSSIfaceConstSize"
    // InternalIFACE.g:1369:1: entryRuleGSSIfaceConstSize returns [EObject current=null] : iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF ;
    public final EObject entryRuleGSSIfaceConstSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceConstSize = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1373:2: (iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF )
            // InternalIFACE.g:1374:2: iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF
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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceConstSize"


    // $ANTLR start "ruleGSSIfaceConstSize"
    // InternalIFACE.g:1383:1: ruleGSSIfaceConstSize returns [EObject current=null] : (otherlv_0= 'constSize' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSIfaceConstSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_bytes_5_0 = null;

        AntlrDatatypeRuleToken lv_bits_9_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1392:2: ( (otherlv_0= 'constSize' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' ) )
            // InternalIFACE.g:1393:2: (otherlv_0= 'constSize' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalIFACE.g:1393:2: (otherlv_0= 'constSize' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' )
            // InternalIFACE.g:1394:3: otherlv_0= 'constSize' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:1402:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) )
            // InternalIFACE.g:1403:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalIFACE.g:1403:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            // InternalIFACE.g:1404:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());
            // InternalIFACE.g:1407:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            // InternalIFACE.g:1408:6: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?
            {
            // InternalIFACE.g:1408:6: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalIFACE.g:1409:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1409:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    // InternalIFACE.g:1410:5: {...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceConstSize", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalIFACE.g:1410:114: ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    // InternalIFACE.g:1411:6: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0);
            	    // InternalIFACE.g:1414:9: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    // InternalIFACE.g:1414:10: {...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceConstSize", "true");
            	    }
            	    // InternalIFACE.g:1414:19: (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    // InternalIFACE.g:1414:20: otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2_0_0());
            	      								
            	    }
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_0_1());
            	      								
            	    }
            	    // InternalIFACE.g:1422:9: ( (lv_bytes_5_0= ruleINTEGER ) )
            	    // InternalIFACE.g:1423:10: (lv_bytes_5_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:1423:10: (lv_bytes_5_0= ruleINTEGER )
            	    // InternalIFACE.g:1424:11: lv_bytes_5_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_2_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_bytes_5_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceConstSizeRule());
            	      											}
            	      											set(
            	      												current,
            	      												"bytes",
            	      												lv_bytes_5_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIFACE.g:1451:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1451:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    // InternalIFACE.g:1452:5: {...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceConstSize", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalIFACE.g:1452:114: ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    // InternalIFACE.g:1453:6: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1);
            	    // InternalIFACE.g:1456:9: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    // InternalIFACE.g:1456:10: {...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceConstSize", "true");
            	    }
            	    // InternalIFACE.g:1456:19: (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    // InternalIFACE.g:1456:20: otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_2_1_0());
            	      								
            	    }
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_2_1_1());
            	      								
            	    }
            	    // InternalIFACE.g:1464:9: ( (lv_bits_9_0= ruleINTEGER ) )
            	    // InternalIFACE.g:1465:10: (lv_bits_9_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:1465:10: (lv_bits_9_0= ruleINTEGER )
            	    // InternalIFACE.g:1466:11: lv_bits_9_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_2_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_bits_9_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceConstSizeRule());
            	      											}
            	      											set(
            	      												current,
            	      												"bits",
            	      												lv_bits_9_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_2_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSIfaceConstSize", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2());

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceConstSizeAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSIfaceConstSize"


    // $ANTLR start "entryRuleGSSIfaceSizeFieldOffset"
    // InternalIFACE.g:1516:1: entryRuleGSSIfaceSizeFieldOffset returns [EObject current=null] : iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF ;
    public final EObject entryRuleGSSIfaceSizeFieldOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSizeFieldOffset = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1520:2: (iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF )
            // InternalIFACE.g:1521:2: iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF
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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSizeFieldOffset"


    // $ANTLR start "ruleGSSIfaceSizeFieldOffset"
    // InternalIFACE.g:1530:1: ruleGSSIfaceSizeFieldOffset returns [EObject current=null] : (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSIfaceSizeFieldOffset() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_bytes_5_0 = null;

        AntlrDatatypeRuleToken lv_bits_9_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1539:2: ( (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' ) )
            // InternalIFACE.g:1540:2: (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalIFACE.g:1540:2: (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' )
            // InternalIFACE.g:1541:3: otherlv_0= 'sizeFieldOffset' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:1549:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) )
            // InternalIFACE.g:1550:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalIFACE.g:1550:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            // InternalIFACE.g:1551:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());
            // InternalIFACE.g:1554:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            // InternalIFACE.g:1555:6: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?
            {
            // InternalIFACE.g:1555:6: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIFACE.g:1556:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1556:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    // InternalIFACE.g:1557:5: {...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldOffset", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalIFACE.g:1557:120: ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    // InternalIFACE.g:1558:6: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0);
            	    // InternalIFACE.g:1561:9: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    // InternalIFACE.g:1561:10: {...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldOffset", "true");
            	    }
            	    // InternalIFACE.g:1561:19: (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    // InternalIFACE.g:1561:20: otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2_0_0());
            	      								
            	    }
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_0_1());
            	      								
            	    }
            	    // InternalIFACE.g:1569:9: ( (lv_bytes_5_0= ruleINTEGER ) )
            	    // InternalIFACE.g:1570:10: (lv_bytes_5_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:1570:10: (lv_bytes_5_0= ruleINTEGER )
            	    // InternalIFACE.g:1571:11: lv_bytes_5_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_2_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_bytes_5_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldOffsetRule());
            	      											}
            	      											set(
            	      												current,
            	      												"bytes",
            	      												lv_bytes_5_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIFACE.g:1598:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1598:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    // InternalIFACE.g:1599:5: {...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldOffset", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalIFACE.g:1599:120: ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    // InternalIFACE.g:1600:6: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1);
            	    // InternalIFACE.g:1603:9: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    // InternalIFACE.g:1603:10: {...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldOffset", "true");
            	    }
            	    // InternalIFACE.g:1603:19: (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    // InternalIFACE.g:1603:20: otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_2_1_0());
            	      								
            	    }
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_2_1_1());
            	      								
            	    }
            	    // InternalIFACE.g:1611:9: ( (lv_bits_9_0= ruleINTEGER ) )
            	    // InternalIFACE.g:1612:10: (lv_bits_9_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:1612:10: (lv_bits_9_0= ruleINTEGER )
            	    // InternalIFACE.g:1613:11: lv_bits_9_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_2_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_bits_9_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldOffsetRule());
            	      											}
            	      											set(
            	      												current,
            	      												"bits",
            	      												lv_bits_9_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_2_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldOffset", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2());

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSIfaceSizeFieldOffset"


    // $ANTLR start "entryRuleGSSIfaceSizeFieldTrim"
    // InternalIFACE.g:1663:1: entryRuleGSSIfaceSizeFieldTrim returns [EObject current=null] : iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF ;
    public final EObject entryRuleGSSIfaceSizeFieldTrim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSizeFieldTrim = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1667:2: (iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF )
            // InternalIFACE.g:1668:2: iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF
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

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleGSSIfaceSizeFieldTrim"


    // $ANTLR start "ruleGSSIfaceSizeFieldTrim"
    // InternalIFACE.g:1677:1: ruleGSSIfaceSizeFieldTrim returns [EObject current=null] : (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSIfaceSizeFieldTrim() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_bytes_5_0 = null;

        AntlrDatatypeRuleToken lv_bits_9_0 = null;



        	enterRule();
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()
        	);

        try {
            // InternalIFACE.g:1686:2: ( (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' ) )
            // InternalIFACE.g:1687:2: (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalIFACE.g:1687:2: (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';' )
            // InternalIFACE.g:1688:3: otherlv_0= 'sizeFieldTrim' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:1696:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) ) )
            // InternalIFACE.g:1697:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            {
            // InternalIFACE.g:1697:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?) )
            // InternalIFACE.g:1698:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());
            // InternalIFACE.g:1701:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?)
            // InternalIFACE.g:1702:6: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+ {...}?
            {
            // InternalIFACE.g:1702:6: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalIFACE.g:1703:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1703:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
            	    // InternalIFACE.g:1704:5: {...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldTrim", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalIFACE.g:1704:118: ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
            	    // InternalIFACE.g:1705:6: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0);
            	    // InternalIFACE.g:1708:9: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
            	    // InternalIFACE.g:1708:10: {...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldTrim", "true");
            	    }
            	    // InternalIFACE.g:1708:19: (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
            	    // InternalIFACE.g:1708:20: otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2_0_0());
            	      								
            	    }
            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_4, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_0_1());
            	      								
            	    }
            	    // InternalIFACE.g:1716:9: ( (lv_bytes_5_0= ruleINTEGER ) )
            	    // InternalIFACE.g:1717:10: (lv_bytes_5_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:1717:10: (lv_bytes_5_0= ruleINTEGER )
            	    // InternalIFACE.g:1718:11: lv_bytes_5_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_2_0_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_bytes_5_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldTrimRule());
            	      											}
            	      											set(
            	      												current,
            	      												"bytes",
            	      												lv_bytes_5_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalIFACE.g:1745:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalIFACE.g:1745:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
            	    // InternalIFACE.g:1746:5: {...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldTrim", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalIFACE.g:1746:118: ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
            	    // InternalIFACE.g:1747:6: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1);
            	    // InternalIFACE.g:1750:9: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
            	    // InternalIFACE.g:1750:10: {...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldTrim", "true");
            	    }
            	    // InternalIFACE.g:1750:19: (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
            	    // InternalIFACE.g:1750:20: otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_2_1_0());
            	      								
            	    }
            	    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_2_1_1());
            	      								
            	    }
            	    // InternalIFACE.g:1758:9: ( (lv_bits_9_0= ruleINTEGER ) )
            	    // InternalIFACE.g:1759:10: (lv_bits_9_0= ruleINTEGER )
            	    {
            	    // InternalIFACE.g:1759:10: (lv_bits_9_0= ruleINTEGER )
            	    // InternalIFACE.g:1760:11: lv_bits_9_0= ruleINTEGER
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_2_1_2_0());
            	      										
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_bits_9_0=ruleINTEGER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getGSSIfaceSizeFieldTrimRule());
            	      											}
            	      											set(
            	      												current,
            	      												"bits",
            	      												lv_bits_9_0,
            	      												"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_2_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleGSSIfaceSizeFieldTrim", "getUnorderedGroupHelper().canLeave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2());

            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleGSSIfaceSizeFieldTrim"


    // $ANTLR start "entryRuleGSSIfaceSyncPattern"
    // InternalIFACE.g:1810:1: entryRuleGSSIfaceSyncPattern returns [EObject current=null] : iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF ;
    public final EObject entryRuleGSSIfaceSyncPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSyncPattern = null;


        try {
            // InternalIFACE.g:1810:60: (iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF )
            // InternalIFACE.g:1811:2: iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF
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
    // InternalIFACE.g:1817:1: ruleGSSIfaceSyncPattern returns [EObject current=null] : (otherlv_0= 'syncPattern' otherlv_1= '{' (otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalIFACE.g:1823:2: ( (otherlv_0= 'syncPattern' otherlv_1= '{' (otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:1824:2: (otherlv_0= 'syncPattern' otherlv_1= '{' (otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:1824:2: (otherlv_0= 'syncPattern' otherlv_1= '{' (otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:1825:3: otherlv_0= 'syncPattern' otherlv_1= '{' (otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:1833:3: (otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' )
            // InternalIFACE.g:1834:4: otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';'
            {
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2_0());
              			
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_2_1());
              			
            }
            // InternalIFACE.g:1842:4: ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) )
            // InternalIFACE.g:1843:5: (lv_hexValue_4_0= RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:1843:5: (lv_hexValue_4_0= RULE_HEXADECIMAL )
            // InternalIFACE.g:1844:6: lv_hexValue_4_0= RULE_HEXADECIMAL
            {
            lv_hexValue_4_0=(Token)match(input,RULE_HEXADECIMAL,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(lv_hexValue_4_0, grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueHEXADECIMALTerminalRuleCall_2_2_0());
              					
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_2_3());
              			
            }

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSyncPatternAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSyncPatternAccess().getSemicolonKeyword_4());
              		
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
    // InternalIFACE.g:1877:1: entryRuleGSSIfaceSpWTCPort returns [EObject current=null] : iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF ;
    public final EObject entryRuleGSSIfaceSpWTCPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSpWTCPort = null;


        try {
            // InternalIFACE.g:1877:58: (iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF )
            // InternalIFACE.g:1878:2: iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF
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
    // InternalIFACE.g:1884:1: ruleGSSIfaceSpWTCPort returns [EObject current=null] : (otherlv_0= 'spwTCPort' otherlv_1= '{' (otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalIFACE.g:1890:2: ( (otherlv_0= 'spwTCPort' otherlv_1= '{' (otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:1891:2: (otherlv_0= 'spwTCPort' otherlv_1= '{' (otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:1891:2: (otherlv_0= 'spwTCPort' otherlv_1= '{' (otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:1892:3: otherlv_0= 'spwTCPort' otherlv_1= '{' (otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' ) otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalIFACE.g:1900:3: (otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' )
            // InternalIFACE.g:1901:4: otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';'
            {
            otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2_0());
              			
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_2_1());
              			
            }
            // InternalIFACE.g:1909:4: ( (lv_spwPortRef_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1910:5: (lv_spwPortRef_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1910:5: (lv_spwPortRef_4_0= ruleINTEGER )
            // InternalIFACE.g:1911:6: lv_spwPortRef_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefINTEGERParserRuleCall_2_2_0());
              					
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_2_3());
              			
            }

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSpWTCPortAccess().getRightCurlyBracketKeyword_3());
              		
            }
            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSpWTCPortAccess().getSemicolonKeyword_4());
              		
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
    // InternalIFACE.g:1945:1: entryRuleGSSIfaceDummyPort returns [EObject current=null] : iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF ;
    public final EObject entryRuleGSSIfaceDummyPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceDummyPort = null;


        try {
            // InternalIFACE.g:1945:58: (iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF )
            // InternalIFACE.g:1946:2: iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF
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
    // InternalIFACE.g:1952:1: ruleGSSIfaceDummyPort returns [EObject current=null] : ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSIfaceDummyPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIFACE.g:1958:2: ( ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) )
            // InternalIFACE.g:1959:2: ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalIFACE.g:1959:2: ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            // InternalIFACE.g:1960:3: () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';'
            {
            // InternalIFACE.g:1960:3: ()
            // InternalIFACE.g:1961:4: 
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
            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_17); if (state.failed) return current;
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
    // InternalIFACE.g:1990:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalIFACE.g:1990:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalIFACE.g:1991:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalIFACE.g:1997:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:2003:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalIFACE.g:2004:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalIFACE.g:2004:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalIFACE.g:2005:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalIFACE.g:2012:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==47) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIFACE.g:2013:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,47,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleVersion"
    // InternalIFACE.g:2030:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalIFACE.g:2030:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalIFACE.g:2031:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalIFACE.g:2037:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalIFACE.g:2043:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalIFACE.g:2044:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalIFACE.g:2044:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalIFACE.g:2045:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalIFACE.g:2045:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==13||LA13_1==47||LA13_1==49) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_ID) ) {
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
                    // InternalIFACE.g:2046:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2054:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalIFACE.g:2054:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalIFACE.g:2055:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalIFACE.g:2055:5: (this_INT_1= RULE_INT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_INT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalIFACE.g:2056:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
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

            // InternalIFACE.g:2073:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalIFACE.g:2074:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,47,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalIFACE.g:2079:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==RULE_INT) ) {
            	        int LA15_1 = input.LA(2);

            	        if ( (LA15_1==EOF||LA15_1==13||LA15_1==47||LA15_1==49) ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_1==RULE_ID) ) {
            	            alt15=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 15, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA15_0==RULE_ID) ) {
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
            	            // InternalIFACE.g:2080:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalIFACE.g:2088:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalIFACE.g:2088:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalIFACE.g:2089:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalIFACE.g:2089:6: (this_INT_5= RULE_INT )?
            	            int alt14=2;
            	            int LA14_0 = input.LA(1);

            	            if ( (LA14_0==RULE_INT) ) {
            	                alt14=1;
            	            }
            	            switch (alt14) {
            	                case 1 :
            	                    // InternalIFACE.g:2090:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); if (state.failed) return current;
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
            	    break loop16;
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
    // InternalIFACE.g:2112:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalIFACE.g:2112:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalIFACE.g:2113:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalIFACE.g:2119:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalIFACE.g:2125:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalIFACE.g:2126:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalIFACE.g:2126:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalIFACE.g:2127:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_33);
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
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalIFACE.g:2161:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalIFACE.g:2161:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalIFACE.g:2162:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalIFACE.g:2168:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:2174:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalIFACE.g:2175:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:2175:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT||LA18_0==50) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_HEXADECIMAL) ) {
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
                    // InternalIFACE.g:2176:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalIFACE.g:2176:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalIFACE.g:2177:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalIFACE.g:2177:4: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==50) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalIFACE.g:2178:5: kw= '-'
                            {
                            kw=(Token)match(input,50,FollowSets000.FOLLOW_35); if (state.failed) return current;
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
                    // InternalIFACE.g:2193:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalIFACE.g:2204:1: ruleGSSIfaceSpWPortType returns [Enumerator current=null] : ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) ) ;
    public final Enumerator ruleGSSIfaceSpWPortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:2210:2: ( ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) ) )
            // InternalIFACE.g:2211:2: ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) )
            {
            // InternalIFACE.g:2211:2: ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalIFACE.g:2212:3: (enumLiteral_0= 'usb' )
                    {
                    // InternalIFACE.g:2212:3: (enumLiteral_0= 'usb' )
                    // InternalIFACE.g:2213:4: enumLiteral_0= 'usb'
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
                    // InternalIFACE.g:2220:3: (enumLiteral_1= 'mk2' )
                    {
                    // InternalIFACE.g:2220:3: (enumLiteral_1= 'mk2' )
                    // InternalIFACE.g:2221:4: enumLiteral_1= 'mk2'
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
                    // InternalIFACE.g:2228:3: (enumLiteral_2= 'pci' )
                    {
                    // InternalIFACE.g:2228:3: (enumLiteral_2= 'pci' )
                    // InternalIFACE.g:2229:4: enumLiteral_2= 'pci'
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
    // InternalIFACE.g:2239:1: ruleGSSIfaceUartPortBaudRate returns [Enumerator current=null] : ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortBaudRate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:2245:2: ( ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) ) )
            // InternalIFACE.g:2246:2: ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) )
            {
            // InternalIFACE.g:2246:2: ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            else if ( (LA20_0==55) ) {
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
                    // InternalIFACE.g:2247:3: (enumLiteral_0= '38400bauds' )
                    {
                    // InternalIFACE.g:2247:3: (enumLiteral_0= '38400bauds' )
                    // InternalIFACE.g:2248:4: enumLiteral_0= '38400bauds'
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
                    // InternalIFACE.g:2255:3: (enumLiteral_1= '115200bauds' )
                    {
                    // InternalIFACE.g:2255:3: (enumLiteral_1= '115200bauds' )
                    // InternalIFACE.g:2256:4: enumLiteral_1= '115200bauds'
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
    // InternalIFACE.g:2266:1: ruleGSSIfaceUartPortParity returns [Enumerator current=null] : ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortParity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalIFACE.g:2272:2: ( ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) ) )
            // InternalIFACE.g:2273:2: ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) )
            {
            // InternalIFACE.g:2273:2: ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt21=1;
                }
                break;
            case 57:
                {
                alt21=2;
                }
                break;
            case 58:
                {
                alt21=3;
                }
                break;
            case 59:
                {
                alt21=4;
                }
                break;
            case 60:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalIFACE.g:2274:3: (enumLiteral_0= 'NO' )
                    {
                    // InternalIFACE.g:2274:3: (enumLiteral_0= 'NO' )
                    // InternalIFACE.g:2275:4: enumLiteral_0= 'NO'
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
                    // InternalIFACE.g:2282:3: (enumLiteral_1= 'ODD' )
                    {
                    // InternalIFACE.g:2282:3: (enumLiteral_1= 'ODD' )
                    // InternalIFACE.g:2283:4: enumLiteral_1= 'ODD'
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
                    // InternalIFACE.g:2290:3: (enumLiteral_2= 'EVEN' )
                    {
                    // InternalIFACE.g:2290:3: (enumLiteral_2= 'EVEN' )
                    // InternalIFACE.g:2291:4: enumLiteral_2= 'EVEN'
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
                    // InternalIFACE.g:2298:3: (enumLiteral_3= 'MARK' )
                    {
                    // InternalIFACE.g:2298:3: (enumLiteral_3= 'MARK' )
                    // InternalIFACE.g:2299:4: enumLiteral_3= 'MARK'
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
                    // InternalIFACE.g:2306:3: (enumLiteral_4= 'SPACE' )
                    {
                    // InternalIFACE.g:2306:3: (enumLiteral_4= 'SPACE' )
                    // InternalIFACE.g:2307:4: enumLiteral_4= 'SPACE'
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
    // InternalIFACE.g:2317:1: ruleGSSIfaceUartPortDataBits returns [Enumerator current=null] : ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortDataBits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalIFACE.g:2323:2: ( ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) ) )
            // InternalIFACE.g:2324:2: ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) )
            {
            // InternalIFACE.g:2324:2: ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt22=1;
                }
                break;
            case 62:
                {
                alt22=2;
                }
                break;
            case 63:
                {
                alt22=3;
                }
                break;
            case 64:
                {
                alt22=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalIFACE.g:2325:3: (enumLiteral_0= '5bits' )
                    {
                    // InternalIFACE.g:2325:3: (enumLiteral_0= '5bits' )
                    // InternalIFACE.g:2326:4: enumLiteral_0= '5bits'
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
                    // InternalIFACE.g:2333:3: (enumLiteral_1= '6bits' )
                    {
                    // InternalIFACE.g:2333:3: (enumLiteral_1= '6bits' )
                    // InternalIFACE.g:2334:4: enumLiteral_1= '6bits'
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
                    // InternalIFACE.g:2341:3: (enumLiteral_2= '7bits' )
                    {
                    // InternalIFACE.g:2341:3: (enumLiteral_2= '7bits' )
                    // InternalIFACE.g:2342:4: enumLiteral_2= '7bits'
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
                    // InternalIFACE.g:2349:3: (enumLiteral_3= '8bits' )
                    {
                    // InternalIFACE.g:2349:3: (enumLiteral_3= '8bits' )
                    // InternalIFACE.g:2350:4: enumLiteral_3= '8bits'
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
    // InternalIFACE.g:2360:1: ruleGSSIfaceUartPortStopBits returns [Enumerator current=null] : ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortStopBits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:2366:2: ( ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) ) )
            // InternalIFACE.g:2367:2: ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) )
            {
            // InternalIFACE.g:2367:2: ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==65) ) {
                alt23=1;
            }
            else if ( (LA23_0==66) ) {
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
                    // InternalIFACE.g:2368:3: (enumLiteral_0= '1bit' )
                    {
                    // InternalIFACE.g:2368:3: (enumLiteral_0= '1bit' )
                    // InternalIFACE.g:2369:4: enumLiteral_0= '1bit'
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
                    // InternalIFACE.g:2376:3: (enumLiteral_1= '2bits' )
                    {
                    // InternalIFACE.g:2376:3: (enumLiteral_1= '2bits' )
                    // InternalIFACE.g:2377:4: enumLiteral_1= '2bits'
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
    // InternalIFACE.g:2387:1: ruleGSSIfaceUartProtocolUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartProtocolUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:2393:2: ( ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) ) )
            // InternalIFACE.g:2394:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) )
            {
            // InternalIFACE.g:2394:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            else if ( (LA24_0==39) ) {
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
                    // InternalIFACE.g:2395:3: (enumLiteral_0= 'bytes' )
                    {
                    // InternalIFACE.g:2395:3: (enumLiteral_0= 'bytes' )
                    // InternalIFACE.g:2396:4: enumLiteral_0= 'bytes'
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
                    // InternalIFACE.g:2403:3: (enumLiteral_1= 'bits' )
                    {
                    // InternalIFACE.g:2403:3: (enumLiteral_1= 'bits' )
                    // InternalIFACE.g:2404:4: enumLiteral_1= 'bits'
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
    // InternalIFACE.g:2414:1: ruleGSSIfaceUartProtocolPower returns [Enumerator current=null] : ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) ) ;
    public final Enumerator ruleGSSIfaceUartProtocolPower() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:2420:2: ( ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) ) )
            // InternalIFACE.g:2421:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) )
            {
            // InternalIFACE.g:2421:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt25=1;
                }
                break;
            case 66:
                {
                alt25=2;
                }
                break;
            case 68:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalIFACE.g:2422:3: (enumLiteral_0= 'no' )
                    {
                    // InternalIFACE.g:2422:3: (enumLiteral_0= 'no' )
                    // InternalIFACE.g:2423:4: enumLiteral_0= 'no'
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
                    // InternalIFACE.g:2430:3: (enumLiteral_1= '2bits' )
                    {
                    // InternalIFACE.g:2430:3: (enumLiteral_1= '2bits' )
                    // InternalIFACE.g:2431:4: enumLiteral_1= '2bits'
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
                    // InternalIFACE.g:2438:3: (enumLiteral_2= '2_with_0' )
                    {
                    // InternalIFACE.g:2438:3: (enumLiteral_2= '2_with_0' )
                    // InternalIFACE.g:2439:4: enumLiteral_2= '2_with_0'
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

    // $ANTLR start synpred4_InternalIFACE
    public final void synpred4_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_port_12_0 = null;


        // InternalIFACE.g:323:4: ( ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) ) )
        // InternalIFACE.g:323:4: ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) )
        {
        // InternalIFACE.g:323:4: ({...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) ) )
        // InternalIFACE.g:324:5: {...}? => ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalIFACE.g:324:115: ( ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) ) )
        // InternalIFACE.g:325:6: ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfacePortConfigAccess().getUnorderedGroup_3(), 2);
        // InternalIFACE.g:328:9: ({...}? => ( (lv_port_12_0= ruleGSSIfacePort ) ) )
        // InternalIFACE.g:328:10: {...}? => ( (lv_port_12_0= ruleGSSIfacePort ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalIFACE", "true");
        }
        // InternalIFACE.g:328:19: ( (lv_port_12_0= ruleGSSIfacePort ) )
        // InternalIFACE.g:328:20: (lv_port_12_0= ruleGSSIfacePort )
        {
        // InternalIFACE.g:328:20: (lv_port_12_0= ruleGSSIfacePort )
        // InternalIFACE.g:329:10: lv_port_12_0= ruleGSSIfacePort
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSIfacePortConfigAccess().getPortGSSIfacePortParserRuleCall_3_2_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_port_12_0=ruleGSSIfacePort();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalIFACE

    // $ANTLR start synpred8_InternalIFACE
    public final void synpred8_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_5_0 = null;


        // InternalIFACE.g:480:4: ( ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) ) )
        // InternalIFACE.g:480:4: ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) )
        {
        // InternalIFACE.g:480:4: ({...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) ) )
        // InternalIFACE.g:481:5: {...}? => ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:481:112: ( ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) ) )
        // InternalIFACE.g:482:6: ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:485:9: ({...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' ) )
        // InternalIFACE.g:485:10: {...}? => (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalIFACE", "true");
        }
        // InternalIFACE.g:485:19: (otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';' )
        // InternalIFACE.g:485:20: otherlv_3= 'type' otherlv_4= ':=' ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) ) otherlv_6= ';'
        {
        otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_13); if (state.failed) return ;
        // InternalIFACE.g:493:9: ( (lv_type_5_0= ruleGSSIfaceSpWPortType ) )
        // InternalIFACE.g:494:10: (lv_type_5_0= ruleGSSIfaceSpWPortType )
        {
        // InternalIFACE.g:494:10: (lv_type_5_0= ruleGSSIfaceSpWPortType )
        // InternalIFACE.g:495:11: lv_type_5_0= ruleGSSIfaceSpWPortType
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getTypeGSSIfaceSpWPortTypeEnumRuleCall_2_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_type_5_0=ruleGSSIfaceSpWPortType();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalIFACE

    // $ANTLR start synpred9_InternalIFACE
    public final void synpred9_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_link_9_0 = null;


        // InternalIFACE.g:522:4: ( ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )
        // InternalIFACE.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        {
        // InternalIFACE.g:522:4: ({...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        // InternalIFACE.g:523:5: {...}? => ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:523:112: ( ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        // InternalIFACE.g:524:6: ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:527:9: ({...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        // InternalIFACE.g:527:10: {...}? => (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalIFACE", "true");
        }
        // InternalIFACE.g:527:19: (otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        // InternalIFACE.g:527:20: otherlv_7= 'link' otherlv_8= ':=' ( (lv_link_9_0= ruleINTEGER ) ) otherlv_10= ';'
        {
        otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:535:9: ( (lv_link_9_0= ruleINTEGER ) )
        // InternalIFACE.g:536:10: (lv_link_9_0= ruleINTEGER )
        {
        // InternalIFACE.g:536:10: (lv_link_9_0= ruleINTEGER )
        // InternalIFACE.g:537:11: lv_link_9_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getLinkINTEGERParserRuleCall_2_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_link_9_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalIFACE

    // $ANTLR start synpred10_InternalIFACE
    public final void synpred10_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_writingPort_13_0 = null;


        // InternalIFACE.g:564:4: ( ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) ) )
        // InternalIFACE.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) )
        {
        // InternalIFACE.g:564:4: ({...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) ) )
        // InternalIFACE.g:565:5: {...}? => ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2)");
        }
        // InternalIFACE.g:565:112: ( ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) ) )
        // InternalIFACE.g:566:6: ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 2);
        // InternalIFACE.g:569:9: ({...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' ) )
        // InternalIFACE.g:569:10: {...}? => (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred10_InternalIFACE", "true");
        }
        // InternalIFACE.g:569:19: (otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';' )
        // InternalIFACE.g:569:20: otherlv_11= 'writingPort' otherlv_12= ':=' ( (lv_writingPort_13_0= ruleINTEGER ) ) otherlv_14= ';'
        {
        otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:577:9: ( (lv_writingPort_13_0= ruleINTEGER ) )
        // InternalIFACE.g:578:10: (lv_writingPort_13_0= ruleINTEGER )
        {
        // InternalIFACE.g:578:10: (lv_writingPort_13_0= ruleINTEGER )
        // InternalIFACE.g:579:11: lv_writingPort_13_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getWritingPortINTEGERParserRuleCall_2_2_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_writingPort_13_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalIFACE

    // $ANTLR start synpred11_InternalIFACE
    public final void synpred11_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_readingPort_15_0 = null;


        // InternalIFACE.g:611:10: ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )
        // InternalIFACE.g:611:10: {...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred11_InternalIFACE", "true");
        }
        // InternalIFACE.g:611:19: ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) )
        // InternalIFACE.g:611:20: (lv_readingPort_15_0= ruleGSSIfaceReadingPort )
        {
        // InternalIFACE.g:611:20: (lv_readingPort_15_0= ruleGSSIfaceReadingPort )
        // InternalIFACE.g:612:10: lv_readingPort_15_0= ruleGSSIfaceReadingPort
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_readingPort_15_0=ruleGSSIfaceReadingPort();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalIFACE

    // $ANTLR start synpred12_InternalIFACE
    public final void synpred12_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_readingPort_15_0 = null;


        // InternalIFACE.g:606:4: ( ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) ) )
        // InternalIFACE.g:606:4: ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) )
        {
        // InternalIFACE.g:606:4: ({...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ ) )
        // InternalIFACE.g:607:5: {...}? => ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred12_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3)");
        }
        // InternalIFACE.g:607:112: ( ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+ )
        // InternalIFACE.g:608:6: ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSpWPortAccess().getUnorderedGroup_2(), 3);
        // InternalIFACE.g:611:9: ({...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) ) )+
        int cnt26=0;
        loop26:
        do {
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) && ((true))) {
                alt26=1;
            }


            switch (alt26) {
        	case 1 :
        	    // InternalIFACE.g:611:10: {...}? => ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred12_InternalIFACE", "true");
        	    }
        	    // InternalIFACE.g:611:19: ( (lv_readingPort_15_0= ruleGSSIfaceReadingPort ) )
        	    // InternalIFACE.g:611:20: (lv_readingPort_15_0= ruleGSSIfaceReadingPort )
        	    {
        	    // InternalIFACE.g:611:20: (lv_readingPort_15_0= ruleGSSIfaceReadingPort )
        	    // InternalIFACE.g:612:10: lv_readingPort_15_0= ruleGSSIfaceReadingPort
        	    {
        	    if ( state.backtracking==0 ) {

        	      										newCompositeNode(grammarAccess.getGSSIfaceSpWPortAccess().getReadingPortGSSIfaceReadingPortParserRuleCall_2_3_0());
        	      									
        	    }
        	    pushFollow(FollowSets000.FOLLOW_36);
        	    lv_readingPort_15_0=ruleGSSIfaceReadingPort();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt26 >= 1 ) break loop26;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(26, input);
                    throw eee;
            }
            cnt26++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalIFACE

    // $ANTLR start synpred13_InternalIFACE
    public final void synpred13_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_number_5_0 = null;


        // InternalIFACE.g:765:4: ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) )
        // InternalIFACE.g:765:4: ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        {
        // InternalIFACE.g:765:4: ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        // InternalIFACE.g:766:5: {...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:766:113: ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        // InternalIFACE.g:767:6: ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:770:9: ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        // InternalIFACE.g:770:10: {...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred13_InternalIFACE", "true");
        }
        // InternalIFACE.g:770:19: (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        // InternalIFACE.g:770:20: otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';'
        {
        otherlv_3=(Token)match(input,27,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:778:9: ( (lv_number_5_0= ruleINTEGER ) )
        // InternalIFACE.g:779:10: (lv_number_5_0= ruleINTEGER )
        {
        // InternalIFACE.g:779:10: (lv_number_5_0= ruleINTEGER )
        // InternalIFACE.g:780:11: lv_number_5_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getNumberINTEGERParserRuleCall_2_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_number_5_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalIFACE

    // $ANTLR start synpred14_InternalIFACE
    public final void synpred14_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_baudRate_9_0 = null;


        // InternalIFACE.g:807:4: ( ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) )
        // InternalIFACE.g:807:4: ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) )
        {
        // InternalIFACE.g:807:4: ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) )
        // InternalIFACE.g:808:5: {...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred14_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:808:113: ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) )
        // InternalIFACE.g:809:6: ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:812:9: ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) )
        // InternalIFACE.g:812:10: {...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred14_InternalIFACE", "true");
        }
        // InternalIFACE.g:812:19: (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' )
        // InternalIFACE.g:812:20: otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';'
        {
        otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_20); if (state.failed) return ;
        // InternalIFACE.g:820:9: ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) )
        // InternalIFACE.g:821:10: (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate )
        {
        // InternalIFACE.g:821:10: (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate )
        // InternalIFACE.g:822:11: lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getBaudRateGSSIfaceUartPortBaudRateEnumRuleCall_2_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_baudRate_9_0=ruleGSSIfaceUartPortBaudRate();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalIFACE

    // $ANTLR start synpred15_InternalIFACE
    public final void synpred15_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_parity_13_0 = null;


        // InternalIFACE.g:849:4: ( ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) )
        // InternalIFACE.g:849:4: ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) )
        {
        // InternalIFACE.g:849:4: ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) )
        // InternalIFACE.g:850:5: {...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2)");
        }
        // InternalIFACE.g:850:113: ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) )
        // InternalIFACE.g:851:6: ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2);
        // InternalIFACE.g:854:9: ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) )
        // InternalIFACE.g:854:10: {...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred15_InternalIFACE", "true");
        }
        // InternalIFACE.g:854:19: (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' )
        // InternalIFACE.g:854:20: otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';'
        {
        otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_21); if (state.failed) return ;
        // InternalIFACE.g:862:9: ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) )
        // InternalIFACE.g:863:10: (lv_parity_13_0= ruleGSSIfaceUartPortParity )
        {
        // InternalIFACE.g:863:10: (lv_parity_13_0= ruleGSSIfaceUartPortParity )
        // InternalIFACE.g:864:11: lv_parity_13_0= ruleGSSIfaceUartPortParity
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getParityGSSIfaceUartPortParityEnumRuleCall_2_2_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_parity_13_0=ruleGSSIfaceUartPortParity();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_14=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalIFACE

    // $ANTLR start synpred16_InternalIFACE
    public final void synpred16_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Enumerator lv_dataBits_17_0 = null;


        // InternalIFACE.g:891:4: ( ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) )
        // InternalIFACE.g:891:4: ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) )
        {
        // InternalIFACE.g:891:4: ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) )
        // InternalIFACE.g:892:5: {...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred16_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3)");
        }
        // InternalIFACE.g:892:113: ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) )
        // InternalIFACE.g:893:6: ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3);
        // InternalIFACE.g:896:9: ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) )
        // InternalIFACE.g:896:10: {...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred16_InternalIFACE", "true");
        }
        // InternalIFACE.g:896:19: (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' )
        // InternalIFACE.g:896:20: otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';'
        {
        otherlv_15=(Token)match(input,30,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_22); if (state.failed) return ;
        // InternalIFACE.g:904:9: ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) )
        // InternalIFACE.g:905:10: (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits )
        {
        // InternalIFACE.g:905:10: (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits )
        // InternalIFACE.g:906:11: lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getDataBitsGSSIfaceUartPortDataBitsEnumRuleCall_2_3_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_dataBits_17_0=ruleGSSIfaceUartPortDataBits();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_18=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalIFACE

    // $ANTLR start synpred17_InternalIFACE
    public final void synpred17_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Enumerator lv_stopBits_21_0 = null;


        // InternalIFACE.g:933:4: ( ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) )
        // InternalIFACE.g:933:4: ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) )
        {
        // InternalIFACE.g:933:4: ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) )
        // InternalIFACE.g:934:5: {...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4)");
        }
        // InternalIFACE.g:934:113: ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) )
        // InternalIFACE.g:935:6: ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4);
        // InternalIFACE.g:938:9: ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) )
        // InternalIFACE.g:938:10: {...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred17_InternalIFACE", "true");
        }
        // InternalIFACE.g:938:19: (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' )
        // InternalIFACE.g:938:20: otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';'
        {
        otherlv_19=(Token)match(input,31,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_20=(Token)match(input,17,FollowSets000.FOLLOW_23); if (state.failed) return ;
        // InternalIFACE.g:946:9: ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) )
        // InternalIFACE.g:947:10: (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits )
        {
        // InternalIFACE.g:947:10: (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits )
        // InternalIFACE.g:948:11: lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getStopBitsGSSIfaceUartPortStopBitsEnumRuleCall_2_4_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_stopBits_21_0=ruleGSSIfaceUartPortStopBits();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_22=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalIFACE

    // $ANTLR start synpred18_InternalIFACE
    public final void synpred18_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_inputQueueSize_25_0 = null;


        // InternalIFACE.g:975:4: ( ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) )
        // InternalIFACE.g:975:4: ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) )
        {
        // InternalIFACE.g:975:4: ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) )
        // InternalIFACE.g:976:5: {...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred18_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5)");
        }
        // InternalIFACE.g:976:113: ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) )
        // InternalIFACE.g:977:6: ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5);
        // InternalIFACE.g:980:9: ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) )
        // InternalIFACE.g:980:10: {...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred18_InternalIFACE", "true");
        }
        // InternalIFACE.g:980:19: (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' )
        // InternalIFACE.g:980:20: otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';'
        {
        otherlv_23=(Token)match(input,32,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_24=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:988:9: ( (lv_inputQueueSize_25_0= ruleINTEGER ) )
        // InternalIFACE.g:989:10: (lv_inputQueueSize_25_0= ruleINTEGER )
        {
        // InternalIFACE.g:989:10: (lv_inputQueueSize_25_0= ruleINTEGER )
        // InternalIFACE.g:990:11: lv_inputQueueSize_25_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getInputQueueSizeINTEGERParserRuleCall_2_5_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_inputQueueSize_25_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_26=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalIFACE

    // $ANTLR start synpred19_InternalIFACE
    public final void synpred19_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_outputQueueSize_29_0 = null;


        // InternalIFACE.g:1017:4: ( ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) )
        // InternalIFACE.g:1017:4: ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) )
        {
        // InternalIFACE.g:1017:4: ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) )
        // InternalIFACE.g:1018:5: {...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred19_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6)");
        }
        // InternalIFACE.g:1018:113: ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) )
        // InternalIFACE.g:1019:6: ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6);
        // InternalIFACE.g:1022:9: ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) )
        // InternalIFACE.g:1022:10: {...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred19_InternalIFACE", "true");
        }
        // InternalIFACE.g:1022:19: (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' )
        // InternalIFACE.g:1022:20: otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';'
        {
        otherlv_27=(Token)match(input,33,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_28=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:1030:9: ( (lv_outputQueueSize_29_0= ruleINTEGER ) )
        // InternalIFACE.g:1031:10: (lv_outputQueueSize_29_0= ruleINTEGER )
        {
        // InternalIFACE.g:1031:10: (lv_outputQueueSize_29_0= ruleINTEGER )
        // InternalIFACE.g:1032:11: lv_outputQueueSize_29_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getOutputQueueSizeINTEGERParserRuleCall_2_6_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_outputQueueSize_29_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_30=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred19_InternalIFACE

    // $ANTLR start synpred20_InternalIFACE
    public final void synpred20_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_uartProtocol_31_0 = null;


        // InternalIFACE.g:1059:4: ( ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )
        // InternalIFACE.g:1059:4: ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) )
        {
        // InternalIFACE.g:1059:4: ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) )
        // InternalIFACE.g:1060:5: {...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred20_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7)");
        }
        // InternalIFACE.g:1060:113: ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) )
        // InternalIFACE.g:1061:6: ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7);
        // InternalIFACE.g:1064:9: ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) )
        // InternalIFACE.g:1064:10: {...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred20_InternalIFACE", "true");
        }
        // InternalIFACE.g:1064:19: ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) )
        // InternalIFACE.g:1064:20: (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol )
        {
        // InternalIFACE.g:1064:20: (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol )
        // InternalIFACE.g:1065:10: lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getUartProtocolGSSIfaceUartProtocolParserRuleCall_2_7_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_uartProtocol_31_0=ruleGSSIfaceUartProtocol();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalIFACE

    // $ANTLR start synpred21_InternalIFACE
    public final void synpred21_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_unit_5_0 = null;


        // InternalIFACE.g:1150:4: ( ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) ) )
        // InternalIFACE.g:1150:4: ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) )
        {
        // InternalIFACE.g:1150:4: ({...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) ) )
        // InternalIFACE.g:1151:5: {...}? => ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred21_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:1151:117: ( ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) ) )
        // InternalIFACE.g:1152:6: ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:1155:9: ({...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' ) )
        // InternalIFACE.g:1155:10: {...}? => (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred21_InternalIFACE", "true");
        }
        // InternalIFACE.g:1155:19: (otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';' )
        // InternalIFACE.g:1155:20: otherlv_3= 'unit' otherlv_4= ':=' ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) ) otherlv_6= ';'
        {
        otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_25); if (state.failed) return ;
        // InternalIFACE.g:1163:9: ( (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit ) )
        // InternalIFACE.g:1164:10: (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit )
        {
        // InternalIFACE.g:1164:10: (lv_unit_5_0= ruleGSSIfaceUartProtocolUnit )
        // InternalIFACE.g:1165:11: lv_unit_5_0= ruleGSSIfaceUartProtocolUnit
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getUnitGSSIfaceUartProtocolUnitEnumRuleCall_2_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_unit_5_0=ruleGSSIfaceUartProtocolUnit();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalIFACE

    // $ANTLR start synpred22_InternalIFACE
    public final void synpred22_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_power_9_0 = null;


        // InternalIFACE.g:1192:4: ( ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) ) )
        // InternalIFACE.g:1192:4: ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) )
        {
        // InternalIFACE.g:1192:4: ({...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) ) )
        // InternalIFACE.g:1193:5: {...}? => ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred22_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:1193:117: ( ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) ) )
        // InternalIFACE.g:1194:6: ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:1197:9: ({...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' ) )
        // InternalIFACE.g:1197:10: {...}? => (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred22_InternalIFACE", "true");
        }
        // InternalIFACE.g:1197:19: (otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';' )
        // InternalIFACE.g:1197:20: otherlv_7= 'power' otherlv_8= ':=' ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) ) otherlv_10= ';'
        {
        otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_27); if (state.failed) return ;
        // InternalIFACE.g:1205:9: ( (lv_power_9_0= ruleGSSIfaceUartProtocolPower ) )
        // InternalIFACE.g:1206:10: (lv_power_9_0= ruleGSSIfaceUartProtocolPower )
        {
        // InternalIFACE.g:1206:10: (lv_power_9_0= ruleGSSIfaceUartProtocolPower )
        // InternalIFACE.g:1207:11: lv_power_9_0= ruleGSSIfaceUartProtocolPower
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getPowerGSSIfaceUartProtocolPowerEnumRuleCall_2_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_power_9_0=ruleGSSIfaceUartProtocolPower();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalIFACE

    // $ANTLR start synpred23_InternalIFACE
    public final void synpred23_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_constSize_11_0 = null;


        // InternalIFACE.g:1234:4: ( ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) ) )
        // InternalIFACE.g:1234:4: ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) )
        {
        // InternalIFACE.g:1234:4: ({...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) ) )
        // InternalIFACE.g:1235:5: {...}? => ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred23_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2)");
        }
        // InternalIFACE.g:1235:117: ( ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) ) )
        // InternalIFACE.g:1236:6: ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 2);
        // InternalIFACE.g:1239:9: ({...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) ) )
        // InternalIFACE.g:1239:10: {...}? => ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred23_InternalIFACE", "true");
        }
        // InternalIFACE.g:1239:19: ( (lv_constSize_11_0= ruleGSSIfaceConstSize ) )
        // InternalIFACE.g:1239:20: (lv_constSize_11_0= ruleGSSIfaceConstSize )
        {
        // InternalIFACE.g:1239:20: (lv_constSize_11_0= ruleGSSIfaceConstSize )
        // InternalIFACE.g:1240:10: lv_constSize_11_0= ruleGSSIfaceConstSize
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_2_2_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_constSize_11_0=ruleGSSIfaceConstSize();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalIFACE

    // $ANTLR start synpred24_InternalIFACE
    public final void synpred24_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_sizeFieldOffset_12_0 = null;


        // InternalIFACE.g:1262:4: ( ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) ) )
        // InternalIFACE.g:1262:4: ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) )
        {
        // InternalIFACE.g:1262:4: ({...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) ) )
        // InternalIFACE.g:1263:5: {...}? => ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred24_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3)");
        }
        // InternalIFACE.g:1263:117: ( ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) ) )
        // InternalIFACE.g:1264:6: ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 3);
        // InternalIFACE.g:1267:9: ({...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) ) )
        // InternalIFACE.g:1267:10: {...}? => ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred24_InternalIFACE", "true");
        }
        // InternalIFACE.g:1267:19: ( (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset ) )
        // InternalIFACE.g:1267:20: (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset )
        {
        // InternalIFACE.g:1267:20: (lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset )
        // InternalIFACE.g:1268:10: lv_sizeFieldOffset_12_0= ruleGSSIfaceSizeFieldOffset
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_2_3_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_sizeFieldOffset_12_0=ruleGSSIfaceSizeFieldOffset();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred24_InternalIFACE

    // $ANTLR start synpred25_InternalIFACE
    public final void synpred25_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_sizeFieldTrim_13_0 = null;


        // InternalIFACE.g:1290:4: ( ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) ) )
        // InternalIFACE.g:1290:4: ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) )
        {
        // InternalIFACE.g:1290:4: ({...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) ) )
        // InternalIFACE.g:1291:5: {...}? => ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred25_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4)");
        }
        // InternalIFACE.g:1291:117: ( ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) ) )
        // InternalIFACE.g:1292:6: ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 4);
        // InternalIFACE.g:1295:9: ({...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) ) )
        // InternalIFACE.g:1295:10: {...}? => ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred25_InternalIFACE", "true");
        }
        // InternalIFACE.g:1295:19: ( (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim ) )
        // InternalIFACE.g:1295:20: (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim )
        {
        // InternalIFACE.g:1295:20: (lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim )
        // InternalIFACE.g:1296:10: lv_sizeFieldTrim_13_0= ruleGSSIfaceSizeFieldTrim
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_2_4_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_sizeFieldTrim_13_0=ruleGSSIfaceSizeFieldTrim();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalIFACE

    // $ANTLR start synpred26_InternalIFACE
    public final void synpred26_InternalIFACE_fragment() throws RecognitionException {   
        EObject lv_syncPattern_14_0 = null;


        // InternalIFACE.g:1318:4: ( ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) ) )
        // InternalIFACE.g:1318:4: ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) )
        {
        // InternalIFACE.g:1318:4: ({...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) ) )
        // InternalIFACE.g:1319:5: {...}? => ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred26_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5)");
        }
        // InternalIFACE.g:1319:117: ( ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) ) )
        // InternalIFACE.g:1320:6: ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceUartProtocolAccess().getUnorderedGroup_2(), 5);
        // InternalIFACE.g:1323:9: ({...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) ) )
        // InternalIFACE.g:1323:10: {...}? => ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred26_InternalIFACE", "true");
        }
        // InternalIFACE.g:1323:19: ( (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern ) )
        // InternalIFACE.g:1323:20: (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern )
        {
        // InternalIFACE.g:1323:20: (lv_syncPattern_14_0= ruleGSSIfaceSyncPattern )
        // InternalIFACE.g:1324:10: lv_syncPattern_14_0= ruleGSSIfaceSyncPattern
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getGSSIfaceUartProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_2_5_0());
          									
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_syncPattern_14_0=ruleGSSIfaceSyncPattern();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred26_InternalIFACE

    // $ANTLR start synpred27_InternalIFACE
    public final void synpred27_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_bytes_5_0 = null;


        // InternalIFACE.g:1409:4: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) )
        // InternalIFACE.g:1409:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        {
        // InternalIFACE.g:1409:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        // InternalIFACE.g:1410:5: {...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred27_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:1410:114: ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        // InternalIFACE.g:1411:6: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:1414:9: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        // InternalIFACE.g:1414:10: {...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred27_InternalIFACE", "true");
        }
        // InternalIFACE.g:1414:19: (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        // InternalIFACE.g:1414:20: otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';'
        {
        otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:1422:9: ( (lv_bytes_5_0= ruleINTEGER ) )
        // InternalIFACE.g:1423:10: (lv_bytes_5_0= ruleINTEGER )
        {
        // InternalIFACE.g:1423:10: (lv_bytes_5_0= ruleINTEGER )
        // InternalIFACE.g:1424:11: lv_bytes_5_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBytesINTEGERParserRuleCall_2_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_bytes_5_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalIFACE

    // $ANTLR start synpred28_InternalIFACE
    public final void synpred28_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_bits_9_0 = null;


        // InternalIFACE.g:1451:4: ( ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )
        // InternalIFACE.g:1451:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        {
        // InternalIFACE.g:1451:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        // InternalIFACE.g:1452:5: {...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:1452:114: ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        // InternalIFACE.g:1453:6: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceConstSizeAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:1456:9: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        // InternalIFACE.g:1456:10: {...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred28_InternalIFACE", "true");
        }
        // InternalIFACE.g:1456:19: (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        // InternalIFACE.g:1456:20: otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';'
        {
        otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:1464:9: ( (lv_bits_9_0= ruleINTEGER ) )
        // InternalIFACE.g:1465:10: (lv_bits_9_0= ruleINTEGER )
        {
        // InternalIFACE.g:1465:10: (lv_bits_9_0= ruleINTEGER )
        // InternalIFACE.g:1466:11: lv_bits_9_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceConstSizeAccess().getBitsINTEGERParserRuleCall_2_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_bits_9_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred28_InternalIFACE

    // $ANTLR start synpred29_InternalIFACE
    public final void synpred29_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_bytes_5_0 = null;


        // InternalIFACE.g:1556:4: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) )
        // InternalIFACE.g:1556:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        {
        // InternalIFACE.g:1556:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        // InternalIFACE.g:1557:5: {...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred29_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:1557:120: ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        // InternalIFACE.g:1558:6: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:1561:9: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        // InternalIFACE.g:1561:10: {...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred29_InternalIFACE", "true");
        }
        // InternalIFACE.g:1561:19: (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        // InternalIFACE.g:1561:20: otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';'
        {
        otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:1569:9: ( (lv_bytes_5_0= ruleINTEGER ) )
        // InternalIFACE.g:1570:10: (lv_bytes_5_0= ruleINTEGER )
        {
        // InternalIFACE.g:1570:10: (lv_bytes_5_0= ruleINTEGER )
        // InternalIFACE.g:1571:11: lv_bytes_5_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesINTEGERParserRuleCall_2_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_bytes_5_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalIFACE

    // $ANTLR start synpred30_InternalIFACE
    public final void synpred30_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_bits_9_0 = null;


        // InternalIFACE.g:1598:4: ( ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )
        // InternalIFACE.g:1598:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        {
        // InternalIFACE.g:1598:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        // InternalIFACE.g:1599:5: {...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:1599:120: ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        // InternalIFACE.g:1600:6: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:1603:9: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        // InternalIFACE.g:1603:10: {...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred30_InternalIFACE", "true");
        }
        // InternalIFACE.g:1603:19: (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        // InternalIFACE.g:1603:20: otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';'
        {
        otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:1611:9: ( (lv_bits_9_0= ruleINTEGER ) )
        // InternalIFACE.g:1612:10: (lv_bits_9_0= ruleINTEGER )
        {
        // InternalIFACE.g:1612:10: (lv_bits_9_0= ruleINTEGER )
        // InternalIFACE.g:1613:11: lv_bits_9_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsINTEGERParserRuleCall_2_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_bits_9_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred30_InternalIFACE

    // $ANTLR start synpred31_InternalIFACE
    public final void synpred31_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_bytes_5_0 = null;


        // InternalIFACE.g:1703:4: ( ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) )
        // InternalIFACE.g:1703:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        {
        // InternalIFACE.g:1703:4: ({...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) )
        // InternalIFACE.g:1704:5: {...}? => ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred31_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0)");
        }
        // InternalIFACE.g:1704:118: ( ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) )
        // InternalIFACE.g:1705:6: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 0);
        // InternalIFACE.g:1708:9: ({...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' ) )
        // InternalIFACE.g:1708:10: {...}? => (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred31_InternalIFACE", "true");
        }
        // InternalIFACE.g:1708:19: (otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';' )
        // InternalIFACE.g:1708:20: otherlv_3= 'bytes' otherlv_4= ':=' ( (lv_bytes_5_0= ruleINTEGER ) ) otherlv_6= ';'
        {
        otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:1716:9: ( (lv_bytes_5_0= ruleINTEGER ) )
        // InternalIFACE.g:1717:10: (lv_bytes_5_0= ruleINTEGER )
        {
        // InternalIFACE.g:1717:10: (lv_bytes_5_0= ruleINTEGER )
        // InternalIFACE.g:1718:11: lv_bytes_5_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesINTEGERParserRuleCall_2_0_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_bytes_5_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalIFACE

    // $ANTLR start synpred32_InternalIFACE
    public final void synpred32_InternalIFACE_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_bits_9_0 = null;


        // InternalIFACE.g:1745:4: ( ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) ) )
        // InternalIFACE.g:1745:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        {
        // InternalIFACE.g:1745:4: ({...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) ) )
        // InternalIFACE.g:1746:5: {...}? => ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalIFACE", "getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1)");
        }
        // InternalIFACE.g:1746:118: ( ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) ) )
        // InternalIFACE.g:1747:6: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getUnorderedGroup_2(), 1);
        // InternalIFACE.g:1750:9: ({...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' ) )
        // InternalIFACE.g:1750:10: {...}? => (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred32_InternalIFACE", "true");
        }
        // InternalIFACE.g:1750:19: (otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';' )
        // InternalIFACE.g:1750:20: otherlv_7= 'bits' otherlv_8= ':=' ( (lv_bits_9_0= ruleINTEGER ) ) otherlv_10= ';'
        {
        otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return ;
        otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_15); if (state.failed) return ;
        // InternalIFACE.g:1758:9: ( (lv_bits_9_0= ruleINTEGER ) )
        // InternalIFACE.g:1759:10: (lv_bits_9_0= ruleINTEGER )
        {
        // InternalIFACE.g:1759:10: (lv_bits_9_0= ruleINTEGER )
        // InternalIFACE.g:1760:11: lv_bits_9_0= ruleINTEGER
        {
        if ( state.backtracking==0 ) {

          											newCompositeNode(grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsINTEGERParserRuleCall_2_1_2_0());
          										
        }
        pushFollow(FollowSets000.FOLLOW_5);
        lv_bits_9_0=ruleINTEGER();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred32_InternalIFACE

    // Delegated rules

    public final boolean synpred18_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred23_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalIFACE_fragment(); // can never throw exception
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
    public final boolean synpred14_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalIFACE() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalIFACE_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\23\11\uffff";
    static final String dfa_3s = "\1\42\11\uffff";
    static final String dfa_4s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\7\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 764:6: ( ({...}? => ( ({...}? => (otherlv_3= 'number' otherlv_4= ':=' ( (lv_number_5_0= ruleINTEGER ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'baudRate' otherlv_8= ':=' ( (lv_baudRate_9_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'parity' otherlv_12= ':=' ( (lv_parity_13_0= ruleGSSIfaceUartPortParity ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'dataBits' otherlv_16= ':=' ( (lv_dataBits_17_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'stopBits' otherlv_20= ':=' ( (lv_stopBits_21_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'inputQueueSize' otherlv_24= ':=' ( (lv_inputQueueSize_25_0= ruleINTEGER ) ) otherlv_26= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'outputQueueSize' otherlv_28= ':=' ( (lv_outputQueueSize_29_0= ruleINTEGER ) ) otherlv_30= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_uartProtocol_31_0= ruleGSSIfaceUartProtocol ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                         
                        int index6_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_0==19) ) {s = 1;}

                        else if ( LA6_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA6_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA6_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA6_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA6_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA6_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA6_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA6_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGSSIfaceUartPortAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000500004150000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00005000041D0000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001E00000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0038000000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001E80000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00040000000000C0L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007F8000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000007F8080000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00C0000000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1F00000000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000073800000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000073800080000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000080000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000001E00002L});
    }


}