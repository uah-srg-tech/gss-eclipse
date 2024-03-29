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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HEXADECIMAL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'portConfig'", "'{'", "'uri'", "':='", "'version'", "'}'", "'spwPort'", "'type'", "'link'", "'writingPort'", "'readingPort'", "'port'", "'uartPort'", "'number'", "'baudRate'", "'parity'", "'dataBits'", "'stopBits'", "'flowControl'", "'socketSrvPort'", "'portNumber'", "'socketCliPort'", "'ipAddress'", "'portProtocol'", "'unit'", "'power'", "'constSize'", "'bytes'", "'bits'", "'sizeFieldOffset'", "'sizeFieldTrim'", "'syncPattern'", "'hexValue'", "'spwTCPort'", "'spwPortRef'", "'dummyPort'", "'.'", "'('", "')'", "'-'", "'usb'", "'mk2'", "'pci'", "'38400bauds'", "'115200bauds'", "'NO'", "'ODD'", "'EVEN'", "'MARK'", "'SPACE'", "'5bits'", "'6bits'", "'7bits'", "'8bits'", "'1bit'", "'2bits'", "'rts_cts'", "'xon_xoff'", "'no'", "'2_with_0'"
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
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
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
    // InternalIFACE.g:372:1: ruleGSSIfacePort returns [EObject current=null] : (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSocketSrvPort_2= ruleGSSIfaceSocketSrvPort | this_GSSIfaceSocketCliPort_3= ruleGSSIfaceSocketCliPort | this_GSSIfaceSpWTCPort_4= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_5= ruleGSSIfaceDummyPort ) ;
    public final EObject ruleGSSIfacePort() throws RecognitionException {
        EObject current = null;

        EObject this_GSSIfaceSpWPort_0 = null;

        EObject this_GSSIfaceUartPort_1 = null;

        EObject this_GSSIfaceSocketSrvPort_2 = null;

        EObject this_GSSIfaceSocketCliPort_3 = null;

        EObject this_GSSIfaceSpWTCPort_4 = null;

        EObject this_GSSIfaceDummyPort_5 = null;



        	enterRule();

        try {
            // InternalIFACE.g:378:2: ( (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSocketSrvPort_2= ruleGSSIfaceSocketSrvPort | this_GSSIfaceSocketCliPort_3= ruleGSSIfaceSocketCliPort | this_GSSIfaceSpWTCPort_4= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_5= ruleGSSIfaceDummyPort ) )
            // InternalIFACE.g:379:2: (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSocketSrvPort_2= ruleGSSIfaceSocketSrvPort | this_GSSIfaceSocketCliPort_3= ruleGSSIfaceSocketCliPort | this_GSSIfaceSpWTCPort_4= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_5= ruleGSSIfaceDummyPort )
            {
            // InternalIFACE.g:379:2: (this_GSSIfaceSpWPort_0= ruleGSSIfaceSpWPort | this_GSSIfaceUartPort_1= ruleGSSIfaceUartPort | this_GSSIfaceSocketSrvPort_2= ruleGSSIfaceSocketSrvPort | this_GSSIfaceSocketCliPort_3= ruleGSSIfaceSocketCliPort | this_GSSIfaceSpWTCPort_4= ruleGSSIfaceSpWTCPort | this_GSSIfaceDummyPort_5= ruleGSSIfaceDummyPort )
            int alt3=6;
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
            case 33:
                {
                alt3=3;
                }
                break;
            case 35:
                {
                alt3=4;
                }
                break;
            case 47:
                {
                alt3=5;
                }
                break;
            case 49:
                {
                alt3=6;
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
                    // InternalIFACE.g:404:3: this_GSSIfaceSocketSrvPort_2= ruleGSSIfaceSocketSrvPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketSrvPortParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceSocketSrvPort_2=ruleGSSIfaceSocketSrvPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceSocketSrvPort_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalIFACE.g:416:3: this_GSSIfaceSocketCliPort_3= ruleGSSIfaceSocketCliPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSocketCliPortParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceSocketCliPort_3=ruleGSSIfaceSocketCliPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceSocketCliPort_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalIFACE.g:428:3: this_GSSIfaceSpWTCPort_4= ruleGSSIfaceSpWTCPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceSpWTCPortParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceSpWTCPort_4=ruleGSSIfaceSpWTCPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceSpWTCPort_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalIFACE.g:440:3: this_GSSIfaceDummyPort_5= ruleGSSIfaceDummyPort
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getGSSIfacePortAccess().getGSSIfaceDummyPortParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_GSSIfaceDummyPort_5=ruleGSSIfaceDummyPort();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GSSIfaceDummyPort_5;
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
    // InternalIFACE.g:455:1: entryRuleGSSIfaceSpWPort returns [EObject current=null] : iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF ;
    public final EObject entryRuleGSSIfaceSpWPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSpWPort = null;


        try {
            // InternalIFACE.g:455:56: (iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF )
            // InternalIFACE.g:456:2: iv_ruleGSSIfaceSpWPort= ruleGSSIfaceSpWPort EOF
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
    // InternalIFACE.g:462:1: ruleGSSIfaceSpWPort returns [EObject current=null] : (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' ) ;
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
            // InternalIFACE.g:468:2: ( (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' ) )
            // InternalIFACE.g:469:2: (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' )
            {
            // InternalIFACE.g:469:2: (otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';' )
            // InternalIFACE.g:470:3: otherlv_0= 'spwPort' otherlv_1= '{' otherlv_2= 'type' otherlv_3= ':=' ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) ) otherlv_5= ';' otherlv_6= 'link' otherlv_7= ':=' ( (lv_link_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= 'writingPort' otherlv_11= ':=' ( (lv_writingPort_12_0= ruleINTEGER ) ) otherlv_13= ';' ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+ otherlv_15= '}' otherlv_16= ';'
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
            // InternalIFACE.g:486:3: ( (lv_type_4_0= ruleGSSIfaceSpWPortType ) )
            // InternalIFACE.g:487:4: (lv_type_4_0= ruleGSSIfaceSpWPortType )
            {
            // InternalIFACE.g:487:4: (lv_type_4_0= ruleGSSIfaceSpWPortType )
            // InternalIFACE.g:488:5: lv_type_4_0= ruleGSSIfaceSpWPortType
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
            // InternalIFACE.g:517:3: ( (lv_link_8_0= ruleINTEGER ) )
            // InternalIFACE.g:518:4: (lv_link_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:518:4: (lv_link_8_0= ruleINTEGER )
            // InternalIFACE.g:519:5: lv_link_8_0= ruleINTEGER
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
            // InternalIFACE.g:548:3: ( (lv_writingPort_12_0= ruleINTEGER ) )
            // InternalIFACE.g:549:4: (lv_writingPort_12_0= ruleINTEGER )
            {
            // InternalIFACE.g:549:4: (lv_writingPort_12_0= ruleINTEGER )
            // InternalIFACE.g:550:5: lv_writingPort_12_0= ruleINTEGER
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
            // InternalIFACE.g:571:3: ( (lv_readingPort_14_0= ruleGSSIfaceReadingPort ) )+
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
            	    // InternalIFACE.g:572:4: (lv_readingPort_14_0= ruleGSSIfaceReadingPort )
            	    {
            	    // InternalIFACE.g:572:4: (lv_readingPort_14_0= ruleGSSIfaceReadingPort )
            	    // InternalIFACE.g:573:5: lv_readingPort_14_0= ruleGSSIfaceReadingPort
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
    // InternalIFACE.g:602:1: entryRuleGSSIfaceReadingPort returns [EObject current=null] : iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF ;
    public final EObject entryRuleGSSIfaceReadingPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceReadingPort = null;


        try {
            // InternalIFACE.g:602:60: (iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF )
            // InternalIFACE.g:603:2: iv_ruleGSSIfaceReadingPort= ruleGSSIfaceReadingPort EOF
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
    // InternalIFACE.g:609:1: ruleGSSIfaceReadingPort returns [EObject current=null] : (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalIFACE.g:615:2: ( (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:616:2: (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:616:2: (otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:617:3: otherlv_0= 'readingPort' otherlv_1= '{' otherlv_2= 'port' otherlv_3= ':=' ( (lv_port_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
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
            // InternalIFACE.g:633:3: ( (lv_port_4_0= ruleINTEGER ) )
            // InternalIFACE.g:634:4: (lv_port_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:634:4: (lv_port_4_0= ruleINTEGER )
            // InternalIFACE.g:635:5: lv_port_4_0= ruleINTEGER
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
    // InternalIFACE.g:668:1: entryRuleGSSIfaceUartPort returns [EObject current=null] : iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF ;
    public final EObject entryRuleGSSIfaceUartPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceUartPort = null;


        try {
            // InternalIFACE.g:668:57: (iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF )
            // InternalIFACE.g:669:2: iv_ruleGSSIfaceUartPort= ruleGSSIfaceUartPort EOF
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
    // InternalIFACE.g:675:1: ruleGSSIfaceUartPort returns [EObject current=null] : (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'flowControl' otherlv_23= ':=' ( (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl ) ) otherlv_25= ';' ( (lv_portProtocol_26_0= ruleGSSIfacePortProtocol ) ) otherlv_27= '}' otherlv_28= ';' ) ;
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
        Token otherlv_27=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_number_4_0 = null;

        Enumerator lv_baudRate_8_0 = null;

        Enumerator lv_parity_12_0 = null;

        Enumerator lv_dataBits_16_0 = null;

        Enumerator lv_stopBits_20_0 = null;

        Enumerator lv_flowControl_24_0 = null;

        EObject lv_portProtocol_26_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:681:2: ( (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'flowControl' otherlv_23= ':=' ( (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl ) ) otherlv_25= ';' ( (lv_portProtocol_26_0= ruleGSSIfacePortProtocol ) ) otherlv_27= '}' otherlv_28= ';' ) )
            // InternalIFACE.g:682:2: (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'flowControl' otherlv_23= ':=' ( (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl ) ) otherlv_25= ';' ( (lv_portProtocol_26_0= ruleGSSIfacePortProtocol ) ) otherlv_27= '}' otherlv_28= ';' )
            {
            // InternalIFACE.g:682:2: (otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'flowControl' otherlv_23= ':=' ( (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl ) ) otherlv_25= ';' ( (lv_portProtocol_26_0= ruleGSSIfacePortProtocol ) ) otherlv_27= '}' otherlv_28= ';' )
            // InternalIFACE.g:683:3: otherlv_0= 'uartPort' otherlv_1= '{' otherlv_2= 'number' otherlv_3= ':=' ( (lv_number_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'baudRate' otherlv_7= ':=' ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) ) otherlv_9= ';' otherlv_10= 'parity' otherlv_11= ':=' ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) ) otherlv_13= ';' otherlv_14= 'dataBits' otherlv_15= ':=' ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) ) otherlv_17= ';' otherlv_18= 'stopBits' otherlv_19= ':=' ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) ) otherlv_21= ';' otherlv_22= 'flowControl' otherlv_23= ':=' ( (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl ) ) otherlv_25= ';' ( (lv_portProtocol_26_0= ruleGSSIfacePortProtocol ) ) otherlv_27= '}' otherlv_28= ';'
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
            // InternalIFACE.g:699:3: ( (lv_number_4_0= ruleINTEGER ) )
            // InternalIFACE.g:700:4: (lv_number_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:700:4: (lv_number_4_0= ruleINTEGER )
            // InternalIFACE.g:701:5: lv_number_4_0= ruleINTEGER
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
            // InternalIFACE.g:730:3: ( (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate ) )
            // InternalIFACE.g:731:4: (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate )
            {
            // InternalIFACE.g:731:4: (lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate )
            // InternalIFACE.g:732:5: lv_baudRate_8_0= ruleGSSIfaceUartPortBaudRate
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
            // InternalIFACE.g:761:3: ( (lv_parity_12_0= ruleGSSIfaceUartPortParity ) )
            // InternalIFACE.g:762:4: (lv_parity_12_0= ruleGSSIfaceUartPortParity )
            {
            // InternalIFACE.g:762:4: (lv_parity_12_0= ruleGSSIfaceUartPortParity )
            // InternalIFACE.g:763:5: lv_parity_12_0= ruleGSSIfaceUartPortParity
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
            // InternalIFACE.g:792:3: ( (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits ) )
            // InternalIFACE.g:793:4: (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits )
            {
            // InternalIFACE.g:793:4: (lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits )
            // InternalIFACE.g:794:5: lv_dataBits_16_0= ruleGSSIfaceUartPortDataBits
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
            // InternalIFACE.g:823:3: ( (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits ) )
            // InternalIFACE.g:824:4: (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits )
            {
            // InternalIFACE.g:824:4: (lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits )
            // InternalIFACE.g:825:5: lv_stopBits_20_0= ruleGSSIfaceUartPortStopBits
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

              			newLeafNode(otherlv_22, grammarAccess.getGSSIfaceUartPortAccess().getFlowControlKeyword_22());
              		
            }
            otherlv_23=(Token)match(input,17,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_23, grammarAccess.getGSSIfaceUartPortAccess().getColonEqualsSignKeyword_23());
              		
            }
            // InternalIFACE.g:854:3: ( (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl ) )
            // InternalIFACE.g:855:4: (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl )
            {
            // InternalIFACE.g:855:4: (lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl )
            // InternalIFACE.g:856:5: lv_flowControl_24_0= ruleGSSIfaceUartPortFlowControl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getFlowControlGSSIfaceUartPortFlowControlEnumRuleCall_24_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_flowControl_24_0=ruleGSSIfaceUartPortFlowControl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"flowControl",
              						lv_flowControl_24_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfaceUartPortFlowControl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_25=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_25());
              		
            }
            // InternalIFACE.g:877:3: ( (lv_portProtocol_26_0= ruleGSSIfacePortProtocol ) )
            // InternalIFACE.g:878:4: (lv_portProtocol_26_0= ruleGSSIfacePortProtocol )
            {
            // InternalIFACE.g:878:4: (lv_portProtocol_26_0= ruleGSSIfacePortProtocol )
            // InternalIFACE.g:879:5: lv_portProtocol_26_0= ruleGSSIfacePortProtocol
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceUartPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_26_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_portProtocol_26_0=ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceUartPortRule());
              					}
              					set(
              						current,
              						"portProtocol",
              						lv_portProtocol_26_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocol");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_27=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_27, grammarAccess.getGSSIfaceUartPortAccess().getRightCurlyBracketKeyword_27());
              		
            }
            otherlv_28=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getGSSIfaceUartPortAccess().getSemicolonKeyword_28());
              		
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


    // $ANTLR start "entryRuleGSSIfaceSocketSrvPort"
    // InternalIFACE.g:908:1: entryRuleGSSIfaceSocketSrvPort returns [EObject current=null] : iv_ruleGSSIfaceSocketSrvPort= ruleGSSIfaceSocketSrvPort EOF ;
    public final EObject entryRuleGSSIfaceSocketSrvPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSocketSrvPort = null;


        try {
            // InternalIFACE.g:908:62: (iv_ruleGSSIfaceSocketSrvPort= ruleGSSIfaceSocketSrvPort EOF )
            // InternalIFACE.g:909:2: iv_ruleGSSIfaceSocketSrvPort= ruleGSSIfaceSocketSrvPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceSocketSrvPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceSocketSrvPort=ruleGSSIfaceSocketSrvPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceSocketSrvPort; 
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
    // $ANTLR end "entryRuleGSSIfaceSocketSrvPort"


    // $ANTLR start "ruleGSSIfaceSocketSrvPort"
    // InternalIFACE.g:915:1: ruleGSSIfaceSocketSrvPort returns [EObject current=null] : (otherlv_0= 'socketSrvPort' otherlv_1= '{' otherlv_2= 'portNumber' otherlv_3= ':=' ( (lv_portNumber_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_portProtocol_6_0= ruleGSSIfacePortProtocol ) ) otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleGSSIfaceSocketSrvPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_portNumber_4_0 = null;

        EObject lv_portProtocol_6_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:921:2: ( (otherlv_0= 'socketSrvPort' otherlv_1= '{' otherlv_2= 'portNumber' otherlv_3= ':=' ( (lv_portNumber_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_portProtocol_6_0= ruleGSSIfacePortProtocol ) ) otherlv_7= '}' otherlv_8= ';' ) )
            // InternalIFACE.g:922:2: (otherlv_0= 'socketSrvPort' otherlv_1= '{' otherlv_2= 'portNumber' otherlv_3= ':=' ( (lv_portNumber_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_portProtocol_6_0= ruleGSSIfacePortProtocol ) ) otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalIFACE.g:922:2: (otherlv_0= 'socketSrvPort' otherlv_1= '{' otherlv_2= 'portNumber' otherlv_3= ':=' ( (lv_portNumber_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_portProtocol_6_0= ruleGSSIfacePortProtocol ) ) otherlv_7= '}' otherlv_8= ';' )
            // InternalIFACE.g:923:3: otherlv_0= 'socketSrvPort' otherlv_1= '{' otherlv_2= 'portNumber' otherlv_3= ':=' ( (lv_portNumber_4_0= ruleINTEGER ) ) otherlv_5= ';' ( (lv_portProtocol_6_0= ruleGSSIfacePortProtocol ) ) otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSocketSrvPortAccess().getSocketSrvPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSocketSrvPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSocketSrvPortAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:939:3: ( (lv_portNumber_4_0= ruleINTEGER ) )
            // InternalIFACE.g:940:4: (lv_portNumber_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:940:4: (lv_portNumber_4_0= ruleINTEGER )
            // InternalIFACE.g:941:5: lv_portNumber_4_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortNumberINTEGERParserRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_portNumber_4_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSocketSrvPortRule());
              					}
              					set(
              						current,
              						"portNumber",
              						lv_portNumber_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_5());
              		
            }
            // InternalIFACE.g:962:3: ( (lv_portProtocol_6_0= ruleGSSIfacePortProtocol ) )
            // InternalIFACE.g:963:4: (lv_portProtocol_6_0= ruleGSSIfacePortProtocol )
            {
            // InternalIFACE.g:963:4: (lv_portProtocol_6_0= ruleGSSIfacePortProtocol )
            // InternalIFACE.g:964:5: lv_portProtocol_6_0= ruleGSSIfacePortProtocol
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSocketSrvPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_6_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_portProtocol_6_0=ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSocketSrvPortRule());
              					}
              					set(
              						current,
              						"portProtocol",
              						lv_portProtocol_6_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocol");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSocketSrvPortAccess().getRightCurlyBracketKeyword_7());
              		
            }
            otherlv_8=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getGSSIfaceSocketSrvPortAccess().getSemicolonKeyword_8());
              		
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
    // $ANTLR end "ruleGSSIfaceSocketSrvPort"


    // $ANTLR start "entryRuleGSSIfaceSocketCliPort"
    // InternalIFACE.g:993:1: entryRuleGSSIfaceSocketCliPort returns [EObject current=null] : iv_ruleGSSIfaceSocketCliPort= ruleGSSIfaceSocketCliPort EOF ;
    public final EObject entryRuleGSSIfaceSocketCliPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSocketCliPort = null;


        try {
            // InternalIFACE.g:993:62: (iv_ruleGSSIfaceSocketCliPort= ruleGSSIfaceSocketCliPort EOF )
            // InternalIFACE.g:994:2: iv_ruleGSSIfaceSocketCliPort= ruleGSSIfaceSocketCliPort EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfaceSocketCliPortRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfaceSocketCliPort=ruleGSSIfaceSocketCliPort();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfaceSocketCliPort; 
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
    // $ANTLR end "entryRuleGSSIfaceSocketCliPort"


    // $ANTLR start "ruleGSSIfaceSocketCliPort"
    // InternalIFACE.g:1000:1: ruleGSSIfaceSocketCliPort returns [EObject current=null] : (otherlv_0= 'socketCliPort' otherlv_1= '{' otherlv_2= 'ipAddress' otherlv_3= ':=' ( (lv_ipAddress_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'portNumber' otherlv_7= ':=' ( (lv_portNumber_8_0= ruleINTEGER ) ) otherlv_9= ';' ( (lv_portProtocol_10_0= ruleGSSIfacePortProtocol ) ) otherlv_11= '}' otherlv_12= ';' ) ;
    public final EObject ruleGSSIfaceSocketCliPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_ipAddress_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_portNumber_8_0 = null;

        EObject lv_portProtocol_10_0 = null;



        	enterRule();

        try {
            // InternalIFACE.g:1006:2: ( (otherlv_0= 'socketCliPort' otherlv_1= '{' otherlv_2= 'ipAddress' otherlv_3= ':=' ( (lv_ipAddress_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'portNumber' otherlv_7= ':=' ( (lv_portNumber_8_0= ruleINTEGER ) ) otherlv_9= ';' ( (lv_portProtocol_10_0= ruleGSSIfacePortProtocol ) ) otherlv_11= '}' otherlv_12= ';' ) )
            // InternalIFACE.g:1007:2: (otherlv_0= 'socketCliPort' otherlv_1= '{' otherlv_2= 'ipAddress' otherlv_3= ':=' ( (lv_ipAddress_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'portNumber' otherlv_7= ':=' ( (lv_portNumber_8_0= ruleINTEGER ) ) otherlv_9= ';' ( (lv_portProtocol_10_0= ruleGSSIfacePortProtocol ) ) otherlv_11= '}' otherlv_12= ';' )
            {
            // InternalIFACE.g:1007:2: (otherlv_0= 'socketCliPort' otherlv_1= '{' otherlv_2= 'ipAddress' otherlv_3= ':=' ( (lv_ipAddress_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'portNumber' otherlv_7= ':=' ( (lv_portNumber_8_0= ruleINTEGER ) ) otherlv_9= ';' ( (lv_portProtocol_10_0= ruleGSSIfacePortProtocol ) ) otherlv_11= '}' otherlv_12= ';' )
            // InternalIFACE.g:1008:3: otherlv_0= 'socketCliPort' otherlv_1= '{' otherlv_2= 'ipAddress' otherlv_3= ':=' ( (lv_ipAddress_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'portNumber' otherlv_7= ':=' ( (lv_portNumber_8_0= ruleINTEGER ) ) otherlv_9= ';' ( (lv_portProtocol_10_0= ruleGSSIfacePortProtocol ) ) otherlv_11= '}' otherlv_12= ';'
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSocketCliPortAccess().getSocketCliPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSocketCliPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1024:3: ( (lv_ipAddress_4_0= RULE_STRING ) )
            // InternalIFACE.g:1025:4: (lv_ipAddress_4_0= RULE_STRING )
            {
            // InternalIFACE.g:1025:4: (lv_ipAddress_4_0= RULE_STRING )
            // InternalIFACE.g:1026:5: lv_ipAddress_4_0= RULE_STRING
            {
            lv_ipAddress_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ipAddress_4_0, grammarAccess.getGSSIfaceSocketCliPortAccess().getIpAddressSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getGSSIfaceSocketCliPortRule());
              					}
              					setWithLastConsumed(
              						current,
              						"ipAddress",
              						lv_ipAddress_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSocketCliPortAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1054:3: ( (lv_portNumber_8_0= ruleINTEGER ) )
            // InternalIFACE.g:1055:4: (lv_portNumber_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:1055:4: (lv_portNumber_8_0= ruleINTEGER )
            // InternalIFACE.g:1056:5: lv_portNumber_8_0= ruleINTEGER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortNumberINTEGERParserRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_portNumber_8_0=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSocketCliPortRule());
              					}
              					set(
              						current,
              						"portNumber",
              						lv_portNumber_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.INTEGER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_9());
              		
            }
            // InternalIFACE.g:1077:3: ( (lv_portProtocol_10_0= ruleGSSIfacePortProtocol ) )
            // InternalIFACE.g:1078:4: (lv_portProtocol_10_0= ruleGSSIfacePortProtocol )
            {
            // InternalIFACE.g:1078:4: (lv_portProtocol_10_0= ruleGSSIfacePortProtocol )
            // InternalIFACE.g:1079:5: lv_portProtocol_10_0= ruleGSSIfacePortProtocol
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfaceSocketCliPortAccess().getPortProtocolGSSIfacePortProtocolParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_12);
            lv_portProtocol_10_0=ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfaceSocketCliPortRule());
              					}
              					set(
              						current,
              						"portProtocol",
              						lv_portProtocol_10_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocol");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_11=(Token)match(input,19,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGSSIfaceSocketCliPortAccess().getRightCurlyBracketKeyword_11());
              		
            }
            otherlv_12=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getGSSIfaceSocketCliPortAccess().getSemicolonKeyword_12());
              		
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
    // $ANTLR end "ruleGSSIfaceSocketCliPort"


    // $ANTLR start "entryRuleGSSIfacePortProtocol"
    // InternalIFACE.g:1108:1: entryRuleGSSIfacePortProtocol returns [EObject current=null] : iv_ruleGSSIfacePortProtocol= ruleGSSIfacePortProtocol EOF ;
    public final EObject entryRuleGSSIfacePortProtocol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfacePortProtocol = null;


        try {
            // InternalIFACE.g:1108:61: (iv_ruleGSSIfacePortProtocol= ruleGSSIfacePortProtocol EOF )
            // InternalIFACE.g:1109:2: iv_ruleGSSIfacePortProtocol= ruleGSSIfacePortProtocol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGSSIfacePortProtocolRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleGSSIfacePortProtocol=ruleGSSIfacePortProtocol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGSSIfacePortProtocol; 
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
    // $ANTLR end "entryRuleGSSIfacePortProtocol"


    // $ANTLR start "ruleGSSIfacePortProtocol"
    // InternalIFACE.g:1115:1: ruleGSSIfacePortProtocol returns [EObject current=null] : (otherlv_0= 'portProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfacePortProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfacePortProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleGSSIfacePortProtocol() throws RecognitionException {
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
            // InternalIFACE.g:1121:2: ( (otherlv_0= 'portProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfacePortProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfacePortProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalIFACE.g:1122:2: (otherlv_0= 'portProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfacePortProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfacePortProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalIFACE.g:1122:2: (otherlv_0= 'portProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfacePortProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfacePortProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';' )
            // InternalIFACE.g:1123:3: otherlv_0= 'portProtocol' otherlv_1= '{' otherlv_2= 'unit' otherlv_3= ':=' ( (lv_unit_4_0= ruleGSSIfacePortProtocolUnit ) ) otherlv_5= ';' otherlv_6= 'power' otherlv_7= ':=' ( (lv_power_8_0= ruleGSSIfacePortProtocolPower ) ) otherlv_9= ';' ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) ) ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) ) ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) ) ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfacePortProtocolAccess().getPortProtocolKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfacePortProtocolAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfacePortProtocolAccess().getUnitKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1139:3: ( (lv_unit_4_0= ruleGSSIfacePortProtocolUnit ) )
            // InternalIFACE.g:1140:4: (lv_unit_4_0= ruleGSSIfacePortProtocolUnit )
            {
            // InternalIFACE.g:1140:4: (lv_unit_4_0= ruleGSSIfacePortProtocolUnit )
            // InternalIFACE.g:1141:5: lv_unit_4_0= ruleGSSIfacePortProtocolUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfacePortProtocolAccess().getUnitGSSIfacePortProtocolUnitEnumRuleCall_4_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_unit_4_0=ruleGSSIfacePortProtocolUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfacePortProtocolRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_4_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocolUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfacePortProtocolAccess().getPowerKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfacePortProtocolAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1170:3: ( (lv_power_8_0= ruleGSSIfacePortProtocolPower ) )
            // InternalIFACE.g:1171:4: (lv_power_8_0= ruleGSSIfacePortProtocolPower )
            {
            // InternalIFACE.g:1171:4: (lv_power_8_0= ruleGSSIfacePortProtocolPower )
            // InternalIFACE.g:1172:5: lv_power_8_0= ruleGSSIfacePortProtocolPower
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfacePortProtocolAccess().getPowerGSSIfacePortProtocolPowerEnumRuleCall_8_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_5);
            lv_power_8_0=ruleGSSIfacePortProtocolPower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfacePortProtocolRule());
              					}
              					set(
              						current,
              						"power",
              						lv_power_8_0,
              						"es.uah.aut.srg.gss.lang.iface.IFACE.GSSIfacePortProtocolPower");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,13,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_9());
              		
            }
            // InternalIFACE.g:1193:3: ( (lv_constSize_10_0= ruleGSSIfaceConstSize ) )
            // InternalIFACE.g:1194:4: (lv_constSize_10_0= ruleGSSIfaceConstSize )
            {
            // InternalIFACE.g:1194:4: (lv_constSize_10_0= ruleGSSIfaceConstSize )
            // InternalIFACE.g:1195:5: lv_constSize_10_0= ruleGSSIfaceConstSize
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfacePortProtocolAccess().getConstSizeGSSIfaceConstSizeParserRuleCall_10_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_40);
            lv_constSize_10_0=ruleGSSIfaceConstSize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfacePortProtocolRule());
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

            // InternalIFACE.g:1212:3: ( (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset ) )
            // InternalIFACE.g:1213:4: (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset )
            {
            // InternalIFACE.g:1213:4: (lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset )
            // InternalIFACE.g:1214:5: lv_sizeFieldOffset_11_0= ruleGSSIfaceSizeFieldOffset
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldOffsetGSSIfaceSizeFieldOffsetParserRuleCall_11_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_sizeFieldOffset_11_0=ruleGSSIfaceSizeFieldOffset();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfacePortProtocolRule());
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

            // InternalIFACE.g:1231:3: ( (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim ) )
            // InternalIFACE.g:1232:4: (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim )
            {
            // InternalIFACE.g:1232:4: (lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim )
            // InternalIFACE.g:1233:5: lv_sizeFieldTrim_12_0= ruleGSSIfaceSizeFieldTrim
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGSSIfacePortProtocolAccess().getSizeFieldTrimGSSIfaceSizeFieldTrimParserRuleCall_12_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_42);
            lv_sizeFieldTrim_12_0=ruleGSSIfaceSizeFieldTrim();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGSSIfacePortProtocolRule());
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

            // InternalIFACE.g:1250:3: ( (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIFACE.g:1251:4: (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern )
                    {
                    // InternalIFACE.g:1251:4: (lv_syncPattern_13_0= ruleGSSIfaceSyncPattern )
                    // InternalIFACE.g:1252:5: lv_syncPattern_13_0= ruleGSSIfaceSyncPattern
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getGSSIfacePortProtocolAccess().getSyncPatternGSSIfaceSyncPatternParserRuleCall_13_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_12);
                    lv_syncPattern_13_0=ruleGSSIfaceSyncPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getGSSIfacePortProtocolRule());
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

              			newLeafNode(otherlv_14, grammarAccess.getGSSIfacePortProtocolAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_15=(Token)match(input,13,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getGSSIfacePortProtocolAccess().getSemicolonKeyword_15());
              		
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
    // $ANTLR end "ruleGSSIfacePortProtocol"


    // $ANTLR start "entryRuleGSSIfaceConstSize"
    // InternalIFACE.g:1281:1: entryRuleGSSIfaceConstSize returns [EObject current=null] : iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF ;
    public final EObject entryRuleGSSIfaceConstSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceConstSize = null;


        try {
            // InternalIFACE.g:1281:58: (iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF )
            // InternalIFACE.g:1282:2: iv_ruleGSSIfaceConstSize= ruleGSSIfaceConstSize EOF
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
    // InternalIFACE.g:1288:1: ruleGSSIfaceConstSize returns [EObject current=null] : (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalIFACE.g:1294:2: ( (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalIFACE.g:1295:2: (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalIFACE.g:1295:2: (otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalIFACE.g:1296:3: otherlv_0= 'constSize' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceConstSizeAccess().getConstSizeKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceConstSizeAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceConstSizeAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1312:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1313:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1313:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalIFACE.g:1314:5: lv_bytes_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceConstSizeAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceConstSizeAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceConstSizeAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1343:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalIFACE.g:1344:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:1344:4: (lv_bits_8_0= ruleINTEGER )
            // InternalIFACE.g:1345:5: lv_bits_8_0= ruleINTEGER
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
    // InternalIFACE.g:1378:1: entryRuleGSSIfaceSizeFieldOffset returns [EObject current=null] : iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF ;
    public final EObject entryRuleGSSIfaceSizeFieldOffset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSizeFieldOffset = null;


        try {
            // InternalIFACE.g:1378:64: (iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF )
            // InternalIFACE.g:1379:2: iv_ruleGSSIfaceSizeFieldOffset= ruleGSSIfaceSizeFieldOffset EOF
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
    // InternalIFACE.g:1385:1: ruleGSSIfaceSizeFieldOffset returns [EObject current=null] : (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalIFACE.g:1391:2: ( (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalIFACE.g:1392:2: (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalIFACE.g:1392:2: (otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalIFACE.g:1393:3: otherlv_0= 'sizeFieldOffset' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,43,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSizeFieldOffsetKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1409:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1410:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1410:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalIFACE.g:1411:5: lv_bytes_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldOffsetAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1440:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalIFACE.g:1441:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:1441:4: (lv_bits_8_0= ruleINTEGER )
            // InternalIFACE.g:1442:5: lv_bits_8_0= ruleINTEGER
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
    // InternalIFACE.g:1475:1: entryRuleGSSIfaceSizeFieldTrim returns [EObject current=null] : iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF ;
    public final EObject entryRuleGSSIfaceSizeFieldTrim() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSizeFieldTrim = null;


        try {
            // InternalIFACE.g:1475:62: (iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF )
            // InternalIFACE.g:1476:2: iv_ruleGSSIfaceSizeFieldTrim= ruleGSSIfaceSizeFieldTrim EOF
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
    // InternalIFACE.g:1482:1: ruleGSSIfaceSizeFieldTrim returns [EObject current=null] : (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) ;
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
            // InternalIFACE.g:1488:2: ( (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' ) )
            // InternalIFACE.g:1489:2: (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            {
            // InternalIFACE.g:1489:2: (otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';' )
            // InternalIFACE.g:1490:3: otherlv_0= 'sizeFieldTrim' otherlv_1= '{' otherlv_2= 'bytes' otherlv_3= ':=' ( (lv_bytes_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= 'bits' otherlv_7= ':=' ( (lv_bits_8_0= ruleINTEGER ) ) otherlv_9= ';' otherlv_10= '}' otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSizeFieldTrimKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBytesKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1506:3: ( (lv_bytes_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1507:4: (lv_bytes_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1507:4: (lv_bytes_4_0= ruleINTEGER )
            // InternalIFACE.g:1508:5: lv_bytes_4_0= ruleINTEGER
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

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getSemicolonKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,42,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getBitsKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getGSSIfaceSizeFieldTrimAccess().getColonEqualsSignKeyword_7());
              		
            }
            // InternalIFACE.g:1537:3: ( (lv_bits_8_0= ruleINTEGER ) )
            // InternalIFACE.g:1538:4: (lv_bits_8_0= ruleINTEGER )
            {
            // InternalIFACE.g:1538:4: (lv_bits_8_0= ruleINTEGER )
            // InternalIFACE.g:1539:5: lv_bits_8_0= ruleINTEGER
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
    // InternalIFACE.g:1572:1: entryRuleGSSIfaceSyncPattern returns [EObject current=null] : iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF ;
    public final EObject entryRuleGSSIfaceSyncPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSyncPattern = null;


        try {
            // InternalIFACE.g:1572:60: (iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF )
            // InternalIFACE.g:1573:2: iv_ruleGSSIfaceSyncPattern= ruleGSSIfaceSyncPattern EOF
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
    // InternalIFACE.g:1579:1: ruleGSSIfaceSyncPattern returns [EObject current=null] : (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalIFACE.g:1585:2: ( (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:1586:2: (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:1586:2: (otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:1587:3: otherlv_0= 'syncPattern' otherlv_1= '{' otherlv_2= 'hexValue' otherlv_3= ':=' ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSyncPatternAccess().getSyncPatternKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSyncPatternAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSyncPatternAccess().getHexValueKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSyncPatternAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1603:3: ( (lv_hexValue_4_0= RULE_HEXADECIMAL ) )
            // InternalIFACE.g:1604:4: (lv_hexValue_4_0= RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:1604:4: (lv_hexValue_4_0= RULE_HEXADECIMAL )
            // InternalIFACE.g:1605:5: lv_hexValue_4_0= RULE_HEXADECIMAL
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
    // InternalIFACE.g:1637:1: entryRuleGSSIfaceSpWTCPort returns [EObject current=null] : iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF ;
    public final EObject entryRuleGSSIfaceSpWTCPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceSpWTCPort = null;


        try {
            // InternalIFACE.g:1637:58: (iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF )
            // InternalIFACE.g:1638:2: iv_ruleGSSIfaceSpWTCPort= ruleGSSIfaceSpWTCPort EOF
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
    // InternalIFACE.g:1644:1: ruleGSSIfaceSpWTCPort returns [EObject current=null] : (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalIFACE.g:1650:2: ( (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' ) )
            // InternalIFACE.g:1651:2: (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalIFACE.g:1651:2: (otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';' )
            // InternalIFACE.g:1652:3: otherlv_0= 'spwTCPort' otherlv_1= '{' otherlv_2= 'spwPortRef' otherlv_3= ':=' ( (lv_spwPortRef_4_0= ruleINTEGER ) ) otherlv_5= ';' otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwTCPortKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGSSIfaceSpWTCPortAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,48,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGSSIfaceSpWTCPortAccess().getSpwPortRefKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGSSIfaceSpWTCPortAccess().getColonEqualsSignKeyword_3());
              		
            }
            // InternalIFACE.g:1668:3: ( (lv_spwPortRef_4_0= ruleINTEGER ) )
            // InternalIFACE.g:1669:4: (lv_spwPortRef_4_0= ruleINTEGER )
            {
            // InternalIFACE.g:1669:4: (lv_spwPortRef_4_0= ruleINTEGER )
            // InternalIFACE.g:1670:5: lv_spwPortRef_4_0= ruleINTEGER
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
    // InternalIFACE.g:1703:1: entryRuleGSSIfaceDummyPort returns [EObject current=null] : iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF ;
    public final EObject entryRuleGSSIfaceDummyPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGSSIfaceDummyPort = null;


        try {
            // InternalIFACE.g:1703:58: (iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF )
            // InternalIFACE.g:1704:2: iv_ruleGSSIfaceDummyPort= ruleGSSIfaceDummyPort EOF
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
    // InternalIFACE.g:1710:1: ruleGSSIfaceDummyPort returns [EObject current=null] : ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleGSSIfaceDummyPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalIFACE.g:1716:2: ( ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) )
            // InternalIFACE.g:1717:2: ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            {
            // InternalIFACE.g:1717:2: ( () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            // InternalIFACE.g:1718:3: () otherlv_1= 'dummyPort' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';'
            {
            // InternalIFACE.g:1718:3: ()
            // InternalIFACE.g:1719:4: 
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

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_7); if (state.failed) return current;
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
    // InternalIFACE.g:1748:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalIFACE.g:1748:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalIFACE.g:1749:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalIFACE.g:1755:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:1761:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalIFACE.g:1762:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalIFACE.g:1762:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalIFACE.g:1763:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalIFACE.g:1770:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==50) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIFACE.g:1771:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
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
    // InternalIFACE.g:1788:1: entryRuleVersion returns [String current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final String entryRuleVersion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersion = null;


        try {
            // InternalIFACE.g:1788:47: (iv_ruleVersion= ruleVersion EOF )
            // InternalIFACE.g:1789:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalIFACE.g:1795:1: ruleVersion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) ;
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
            // InternalIFACE.g:1801:2: ( ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* ) )
            // InternalIFACE.g:1802:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            {
            // InternalIFACE.g:1802:2: ( (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )* )
            // InternalIFACE.g:1803:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) ) (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            {
            // InternalIFACE.g:1803:3: (this_INT_0= RULE_INT | ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==13||LA8_1==50||LA8_1==52) ) {
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
                    // InternalIFACE.g:1804:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_0, grammarAccess.getVersionAccess().getINTTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1812:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    {
                    // InternalIFACE.g:1812:4: ( (this_INT_1= RULE_INT )? this_ID_2= RULE_ID )
                    // InternalIFACE.g:1813:5: (this_INT_1= RULE_INT )? this_ID_2= RULE_ID
                    {
                    // InternalIFACE.g:1813:5: (this_INT_1= RULE_INT )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_INT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalIFACE.g:1814:6: this_INT_1= RULE_INT
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

                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
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

            // InternalIFACE.g:1831:3: (kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==50) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIFACE.g:1832:4: kw= '.' (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    {
            	    kw=(Token)match(input,50,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getVersionAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    // InternalIFACE.g:1837:4: (this_INT_4= RULE_INT | ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID ) )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==RULE_INT) ) {
            	        int LA10_1 = input.LA(2);

            	        if ( (LA10_1==EOF||LA10_1==13||LA10_1==50||LA10_1==52) ) {
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
            	            // InternalIFACE.g:1838:5: this_INT_4= RULE_INT
            	            {
            	            this_INT_4=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					current.merge(this_INT_4);
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_INT_4, grammarAccess.getVersionAccess().getINTTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalIFACE.g:1846:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            {
            	            // InternalIFACE.g:1846:5: ( (this_INT_5= RULE_INT )? this_ID_6= RULE_ID )
            	            // InternalIFACE.g:1847:6: (this_INT_5= RULE_INT )? this_ID_6= RULE_ID
            	            {
            	            // InternalIFACE.g:1847:6: (this_INT_5= RULE_INT )?
            	            int alt9=2;
            	            int LA9_0 = input.LA(1);

            	            if ( (LA9_0==RULE_INT) ) {
            	                alt9=1;
            	            }
            	            switch (alt9) {
            	                case 1 :
            	                    // InternalIFACE.g:1848:7: this_INT_5= RULE_INT
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

            	            this_ID_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); if (state.failed) return current;
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
    // InternalIFACE.g:1870:1: entryRuleVersionedQualifiedName returns [String current=null] : iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF ;
    public final String entryRuleVersionedQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVersionedQualifiedName = null;


        try {
            // InternalIFACE.g:1870:62: (iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF )
            // InternalIFACE.g:1871:2: iv_ruleVersionedQualifiedName= ruleVersionedQualifiedName EOF
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
    // InternalIFACE.g:1877:1: ruleVersionedQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleVersionedQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;

        AntlrDatatypeRuleToken this_Version_2 = null;



        	enterRule();

        try {
            // InternalIFACE.g:1883:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' ) )
            // InternalIFACE.g:1884:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            {
            // InternalIFACE.g:1884:2: (this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')' )
            // InternalIFACE.g:1885:3: this_QualifiedName_0= ruleQualifiedName kw= '(' this_Version_2= ruleVersion kw= ')'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVersionedQualifiedNameAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_49);
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
            pushFollow(FollowSets000.FOLLOW_50);
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


    // $ANTLR start "entryRuleINTEGER"
    // InternalIFACE.g:1919:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // InternalIFACE.g:1919:47: (iv_ruleINTEGER= ruleINTEGER EOF )
            // InternalIFACE.g:1920:2: iv_ruleINTEGER= ruleINTEGER EOF
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
    // InternalIFACE.g:1926:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_HEXADECIMAL_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:1932:2: ( ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL ) )
            // InternalIFACE.g:1933:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            {
            // InternalIFACE.g:1933:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) | this_HEXADECIMAL_2= RULE_HEXADECIMAL )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT||LA13_0==53) ) {
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
                    // InternalIFACE.g:1934:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    {
                    // InternalIFACE.g:1934:3: ( (kw= '-' )? this_INT_1= RULE_INT )
                    // InternalIFACE.g:1935:4: (kw= '-' )? this_INT_1= RULE_INT
                    {
                    // InternalIFACE.g:1935:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==53) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalIFACE.g:1936:5: kw= '-'
                            {
                            kw=(Token)match(input,53,FollowSets000.FOLLOW_51); if (state.failed) return current;
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
                    // InternalIFACE.g:1951:3: this_HEXADECIMAL_2= RULE_HEXADECIMAL
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
    // InternalIFACE.g:1962:1: ruleGSSIfaceSpWPortType returns [Enumerator current=null] : ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) ) ;
    public final Enumerator ruleGSSIfaceSpWPortType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:1968:2: ( ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) ) )
            // InternalIFACE.g:1969:2: ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) )
            {
            // InternalIFACE.g:1969:2: ( (enumLiteral_0= 'usb' ) | (enumLiteral_1= 'mk2' ) | (enumLiteral_2= 'pci' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt14=1;
                }
                break;
            case 55:
                {
                alt14=2;
                }
                break;
            case 56:
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
                    // InternalIFACE.g:1970:3: (enumLiteral_0= 'usb' )
                    {
                    // InternalIFACE.g:1970:3: (enumLiteral_0= 'usb' )
                    // InternalIFACE.g:1971:4: enumLiteral_0= 'usb'
                    {
                    enumLiteral_0=(Token)match(input,54,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceSpWPortTypeAccess().getUsbEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:1978:3: (enumLiteral_1= 'mk2' )
                    {
                    // InternalIFACE.g:1978:3: (enumLiteral_1= 'mk2' )
                    // InternalIFACE.g:1979:4: enumLiteral_1= 'mk2'
                    {
                    enumLiteral_1=(Token)match(input,55,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceSpWPortTypeAccess().getMk2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:1986:3: (enumLiteral_2= 'pci' )
                    {
                    // InternalIFACE.g:1986:3: (enumLiteral_2= 'pci' )
                    // InternalIFACE.g:1987:4: enumLiteral_2= 'pci'
                    {
                    enumLiteral_2=(Token)match(input,56,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalIFACE.g:1997:1: ruleGSSIfaceUartPortBaudRate returns [Enumerator current=null] : ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortBaudRate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:2003:2: ( ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) ) )
            // InternalIFACE.g:2004:2: ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) )
            {
            // InternalIFACE.g:2004:2: ( (enumLiteral_0= '38400bauds' ) | (enumLiteral_1= '115200bauds' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==57) ) {
                alt15=1;
            }
            else if ( (LA15_0==58) ) {
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
                    // InternalIFACE.g:2005:3: (enumLiteral_0= '38400bauds' )
                    {
                    // InternalIFACE.g:2005:3: (enumLiteral_0= '38400bauds' )
                    // InternalIFACE.g:2006:4: enumLiteral_0= '38400bauds'
                    {
                    enumLiteral_0=(Token)match(input,57,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortBaudRateAccess().get_38400EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2013:3: (enumLiteral_1= '115200bauds' )
                    {
                    // InternalIFACE.g:2013:3: (enumLiteral_1= '115200bauds' )
                    // InternalIFACE.g:2014:4: enumLiteral_1= '115200bauds'
                    {
                    enumLiteral_1=(Token)match(input,58,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalIFACE.g:2024:1: ruleGSSIfaceUartPortParity returns [Enumerator current=null] : ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortParity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalIFACE.g:2030:2: ( ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) ) )
            // InternalIFACE.g:2031:2: ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) )
            {
            // InternalIFACE.g:2031:2: ( (enumLiteral_0= 'NO' ) | (enumLiteral_1= 'ODD' ) | (enumLiteral_2= 'EVEN' ) | (enumLiteral_3= 'MARK' ) | (enumLiteral_4= 'SPACE' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt16=1;
                }
                break;
            case 60:
                {
                alt16=2;
                }
                break;
            case 61:
                {
                alt16=3;
                }
                break;
            case 62:
                {
                alt16=4;
                }
                break;
            case 63:
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
                    // InternalIFACE.g:2032:3: (enumLiteral_0= 'NO' )
                    {
                    // InternalIFACE.g:2032:3: (enumLiteral_0= 'NO' )
                    // InternalIFACE.g:2033:4: enumLiteral_0= 'NO'
                    {
                    enumLiteral_0=(Token)match(input,59,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortParityAccess().getNOEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2040:3: (enumLiteral_1= 'ODD' )
                    {
                    // InternalIFACE.g:2040:3: (enumLiteral_1= 'ODD' )
                    // InternalIFACE.g:2041:4: enumLiteral_1= 'ODD'
                    {
                    enumLiteral_1=(Token)match(input,60,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortParityAccess().getODDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:2048:3: (enumLiteral_2= 'EVEN' )
                    {
                    // InternalIFACE.g:2048:3: (enumLiteral_2= 'EVEN' )
                    // InternalIFACE.g:2049:4: enumLiteral_2= 'EVEN'
                    {
                    enumLiteral_2=(Token)match(input,61,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartPortParityAccess().getEVENEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:2056:3: (enumLiteral_3= 'MARK' )
                    {
                    // InternalIFACE.g:2056:3: (enumLiteral_3= 'MARK' )
                    // InternalIFACE.g:2057:4: enumLiteral_3= 'MARK'
                    {
                    enumLiteral_3=(Token)match(input,62,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getGSSIfaceUartPortParityAccess().getMARKEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalIFACE.g:2064:3: (enumLiteral_4= 'SPACE' )
                    {
                    // InternalIFACE.g:2064:3: (enumLiteral_4= 'SPACE' )
                    // InternalIFACE.g:2065:4: enumLiteral_4= 'SPACE'
                    {
                    enumLiteral_4=(Token)match(input,63,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalIFACE.g:2075:1: ruleGSSIfaceUartPortDataBits returns [Enumerator current=null] : ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortDataBits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalIFACE.g:2081:2: ( ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) ) )
            // InternalIFACE.g:2082:2: ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) )
            {
            // InternalIFACE.g:2082:2: ( (enumLiteral_0= '5bits' ) | (enumLiteral_1= '6bits' ) | (enumLiteral_2= '7bits' ) | (enumLiteral_3= '8bits' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt17=1;
                }
                break;
            case 65:
                {
                alt17=2;
                }
                break;
            case 66:
                {
                alt17=3;
                }
                break;
            case 67:
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
                    // InternalIFACE.g:2083:3: (enumLiteral_0= '5bits' )
                    {
                    // InternalIFACE.g:2083:3: (enumLiteral_0= '5bits' )
                    // InternalIFACE.g:2084:4: enumLiteral_0= '5bits'
                    {
                    enumLiteral_0=(Token)match(input,64,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_5EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2091:3: (enumLiteral_1= '6bits' )
                    {
                    // InternalIFACE.g:2091:3: (enumLiteral_1= '6bits' )
                    // InternalIFACE.g:2092:4: enumLiteral_1= '6bits'
                    {
                    enumLiteral_1=(Token)match(input,65,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_6EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:2099:3: (enumLiteral_2= '7bits' )
                    {
                    // InternalIFACE.g:2099:3: (enumLiteral_2= '7bits' )
                    // InternalIFACE.g:2100:4: enumLiteral_2= '7bits'
                    {
                    enumLiteral_2=(Token)match(input,66,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfaceUartPortDataBitsAccess().get_7EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalIFACE.g:2107:3: (enumLiteral_3= '8bits' )
                    {
                    // InternalIFACE.g:2107:3: (enumLiteral_3= '8bits' )
                    // InternalIFACE.g:2108:4: enumLiteral_3= '8bits'
                    {
                    enumLiteral_3=(Token)match(input,67,FollowSets000.FOLLOW_2); if (state.failed) return current;
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
    // InternalIFACE.g:2118:1: ruleGSSIfaceUartPortStopBits returns [Enumerator current=null] : ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortStopBits() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:2124:2: ( ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) ) )
            // InternalIFACE.g:2125:2: ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) )
            {
            // InternalIFACE.g:2125:2: ( (enumLiteral_0= '1bit' ) | (enumLiteral_1= '2bits' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==68) ) {
                alt18=1;
            }
            else if ( (LA18_0==69) ) {
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
                    // InternalIFACE.g:2126:3: (enumLiteral_0= '1bit' )
                    {
                    // InternalIFACE.g:2126:3: (enumLiteral_0= '1bit' )
                    // InternalIFACE.g:2127:4: enumLiteral_0= '1bit'
                    {
                    enumLiteral_0=(Token)match(input,68,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortStopBitsAccess().get_1EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2134:3: (enumLiteral_1= '2bits' )
                    {
                    // InternalIFACE.g:2134:3: (enumLiteral_1= '2bits' )
                    // InternalIFACE.g:2135:4: enumLiteral_1= '2bits'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "ruleGSSIfaceUartPortFlowControl"
    // InternalIFACE.g:2145:1: ruleGSSIfaceUartPortFlowControl returns [Enumerator current=null] : ( (enumLiteral_0= 'rts_cts' ) | (enumLiteral_1= 'xon_xoff' ) ) ;
    public final Enumerator ruleGSSIfaceUartPortFlowControl() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:2151:2: ( ( (enumLiteral_0= 'rts_cts' ) | (enumLiteral_1= 'xon_xoff' ) ) )
            // InternalIFACE.g:2152:2: ( (enumLiteral_0= 'rts_cts' ) | (enumLiteral_1= 'xon_xoff' ) )
            {
            // InternalIFACE.g:2152:2: ( (enumLiteral_0= 'rts_cts' ) | (enumLiteral_1= 'xon_xoff' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==70) ) {
                alt19=1;
            }
            else if ( (LA19_0==71) ) {
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
                    // InternalIFACE.g:2153:3: (enumLiteral_0= 'rts_cts' )
                    {
                    // InternalIFACE.g:2153:3: (enumLiteral_0= 'rts_cts' )
                    // InternalIFACE.g:2154:4: enumLiteral_0= 'rts_cts'
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortFlowControlAccess().getRts_ctsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfaceUartPortFlowControlAccess().getRts_ctsEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2161:3: (enumLiteral_1= 'xon_xoff' )
                    {
                    // InternalIFACE.g:2161:3: (enumLiteral_1= 'xon_xoff' )
                    // InternalIFACE.g:2162:4: enumLiteral_1= 'xon_xoff'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfaceUartPortFlowControlAccess().getXon_xoffEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfaceUartPortFlowControlAccess().getXon_xoffEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSIfaceUartPortFlowControl"


    // $ANTLR start "ruleGSSIfacePortProtocolUnit"
    // InternalIFACE.g:2172:1: ruleGSSIfacePortProtocolUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) ) ;
    public final Enumerator ruleGSSIfacePortProtocolUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalIFACE.g:2178:2: ( ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) ) )
            // InternalIFACE.g:2179:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) )
            {
            // InternalIFACE.g:2179:2: ( (enumLiteral_0= 'bytes' ) | (enumLiteral_1= 'bits' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            else if ( (LA20_0==42) ) {
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
                    // InternalIFACE.g:2180:3: (enumLiteral_0= 'bytes' )
                    {
                    // InternalIFACE.g:2180:3: (enumLiteral_0= 'bytes' )
                    // InternalIFACE.g:2181:4: enumLiteral_0= 'bytes'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfacePortProtocolUnitAccess().getBytesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfacePortProtocolUnitAccess().getBytesEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2188:3: (enumLiteral_1= 'bits' )
                    {
                    // InternalIFACE.g:2188:3: (enumLiteral_1= 'bits' )
                    // InternalIFACE.g:2189:4: enumLiteral_1= 'bits'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfacePortProtocolUnitAccess().getBitsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfacePortProtocolUnitAccess().getBitsEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleGSSIfacePortProtocolUnit"


    // $ANTLR start "ruleGSSIfacePortProtocolPower"
    // InternalIFACE.g:2199:1: ruleGSSIfacePortProtocolPower returns [Enumerator current=null] : ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) ) ;
    public final Enumerator ruleGSSIfacePortProtocolPower() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalIFACE.g:2205:2: ( ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) ) )
            // InternalIFACE.g:2206:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) )
            {
            // InternalIFACE.g:2206:2: ( (enumLiteral_0= 'no' ) | (enumLiteral_1= '2bits' ) | (enumLiteral_2= '2_with_0' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt21=1;
                }
                break;
            case 69:
                {
                alt21=2;
                }
                break;
            case 73:
                {
                alt21=3;
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
                    // InternalIFACE.g:2207:3: (enumLiteral_0= 'no' )
                    {
                    // InternalIFACE.g:2207:3: (enumLiteral_0= 'no' )
                    // InternalIFACE.g:2208:4: enumLiteral_0= 'no'
                    {
                    enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfacePortProtocolPowerAccess().getNoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getGSSIfacePortProtocolPowerAccess().getNoEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalIFACE.g:2215:3: (enumLiteral_1= '2bits' )
                    {
                    // InternalIFACE.g:2215:3: (enumLiteral_1= '2bits' )
                    // InternalIFACE.g:2216:4: enumLiteral_1= '2bits'
                    {
                    enumLiteral_1=(Token)match(input,69,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalIFACE.g:2223:3: (enumLiteral_2= '2_with_0' )
                    {
                    // InternalIFACE.g:2223:3: (enumLiteral_2= '2_with_0' )
                    // InternalIFACE.g:2224:4: enumLiteral_2= '2_with_0'
                    {
                    enumLiteral_2=(Token)match(input,73,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getGSSIfacePortProtocolPowerAccess().get_2_with_0EnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleGSSIfacePortProtocolPower"

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
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002800A04150000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000A0L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x01C0000000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00200000000000C0L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0600000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xF800000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000320L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000080000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000080L});
    }


}